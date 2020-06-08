package com.puppycrawl.tools.checkstyle.checks.avoidescapedunicodecharacters;

import java.util.concurrent.TimeUnit;

public class InputAvoidEscapedUnicodeCharacters {

        

         // Greek letter mu

                        

                static final String WHITESPACE_TABLE = ""
                                + "\u2002\u3000\r\u0085\u200A\u2005\u2000\u3000\\"
                                + "\u2029\u000B\u3000\u2008\u2003\u205F\u3000\u1680"
                                + "\u0009\u0020\u2006\u2001\u202F\u00A0\u000C\u2009"
                                + "\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000";                       
         /* comment */ int i;
// Greek letter mu

        public Object fooString() {
                
                
                 // Greek letter mu, "s"
                
                
                String content = null;
                return "\ufeff" + content; // byte order mark
        }

        public Object fooChar() {
                
                 // Greek letter mu, "s"
                char content = 0;
                return '\ufeff' + content; // byte order mark
        }

        public void multiplyString() {
                
                 /* Greek letter mu, "s" */
                
                
        }

        private static String abbreviate(final TimeUnit unit) {
                switch (unit) {
                case NANOSECONDS:
                        return "ns";
                case MICROSECONDS:
                        return "\u03bcs"; // μs
                case MILLISECONDS:
                        return "ms";
                case SECONDS:
                        return "s";
                case MINUTES:
                        return "min";
                case HOURS:
                        return "h";
                case DAYS:
                        return "d";
                default:
                        throw new AssertionError();
                }
        }

              public boolean matches(final char c) {
                switch (c) {
                  case '\t':
                  case '\n':
                  case '\013':
                  case '\f':
                  case '\r':
                  case ' ':
                  case '\u0085': // some comment
                  case '\u1680':
                  case '\u2028':
                  case '\u2029':
                  case '\u205f':
                  case '\u3000':
                    return true;
                  case '\u2007':
                    return false;
                  default:
                  return c >= '\u2000' && c <= '\u200a';
              }
         }

                 // comment is separated by space + tab
                // comment is separated by tab
                /* comment is separated by tab */
         /* comment
                                                   has 2 lines */
        void foo() {
                for (char c = '\u0000'; c < '\uffff'; c++) {
                        if (c == '\u001b' ||     // ESC
                                        c == '\u2014')   // Em-Dash?
                                continue;
                }
        }

        

        

        
}
