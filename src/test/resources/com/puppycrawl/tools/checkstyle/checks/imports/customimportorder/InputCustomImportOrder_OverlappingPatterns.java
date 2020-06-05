package com.puppycrawl.tools.checkstyle.checks.imports.customimportorder;


// every import from javadoc package has comment in brackets indicating presence of keywords
// Javadoc, Check, Tag. For example J_T = Javadoc, no Check, Tag

// STANDARD - keyword Check


// SPECIAL_IMPORTS - keyword Tag


//import com.puppycrawl.tools.checkstyle.checks.javadoc.HtmlTag; //warn, should be on SPECIAL (__T)

public class InputCustomImportOrder_OverlappingPatterns {
}
/*
 * test: testRulesWithOverlappingPatterns()
 *
 * Config = default
 * customImportOrderRules = THIRD_PARTY_PACKAGE###SAME_PACKAGE(6)###STANDARD_JAVA_PACKAGE###SPECIAL_IMPORTS
 * standardPackageRegExp = com.puppycrawl.tools.*Check$
 * thirdPartyPackageRegExp = com.puppycrawl.tools.checkstyle.checks.javadoc.*Javadoc*
 * specialImportsRegExp = com.puppycrawl.tools.*Tag*
 * sortImportsInGroupAlphabetically = false
 * separateLineBetweenGroups = true
 *
 */
