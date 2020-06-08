package com.puppycrawl.tools.checkstyle.checks.coding.avoidnoargumentsuperconstructorcall;

/*
 * Config = default
 */
public class InputAvoidNoArgumentSuperConstructorCall extends java.util.ArrayList {

    public InputAvoidNoArgumentSuperConstructorCall() {
        super(); // violation
    }

    public InputAvoidNoArgumentSuperConstructorCall(final int a, final long b) {
        super(/**/); // violation
    }

    public InputAvoidNoArgumentSuperConstructorCall(final long a, final long b) {
        super(// violation
        );
    }

    public InputAvoidNoArgumentSuperConstructorCall(final int a) {
        super(10);
    }

    public InputAvoidNoArgumentSuperConstructorCall(final int a, final int b) {
        super(a);
    }
}

class WithTypeArgs {
    public WithTypeArgs() {
        <String> super();
    }
}

class Outer {

    class InnerNonStatic {
        public InnerNonStatic() {
        }
    }
}

class Derived extends Outer.InnerNonStatic {
    public Derived(final Outer s) {
        s.super(); // Not a redundant call
    }
    public Derived() {
        new Outer().super(); // Not a redundant call
    }
}
