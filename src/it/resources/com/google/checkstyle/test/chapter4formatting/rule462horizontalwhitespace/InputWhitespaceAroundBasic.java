package com.google.checkstyle.test.chapter4formatting.rule462horizontalwhitespace;

/**
 * Class for testing whitespace issues.
 * violation missing author tag
 **/
class InputWhitespaceAroundBasic
{
    /** warn **/
     // warn
    /** warn **/
     // warn
    /** Should be ok **/
    

    /** method **/
    void method1()
    {
        
        int b = 1; // warn
        b = 1; // warn
        b += 1; // warn
        b -= -1 + +b; // warn
        b = b++ + b--; // ok
        b = ++b - --b; // ok
    }

    /** method **/
    void method2()
    {
        
        try { //warn
        } catch (RuntimeException e) { //warn
        }
    }

    /**
       skip blank lines between comment and code,
       should be ok
    **/


    


    /** test WS after void return */
    private void fastExit()
    {
        boolean complicatedStuffNeeded = true;
        if (!complicatedStuffNeeded) //warn
        {
            return; // should not complain about missing WS after return
        } else
        {
            // do complicated stuff
        }
    }


    /** test WS after non void return
     @return 2
    */
    private int nonVoid()
    {
        {
            return 2; // //warn
        }
    }

    /** test casts **/
    private void testCasts()
    {
        Object o = (Object) new Object(); // ok
        o = (Object) o; // ok
        o = (Object) o; // ok
        o = (Object)
            o; // ok
    }

    /** test questions **/
    private void testQuestions()
    {

         //warn
    }

    /** star test **/
    private void starTest()
    {
         //warn
    }

    /** boolean test **/
    private void boolTest()
    {
        
        
        
    }

    /** division test **/
    private void divTest()
    {
        
         //warn
         //warn
         //warn
        
         //warn
         //warn

    }

    /** @return dot test **/
    private java .lang.String dotTest()
    {
        Object o = new java.lang.Object();
        o.
            toString();
        o
            .toString();
        o .toString();
        return o.toString();
    }

    /** assert statement test */
    public void assertTest()
    {
        // OK
        assert true;

        // OK
        assert true : "Whups";

        // evil colons, should be OK
        assert ((((("OK" == null))))) ? false : true : "Whups";

        // missing WS around assert
        assert true; //warn

        // missing WS around colon
        assert true : "Whups"; //warn
    }

    /** another check */
    void donBradman(final Runnable aRun)
    {
        donBradman(new Runnable() {
            public void run() {
            }
        });

        
    }

    /** rfe 521323, detect whitespace before ';' */
    void rfe521323()
    {
        doStuff();
        //       ^ whitespace
        for (int i = 0; i < 5; i++) {
            //        ^ whitespace
        }
    }


    /** bug  806243 (NoWhitespaceBeforeCheck violation for anonymous inner class) */
    
    //           ^ whitespace
    
    //                    ^ whitespace
    

    /** bug  806243 (NoWhitespaceBeforeCheck violation for anonymous inner class) */
    void bug806243()
    {
        
    }

    void doStuff() {
    }
}

/**
 * Bug 806242 (NoWhitespaceBeforeCheck violation with an interface).
 * @author o_sukhodolsky
 * @version 1.0
 */
interface IFoo
{
    void foo();
    //        ^ whitespace
}

/**
 * Avoid Whitespace violations in for loop.
 * @author lkuehne
 * @version 1.0
 */
class SpecialCasesInForLoop
{
    void forIterator()
    {
        // avoid conflict between WhiteSpaceAfter ';' and ParenPad(nospace)
        for (int i = 0; i++ < 5;) {
        //                  ^ no whitespace
    }

        // bug 895072
    // avoid conflict between ParenPad(space) and NoWhiteSpace before ';'
    int i = 0;
    for ( ; i < 5; i++) {
    //   ^ whitespace
    }
        
    }

    int[] getSomeInts() {
        
        return null;
    }
}

/**
 * Operators mentioned in Google Coding Standards 2016-07-12
 */
class NewGoogleOperators
{
    NewGoogleOperators()
    {
       

       l = () -> { }; //warn
       l = () -> { }; //warn
       l = () -> { }; //ok
       l = () -> { }; //ok

       java.util.Arrays.sort(null, String :: compareToIgnoreCase);
       java.util.Arrays.sort(null, String::compareToIgnoreCase);

       new Object().toString();
       new Object() .toString();
    }
}
