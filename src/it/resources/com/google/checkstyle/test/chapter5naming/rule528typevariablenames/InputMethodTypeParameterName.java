package com.google.checkstyle.test.chapter5naming.rule528typevariablenames;

import java.io.Serializable;

class InputMethodTypeParameterName<t>
{
    public <TT> void foo() { }

    <e_e> void foo(final int i) { //warn
    }
}

class Other2<foo extends Serializable & Cloneable> {

    foo getOne() {
    return null;
    }

    <Tfo$o2T extends foo> Tfo$o2T getTwo(final Tfo$o2T a) { //warn
    return null;
    }

    <foo_ extends Runnable> foo getShadow() { //warn
    return null;
    }

    static class Junk<$foo> {
        <_abc extends $foo> void getMoreFoo() { //warn
    }
    }
}

class MoreOther3<T extends Cloneable> {

    <E extends T> void getMore() {
        new Other2() {
            <T$> void getMoreFoo() { //warn
        }
    };

        
    }
}
