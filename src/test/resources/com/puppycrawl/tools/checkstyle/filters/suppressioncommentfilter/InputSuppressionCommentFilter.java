////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
////////////////////////////////////////////////////////////////////////////////

package com.puppycrawl.tools.checkstyle.filters.suppressioncommentfilter;

/**
 * Test input for using comments to suppress violations.
 * @author Rick Giles
 **/
class InputSuppressionCommentFilter
{
    

    /* CHECKSTYLE:OFF */
    
    /* CHECKSTYLE:ON */

    

    //CSOFF: MemberNameCheck|ConstantNameCheck
    
    
    /*
     * CSON: MemberNameCheck|ConstantNameCheck
     */
    //CSOFF: ConstantNameCheck
    
    //CSON: ConstantNameCheck

    //CS_OFF
    
    //CS_ON

    

    //CS_OFF: ConstantNameCheck
    
    
    //CS_ON

    //CHECKSTYLE:OFF
    
    //CHECKSTYLE:ON

    //UNUSED OFF: aInt
    public static void doit1(int aInt)
    {
    }
    //UNUSED ON: aInt
    public static void doit2(int aInt)
    {
    }

    public void doit3()
    {
        try {
            // lots of code omitted
            for(int i = 0; i < 10; i++) {
                // more code omitted
                while(true) {
                    try {
                        //CHECKSTYLE:OFF
                    } catch(Exception e) {
                       //CHECKSTYLE:ON
                    }
                }
                // code omitted
            }
            //CHECKSTYLE:OFF
        } catch(Exception ex) {
            //CHECKSTYLE:ON
        }

        try{
            //IllegalCatchCheck OFF: Exception
        } catch (RuntimeException | Exception ex) {
        }
    }

    public void doit4() {
        try {

        /* CHECKSTYLE:OFF */} catch(Exception e) {/* CHECKSTYLE:ON */

        }
    }
}
