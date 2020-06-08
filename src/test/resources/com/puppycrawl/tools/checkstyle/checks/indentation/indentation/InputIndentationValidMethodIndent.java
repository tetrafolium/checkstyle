package com.puppycrawl.tools.checkstyle.checks.indentation.indentation; //indent:0 exp:0

import java.util.Arrays; //indent:0 exp:0

/**                                                                           //indent:0 exp:0
 * This test-input is intended to be checked using following configuration:   //indent:1 exp:1
 *                                                                            //indent:1 exp:1
 * arrayInitIndent = 4                                                        //indent:1 exp:1
 * basicOffset = 4                                                            //indent:1 exp:1
 * braceAdjustment = 0                                                        //indent:1 exp:1
 * caseIndent = 4                                                             //indent:1 exp:1
 * forceStrictCondition = false                                               //indent:1 exp:1
 * lineWrappingIndentation = 4                                                //indent:1 exp:1
 * tabWidth = 4                                                               //indent:1 exp:1
 * throwsIndent = 4                                                           //indent:1 exp:1
 *                                                                            //indent:1 exp:1
 * @author  jrichard                                                          //indent:1 exp:1
 */                                                                           //indent:1 exp:1
public class InputIndentationValidMethodIndent  { //indent:0 exp:0

    // ctor with rcurly on same line //indent:4 exp:4
    public InputIndentationValidMethodIndent() { //indent:4 exp:4
    } //indent:4 exp:4

    private InputIndentationValidMethodIndent(final boolean test) { //indent:4 exp:4
         //indent:8 exp:>=8

         //indent:12 exp:>=12
    } //indent:4 exp:4


    private InputIndentationValidMethodIndent(final boolean test, //indent:4 exp:4
        final boolean test2) { //indent:8 exp:>=8
         //indent:8 exp:>=8

         //indent:12 exp:>=12
    } //indent:4 exp:4


    private InputIndentationValidMethodIndent(final boolean test, //indent:4 exp:4
        final boolean test2, final boolean test3)  //indent:8 exp:>=8
    { //indent:4 exp:4
         //indent:8 exp:8

         //indent:12 exp:>=12
    } //indent:4 exp:4

    // ctor with rcurly on next line //indent:4 exp:4
    public InputIndentationValidMethodIndent(final int dummy) //indent:4 exp:4
    { //indent:4 exp:4
    } //indent:4 exp:4

    // method with rcurly on same line //indent:4 exp:4
    public String method1() { //indent:4 exp:4
        return "hi"; //indent:8 exp:>=8
    } //indent:4 exp:4

    // method with rcurly on next line //indent:4 exp:4
    public void method2() //indent:4 exp:4
    { //indent:4 exp:4
    } //indent:4 exp:4

    // method with a bunch of params //indent:4 exp:4
    public int method2(final int x, final int y, final int w, final int h) //indent:4 exp:4
    { //indent:4 exp:4
        return 1; //indent:8 exp:8
    } //indent:4 exp:4

    // params on multiple lines //indent:4 exp:4
    public void method2(final int x, final int y, final int w, final int h, //indent:4 exp:4
        final int x1, final int y1, final int w1, final int h1) //indent:8 exp:>=8
    { //indent:4 exp:4
    } //indent:4 exp:4

    // params on multiple lines //indent:4 exp:4
    public void method3(final int x, final int y, final int w, final int h, //indent:4 exp:4
        final int x1, final int y1, final int w1, final int h1) //indent:8 exp:>=8
    { //indent:4 exp:4
        System.getProperty("foo"); //indent:8 exp:8
    } //indent:4 exp:4

    // params on multiple lines //indent:4 exp:4
    public void method4(final int x, final int y, final int w, final int h, //indent:4 exp:4
        final int x1, final int y1, final int w1, final int h1) //indent:8 exp:8
    { //indent:4 exp:4
        boolean test = true; //indent:8 exp:8

        int i = 4 +  //indent:8 exp:8
            4; //indent:12 exp:>=12

        i += 5; //indent:8 exp:8
        i += 5  //indent:8 exp:8
            + 4; //indent:12 exp:>=12
        if (test)  //indent:8 exp:8
        { //indent:8 exp:8
            System.getProperty("foo"); //indent:12 exp:12
        } else { //indent:8 exp:8
            System.getProperty("foo"); //indent:12 exp:12
        } //indent:8 exp:8

        for (int j = 0; j < 10; j++) { //indent:8 exp:8
            System.getProperty("foo"); //indent:12 exp:12
        } //indent:8 exp:8


        myfunc2(10, 10, 10, //indent:8 exp:8
            myfunc3(11, 11, //indent:12 exp:>=12
                11, 11), //indent:16 exp:>=16
            10, 10, //indent:12 exp:>=12
            10); //indent:12 exp:>=12


        myfunc3(11, 11, Integer.//indent:8 exp:8
                getInteger("mytest").intValue(), //indent:16 exp:>=12
            11); //indent:12 exp:>=12

        myfunc3(//indent:8 exp:8
            1, //indent:12 exp:>=12
            2,  //indent:12 exp:>=12
                3,  //indent:16 exp:>=12
                4); //indent:16 exp:>=12
    } //indent:4 exp:4

    // strange IMHO, but I suppose this should be allowed //indent:4 exp:4
    public //indent:4 exp:4
    void //indent:4 exp:8 warn
    method5() { //indent:4 exp:8 warn
    } //indent:4 exp:4


    private void myfunc2(final int a, final int b, final int c, final int d, final int e, final int f, final int g) { //indent:4 exp:4
    } //indent:4 exp:4

    private int myfunc3(final int a, final int b, final int c, final int d) { //indent:4 exp:4
        return 1; //indent:8 exp:8
    } //indent:4 exp:4


    void method6() { //indent:4 exp:4
        System.identityHashCode("methods are: " + Arrays.asList(//indent:8 exp:8
            new String[] {"method"}).toString()); //indent:12 exp:>=12

        System.identityHashCode("methods are: " + Arrays.asList(//indent:8 exp:8
            new String[] {"method"} //indent:12 exp:>=12
        ).toString()); //indent:8 exp:8

        System.identityHashCode("methods are: " + Arrays.asList(//indent:8 exp:8
            new String[] {"method"}).toString() //indent:12 exp:>=12
        ); //indent:8 exp:8


        myfunc2(3, 4, 5,  //indent:8 exp:8
            6, 7, 8, 9); //indent:12 exp:>=12

        myfunc2(3, 4, method2(3, 4, 5, 6) + 5,  //indent:8 exp:8
            6, 7, 8, 9); //indent:12 exp:>=12

        System.identityHashCode("methods are: " +  //indent:8 exp:8
            Arrays.asList(//indent:12 exp:>=12
                new String[] {"method"}).toString()); //indent:16 exp:>=16

        System.identityHashCode("methods are: "  //indent:8 exp:8
            + Arrays.asList(//indent:12 exp:>=12
                new String[] {"method"}).toString()); //indent:16 exp:>=16


         //indent:12 exp:>=12

        System.identityHashCode(method1() + "mytext"  //indent:8 exp:8
            + " at indentation level not at correct indentation, "  //indent:12 exp:>=12
            + method1()); //indent:12 exp:>=12

        System.identityHashCode(//indent:8 exp:8
            method1() + "mytext"  //indent:12 exp:>=12
                + " at indentation level not at correct indentation, "  //indent:16 exp:>=12
                + method1()); //indent:16 exp:>=12

        String.CASE_INSENSITIVE_ORDER.toString() //indent:8 exp:8
            .equals("blah"); //indent:12 exp:>=12



    } //indent:4 exp:4

    private int[] getArray() { //indent:4 exp:4
        return new int[] {1}; //indent:8 exp:8
    } //indent:4 exp:4

    private void indexTest() { //indent:4 exp:4
        getArray()[0] = 2; //indent:8 exp:8
    } //indent:4 exp:4

    // the following lines have tabs //indent:4 exp:4
        @SuppressWarnings(//indent:4 exp:4
                value = "" //indent:8 exp:8
        ) //indent:4 exp:4
        public void testStartOfSequence() { //indent:4 exp:4
        } //indent:4 exp:4
} //indent:0 exp:0
