package com.puppycrawl.tools.checkstyle.checks.blocks.needbraces;

public class InputNeedBracesSingleLineLambda {

    static Runnable r1 = ()->"Hello world one!".equals(String.CASE_INSENSITIVE_ORDER);
    static Runnable r2 = () -> "Hello world two!".equals(String.CASE_INSENSITIVE_ORDER);
    static Runnable r3 = () ->
        "Hello world two!".equals(String.CASE_INSENSITIVE_ORDER);
    static Runnable r4 = () -> {"Hello world two!".equals(String.CASE_INSENSITIVE_ORDER);};
    Runnable r5 = () -> java.util.Objects.hash(1, 2,
        3,4);
    Runnable r6 = () -> {java.util.Objects.hash(1, 2,
        3,4);};
    {
        java.util.concurrent.CompletableFuture.runAsync(() -> System.out.println(
            (Runnable) () -> System.out.println(
                123)));
    }
    {
        java.util.concurrent.CompletableFuture.runAsync(() -> {System.out.println(
            (Runnable) () -> {System.out.println(
                123);});});
    }
}
