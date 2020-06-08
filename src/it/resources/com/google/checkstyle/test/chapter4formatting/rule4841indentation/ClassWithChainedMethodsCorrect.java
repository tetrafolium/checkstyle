package com.google.checkstyle.test.chapter4formatting.rule4841indentation;  //indent:0 exp:0

public class ClassWithChainedMethodsCorrect { //indent:0 exp:0
  public ClassWithChainedMethodsCorrect() { //indent:2 exp:2

    String someString = ""; //indent:4 exp:4

     //indent:8 exp:8

    doNothing(//indent:4 exp:4
        someString //indent:8 exp:8
            .concat("zyx" //indent:12 exp:12
            ) //indent:12 exp:12
            .concat("255, 254, 253" //indent:12 exp:12
            ) //indent:12 exp:12
    ); //indent:4 exp:4

  } //indent:2 exp:2

  public String doNothing(final String something) { //indent:2 exp:2
    return something; //indent:4 exp:4
  } //indent:2 exp:2

  public static void main(final String[] args) { //indent:2 exp:2
     //indent:8 exp:8
  } //indent:2 exp:2

} //indent:0 exp:0
