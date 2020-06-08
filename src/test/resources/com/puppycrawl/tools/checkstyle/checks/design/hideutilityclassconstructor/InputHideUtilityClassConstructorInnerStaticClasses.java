package com.puppycrawl.tools.checkstyle.checks.design.hideutilityclassconstructor;

public class InputHideUtilityClassConstructorInnerStaticClasses {
    private static int value = 0;
    public static void foo(final int val) {
        value = val; }

    public static class Inner {
        public int foo;
    }

    public static class Inner2 {
        public static int foo;
    }
}
