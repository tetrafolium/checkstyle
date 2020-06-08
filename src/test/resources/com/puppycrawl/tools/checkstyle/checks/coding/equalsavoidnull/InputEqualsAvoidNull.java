package com.puppycrawl.tools.checkstyle.checks.coding.equalsavoidnull;
import java.util.Map;
public class InputEqualsAvoidNull {

    public boolean equals(final Object o) {
    return false;
    }
    // another comment
    /**
     * methods that should get flagged
     * @return
     */
    public void flagForEquals() {

        Object o = new Object();
        

        "hot pizza".equals(o)/*comment test*/;

        o.equals(s = "cold pizza");

        o.equals(s = "cold pizza");

        o.equals("cheese" + "ham" + "sauce");

        o.equals(("cheese" + "ham") + "sauce");

        o.equals((("cheese" + "ham")) + "sauce");
    }

    /**
     * methods that should get flagged
     */
    public void flagForEqualsIgnoreCase() {
        String s = "pizza";

        "hot pizza".equalsIgnoreCase(s);

        s.equalsIgnoreCase(s = "cold pizza");

        s.equalsIgnoreCase(s = "cold pizza");

        s.equalsIgnoreCase("cheese" + "ham" + "sauce");

        s.equalsIgnoreCase(("cheese" + "ham") + "sauce");

        s.equalsIgnoreCase((("cheese" + "ham")) + "sauce");
    }

    /**
     * methods that should get flagged
     */
    public void flagForBoth() {
        Object o = new Object();
        String s = "pizza";

        "hot pizza".equals(o);

        o.equals(s = "cold pizza");

        o.equals(s = "cold pizza");

        o.equals("cheese" + "ham" + "sauce");

        o.equals(("cheese" + "ham") + "sauce");

        o.equals((("cheese" + "ham")) + "sauce");

        "hot pizza".equalsIgnoreCase(s);

        s.equalsIgnoreCase(s = "cold pizza");

        s.equalsIgnoreCase(s = "cold pizza");

        s.equalsIgnoreCase("cheese" + "ham" + "sauce");

        s.equalsIgnoreCase(("cheese" + "ham") + "sauce");

        s.equalsIgnoreCase((("cheese" + "ham")) + "sauce");
    }


    /**
     * methods that should not get flagged
     *
     * @return
     */
    public void noFlagForEquals() {
        Object o = new Object();
        String s = "peperoni";

        o.equals(s += "mushrooms");

        (s = "thin crust").equals("thick crust");

        (s += "garlic").equals("basil");

        ("Chicago Style" + "NY Style").equals("California Style" + "Any Style");

        equals("peppers");

        "onions".equals(o);

        o.equals(new Object());

        o.equals(equals(o));

        equals("yummy");

        new Object().equals("more cheese");

        InputEqualsAvoidNullOutter outter = new InputEqualsAvoidNullOutter();

        outter.new InputEqualsAvoidNullInner().equals("eat pizza and enjoy inner classes");
    }

    /**
     * methods that should not get flagged
     */
    public void noFlagForEqualsIgnoreCase() {
        String s = "peperoni";
        String s1 = "tasty";

        s.equalsIgnoreCase(s += "mushrooms");

        s1.equalsIgnoreCase(s += "mushrooms");

        (s = "thin crust").equalsIgnoreCase("thick crust");

        (s += "garlic").equalsIgnoreCase("basil");

        ("Chicago Style" + "NY Style").equalsIgnoreCase("California Style" + "Any Style");

        "onions".equalsIgnoreCase(s);

        s.equalsIgnoreCase(new String());

        s.equals(s1);

        new String().equalsIgnoreCase("more cheese");

    }

    public void noFlagForBoth() {
        Object o = new Object();
        String s = "peperoni";
        String s1 = "tasty";

        o.equals(s += "mushrooms");

        (s = "thin crust").equals("thick crust");

        (s += "garlic").equals("basil");

        ("Chicago Style" + "NY Style").equals("California Style" + "Any Style");

        equals("peppers");

        "onions".equals(o);

        o.equals(new Object());

        o.equals(equals(o));

        equals("yummy");

        new Object().equals("more cheese");

        InputEqualsAvoidNullOutter outter = new InputEqualsAvoidNullOutter();

        outter.new InputEqualsAvoidNullInner().equals("eat pizza and enjoy inner classes");

        s.equalsIgnoreCase(s += "mushrooms");

        s1.equalsIgnoreCase(s += "mushrooms");

        (s = "thin crust").equalsIgnoreCase("thick crust");

        (s += "garlic").equalsIgnoreCase("basil");

        ("Chicago Style" + "NY Style").equalsIgnoreCase("California Style" + "Any Style");

        "onions".equalsIgnoreCase(s);

        s.equalsIgnoreCase(new String());

        s.equals(s1);

        new String().equalsIgnoreCase("more cheese");

    }

}

class InputEqualsAvoidNullOutter {
    public class InputEqualsAvoidNullInner {
            public boolean equals(final Object o) {
                return true;
            }
    }
}

class MyString {
    public boolean equals() {
        return true;
    }

    public boolean equals(final String s1) {
        return true;
    }

    public boolean equalsIgnoreCase() {
        return true;
    }

    public boolean equalsIgnoreCase(final String s1) {
        return true;
    }

    

    public void main() {
        MyString myString = new MyString();
        myString.equals();
        "what".equals(myString);
        myString.equalsIgnoreCase();
        "what".equalsIgnoreCase(myString);
        myString.equals(this.pizza = "cold pizza");
    }
}

class NewTest {
    static String classVar;
    String instanceVar;
    NewTest testObj = new NewTest("");        
        static String enumStatic;    

    Object o2 = new Object();    
    Object o3 = new Object();

    NewTest(final String param) {
        "".equals(param);
    }

    public void method(final String param) {
        final String localVar = "";

        "".equals(localVar);
        "".equals(param);

        "".equals(classVar);
        "".equals(instanceVar);
        "".equals(NewTest.classVar);
        this.classVar.equals("");
        this.instanceVar.equals("");

        NewTest testObj = new NewTest("");
        this.testObj.instanceVar.equals(""); // not violated, too confusing
        "".equals(testObj.classVar); // not violated

        for (Nested instanceVar = new Nested(); instanceVar != null; ) {
            instanceVar.equals(1);
            if ("".equals(instanceVar)) {
                "".equals(instanceVar);
            }
        }

        class Inner {
            String instanceVarInner;

            public void main() {
                "".equals(classVar);
                "".equals(instanceVar);
                "".equals(NewTest.classVar);

                "".equals(instanceVarInner);
                this.instanceVarInner.equals("");
                "".equals(localVar);

                NewTest testObj = new NewTest("");
                "".equals(testObj.instanceVar); // not violated
                "".equals(testObj.classVar); // not violated

                Inner testInnerObj = new Inner();
                "".equals(testInnerObj.instanceVarInner); // not violated
            }
        }

        Inner testInnerObj = new Inner();
        "".equals(testInnerObj.instanceVarInner); // not violated

        "".equals(Nested.nestedClassVar); // not violated, because the equals call is not
        Nested Nested = new Nested(); // embedded in class Nested, what can lead to really
        "".equals(Nested.nestedInstanceVar); // confusing constructions. But could be improved.
        "".equals(Nested.nestedClassVar);
    }
    static {
        final String s = "";
        "".equals(s);
        {
            final String x = "";
            class A {
                void foo() {
                    "".equals(s);
                    "".equals(x);
                }
            }
        }
    }
    void foo(final String param) {
        try {
            "".equals(param);
            do {
                String s = "";
                "".equals(s);
            } while ("".equals(param));
        } catch (Exception e) {
            while ("".equals(param)) {
                for (String s = ""; "".equals(s); ) {
                    if ("".equals(s)) {
                        synchronized (this) {
                            switch (s) {
                                case "1": String str = ""; "".equals(str);
                                case "2": "".equals(s); str = ""; "".equals(str);
                                case "3": "".equals(param);
                                    break;
                            }
                        }
                    }
                }
            }
        }
    }

    static class Nested {
        static String nestedClassVar;
        String nestedInstanceVar;
        public void method() {
            "".equals(classVar);
            "".equals(NewTest.classVar);
            this.nestedInstanceVar.equals("");
            "".equals(nestedClassVar);
            "".equals(nestedInstanceVar);

            class Inner {
                public void method() {
                    "".equals(classVar);
                    "".equals(NewTest.classVar);
                    "".equals(nestedClassVar);
                    "".equals(nestedInstanceVar);
                }
            }
        }
    }
    enum EmbeddedEnum {
        A(129),
        B(283),
        C(1212) {
            String constDefVar;
            public void doSomething() {
                "".equals(constDefVar);
            }
        };

        Map.Entry<String, Long> enumInstance;

        EmbeddedEnum(final int i) {
            "".equals(enumInstance);
        }

        public static void doSomethingStatic() {
            "".equals(enumStatic);
            (enumStatic == null);
        }
    }

    private String foo() {
        return ""; }
    private Object foo(final int i) {
        return i; }
    private void bar() {
        foo().equals(""); // methods are not checked
        foo(0).equals("");
        this.foo().equals("");
        Object o1 = new Object(); "".equals(o1);
        "".equals(o2); String o2 = "";
        "".equals(o3);

    }
}
class Anonymous {
    public static void main(final String[] args) {
        
        Object nullableStr = new Object();
        "".equals(nullableStr);
    }
    
}

enum TestEnum {
    ONE;
    public void foo() {
        TestEnum.ONE.equals(this);
        this.ONE.equals(this);
    }
}

class TestConcatenations {
    String s = null;

    void foo() {
        s.equals(s + s);
        s.equals("a" + "b");
        s.equals(getInt() + s);
        s.equals(getInt() + getInt());
        s.endsWith("a");
        String s = "";
        if (!s.equals("Hello[EOL]" + System.getProperty("line.separator")))
            foo();
    }

    int getInt() {
        return (Integer) null;
    }
}

class TestThisWithNotStringInstance {

    MyString notString;

    void foo() {
        this.notString.equals(""); // ok
    }

}
