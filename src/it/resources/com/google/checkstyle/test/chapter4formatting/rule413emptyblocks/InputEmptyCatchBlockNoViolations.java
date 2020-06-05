////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
////////////////////////////////////////////////////////////////////////////////
package com.google.checkstyle.test.chapter4formatting.rule413emptyblocks;

import java.io.IOException;

public class InputEmptyCatchBlockNoViolations
{
    private void foo6() {
        try {
            throw new IOException();
        } catch (IOException expected) { // This is expected
            
        }
    }

    public void testTryCatch()
    {
        try {
            
            
            
            return;
        }
        catch (Exception e) {
            System.identityHashCode(e);
            return;
        }
        finally
        {
            return;
        }
    }

    public void testTryCatch3()
    {
        try {
            
            
            
        }
        catch (IllegalArgumentException | IllegalStateException e) {
            System.identityHashCode(e); //some comment
            return;
        }
    }

    public void testTryCatch4()
    {
        
        
        try {
            
        }
        catch (IllegalArgumentException e) {
            System.identityHashCode(e);
            return;
        }
    }
    public void setFormats() {
        try {
            
        } catch (Exception e) {
            Object k = null;
            if (k != null)
                k = "ss";
            else {
                return;
            }
        }
    }
}
