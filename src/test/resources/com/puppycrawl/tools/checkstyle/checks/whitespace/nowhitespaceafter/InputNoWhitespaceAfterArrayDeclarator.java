package com.puppycrawl.tools.checkstyle.checks.whitespace.nowhitespaceafter;

import java.util.Map;
import java.util.stream.IntStream;

public class InputNoWhitespaceAfterArrayDeclarator {
    @SuppressWarnings("unchecked")
    Map.Entry<Integer, String>[] genEntries(final int n) {
        return IntStream.range(0, n)
            .mapToObj(i -> entry(i, valueFor(i)))
            .toArray(Map.Entry []::new);
    }

    static Map.Entry<Integer, String> entry(final int k, final String v) {
        return null;
    }

    static String valueFor(final int i) {
        return "abcdefghijklmnopqrst".substring(i, i + 1);
    }
}
