package com.puppycrawl.tools.checkstyle.checks.whitespace.parenpad;

public class InputParenPadLambdaOnly {
    {
         // ok

         // ok

         // 2 violations

         // 1 violation

         // 1 violation

        java.util.stream.Stream.of().forEach((o) -> o.toString()); // 2 violations

        java.util.stream.Stream.of().forEach((Object o) -> o.toString()); // 2 violations

        java.util.stream.Stream.of().forEach(o -> o.toString()); // ok
    }

    void someMethod(final String param) { // ok
    }
}
