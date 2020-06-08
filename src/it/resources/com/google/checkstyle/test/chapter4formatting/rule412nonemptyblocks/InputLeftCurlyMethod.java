package com.google.checkstyle.test.chapter4formatting.rule412nonemptyblocks;

class InputLeftCurlyMethod
{ //warn
    InputLeftCurlyMethod() { } //ok
    InputLeftCurlyMethod(final String aOne) { //ok
    }
    InputLeftCurlyMethod(final int aOne)
    { //warn
    }

    void method1() { } //ok
    void method2() { //ok
    }
    void method3()
    { //warn
    }
    void                                                               method4()
    { //warn
    }
    void method5(final String aOne,
                 final String aTwo)
    { //warn
    }
    void method6(final String aOne,
                 final String aTwo) { // ok
    }
}

enum InputLeftCurlyMethodEnum
{ //warn
    CONSTANT1("hello")
    { //warn
        void method1() { } //ok
        void method2() {
        } //ok
        void method3()
        { //warn
        }
        void                                                               method4()
        { //warn
        }
        void method5(final String aOne,
                     final String aTwo)
        { //warn
        }
        void method6(final String aOne,
                     final String aTwo) { //ok
        }
    },

    CONSTANT2("hello") { //ok

    },

    CONSTANT3("hellohellohellohellohellohellohellohellohellohellohellohellohellohello")
    { //warn
    };

    private InputLeftCurlyMethodEnum(final String value)
    { //warn

    }

    void method1() { } //ok
    void method2() { //ok
    }
    void method3()
    { //warn
    }
    void                            method4()
    { //warn
    }
    void method5(final String aOne,
                 final String aTwo)
    { //warn
    }
    void method6(final String aOne,
                 final String aTwo) { // ok
    }
}

