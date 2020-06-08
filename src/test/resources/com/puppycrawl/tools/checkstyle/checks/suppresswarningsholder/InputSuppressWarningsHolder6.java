package com.puppycrawl.tools.checkstyle.checks.suppresswarningsholder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class InputSuppressWarningsHolder6 {
    public static void foo1(final Object str) {
        String myString = (@SuppressWarnings("TypecastParenPad") String) str;
    }

    @Target(ElementType.TYPE_USE)
    @interface SuppressWarnings {
        String value();
    }
}
