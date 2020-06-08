package com.puppycrawl.tools.checkstyle.checks.design.visibilitymodifier;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import com.google.common.collect.ImmutableSet;

public class InputVisibilityModifiersPublicImmutable {
    public final int someIntValue;
    public final ImmutableSet<String> includes;
    public final java.lang.String notes;
    public final BigDecimal value;
    public final List list;
    public InputVisibilityModifiersPublicImmutable(final Collection<String> includes,
                                            final BigDecimal value, final String notes, final int someValue, final List l) {
        this.includes = ImmutableSet.copyOf(includes);
        this.value = value;
        this.notes = notes;
        this.someIntValue = someValue;
        this.list = l;
    }
}
