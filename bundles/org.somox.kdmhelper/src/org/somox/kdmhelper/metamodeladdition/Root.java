package org.somox.kdmhelper.metamodeladdition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.somox.kdmhelper.KDMHelper;

import tools.mdsd.jamopp.model.java.classifiers.Class;
import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;
import tools.mdsd.jamopp.model.java.classifiers.Enumeration;
import tools.mdsd.jamopp.model.java.commons.Commentable;
import tools.mdsd.jamopp.model.java.containers.CompilationUnit;

public class Root {

    private final List<CompilationUnit> models = new ArrayList<>();

    public List<CompilationUnit> getCompilationUnits() {
        return models;
    }

    public void addModels(final Collection<CompilationUnit> modelsFromResource) {
        models.addAll(modelsFromResource);
        addPackagesToIDMapping(modelsFromResource);
    }

    private static HashMap<Commentable, String> nodeToIDMap = new HashMap<>();

    // TODO test
    public static String getIdForPackage(final Commentable pack) {
        if (nodeToIDMap.containsKey(pack)) {
            return nodeToIDMap.get(pack);
        }
        return null;
    }

    private void addPackagesToIDMapping(final Collection<CompilationUnit> modelsFromResource) {
        for (final CompilationUnit model : modelsFromResource) {
            for (final Iterator<EObject> it = model.eAllContents(); it.hasNext();) {
                final EObject element = it.next();
                if ((element instanceof Package) && !nodeToIDMap.containsKey(element)) {
                    nodeToIDMap.put((Commentable) element, EcoreUtil.generateUUID());
                }
            }
        }
    }

    // TODO fix for UI
    @SuppressWarnings("unchecked")
    public Collection<Package> getPackages() {
        final Collection<Package> result = new ArrayList<>();
        for (final CompilationUnit model : models) {
            // (Collection<? extends Package>) added
            result.addAll((Collection<? extends Package>) model.eResource().getAllContents());// getOwnedElements
            // for (Iterator<EObject> it = model.eAllContents(); it.hasNext();) {
            // EObject element = it.next();
            // if (element instanceof Package) {
            // result.add((Package) element);
            // }
            // }
        }
        return result;
    }

    /**
     * Returns ClassDeclaration, EnumDeclaration
     *
     * @return
     */
    public List<ConcreteClassifier> getNormalClasses() {
        final List<ConcreteClassifier> result = new ArrayList<>();
        for (final CompilationUnit model : models) {
            for (final Iterator<EObject> it = model.eAllContents(); it.hasNext();) {
                final EObject element = it.next();
                if (element instanceof final Class clazz) {
                    if (!KDMHelper.isInnerClass(clazz)) {
                        result.add((Class) element);
                    }
                } else if (element instanceof Enumeration) {
                    result.add((ConcreteClassifier) element);
                }
            }
        }
        return result;
    }
}