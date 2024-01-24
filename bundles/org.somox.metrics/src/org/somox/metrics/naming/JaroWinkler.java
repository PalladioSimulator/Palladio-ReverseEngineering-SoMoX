package org.somox.metrics.naming;

/**
 * The Jaro–Winkler similarity is a string metric measuring an edit distance
 * between two sequences.
 */
public class JaroWinkler {

    private static String commonChars(final String s, final String t, final int half) {
        final var common = new StringBuilder();
        final var copy = new StringBuilder(t);
        for (var i = 0; i < s.length(); i++) {
            final var ch = s.charAt(i);
            var foundIt = false;
            for (var j = Math.max(0, i - half); !foundIt && (j < Math.min(i + half + 1, t.length())); j++) {
                if (copy.charAt(j) == ch) {
                    foundIt = true;
                    common.append(ch);
                    copy.setCharAt(j, '*');
                }
            }
        }
        return common.toString();
    }

    private static int commonPrefixLength(final int max, final String s, final String t) {
        final var n = Math.min(max, Math.min(s.length(), t.length()));
        for (var i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return i;
            }
        }
        return n;
    }

    /**
     * The higher the Jaro–Winkler distance for two strings is, the less similar the
     * strings are. The score is normalized such that 0 means an exact match and 1
     * means there is no similarity. The original paper actually defined the metric
     * in terms of similarity, so the distance is defined as the inversion of that
     * value (distance = 1 − similarity).
     *
     * @param s the first given string
     * @param t the second given string
     * @return the distance between s and t
     */
    public static double distance(final String s, final String t) {
        final var distance = innerDistance(s, t);
        final var prefixLength = commonPrefixLength(4, s, t);
        return distance + (prefixLength * 0.1 * (1 - distance));
    }

    private static int getHalf(final String s, final String t) {
        return s.length() > t.length() ? (t.length() / 2) + 1 : (s.length() / 2) + 1;
    }

    private static double innerDistance(final String s, final String t) {
        final var halflen = getHalf(s, t);
        final var commonS = commonChars(s, t, halflen);
        final var commonT = commonChars(t, s, halflen);
        if ((commonS.length() != commonT.length()) || (commonS.length() == 0) || (commonT.length() == 0)) {
            return 0;
        }
        final var transpositions = transpositions(commonS, commonT);
        return ((commonS.length() / (double) s.length()) + (commonT.length() / (double) t.length())
                + ((commonS.length() - transpositions) / (double) commonS.length())) / 3.0;
    }

    private static int transpositions(final String s, final String t) {
        var transpositions = 0;
        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                transpositions++;
            }
        }
        transpositions /= 2;
        return transpositions;
    }
}
