package org.checkstyle.suppressionxpathfilter.requirethis;

public class SuppressionXpathRegressionRequireThisTwo {
    void method1() {
        
    }

    void method2(int i) {
        method1(); //warn
    }
}
