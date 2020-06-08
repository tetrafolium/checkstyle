package com.puppycrawl.tools.checkstyle.checks.coding.hiddenfield;

////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2002
////////////////////////////////////////////////////////////////////////////////

/**
 * Test case for hidden fields
 * @author Rick Giles
 **/
class InputHiddenFieldReorder
{


    public InputHiddenFieldReorder()
    {
         //shadows field
    }

    public InputHiddenFieldReorder(final int hidden) //parameter shadows field
    {
    }

    public void shadow()
    {
         //shadows field
    }

    public void shadowFor()
    {
        for (int hidden = 0; hidden < 1; hidden++) { //shadows field
        }
    }

    public void shadowParam(final int hidden) //parameter shadows field
    {
    }

    public class Inner
    {        
        private int innerHidden = 0;
//        private int innerHidden = 0;

        public Inner()
        {
             //shadows field
        }

        public Inner(final int innerHidden) //shadows field
        {
        }

        private void innerShadow()
        {
             //shadows inner field
             //shadows outer field
        }

        private void innerShadowFor()
        {
            for (int innerHidden = 0; innerHidden < 1; innerHidden++) {
            }
            //shadows outer field
            for (int hidden = 0; hidden < 1; hidden++) {
            }
        }

        private void shadowParam(
            final int innerHidden, //parameter shadows inner field
            final int hidden //parameter shadows outer field
        )
        {
        }

        
    }

    
    
}

interface NothingHiddenReorder
{
    public static int notHidden = 0;

    // not a violation
    public void noShadow(int notHidden);
}

enum HiddenEnum1
{
    A(129),
    B(283),
    C(1212)
    {        

        /**
         * Should not be flagged as violation as we don't check
         * hidden class level fields
         */
        int hidden;
        public void doSomething()
        {
            //Should be flagged as hiding enum constant member
            
        }
    };

    /**
     * ctor parameter hides member
     */
    HiddenEnum1(final int hidden)
    {
    }

    public void doSomething()
    {
        //Should be flagged as hiding static member
        
    }

    public static void doSomethingStatic()
    {
        //Should be flagged as hiding static member
        
    }

    int hidden;
    static int hiddenStatic;
}
