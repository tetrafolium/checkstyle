package com.puppycrawl.tools.checkstyle.grammar.java8;

public class InputMethodReferences3
{
  public static class SomeClass {
    public static class Nested<V> {
      private Nested() {
      }
    }
  }

  public static class Nested2<V> {
  }

  public <V> void methodName(final V value) {
    
    
    
  }
}
