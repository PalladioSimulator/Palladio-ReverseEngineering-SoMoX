/**
 */
package org.somox.sourcecodedecorator.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.somox.sourcecodedecorator.util.SourcecodedecoratorAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support
 * Viewers. The adapters generated by this factory convert EMF adapter
 * notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The
 * adapters also support Eclipse property sheets. Note that most of the adapters
 * are shared among multiple instances. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class SourcecodedecoratorItemProviderAdapterFactory extends SourcecodedecoratorAdapterFactory
        implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter
     * factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement
     * {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by
     * {@link #isFactoryForType isFactoryForType}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<>();

    /**
     * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SourcecodedecoratorItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.somox.sourcecodedecorator.FileLevelSourceCodeLink} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FileLevelSourceCodeLinkItemProvider fileLevelSourceCodeLinkItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.somox.sourcecodedecorator.FileLevelSourceCodeLink}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createFileLevelSourceCodeLinkAdapter() {
        if (fileLevelSourceCodeLinkItemProvider == null) {
            fileLevelSourceCodeLinkItemProvider = new FileLevelSourceCodeLinkItemProvider(this);
        }

        return fileLevelSourceCodeLinkItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.somox.sourcecodedecorator.MethodLevelSourceCodeLink} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MethodLevelSourceCodeLinkItemProvider methodLevelSourceCodeLinkItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.somox.sourcecodedecorator.MethodLevelSourceCodeLink}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createMethodLevelSourceCodeLinkAdapter() {
        if (methodLevelSourceCodeLinkItemProvider == null) {
            methodLevelSourceCodeLinkItemProvider = new MethodLevelSourceCodeLinkItemProvider(this);
        }

        return methodLevelSourceCodeLinkItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.somox.sourcecodedecorator.ControlFlowLevelSourceCodeLink}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ControlFlowLevelSourceCodeLinkItemProvider controlFlowLevelSourceCodeLinkItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.somox.sourcecodedecorator.ControlFlowLevelSourceCodeLink}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createControlFlowLevelSourceCodeLinkAdapter() {
        if (controlFlowLevelSourceCodeLinkItemProvider == null) {
            controlFlowLevelSourceCodeLinkItemProvider = new ControlFlowLevelSourceCodeLinkItemProvider(this);
        }

        return controlFlowLevelSourceCodeLinkItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.somox.sourcecodedecorator.SourceCodeDecoratorRepository}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SourceCodeDecoratorRepositoryItemProvider sourceCodeDecoratorRepositoryItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.somox.sourcecodedecorator.SourceCodeDecoratorRepository}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createSourceCodeDecoratorRepositoryAdapter() {
        if (sourceCodeDecoratorRepositoryItemProvider == null) {
            sourceCodeDecoratorRepositoryItemProvider = new SourceCodeDecoratorRepositoryItemProvider(this);
        }

        return sourceCodeDecoratorRepositoryItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.somox.sourcecodedecorator.InterfaceSourceCodeLink} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InterfaceSourceCodeLinkItemProvider interfaceSourceCodeLinkItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.somox.sourcecodedecorator.InterfaceSourceCodeLink}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createInterfaceSourceCodeLinkAdapter() {
        if (interfaceSourceCodeLinkItemProvider == null) {
            interfaceSourceCodeLinkItemProvider = new InterfaceSourceCodeLinkItemProvider(this);
        }

        return interfaceSourceCodeLinkItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.somox.sourcecodedecorator.ComponentImplementingClassesLink}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComponentImplementingClassesLinkItemProvider componentImplementingClassesLinkItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.somox.sourcecodedecorator.ComponentImplementingClassesLink}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createComponentImplementingClassesLinkAdapter() {
        if (componentImplementingClassesLinkItemProvider == null) {
            componentImplementingClassesLinkItemProvider = new ComponentImplementingClassesLinkItemProvider(this);
        }

        return componentImplementingClassesLinkItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.somox.sourcecodedecorator.PCMSystemImplementatingClassesLink}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMSystemImplementatingClassesLinkItemProvider pcmSystemImplementatingClassesLinkItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.somox.sourcecodedecorator.PCMSystemImplementatingClassesLink}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMSystemImplementatingClassesLinkAdapter() {
        if (pcmSystemImplementatingClassesLinkItemProvider == null) {
            pcmSystemImplementatingClassesLinkItemProvider = new PCMSystemImplementatingClassesLinkItemProvider(this);
        }

        return pcmSystemImplementatingClassesLinkItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.somox.sourcecodedecorator.DataTypeSourceCodeLink} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DataTypeSourceCodeLinkItemProvider dataTypeSourceCodeLinkItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.somox.sourcecodedecorator.DataTypeSourceCodeLink}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createDataTypeSourceCodeLinkAdapter() {
        if (dataTypeSourceCodeLinkItemProvider == null) {
            dataTypeSourceCodeLinkItemProvider = new DataTypeSourceCodeLinkItemProvider(this);
        }

        return dataTypeSourceCodeLinkItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.somox.sourcecodedecorator.InnerDatatypeSourceCodeLink} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InnerDatatypeSourceCodeLinkItemProvider innerDatatypeSourceCodeLinkItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.somox.sourcecodedecorator.InnerDatatypeSourceCodeLink}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createInnerDatatypeSourceCodeLinkAdapter() {
        if (innerDatatypeSourceCodeLinkItemProvider == null) {
            innerDatatypeSourceCodeLinkItemProvider = new InnerDatatypeSourceCodeLinkItemProvider(this);
        }

        return innerDatatypeSourceCodeLinkItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.somox.sourcecodedecorator.AbstractActionClassMethodLink}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected AbstractActionClassMethodLinkItemProvider abstractActionClassMethodLinkItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.somox.sourcecodedecorator.AbstractActionClassMethodLink}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createAbstractActionClassMethodLinkAdapter() {
        if (abstractActionClassMethodLinkItemProvider == null) {
            abstractActionClassMethodLinkItemProvider = new AbstractActionClassMethodLinkItemProvider(this);
        }

        return abstractActionClassMethodLinkItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.somox.sourcecodedecorator.MethodLevelResourceDemandingInternalBehaviorLink}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MethodLevelResourceDemandingInternalBehaviorLinkItemProvider methodLevelResourceDemandingInternalBehaviorLinkItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.somox.sourcecodedecorator.MethodLevelResourceDemandingInternalBehaviorLink}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createMethodLevelResourceDemandingInternalBehaviorLinkAdapter() {
        if (methodLevelResourceDemandingInternalBehaviorLinkItemProvider == null) {
            methodLevelResourceDemandingInternalBehaviorLinkItemProvider = new MethodLevelResourceDemandingInternalBehaviorLinkItemProvider(
                    this);
        }

        return methodLevelResourceDemandingInternalBehaviorLinkItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.somox.sourcecodedecorator.SEFF2MethodMapping} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SEFF2MethodMappingItemProvider seff2MethodMappingItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.somox.sourcecodedecorator.SEFF2MethodMapping}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createSEFF2MethodMappingAdapter() {
        if (seff2MethodMappingItemProvider == null) {
            seff2MethodMappingItemProvider = new SEFF2MethodMappingItemProvider(this);
        }

        return seff2MethodMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.somox.sourcecodedecorator.SeffElementSourceCodeLink} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SeffElementSourceCodeLinkItemProvider seffElementSourceCodeLinkItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.somox.sourcecodedecorator.SeffElementSourceCodeLink}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createSeffElementSourceCodeLinkAdapter() {
        if (seffElementSourceCodeLinkItemProvider == null) {
            seffElementSourceCodeLinkItemProvider = new SeffElementSourceCodeLinkItemProvider(this);
        }

        return seffElementSourceCodeLinkItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setParentAdapterFactory(final ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the
     * adapter. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter adapt(final Notifier notifier, final Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object adapt(final Object object, final Object type) {
        if (isFactoryForType(type)) {
            final Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void addListener(final INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void removeListener(final INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to
     * {@link #parentAdapterFactory}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void fireNotifyChanged(final Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void dispose() {
        if (fileLevelSourceCodeLinkItemProvider != null) {
            fileLevelSourceCodeLinkItemProvider.dispose();
        }
        if (methodLevelSourceCodeLinkItemProvider != null) {
            methodLevelSourceCodeLinkItemProvider.dispose();
        }
        if (controlFlowLevelSourceCodeLinkItemProvider != null) {
            controlFlowLevelSourceCodeLinkItemProvider.dispose();
        }
        if (sourceCodeDecoratorRepositoryItemProvider != null) {
            sourceCodeDecoratorRepositoryItemProvider.dispose();
        }
        if (interfaceSourceCodeLinkItemProvider != null) {
            interfaceSourceCodeLinkItemProvider.dispose();
        }
        if (componentImplementingClassesLinkItemProvider != null) {
            componentImplementingClassesLinkItemProvider.dispose();
        }
        if (pcmSystemImplementatingClassesLinkItemProvider != null) {
            pcmSystemImplementatingClassesLinkItemProvider.dispose();
        }
        if (dataTypeSourceCodeLinkItemProvider != null) {
            dataTypeSourceCodeLinkItemProvider.dispose();
        }
        if (innerDatatypeSourceCodeLinkItemProvider != null) {
            innerDatatypeSourceCodeLinkItemProvider.dispose();
        }
        if (abstractActionClassMethodLinkItemProvider != null) {
            abstractActionClassMethodLinkItemProvider.dispose();
        }
        if (methodLevelResourceDemandingInternalBehaviorLinkItemProvider != null) {
            methodLevelResourceDemandingInternalBehaviorLinkItemProvider.dispose();
        }
        if (seff2MethodMappingItemProvider != null) {
            seff2MethodMappingItemProvider.dispose();
        }
        if (seffElementSourceCodeLinkItemProvider != null) {
            seffElementSourceCodeLinkItemProvider.dispose();
        }
    }

}
