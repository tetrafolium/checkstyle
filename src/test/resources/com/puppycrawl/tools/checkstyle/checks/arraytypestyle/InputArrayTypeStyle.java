////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.arraytypestyle;

/**
 * Test case for ArrayTypeStyle (Java vs C)
 * @author lkuehne
 **/
public class InputArrayTypeStyle
{
    
    
    

    public static void mainJava(String[] aJavaStyle)
    {
    }

    public static void mainC(String aCStyle[])
    {
        final int[] blah = new int[0];
        
        
        
    }

    public class Test
    {
        public Test[]
            variable;

        public Test[]
            getTests()
        {
            return null;
        }

        public Test[] getNewTest()
        {
            return null;
        }

        public Test getOldTest()[]
        {
            return null;
        }

        public Test getOldTests()[][]
        {
            return null;
        }

        public Test[]
            getMoreTests()[][]
        {
            return null;
        }

        public Test[][] getTests2()
        {
            return null;
        }
    }
    public static void foo(java.util.Collection < ? extends InputArrayTypeStyle[] > collection) {}
}
