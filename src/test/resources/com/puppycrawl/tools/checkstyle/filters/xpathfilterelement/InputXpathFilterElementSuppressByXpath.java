package com.puppycrawl.tools.checkstyle.filters.xpathfilterelement;

public class InputXpathFilterElementSuppressByXpath {
    private int countTokens() {
        double pi = 3.14;
        return 123;
    }

    public String getName() {
        int someVariable = 123;
        return "InputSuppressByXpathThree";
    }

    public int sum(final int a, final int b) {
        String someVariable = "Hello World";
        return a + b;
    }
}
