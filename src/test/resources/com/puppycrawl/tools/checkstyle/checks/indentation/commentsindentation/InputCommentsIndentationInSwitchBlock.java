package com.puppycrawl.tools.checkstyle.checks.indentation.commentsindentation;

public class InputCommentsIndentationInSwitchBlock {

    private static void fooSwitch() {
        switch("") {
            case "0": //some comment
            case "1":
                // my comment
                foo1();
                break;
            case "2":
                // my comment
                //comment
                foo1();
                // comment
                break;
            case "3":
            /* violation */
                foo1();
                /* com */
                break;
            case "5":
                foo1();
                   // violation
            case "6":
                
                // fall through
            case "7":
                
                   // violation
            case "8":
                break;
            case "9":
                foo1();
                // fall through
            case "10": 
            case "11": 
            case "28": 
            case "12": 
            case "13": 
            case "14": 
            case "15": {
                foo1();
                      // violation
            }
            case "16": 
            // fall through
            case "17": 
              // violation
                case "18": { System.lineSeparator();
                }   // trailing comment
            case "19":
                // comment
            case "20":
            // comment
            case "21":
            default:
                // comment
                break;
        }
    }

    private static void foo1() {
        {
            switch(1) {
                case 0:

                case 1:
                        // violation
                    
                default:
                 // comment
            }

        }
    }

    public void fooDotInCaseBlock() {
        int i = 0;
        String s = "";

        switch (i) {
            case -2:
                // what
                i++;
                // no break here
            case 0:
                // what
                s.indexOf("ignore");
                // no break here
            case -1:
                 // what
                 s.indexOf("no way");
               // violation
            case 1:
            case 2:
                i--;
                // no break here
            case 3: 
            // fall through


        }

        
    }

    public void foo2() {
        int a = 1;
        switch (a) {
            case 1:
            default:
    // violation
        }
    }

    public void foo3() {
        int a = 1;
        switch (a) {
            case 1:
            default:

                // comment
        }
    }

    public void foo4() {
        int a = 1;
        switch (a) {
            case 1:
                
                  // violation
            default:
        }
    }

    public void foo5() {
        int a = 1;
        switch (a) {
            case 1:
                
            // comment
            default:
        }
    }

    public void foo6() {
        int a = 1;
        switch (a) {
            case 1:
                
                // comment
            default:
        }
    }

    public void foo7() {
        int a = 2;
        String s = "";
        switch (a) {
            // comment
            // comment
            // comment
            case 1:
            case 2:
                // comment
                // comment
                foo1();
                // comment
            case 3:
                // comment
                // comment
                // comment
            case 4:
    // violation
            case 5:
                s;
                      // violation
                    // violation
                 // violation
            default:
        }
    }

    public void foo8() {
        int a = 2;
        String s = "";
        switch (a) {
            // comment
            // comment
            // comment
            case 1:
            case 2:
                // comment
                // comment
                foo1();
                // comment
            case 3:
                // comment
                // comment
                s;
                // comment
            case 4:
      // violation
            default:
        }
    }

    public void foo9() {
        int a = 5;
        switch (a) {
            case 1:
            case 2:
                // comment
        }
    }

    public void foo10() {
        int a = 5;
        switch (a) {
            case 1:
            default:
                // comment
        }
    }

    public void foo11() {
        int a = 5;
        switch (a) {
            case 1:
            case 2:
                // comment
        }
    }

    public void foo12() {
        int a = 5;
        switch (a) {
            // comment
            case 1:
        }
    }

    public void foo13() {
        int a = 5;
        switch (a) {
            case 1:
                /* comment */
            case 2:
                hashCode();
           /*
            violation
            */
            case 3: // comment
                hashCode();
           // violation
            case 4: // comment
                
                // comment
            case 5:
                
                break;
                // comment
            case 6:
                
                // comment
            case 7:
                break;
        }
    }

    public void foo14() {
        int a = 1;
        switch (a) {
            case 1:
            default:
// violation
        }
    }

    public void foo15() {
        int a = 1;
        switch (a) {
            case 1:
            default:
        // violation
        }
    }
}
