package com.puppycrawl.tools.checkstyle.checks.blocks.rightcurly;

public class InputRightCurlyAloneOrSingleline {    

    private int var1;    
    private int var2;

    public boolean equals(final Object other) {
        boolean flag = true; return flag; }

    public int hashCode()
    {
        
        return 1;
    }

    private void foo()
    {
         var2 = 6; }

    private void foo1() {
        return; }

    private String foo2() {
        return toString();
    }

    private void foo3() {
         return; }
    public InputRightCurlyAloneOrSingleline() {
        this.var1 = 1; }
    public InputRightCurlyAloneOrSingleline(final int v1, final int v2) {
        this.var1 = v1; this.var2 = v2; }

    private void foo4() {
         }

    private void foo5() {
         }

    private void foo6() {  }

    private void foo12() {
        try {
             
        } catch (Exception e) { }
    }

    private void foo13() {
        for (int i = 0; i < 10; i++) {
              }

        do
        {
            var1 = 2;
        }
        while (var2 == 2);
    }

    

    

    private void foo14() {
        if (var1 > 0) {
            return;
        }
    }

    private void foo15() {
        class A { int a; } var1++; //violation
        class B {  }
        
    }

    private void foo16() {
        {
            return;
        } //violation
        
    }

    void f17() {
         var2 = 6; } private void f18() {
             var2 = 6; } //violation

    private void foo19() {
        
        var2 = 6; } //violation

    private String foo20() {
        do {
            var2++; }
        while (var2 < 15);

        while (var1 < 10) {
            var1++; }

        do {
            var2++; var1++; } while (var2 < 15); return "" + 0xCAFEBABE; //violation
    }

    private void foo21() {
        new Object() { @Override protected void finalize() {
            "".toString(); }};
    }

    void foo22() {
        
        try {
            
            toString();
        } catch (Exception e) { //violation
            throw new RuntimeException(e);
        } finally {
            toString();
        } //violation
    }

    void doDoubleBraceInitialization() {
         //NO violation

        
        new Object() { @Override protected void finalize() {
            "".toString(); }  };
        new Object() {                                int b = 10; @Override protected void finalize() {
            "".toString(); }
};
        new Object() {                                           int d = 8; protected void finalize() {
            hashCode(); }  
};

        

         //violation

        

        foo23(new java.util.HashSet<String>() {{
            add("XZ13s");
            add("AB21/X");
            add("YYLEX");
            add("AR5E");
        }});  //violation

        foo23(new java.util.HashSet<String>() {{
            add("XZ13s");
            add("AB21/X");
            add("YYLEX");
            add("AR5E");
        }}); } //2 violations


    void foo23(final java.util.HashSet<String> set) {
    }

    void foo25() {
        for (int i = 0; i < 10; i++) {
            System.identityHashCode("Hello, world!");
        }} //violation

    void foo26() {
        for (int i = 0; i < 10; i++) {
            System.identityHashCode("Hello, world!"); }} //violation

    void foo27() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                 }}} //violation

    private java.util.ArrayList<Integer> foo28(final int delta) {
        return new java.util.ArrayList<Integer>() {
            @Override public int size() {
                return Math.max(0, super.size() + 1); };
        };
    }

    private void foo29() {
        boolean flag = true;
        if (flag) {
            System.identityHashCode("heh");
            flag = !flag;
        }
        "Xe-xe".equals(String.CASE_INSENSITIVE_ORDER.//violation
            equals);
    }

    void foo30() {
        {
            getClass();
        } // violation

        for (int i = 0; i == 0; i++) {
            getClass(); } // violation

        while (true) {
            getClass(); } // violation
    }

    public void emptyBlocks() {
        try {
            // comment
        } catch (RuntimeException e) { // violation
            new Object();
        } catch (Exception e) { // violation
            // comment
        } catch (Throwable e) { // violation
        } 

        while (true) {
        } // violation
    }

    public void codeAfterLastRightCurly() {
        while (new Object().equals(new Object())) {
        } // violation
        for (int i = 0; i < 1; i++) {
            new Object(); } // violation
    }

    public @interface TestAnnotation { }

    public @interface TestAnnotation1 { String value(); }

    public @interface TestAnnotation2 {
        String value(); } //violation

    public @interface TestAnnotation3 {
        String value();
    }

    public @interface TestAnnottation4 { String value();
    }
}
