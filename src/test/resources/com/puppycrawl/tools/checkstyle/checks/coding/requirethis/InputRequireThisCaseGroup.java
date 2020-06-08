package com.puppycrawl.tools.checkstyle.checks.coding.requirethis;

public class InputRequireThisCaseGroup {
    private String aVariable;

    public String method1(final int val) {
        switch (val) {
            case 0:
                String aVariable = "";

                if (this.aVariable != null) {
                    aVariable = this.aVariable;
                }

                return aVariable;
            default:
                return null;
        }
    }

    public String method2(final int val) {
        switch (val) {
            case 0:
                String aVariable = "";

                if (this.aVariable != null) {
                    aVariable = this.aVariable;
                }

                return aVariable;
        }
        return null;
    }

    public String method3(final int val) {
        switch (val) {
            case 0:
                String other = "";

                if (aVariable != null) {
                    other = aVariable;
                }

                return other;
        }
        return null;
    }
}
