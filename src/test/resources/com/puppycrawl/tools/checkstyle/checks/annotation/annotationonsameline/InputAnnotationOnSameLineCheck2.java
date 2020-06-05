package com.puppycrawl.tools.checkstyle.checks.annotation.annotationonsameline;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Target;

public class InputAnnotationOnSameLineCheck2 {

    

    

    @SuppressWarnings("deprecation")
    @Ann Integer x;

    @SuppressWarnings("deprecation")
    @Ann
    Integer x2;

    @SuppressWarnings("deprecation") @Ann @Ann2 @Ann3 @Ann4 Integer x3;

}

@Target({CONSTRUCTOR, FIELD, METHOD, PARAMETER, TYPE, TYPE_PARAMETER, TYPE_USE}) @interface Ann {
}

@Target({CONSTRUCTOR, FIELD, METHOD, PARAMETER, TYPE, TYPE_PARAMETER, TYPE_USE}) @interface Ann2 {
}

@interface Ann3 {
}

@interface Ann4 {
}
