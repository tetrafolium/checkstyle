package com.puppycrawl.tools.checkstyle.checks.sizes.parameternumber;

class InputParameterNumberCheckBase
{
    // method with many parameters
    void myMethod(final int a, final int b, final int c, final int d, final int e, final int f, final int g, final int h) {

    }

    // method with many parameters
    void myMethod2(final int a, final int b, final int c, final int d, final int e, final int f, final int g, final int h) {

    }
}

public class InputParameterNumber extends InputParameterNumberCheckBase
{
    @Override
    void myMethod(final int a, final int b, final int c, final int d, final int e, final int f, final int g, final int h) {

    }

    @java.lang.Override
    void myMethod2(final int a, final int b, final int c, final int d, final int e, final int f, final int g, final int h) {

    }
}
