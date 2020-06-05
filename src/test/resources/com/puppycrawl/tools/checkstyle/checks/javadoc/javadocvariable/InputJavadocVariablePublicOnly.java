////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.javadoc.javadocvariable;

public class InputJavadocVariablePublicOnly // ignore - need javadoc
{     // ignore - when not relaxed about Javadoc
    int mLen;    

    
// ignore - when not relaxed about Javadoc
    protected int mDeer;    
// ignore
    public int aFreddo;     private interface InnerInterface // ignore - when not relaxed about Javadoc
    {
        String CONST = "InnerInterface"; // ignore - w.n.r.a.j
        void method(); // ignore - when not relaxed about Javadoc

        class InnerInnerClass // ignore - when not relaxed about Javadoc
        {
             // ignore - when not relaxed about Javadoc

            private InnerInnerClass()
            {
                
            }

            void method2() // ignore - when not relaxed about Javadoc
            {
                
            }
        }
    }

    private class InnerClass // ignore
    {
         // ignore - when not relaxed about Javadoc

        void method() // ignore - when not relaxed about Javadoc
        {
        }
    }
// ignore

    // ignore - need Javadoc
    private InputJavadocVariablePublicOnly(int aA)
    {
    }

    // ignore - need Javadoc when not relaxed
    InputJavadocVariablePublicOnly(String aA)
    {
    }

    // ignore - always need javadoc
    protected InputJavadocVariablePublicOnly(Object aA)
    {
    }

    // ignore - always need javadoc
    public InputJavadocVariablePublicOnly(Class<Object> aA)
    {
    }

    // ignore - when not relaxed about Javadoc
    private void method(int aA)
    {
    }

    // ignore - when not relaxed about Javadoc
    void method(Long aA)
    {
    }

    // ignore - need javadoc
    protected void method(Class<Object> aA)
    {
    }

    // ignore - need javadoc
    public void method(StringBuffer aA)
    {
    }


    /**
       A param tag should not be required here when relaxed about Javadoc.
       Writing a little documentation should not be worse than not
       writing any documentation at all.
     */
    private void method(String aA)
    {
    }

    /**
       This inner class has no author tag, which is OK.
     */
    public class InnerWithoutAuthor
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
