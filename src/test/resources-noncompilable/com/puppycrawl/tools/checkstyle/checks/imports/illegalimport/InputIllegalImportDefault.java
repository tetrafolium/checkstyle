//non-compiled with jdk10: contains dropped packages



package com.puppycrawl.tools.checkstyle.checks.imports.illegalimport;


import java.util.Arrays;

import static java.io.File.listRoots;


import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.util.Date;
import java.util.Calendar;
import java.util.BitSet;

/**
 * Test case for imports
 * Here's an import used only by javadoc: {@link Date}.
 * @author Oliver Burn
 * @author lkuehne
 * @author Michael Studman
 * @see Calendar Should avoid unused import for Calendar
 **/
class InputIllegalImportDefault
{
    /** ignore **/
    
    /** ignore **/
    
    /** ignore **/
    
    /** ignore **/
    
    /** usage of illegal import **/
    

    /** usage via static method, both normal and fully qualified */
    {
        int[] x = {};
        Arrays.sort(x);
        
        File[] files = listRoots();
    }

    /** usage of inner class as type */
    

    /** usage of inner class in Constructor */
    

    /** usage of inner class in constructor, fully qualified */
    

    /** we use class name as member's name.
     *  also an inline JavaDoc-only import {@link Vector linkText} */
    

    /**
     * method comment with JavaDoc-only import {@link BitSet#aMethod()}
     */
    public void Label() { }

    /**
     * Renders to a {@linkplain Graphics2D graphics context}.
     * @throws HeadlessException if no graphis environment can be found.
     * @exception HeadlessException if no graphis environment can be found.
     */
    public void render() { }

    /**
     * First is a class with a method with arguments {@link TestClass1#method1(TestClass2)}.
     * Next is a class with typed method {@link TestClass3#method2(TestClass4, TestClass5)}.
     *
     * @param param1 with a link {@link TestClass6}
     * @throws TestClass7 when broken
     * @deprecated in 1 for removal in 2. Use {@link TestClass8}
     */
    public void aMethodWithManyLinks() { }
}
