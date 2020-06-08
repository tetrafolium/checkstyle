package com.google.checkstyle.test.chapter5naming.rule525nonconstantfieldnames;

public class InputMemberNameBasic
{
    public int mPublic; //warn
    protected int mProtected; //warn
    int mPackage; //warn
     //warn

    public int _public; //warn
    protected int prot_ected; //warn
    int package_; //warn
     //warn

    public int ppublic; //ok
    protected int pprotected; //ok
    int ppackage; //ok
     //ok

    int ABC = 0; //warn
    final int C_D_E = 0; //warn

    public int $mPublic; //warn
    protected int mPro$tected; //warn
    int mPackage$; //warn
}
