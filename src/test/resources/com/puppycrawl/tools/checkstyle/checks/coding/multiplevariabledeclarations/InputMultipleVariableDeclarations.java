package com.puppycrawl.tools.checkstyle.checks.coding.multiplevariabledeclarations;
public class InputMultipleVariableDeclarations
{
    int i, j;
    int i1; int j1;    
    // second definition is wrapped
    // line of VARIABLE_DEF is not the same as first line of the definition
    java.lang.String string;
java.lang.String
        strings[];    
    //both definitions is wrapped
    java.lang.
        String string1;
java.lang.String
            strings1[];

    void method1() {
        
         
    }

    void method2() {
        

        for (int i = 0; i < 4; i++) {

        }

        switch ("") {
        case "6":
            
        }
    }

    void method3() {
           
        
    }
}
