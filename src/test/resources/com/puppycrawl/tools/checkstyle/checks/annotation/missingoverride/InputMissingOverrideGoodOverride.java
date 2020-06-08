package com.puppycrawl.tools.checkstyle.checks.annotation.missingoverride;

public class InputMissingOverrideGoodOverride
{
    Runnable r = new Runnable() {

        public void run() {
            
        }
    };

    void doFoo(final Runnable r) {
        doFoo(new Runnable() {

            public void run() {
                
            }
        });
    }

    void doFoo2(final Runnable r) {
        doFoo(new Runnable() {

            public void run() {
                
            }
        });
    }
}
