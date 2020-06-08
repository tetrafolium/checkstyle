package org.checkstyle.suppressionxpathfilter.hiddenfield;

public class SuppressionXpathRegressionHiddenFieldTwo {
    static int someField;
    static Object other = null;
    Object field = null;

    static void method(final Object field, final Object other) { //warn
    }
}
