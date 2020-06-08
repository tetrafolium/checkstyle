package com.google.checkstyle.test.chapter5naming.rule525nonconstantfieldnames;

final class InputMemberNameSimple
{

    public static final int badConstant = 2;

    public static final int MAX_ROWS = 2;


     //warn

    


     //warn

     //warn

    protected int m_M = 0; //warn


    


    public static int sTest1;

    protected static int sTest3;

    static int sTest2;


    int mTest1; //warn

    public int mTest2; //warn

    public int $mTest2; //warn

    public int mTes$t2; //warn

    public int mTest2$; //warn

    /** test local variables. This Check doesn't verify local variables, only members.*/
    private void localVariables()
    {
        
        
        
        
        
        
        
        
        
        
        

        
        
        
    }

    interface Foo {
        public void greet();

    }

    class InnerClass
    {
        public static final int badConstant = 2;

        public static final int MAX_ROWS = 2;


         //warn

         //warn


         //warn

         //warn

        protected int m_M = 0; //warn


        


        int mTest1; //warn

        public int mTest2; //warn

        public int $mTest2; //warn

        public int mTes$t2; //warn

        public int mTest2$; //warn

        void fooMethod()
        {
            
        }
    }
}
