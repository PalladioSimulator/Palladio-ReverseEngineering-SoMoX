/*
* generated by Xtext
*/
package org.somox.metrics.dsl;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class MetricDSLStandaloneSetup extends MetricDSLStandaloneSetupGenerated {

    public static void doSetup() {
        new MetricDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
    }
}
