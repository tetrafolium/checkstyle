package com.google.checkstyle.test.chapter4formatting.rule4843defaultcasepresent;

public class InputMissingSwitchDefault {
    public void foo() {
        int i = 1;
        switch (i) {
        case 1: i++; break;
        case 2: i--; break;
        default: return;
        }
        
    }
}

class bad_test {
    public void foo() {
        int i = 1;
        switch (i) { // warn
        case 1: i++; break;
        case 2: i--; break;
        }
        
    }

    class inner
    {
        public void foo1() {
            int i = 1;
            switch (i) { // warn
            case 1: i++; break;
            case 2: i--; break;
        }
            
        }
    }
}

interface Foo {
    public void foo();
}
