package com.puppycrawl.tools.checkstyle.grammar;

/**
 * Input for Java 7 try-with-resources.
 */
public class InputJava7TryWithResources
{
    public static class MyResource implements AutoCloseable {
        @Override
        public void close() throws Exception { }
    }

    public static void main(final String[] args) throws Exception {
        try (MyResource resource = new MyResource()) { }

        try (MyResource resource = new MyResource()) { } 

        try (MyResource resource = new MyResource();) { } catch (Exception e) { }

        try (MyResource resource = new MyResource();) { } catch (Exception | Throwable e) { } 

        try (MyResource resource = new MyResource(); MyResource resource2 = new MyResource()) { } catch (Exception | Throwable e) { } 

        try (MyResource resource = new MyResource(); MyResource resource2 = new MyResource();) { } catch (Exception | Throwable e) { } 

        try (@SuppressWarnings("all") final MyResource resource = new MyResource()) { }
    }
}
