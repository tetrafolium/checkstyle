package com.puppycrawl.tools.checkstyle.checks.coding.declarationorder;

import java.io.InputStream;
import java.io.IOException;

public class InputDeclarationOrderVariableAccess {

    public static final String TYPE = "significant_terms";

    

    public static final InputDeclarationOrderVariableAccess.Stream STREAM =
            new InputDeclarationOrderVariableAccess.Stream() {
        @Override
        public InputDeclarationOrderVariableAccess readResult(final InputStream in) throws IOException {
            InputDeclarationOrderVariableAccess buckets = new InputDeclarationOrderVariableAccess();
            buckets.readFrom(in);
            return buckets;
        }
    };

    InputDeclarationOrderVariableAccess() { }

    public void readFrom(final InputStream in) throws IOException {
    }

    static class Stream {
        public InputDeclarationOrderVariableAccess readResult(final InputStream in) throws IOException {
            return null;
        }
    }
}
