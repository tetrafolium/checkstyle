package com.puppycrawl.tools.checkstyle.checks.whitespace.nowhitespacebefore;


public class InputNoWhitespaceBeforeMethodRef {
    public static class SomeClass {
    public static class Nested<V> {
      private Nested() {
      }
    }
  }

  public static class Nested2<V> {
  }

  public <V> void methodName(final V value) {
     //violation
     //violation
    
  }
}
