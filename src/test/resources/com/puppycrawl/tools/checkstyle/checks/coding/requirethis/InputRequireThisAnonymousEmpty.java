package com.puppycrawl.tools.checkstyle.checks.coding.requirethis;

public class InputRequireThisAnonymousEmpty {

    

    interface AnonWithEmpty {
        public void fooEmpty();
    }

    void method() {
        

        new AnonWithEmpty() {
            int anonMember = 0;

            @Override
            public void fooEmpty() {
                new AnonWithEmpty() {

                    @Override
                    public void fooEmpty() {
                        anonMember++;
                    }
                };
            }
        };

        new AnonWithEmpty() {
            int foobar = 1;
            @Override
            public void fooEmpty() {
                foobar++;
            }
        };
    }
}
