package com.puppycrawl.tools.checkstyle.checks.indentation.indentation; //indent:0 exp:0

public class InputIndentationNewHandler //indent:0 exp:0
{ //indent:0 exp:0
    public void test() { //indent:4 exp:4
         //indent:8 exp:8
         //indent:0 exp:12 warn
         //indent:0 exp:12 warn
        o = Integer.valueOf("".indexOf("5")); //indent:8 exp:8
        o = Integer.valueOf("".indexOf("5")); //indent:0 exp:8 warn
        o = Integer.valueOf("".indexOf("5")); //indent:0 exp:8 warn
    } //indent:4 exp:4
} //indent:0 exp:0
