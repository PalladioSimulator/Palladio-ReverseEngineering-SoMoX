package org.somox.metrics.tabs;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.somox.kdmhelper.metamodeladdition.Root;

import tools.mdsd.jamopp.model.java.types.Type;

//import de.fzi.gast.core.Root;
//import de.fzi.gast.types.GASTClass;

public class CheckboxLabelProvider implements ILabelProvider {

    @Override
    public Image getImage(final Object element) {
        return null;
    }

    @Override
    public String getText(final Object element) {
        if (element instanceof Root) {
            return ("Root");
        }
        if (element instanceof Package) {
            return ((Package) element).getName();
        }
        if (element instanceof Type) {
            return ((Type) element).toString();
        }
        return null;
    }

    @Override
    public void addListener(final ILabelProviderListener listener) {

    }

    @Override
    public void dispose() {

    }

    @Override
    public boolean isLabelProperty(final Object element, final String property) {
        return false;
    }

    @Override
    public void removeListener(final ILabelProviderListener listener) {

    }

}
