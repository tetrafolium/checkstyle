package com.puppycrawl.tools.checkstyle.grammar;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class InputRegressionJavaClass1 {
    //comments

    // single line
    /* multi on single line */
    /* multi
     line */
    /** javadoc */
    // tab ->   <-

    // fields
    // modifiers
    public int f1;
    
    protected int f3;
    int f4;
    static int f5;
    final int f6;
    volatile int f7;
    transient int f8;
    Object f9;

    // constructors
    
    public InputRegressionJavaClass1() {
        f6 = 0; }
    public InputRegressionJavaClass1(final int i) {
        this.f6 = i; }
    public InputRegressionJavaClass1(final float f) {
        this((int) f); }
    InputRegressionJavaClass1(final double a) throws Exception {
        f6 = 0; }

    // methods
    // modifiers
    native void m1();
    void m2() { }
    synchronized void m4() { }
    strictfp void m5() { }

    // returns
    public int[] m6() {
        return null; }
    public int m7() [] {
        return null; }

    // parameters
    public void m10(final String p1) { }
    public void m11(final String p1) { }
    public void m12(final String[] p1) { }
    public void m13(final String[][] p1) { }
    public void m14(final String p1, final String p2) { }
    public void m15(final String... p1) { }
    public void m16(final String[]... p1) { }
    public void m17(final int p1, final String[]... p2) { }

    // throws
    public void m18() throws Exception { }
    public void m19() throws IOException, Exception { }

    // types
    public <T_$> T_$ m20() {
        return null; }
    public <$_T> $_T m21() {
        return null; }
    public <T extends Enum<T>> void m22() { }
    public <T> void m23() { };
    public <T extends RuntimeException & java.io.Serializable> void m24() { }

    // annotations
    @SuppressWarnings({})
    public void m50() { }
    @SuppressWarnings({"1"})
    public void m51() { }
    @SuppressWarnings({"1", "2"})
    public void m52() { }
    @SuppressWarnings(value = {"1"})
    public void m53() { }
    @SuppressWarnings(value = {"1", })
    public void m54() { }
    @SuppressWarnings(value = {"1", "2"})
    public void m55() { }
    @InputRegressionJavaAnnotation1(m1 = "1", m2 = "2")
    public void m56() { }
    @ComplexAnnotation({
            @InputRegressionJavaAnnotation1(m1 = "1"), @InputRegressionJavaAnnotation1(m1 = "1")
    })
    public void m57() { }
    public void m58(final @Deprecated String s) { }
    public void m59(final @Deprecated List l) { }

    // extra
    
;

    // instructions
    public void instructions() throws Exception {
        // used to let inputs compile
        boolean b = Math.random() > 0;

        // variables and types
        
        boolean vboolean;
        
        
        int vint;
        
        
        
        int[] varray;
        int varray2[];
        

        // types
        
        
        
        int[] test2 = {};
        
        
        
        
        
        
        

        // literals
        vboolean = true;
        vboolean = false;
        vchar = ' ';
        vchar = '"';
        vchar = '\0';
        vchar = '\'';
        vchar = '\n';
        vchar = '\r';
        vchar = '\t';
        vchar = '\b';
        vchar = '\f';
        vchar = '\"';
        vchar = '\'';
        vchar = '\\';
        vchar = '\00';
        vchar = '\013';
        vchar = '\4';
        vchar = '\40';
        vchar = '\u0000';
        vchar = '\u1234';
        vchar = '\u005C\u005C';
        vchar = '\u005c\u005c';
        vchar = '\uu005C\uuuuu005C';
        vchar = '\u005cn';
        vchar = '\u005cr';
        vchar = '\u005ct';
        vchar = '\u005cb';
        vchar = '\u005cf';
        vchar = '\u005c"';
        vchar = '\u005c'';
        vchar = '\u005c\';
        vint = 0;
        vint = -1;
        vint = +1;
        vint = 100_000;
        vint = 0x00;
        vint = 0x12345678;
        vint = 0X9;
        vint = 0x1234_5678;
        vint = 0b101;
        vint = 0B101;
        vint = 0b1;
        vint = 0b1_0;
        vint = 012345670;
        vint = 01234_5670;
        vlong = 0L;
        vlong = 1L;
        vlong = 0b1L;
        vlong = 1_234_567_890L;
        vlong = 1_234_567_890L;
        vlong = 0x0L;
        vlong = 0xABCDEFL;
        vlong = 0XABCDEFL;
        vfloat = 0f;
        vfloat = 0F;
        vfloat = 1.1f;
        vfloat = 1.10_1F;
        vfloat = 0_1.1_1F;
        vfloat = 1e0f;
        vfloat = 1e0F;
        vfloat = 1.0e0F;
        vfloat = 0x2__3_34.4___AFP00_00f;
        vdouble = 10.;
        vdouble = .1;
        vdouble = .1__1_1;
        vdouble = 0.0;
        vdouble = 1000.0;
        vdouble = .1d;
        vdouble = 1.D;
        vdouble = 0_1.0d;
        vdouble = 0_1.0D;
        vdouble = 4e23;
        vdouble = 4E23;
        vdouble = 4E2_3;
        vdouble = 0x0.0000000000001p-1022;
        vdouble = 0x0.0000000000001P-1022;
        vdouble = 0X0.0000000000001p+1022;
        vdouble = 0X0.0000000000001P+1022;
        vdouble = 0x.0P0;
        vdouble = 0X0p+2;
        vdouble = 0X0p+20F;
        vdouble = 0X0p+2D;
        vdouble = 0X0p+2d;
        vdouble = 0x1.P-1;
        vdouble = 0x.1___AFp1;
        vstring = null;
        vstring = "";
        vstring = "\\";

        // assignments and operators
        vint = 1 + 1;
        vint = 1 - 1;
        vint = 1 * 1;
        vint = 1 / 1;
        vint = 1 % 1;
        vint = 1 & 1;
        vint = 1 | 1;
        vint = 1 ^ 1;
        vint = ~1;
        vboolean = 1 != 0;
        vboolean = 1 == 0;
        vboolean = 1 > 0;
        vboolean = 1 >= 0;
        vboolean = 1 < 0;
        vboolean = 1 <= 0;
        vboolean = true && true;
        vboolean = true || true;
        vboolean = true ? true : false;
        vboolean = !true;
        vboolean = f9 instanceof Object;
        vint = 1 << 1;
        vint = 1 >> 1;
        vint = 1 >>> 1;
        vint += 1;
        vint -= 1;
        vint *= 1;
        vint /= 1;
        vint %= 1;
        vint &= 1;
        vint |= 1;
        vint ^= 1;
        vint <<= 1;
        vint >>= 1;
        vint >>>= 1;
        vint++;
        vint--;
        ++vint;
        --vint;
        String[] arrayinit = {};
        String[] arrayinit2 = {""};
        String[] arrayinit3 = {"", "", };

        // new
        varray = new int[]{};
        varray = new int[]{0};
        varray = new int[]{0, 1};
        varray = new int[5];
        vlist = new ArrayList<String>();
        vmap = new HashMap<String, String[]>();
        

        // statements
        
        this.f1 = 0;

        // labels
        test_label1:

        // blocks
        { }
        
        
        if (b) {
            for (;;) {
                ;
            }
        }
        if (b) {
            for (;;) { }
        }
        for (int i = 0; i < 1; i++) { }
        for (int i = 0, j = 0; i < 1; i++, j += 2) { }
        
        
        
        if (b) {
            while (true) {
                ;
            }
        }
        if (b) {
            while (true) { }
        }
        
        

        switch (0) {
            case 1:
            case 0: break;
            default: break;
        }

        try {
            if (b) {
                throw new IOException();
            }
            if (b) {
                throw new ArrayIndexOutOfBoundsException();
            }
            throw new Exception();
        } catch (IOException | ArrayIndexOutOfBoundsException | Exception e) {
        } 
        try (BufferedReader br = new BufferedReader(new InputStreamReader(null, "utf-8"))) { }
        try (BufferedReader br1 = new BufferedReader(new InputStreamReader(null, "utf-8"));
                BufferedReader br2 = new BufferedReader(new InputStreamReader(null, "utf-8"));) { }

        // access
        test4 = InputRegressionJavaClass1.class;
        test4 = List[].class;
        test4 = boolean[].class;
        varray[0] = 0;
        for (String[] s : new String[][]{{}}) {
            ;
        }
        

        // others
        for (;;) {
            break; }
        test_label2:
        for (;;) {
            break test_label2; }
        if (b) {
            for (;;) {
                continue; }
                }
        if (b) {
            test_label3: for (;;) {
                continue test_label3; }
                }
        
        
        assert false;
        assert true : "false";
        f9 = (Object) f9;
        f9.equals(vstring = "");
        for (int i = 0; (i) < (6 + 6); i++) {
            ;
        }
        if (b & b) { }

        // ast error handling
        vint = vboolean ? vint = 1 : (vint = 0);
        varray[vint] = Integer.parseInt("0");
    }

    public @interface innerAnnotation { }
}
