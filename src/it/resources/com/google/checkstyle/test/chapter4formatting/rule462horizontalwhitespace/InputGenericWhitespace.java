package com.google.checkstyle.test.chapter4formatting.rule462horizontalwhitespace;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.Collections;
class InputGenericWhitespace implements Comparable<InputGenericWhitespace>, Serializable
{
    void meth()
    {
        
        
         // warn
         // warn
    }

    public int compareTo(final InputGenericWhitespace aObject)
    {
        return 0;
    }

    public static <T> Callable<T> callable(final Runnable task, final T result)
    {
        return null;
    }

    public static <T> Callable<T> callable2(final Runnable task, final T result) // warn
    {
        Map<Class<?>, Integer> x = new HashMap<Class<?>, Integer>();
        for (final Map.Entry<Class<?>, Integer> entry : x.entrySet()) {
            entry.getValue();
        }
        Class<?>[] parameterClasses = new Class<?>[0];
        return null;
    }
    public int getConstructor(final Class<?>... parameterTypes)
    {
        Collections.<Object>emptySet();
        Collections.<Object>emptySet(); // warn
        return 666;
    }

    <T> InputGenericWhitespace(final List<T> things, final int i)
    {
    }

    public <T> InputGenericWhitespace(final List<T> things)
    {
    }

    public interface IntEnum {
    }

    public static class IntEnumValueType<E extends Enum<E> & IntEnum> {
    }

    public static class IntEnumValueType2<E extends Enum<E> & IntEnum> { // warn
    }

    public static class IntEnumValueType3<E extends Enum<E> & IntEnum> { // warn
    }
}
