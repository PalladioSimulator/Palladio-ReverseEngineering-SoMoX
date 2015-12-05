/**
 */
package org.somox.sourcecodedecorator.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.somox.sourcecodedecorator.PCMSystemImplementatingClassesLink;
import org.somox.sourcecodedecorator.SourcecodedecoratorPackage;

/**
 * This is the item provider adapter for a
 * {@link org.somox.sourcecodedecorator.PCMSystemImplementatingClassesLink} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class PCMSystemImplementatingClassesLinkItemProvider extends ComponentImplementingClassesLinkItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public PCMSystemImplementatingClassesLinkItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            this.addSystemModelPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the System Model feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addSystemModelPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_PCMSystemImplementatingClassesLink_systemModel_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_PCMSystemImplementatingClassesLink_systemModel_feature",
                        "_UI_PCMSystemImplementatingClassesLink_type"),
                SourcecodedecoratorPackage.Literals.PCM_SYSTEM_IMPLEMENTATING_CLASSES_LINK__SYSTEM_MODEL, true, false,
                true, null, null, null));
    }

    /**
     * This returns PCMSystemImplementatingClassesLink.gif. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object,
                this.getResourceLocator().getImage("full/obj16/PCMSystemImplementatingClassesLink"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final PCMSystemImplementatingClassesLink pcmSystemImplementatingClassesLink = (PCMSystemImplementatingClassesLink) object;
        return this.getString("_UI_PCMSystemImplementatingClassesLink_type") + " "
                + pcmSystemImplementatingClassesLink.isIsCompositeComponent();
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
