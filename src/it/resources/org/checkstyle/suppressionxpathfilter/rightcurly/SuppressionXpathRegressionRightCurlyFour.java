package org.checkstyle.suppressionxpathfilter.rightcurly;

public class SuppressionXpathRegressionRightCurlyFour {
    public void sample(final boolean flag) {
        if (flag) {
            System.identityHashCode("heh");
            flag = !flag;
        }
        String.CASE_INSENSITIVE_ORDER.//warn
                equals("Xe-xe");
    }
}
