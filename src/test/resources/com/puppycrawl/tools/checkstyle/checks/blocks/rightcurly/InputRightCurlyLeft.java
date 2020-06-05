////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.blocks.rightcurly;

/**
 * Test case for correct use of braces.
 * @author Oliver Burn
 **/
class InputRightCurlyLeft
{
    /** @see test method **/
    int foo() throws InterruptedException
    {
        int x = 1;
        int a = 2;
        while (true)
        {
            try
            {
                if (x > 0)
                {
                    break;
                }
                else if (x < 0) {
                    
                }
                else
                {
                    break;
                }
                switch (a)
                {
                case 0:
                    break;
                default:
                    break;
                }
            }
            catch (Exception e)
            {
                break;
            }
            finally
            {
                break;
            }
        }

        synchronized (this)
        {
            do
            {
                x = 2;
            } while (x == 2);
        }

        this.wait(666
                 ); // Bizarre, but legal

        for (int k = 0; k < 1; k++)
        {
            
        }

        // test input for bug reported by Joe Comuzzi
        if (System.currentTimeMillis() > 1000)
            return 1;
        else
            return 2;
    }

    // Test static initialiser
    



    public enum GreetingsEnum
    {
        HELLO,
        GOODBYE
    }; //violation

    void method2()
    {
        boolean flag = true;
        if (flag) {
            System.identityHashCode("heh");
            flag = !flag; } "Xe-xe".equals(String.CASE_INSENSITIVE_ORDER);
        // it is ok to have rcurly on the same line as previous
        // statement if lcurly on the same line.
        if (flag) { "it is ok.".equals(String.CASE_INSENSITIVE_ORDER); }
    }
}

/**
 * Test input for closing brace if that brace terminates
 * a statement or the body of a constructor.
 */
class FooCtor
{
        int i;
        public FooCtor()
    {
                i = 1;
    }}

/**
* Test input for closing brace if that brace terminates
* a statement or the body of a method.
*/
class FooMethod
{
        public void fooMethod()
    {
                
    }}

/**
* Test input for closing brace if that brace terminates
* a statement or the body of a named class.
*/
class FooInner
{
        class InnerFoo
    {
                public void fooInnerMethod ()
        {

                }
    }}

/**
 * False positive
 *
 */
class Absent_CustomFieldSerializer3 {

    public static void serialize() {} //empty body - violation
}

class Absent_CustomFieldSerializer4
{
    public Absent_CustomFieldSerializer4() {} //empty body - violation
}

class EmptyClass2 {} //empty body - violation

interface EmptyInterface3 {}

class ClassWithStaticInitializers
{
    
    

    static class Inner
    {
        
    }

    public void emptyBlocks() {
        try {
            // comment
        } catch (RuntimeException e) { // violation except for SAME
            new Object();
        } catch (Exception e) { // violation except for SAME
            // comment
        } catch (Throwable e) { // violation except for SAME
        } 

        while (true) {
        } // violation except for SAME
    }

    public void codeAfterLastRightCurly() {
        while (new Object().equals(new Object())) {
        } // violation
        for (int i = 0; i < 1; i++) { new Object(); } // violation
    }

    static final java.util.concurrent.ThreadFactory threadFactory
            = new java.util.concurrent.ThreadFactory() {
        @Override
        public Thread newThread(final Runnable r) {
            return new Thread(r);
        }}; // violation
}
