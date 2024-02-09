package org.somox.metrics.helper;

import org.somox.kdmhelper.KDMHelper;

import tools.mdsd.jamopp.model.java.types.Type;

//import de.fzi.gast.types.GASTClass;

/**
 * This class is a struct containing a {@link Type} and a counter. It is used to
 * model an a link from a node in a graph of classes to the contained class in
 * this structure. The count is the weight of the link. It is used to model the
 * number of links going from the source node to the class in this struct.
 *
 * @author Steffen Becker
 *
 */
public class ClassAccessGraphEdge {
    private Type sourceClazz = null, targetClazz = null;
    private int count = 0;

    public ClassAccessGraphEdge(final Type source, final Type target, final int count) {
        sourceClazz = source;
        targetClazz = target;
        this.count = count;
    }

    public ClassAccessGraphEdge(final Type source, final Type target) {
        this(source, target, 0);
    }

    /**
     * @return the clazz
     */
    public Type getSourceClazz() {
        return sourceClazz;
    }

    public Type getTargetClazz() {
        return targetClazz;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    public void incrementCount() {
        count++;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "From: " + KDMHelper.getName(sourceClazz) + " To: " + KDMHelper.getName(targetClazz) + " Count: "
                + count;
    }

}
