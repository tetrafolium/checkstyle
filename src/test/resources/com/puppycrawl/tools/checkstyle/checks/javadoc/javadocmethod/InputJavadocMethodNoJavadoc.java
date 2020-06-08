package com.puppycrawl.tools.checkstyle.checks.javadoc.javadocmethod;

public class InputJavadocMethodNoJavadoc //comment test
{
    public int i1;
    protected int i2;
    int i3;
    private int i4;

    public void foo1() { }
    protected void foo2() { }
    void foo3() { }
    private void foo4() { }

    /** @return wrong */
    public void foo5() { }
    /** @return wrong */
    protected void foo6() { }
    /** @return wrong */
    void foo7() { }
    /** @return wrong */
    private void foo8() { }

    protected class ProtectedInner {
        public int i1;
        protected int i2;
        int i3;
        private int i4;

        public void foo1() { }
        protected void foo2() { }
        void foo3() { }
        private void foo4() { }
    }

    class PackageInner {
        public int i1;
        protected int i2;
        int i3;
        private int i4;

        public void foo1() { }
        protected void foo2() { }
        void foo3() { }
        private void foo4() { }
    }

    private class PrivateInner {
        public int i1;
        protected int i2;
        int i3;
        private int i4;

        public void foo1() { }
        protected void foo2() { }
        void foo3() { }
        private void foo4() { }
    }
}

class PackageClass {
    public int i1;
    protected int i2;
    int i3;
    private int i4;

    public void foo1() { }
    protected void foo2() { }
    void foo3() { }
    private void foo4() { }

    public class PublicInner {
        public int i1;
        protected int i2;
        int i3;
        private int i4;

        public void foo1() { }
        protected void foo2() { }
        void foo3() { }
        private void foo4() { }
    }

    protected class ProtectedInner {
        public int i1;
        protected int i2;
        int i3;
        private int i4;

        public void foo1() { }
        protected void foo2() { }
        void foo3() { }
        private void foo4() { }
    }

    class PackageInner {
        public int i1;
        protected int i2;
        int i3;
        private int i4;

        public void foo1() { }
        protected void foo2() { }
        void foo3() { }
        private void foo4() { }
    }

    private class PrivateInner {
        public int i1;
        protected int i2;
        int i3;
        private int i4;

        public void foo1() { }
        protected void foo2() { }
        void foo3() { }
        private void foo4() { }
    }

    class IgnoredName {
        // ignore by name
        private int logger;
        // no warning, 'serialVersionUID' fields do not require Javadoc
        private static final long serialVersionUID = 0;
    }

    /**/
    void methodWithTwoStarComment() { }
}
