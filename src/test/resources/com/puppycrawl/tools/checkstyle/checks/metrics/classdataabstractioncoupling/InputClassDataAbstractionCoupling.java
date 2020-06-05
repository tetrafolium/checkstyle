package com.puppycrawl.tools.checkstyle.checks.metrics.classdataabstractioncoupling;

import javax.naming.NamingException;
import java.util.*;

public class InputClassDataAbstractionCoupling {    

    public Set _set = /*block comment*/new HashSet();    
    public Map _map = new HashMap();    
    public String _string = "";    
    public int[] _intArray = new int[0];    
    public InnerClass _innerClass = new InnerClass();    
    public AnotherInnerClass _anotherInnerClass = new AnotherInnerClass();
    private class InnerClass { //singleline comment
        public List _list = new ArrayList();
    }

    private class AnotherInnerClass {
        public String _string = "";
    }

    public void foo() throws NamingException {
    }

}

enum InnerEnum {
    VALUE1;

    private InnerEnum()
    {
        map2 = new HashMap();
    }
    private Set map1 = new HashSet();
    private Map map2;
}

class InputThrows {

    public void get() throws NamingException, IllegalArgumentException {
        new java.lang.ref.ReferenceQueue<Integer>();
    }
}
