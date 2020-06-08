package com.google.checkstyle.test.chapter3filestructure.rule32packagestate; // ok
final class InputLineLength
{
    // Long line ---------------------------------------------------------------------------------------- //warn
    // Contains a tab ->    <-
    // Contains trailing whitespace ->

    // Name format tests
    //
    /** Invalid format **/
    public static final int badConstant = 2;
    /** Valid format **/
    public static final int MAX_ROWS = 2;

    /** Invalid format **/
    
    /** Valid format **/
    

    /** Invalid format **/
    
    /** Valid format **/
    
    /** Valid format **/
    protected int mNumCreated2 = 0;

    /** commas are wrong **/
     //warn

    /**
     * Very long url: https://github.com/checkstyle/checkstyle/blob/master/src/main/java/com/puppycrawl/tools/checkstyle/checks/AvoidEscapedUnicodeCharactersCheck.java
     */
    public void fooMethod() { }

    /**
     * Long url without wrapping: http://ftp.dlink.ru/pub/D-Link_Solutions/D-Link_Solutions_for_Business.pdf
     */
    public void fooMethodLongFtp() { }

    public void fooLongStringUrl() {
         //ok
        processUrl("https://github.com/checkstyle/checkstyle/blob/master/src/main/java/com/puppycrawl/tools/checkstyle/checks/AvoidEscapedUnicodeCharactersCheck.java"); //ok
        processUrl("some line"
                + "https://github.com/checkstyle/checkstyle/blob/master/src/main/java/com/puppycrawl/tools/checkstyle/checks/AvoidEscapedUnicodeCharactersCheck.java" //ok
                + "+ long fooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo00000000000o line"); //warn
        processUrl("Some long foooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo line"); //warn
        String[] soooooooooooooooooooooooooooooooooooolongfooooooooooooooooooooooooooooooooooooooooooo = {//warn
            "http://github.com/checkstyle/checkstyle/blob/master/src/main/java/com/puppycrawl/tools/checkstyle/checks/AvoidEscapedUnicodeCharactersCheck.java", //ok
            "Some long foooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo line", //warn
        };

         //warn

        processUrl(new String[] {
            "http://github.com/checkstyle/checkstyle/blob/master/src/main/java/com/puppycrawl/tools/checkstyle/checks/AvoidEscapedUnicodeCharactersCheck.java", //ok
            "Some long foooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo line", //warn
        });

        
    }

    /**
     *
     * @param url
     */
    public void processUrl(final String url) { }

    /**
     *
     * @param urls
     */
    public void processUrl(final String[] urls) { }
}
