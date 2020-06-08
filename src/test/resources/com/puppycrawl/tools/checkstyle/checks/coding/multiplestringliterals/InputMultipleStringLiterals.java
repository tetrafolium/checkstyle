package com.puppycrawl.tools.checkstyle.checks.coding.multiplestringliterals;

public class InputMultipleStringLiterals
{   /*string literals*/
    String m = "StringContents";
    String m1 = "SingleString";
    String m2 = "DoubleString" + "DoubleString";
    String m3 = "" + "";
    String m4 = "" + "";
    String debugStr = ", " + ", " + ", ";

    void method1() {
        
        System.identityHashCode("StringContents");
        // The following is not reported, since it is two string literals.
        
    }

    @SuppressWarnings("unchecked")
    void method2() { }

    @SuppressWarnings("unchecked")
    void method3() { }

    @SuppressWarnings("unchecked")
    void method4() { }

    @SuppressWarnings("unchecked")
    void method5() { }
}
