package com.puppycrawl.tools.checkstyle.checks.coding.requirethis;

public final class InputRequireThisBraceAlone {
    protected void test() throws Exception {
        {
            

            var1 = true;
        }

        {
            

            var2 = true;
        }
    }
}
