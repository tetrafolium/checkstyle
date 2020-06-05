////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com . puppycrawl
    .tools.
    checkstyle.checks.whitespace.whitespaceafter;

/**
 * Class for testing whitespace issues.
 * violation missing author tag
 **/
class InputWhitespaceAfterTypeCast
{
    /** ignore assignment **/
    
    /** ignore assignment **/
    
    /** Should be ok **/
    

    /** method **/
    void method1()
    {
        
        int b= 1; // Ignore 1
        b=1; // Ignore 1
        b+=1; // Ignore 1
        b -=- 1 + + b; // Ignore 2
        b = b ++ + b --; // Ignore 1
        b = ++ b - -- b; // Ignore 1
    }

    /** method **/
    void method2()
    {
        
        try{
        }
        catch(RuntimeException e){
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
        if( !complicatedStuffNeeded )
        {
            return; // should not complain about missing WS after return
        }
        else
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
            return2; // should complain about missing WS after return
        }
    }

    /** test casts **/
    private void testCasts()
    {
        Object o = (Object) new Object(); // ok
        o = (Object)o; // violation
        o = ( Object ) o; // ok
        o = (Object)
            o; // ok
    }

    /** test questions **/
    private void testQuestions()
    {
        
        b = (1==2) ? false : true;
    }

    /** star test **/
    private void starTest()
    {
        
    }

    /** boolean test **/
    private void boolTest()
    {
        
        
        
    }

    /** division test **/
    private void divTest()
    {
        
        
        
        
        
        
        
        
    }

    /** @return dot test **/
    private java .lang.  String dotTest()
    {
        Object o = new java.lang.Object();
        o.
            toString();
        o
            .toString();
        o . toString();
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
        asserttrue;

        // missing WS around colon
        assert true:"Whups";
    }

    /** another check */
    void donBradman(Runnable aRun)
    {
        donBradman(new Runnable() {
            public void run() {
            }
        });

        
    }

    /** rfe 521323, detect whitespace before ';' */
    void rfe521323()
    {
        doStuff() ;
        //       ^ whitespace
        for (int i = 0 ; i < 5; i++) {
            //        ^ whitespace
        }
    }


    /** bug 806243 (NoWhitespaceBeforeCheck violation for anonymous inner class) */
    
    //           ^ whitespace
    
    //                    ^ whitespace
    

    /** bug 806243 (NoWhitespaceBeforeCheck violation for anonymous inner class) */
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
    void foo() ;
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
	for ( ; i < 5; i++ ) {
	//   ^ whitespace
	}
        
    }

    int[] getSomeInts() {
        
        return null;
    }

    public void myMethod() {
        new Thread() {
            public void run() {
            }
        }.start();
    }

    public void foo(java.util.List<? extends String[]> bar, Comparable<? super Object[]> baz) { }

    public void mySuperMethod() {
        Runnable[] runs = new Runnable[] {new Runnable() {
                public void run() {
                }
            },
            new Runnable() {
                public void run() {
                }
            }};
        runs[0]
.
 run()
;
    }

    public void testNullSemi() {
        return ;
    }

    public void register(Object obj) { }

    public void doSomething(String args[]) {
        register(boolean[].class);
        register( args );
    }

    public void parentheses() {
        testNullSemi
(
)
;
    }

    public static void testNoWhitespaceBeforeEllipses(String ... args) {
    }
}
