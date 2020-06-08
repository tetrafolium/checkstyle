package com.puppycrawl.tools.checkstyle.checks.indentation.indentation; //indent:0 exp:0

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
 * @author  jrichard                                                         //indent:1 exp:1
 */                                                                           //indent:1 exp:1
public class InputIndentationValidCommaIndent { //indent:0 exp:0

    /** Creates a new instance of InputIndentationValidCommaIndent */ //indent:4 exp:4
    public InputIndentationValidCommaIndent() { //indent:4 exp:4
    } //indent:4 exp:4

    public void method1(final int x, final int y, final int z) { //indent:4 exp:4
        boolean test = true; //indent:8 exp:8
         //indent:12 exp:>=12

        boolean longVarName = true; //indent:8 exp:8
         //indent:8 exp:8
        if (j == 2 || longVarName || longVarName) { //indent:8 exp:8
        } //indent:8 exp:8

        if (j == 2 && k == 3 //indent:8 exp:8
              || test) { //indent:14 exp:>=12
            System.identityHashCode("test"); //indent:12 exp:12
        } //indent:8 exp:8


    } //indent:4 exp:4

    public void method1(final int a, final int x, //indent:4 exp:4
        final int y, final int z) { //indent:8 exp:>=8
    } //indent:4 exp:4
} //indent:0 exp:0
