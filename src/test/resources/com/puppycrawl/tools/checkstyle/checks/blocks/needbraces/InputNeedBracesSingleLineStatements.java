package com.puppycrawl.tools.checkstyle.checks.blocks.needbraces;

public class InputNeedBracesSingleLineStatements
{    

    int[] sourceLocators;
    private static class SomeClass {
        boolean flag = true;
        private static boolean test(final boolean k) {
            return k;
        }
    }

    private int foo() {
        if (SomeClass.test(true)) return 4; //No warning if 'mAllowSingleLineIf' is true
        return 0;
    }

    private int foo1() {
        if (SomeClass.test(true)) return 4;  //No warning if 'mAllowSingleLineIf' is true
        return 0;
    }

    private int foo2() {
        if (SomeClass.test(true)) //Warning, not single-line if-statement
            return 4;
        return 0;
    }

    private int foo3() {
        if (SomeClass.test(true)) return 4; //Warning, complex block
        return 0;
    }

    private void foo(final Object o) {
        if (o != null) this.notify();
    }

    private void foo2(final Object o) {
        if (o != null)
            this.notify();
    }

    private void loopTest(final Object o) {
        while (o != null) {
            this.notify();
        }
        while (o != null) {
            this.notify();
        }
        while (o != null) {
            this.notify();
        }
        do {
            this.notify();
        } while (o != null);
        do this.notify(); while (o != null);
        do
            this.notify();
        while (o != null);
        for (;;) {
            break;
        }
        for (;;) {
            break;
        }
        for (int i = 0; i < 10; i++) {
             this.notify();
        }
        for (int i = 0; i < 10; i++) {
            this.notify();
        }
        
    }

    private int getSmth(final int num)
    {
        int counter = 0;
        switch (num) {
            case 1: counter++; break;
            case 2:
                counter += 2;
                break;
            case 3:
                counter += 3;
                break;
            case 6: counter += 10; break;
            default: counter = 100; break;
        }
        return counter;
    }

    private void testElse(final int k) {
        if (k == 4) System.identityHashCode("yes");
        else System.identityHashCode("no");
        for (;;) {
            ;
        }
    }

    private int testMissingWarnings() {
        throw new RuntimeException();
        {
            return 1;
        }
    }

    void enhancedForLoop(final int[] array) {
        
    }

    private class StateInfo {
        public boolean isInitial() {
            for (int locator: sourceLocators) {
                if (locator != 0) return false;
            }
            return true;
        }
    }

    private void forEachLoop() {
        
        
        for (;;) {
            ;
        }
    }
    private void method() {
        
        switch (1) {
            case 1: return;
            default: throw new RuntimeException("");
        }
    }
}
