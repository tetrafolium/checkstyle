package com.puppycrawl.tools.checkstyle.grammar.java8;

public interface InputDefaultMethods {

	default public void doSomething(){
		"Something done.".equals(String.CASE_INSENSITIVE_ORDER);
	}

	public void doOneMoreThing();

}
