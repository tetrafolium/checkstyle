////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.regexp.regexpsinglelinejava;

import java.io.ByteArrayOutputStream;

/**
 * Test case for detecting simple semantic violations.
 * @author Lars Kühne
 **/
class InputRegexpSinglelineJavaSemantic
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

    void exHandlerTest()
    {
        try {
             // do stuff and don't handle exceptions in some cases
        } catch (IllegalStateException emptyCatchIsAlwaysAnError) {
        } catch (NullPointerException ex) {
            // can never happen, but only commenting this is currently a problem
            // Possible future enhancement: allowEmptyCatch="commented"
        } catch (ArrayIndexOutOfBoundsException ex) {
            
            // can never happen, semicolon makes checkstyle happy
            // this is a workaround for above problem
        } catch (NegativeArraySizeException ex) {
            
            // can never happen, empty compound statement is another workaround
        } catch (UnsupportedOperationException handledException) {
            System.out.println(handledException.getMessage());
        } catch (SecurityException ex) { /* hello */ } catch (StringIndexOutOfBoundsException ex) { } catch (IllegalArgumentException ex) { }

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
        public boolean equals(final int a) // wrong arg type, don't flag
        {
            return a == 1;
        }
    }

    public class EqualsVsHashCode2
    {
        public boolean equals(final String a) // flag
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
        public <A> boolean equals(final Comparable<A> a) // flag, weven with generics
        {
            return true;
        }
    }

    private class InputBraces {

    }

    private class InputModifier {

    }

    synchronized void foo() {
         // not OK
        
    }


    

    
}
