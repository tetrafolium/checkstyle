////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.javadoc.javadoctype;

public class InputJavadocTypePublicOnly // ignore - need javadoc
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
    private InputJavadocTypePublicOnly(final int aA)
    {
    }

    // ignore - need Javadoc when not relaxed
    InputJavadocTypePublicOnly(final String aA)
    {
    }

    // ignore - always need javadoc
    protected InputJavadocTypePublicOnly(final Object aA)
    {
    }

    // ignore - always need javadoc
    public InputJavadocTypePublicOnly(final Class<Object> aA)
    {
    }

    // ignore - when not relaxed about Javadoc
    private void method(final int aA)
    {
    }

    // ignore - when not relaxed about Javadoc
    void method(final Long aA)
    {
    }

    // ignore - need javadoc
    protected void method(final Class<Object> aA)
    {
    }

    // ignore - need javadoc
    public void method(final StringBuffer aA)
    {
    }


    /**
       A param tag should not be required here when relaxed about Javadoc.
       Writing a little documentation should not be worse than not
       writing any documentation at all.
     */
    private void method(final String aA)
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
