////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: Feb-2001
// Ignore violation
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.naming.localvariablename;


class InputLocalVariableNameOneCharInitVarName
{
        public void fooMethod()
        {
                for(int i = 1; i <10; i++) {
                        
                }
        for(int K = 1; K < 10; K++) {
            
        }
                int i = 0;

        for(int index = 1; index < 10; index++) {
                        //come code
                }

        for(int Index = 1; Index < 10; Index++) {
                        //come code
                }

        int index = 1;

                for(; index < 10; index++) {
                        //come code
                }

                for(; i < 12; i++) {
                        //come code
                }

                

                
                
        }
}
