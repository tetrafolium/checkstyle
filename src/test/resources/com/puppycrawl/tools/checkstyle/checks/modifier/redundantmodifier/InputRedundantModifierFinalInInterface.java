package com.puppycrawl.tools.checkstyle.checks.modifier.redundantmodifier;


public interface InputRedundantModifierFinalInInterface {
        final int k = 5; // violation

    default int defaultMethod(final int x) {
            if (k == 5) {
                      //No violation here!
                    for (; ;) {
                              //No violation here!
                    }
            }
        final int square = x * x;  //No violation here!
        return square;
    }
}
