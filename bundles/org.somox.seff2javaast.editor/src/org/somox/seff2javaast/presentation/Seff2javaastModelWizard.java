/**
 */
package org.somox.seff2javaast.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.somox.seff2javaast.Seff2javaastFactory;
import org.somox.seff2javaast.Seff2javaastPackage;
import org.somox.seff2javaast.provider.Seff2java_astEditPlugin;

/**
 * This is a simple wizard for creating a new model file. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 *
 * @generated
 */
public class Seff2javaastModelWizard extends Wizard implements INewWizard {
    /**
     * The supported extensions for created files. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static final List<String> FILE_EXTENSIONS = Collections
            .unmodifiableList(Arrays.asList(Seff2java_astEditorPlugin.INSTANCE
                    .getString("_UI_Seff2javaastEditorFilenameExtensions").split("\\s*,\\s*")));

    /**
     * A formatted list of supported file extensions, suitable for display. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String FORMATTED_FILE_EXTENSIONS = Seff2java_astEditorPlugin.INSTANCE
            .getString("_UI_Seff2javaastEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

    /**
     * This caches an instance of the model package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected Seff2javaastPackage seff2javaastPackage = Seff2javaastPackage.eINSTANCE;

    /**
     * This caches an instance of the model factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected Seff2javaastFactory seff2javaastFactory = seff2javaastPackage.getSeff2javaastFactory();

    /**
     * This is the file creation page. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected Seff2javaastModelWizardNewFileCreationPage newFileCreationPage;

    /**
     * This is the initial object creation page. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected Seff2javaastModelWizardInitialObjectCreationPage initialObjectCreationPage;

    /**
     * Remember the selection during initialization for populating the default
     * container. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IStructuredSelection selection;

    /**
     * Remember the workbench during initialization. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected IWorkbench workbench;

    /**
     * Caches the names of the types that can be created as the root object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected List<String> initialObjectNames;

    /**
     * This just records the information. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public void init(final IWorkbench workbench, final IStructuredSelection selection) {
        this.workbench = workbench;
        this.selection = selection;
        setWindowTitle(Seff2java_astEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
        setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE
                .getImageDescriptor(Seff2java_astEditorPlugin.INSTANCE.getImage("full/wizban/NewSeff2javaast")));
    }

    /**
     * Returns the names of the types that can be created as the root object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected Collection<String> getInitialObjectNames() {
        if (initialObjectNames == null) {
            initialObjectNames = new ArrayList<>();
            for (final EClassifier eClassifier : seff2javaastPackage.getEClassifiers()) {
                if ((eClassifier instanceof final EClass eClass) && !eClass.isAbstract()) {
                    initialObjectNames.add(eClass.getName());
                }
            }
            Collections.sort(initialObjectNames, CommonPlugin.INSTANCE.getComparator());
        }
        return initialObjectNames;
    }

    /**
     * Create a new model. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected EObject createInitialModel() {
        final EClass eClass = (EClass) seff2javaastPackage
                .getEClassifier(initialObjectCreationPage.getInitialObjectName());
        return seff2javaastFactory.create(eClass);
    }

    /**
     * Do the work after everything is specified. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean performFinish() {
        try {
            // Remember the file.
            //
            final IFile modelFile = getModelFile();

            // Do the work within an operation.
            //
            final WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
                @Override
                protected void execute(final IProgressMonitor progressMonitor) {
                    try {
                        // Create a resource set
                        //
                        final ResourceSet resourceSet = new ResourceSetImpl();

                        // Get the URI of the model file.
                        //
                        final URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

                        // Create a resource for this file.
                        //
                        final Resource resource = resourceSet.createResource(fileURI);

                        // Add the initial model object to the contents.
                        //
                        final EObject rootObject = Seff2javaastModelWizard.this.createInitialModel();
                        if (rootObject != null) {
                            resource.getContents().add(rootObject);
                        }

                        // Save the contents of the resource to the file system.
                        //
                        final Map<Object, Object> options = new HashMap<>();
                        options.put(XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding());
                        resource.save(options);
                    } catch (final Exception exception) {
                        Seff2java_astEditorPlugin.INSTANCE.log(exception);
                    } finally {
                        progressMonitor.done();
                    }
                }
            };

            getContainer().run(false, false, operation);

            // Select the new file resource in the current view.
            //
            final IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
            final IWorkbenchPage page = workbenchWindow.getActivePage();
            final IWorkbenchPart activePart = page.getActivePart();
            if (activePart instanceof ISetSelectionTarget) {
                final ISelection targetSelection = new StructuredSelection(modelFile);
                getShell().getDisplay()
                        .asyncExec(() -> ((ISetSelectionTarget) activePart).selectReveal(targetSelection));
            }

            // Open an editor on the new file.
            //
            try {
                page.openEditor(new FileEditorInput(modelFile),
                        workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());
            } catch (final PartInitException exception) {
                MessageDialog.openError(workbenchWindow.getShell(),
                        Seff2java_astEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"),
                        exception.getMessage());
                return false;
            }

            return true;
        } catch (final Exception exception) {
            Seff2java_astEditorPlugin.INSTANCE.log(exception);
            return false;
        }
    }

    /**
     * This is the one page of the wizard. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    public class Seff2javaastModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
        /**
         * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        public Seff2javaastModelWizardNewFileCreationPage(final String pageId, final IStructuredSelection selection) {
            super(pageId, selection);
        }

        /**
         * The framework calls this to see if the file is correct. <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         *
         * @generated
         */
        @Override
        protected boolean validatePage() {
            if (super.validatePage()) {
                final String extension = new Path(getFileName()).getFileExtension();
                if ((extension == null) || !FILE_EXTENSIONS.contains(extension)) {
                    final String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions"
                            : "_WARN_FilenameExtension";
                    setErrorMessage(Seff2java_astEditorPlugin.INSTANCE.getString(key,
                            new Object[] { FORMATTED_FILE_EXTENSIONS }));
                    return false;
                }
                return true;
            }
            return false;
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        public IFile getModelFile() {
            return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
        }
    }

    /**
     * This is the page where the type of object to create is selected. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public class Seff2javaastModelWizardInitialObjectCreationPage extends WizardPage {
        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        protected Combo initialObjectField;

        /**
         * @generated <!-- begin-user-doc --> <!-- end-user-doc -->
         */
        protected List<String> encodings;

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        protected Combo encodingField;

        /**
         * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        public Seff2javaastModelWizardInitialObjectCreationPage(final String pageId) {
            super(pageId);
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        @Override
        public void createControl(final Composite parent) {
            final Composite composite = new Composite(parent, SWT.NONE);
            {
                final GridLayout layout = new GridLayout();
                layout.numColumns = 1;
                layout.verticalSpacing = 12;
                composite.setLayout(layout);

                final GridData data = new GridData();
                data.verticalAlignment = GridData.FILL;
                data.grabExcessVerticalSpace = true;
                data.horizontalAlignment = GridData.FILL;
                composite.setLayoutData(data);
            }

            final Label containerLabel = new Label(composite, SWT.LEFT);
            {
                containerLabel.setText(Seff2java_astEditorPlugin.INSTANCE.getString("_UI_ModelObject"));

                final GridData data = new GridData();
                data.horizontalAlignment = GridData.FILL;
                containerLabel.setLayoutData(data);
            }

            initialObjectField = new Combo(composite, SWT.BORDER);
            {
                final GridData data = new GridData();
                data.horizontalAlignment = GridData.FILL;
                data.grabExcessHorizontalSpace = true;
                initialObjectField.setLayoutData(data);
            }

            for (final String objectName : getInitialObjectNames()) {
                initialObjectField.add(getLabel(objectName));
            }

            if (initialObjectField.getItemCount() == 1) {
                initialObjectField.select(0);
            }
            initialObjectField.addModifyListener(validator);

            final Label encodingLabel = new Label(composite, SWT.LEFT);
            {
                encodingLabel.setText(Seff2java_astEditorPlugin.INSTANCE.getString("_UI_XMLEncoding"));

                final GridData data = new GridData();
                data.horizontalAlignment = GridData.FILL;
                encodingLabel.setLayoutData(data);
            }
            encodingField = new Combo(composite, SWT.BORDER);
            {
                final GridData data = new GridData();
                data.horizontalAlignment = GridData.FILL;
                data.grabExcessHorizontalSpace = true;
                encodingField.setLayoutData(data);
            }

            for (final String encoding : getEncodings()) {
                encodingField.add(encoding);
            }

            encodingField.select(0);
            encodingField.addModifyListener(validator);

            setPageComplete(validatePage());
            setControl(composite);
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        protected ModifyListener validator = e -> setPageComplete(validatePage());

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        protected boolean validatePage() {
            return (getInitialObjectName() != null) && getEncodings().contains(encodingField.getText());
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        @Override
        public void setVisible(final boolean visible) {
            super.setVisible(visible);
            if (visible) {
                if (initialObjectField.getItemCount() == 1) {
                    initialObjectField.clearSelection();
                    encodingField.setFocus();
                } else {
                    encodingField.clearSelection();
                    initialObjectField.setFocus();
                }
            }
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        public String getInitialObjectName() {
            final String label = initialObjectField.getText();

            for (final String name : getInitialObjectNames()) {
                if (getLabel(name).equals(label)) {
                    return name;
                }
            }
            return null;
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        public String getEncoding() {
            return encodingField.getText();
        }

        /**
         * Returns the label for the specified type name. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @generated
         */
        protected String getLabel(final String typeName) {
            try {
                return Seff2java_astEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
            } catch (final MissingResourceException mre) {
                Seff2java_astEditorPlugin.INSTANCE.log(mre);
            }
            return typeName;
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        protected Collection<String> getEncodings() {
            if (encodings == null) {
                encodings = new ArrayList<>();
                for (final StringTokenizer stringTokenizer = new StringTokenizer(
                        Seff2java_astEditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer
                                .hasMoreTokens();) {
                    encodings.add(stringTokenizer.nextToken());
                }
            }
            return encodings;
        }
    }

    /**
     * The framework calls this to create the contents of the wizard. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void addPages() {
        // Create a page, set the title, and the initial model file name.
        //
        newFileCreationPage = new Seff2javaastModelWizardNewFileCreationPage("Whatever", selection);
        newFileCreationPage.setTitle(Seff2java_astEditorPlugin.INSTANCE.getString("_UI_Seff2javaastModelWizard_label"));
        newFileCreationPage.setDescription(
                Seff2java_astEditorPlugin.INSTANCE.getString("_UI_Seff2javaastModelWizard_description"));
        newFileCreationPage
                .setFileName(Seff2java_astEditorPlugin.INSTANCE.getString("_UI_Seff2javaastEditorFilenameDefaultBase")
                        + "." + FILE_EXTENSIONS.get(0));
        addPage(newFileCreationPage);

        // Try and get the resource selection to determine a current directory for the
        // file dialog.
        //
        if ((selection != null) && !selection.isEmpty()) {
            // Get the resource...
            //
            final Object selectedElement = selection.iterator().next();
            if (selectedElement instanceof IResource selectedResource) {
                if (selectedResource.getType() == IResource.FILE) {
                    selectedResource = selectedResource.getParent();
                }

                // This gives us a directory...
                //
                if ((selectedResource instanceof IFolder) || (selectedResource instanceof IProject)) {
                    // Set this for the container.
                    //
                    newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

                    // Make up a unique new name here.
                    //
                    final String defaultModelBaseFilename = Seff2java_astEditorPlugin.INSTANCE
                            .getString("_UI_Seff2javaastEditorFilenameDefaultBase");
                    final String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
                    String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
                    for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i) {
                        modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
                    }
                    newFileCreationPage.setFileName(modelFilename);
                }
            }
        }
        initialObjectCreationPage = new Seff2javaastModelWizardInitialObjectCreationPage("Whatever2");
        initialObjectCreationPage
                .setTitle(Seff2java_astEditorPlugin.INSTANCE.getString("_UI_Seff2javaastModelWizard_label"));
        initialObjectCreationPage
                .setDescription(Seff2java_astEditorPlugin.INSTANCE.getString("_UI_Wizard_initial_object_description"));
        addPage(initialObjectCreationPage);
    }

    /**
     * Get the file from the page. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public IFile getModelFile() {
        return newFileCreationPage.getModelFile();
    }

}
