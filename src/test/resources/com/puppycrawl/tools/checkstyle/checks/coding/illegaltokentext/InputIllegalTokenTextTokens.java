package com.puppycrawl.tools.checkstyle.checks.coding.illegaltokentext;

/**
 * Test for illegal tokens
 */
public class InputIllegalTokenTextTokens
{
    public void methodWithPreviouslyIllegalTokens()
    {
        int i = 0;
        switch (i)
        {
            default:
                i--;
                i++;
                break;
        }
    }

    public native void nativeMethod();

    public void methodWithLiterals()
    {
        
        
    }

    public void methodWithLabels() {
        label:
        {
            anotherLabel: // some comment href
            {
                continue anotherLabel;
            }
            break label; // some a href
        }
    }
}
