package com.puppycrawl.tools.checkstyle.grammar.java8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


public class InputAnnotations12 {
    public void m1(final @MyAnnotation1 String @MyAnnotation1... vararg) { }
    public void m2(final @MyAnnotation1 int @MyAnnotation1... vararg) { }
    public void m3(final @MyAnnotation1 String @MyAnnotation1 [] @MyAnnotation1 []... vararg) { }
    public void m4(final @MyAnnotation1 int[] @MyAnnotation1... vararg) { }
    public void m5(final @MyAnnotation1 String[][] @MyAnnotation1 [] @MyAnnotation1 []... vararg) { }

    @Target(ElementType.TYPE_USE)
        @interface MyAnnotation1 { }
}
