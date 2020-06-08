package com.google.checkstyle.test.chapter4formatting.rule451wheretobreak;

class InputSeparatorWrapEllipsis {

    public void testMethodWithGoodWrapping(final String... // ok
            parameters) {

    }

    public void testMethodWithBadWrapping(final String
...parameters) { // warn

    }

}

