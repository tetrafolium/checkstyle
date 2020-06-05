package org.checkstyle.suppressionxpathfilter.nestedifdepth;

public class SuppressionXpathRegressionNestedIfDepth {
    public void test() {
        int a = 1;
        int b = 2;
        int c = 3;
        if (a > b && c > b && c > a) { //warn

        }
    }
}
