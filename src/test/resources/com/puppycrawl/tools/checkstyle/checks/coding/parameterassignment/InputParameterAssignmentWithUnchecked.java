package com.puppycrawl.tools.checkstyle.checks.coding.parameterassignment;
/**Input*/
public class InputParameterAssignmentWithUnchecked {
    int field;
    void foo1(final int field) {
        
        this.field = field;
        i++;
        field = 0;
        field += 1;
        this.field++;
        field--;
    }
    // without parameters
    void foo2() {
        field = 0;
    }
    @SuppressWarnings(value = "unchecked")
    void foo3(final String field, final int field1) {
        this.field = field1 += field.length();
    }

    void foo4() {
        String hidden = "";
        new NestedClass() {
            public void test(final String hidden) {
            }
        };
        hidden += "test";
    }

    // parameter name must be the same token name
    void foo5(final int EXPR) {
        
    }

    public static abstract class NestedClass {
        public abstract void test(String hidden);
    }
}
