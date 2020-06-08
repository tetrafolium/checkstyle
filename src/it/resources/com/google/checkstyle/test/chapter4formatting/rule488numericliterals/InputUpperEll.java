package com.google.checkstyle.test.chapter4formatting.rule488numericliterals;

class InputUpperEll
{
    /** test **/
     //warn

     //ok

    private long foo()
    {
        processUpperEll(66L); //warn
        processUpperEll(66L); //ok
        processUpperEll("s", 66L); //warn
        processUpperEll("s", 66L); //ok

        return 666L + 666L; //warn
    }

    private void processUpperEll(final long aLong) {
         //warn
         //ok
        long[] array = {
            66L, //warn
            66L, //ok
        };
    }

    private void processUpperEll(final String s, final long l) { }

    class Inner {
        /** test **/
         //warn

         //ok

        private long foo()
        {
            processUpperEll(66L); //warn
            processUpperEll(66L); //ok
            processUpperEll("s", 66L); //warn
            processUpperEll("s", 66L); //ok

            return 666L + 666L; //warn
        }

        private void processUpperEll(final long aLong)
        {
             //warn
             //ok
        }
        private void processUpperEll(final String s, final long l) {
            long[] array = {
                    66L, //warn
                    66L, //ok
                };
        }

        void fooMethod()
        {
            
        }
    }

    class Foo { }

    interface Long {
        public static final long IGNORE = 666L + 666L; //warn
        public static final String notWarn = "666l"; //ok
        long bad = (4 + 5 * 7 ^ 66L / 7 + 890) //warn
                & (88L + 78 * 4); //warn
        long good = (4 + 5 * 7 ^ 66L / 7 + 890) & (88L + 78 * 4); //ok
    }
}



