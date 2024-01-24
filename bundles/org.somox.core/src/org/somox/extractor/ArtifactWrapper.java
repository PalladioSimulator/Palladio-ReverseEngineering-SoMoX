package org.somox.extractor;

/**
 * A wrapper for a common Software artifact
 */
public interface ArtifactWrapper {

    /** Get the id of the wrapped artifact */
    String getId();

    /** Get the identifier for the extractor instance this artifact has come from */
    String getExtractorId();

    /** Get the wrapped software artifact */
    Object getArtefact();

}
