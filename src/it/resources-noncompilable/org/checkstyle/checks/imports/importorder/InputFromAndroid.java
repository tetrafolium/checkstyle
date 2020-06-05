//non-compiled with javac: contains specially crafted set of imports for testing
package org.checkstyle.checks.importorder;
/**
 * This test-input is intended to be checked using following configuration:
 *
 * groups = {android,androidx,com.android,dalvik,com,gov,junit,libcore,net,org,java,javax}
 * option = top
 * ordered = true
 * separated = true
 * separatedStaticGroups = true
 * staticGroups = {android,androidx,com.android,dalvik,com,gov,junit,libcore,net,org,java,javax}
 *
 * This test-input is based on real application code and shouldn't be changed.
 * @see https://android.googlesource.com/platform/prebuilts/checkstyle/+/master/default-treewalker-checks.xml
 */





class InputFromAndroid {
}
