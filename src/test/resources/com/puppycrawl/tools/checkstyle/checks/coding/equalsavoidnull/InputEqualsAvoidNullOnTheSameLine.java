package com.puppycrawl.tools.checkstyle.checks.coding.equalsavoidnull;

public class InputEqualsAvoidNullOnTheSameLine {

    static {
        String b = "onion";
        String a = b; "ONION".equals(a);
    }

    
    private A b = null;

    public void shouldWarn() {
        "".equals(a); A a = b;
    }

    public void shouldNotWarn() {
        A a = b; "".equals(a);
    }

    class A { }
}
