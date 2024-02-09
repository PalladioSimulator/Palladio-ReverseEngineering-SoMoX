package org.somox.filter;

import org.somox.kdmhelper.GetAccessedType;

import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;
import tools.mdsd.jamopp.model.java.members.Member;

//import de.fzi.gast.accesses.Access;
//import de.fzi.gast.types.GASTClass;

/**
 * This class filters a list of Accesses based on the accessed class. If the
 * accessed class is in the classifier filter, then the current access is also
 * removed.
 *
 * @author Steffen Becker
 */
public class AccessedTargetBlacklistFilter extends BaseFilter<Member> {
    private final BaseFilter<ConcreteClassifier> classifierFilter;

    public AccessedTargetBlacklistFilter(final BaseFilter<ConcreteClassifier> classifierFilter) {
        if (classifierFilter == null) {
            throw new IllegalArgumentException("Blacklistfilter must not be null");
        }
        this.classifierFilter = classifierFilter;
    }

    @Override
    public boolean passes(final Member access) {
        final tools.mdsd.jamopp.model.java.types.Type accessedClass = GetAccessedType.getAccessedType(access);
        if ((accessedClass == null) && !(accessedClass instanceof ConcreteClassifier)) {
            return false;
        }
        return classifierFilter.passes((ConcreteClassifier) accessedClass);
    }

    public BaseFilter<ConcreteClassifier> getClassifierFilter() {
        return classifierFilter;
    }
}
