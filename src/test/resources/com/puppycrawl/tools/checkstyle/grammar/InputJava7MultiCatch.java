package com.puppycrawl.tools.checkstyle.grammar;

import java.io.*;

/**
 * Input for Java 7 multi-catch.
 */
public class InputJava7MultiCatch
{
    public static class CustomException extends Exception { }
    public static class AnotherCustomException extends RuntimeException { }

    public static void logException(final Exception e) { }

    public static void main(final String[] args) {
        try {
            
            throw new CustomException();
        } catch (FileNotFoundException | CustomException e) {
            logException(e);
        }

        try {
            
            throw new CustomException();
        } catch (final FileNotFoundException | CustomException | com.puppycrawl.tools.checkstyle.grammar.InputJava7MultiCatch.AnotherCustomException e) {
            logException(e);
        }
    }
}
