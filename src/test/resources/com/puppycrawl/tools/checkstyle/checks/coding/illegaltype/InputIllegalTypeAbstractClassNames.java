package com.puppycrawl.tools.checkstyle.checks.coding.illegaltype;

public class InputIllegalTypeAbstractClassNames {    

    AbstractClass a = new MyNonAbstractClass();

    abstract class AbstractClass {
        abstract String getClassInfo();
        abstract boolean isPerfectClass();
    }

    class MyNonAbstractClass extends AbstractClass {

        boolean perfect = true;

        private MyNonAbstractClass() { }

        @Override
        String getClassInfo() {
            return "This is my non abstract class.";
        }

        @Override
        boolean isPerfectClass() {
            return perfect;
        }
    }

    public String getInnerClassInfo(final AbstractClass clazz) {
        return clazz.getClassInfo();
    }

    public AbstractClass newInnerClassInstance() {
        return new MyNonAbstractClass();
    }
}
