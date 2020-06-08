package org.checkstyle.suppressionxpathfilter.genericwhitespace;


public class SuppressionXpathRegressionGenericWhitespaceNestedGenericsThree {
    <E extends Enum<E>, X> void bad() { //warn
    }
    <E extends Enum<E>, X> void good() {
    }
}
