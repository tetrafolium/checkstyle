package com.google.checkstyle.test.chapter4formatting.rule4841indentation; //indent:0 exp:0

public class ClassWithChainedMethods { //indent:0 exp:0

  public ClassWithChainedMethods(final Object... params) { //indent:2 exp:2
  } //indent:2 exp:2

  public String doNothing(final String something, final String... uselessParams) { //indent:2 exp:2
    return something; //indent:4 exp:4
  } //indent:2 exp:2

  public ClassWithChainedMethods getInstance(final String... uselessParams) { //indent:2 exp:2
    return this; //indent:4 exp:4
  } //indent:2 exp:2

  public static void main(final String[] args) { //indent:2 exp:2
    new ClassWithChainedMethods().getInstance("string_one") //indent:4 exp:4
    .doNothing("string_one".trim(), //indent:4 exp:8 warn
               "string_two"); //indent:15 exp:>=8

     //indent:4 exp:>=8 warn

     //indent:8 exp:8
  } //indent:2 exp:2
} //indent:0 exp:0
