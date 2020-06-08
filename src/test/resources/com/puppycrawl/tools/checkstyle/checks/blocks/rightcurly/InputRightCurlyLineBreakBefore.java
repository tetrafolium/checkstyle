package com.puppycrawl.tools.checkstyle.checks.blocks.rightcurly;


class InputRightCurlyLineBreakBefore
{
    /** @see test method **/
    int foo() throws InterruptedException
    {
        int x = 1;
        int a = 2;
        while (true)
        {
            try
            {
                if (x > 0)
                {
                    break;
                } else if (x < 0) {
                    
                } else { break; }
                switch (a)
                {
                case 0:
                    break;
                default:
                    break;
                }
            } catch (Exception e) { break; } finally { break; }
        }

        synchronized (this) { do { x = 2; } while (x == 2); }

        synchronized (this) {
            do {} while (x == 2);
        }

        for (int k = 0; k < 1; k++) {  }

        for (int k = 0; k < 1; k++) {}
                return a;
    }

    

    void method2()
    {
        boolean flag = false;
        if (flag) { String.valueOf("foo"); }
    }
}

class Absent_CustomFieldSerializer {

    public static void serialize() {}
}

class Absent_CustomFieldSerializer10
{
    public Absent_CustomFieldSerializer10() {}
}

class EmptyClass {}

interface EmptyInterface {}
