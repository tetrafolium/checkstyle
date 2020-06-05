package com.puppycrawl.tools.checkstyle.checks.coding.superclone;


interface InputSuperClonePlainAndSubclasses {
    InputSuperClonePlainAndSubclasses clone();
}

class A {
  public A clone() { // violation
      return null;
  }
}

class B{
  public B clone() throws CloneNotSupportedException {
      super.clone();
      return null;
  }
  void clone(Object asd, Object asd2) {
  }
}

class C extends B {
  void method() throws CloneNotSupportedException {
    Object asd = null;
    super.clone(asd,asd);
    super.clone();
    
  }

  void method2() {
    new Runnable() {
      @Override
      public void run() {
        C.super.clone(null, null);
      }
    };
  }
}

class D extends B {

  public D clone() throws CloneNotSupportedException { // violation
    super.clone(null, null);
    return null;
  }

}
