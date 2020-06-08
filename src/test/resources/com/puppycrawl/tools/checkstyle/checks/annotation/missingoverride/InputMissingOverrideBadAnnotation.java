package com.puppycrawl.tools.checkstyle.checks.annotation.missingoverride;

public class InputMissingOverrideBadAnnotation
{
    Runnable r = new Runnable() {

        /**
         * {@inheritDoc}
         */
        public void run() {
            
        }
    };

    void doFoo(final Runnable r) {
        doFoo(new Runnable() {

            /**
             * {@inheritDoc}
             */
            public void run() {
                
            }
        });
    }
}
