////////////////////////////////////////////////////////////////////////////////
// Test case file for FOR_ITERATION and whitespace.
// Created: 2003
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.coding.modifiedcontrolvariable;
class InputModifiedControlVariableBothForLoops
{
    int k;    
    private int i;
    void method1()
    {
        //Violations:
        for (int i = 0; i < 1; i++) {
            i++;
        }
        for (int i = 0; i < 1; i++) {
            i = i + 1;
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; i++) {
                --i;
            }
        }
        

        // Ok:
        for (int i = 0; i < 1; i++) {
        }
        for (int i = 0; i < 1; i++) {
            
        }
        for (int i = 0; i < 1; i++) {
            
        }
        for (int k = 0; k < 1; k++) {
            this.k++;
        }

        String[] sa = {"a", "b"};
        
        
        for (int i = 0; i < 10;) {
            i++;
        }
        
        for (int i = 0; i < 10; ) {
            i = 11;
        }
        
        for (int i = 0; i < 10; java.sql.Date.valueOf(""), this.i++, w++) {
            i++;
            w++;
        }
        for (int i = 0, k = 0; i < 10 && k < 10; ++i, ++k) {
            i = i + 3;
            k = k + 4;
        }
        

        
        for (int i = 0; i < 10; i += 1) {
            for (i = 7; i < 10; i += 1) { }
        }
        

        for (i = 0; i < 10; i++) {
            
            name = "";
        }
        for (int EXPR = 0; EXPR < 1; EXPR++) {
            for (int j = 0; j < 1; i++) {
                i++;
            }
        }
    }
}

@SuppressWarnings(value = "this previously caused NullPointerException")
class VariableDeclaredBeforeTheFirstBlockBegins {
    void foo(final String[] requests) {
        
    }
}
abstract class NestedClass {
    public abstract void method();
}
