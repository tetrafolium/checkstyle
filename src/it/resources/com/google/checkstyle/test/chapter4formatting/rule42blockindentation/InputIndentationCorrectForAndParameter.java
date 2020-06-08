package com.google.checkstyle.test.chapter4formatting.rule42blockindentation; //indent:0 exp:0

import java.util.ArrayList; //indent:0 exp:0
import java.util.HashMap; //indent:0 exp:0
import java.util.Iterator; //indent:0 exp:0
import java.util.List; //indent:0 exp:0
import java.util.Map; //indent:0 exp:0

class InputIndentationCorrectForAndParameter { //indent:0 exp:0

  String getString(final int someInt, final String someString) { //indent:2 exp:2
    return "String"; //indent:4 exp:4
  } //indent:2 exp:2

  void fooMethodWithIf() { //indent:2 exp:2

    for (int i = 1; i < 10; i++) { } //indent:4 exp:4

    for (int i = new SecondForClassWithLongName1("Loooooooooooooooooooo" //indent:4 exp:4
        + "oong").getInteger(new FooForClass(), //indent:8 exp:8
          getString(1_000_000_000, "Loooooooooooooooong")); i < 10; i++) { } //indent:10 exp:>=8

     //indent:8 exp:8

     //indent:15 exp:>=8

     //indent:8 exp:8

     //indent:13 exp:>=8

  } //indent:2 exp:2

  class InnerClassFoo { //indent:2 exp:2

    void fooMethodWithIf() { //indent:4 exp:4

      for (int i = 1; i < 10; i++) { } //indent:6 exp:6

      for (int i = new SecondForClassWithLongName1("Loooooooooooooooooooo" //indent:6 exp:6
          + "oong").getInteger(new FooForClass(), //indent:10 exp:10
            getString(1_000_000_000, "Loooooooooooooooong")); i < 10; i++) { } //indent:12 exp:>=10

       //indent:10 exp:10

       //indent:15 exp:>=10

       //indent:10 exp:10

       //indent:10 exp:10
    } //indent:4 exp:4
  } //indent:2 exp:2
}  //indent:0 exp:0

class SecondForClassWithLongName1 //indent:0 exp:0
        implements Iterable<String> { //indent:8 exp:>=4

  public SecondForClassWithLongName1(final String string) { //indent:2 exp:2

  } //indent:2 exp:2

  int getInteger(final FooForClass instance, final String string) { //indent:2 exp:2
    return -1;   //indent:4 exp:4
  } //indent:2 exp:2

  Map<String, String> getMap(final FooForClass instance, final int integer, final String string) { //indent:2 exp:2
    return new HashMap<String, String>(); //indent:4 exp:4
  } //indent:2 exp:2

  List<String> getList(final FooForClass instance, final long longLong, final String string) { //indent:2 exp:2
    return new ArrayList<String>(); //indent:4 exp:4
  } //indent:2 exp:2

  public Iterator<String> iterator() { //indent:2 exp:2
    return null; //indent:4 exp:4
  } //indent:2 exp:2
} //indent:0 exp:0
class FooForClass { } //indent:0 exp:0
