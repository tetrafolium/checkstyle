package org.checkstyle.suppressionxpathfilter.avoidinlineconditionals;

public class SuppressionXpathRegressionAvoidInlineConditionalsAssert {

    void assertA(final String a) {
        // JLS §14.10 - The assert Statement
        // assert Expression1 : Expression2
        assert (a == null) ? true : false : "Expression2"; // warn
    }
}
