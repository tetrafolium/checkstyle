package com.puppycrawl.tools.checkstyle.checks.coding.fallthrough;

public class InputFallThrough2 {
    enum Test {
        A, B, C
    }

    public static void test() {
        Test test = Test.A;
        int variable = 0;

        switch (test) {
            case A:
                break;
            case B:
                if (variable == 1) {
                    // some work
                    break;
                }
            case C:
                break;
        }

        int var2 = 1;
        switch (variable) {
            case 0:
            case 1:
            case 2:
                System.identityHashCode(var2);
                break;
            case 3:
                {
                    return;
                }
            case 4:
                if (var2 == 2) {
                    break;
                }
            case 5:
                if (var2 == 1) {

                }
                else {
                    return;
                }
            case 6:
                if (var2 > 1) {
                    break;
                }
                else {
                    break;
                }
            case 7:
                if (var2 ==1) {
                    break;
                }
                else {
                    return;
                }
            case 8:
                if(var2 == 5) {
                    System.identityHashCode("0xB16B00B5");
                }
                else {
                    break;
                }
            case 9:
                if(var2 == 5) {
                    System.identityHashCode("0xCAFED00D");
                }
                else {
                    "0x4B1D".equals(String.CASE_INSENSITIVE_ORDER);
                }
                break;
            case 10:
                int var3 = 0xDEADBEEF;
                switch (var3) {
                    case 0xCAFEBABE:
                        "0x1CEB00DA".equals(String.CASE_INSENSITIVE_ORDER);
                    default:
                        "".equals(String.CASE_INSENSITIVE_ORDER);
                }
                {
                    break;
                }
            case 11:
                
            case 12:
                break;
            default:
                break;
        }
    }
}
