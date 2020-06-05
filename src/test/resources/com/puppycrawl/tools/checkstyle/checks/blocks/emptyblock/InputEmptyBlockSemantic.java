////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.blocks.emptyblock;


/**
 * Test case for detecting empty block statements.
 * @author Lars Kühne
 **/
class InputEmptyBlockSemantic
{
    

    {
        
        Boolean[] y = new Boolean[]{Boolean.TRUE, Boolean.FALSE};
    }

    Boolean getBoolean()
    {
        return Boolean.TRUE;
    }

    void exHandlerTest()
    {
        try {
        }
        
        try {
        // something
        }
        
        try {
             // something
        }
        
    }

    /** test **/
    

    public class EqualsVsHashCode1
    {
        public boolean equals(int a)
        {
            return a == 1;
        }
    }

    // empty instance initializer
    

    private class InputBraces {

    }

    synchronized void foo() {
         // not OK
        
    }


    

    
}
