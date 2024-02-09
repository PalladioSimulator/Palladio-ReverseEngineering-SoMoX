package org.somox.analyzer.simplemodelanalyzer.detection;

import org.somox.filter.BaseFilter;
import org.somox.filter.DataObjectFilter;
import org.somox.kdmhelper.KDMHelper;

import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;

/**
 * Abstract class for {@link IInitializationStrategy} providing default class
 * filters.
 *
 * @author Klaus Krogmann
 *
 */
public abstract class AbstractInitializationStrategy implements IInitializationStrategy {

    protected static final BaseFilter<ConcreteClassifier> primitiveClassesFilter = new BaseFilter<>() {
        @Override
        public boolean passes(final ConcreteClassifier object) {
            return !KDMHelper.isPrimitive(object);
        }
    };
    /**
     * Filter invalid classes provided by SISSy
     */
    protected static final BaseFilter<ConcreteClassifier> unknownClassTypeFilter = new BaseFilter<>() {
        @Override
        public boolean passes(final ConcreteClassifier object) {
            return !"<unknownClassType>".equals(KDMHelper.getName(object));
        }
    };
    protected static final BaseFilter<ConcreteClassifier> improperStructFilter = new BaseFilter<>() {
        @Override
        // Checks whether the class type is a Struct, that actually should be seen as a
        // Class,
        // because it has virtual methods.
        public boolean passes(final ConcreteClassifier object) {
            return true;// ! ( hasVirtualMethod(object));//SOMOXTODOCHANGE (object instanceof
            // GASTStruct) && removed
        }
    };
    protected static final BaseFilter<ConcreteClassifier> dataObjectFilter = new DataObjectFilter();

    public AbstractInitializationStrategy() {
    }

}