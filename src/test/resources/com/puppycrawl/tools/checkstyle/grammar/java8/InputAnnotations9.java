package com.puppycrawl.tools.checkstyle.grammar.java8;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


public class InputAnnotations9 {
	public static <T> void methodName(Object str) {
		
	}

	@Target(ElementType.TYPE_USE)
	@interface Immutable {
	}
}
