package com.puppycrawl.tools.checkstyle.checks.coding.unnecessarysemicolonaftertypememberdeclaration;

/**
 * Config = default
 */
public class InputUnnecessarySemicolonAfterTypeMemberDeclaration {     // violation

    int field;;    ; //violation

    ; // violation

    ; // violation

    InputUnnecessarySemicolonAfterTypeMemberDeclaration(){}; // violation

    class B{}; // violation

    void method(){}; // violation

    interface aa{}; //violation

    enum aa1{}; // violation

    @interface anno {};
 //violation

    enum c{
        B,C;; // violation
    }

    void ignoreEmptyStatements(){
        
    }
}
enum e {
    ;
    int enumField;
}
@interface an {
    ; //violation
}
interface i {
    ; //violation
}
@interface annotation {
    String value();; // violation
}
enum e1 {}
enum e2 {;}
enum e3 {E;}
enum e4 {E,;}
@interface an1 {}
interface i1 {}
class c {}
