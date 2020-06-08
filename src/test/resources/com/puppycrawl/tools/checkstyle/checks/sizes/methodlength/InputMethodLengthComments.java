package com.puppycrawl.tools.checkstyle.checks.sizes.methodlength;

public class InputMethodLengthComments {
    static class DetailClass {
        public DetailClass find(final int type) {
            return null;
        }
    }
    static class Tokens {
        public static int ZERO = 0;
        public static int ONE = 1;
    }

    public void visitToken(final DetailClass ast) {

        final DetailClass openingBrace = ast.find(Tokens.ZERO);

        if (openingBrace != null) {
            
        }

    }

    public DetailClass visit(final DetailClass ast) {
        final DetailClass openingBrace = ast.find(Tokens.ZERO);
        DetailClass closingBrace = null;

        if (openingBrace != null) {
            closingBrace = openingBrace.find(Tokens.ONE);
        }
        return closingBrace;
    }
}
