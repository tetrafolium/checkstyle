package com.puppycrawl.tools.checkstyle.checks.design.hideutilityclassconstructor;

public class InputHideUtilityClassConstructorPrivate {
    private InputHideUtilityClassConstructorPrivate() { }

    private static int value = 0;
    public static void foo(final int val) {
        value = val; }
}
