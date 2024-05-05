import java.net.URI;
import java.awt.Desktop;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.applet.Applet;

// 
// Decompiled by Procyon v0.5.36
// 

public class class31
{
    static final float aq = 3.0f;
    static final int ab = 3;
    static IndexedSprite[] modIconSprites;
    public static Applet field90;
    public static String field91;
    static int[] field92;
    static final int ay = 11;
    static World[] World_worlds;
    static Scene scene;
    static final int ah = 585;
    static final int aw = 0;
    static final int ax = 10;
    static final int ar = 20;
    
    class31() throws Throwable {
        throw new Error();
    }
    
    static {
        class31.field90 = null;
        class31.field91 = "";
    }
    
    static boolean at(final String s, final int n, final String s2) {
        if (n == 0) {
            try {
                if (!class31.field91.startsWith("win")) {
                    throw new Exception();
                }
                if (!s.startsWith("http://") && !s.startsWith("https://")) {
                    throw new Exception();
                }
                final String s3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                for (int i = 0; i < s.length(); ++i) {
                    if (s3.indexOf(s.charAt(i)) == -1) {
                        throw new Exception();
                    }
                }
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + s + "\"");
                return true;
            }
            catch (Throwable t) {
                return false;
            }
        }
        if (1 == n) {
            try {
                return class26.method113(class31.field90, s2, new Object[] { new URL(class31.field90.getCodeBase(), s).toString() }, -2117267696) != null;
            }
            catch (Throwable t2) {
                return false;
            }
        }
        if (2 == n) {
            try {
                class31.field90.getAppletContext().showDocument(new URL(class31.field90.getCodeBase(), s), "_blank");
                return true;
            }
            catch (Exception ex) {
                return false;
            }
        }
        if (3 == n) {
            try {
                class26.method112(class31.field90, "loggedout", (byte)(-23));
            }
            catch (Throwable t3) {}
            try {
                class31.field90.getAppletContext().showDocument(new URL(class31.field90.getCodeBase(), s), "_top");
                return true;
            }
            catch (Exception ex2) {
                return false;
            }
        }
        throw new IllegalArgumentException();
    }
    
    static final void logOut(final int n) {
        try {
            Client.packetWriter.close(-1019860188);
            FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
            class294.method1607((byte)(-22));
            class4.method9(-518646489);
            class14.method56(-729068470);
            class173.method958((byte)61);
            class379.method2015((byte)(-59));
            SequenceDefinition.SequenceDefinition_cached.clear();
            SequenceDefinition.SequenceDefinition_cachedFrames.clear();
            SequenceDefinition.SequenceDefinition_cachedModel.clear();
            SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
            SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
            VarbitComposition.VarbitDefinition_cached.clear();
            VarpDefinition.VarpDefinition_cached.clear();
            class160.HitSplatDefinition_cachedSprites.method2418((byte)(-105));
            MenuAction.HitSplatDefinition_cached.method2418((byte)19);
            class432.method2285(1669272792);
            GrandExchangeEvent.method1922(157863063);
            InterfaceParent.method488(-1880388281);
            class165.method921(1235100026);
            Strings.method1854(-1979549952);
            class383.method2084(-1054245173);
            DbRowType.DBRowType_cache.clear();
            Client.Widget_cachedModels.clear();
            Client.Widget_cachedFonts.clear();
            GrandExchangeOfferTotalQuantityComparator.method1913(175161870);
            class18.method75(2013158329);
            ((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear(-1471941846);
            Script.Script_cached.clear();
            Client.archive5.method2127(1971799995);
            DevicePcmPlayerProvider.field67.ua(1903798827);
            GameBuild.archive7.ua(1903798827);
            class85.archive4.ua(1903798827);
            class426.field3811.ua(1903798827);
            GrandExchangeOfferTotalQuantityComparator.archive9.ua(1903798827);
            class399.archive6.ua(1903798827);
            FloorUnderlayDefinition.archive11.ua(1903798827);
            class452.archive8.ua(1903798827);
            WorldMapLabelSize.field2285.ua(1903798827);
            NetFileRequest.archive10.ua(1903798827);
            class195.field1645.ua(1903798827);
            class126.archive12.ua(1903798827);
            PcmPlayer.field211.ua(1903798827);
            class31.scene.clear();
            for (int i = 0; i < 4; ++i) {
                if (n == 1772402002) {
                    throw new IllegalStateException();
                }
                Client.collisionMaps[i].clear(1636677273);
            }
            Client.field590.method1138((byte)78);
            System.gc();
            class297.musicPlayerStatus = -626822165;
            class297.musicTrackArchive = null;
            class379.musicTrackGroupId = 1643562499;
            VarpDefinition.musicTrackFileId = -1823837761;
            class100.musicTrackVolume = 0;
            class120.musicTrackBoolean = false;
            class162.pcmSampleLength = 440964570;
            Client.currentTrackGroupId = -1225072817;
            Client.playingJingle = false;
            StructComposition.findEnumerated((byte)1);
            class138.updateGameState(10, 1908973914);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bx.hc(" + ')');
        }
    }
    
    static int method134(final int n, final Script script, final boolean b, final byte b2) {
        try {
            final Widget vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
            if (n == 2500) {
                if (b2 <= 2) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = vmethod3380.x * 262951665;
                return 1;
            }
            else if (n == 2501) {
                if (b2 <= 2) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -747355095 * vmethod3380.y;
                return 1;
            }
            else {
                if (2502 == n) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -794961409 * vmethod3380.width;
                    return 1;
                }
                if (n == 2503) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1473950221 * vmethod3380.height;
                    return 1;
                }
                if (2504 == n) {
                    if (b2 <= 2) {
                        throw new IllegalStateException();
                    }
                    final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                    final int n2 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                    boolean b3;
                    if (vmethod3380.spriteTiling) {
                        if (b2 <= 2) {
                            throw new IllegalStateException();
                        }
                        b3 = true;
                    }
                    else {
                        b3 = false;
                    }
                    interpreter_intStack[n2] = (b3 ? 1 : 0);
                    return 1;
                }
                else {
                    if (2505 != n) {
                        return 2;
                    }
                    if (b2 <= 2) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = vmethod3380.parentId * 913615679;
                    return 1;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bx.as(" + ')');
        }
    }
    
    public static void tr(final GameEngine gameEngine, final WindowEvent windowEvent) {
        if (gameEngine == null) {
            gameEngine.gs();
        }
    }
    
    static boolean ay(final String s, final int n, final String s2) {
        if (n == 0) {
            try {
                if (!class31.field91.startsWith("win")) {
                    throw new Exception();
                }
                if (!s.startsWith("http://") && !s.startsWith("https://")) {
                    throw new Exception();
                }
                final String s3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                for (int i = 0; i < s.length(); ++i) {
                    if (s3.indexOf(s.charAt(i)) == -1) {
                        throw new Exception();
                    }
                }
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + s + "\"");
                return true;
            }
            catch (Throwable t) {
                return false;
            }
        }
        if (1 == n) {
            try {
                return class26.method113(class31.field90, s2, new Object[] { new URL(class31.field90.getCodeBase(), s).toString() }, -561761328) != null;
            }
            catch (Throwable t2) {
                return false;
            }
        }
        if (2 == n) {
            try {
                class31.field90.getAppletContext().showDocument(new URL(class31.field90.getCodeBase(), s), "_blank");
                return true;
            }
            catch (Exception ex) {
                return false;
            }
        }
        if (3 == n) {
            try {
                class26.method112(class31.field90, "loggedout", (byte)(-1));
            }
            catch (Throwable t3) {}
            try {
                class31.field90.getAppletContext().showDocument(new URL(class31.field90.getCodeBase(), s), "_top");
                return true;
            }
            catch (Exception ex2) {
                return false;
            }
        }
        throw new IllegalArgumentException();
    }
    
    static boolean al(final String s, final int n) {
        return RouteStrategy.method1177(s, n, "openjs", -2016728682);
    }
    
    public static void method133(final String str, final boolean b, final boolean b2) {
        if (b) {
            if (!b2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                try {
                    Desktop.getDesktop().browse(new URI(str));
                    return;
                }
                catch (Exception ex) {}
            }
            if (class31.field91.startsWith("win") && !b2) {
                GrandExchangeOfferOwnWorldComparator.method366(str, 0, -1751378396);
            }
            else if (class31.field91.startsWith("mac")) {
                RouteStrategy.method1177(str, 1, "openjs", -518713696);
            }
            else {
                RouteStrategy.method1177(str, 2, "openjs", -1051063352);
            }
        }
        else {
            RouteStrategy.method1177(str, 3, "openjs", -1228258961);
        }
    }
    
    public static String method133(final String s, final int n) {
        try {
            if (s != null) {
                if (n <= -638497309) {
                    throw new IllegalStateException();
                }
                if (!s.isEmpty()) {
                    if (n <= -638497309) {
                        throw new IllegalStateException();
                    }
                    if (s.charAt(0) != '#') {
                        return s;
                    }
                    if (n <= -638497309) {
                        throw new IllegalStateException();
                    }
                }
            }
            return "";
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bx.ac(" + ')');
        }
    }
    
    public static void au(final String str, final boolean b, final boolean b2) {
        if (b) {
            if (!b2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                try {
                    Desktop.getDesktop().browse(new URI(str));
                    return;
                }
                catch (Exception ex) {}
            }
            if (class31.field91.startsWith("win") && !b2) {
                GrandExchangeOfferOwnWorldComparator.method366(str, 0, -2147216913);
            }
            else if (class31.field91.startsWith("mac")) {
                RouteStrategy.method1177(str, 1, "openjs", -2048568680);
            }
            else {
                RouteStrategy.method1177(str, 2, "openjs", -2020654589);
            }
        }
        else {
            RouteStrategy.method1177(str, 3, "openjs", -604957476);
        }
    }
    
    static boolean aa(final String s, final int n, final String s2) {
        if (n == 0) {
            try {
                if (!class31.field91.startsWith("win")) {
                    throw new Exception();
                }
                if (!s.startsWith("http://") && !s.startsWith("https://")) {
                    throw new Exception();
                }
                final String s3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                for (int i = 0; i < s.length(); ++i) {
                    if (s3.indexOf(s.charAt(i)) == -1) {
                        throw new Exception();
                    }
                }
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + s + "\"");
                return true;
            }
            catch (Throwable t) {
                return false;
            }
        }
        if (1 == n) {
            try {
                return class26.method113(class31.field90, s2, new Object[] { new URL(class31.field90.getCodeBase(), s).toString() }, -1205855937) != null;
            }
            catch (Throwable t2) {
                return false;
            }
        }
        if (2 == n) {
            try {
                class31.field90.getAppletContext().showDocument(new URL(class31.field90.getCodeBase(), s), "_blank");
                return true;
            }
            catch (Exception ex) {
                return false;
            }
        }
        if (3 == n) {
            try {
                class26.method112(class31.field90, "loggedout", (byte)(-35));
            }
            catch (Throwable t3) {}
            try {
                class31.field90.getAppletContext().showDocument(new URL(class31.field90.getCodeBase(), s), "_top");
                return true;
            }
            catch (Exception ex2) {
                return false;
            }
        }
        throw new IllegalArgumentException();
    }
    
    static int method135(int n, final Script script, final boolean b, final byte b2) {
        try {
            int n2 = -1;
            Widget vmethod3380;
            if (n >= 2000) {
                if (b2 >= 64) {
                    throw new IllegalStateException();
                }
                n -= 1000;
                n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                vmethod3380 = class165.vmethod3380(n2, (byte)5);
            }
            else {
                vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
            }
            if (1100 == n) {
                if (b2 >= 64) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                final int n4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                if (vmethod3380.type * 883712245 == 12) {
                    final class314 method1815 = vmethod3380.method1815((byte)(-21));
                    if (method1815 != null) {
                        if (b2 >= 64) {
                            throw new IllegalStateException();
                        }
                        if (method1815.method1713(n3, n4, (byte)114)) {
                            if (b2 >= 64) {
                                throw new IllegalStateException();
                            }
                            class144.invalidateWidget(vmethod3380, -1259476170);
                        }
                    }
                }
                else {
                    vmethod3380.scrollX = 66597705 * n3;
                    if (-1469632775 * vmethod3380.scrollX > -773060713 * vmethod3380.scrollWidth - vmethod3380.width * -794961409) {
                        if (b2 >= 64) {
                            throw new IllegalStateException();
                        }
                        vmethod3380.scrollX = vmethod3380.scrollWidth * 18431759 - vmethod3380.width * 460912311;
                    }
                    if (vmethod3380.scrollX * -1469632775 < 0) {
                        vmethod3380.scrollX = 0;
                    }
                    vmethod3380.scrollY = n4 * 946188063;
                    if (vmethod3380.scrollY * 1223232735 > -1273374131 * vmethod3380.scrollHeight - 1473950221 * vmethod3380.height) {
                        if (b2 >= 64) {
                            throw new IllegalStateException();
                        }
                        vmethod3380.scrollY = vmethod3380.scrollHeight * 1941770835 - vmethod3380.height * 978547347;
                    }
                    if (vmethod3380.scrollY * 1223232735 < 0) {
                        if (b2 >= 64) {
                            throw new IllegalStateException();
                        }
                        vmethod3380.scrollY = 0;
                    }
                    class144.invalidateWidget(vmethod3380, -947145035);
                }
                return 1;
            }
            else if (n == 1101) {
                if (b2 >= 64) {
                    throw new IllegalStateException();
                }
                vmethod3380.color = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -1604768377;
                class144.invalidateWidget(vmethod3380, -1063051972);
                return 1;
            }
            else if (1102 == n) {
                if (b2 >= 64) {
                    throw new IllegalStateException();
                }
                final Widget widget = vmethod3380;
                boolean noScrollThrough;
                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                    if (b2 >= 64) {
                        throw new IllegalStateException();
                    }
                    noScrollThrough = true;
                }
                else {
                    noScrollThrough = false;
                }
                widget.noScrollThrough = noScrollThrough;
                class144.invalidateWidget(vmethod3380, -931974277);
                return 1;
            }
            else if (1103 == n) {
                if (b2 >= 64) {
                    throw new IllegalStateException();
                }
                vmethod3380.transparencyTop = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1833148663;
                class144.invalidateWidget(vmethod3380, -1480322617);
                return 1;
            }
            else if (n == 1104) {
                if (b2 >= 64) {
                    throw new IllegalStateException();
                }
                vmethod3380.lineWid = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1040382753;
                class144.invalidateWidget(vmethod3380, -1063049352);
                return 1;
            }
            else if (1105 == n) {
                if (b2 >= 64) {
                    throw new IllegalStateException();
                }
                vmethod3380.spriteId2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -504605111;
                class144.invalidateWidget(vmethod3380, -932451390);
                return 1;
            }
            else if (1106 == n) {
                if (b2 >= 64) {
                    throw new IllegalStateException();
                }
                vmethod3380.spriteAngle = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 877496813;
                class144.invalidateWidget(vmethod3380, -1285822924);
                return 1;
            }
            else if (1107 == n) {
                if (b2 >= 64) {
                    throw new IllegalStateException();
                }
                final Widget widget2 = vmethod3380;
                boolean field2913;
                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                    if (b2 >= 64) {
                        throw new IllegalStateException();
                    }
                    field2913 = true;
                }
                else {
                    field2913 = false;
                }
                widget2.field2913 = field2913;
                class144.invalidateWidget(vmethod3380, -1400918825);
                return 1;
            }
            else if (1108 == n) {
                if (b2 >= 64) {
                    throw new IllegalStateException();
                }
                vmethod3380.modelType = -1714481443;
                vmethod3380.modelId = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 509431749;
                class144.invalidateWidget(vmethod3380, -2131428764);
                return 1;
            }
            else if (1109 == n) {
                if (b2 >= 64) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize += 1732151458;
                vmethod3380.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * 1759898391;
                vmethod3380.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] * 1163821709;
                vmethod3380.modelAngleX = -142910041 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 2];
                vmethod3380.modelAngleY = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 3] * -230241203;
                vmethod3380.modelAngleZ = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 4] * -1051718121;
                vmethod3380.modelZoom = Interpreter.Interpreter_intStack[5 + Interpreter.Interpreter_intStackSize * -964267539] * -467727501;
                class144.invalidateWidget(vmethod3380, -1300083234);
                return 1;
            }
            else if (n == 1110) {
                if (b2 >= 64) {
                    throw new IllegalStateException();
                }
                final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                if (-1526544909 * vmethod3380.sequenceId != n5) {
                    vmethod3380.sequenceId = -1195025605 * n5;
                    vmethod3380.modelFrame = 0;
                    vmethod3380.modelFrameCycle = 0;
                    class144.invalidateWidget(vmethod3380, -1009300791);
                }
                return 1;
            }
            else {
                if (n == 1111) {
                    final Widget widget3 = vmethod3380;
                    boolean field2914;
                    if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                        if (b2 >= 64) {
                            throw new IllegalStateException();
                        }
                        field2914 = true;
                    }
                    else {
                        field2914 = false;
                    }
                    widget3.field2891 = field2914;
                    class144.invalidateWidget(vmethod3380, -1822094171);
                    return 1;
                }
                if (n == 1112) {
                    if (b2 >= 64) {
                        throw new IllegalStateException();
                    }
                    final String field2915 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                    if (!field2915.equals(vmethod3380.field2916)) {
                        if (b2 >= 64) {
                            throw new IllegalStateException();
                        }
                        vmethod3380.field2916 = field2915;
                        class144.invalidateWidget(vmethod3380, -1585171731);
                    }
                    return 1;
                }
                else if (1113 == n) {
                    if (b2 >= 64) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.fontId = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1858899927;
                    if (883712245 * vmethod3380.type == 12) {
                        if (b2 >= 64) {
                            throw new IllegalStateException();
                        }
                        final class314 method1816 = vmethod3380.method1815((byte)(-64));
                        if (method1816 != null) {
                            if (b2 >= 64) {
                                throw new IllegalStateException();
                            }
                            class314.oe(method1816, -83630880);
                        }
                    }
                    class144.invalidateWidget(vmethod3380, -1339607446);
                    return 1;
                }
                else if (n == 1114) {
                    if (b2 >= 64) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStackSize -= 1281407919;
                    if (12 == vmethod3380.type * 883712245) {
                        if (b2 >= 64) {
                            throw new IllegalStateException();
                        }
                        final class314 method1817 = vmethod3380.method1815((byte)(-50));
                        if (method1817 != null) {
                            method1817.method1714(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], 1553777879);
                            method1817.method1715(Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539], 2084045870);
                        }
                    }
                    else {
                        vmethod3380.textXAlignment = 1612549297 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                        vmethod3380.textYAlignment = -522107433 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
                        vmethod3380.textLineHeight = 2116078665 * Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
                    }
                    class144.invalidateWidget(vmethod3380, -1974465525);
                    return 1;
                }
                else {
                    if (n == 1115) {
                        final Widget widget4 = vmethod3380;
                        boolean isIf3;
                        if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                            if (b2 >= 64) {
                                throw new IllegalStateException();
                            }
                            isIf3 = true;
                        }
                        else {
                            isIf3 = false;
                        }
                        widget4.isIf3 = isIf3;
                        class144.invalidateWidget(vmethod3380, -875283748);
                        return 1;
                    }
                    if (1116 == n) {
                        if (b2 >= 64) {
                            throw new IllegalStateException();
                        }
                        vmethod3380.outline = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 646392503;
                        class144.invalidateWidget(vmethod3380, -1135395149);
                        return 1;
                    }
                    else if (1117 == n) {
                        if (b2 >= 64) {
                            throw new IllegalStateException();
                        }
                        vmethod3380.spriteShadow = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -140657215;
                        class144.invalidateWidget(vmethod3380, -1130124185);
                        return 1;
                    }
                    else {
                        if (1118 == n) {
                            final Widget widget5 = vmethod3380;
                            boolean noClickThrough;
                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                if (b2 >= 64) {
                                    throw new IllegalStateException();
                                }
                                noClickThrough = true;
                            }
                            else {
                                noClickThrough = false;
                            }
                            widget5.noClickThrough = noClickThrough;
                            class144.invalidateWidget(vmethod3380, -1270886750);
                            return 1;
                        }
                        if (n == 1119) {
                            if (b2 >= 64) {
                                throw new IllegalStateException();
                            }
                            final Widget widget6 = vmethod3380;
                            boolean textShadowed;
                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                if (b2 >= 64) {
                                    throw new IllegalStateException();
                                }
                                textShadowed = true;
                            }
                            else {
                                textShadowed = false;
                            }
                            widget6.textShadowed = textShadowed;
                            class144.invalidateWidget(vmethod3380, -1415777562);
                            return 1;
                        }
                        else if (1120 == n) {
                            if (b2 >= 64) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStackSize -= 854271946;
                            vmethod3380.scrollWidth = -1469650905 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                            vmethod3380.scrollHeight = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1] * -1357451643;
                            class144.invalidateWidget(vmethod3380, -589899660);
                            if (n2 != -1 && 0 == vmethod3380.type * 883712245) {
                                if (b2 >= 64) {
                                    throw new IllegalStateException();
                                }
                                WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[n2 >> 16], vmethod3380, false, (byte)97);
                            }
                            return 1;
                        }
                        else if (n == 1121) {
                            if (b2 >= 64) {
                                throw new IllegalStateException();
                            }
                            class81.resumePauseWidget(1713081171 * vmethod3380.id, 55577617 * vmethod3380.childIndex, (short)30588);
                            class144.invalidateWidget(Client.meslayerContinueWidget = vmethod3380, -772862177);
                            return 1;
                        }
                        else if (1122 == n) {
                            if (b2 >= 64) {
                                throw new IllegalStateException();
                            }
                            vmethod3380.spriteId = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1679014525;
                            class144.invalidateWidget(vmethod3380, -1355236161);
                            return 1;
                        }
                        else if (1123 == n) {
                            if (b2 >= 64) {
                                throw new IllegalStateException();
                            }
                            vmethod3380.color2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 714852617;
                            class144.invalidateWidget(vmethod3380, -1109886796);
                            return 1;
                        }
                        else if (n == 1124) {
                            if (b2 >= 64) {
                                throw new IllegalStateException();
                            }
                            vmethod3380.transparencyBot = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * -1159723969;
                            class144.invalidateWidget(vmethod3380, -1723613008);
                            return 1;
                        }
                        else {
                            if (n == 1125) {
                                final FillMode fillMode = (FillMode)StructComposition.findEnumerated(GrandExchangeOffer.method1928(1113408540), Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (short)173);
                                if (fillMode != null) {
                                    if (b2 >= 64) {
                                        throw new IllegalStateException();
                                    }
                                    vmethod3380.fillMode = fillMode;
                                    class144.invalidateWidget(vmethod3380, -1190731439);
                                }
                                return 1;
                            }
                            if (n == 1126) {
                                if (b2 >= 64) {
                                    throw new IllegalStateException();
                                }
                                boolean isScrollBar;
                                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                    if (b2 >= 64) {
                                        throw new IllegalStateException();
                                    }
                                    isScrollBar = true;
                                }
                                else {
                                    isScrollBar = false;
                                }
                                vmethod3380.isScrollBar = isScrollBar;
                                return 1;
                            }
                            else if (1127 == n) {
                                if (b2 >= 64) {
                                    throw new IllegalStateException();
                                }
                                boolean spriteFlipV;
                                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                    if (b2 >= 64) {
                                        throw new IllegalStateException();
                                    }
                                    spriteFlipV = true;
                                }
                                else {
                                    spriteFlipV = false;
                                }
                                vmethod3380.spriteFlipV = spriteFlipV;
                                return 1;
                            }
                            else if (n == 1129) {
                                if (b2 >= 64) {
                                    throw new IllegalStateException();
                                }
                                vmethod3380.spellActionName = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                                class144.invalidateWidget(vmethod3380, -1494756041);
                                return 1;
                            }
                            else if (1130 == n) {
                                if (b2 >= 64) {
                                    throw new IllegalStateException();
                                }
                                vmethod3380.method1803(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], class14.urlRequester, Projectile.method450(-451145787));
                                return 1;
                            }
                            else if (n == 1131) {
                                if (b2 >= 64) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStackSize -= 854271946;
                                vmethod3380.method1824(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], (byte)(-108));
                                return 1;
                            }
                            else {
                                if (n == 1132) {
                                    vmethod3380.method1805(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1150325710);
                                    return 1;
                                }
                                if (n == 1133) {
                                    Interpreter.Interpreter_intStackSize -= 427135973;
                                    final class309 method1818 = vmethod3380.method1817(-1740765458);
                                    if (method1818 != null) {
                                        if (b2 >= 64) {
                                            throw new IllegalStateException();
                                        }
                                        method1818.field2817 = 202848117 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                                        class144.invalidateWidget(vmethod3380, -1672427722);
                                    }
                                    return 1;
                                }
                                if (n == 1134) {
                                    if (b2 >= 64) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStackSize -= 427135973;
                                    final class309 method1819 = vmethod3380.method1817(-1740765458);
                                    if (null != method1819) {
                                        if (b2 >= 64) {
                                            throw new IllegalStateException();
                                        }
                                        method1819.field2818 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] * -1464228981;
                                        class144.invalidateWidget(vmethod3380, -1662789089);
                                    }
                                    return 1;
                                }
                                else if (n == 1135) {
                                    if (b2 >= 64) {
                                        throw new IllegalStateException();
                                    }
                                    SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                                    if (null != vmethod3380.method1815((byte)74)) {
                                        if (b2 >= 64) {
                                            throw new IllegalStateException();
                                        }
                                        vmethod3380.buttonText = Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize];
                                    }
                                    return 1;
                                }
                                else {
                                    if (1136 == n) {
                                        Interpreter.Interpreter_intStackSize -= 427135973;
                                        final class309 method1820 = vmethod3380.method1817(-1740765458);
                                        if (method1820 != null) {
                                            if (b2 >= 64) {
                                                throw new IllegalStateException();
                                            }
                                            method1820.field2816 = -1652794843 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                                            class144.invalidateWidget(vmethod3380, -1540567087);
                                        }
                                        return 1;
                                    }
                                    if (1137 == n) {
                                        if (b2 >= 64) {
                                            throw new IllegalStateException();
                                        }
                                        Interpreter.Interpreter_intStackSize -= 427135973;
                                        final class314 method1821 = vmethod3380.method1815((byte)0);
                                        if (method1821 != null) {
                                            if (b2 >= 64) {
                                                throw new IllegalStateException();
                                            }
                                            if (method1821.method1711(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], 2034737462)) {
                                                if (b2 >= 64) {
                                                    throw new IllegalStateException();
                                                }
                                                class144.invalidateWidget(vmethod3380, -1663792807);
                                            }
                                        }
                                        return 1;
                                    }
                                    else if (1138 == n) {
                                        if (b2 >= 64) {
                                            throw new IllegalStateException();
                                        }
                                        Interpreter.Interpreter_intStackSize -= 427135973;
                                        final class314 method1822 = vmethod3380.method1815((byte)26);
                                        if (method1822 != null) {
                                            if (b2 >= 64) {
                                                throw new IllegalStateException();
                                            }
                                            if (method1822.method1719(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], (byte)16)) {
                                                class144.invalidateWidget(vmethod3380, -1071804672);
                                            }
                                        }
                                        return 1;
                                    }
                                    else {
                                        if (n == 1139) {
                                            Interpreter.Interpreter_intStackSize -= 427135973;
                                            final class314 method1823 = vmethod3380.method1815((byte)66);
                                            if (null != method1823) {
                                                if (b2 >= 64) {
                                                    throw new IllegalStateException();
                                                }
                                                if (method1823.method1712(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], -1888462912)) {
                                                    if (b2 >= 64) {
                                                        throw new IllegalStateException();
                                                    }
                                                    class144.invalidateWidget(vmethod3380, -1406914923);
                                                }
                                            }
                                            return 1;
                                        }
                                        if (n == 1140) {
                                            if (b2 >= 64) {
                                                throw new IllegalStateException();
                                            }
                                            boolean b3;
                                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                if (b2 >= 64) {
                                                    throw new IllegalStateException();
                                                }
                                                b3 = true;
                                            }
                                            else {
                                                b3 = false;
                                            }
                                            final boolean b4 = b3;
                                            Client.field590.method1138((byte)31);
                                            final class314 method1824 = vmethod3380.method1815((byte)(-56));
                                            if (null != method1824) {
                                                if (b2 >= 64) {
                                                    throw new IllegalStateException();
                                                }
                                                if (method1824.method1706(b4, 832608587)) {
                                                    if (b4) {
                                                        if (b2 >= 64) {
                                                            throw new IllegalStateException();
                                                        }
                                                        Client.field590.method1137(vmethod3380, -583881235);
                                                    }
                                                    class144.invalidateWidget(vmethod3380, -2070746507);
                                                }
                                            }
                                            return 1;
                                        }
                                        else if (1141 == n) {
                                            if (b2 >= 64) {
                                                throw new IllegalStateException();
                                            }
                                            boolean b5;
                                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                if (b2 >= 64) {
                                                    throw new IllegalStateException();
                                                }
                                                b5 = true;
                                            }
                                            else {
                                                b5 = false;
                                            }
                                            final boolean b6 = b5;
                                            if (!b6) {
                                                if (b2 >= 64) {
                                                    throw new IllegalStateException();
                                                }
                                                if (Client.field590.method1144((short)32767) == vmethod3380) {
                                                    if (b2 >= 64) {
                                                        throw new IllegalStateException();
                                                    }
                                                    Client.field590.method1138((byte)(-3));
                                                    class144.invalidateWidget(vmethod3380, -1890877688);
                                                }
                                            }
                                            final class314 method1825 = vmethod3380.method1815((byte)(-8));
                                            if (method1825 != null) {
                                                if (b2 >= 64) {
                                                    throw new IllegalStateException();
                                                }
                                                method1825.method1707(b6, 1575779976);
                                            }
                                            return 1;
                                        }
                                        else {
                                            if (1142 == n) {
                                                Interpreter.Interpreter_intStackSize -= 854271946;
                                                final class314 method1826 = vmethod3380.method1815((byte)(-41));
                                                if (method1826 != null) {
                                                    if (b2 >= 64) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (method1826.method1725(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539], (byte)19)) {
                                                        if (b2 >= 64) {
                                                            throw new IllegalStateException();
                                                        }
                                                        class144.invalidateWidget(vmethod3380, -1633709236);
                                                    }
                                                }
                                                return 1;
                                            }
                                            if (n == 1143) {
                                                if (b2 >= 64) {
                                                    throw new IllegalStateException();
                                                }
                                                Interpreter.Interpreter_intStackSize -= 427135973;
                                                final class314 method1827 = vmethod3380.method1815((byte)(-7));
                                                if (null != method1827) {
                                                    if (b2 >= 64) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (method1827.method1725(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], (byte)19)) {
                                                        if (b2 >= 64) {
                                                            throw new IllegalStateException();
                                                        }
                                                        class144.invalidateWidget(vmethod3380, -1737202384);
                                                    }
                                                }
                                                return 1;
                                            }
                                            else {
                                                if (1144 == n) {
                                                    Interpreter.Interpreter_intStackSize -= 427135973;
                                                    final class314 method1828 = vmethod3380.method1815((byte)(-77));
                                                    if (method1828 != null) {
                                                        if (b2 >= 64) {
                                                            throw new IllegalStateException();
                                                        }
                                                        method1828.method1717(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], 1444501030);
                                                        class144.invalidateWidget(vmethod3380, -1946722325);
                                                    }
                                                    return 1;
                                                }
                                                if (n == 1145) {
                                                    if (b2 >= 64) {
                                                        throw new IllegalStateException();
                                                    }
                                                    Interpreter.Interpreter_intStackSize -= 427135973;
                                                    final class314 method1829 = vmethod3380.method1815((byte)(-107));
                                                    if (null != method1829) {
                                                        if (b2 >= 64) {
                                                            throw new IllegalStateException();
                                                        }
                                                        method1829.method1705(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], -1564790862);
                                                    }
                                                    return 1;
                                                }
                                                else if (n == 1146) {
                                                    if (b2 >= 64) {
                                                        throw new IllegalStateException();
                                                    }
                                                    Interpreter.Interpreter_intStackSize -= 427135973;
                                                    final class314 method1830 = vmethod3380.method1815((byte)70);
                                                    if (method1830 != null) {
                                                        if (b2 >= 64) {
                                                            throw new IllegalStateException();
                                                        }
                                                        class314.method1733(method1830, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], (byte)59);
                                                    }
                                                    return 1;
                                                }
                                                else if (n == 1147) {
                                                    if (b2 >= 64) {
                                                        throw new IllegalStateException();
                                                    }
                                                    Interpreter.Interpreter_intStackSize -= 427135973;
                                                    final class314 method1831 = vmethod3380.method1815((byte)112);
                                                    if (null != method1831) {
                                                        if (b2 >= 64) {
                                                            throw new IllegalStateException();
                                                        }
                                                        method1831.method1718(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], (short)(-6347));
                                                        class144.invalidateWidget(vmethod3380, -810371265);
                                                    }
                                                    return 1;
                                                }
                                                else if (1148 == n) {
                                                    if (b2 >= 64) {
                                                        throw new IllegalStateException();
                                                    }
                                                    Interpreter.Interpreter_intStackSize -= 854271946;
                                                    final class27 method1832 = vmethod3380.method1795(2008263270);
                                                    if (null != method1832) {
                                                        if (b2 >= 64) {
                                                            throw new IllegalStateException();
                                                        }
                                                        method1832.method114(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], (byte)0);
                                                    }
                                                    return 1;
                                                }
                                                else if (1149 == n) {
                                                    if (b2 >= 64) {
                                                        throw new IllegalStateException();
                                                    }
                                                    Interpreter.Interpreter_intStackSize -= 854271946;
                                                    final class27 method1833 = vmethod3380.method1795(1888304373);
                                                    if (method1833 != null) {
                                                        if (b2 >= 64) {
                                                            throw new IllegalStateException();
                                                        }
                                                        method1833.method115((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], 48495477);
                                                    }
                                                    return 1;
                                                }
                                                else {
                                                    if (1150 != n) {
                                                        return 2;
                                                    }
                                                    if (b2 >= 64) {
                                                        throw new IllegalStateException();
                                                    }
                                                    vmethod3380.method1802(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], class14.urlRequester, 554088678);
                                                    return 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bx.ab(" + ')');
        }
    }
    
    public static void method135(final String str, final boolean b, final boolean b2) {
        if (b) {
            if (!b2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                try {
                    Desktop.getDesktop().browse(new URI(str));
                    return;
                }
                catch (Exception ex) {}
            }
            if (class31.field91.startsWith("win") && !b2) {
                GrandExchangeOfferOwnWorldComparator.method366(str, 0, -1891375398);
            }
            else if (class31.field91.startsWith("mac")) {
                RouteStrategy.method1177(str, 1, "openjs", -692539419);
            }
            else {
                RouteStrategy.method1177(str, 2, "openjs", -1889705114);
            }
        }
        else {
            RouteStrategy.method1177(str, 3, "openjs", -463703802);
        }
    }
    
    static boolean aq(final String s, final int n) {
        return RouteStrategy.method1177(s, n, "openjs", -2017257398);
    }
}
