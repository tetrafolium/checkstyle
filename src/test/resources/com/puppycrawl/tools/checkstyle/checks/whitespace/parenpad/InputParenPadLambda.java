package com.puppycrawl.tools.checkstyle.checks.whitespace.parenpad;

class InputParenPadLambda {
    {
         // ok

         // ok

         // 2 violations

         // 1 violation

         // 1 violation

        java.util.stream.Stream.of().forEach((o) -> o.toString()); // 2 violations

        java.util.stream.Stream.of().forEach((Object o) -> o.toString()); // 2 violations

        java.util.stream.Stream.of().forEach(o -> o.toString()); // 2 violations
    }

    void someMethod(final String param) { // 2 violations
    }
}
