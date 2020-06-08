package com.puppycrawl.tools.checkstyle.checks.design.innertypelast;

public class InputInnerTypeLastClass {
        public int test1 = 100;

        public void methodTestInner1() {
                

                class InnerInMethod1 {
                        void methodTest1() {
                                System.identityHashCode("test1");
                        }
                }

                
	}

	public void methodTestInner2() {
		

		class InnerInMethod2 {
			int test6 = 500;
		}

		
		
	}

	class Inner1 {
		int test4 = 400;

		public void methodTestInner3() {
			

			class InnerInMethod3 {
				int test10 = 500;
			}

			
			
		}
	}

	void methodTest2() { //violation
		System.identityHashCode("test2");
	}
}

class Temp2 {
	class Inner1 {
		int test4 = 400;

		public void methodTestInner3() {
			

			class InnerInMethod3 {
				int test10 = 500;
			}

			
			
		}
	}

	void methodTest2() { //violation
		System.identityHashCode("test2");
	}

	 //violation
}

class Temp3 {

    class InnerCheck {
        
    }

    public int[] getDefaultTokens()
    {
        return new int[]{1, };
    }
}

class Temp4 {

    class InnerCheck {
        class InnerInnerCheck {
            
        }

        class InnerInnerCheck2 {
            
        }

         // violation
    }
}
