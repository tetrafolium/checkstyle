package com.puppycrawl.tools.checkstyle.checks.coding.finallocalvariable;

public class InputFinalLocalVariableMultiCatch {
    public void demo() throws Throwable {
        try {
            // do nothing
        } catch (NumberFormatException | IllegalStateException | NullPointerException ex) {
            // do nothing
        }
    }
}
