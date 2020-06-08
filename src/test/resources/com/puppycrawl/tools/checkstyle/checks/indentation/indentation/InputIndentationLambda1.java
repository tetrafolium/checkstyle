//a comment //indent:0 exp:0
package com.puppycrawl.tools.checkstyle.checks.indentation.indentation; //indent:0 exp:0

import java.util.ArrayList; //indent:0 exp:0
import java.util.List; //indent:0 exp:0
import java.util.Map; //indent:0 exp:0
import java.util.stream.Collectors; //indent:0 exp:0
import java.util.stream.IntStream; //indent:0 exp:0
import java.util.stream.Stream; //indent:0 exp:0

public class InputIndentationLambda1 { //indent:0 exp:0
  java.util.logging.Logger LOG =  java.util.logging.Logger.getLogger(""); //indent:2 exp:2
  interface Printer //indent:2 exp:2
  { //indent:2 exp:2
    void print(String s); //indent:4 exp:4
  } //indent:2 exp:2

  class LongTypeName { //indent:2 exp:2
  } //indent:2 exp:2

  interface SomeInterface { //indent:2 exp:2
    void someFunction(LongTypeName arg); //indent:4 exp:4
  } //indent:2 exp:2

  void function1(final Runnable x) { //indent:2 exp:2
     //indent:4 exp:4

     //indent:4 exp:4

     //indent:8 exp:8

     //indent:4 exp:4

     //indent:4 exp:4

     //indent:8 exp:8

     //indent:5 exp:4 warn

     //indent:9 exp:8 warn

     //indent:8 exp:8

     //indent:4 exp:4

     //indent:5 exp:4 warn

     //indent:8 exp:8

     //indent:8 exp:8

     //indent:12 exp:12

     //indent:8 exp:8

     //indent:8 exp:8

     //indent:12 exp:12

     //indent:8 exp:8

     //indent:4 exp:4

     //indent:4 exp:4

    Printer[] manyRunnable = new Printer[]{//indent:4 exp:4
        s -> LOG.info(s), //indent:8 exp:6,8
        s -> {
            LOG.info(s); }, //indent:8 exp:6,8
        s -> LOG //indent:8 exp:6,8
            .info(s), //indent:12 exp:12
        s -> { //indent:8 exp:6,8
          LOG.info(s); //indent:10 exp:10
        }, //indent:8 exp:8
    }; //indent:4 exp:4
  } //indent:2 exp:2

  void function3(final Runnable x) { //indent:2 exp:2
    function1(() -> { //indent:4 exp:4
      x.run(); //indent:6 exp:6
    }); //indent:4 exp:4
  } //indent:2 exp:2

  class Person { //indent:2 exp:2
    String name; //indent:4 exp:4
    int age; //indent:4 exp:4
    Person(final String name, final int age) { //indent:4 exp:4
    } //indent:4 exp:4
  } //indent:2 exp:2

  class Foo { //indent:2 exp:2
    String name; //indent:4 exp:4
    List<Bar> bars = new ArrayList<>(); //indent:4 exp:4

    Foo(final String name) { //indent:4 exp:4
      this.name = name; //indent:6 exp:6
    } //indent:4 exp:4
  } //indent:2 exp:2

  class Bar { //indent:2 exp:2
    String name; //indent:4 exp:4
    Bar(final String name) { //indent:4 exp:4
      this.name = name; //indent:6 exp:6
    } //indent:4 exp:4
  } //indent:2 exp:2

  public void f() { //indent:2 exp:2
    Stream.of("d2", "a2", "b1", "b3", "c") //indent:4 exp:4
        .map(s -> { //indent:8 exp:8
          LOG.info("map: " + s); //indent:10 exp:10
          return s.toUpperCase(java.util.Locale.getDefault()); //indent:10 exp:10
        }) //indent:8 exp:8
        .anyMatch(s -> { //indent:8 exp:8
          LOG.info("anyMatch: " + s); //indent:10 exp:10
          return s.startsWith("A"); //indent:10 exp:10
        }); //indent:8 exp:8

    List<Person> persons = null; //indent:4 exp:4

    Map<Integer, List<Person>> personsByAge = persons //indent:4 exp:4
        .stream() //indent:8 exp:8
        .collect(Collectors.groupingBy(p -> p.age)); //indent:8 exp:8

    personsByAge //indent:4 exp:4
        .forEach((age, p) -> LOG.info("age %s: %s\n")); //indent:8 exp:8

     //indent:12 exp:12

    List<Foo> foos = new ArrayList<>(); //indent:4 exp:4

    foos.forEach(f -> //indent:4 exp:4
        IntStream //indent:8 exp:8
            .range(1, 4) //indent:12 exp:12
            .forEach(i -> f.bars.add(new Bar("Bar" + i + " <- " + f.name)))); //indent:12 exp:12

    Stream.of("d2", "a2", "b1", "b3", "c") //indent:4 exp:4
        .filter(s -> { //indent:8 exp:8
         LOG.info("filter: " + s); //indent:9 exp:10 warn
           return s.startsWith("a"); //indent:11 exp:10 warn
        }) //indent:8 exp:8
        .map(s -> { //indent:8 exp:8
          LOG.info("map: " + s); //indent:10 exp:10
          return s.toUpperCase(java.util.Locale.getDefault()); //indent:10 exp:10
       }) //indent:7 exp:8 warn
        .forEach(s -> //indent:8 exp:8
            LOG.info("forEach: " + s)); //indent:12 exp:12

    IntStream.range(1, 4) //indent:4 exp:4
        .mapToObj(i -> new Foo("Foo" + i)) //indent:8 exp:8
        .peek(f -> IntStream.range(1, 4) //indent:8 exp:8
            .mapToObj(i -> new Bar("Bar" + i + " <- " + f.name)) //indent:12 exp:12
            .forEach(f.bars::add)) //indent:12 exp:12
        .flatMap(f -> f.bars.stream()) //indent:8 exp:8
        .forEach(b -> LOG.info(b.name)); //indent:8 exp:8

    IntStream.range(1, 4) //indent:4 exp:4
        .mapToObj(i -> new Foo("Foo" + i)) //indent:8 exp:8
        .peek(f -> IntStream.range(1, 4) //indent:8 exp:8
            .mapToObj(i -> new Bar("Bar" + i + " <- " + f.name)) //indent:12 exp:12
            .forEach(f.bars::add)) //indent:12 exp:12
        .flatMap(f -> f.bars.stream()) //indent:8 exp:8
        .forEach(b -> LOG.info(b.name)); //indent:8 exp:8
  } //indent:2 exp:2

  Runnable r2r(final Runnable x) { //indent:2 exp:2
    return x; //indent:4 exp:4
  } //indent:2 exp:2

  void function2(final Runnable x) { //indent:2 exp:2
     //indent:4 exp:4

     //indent:4 exp:4

     //indent:4 exp:4
  } //indent:2 exp:2
} //indent:0 exp:0
