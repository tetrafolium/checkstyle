package com.puppycrawl.tools.checkstyle.checks.indentation.indentation; //indent:0 exp:0



/**                                                                         //indent:0 exp:0
 * This test-input is intended to be checked using following configuration: //indent:1 exp:1
 *                                                                          //indent:1 exp:1
 * arrayInitIndent = 4                                                      //indent:1 exp:1
 * basicOffset = 4                                                          //indent:1 exp:1
 * braceAdjustment = 0                                                      //indent:1 exp:1
 * caseIndent = 4                                                           //indent:1 exp:1
 * forceStrictCondition = false                                             //indent:1 exp:1
 * lineWrappingIndentation = 8                                              //indent:1 exp:1
 * tabWidth = 4                                                             //indent:1 exp:1
 * throwsIndent = 4                                                         //indent:1 exp:1
 */                                                                         //indent:1 exp:1
public class InputIndentationAnonymousClassInMethodCurlyOnNewLine //indent:0 exp:0
{ //indent:0 exp:0
    private void aMethod() //indent:4 exp:4
    { //indent:4 exp:4
         //indent:16 exp:16
         //indent:18 exp:8,12,16 warn
         //indent:14 exp:8,12,16 warn
         //indent:16 exp:16
         //indent:18 exp:8,12,16 warn
         //indent:14 exp:8,12,16 warn
    } //indent:4 exp:4
} //indent:0 exp:0

