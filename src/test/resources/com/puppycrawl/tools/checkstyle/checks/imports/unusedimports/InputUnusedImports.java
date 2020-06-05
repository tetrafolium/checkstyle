////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.imports.unusedimports;

        
import java.util.Arrays;


import static java.io.File.listRoots;


import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.util.Date;
import java.util.Calendar;
import java.util.BitSet;

import com.puppycrawl.tools.checkstyle.Checker;
import com.puppycrawl.tools.checkstyle.CheckerTest;
import com.puppycrawl.tools.checkstyle.Definitions;
import com.puppycrawl.tools.checkstyle.ConfigurationLoaderTest;
import com.puppycrawl.tools.checkstyle.PackageNamesLoader;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;

/**
 * Test case for imports
 * Here's an import used only by javadoc: {@link Date}.
 * @author Oliver Burn
 * @author lkuehne
 * @author Michael Studman
 * @see Calendar Should avoid unused import for Calendar
 **/
class InputUnusedImports
{
    /** ignore {@literal <B>Test Javadoc Tag that is not processed for imports</B>}**/
    
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
    public void Label() {}

    /**
     * Renders to a {@linkplain Graphics2D graphics context}.
     * @throws HeadlessException if no graphis environment can be found.
     * @exception HeadlessException if no graphis environment can be found.
     */
    public void render() {}

    /**
     * First is a class with a method with arguments {@link Checker#method1(CheckerTest)}.
     * Next is a class with typed method
     * {@link BaseFileSetCheckTestSupport#method2(Definitions, InputUnusedImports15Extensions)}.
     *
     * @param param1 with a link {@link ConfigurationLoaderTest}
     * @throws PackageNamesLoader when broken
     * @deprecated in 1 for removal in 2. Use {@link DefaultConfiguration}
     */
    public void aMethodWithManyLinks() {}
}
