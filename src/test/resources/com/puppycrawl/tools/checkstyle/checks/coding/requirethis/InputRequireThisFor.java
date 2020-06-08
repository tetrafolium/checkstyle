package com.puppycrawl.tools.checkstyle.checks.coding.requirethis;


public class InputRequireThisFor {
    
    int bottom;

    public void method1() {
        for (int i = 0; i < 10; i++) {
            int bottom = i - 4;
            bottom = bottom > 0 ? bottom - 1 : bottom;
        }
    }

    public void method2() {
        

        
    }
}
