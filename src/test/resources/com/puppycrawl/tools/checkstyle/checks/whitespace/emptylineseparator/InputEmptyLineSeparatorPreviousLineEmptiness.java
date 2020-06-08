package com.puppycrawl.tools.checkstyle.checks.whitespace.emptylineseparator;

public class InputEmptyLineSeparatorPreviousLineEmptiness {
    private static final int MULTIPLICATOR;

    private int base;

    static {
        MULTIPLICATOR = 5;


    }

    {


        base = 33;
    }

    public InputEmptyLineSeparatorPreviousLineEmptiness(final int base) {


        this.base = base;
    }

    public InputEmptyLineSeparatorPreviousLineEmptiness() {
    }

    public static int increment(final int value) {


        return value * MULTIPLICATOR + 1;
    }
}
