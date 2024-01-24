package org.somox.ui.runconfig;

import org.somox.configuration.AbstractMoxConfiguration;

import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedRunConfiguration;

public abstract class ModelAnalyzerConfiguration<T extends AbstractMoxConfiguration>
        extends AbstractWorkflowBasedRunConfiguration {

    protected T moxConfiguration = null;

    public ModelAnalyzerConfiguration() {
    }

    public T getMoxConfiguration() {
        return moxConfiguration;
    }

    public void setMoxConfiguration(final T moxConfiguration) {
        this.moxConfiguration = moxConfiguration;
    }

    @Override
    public String getErrorMessage() {
        return null;
    }
}
