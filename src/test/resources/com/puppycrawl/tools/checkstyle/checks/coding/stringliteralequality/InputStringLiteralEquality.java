package com.puppycrawl.tools.checkstyle.checks.coding.stringliteralequality;
import java.util.Locale;
/**
 * Input file for the StringLiteralEqualityCheck
 * @author Lars K&uuml;hne
 */
public class InputStringLiteralEquality
{
    void foo(final String name)
    {
        if ("Lars".equals(name))
        {
            // flagged, should use equals
        }

        if ("Oleg".equals(name))
        {
            // flagged, should use equals
        }

        if ("Oliver".equals("Oliver"))
        {
            // doesn't make much sense because this can be evaluated
            // to true at compile time, but is flagged anyway
        }

        String compare = "Rick";
        if (name == compare)
        {
            // currently not flagged.
            //
            // Implementing this is very complicated, we would need
            // - type info on the == operands
            // - prevent false alarms where the user explicitly wants
            //   to compare object identities
            //
            // My current feeling is that we should leave finding
            // this one to manual code inspections. After all MCI is
            // what some of us get paid for :-)
        }

        if ("Rick".toUpperCase(Locale.getDefault()) == "Rick".toLowerCase(Locale.getDefault()))
        {
            // completely dynamic, don't flag
        }
    }
}
