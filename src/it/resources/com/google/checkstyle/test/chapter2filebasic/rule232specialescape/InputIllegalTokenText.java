package com.google.checkstyle.test.chapter2filebasic.rule232specialescape;

/**
 * Test for illegal tokens
 */
public class InputIllegalTokenText
{

    public void methodWithLiterals()
    {
        
        
    }

    public String wrongEscapeSequences()
    {
         //ok
         //warn
         //warn
         // ok

         //warn
         //warn
         //ok
        return "\u000csssdfsd"; //warn
    }

    public void specialCharsWithoutWarn()
    {
         //ok
         //ok
         //ok
         //ok
         //ok
         //ok
         //ok
         //ok
    }

    public void specialCharsWithWarn()
    {
         //ok
         // warn
         // warn
         // warn
         // warn
         // warn
         // warn
         // warn
    }

    public void specialCharsWithWarn2()
    {
         // warn
         // warn
         // warn
         // warn
         // warn
         // warn
         // warn
         // warn
    }

    class Inner
    {
        public String wrongEscapeSequences()
        {
             //ok
             //warn
             //warn
             //ok

             //warn
             //warn
             //ok
            return "\u000csssdfsd"; //warn
        }

        public void specialCharsWithoutWarn()
        {
             //ok
             //ok
             //ok
             //ok
             //ok
             //ok
             //ok
             //ok
        }

        public void specialCharsWithWarn()
        {
             //ok
             // warn
             // warn
             // warn
             // warn
             // warn
             // warn
             // warn
        }

        public void specialCharsWithWarn2()
        {
             // warn
             // warn
             // warn
             // warn
             // warn
             // warn
             // warn
             // warn
        }

        Inner anoInner = new Inner() {
            public String wrongEscapeSequences()
            {
                 //ok
                 //warn
                 //warn
                 //ok

                 //warn
                 //warn
                 //ok
                return "\u000csssdfsd"; //warn
            }

            public void specialCharsWithoutWarn()
            {
                 //ok
                 //ok
                 //ok
                 //ok
                 //ok
                 //ok
                 //ok
                 //ok
            }

            public void specialCharsWithWarn()
            {
                 //ok
                 // warn
                 // warn
                 // warn
                 // warn
                 // warn
                 // warn
                 // warn
            }

            public void specialCharsWithWarn2()
            {
                 // warn
                 // warn
                 // warn
                 // warn
                 // warn
                 // warn
                 // warn
                 // warn
            }
        };
    }
}
