package org.checkstyle.suppressionxpathfilter.avoidinlineconditionals;

public class SuppressionXpathRegressionAvoidInlineConditionalsVariableDef {
    String substring(final String a) {
        String b = (a == null || a.length() < 1) ? null : a.substring(1); // warn
        return b;
    }
}
