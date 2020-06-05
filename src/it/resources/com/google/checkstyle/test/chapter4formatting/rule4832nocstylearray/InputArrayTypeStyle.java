package com.google.checkstyle.test.chapter4formatting.rule4832nocstylearray;

/**
 * Test case for ArrayTypeStyle (Java vs C)
 **/
public class InputArrayTypeStyle
{
    
        
    int[] array[] = new int [2][2];    
//warn
    int array2[][][] = new int[3][3][3]; //warn

    public static void mainJava(String[] aJavaStyle) //ok
    {
    }

    public static void mainC(String aCStyle[]) //warn
    {
        final int[] blah = new int[0]; //ok
         //ok
         //ok
         //ok
        int[] array[] = new int [2][2]; //warn
        int array2[][][] = new int[3][3][3]; //warn
    }

    public class Test
    {
        public Test[]
            variable; //ok

        public Test[]
            getTests()
        {
            return null;
        }

        public Test[] getNewTest() //ok
        {
            return null;
        }

        public Test getOldTest()[] //warn
        {
            return null;
        }

        public Test getOldTests()[][] //warn
        {
            return null;
        }

        public Test[]
            getMoreTests()[] //warn
        {
            return null;
        }

        public Test[][] getTests2() //ok
        {
            return null;
        }
    }
//warn
}
