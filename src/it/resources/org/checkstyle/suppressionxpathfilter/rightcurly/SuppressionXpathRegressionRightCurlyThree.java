package org.checkstyle.suppressionxpathfilter.rightcurly;

public class SuppressionXpathRegressionRightCurlyThree {
    public void sample(boolean flag) {
        if (flag) { "it is ok.".equals(String.CASE_INSENSITIVE_ORDER); } //warn
    }
}
