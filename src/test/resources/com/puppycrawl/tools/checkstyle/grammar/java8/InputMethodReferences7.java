package com.puppycrawl.tools.checkstyle.grammar.java8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.List;


public class InputMethodReferences7 {
    interface LambdaInt {
        <S, T> void m(S p1, T p2);
    }

    interface MyFunctionalInterface {
        void invokeMethodReference();
    }

    static class LambdaImpl implements LambdaInt {
        <S, T> LambdaImpl(final S p1, final T p2) {
        }

        public <S, T> void m(final S p1, final T p2) {
        }
    }

    public void m() {
    }

    public void main(final String[] args) {
        
        LambdaInt li = LambdaImpl::<@TA Object, @TB Object>new;
        
        li = li::<@TA Object, @TB Object>m;
        s = Bar::<List<String>>m;
        s = Bar::<List<List<?>>>m;
    }
}

class Bar<T> {
    static Object m() {
        return null;
    }
}

@Target({ ElementType.TYPE_USE, ElementType.TYPE_PARAMETER })
@interface TA {
}

@Target({ ElementType.TYPE_USE, ElementType.TYPE_PARAMETER })
@interface TB {
}
