package com.puppycrawl.tools.checkstyle.checks.coding.finallocalvariable;

import java.math.BigDecimal;


public class InputFinalLocalVariableNameLambda {
    private interface Lambda {
        public Object op(AugmentedOrder a, AugmentedOrder b);
    }
    private static class AugmentedOrder {
        public BigDecimal reduce(final BigDecimal zero, final Lambda l) {
            return null;
        }
        public Object add(final Object amount) {
            return null;
        }
        public Object getAmount() {
            return null;
        }
    }

    private void addTotalValueOfOrder(final AugmentedOrder order) {
    
 }
}
interface Operation {    

    public static final Operation OPERATION = () -> {
        Object result;
        result = null;
        return result;
    };
    public Object apply();
}
