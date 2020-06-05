package com.puppycrawl.tools.checkstyle.checks.design.mutableexception;

public class InputMutableException {
    public class FooException extends Exception {
        private final int finalErrorCode;
        

        public FooException() {
            finalErrorCode = 1;
        }

        public class FooExceptionThisIsNot extends RuntimeException {
            private final int finalErrorCode;
            
            /** constructor */
            public FooExceptionThisIsNot() {
                finalErrorCode = 1;
            }
        }
    }

    public class BarError extends Throwable {
        
    }

    public class BazDoesNotExtendError {
        
    }

    public class CustomProblem extends ThreadDeath {
        

        public class CustomFailure extends ThreadDeath {
            
            public void someMethod() {
                
            }
        }
    }

    class CustomException extends java.lang.Exception {}

    class CustomMutableException extends java.lang.Exception {
        int errorCode;
    }

    class ExampleException extends java.lang.Exception {
        public void test() {
            Throwable cause = super.getCause();
            if (!(cause instanceof java.io.IOException))
                throw new IllegalStateException("Test");
        }
    }
}
