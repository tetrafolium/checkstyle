package com.puppycrawl.tools.checkstyle.checks.javadoc.missingjavadoctype;

/**
 * Tests having inner types
 **/
class InputMissingJavadocTypeInner
{    

    /** demonstrate bug in handling static final **/
    protected static Object sWeird = new Object();    
    /** demonstrate bug in handling static final **/
    static Object sWeird2 = new Object();
    // Ignore - two violations
    class InnerInner2 // warn
    {
        // Ignore
        public int fData;
    }

    // Ignore - 2 violations
    interface InnerInterface2 // warn
    {
        // Ignore - should be all upper case
        String data = "zxzc";

        // Ignore
        class InnerInterfaceInnerClass // warn
        {
            // Ignore - need Javadoc and made private
            public int rData;

            /** needs to be made private unless allowProtected. */
            protected int protectedVariable;

            /** needs to be made private unless allowPackage. */
            int packageVariable;
        }
    }

    /** demonstrate bug in local final variable */
    public interface Inter
    {
    }

     public static void main()
     {
        
     }

    /** annotation field incorrectly named. */
    @interface InnerAnnotation
    {
        /** Ignore - should be all upper case. */
        String data = "zxzc";
    }

    /** enum with public member variable */
    enum InnerEnum
    {
        /** First constant */
        A,

        /** Second constant */
        B;

        /** Should be private */
        public int someValue;
    }
}
