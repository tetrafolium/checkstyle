package com.google.checkstyle.test.chapter4formatting.rule451wheretobreak;


class InputMethodParamPad
{
    void test()
    {
        int x = 1
                 + 2
            - 3
            -
            4;
        x = x + 2;
        
         y = true
            && false;
        y = false
            && true;
    }

    void testAssignment()
    {
        
        
    }

    <
     T extends Comparable
        & java.io.Serializable
    >
    void testGenerics1()
    {
        
        

        boolean flag = false;

        int init = 9;

        /*ok*/ 

         if (init
                != 9)
        {

        }

         while (init
                == 10)
        {

        }

         if (init
                > 10)
        {

        } else { }

         while (init < 10
                || !flag) {

        }
    }

    class Inner {
        void testGenerics1
        () //warn
        {
            
            
            boolean flag = false;

            int init = 9;

            /*ok*/ 

             if (init
                    != 9)
            {

            }

             while (init
                    == 10)
            {

            }

             if (init
                    > 10)
            {

            } else { }

             while (init < 10
                    || !flag) {

            }
        }
    }

    Inner anon = new Inner
            () {  //warn
        void testGenerics1
        () //warn
        {
            
            
            boolean flag = false;
            int init = 9;

            /*ok*/ 

             if (init
                    != 9)
            {

            }

             while (init
                    == 10)
            {

            }

             if (init
                    > 10)
            {

            } else { }

             while (init < 10
                    || !flag) {

            }
        }
    };
}

class AsInput1 {
    int abc = 0;
    String string
        = "string";
    double PI = // ok
            3.1415;
}

class Ternary2 {
    void foo() {
        
        
        
        

    }
}

class AssignClass3 {
    void foo() {
        int i = 0;
        int j = 0;
        i +=
                1;
        j
             += 2;
        i -=
                1;
        j
             -= 2;
        i /=
                1;
        j
             /= 2;
        i *=
                1;
        j
             *= 2;
        i %=
                1;
        j
             %= 2;
        i ^=
                1;
        j
             ^= 2;
        i |=
                1;
        j
             |= 2;
        i &=
                1;
        j
             &= 2;
        i >>=
                1;
        j
            >>= 2;
        i >>>=
                1;
        j
            >>>= 2;
        i <<=
                1;
        j
            <<= 2;
    }

    class InnerClass {
        void foo() {
            int i = 0;
            int j = 0;
            i +=
                    1;
            j
                 += 2;
            i -=
                    1;
            j
                 -= 2;
            i /=
                    1;
            j
                 /= 2;
            i *=
                    1;
            j
                 *= 2;
            i %=
                    1;
            j
                 %= 2;
            i ^=
                    1;
            j
                 ^= 2;
            i |=
                    1;
            j
                 |= 2;
            i &=
                    1;
            j
                 &= 2;
            i >>=
                    1;
            j
                >>= 2;
            i >>>=
                    1;
            j
                >>>= 2;
            i <<=
                    1;
            j
                <<= 2;
        }
    }

    InnerClass anon = new InnerClass() {
        void foo() {
            int i = 0;
            int j = 0;
            i +=
                    1;
            j
                 += 2;
            i -=
                    1;
            j
                 -= 2;
            i /=
                    1;
            j
                 /= 2;
            i *=
                    1;
            j
                 *= 2;
            i %=
                    1;
            j
                 %= 2;
            i ^=
                    1;
            j
                 ^= 2;
            i |=
                    1;
            j
                 |= 2;
            i &=
                    1;
            j
                 &= 2;
            i >>=
                    1;
            j
                >>= 2;
            i >>>=
                    1;
            j
                >>>= 2;
            i <<=
                    1;
            j
                <<= 2;
        }
    };

    enum TestEnum {
        FIRST() // warn
            {
            },

        SECOND
            () // warn
            {
            }
    }
}
