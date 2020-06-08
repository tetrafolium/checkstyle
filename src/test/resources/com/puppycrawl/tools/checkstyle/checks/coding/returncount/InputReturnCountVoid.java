package com.puppycrawl.tools.checkstyle.checks.coding.returncount;

class InputReturnCountVoid {
    public InputReturnCountVoid() {
        return;
    }

    public void method() {
        {
            return;
        }
    }

    public void method2() {
        {
            return;
        }

        return;
    }

    public int method3() {
        {
            return 0;
        }

        return 0;
    }

    public int method4() {
        {
            return 0;
        }
        

        return 0;
    }

    void method5() {
        {
            return;
        }

        return;
    }
}
