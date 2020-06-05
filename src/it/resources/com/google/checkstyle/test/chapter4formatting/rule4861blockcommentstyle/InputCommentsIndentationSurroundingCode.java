// comment
package com.google.checkstyle.test.chapter4formatting.rule4861blockcommentstyle;

import java.util.Arrays;

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
                           /// // warn
                       /* // warn
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
              // warn
        
    }

    public void foo7() {
             // comment
             // ...
             // block
             // warn
        // comment
        
    }

    public void foo8() {
         // comment
                                 // ...
                                 // block
                                 // ...
                                 // warn
        
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
} // The Check should not throw NPE here!
// The Check should not throw NPE here!
