package com.puppycrawl.tools.checkstyle.checks.design.onetoplevelclass;

public class InputOneTopLevelClassDeclarationOrder
{
    private class InnerClass
    {
    }
}

enum InputDeclarationOrderEnum
{
    ENUM_VALUE_1;

    class AsyncProcess {
        
        protected final int maxTotalConcurrentTasks = 0;
    }
}
