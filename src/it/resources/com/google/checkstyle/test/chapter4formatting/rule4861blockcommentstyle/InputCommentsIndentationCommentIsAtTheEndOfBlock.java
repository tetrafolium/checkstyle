package com.google.checkstyle.test.chapter4formatting.rule4861blockcommentstyle;




/**
 * Contains examples of using comments at the end of the block.
 */
public class InputCommentsIndentationCommentIsAtTheEndOfBlock {

    public void foo1() {
        foo2();
        // OOOO: missing functionality
    }

    public void foo2() {
        foo3();
                         // warn
    }

    public void foo3() {
        foo2();
        // refreshDisplay();
    }

    public void foo4() {
        foooooooooooooooooooooooooooooooooooooooooo();
        // ^-- some hint
    }

    public void foooooooooooooooooooooooooooooooooooooooooo() { }

     /////////////////////////////// warn (a single line border to separate a group of methods)

    public void foo7() {
        
// warn
    }

    /////////////////////////////// (a single line border to separate a group of methods)

    public void foo8() { }

    public class TestClass {
        @Test
        public void test() {
            
               // warn
        }
          // warn
    }

    public void foo9() {
        this.foo1();
             // warn
    }

    //    public void foo10() {
    //
    //    }

    public void foo11() {
        String
            .valueOf(Integer.valueOf(0))
            .trim()
            .length();
        // comment
    }

    public void foo12() {
        String
            .valueOf(Integer.valueOf(0))
            .trim()
            .length();
                  // warn
    }

    public void foo13() {
        String.valueOf(Integer.valueOf(0))
                .trim()
                .length();
        // comment
    }

    public void foo14() {
        String.valueOf(Integer.valueOf(0))
            .trim()
            .length();
                               // warn
    }

    public void foo15() {
        String
              .valueOf(Integer.valueOf(0));
        // comment
    }

    public void foo16() {
        String
            .valueOf(Integer.valueOf(0));
                     // warn
    }

    public void foo17() {
        String
            .valueOf(Integer.valueOf(0))
            .trim()
            // comment
            .length();
    }

    public void foo18() {
        String
            .valueOf(Integer.valueOf(0))
            .trim()
                             // warn
            .length();
    }

    public void foo19() {
        (new Thread(new Runnable() {
            @Override
            public void run() {

            }
        })).
            run();
        // comment
    }

    public void foo20() {
        (new Thread(new Runnable() {
            @Override
            public void run() {

            }
        })).
            run();
                          // warn
    }

    public void foo21() {
        int[] array = new int[5];

        java.util.List<String> expected = new java.util.ArrayList<>();
        for (int i = 0; i < 5; i++) {
        org.junit.Assert.assertEquals(expected.get(i), array[i]);
        }
        
        // the above example was taken from hibernate-orm and was modified a bit
    }

    public void foo22() {
        int[] array = new int[5];

        java.util.List<String> expected = new java.util.ArrayList<>();
        for (int i = 0; i < 5; i++) {
            org.junit.Assert.assertEquals(expected.get(i), array[i]);
        }
        
                                 // warn
    }

    public void foo23() {
        new Object();
        // comment
    }

    public void foo24() {
        new Object();
                     // warn
    }

    public String foo25() {
        return String.format(java.util.Locale.ENGLISH, "%d",
            1);
        // comment
    }

    public String foo26() {
        return String.format(java.util.Locale.ENGLISH, "%d",
            1);
                                  // warn
    }

    public void foo27() {
        // comment
        // block
        foo17();

        // OOOO
    }

    public String foo28() {
        
        return String.format(java.util.Locale.ENGLISH, "%d",
            1);
        // comment
    }

    public String foo29() {
        
        return String.format(java.util.Locale.ENGLISH, "%d",
            1);
                          // warn
    }

    public void foo30() {
        // comment
        
// warn
    }

    public void foo31() {
        
        // comment
    }

    public void foo32() {
        
            // warn
    }

    public void foo33() {
        // comment
        this.foo22();
// warn
    }

    public void foo34() throws Exception {
        throw new Exception("",
            new Exception()
            );
        // comment
    }

    public void foo35() throws Exception {
        throw new Exception("",
            new Exception()
        );
            // warn
    }

    public void foo36() throws Exception {
        throw new Exception("",
            new Exception()
        );
// warn
    }

    public void foo37() throws Exception {
        throw new Exception("", new Exception());
        // comment
    }

    public void foo38() throws Exception {
        throw new Exception("", new Exception());
              // warn
    }

    public void foo39() throws Exception {
        throw new Exception("",
            new Exception());
         // warn
    }

    public void foo40() throws Exception {
        
        throw new Exception("", new Exception());
         // warn
    }

    public void foo41() throws Exception {
        
        throw new Exception("", new Exception());
        // comment
    }

    public void foo42() {
        int a = 5;
        if (a == 5) {
            
            // comment
        } else if (a == 6) {

        }
    }

    public void foo43() {
        try {
            
            // comment
        } catch (Exception e) {

        }
    }

    public void foo44() {
        
        // comment
        ar = 6;
        // comment
    }

    public void foo45() {
        
        // comment
        ar = 6;
         // warn
    }

    public void foo46() {
// comment
// block
// warn
    }

    public void foo47() {
        
        // comment
        // block
        // comment
    }

    public void foo48() {
        
// comment
// block
// warn
    }

    public void foo49() {
       // comment
       // block
       // ok
    }

    public void foo50() {
        return;

        // No NPE here!
    }

    public String foo51() {
        return String
            .valueOf("11"
            );
         // warn
    }

    public String foo52() {
        return String
            .valueOf("11"
            );
        // comment
    }

    // We almost reached the end of the class here.
}
// The END of the class.
