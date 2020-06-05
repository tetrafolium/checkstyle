package com.puppycrawl.tools.checkstyle.checks.whitespace.nowhitespacebefore;

public class InputNoWhitespaceBeforeEmptyForLoop {

    public static void f() {
        for (; ; ) { // OK
            break;
        }
        
        
        for (int x = 0; x < 10; ) { // OK
            break;
        }
        for (int x = 0; x < 10 ; ) { // VIOLATION
            break;
        }
    }
}
