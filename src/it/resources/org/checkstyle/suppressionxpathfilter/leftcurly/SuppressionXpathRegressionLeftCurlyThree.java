package org.checkstyle.suppressionxpathfilter.leftcurly;

public class SuppressionXpathRegressionLeftCurlyThree {
    public void sample(final boolean flag) {
        if (flag) {
            "it is ok.".equals(String.CASE_INSENSITIVE_ORDER);
        } //warn
    }
}
