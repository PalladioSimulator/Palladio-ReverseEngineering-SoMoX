/**
 *
 */
package org.somox.gast2seff.jobs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.statements.StatementListContainer;
import org.somox.analyzer.AnalysisResult;
import org.somox.analyzer.simplemodelanalyzer.jobs.SoMoXBlackboard;
import org.somox.gast2seff.visitors.BasicFunctionClassificationStrategy;
import org.somox.gast2seff.visitors.FunctionCallClassificationVisitor;
import org.somox.gast2seff.visitors.GastStatementVisitor;
import org.somox.seff2javaast.SEFF2JavaAST;
import org.somox.seff2javaast.SEFF2MethodMapping;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;

import de.uka.ipd.sdq.pcm.qosannotations.QoSAnnotations;
import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.seff.AbstractAction;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingBehaviour;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingSEFF;
import de.uka.ipd.sdq.pcm.seff.SeffFactory;
import de.uka.ipd.sdq.pcm.seff.ServiceEffectSpecification;
import de.uka.ipd.sdq.pcm.seff.StartAction;
import de.uka.ipd.sdq.pcm.seff.StopAction;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
//import de.fzi.gast.statements.BlockStatement;//GAST2SEFFCHANGE
//import eu.qimpress.samm.behaviour.Behaviour;
//import eu.qimpress.samm.behaviour.BehaviourFactory;
//import eu.qimpress.samm.behaviour.GastBehaviourStub;
//import eu.qimpress.samm.behaviour.SeffBehaviourStub;
//import eu.qimpress.samm.qosannotation.QosAnnotations;
//import eu.qimpress.samm.staticstructure.PrimitiveComponent;
//import eu.qimpress.samm.staticstructure.ServiceArchitectureModel;
//import eu.qimpress.seff.AbstractAction;
//import eu.qimpress.seff.ResourceDemandingBehaviour;
//import eu.qimpress.seff.ResourceDemandingSEFF;
//import eu.qimpress.seff.SeffRepository;
//import eu.qimpress.seff.StartAction;
//import eu.qimpress.seff.StopAction;
//import eu.qimpress.seff.seffFactory;

/**
 * Transformation Job transforming a SAM instance with GAST Behaviours into a SAM instance with SEFF
 * behaviours
 *
 * @author Steffen Becker, Klaus Krogmann
 */
public class GAST2SEFFJob implements IBlackboardInteractingJob<SoMoXBlackboard> {

    private final Logger logger = Logger.getLogger(GAST2SEFFJob.class);

    /** The SoMoX blackboard to interact with. */
    private SoMoXBlackboard blackboard = null;

    /**
     * The resource set used to load and store all resources needed for the transformation
     */
    private final ResourceSet resourceSet = new ResourceSetImpl();

    /**
     * Resources containing the models
     */
    private SEFF2JavaAST gastBehaviourRepositoryModel = null;
    private SourceCodeDecoratorRepository sourceCodeDecoratorModel = null;
    private QoSAnnotations sammQosAnnotationsModel = null;

    private FunctionCallClassificationVisitor typeVisitor = null;

    public GAST2SEFFJob() {
        super();
        // performance optimisation:
        final Map<URI, Resource> cache = new HashMap<URI, Resource>();
        ((ResourceSetImpl) this.resourceSet).setURIResourceMap(cache);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.workflow.IJob#execute(org.eclipse.core.runtime.IProgressMonitor)
     */
    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {

        monitor.subTask("loading models from blackboard");

        final AnalysisResult result = this.blackboard.getAnalysisResult();
        this.gastBehaviourRepositoryModel = result.getSeff2JavaAST();
        this.sammQosAnnotationsModel = result.getQosAnnotationModel();
        this.sourceCodeDecoratorModel = result.getSourceCodeDecoratorRepository();

        final IProgressMonitor subMonitor = new SubProgressMonitor(monitor, IProgressMonitor.UNKNOWN);
        subMonitor.setTaskName("Creating SEFF behaviour");

        final Iterator<SEFF2MethodMapping> iterator = this.gastBehaviourRepositoryModel.getSeff2MethodMappings()
                .iterator();
        while (iterator.hasNext()) {
            final SEFF2MethodMapping astBehaviour = iterator.next();
            final ResourceDemandingSEFF seff = (ResourceDemandingSEFF) astBehaviour.getSeff();
            final String name = seff.getId();
            this.logger.info("Found AST behaviour, generating SEFF behaviour for it: " + name);

            this.generateSEFFForGASTBehaviour(seff);
            monitor.worked(1);
        }

        // Create default annotations
        final DefaultQosAnnotationsBuilder qosAnnotationBuilder = new DefaultQosAnnotationsBuilder(
                this.sammQosAnnotationsModel);
        qosAnnotationBuilder.buildDefaultQosAnnotations(this.gastBehaviourRepositoryModel.getSeff2MethodMappings());

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
     * Create a new PCM SEFF The method is public since it should be possible to use the seff
     * creating mechanism without the SoMoX framework
     *
     * @param seff
     *            The SEFF which is filled by this method
     * @return The completed SEFF, returned for convenience
     * @throws JobFailedException
     */
    private ResourceDemandingSEFF createSeff(final ResourceDemandingSEFF seff) throws JobFailedException {
        final StartAction start = SeffFactory.eINSTANCE.createStartAction();
        final StopAction stop = SeffFactory.eINSTANCE.createStopAction();

        // initialise for new component / seff to reverse engineer:
        final BasicComponent basicComponent = (BasicComponent) seff.eContainer();
        this.typeVisitor = new FunctionCallClassificationVisitor(new BasicFunctionClassificationStrategy(
                this.sourceCodeDecoratorModel, basicComponent));

        seff.getSteps_Behaviour().add(start);

        final StatementListContainer body = this.findBody(seff);// GAST2SEFFCHANGE
        this.logger.trace("visiting (seff entry): " + seff.getId());
        if (body != null) {
            final GastStatementVisitor visitor = new GastStatementVisitor(this.typeVisitor.getAnnotations(), seff,
                    this.sourceCodeDecoratorModel, basicComponent);

            // handle each statement
            for (final Statement st : body.getStatements()) {
                this.typeVisitor.doSwitch(st);
                visitor.doSwitch(st);
            }

        } else {
            this.logger.warn("Found GAST behaviour (" + seff.getId() + ") without a method body... Skipping it...");
        }

        seff.getSteps_Behaviour().add(stop);

        connectActions(seff);

        return seff;
    }

    /**
     * Retrieve the matching GAST behaviour stub from the GAST Behaviour repository
     *
     * @param seff
     *            The gast behaviour stub for which a matching GAST behaviour is needed
     * @return The GAST behaviour matching the gast behaviour stub
     * @throws JobFailedException
     *             Thrown if the gast behaviour is missing in the model file
     */
    private StatementListContainer findBody(final ResourceDemandingSEFF seff) throws JobFailedException {// GAST2SEFFCHANGE

        // assert
        // onlyOnceAsGastBehaviour(this.gastBehaviourRepositoryModel.getSeff2MethodMappings(),
        // seff);
        // TODO burkha 16.05.2013 remove this after checking
        this.onlyOnceAsGastBehaviour(this.gastBehaviourRepositoryModel.getSeff2MethodMappings(), seff);

        for (final SEFF2MethodMapping behaviour : this.gastBehaviourRepositoryModel.getSeff2MethodMappings()) {
            if (((ResourceDemandingSEFF) behaviour.getSeff()).getId().equals(seff.getId())) {
                this.logger.debug("Matching SEFF found " + seff.getId());
                return behaviour.getBlockstatement();
            }
        }
        this.logger.warn("Checked gastBehaviourRepository for " + seff.getId() + " but found none");
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
            this.logger.error("Assertion fails - onlyOnceAsGastBehaviour: i = " + i + " for "
                    + ((ResourceDemandingSEFF) seff).getId());
        }

        return i == 1; // must be exactly one
    }

    /**
     * Add connections to the SEFF actions assuming the actions are stored in a sequential order
     *
     * @param seff
     *            The behaviour for which connections will be created
     */
    public static void connectActions(final ResourceDemandingBehaviour seff) {
        AbstractAction previous = null;
        for (final AbstractAction a : seff.getSteps_Behaviour()) {
            a.setPredecessor_AbstractAction(previous);
            previous = a;
        }
    }

    /**
     * Generate a SEFF for the given GAST behaviour
     *
     * @param gastBehaviourStub
     *            The gast behaviour stub for whose behaviour a SEFF is generated
     * @return The generated SEFF
     * @throws JobFailedException
     */
    private ResourceDemandingSEFF generateSEFFForGASTBehaviour(final ResourceDemandingSEFF gastBehaviourStub)
            throws JobFailedException {
        // ResourceDemandingSEFF resourceDemandingSEFF =
        // SeffFactory.eINSTANCE.createResourceDemandingSEFF();

        // createSeff(gastBehaviourStub,resourceDemandingSEFF);
        this.createSeff(gastBehaviourStub);

        // SeffBehaviourStub seffBehaviourStub = findOrCreateBehaviourStub(gastBehaviourStub);
        // resourceDemandingSEFF.setSeffBehaviourStub(seffBehaviourStub);

        return gastBehaviourStub;
    }

    /**
     * Finds an existing SEFF behaviour stub and reuses it or creates a new SEFF behaviour stub if
     * there is none for the given GAST behaviour stub
     *
     * @param gastBehaviourStub
     *            The GAST behaviour stub for which a matching SEFF behaviour stub is searched
     * @return The found or newly created SEFF behaviour stub
     */
    // private SeffBehaviourStub findOrCreateBehaviourStub(ResourceDemandingSEFF gastBehaviourStub)
    // {
    // BasicComponent parentComponent = (BasicComponent) gastBehaviourStub.eContainer();
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
     * @param blackBoard
     *            the blackBoard to set
     */
    @Override
    public void setBlackboard(final SoMoXBlackboard blackBoard) {
        this.blackboard = blackBoard;
    }

    @Override
    public void cleanup(final IProgressMonitor monitor) throws CleanupFailedException {
    }
}
