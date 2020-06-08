package com.puppycrawl.tools.checkstyle.checks.whitespace.whitespacearound;

public class InputWhitespaceAroundDoWhile {

    public void doWhileTest(final int n) {
        int k = 0;
        do {
            ++k;
        } while (k < n);
    }
}
