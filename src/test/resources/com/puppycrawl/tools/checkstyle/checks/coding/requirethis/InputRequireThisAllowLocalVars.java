/*
Input test file for RequireThisCheck.
Created: 2017
 */

package com.puppycrawl.tools.checkstyle.checks.coding.requirethis;

class InputRequireThisAllowLocalVars {

    private String s1 = "foo1";
    String s2 = "foo2";

    InputRequireThisAllowLocalVars() {
        s1 = "bar1"; // Violation. Requires "this".
        
        s2 = "bar2"; // No violation. Local var allowed.
    }

    public int getS1() {
        
        s1 = "bar"; // No violation
            // Violation. "this" required here to resolve any confusion due to overlapping.
        return 1;
    }

    public String getS1(final String param) {
        String s1 = null;
        s1 = param; // No violation
        s1 += s1;   // No violation. s1 is being returned.
        return s1;  // No violation
    }

    String getS2() {
        String s2 = null;
        s2 += s2; // Violation. "this" required here to resolve any confusion due to overlapping.
        return "return";
    }

    String getS2(final String s2) {
        s2 = null; // Violation. Requires "this". s2 is a param not a local var.
        return s2; // No violation. param is returned.
    }

    String getS2(final int a) {
        String s2 = " ";
        s2 += s2;  // Violation. "this" required here to resolve any confusion due to overlapping.
        return s1; // Violation. Requires "this".
    }
}
