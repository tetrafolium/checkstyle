////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2003
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.finalparameters;

import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.ActionEvent;

/**
 * Test case for detecting missing final parameters.
 * @author Lars Kühne
 **/
class InputFinalParameters
{
    /** no param constructor */
    InputFinalParameters()
    {
    }

    /** non final param constructor */
    InputFinalParameters(final String s)
    {
    }

    /** non final param constructor */
    InputFinalParameters(final Integer i)
    {
    }

    /** final param constructor with annotation */
    InputFinalParameters(final @MyAnnotation3 Class<Object> i)
    {
    }

    /** non-final param constructor with annotation*/
    InputFinalParameters(final @MyAnnotation3 Boolean i)
    {
    }

    /** mixed */
    InputFinalParameters(final String s, final Integer i)
    {
    }

    /** no param method */
    void method()
    {
    }

    /** non final param method */
    void method(final String s)
    {
    }

    /** final param method */
    void method(final Integer i)
    {
    }

    /** final param method with annotation **/
    void method(@MyAnnotation3 final Object s)
    {

    }

    /** non-final param method with annotation **/
    void method(final @MyAnnotation3 Class<Object> s)
    {

    }

    /** mixed */
    void method(final String s, final Integer i)
    {
    }

    /** interface methods should not be flagged. */
    interface TestInterface
    {
        void method(String s);
    }

    /** methods in anonymous inner classes */
    void holder()
    {
        Action a = new AbstractAction()
            {
                public void actionPerformed(final ActionEvent e)
                {
                }
                void somethingElse(final @MyAnnotation3 ActionEvent e)
                {
                }
            };

        Action b = new AbstractAction()
            {
                public void actionPerformed(final ActionEvent e)
                {
                }
                void somethingElse(@MyAnnotation3 final ActionEvent e)
                {
                }
            };
    }

    /** methods with complicated types of the parameters. */
    void methodA(final java.lang.String aParam) {
    }

    void methodB(final String[] args) {
    }

    void methodC(final java.lang.String[] args) {
    }

    /** some catch blocks */
    void method1()
    {
        try {
            String.CASE_INSENSITIVE_ORDER.equals("");
        } catch (java.lang.NullPointerException npe) {
            npe.getMessage();
        } catch (@MyAnnotation3 final ClassCastException e) {
            e.getMessage();
        } catch (RuntimeException e) {
            e.getMessage();
        } catch (@MyAnnotation3 NoClassDefFoundError e) {
            e.getMessage();
        }
    }

    native void method(int i);
}

abstract class AbstractClass
{
    public abstract void abstractMethod(int aParam);
}

class Foo
{
    /* Some for-each clauses */
    public void Bar()
    {
        for (String s : someExpression())
        {

        }
        for (final String s : someExpression())
        {

        }
        for (@MyAnnotation3 String s : someExpression())
        {

        }
        for (@MyAnnotation3 final String s : someExpression())
        {

        }
    }

    private String[] someExpression()
    {
        return null;
    }
}

@interface MyAnnotation3 {
}
