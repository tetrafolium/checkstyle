package com.puppycrawl.tools.checkstyle.checks.javadoc.missingjavadocmethod;

public class InputMissingJavadocMethodMissingJavadocTags {
    /**
     * Missing return.
     *
     * @param number to return
     * @throws ThreadDeath sometimes
     */
    int missingReturn(final int number) throws ThreadDeath {
        return number;
    }

    /**
     * Missing param.
     *
     * @return number
     * @throws ThreadDeath sometimes
     */
    int missingParam(final int number) throws ThreadDeath {
        return number;
    }

    /**
     * Missing throws.
     *
     * @param number to return
     * @return number
     */
    int missingThrows(final int number) throws ThreadDeath {
        return number;
    }

    /**
     * Missing return, but {@inheritDoc} is present.
     *
     * @param number to return
     * @throws java.util.NoSuchElementException sometimes
     */
    int missingReturnButInheritDocPresent(final int number) throws java.util.NoSuchElementException {
        return number;
    }

    /**
     * Missing return in the middle.
     *
     * @param number to return
     * @return
     * @throws java.util.NoSuchElementException sometimes
     */
    private int missingReturnInTheMiddle(final int number) {
        return number;
    }

    /**
     * Missing return at the end.
     *
     * @param number to return
     * @return
     */
    private int missingReturnAtTheEnd(final int number) {
        return number;
    }

    /**
     * Missing return at the end followed by empty line.
     *
     * @param number to return
     * @return
     *
     */
    private int missingReturnAtTheEndFollowedByEmptyLine(final int number) {
        return number;
    }
}
