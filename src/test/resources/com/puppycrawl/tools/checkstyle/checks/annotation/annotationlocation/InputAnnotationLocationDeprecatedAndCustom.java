package com.puppycrawl.tools.checkstyle.checks.annotation.annotationlocation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class InputAnnotationLocationDeprecatedAndCustom {
    @Deprecated // <--class, separate line
    public class Annotation
    {
        @Deprecated // <--method, separate line
        public void test(@MyAnnotation String s) { // <--parameter, same line
            
            
        }
    }

    public class Test {
        public void foo1() {
            try {
                // some code
            }
            catch (@MyAnnotation Exception ex) {

            }
        }

        public void foo2() {
            for (@MyAnnotation int i = 0; i < 10; i++) {

            }
        }

        public void foo3() {
            
        }

        public void foo4(@MyAnnotation int a, @MyAnnotation int b) {}

        public void foo5(@SuppressWarnings("unchecked") int a) {}
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    @Target(ElementType.TYPE_USE)
    public @interface MyAnnotation {}
}
