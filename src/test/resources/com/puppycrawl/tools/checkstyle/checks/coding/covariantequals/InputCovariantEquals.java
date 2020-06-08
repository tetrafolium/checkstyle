package com.puppycrawl.tools.checkstyle.checks.coding.covariantequals;

/**
 * Test file for covariant equals methods.
 * @author Rick Giles
 */
public class InputCovariantEquals
{
    private class Inner
    {
        public boolean equals(final Inner aInner)
        {
            return false;
        }
    }

    private class Inner2
    {
        public boolean equals(final Inner2 aInner2)
        {
            return false;
        }

        public boolean equals(final Object aObj)
        {
            return false;
        }
    }

    public boolean equals(final InputCovariantEquals aInputCovariantEquals)
    {
        return false;
    }
}

class InputCovariant2
{
    public boolean equals(final InputCovariant2 aInputCovariant2)
    {
        return false;
    }

    public boolean equals(final Object aObject)
    {
        return false;
    }
}

class InputCovariant3
{
    public boolean equals(final InputCovariant3 aInputCovariant3)
    {
        return false;
    }

    public boolean equals(final java.lang.Object aObject)
    {
        return false;
    }
}

class InputCovariant4
{
    public boolean equals(final int i)
    {
        return false;
    }
}

class AnonymousIC
{
    Comparable comp = new Comparable()
        {
            public int compareTo(final Object aObject)
            {
                return 0;
            }
            public boolean equals(final String aString)
            {
                return false;
            }
        };

    public boolean equals(final Object aObject)
    {
        return false;
    }

    public void method()
    {
        
    }
}

abstract class InputCovariant5
{
    public abstract boolean equals(InputCovariant4 aInputCovariant4);
}

interface InputCovariant6
{
    public boolean equals(InputCovariant5 aInputCovariant5);
}

class InputGenericCovariant7
{
    public <A> boolean equals(final InputGenericCovariant7 aInputCovariant7)
    {
        return true;
    }

    public boolean equals(final Object aObject)
    {
        return false;
    }
}

class InputGenericCovariant8
{
    public <A> boolean equals(final InputGenericCovariant8 aInputCovariant8)
    {
        return true;
    }

    public boolean equals(final Object aObject)
    {
        return false;
    }
}

enum InputEnumCovariant {
    EQUALS;

    public boolean equals(final InputEnumCovariant inputEnumCovariant) {
        return false;
    }

    int equals(final Integer integer) {
        return 0;
    }
}
