////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.google.checkstyle.test.chapter6programpractice.rule62donotignoreexceptions;


class InputEmptyBlockCatch {
    boolean flag;
    void doSm() { }
    void foo() {
        try {
           if (!flag) {
               doSm();
           }
        } catch (Exception e) { /* ignore */ } //ok
         //ok
    }

    void foo2() {
        try {
           if (!flag) {
               doSm();
           }
        } catch (Exception e) { }  //warn
    }

    class Inner {
        boolean flag;
        void doSm() { }
        void foo() {
            try {
               if (!flag) {
                   doSm();
               }
            } catch (Exception e) { /* ignore */ } //ok
             //ok
        }

        void foo2() {
            try {
               if (!flag) {
                   doSm();
               }
            } catch (Exception e) { }  //warn
        }
    }

    Inner anon = new Inner() {
        boolean flag;
        void doSm() { }
        void foo() {
            try {
               if (!flag) {
                   doSm();
               }
            } catch (Exception e) { /* ignore */ } //ok
             //ok
        }

        void foo2() {
            try {
               if (!flag) {
                   doSm();
               }
            } catch (Exception e) { }  //warn
        }
    };

    void bar1() {
        try {
           if (!flag) {
               doSm();
           }
        } catch (Exception expected) { }
    }

    void bar2() {
        try {
           if (!flag) {
               doSm();
           }
        } catch (Exception expected) { }
    }
}
