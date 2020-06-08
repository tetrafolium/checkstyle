//non-compiled with javac: contains specially crafted set of imports for testing
package com.puppycrawl.tools.checkstyle.checks.imports.customimportorder;






public class InputCustomImportOrderEclipseDefaultPositive {
}
/*
 * test: testInputCustomImportOrderEclipseDefaultPositive()
 *
 * Config = default
 * customImportOrderRules = STANDARD_JAVA_PACKAGE###SPECIAL_IMPORTS###THIRD_PARTY_PACKAGE###SAME_PACKAGE(2)###STATIC
 * standardPackageRegExp = ^java\.
 * thirdPartyPackageRegExp = ^java\.
 * specialImportsRegExp = ^org\.
 * sortImportsInGroupAlphabetically = true
 * separateLineBetweenGroups = true
 *
 */
