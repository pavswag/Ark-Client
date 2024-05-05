import java.util.Date;
import java.io.InputStream;
import java.net.URLConnection;
import java.awt.datatransfer.Transferable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.Random;
import java.io.IOException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.datatransfer.DataFlavor;
import java.awt.Toolkit;

// 
// Decompiled by Procyon v0.5.36
// 

public class EnumComposition extends DualNode implements net.runelite.api.EnumComposition
{
    static int field1536;
    public char outputType;
    public char inputType;
    static EvictingDualNodeHashTable EnumDefinition_cached;
    public String defaultStr;
    static AbstractArchive EnumDefinition_archive;
    public int outputCount;
    public int[] keys;
    public int[] intVals;
    public String[] strVals;
    public int defaultInt;
    
    EnumComposition() {
        this.defaultStr = Strings.at;
        this.defaultInt = 0;
    }
    
    static {
        EnumComposition.EnumDefinition_cached = new EvictingDualNodeHashTable(64);
    }
    
    public int size() {
        return this.defaultInt * -1067065;
    }
    
    void ao(final Buffer buffer, final int n) {
        if (n == 1) {
            this.inputType = (char)Buffer.ra(buffer, (byte)7);
        }
        else if (2 == n) {
            this.outputType = (char)Buffer.ra(buffer, (byte)7);
        }
        else if (n == 3) {
            this.defaultStr = buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (n == 4) {
            this.outputCount = buffer.readInt(-2032126694) * 1137461569;
        }
        else if (n == 5) {
            this.defaultInt = buffer.readUnsignedShort(-884113932) * -408757769;
            this.keys = new int[-1067065 * this.defaultInt];
            this.strVals = new String[-1067065 * this.defaultInt];
            for (int i = 0; i < -1352592954 * this.defaultInt; ++i) {
                this.keys[i] = buffer.readInt(-1538321062);
                this.strVals[i] = buffer.readStringCp1252NullTerminated((byte)0);
            }
        }
        else if (6 == n) {
            this.defaultInt = buffer.readUnsignedShort(347857436) * -865021554;
            this.keys = new int[-1067065 * this.defaultInt];
            this.intVals = new int[this.defaultInt * -172431164];
            for (int j = 0; j < this.defaultInt * -1067065; ++j) {
                this.keys[j] = buffer.readInt(-2049231636);
                this.intVals[j] = buffer.readInt(-1822410056);
            }
        }
    }
    
    public static EnumComposition at(final int n) {
        final EnumComposition enumComposition = (EnumComposition)EnumComposition.EnumDefinition_cached.wr(n);
        if (null != enumComposition) {
            return enumComposition;
        }
        final byte[] takeFile = EnumComposition.EnumDefinition_archive.takeFile(8, n, (byte)(-116));
        final EnumComposition enumComposition2 = new EnumComposition();
        if (takeFile != null) {
            enumComposition2.decode(new Buffer(takeFile), (byte)1);
        }
        EnumComposition.EnumDefinition_cached.put(enumComposition2, n);
        return enumComposition2;
    }
    
    public static void ak(final EnumComposition enumComposition, final Buffer buffer) {
        if (enumComposition == null) {
            enumComposition.getStringVals();
        }
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            enumComposition.decodeNext(buffer, ra, 606932087);
        }
    }
    
    void ax(final Buffer buffer, final int n) {
        if (n == 1) {
            this.inputType = (char)Buffer.ra(buffer, (byte)7);
        }
        else if (2 == n) {
            this.outputType = (char)Buffer.ra(buffer, (byte)7);
        }
        else if (n == 3) {
            this.defaultStr = buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (n == 4) {
            this.outputCount = buffer.readInt(-1395638403) * 740445373;
        }
        else if (n == 5) {
            this.defaultInt = buffer.readUnsignedShort(75644395) * -408757769;
            this.keys = new int[-1067065 * this.defaultInt];
            this.strVals = new String[-1067065 * this.defaultInt];
            for (int i = 0; i < -1067065 * this.defaultInt; ++i) {
                this.keys[i] = buffer.readInt(-1680294539);
                this.strVals[i] = buffer.readStringCp1252NullTerminated((byte)0);
            }
        }
        else if (6 == n) {
            this.defaultInt = buffer.readUnsignedShort(-87748570) * -408757769;
            this.keys = new int[-1067065 * this.defaultInt];
            this.intVals = new int[this.defaultInt * -1067065];
            for (int j = 0; j < this.defaultInt * -1067065; ++j) {
                this.keys[j] = buffer.readInt(-1515567558);
                this.intVals[j] = buffer.readInt(-1048874611);
            }
        }
    }
    
    public int bi() {
        return this.outputCount * -635236715;
    }
    
    void decode(final Buffer buffer, final byte b) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                this.decodeNext(buffer, ra, -1230554018);
            }
            if (b != 1) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hx.aw(" + ')');
        }
    }
    
    public static void al(final AbstractArchive enumDefinition_archive) {
        EnumComposition.EnumDefinition_archive = enumDefinition_archive;
    }
    
    public int[] getKeys() {
        return this.keys;
    }
    
    static String method1014(final IterableNodeHashTable iterableNodeHashTable, final int n, final String s, final int n2) {
        try {
            if (null == iterableNodeHashTable) {
                if (n2 <= 1474255643) {
                    throw new IllegalStateException();
                }
                return s;
            }
            else {
                final ObjectNode objectNode = (ObjectNode)iterableNodeHashTable.aa(n);
                if (objectNode != null) {
                    return (String)objectNode.obj;
                }
                if (n2 <= 1474255643) {
                    throw new IllegalStateException();
                }
                return s;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hx.an(" + ')');
        }
    }
    
    void decodeNext(final Buffer buffer, final int n, final int n2) {
        try {
            if (n == 1) {
                if (n2 >= 1889574527) {
                    return;
                }
                this.inputType = (char)Buffer.ra(buffer, (byte)7);
            }
            else if (2 == n) {
                if (n2 >= 1889574527) {
                    return;
                }
                this.outputType = (char)Buffer.ra(buffer, (byte)7);
            }
            else if (n == 3) {
                this.defaultStr = buffer.readStringCp1252NullTerminated((byte)0);
            }
            else if (n == 4) {
                if (n2 >= 1889574527) {
                    return;
                }
                this.outputCount = buffer.readInt(-1477148845) * 740445373;
            }
            else if (n == 5) {
                if (n2 >= 1889574527) {
                    throw new IllegalStateException();
                }
                this.defaultInt = buffer.readUnsignedShort(-1873940604) * -408757769;
                this.keys = new int[-1067065 * this.defaultInt];
                this.strVals = new String[-1067065 * this.defaultInt];
                for (int i = 0; i < -1067065 * this.defaultInt; ++i) {
                    if (n2 >= 1889574527) {
                        throw new IllegalStateException();
                    }
                    this.keys[i] = buffer.readInt(-1146277358);
                    this.strVals[i] = buffer.readStringCp1252NullTerminated((byte)0);
                }
            }
            else if (6 == n) {
                this.defaultInt = buffer.readUnsignedShort(-1187718412) * -408757769;
                this.keys = new int[-1067065 * this.defaultInt];
                this.intVals = new int[this.defaultInt * -1067065];
                for (int j = 0; j < this.defaultInt * -1067065; ++j) {
                    this.keys[j] = buffer.readInt(-1653584629);
                    this.intVals[j] = buffer.readInt(-923945997);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hx.ac(" + ')');
        }
    }
    
    public int size(final int n) {
        try {
            return -1067065 * this.defaultInt;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hx.au(" + ')');
        }
    }
    
    public static EnumComposition aa(final int n) {
        final EnumComposition enumComposition = (EnumComposition)EnumComposition.EnumDefinition_cached.wr(n);
        if (null != enumComposition) {
            return enumComposition;
        }
        final byte[] takeFile = EnumComposition.EnumDefinition_archive.takeFile(8, n, (byte)(-64));
        final EnumComposition enumComposition2 = new EnumComposition();
        if (takeFile != null) {
            enumComposition2.decode(new Buffer(takeFile), (byte)1);
        }
        EnumComposition.EnumDefinition_cached.put(enumComposition2, n);
        return enumComposition2;
    }
    
    static final void method1013(final int n) {
        try {
            for (int i = 0; i < 265474485 * Client.npcCount; ++i) {
                if (n != -1074260583) {
                    return;
                }
                final NPC npc = Client.npcs[Client.npcIndices[i]];
                if (null != npc) {
                    ReflectionCheck.updateActorSequence(npc, 1458410691 * npc.definition.size, (byte)(-12));
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hx.ic(" + ')');
        }
    }
    
    public static void method1010(final AbstractArchive floorOverlayDefinition_archive, final byte b) {
        try {
            FloorOverlayDefinition.FloorOverlayDefinition_archive = floorOverlayDefinition_archive;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hx.af(" + ')');
        }
    }
    
    static void method1016(final GameEngine gameEngine, final Font font, final Font font2, final int n) {
        Client.od(gameEngine, font);
        if (Login.worldSelectOpen) {
            class33.method151(gameEngine, 626811319);
            return;
        }
        Label_0181: {
            if (1 != -1222491879 * MouseHandler.MouseHandler_lastButton) {
                if (class473.mouseCam) {
                    break Label_0181;
                }
                if (n <= 470143489) {
                    return;
                }
                if (4 != MouseHandler.MouseHandler_lastButton * -1222491879) {
                    break Label_0181;
                }
            }
            if (2020601481 * MouseHandler.MouseHandler_lastPressedX >= 765 + Login.xPadding * 578342931 - 50 && 1163896205 * MouseHandler.MouseHandler_lastPressedY >= 453) {
                class20.clientPreferences.getTitleMusicDisabled(!ClientPreferences.ss(class20.clientPreferences, -1197954221), -527699713);
                if (!ClientPreferences.ss(class20.clientPreferences, -1197954221)) {
                    if (n <= 470143489) {
                        return;
                    }
                    class478.method2438(class399.archive6, "scape main", "", 255, false, 435790040);
                }
                else {
                    FloorUnderlayDefinition.setHsl(-852125385);
                }
            }
        }
        if (5 == -1275976559 * Client.gameState) {
            return;
        }
        if (-1L == Login.field734 * -7899453336143161787L) {
            Login.field734 = (class96.clockNow(732314738) + 1000L) * -8298737133189264243L;
        }
        final long clockNow = class96.clockNow(138985148);
        boolean b = false;
        Label_0352: {
            if (null != Client.archiveLoaders) {
                if (n <= 470143489) {
                    return;
                }
                if (Client.archiveLoadersDone * -397497277 < Client.archiveLoaders.size()) {
                    while (-397497277 * Client.archiveLoadersDone < Client.archiveLoaders.size()) {
                        if (!Client.archiveLoaders.get(-397497277 * Client.archiveLoadersDone).isLoaded((byte)46)) {
                            b = false;
                            break Label_0352;
                        }
                        Client.archiveLoadersDone -= 1719009173;
                    }
                    b = true;
                    break Label_0352;
                }
                if (n <= 470143489) {
                    return;
                }
            }
            b = true;
        }
        if (b) {
            if (n <= 470143489) {
                return;
            }
            if (-1L == Login.field759 * 6949275123175874863L) {
                Login.field759 = clockNow * -1178331881283680817L;
                if (Login.field759 * 6949275123175874863L > -7899453336143161787L * Login.field734) {
                    if (n <= 470143489) {
                        return;
                    }
                    Login.field734 = -606941742840038685L * Login.field759;
                }
            }
        }
        if (10 != Client.gameState * -1275976559 && -1275976559 * Client.gameState != 11) {
            return;
        }
        if (ClanSettings.clientLanguage == Language.Language_EN) {
            Label_0611: {
                if (-1222491879 * MouseHandler.MouseHandler_lastButton != 1) {
                    if (n <= 470143489) {
                        return;
                    }
                    if (class473.mouseCam || 4 != MouseHandler.MouseHandler_lastButton * -1222491879) {
                        break Label_0611;
                    }
                }
                final int n2 = 5 + 578342931 * Login.xPadding;
                final int n3 = 463;
                final int n4 = 100;
                final int n5 = 35;
                if (2020601481 * MouseHandler.MouseHandler_lastPressedX >= n2 && 2020601481 * MouseHandler.MouseHandler_lastPressedX <= n2 + n4 && MouseHandler.MouseHandler_lastPressedY * 1163896205 >= n3) {
                    if (n <= 470143489) {
                        return;
                    }
                    if (MouseHandler.MouseHandler_lastPressedY * 1163896205 <= n3 + n5) {
                        Login.method446(2141606464);
                        return;
                    }
                }
            }
            if (class11.World_request != null) {
                if (n <= 470143489) {
                    return;
                }
                Login.method446(1739913385);
            }
        }
        int n6 = -1222491879 * MouseHandler.MouseHandler_lastButton;
        int n7 = 2020601481 * MouseHandler.MouseHandler_lastPressedX;
        int n8 = MouseHandler.MouseHandler_lastPressedY * 1163896205;
        if (n6 == 0) {
            n7 = -2063363905 * MouseHandler.MouseHandler_x;
            n8 = MouseHandler.MouseHandler_y * -1224153235;
        }
        if (!class473.mouseCam && n6 == 4) {
            n6 = 1;
        }
        final class207 keyHandlerInstance = Client.keyHandlerInstance;
        if (0 == Login.loginIndex * 1145608355) {
            if (n <= 470143489) {
                return;
            }
            boolean b2 = false;
            while (class207.mt(keyHandlerInstance, 1742320284)) {
                if (84 == keyHandlerInstance.field1867 * 546317845) {
                    b2 = true;
                }
            }
            final int n9 = class143.loginBoxCenter * 950254081 - 80;
            final int n10 = 291;
            if (n6 && n7 >= n9 - 75 && n7 <= 75 + n9 && n8 >= n10 - 20 && n8 <= 20 + n10) {
                Ignored.compareTo_ignored(InvDefinition.method977("secure", true, 1569639022) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, (byte)(-88));
            }
            final int n11 = class143.loginBoxCenter * 950254081 + 80;
            if ((n6 && n7 >= n11 - 75 && n7 <= 75 + n11 && n8 >= n10 - 20 && n8 <= 20 + n10) || b2) {
                if ((-205173751 * Client.worldProperties & 0x2000000) != 0x0) {
                    if (n <= 470143489) {
                        return;
                    }
                    Login.Login_response0 = "";
                    Login.Login_response1 = Strings.jo;
                    Login.Login_response2 = Strings.jk;
                    Login.Login_response3 = Strings.jq;
                    class129.method763(1, (byte)23);
                    if (Client.Login_isUsernameRemembered && null != Login.Login_username) {
                        if (n <= 470143489) {
                            return;
                        }
                        if (Login.Login_username.length() > 0) {
                            Login.currentLoginField = 1153152795;
                            return;
                        }
                    }
                    Login.currentLoginField = 0;
                }
                else if ((-205173751 * Client.worldProperties & 0x4) != 0x0) {
                    if ((-205173751 * Client.worldProperties & 0x400) != 0x0) {
                        Login.Login_response1 = Strings.ji;
                        Login.Login_response2 = Strings.jg;
                        Login.Login_response3 = Strings.jx;
                    }
                    else {
                        Login.Login_response1 = Strings.ij;
                        Login.Login_response2 = Strings.id;
                        Login.Login_response3 = Strings.it;
                    }
                    Login.Login_response0 = Strings.im;
                    class129.method763(1, (byte)104);
                    if (Client.Login_isUsernameRemembered) {
                        if (n <= 470143489) {
                            return;
                        }
                        if (Login.Login_username != null && Login.Login_username.length() > 0) {
                            if (n <= 470143489) {
                                return;
                            }
                            Login.currentLoginField = 1153152795;
                            return;
                        }
                    }
                    Login.currentLoginField = 0;
                }
                else if ((Client.worldProperties * -205173751 & 0x400) != 0x0) {
                    Login.Login_response1 = Strings.ix;
                    Login.Login_response2 = Strings.ib;
                    Login.Login_response3 = Strings.jc;
                    Login.Login_response0 = Strings.im;
                    class129.method763(1, (byte)126);
                    if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
                        Login.currentLoginField = 1153152795;
                    }
                    else {
                        Login.currentLoginField = 0;
                    }
                }
                else {
                    class6.method20(false, 1620071571);
                }
            }
        }
        else if (Login.loginIndex * 1145608355 == 1) {
            while (class207.mt(keyHandlerInstance, 2023501727)) {
                if (546317845 * keyHandlerInstance.field1867 == 84) {
                    class6.method20(false, 1620071571);
                }
                else {
                    if (13 != 546317845 * keyHandlerInstance.field1867) {
                        continue;
                    }
                    class129.method763(0, (byte)29);
                }
            }
            final int n12 = class143.loginBoxCenter * 950254081 - 80;
            final int n13 = 321;
            if (n6 && n7 >= n12 - 75 && n7 <= 75 + n12 && n8 >= n13 - 20 && n8 <= n13 + 20) {
                class6.method20(false, 1620071571);
            }
            final int n14 = 950254081 * class143.loginBoxCenter + 80;
            if (n6 && n7 >= n14 - 75) {
                if (n <= 470143489) {
                    return;
                }
                if (n7 <= 75 + n14 && n8 >= n13 - 20 && n8 <= 20 + n13) {
                    class129.method763(0, (byte)91);
                }
            }
        }
        else if (2 == 1145608355 * Login.loginIndex) {
            int n15 = 201;
            n15 += 52;
            if (n6 && n8 >= n15 - 12 && n8 < 2 + n15) {
                if (n <= 470143489) {
                    return;
                }
                Login.currentLoginField = 0;
            }
            n15 += 15;
            if (n6 && n8 >= n15 - 12 && n8 < n15 + 2) {
                Login.currentLoginField = 1153152795;
            }
            n15 += 15;
            final int n16 = 361;
            if (null != class96.field1063) {
                final int n17 = class96.field1063.highX * 944313703 / 2;
                if (n6 && n7 >= class96.field1063.lowX * -844906645 - n17 && n7 <= -844906645 * class96.field1063.lowX + n17 && n8 >= n16 - 15) {
                    if (n <= 470143489) {
                        return;
                    }
                    if (n8 < n16) {
                        switch (-1733444455 * Login.field752) {
                            case 2: {
                                Ignored.compareTo_ignored("https://support.runescape.com/hc/en-gb", true, false, (byte)(-29));
                                break;
                            }
                            case 1: {
                                class205.method1137(Strings.lu, Strings.lk, Strings.lh, -146564225);
                                class129.method763(5, (byte)26);
                                return;
                            }
                        }
                    }
                }
            }
            final int n18 = class143.loginBoxCenter * 950254081 - 80;
            final int n19 = 321;
            if (n6 != 0) {
                if (n <= 470143489) {
                    return;
                }
                if (n7 >= n18 - 75 && n7 <= 75 + n18 && n8 >= n19 - 20 && n8 <= n19 + 20) {
                    Login.Login_username = Login.Login_username.trim();
                    Client.it(-1);
                    if (Login.Login_username.length() == 0) {
                        class205.method1137(Strings.em, Strings.ew, Strings.ex, 768397072);
                        return;
                    }
                    if (Login.Login_password.length() == 0) {
                        class205.method1137(Strings.eh, Strings.ek, Strings.ey, 1781152454);
                        return;
                    }
                    class205.method1137(Strings.jm, Strings.jn, Strings.jd, 276154620);
                    class14.method53(false, -1683073993);
                    class138.updateGameState(20, 2027900389);
                    return;
                }
            }
            final int n20 = 80 + (Login.loginBoxX * 678588245 + 180);
            if (n6 != 0) {
                if (n <= 470143489) {
                    return;
                }
                if (n7 >= n20 - 75 && n7 <= n20 + 75) {
                    if (n <= 470143489) {
                        return;
                    }
                    if (n8 >= n19 - 20) {
                        if (n <= 470143489) {
                            return;
                        }
                        if (n8 <= 20 + n19) {
                            class129.method763(0, (byte)12);
                            Login.Login_username = "";
                            Client.it(-1);
                            Login.Login_password = "";
                            class204.field1846 = 0;
                            Messages.otp = "";
                            Login.field751 = true;
                        }
                    }
                }
            }
            final int n21 = -117 + 950254081 * class143.loginBoxCenter;
            final int n22 = 277;
            boolean field730;
            if (n7 >= n21 && n7 < n21 + ChatChannel.field817 * 1381277089 && n8 >= n22 && n8 < FloorUnderlayDefinition.field1642 * -1649414567 + n22) {
                if (n <= 470143489) {
                    return;
                }
                field730 = true;
            }
            else {
                field730 = false;
            }
            Login.field730 = field730;
            if (n6 == 1 && Login.field730) {
                Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
                if (!Client.Login_isUsernameRemembered && class20.clientPreferences.getUsernameToRemember(-598675425) != null) {
                    if (n <= 470143489) {
                        return;
                    }
                    class20.clientPreferences.setUsernameToRemember((String)null, -472730554);
                }
            }
            final int n23 = 950254081 * class143.loginBoxCenter + 24;
            final int n24 = 277;
            boolean field731 = false;
            Label_2346: {
                if (n7 >= n23) {
                    if (n <= 470143489) {
                        return;
                    }
                    if (n7 < ChatChannel.field817 * 1381277089 + n23 && n8 >= n24 && n8 < n24 + FloorUnderlayDefinition.field1642 * -1649414567) {
                        field731 = true;
                        break Label_2346;
                    }
                }
                field731 = false;
            }
            Login.field740 = field731;
            Label_2476: {
                if (n6 != 0) {
                    if (n <= 470143489) {
                        return;
                    }
                    if (Login.field740) {
                        class20.clientPreferences.setIsUsernameHidden(!ClientPreferences.ty(class20.clientPreferences, -2084960938), -1926536328);
                        if (!ClientPreferences.ty(class20.clientPreferences, -2093990105)) {
                            Login.Login_username = "";
                            Client.it(-1);
                            class20.clientPreferences.setUsernameToRemember((String)null, -472730554);
                            if (Client.Login_isUsernameRemembered) {
                                if (n <= 470143489) {
                                    return;
                                }
                                if (null != Login.Login_username && Login.Login_username.length() > 0) {
                                    Login.currentLoginField = 1153152795;
                                    break Label_2476;
                                }
                            }
                            Login.currentLoginField = 0;
                        }
                    }
                }
            }
            while (class207.mt(keyHandlerInstance, 2044586247)) {
                if (546317845 * keyHandlerInstance.field1867 == 13) {
                    class129.method763(0, (byte)84);
                    Login.Login_username = "";
                    Client.it(-1);
                    Login.Login_password = "";
                    class204.field1846 = 0;
                    Messages.otp = "";
                    Login.field751 = true;
                }
                else if (-1232221421 * Login.currentLoginField == 0) {
                    final char field732 = keyHandlerInstance.field1866;
                    for (int i = 0; i < Login.dw.length(); ++i) {
                        if (n <= 470143489) {
                            return;
                        }
                        if (field732 == Login.dw.charAt(i)) {
                            break;
                        }
                    }
                    if (85 == 546317845 * keyHandlerInstance.field1867 && Login.Login_username.length() > 0) {
                        Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                        Client.it(-1);
                    }
                    if (84 == 546317845 * keyHandlerInstance.field1867 || 546317845 * keyHandlerInstance.field1867 == 80) {
                        Login.currentLoginField = 1153152795;
                    }
                    if (Login.dw.indexOf(keyHandlerInstance.field1866) == -1) {
                        continue;
                    }
                    if (n <= 470143489) {
                        return;
                    }
                    if (Login.Login_username.length() >= 320) {
                        continue;
                    }
                    if (n <= 470143489) {
                        return;
                    }
                    Login.Login_username += keyHandlerInstance.field1866;
                    Client.it(-1);
                }
                else {
                    if (Login.currentLoginField * -1232221421 != 1) {
                        continue;
                    }
                    if (keyHandlerInstance.field1867 * 546317845 == 85 && Login.Login_password.length() > 0) {
                        Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
                    }
                    else if (84 == 546317845 * keyHandlerInstance.field1867 || 80 == keyHandlerInstance.field1867 * 546317845) {
                        Login.currentLoginField = 0;
                        if (546317845 * keyHandlerInstance.field1867 == 84) {
                            Login.Login_username = Login.Login_username.trim();
                            Client.it(-1);
                            if (Login.Login_username.length() == 0) {
                                if (n <= 470143489) {
                                    return;
                                }
                                class205.method1137(Strings.em, Strings.ew, Strings.ex, 1675298225);
                                return;
                            }
                            else {
                                if (Login.Login_password.length() == 0) {
                                    class205.method1137(Strings.eh, Strings.ek, Strings.ey, -1045498386);
                                    return;
                                }
                                class205.method1137(Strings.jm, Strings.jn, Strings.jd, -1328424461);
                                class14.method53(false, -1913677463);
                                class138.updateGameState(20, 546969201);
                                return;
                            }
                        }
                    }
                    Label_3265: {
                        if (!keyHandlerInstance.getKeyPressed(82, -2050120872)) {
                            if (n <= 470143489) {
                                return;
                            }
                            if (!keyHandlerInstance.getKeyPressed(87, -1218327735)) {
                                break Label_3265;
                            }
                            if (n <= 470143489) {
                                return;
                            }
                        }
                        if (67 == keyHandlerInstance.field1867 * 546317845) {
                            final Transferable contents = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(ScriptFrame.client);
                            final int a = 20 - Login.Login_password.length();
                            if (a <= 0) {
                                continue;
                            }
                            try {
                                final String s = (String)contents.getTransferData(DataFlavor.stringFlavor);
                                final int min = Math.min(a, s.length());
                                for (int j = 0; j < min; ++j) {
                                    if (!MouseHandler.method195(s.charAt(j), -2111294595) || Login.dw.indexOf(s.charAt(j)) == -1) {
                                        class129.method763(3, (byte)88);
                                        return;
                                    }
                                }
                                Login.Login_password += s.substring(0, min);
                            }
                            catch (UnsupportedFlavorException ex) {}
                            catch (IOException ex2) {}
                            continue;
                        }
                    }
                    if (!MouseHandler.method195(keyHandlerInstance.field1866, 1983052490)) {
                        continue;
                    }
                    if (Login.dw.indexOf(keyHandlerInstance.field1866) == -1 || Login.Login_password.length() >= 20) {
                        continue;
                    }
                    Login.Login_password += keyHandlerInstance.field1866;
                }
            }
        }
        else if (1145608355 * Login.loginIndex == 3) {
            final Bounds av = font.av(25, Strings.kh.length() - 34, Strings.kh, 180 + Login.loginBoxX * 678588245, 241);
            if (n6 && av.method2232(n7, n8, 917820097)) {
                if (n <= 470143489) {
                    return;
                }
                Ignored.compareTo_ignored(Strings.ns, true, false, (byte)(-69));
            }
            final int n25 = 180 + Login.loginBoxX * 678588245;
            final int n26 = 276;
            if (n6 && n7 >= n25 - 75 && n7 <= n25 + 75 && n8 >= n26 - 20 && n8 <= 20 + n26) {
                Login.method444(false, -722826482);
            }
            final int n27 = 180 + Login.loginBoxX * 678588245;
            final int n28 = 326;
            if (n6 && n7 >= n27 - 75 && n7 <= 75 + n27 && n8 >= n28 - 20 && n8 <= 20 + n28) {
                class205.method1137(Strings.lu, Strings.lk, Strings.lh, 2047687466);
                class129.method763(5, (byte)77);
            }
        }
        else if (4 == 1145608355 * Login.loginIndex) {
            if (n <= 470143489) {
                return;
            }
            final int n29 = 180 + 678588245 * Login.loginBoxX - 80;
            final int n30 = 321;
            if (n6 && n7 >= n29 - 75 && n7 <= n29 + 75 && n8 >= n30 - 20) {
                if (n <= 470143489) {
                    return;
                }
                if (n8 <= 20 + n30) {
                    Messages.otp.trim();
                    if (Messages.otp.length() != 6) {
                        class205.method1137(Strings.br, Strings.bg, Strings.bu, 1248025620);
                        return;
                    }
                    class204.field1846 = Integer.parseInt(Messages.otp) * -209153533;
                    Messages.otp = "";
                    class14.method53(true, -153055855);
                    class205.method1137(Strings.jm, Strings.jn, Strings.jd, -1565303475);
                    class138.updateGameState(20, 2018553744);
                    return;
                }
            }
            if (n6 && n7 >= 678588245 * Login.loginBoxX + 180 - 9 && n7 <= Login.loginBoxX * 678588245 + 180 + 130 && n8 >= 263 && n8 <= 296) {
                if (n <= 470143489) {
                    return;
                }
                boolean field733;
                if (!Login.field751) {
                    if (n <= 470143489) {
                        return;
                    }
                    field733 = true;
                }
                else {
                    field733 = false;
                }
                Login.field751 = field733;
            }
            if (n6 && n7 >= Login.loginBoxX * 678588245 + 180 - 34 && n7 <= 180 + Login.loginBoxX * 678588245 + 34 && n8 >= 351 && n8 <= 363) {
                Ignored.compareTo_ignored(InvDefinition.method977("secure", true, -1213010247) + "m=totp-authenticator/disableTOTPRequest", true, false, (byte)(-90));
            }
            final int n31 = 80 + (180 + Login.loginBoxX * 678588245);
            if (n6 && n7 >= n31 - 75 && n7 <= 75 + n31 && n8 >= n30 - 20 && n8 <= n30 + 20) {
                class129.method763(0, (byte)4);
                Login.Login_username = "";
                Client.it(-1);
                Login.Login_password = "";
                class204.field1846 = 0;
                Messages.otp = "";
            }
            while (class207.mt(keyHandlerInstance, 927276767)) {
                if (n <= 470143489) {
                    return;
                }
                boolean b3 = false;
                for (int k = 0; k < Login.dc.length(); ++k) {
                    if (keyHandlerInstance.field1866 == Login.dc.charAt(k)) {
                        b3 = true;
                        break;
                    }
                }
                if (keyHandlerInstance.field1867 * 546317845 == 13) {
                    class129.method763(0, (byte)116);
                    Login.Login_username = "";
                    Client.it(-1);
                    Login.Login_password = "";
                    class204.field1846 = 0;
                    Messages.otp = "";
                }
                else {
                    if (85 == keyHandlerInstance.field1867 * 546317845 && Messages.otp.length() > 0) {
                        Messages.otp = Messages.otp.substring(0, Messages.otp.length() - 1);
                    }
                    if (keyHandlerInstance.field1867 * 546317845 == 84) {
                        Messages.otp.trim();
                        if (Messages.otp.length() != 6) {
                            class205.method1137(Strings.br, Strings.bg, Strings.bu, -978423873);
                            return;
                        }
                        class204.field1846 = Integer.parseInt(Messages.otp) * -209153533;
                        Messages.otp = "";
                        class14.method53(true, -1077158855);
                        class205.method1137(Strings.jm, Strings.jn, Strings.jd, 588216615);
                        class138.updateGameState(20, 1677526702);
                    }
                    else {
                        if (!b3 || Messages.otp.length() >= 6) {
                            continue;
                        }
                        Messages.otp += keyHandlerInstance.field1866;
                    }
                }
            }
        }
        else if (5 == Login.loginIndex * 1145608355) {
            final int n32 = 180 + Login.loginBoxX * 678588245 - 80;
            final int n33 = 321;
            if (n6 && n7 >= n32 - 75 && n7 <= 75 + n32 && n8 >= n33 - 20 && n8 <= n33 + 20) {
                Login.Login_username = Login.Login_username.trim();
                Client.it(-1);
                if (Login.Login_username.length() == 0) {
                    class205.method1137(Strings.lu, Strings.lk, Strings.lh, 722134294);
                }
                else {
                    final long method1531 = class264.method1531((byte)(-87));
                    int n34;
                    if (method1531 == 0L) {
                        n34 = 5;
                    }
                    else {
                        final String login_username = Login.Login_username;
                        final Random random = new Random();
                        final Buffer buffer = new Buffer(128);
                        final Buffer buffer2 = new Buffer(128);
                        final int[] array = { random.nextInt(), random.nextInt(), (int)(method1531 >> 32), (int)method1531 };
                        buffer.writeShort(10, (byte)34);
                        for (int l = 0; l < 4; ++l) {
                            if (n <= 470143489) {
                                return;
                            }
                            buffer.writeInt(random.nextInt(), -2081835031);
                        }
                        buffer.writeInt(array[0], -2081835031);
                        buffer.writeInt(array[1], -2081835031);
                        buffer.writeLong(method1531);
                        buffer.writeLong(0L);
                        for (int n35 = 0; n35 < 4; ++n35) {
                            buffer.writeInt(random.nextInt(), -2081835031);
                        }
                        buffer.encryptRsa(class68.field717, class68.field716, 1086371939);
                        buffer2.writeShort(10, (byte)12);
                        for (int n36 = 0; n36 < 3; ++n36) {
                            buffer2.writeInt(random.nextInt(), -2081835031);
                        }
                        buffer2.writeLong(random.nextLong());
                        Buffer.gj(buffer2, random.nextLong());
                        class383.method2086(buffer2, (byte)23);
                        buffer2.writeLong(random.nextLong());
                        buffer2.encryptRsa(class68.field717, class68.field716, 2141959936);
                        int stringCp1252NullTerminatedByteSize = DynamicObject.stringCp1252NullTerminatedByteSize(login_username, (byte)1);
                        if (stringCp1252NullTerminatedByteSize % 8 != 0) {
                            if (n <= 470143489) {
                                return;
                            }
                            stringCp1252NullTerminatedByteSize += 8 - stringCp1252NullTerminatedByteSize % 8;
                        }
                        final Buffer buffer3 = new Buffer(stringCp1252NullTerminatedByteSize);
                        buffer3.writeStringCp1252NullCircumfixed(login_username, -1772573081);
                        buffer3.offset = stringCp1252NullTerminatedByteSize * -1516355947;
                        buffer3.xteaEncryptAll(array, -794961409);
                        final Buffer buffer4 = new Buffer(buffer3.offset * -1633313603 + (-1633313603 * buffer2.offset + (buffer.offset * -1633313603 + 5)));
                        buffer4.writeShort(2, (byte)126);
                        buffer4.writeShort(buffer.offset * -1633313603, (byte)57);
                        buffer4.writeBytes(buffer.array, 0, -1633313603 * buffer.offset, (byte)9);
                        buffer4.writeShort(-1633313603 * buffer2.offset, (byte)50);
                        buffer4.writeBytes(buffer2.array, 0, buffer2.offset * -1633313603, (byte)36);
                        buffer4.writeVarInt(-1633313603 * buffer3.offset, (byte)(-81));
                        buffer4.writeBytes(buffer3.array, 0, -1633313603 * buffer3.offset, (byte)12);
                        final String rsOrdinal = WorldMapSectionType.rsOrdinal(buffer4.array, 248570740);
                        int n37;
                        try {
                            final URLConnection openConnection = new URL(InvDefinition.method977("services", false, 759571604) + "m=accountappeal/login.ws").openConnection();
                            openConnection.setDoInput(true);
                            openConnection.setDoOutput(true);
                            openConnection.setConnectTimeout(5000);
                            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
                            outputStreamWriter.write("data2=" + class397.method2119(rsOrdinal, 1798518611) + "&dest=" + class397.method2119("passwordchoice.ws", 2110174258));
                            outputStreamWriter.flush();
                            final InputStream inputStream = openConnection.getInputStream();
                            final Buffer buffer5 = new Buffer(new byte[1000]);
                            while (true) {
                                final int read = inputStream.read(buffer5.array, -1633313603 * buffer5.offset, 1000 - buffer5.offset * -1633313603);
                                if (read == -1) {
                                    outputStreamWriter.close();
                                    inputStream.close();
                                    final String s2 = new String(buffer5.array);
                                    if (s2.startsWith("OFFLINE")) {
                                        if (n <= 470143489) {
                                            return;
                                        }
                                        n37 = 4;
                                        break;
                                    }
                                    else {
                                        if (s2.startsWith("WRONG")) {
                                            n37 = 7;
                                            break;
                                        }
                                        if (s2.startsWith("RELOAD")) {
                                            if (n <= 470143489) {
                                                return;
                                            }
                                            n37 = 3;
                                            break;
                                        }
                                        else {
                                            if (s2.startsWith("Not permitted for social network accounts.")) {
                                                n37 = 6;
                                                break;
                                            }
                                            Buffer.vn(buffer5, array, 2136223901);
                                            while (-1633313603 * buffer5.offset > 0 && buffer5.array[buffer5.offset * -1633313603 - 1] == 0) {
                                                final Buffer buffer6 = buffer5;
                                                buffer6.offset += 1516355947;
                                            }
                                            final String s3 = new String(buffer5.array, 0, buffer5.offset * -1633313603);
                                            if (AttackOption.method619(s3, (byte)29)) {
                                                Ignored.compareTo_ignored(s3, true, false, (byte)34);
                                                n37 = 2;
                                            }
                                            else {
                                                n37 = 5;
                                            }
                                            break;
                                        }
                                    }
                                }
                                else {
                                    final Buffer buffer7 = buffer5;
                                    buffer7.offset += -1516355947 * read;
                                    if (buffer5.offset * -1633313603 >= 1000) {
                                        n37 = 5;
                                        break;
                                    }
                                    continue;
                                }
                            }
                        }
                        catch (Throwable t) {
                            t.printStackTrace();
                            n37 = 5;
                        }
                        n34 = n37;
                    }
                    switch (n34) {
                        case 7: {
                            class205.method1137(Strings.lw, Strings.lr, Strings.mt, 1308965248);
                            break;
                        }
                        case 5: {
                            class205.method1137(Strings.lj, Strings.ll, Strings.le, 1349757695);
                            break;
                        }
                        case 3: {
                            class205.method1137(Strings.ln, Strings.lt, Strings.lz, 997431790);
                            break;
                        }
                        case 2: {
                            class205.method1137(Strings.field3267, Strings.field3291, Strings.field3376, 419419764);
                            class129.method763(6, (byte)33);
                            break;
                        }
                        case 6: {
                            class205.method1137(Strings.lb, Strings.lx, Strings.lo, -1994258778);
                            break;
                        }
                        case 4: {
                            class205.method1137(Strings.lc, Strings.ld, Strings.lq, 123915991);
                            break;
                        }
                    }
                }
                return;
            }
            final int n38 = Login.loginBoxX * 678588245 + 180 + 80;
            if (n6 == 1) {
                if (n <= 470143489) {
                    return;
                }
                if (n7 >= n38 - 75 && n7 <= 75 + n38 && n8 >= n33 - 20 && n8 <= 20 + n33) {
                    class6.method20(true, 1620071571);
                }
            }
            final int n39 = 361;
            if (class19.field60 != null) {
                final int n40 = 944313703 * class19.field60.highX / 2;
                if (n6 != 0) {
                    if (n <= 470143489) {
                        return;
                    }
                    if (n7 >= class19.field60.lowX * -844906645 - n40 && n7 <= n40 + -844906645 * class19.field60.lowX) {
                        if (n <= 470143489) {
                            return;
                        }
                        if (n8 >= n39 - 15) {
                            if (n <= 470143489) {
                                return;
                            }
                            if (n8 < n39) {
                                Ignored.compareTo_ignored(InvDefinition.method977("secure", true, -924674997) + "m=weblogin/g=oldscape/cant_log_in", true, false, (byte)36);
                            }
                        }
                    }
                }
            }
            while (class207.mt(keyHandlerInstance, 482197532)) {
                boolean b4 = false;
                for (int index = 0; index < Login.dw.length(); ++index) {
                    if (keyHandlerInstance.field1866 == Login.dw.charAt(index)) {
                        b4 = true;
                        break;
                    }
                }
                if (546317845 * keyHandlerInstance.field1867 == 13) {
                    class6.method20(true, 1620071571);
                }
                else {
                    if (85 == 546317845 * keyHandlerInstance.field1867 && Login.Login_username.length() > 0) {
                        if (n <= 470143489) {
                            return;
                        }
                        Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                        Client.it(-1);
                    }
                    if (546317845 * keyHandlerInstance.field1867 == 84) {
                        if (n <= 470143489) {
                            return;
                        }
                        Login.Login_username = Login.Login_username.trim();
                        Client.it(-1);
                        if (Login.Login_username.length() == 0) {
                            class205.method1137(Strings.lu, Strings.lk, Strings.lh, 1359849800);
                        }
                        else {
                            final long method1532 = class264.method1531((byte)(-50));
                            int n41;
                            if (method1532 == 0L) {
                                if (n <= 470143489) {
                                    return;
                                }
                                n41 = 5;
                            }
                            else {
                                final String login_username2 = Login.Login_username;
                                final Random random2 = new Random();
                                final Buffer buffer8 = new Buffer(128);
                                final Buffer buffer9 = new Buffer(128);
                                final int[] array2 = { random2.nextInt(), random2.nextInt(), (int)(method1532 >> 32), (int)method1532 };
                                buffer8.writeShort(10, (byte)89);
                                for (int n42 = 0; n42 < 4; ++n42) {
                                    buffer8.writeInt(random2.nextInt(), -2081835031);
                                }
                                buffer8.writeInt(array2[0], -2081835031);
                                buffer8.writeInt(array2[1], -2081835031);
                                buffer8.writeLong(method1532);
                                buffer8.writeLong(0L);
                                for (int n43 = 0; n43 < 4; ++n43) {
                                    buffer8.writeInt(random2.nextInt(), -2081835031);
                                }
                                buffer8.encryptRsa(class68.field717, class68.field716, 1415011410);
                                buffer9.writeShort(10, (byte)93);
                                for (int n44 = 0; n44 < 3; ++n44) {
                                    if (n <= 470143489) {
                                        return;
                                    }
                                    buffer9.writeInt(random2.nextInt(), -2081835031);
                                }
                                buffer9.writeLong(random2.nextLong());
                                Buffer.gj(buffer9, random2.nextLong());
                                class383.method2086(buffer9, (byte)59);
                                buffer9.writeLong(random2.nextLong());
                                buffer9.encryptRsa(class68.field717, class68.field716, 288155835);
                                int stringCp1252NullTerminatedByteSize2 = DynamicObject.stringCp1252NullTerminatedByteSize(login_username2, (byte)(-31));
                                if (0 != stringCp1252NullTerminatedByteSize2 % 8) {
                                    if (n <= 470143489) {
                                        return;
                                    }
                                    stringCp1252NullTerminatedByteSize2 += 8 - stringCp1252NullTerminatedByteSize2 % 8;
                                }
                                final Buffer buffer10 = new Buffer(stringCp1252NullTerminatedByteSize2);
                                buffer10.writeStringCp1252NullCircumfixed(login_username2, -1762977062);
                                buffer10.offset = stringCp1252NullTerminatedByteSize2 * -1516355947;
                                buffer10.xteaEncryptAll(array2, -794961409);
                                final Buffer buffer11 = new Buffer(5 + buffer8.offset * -1633313603 + -1633313603 * buffer9.offset + -1633313603 * buffer10.offset);
                                buffer11.writeShort(2, (byte)40);
                                buffer11.writeShort(-1633313603 * buffer8.offset, (byte)63);
                                buffer11.writeBytes(buffer8.array, 0, buffer8.offset * -1633313603, (byte)30);
                                buffer11.writeShort(buffer9.offset * -1633313603, (byte)82);
                                buffer11.writeBytes(buffer9.array, 0, buffer9.offset * -1633313603, (byte)39);
                                buffer11.writeVarInt(buffer10.offset * -1633313603, (byte)(-62));
                                buffer11.writeBytes(buffer10.array, 0, buffer10.offset * -1633313603, (byte)116);
                                final String rsOrdinal2 = WorldMapSectionType.rsOrdinal(buffer11.array, -668340515);
                                int n45;
                                try {
                                    final URLConnection openConnection2 = new URL(InvDefinition.method977("services", false, -780712494) + "m=accountappeal/login.ws").openConnection();
                                    openConnection2.setDoInput(true);
                                    openConnection2.setDoOutput(true);
                                    openConnection2.setConnectTimeout(5000);
                                    final OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(openConnection2.getOutputStream());
                                    outputStreamWriter2.write("data2=" + class397.method2119(rsOrdinal2, 1796508444) + "&dest=" + class397.method2119("passwordchoice.ws", 1761854811));
                                    outputStreamWriter2.flush();
                                    final InputStream inputStream2 = openConnection2.getInputStream();
                                    final Buffer buffer12 = new Buffer(new byte[1000]);
                                    while (true) {
                                        final int read2 = inputStream2.read(buffer12.array, buffer12.offset * -1633313603, 1000 - buffer12.offset * -1633313603);
                                        if (read2 == -1) {
                                            outputStreamWriter2.close();
                                            inputStream2.close();
                                            final String s4 = new String(buffer12.array);
                                            if (s4.startsWith("OFFLINE")) {
                                                n45 = 4;
                                                break;
                                            }
                                            if (s4.startsWith("WRONG")) {
                                                if (n <= 470143489) {
                                                    return;
                                                }
                                                n45 = 7;
                                                break;
                                            }
                                            else {
                                                if (s4.startsWith("RELOAD")) {
                                                    n45 = 3;
                                                    break;
                                                }
                                                if (!s4.startsWith("Not permitted for social network accounts.")) {
                                                    Buffer.vn(buffer12, array2, 1836270491);
                                                    while (buffer12.offset * -1633313603 > 0) {
                                                        if (n <= 470143489) {
                                                            return;
                                                        }
                                                        if (0 != buffer12.array[buffer12.offset * -1633313603 - 1]) {
                                                            break;
                                                        }
                                                        final Buffer buffer13 = buffer12;
                                                        buffer13.offset += 1516355947;
                                                    }
                                                    final String s5 = new String(buffer12.array, 0, buffer12.offset * -1633313603);
                                                    if (AttackOption.method619(s5, (byte)(-35))) {
                                                        Ignored.compareTo_ignored(s5, true, false, (byte)7);
                                                        n45 = 2;
                                                    }
                                                    else {
                                                        n45 = 5;
                                                    }
                                                    break;
                                                }
                                                if (n <= 470143489) {
                                                    return;
                                                }
                                                n45 = 6;
                                                break;
                                            }
                                        }
                                        else {
                                            final Buffer buffer14 = buffer12;
                                            buffer14.offset += -1516355947 * read2;
                                            if (buffer12.offset * -1633313603 >= 1000) {
                                                n45 = 5;
                                                break;
                                            }
                                            continue;
                                        }
                                    }
                                }
                                catch (Throwable t2) {
                                    t2.printStackTrace();
                                    n45 = 5;
                                }
                                n41 = n45;
                            }
                            switch (n41) {
                                case 6: {
                                    class205.method1137(Strings.lb, Strings.lx, Strings.lo, 1453387582);
                                    break;
                                }
                                case 3: {
                                    class205.method1137(Strings.ln, Strings.lt, Strings.lz, 399291060);
                                    break;
                                }
                                case 4: {
                                    class205.method1137(Strings.lc, Strings.ld, Strings.lq, -1884623678);
                                    break;
                                }
                                case 2: {
                                    class205.method1137(Strings.field3267, Strings.field3291, Strings.field3376, -649432621);
                                    class129.method763(6, (byte)90);
                                    break;
                                }
                                case 5: {
                                    class205.method1137(Strings.lj, Strings.ll, Strings.le, -379104814);
                                    break;
                                }
                                case 7: {
                                    class205.method1137(Strings.lw, Strings.lr, Strings.mt, 1232865133);
                                    break;
                                }
                            }
                        }
                    }
                    else {
                        if (!b4) {
                            continue;
                        }
                        if (n <= 470143489) {
                            return;
                        }
                        if (Login.Login_username.length() >= 320) {
                            continue;
                        }
                        Login.Login_username += keyHandlerInstance.field1866;
                        Client.it(-1);
                    }
                }
            }
        }
        else if (1145608355 * Login.loginIndex == 6) {
            while (class207.mt(keyHandlerInstance, 1110121216)) {
                if (84 == 546317845 * keyHandlerInstance.field1867 || 546317845 * keyHandlerInstance.field1867 == 13) {
                    class6.method20(true, 1620071571);
                }
            }
            final int n46 = 321;
            if (n6 != 0) {
                if (n <= 470143489) {
                    return;
                }
                if (n8 >= n46 - 20 && n8 <= 20 + n46) {
                    class6.method20(true, 1620071571);
                }
            }
        }
        else if (Login.loginIndex * 1145608355 == 7) {
            if (WorldMapSectionType.field2384 && !Client.onMobile) {
                final int n47 = class143.loginBoxCenter * 950254081 - 150;
                final int n48 = 40 + (n47 + 240 + 25);
                final int n49 = 231;
                final int n50 = 40 + n49;
                Label_7891: {
                    if (n6 && n7 >= n47 && n7 <= n48) {
                        if (n <= 470143489) {
                            return;
                        }
                        if (n8 >= n49) {
                            if (n <= 470143489) {
                                return;
                            }
                            if (n8 <= n50) {
                                int n51 = n47;
                                while (true) {
                                    for (int n52 = 0; n52 < 8; ++n52) {
                                        if (n <= 470143489) {
                                            return;
                                        }
                                        if (n7 <= n51 + 30) {
                                            final int n53 = n52;
                                            Login.field747 = n53 * 1670187551;
                                            break Label_7891;
                                        }
                                        n51 += 30;
                                        n51 += ((n52 == 1 || 3 == n52) ? 20 : 5);
                                    }
                                    final int n53 = 0;
                                    continue;
                                }
                            }
                        }
                    }
                }
                final int n54 = 678588245 * Login.loginBoxX + 180 - 80;
                final int n55 = 321;
                if (n6 && n7 >= n54 - 75) {
                    if (n <= 470143489) {
                        return;
                    }
                    if (n7 <= 75 + n54 && n8 >= n55 - 20 && n8 <= 20 + n55) {
                        if (n <= 470143489) {
                            return;
                        }
                        boolean b5 = false;
                        Label_8258: {
                            Date date = null;
                            Label_8133: {
                                try {
                                    final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                    simpleDateFormat.setLenient(false);
                                    final StringBuilder sb = new StringBuilder();
                                    final String[] field734 = Login.field748;
                                    while (true) {
                                        for (int n56 = 0; n56 < field734.length; ++n56) {
                                            final String str = field734[n56];
                                            if (str == null) {
                                                WorldMapRectangle.method1522("Date not valid.", "Please ensure all characters are populated.", "", 5766018);
                                                final Date parse = null;
                                                date = parse;
                                                break Label_8133;
                                            }
                                            sb.append(str);
                                        }
                                        sb.append("12");
                                        final Date parse = simpleDateFormat.parse(sb.toString());
                                        continue;
                                    }
                                }
                                catch (ParseException ex3) {
                                    WorldMapRectangle.method1522("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 965364135);
                                    b5 = false;
                                    break Label_8258;
                                }
                            }
                            if (date == null) {
                                if (n <= 470143489) {
                                    return;
                                }
                                b5 = false;
                            }
                            else {
                                final boolean method1533 = class81.method483(date, 1164059747);
                                if (!date.after(Varcs.clearTransient(2052817619))) {
                                    WorldMapRectangle.method1522("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -742505913);
                                    b5 = false;
                                }
                                else {
                                    if (!method1533) {
                                        if (n <= 470143489) {
                                            return;
                                        }
                                        ByteArrayPool.field3668 = 1974420353;
                                    }
                                    else {
                                        ByteArrayPool.field3668 = (int)(date.getTime() / 86400000L - 11745L) * -909067137;
                                    }
                                    b5 = true;
                                }
                            }
                        }
                        if (b5) {
                            class138.updateGameState(50, 1831885711);
                            return;
                        }
                    }
                }
                final int n57 = 80 + (Login.loginBoxX * 678588245 + 180);
                if (n6 && n7 >= n57 - 75 && n7 <= n57 + 75 && n8 >= n55 - 20 && n8 <= n55 + 20) {
                    Login.field748 = new String[8];
                    class6.method20(true, 1620071571);
                }
                while (class207.mt(keyHandlerInstance, 1763615547)) {
                    if (101 == 546317845 * keyHandlerInstance.field1867) {
                        Login.field748[Login.field747 * -1262226977] = null;
                    }
                    if (546317845 * keyHandlerInstance.field1867 == 85) {
                        if (null == Login.field748[-1262226977 * Login.field747]) {
                            if (n <= 470143489) {
                                return;
                            }
                            if (-1262226977 * Login.field747 > 0) {
                                Login.field747 -= 1670187551;
                            }
                        }
                        Login.field748[Login.field747 * -1262226977] = null;
                    }
                    if (keyHandlerInstance.field1866 >= '0') {
                        if (n <= 470143489) {
                            return;
                        }
                        if (keyHandlerInstance.field1866 <= '9') {
                            Login.field748[-1262226977 * Login.field747] = "" + keyHandlerInstance.field1866;
                            if (-1262226977 * Login.field747 < 7) {
                                Login.field747 += 1670187551;
                            }
                        }
                    }
                    if (546317845 * keyHandlerInstance.field1867 == 84) {
                        boolean b6 = false;
                        Label_8862: {
                            Date date2 = null;
                            Label_8732: {
                                try {
                                    final SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                    simpleDateFormat2.setLenient(false);
                                    final StringBuilder sb2 = new StringBuilder();
                                    final String[] field735 = Login.field748;
                                    while (true) {
                                        for (int n58 = 0; n58 < field735.length; ++n58) {
                                            final String str2 = field735[n58];
                                            if (str2 == null) {
                                                WorldMapRectangle.method1522("Date not valid.", "Please ensure all characters are populated.", "", -2050253005);
                                                final Date parse2 = null;
                                                date2 = parse2;
                                                break Label_8732;
                                            }
                                            sb2.append(str2);
                                        }
                                        sb2.append("12");
                                        final Date parse2 = simpleDateFormat2.parse(sb2.toString());
                                        continue;
                                    }
                                }
                                catch (ParseException ex4) {
                                    WorldMapRectangle.method1522("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -1927944409);
                                    b6 = false;
                                    break Label_8862;
                                }
                            }
                            if (date2 == null) {
                                if (n <= 470143489) {
                                    return;
                                }
                                b6 = false;
                            }
                            else {
                                final boolean method1534 = class81.method483(date2, 1718619538);
                                if (!date2.after(Varcs.clearTransient(2052817619))) {
                                    if (n <= 470143489) {
                                        return;
                                    }
                                    WorldMapRectangle.method1522("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -1102077499);
                                    b6 = false;
                                }
                                else {
                                    if (!method1534) {
                                        if (n <= 470143489) {
                                            return;
                                        }
                                        ByteArrayPool.field3668 = 1974420353;
                                    }
                                    else {
                                        ByteArrayPool.field3668 = (int)(date2.getTime() / 86400000L - 11745L) * -909067137;
                                    }
                                    b6 = true;
                                }
                            }
                        }
                        if (b6) {
                            class138.updateGameState(50, 1595584685);
                        }
                    }
                }
            }
            else {
                final int n59 = 678588245 * Login.loginBoxX + 180 - 80;
                final int n60 = 321;
                if (n6 && n7 >= n59 - 75 && n7 <= n59 + 75 && n8 >= n60 - 20 && n8 <= 20 + n60) {
                    if (n <= 470143489) {
                        return;
                    }
                    Ignored.compareTo_ignored(InvDefinition.method977("secure", true, -507060556) + "m=dob/set_dob.ws", true, false, (byte)49);
                    class205.method1137(Strings.ls, Strings.lf, Strings.li, -1881776508);
                    class129.method763(6, (byte)37);
                }
                else {
                    final int n61 = 80 + (Login.loginBoxX * 678588245 + 180);
                    if (n6 && n7 >= n61 - 75 && n7 <= n61 + 75 && n8 >= n60 - 20 && n8 <= n60 + 20) {
                        class6.method20(true, 1620071571);
                    }
                }
            }
        }
        else if (8 == 1145608355 * Login.loginIndex) {
            final int n62 = Login.loginBoxX * 678588245 + 180 - 80;
            final int n63 = 321;
            if (n6 == 1) {
                if (n <= 470143489) {
                    return;
                }
                if (n7 >= n62 - 75) {
                    if (n <= 470143489) {
                        return;
                    }
                    if (n7 <= n62 + 75 && n8 >= n63 - 20 && n8 <= n63 + 20) {
                        Ignored.compareTo_ignored("https://www.jagex.com/terms/privacy", true, false, (byte)20);
                        class205.method1137(Strings.ls, Strings.lf, Strings.li, -958757129);
                        class129.method763(6, (byte)14);
                        return;
                    }
                }
            }
            final int n64 = 80 + (Login.loginBoxX * 678588245 + 180);
            if (n6 && n7 >= n64 - 75 && n7 <= n64 + 75 && n8 >= n63 - 20 && n8 <= n63 + 20) {
                class6.method20(true, 1620071571);
            }
        }
        else if (9 == 1145608355 * Login.loginIndex) {
            final int n65 = 180 + 678588245 * Login.loginBoxX;
            final int n66 = 311;
            if (84 != keyHandlerInstance.field1867 * 546317845 && keyHandlerInstance.field1867 * 546317845 != 13) {
                if (n <= 470143489) {
                    return;
                }
                if (n6 == 0) {
                    return;
                }
                if (n <= 470143489) {
                    return;
                }
                if (n7 < n65 - 75 || n7 > 75 + n65 || n8 < n66 - 20) {
                    return;
                }
                if (n <= 470143489) {
                    return;
                }
                if (n8 > n66 + 20) {
                    return;
                }
            }
            Login.method444(false, -1009088416);
        }
        else if (10 == Login.loginIndex * 1145608355) {
            final int n67 = Login.loginBoxX * 678588245 + 180;
            final int n68 = 209;
            if (546317845 * keyHandlerInstance.field1867 == 84 || (n6 && n7 >= n67 - 109 && n7 <= 109 + n67 && n8 >= n68 && n8 <= n68 + 68)) {
                class205.method1137(Strings.jm, Strings.jn, Strings.jd, 1802608095);
                Client.field395 = class493.field4094;
                class14.method53(false, -866931312);
                class138.updateGameState(20, 955343689);
            }
        }
        else if (1145608355 * Login.loginIndex == 12) {
            final int n69 = class143.loginBoxCenter * 950254081;
            int n70 = 233;
            final Bounds av2 = font2.av(0, 30, Strings.ma, n69, n70);
            final Bounds av3 = font2.av(32, 32, Strings.ma, n69, n70);
            final Bounds av4 = font2.av(70, 34, Strings.ma, n69, n70);
            n70 += 17;
            final Bounds av5 = font2.av(0, 34, Strings.mp, n69, n70);
            if (n6 != 0) {
                if (n <= 470143489) {
                    return;
                }
                if (av2.method2232(n7, n8, 917820097)) {
                    Ignored.compareTo_ignored("https://www.jagex.com/terms", true, false, (byte)8);
                }
                else if (av3.method2232(n7, n8, 917820097)) {
                    Ignored.compareTo_ignored("https://www.jagex.com/terms/privacy", true, false, (byte)(-55));
                }
                else if (av4.method2232(n7, n8, 917820097) || av5.method2232(n7, n8, 917820097)) {
                    Ignored.compareTo_ignored("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false, (byte)7);
                }
            }
            final int n71 = class143.loginBoxCenter * 950254081 - 80;
            final int n72 = 311;
            if (n6 && n7 >= n71 - 75 && n7 <= n71 + 75 && n8 >= n72 - 20 && n8 <= n72 + 20) {
                if (n <= 470143489) {
                    return;
                }
                ClientPreferences.kw(class20.clientPreferences, Client.param21 * 976454555, -1008471336);
                Login.method444(true, -1938544859);
            }
            final int n73 = class143.loginBoxCenter * 950254081 + 80;
            if (n6 && n7 >= n73 - 75 && n7 <= 75 + n73) {
                if (n <= 470143489) {
                    return;
                }
                if (n8 >= n72 - 20 && n8 <= n72 + 20) {
                    Login.loginIndex = 127737743;
                }
            }
        }
        else if (1145608355 * Login.loginIndex == 13) {
            if (n <= 470143489) {
                return;
            }
            final int n74 = class143.loginBoxCenter * 950254081;
            final int n75 = 321;
            if (n6 && n7 >= n74 - 75 && n7 <= 75 + n74 && n8 >= n75 - 20 && n8 <= n75 + 20) {
                Login.method444(true, -1810987380);
            }
        }
        else if (1145608355 * Login.loginIndex == 14) {
            if (n <= 470143489) {
                return;
            }
            String s6 = "";
            switch (-1478945003 * Login.field738) {
                case 1: {
                    s6 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                }
                case 2: {
                    s6 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                }
                default: {
                    class6.method20(false, 1620071571);
                    break;
                }
                case 0: {
                    s6 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                }
            }
            final int n76 = 678588245 * Login.loginBoxX + 180;
            final int n77 = 276;
            if (n6 && n7 >= n76 - 75) {
                if (n <= 470143489) {
                    return;
                }
                if (n7 <= 75 + n76 && n8 >= n77 - 20 && n8 <= n77 + 20) {
                    Ignored.compareTo_ignored(s6, true, false, (byte)(-4));
                    class205.method1137(Strings.ls, Strings.lf, Strings.li, 443307107);
                    class129.method763(6, (byte)81);
                    return;
                }
            }
            final int n78 = Login.loginBoxX * 678588245 + 180;
            final int n79 = 326;
            if (n6 && n7 >= n78 - 75 && n7 <= n78 + 75 && n8 >= n79 - 20 && n8 <= n79 + 20) {
                class6.method20(false, 1620071571);
            }
        }
        else if (24 == Login.loginIndex * 1145608355) {
            final int n80 = Login.loginBoxX * 678588245 + 180;
            final int n81 = 301;
            if (n6 && n7 >= n80 - 75 && n7 <= n80 + 75 && n8 >= n81 - 20 && n8 <= n81 + 20) {
                Login.method444(false, -1103171427);
            }
        }
        else if (32 == Login.loginIndex * 1145608355) {
            final int n82 = 180 + 678588245 * Login.loginBoxX - 80;
            final int n83 = 321;
            if (n6 && n7 >= n82 - 75 && n7 <= n82 + 75 && n8 >= n83 - 20) {
                if (n <= 470143489) {
                    return;
                }
                if (n8 <= n83 + 20) {
                    Ignored.compareTo_ignored(InvDefinition.method977("secure", true, -345793959) + "m=dob/set_dob.ws", true, false, (byte)35);
                    class205.method1137(Strings.ls, Strings.lf, Strings.li, -1330806732);
                    class129.method763(6, (byte)73);
                    return;
                }
            }
            final int n84 = 80 + (180 + Login.loginBoxX * 678588245);
            if (n6 != 0) {
                if (n <= 470143489) {
                    return;
                }
                if (n7 >= n84 - 75 && n7 <= 75 + n84 && n8 >= n83 - 20 && n8 <= n83 + 20) {
                    if (n <= 470143489) {
                        return;
                    }
                    class6.method20(true, 1620071571);
                }
            }
        }
        else if (1145608355 * Login.loginIndex == 33) {
            if (n <= 470143489) {
                return;
            }
            final int n85 = 180 + Login.loginBoxX * 678588245;
            final int n86 = 276;
            if (n6 != 0) {
                if (n <= 470143489) {
                    return;
                }
                if (n7 >= n85 - 75 && n7 <= 75 + n85 && n8 >= n86 - 20) {
                    if (n <= 470143489) {
                        return;
                    }
                    if (n8 <= 20 + n86) {
                        if (n <= 470143489) {
                            return;
                        }
                        Ignored.compareTo_ignored(Strings.ns, true, false, (byte)(-108));
                    }
                }
            }
            final int n87 = 180 + 678588245 * Login.loginBoxX;
            final int n88 = 326;
            if (n6 && n7 >= n87 - 75 && n7 <= 75 + n87 && n8 >= n88 - 20) {
                if (n <= 470143489) {
                    return;
                }
                if (n8 <= n88 + 20) {
                    if (n <= 470143489) {
                        return;
                    }
                    class6.method20(true, 1620071571);
                }
            }
        }
    }
    
    public static void method1016(final AbstractArchive enumDefinition_archive) {
        EnumComposition.EnumDefinition_archive = enumDefinition_archive;
    }
    
    public static void aq(final AbstractArchive enumDefinition_archive) {
        EnumComposition.EnumDefinition_archive = enumDefinition_archive;
    }
    
    public String getStringValue(final int n) {
        final int[] keys = this.getKeys();
        if (keys == null) {
            return this.ux();
        }
        for (int i = 0; i < keys.length; ++i) {
            if (keys[i] == n) {
                return this.getStringVals()[i];
            }
        }
        return this.ux();
    }
    
    public int getIntValue(final int n) {
        final int[] keys = this.getKeys();
        if (keys == null) {
            return this.bi();
        }
        for (int i = 0; i < keys.length; ++i) {
            if (keys[i] == n) {
                return this.getIntVals()[i];
            }
        }
        return this.bi();
    }
    
    public String ux() {
        return this.defaultStr;
    }
    
    static final void processZoneOperation(final ZoneOperation zoneOperation, final int n) {
        try {
            final PacketBuffer packetBuffer = Client.packetWriter.packetBuffer;
            if (zoneOperation == ZoneOperation.field2565) {
                if (n != -302991134) {
                    throw new IllegalStateException();
                }
                final int ra = Buffer.ra(packetBuffer, (byte)7);
                final int ra2 = Buffer.ra(packetBuffer, (byte)7);
                final int n2 = (ra2 >> 4 & 0x7) + class9.field28 * 1555915261;
                final int n3 = (ra2 & 0x7) + -191732975 * FontName.field3968;
                final int n4 = packetBuffer.dq(-2070899692) * 4;
                final int or = Buffer.or(packetBuffer, -523126268);
                final int dq = packetBuffer.dq(-2070899692);
                final int cl = packetBuffer.cl(-433068567);
                final byte dj = packetBuffer.dj(-1101942994);
                final int n5 = packetBuffer.df(-2022163311) * 4;
                final int cl2 = packetBuffer.cl(702739463);
                final int dw = packetBuffer.dw((byte)3);
                final int n6 = packetBuffer.dx(-1987720551) + n2;
                final int n7 = dj + n3;
                if (n2 >= 0 && n3 >= 0) {
                    if (n != -302991134) {
                        throw new IllegalStateException();
                    }
                    if (n2 < 104) {
                        if (n != -302991134) {
                            return;
                        }
                        if (n3 < 104) {
                            if (n != -302991134) {
                                throw new IllegalStateException();
                            }
                            if (n6 >= 0) {
                                if (n != -302991134) {
                                    throw new IllegalStateException();
                                }
                                if (n7 >= 0) {
                                    if (n != -302991134) {
                                        throw new IllegalStateException();
                                    }
                                    if (n6 < 104 && n7 < 104) {
                                        if (n != -302991134) {
                                            return;
                                        }
                                        if (65535 != or) {
                                            if (n != -302991134) {
                                                throw new IllegalStateException();
                                            }
                                            final int n8 = n2 * 128 + 64;
                                            final int n9 = 64 + n3 * 128;
                                            final int n10 = 64 + n6 * 128;
                                            final int n11 = 128 * n7 + 64;
                                            final Projectile projectile = new Projectile(or, -1727408401 * GameEngine.Client_plane, n8, n9, class147.getTileHeight(n8, n9, GameEngine.Client_plane * -1727408401, (byte)(-10)) - n5, Client.cycle * -1886224337 + cl, cl2 + -1886224337 * Client.cycle, ra, dq, dw, n4);
                                            projectile.setDestination(n10, n11, class147.getTileHeight(n10, n11, -1727408401 * GameEngine.Client_plane, (byte)(-56)) - n4, Client.cycle * -1886224337 + cl, -335674854);
                                            Client.projectiles.addFirst(projectile);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else {
                if (zoneOperation == ZoneOperation.field2563) {
                    if (n != -302991134) {
                        return;
                    }
                    final int cl3 = packetBuffer.cl(-812305488);
                    int dx = packetBuffer.dx(-1819338821);
                    int writeByteNeg = Buffer.writeByteNeg(packetBuffer, -270768016);
                    final int eq = packetBuffer.eq((byte)(-100));
                    final int n12 = (eq >> 4 & 0x7) + 1555915261 * class9.field28;
                    final int n13 = -191732975 * FontName.field3968 + (eq & 0x7);
                    int wu = Buffer.wu(packetBuffer, 435772489);
                    final int cl4 = packetBuffer.cl(-1498015623);
                    int writeByteNeg2 = Buffer.writeByteNeg(packetBuffer, 1186450642);
                    final int ra3 = Buffer.ra(packetBuffer, (byte)7);
                    final int n14 = ra3 >> 2;
                    final int n15 = ra3 & 0x3;
                    final int n16 = Client.field431[n14];
                    final int or2 = Buffer.or(packetBuffer, -523126268);
                    final int zc = Buffer.zc(packetBuffer, -1829147082);
                    Player localPlayer;
                    if (cl3 == -549033243 * Client.localPlayerIndex) {
                        if (n != -302991134) {
                            throw new IllegalStateException();
                        }
                        localPlayer = MusicPatchNode.localPlayer;
                    }
                    else {
                        localPlayer = Client.players[cl3];
                    }
                    if (null != localPlayer) {
                        if (n != -302991134) {
                            return;
                        }
                        final ObjectComposition vmethod3248 = class144.vmethod3248(zc, (short)32332);
                        int n17 = 0;
                        int n18 = 0;
                        Label_0860: {
                            if (n15 == 0) {
                                if (n != -302991134) {
                                    throw new IllegalStateException();
                                }
                                if (n15 != 3) {
                                    n17 = -1339930361 * vmethod3248.sizeX;
                                    n18 = vmethod3248.sizeY * -1659393955;
                                    break Label_0860;
                                }
                                if (n != -302991134) {
                                    throw new IllegalStateException();
                                }
                            }
                            n17 = -1659393955 * vmethod3248.sizeY;
                            n18 = vmethod3248.sizeX * -1339930361;
                        }
                        final int n19 = n12 + (n17 >> 1);
                        final int n20 = n12 + (n17 + 1 >> 1);
                        final int n21 = (n18 >> 1) + n13;
                        final int n22 = (1 + n18 >> 1) + n13;
                        final int[][] array = Tiles.Tiles_heights[GameEngine.Client_plane * -1727408401];
                        final int n23 = array[n19][n22] + (array[n20][n21] + array[n19][n21]) + array[n20][n22] >> 2;
                        final Model model = vmethod3248.getModel(n14, n15, array, (n12 << 7) + (n17 << 6), n23, (n18 << 6) + (n13 << 7), (byte)(-58));
                        if (model != null) {
                            if (n != -302991134) {
                                return;
                            }
                            class33.updatePendingSpawn(GameEngine.Client_plane * -1727408401, n12, n13, n16, -1, 0, 0, 31, cl4 + 1, 1 + or2, 87894197);
                            localPlayer.animationCycleStart = (Client.cycle * -1886224337 + cl4) * -746690647;
                            localPlayer.animationCycleEnd = -377301053 * (or2 + Client.cycle * -1886224337);
                            localPlayer.attachedModel = model;
                            localPlayer.field899 = n12 * -494827904 + -247413952 * n17;
                            localPlayer.field903 = n13 * -856229504 + n18 * -428114752;
                            localPlayer.baseTileHeight = n23 * 1514773119;
                            if (wu > writeByteNeg2) {
                                if (n != -302991134) {
                                    throw new IllegalStateException();
                                }
                                final int n24 = wu;
                                wu = writeByteNeg2;
                                writeByteNeg2 = n24;
                            }
                            if (dx > writeByteNeg) {
                                final int n25 = dx;
                                dx = writeByteNeg;
                                writeByteNeg = n25;
                            }
                            localPlayer.minX = (n12 + wu) * -890592649;
                            localPlayer.maxX = 1649066605 * (n12 + writeByteNeg2);
                            localPlayer.minY = -751305383 * (n13 + dx);
                            localPlayer.maxY = (writeByteNeg + n13) * 105031851;
                        }
                    }
                }
                if (zoneOperation == ZoneOperation.field2562) {
                    if (n != -302991134) {
                        throw new IllegalStateException();
                    }
                    final int dq2 = packetBuffer.dq(-2070899692);
                    final int n26 = (dq2 >> 4 & 0x7) + 1555915261 * class9.field28;
                    final int n27 = (dq2 & 0x7) + -191732975 * FontName.field3968;
                    final int cx = packetBuffer.cx(-1783503877);
                    final int zc2 = Buffer.zc(packetBuffer, -700158791);
                    final int cx2 = packetBuffer.cx(-1832135287);
                    if (n26 >= 0 && n27 >= 0) {
                        if (n != -302991134) {
                            throw new IllegalStateException();
                        }
                        if (n26 < 104) {
                            if (n != -302991134) {
                                throw new IllegalStateException();
                            }
                            if (n27 < 104) {
                                if (n != -302991134) {
                                    throw new IllegalStateException();
                                }
                                final NodeDeque nodeDeque = Client.groundItems[-1727408401 * GameEngine.Client_plane][n26][n27];
                                if (nodeDeque != null) {
                                    if (n != -302991134) {
                                        return;
                                    }
                                    TileItem tileItem = (TileItem)nodeDeque.last();
                                    while (tileItem != null) {
                                        if (n != -302991134) {
                                            return;
                                        }
                                        if ((zc2 & 0x7FFF) == 176307405 * tileItem.id && cx2 == -1745152527 * tileItem.quantity) {
                                            if (n != -302991134) {
                                                throw new IllegalStateException();
                                            }
                                            final TileItem tileItem2 = tileItem;
                                            final int quantity = cx * -1785382127;
                                            tileItem.iu(quantity * -1745152527);
                                            tileItem2.quantity = quantity;
                                            break;
                                        }
                                        else {
                                            tileItem = (TileItem)nodeDeque.previous();
                                        }
                                    }
                                    class121.updateItemPile(n26, n27, 2124147832);
                                }
                            }
                        }
                    }
                }
                else if (ZoneOperation.field2570 == zoneOperation) {
                    if (n != -302991134) {
                        return;
                    }
                    packetBuffer.eq((byte)(-7));
                    final int en = packetBuffer.en(383378593);
                    final int eq2 = packetBuffer.eq((byte)(-83));
                    final int ra4 = Buffer.ra(packetBuffer, (byte)7);
                    final int n28 = 1555915261 * class9.field28 + (ra4 >> 4 & 0x7);
                    final int n29 = FontName.field3968 * -191732975 + (ra4 & 0x7);
                    final int or3 = Buffer.or(packetBuffer, -523126268);
                    packetBuffer.da(1987255744);
                    Buffer.or(packetBuffer, -523126268);
                    packetBuffer.df(-2002150366);
                    if (n28 >= 0) {
                        if (n != -302991134) {
                            throw new IllegalStateException();
                        }
                        if (n29 >= 0) {
                            if (n != -302991134) {
                                throw new IllegalStateException();
                            }
                            if (n28 < 104) {
                                if (n != -302991134) {
                                    return;
                                }
                                if (n29 < 104) {
                                    if (n != -302991134) {
                                        throw new IllegalStateException();
                                    }
                                    final TileItem tileItem3 = new TileItem();
                                    tileItem3.id = or3 * -968355835;
                                    final TileItem tileItem4 = tileItem3;
                                    final int quantity2 = en * -1785382127;
                                    tileItem3.iu(quantity2 * -1745152527);
                                    tileItem4.quantity = quantity2;
                                    TileItem.mq(tileItem3, eq2, (byte)77);
                                    if (Client.groundItems[GameEngine.Client_plane * -1727408401][n28][n29] == null) {
                                        Client.groundItems[GameEngine.Client_plane * -1727408401][n28][n29] = new NodeDeque();
                                    }
                                    Client.groundItems[GameEngine.Client_plane * -1727408401][n28][n29].addFirst(tileItem3);
                                    class121.updateItemPile(n28, n29, 2097659653);
                                }
                            }
                        }
                    }
                }
                else if (zoneOperation == ZoneOperation.field2567) {
                    if (n != -302991134) {
                        return;
                    }
                    final int ra5 = Buffer.ra(packetBuffer, (byte)7);
                    final int dq3 = packetBuffer.dq(-2070899692);
                    final int n30 = 1555915261 * class9.field28 + (dq3 >> 4 & 0x7);
                    final int n31 = (dq3 & 0x7) + -191732975 * FontName.field3968;
                    final int df = packetBuffer.df(-2056802803);
                    final int n32 = df >> 2;
                    final int n33 = df & 0x3;
                    final int n34 = Client.field431[n32];
                    final int da = packetBuffer.da(1870761121);
                    if (n30 >= 0) {
                        if (n != -302991134) {
                            throw new IllegalStateException();
                        }
                        if (n31 >= 0) {
                            if (n != -302991134) {
                                throw new IllegalStateException();
                            }
                            if (n30 < 104) {
                                if (n != -302991134) {
                                    throw new IllegalStateException();
                                }
                                if (n31 < 104) {
                                    if (n != -302991134) {
                                        throw new IllegalStateException();
                                    }
                                    class33.updatePendingSpawn(-1727408401 * GameEngine.Client_plane, n30, n31, n34, da, n32, n33, ra5, 0, -1, 87894197);
                                }
                            }
                        }
                    }
                }
                else if (ZoneOperation.field2569 == zoneOperation) {
                    if (n != -302991134) {
                        return;
                    }
                    final int df2 = packetBuffer.df(-2140950608);
                    final int n35 = (df2 >> 4 & 0x7) + class9.field28 * 1555915261;
                    final int n36 = (df2 & 0x7) + FontName.field3968 * -191732975;
                    final int da2 = packetBuffer.da(2095246000);
                    final int vl = Buffer.vl(packetBuffer, 363073604);
                    if (n35 >= 0) {
                        if (n != -302991134) {
                            throw new IllegalStateException();
                        }
                        if (n36 >= 0 && n35 < 104) {
                            if (n != -302991134) {
                                return;
                            }
                            if (n36 < 104) {
                                if (n != -302991134) {
                                    throw new IllegalStateException();
                                }
                                final NodeDeque nodeDeque2 = Client.groundItems[-1727408401 * GameEngine.Client_plane][n35][n36];
                                if (null != nodeDeque2) {
                                    for (TileItem tileItem5 = (TileItem)nodeDeque2.last(); null != tileItem5; tileItem5 = (TileItem)nodeDeque2.previous()) {
                                        if (n != -302991134) {
                                            throw new IllegalStateException();
                                        }
                                        if ((da2 & 0x7FFF) == 176307405 * tileItem5.id) {
                                            if (n != -302991134) {
                                                throw new IllegalStateException();
                                            }
                                            if (-1745152527 * tileItem5.quantity == vl) {
                                                if (n != -302991134) {
                                                    throw new IllegalStateException();
                                                }
                                                tileItem5.hw();
                                                break;
                                            }
                                        }
                                    }
                                    if (nodeDeque2.last() == null) {
                                        if (n != -302991134) {
                                            throw new IllegalStateException();
                                        }
                                        Client.groundItems[GameEngine.Client_plane * -1727408401][n35][n36] = null;
                                    }
                                    class121.updateItemPile(n35, n36, 1980985022);
                                }
                            }
                        }
                    }
                }
                else {
                    if (ZoneOperation.field2572 == zoneOperation) {
                        final int zc3 = Buffer.zc(packetBuffer, 518490290);
                        final int df3 = packetBuffer.df(-1993215311);
                        final int n37 = df3 >> 4 & 0xF;
                        final int n38 = df3 & 0x7;
                        final int eq3 = packetBuffer.eq((byte)(-76));
                        final int n39 = 1555915261 * class9.field28 + (eq3 >> 4 & 0x7);
                        final int n40 = (eq3 & 0x7) + -191732975 * FontName.field3968;
                        final int dq4 = packetBuffer.dq(-2070899692);
                        if (n39 >= 0) {
                            if (n != -302991134) {
                                throw new IllegalStateException();
                            }
                            if (n40 >= 0) {
                                if (n != -302991134) {
                                    throw new IllegalStateException();
                                }
                                if (n39 < 104) {
                                    if (n != -302991134) {
                                        throw new IllegalStateException();
                                    }
                                    if (n40 < 104) {
                                        if (n != -302991134) {
                                            throw new IllegalStateException();
                                        }
                                        final int n41 = n37 + 1;
                                        if (MusicPatchNode.localPlayer.cf[0] >= n39 - n41) {
                                            if (n != -302991134) {
                                                throw new IllegalStateException();
                                            }
                                            if (MusicPatchNode.localPlayer.cf[0] <= n41 + n39 && MusicPatchNode.localPlayer.dy[0] >= n40 - n41) {
                                                if (n != -302991134) {
                                                    throw new IllegalStateException();
                                                }
                                                if (MusicPatchNode.localPlayer.dy[0] <= n40 + n41) {
                                                    if (n != -302991134) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (class20.clientPreferences.method573(-1668406882) != 0) {
                                                        if (n != -302991134) {
                                                            return;
                                                        }
                                                        if (n38 > 0) {
                                                            if (n != -302991134) {
                                                                throw new IllegalStateException();
                                                            }
                                                            if (-297150195 * Client.soundEffectCount < 50) {
                                                                if (n != -302991134) {
                                                                    return;
                                                                }
                                                                Client.soundEffectIds[Client.soundEffectCount * -297150195] = zc3;
                                                                Client.queuedSoundEffectLoops[Client.soundEffectCount * -297150195] = n38;
                                                                Client.queuedSoundEffectDelays[-297150195 * Client.soundEffectCount] = dq4;
                                                                Client.soundEffects[Client.soundEffectCount * -297150195] = null;
                                                                Client.soundLocations[Client.soundEffectCount * -297150195] = (n40 << 8) + (n39 << 16) + n37;
                                                                Client.soundEffectCount += 831233477;
                                                                Client.ua(-1);
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
                    if (zoneOperation == ZoneOperation.field2568) {
                        if (n != -302991134) {
                            throw new IllegalStateException();
                        }
                        final int zc4 = Buffer.zc(packetBuffer, -415611439);
                        final int df4 = packetBuffer.df(-2014177229);
                        final int n42 = (df4 >> 4 & 0x7) + class9.field28 * 1555915261;
                        final int n43 = (df4 & 0x7) + FontName.field3968 * -191732975;
                        final int eq4 = packetBuffer.eq((byte)(-22));
                        if (n42 >= 0 && n43 >= 0 && n42 < 104 && n43 < 104) {
                            if (n != -302991134) {
                                throw new IllegalStateException();
                            }
                            final NodeDeque nodeDeque3 = Client.groundItems[GameEngine.Client_plane * -1727408401][n42][n43];
                            if (null != nodeDeque3) {
                                if (n != -302991134) {
                                    throw new IllegalStateException();
                                }
                                TileItem tileItem6 = (TileItem)nodeDeque3.last();
                                while (null != tileItem6) {
                                    if (n != -302991134) {
                                        throw new IllegalStateException();
                                    }
                                    if ((zc4 & 0x7FFF) == 176307405 * tileItem6.id) {
                                        if (n != -302991134) {
                                            return;
                                        }
                                        TileItem.mq(tileItem6, eq4, (byte)49);
                                        break;
                                    }
                                    else {
                                        tileItem6 = (TileItem)nodeDeque3.previous();
                                    }
                                }
                            }
                        }
                    }
                    else if (zoneOperation == ZoneOperation.field2564) {
                        if (n != -302991134) {
                            return;
                        }
                        final int ra6 = Buffer.ra(packetBuffer, (byte)7);
                        final int n44 = (ra6 >> 4 & 0x7) + class9.field28 * 1555915261;
                        final int n45 = (ra6 & 0x7) + FontName.field3968 * -191732975;
                        final int da3 = packetBuffer.da(896063284);
                        final int df5 = packetBuffer.df(-2006751425);
                        int n46 = df5 >> 2;
                        final int n47 = df5 & 0x3;
                        final int n48 = Client.field431[n46];
                        if (n44 >= 0 && n45 >= 0) {
                            if (n != -302991134) {
                                throw new IllegalStateException();
                            }
                            if (n44 < 103) {
                                if (n != -302991134) {
                                    return;
                                }
                                if (n45 < 103) {
                                    if (n != -302991134) {
                                        throw new IllegalStateException();
                                    }
                                    if (n48 == 0) {
                                        if (n != -302991134) {
                                            throw new IllegalStateException();
                                        }
                                        final BoundaryObject method1252 = class31.scene.method1252(GameEngine.Client_plane * -1727408401, n44, n45);
                                        if (method1252 != null) {
                                            final int entity_unpackID = InterfaceParent.Entity_unpackID(-4009183385476919801L * method1252.tag);
                                            if (2 == n46) {
                                                if (n != -302991134) {
                                                    return;
                                                }
                                                method1252.renderable1 = new DynamicObject(entity_unpackID, 2, n47 + 4, -1727408401 * GameEngine.Client_plane, n44, n45, da3, false, method1252.renderable1);
                                                method1252.renderable2 = new DynamicObject(entity_unpackID, 2, n47 + 1 & 0x3, -1727408401 * GameEngine.Client_plane, n44, n45, da3, false, method1252.renderable2);
                                            }
                                            else {
                                                method1252.renderable1 = new DynamicObject(entity_unpackID, n46, n47, GameEngine.Client_plane * -1727408401, n44, n45, da3, false, method1252.renderable1);
                                            }
                                            return;
                                        }
                                    }
                                    if (n48 != 0) {
                                        final WallDecoration method1253 = class31.scene.method1253(GameEngine.Client_plane * -1727408401, n44, n45);
                                        if (null != method1253) {
                                            if (n != -302991134) {
                                                throw new IllegalStateException();
                                            }
                                            final int entity_unpackID2 = InterfaceParent.Entity_unpackID(-4691380879163567243L * method1253.tag);
                                            if (4 != n46) {
                                                if (n != -302991134) {
                                                    throw new IllegalStateException();
                                                }
                                                if (n46 == 5) {
                                                    if (n != -302991134) {
                                                        return;
                                                    }
                                                }
                                                else if (6 == n46) {
                                                    if (n != -302991134) {
                                                        throw new IllegalStateException();
                                                    }
                                                    method1253.renderable1 = new DynamicObject(entity_unpackID2, 4, 4 + n47, -1727408401 * GameEngine.Client_plane, n44, n45, da3, false, method1253.renderable1);
                                                    return;
                                                }
                                                else if (7 == n46) {
                                                    if (n != -302991134) {
                                                        throw new IllegalStateException();
                                                    }
                                                    method1253.renderable1 = new DynamicObject(entity_unpackID2, 4, (2 + n47 & 0x3) + 4, GameEngine.Client_plane * -1727408401, n44, n45, da3, false, method1253.renderable1);
                                                    return;
                                                }
                                                else {
                                                    if (n46 != 8) {
                                                        return;
                                                    }
                                                    if (n != -302991134) {
                                                        throw new IllegalStateException();
                                                    }
                                                    method1253.renderable1 = new DynamicObject(entity_unpackID2, 4, 4 + n47, -1727408401 * GameEngine.Client_plane, n44, n45, da3, false, method1253.renderable1);
                                                    method1253.renderable2 = new DynamicObject(entity_unpackID2, 4, 4 + (2 + n47 & 0x3), -1727408401 * GameEngine.Client_plane, n44, n45, da3, false, method1253.renderable2);
                                                    return;
                                                }
                                            }
                                            method1253.renderable1 = new DynamicObject(entity_unpackID2, 4, n47, GameEngine.Client_plane * -1727408401, n44, n45, da3, false, method1253.renderable1);
                                            return;
                                        }
                                    }
                                    if (n48 == 2) {
                                        if (n != -302991134) {
                                            throw new IllegalStateException();
                                        }
                                        final GameObject gameObject = class31.scene.getGameObject(-1727408401 * GameEngine.Client_plane, n44, n45);
                                        if (11 == n46) {
                                            n46 = 10;
                                        }
                                        if (null != gameObject) {
                                            if (n != -302991134) {
                                                throw new IllegalStateException();
                                            }
                                            gameObject.renderable = new DynamicObject(InterfaceParent.Entity_unpackID(5016412888503339625L * gameObject.tag), n46, n47, GameEngine.Client_plane * -1727408401, n44, n45, da3, false, gameObject.renderable);
                                            return;
                                        }
                                    }
                                    if (n48 == 3) {
                                        if (n != -302991134) {
                                            throw new IllegalStateException();
                                        }
                                        final FloorDecoration floorDecoration = class31.scene.getFloorDecoration(-1727408401 * GameEngine.Client_plane, n44, n45);
                                        if (floorDecoration != null) {
                                            if (n != -302991134) {
                                                throw new IllegalStateException();
                                            }
                                            floorDecoration.renderable = new DynamicObject(InterfaceParent.Entity_unpackID(3423223696102332293L * floorDecoration.tag), 22, n47, -1727408401 * GameEngine.Client_plane, n44, n45, da3, false, floorDecoration.renderable);
                                            return;
                                        }
                                    }
                                    class186.method1009(-1727408401 * GameEngine.Client_plane, n44, n45, n48, da3, (byte)65);
                                }
                            }
                        }
                    }
                    else if (ZoneOperation.field2571 == zoneOperation) {
                        if (n != -302991134) {
                            throw new IllegalStateException();
                        }
                        final int eq5 = packetBuffer.eq((byte)(-78));
                        final int n49 = class9.field28 * 1555915261 + (eq5 >> 4 & 0x7);
                        final int n50 = FontName.field3968 * -191732975 + (eq5 & 0x7);
                        final int ra7 = Buffer.ra(packetBuffer, (byte)7);
                        final int n51 = ra7 >> 2;
                        final int n52 = ra7 & 0x3;
                        final int n53 = Client.field431[n51];
                        if (n49 >= 0) {
                            if (n != -302991134) {
                                throw new IllegalStateException();
                            }
                            if (n50 >= 0) {
                                if (n != -302991134) {
                                    throw new IllegalStateException();
                                }
                                if (n49 < 104) {
                                    if (n != -302991134) {
                                        throw new IllegalStateException();
                                    }
                                    if (n50 < 104) {
                                        if (n != -302991134) {
                                            throw new IllegalStateException();
                                        }
                                        class33.updatePendingSpawn(-1727408401 * GameEngine.Client_plane, n49, n50, n53, -1, n51, n52, 31, 0, -1, 87894197);
                                    }
                                }
                            }
                        }
                    }
                    else {
                        if (zoneOperation != ZoneOperation.field2566) {
                            return;
                        }
                        if (n != -302991134) {
                            throw new IllegalStateException();
                        }
                        final int df6 = packetBuffer.df(-2073730188);
                        final int cl5 = packetBuffer.cl(-1791051481);
                        final int dq5 = packetBuffer.dq(-2070899692);
                        final int n54 = (dq5 >> 4 & 0x7) + 1555915261 * class9.field28;
                        final int n55 = FontName.field3968 * -191732975 + (dq5 & 0x7);
                        final int da4 = packetBuffer.da(958654185);
                        if (n54 >= 0) {
                            if (n != -302991134) {
                                throw new IllegalStateException();
                            }
                            if (n55 >= 0) {
                                if (n != -302991134) {
                                    throw new IllegalStateException();
                                }
                                if (n54 < 104) {
                                    if (n != -302991134) {
                                        throw new IllegalStateException();
                                    }
                                    if (n55 < 104) {
                                        if (n != -302991134) {
                                            throw new IllegalStateException();
                                        }
                                        final int n56 = 128 * n54 + 64;
                                        final int n57 = 128 * n55 + 64;
                                        Client.graphicsObjects.addFirst(new GraphicsObject(da4, GameEngine.Client_plane * -1727408401, n56, n57, class147.getTileHeight(n56, n57, GameEngine.Client_plane * -1727408401, (byte)(-93)) - df6, cl5, -1886224337 * Client.cycle));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hx.jb(" + ')');
        }
    }
    
    public String[] getStringVals() {
        return this.strVals;
    }
    
    public int[] getIntVals() {
        return this.intVals;
    }
}
