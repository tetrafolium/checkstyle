package com.puppycrawl.tools.checkstyle.checks.annotation.annotationonsameline;

public class InputAnnotationOnSameLineCheck {

    @Annotation int x;

    int y;    

    @Annotation2 @Annotation
    public int field;    

    public
    @Annotation int field2;

    @Annotation
    @SomeClass.Annotation
    @java.lang.Deprecated
    public int getX() {
        return (int) x;
    }
}

class SomeClass {

    @interface Annotation {
    }

}

@interface Annotation {
}
@interface Annotation2 {
}
