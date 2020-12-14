package com.google.checkstyle.test.chapter4formatting.rule412nonemptyblocks;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

@TestClassAnnotation
class InputLeftCurlyAnnotations
{   //warn
private static final int X = 10;
@Override
public boolean equals(Object other)
{       //warn
	return false;
}

@Override
@SuppressWarnings("unused")
public int hashCode()
{       //warn
	int a = 10;
	return 1;
}

@Override @SuppressWarnings({
		"unused", "unchecked", "static-access"
	}) public String toString()
{       //warn
	Integer i = this.X;
	List<String> l = new ArrayList();
	return "SomeString";
}
}

@TestClassAnnotation
class InputLeftCurlyAnnotations2 {
private static final int X = 10;
@Override
public boolean equals(Object other) {
	return false;
}

@Override
@SuppressWarnings("unused")
public int hashCode() {
	int a = 10;
	return 1;
}

@Override @SuppressWarnings({
		"unused", "unchecked", "static-access"
	}) public String toString()
{       //warn
	Integer i = this.X;
	List<String> l = new ArrayList();
	return "SomeString";
}
}

@Target(ElementType.TYPE)
@interface TestClassAnnotation {
}
