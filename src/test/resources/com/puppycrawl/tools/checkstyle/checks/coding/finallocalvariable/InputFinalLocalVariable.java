package com.puppycrawl.tools.checkstyle.checks.coding.finallocalvariable;

public class InputFinalLocalVariable
{
    
    //static block
    
    /** constructor */
    public InputFinalLocalVariable()
    {
        
        // final variable
        

        

        

        

        

        k++;

        k = 2;

        
    }

    public void method(int aArg, final int aFinal, int aArg2)
    {
        

        z++;

        aArg2++;
    }

    public void aMethod()
    {
        

        

        

        

        

        

        k++;

        final class Inner
        {
            public Inner()
            {
                
                
            }
        }
    }

    public void anotherMethod()
    {
        
        

        
        {
            
            
            
            {
               l++;
            }
        }

        
        weird++;

        final InnerClass ic = new InnerClass();

        ic.mInner2 = 1;
    }

    class InnerClass
    {
        

        public int mInner2 = 0;
    }
}

interface Inter
{
    void method(int aParam);
}

abstract class AbstractClass
{
    public abstract void abstractMethod(int aParam);
}

class Blah
{
    

    static int[] getInts() {
        return null;
    }
}

class test_1241722
{
    

    public void doSomething(Object _o)
    {
        System.identityHashCode(_o);
    }

    public void doSomething2(Object _o1)
    {
        o_ = _o1;
    }
}

class class1
{
    public class1(final int x){

    }
}

class AA {
    {
        
        y = 9;
    }
}

enum Enum1 {
    ;

    {
        
        var = 1;
    }
}

class class2 {    

    int[] array = new int[10];
    public void method1(){
        
        x = 3;
    }
    public void method2() {
        for(int i=0;i<5;i++){
            
            x = 3;
        }
        
        for(int i=0;i<5;i++) {
            y = 3;
        }
        for(int i=0;i<5;i++) {
            
            for(int j=0;j<5;j++) {
                z = 3;
            }
        }
    }
    public void method3() {
        
        {
           m = 0;
        }
        while (true) {
            
           n = 0;
        }
    }

    private void foo() {
        
        
        
        q = 1;
        w = 1;
        e = 1;
        e = 2;
        class Local {
            void bar() {
                
                
                
                q = 1;
                q = 2;
                w = 1;
                e = 1;
            }
        }

        
        for (;; i = 1) { }
    }

    public void method4() {
        
        int i = 5;
        while (i > 1) {
            m = 0;
            i++;
        }
        while (true) {
            
            n = 0;
        }
    }
    public void method5() {
        
        
        
    }
}

class classs3 {
    public void method(final int i) {
        switch (i) {
            case 1:
                    // Violation
                break;
            default:
        }
        switch (i) {
            case 1:
                    // No Violation
                break;
            case 2:
                foo = 2;
                break;
            default:
        }
    }
}

class Class3 {
    public void test1() {
        final boolean b = true;
                //Violation

        if (b) {
            shouldBeFinal = 1;
        }
        else {
            shouldBeFinal = 2;
        }
    }

    public void test2() {
        final int b = 10;
                //Violation

        switch (b) {
        case 0:
            shouldBeFinal = 1;
            break;
        default:
            shouldBeFinal = 2;
            break;
        }
    }

    public void test3() {
                // No Violation
        try {
            x = 0;
        } catch (final Exception e) {
            x = 1;
        }

                // No Violation
        try {
            y = 0;
        } finally {
            y = 1;
        }
    }

    public void test4() {
        final boolean b = false;
                // No Violation
        if (b) {
            x = 1;
        } else {
            x = 2;
        }

        if(b) {
            x = 3;
        }
    }

    public void test5() {
        final boolean b = false;
            //Violation
        if(b) {
        }
        if (b) {
            shouldBeFinal = 1;
        } else {
            shouldBeFinal = 2;
        }
    }
}

class class4 {
    public void foo() {
            //violation
        class Bar {
            void bar () {
                    //Violation
                final boolean b = false;
                if (b) {
                    shouldBeFinal = 1;
                } else {
                    shouldBeFinal = 2;
                }
            }
        }
    }
}

class class5 {
    public void test1(){
        final boolean b = false;
            //Violation
        if(b){
            if(b){
                shouldBeFinal = 1;
            } else {
                shouldBeFinal = 2;
            }
        }
    }
    public void test2() {
        final int b = 10;
                //Violation

        switch (b) {
        case 0:
            switch (b) {
            case 0:
                shouldBeFinal = 1;
                break;
            default:
                shouldBeFinal = 2;
                break;
            }
            break;
        default:
            shouldBeFinal = 3;
            break;
        }
    }
    public void test3() {
            //No Violation
        try {
            x = 0;
            try {
                x = 0;
            } catch (final Exception e) {
                x = 1;
            }
        } catch (final Exception e) {
            x = 1;
        }
    }
    public void test4() {
            //violation
        class Bar {
            void bar () {
                    //Violation
                final boolean b = false;
                if (b) {
                    if (b) {
                        shouldBeFinal = 1;
                    } else {
                        shouldBeFinal = 2;
                    }
                } else {
                    shouldBeFinal = 2;
                }
            }
        }

        abstract class Bar2 {
            abstract void method(String param);
        }
    }

    public void test5() {
        
        new Runnable() {
            @Override
            public void run() {
                
                table = new InputFinalLocalVariable();
            }
        };
    }
}
