package com.puppycrawl.tools.checkstyle.checks.coding.illegaltype;

import static com.puppycrawl.tools.checkstyle.utils.CheckUtil.isElseIf;
import static com.puppycrawl.tools.checkstyle.checks.coding.illegaltype.InputIllegalType.SomeStaticClass;
//configuration: "illegalClassNames": SomeStaticClass
public class InputIllegalTypeStaticImports
{     
     SomeStaticClass staticClass;      private boolean foo(final String s) {
         return isElseIf(null);
     }
//WARNING
     private static SomeStaticClass foo1() {
         return null; }
     private static void foo2(final SomeStaticClass s) { }
}
