//for test there's warning when single line comment isn't separated from PACKAGE_DEF by line
//violation is expected after the next line. Starting * on next comment is to kill mutation
//*because utility doesnt check javadoc but any comment with starting *.
package com.puppycrawl.tools.checkstyle.checks.whitespace.emptylineseparator.packageinfo.test4;

//that import is for doing check of PACKAGE_DEF,
//because EmptyLineSeparatorCheck doesn't check last token
