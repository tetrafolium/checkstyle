package com.puppycrawl.tools.checkstyle.checks.finalparameters;

public class InputFinalParametersPrimitiveTypes
{
    void foo(final int i) { } //no warning
    void foo1(final int i, final String k, final float s) { } //no warning on 'i' and 's'
    void foo2(final String s, final Object o, final long l) { } //no warning on 'l'
    void foo3(final int[] array) { } //warning
    void foo4(final int i, final float x, final int[] s) { } //warning on 's'
    void foo5(final int x, final long[] l, final String s) { } //warning on 'l' and 's'
}
