package com.google.checkstyle.test.chapter2filebasic.rule233nonascii;

public class InputAvoidEscapedUnicodeCharacters {

    /*warn*/

     //Greek letter mu ok

     //Greek letter mu

    public Object fooString()
    {
        
        /*warn*/
         // Greek letter mu, "s" ok
        
        
        String content = "";
        /*byte order mark ok*/return "\ufeff" + content ;
    }

    public Object fooChar()
    {
        /*warn*/
         // Greek letter mu, "s" ok
        String content = "";
        /*byte order mark ok*/return '\ufeff' + content;
    }

    public void multiplyString()
    {
        /*warn*/
         /* Greek letter mu, "s"*/ //ok
        /*warn*/
        /*warn*/
    }
}
