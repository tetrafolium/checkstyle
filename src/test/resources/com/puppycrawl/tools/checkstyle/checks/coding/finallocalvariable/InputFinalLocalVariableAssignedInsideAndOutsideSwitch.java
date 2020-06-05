package com.puppycrawl.tools.checkstyle.checks.coding.finallocalvariable;


public class InputFinalLocalVariableAssignedInsideAndOutsideSwitch {

    private static void foo1(final int[][] m, final int x, final int y,
                                final int d, final int[] regionSizes) {
        
        int b;
        switch (d) {
            case 1:
                b = m[y - 1][x];
                break;
            case 2:
                b = m[y][x - 1];
                break;
            case 3:
                b = m[y][x + 1];
                break;
            default:
                b = m[y + 1][x];
                break;
        }
        b &= 5;
    }

    private static void foo2(final int[][] m, final int x, final int y,
                                final int d, final int[] regionSizes) {
        
         // violation
        switch (d) {
            case 1:
                break;
            case 2:
                b = m[y][x - 1];
                break;
            case 3:
                b = m[y][x + 1];
                break;
            default:
                b = m[y + 1][x];
                break;
        }
    }

    private static void foo3(final int[][] m, final int x, final int y,
                                 final int d, final int[] regionSizes) {
        
        int b;
        switch (d) {
            case 1:
            case 2:
            case 3:
                b = m[y][x + 1];
                break;
            default:
                b = m[y + 1][x];
                break;
        }
        b &= 5;
    }
}
