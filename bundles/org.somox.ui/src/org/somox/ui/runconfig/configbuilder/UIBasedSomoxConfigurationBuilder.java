package org.somox.ui.runconfig.configbuilder;

import java.util.Map;

import org.somox.configuration.SoMoXConfiguration;
import org.somox.ui.runconfig.ModelAnalyzerConfiguration;
import org.somox.ui.runconfig.SoMoXModelAnalyzerConfiguration;

import de.uka.ipd.sdq.workflow.launchconfig.core.configbuilder.AbstractJobConfigurationBuilder;

public class UIBasedSomoxConfigurationBuilder
        extends AbstractJobConfigurationBuilder<ModelAnalyzerConfiguration<?>> {

    public UIBasedSomoxConfigurationBuilder(final Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    protected ModelAnalyzerConfiguration<SoMoXConfiguration> internalBuild(final Map<String, Object> attributes) {
        final SoMoXModelAnalyzerConfiguration myConfig = new SoMoXModelAnalyzerConfiguration();

        final SoMoXConfiguration somoxConfiguration = new SoMoXConfiguration(attributes);
        myConfig.setMoxConfiguration(somoxConfiguration);

        return myConfig;
    }
}
