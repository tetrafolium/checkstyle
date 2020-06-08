package com.google.checkstyle.test.chapter4formatting.rule451wheretobreak;

public class InputSeparatorWrapComma {
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

class badCaseComma {

    public void goodCase(final int... aFoo)
    {
        int i = 0;

        String s = "ffffooooString";
        
        foo(i
, s); //warn
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
