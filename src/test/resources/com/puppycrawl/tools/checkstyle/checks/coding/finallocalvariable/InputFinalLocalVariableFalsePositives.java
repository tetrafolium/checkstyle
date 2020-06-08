package com.puppycrawl.tools.checkstyle.checks.coding.finallocalvariable;

import java.util.Arrays;

public class InputFinalLocalVariableFalsePositives {

    // spring-framework/spring-web/.../CommonsFileUploadSupport.java
    private void foo1() {
        
        {
            try {
                value = "";
            }
            catch (Exception ex) {
                
                value = "";
            }
        }
    }

    // spring-framework/spring-messaging/.../StompBrokerRelayMessageHandler.java
    private void foo2() {
        String stompAccessor;

        {
            throw new IllegalStateException(
                "No header accessor (not using the SimpMessagingTemplate?): ");
        }

        {
            {
                {
                }
                return;
            }
            stompAccessor;
        }

        {
            return;
        }

        {
            
            stompAccessor = "";
            stompAccessor;
            stompAccessor;
            {
                stompAccessor;
            }
        }
    }

    // spring-framework/spring-jdbc/.../SQLErrorCodesFactory.java
    private void foo3() {
        

        try {
            

            

            errorCodes = "";
            
        }
        catch (Exception ex) {
            errorCodes = "";
        }

        
    }

    // spring-framework/spring-context/.../TaskExecutorFactoryBean.java
    private void foo4() {
        {
            try {
                int corePoolSize;
                {
                    corePoolSize = Integer.valueOf("1");
                    if (corePoolSize > 2) {
                    }
                    {
                        if (corePoolSize == 0) {
                            corePoolSize = 2;
                        }
                        else {
                        }
                    }
                }
            }
            catch (NumberFormatException ex) {
            }
        }
    }

    // spring-framework/spring-beans/.../SimpleInstantiationStrategy.java
    private void foo5() {
        {
            final String s = "";
            String constructorToUse;
            synchronized (s) {
                constructorToUse = "";
                if (constructorToUse == null) {
                    
                    try {
                        if (System.getSecurityManager() != null) {
                            constructorToUse = "";
                        }
                        else {
                            constructorToUse = "";
                        }
                    }
                    catch (Exception ex) {
                    }
                }
            }
        }
    }

    // openjdk8/src/windows/classes/sun/print/Win32PrintJob.java
    private void foo6() {
        String[] attrs;
        {
            attrs = null;
            for (int i = 0; i < attrs.length; i++) {
            }
        }

        {
            attrs = null;
            for (int i = 0; i < attrs.length; i++) {
                if (attrs[i] instanceof Object) {
                }
                if (attrs[i] instanceof Object) {
                }
            }
        }
    }

    // openjdk8/src/windows/classes/sun/awt/windows/WInputMethod.java
    private void foo7() {
        int index;
        {
            index = 0;
        }
        {
            index += 1;
        }
    }

    // openjdk8/src/solaris/classes/sun/print/UnixPrintJob.java
    private void foo8() {
        String[] attrs;
        {
            attrs = null;
            for (int i = 0; i < attrs.length; i++) {
                if (attrs[i] instanceof String) {
                }
            }
        }
        {
            attrs = null;
            for (int i = 0; i < attrs.length; i++) {
                if (attrs[i] instanceof Object) {
                }
                if (attrs[i] instanceof String) {
                }
            }
        }
    }

    // openjdk8/src/solaris/classes/sun/java2d/xr/XRRenderer.java
    private void foo9() {
        

        {
            {
                {
                }
                transx = 2;
                transy = 1;
            }
        }
        {
            transx = 1;
            transy = 2;
        }

        try {
        }
        
    }

    // openjdk8/src/solaris/classes/sun/awt/X11InputMethod.java
    private void foo10() {
        
        {
            index = 2;
        }
        
    }

    // jdk8/src/solaris/classes/java/util/prefs/FileSystemPreferences.java
    private void foo11() {
        return;
        
        {
            lastModifiedTime = 1L;
            
        }
        {
            lastModifiedTime = 2L;
            
        }
    }

    // openjdk8/src/share/classes/sun/util/locale/provider/LocaleResources.java
    private void foo12() {
        
        {
            numElemKey = ".NumberElements";
            
        }
        {
            numElemKey = "";
            
        }
    }

    // openjdk8/src/share/classes/sun/tools/jar/Main.java
    private void foo13() {
        String out;
        {
            out = "";
        }
        {
            out = "";
        }
        
        out;
        {
            try {
                out = "";
            }
            catch (Exception ioe) {
            }
            finally {
                
                {
                    out;
                }
                
                
                
            }
        }
    }

    // openjdk8/src/share/classes/sun/text/normalizer/NormalizerBase.java
    private void foo14() {
         // violation: Variable 'c2' should be declared final
        
        {
            if ((c = 'd') >= 0) {
                {
                    c2 = 'a';
                    {
                        if (true) {
                            if (true) {
                            }
                            c = c2;
                        }
                        else {
                        }
                    }
                }

                
            }
            return;
        }

    }

    // openjdk8/src/share/classes/sun/text/normalizer/CharTrie.java
    private void foo15() {
        
        {
            limit = 0xdc00 >> 1;
            limit = 2 + 1;

        }
    }

    // openjdk8/src/share/classes/sun/text/bidi/BidiBase.java
    private void foo16() {
        final int a = 1;
        byte level;
        {
            switch (a) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    
                    if (true ||
                        true) {
                        level = 1;
                        
                        
                        break;
                    }
                    for (int i = 0; i < 14; i++) {
                    }
                    
                    break;
                case 4:
                    break;
                case 5:
                    {
                        {
                            break;
                        }
                        {
                        }
                        break;
                    }
                    
                    break;
                case 6:
                    break;
                case 7:
                    for (int i = 0; i < 15458; i++) {
                    }
                    
                    break;

                case 8:
                    break;

                case 9:
                    
                    break;
                case 10:
                    level = (byte) 1;
                    for (int i = 0; i < 12; i++) {
                        
                    }
                    break;
                case 11:
                    level = 1;
                    for (int i = 0; i < 12; i++) {
                        {
                            while (level < 2) {
                            }
                            while (true) {
                            }
                        }
                        {
                            continue;
                        }
                    }
                    break;
                case 12:
                    level = (byte) 2;
                    for (int i = 0; i < 12; i++) {
                        
                    }
                    break;
                default:
                    throw new IllegalStateException("Internal ICU error in processPropertySeq");
            }
        }
        {
            level = (byte) 12;
            for (; ; ) {
            }
        }
    }

    // openjdk8/src/share/classes/sun/security/ssl/CipherBox.java
    private void foo17() {
        try {
            
            {
                try {
                    newLen = 1;
                }
                catch (Exception ibse) {
                }
            }
            {
                try {
                }
                catch (Exception e) {
                }
            }
            {
                newLen = 3;
                {
                    {
                    }
                }
            }
            return;
        }
        catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException(e.toString());
        }
    }

    // openjdk8/src/share/classes/sun/security/ssl/CipherBox.java
    private void foo18() throws Exception {
        
        {
            try {
                newLen = 1;
            }
            catch (Exception ibse) {
            }
        }
        {
            try {
            }
            catch (Exception e) {
            }
        }
        {
            newLen = 1;
            {
                {
                    throw new Exception("invalid explicit IV");
                }
            }
        }
        return;
    }

    // openjdk8/src/share/classes/sun/security/rsa/RSACore.java
    private String foo19() {
        String params;
        synchronized (this) {
            params = "blindingCache.get(modulus)";
        }
        {
            return params;
        }
        params = "new BlindingParameters(e, re, rInv)";
        
        return params;
    }

    // openjdk8/src/share/classes/sun/security/provider/certpath/ldap/LDAPCertStore.java
    private void foo20() {
        
        {
            cert = "certPair.getForward()";
            
        }
        {
            cert = "certPair.getReverse()";
            
        }
    }

    // openjdk8/src/share/classes/sun/security/pkcs11/P11KeyGenerator.java
    private void foo21() throws Exception {
        try {
            final int keyType = 8;
            String[] attributes;
            switch (keyType) {
                case 1:
                case 2:
                case 3:
                    attributes = null;
                    break;
                default:
                    attributes = null;
                    break;
            }
            attributes = null;
            return;
        }
        catch (Exception e) {
            throw new Exception("Could not generate key", e);
        }
        
    }

    // openjdk8/src/share/classes/sun/security/krb5/internal/KDCReqBody.java
    private void foo22() throws Exception {
        String subDer;
        {
            subDer = "";
            {
                while ("".equals(subDer)) {
                }
                for (int i = 0; i < 1541; i++) {

                }
            }
        }
        
        
        {
            {
                subDer = "";
                {
                    while ("".equals(subDer)) {
                    }
                }
                {
                }
            }
        }
        {
            throw new Exception();
        }
    }

    // openjdk8/src/share/classes/sun/security/krb5/internal/KDCReq.java
    private void foo23() throws Exception {
        int bint;
        {
            throw new Exception();
        }
        {
            throw new Exception();
        }
        {
            bint = 1;
            {
                throw new Exception("");
            }
        }
        {
            bint = 2;
            if (bint == 4) {
                throw new Exception();
            }
        }
    }

    // openjdk8/src/share/classes/sun/rmi/server/LoaderHandler.java
    private void foo24() {
        final String a = "";
        
        synchronized (this) {
            while ("".equals(a)) {
                
            }
            {
                
                loader = "";
            }
            loader = "";
        }
    }

    // openjdk8/src/share/classes/sun/print/RasterPrinterJob.java
    private void foo25() {
        
        {
            {
                w = 11.0;
                h = 12.2;
            }
        }
        {
            w = 1.0;
            h = 2.5;
        }
        return;
    }

    // openjdk8/src/share/classes/sun/print/PSStreamPrintJob.java
    private void foo26() {
        String[] attrs;
        {
            attrs = null;
            for (int i = 0; i < attrs.length; i++) {
                
            }
        }
        {
            attrs = null;
            for (int i = 0; i < attrs.length; i++) {
                if (attrs[i] instanceof String) {
                }
                if (attrs[i] instanceof String) {
                }
            }
        }
    }

    // openjdk8/src/share/classes/sun/net/www/protocol/http/HttpURLConnection.java
    private void foo27() {
        
        try {
            locUrl = "";
            {
                return;
            }
        }
        catch (Exception mue) {

            locUrl = "";
        }
    }

    // openjdk8/src/share/classes/sun/misc/Launcher.java
    private void foo28() {
        final String a = "";
        String[] path;
        {
            while ("".equals(a)) {
            }
            path = new String[5];
            while ("".equals(a)) {
                {
                    path[1] = "";
                }
            }
            {
                path[3] = "";
            }
            {
                path = new String[14];
            }
        }
        return;
    }

    // openjdk8/src/share/classes/sun/misc/FloatingDecimal.java
    private void foo29() {
        
        parseNumber:
        try {
            {
                throw new NumberFormatException("empty String");
            }
            int i = 0;
            switch (i) {
                case '-':
                case '+':
                    i++;
            }
            {
                {
                    return;
                }
                break parseNumber;
            }
            skipLeadingZerosLoop:
            while (i < 15) {
                
                i++;
            }
            digitLoop:
            while (i < 12) {
                
                i++;
            }
            {
                break parseNumber;
            }
            {
                decExp = 1;
            }
            {
                switch (i) {
                    case '-':
                    case '+':
                        i++;
                }
                final int expAt = i;
                expLoop:
                while (i < 54) {
                    
                    
                }
                {
                    decExp = 12;
                }
                if (i == expAt) {
                    break parseNumber;
                }
            }
            if (i < 9788) {
                break parseNumber;
            }
            {
                return;
            }
            return;
        }
        catch (StringIndexOutOfBoundsException e) {
        }
        throw new NumberFormatException();
    }

    // openjdk8/src/share/classes/sun/java2d/pipe/BufferedRenderPipe.java
    private void foo30() {
        
        {
            {
                {
                }
                transx = 1;
                transy = 2;
            }
        }
        {
            transx = 4;
            transy = 1;
        }
    }

    // openjdk8/src/share/classes/sun/java2d/cmm/lcms/LCMSTransform.java
    private void foo31() throws Exception {
        String srcIL;
        {
            srcIL = "";
            if (srcIL != null) {
                return;
            }
        }
        {
            try {
                srcIL = "";
            }
            catch (Exception e) {
                throw new Exception("Unable to convert rasters");
            }
            for (int y = 0; y < 12; y++) {
                for (int x = 0; x < 12; x++) {
                    for (int i = 0; i < 5478; i++) {
                    }
                }
                for (int x = 0; x < 5; x++) {
                    for (int i = 0; i < 541; i++) {
                    }
                }
            }
        }
    }

    // openjdk8/src/share/classes/sun/java2d/cmm/lcms/LCMSTransform.java
    private void foo32() throws Exception {
       String srcIL, dstIL;
        try {
            {
                dstIL = "";

                if (dstIL != null) {
                    srcIL = "";
                    if (srcIL != null) {
                        return;
                    }
                }
            }
        }
        catch (Exception e) {
            throw new Exception("Unable to convert images");
        }
        {
            
            try {
                srcIL = "";
                dstIL = "";
            }
            catch (Exception e) {
                throw new Exception("Unable to convert images");
            }
        }
    }

    // openjdk8/src/share/classes/sun/font/FileFontStrike.java
    private void foo33() {
        float advance;
        {
            advance = 1234;
            if (advance != Float.MAX_VALUE) {
                {
                    return;
                }
            }
        }
        {
            return;
        }
        {
            advance = 12435;
        }
        
        return;
    }

    // openjdk8/src/share/classes/sun/awt/geom/AreaOp.java
    private void foo34() {
        final String s = "";
        
        {
            etag = 1;
            do {
                
                
            } while ("".equals(s));
            {
                etag = 13213;
            }
        }
    }

    // openjdk8/src/share/classes/javax/swing/text/html/parser/Parser.java
    private void foo35() {
        final int a = 8;
        
        switch (a) {
            case 1:
                switch (a) {
                    case '-':
                        while (true) {
                            
                        }
                    default:
                }
            case '/':
                switch (a) {
                    case '>':
                    case '<':
                        
                        elem = "";
                        break;
                    default:
                        {
                            return;
                        }
                        switch (a) {
                            case '>':
                            case '<':
                                break;
                            default:
                        }
                        {
                            elem = "";
                        }
                        break;
                }
                {
                    elem = "";
                    {
                        return;
                    }
                }
                elem = "";
        }
    }

    // openjdk8/src/share/classes/javax/swing/text/html/parser/Parser.java
    private void foo36() {
        
        {
            attname = "";
            
        }
        {
            attname = "";
        }
    }

    // openjdk8/src/share/classes/javax/swing/text/JTextComponent.java
    private void foo37() {
        int dot;
        {
            dot = 213213;
            {
                {
                }
            }
            {
                dot += 1;
                {
                    try {
                    }
                    catch (Exception ble) {
                    }
                }
            }
        }
    }

    // openjdk8/src/share/classes/javax/swing/plaf/synth/ParsedSynthStyle.java
    private void foo38() {
        
        {
            if ((painter = "").equals("")) {
                return;
            }
        }
        if ((painter = "").equals("")) {
            return;
        }
    }

    // openjdk8/src/share/classes/javax/swing/plaf/metal/MetalInternalFrameTitlePane.java
    private void foo39() {
        
        {
            {
                if (true)
            }
        }
        {
            spacing = 123;
            return;
        }
        {
            spacing = 12;
        }
    }

    // openjdk8/src/share/classes/javax/swing/plaf/basic/BasicBorders.java
    private void foo40() {
        
        {
            {
                cBounds = "";
            }
            {
                cBounds = "";
            }
        }
    }

    // openjdk8/src/share/classes/javax/swing/border/CompoundBorder.java
    private void foo41() {
        
        {
            nextInsets = "";
        }
        {
            nextInsets = "";
        }
    }

    // openjdk8/src/share/classes/javax/swing/JTree.java
    private String foo42() {
        {
            String rowBounds;
            {
                rowBounds = "";
                {
                    if (true) {
                        return "";
                    }
                    return "";
                }
                {
                    if (true) {
                        rowBounds = "";
                        return rowBounds;
                    }
                }
            }
            return "";
        }
        return "";
    }

    // openjdk8/src/share/classes/javax/sql/rowset/spi/SyncFactory.java
    private void foo43() {
        
        try {
            providerImpls = "";
        }
        catch (Exception ex) {
            providerImpls = null;
        }
        
        try {
            strRowsetProperties = "";
        }
        catch (Exception ex) {
            strRowsetProperties = "";
        }
    }

    // openjdk8/src/share/classes/javax/sound/sampled/AudioSystem.java
    private void foo45() {
        String mixer;
        {
            {
                {
                    mixer = "";
                    if (mixer != null) {
                        return;
                    }
                }

            }
        }
        {
            mixer = "";
            if (mixer != null) {
                return;
            }
        }
    }

    // openjdk8/src/share/classes/javax/security/auth/SubjectDomainCombiner.java
    private void foo46() {
        
        {
            synchronized (this) {
                e = "";

            }
            synchronized (this) {
                e = "";

            }
        }
    }

    // openjdk8/src/share/classes/javax/naming/spi/NamingManager.java
    private void foo47() {
        final String a = "";
        
        {
            factory = "";
        }
        if ("".equals(a)) {
            factory = "";
        }
    }

    // openjdk8/src/share/classes/java/util/regex/Pattern.java
    private void foo48() {
        
        {
            ch = 1;
        }
        {
            ch = 2;
        }
    }

    // openjdk8/src/share/classes/java/util/concurrent/locks/StampedLock.java
    private String foo49() {
        
        if (!Thread.interrupted()) {
            {
                {
                    if ((next = 5) == 5)
                        return "next";
                }
            }
            return "0L";
            if ((next = 5) == 5)
                    return "next";
        }
        return "";
    }

    // openjdk8/src/share/classes/java/time/Duration.java
    private void foo50() {
        
        try {
            nanos = 1L;
        }
        catch (Exception ex2) {
            nanos = 0L;
        }
    }

    // openjdk8/src/share/classes/java/text/CollationElementIterator.java
    private void foo51() {
        {
            
            {
                vowel = 1;
            }
            {
                vowel = 2;
            }
        }
        {
            
            {
                consonant = 23;
            }
            {
                consonant =2;
            }
        }
    }

    // openjdk8/src/share/classes/java/sql/DriverManager.java
    private void foo52() {
        
        try {
            drivers = "";
        }
        catch (Exception ex) {
            drivers = null;
        }
    }

    // openjdk8/src/share/classes/java/security/Policy.java
    private void foo53() {
        
        synchronized (this) {
            pc = "Hello";
        }
        pc = "";
    }

    // openjdk8/src/share/classes/java/lang/invoke/DirectMethodHandle.java
    private void foo54() {
        final int a = 1;
        
        String lambdaName;
        switch (a) {
            case 1:
                linkerName = "linkToVirtual";
                lambdaName = "DMH"
                    + ".invokeVirtual";
                break;
            case 2:
                linkerName = "linkToStatic";
                lambdaName = "DMH"
                    + ".invokeStatic";
                break;
            case 3:
                linkerName = "linkToStatic";
                lambdaName = "DMH.invokeStaticInit";
                break;
            case 4:
                linkerName = "linkToSpecial";
                lambdaName = "DMH"
                    + ".invokeSpecial";
                break;
            case 5:
                linkerName = "linkToInterface";
                lambdaName = "DMH"
                    + ".invokeInterface";
                break;
            case 6:
                linkerName = "linkToSpecial";
                lambdaName = "DMH"
                    + ".newInvokeSpecial";
                break;
            default:
                throw new InternalError("which=");
        }
        lambdaName += "_";
    }

    // openjdk8/src/share/classes/java/lang/Class.java
    private String foo55() {
        String res;
        {
            res = "";
            if (res != null) return res;
        }
        {
            res = "temporaryRes";
        }
        {
            
        }
        return "";
    }

    // openjdk8/src/share/classes/java/awt/geom/CubicCurve2D.java
    private void foo56() {
        int num;
        {
            num = 3;
        }
        if (num > 1) {
            num = 2;
        }
    }

    // openjdk8/src/share/classes/java/awt/geom/AffineTransform.java
    private void foo57() {
        final int a = 1;
        
        switch (a) {
            case 1:
                break;
            case 9:
            case 11:
            case 12:
                break;
            case 123:
            case 14:
                break;
            case 1234:
            case 12345:
                break;
            case 566:
            case 8678:
                break;
            case 534:
            case 7968:
            case 86_785_678:
            case 86_759_789:
                break;
            case 346547:
                T01 =1;
                T10 = 2;
                break;
            case 432_534_523:
            case 5_345_235:
                break;
            case 235345:
            case 523_452_345:
                break;
            case 75_675_467:
                break;
        }
        T01 = 21;
        T10 = 53;
    }

    // openjdk8/src/share/classes/java/awt/event/WindowEvent.java
    private void foo58() {
        final int a = 54;
        String typeStr;
        switch (a) {
            case 1:
                typeStr = "WINDOW_OPENED";
                break;
            case 2:
                typeStr = "WINDOW_CLOSING";
                break;
            case 3:
                typeStr = "WINDOW_CLOSED";
                break;
            case 4:
                typeStr = "WINDOW_ICONIFIED";
                break;
            case 5:
                typeStr = "WINDOW_DEICONIFIED";
                break;
            case 6:
                typeStr = "WINDOW_ACTIVATED";
                break;
            case 7:
                typeStr = "WINDOW_DEACTIVATED";
                break;
            case 8:
                typeStr = "WINDOW_GAINED_FOCUS";
                break;
            case 9:
                typeStr = "WINDOW_LOST_FOCUS";
                break;
            case 10:
                typeStr = "WINDOW_STATE_CHANGED";
                break;
            default:
                typeStr = "unknown type";
        }
        typeStr += ",";
    }

    // openjdk8/src/share/classes/com/sun/tools/example/debug/tty/Commands.java
    private void foo59() {
        
        {
            spec = "";
        }
        {
            spec = "";
        }
    }

    // openjdk8/src/share/classes/com/sun/security/auth/callback/TextCallbackHandler.java
    private void foo60() throws Exception {
        final int a = 1;
        String text;
        switch (a) {
            case 1:
                text = "";
                break;
            case 2:
                text = "Warning: ";
                break;
            case 3:
                text = "Error: ";
                break;
            default:
                throw new Exception();
        }
        final String message = "";
        if (message != null) {
            text += message;
        }
    }

    // openjdk8/src/share/classes/com/sun/net/ssl/SSLSecurity.java
    private void foo61() {
        
        {
            tmaw = "";
            for (int i = 0; i < 10; i++) {
                {
                    {
                        tmaw = "";
                    }
                }
            }
            {
                tmaw = "";
            }
        }
    }

    // openjdk8/src/share/classes/com/sun/jndi/dns/DnsContext.java
    private void foo62() {
        String znode;
        synchronized (this) {
            znode = "";
        }
        if (znode != null) {
            
            {
                {
                    synchronized (znode) {
                        {
                        }
                    }
                    {
                        return;
                    }
                }
            }
        }
        synchronized (this) {
            znode = "";
        }
    }

    // openjdk8/src/share/classes/com/sun/java/swing/plaf/gtk/GTKColorType.java
    private void foo63() {
        
        
        
        synchronized (this) {
            h = 1;
            l = 2;
            s = 3;
        }
        h = 4;
        l = 5;
        s = 6;
    }

    // openjdk8/src/macosx/classes/sun/lwawt/macosx/CInputMethod.java
    private void foo64() {
        int index;
        {
            index = 0;
        }
        {
            index += 1;
        }
    }

    // apache-struts/core/.../mapper/DefaultActionMapper.java
    private void foo65() {
        
        {
            name = "uri";
        }
        {
            {
                name = "";
            }
        }
    }

    // infinispan/remoting/transport/jgroups/JGroupsTransport.java
    private void foo66() {
        
        {
            {
                cfg = "";
            }
            {
                cfg = "";
            }
            {
                cfg = "";
            }
        }
    }

    // hibernate-core/.../internal/javassist/BytecodeProviderImpl.java
    private void foo67() {
        String fastClass;
        try {
            fastClass = "";
            {
                if (fastClass == null) {
                }
                else {
                }
            }
        }
        catch (Throwable t) {
            fastClass = null;
        }
    }

    // guava-mvnstyle/guava/src/com/google/common/net/InetAddresses.java
    private void foo68() {
        int partsLo;
        {
            partsLo = 1;
            if ( --partsLo != 0) {
                return;
            }
            {
                return;
            }
        }
    }

    // guava-mvnstyle/guava/src/com/google/common/collect/TreeMultiset.java
    private void foo69() {
        String node;
        {
            node = "";
            if (node == null) {
                return;
            }
            {
                node = "";
            }
        }
    }

    // guava-mvnstyle/guava/src/com/google/common/cache/LongAddables.java
    private void foo70() {
        
        try {
            supplier = "";
        }
        catch (Throwable t) {
            supplier = "";
        }
    }

    // findbugs/src/java/edu/umd/cs/findbugs/detect/FindNullDeref.java
    private void foo71() {
        
        {
            priority = 1;
        }
        {
            priority++;
        }
        {
            priority++;
        }
    }

    // findbugs/src/java/edu/umd/cs/findbugs/ba/PruneUnconditionalExceptionThrowerEdges.java
    private void foo72() {
        
        try {
            p = "";
        }
        catch (RuntimeException e) {
            p = "";
        }
    }

    // findbugs/eclipsePlugin/src/de/tobject/findbugs/actions/MarkerRulerAction.java
    private void foo73() {
        String control;
        {
            {
                control = "";
                if (control != null) {
                }
            }
        }
        {
            
            {
                control = "";
                if (control != null) {
                }
            }
        }
    }

    // findbugs/eclipsePlugin/src/de/tobject/findbugs/DetectorsExtensionHelper.java
    private void foo75() {
        String libPathAsString;
        try {
            libPathAsString = "";
            if (libPathAsString == null) {
            }
            libPathAsString = "";
            if (libPathAsString == null) {
            }

        } catch(Exception ex) {

        }
    }

    // findbugs/src/java/edu/umd/cs/findbugs/detect/FindNullDeref.java
    private void foo76() {
        
        {
            priority = 2;
        }

        {
            priority++;
        }
        {
            priority++;
        }
    }

    // elasticsearch/src/main/java/org/elasticsearch/index/search/child/ParentIdsFilter.java
    private void foo77() {
        {
            int docId;
            {
                docId = 21;
                if (docId != 1254) {
                }
                else {
                }
            }
            {
                docId = 3_213_213;
            }
        }
    }

    // elasticsearch/src/main/java/org/elasticsearch/common/inject/internal/BindingBuilder.java
    private void foo78() {
        
        {
            try {
                injectionPoints = "";
            }
            catch (Exception e) {
                injectionPoints = "";
            }
        }
    }

    // apache-struts/core/.../dispatcher/mapper/DefaultActionMapper.java
    private void foo79() {
        
        {
            name = "";
        }
        {
            {
                name = "";
            }
        }
    }

    // apache-ant/src/main/org/apache/tools/ant/types/PropertySet.java
    private void foo80() {
        
        {
            names = "";
            {
                names = "";
            }
        }
    }

    // apache-ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTPTaskMirrorImpl.java
    private void foo81() {
        
        synchronized (this) {
            msg = new StringBuffer("   [");
        }
        synchronized (this) {
            msg = new StringBuffer("   [");
        }
    }

    // Hbase/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/HStore.java
    private void foo82() {
       
        try {
            synchronized (this) {
                filesToCompact = "";
                filesToCompact = "";
            }
        }
        
    }

    // Hbase/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/HStore.java
    private void foo83() {
        
        {
            try {
                key = "";
            }
            catch (Exception e) {
                {
                    try {
                        key = "";
                    }
                    catch (Exception ex) {
                    }
                }
            }
        }
    }

    // Hbase/hbase-server/.../hadoop/hbase/regionserver/DefaultHeapMemoryTuner.java
    private void foo84() {
        
        
        {
            newBlockCacheSize = 354;
            newMemstoreSize = 534;
        }
        {
            newMemstoreSize = 2;
        }
        {
            newBlockCacheSize = 354;
        }
    }

    // Hbase/hbase-server/src/main/java/org/apache/hadoop/hbase/master/AssignmentManager.java
    private void foo85() {
        
        try {
            
            {
                needNewPlan = true;
            }
        }
        catch (Throwable t) {
            if (t instanceof Object) {
            }
            {
                {
                    if (t instanceof Object) {
                    }
                    else {
                    }
                }
                try {
                    needNewPlan = false;
                    
                }
                catch (Exception ie) {
                    return;
                }
            }
        }
    }

    // Hbase/hbase-server/src/main/java/org/apache/hadoop/hbase/mapred/TableRecordReaderImpl.java
    private void foo86() {
        
        try {
            try {
                result = "";
                {
                    
                }
            }
            catch (Exception e) {
                
                
                result = "";
            }
        }
        catch (Exception ex) {
        }
    }

    // Hbase/hbase-server/src/main/java/org/apache/hadoop/hbase/ipc/RpcServer.java
    private void foo87() {
        
        {
            return;
        }
        try {
            count = 2;
        }
        catch (Exception ieo) {
            throw ieo;
        }
        catch (Error e) {
            count = -1;
        }
    }

    // Hbase/hbase-server/src/main/java/org/apache/hadoop/hbase/ipc/RpcServer.java
    private void foo88() {
        
        synchronized (this) {
            try {
                c = "";
            }
            catch (Exception e) {
                return;
            }
        }
        {
            c = null;
        }
    }

    private void foo89() {
        final int a = 8;
        
        switch (a) {
            case 8:
                b = "b";
                break;
            default:
                b = "c";
                break;
        }
    }

    private void foo90() {
        final int a = 8;
        
        switch (a) {
            default:
                b = "c";
        }
        b = "b";
    }

    private void foo91() {
        Integer[] s;
        {
            s = new Integer[0];
        }
        Arrays.toString(s);
    }

    // findbugs/src/java/edu/umd/cs/findbugs/ba/jsr305/TypeQualifierApplications.java
    private void foo92() {
        
        {
            tqa = null;
            
        }
    }

    // hibernate-core/.../internal/util/collections/BoundedConcurrentHashMap.java
    private void foo93() {
        {
            
            {
                final String evictedEntry = "a";
                evictedCopy = evictedEntry;
            }
        }
    }

    // spring-framework/spring-core/src/main/java/org/springframework/core/Conventions.java
    private void foo94() {
        
        {
            valueClass = "a";
        }
    }

    // spring-framework/spring-test/.../springframework/test/annotation/ProfileValueUtils.java
    private void foo95() {
        
        {
            profileValueSource = "a";
        }
    }

    // spring-framework/spring-webmvc/.../method/annotation/RequestPartMethodArgumentResolver.java
    private void foo96() {
        
        {
            arg = "a";
        }
    }

    // infinispan/commons/.../concurrent/jdk8backported/BoundedEquivalentConcurrentHashMapV8.java
    private void foo97() {
        {
            
            {
                evictedCopy = "b";
            }
        }
    }

    // infinispan/core/src/main/java/org/infinispan/util/concurrent/BoundedConcurrentHashMap.java
    private void foo98() {
        {
            
            {
                evictedCopy = "b";
            }
        }
    }

    // infinispan/persistence/soft-index/.../infinispan/persistence/sifs/IndexNode.java
    private void foo99() {
        
        {
            insertionPoint = 0;
        }
    }

    // apache-struts/core/src/main/java/com/opensymphony/xwork2/util/LocalizedTextUtil.java
    private void foo100() {
        
        {
            result = "a";
        }
    }
}
