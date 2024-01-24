package org.somox.configuration;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.somox.filter.BaseFilter;
import org.somox.filter.BlacklistFilter;
import org.somox.filter.ComposedFilter;
import org.somox.filter.tests.TestFileFilter;

/**
 * SoMoX’ central configuration.
 * <h4>attribute map</h4> This configuration has a bijective representation as
 * an <em>attribute map</em>. This is a {@code Map<String, Object>} containing
 * the class’ attribute key constants as keys and the configuration’s attributes
 * as values. The value’s type is the same as the corresponding setter’s return
 * type. A value of {@code null} is interpreted as “not defined” just like if
 * the map did not contain the key in question.
 * <p>
 * For a mapping of attribute constants to getters and setters, see their
 * documentation. An <em>attribute map</em> can be obtained by {@link #toMap()}
 * and be converted into a {@code SoMoXConfiguration} by
 * {@link #SoMoXConfiguration(Map)}.
 *
 * @author Unknown
 * @author Joshua Gleitze
 *
 */
public class SoMoXConfiguration extends AbstractMoxConfiguration {

    /**
     * attribute key for {@link #getAdditionalWildcards()} /
     * {@link #setAdditionalWildcards(String)}
     */
    public static final String BLACKLIST_CONFIGURATION_WILDCARDS_ADDITIONAL = "org.somox.metrics.wildcards.additional";
    /**
     * attribute key for {@link #getWildcardKey()} / {@link #setWildcardKey(String)}
     */
    public static final String SOMOX_ANALYZER_WILDCARD_KEY = "org.somox.metrics.wildcards";
    /**
     * attribute key for {@link #getExcludedPrefixesForNameResemblance()} /
     * {@link #setExcludedPrefixesForNameResemblance(String)}
     */
    public static final String SOMOX_EXCLUDED_PREFIXES = "org.somox.metrics.nameResemblance.excludedPrefixes";
    /**
     * attribute key for {@link #getExcludedSuffixesForNameResemblance()} /
     * {@link #setExcludedSuffixesForNameResemblance(String)}
     */
    public static final String SOMOX_EXCLUDED_SUFFIXES = "org.somox.metrics.nameResemblance.excludedSuffixes";
    /**
     * attribute key for {@link #getClusteringConfig()}.
     * {@code getClusteringComposeThresholdDecrement()} /
     * {@link #getClusteringConfig()}.
     * {@code setClusteringComposeThresholdDecrement(double)}
     */
    public static final String SOMOX_WEIGHT_CLUSTERING_THRESHOLD_DECREMENT_COMPOSE = "org.somox.clusteringThresholdDecrement.Compose";
    /**
     * attribute key for {@link #getClusteringConfig()}.
     * {@code getClusteringMergeThresholdDecrement()} /
     * {@link #getClusteringConfig()}.
     * {@code setClusteringMergeThresholdDecrement(double)}
     */
    public static final String SOMOX_WEIGHT_CLUSTERING_THRESHOLD_DECREMENT_MERGE = "org.somox.clusteringThresholdDecrement.Merge";
    /**
     * attribute key for {@link #getClusteringConfig()}.
     * {@code getMaxComposeClusteringThreshold()} / {@link #getClusteringConfig()}.
     * {@code setMaxComposeClusteringThreshold(double)}
     */
    public static final String SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MAX_COMPOSE = "org.somox.clusteringThresholdMax.Compose";
    /**
     * attribute key for {@link #getClusteringConfig()}.
     * {@code getMaxMergeClusteringThreshold()} / {@link #getClusteringConfig()}.
     * {@code setMaxMergeClusteringThreshold(double)}
     */
    public static final String SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MAX_MERGE = "org.somox.clusteringThresholdMax.Merge";
    /**
     * attribute key for {@link #getClusteringConfig()}.
     * {@code getMinComposeClusteringThreshold()} / {@link #getClusteringConfig()}.
     * {@code setMinComposeClusteringThreshold(double)}
     */
    public static final String SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MIN_COMPOSE = "org.somox.clusteringThresholdMin.Compose";
    /**
     * attribute key for {@link #getClusteringConfig()}.
     * {@code getMinMergeClusteringThreshold()} / {@link #getClusteringConfig()}.
     * {@code setMinMergeClusteringThreshold(double)}
     */
    public static final String SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MIN_MERGE = "org.somox.clusteringThresholdMin.Merge";
    /**
     * attribute key for {@link #getWeightDirectoryMapping()} /
     * {@link #setWeightDirectoryMapping(double)}
     */
    public static final String SOMOX_WEIGHT_DIRECTORY_MAPPING = "org.somox.directoryMapping.weightDirectoryMapping";
    /**
     * attribute key for {@link #getWeightDMS()} / {@link #setWeightDMS(double)}
     */
    public static final String SOMOX_WEIGHT_DMS = "org.somox.dms.weightDMS";
    /**
     * attribute key for {@link #getWeightHighCoupling()} /
     * {@link #setWeightHighCoupling(double)}
     */
    public static final String SOMOX_WEIGHT_HIGH_COUPLING = "org.somox.nameResemblance.weightHighCoupling";
    /**
     * attribute key for {@link #getWeightHighNameResemblance()} /
     * {@link #setWeightHighNameResemblance(double)}
     */
    public static final String SOMOX_WEIGHT_HIGH_NAME_RESEMBLANCE = "org.somox.nameResemblance.weightHighNameResemblance";
    /**
     * attribute key for {@link #getWeightHighSLAQ()} /
     * {@link #setWeightHighSLAQ(double)}
     */
    public static final String SOMOX_WEIGHT_HIGH_SLAQ = "org.somox.subsystemComponent.weightHighSLAQ";
    /**
     * attribute key for {@link #getWeightHighestNameResemblance()} /
     * {@link #setWeightHighestNameResemblance(double)}
     */
    public static final String SOMOX_WEIGHT_HIGHEST_NAME_RESEMBLANCE = "org.somox.nameResemblance.weightHighestNameResemblance";
    /**
     * attribute key for {@link #getWeightInterfaceViolationIrrelevant()} /
     * {@link #setWeightInterfaceViolationIrrelevant(double)}
     */
    public static final String SOMOX_WEIGHT_INTERFACE_VIOLATION_IRRELEVANT = "org.somox.interfaceViolation.weightInterfaceViolationIrrelevant";
    /**
     * attribute key for {@link #getWeightInterfaceViolationRelevant()} /
     * {@link #setWeightInterfaceViolationRelevant(double)}
     */
    public static final String SOMOX_WEIGHT_INTERFACE_VIOLATION_RELEVANT = "org.somox.interfaceViolation.weightInterfaceViolationRelevant";
    /**
     * attribute key for {@link #getWeightLowCoupling()} /
     * {@link #setWeightLowCoupling(double)}
     */
    public static final String SOMOX_WEIGHT_LOW_COUPLING = "org.somox.nameResemblance.weightLowCoupling";
    /**
     * attribute key for {@link #getWeightLowNameResemblance()} /
     * {@link #setWeightLowNameResemblance(double)}
     */
    public static final String SOMOX_WEIGHT_LOW_NAME_RESEMBLANCE = "org.somox.nameResemblance.weightLowNameResemblance";
    /**
     * attribute key for {@link #getWeightLowSLAQ()} /
     * {@link #setWeightLowSLAQ(double)}
     */
    public static final String SOMOX_WEIGHT_LOW_SLAQ = "org.somox.subsystemComponent.weightLowSLAQ";
    /**
     * attribute key for {@link #getWeightMidNameResemblance()} /
     * {@link #setWeightMidNameResemblance(double)}
     */
    public static final String SOMOX_WEIGHT_MID_NAME_RESEMBLANCE = "org.somox.nameResemblance.weightMidNameResemblance";
    /**
     * attribute key for {@link #getWeightPackageMapping()} /
     * {@link #setWeightPackageMapping(double)}
     */
    public static final String SOMOX_WEIGHT_PACKAGE_MAPPING = "org.somox.packageMapping.weightPackageMapping";
    public static final String SOMOX_WILDCARD_DELIMITER = "§";

    private String additionalWildcards = "";

    private final BlacklistFilter blacklistFilter = new BlacklistFilter();
    private final ComposedFilter<ConcreteClassifier> classifierFilter = new ComposedFilter<>(new TestFileFilter(),
            blacklistFilter);

    private final ClusteringConfiguration clusteringConfig = new ClusteringConfiguration();
    private String excludedPrefixesForNameResemblance = "";
    private String excludedSuffixesForNameResemblance = "";
    private double weightDirectoryMapping = 70;
    private double weightDMS = 5;
    private double weightHighCoupling = 15;
    private double weightHighestNameResemblance = 45;
    private double weightHighNameResemblance = 30;
    private double weightHighSLAQ = 22;
    private double weightInterfaceViolationIrrelevant = 10;
    private double weightInterfaceViolationRelevant = 40;
    private double weightLowCoupling = 0;
    private double weightLowNameResemblance = 5;
    private double weightLowSLAQ = 0;
    private double weightMidNameResemblance = 15;
    private double weightPackageMapping = 70;
    private String wildcardKey = "";

    /**
     * Creates a new SoMoX configuration initialized with default values.
     */
    public SoMoXConfiguration() {
        getFileLocations().setOutputFolder("/model");
        updateBlacklistFilter();
    }

    /**
     * Creates a new SoMoX configuration initialized with the {@code attributeMap}’s
     * values. Attributes not defined in the map will be set to their default
     * values.
     *
     * @param attributeMap An <em>attribute map</em>, as defined in the class
     *                     description. It does not need to contain all attributes.
     */
    public SoMoXConfiguration(final Map<String, Object> attributeMap) {
        this();
        applyAttributeMap(attributeMap);
    }

    /**
     * Sets the attributes specified in the {@code attributeMap} on this
     * configuration. Attributes not specified in the map will be left untouched.
     *
     * @param attributeMap An <em>attribute map</em>, as defined in the class
     *                     description. It does not need to contain all attributes.
     */
    @Override
    public void applyAttributeMap(final Map<String, Object> attributeMap) {
        if (attributeMap == null) {
            return;
        }
        super.applyAttributeMap(attributeMap);

        if (attributeMap.get(SoMoXConfiguration.SOMOX_ANALYZER_WILDCARD_KEY) != null) {
            setWildcardKey((String) attributeMap.get(SoMoXConfiguration.SOMOX_ANALYZER_WILDCARD_KEY));
        }

        if (attributeMap.get(SoMoXConfiguration.BLACKLIST_CONFIGURATION_WILDCARDS_ADDITIONAL) != null) {
            setAdditionalWildcards(
                    (String) attributeMap.get(SoMoXConfiguration.BLACKLIST_CONFIGURATION_WILDCARDS_ADDITIONAL));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_EXCLUDED_PREFIXES) != null) {
            setExcludedPrefixesForNameResemblance(
                    (String) attributeMap.get(SoMoXConfiguration.SOMOX_EXCLUDED_PREFIXES));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_EXCLUDED_SUFFIXES) != null) {
            setExcludedSuffixesForNameResemblance(
                    (String) attributeMap.get(SoMoXConfiguration.SOMOX_EXCLUDED_SUFFIXES));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_DIRECTORY_MAPPING) != null) {
            setWeightDirectoryMapping((Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_DIRECTORY_MAPPING));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_DMS) != null) {
            setWeightDMS((Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_DMS));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_COUPLING) != null) {
            setWeightHighCoupling((Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_COUPLING));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_HIGHEST_NAME_RESEMBLANCE) != null) {
            setWeightHighestNameResemblance(
                    (Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_HIGHEST_NAME_RESEMBLANCE));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_NAME_RESEMBLANCE) != null) {
            setWeightHighNameResemblance(
                    (Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_NAME_RESEMBLANCE));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_SLAQ) != null) {
            setWeightHighSLAQ((Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_SLAQ));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_INTERFACE_VIOLATION_IRRELEVANT) != null) {
            setWeightInterfaceViolationIrrelevant(
                    (Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_INTERFACE_VIOLATION_IRRELEVANT));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_INTERFACE_VIOLATION_RELEVANT) != null) {
            setWeightInterfaceViolationRelevant(
                    (Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_INTERFACE_VIOLATION_RELEVANT));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_LOW_COUPLING) != null) {
            setWeightLowCoupling((Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_LOW_COUPLING));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_LOW_NAME_RESEMBLANCE) != null) {
            setWeightLowNameResemblance(
                    (Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_LOW_NAME_RESEMBLANCE));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_LOW_SLAQ) != null) {
            setWeightLowSLAQ((Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_LOW_SLAQ));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_MID_NAME_RESEMBLANCE) != null) {
            setWeightMidNameResemblance(
                    (Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_MID_NAME_RESEMBLANCE));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_PACKAGE_MAPPING) != null) {
            setWeightPackageMapping((Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_PACKAGE_MAPPING));
        }

        final ClusteringConfiguration clusteringConfiguration = getClusteringConfig();
        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MAX_COMPOSE) != null) {
            clusteringConfiguration.setMaxComposeClusteringThreshold(
                    (Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MAX_COMPOSE));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MIN_COMPOSE) != null) {
            clusteringConfiguration.setMinComposeClusteringThreshold(
                    (Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MIN_COMPOSE));
        }
        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_DECREMENT_COMPOSE) != null) {
            clusteringConfiguration.setClusteringComposeThresholdDecrement(
                    (Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_DECREMENT_COMPOSE));
        }
        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MAX_MERGE) != null) {
            clusteringConfiguration.setMaxMergeClusteringThreshold(
                    (Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MAX_MERGE));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MIN_MERGE) != null) {
            clusteringConfiguration.setMinMergeClusteringThreshold(
                    (Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MIN_MERGE));
        }

        if (attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_DECREMENT_MERGE) != null) {
            clusteringConfiguration.setClusteringMergeThresholdDecrement(
                    (Double) attributeMap.get(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_DECREMENT_MERGE));
        }
    }

    public String getAdditionalWildcards() {
        return additionalWildcards;
    }

    /**
     * Create a new list of blacklist specifications
     *
     * @return A set of blacklist entries
     */
    public Set<String> getBlacklist() {
        final String wildcardString = wildcardKey;

        final StringTokenizer tokenizer = new StringTokenizer(wildcardString,
                SoMoXConfiguration.SOMOX_WILDCARD_DELIMITER);

        final Set<String> blacklist = new HashSet<>();
        while (tokenizer.hasMoreElements()) {
            blacklist.add(tokenizer.nextToken());
        }
        return blacklist;
    }

    /**
     * @return The filter to use when deciding which concrete classifiers to take
     *         into account. Includes the filters configured through
     *         {@link #setAdditionalWildcards(String)}.
     */
    public BaseFilter<ConcreteClassifier> getClassifierFilter() {
        return classifierFilter;
    }

    /**
     * @return the clusteringConfig
     */
    public ClusteringConfiguration getClusteringConfig() {
        return clusteringConfig;
    }

    @Override
    public String getErrorMessage() {
        return "An error in SoMoX occured";
    }

    public String getExcludedPrefixesForNameResemblance() {
        return excludedPrefixesForNameResemblance;
    }

    public String getExcludedSuffixesForNameResemblance() {
        return excludedSuffixesForNameResemblance;
    }

    public double getWeightDirectoryMapping() {
        return weightDirectoryMapping;
    }

    public double getWeightDMS() {
        return weightDMS;
    }

    public double getWeightHighCoupling() {
        return weightHighCoupling;
    }

    public double getWeightHighestNameResemblance() {
        return weightHighestNameResemblance;
    }

    public double getWeightHighNameResemblance() {
        return weightHighNameResemblance;
    }

    public double getWeightHighSLAQ() {
        return weightHighSLAQ;
    }

    public double getWeightInterfaceViolationIrrelevant() {
        return weightInterfaceViolationIrrelevant;
    }

    public double getWeightInterfaceViolationRelevant() {
        return weightInterfaceViolationRelevant;
    }

    public double getWeightLowCoupling() {
        return weightLowCoupling;
    }

    public double getWeightLowNameResemblance() {
        return weightLowNameResemblance;
    }

    public double getWeightLowSLAQ() {
        return weightLowSLAQ;
    }

    public double getWeightMidNameResemblance() {
        return weightMidNameResemblance;
    }

    public double getWeightPackageMapping() {
        return weightPackageMapping;
    }

    public String getWildcardKey() {
        return wildcardKey;
    }

    public void setAdditionalWildcards(final String additionalWildcards) {
        this.additionalWildcards = additionalWildcards;
        updateBlacklistFilter();
    }

    public void setExcludedPrefixesForNameResemblance(final String excludedPrefixesForNameResemblance) {
        this.excludedPrefixesForNameResemblance = excludedPrefixesForNameResemblance;
    }

    public void setExcludedSuffixesForNameResemblance(final String excludedSuffixesForNameResemblance) {
        this.excludedSuffixesForNameResemblance = excludedSuffixesForNameResemblance;
    }

    public void setWeightDirectoryMapping(final double weightDirectoryMapping) {
        this.weightDirectoryMapping = weightDirectoryMapping;
    }

    public void setWeightDMS(final double weightDMS) {
        this.weightDMS = weightDMS;
    }

    public void setWeightHighCoupling(final double weightHighCoupling) {
        this.weightHighCoupling = weightHighCoupling;
    }

    public void setWeightHighestNameResemblance(final double weightHighestNameResemblance) {
        this.weightHighestNameResemblance = weightHighestNameResemblance;
    }

    public void setWeightHighNameResemblance(final double weightHighNameResemblance) {
        this.weightHighNameResemblance = weightHighNameResemblance;
    }

    public void setWeightHighSLAQ(final double weightHighSLAQ) {
        this.weightHighSLAQ = weightHighSLAQ;
    }

    public void setWeightInterfaceViolationIrrelevant(final double weightInterfaceViolationIrrelevant) {
        this.weightInterfaceViolationIrrelevant = weightInterfaceViolationIrrelevant;
    }

    public void setWeightInterfaceViolationRelevant(final double weightInterfaceViolationRelevant) {
        this.weightInterfaceViolationRelevant = weightInterfaceViolationRelevant;
    }

    public void setWeightLowCoupling(final double weightLowCoupling) {
        this.weightLowCoupling = weightLowCoupling;
    }

    public void setWeightLowNameResemblance(final double weightLowNameResemblance) {
        this.weightLowNameResemblance = weightLowNameResemblance;
    }

    public void setWeightLowSLAQ(final double weightLowSLAQ) {
        this.weightLowSLAQ = weightLowSLAQ;
    }

    public void setWeightMidNameResemblance(final double weightMidNameResemblance) {
        this.weightMidNameResemblance = weightMidNameResemblance;
    }

    public void setWeightPackageMapping(final double weightPackageMapping) {
        this.weightPackageMapping = weightPackageMapping;
    }

    public void setWildcardKey(final String wildcardKey) {
        this.wildcardKey = wildcardKey;
    }

    /**
     * Converts this configuration into an <em>attribute map</em>.
     *
     * @return an <em>attribute map</em>, such that for any
     *         {@code SoMoXConfiguration c},
     *         {@code new SoMoXConfiguration(c.toMap())} will behave exactly like
     *         {@code c}.
     */
    @Override
    public Map<String, Object> toMap() {
        final Map<String, Object> result = super.toMap();

        result.put(SoMoXConfiguration.SOMOX_ANALYZER_WILDCARD_KEY, getWildcardKey());
        result.put(SoMoXConfiguration.BLACKLIST_CONFIGURATION_WILDCARDS_ADDITIONAL, getAdditionalWildcards());
        result.put(SoMoXConfiguration.SOMOX_EXCLUDED_PREFIXES, getExcludedPrefixesForNameResemblance());
        result.put(SoMoXConfiguration.SOMOX_EXCLUDED_SUFFIXES, getExcludedSuffixesForNameResemblance());

        result.put(SoMoXConfiguration.SOMOX_WEIGHT_DIRECTORY_MAPPING, getWeightDirectoryMapping());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_DMS, getWeightDMS());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_COUPLING, getWeightHighCoupling());

        result.put(SoMoXConfiguration.SOMOX_WEIGHT_HIGHEST_NAME_RESEMBLANCE, getWeightHighestNameResemblance());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_NAME_RESEMBLANCE, getWeightHighNameResemblance());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_HIGH_SLAQ, getWeightHighSLAQ());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_INTERFACE_VIOLATION_IRRELEVANT,
                getWeightInterfaceViolationIrrelevant());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_INTERFACE_VIOLATION_RELEVANT, getWeightInterfaceViolationRelevant());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_LOW_COUPLING, getWeightLowCoupling());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_LOW_NAME_RESEMBLANCE, getWeightLowNameResemblance());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_LOW_SLAQ, getWeightLowSLAQ());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_MID_NAME_RESEMBLANCE, getWeightMidNameResemblance());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_PACKAGE_MAPPING, getWeightPackageMapping());

        final ClusteringConfiguration clusteringConfiguration = getClusteringConfig();
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MAX_COMPOSE,
                clusteringConfiguration.getMaxComposeClusteringThreshold());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MIN_COMPOSE,
                clusteringConfiguration.getMinComposeClusteringThreshold());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_DECREMENT_COMPOSE,
                clusteringConfiguration.getClusteringComposeThresholdDecrement());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MAX_MERGE,
                clusteringConfiguration.getMaxMergeClusteringThreshold());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_MIN_MERGE,
                clusteringConfiguration.getMinMergeClusteringThreshold());
        result.put(SoMoXConfiguration.SOMOX_WEIGHT_CLUSTERING_THRESHOLD_DECREMENT_MERGE,
                clusteringConfiguration.getClusteringMergeThresholdDecrement());

        return result;
    }

    private void updateBlacklistFilter() {
        final Set<String> wildCardList = getBlacklist();
        if ((additionalWildcards != null) && (additionalWildcards.length() > 0)) {
            wildCardList.add(additionalWildcards);
        }
        blacklistFilter.setBlacklist(wildCardList);
    }

}
