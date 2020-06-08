package org.checkstyle.suppressionxpathfilter.rightcurly;

public class SuppressionXpathRegressionRightCurlyThree {
    public void sample(final boolean flag) {
        if (flag) {
            String.CASE_INSENSITIVE_ORDER.equals("it is ok.");
        } //warn
    }
}
