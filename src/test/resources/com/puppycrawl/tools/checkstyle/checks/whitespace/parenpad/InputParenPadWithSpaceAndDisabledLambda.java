package com.puppycrawl.tools.checkstyle.checks.whitespace.parenpad;

class InputParenPadWithSpaceAndDisabledLambda {
    {
         // ok

         // ok

         // ok

         // ok

         // ok

        java.util.stream.Stream.of().forEach((o) -> o.toString()); // ok

        java.util.stream.Stream.of().forEach((Object o) -> o.toString()); // ok

        java.util.stream.Stream.of().forEach(o -> o.toString()); // ok
    }

    void someMethod(final String param) { // 2 violations
    }
}
