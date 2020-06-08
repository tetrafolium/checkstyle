package com.puppycrawl.tools.checkstyle.checks.coding.superclone;

public class InputSuperCloneWithoutWarnings {
    @Override
    public final InputSuperCloneWithoutWarnings clone() throws CloneNotSupportedException {
        return new InputSuperCloneWithoutWarnings();
    }
}
