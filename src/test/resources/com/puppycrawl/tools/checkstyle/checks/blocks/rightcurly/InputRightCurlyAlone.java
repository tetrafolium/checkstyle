package com.puppycrawl.tools.checkstyle.checks.blocks.rightcurly;

public class InputRightCurlyAlone {

    
    
    {  a = 2; }  //violation
    static {
        b = 3; }  //violation

    void method1() {
        
    }

    void method2(final java.util.HashSet<String> set) {
        

         //NO violation
    }

    void method3() {
        method2(new java.util.HashSet<String>() {{
            add("XZ13s");
            add("AB21/X");
            add("YYLEX");
            add("AR5E");
        }});  //violation
    }

    int method4(final int a) {
        if (a > 2) a *= 10; return ++a; }   //violation

    void method5(final int a) {
        while (a > 5) {
            a--; }  //violation

        if (a > 4) {
            a++;
        }  //violation

        do {
            a--; } while (a > 3);  //violation

        for (int i = 1; i < 10; i++) {
             }  //violation

        if (a < 2) {
            --a;
        } else if (a > 3) { a++; } //2 violations

        java.util.List<String> list = new java.util.ArrayList<>();
        list.stream()
                .filter(e -> {
                    return !e.isEmpty() && !"null".equals(e); })
                .collect(java.util.stream.Collectors.toList());
    }

    void method6(final int a) {
        
    }

    public @interface TestAnnotation { } //violation

    public @interface TestAnnotation1 { String value(); } //violation

    public @interface TestAnnotation2 {
        String value(); } //violation

    public @interface TestAnnotation3 {
        String value();
    }

    public @interface TestAnnottation4 { String value();
    }
}
