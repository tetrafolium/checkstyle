////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2017
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.whitespace.whitespacearound;

class InputWhitespaceAroundVarargs
{
    public static void main0(final String... args) { }
    public static void main1(final String...args) { }
    public static void main2(final String...args) { }
    public static void main3(final String... args) { }
    public void varargs(final int...arr) { }
    public void doubleValue(final int a, final int...b) { }

}
