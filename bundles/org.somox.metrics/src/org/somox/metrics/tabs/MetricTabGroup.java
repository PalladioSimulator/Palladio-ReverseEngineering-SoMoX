package org.somox.metrics.tabs;

import java.util.ArrayList;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.somox.analyzer.ModelAnalyzerTabGroupBlackboard;

/**
 * This class provides an AbstractLaunchConfigurationTab that holds the
 * MetricTabs as sub tabs.
 *
 * @author Michael Hauck
 *
 */
public class MetricTabGroup extends AbstractLaunchConfigurationTab {
    private ArrayList<MetricTab> metricTabs = null;

    public MetricTabGroup(final ModelAnalyzerTabGroupBlackboard modelAnalyzerTabGroupBlackboard,
            final ArrayList<MetricTab> metricTabs) {
        this.metricTabs = metricTabs;
    }

    @Override
    public void createControl(final Composite parent) {
        final Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new org.eclipse.swt.layout.GridLayout(1, false));

        final TabFolder tabs = new TabFolder(composite, SWT.NONE);
        for (final MetricTab metricTab : metricTabs) {
            final TabItem tabItem = new TabItem(tabs, SWT.NONE);
            metricTab.createControl(tabs);
            metricTab.setParentLaunchConfigurationTab(this);
            tabItem.setControl(metricTab.getControl());
            tabItem.setText(metricTab.getName());
        }
        tabs.pack();
        tabs.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        setControl(composite);
    }

    @Override
    public String getName() {
        return "SoMoX Configuration";
    }

    @Override
    public void initializeFrom(final ILaunchConfiguration configuration) {
        for (final ILaunchConfigurationTab tab : metricTabs) {
            tab.initializeFrom(configuration);
        }
    }

    @Override
    public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
        for (final ILaunchConfigurationTab tab : metricTabs) {
            tab.performApply(configuration);
        }
    }

    @Override
    public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
        for (final ILaunchConfigurationTab tab : metricTabs) {
            tab.setDefaults(configuration);
        }
    }

    public void updateLaunchConfigurationDialogFromChild() {
        updateLaunchConfigurationDialog();
    }

    public void setDirtyFromChild(final boolean dirty) {
        setDirty(dirty);
    }

    @Override
    public boolean isValid(final ILaunchConfiguration launchConfig) {
        return true;
    }

    @Override
    public boolean canSave() {
        return true;
    }

}