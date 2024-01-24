package org.somox.analyzer;

import java.util.Enumeration;
import java.util.Vector;

import org.apache.log4j.Level;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
//import org.eclipse.gmt.modisco.java.emf.util.JavaAdapterFactory;
//import org.eclipse.gmt.modisco.omg.kdm.kdm.util.KdmAdapterFactory;
//import org.eclipse.modisco.java.composition.javaapplication.util.JavaapplicationAdapterFactory;
import org.somox.core.Activator;
import org.somox.kdmhelper.KDMReader;
import org.somox.kdmhelper.metamodeladdition.Root;

//import de.fzi.gast.accesses.provider.accessesItemProviderAdapterFactory;
//import de.fzi.gast.annotations.provider.annotationsItemProviderAdapterFactory;
//import de.fzi.gast.core.Root;
//import de.fzi.gast.core.provider.coreItemProviderAdapterFactory;
//import de.fzi.gast.functions.provider.functionsItemProviderAdapterFactory;
//import de.fzi.gast.helpers.GASTReader;
//import de.fzi.gast.statements.provider.statementsItemProviderAdapterFactory;
//import de.fzi.gast.types.provider.typesItemProviderAdapterFactory;
//import de.fzi.gast.variables.provider.variablesItemProviderAdapterFactory;

/**
 * @author Snowball
 */
public class ModelAnalyzerTabGroupBlackboard {

    /**
     * @uml.property name="root"
     * @uml.associationEnd
     */
    private Root root;

    private final ComposedAdapterFactory adapterFactory;
    // private AdapterFactoryEditingDomain editingDomain;

    static int idCounter = 0;
    private int myId = 0;

    private final ILog logger = Activator.getPlugin().getLog();

    public ModelAnalyzerTabGroupBlackboard() {
        idCounter++;
        myId = idCounter;

        adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
        adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
        // adapterFactory.addAdapterFactory(new statementsItemProviderAdapterFactory());
        // adapterFactory.addAdapterFactory(new coreItemProviderAdapterFactory());
        // adapterFactory.addAdapterFactory(new
        // annotationsItemProviderAdapterFactory());
        // adapterFactory.addAdapterFactory(new typesItemProviderAdapterFactory());
        // adapterFactory.addAdapterFactory(new functionsItemProviderAdapterFactory());
        // adapterFactory.addAdapterFactory(new accessesItemProviderAdapterFactory());
        // adapterFactory.addAdapterFactory(new variablesItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
        // adapterFactory.addAdapterFactory(new
        // JavaAdapterFactory());//REALLYADDED//SOMOXTODOCHANGE
        // adapterFactory.addAdapterFactory(new
        // KdmAdapterFactory());;//REALLYADDED//SOMOXTODOCHANGE
        // adapterFactory.addAdapterFactory(new
        // JavaapplicationAdapterFactory());//SOMOXTODOCHANGE
        // //TODO verify.....

        // BasicCommandStack commandStack = new BasicCommandStack();

        // editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack,
        // new
        // HashMap<Resource, Boolean>());
    }

    public int getId() {
        return myId;
    }

    /**
     * @uml.property name="somoxAnalyzerInputFile"
     */
    private String somoxAnalyzerInputFile = null;

    /**
     * @uml.property name="debugLvl"
     */
    private Level debugLvl = Level.INFO;

    /**
     * @return
     * @uml.property name="debugLvl"
     */
    public Level getDebugLvl() {
        return debugLvl;
    }

    public void setDebugLvl(final int debugLvl) {
        switch (debugLvl) {
        case 0:
            this.debugLvl = Level.INFO;
            break;
        case 1:
            this.debugLvl = Level.DEBUG;
            break;
        default:
            this.debugLvl = Level.ALL;
        }
    }

    /**
     * @return
     * @uml.property name="somoxAnalyzerInputFile"
     */
    public String getSomoxAnalyzerInputFile() {
        return somoxAnalyzerInputFile;
    }

    /**
     * @param somoxAnalyzerInputFile
     * @uml.property name="somoxAnalyzerInputFile"
     */
    public void setSomoxAnalyzerInputFile(final String somoxAnalyzerInputFile) {
        if ((this.somoxAnalyzerInputFile == null) || ((this.somoxAnalyzerInputFile != null)
                && !this.somoxAnalyzerInputFile.equals(somoxAnalyzerInputFile))) {
            this.somoxAnalyzerInputFile = somoxAnalyzerInputFile;
            if ((this.somoxAnalyzerInputFile != null) && somoxAnalyzerInputFile.endsWith(".xmi")) {
                loadModel();
            } else {
                root = null;
            }
            fireBlackboardChanged();
        }
    }

    private void loadModel() {

        final URI fileURI = URI.createPlatformResourceURI(somoxAnalyzerInputFile, true);

        final IWorkspaceRoot resRoot = ResourcesPlugin.getWorkspace().getRoot();
        if (resRoot.findMember(fileURI.toPlatformString(true)) instanceof IFile) {
            final KDMReader gastReader = new KDMReader();
            // gastReader.loadFile(fileURI);
            root = gastReader.getRoot();
        } else {
            logger.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Failed to load Model file " + fileURI));
        }
    }

    /**
     * @return
     * @uml.property name="root"
     */
    public Root getRoot() {
        return root;
    }

    //
    // Event handling
    //
    private transient Vector<BlackboardListener> blackboardListeners;

    /** Register a listener for Blackboard events */
    synchronized public void addBlackboardListener(final BlackboardListener listener) {
        if (blackboardListeners == null) {
            blackboardListeners = new Vector<>();
        }
        blackboardListeners.addElement(listener);
    }

    synchronized public void removeBlackboardListener(final BlackboardListener listener) {
        if (blackboardListeners == null) {
            blackboardListeners = new Vector<>();
        }
        blackboardListeners.removeElement(listener);
    }

    /** Fire to all registered listeners */
    @SuppressWarnings("unchecked")
    public void fireBlackboardChanged() {
        // If we have no listeners, do nothing.
        if ((blackboardListeners != null) && !blackboardListeners.isEmpty()) {
            // Make a copy of the listener list in case anyone adds or removes
            // listeners.
            Vector<BlackboardListener> targets;
            synchronized (blackboardListeners) {
                targets = (Vector<BlackboardListener>) blackboardListeners.clone();
            }
            // Walk through the listener list and call the listener method in
            // each.
            final Enumeration<BlackboardListener> e = targets.elements();
            while (e.hasMoreElements()) {
                final BlackboardListener l = e.nextElement();
                l.blackboardChanged();
            }
        }
    }

}
