package org.somox.metrics.tabs;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.somox.configuration.SoMoXConfiguration;
import org.somox.kdmhelper.KDMHelper;
import org.somox.kdmhelper.metamodeladdition.Root;

import tools.mdsd.jamopp.model.java.commons.Commentable;
import tools.mdsd.jamopp.model.java.types.Type;

//import de.fzi.gast.core.Root;
//import de.fzi.gast.types.GASTClass;

public class BlacklistTab extends MetricTab {

    private final String DELIMITER = "§";

    protected Composite control;
    protected CheckboxTreeViewer checkboxTreeViewer;
    protected ICheckStateListener checkStateListener;
    protected Composite treeViewerControl;
    protected Composite textFieldControl;
    private Text textField;
    private Text addiditonalBlacklistTextfield;
    private Root root;
    StackLayout stackLayout;

    @Override
    public void activated(final ILaunchConfigurationWorkingCopy workingCopy) {

    }

    @Override
    public boolean canSave() {
        return true;
    }

    public void setRoot(final Root root) {
        if (this.root != root) {
            checkboxTreeViewer.getTree().dispose();
            checkboxTreeViewer = new CheckboxTreeViewer(treeViewerControl, SWT.BORDER);
            checkboxTreeViewer.setContentProvider(new CheckboxContentProvider());
            checkboxTreeViewer.setLabelProvider(new CheckboxLabelProvider());
            final Tree tree = checkboxTreeViewer.getTree();
            tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
            checkboxTreeViewer.addCheckStateListener(checkStateListener);
        }
        this.root = root;
        checkboxTreeViewer.setInput(this.root);

        if (this.root != null) {
            checkboxTreeViewer.setGrayed(this.root, true);
        }
    }

    /**
     * @wbp.parser.entryPoint
     */
    @Override
    public void createControl(final Composite parent) {
        checkStateListener = event -> {
            checkboxTreeViewer.setSubtreeChecked(event.getElement(), event.getChecked());

            BlacklistTab.this.setDirty(true);
            BlacklistTab.this.updateLaunchConfigurationDialog();
        };

        control = new Composite(parent, SWT.NONE);
        control.setLayout(new GridLayout(1, false));

        final Composite mainComposite = new Composite(control, SWT.NONE);
        mainComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

        stackLayout = new StackLayout();
        mainComposite.setLayout(stackLayout);

        treeViewerControl = createControlTreeViewer(mainComposite);
        textFieldControl = createTextField(mainComposite);

        getModelAnalyzerTabGroupBlackboard().addBlackboardListener(() -> {
            BlacklistTab.this.setRoot(BlacklistTab.this.getModelAnalyzerTabGroupBlackboard().getRoot());
            if (root == null) {
                stackLayout.topControl = textFieldControl;
            } else {
                stackLayout.topControl = treeViewerControl;
            }

        });
        setRoot(getModelAnalyzerTabGroupBlackboard().getRoot());
        if (root == null) {
            switchFromTreeToText();
            // treeViewerControl.setVisible(false);
            // textFieldControl.setVisible(true);
            stackLayout.topControl = textFieldControl;
        } else {
            switchFromTextToTree();
            // textFieldControl.setVisible(false);
            // treeViewerControl.setVisible(true);
            stackLayout.topControl = treeViewerControl;
        }
    }

    private Composite createControlTreeViewer(final Composite parentControl) {

        final Composite treeViewerControl = new Composite(parentControl, SWT.NONE);
        // treeViewerControl.setLayout(new FillLayout(SWT.HORIZONTAL));
        treeViewerControl.setLayout(new GridLayout(2, false));

        checkStateListener = event -> {
            checkboxTreeViewer.setSubtreeChecked(event.getElement(), event.getChecked());

            BlacklistTab.this.setDirty(true);
            BlacklistTab.this.updateLaunchConfigurationDialog();
        };

        final Label lblSpecifiyBlacklist = new Label(treeViewerControl, SWT.CENTER);
        lblSpecifiyBlacklist.setText("Specify blacklist");
        lblSpecifiyBlacklist.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

        checkboxTreeViewer = new CheckboxTreeViewer(treeViewerControl, SWT.BORDER);
        checkboxTreeViewer.setContentProvider(new CheckboxContentProvider());
        checkboxTreeViewer.setLabelProvider(new CheckboxLabelProvider());
        checkboxTreeViewer.addCheckStateListener(checkStateListener);

        final Tree tree = checkboxTreeViewer.getTree();
        tree.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));

        final Label additionalFilterLabel = new Label(treeViewerControl, SWT.NONE);
        additionalFilterLabel.setText("Additional filter regex:");
        additionalFilterLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));

        addiditonalBlacklistTextfield = new Text(treeViewerControl, SWT.BORDER);
        addiditonalBlacklistTextfield.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        addiditonalBlacklistTextfield.addModifyListener(e -> {
            BlacklistTab.this.setDirty(true);
            BlacklistTab.this.updateLaunchConfigurationDialog();
        });

        final Composite composite = new Composite(treeViewerControl, SWT.NONE);
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        composite.setLayout(new GridLayout(1, false));

        final Button invertB = new Button(composite, SWT.NONE);
        invertB.setText("Invert");
        invertB.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        invertB.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDown(final MouseEvent e) {
                checkboxTreeViewer.expandAll();
                final Object[] elements = checkboxTreeViewer.getCheckedElements();
                checkboxTreeViewer.setAllChecked(true);
                for (final Object element : elements) {
                    checkboxTreeViewer.setChecked(element, false);
                }
                checkboxTreeViewer.collapseAll();
                BlacklistTab.this.setDirty(true);
                BlacklistTab.this.updateLaunchConfigurationDialog();
            }
        });

        final Button selectB = new Button(composite, SWT.NONE);
        selectB.setText("Select all");
        selectB.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        selectB.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDown(final MouseEvent e) {
                checkboxTreeViewer.expandAll();
                checkboxTreeViewer.setAllChecked(true);
                checkboxTreeViewer.collapseAll();
                BlacklistTab.this.setDirty(true);
                BlacklistTab.this.updateLaunchConfigurationDialog();
            }
        });
        final Button deselectB = new Button(composite, SWT.NONE);
        deselectB.setText("Deselect all");
        deselectB.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
        deselectB.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDown(final MouseEvent e) {
                checkboxTreeViewer.expandAll();
                checkboxTreeViewer.setAllChecked(false);
                checkboxTreeViewer.collapseAll();
                BlacklistTab.this.setDirty(true);
                BlacklistTab.this.updateLaunchConfigurationDialog();
            }
        });
        return treeViewerControl;

    }

    private void switchFromTreeToText() {
        final Set<String> wildcards = getTreeSelection();
        wildcards.addAll(getTextField(addiditonalBlacklistTextfield));
        initializeTextField(getTreeSelection());
    }

    private void switchFromTextToTree() {
        initializeTreeViewer(getTextField(textField));
    }

    private Composite createTextField(final Composite parentControl) {
        final Composite textFieldControl = new Group(parentControl, SWT.NONE);
        textFieldControl.setLayout(new FillLayout(SWT.HORIZONTAL));
        textFieldControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        textField = new Text(textFieldControl, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
        // textField.setLayout(new FillLayout(SWT.HORIZONTAL));
        // textField.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        final ModifyListener textChangedListener = e -> {
            BlacklistTab.this.setDirty(true);
            BlacklistTab.this.updateLaunchConfigurationDialog();
        };
        textField.addModifyListener(textChangedListener);
        // textField.setLayoutData(new FillData(FillData.FILL_BOTH));
        textFieldControl.setSize(textFieldControl.getParent().getSize());
        return textFieldControl;
    }

    @Override
    public void deactivated(final ILaunchConfigurationWorkingCopy workingCopy) {

    }

    @Override
    public void dispose() {
    }

    @Override
    public Control getControl() {
        return control;
    }

    @Override
    public String getErrorMessage() {
        return null;
    }

    @Override
    public Image getImage() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public String getName() {
        return "Blacklist";
    }

    @Override
    public void initializeFrom(final ILaunchConfiguration configuration) {
        try {
            final String wildcardString = configuration.getAttribute(SoMoXConfiguration.SOMOX_ANALYZER_WILDCARD_KEY,
                    "");
            final StringTokenizer tokenizer = new StringTokenizer(wildcardString, DELIMITER);
            final int tokenCount = tokenizer.countTokens();
            final Set<String> wildcards = new HashSet<>();
            for (int i = 0; i < tokenCount; i++) {
                wildcards.add(tokenizer.nextToken());
            }

            initializeTreeViewer(wildcards);
            initializeTextField(wildcards);

            addiditonalBlacklistTextfield.setText(
                    configuration.getAttribute(SoMoXConfiguration.BLACKLIST_CONFIGURATION_WILDCARDS_ADDITIONAL, ""));
        } catch (final CoreException e) {
        }
    }

    private void initializeTreeViewer(final Set<String> wildcardSet) {
        // Restore check-state
        checkboxTreeViewer.expandAll();
        checkboxTreeViewer.setAllChecked(true);
        final Object[] elements = checkboxTreeViewer.getCheckedElements();
        checkboxTreeViewer.setAllChecked(false);
        checkboxTreeViewer.collapseAll();

        for (final Object currentElement : elements) {
            if (currentElement instanceof tools.mdsd.jamopp.model.java.containers.Package) {
                if (wildcardSet.contains(KDMHelper.computeFullQualifiedName(
                        ((tools.mdsd.jamopp.model.java.containers.Package) currentElement)))) {
                    checkboxTreeViewer.setChecked(currentElement, true);
                }
            } else if ((currentElement instanceof Type)
                    && wildcardSet.contains(KDMHelper.computeFullQualifiedName((Commentable) currentElement))) {
                checkboxTreeViewer.setChecked(currentElement, true);
            }
        }
    }

    private void initializeTextField(final Set<String> wildcardSet) {
        final StringBuilder buffer = new StringBuilder();
        final Iterator<String> iterator = wildcardSet.iterator();
        while (iterator.hasNext()) {
            buffer.append(iterator.next());
            buffer.append(System.lineSeparator());
        }
        textField.setText(buffer.toString());
    }

    @Override
    public boolean isValid(final ILaunchConfiguration launchConfig) {
        return true;
    }

    @Override
    public void launched(final ILaunch launch) {

    }

    private Set<String> getTreeSelection() {
        final Object[] checked = checkboxTreeViewer.getCheckedElements();
        // String[] wildcards = new String[checked.length];
        final Set<String> wildcards = new HashSet<>();
        // int i = 0;
        for (final Object current : checked) {
            if (current instanceof Type) {
                // wildcards[i] = ((GASTClass) current).getQualifiedName();
                wildcards.add(KDMHelper.computeFullQualifiedName(((Type) current)));
            } else if (current instanceof tools.mdsd.jamopp.model.java.containers.Package) {
                // wildcards[i] = ((de.fzi.gast.core.Package) current).getQualifiedName()+ ".*";

                // TODO: wildcard for packages conflict with usability
                wildcards.add(KDMHelper
                        .computeFullQualifiedName(((tools.mdsd.jamopp.model.java.containers.Package) current)));
            }
            // i++;
        }

        return wildcards;
    }

    private Set<String> getTextField(final Text myTextField) {
        final Set<String> completeResult = new HashSet<>();
        final String[] result = myTextField.getText().split(System.lineSeparator());
        for (final String element : result) {
            final String[] commaResult = element.split(",");
            for (final String element2 : commaResult) {
                final String[] semicolonResult = element2.split(";");
                Collections.addAll(completeResult, semicolonResult);
            }
        }
        return completeResult;

    }

    @Override
    public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
        Set<String> wildcards;
        if (stackLayout.topControl == textFieldControl) {
            wildcards = getTextField(textField);
        } else {
            wildcards = getTreeSelection();
            wildcards.addAll(getTextField(addiditonalBlacklistTextfield));
        }
        final StringBuilder buffer = new StringBuilder();
        final Iterator<String> iterator = wildcards.iterator();
        while (iterator.hasNext()) {
            buffer.append(iterator.next());
            buffer.append(DELIMITER);
        }
        configuration.setAttribute(SoMoXConfiguration.SOMOX_ANALYZER_WILDCARD_KEY, buffer.toString());
        configuration.setAttribute(SoMoXConfiguration.BLACKLIST_CONFIGURATION_WILDCARDS_ADDITIONAL,
                addiditonalBlacklistTextfield.getText());
    }

    @Override
    public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
        if (checkboxTreeViewer != null) {
            checkboxTreeViewer.setInput(null);
        }
        configuration.setAttribute(SoMoXConfiguration.BLACKLIST_CONFIGURATION_WILDCARDS_ADDITIONAL, "");
    }
}
