package com.puppycrawl.tools.checkstyle.checks.indentation.commentsindentation;

public class InputCommentsIndentationInMultiblockStructures {
    void foo() {
        {
            assert true;
        // comment for else
        }

        {
            assert true;
        // violation
        }

        {
            assert true;
                // violation
        }

        {
            assert true;
// violation
        }

        try {
            assert true;
        // comment for catch
        } catch (Exception ex) { }

        try {
            assert true;
        // violation
        } catch (Exception ex) { }

        try {
            assert true;
// violation
        } catch (Exception ex) { }

        try {
            assert true;
                // violation
        } catch (Exception ex) { }

        try {
            assert true;
        // comment for finally
        } 

        try {
            assert true;
        // violation
        } 

        try {
            assert true;
// violation
        } 

        try {
            assert true;
                // violation
        } 

        try { } catch (Exception ex) {
            assert true;
        // comment for finally
        } 

        try { } catch (Exception ex) {
            assert true;
        // violation
        } 

        try { } catch (Exception ex) {
            assert true;
// violation
        } 

        try { } catch (Exception ex) {
            assert true;
                // violation
        } 

        try { } catch (ClassCastException ex) {
            assert true;
        // comment for catch
        } catch (Exception ex) { }

        try { } catch (ClassCastException ex) {
            assert true;
        // violation
        } catch (Exception ex) { }

        try { } catch (ClassCastException ex) {
            assert true;
// violation
        } catch (Exception ex) { }

        try { } catch (ClassCastException ex) {
            assert true;
                // violation
        } catch (Exception ex) { }

        {
            assert true;
        // comment for while
        }

        {
            assert true;
        // violation
        }

        {
            assert true;
                // violation
        }

        {
            assert true;
// violation
        }
    }
}
