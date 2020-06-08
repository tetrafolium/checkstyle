package com.puppycrawl.tools.checkstyle.grammar.java8;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;




public class InputAnnotations3 {

        public static void methodName(final Object str) {
                
        }

        @Target(ElementType.TYPE_USE)
        @interface NonNull {
        }

}
