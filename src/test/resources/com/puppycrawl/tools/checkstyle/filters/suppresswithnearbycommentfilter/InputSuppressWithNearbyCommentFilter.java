////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
////////////////////////////////////////////////////////////////////////////////

package com.puppycrawl.tools.checkstyle.filters.suppresswithnearbycommentfilter;

/**
 * Test input for using comments to suppress violations.
 *
 * @author Mick Killianey
 */
class InputSuppressWithNearbyCommentFilter
{
      // SUPPRESS CHECKSTYLE MemberNameCheck
      /* SUPPRESS CHECKSTYLE MemberNameCheck */
    /* SUPPRESS CHECKSTYLE MemberNameCheck */ 

      // SUPPRESS CHECKSTYLE MemberNameCheck
      /* SUPPRESS CHECKSTYLE MemberNameCheck */
    /* SUPPRESS CHECKSTYLE MemberNameCheck */ 

    
    // ALLOW MemberName ON NEXT LINE
    
    

    
    
    // ALLOW MemberName ON PREVIOUS LINE
    

    
    
        // ALLOW ConstantName UNTIL THIS LINE+2
    
    
    
    
        /* ALLOW MemberName UNTIL THIS LINE-3 */
    

    // ALLOW Unused UNTIL THIS LINE+5
    public static void doit1(int aInt) // this is +1
    {
    }

    public static void doit2(int aInt) // this is +5
    {
    }

    public static void doit3(int aInt) // this is +9
    {
    }

    public void doit4()
    {
        try {
            // blah blah blah
            for(int i = 0; i < 10; i++) {
                // blah blah blah
                while(true) {
                    try {
                        // blah blah blah
                    } catch (Exception | Throwable e) {
                        // bad bad bad
                    }
                }
                // blah blah blah
            }
            // blah blah blah
        } catch(Exception ex) {
            // ALLOW CATCH Exception BECAUSE I am an exceptional person.
        }
    }
}

class Magic {
    /* SUPPRESS CHECKSTYLE MemberNameCheck */ /* SUPPRESS CHECKSTYLE MemberName ol */
    
}
