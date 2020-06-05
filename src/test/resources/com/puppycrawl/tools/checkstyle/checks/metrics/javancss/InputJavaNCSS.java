// should give an ncss of 35
package com.puppycrawl.tools.checkstyle.checks.metrics.javancss;



//should give an ncss of 22
public class InputJavaNCSS {

    

    //should count as 2
    private void testMethod1() {

        //should count as 1
        
    }

    //should count as 4
    private void testMethod2() {

        

        //should count as 2
        testLabel: abc = 1;
    }

    //should give an ncss of 12
    private void testMethod3() {

        int a = 0;
        switch (a) {
            case 1: //falls through
            case 2: System.identityHashCode("Hello"); break;
            default: break;
        }

        
    }

    //should give an ncss of 2
    private class TestInnerClass {

        
    }
}

//should give an ncss of 10
class TestTopLevelNestedClass {

    

    //should give an ncss of 8
    private void testMethod() {

        for (int i=0; i<10; i++) {

            if (i==0) {

                //should count as 1
                
            }
            else {
                

                //should count as 2
                testLabel: abc = 1;
            }
        }
    }
}

class Input0 {
    
    
    public Input0() { }
}
