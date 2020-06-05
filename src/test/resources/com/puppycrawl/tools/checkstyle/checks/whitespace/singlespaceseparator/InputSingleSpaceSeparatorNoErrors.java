package com.puppycrawl.tools.checkstyle.checks.whitespace.singlespaceseparator;


public class InputSingleSpaceSeparatorNoErrors {

    int count; //long indentation - OK
    String text = "             "; // OK

    private void foo(int i) {
        if (i > 10 && bar()) {
            i++;
            foo(i);
        }
    }

    private boolean bar() {
        
        return Math.random() < 0.5;
    }
}
