package com.puppycrawl.tools.checkstyle.grammar.java8;

import java.util.logging.Logger;


public class InputLambda10 {

        private static final Logger LOG = Logger.getLogger(InputLambda10.class.getName());

        public static void testVoidLambda(final TestOfVoidLambdas test) {
                LOG.info("Method called");
                test.doSmth("fef");
        }


        public static void main(final String[] args) {

                testVoidLambda(s1 -> LOG.info(s1));
        }

        private interface TestOfVoidLambdas {

		public void doSmth(String first);
	}
}
