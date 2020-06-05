package com.puppycrawl.tools.checkstyle.checks.annotation.missingoverride;

public class InputMissingOverrideGoodOverride
{
    Runnable r = new Runnable() {

        public void run() {
            
        }
    };

    void doFoo(Runnable r) {
        doFoo(new Runnable() {

            public void run() {
                
            }
        });
    }

    void doFoo2(Runnable r) {
        doFoo(new Runnable() {

            public void run() {
                
            }
        });
    }
}
