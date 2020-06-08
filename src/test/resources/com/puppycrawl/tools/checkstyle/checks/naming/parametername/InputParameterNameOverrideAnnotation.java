package com.puppycrawl.tools.checkstyle.checks.naming.parametername;

public class InputParameterNameOverrideAnnotation {

    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }

    @SuppressWarnings("")
    public void foo(final Object object) {

    }

    public void foo2(final Integer aaaa) { }

    void foo3() { } // No NPE here!

    void foo4(final int abc, final int bd) { } // No NPE here!

    int foo5(final int abc) {
        return 1; } // No NPE here!

    private int field;
    private java.util.Set<String> packageNames;

    InputParameterNameOverrideAnnotation() { } // No NPE here!

    InputParameterNameOverrideAnnotation(final int fie, final java.util.Set<String> pkgNames) { } // No NPE here!


}
