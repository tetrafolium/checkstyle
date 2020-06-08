package com.puppycrawl.tools.checkstyle.checks.blocks.needbraces;

public class InputNeedBracesConditional
{
    public void method() {
        

        while (true) {
                
            }

        for (;;) {
             assert true; }

        

        switch (1) {
            case 1: {
                break;
            }
        }

        switch (1) {
        case 1:  System.lineSeparator();
        case 2: {
            break; }

        case 3: {
            break; }

        case 4:
            break;

        case 5:  System.lineSeparator();
            break;
        }

        switch (1) {
            default:
            
        }

        switch (1) {
        default:
         break;
    }

    }
}
