package org.somox.filter;

import java.util.Set;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.somox.kdmhelper.KDMHelper;

import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;
import tools.mdsd.jamopp.model.java.commons.Commentable;
import tools.mdsd.jamopp.model.java.members.ClassMethod;
import tools.mdsd.jamopp.model.java.members.Field;
import tools.mdsd.jamopp.model.java.members.InterfaceMethod;
import tools.mdsd.jamopp.model.java.members.Member;
import tools.mdsd.jamopp.model.java.types.Type;

public class BlacklistFilter extends BaseFilter<ConcreteClassifier> {

    private static Logger logger = Logger.getLogger(BlacklistFilter.class);

    private Pattern matchPattern = null;

    public BlacklistFilter() {
        matchPattern = Pattern.compile(".*");
    }

    public BlacklistFilter(final Set<String> blacklist) {
        setBlacklist(blacklist);
    }

    public void setBlacklist(final Set<String> blacklist) {
        matchPattern = deriveMatchPattern(blacklist);
    }

    @Override
    public boolean passes(final ConcreteClassifier object) {
        return !classMatchesBlacklist(object);
    }

    /**
     * Compile a sinlge {@link Pattern} containing all elements of the blacklist
     *
     * @param blacklist The list of blacklist patterns
     * @return A corresponding {@link Pattern} used to match component FQNs
     */
    private static Pattern deriveMatchPattern(final Set<String> blacklist) {
        final StringBuilder sw = new StringBuilder();
        for (final String s : blacklist) {
            sw.append(s);
            sw.append("|");
        }
        if (sw.length() > 0) {
            sw.deleteCharAt(sw.length() - 1);
        }
        final Pattern matchPattern = Pattern.compile(sw.toString(), Pattern.CASE_INSENSITIVE);

        logger.debug("Initialised Blacklist filter with pattern " + matchPattern.toString());

        return matchPattern;
    }

    /**
     * Uses Regular Expressions to match FQNs of components
     *
     * @param matchPattern The pattern to match against
     * @param currentClass The class of the component
     * @return true if the FQN of the class matches the given pattern
     */
    private boolean classMatchesBlacklist(final Type currentClass) {

        // use the full qualified name of the container
        // which is either a package or a class(in case of an inner class)
        // anyway, both are ASTNodes
        EObject container = currentClass.eContainer();
        if ((container instanceof Member) && ((container instanceof ClassMethod) || (container instanceof Field)
                || (container instanceof InterfaceMethod))) {
            container = container.eContainer();
        }
        final String fqn = KDMHelper.computeFullQualifiedName((Commentable) container);
        final boolean result = matchPattern.matcher(fqn).matches();
        if (logger.isTraceEnabled()) {
            logger.trace("Blacklist filter matches " + fqn + ": " + result);
        }
        return result;
    }

}
