package com.puppycrawl.tools.checkstyle.checks.annotation.missingoverride;

public class InputMissingOverrideNotOverride
{    

    /**
     * {@inheritDoc}
     */
    public String junk = "";
    /**
     * {@inheritDoc}
     */
    private void bleh() {

    }

    /**
     * {@inheritDoc}
     */
    public static void eh() {

    }

    void dodoo() {}
}
