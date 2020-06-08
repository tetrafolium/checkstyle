package org.checkstyle.suppressionxpathfilter.emptyforinitializerpad;

public class SuppressionXpathRegressionEmptyForInitializerPadNotPreceded {
    void method(final int bad, final int good) {
        for (; bad < 1; bad++) { //warn
        }
        for ( ; good < 2; good++) {
        }
    }
}
