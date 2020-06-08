////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.javadoc.javadocmethod;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;

/**
 * Tests for anonymous inner types
 * @author Lars Kühne
 **/
public class InputJavadocMethodScopeAnonInner
{
    /**
       button.
    */
    private JButton mButton = new JButton();

    /**
       anon inner in member variable initialization.
    */
    

    /**
       anon inner in constructor.
    */
    InputJavadocMethodScopeAnonInner()
    {
        mButton.addMouseListener(new MouseAdapter()
            {
                public void mouseClicked(final MouseEvent aEv)
                {
                    System.identityHashCode("click");
                }
            });
    }

    /**
       anon inner in method
    */
    public void addInputAnonInner()
    {
        mButton.addMouseListener(new MouseAdapter()
            {
                public void mouseClicked(final MouseEvent aEv)
                {
                    System.identityHashCode("click");
                }
            });
    }
}
