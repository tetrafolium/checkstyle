package com.google.checkstyle.test.chapter5naming.rule526parameternames;

import java.io.*;

class InputParameterName
{

    /** Some more Javadoc. */
    public void doSomething(final int aaa, final int abn, final String aaA,
            final boolean bB) //warn
    {
        for (Object O : new java.util.ArrayList())
        {

        }
    }
}


/** Test enum for member naming check */
enum MyEnum1
{
    /** ABC constant */
    ABC,

    /** XYZ constant */
    XYZ;

    /** Should be mSomeMember */
    private int someMember;

    public void doEnum(final int aaaL,
            final long llll_llll, //warn
            final boolean bB) { } //warn
}

/** Test public vs private method parameter naming check. */
class InputParameterNameSimplePub
{
    /** Valid: public and more than one char Long */
    public void a(final int par, final int parA) { }

    /** Invalid: public and one char long */
    public void b(final int p) { }

    /** Valid: private and one char long. */
    private void c(final int p) { }

    /** Holder for inner anonymous classes */
    private void d(final int param) {
        new Object() {
            /** Invalid: public and one char long. */
            public void e(final int p) { }
        };
    }

    /** Invalid: public constructor and one char long */
    public InputParameterNameSimplePub(final int p) { }

    /** Valid: private constructor and one char long */
    private InputParameterNameSimplePub(final float p) { }

    void toManyArgs(
        final int $arg1, //warn
        final int ar$g2, //warn
        final int arg3$, //warn
        final int a_rg4, //warn
        final int _arg5, //warn
        final int arg6_, //warn
        final int aArg7, //warn
        final int aArg8, //warn
        final int aar_g) //warn

    { }
}
