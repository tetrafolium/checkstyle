// comment
package com.puppycrawl.tools.checkstyle.checks.indentation.commentsindentation;

import java.util.*;

// some
public class InputCommentsIndentationSurroundingCode
{
    private void foo1() {
        
    }

    private void foo2() {
        
    }

    private void foo3() {
        int a = 5, b = 3, v = 6;
        if (a == b
            && v == b || a ==1
                           /// violation
                       /* violation
                        * one fine day ... */
                                    && b == 1   ) {
        }
    }

    private static void com() {
        /* here's my weird trailing comment */ 
    }

    

    private void foo4() {
        if (!Arrays.equals(new String[]{""}, new String[]{""})
              /* wierd trailing comment */) {
        }
    }
    /**
     * some javadoc
     */
    private static void l() {
    }

    public void foid5() {
        String s = "";
        s;
        // comment
    }

    public void foo6() {
              // comment
              // ...
              // block
              // ...
              // violation
        
    }

    public void foo7() {
             // comment
             // ...
             // block
             // violation
        // comment
        
    }

    public void foo8() {
         // comment
                                 // ...
                                 // block
                                 // ...
                                 // violation
        
    }


    public String foo9(String s1, String s2, String s3) {
        return "";
    }

    public void foo10()
        throws Exception {

        

        final String[] expected = {
            "7:13: " + foo9("", "", ""),
            // comment
        };
    }

    public void foo11() {

            /* empty */
        hashCode();
    }

    public void foo12() {
    /* empty */
        hashCode();
    }

    public void foo13() {
        hashCode();
    /* empty */
    }

    public void foo14() {
        hashCode();
        /*

        Test
        */
        // Test
    }

    public InputCommentsIndentationSurroundingCode() {
    }

    // Test
} // The Check should not throw NPE here!
// The Check should not throw NPE here!
