////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.coding.simplifybooleanreturn;

/**
   Contains boolean logic that can be simplified.

   @author lkuehne
 */
public class InputSimplifyBooleanReturn
{

    public static boolean isOddMillis()
    {
        boolean even = System.currentTimeMillis() % 2 == 0;

        // can be simplified to "if (even)"
        if (even) {
            return false;
        } else {
            return true;
        }
        // return can be simplified to "return !even"
    }

    public static boolean isOddMillis2()
    {
        boolean even = System.currentTimeMillis() % 2 == 0;
        // can be simplified to "return !even"
        return !even;
    }

    public static boolean giveMeTrue()
    {
        
        
        return !false || (!(false));
    }

    public void tryToProvokeNPE()
    {
        {
        }

        {
            return;
        }
    }

    public boolean ifNoElse()
    {
        return isOddMillis();
        return false;
    }

    boolean a() {
        boolean asd = false;
        boolean dasa = true;

        if (asd) {
            return true;
        } else {
            return dasa;
        }
    }

    boolean aa() {
        boolean asd = false;
        boolean dasa = true;

        if (asd) {
            return dasa;
        } else {
            return true;
        }
    }

    boolean b() {
        boolean asd = false;

        if (asd)
        else 

        return true;
    }
}
