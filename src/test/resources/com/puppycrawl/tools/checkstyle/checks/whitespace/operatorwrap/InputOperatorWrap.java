////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.whitespace.operatorwrap;

import java.util.Arrays;

/**
 * Test case for detecting operator wrapping.
 * @author Lars K�hne
 **/
class InputOperatorWrap
{
    void test()
    {
        int x = 1
            + 2
            - 3
            -
            4;
        x = x + 2;
        
        y = true
            && false;
        y = false
            && true;
        Arrays.sort(null, String
                    ::
                    compareToIgnoreCase);
        Arrays.sort(null, String::
                    compareToIgnoreCase);
        Arrays.sort(null, String
                    ::compareToIgnoreCase);
    }

    void testAssignment()
    {
         //violation when checking assignment operators with EOL wrap option
        
    }

    <
        T extends Comparable
        & java.io.Serializable
    >
    void testGenerics1()
    {
        
    }
}

class badCase2<T extends Foo
    & Bar> {
}

class goodCase<T extends Foo & Bar> {
}

class Switch {
    public void test(final int i, final int j) {
        switch (j) {
        case 7:
            return;
        }
        switch (i) {
        case 1:
            break;
        default:
            
        }
        
    }
}
