package org.somox.analyzer.simplemodelanalyzer.detection;

import java.util.ArrayList;
import java.util.List;

import org.somox.analyzer.simplemodelanalyzer.builder.ComponentBuilder;
import org.somox.configuration.SoMoXConfiguration;
import org.somox.filter.ComposedFilter;
import org.somox.filter.EClassBasedFilter;
import org.somox.kdmhelper.KDMHelper;
import org.somox.kdmhelper.metamodeladdition.Root;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;

import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;

/**
 * Initialization class which only lists a filtered set of classes which
 * potentially can become a component. Does NOT create a SAMM primitive
 * components only the component link of the source code decorator.
 *
 * @author Klaus Krogmann
 *
 */
public class NoGastClassToPrimitiveComponentInitializationStrategy extends AbstractInitializationStrategy {

    /**
     * Only creates a component link for GAST classes and the set of all inner,
     * i.e., nested, classes Real structs, unions and enumerations are omitted. Does
     * not create a SAMM primitive component
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<ComponentImplementingClassesLink> createInitialComponentCandidates(final Root root,
            final SoMoXConfiguration config, final ComponentBuilder builder) {
        final List<ComponentImplementingClassesLink> result = new ArrayList<>();
        final List<ConcreteClassifier> classList = root.getNormalClasses();

        final ComposedFilter<ConcreteClassifier> gastClassFilter = new ComposedFilter<>(config.getClassifierFilter(),
                new EClassBasedFilter<ConcreteClassifier>(KDMHelper.getNewEClassEnumeration()), // TODO
                                                                                                // SOMOXTODOCHANGE
                // typesPackage.eINSTANCE.getGASTUnion()),//SOMOXTODOCHANGE
                primitiveClassesFilter, improperStructFilter, dataObjectFilter, unknownClassTypeFilter);

        for (final ConcreteClassifier clazz : gastClassFilter.filter(classList)) {
            // Attention: does only create the component links but not the SAMM primitive
            // component:
            final ComponentImplementingClassesLink newPrimitiveComponent = builder
                    .createComponentLinkFromGASTClass(clazz);
            result.add(newPrimitiveComponent);
        }

        return result;
    }
}
