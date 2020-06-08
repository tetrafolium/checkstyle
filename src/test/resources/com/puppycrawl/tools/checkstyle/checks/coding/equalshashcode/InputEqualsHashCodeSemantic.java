////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.coding.equalshashcode;

import java.io.ByteArrayOutputStream;

/**
 * Test case for detecting simple semantic violations.
 * @author Lars Kühne
 **/
class InputEqualsHashCodeSemantic
{
    /* Boolean instantiation in a static initializer */
    

    /* Boolean instantiation in a non-static initializer */
    {
        
        Boolean[] y = new Boolean[]{Boolean.TRUE, Boolean.FALSE};
    }

    /** fully qualified Boolean instantiation in a method. **/
    Boolean getBoolean()
    {
        return Boolean.TRUE;
    }

    void otherInstantiations()
    {
        // instantiation of classes in the same package
        
        
        // classes in another package with .* import
        
        
        // classes in another package with explicit import
        
        
    }

    public class EqualsVsHashCode1
    {
        public boolean equals(final int a) // wrong arg type, don't flag
        {
            return a == 1;
        }
    }

    public class EqualsVsHashCode2
    {
        public boolean equals(final String a) // don't flag
        {
            return true;
        }
    }

    public class EqualsVsHashCode3
    {
        public boolean equals(final Object a) // don't flag
        {
            return true;
        }

        public int hashCode()
        {
            return 0;
        }
    }

    public class EqualsVsHashCode4
    {
        // in anon inner class
        ByteArrayOutputStream bos1 = new ByteArrayOutputStream()
        {
            public boolean equals(final Object a) // don't flag
            {
                return true;
            }

            public int hashCode()
            {
                return 0;
            }
        };

        ByteArrayOutputStream bos2 = new ByteArrayOutputStream()
        {
            public boolean equals(final Object a) // flag
            {
                return true;
            }
        };
    }

    public void triggerEmptyBlockWithoutBlock()
    {
        // an if statement without a block to increase test coverage
        return;
    }

    // empty instance initializer
    

    public class EqualsVsHashCode5
    {
        public <A> boolean equals(final int a) // wrong arg type, don't flag even with generics
        {
            return a == 1;
        }
    }

    public class EqualsVsHashCode6
    {
        public <A> boolean equals(final Comparable<A> a) // don't flag
        {
            return true;
        }
    }

    private class InputBraces {

    }

    private class InputModifier {

    }
}
