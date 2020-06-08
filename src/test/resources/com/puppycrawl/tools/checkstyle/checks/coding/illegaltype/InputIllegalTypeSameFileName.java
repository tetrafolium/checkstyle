package com.puppycrawl.tools.checkstyle.checks.coding.illegaltype;
import java.util.ArrayList;
import java.util.*;
import com.puppycrawl.tools.checkstyle.checks.coding.illegaltype.InputIllegalTypeGregorianCalendar.SubCalendar;
//configuration: "illegalClassNames": List, GregorianCalendar, java.io.File, SubCalendar, ArrayList
public class InputIllegalTypeSameFileName
{
    InputIllegalTypeGregorianCalendar cal = AnObject.getInstance(); //WARNING
    java.util.Date date = null;
    SubCalendar subCalendar = null;    
    java.util.List<Integer> list = new ArrayList<>(); //WARNING

    private static class AnObject extends InputIllegalTypeGregorianCalendar {

        public static InputIllegalTypeGregorianCalendar getInstance() //WARNING
        {
            return null;
        }

    }

    private void foo() {
         //WARNING
         //WARNING
    }
//WARNING
    
     //WARNING
    
    
}
