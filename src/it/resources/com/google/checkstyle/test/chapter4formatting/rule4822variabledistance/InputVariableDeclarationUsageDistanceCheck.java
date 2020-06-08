package com.google.checkstyle.test.chapter4formatting.rule4822variabledistance;
import java.util.*;
public class InputVariableDeclarationUsageDistanceCheck {

    private static int test1 = 0;

    static {
        int b = 0;
        
        {
            d = ++b;
        }
    }

    static {
        
        int a = 3;
        int b = 2;
        {
            a = a + b;
            c = b;
        }
        {
            c--;
        }
        a = 7;
    }

    static {
        
        int b = 2;
        b++;
        
        a = b; // DECLARATION OF VARIABLE 'a' SHOULD BE HERE (distance = 2)
    }

    public InputVariableDeclarationUsageDistanceCheck(final int test1) {
        
        this.test1 = test1;
        temp = test1; // DECLARATION OF VARIABLE 'temp' SHOULD BE HERE (distance = 2)
    }

    public boolean testMethod() {
        int temp = 7;
        new InputVariableDeclarationUsageDistanceCheck(2);
        String.valueOf(temp); // DECLARATION OF VARIABLE 'temp' SHOULD BE HERE (distance = 2)
        boolean result = false;
        
        if (test1 > 1) {
            str = "123";
            result = true;
        }
        return result;
    }

    public void testMethod2() {
        
        int a = 3;
        int b = 2;
        {
            a = a
                    + b
                    - 5
                    + 2
                    * a;
            count = b; // DECLARATION OF VARIABLE 'count' SHOULD BE HERE (distance = 2)
        }
    }

    public void testMethod3() {
         //warn
        int a = 3;
        int b = 3;
        a = a + b;
        b = a + a;
        testMethod2();
        count = b; // DECLARATION OF VARIABLE 'count' SHOULD BE HERE (distance = 4)
    }

    public void testMethod4(final int arg) {
        int d = 0;
        for (int i = 0; i < 10; i++) {
            d++;
            if (i > 5) {
                d += arg;
            }
        }

        String ar[] = {"1", "2" };
        for (String st : ar) {
            System.identityHashCode(st);
        }
    }

    public void testMethod5() {
        int arg = 7;
        boolean b = true;
        boolean bb = false;
        if (b && !bb)
            b = false;
        testMethod4(arg); // DECLARATION OF VARIABLE 'arg' SHOULD BE HERE (distance = 2)
    }

    public void testMethod6() {
        int blockNumWithSimilarVar = 3;
        int dist = 0;
        int index = 0;
        int block = 0;

        if (blockNumWithSimilarVar <= 1) {
            do {
                dist++;
                if (block > 4) {
                    break;
                }
                index++;
                block++;
            } while (index < 7);
        } else {
            while (index < 8) {
                dist += block;
                index++;
                block++;
            }
        }
    }

    public boolean testMethod7(final int a) {
        boolean res;
        switch (a) {
        case 1:
            res = true;
            break;
        default:
            res = false;
        }
        return res;
    }

    public void testMethod8() {
        
        
        
        
        {
            c++;
            b++;
        }
        {
            n++; // DECLARATION OF VARIABLE 'n' SHOULD BE HERE (distance = 2)
            m++; // DECLARATION OF VARIABLE 'm' SHOULD BE HERE (distance = 3)
            b++;
        }
    }

    public void testMethod9() {
        
        boolean b1 = true;
        boolean b2 = false;
        if (b1) {
            if (!b2) {
                result = true;
            }
            result = true;
        }
    }

    public boolean testMethod10() {
        boolean result;
        try {
            result = true;
        } catch (Exception e) {
            result = false;
        } finally {
            result = false;
        }
        return result;
    }

    public void testMethod11() {
        
        
        
        try {
            b--;
        } catch (Exception e) {
            b++;
            result = false; // DECLARATION OF VARIABLE 'result' SHOULD BE HERE (distance = 2)
        } finally {
            a++;
        }
    }

    public void testMethod12() {
        
        boolean b3 = true;
        boolean b1 = true;
        boolean b2 = false;
        if (b1 && b3) {
            if (!b2) {
                result = true;
            }
            result = true;
        }
    }

    public void testMethod13() {
        
        
        
        
    }

    public void testMethod14() {
        Session s = openSession();
        Transaction t = s.beginTransaction(); //warn
        A a = new A();
        E d1 = new E();
        C1 c = new C1();
        E d2 = new E();
        a.setForward(d1);
        d1.setReverse(a);
        c.setForward(d2); // DECLARATION OF VARIABLE 'c' SHOULD BE HERE (distance = 3)
                            // DECLARATION OF VARIABLE 'd2' SHOULD BE HERE (distance = 3)
        d2.setReverse(c);
        
        
        t.commit(); // DECLARATION OF VARIABLE 't' SHOULD BE HERE (distance = 5)
        s.close();
    }

    public boolean isCheckBoxEnabled(final int path) {
        String model = "";
        {
            for (int index = 0; index < path; ++index) {
                
                if (model.contains("")) {
                    return false;
                }
            }
        }
        return true;
    }

    public Object readObject(final String in) throws Exception {
        String startDay = "";
        String endDay = "";
        return new String(startDay + endDay);
    }

    public int[] getSelectedIndices() {
        int[] sel = new int[5];
        String model = "";
        int a = 0;
        a++;
        for (int index = 0; index < 5; ++index) {
            sel[index] = Integer.parseInt(model.valueOf(a)); // DECLARATION OF VARIABLE 'sel'
                                                             // SHOULD BE HERE (distance = 2)
                                                             // DECLARATION OF VARIABLE 'model'
                                                             // SHOULD BE HERE (distance = 2)
        }
        return sel;
    }

    public void testMethod15() {
        String confDebug = "";
        if (!"".equals(confDebug) && !"null".equals(confDebug)) {
            LogLog.warn("The \"" + "\" attribute is deprecated.");
            LogLog.warn("Use the \"" + "\" attribute instead.");
            LogLog.setInternalDebugging(confDebug, true);
        }

        int i = 0;
        int k = 7;
        boolean b = false;
        for (; i < k; i++) {
            b = true;
            k++;
        }

        
        switch (i) {
        case 0:
            k++;
            sw = 0; // DECLARATION OF VARIABLE 'sw' SHOULD BE HERE (distance = 2)
            break;
        case 1:
            b = false;
            break;
        default:
            b = true;
        }

        int wh = 0;
        b = true;
        do {
            k--;
            i++;
        } while (wh > 0); // DECLARATION OF VARIABLE 'wh' SHOULD BE HERE (distance = 2)

        if (wh > 0) {
            k++;
        } else if (!b) {
            i++;
        } else {
            i--;
        }
    }

    public void testMethod16() {
        
        if (i > 0) {
            k++;
        } else if (wh > 0) {
            i++;
        } else {
            i--;
        }
    }

    protected JMenuItem createSubMenuItem(final LogLevel level) {
        final JMenuItem result = new JMenuItem(level.toString());
        final LogLevel logLevel = level;
        result.setMnemonic(level.toString().charAt(0));
        result.addActionListener(new ActionListener() {
          public void actionPerformed(final ActionEvent e) {
            showLogLevelColorChangeDialog(result, logLevel); // DECLARATION OF VARIABLE 'logLevel'
                                                             // SHOULD BE HERE (distance = 2)
          }
        });

        return result;

      }

    public static Color darker(final Color color, final double fraction) {
        int red = (int) Math.round(color.getRed() * (1.0 - fraction));
        int green = (int) Math.round(color.getGreen() * (1.0 - fraction));
        int blue = (int) Math.round(color.getBlue() * (1.0 - fraction));

        if (red < 0) {
            red = 0;
        } else if (red > 255) {
            red = 255;
        }
        if (green < 0) { // DECLARATION OF VARIABLE 'green' SHOULD BE HERE (distance = 2)
            green = 0;
        } else if (green > 255) {
            green = 255;
        }
        if (blue < 0) { // DECLARATION OF VARIABLE 'blue' SHOULD BE HERE (distance = 3)
            // blue = 0;
        }

        int alpha = color.getAlpha();

        return new Color(red, green, blue, alpha);
    }

    public void testFinal() {
        AuthUpdateTask task = null;
        final long intervalMs = 30 * 60000L;
        Object authCheckUrl = null, authInfo = null;
        task = new AuthUpdateTask(authCheckUrl, authInfo, new IAuthListener() {
            @Override
            public void authTokenChanged(final String cookie, final String token) {
                fireAuthTokenChanged(cookie, token);
            }
        });

        Timer timer = new Timer("Auth Guard", true);
        timer.schedule(task, intervalMs / 2, intervalMs); // DECLARATION OF VARIABLE 'intervalMs'
                                                          // SHOULD BE HERE (distance = 2)
    }

    public void testForCycle() {
        int filterCount = 0;
        for (int i = 0; i < 10; i++, filterCount++) {
            int abc = 0;
            System.identityHashCode(abc);

            for (int j = 0; j < 10; j++) {
                abc = filterCount;
                System.identityHashCode(abc);
            }
        }
    }

    public void testIssue32_1()
    {
        Option srcDdlFile = OptionBuilder.create("f");
        Option logDdlFile = OptionBuilder.create("o");
        Option help = OptionBuilder.create("h");

        Options options = new Options();
        options.something();
        options.something();
        options.something();
        options.something();
        options.addOption(srcDdlFile, logDdlFile, help); // distance=1
    }

    public void testIssue32_2()
    {
        int mm = Integer.parseInt("2");
        long timeNow = 0;
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        cal.setTimeInMillis(timeNow);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        cal.set(Calendar.HOUR_OF_DAY, mm);
        cal.set(Calendar.MINUTE, mm); // distance=1
    }

    public void testIssue32_3(final MyObject[] objects) {
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        for (int i = 0; i < objects.length; i++) {
            objects[i].setEnabled(true);
            objects[i].setColor(0x121212);
            objects[i].setUrl("http://google.com");
            objects[i].setSize(789);
            objects[i].setCalendar(cal); // distance=1
        }
    }

    public String testIssue32_4(final boolean flag) {
        StringBuilder builder = new StringBuilder();
        builder.append("flag is ");
        builder.append(flag);
        final String line = "";
        if (flag) {
            builder.append("line of AST is:");
            builder.append("\n");
            builder.append(String.valueOf(line)); //distance=1
            builder.append("\n");
        }
        return builder.toString();
    }

    public void testIssue32_5() {
        
        
        
         // distance=1
         // distance=1
         // distance=1
    }

    public void testIssue32_6() {
        Option aOpt = null;
        Option bOpt = null;
        Option cOpt = null;
        isNull(cOpt); // distance = 1
        isNull(bOpt); // distance = 2
        isNull(aOpt); // distance = 3
    }

    public void testIssue32_7() {
        String line = "abc";
        otherWriter.write(line);
        line.charAt(1);
        builder.append(line);
        test(line, line, line);
    }

    public void testIssue32_8(final Writer w1, final Writer w2, final Writer w3) {
        String l1 = "1";


        w3.write(l1); //distance=3
    }

    public void testIssue32_9() {
        Options options = new Options();
        Option myOption = null; //warn
        options.addBindFile(null);
        options.addBindFile(null);
        options.addBindFile(null);
        options.addBindFile(null);
        options.addBindFile(null);
        System.identityHashCode("message");
        myOption.setArgName("abc"); // distance=7
    }

    public void testIssue32_10() {
        Options options = new Options();
        Option myOption = null; //warn
        options.addBindFile(null);
        options.addBindFile(null);
        options.addBindFile(null);
        options.addBindFile(null);
        options.addBindFile(null);
        myOption.setArgName("q"); // distance=6
    }


    public int testIssue32_11(final String toDir)
            throws Exception
    {
        int count = 0;
        String[] files = {};

        System.identityHashCode("Data archival started");
        files.notify();
        System.identityHashCode("sss");

        if (files == null || files.length == 0) {
            System.identityHashCode("No files on a remote site");
        } else {
            System.identityHashCode("Files on remote site: " + files.length);

            for (String ftpFile : files) {
                if (files.length == 0) {
                    "".concat("");
                    ftpFile.concat(files[2]);
                    count++;
                }
            }
        }

        System.lineSeparator();

        return count;
    }

    private Session openSession() {
        return null;

    }

    class Session {

        public Transaction beginTransaction() {
            return null;
        }

        public void close() {
        }

        public Serializable save(final E d2) {
            return null;
        }

        public Serializable save(final A a) {
            return null;
        }

    }

    class Transaction {

        public void commit() {

        }

    }

    class A {

        public void setForward(final E d1) {

        }

    }

    class E {

        public void setReverse(final C1 c) {

        }

        public void setReverse(final A a) {

        }

    }

    class C1 {

        public void setForward(final E d2) {

        }

    }

    class Serializable {

    }

    class JMenuItem {

        public JMenuItem(final String string) {
        }

        public void addActionListener(final ActionListener actionListener) {

        }

        public void setMnemonic(final char charAt) {

        }

    }

    class LogLevel {

    }

    class ActionListener {

    }

    class ActionEvent {

    }

    private void showLogLevelColorChangeDialog(final JMenuItem j, final LogLevel l) {   }

    static class Color {

        public Color(final int red, final int green, final int blue, final int alpha) {
        }

        public double getRed() {
            return 0;
        }

        public int getAlpha() {
            return 0;
        }

        public double getBlue() {
            return 0;
        }

        public double getGreen() {
            return 0;
        }

    }

    class AuthUpdateTask {

        public AuthUpdateTask(final Object authCheckUrl, final Object authInfo,
                final IAuthListener iAuthListener) {
        }

    }

    interface IAuthListener {

        void authTokenChanged(String cookie, String token);

    }

    void fireAuthTokenChanged(final String s, final String s1) { }

    class Timer {

        public Timer(final String string, final boolean b) {
        }

        public void schedule(final AuthUpdateTask authUpdateTask, final long l,
                final long intervalMs) {
        }

    }

    class Option {

        public void setArgName(final String string) {
        }

    }

    boolean isNull(final Option o) {
        return false; }

    class Writer {

        public void write(final String l3) {

        }

    }

    class Options {

        public void addBindFile(final Object object) {

        }

        public void
                addOption(final Option srcDdlFile, final Option logDdlFile, final Option help)
        {

        }

        public void something()
        {

        }

    }

    class TreeMapNode {

        public TreeMapNode(final String label, final double d, final DefaultValue defaultValue) {
        }

        public TreeMapNode(final String label) {
        }

    }

    class DefaultValue {

        public DefaultValue(final double d) {
        }

    }

    static class LogLog {

        public static void warn(final String string)
        {

        }

        public static void setInternalDebugging(final String confDebug, final boolean b)
        {

        }

    }

    static class OptionBuilder {

        public static Option create(final String string)
        {
            return null;
        }

    }

    class MyObject {

        public void setEnabled(final boolean b)
        {

        }

        public void setCalendar(final Calendar cal)
        {

        }

        public void setSize(final int i)
        {

        }

        public void setUrl(final String string)
        {

        }

        public void setColor(final int i)
        {

        }

    }

    static class otherWriter {

        public static void write(final String line)
        {

        }

    }

    void test(final String s, final String s1, final String s2) {

    }

    static class builder {

        public static void append(final String line)
        {

        }

    }

}
