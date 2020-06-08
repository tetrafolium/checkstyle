package com.google.checkstyle.test.chapter4formatting.rule451wheretobreak;

public class InputSeparatorWrap {
    public void goodCase()
    {
        int i = 0;
        String s = "ffffooooString";
        s
            .isEmpty(); //ok
        s.isEmpty();

        foo(i,
                s); //ok
    }
    public static void foo(final int i, final String s)
    {

    }
}

class badCase {

    public void goodCase(final int... aFoo)
    {
        int i = 0;

        String s = "ffffooooString";
        /*warn*/
        foo(i
, s);
        int[] j;
    }
    public static String foo(final int i, final String s)
    {
        String maxLength = "123";
        int truncationLength = 1;
        CharSequence seq = null;
        Object truncationIndicator = null;
        return new StringBuilder(maxLength)
        .append(seq, 0, truncationLength)
        .append(truncationIndicator)
        .toString();
    }
}
