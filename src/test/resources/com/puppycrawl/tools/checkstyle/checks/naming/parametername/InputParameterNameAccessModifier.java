package com.puppycrawl.tools.checkstyle.checks.naming.parametername;

public class InputParameterNameAccessModifier {

    public InputParameterNameAccessModifier(final int pubconstr) { }

    public void v1(final int h) {
        new Object() {
            public void i(final int inner) { }
        };
    }

    protected void v4(final int h) { }

    void v2(final int h) { }

    private void v3(final int h) { }

    public void i1(final int pubpub) { }

    protected void i4(final int pubprot) { }

    void i2(final int pubpack) { }

    private void i3(final int pubpriv) { }

    public interface InterfaceScope {
        void v1(int h);

        void i1(int pubifc);
    }
}

class PrivateScope {

    public void v1(final int h) { }

    protected void v4(final int h) { }

    void v2(final int h) { }

    private void v3(final int h) { }

    public void i1(final int packpub) { }

    protected void i4(final int packprot) { }

    void i2(final int packpack) { }

    private void i3(final int packpriv) {
        try {
            /* Make sure catch var is ignored */
        } catch (Exception exc) {
        }
    }

    interface InterfaceScope {
        void v1(int h);

        void i1(int packifc);
    }

    interface FuncIfc {
        void a(int h);
    }

    public void l() {
        

        
    }
}


