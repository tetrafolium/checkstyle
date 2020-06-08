package com.puppycrawl.tools.checkstyle.checks.whitespace.singlespaceseparator;

public class InputSingleSpaceSeparatorComments {
    /* always correct */ int i = 0;
    int   /* wrong if X is enabled */     j = 0;
    int k;   // Multiple whitespaces before comment

    /**
     * Always correct
     */
    void foo() {
        /* Always correct */
             // <- a tab
    }  // Wrong if X is enabled
}
