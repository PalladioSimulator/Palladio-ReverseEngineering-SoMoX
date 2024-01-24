package org.somox.analyzer;

import java.util.LinkedList;
import java.util.List;

import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.qosannotations.QoSAnnotations;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.system.System;
import org.somox.common.Message;
import org.somox.kdmhelper.metamodeladdition.Root;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;

/**
 * @author Snowball
 */
public class SimpleAnalysisResult implements AnalysisResult {

    // ---------------------------------
    // Static Data Fields
    // ---------------------------------

    // ---------------------------------
    // Data fields
    // ---------------------------------

    /**
     * The executed model analyzer
     *
     * @uml.property name="modelAnalyzer"
     * @uml.associationEnd
     */
    private ModelAnalyzer modelAnalyzer = null;

    /**
     * The result status
     *
     * @uml.property name="resultStatus"
     * @uml.associationEnd
     */
    private ResultStatus resultStatus = AnalysisResult.ResultStatus.NOT_EXECUTED;

    /**
     * the internal architecture model resulting from the performed analysis
     *
     * @uml.property name="internalArchitectureModel"
     * @uml.associationEnd
     */
    private Repository internalArchitectureModel = null;

    /**
     * the source code decorator repository
     *
     * @uml.property name="sourceCodeDecoratorRepository"
     * @uml.associationEnd
     */
    private SourceCodeDecoratorRepository sourceCodeDecoratorRepository = null;

    private System system = null;

    private Allocation allocation = null;

    private QoSAnnotations qosAnnotationModel = null;

    /**
     * The list of messages
     *
     * @uml.property name="messages"
     */
    private final List<Message> messages = new LinkedList<>();

    private Root root;

    // ---------------------------------
    // Constructor
    // ---------------------------------

    public SimpleAnalysisResult(final ModelAnalyzer analyzer) {
        modelAnalyzer = analyzer;
    }

    // ---------------------------------
    // Business Methods
    // ---------------------------------

    // ---------------------------------
    // Helper Methods
    // ---------------------------------

    // ---------------------------------
    // Getters / Setters
    // ---------------------------------

    /**
     * @return
     * @uml.property name="modelAnalyzer"
     */
    @Override
    public ModelAnalyzer getModelAnalyzer() {
        return modelAnalyzer;
    }

    /**
     * @return
     * @uml.property name="resultStatus"
     */
    @Override
    public ResultStatus getResultStatus() {
        return resultStatus;
    }

    /**
     * @return
     * @uml.property name="internalArchitectureModel"
     */
    @Override
    public Repository getInternalArchitectureModel() {
        return internalArchitectureModel;
    }

    /**
     * @param internalArchitectureModel the internalArchitectureModel to set
     * @uml.property name="internalArchitectureModel"
     */
    public void setInternalArchitectureModel(final Repository internalArchitectureModel) {
        this.internalArchitectureModel = internalArchitectureModel;
    }

    /**
     * @return
     * @uml.property name="sourceCodeDecoratorRepository"
     */
    @Override
    public SourceCodeDecoratorRepository getSourceCodeDecoratorRepository() {
        return sourceCodeDecoratorRepository;
    }

    /**
     * @param sourceCodeDecoratorRepository
     * @uml.property name="sourceCodeDecoratorRepository"
     */
    public void setSourceCodeDecoratorRepository(final SourceCodeDecoratorRepository sourceCodeDecoratorRepository) {
        this.sourceCodeDecoratorRepository = sourceCodeDecoratorRepository;
    }

    @Override
    public void addMessage(final Message message) {
        messages.add(message);
    }

    /**
     * @return
     * @uml.property name="messages"
     */
    @Override
    public List<Message> getMessages() {
        return messages;
    }

    /**
     * @param status the status to set
     * @uml.property name="resultStatus"
     */
    public void setResultStatus(final ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.somox.analyzer.AnalysisResult#getServiceArchitectureModel()
     */
    @Override
    public System getSystemModel() {
        return system;
    }

    public void setSystemModel(final System system) {
        this.system = system;
    }

    @Override
    public QoSAnnotations getQosAnnotationModel() {
        return qosAnnotationModel;
    }

    public void setQosAnnotationModel(final QoSAnnotations qosAnnotationModel) {
        this.qosAnnotationModel = qosAnnotationModel;
    }

    public void setAllocation(final Allocation allocation) {
        this.allocation = allocation;
    }

    @Override
    public Allocation getAllocation() {
        return allocation;
    }

    @Override
    public void setRoot(final Root root) {
        this.root = root;
    }

    @Override
    public Root getRoot() {
        return root;
    }
}
