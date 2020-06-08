package org.checkstyle.suppressionxpathfilter.genericwhitespace;

import java.util.function.Consumer;

public class SuppressionXpathRegressionGenericWhitespaceStartTwo {
    public <E> void bad(final Consumer<E> consumer) { //warn
    }
    public <E> void good(final Consumer<E> consumer) {
    }
}
