package com.google.checkstyle.test.chapter4formatting.rule411bracesareused;


class InputNeedBraces
{
    /** @return helper func **/
    boolean condition()
    {
        return false;
    }

    /** Test do/while loops **/
    void testDoWhile()
    {
        // Valid
        do {
            testDoWhile();
        }
        while (condition());

        // Invalid
        do testDoWhile(); while (condition()); //warn
    }

    /** Test while loops **/
    void testWhile()
    {
        // Valid
        while (condition()) {
            testWhile();
        }

        // Invalid
        while (condition()) {
            ;
        } //warn
        while (condition()) {  //warn
            testWhile();
        }
        while (condition()) {  //warn
            if (condition()) //warn
                testWhile();
        }
    }

    /** Test for loops **/
    void testFor()
    {
        // Valid
        for (int i = 1; i < 5; i++) {
            testFor();
        }

        // Invalid
        for (int i = 1; i < 5; i++) {
            ;
        } //warn
        for (int i = 1; i < 5; i++) {  //warn
            testFor();
        }
        for (int i = 1; i < 5; //warn
             i++) {
            if (i > 2) //warn
                testFor();
        }
    }

    /** Test if constructs **/
    public void testIf()
    {
        // Valid
        if (condition()) {
            testIf();
        } else if (condition()) {
            testIf();
        } else {
            testIf();
        }

        // Invalid
        if (condition()) //warn
        if (condition()) //warn
            testIf();
        if (condition()) //warn
            testIf();
        else //warn
            testIf();
        if (condition()) //warn
            testIf();
        else {
            testIf();
        }
        if (condition()) {
            testIf();
        } else //warn
            testIf();
        if (condition()) //warn
            if (condition()) //warn
                testIf();
    }

    void whitespaceAfterSemi()
    {
        //reject
         

        //accept
        for (;;) {
        }
    }

    /** Empty constructor block. **/
    public InputNeedBraces() { }

    /** Empty method block. **/
    public void emptyImplementation() { }
}

class EmptyBlocks {
    boolean flag = true;
    int[] a = {1, 2, 3, 4, };

    void foo() {
        while (flag) {
            ;
        } //warn
        while (flag) { }
        while (flag) { /*foo*/ }
        do  //warn
        while (flag);
        do { }
        while (flag);
        do { /*foo*/ }
        while (flag);
        if (flag) //warn
        if (flag) { }
        if (flag) { /*foo*/ }
        if (flag) //warn
        else  //warn
        if (flag) { }
        else { }
        if (flag) { /*foo*/ }
        else { /*foo*/ }
        for (int i = 0; i < 10; i++) {
            ;
        } //warn
        for (int i = 0; i < 10; i++) { }
        for (int i = 0; i < 10; i++) { /*foo*/ }
         //warn
        
        
    }

    class InnerEmptyBlocks {
        boolean flag = true;
        int[] a = {1, 2, 3, 4, };

        void foo() {
            while (flag) {
                ;
            } //warn
            while (flag) { }
            while (flag) { /*foo*/ }
            do  //warn
            while (flag);
            do { }
            while (flag);
            do { /*foo*/ }
            while (flag);
            if (flag) //warn
            if (flag) { }
            if (flag) { /*foo*/ }
            if (flag) //warn
            else  //warn
            if (flag) { }
            else { }
            if (flag) { /*foo*/ }
            else { /*foo*/ }
            for (int i = 0; i < 10; i++) {
                ;
            } //warn
            for (int i = 0; i < 10; i++) { }
            for (int i = 0; i < 10; i++) { /*foo*/ }
             //warn
            
            
        }
    }

    InnerEmptyBlocks anon = new InnerEmptyBlocks() {
        boolean flag = true;
        int[] a = {1, 2, 3, 4, };

        void foo() {
            while (flag) {
                ;
            } //warn
            while (flag) { }
            while (flag) { /*foo*/ }
            do  //warn
            while (flag);
            do { }
            while (flag);
            do { /*foo*/ }
            while (flag);
            if (flag) //warn
            if (flag) { }
            if (flag) { /*foo*/ }
            if (flag) //warn
            else  //warn
            if (flag) { }
            else { }
            if (flag) { /*foo*/ }
            else { /*foo*/ }
            for (int i = 0; i < 10; i++) {
                ;
            } //warn
            for (int i = 0; i < 10; i++) { }
            for (int i = 0; i < 10; i++) { /*foo*/ }
             //warn
            
            
        }
    };
}
