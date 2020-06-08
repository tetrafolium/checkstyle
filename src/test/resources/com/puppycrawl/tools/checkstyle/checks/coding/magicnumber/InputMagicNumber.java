package com.puppycrawl.tools.checkstyle.checks.coding.magicnumber;

/**
 * Describe class InputMagicNumber
 * @author Rick Giles
 * @version 6-May-2003
 */
public class InputMagicNumber {
    public void magicMethod() {
        //constants, ignore
        
        
        
        
        
        
        
        

        //ignore by default
        int int_var1 = 1;
        
        
        
        
        

        int[] int_array = new int[2];

        int_var1 = 1 + 2;
        int_var1 += 1;
        double_var1 = 1.0 + 2.0;

        for (int i = 0; i < 2; i++) {
            ;
        }

        if (1 < 2)

        if (1.0 < 2.0)

        //magic numbers
        int int_magic1 = 3_000;
        double double_magic1 = 1.5_0;
        

        int_array = new int[3];

        int_magic1 += 3;
        double_magic1 *= 1.5;

        for (int j = 3; j < 5; j += 3) {
            int_magic1++;
        }

        if (int_magic1 < 3) {
            int_magic1 = int_magic1 + 3;
        }

        //octal
        
        
        

        
        

        //hex
        
        
        
        
        
        
    }
}

interface Blah2
{
  int LOW = 5;
  int HIGH = 78;
}

class ArrayMagicTest
{
    
    
    
}

/** test long hex */
class LongHex
{
    long l = 0xffffffffL;
}

/** test signed values */
class Signed
{
    public static final int CONST_PLUS_THREE = +3;
    public static final int CONST_MINUS_TWO = -2;
    
    
    
    
}

/** test octal and hex negative values */
class NegativeOctalHex
{
    
    
    
    
    
    
    
    
}

class Cast
{
    public static final int TESTINTVAL = (byte) 0x80;
}

class ComplexAndFlagged
{
    public static final java.util.List MYLIST = new java.util.ArrayList()
    {
        public int size()
        {
            // should be flagged although technically inside const definition
            return 378;
        }
    };
}

class ComplexButNotFlagged
{
    // according to user feedback this is typical code that should not be flagged
    public final double SpecialSum = 2 + 1e10, SpecialDifference = 4 - java.lang.Math.PI;
    public final Integer DefaultInit = Integer.valueOf(27);
    public final int SpecsPerDay = 24 * 60 * 60, SpecialRatio = 4 / 3;
    public final javax.swing.border.Border StdBorder =
        javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3);
}

enum MyEnum2
{
    A(3),
    B(54);

    private MyEnum2(final int value)
    {

    }
}

class TestHashCodeMethod {
    // valid hash code method
    public int hashCode() {
        return 31;
    }

    // invalid hash code method: has parameters
    public int hashCode(final int val) {
        return 42;
    }

    // invalid hash code method: misspelled
    public int hashcode() {
        return 13;
    }

    static {
        
    }

    {
        
    }

    public TestHashCodeMethod() {
        
    }

    @InputMagicNumberIntMethodAnnotation(42)
    public void another() {
    }

    @InputMagicNumberIntMethodAnnotation(value = 43)
    public void another2() {
    }

    @InputMagicNumberIntMethodAnnotation(-44)
    public void anotherNegative() {
    }

    @InputMagicNumberIntMethodAnnotation(value = -45)
    public void anotherNegative2() {
    }
}

class TestMethodCall {

        public TestMethodCall(final int x) {

    }

        public void method2() {
        
        }
}

class Binary {
    int intValue = 0b101;
    long longValue = 0b1010000101000101101000010100010110100001010001011010000101000101L;
}
@interface AnnotationWithDefaultValue {
    int value() default 101;
    int[] ar() default {102};
}
class A {
    {
        switch (Blah2.LOW) {
        default:
             // violation
        }
    }
}
