package com.puppycrawl.tools.checkstyle.checks.coding.requirethis;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class InputRequireThisMethodReferences {
    

    public InputRequireThisMethodReferences(final Set<String> tags) {
         // violation
    }

    public InputRequireThisMethodReferences() {
        this.tags = Arrays.stream(
            new String[] {"br", "li", "dt", "dd", "hr", "img", "p", "td", "tr", "th", })
            .collect(Collectors.toCollection(TreeSet::new));
    }
}
