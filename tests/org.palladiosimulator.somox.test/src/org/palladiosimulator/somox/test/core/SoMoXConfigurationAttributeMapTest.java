package org.palladiosimulator.somox.test.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

import org.junit.Test;
import org.somox.configuration.AbstractMoxConfiguration;
import org.somox.configuration.SoMoXConfiguration;

/**
 * Asserts correct behavior of
 * {@link SoMoXConfiguration#SoMoXConfiguration(java.util.Map)},
 * {@link SoMoXConfiguration#toMap()} and
 * {@link SoMoXConfiguration#applyAttributeMap(java.util.Map)}. The behavior of
 * a {@link SoMoXConfiguration} is compared by recursively comparing getter
 * return values.
 *
 * @author Joshua Gleitze
 */
public class SoMoXConfigurationAttributeMapTest {
    /**
     * maps attribute keys to setters. Setters can be executed by providing the
     * instance and the value to set to the {@link BiConsumer}.
     */
    private static final Map<String, BiConsumer<SoMoXConfiguration, Object>> SETTERS = getKeyToSettersMapping();

    /**
     * {@link Supplier}s for values for all attribute keys.
     */
    private static final Map<String, Supplier<Object>> VALUE_SUPPLIERS = getValueSuppliers();

    /**
     * Asserts that converting the default {@link SoMoXConfiguration} into an
     * attribute map and back does not change its behavior.
     */
    @Test
    public void testEqualityWithDefaultValues() {
        final SoMoXConfiguration defaultConfiguration = new SoMoXConfiguration();
        final Map<String, Object> attributeMap = defaultConfiguration.toMap();
        SoMoXConfiguration afterConversion = new SoMoXConfiguration(attributeMap);
        // assertThat("The default configuration is changed on conversion!",
        // afterConversion,
        // behavesLike(defaultConfiguration));

        afterConversion = new SoMoXConfiguration();
        afterConversion.applyAttributeMap(attributeMap);
        // assertThat("The default configuration is changed on conversion!",
        // afterConversion,
        // behavesLike(defaultConfiguration));
    }

    /**
     * Asserts that setting values through setters or through an attribute map has
     * the same effect for various combinations of attributes.
     */
    @Test
    public void testEquivalenceOfSetterAndAttributeValue() {
        final Set<String> allKeys = SETTERS.keySet();
        final Set<Set<String>> attributeKeySetsToCheck = new HashSet<>();

        // all attributes
        attributeKeySetsToCheck.add(allKeys);
        // each single attribute
        for (final String attributeKey : allKeys) {
            attributeKeySetsToCheck.add(new HashSet<>(Arrays.asList(attributeKey)));
        }
        // no attributes
        attributeKeySetsToCheck.add(new HashSet<>());

        // 10 random combinations
        final int minCount = 2;
        final String[] allKeysArray = allKeys.toArray(new String[allKeys.size()]);
        for (int i = 0; i < 10; i++) {
            final int numberOfElements = Math.round(((float) Math.random() * (allKeys.size() - minCount)) + minCount);
            final Set<String> nextSet = new HashSet<>(numberOfElements);
            for (int j = 0; j < numberOfElements; j++) {
                final int nextElementIndex = Math.round((float) Math.random() * (allKeys.size() - 1));
                nextSet.add(allKeysArray[nextElementIndex]);
            }
            attributeKeySetsToCheck.add(nextSet);
        }

        // for each prepared set of attribut keys: get correct values from the suppliers
        // and use them to set
        for (final Set<String> keySet : attributeKeySetsToCheck) {
            final SoMoXConfiguration settersConfiguration = new SoMoXConfiguration();
            final Map<String, Object> attributeMap = new HashMap<>();

            for (final String attributeKey : keySet) {
                final Object attributeValue = VALUE_SUPPLIERS.get(attributeKey).get();
                attributeMap.put(attributeKey, attributeValue);
                SETTERS.get(attributeKey).accept(settersConfiguration, attributeValue);
            }

            SoMoXConfiguration mapGeneratedConfiguration = new SoMoXConfiguration(attributeMap);
            // assertThat(
            // "The configuration generated by an attribute map doesn’t behave like the one
            // generated with setters",
            // mapGeneratedConfiguration, behavesLike(settersConfiguration));

            mapGeneratedConfiguration = new SoMoXConfiguration();
            mapGeneratedConfiguration.applyAttributeMap(attributeMap);
            // assertThat(
            // "The configuration generated by an attribute map doesn’t behave like the one
            // generated with setters",
            // mapGeneratedConfiguration, behavesLike(settersConfiguration));
        }
    }

    /**
     * @return suppliers for all attributes
     */
    private static Map<String, Supplier<Object>> getValueSuppliers() {
        final Map<String, Supplier<Object>> valueSuppliers = new HashMap<>();
        final Supplier<Object> stringSupplier = () -> UUID.randomUUID().toString();
        final Supplier<Object> booleanSupplier = () -> (Math.random() < 0.5);
        final Supplier<Object> double100Supplier = () -> (Math.random() * 100);
        final Supplier<Object> double1Supplier = Math::random;
        valueSuppliers.put(SoMoXConfiguration.BLACKLIST_CONFIGURATION_WILDCARDS_ADDITIONAL, stringSupplier);
        valueSuppliers.put(AbstractMoxConfiguration.SOMOX_ANALYZER_INPUT_FILE, stringSupplier);
        valueSuppliers.put(
                AbstractMoxConfiguration.SOMOX_ANALYZER_REVERSE_ENGINEER_INTERFACES_NOT_ASSIGNED_TO_INTERFACES,
                booleanSupplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_ANALYZER_WILDCARD_KEY, stringSupplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_EXCLUDED_PREFIXES, stringSupplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_EXCLUDED_SUFFIXES, stringSupplier);
        valueSuppliers.put(AbstractMoxConfiguration.SOMOX_OUTPUT_FOLDER, stringSupplier);
        valueSuppliers.put(AbstractMoxConfiguration.SOMOX_PROJECT_NAME, stringSupplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_DECREMENT_COMPOSE, double1Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_DECREMENT_MERGE, double1Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MAX_COMPOSE, double1Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MAX_MERGE, double1Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MIN_COMPOSE, double1Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MIN_MERGE, double1Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_DIRECTORY_MAPPING, double1Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_DMS, double100Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_COUPLING, double100Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_NAME_RESEMBLANCE, double100Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_SLAQ, double100Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_HIGHEST_NAME_RESEMBLANCE, double100Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_INTERFACE_VIOLATION_IRRELEVANT, double100Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_INTERFACE_VIOLATION_RELEVANT, double100Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_LOW_COUPLING, double100Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_LOW_NAME_RESEMBLANCE, double100Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_LOW_SLAQ, double100Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_MID_NAME_RESEMBLANCE, double100Supplier);
        valueSuppliers.put(SoMoXConfiguration.SOMOX_WEIGHT_PACKAGE_MAPPING, double100Supplier);

        return valueSuppliers;
    }

    /**
     * @return a mapping from attribute keys to setters
     */
    private static Map<String, BiConsumer<SoMoXConfiguration, Object>> getKeyToSettersMapping() {
        final Map<String, BiConsumer<SoMoXConfiguration, Object>> keysToSetters = new HashMap<>();

        keysToSetters.put(SoMoXConfiguration.BLACKLIST_CONFIGURATION_WILDCARDS_ADDITIONAL,
                (final SoMoXConfiguration c, final Object s) -> {
                    c.setAdditionalWildcards((String) s);
                });
        keysToSetters.put(
                AbstractMoxConfiguration.SOMOX_ANALYZER_REVERSE_ENGINEER_INTERFACES_NOT_ASSIGNED_TO_INTERFACES,
                (final SoMoXConfiguration c, final Object b) -> {
                    c.setReverseEngineerInterfacesNotAssignedToComponent((Boolean) b);
                });
        keysToSetters.put(AbstractMoxConfiguration.SOMOX_ANALYZER_INPUT_FILE,
                (final SoMoXConfiguration c, final Object s) -> {
                    c.getFileLocations().setAnalyserInputFile((String) s);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_ANALYZER_WILDCARD_KEY,
                (final SoMoXConfiguration c, final Object s) -> {
                    c.setWildcardKey((String) s);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_EXCLUDED_PREFIXES, (final SoMoXConfiguration c, final Object s) -> {
            c.setExcludedPrefixesForNameResemblance((String) s);
        });
        keysToSetters.put(SoMoXConfiguration.SOMOX_EXCLUDED_SUFFIXES, (final SoMoXConfiguration c, final Object s) -> {
            c.setExcludedSuffixesForNameResemblance((String) s);
        });
        keysToSetters.put(AbstractMoxConfiguration.SOMOX_OUTPUT_FOLDER,
                (final SoMoXConfiguration c, final Object s) -> {
                    c.getFileLocations().setOutputFolder((String) s);
                });
        keysToSetters.put(AbstractMoxConfiguration.SOMOX_PROJECT_NAME, (final SoMoXConfiguration c, final Object s) -> {
            c.getFileLocations().setProjectNames(Set.of((String) s));
        });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_DECREMENT_COMPOSE,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.getClusteringConfig().setClusteringComposeThresholdDecrement((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_DECREMENT_MERGE,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.getClusteringConfig().setClusteringMergeThresholdDecrement((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MAX_COMPOSE,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.getClusteringConfig().setMaxComposeClusteringThreshold((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MAX_MERGE,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.getClusteringConfig().setMaxMergeClusteringThreshold((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MIN_COMPOSE,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.getClusteringConfig().setMinComposeClusteringThreshold((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MIN_MERGE,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.getClusteringConfig().setMinMergeClusteringThreshold((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_DIRECTORY_MAPPING,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.setWeightDirectoryMapping((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_DMS, (final SoMoXConfiguration c, final Object d) -> {
            c.setWeightDMS((Double) d);
        });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_COUPLING,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.setWeightHighCoupling((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_NAME_RESEMBLANCE,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.setWeightHighNameResemblance((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_SLAQ, (final SoMoXConfiguration c, final Object d) -> {
            c.setWeightHighSLAQ((Double) d);
        });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_HIGHEST_NAME_RESEMBLANCE,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.setWeightHighestNameResemblance((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_INTERFACE_VIOLATION_IRRELEVANT,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.setWeightInterfaceViolationIrrelevant((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_INTERFACE_VIOLATION_RELEVANT,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.setWeightInterfaceViolationRelevant((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_LOW_COUPLING,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.setWeightLowCoupling((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_LOW_NAME_RESEMBLANCE,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.setWeightLowNameResemblance((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_LOW_SLAQ, (final SoMoXConfiguration c, final Object d) -> {
            c.setWeightLowSLAQ((Double) d);
        });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_MID_NAME_RESEMBLANCE,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.setWeightMidNameResemblance((Double) d);
                });
        keysToSetters.put(SoMoXConfiguration.SOMOX_WEIGHT_PACKAGE_MAPPING,
                (final SoMoXConfiguration c, final Object d) -> {
                    c.setWeightPackageMapping((Double) d);
                });

        return keysToSetters;
    }
}
