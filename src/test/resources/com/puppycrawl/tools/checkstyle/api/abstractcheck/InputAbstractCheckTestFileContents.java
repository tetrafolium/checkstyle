package com.puppycrawl.tools.checkstyle.api.abstractcheck;

/**
 * I'm a javadoc
 */
public class InputAbstractCheckTestFileContents {
    private int variable;

    public InputAbstractCheckTestFileContents(final int variable) {
        this.variable = variable;
    }

    public int getVariable() {
        return variable;
    }

    public void setVariable(final int variable) {
        this.variable = variable;
    }

    public int multiplyBy(final int multiplier) {
        return variable * multiplier;
    }
}
