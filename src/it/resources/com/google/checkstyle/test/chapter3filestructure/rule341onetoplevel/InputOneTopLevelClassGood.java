package com.google.checkstyle.test.chapter3filestructure.rule341onetoplevel;
public class InputOneTopLevelClassGood //ok
{
    public InputOneTopLevelClassGood() throws CloneNotSupportedException
    {
        super.equals(new String());
        super.clone();
    }

    public InputOneTopLevelClassGood clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public void method() throws CloneNotSupportedException
    {
        super.clone();
    }

    {
        super.clone();
    }
}
