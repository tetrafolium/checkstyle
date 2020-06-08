////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.design.visibilitymodifier;

public class InputVisibilityModifierPublicOnly
{    
    int mLen;    

    
    protected int mDeer;    
    public int aFreddo;
    private interface InnerInterface
    {
        String CONST = "InnerInterface";

        class InnerInnerClass
        {
            

            private InnerInnerClass()
            {
                
            }
        }
    }

    private class InnerClass
    {
        
    }

    /** {@inheritDoc} */
    public String toString()
    {
        return super.toString();
    }

    @Deprecated @Override
    public int hashCode()
    {
        return super.hashCode();
    }
}
