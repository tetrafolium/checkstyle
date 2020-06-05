package com.google.checkstyle.test.chapter2filebasic.rule231filetab;


final class InputFileTabCharacter
{
    // Long line ----------------------------------------------------------------
    // Contains a tab ->	<- //warn
    // Contains trailing whitespace ->

    /** Invalid format **/
    public static final int badConstant = 2;
    /** Valid format **/
    public static final int MAX_ROWS = 2;

    /** Invalid format **/
    
    /** Valid format **/
    

    /** Invalid format **/
    
    /** Valid format **/
    
    /** Valid format **/
    protected int mNumCreated2 = 0;

    /** commas are wrong **/
    

    public static int sTest1;
    /** should be private **/
    protected static int sTest3;
    /** should be private **/
    static int sTest2;

    /** should be private **/
    int mTest1;
    /** should be private **/
    public int mTest2;

    /**
     * @return hack
     * @param badFormat1 bad format
     * @param badFormat2 bad format
     * @param badFormat3 bad format
     * @throws java.lang.Exception abc
     **/
    int test1(int badFormat1,int badFormat2,
    			final int badFormat3) //warn
        throws java.lang.Exception
    {
        return 0;
    }

    /** method that is 20 lines long **/
    private void longMethod()
    {
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
    }

    /** constructor that is 10 lines long **/
    private InputFileTabCharacter()
    {
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
        // a line
    }

    /** test local variables */
    private void localVariables()
    {
        
        

        
        

        for (int k = 0; k < 1; k++)
        {
            
        }
        for (int I = 0; I < 1; I++)
        {
            
        }
    }

    /** test method pattern */
    void ALL_UPPERCASE_METHOD()
    {
    }

    /** test illegal constant **/
    

    // A very, very long line that is OK because it matches the regexp "^.*is OK.*regexp.*$"
    // long line that has a tab ->	<- and would be OK if tab counted as 1 char //warn
    // tabs that count as one char because of their position ->	<-   ->	<- //warn

    /** some lines to test the column after tabs */
    void violateColumnAfterTabs()
    {
        // with tab-width 8 all statements below start at the same column,
        // with different combinations of ' ' and '\t' before the statement
                
        	 //warn
         	 //warn
		 //warn
  	  	 //warn
  	         //warn
    }

    // MEMME:
    /* MEMME: a
     * MEMME:
     * OOOO
     */
    /* NOTHING */
    /* YES */ /* MEMME: x */ /* YES!! */

    /** test long comments **/
    void veryLong()
    {
        /*
          blah blah blah blah
          blah blah blah blah
          blah blah blah blah
          blah blah blah blah
          blah blah blah blah
          blah blah blah blah
          blah blah blah blah
          blah blah blah blah
          blah blah blah blah
          blah blah blah blah
          blah blah blah blah
          blah blah blah blah
          blah blah blah blah
          blah blah blah blah
          blah blah blah blah
          enough talk */
    }

    /**
     * @see to lazy to document all args. Testing excessive # args
     **/
    void toManyArgs(int aArg1, int aArg2, int aArg3, int aArg4, int aArg5,
                    int aArg6, int aArg7, int aArg8, int aArg9)
    {
    }
}

/** Test class for variable naming in for each clauses. */
class InputSimple2
{
    /** Some more Javadoc. */
    public void doSomething()
    {
        //"O" should be named "o"
        
    }
}

/** Test enum for member naming check */
enum MyEnum1
{
    /** ABC constant */
    ABC,

    /** XYZ constant */
    XYZ;

    /** Should be mSomeMember */
    private int someMember;
}
