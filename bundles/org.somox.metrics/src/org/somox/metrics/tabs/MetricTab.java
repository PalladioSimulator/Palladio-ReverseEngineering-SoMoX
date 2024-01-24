package org.somox.metrics.tabs;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.somox.analyzer.ModelAnalyzerTabGroupBlackboard;

public abstract class MetricTab extends AbstractLaunchConfigurationTab {

    private ModelAnalyzerTabGroupBlackboard blackboard = null;
    private MetricTabGroup parentLaunchConfigurationTab = null;

    public void setParentLaunchConfigurationTab(final MetricTabGroup parentLaunchConfigurationTab) {
        this.parentLaunchConfigurationTab = parentLaunchConfigurationTab;
    }

    public ModelAnalyzerTabGroupBlackboard getModelAnalyzerTabGroupBlackboard() {
        return blackboard;
    }

    public void setModelAnalyzerTabGroupBlackboard(final ModelAnalyzerTabGroupBlackboard blackboard) {
        this.blackboard = blackboard;
    }

    @Override
    protected void updateLaunchConfigurationDialog() {
        if (parentLaunchConfigurationTab != null) {
            parentLaunchConfigurationTab.updateLaunchConfigurationDialogFromChild();
        } else {
            super.updateLaunchConfigurationDialog();
        }
    }

    @Override
    protected void setDirty(final boolean dirty) {
        if (parentLaunchConfigurationTab != null) {
            parentLaunchConfigurationTab.setDirtyFromChild(dirty);
        } else {
            super.setDirty(dirty);
        }
    }
}
