package org.somox.ui.runconfig.tabs;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.somox.configuration.AbstractMoxConfiguration;

/**
 * The class defines a tab, which is responsible for the core input for a model
 * analyzer.
 *
 * @author Michael Hauck
 * @author Joshua Gleitze
 */
public class ModelAnalyzerInputTab extends AbstractLaunchConfigurationTab {

    /**
     * The string to append to a path the user selected for the output location.
     */
    private static final String OUTPUT_POSTFIX = "model";

    /**
     * The GUI element the user can select projects in.
     */
    private ProjectSelector projectSelector;

    /**
     * The text input field the user can enter the output location in.
     */
    private Text outputText;

    @Override
    public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
        final Set<String> selectedProjectNames = getSelectedProjects().map(IProject::getName)
                .collect(Collectors.toSet());
        configuration.setAttribute(AbstractMoxConfiguration.SOMOX_PROJECT_NAME, selectedProjectNames);
        configuration.setAttribute(AbstractMoxConfiguration.SOMOX_OUTPUT_FOLDER, outputText.getText());
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse
     * .swt.widgets.Composite)
     */
    /**
     * @wbp.parser.entryPoint
     */
    @Override
    public void createControl(final Composite parent) {
        final Composite container = new Composite(parent, SWT.NONE);
        final GridLayout layout = new GridLayout();
        layout.numColumns = 3;
        container.setLayout(layout);

        final Label projectsLabel = new Label(container, SWT.NONE);
        projectsLabel.setText("Projects to analyse:");

        projectSelector = new ProjectSelector(container, SWT.BORDER);
        projectSelector.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
        projectSelector.treeViewer.addSelectionChangedListener(event -> {
            setDirty(true);
            updateLaunchConfigurationDialog();
            if (outputText.getText().isEmpty() && (getSelectedProjects().count() == 1)) {
                useContainerForOutput(getSelectedProjects().findAny().get());
            }
        });

        final Label outputLabel = new Label(container, SWT.NONE);
        outputLabel.setText("Analysis output:");

        outputText = new Text(container, SWT.BORDER);
        outputText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
        outputText.addModifyListener(event -> {
            setDirty(true);
            updateLaunchConfigurationDialog();
        });

        final Button browseOutputButton = new Button(container, SWT.NONE);
        browseOutputButton.setText("Browse…");
        browseOutputButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(final SelectionEvent e) {
                final IContainer[] selectedContainers = WorkspaceResourceDialog.openFolderSelection(getShell(),
                        "Select output folder", "Select a folder to put the analysis results in.", false, null, null);
                if (selectedContainers.length > 0) {
                    ModelAnalyzerInputTab.this.useContainerForOutput(selectedContainers[0]);
                }
            }
        });

        setControl(container);
    }

    /**
     * Uses the provided {@code container} for the output path.
     * {@link #OUTPUT_POSTFIX} will be appended to {@code container}’s
     * workspace-relative path and the result be set as the output path.
     *
     * @param container The container to put the analysis output in.
     */
    private void useContainerForOutput(final IContainer container) {
        final String newOutputText = container.getFullPath().append(OUTPUT_POSTFIX).toString();
        ModelAnalyzerInputTab.this.outputText.setText(newOutputText);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse
     * .debug.core.ILaunchConfiguration)
     */
    @Override
    public void initializeFrom(final ILaunchConfiguration configuration) {
        final Set<IProject> inputProjects = getProjectsFrom(configuration);
        final IProject[] selectedProjects = inputProjects.stream().filter(IProject::exists).toArray(IProject[]::new);

        final int projectsNotFound = inputProjects.size() - selectedProjects.length;
        if (projectsNotFound > 0) {
            // There was a project in the configuration that does not exist in this
            // workspace.
            final String removedProjects = inputProjects.stream().filter(project -> !project.exists())
                    .map(IProject::getName).collect(Collectors.joining(", ", "“", "”"));
            setMessage("The project" + (projectsNotFound > 1 ? "s" : "") + " " + removedProjects
                    + " could not be found in the workspace and " + (projectsNotFound > 1 ? "were" : "was")
                    + " removed from the configuration.");
            setDirty(true);
        }
        projectSelector.treeViewer.setCheckedElements(selectedProjects);

        String outputFolder = "";
        try {
            outputFolder = configuration.getAttribute(AbstractMoxConfiguration.SOMOX_OUTPUT_FOLDER, "");
        } catch (final CoreException e) {
            // ignore the attribute: The user has to enter a new value
        }
        outputText.setText(outputFolder);
        if (outputFolder.isEmpty() && (selectedProjects.length > 0)) {
            useContainerForOutput(selectedProjects[0]);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#isValid(org.eclipse
     * .debug.core.ILaunchConfiguration)
     */
    @Override
    public boolean isValid(final ILaunchConfiguration launchConfig) {
        setErrorMessage(null);

        final Set<IProject> projects = getProjectsFrom(launchConfig);
        if (projects.isEmpty()) {
            setErrorMessage("No projects to analyse selected!");
            return false;
        }

        String outputFolderString;
        try {
            outputFolderString = launchConfig.getAttribute(AbstractMoxConfiguration.SOMOX_OUTPUT_FOLDER, "");
        } catch (final CoreException e) {
            outputFolderString = "";
        }
        if (outputFolderString.isEmpty()) {
            setErrorMessage("No output folder defined!");
            return false;
        }
        if (!Path.isValidPosixPath(outputFolderString) && !Path.isValidWindowsPath(outputFolderString)) {
            setErrorMessage("The output folder path “" + outputFolderString + "” is not a valid path!");
            return false;
        }
        final Path outputFolder = new Path(outputFolderString);
        final String firstSegment = outputFolder.segment(0);
        if (!ResourcesPlugin.getWorkspace().getRoot().exists(new Path(firstSegment))
                && !new File(firstSegment).exists()) {
            setErrorMessage("The output folder’s project “" + firstSegment + "” does not exist in the workspace!");
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "General";
    }

    @Override
    public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
    }

    @Override
    public boolean canSave() {
        return true;
    }

    /**
     * Queries the projects selected in the the {@link #projectSelector}.
     *
     * @return A stream to the selected projects.
     */
    private Stream<IProject> getSelectedProjects() {
        return Arrays.stream(projectSelector.treeViewer.getCheckedElements()).map(IProject.class::cast);
    }

    /**
     * Gets the input projects from the provided {@code launchConfiguration} in a
     * backward-compatible manner.
     *
     * @param launchConfiguration The configuration to read from.
     * @return The set of the projects to analyse defined in
     *         {@code LaunchConfiguration}.
     */
    @SuppressWarnings("unchecked")
    private Set<IProject> getProjectsFrom(final ILaunchConfiguration launchConfiguration) {
        /*
         * Backward-compatibility: old versions of SoMoX used single input projects.
         * These configurations should still be supported.
         */
        Object inputProject;
        final Set<String> selectedProjectNames;
        try {
            inputProject = launchConfiguration.getAttributes().get(AbstractMoxConfiguration.SOMOX_PROJECT_NAME);
        } catch (final CoreException e) {
            inputProject = Collections.emptySet();
        }

        if (inputProject instanceof String) {
            selectedProjectNames = Collections.singleton((String) inputProject);
        } else if (inputProject instanceof Set) {
            selectedProjectNames = (Set<String>) inputProject;
        } else {
            selectedProjectNames = Collections.emptySet();
        }

        return selectedProjectNames.stream().map(ResourcesPlugin.getWorkspace().getRoot()::getProject)
                .collect(Collectors.toSet());
    }

    /**
     * A control with a filter text field letting the user select the projects to be
     * analysed on the {@link ModelAnalyzerInputTab}.
     *
     * @author Joshua Gleitze
     */
    private class ProjectSelector extends FilteredTree {

        private CheckboxTreeViewer treeViewer;

        /**
         * Creates this component.
         *
         * @param parent    the parent Composite
         * @param treeStyle the style bits for the Tree
         */
        public ProjectSelector(final Composite parent, final int treeStyle) {
            super(parent, treeStyle, new PatternFilter(), true, false);
        }

        @Override
        protected TreeViewer doCreateTreeViewer(final Composite parent, final int style) {
            treeViewer = new CheckboxTreeViewer(parent, style);
            treeViewer.setContentProvider(new ProjectContentProvider());
            treeViewer.setLabelProvider(new WorkbenchLabelProvider());
            treeViewer.setInput(ResourcesPlugin.getWorkspace().getRoot().getProjects());
            return treeViewer;
        }

        private class ProjectContentProvider implements ITreeContentProvider {

            private IProject[] projects;

            @Override
            public void dispose() {
            }

            @Override
            public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
                projects = (IProject[]) newInput;
            }

            @Override
            public Object[] getElements(final Object inputElement) {
                return projects;
            }

            @Override
            public Object[] getChildren(final Object parentElement) {
                return new Object[0];
            }

            @Override
            public Object getParent(final Object element) {
                return null;
            }

            @Override
            public boolean hasChildren(final Object element) {
                return false;
            }
        }
    }
}
