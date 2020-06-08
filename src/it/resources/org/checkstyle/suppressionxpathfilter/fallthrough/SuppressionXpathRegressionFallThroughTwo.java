package org.checkstyle.suppressionxpathfilter.fallthrough;

public class SuppressionXpathRegressionFallThroughTwo {
    void methodFallThruCustomWords(final int i, final int j, final boolean cond) {
        while (true) {
            switch (i) {
                case 0:
                    i++;
                    break;
                default: //warn
                    i++;
            }
        }
    }
}
