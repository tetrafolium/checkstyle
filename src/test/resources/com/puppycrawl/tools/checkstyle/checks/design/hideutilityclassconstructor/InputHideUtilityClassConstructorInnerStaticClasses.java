package com.puppycrawl.tools.checkstyle.checks.design.hideutilityclassconstructor;

public class InputHideUtilityClassConstructorInnerStaticClasses {
    
    public static void foo(final int val) {
        value = val; }

    public static class Inner {
        public int foo;
    }

    public static class Inner2 {
        public static int foo;
    }
}
