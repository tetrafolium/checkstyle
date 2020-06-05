package com.google.checkstyle.test.chapter4formatting.rule451wheretobreak;

import java.util.Arrays;

class InputOperatorWrap
{
    void test()
    {
        /*warn*/int x = 1 +
                /*warn*/ 2 -
            3
            -
            4;
        x = x + 2;
        
        /*warn*/ y = true &&
            false;
        y = false
            && true;
        /* Note: The three tests below will be used when issue #3381 is closed */
        Arrays.sort(null, String
                    ::
                    compareToIgnoreCase);
        Arrays.sort(null, String::  /*(warn)*/
                    compareToIgnoreCase);
        Arrays.sort(null, String
                    ::compareToIgnoreCase);
    }

    void testAssignment()
    {
        
        
    }

    <
    T extends Comparable &
        java.io.Serializable
    >
    void testGenerics1()
    {
        
        

        boolean flag = false;

        int init = 9;

        /*ok*/ 

        /*warn*/ if (init !=
                9)
        {

        }

        /*warn*/ while (init ==
                10)
        {

        }

        /*warn*/ if (init >
                10)
        {

        } else {}

        /*warn*/ while (init < 10 ||
                !flag) {

        }
    }

    class Inner {
        void testGenerics1
        ()
        {
            
            
            boolean flag = false;

            int init = 9;

            /*ok*/ 

            /*warn*/ if (init !=
                    9)
            {

            }

            /*warn*/ while (init ==
                    10)
            {

            }

            /*warn*/ if (init >
                    10)
            {

            } else {}

            /*warn*/ while (init < 10 ||
                    !flag) {

            }
        }
    }

    Inner anon = new Inner
            (){
        void testGenerics1
        ()
        {
            
            
            boolean flag = false;
            int init = 9;

            /*ok*/ 

            /*warn*/ if (init !=
                    9)
            {

            }

            /*warn*/ while (init ==
                    10)
            {

            }

            /*warn*/ if (init >
                    10)
            {

            } else {}

            /*warn*/ while (init < 10 ||
                    !flag) {

            }
        }
    };
}

class AsInput {
    int abc = 0;
    String string
        = "string";
    double PI = // ok
            3.1415;
}

class Ternary {
    void foo() {
        
        /*warn*/
        
        

    }
}

class AssignClass {
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
}
