package org.somox.filter;

import java.util.List;

import org.apache.log4j.Logger;
import org.somox.kdmhelper.KDMHelper;

import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;
import tools.mdsd.jamopp.model.java.members.EnumConstant;
import tools.mdsd.jamopp.model.java.members.Method;

/**
 * Filter all classes which are only data classes, i.e., all public methods are
 * only getter and setter methods
 *
 * @author Steffen Becker
 */
public class DataObjectFilter extends BaseFilter<ConcreteClassifier> {

    private final static Logger logger = Logger.getLogger(DataObjectFilter.class);

    @Override
    public boolean passes(final ConcreteClassifier object) {
        if (object instanceof EnumConstant) {// REALLYADDED
            return true; // REALLYADDED
        } // REALLYADDED
        final List<Method> allMethods = KDMHelper.getMethods(object);
        for (final Method m : allMethods) {
            if (m.isPublic() && isNotGetterOrSetter(m)) {
                return true;
            }
        }
        logger.debug("Removed GAST Class " + object.toString() + " from component candidates as it is a datatype");
        return false;
    }

    private final String[] filteredPrefixes = { "is", "get", "set", "equals", "hashcode" };

    private boolean isNotGetterOrSetter(final Method m) {
        boolean result = false;
        final String simpleMethodName = m.getName().toLowerCase();
        for (final String prefix : filteredPrefixes) {
            result |= simpleMethodName.startsWith(prefix);
        }
        return !result;
    }

}
