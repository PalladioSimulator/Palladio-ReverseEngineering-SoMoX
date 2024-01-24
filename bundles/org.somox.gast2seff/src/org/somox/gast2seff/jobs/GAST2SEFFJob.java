/**
 *
 */
package org.somox.gast2seff.jobs;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.language.java.statements.StatementListContainer;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.StartAction;
import org.palladiosimulator.pcm.seff.StopAction;
import org.somox.analyzer.AnalysisResult;
import org.somox.gast2seff.visitors.DefaultResourceDemandingBehaviourForClassMethodFinder;
import org.somox.gast2seff.visitors.FunctionCallClassificationVisitor;
import org.somox.gast2seff.visitors.IFunctionClassificationStrategy;
import org.somox.gast2seff.visitors.IFunctionClassificationStrategyFactory;
import org.somox.gast2seff.visitors.InterfaceOfExternalCallFindingFactory;
import org.somox.gast2seff.visitors.MethodCallFinder;
import org.somox.gast2seff.visitors.ResourceDemandingBehaviourForClassMethodFinding;
import org.somox.gast2seff.visitors.VisitorUtils;
import org.somox.kdmhelper.metamodeladdition.Root;
import org.somox.sourcecodedecorator.SEFF2MethodMapping;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;

/**
 * Transformation Job transforming a SAM instance with GAST Behaviours into a
 * SAM instance with SEFF behaviours
 *
 * @author Steffen Becker, Klaus Krogmann
 */
public class GAST2SEFFJob implements IBlackboardInteractingJob<SoMoXBlackboard> {

    private final Logger logger = Logger.getLogger(GAST2SEFFJob.class);

    /** The SoMoX blackboard to interact with. */
    private SoMoXBlackboard blackboard;

    /**
     * The resource set used to load and store all resources needed for the
     * transformation
     */
    private final ResourceSet resourceSet = new ResourceSetImpl();

    /**
     * Resources containing the models
     */
    private SourceCodeDecoratorRepository sourceCodeDecoratorModel;
    private Root root;

    private FunctionCallClassificationVisitor typeVisitor;

    private MethodCallFinder methodCallFinder;

    /**
     * Field that indicates whether ResourceDemandingInternalBehaviour should be
     * created for internal method calls or not. If set to true one RDIB will be
     * created for each internal method. If set to false the intern method are
     * inlined in the SEFF directly.
     */
    private final boolean createResourceDemandingInternalBehaviour;

    /**
     * factory to create the used IFunctionClassifcationStrategy
     */
    private final IFunctionClassificationStrategyFactory iFunctionClassificationStrategyFactory;

    private final InterfaceOfExternalCallFindingFactory interfaceOfExternalCallFindingFactory;

    public GAST2SEFFJob() {
        this(false, new IFunctionClassificationStrategyFactory() {
        }, new InterfaceOfExternalCallFindingFactory() {
        });
    }

    public GAST2SEFFJob(final boolean createResourceDemandingInternalBehaviour) {
        this(createResourceDemandingInternalBehaviour, new IFunctionClassificationStrategyFactory() {
        }, new InterfaceOfExternalCallFindingFactory() {
        });
    }

    public GAST2SEFFJob(final boolean createResourceDemandingInternalBehaviour,
            final IFunctionClassificationStrategyFactory iFunctionClassificationStrategyFactory,
            final InterfaceOfExternalCallFindingFactory interfaceOfExternalCallFindingFactory) {
        this.createResourceDemandingInternalBehaviour = createResourceDemandingInternalBehaviour;
        this.iFunctionClassificationStrategyFactory = iFunctionClassificationStrategyFactory;
        this.interfaceOfExternalCallFindingFactory = interfaceOfExternalCallFindingFactory;
        // performance optimisation:
        final Map<URI, Resource> cache = new HashMap<>();
        ((ResourceSetImpl) resourceSet).setURIResourceMap(cache);
    }

    /*
     * (non-Javadoc)
     *
     * @see de.uka.ipd.sdq.workflow.IJob#execute(org.eclipse.core.runtime.
     * IProgressMonitor)
     */
    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {

        monitor.subTask("loading models from blackboard");

        final AnalysisResult result = blackboard.getAnalysisResult();
        sourceCodeDecoratorModel = result.getSourceCodeDecoratorRepository();
        root = result.getRoot();
        methodCallFinder = new MethodCallFinder();

        final IProgressMonitor subMonitor = new SubProgressMonitor(monitor, IProgressMonitor.UNKNOWN);
        subMonitor.setTaskName("Creating SEFF behaviour");

        for (final SEFF2MethodMapping astBehaviour : sourceCodeDecoratorModel.getSeff2MethodMappings()) {
            final ResourceDemandingSEFF seff = (ResourceDemandingSEFF) astBehaviour.getSeff();
            final String name = seff.getId();
            logger.info("Found AST behaviour, generating SEFF behaviour for it: " + name);

            generateSEFFForGASTBehaviour(seff);
            monitor.worked(1);
        }

        // Create default annotations
        final DefaultQosAnnotationsBuilder qosAnnotationBuilder = new DefaultQosAnnotationsBuilder();
        qosAnnotationBuilder.buildDefaultQosAnnotations(sourceCodeDecoratorModel.getSeff2MethodMappings());

        subMonitor.done();
    }

    /*
     * (non-Javadoc)
     *
     * @see de.uka.ipd.sdq.workflow.IJob#getName()
     */
    @Override
    public String getName() {
        return "GAST2SEFF Transformation Job";
    }

    /**
     * Create a new PCM SEFF.
     *
     * @param seff The SEFF which is filled by this method
     * @return The completed SEFF, returned for convenience
     * @throws JobFailedException
     */
    private ResourceDemandingSEFF createSeff(final ResourceDemandingSEFF seff) throws JobFailedException {
        final StartAction start = SeffFactory.eINSTANCE.createStartAction();
        final StopAction stop = SeffFactory.eINSTANCE.createStopAction();
        seff.getSteps_Behaviour().add(start);

        // initialise for new component / seff to reverse engineer:
        final BasicComponent basicComponent = (BasicComponent) seff.eContainer();
        final IFunctionClassificationStrategy basicFunctionClassifierStrategy = iFunctionClassificationStrategyFactory
                .createIFunctionClassificationStrategy(sourceCodeDecoratorModel, basicComponent, root,
                        methodCallFinder);
        typeVisitor = new FunctionCallClassificationVisitor(basicFunctionClassifierStrategy, methodCallFinder);

        final StatementListContainer body = findBody(seff);// GAST2SEFFCHANGE
        logger.trace("visiting (seff entry): " + seff.getId());
        if (body != null) {
            if (createResourceDemandingInternalBehaviour) {
                final ResourceDemandingBehaviourForClassMethodFinding defaultResourceDemandingBehaviourForClassMethodFinder = new DefaultResourceDemandingBehaviourForClassMethodFinder(
                        sourceCodeDecoratorModel, basicComponent);
                VisitorUtils.visitJaMoPPMethod(seff, basicComponent, body, sourceCodeDecoratorModel, typeVisitor,
                        interfaceOfExternalCallFindingFactory, defaultResourceDemandingBehaviourForClassMethodFinder,
                        methodCallFinder);
            } else {
                VisitorUtils.visitJaMoPPMethod(seff, basicComponent, body, sourceCodeDecoratorModel, typeVisitor,
                        interfaceOfExternalCallFindingFactory, methodCallFinder);
            }

        } else {
            logger.warn("Found GAST behaviour (" + seff.getId() + ") without a method body... Skipping it...");
        }

        seff.getSteps_Behaviour().add(stop);
        VisitorUtils.connectActions(seff);

        return seff;
    }

    /**
     * Retrieve the matching GAST behaviour stub from the GAST Behaviour repository
     *
     * @param seff The gast behaviour stub for which a matching GAST behaviour is
     *             needed
     * @return The GAST behaviour matching the gast behaviour stub
     * @throws JobFailedException Thrown if the gast behaviour is missing in the
     *                            model file
     */
    private StatementListContainer findBody(final ResourceDemandingSEFF seff) throws JobFailedException {// GAST2SEFFCHANGE

        // assert
        // onlyOnceAsGastBehaviour(this.gastBehaviourRepositoryModel.getSeff2MethodMappings(),
        // seff);
        // TODO burkha 16.05.2013 remove this after checking
        onlyOnceAsGastBehaviour(sourceCodeDecoratorModel.getSeff2MethodMappings(), seff);

        for (final SEFF2MethodMapping behaviour : sourceCodeDecoratorModel.getSeff2MethodMappings()) {
            if (((ResourceDemandingSEFF) behaviour.getSeff()).getId().equals(seff.getId())) {
                logger.debug("Matching SEFF found " + seff.getId());
                return behaviour.getStatementListContainer();
            }
        }
        logger.warn("Checked gastBehaviourRepository for " + seff.getId() + " but found none");
        throw new JobFailedException("Unable to find operation body for given method");
    }

    /**
     * For assertion only
     *
     * @param seff2MethodMappings
     * @param seff
     * @return
     */
    private boolean onlyOnceAsGastBehaviour(final EList<SEFF2MethodMapping> seff2MethodMappings,
            final ServiceEffectSpecification seff) {
        int i = 0;
        for (final SEFF2MethodMapping mapping : seff2MethodMappings) {
            final ResourceDemandingSEFF seffMapping = (ResourceDemandingSEFF) mapping.getSeff();
            final ResourceDemandingSEFF seffInput = (ResourceDemandingSEFF) seff;
            if (seffMapping.getId().equals(seffInput.getId())) {
                i++;
            }
        }

        if (i != 1) {
            logger.error("Assertion fails - onlyOnceAsGastBehaviour: i = " + i + " for "
                    + ((ResourceDemandingSEFF) seff).getId());
        }

        return i == 1; // must be exactly one
    }

    /**
     * Generate a SEFF for the given GAST behaviour
     *
     * @param gastBehaviourStub The gast behaviour stub for whose behaviour a SEFF
     *                          is generated
     * @return The generated SEFF
     * @throws JobFailedException
     */
    private ResourceDemandingSEFF generateSEFFForGASTBehaviour(final ResourceDemandingSEFF gastBehaviourStub)
            throws JobFailedException {
        // ResourceDemandingSEFF resourceDemandingSEFF =
        // SeffFactory.eINSTANCE.createResourceDemandingSEFF();

        // createSeff(gastBehaviourStub,resourceDemandingSEFF);
        createSeff(gastBehaviourStub);

        // SeffBehaviourStub seffBehaviourStub =
        // findOrCreateBehaviourStub(gastBehaviourStub);
        // resourceDemandingSEFF.setSeffBehaviourStub(seffBehaviourStub);

        return gastBehaviourStub;
    }

    /**
     * Finds an existing SEFF behaviour stub and reuses it or creates a new SEFF
     * behaviour stub if there is none for the given GAST behaviour stub
     *
     * @param gastBehaviourStub The GAST behaviour stub for which a matching SEFF
     *                          behaviour stub is searched
     * @return The found or newly created SEFF behaviour stub
     */
    // private SeffBehaviourStub findOrCreateBehaviourStub(ResourceDemandingSEFF
    // gastBehaviourStub)
    // {
    // BasicComponent parentComponent = (BasicComponent)
    // gastBehaviourStub.eContainer();
    // SeffBehaviourStub seffBehaviourStub = null;
    //
    // for (ServiceEffectSpecification behaviour :
    // parentComponent.getServiceEffectSpecifications__BasicComponent()) {
    // if (behaviour instanceof SeffBehaviourStub) {
    // SeffBehaviourStub candidateStub = (SeffBehaviourStub) behaviour;
    // if (candidateStub.getOperation() == gastBehaviourStub.getOperation) {
    // logger.debug("Found SEFF behaviour stub, reusing it...");
    // seffBehaviourStub = candidateStub;
    // break;
    // }
    // }
    // }
    //
    // if (seffBehaviourStub == null)
    // seffBehaviourStub = BehaviourFactory.eINSTANCE.createSeffBehaviourStub();
    //
    // seffBehaviourStub.setOperation(gastBehaviourStub.getOperation());
    // parentComponent.get.getOperationBehaviour().add(seffBehaviourStub);
    //
    // return seffBehaviourStub;
    // }

    /**
     * @param blackBoard the blackBoard to set
     */
    @Override
    public void setBlackboard(final SoMoXBlackboard blackBoard) {
        blackboard = blackBoard;
    }

    @Override
    public void cleanup(final IProgressMonitor monitor) throws CleanupFailedException {
    }
}
