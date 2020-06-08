package com.puppycrawl.tools.checkstyle.checks.coding.superfinalize;
public class InputSuperFinalizeVariations
{
    public InputSuperFinalizeVariations() throws Throwable
    {
        super.equals(new String());
        super.finalize();
    }

    protected void finalize() /**comment test*/throws Throwable
    {
        super.finalize();
    }

    public void method() throws Throwable
    {
        super.finalize();
    }

    {
        super.finalize();
    }
}

class NoSuperFinalize
{
    
}

class InnerFinalize
{
    protected void finalize()
    {
        class Inner
        {
            protected void finalize() throws Throwable
            {
                super.finalize();
            }
        }
    }
}

//Check that super keyword isn't snagged here
class MyClassWithGenericSuperMethod1
{
    void someMethod(final java.util.List<? super java.util.Map> l)
    {

    }
}

class TestNative {
    protected native void finalize();
}

class OneMore {

    public void doSmt() throws Throwable {
        {
            {
                super.finalize();
            }
        }
    }
}
