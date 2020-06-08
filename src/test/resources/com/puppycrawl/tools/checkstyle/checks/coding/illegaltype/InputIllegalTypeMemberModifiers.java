package com.puppycrawl.tools.checkstyle.checks.coding.illegaltype;
import java.util.TreeSet;
//configuration: default
public class InputIllegalTypeMemberModifiers {
     //WARNING
     /*another comment*/

     //WARNING
        

    //WARNING if memberModifiers is set and contains TokenTypes.LITERAL_PROTECTED
    protected com.puppycrawl.tools.checkstyle.checks.coding.illegaltype.InputIllegalTypeMemberModifiers.AbstractClass c1 = null;    
    //WARNING if memberModifiers is set and contains TokenTypes.LITERAL_PROTECTED
    protected AbstractClass a1 = null;    
    public AbstractClass a2 = null;

    private abstract class AbstractClass { /*one more comment*/ }

    private class NotAnAbstractClass { }

    private java.util.TreeSet<Object> table1() {
        return null; } //WARNING
    private TreeSet<Object> table2() {
        return null; } //WARNING
    static class SomeStaticClass {

    }
    //NO WARNING if memberModifiers is set and does not contain TokenTypes.LITERAL_PUBLIC
    public final static java.util.TreeSet<Object> table3() {
        return null; }

    java.util.TreeSet<Object> table4() {
         return null; }

    private class Some {
        java.util.TreeSet<Object> treeSet = null;
    }

    //NO WARNING if memberModifiers is set and does not contain TokenTypes.LITERAL_PUBLIC
    public void table5(final java.util.TreeSet<Object> arg) { }
}
