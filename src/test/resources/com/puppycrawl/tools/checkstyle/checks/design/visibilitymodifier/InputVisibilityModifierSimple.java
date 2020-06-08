////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: Feb-2001
// Ignore violation
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.design.visibilitymodifier;
/**
 * Contains simple mistakes:
 * - Long lines
 * - Tabs
 * - Format of variables and parameters
 * - Order of modifiers
 * @author Oliver Burn
 **/
final class InputVisibilityModifierSimple
{
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
    

    //
    // Accessor tests
    //
    /** should be private **/
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
    int test1(final int badFormat1, final int badFormat2,
              final int badFormat3)
        throws java.lang.Exception
    {
        return 0;
    }

    /** test local variables */
    private void localVariables()
    {
        // normal decl
        
        

        // final decls
        
        

        // decl in for loop init statement
        for (int k = 0; k < 1; k++)
        {
            
        }
        for (int I = 0; I < 1; I++)
        {
            
        }
    }

    /** test illegal constant **/
    
}

/** Test class for variable naming in for each clauses. */
class InputVisibilityModifierSimple2
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
