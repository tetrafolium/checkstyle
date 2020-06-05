package com.google.checkstyle.test.chapter4formatting.rule462horizontalwhitespace;
/** Test input for MethodDefPadCheck */
public class InputMethodParamPad
{
    public InputMethodParamPad()
    {
        super();
    }

    public InputMethodParamPad (int aParam) // warn
    {
        super (); // warn
    }

    public void method()
    {
    }

    public void method (int aParam) // warn
    {
    }

    public void
        method(double aParam)
    {
        // invoke constructor
        
        pad = new InputMethodParamPad (); // warn
        pad = new
            InputMethodParamPad();

        // call method
        method();
        method (); // warn
    }

    public void dottedCalls()
    {
        this.method();
        this.method (); // warn
        this.
            method();

        InputMethodParamPad p = new InputMethodParamPad();
        p.method();
        p.method (); // warn
        p.
            method();

        java.lang.Integer.parseInt("0");
        java.lang.Integer.parseInt ("0"); // warn
        java.lang.Integer.
            parseInt("0");
    }

    public void newArray()
    {
        int[] a = new int[]{0, 1};
        
        
    }
}
