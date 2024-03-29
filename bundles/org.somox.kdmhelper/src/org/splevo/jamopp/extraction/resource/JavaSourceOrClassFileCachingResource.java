/*******************************************************************************
 * Copyright (c) 2014
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Benjamin Klatt - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.splevo.jamopp.extraction.resource;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.splevo.jamopp.extraction.cache.ReferenceCache;

import com.google.common.base.Strings;

import tools.mdsd.jamopp.resource.JavaResource2;

/***
 * JaMoPP java resource using an internal cache for reference resolving.
 *
 * As long as the cache is not explicitly triggered to resolve a resource,
 * proxies will be resolved when required only.
 */
public class JavaSourceOrClassFileCachingResource extends JavaResource2 implements CachingResource {

    @SuppressWarnings("unused")
    private static Logger logger = Logger.getLogger(JavaSourceOrClassFileCachingResource.class);

    /** The reference cache to resolve proxies. */
    private ReferenceCache referenceCache;

    /**
     * Constructor to set the reference cache the resource should use for resolving.
     *
     * @param uri            The URI identifying this resource.
     * @param referenceCache The reference cache to use. If null is provided no
     *                       cache is used.
     */
    public JavaSourceOrClassFileCachingResource(final URI uri, final ReferenceCache referenceCache) {
        super(uri);
        this.referenceCache = referenceCache;
    }

    @Override
    public EObject getEObject(final String id) {

        // without a cache trigger default behavior.
        // resource internal ids must be picked up directly to prevent loops
        if ((referenceCache == null) || Strings.isNullOrEmpty(id) || (id.charAt(0) == '/')) {
            return super.getEObject(id);
        }

        EObject resolvedEObject = referenceCache.getEObject(this, id);
        if (resolvedEObject == null) {
            resolvedEObject = super.getEObject(id);
            if (resolvedEObject != null) {
                referenceCache.registerEObject(this, id, resolvedEObject);
            }
        }
        return resolvedEObject;
    }

    @Override
    public void disableCaching() {
        if (referenceCache != null) {
            referenceCache.blacklist(this);
            referenceCache = null;
        }
    }

}
