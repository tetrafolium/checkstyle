package org.checkstyle.suppressionxpathfilter.genericwhitespace;


public class SuppressionXpathRegressionGenericWhitespaceSingleGenericTwo {
    <E> void bad() { //warn
    }
    <E> void good() {
    }
}
