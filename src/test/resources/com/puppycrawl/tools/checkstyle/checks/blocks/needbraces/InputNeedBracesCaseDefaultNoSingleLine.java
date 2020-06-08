package com.puppycrawl.tools.checkstyle.checks.blocks.needbraces;

/**
 * Config:
 * tokens = LITERAL_CASE, LITERAL_DEFAULT
 * allowSingleLineStatement = false
 */
public class InputNeedBracesCaseDefaultNoSingleLine {

    public String aMethod(int val) {
        switch (val){
        default:
        case 0:
        case -1: break; // violation
        case -2: Math.random(); // violation
        }
        switch (val){
        default: break; // violation
        }
        switch (val){
        default: Math.random(); // violation
        }
        switch (val){
        case 1: 
        default:
        }
        
        switch (val) {
        case 0: {
            return "zero";
        }
        case 1: {
            return "one";
        }
        default: {
            return "non-binary";
        }
        }
    }
}
