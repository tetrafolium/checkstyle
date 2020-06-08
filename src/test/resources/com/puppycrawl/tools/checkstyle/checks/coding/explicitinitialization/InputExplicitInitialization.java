package com.puppycrawl.tools.checkstyle.checks.coding.explicitinitialization;

public class InputExplicitInitialization {
    
    
    
    
    
    
    
    
    
    
    java.lang.String str1 = null, str3 = null;
    int ar1[] = null;
    int ar2[] = new int[1];
    int ar3[];
    float f1 = 0f;
    double d1 = 0.0;

    static char ch;
    static char ch1 = 0;
    static char ch2 = '\0';
    static char ch3 = '\1';

    void method() {
        
        
    }
}

interface interface1{
    int TOKEN_first = 0x00;
    int TOKEN_second = 0x01;
    int TOKEN_third = 0x02;
}

class InputExplicitInit2 {
    
    
}

enum InputExplicitInit3 {
    A,
    B
    {
        private int x = 0;
        private Bar<String> bar = null;
        private Bar<String>[] barArray = null;
        private int y = 1;
    };
    private int x = 0;
    private Bar<String> bar = null;
    private Bar<String>[] barArray = null;
    private int y = 1;
    private Boolean booleanAtt = false;
}

@interface annotation1{
    int TOKEN_first = 0x00;
    int TOKEN_second = 0x01;
    int TOKEN_third = 0x02;
}

class ForEach {
    public ForEach(java.util.Collection<String> strings)
    {
        
    }
}

class Bar<T> {
}

class Chars {
    char a;
    char b = a;
    byte c = 1;
    short d = 1;
    final long e = 0;
}

class Doubles {
    final double subZero = -0.0;
    final double nan = Double.NaN;
    
    
}
