package com.puppycrawl.tools.checkstyle.checks.coding.finallocalvariable;


public class InputFinalLocalVariableLeavingSlistToken {

    
    

    {
        assignedInInstanceInitAndCtor = 1;
    }

    static {
        assignedInStaticInitAndFoo1 = 1;
    }

    InputFinalLocalVariableLeavingSlistToken() {
        assignedInInstanceInitAndCtor = 2;
    }

    void foo1() {
        assignedInStaticInitAndFoo1 = 2;
    }

    void foo2() {
        
        
    }
}
