package com.google.checkstyle.test.chapter4formatting.rule462horizontalwhitespace;

import java.util.Collection;
import java.util.Map;

public class InputWhitespaceAroundGenerics
{

}

//No whitespace after commas
class BadCommas<A, B, C extends Map<A, String>> //warn
{
     //warn
}

class Wildcard
{
    public static void foo(final Collection<? extends Wildcard[]> collection) { //warn
        // A statement is important in this method to flush out any
        // issues with parsing the wildcard in the signature
        collection.size();
    }

    public static void foo2(final Collection<?extends Wildcard[]> collection) {
        // A statement is important in this method to flush out any
        // issues with parsing the wildcard in the signature
        collection.size();
    }
}

// we need these interfaces for generics
interface D {
}
interface E {
}
