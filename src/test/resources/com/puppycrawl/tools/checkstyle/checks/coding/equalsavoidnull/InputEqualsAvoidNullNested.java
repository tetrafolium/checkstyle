package com.puppycrawl.tools.checkstyle.checks.coding.equalsavoidnull;

import java.io.IOException;
import java.io.Reader;
// case copied from sun.applet.AppletViewer in openjdk
public class InputEqualsAvoidNullNested {
    public void foo(final Reader in) throws IOException {
        int c;
        while (true) {
            c = in.read();
            if (c == -1)
                break;

            if (c == '<') {
                c = in.read();
                if (c == '/') {
                    String nm = in.toString();
                    if ("applet".equalsIgnoreCase(nm)
                            || "object".equalsIgnoreCase(nm)
                            || "embed".equalsIgnoreCase(nm)) {
                        break;
                    }
                } else {
                    String nm = scanIdentifier(in);
                    if ("param".equalsIgnoreCase(nm)) {
                        
                    } else if ("applet".equalsIgnoreCase(nm)) {
                        
                    } else if ("object".equalsIgnoreCase(nm)) {
                        
                    } else if ("embed".equalsIgnoreCase(nm)) {
                        
                    } else if ("app".equalsIgnoreCase(nm)) {
                        
                    }
                }
            }
        }
    }

    public static String scanIdentifier(final Reader in) throws IOException {
        return null;
    }
}
