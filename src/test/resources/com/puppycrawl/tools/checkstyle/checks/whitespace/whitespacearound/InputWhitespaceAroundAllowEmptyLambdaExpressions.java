package com.puppycrawl.tools.checkstyle.checks.whitespace.whitespacearound;

import java.util.function.*;


public class InputWhitespaceAroundAllowEmptyLambdaExpressions {
    Runnable noop = () -> {};
    Runnable noop2 = () -> {
        
    };
    BinaryOperator<Integer> sum = (x, y) -> x + y;
    Runnable noop3 = () -> {};
    Runnable noop4 = () -> {new String();};
}
