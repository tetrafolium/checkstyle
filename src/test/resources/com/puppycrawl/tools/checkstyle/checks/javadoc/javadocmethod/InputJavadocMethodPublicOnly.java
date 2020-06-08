////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.javadoc.javadocmethod;

public class InputJavadocMethodPublicOnly // ignore - need javadoc
{
    private interface InnerInterface // ignore - when not relaxed about Javadoc
    {
        String CONST = "InnerInterface"; // ignore - w.n.r.a.j
        void method(); // ignore - when not relaxed about Javadoc

        class InnerInnerClass // ignore - when not relaxed about Javadoc
        {
            private int mData; // ignore - when not relaxed about Javadoc

            private InnerInnerClass()
            {
                final Runnable r = new Runnable() {
                        public void run() { };
                    };
            }

            void method2() // ignore - when not relaxed about Javadoc
            {
                final Runnable r = new Runnable() {
                        public void run() { };
                    };
            }
        }
    }

    private class InnerClass // ignore
    {
        private int mDiff; // ignore - when not relaxed about Javadoc

        void method() // ignore - when not relaxed about Javadoc
        {
        }
    }

    private int mSize; // ignore - when not relaxed about Javadoc
    int mLen; // ignore - when not relaxed about Javadoc
    protected int mDeer; // ignore
    public int aFreddo; // ignore

    // ignore - need Javadoc
    private InputJavadocMethodPublicOnly(final int aA)
    {
    }

    // ignore - need Javadoc when not relaxed
    InputJavadocMethodPublicOnly(final String aA)
    {
    }

    // ignore - always need javadoc
    protected InputJavadocMethodPublicOnly(final Object aA)
    {
    }

    // ignore - always need javadoc
    public InputJavadocMethodPublicOnly(final Class<Object> aA)
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
