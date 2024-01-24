package org.somox.kdmhelper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.emftext.language.java.containers.CompilationUnit;
import org.somox.kdmhelper.metamodeladdition.Root;
import org.splevo.jamopp.extraction.JaMoPPSoftwareModelExtractor;

public class KDMReader {

    private final Root root;
    // Resource

    private final static Logger logger = Logger.getLogger(KDMReader.class.getName());

    public KDMReader() {
        root = new Root();
    }

    public Root getRoot() {
        return root;
    }

    /**
     * Load the specified projects into JaMoPP. If workspace is closed, i.e. we run
     * standalone assume the projects arrays is a path array and load the specific
     * paths into JaMoPP.
     *
     * @param projects
     * @throws IOException
     */
    public void loadProject(final String... projects) throws IOException {
        final JaMoPPSoftwareModelExtractor softwareModelExtractor = new JaMoPPSoftwareModelExtractor();
        final Path cacheFileDir = Paths.get(System.getProperty("java.io.tmpdir", "/tmp/"),
                "JaMoPPGeneratorJobCacheDirSoMoX");
        final boolean extractLayoutInformation = true;

        KDMReader.logger.trace("Start loading projects: " + Arrays.toString(projects));

        final List<File> sourceFolderPaths = new ArrayList<>();
        if (SoMoXUtil.isStandalone()) {
            for (final String projectPath : projects) {
                sourceFolderPaths.add(new File(projectPath));
            }
        } else {
            for (final String projectName : projects) {
                final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
                final IProject project = workspaceRoot.getProject(projectName);
                final IJavaProject javaProject = JavaCore.create(project);
                if (javaProject.exists()) {
                    sourceFolderPaths.add(project.getRawLocation().toFile());
                } else {
                    KDMReader.logger.warn(String
                            .format("Project %s is not a java project in this workspace. Ignoring it.", projectName));
                }
            }
        }
        softwareModelExtractor.extractSoftwareModelFromFolders(sourceFolderPaths, new NullProgressMonitor(),
                cacheFileDir.toString(), extractLayoutInformation);

        addModelsToRoot(softwareModelExtractor.getSourceResources());
        KDMReader.logger.trace("Finished reading projects.");
    }

    public void loadProject(final IProject... projects) throws IOException {
        final List<String> projectPaths = new ArrayList<>();
        for (final IProject project : projects) {
            projectPaths.add(project.getLocation().toString());
        }
        loadPathes();
    }

    private void loadPathes() {
        throw new RuntimeException("not implemented yet");
    }

    public void addModelsToRoot(final Collection<Resource> resources) {
        for (final Resource resource : resources) {
            root.addModels(getModelsFromResource(resource));
        }
    }

    private Collection<CompilationUnit> getModelsFromResource(final Resource resource) {
        final List<CompilationUnit> modelList = new ArrayList<>();
        for (final EObject obj : resource.getContents()) {
            if (obj instanceof final CompilationUnit model) {
                modelList.add(model);
            }
        }
        return modelList;
    }
}
