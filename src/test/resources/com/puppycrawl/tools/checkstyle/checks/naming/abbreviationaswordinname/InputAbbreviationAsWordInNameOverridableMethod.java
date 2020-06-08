package com.puppycrawl.tools.checkstyle.checks.naming.abbreviationaswordinname;

import org.junit.Before;

abstract class InputAbbreviationAsWordInNameOverridableMethod extends Class1 {
        public int serialNUMBER = 6;
        public final int s1erialNUMBER = 6;
        
        

        @Override
        @SuppressWarnings(value = { "" })
        @Before
        protected void oveRRRRRrriddenMethod() {
            
	    // blah-blah
	}
}

class Class1 {
    @SuppressWarnings(value = { "" })
    protected void oveRRRRRrriddenMethod() {
        
        // blah-blah
    }

}

class Class2 extends Class1 {

    @Override
    @SuppressWarnings(value = { "" })
    @Before
	protected void oveRRRRRrriddenMethod() {
        
        // blah-blah
    }

}
