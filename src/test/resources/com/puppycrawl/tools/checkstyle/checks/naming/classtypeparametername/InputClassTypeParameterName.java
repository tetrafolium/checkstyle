package com.puppycrawl.tools.checkstyle.checks.naming.classtypeparametername;

import java.io.Serializable;

public class InputClassTypeParameterName<t>
{
    public <TT> void foo() { }

    <e_e> void foo(final int i) {
    }
}

class Other<foo extends Serializable & Cloneable> {

    foo getOne() {
        return null; //comment
    }

    <Tfo$o2T extends foo> /*comment*/Tfo$o2T getTwo(final Tfo$o2T a) {
        return null;
    }

    <foo extends Runnable> foo getShadow() {
        return null;
    }

    static class Junk<foo> {
        <_fo extends foo> void getMoreFoo() {
        }
    }
}

class MoreOther<T extends Cloneable> {

    <E extends T> void getMore() {
        new Other() {
            <T> void getMoreFoo() {
            }
        };

//        Other o = new Other() {
//            <EE> void getMoreFoo() {
//            }
//        };
    }
}

interface Boo<Input> {
    Input boo();
}

interface FooInterface<T> {
    T foo();
}

interface FooInterface2 {
    Input foo();
}

class Input {

}
