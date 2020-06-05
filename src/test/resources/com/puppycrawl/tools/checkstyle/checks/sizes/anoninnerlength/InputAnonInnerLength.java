////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2002
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.sizes.anoninnerlength;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;

/**
 * Tests for length of anonymous inner types
 * @author Rob Worth
 * @author Lars Kühne
 **/
public class InputAnonInnerLength
{
    /**
     * Check that instantiations of normal classes work OK.
     */
    private JButton mButton = new JButton();

    private class MyInner
    {
        private MyInner(int[] anArray)
        {
        }
    }

    /**
     * the AnonInnerLengthCheck works with 'new' and RCURLY - check that
     * it will not confuse constructors calls with array params with
     * anon inners.
     */
    

    /**
       anon inner in member variable initialization which is 21 lines long
    */
    

    /**
       anon inner in member variable initialization which is 20 lines long
    */
    

    /**
       anon inner in constructor.
    */
    InputAnonInnerLength()
    {
        mButton.addMouseListener( new MouseAdapter()
            {
                public void mouseClicked( MouseEvent aEv )
                {
                    System.identityHashCode("click");
                }
            } );
    }

    /**
       anon inner in method
    */
    public void addInputAnonInner()
    {
        mButton.addMouseListener( new MouseAdapter()
            {
                public void mouseClicked( MouseEvent aEv )
                {
                    System.identityHashCode("click");
                }
            } );
    }
}
