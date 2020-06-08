////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.google.checkstyle.test.chapter4formatting.rule413emptyblocks;


class InputEmptyBlockBasic
{
     //ok

    public void fooMethod()
    {
        
        int a = 1;
        if (a == 1) { } // warn
        char[] s = {'1', '2'};
        int index = 2;
        if (doSideEffect() == 1) { } // warn
        IO in = new IO();
        while ((r = in.read()) != null) { } // ok
        for (; index < s.length && s[index] != 'x'; index++) { } // ok
        if (a == 1) { } else { System.identityHashCode("a"); }  // warn
        do { } while (a == 1); //ok
         //warn
        int[] z = {}; // ok
    }

    public int doSideEffect()
    {
        return 1;
    }

    public void emptyMethod() { }
}

class IO
{
    public InputEmptyBlockBasic read()
    {
        return new InputEmptyBlockBasic();
    }
}
class Empty { } //ok

interface EmptyImplement { } //ok

class WithInner
{
     //ok

    public void emptyMethod() { }

    public int doSideEffect()
    {
        return 1;
    }

    class Inner
    {
        private void withEmpty()
        {
            
            int a = 1;
            if (a == 1) { } // warn
            char[] s = {'1', '2'};
            int index = 2;
            if (doSideEffect() == 1) { } //warn
            IO in = new IO();
            while ((r = in.read()) != null) { } // ok
            for (; index < s.length && s[index] != 'x'; index++) { } // ok
            if (a == 1) { } else { System.identityHashCode("a"); } // warn
            do { } while (a == 1); //ok
             //warn
            int[] z = {}; // ok
        }
    }
}

class WithAnon
{
    interface AnonWithEmpty {
        public void fooEmpty();
    }

    void method()
    {
        
    }
}

class NewClass {

    void foo() {
        int a = 1;

        if (a == 1) {
            System.identityHashCode("a");
        } else { } // warn

        if (a == 1) {
            System.identityHashCode("a");
        } else { /*ignore*/ } // OK

        if (a == 1) {
            /*ignore*/
        } else {
            System.identityHashCode("a");
        } // ok

        if (a == 1) {
            System.identityHashCode("a");
        } else if (a != 1) {
            /*ignore*/
        } else {
            /*ignore*/
        }

        if (a == 1) {
            /*ignore*/
        } else if (a != 1) {
            System.identityHashCode("a");
        } else {
            /*ignore*/
        }

        if (a == 1) {
            /*ignore*/
        } else if (a != 1) {
            /*ignore*/
        } else {
            System.identityHashCode("a");
        }

        if (a == 1) {
            /*ignore*/
        } else if (a != 1) {
            /*ignore*/
        } else {
            /*ignore*/
        }

        if (a == 1) {
            /*ignore*/
        } else if (a != 1) { } //warn
        else { } //warn

        if (a == 1) { } //warn
        else if (a != 1) {
            /*ignore*/
        }
        else { } //warn

        if (a == 1) { } //warn
        else if (a != 1) { } //warn
        else {
            /*ignore*/
        }
    }

    class NewInner {

        void foo() {
            int a = 1;

            if (a == 1) {
                System.identityHashCode("a");
            } else { } // warn

            if (a == 1) {
                System.identityHashCode("a");
            } else { /*ignore*/ } // OK

            if (a == 1) {
                /*ignore*/
            } else {
                System.identityHashCode("a");
            } // ok

            if (a == 1) {
                System.identityHashCode("a");
            } else if (a != 1) {
                /*ignore*/
            } else {
                /*ignore*/
            }

            if (a == 1) {
                /*ignore*/
            } else if (a != 1) {
                System.identityHashCode("a");
            } else {
                /*ignore*/
            }

            if (a == 1) {
                /*ignore*/
            } else if (a != 1) {
                /*ignore*/
            } else {
                System.identityHashCode("a");
            }

            if (a == 1) {
                /*ignore*/
            } else if (a != 1) {
                /*ignore*/
            } else {
                /*ignore*/
            }

            if (a == 1) {
                /*ignore*/
            } else if (a != 1) { } //warn
            else { } //warn

            if (a == 1) { } //warn
            else if (a != 1) {
                /*ignore*/
            }
            else { } //warn

            if (a == 1) { } //warn
            else if (a != 1) { } //warn
            else {
                /*ignore*/
            }
        }

        NewInner anon = new NewInner() {

            void foo() {
                int a = 1;

                if (a == 1) {
                    System.identityHashCode("a");
                } else { } // warn

                if (a == 1) {
                    System.identityHashCode("a");
                } else { /*ignore*/ } // OK

                if (a == 1) {
                    /*ignore*/
                } else {
                    System.identityHashCode("a");
                } // ok

                if (a == 1) {
                    System.identityHashCode("a");
                } else if (a != 1) {
                    /*ignore*/
                } else {
                    /*ignore*/
                }

                if (a == 1) {
                    /*ignore*/
                } else if (a != 1) {
                    System.identityHashCode("a");
                } else {
                    /*ignore*/
                }

                if (a == 1) {
                    /*ignore*/
                } else if (a != 1) {
                    /*ignore*/
                } else {
                    System.identityHashCode("a");
                }

                if (a == 1) {
                    /*ignore*/
                } else if (a != 1) {
                    /*ignore*/
                } else {
                    /*ignore*/
                }

                if (a == 1) {
                    /*ignore*/
                } else if (a != 1) { } //warn
                else { } //warn

                if (a == 1) { } //warn
                else if (a != 1) {
                    /*ignore*/
                }
                else { } //warn

                if (a == 1) { } //warn
                else if (a != 1) { } //warn
                else {
                    /*ignore*/
                }
            }
        };
    }
}

class Example {

    void doNothing() { } // ok

    void doNothingElse() { // ok

    }
}
