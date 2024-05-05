// 
// Decompiled by Procyon v0.5.36
// 

public class class33
{
    static final int an = 2;
    static final int af = 1;
    static final int aw = 3;
    static final int au = 1;
    static final int ab = 0;
    int field97;
    int field98;
    static int oculusOrbFocalPointX;
    static final int bk = 37;
    
    class33(final int n, final int n2) {
        this.field97 = 426904267 * n;
        this.field98 = 1169393169 * n2;
    }
    
    public static boolean bb(final class33 class33, final class29 class34) {
        if (class33 == null) {
            class33.au(class34);
        }
        if (null == class34) {
            return false;
        }
        switch (-868178026 * class33.field97) {
            case 1: {
                return class34.vmethod3949(-375227126 * class33.field98, -1422039638);
            }
            default: {
                return false;
            }
            case 3: {
                return class34.vmethod3951((char)(890708583 * class33.field98), -758061156);
            }
            case 4: {
                return class34.vmethod3953(1 == class33.field98 * 234892017, (byte)(-19));
            }
            case 2: {
                return class34.vmethod3989(class33.field98 * -1817225041, 1312051339);
            }
        }
    }
    
    static int method147(final int n, final Script script, final boolean b, final int n2) {
        try {
            final Widget vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
            if (2800 == n) {
                if (n2 != -328074717) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class195.method1052(KeyHandler.getWidgetFlags(vmethod3380, 779779996), 1478297605);
                return 1;
            }
            else {
                if (n == 2801) {
                    int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                    --n3;
                    if (vmethod3380.actions != null) {
                        if (n2 != -328074717) {
                            throw new IllegalStateException();
                        }
                        if (n3 < vmethod3380.actions.length) {
                            if (null != vmethod3380.actions[n3]) {
                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3380.actions[n3];
                                return 1;
                            }
                        }
                    }
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                    return 1;
                }
                if (2802 == n) {
                    if (null == vmethod3380.field3004) {
                        if (n2 != -328074717) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                    }
                    else {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3380.field3004;
                    }
                    return 1;
                }
                return 2;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bz.az(" + ')');
        }
    }
    
    static final void method143(final int n) {
        try {
            VerticalAlignment.method1036(Strings.hj, -1544456411);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bz.ay(" + ')');
        }
    }
    
    public static String[] bv(final class12 class12) {
        if (class12 == null) {
            class12.bb();
        }
        return null;
    }
    
    static int method152(final int n, final Script script, final boolean b, final byte b2) {
        try {
            if (n < 1000) {
                if (b2 >= 0) {
                    throw new IllegalStateException();
                }
                return LoginScreenAnimation.method547(n, script, b, -1983594408);
            }
            else if (n < 1100) {
                if (b2 >= 0) {
                    throw new IllegalStateException();
                }
                return class131.method766(n, script, b, 1883190484);
            }
            else if (n < 1200) {
                if (b2 >= 0) {
                    throw new IllegalStateException();
                }
                return class31.method135(n, script, b, (byte)14);
            }
            else {
                if (n < 1300) {
                    return Varcs.clearTransient(n, script, b, 2095977299);
                }
                if (n < 1400) {
                    if (b2 >= 0) {
                        throw new IllegalStateException();
                    }
                    return StructComposition.method1070(n, script, b, -1159908779);
                }
                else {
                    if (n < 1500) {
                        return class121.method719(n, script, b, (byte)(-1));
                    }
                    if (n < 1600) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        return class244.method1391(n, script, b, 6390717);
                    }
                    else if (n < 1700) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        return AbstractUserComparator.method2166(n, script, b, 1539640011);
                    }
                    else {
                        if (n < 1800) {
                            return DefaultsGroup.method2226(n, script, b, 1228806354);
                        }
                        if (n < 1900) {
                            if (b2 >= 0) {
                                throw new IllegalStateException();
                            }
                            return Rasterizer3D.method1216(n, script, b, 734419623);
                        }
                        else if (n < 2000) {
                            if (b2 >= 0) {
                                throw new IllegalStateException();
                            }
                            return class13.method48(n, script, b, (short)511);
                        }
                        else if (n < 2100) {
                            if (b2 >= 0) {
                                throw new IllegalStateException();
                            }
                            return class131.method766(n, script, b, 1883190484);
                        }
                        else {
                            if (n < 2200) {
                                return class31.method135(n, script, b, (byte)(-76));
                            }
                            if (n < 2300) {
                                return Varcs.clearTransient(n, script, b, 1450194133);
                            }
                            if (n < 2400) {
                                if (b2 >= 0) {
                                    throw new IllegalStateException();
                                }
                                return StructComposition.method1070(n, script, b, -2142754824);
                            }
                            else if (n < 2500) {
                                if (b2 >= 0) {
                                    throw new IllegalStateException();
                                }
                                return class121.method719(n, script, b, (byte)(-1));
                            }
                            else if (n < 2600) {
                                if (b2 >= 0) {
                                    throw new IllegalStateException();
                                }
                                return class31.method134(n, script, b, (byte)57);
                            }
                            else if (n < 2700) {
                                if (b2 >= 0) {
                                    throw new IllegalStateException();
                                }
                                return MouseHandler.method194(n, script, b, (byte)(-15));
                            }
                            else if (n < 2800) {
                                if (b2 >= 0) {
                                    throw new IllegalStateException();
                                }
                                return SceneTilePaint.method1347(n, script, b, (byte)115);
                            }
                            else if (n < 2900) {
                                if (b2 >= 0) {
                                    throw new IllegalStateException();
                                }
                                return method147(n, script, b, -328074717);
                            }
                            else if (n < 3000) {
                                if (b2 >= 0) {
                                    throw new IllegalStateException();
                                }
                                return class13.method48(n, script, b, (short)511);
                            }
                            else {
                                if (n < 3200) {
                                    return NetFileRequest.method1877(n, script, b, (byte)(-19));
                                }
                                if (n < 3300) {
                                    if (b2 >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    return ObjectComposition.method1094(n, script, b, (byte)6);
                                }
                                else if (n < 3400) {
                                    if (b2 >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    return class130.method765(n, script, b, (byte)(-29));
                                }
                                else if (n < 3500) {
                                    if (b2 >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    return class380.method2045(n, script, b, -1650461177);
                                }
                                else {
                                    if (n < 3600) {
                                        return HitSplatDefinition.method1081(n, script, b, (byte)1);
                                    }
                                    if (n < 3700) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        return WorldMapAreaData.method1556(n, script, b, 1038224910);
                                    }
                                    else if (n < 3800) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        return FloorOverlayDefinition.method1121(n, script, b, 2032974834);
                                    }
                                    else if (n < 3900) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        return class478.method2436(n, script, b, (byte)0);
                                    }
                                    else if (n < 4000) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        return class18.method69(n, script, b, 995876193);
                                    }
                                    else if (n < 4100) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        return UserComparator3.method700(n, script, b, 190306276);
                                    }
                                    else if (n < 4200) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        return ApproximateRouteStrategy.method361(n, script, b, 16776960);
                                    }
                                    else if (n < 4300) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        return MusicPatchPcmStream.method1665(n, script, b, (byte)41);
                                    }
                                    else if (n < 5100) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        return UserComparator6.method714(n, script, b, (byte)(-45));
                                    }
                                    else if (n < 5400) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        return UserComparator4.method683(n, script, b, -1691226639);
                                    }
                                    else if (n < 5600) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        return TaskHandler.method949(n, script, b, -898403827);
                                    }
                                    else if (n < 5700) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        return Client.method368(n, script, b, -668307175);
                                    }
                                    else {
                                        if (n < 6300) {
                                            return class327.method1843(n, script, b, (byte)46);
                                        }
                                        if (n < 6600) {
                                            if (b2 >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            return WorldMapArea.method1431(n, script, b, 1955008701);
                                        }
                                        else {
                                            if (n < 6700) {
                                                return MouseRecorder.method496(n, script, b, -471758785);
                                            }
                                            if (n < 6800) {
                                                return class282.method1590(n, script, b, 784584297);
                                            }
                                            if (n < 6900) {
                                                if (b2 >= 0) {
                                                    throw new IllegalStateException();
                                                }
                                                return NetFileRequest.method1878(n, script, b, (short)(-23771));
                                            }
                                            else {
                                                if (n < 7000) {
                                                    return UserComparator7.method694(n, script, b, -1934960343);
                                                }
                                                if (n < 7100) {
                                                    if (b2 >= 0) {
                                                        throw new IllegalStateException();
                                                    }
                                                    return SoundSystem.method247(n, script, b, 2001743352);
                                                }
                                                else if (n < 7200) {
                                                    if (b2 >= 0) {
                                                        throw new IllegalStateException();
                                                    }
                                                    return class163.method916(n, script, b, -1671510816);
                                                }
                                                else {
                                                    if (n < 7300) {
                                                        return class16.method60(n, script, b, -2103319484);
                                                    }
                                                    if (n < 7500) {
                                                        if (b2 >= 0) {
                                                            throw new IllegalStateException();
                                                        }
                                                        return class126.method754(n, script, b, (short)15950);
                                                    }
                                                    else if (n < 7600) {
                                                        if (b2 >= 0) {
                                                            throw new IllegalStateException();
                                                        }
                                                        return class144.method821(n, script, b, (byte)38);
                                                    }
                                                    else {
                                                        if (n >= 7700) {
                                                            return 2;
                                                        }
                                                        if (b2 >= 0) {
                                                            throw new IllegalStateException();
                                                        }
                                                        return FriendSystem.method425(n, script, b, 994468925);
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
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bz.aw(" + ')');
        }
    }
    
    boolean method152(final class29 class29) {
        if (null == class29) {
            return false;
        }
        switch (1162709731 * this.field97) {
            default: {
                return false;
            }
            case 3: {
                return class29.vmethod3951((char)(234892017 * this.field98), -622589272);
            }
            case 1: {
                return class29.vmethod3949(234892017 * this.field98, 1213386835);
            }
            case 2: {
                return class29.vmethod3989(this.field98 * 234892017, 1312051339);
            }
            case 4: {
                return class29.vmethod3953(1 == this.field98 * 234892017, (byte)(-124));
            }
        }
    }
    
    static Class method152(final String className, final int n) throws ClassNotFoundException {
        try {
            if (className.equals("B")) {
                if (n <= 1059383171) {
                    throw new IllegalStateException();
                }
                return Byte.TYPE;
            }
            else {
                if (className.equals("I")) {
                    return Integer.TYPE;
                }
                if (className.equals("S")) {
                    if (n <= 1059383171) {
                        throw new IllegalStateException();
                    }
                    return Short.TYPE;
                }
                else if (className.equals("J")) {
                    if (n <= 1059383171) {
                        throw new IllegalStateException();
                    }
                    return Long.TYPE;
                }
                else if (className.equals("Z")) {
                    if (n <= 1059383171) {
                        throw new IllegalStateException();
                    }
                    return Boolean.TYPE;
                }
                else {
                    if (className.equals("F")) {
                        return Float.TYPE;
                    }
                    if (className.equals("D")) {
                        if (n <= 1059383171) {
                            throw new IllegalStateException();
                        }
                        return Double.TYPE;
                    }
                    else if (className.equals("C")) {
                        if (n <= 1059383171) {
                            throw new IllegalStateException();
                        }
                        return Character.TYPE;
                    }
                    else {
                        if (!className.equals("void")) {
                            return Class.forName(className);
                        }
                        if (n <= 1059383171) {
                            throw new IllegalStateException();
                        }
                        return Void.TYPE;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bz.aw(" + ')');
        }
    }
    
    public static ParamComposition getParamDefinition(final int n, final int n2) {
        try {
            final ParamComposition paramComposition = (ParamComposition)ParamComposition.ParamDefinition_cached.wr(n);
            if (null == paramComposition) {
                final byte[] takeFile = ParamComposition.ParamDefinition_archive.takeFile(11, n, (byte)(-78));
                final ParamComposition paramComposition2 = new ParamComposition();
                if (takeFile != null) {
                    paramComposition2.decode(new Buffer(takeFile), (byte)(-102));
                }
                paramComposition2.postDecode(-1924870301);
                ParamComposition.ParamDefinition_cached.put(paramComposition2, n);
                return paramComposition2;
            }
            if (n2 >= 902577077) {
                throw new IllegalStateException();
            }
            return paramComposition;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bz.an(" + ')');
        }
    }
    
    boolean newScript(final class29 class29) {
        if (null == class29) {
            return false;
        }
        switch (-1398016163 * this.field97) {
            case 4: {
                return class29.vmethod3953(1 == this.field98 * -1046680191, (byte)(-10));
            }
            case 2: {
                return class29.vmethod3989(this.field98 * 234892017, 1312051339);
            }
            default: {
                return false;
            }
            case 3: {
                return class29.vmethod3951((char)(-418165664 * this.field98), -1863353063);
            }
            case 1: {
                return class29.vmethod3949(1993925563 * this.field98, 1132757904);
            }
        }
    }
    
    static Script newScript(final byte[] array, final byte b) {
        try {
            final Script script = new Script();
            final Buffer buffer = new Buffer(array);
            buffer.offset = -1516355947 * (buffer.array.length - 2);
            final int n = buffer.array.length - 2 - buffer.readUnsignedShort(-815658714) - 12;
            buffer.offset = -1516355947 * n;
            final int int1 = buffer.readInt(-1928147960);
            script.localIntCount = buffer.readUnsignedShort(96220142) * -140315817;
            script.localStringCount = buffer.readUnsignedShort(-607280374) * -1816416047;
            script.intArgumentCount = buffer.readUnsignedShort(-40514162) * -603637105;
            script.stringArgumentCount = buffer.readUnsignedShort(-1507478317) * -751032223;
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra > 0) {
                script.switches = script.newIterableNodeHashTable(ra, -1544314186);
                for (int i = 0; i < ra; ++i) {
                    if (b != 1) {
                        throw new IllegalStateException();
                    }
                    int unsignedShort = buffer.readUnsignedShort(-1025837417);
                    int method442;
                    if (unsignedShort > 0) {
                        if (b != 1) {
                            throw new IllegalStateException();
                        }
                        method442 = class70.method442(unsignedShort, 231354383);
                    }
                    else {
                        method442 = 1;
                    }
                    final IterableNodeHashTable iterableNodeHashTable = new IterableNodeHashTable(method442);
                    script.switches[i] = iterableNodeHashTable;
                    while (unsignedShort-- > 0) {
                        if (b != 1) {
                            throw new IllegalStateException();
                        }
                        iterableNodeHashTable.put(new IntegerNode(buffer.readInt(-1505461660)), buffer.readInt(-1230163829));
                    }
                }
            }
            buffer.offset = 0;
            script.field794 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-74));
            script.opcodes = new int[int1];
            script.intOperands = new int[int1];
            script.stringOperands = new String[int1];
            int n2 = 0;
            while (-1633313603 * buffer.offset < n) {
                final int unsignedShort2 = buffer.readUnsignedShort(-488211486);
                Label_0309: {
                    if (unsignedShort2 == 3) {
                        script.stringOperands[n2] = buffer.readStringCp1252NullTerminated((byte)0);
                    }
                    else {
                        if (unsignedShort2 < 100 && unsignedShort2 != 21) {
                            if (b != 1) {
                                throw new IllegalStateException();
                            }
                            if (unsignedShort2 != 38) {
                                if (b != 1) {
                                    throw new IllegalStateException();
                                }
                                if (39 != unsignedShort2) {
                                    if (b != 1) {
                                        throw new IllegalStateException();
                                    }
                                    script.intOperands[n2] = buffer.readInt(-1423314562);
                                    break Label_0309;
                                }
                            }
                        }
                        script.intOperands[n2] = Buffer.ra(buffer, (byte)7);
                    }
                }
                script.opcodes[n2++] = unsignedShort2;
            }
            return script;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bz.ac(" + ')');
        }
    }
    
    boolean au(final class29 class29) {
        if (null == class29) {
            return false;
        }
        switch (1162709731 * this.field97) {
            case 2: {
                return class29.vmethod3989(this.field98 * 1030062929, 1312051339);
            }
            case 3: {
                return class29.vmethod3951((char)(2118355490 * this.field98), -725944104);
            }
            case 1: {
                return class29.vmethod3949(234892017 * this.field98, -452770361);
            }
            default: {
                return false;
            }
            case 4: {
                return class29.vmethod3953(1 == this.field98 * 234892017, (byte)(-29));
            }
        }
    }
    
    static LoginPacket[] method142(final byte b) {
        try {
            return new LoginPacket[] { LoginPacket.RECONNECT_LOGIN_CONNECTION, LoginPacket.field2704, LoginPacket.field2701, LoginPacket.NEW_LOGIN_CONNECTION, LoginPacket.field2705, LoginPacket.field2700 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bz.af(" + ')');
        }
    }
    
    boolean method142(final class29 class29, final int n) {
        try {
            if (null == class29) {
                if (n <= -2032582097) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                switch (1162709731 * this.field97) {
                    default: {
                        return false;
                    }
                    case 1: {
                        return class29.vmethod3949(234892017 * this.field98, 1311192309);
                    }
                    case 3: {
                        return class29.vmethod3951((char)(234892017 * this.field98), -2018590760);
                    }
                    case 4: {
                        boolean b;
                        if (1 == this.field98 * 234892017) {
                            if (n <= -2032582097) {
                                throw new IllegalStateException();
                            }
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        return class29.vmethod3953(b, (byte)(-16));
                    }
                    case 2: {
                        return class29.vmethod3989(this.field98 * 234892017, 1312051339);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bz.af(" + ')');
        }
    }
    
    public static boolean method142(final AbstractArchive abstractArchive, final AbstractArchive worldMapElement_archive, final int n) {
        try {
            WorldMapElement.WorldMapElement_archive = worldMapElement_archive;
            if (!abstractArchive.isFullyLoaded((short)128)) {
                return false;
            }
            class328.WorldMapElement_count = abstractArchive.getGroupFileCount(35, (byte)41) * 827991417;
            WorldMapElement.WorldMapElement_cached = new WorldMapElement[class328.WorldMapElement_count * -1703136055];
            for (int i = 0; i < class328.WorldMapElement_count * -1703136055; ++i) {
                if (n != 2112098628) {
                    throw new IllegalStateException();
                }
                final byte[] takeFile = abstractArchive.takeFile(35, i, (byte)(-10));
                WorldMapElement.WorldMapElement_cached[i] = new WorldMapElement(i);
                if (takeFile != null) {
                    if (n != 2112098628) {
                        throw new IllegalStateException();
                    }
                    WorldMapElement.WorldMapElement_cached[i].ag(new Buffer(takeFile), -1056093346);
                    WorldMapElement.WorldMapElement_cached[i].method985(262144);
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bz.af(" + ')');
        }
    }
    
    static void method151(final GameEngine gameEngine, final int n) {
        try {
            final class207 keyHandlerInstance = Client.keyHandlerInstance;
            while (class207.mt(keyHandlerInstance, 1913874795)) {
                if (n != 626811319) {
                    throw new IllegalStateException();
                }
                if (546317845 * keyHandlerInstance.field1867 == 13) {
                    if (n != 626811319) {
                        throw new IllegalStateException();
                    }
                    class138.method800((byte)82);
                    return;
                }
                else if (keyHandlerInstance.field1867 * 546317845 == 96) {
                    if (n != 626811319) {
                        throw new IllegalStateException();
                    }
                    if (1246310743 * Login.worldSelectPage <= 0) {
                        continue;
                    }
                    if (n != 626811319) {
                        throw new IllegalStateException();
                    }
                    if (null == PlayerType.worldSelectLeftSprite) {
                        continue;
                    }
                    if (n != 626811319) {
                        throw new IllegalStateException();
                    }
                    Login.worldSelectPage += 1379513753;
                }
                else {
                    if (97 != 546317845 * keyHandlerInstance.field1867) {
                        continue;
                    }
                    if (n != 626811319) {
                        throw new IllegalStateException();
                    }
                    if (Login.worldSelectPage * 1246310743 >= 1959698517 * Login.worldSelectPagesCount) {
                        continue;
                    }
                    if (n != 626811319) {
                        return;
                    }
                    if (null == class13.worldSelectRightSprite) {
                        continue;
                    }
                    Login.worldSelectPage -= 1379513753;
                }
            }
            if (1 != -1222491879 * MouseHandler.MouseHandler_lastButton) {
                if (n != 626811319) {
                    throw new IllegalStateException();
                }
                if (class473.mouseCam) {
                    return;
                }
                if (n != 626811319) {
                    throw new IllegalStateException();
                }
                if (-1222491879 * MouseHandler.MouseHandler_lastButton != 4) {
                    return;
                }
                if (n != 626811319) {
                    throw new IllegalStateException();
                }
            }
            final int n2 = Login.xPadding * 578342931 + 280;
            if (MouseHandler.MouseHandler_lastPressedX * 2020601481 >= n2) {
                if (n != 626811319) {
                    return;
                }
                if (MouseHandler.MouseHandler_lastPressedX * 2020601481 <= n2 + 14) {
                    if (n != 626811319) {
                        return;
                    }
                    if (1163896205 * MouseHandler.MouseHandler_lastPressedY >= 4) {
                        if (n != 626811319) {
                            return;
                        }
                        if (MouseHandler.MouseHandler_lastPressedY * 1163896205 <= 18) {
                            FillMode.changeWorldSelectSorting(0, 0, -358854286);
                            return;
                        }
                    }
                }
            }
            if (2020601481 * MouseHandler.MouseHandler_lastPressedX >= 15 + n2) {
                if (n != 626811319) {
                    throw new IllegalStateException();
                }
                if (MouseHandler.MouseHandler_lastPressedX * 2020601481 <= n2 + 80 && 1163896205 * MouseHandler.MouseHandler_lastPressedY >= 4) {
                    if (n != 626811319) {
                        throw new IllegalStateException();
                    }
                    if (1163896205 * MouseHandler.MouseHandler_lastPressedY <= 18) {
                        FillMode.changeWorldSelectSorting(0, 1, -456739970);
                        return;
                    }
                }
            }
            final int n3 = 390 + 578342931 * Login.xPadding;
            if (MouseHandler.MouseHandler_lastPressedX * 2020601481 >= n3) {
                if (n != 626811319) {
                    throw new IllegalStateException();
                }
                if (MouseHandler.MouseHandler_lastPressedX * 2020601481 <= n3 + 14) {
                    if (n != 626811319) {
                        throw new IllegalStateException();
                    }
                    if (1163896205 * MouseHandler.MouseHandler_lastPressedY >= 4) {
                        if (n != 626811319) {
                            return;
                        }
                        if (MouseHandler.MouseHandler_lastPressedY * 1163896205 <= 18) {
                            if (n != 626811319) {
                                return;
                            }
                            FillMode.changeWorldSelectSorting(1, 0, 177063686);
                            return;
                        }
                    }
                }
            }
            if (MouseHandler.MouseHandler_lastPressedX * 2020601481 >= n3 + 15 && 2020601481 * MouseHandler.MouseHandler_lastPressedX <= n3 + 80) {
                if (n != 626811319) {
                    throw new IllegalStateException();
                }
                if (MouseHandler.MouseHandler_lastPressedY * 1163896205 >= 4) {
                    if (n != 626811319) {
                        throw new IllegalStateException();
                    }
                    if (1163896205 * MouseHandler.MouseHandler_lastPressedY <= 18) {
                        if (n != 626811319) {
                            return;
                        }
                        FillMode.changeWorldSelectSorting(1, 1, 93109029);
                        return;
                    }
                }
            }
            final int n4 = 500 + Login.xPadding * 578342931;
            if (MouseHandler.MouseHandler_lastPressedX * 2020601481 >= n4) {
                if (n != 626811319) {
                    return;
                }
                if (2020601481 * MouseHandler.MouseHandler_lastPressedX <= n4 + 14) {
                    if (n != 626811319) {
                        throw new IllegalStateException();
                    }
                    if (1163896205 * MouseHandler.MouseHandler_lastPressedY >= 4) {
                        if (n != 626811319) {
                            throw new IllegalStateException();
                        }
                        if (1163896205 * MouseHandler.MouseHandler_lastPressedY <= 18) {
                            if (n != 626811319) {
                                throw new IllegalStateException();
                            }
                            FillMode.changeWorldSelectSorting(2, 0, -1593364857);
                            return;
                        }
                    }
                }
            }
            if (2020601481 * MouseHandler.MouseHandler_lastPressedX >= n4 + 15) {
                if (n != 626811319) {
                    throw new IllegalStateException();
                }
                if (MouseHandler.MouseHandler_lastPressedX * 2020601481 <= 80 + n4) {
                    if (n != 626811319) {
                        throw new IllegalStateException();
                    }
                    if (MouseHandler.MouseHandler_lastPressedY * 1163896205 >= 4 && MouseHandler.MouseHandler_lastPressedY * 1163896205 <= 18) {
                        if (n != 626811319) {
                            return;
                        }
                        FillMode.changeWorldSelectSorting(2, 1, -154243686);
                        return;
                    }
                }
            }
            final int n5 = Login.xPadding * 578342931 + 610;
            if (MouseHandler.MouseHandler_lastPressedX * 2020601481 >= n5 && MouseHandler.MouseHandler_lastPressedX * 2020601481 <= n5 + 14) {
                if (n != 626811319) {
                    throw new IllegalStateException();
                }
                if (1163896205 * MouseHandler.MouseHandler_lastPressedY >= 4) {
                    if (n != 626811319) {
                        return;
                    }
                    if (MouseHandler.MouseHandler_lastPressedY * 1163896205 <= 18) {
                        if (n != 626811319) {
                            throw new IllegalStateException();
                        }
                        FillMode.changeWorldSelectSorting(3, 0, -728179712);
                        return;
                    }
                }
            }
            if (2020601481 * MouseHandler.MouseHandler_lastPressedX >= 15 + n5 && MouseHandler.MouseHandler_lastPressedX * 2020601481 <= 80 + n5) {
                if (n != 626811319) {
                    throw new IllegalStateException();
                }
                if (MouseHandler.MouseHandler_lastPressedY * 1163896205 >= 4) {
                    if (n != 626811319) {
                        throw new IllegalStateException();
                    }
                    if (MouseHandler.MouseHandler_lastPressedY * 1163896205 <= 18) {
                        if (n != 626811319) {
                            return;
                        }
                        FillMode.changeWorldSelectSorting(3, 1, -464139126);
                        return;
                    }
                }
            }
            if (2020601481 * MouseHandler.MouseHandler_lastPressedX >= 708 + Login.xPadding * 578342931) {
                if (n != 626811319) {
                    throw new IllegalStateException();
                }
                if (MouseHandler.MouseHandler_lastPressedY * 1163896205 >= 4) {
                    if (n != 626811319) {
                        throw new IllegalStateException();
                    }
                    if (2020601481 * MouseHandler.MouseHandler_lastPressedX <= 708 + Login.xPadding * 578342931 + 50 && 1163896205 * MouseHandler.MouseHandler_lastPressedY <= 20) {
                        if (n != 626811319) {
                            throw new IllegalStateException();
                        }
                        class138.method800((byte)11);
                        return;
                    }
                }
            }
            if (Login.hoveredWorldIndex * 248569915 != -1) {
                FloorOverlayDefinition.changeWorld(class31.World_worlds[248569915 * Login.hoveredWorldIndex], -192204681);
                class138.method800((byte)94);
                return;
            }
            if (Login.worldSelectPage * 1246310743 > 0) {
                if (n != 626811319) {
                    throw new IllegalStateException();
                }
                if (null != PlayerType.worldSelectLeftSprite) {
                    if (n != 626811319) {
                        throw new IllegalStateException();
                    }
                    if (2020601481 * MouseHandler.MouseHandler_lastPressedX >= 0) {
                        if (n != 626811319) {
                            return;
                        }
                        if (MouseHandler.MouseHandler_lastPressedX * 2020601481 <= PlayerType.worldSelectLeftSprite.yOffset) {
                            if (n != 626811319) {
                                throw new IllegalStateException();
                            }
                            if (1163896205 * MouseHandler.MouseHandler_lastPressedY >= 1658005443 * class262.canvasHeight / 2 - 50) {
                                if (n != 626811319) {
                                    throw new IllegalStateException();
                                }
                                if (1163896205 * MouseHandler.MouseHandler_lastPressedY <= 1658005443 * class262.canvasHeight / 2 + 50) {
                                    if (n != 626811319) {
                                        throw new IllegalStateException();
                                    }
                                    Login.worldSelectPage += 1379513753;
                                }
                            }
                        }
                    }
                }
            }
            if (1246310743 * Login.worldSelectPage < Login.worldSelectPagesCount * 1959698517) {
                if (n != 626811319) {
                    throw new IllegalStateException();
                }
                if (null != class13.worldSelectRightSprite) {
                    if (n != 626811319) {
                        throw new IllegalStateException();
                    }
                    if (MouseHandler.MouseHandler_lastPressedX * 2020601481 >= GameEngine.canvasWidth * -1687260435 - class13.worldSelectRightSprite.yOffset - 5) {
                        if (n != 626811319) {
                            return;
                        }
                        if (MouseHandler.MouseHandler_lastPressedX * 2020601481 <= GameEngine.canvasWidth * -1687260435) {
                            if (n != 626811319) {
                                return;
                            }
                            if (MouseHandler.MouseHandler_lastPressedY * 1163896205 >= class262.canvasHeight * 1658005443 / 2 - 50) {
                                if (n != 626811319) {
                                    throw new IllegalStateException();
                                }
                                if (MouseHandler.MouseHandler_lastPressedY * 1163896205 <= class262.canvasHeight * 1658005443 / 2 + 50) {
                                    if (n != 626811319) {
                                        return;
                                    }
                                    Login.worldSelectPage -= 1379513753;
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bz.ag(" + ')');
        }
    }
    
    static final void drawActor2d(final Actor actor, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        Label_6381: {
            if (Scene.lz(actor, true)) {
                final int n7 = 1538298261;
                try {
                    if (actor != null) {
                        if (n7 != 1538298261) {
                            throw new IllegalStateException();
                        }
                        if (!actor.isVisible(1666539507)) {
                            if (n7 != 1538298261) {}
                        }
                        else {
                            if (actor instanceof NPC) {
                                NPCComposition npcComposition = ((NPC)actor).definition;
                                if (null != npcComposition.transforms) {
                                    if (n7 != 1538298261) {
                                        throw new IllegalStateException();
                                    }
                                    npcComposition = NPCComposition.ur(npcComposition, -1575355808);
                                }
                                if (null == npcComposition) {
                                    if (n7 != 1538298261) {
                                        throw new IllegalStateException();
                                    }
                                    return;
                                }
                            }
                            final int n8 = Players.Players_count * -2010934433;
                            final int[] players_indices = Players.Players_indices;
                            int n9;
                            if (n < n8) {
                                if (n7 != 1538298261) {
                                    throw new IllegalStateException();
                                }
                                n9 = 1;
                            }
                            else {
                                n9 = 0;
                            }
                            final int n10 = n9;
                            int n11 = -2;
                            Label_0686: {
                                if (actor.overheadText != null) {
                                    if (n10 != 0) {
                                        if (n7 != 1538298261) {
                                            return;
                                        }
                                        if (actor.showPublicPlayerChat) {
                                            break Label_0686;
                                        }
                                        if (n7 != 1538298261) {
                                            throw new IllegalStateException();
                                        }
                                        if (Client.publicChatMode * -1963411823 != 4) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            if (actor.isAutoChatting) {
                                                break Label_0686;
                                            }
                                            if (0 != -1963411823 * Client.publicChatMode) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                if (Client.publicChatMode * -1963411823 != 3) {
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (Client.publicChatMode * -1963411823 != 1) {
                                                        break Label_0686;
                                                    }
                                                    if (n7 != 1538298261) {
                                                        return;
                                                    }
                                                    if (!Player.yc((Player)actor, -2048402612)) {
                                                        break Label_0686;
                                                    }
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    class374.worldToScreen(actor.walkBackSequence * 1144428983, -411750205 * actor.field1005, -767387641 * actor.sequenceFrame, -2014413605);
                                    if (Client.viewportTempX * -1848743379 > -1) {
                                        if (n7 != 1538298261) {
                                            throw new IllegalStateException();
                                        }
                                        if (Client.overheadTextCount * 734988573 < 1025553311 * Client.overheadTextLimit) {
                                            if (n7 != 1538298261) {
                                                return;
                                            }
                                            Client.overheadTextXOffsets[734988573 * Client.overheadTextCount] = class137.fontBold12.bf(actor.overheadText) / 2;
                                            Client.overheadTextAscents[Client.overheadTextCount * 734988573] = class137.fontBold12.al;
                                            Client.overheadTextXs[734988573 * Client.overheadTextCount] = -1848743379 * Client.viewportTempX;
                                            Client.overheadTextYs[Client.overheadTextCount * 734988573] = 318977283 * Client.viewportTempY - n11;
                                            Client.overheadTextColors[Client.overheadTextCount * 734988573] = actor.field1002 * -1337884343;
                                            Client.overheadTextEffects[734988573 * Client.overheadTextCount] = actor.recolourStartCycle * 819594233;
                                            Client.overheadTextCyclesRemaining[Client.overheadTextCount * 734988573] = -536830723 * actor.spotAnimation;
                                            Client.overheadText[Client.overheadTextCount * 734988573] = actor.overheadText;
                                            Client.overheadTextCount -= 1973288651;
                                            n11 += 12;
                                        }
                                    }
                                }
                            }
                            if (!actor.healthBars.method1971()) {
                                if (n7 != 1538298261) {
                                    throw new IllegalStateException();
                                }
                                UserComparator6.method716(actor, -767387641 * actor.sequenceFrame + 15, 1654924432);
                                for (HealthBar healthBar = (HealthBar)actor.healthBars.up(); null != healthBar; healthBar = (HealthBar)actor.healthBars.by()) {
                                    if (n7 != 1538298261) {
                                        throw new IllegalStateException();
                                    }
                                    final HealthBarUpdate lx = HealthBar.lx(healthBar, -1886224337 * Client.cycle, (byte)(-122));
                                    if (null != lx) {
                                        if (n7 != 1538298261) {
                                            throw new IllegalStateException();
                                        }
                                        final HealthBarDefinition definition = healthBar.definition;
                                        final SpritePixels ms = HealthBarDefinition.ms(definition, -540655090);
                                        final SpritePixels frontSprite = definition.getFrontSprite((byte)9);
                                        int n12 = 0;
                                        int n13 = 0;
                                        Label_1026: {
                                            if (ms != null) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                if (frontSprite != null) {
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (definition.widthPadding * 166630382 < frontSprite.subWidth) {
                                                        if (n7 != 1538298261) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n12 = -2064168457 * definition.widthPadding;
                                                    }
                                                    n13 = frontSprite.subWidth - n12 * 2;
                                                    break Label_1026;
                                                }
                                            }
                                            n13 = 279738407 * definition.width;
                                        }
                                        int n14 = 255;
                                        final int n15 = -1886224337 * Client.cycle - lx.cycle * -1225111563;
                                        final int n16 = lx.health2 * -2028064551 * n13 / (definition.width * 279738407);
                                        int n20;
                                        if (lx.cycleOffset * -2116244499 > n15) {
                                            if (n7 != 1538298261) {
                                                return;
                                            }
                                            int n17;
                                            if (definition.field1533 * 294055185 == 0) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                n17 = 0;
                                            }
                                            else {
                                                n17 = 294055185 * definition.field1533 * (n15 / (294055185 * definition.field1533));
                                            }
                                            final int n18 = n17;
                                            final int n19 = n13 * (1250696899 * lx.health) / (279738407 * definition.width);
                                            n20 = n19 + n18 * (n16 - n19) / (-2116244499 * lx.cycleOffset);
                                        }
                                        else {
                                            n20 = n16;
                                            final int n21 = definition.int5 * -407931959 + lx.cycleOffset * -2116244499 - n15;
                                            if (definition.int3 * -471494485 >= 0) {
                                                n14 = (n21 << 8) / (definition.int5 * -407931959 - -471494485 * definition.int3);
                                            }
                                        }
                                        if (-2028064551 * lx.health2 > 0) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            if (n20 < 1) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                n20 = 1;
                                            }
                                        }
                                        Label_1710: {
                                            if (ms != null && frontSprite != null) {
                                                if (n7 != 1538298261) {
                                                    return;
                                                }
                                                int n22;
                                                if (n13 == n20) {
                                                    if (n7 != 1538298261) {
                                                        return;
                                                    }
                                                    n22 = n20 + 2 * n12;
                                                }
                                                else {
                                                    n22 = n20 + n12;
                                                }
                                                final int subHeight = ms.subHeight;
                                                n11 += subHeight;
                                                final int n23 = -1848743379 * Client.viewportTempX + n2 - (n13 >> 1);
                                                final int n24 = Client.viewportTempY * 318977283 + n3 - n11;
                                                final int n25 = n23 - n12;
                                                while (true) {
                                                    Label_1589: {
                                                        if (n14 < 0) {
                                                            break Label_1589;
                                                        }
                                                        if (n7 != 1538298261) {
                                                            throw new IllegalStateException();
                                                        }
                                                        if (n14 >= 255) {
                                                            break Label_1589;
                                                        }
                                                        if (n7 != 1538298261) {
                                                            throw new IllegalStateException();
                                                        }
                                                        ms.drawTransAt(n25, n24, n14);
                                                        Rasterizer2D.Rasterizer2D_expandClip(n25, n24, n25 + n22, n24 + subHeight);
                                                        frontSprite.drawTransAt(n25, n24, n14);
                                                        Rasterizer2D.Rasterizer2D_setClip(n2, n3, n4 + n2, n3 + n5);
                                                        n11 += 2;
                                                        break Label_1710;
                                                    }
                                                    ms.drawAt(n25, n24);
                                                    Rasterizer2D.Rasterizer2D_expandClip(n25, n24, n22 + n25, n24 + subHeight);
                                                    frontSprite.drawAt(n25, n24);
                                                    continue;
                                                }
                                            }
                                            else {
                                                n11 += 5;
                                                if (-1848743379 * Client.viewportTempX > -1) {
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                    final int n26 = n2 + -1848743379 * Client.viewportTempX - (n13 >> 1);
                                                    final int n27 = Client.viewportTempY * 318977283 + n3 - n11;
                                                    Rasterizer2D.Rasterizer2D_fillRectangle(n26, n27, n20, 5, 65280);
                                                    Rasterizer2D.Rasterizer2D_fillRectangle(n26 + n20, n27, n13 - n20, 5, 16711680);
                                                }
                                                n11 += 2;
                                            }
                                        }
                                    }
                                    else if (healthBar.isEmpty(-12674764)) {
                                        if (n7 != 1538298261) {
                                            throw new IllegalStateException();
                                        }
                                        healthBar.hw();
                                    }
                                }
                            }
                            if (-2 == n11) {
                                n11 += 7;
                            }
                            if (n10 != 0) {
                                if (n7 != 1538298261) {
                                    return;
                                }
                                if (actor.movingOrientation * -1532330627 == Client.cycle * -1886224337) {
                                    if (n7 != 1538298261) {
                                        throw new IllegalStateException();
                                    }
                                    if (class13.method46((Player)actor, 2083304706)) {
                                        if (n7 != 1538298261) {
                                            return;
                                        }
                                        final Player player = (Player)actor;
                                        if (n10 != 0) {
                                            if (n7 != 1538298261) {
                                                return;
                                            }
                                            class374.worldToScreen(1144428983 * actor.walkBackSequence, -411750205 * actor.field1005, 15 + -767387641 * actor.sequenceFrame, -779733307);
                                            final AbstractFont abstractFont = Client.fontsMap.get(FontName.FontName_plain12);
                                            n11 += 4;
                                            abstractFont.drawCentered(player.username.getName(-710264960), Client.viewportTempX * -1848743379 + n2, Client.viewportTempY * 318977283 + n3 - n11, 16777215, 0);
                                            n11 += 18;
                                        }
                                    }
                                }
                            }
                            if (n10 != 0) {
                                if (n7 != 1538298261) {
                                    return;
                                }
                                final Player player2 = (Player)actor;
                                if (player2.isHidden) {
                                    if (n7 != 1538298261) {
                                        throw new IllegalStateException();
                                    }
                                    return;
                                }
                                else {
                                    Label_2252: {
                                        if (-1 == player2.headIconPk * -1875167049) {
                                            if (-1 == -1905401649 * player2.headIconPrayer) {
                                                break Label_2252;
                                            }
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        class374.worldToScreen(actor.walkBackSequence * 1144428983, -411750205 * actor.field1005, 15 + -767387641 * actor.sequenceFrame, 15758456);
                                        if (-1848743379 * Client.viewportTempX > -1) {
                                            if (-1875167049 * player2.headIconPk != -1) {
                                                if (n7 != 1538298261) {
                                                    return;
                                                }
                                                n11 += 25;
                                                class36.headIconPkSprites[player2.headIconPk * -1875167049].drawAt(n2 + Client.viewportTempX * -1848743379 - 12, 318977283 * Client.viewportTempY + n3 - n11);
                                            }
                                            if (-1905401649 * player2.headIconPrayer != -1) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                n11 += 25;
                                                class425.headIconPrayerSprites[-1905401649 * player2.headIconPrayer].drawAt(Client.viewportTempX * -1848743379 + n2 - 12, n3 + Client.viewportTempY * 318977283 - n11);
                                            }
                                        }
                                    }
                                    if (n >= 0) {
                                        if (n7 != 1538298261) {
                                            throw new IllegalStateException();
                                        }
                                        if (10 == 633821975 * Client.hintArrowType) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            if (Client.hintArrowPlayerIndex * 561980131 == players_indices[n]) {
                                                if (n7 != 1538298261) {
                                                    return;
                                                }
                                                class374.worldToScreen(actor.walkBackSequence * 1144428983, -411750205 * actor.field1005, -767387641 * actor.sequenceFrame + 15, -273116947);
                                                if (-1848743379 * Client.viewportTempX > -1) {
                                                    KitDefinition.headIconHintSprites[1].drawAt(n2 + Client.viewportTempX * -1848743379 - 12, 318977283 * Client.viewportTempY + n3 - (n11 + KitDefinition.headIconHintSprites[1].subHeight));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                final NPC npc = (NPC)actor;
                                final int[] ae = NPC.ae(npc, (byte)14);
                                final short[] method602 = npc.method602(438914513);
                                if (method602 != null) {
                                    if (n7 != 1538298261) {
                                        throw new IllegalStateException();
                                    }
                                    if (null != ae) {
                                        if (n7 != 1538298261) {
                                            throw new IllegalStateException();
                                        }
                                        for (int i = 0; i < method602.length; ++i) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            if (method602[i] >= 0) {
                                                if (n7 != 1538298261) {
                                                    return;
                                                }
                                                if (ae[i] < 0) {
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                }
                                                else {
                                                    final long n28 = (long)ae[i] << 8 | (long)method602[i];
                                                    SpritePixels spritePixels = (SpritePixels)Client.archive5.method2126(n28, (short)12054);
                                                    if (spritePixels == null) {
                                                        if (n7 != 1538298261) {
                                                            throw new IllegalStateException();
                                                        }
                                                        final SpritePixels[] method603 = UserComparator3.method699(class452.archive8, ae[i], 0, 1271520368);
                                                        if (null != method603) {
                                                            if (n7 != 1538298261) {
                                                                return;
                                                            }
                                                            if (method602[i] < method603.length) {
                                                                spritePixels = method603[method602[i]];
                                                                Client.archive5.method2122(n28, spritePixels, 747668912);
                                                            }
                                                        }
                                                    }
                                                    if (null != spritePixels) {
                                                        if (n7 != 1538298261) {
                                                            throw new IllegalStateException();
                                                        }
                                                        UserComparator6.method716(actor, actor.sequenceFrame * -767387641 + 15, 1034869929);
                                                        if (-1848743379 * Client.viewportTempX > -1) {
                                                            if (n7 != 1538298261) {
                                                                throw new IllegalStateException();
                                                            }
                                                            spritePixels.drawAt(-1848743379 * Client.viewportTempX + n2 - (spritePixels.subWidth >> 1), 318977283 * Client.viewportTempY + (n3 - spritePixels.subHeight) - 4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (1 == Client.hintArrowType * 633821975 && 920558921 * Client.hintArrowNpcIndex == Client.npcIndices[n - n8]) {
                                    if (n7 != 1538298261) {
                                        throw new IllegalStateException();
                                    }
                                    if (Client.cycle * -1886224337 % 20 < 10) {
                                        class374.worldToScreen(actor.walkBackSequence * 1144428983, -411750205 * actor.field1005, 15 + -767387641 * actor.sequenceFrame, 1094267213);
                                        if (-1848743379 * Client.viewportTempX > -1) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            KitDefinition.headIconHintSprites[0].drawAt(n2 + Client.viewportTempX * -1848743379 - 12, 318977283 * Client.viewportTempY + n3 - 28);
                                        }
                                    }
                                }
                            }
                            int j = 0;
                        Label_4230_Outer:
                            while (j < 4) {
                                if (n7 != 1538298261) {
                                    throw new IllegalStateException();
                                }
                                final int n29 = actor.hitSplatValues[j];
                                final int n30 = actor.pathY[j];
                                HitSplatDefinition hitSplatDefinition = null;
                                int n31 = 0;
                                while (true) {
                                    Label_5099: {
                                        if (n30 >= 0) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            if (n29 <= -1886224337 * Client.cycle) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                            else {
                                                hitSplatDefinition = class122.method725(actor.pathY[j], (byte)4);
                                                n31 = 292771999 * hitSplatDefinition.field1672;
                                                if (hitSplatDefinition == null) {
                                                    break Label_5099;
                                                }
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                if (null == hitSplatDefinition.transforms) {
                                                    break Label_5099;
                                                }
                                                hitSplatDefinition = hitSplatDefinition.transform((byte)(-12));
                                                if (hitSplatDefinition != null) {
                                                    break Label_5099;
                                                }
                                                actor.hitSplatValues[j] = -1;
                                            }
                                        }
                                        else {
                                            if (n29 >= 0) {
                                                break Label_5099;
                                            }
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        ++j;
                                        continue Label_4230_Outer;
                                    }
                                    final int n32 = actor.hitSplatValues2[j];
                                    HitSplatDefinition hitSplatDefinition2 = null;
                                    if (n32 >= 0) {
                                        if (n7 != 1538298261) {
                                            throw new IllegalStateException();
                                        }
                                        hitSplatDefinition2 = class122.method725(n32, (byte)4);
                                        if (null != hitSplatDefinition2) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            if (hitSplatDefinition2.transforms != null) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                hitSplatDefinition2 = hitSplatDefinition2.transform((byte)(-85));
                                            }
                                        }
                                    }
                                    if (n29 - n31 > -1886224337 * Client.cycle) {
                                        if (n7 != 1538298261) {
                                            throw new IllegalStateException();
                                        }
                                        continue;
                                    }
                                    else if (null == hitSplatDefinition) {
                                        if (n7 != 1538298261) {
                                            throw new IllegalStateException();
                                        }
                                        actor.hitSplatValues[j] = -1;
                                        continue;
                                    }
                                    else {
                                        UserComparator6.method716(actor, actor.sequenceFrame * -767387641 / 2, 1029441802);
                                        if (Client.viewportTempX * -1848743379 <= -1) {
                                            continue;
                                        }
                                        if (n7 != 1538298261) {
                                            throw new IllegalStateException();
                                        }
                                        if (j != 0) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            Client.viewportTempY += 2135862948;
                                        }
                                        if (j == 2) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            Client.viewportTempX -= 187425963;
                                            Client.viewportTempY -= 1079552174;
                                        }
                                        if (3 == j) {
                                            Client.viewportTempX += 187425963;
                                            Client.viewportTempY -= 1079552174;
                                        }
                                        int subWidth = 0;
                                        int subWidth2 = 0;
                                        int subWidth3 = 0;
                                        int subWidth4 = 0;
                                        int xOffset = 0;
                                        int xOffset2 = 0;
                                        int xOffset3 = 0;
                                        int xOffset4 = 0;
                                        SpritePixels dc = null;
                                        SpritePixels method604 = null;
                                        SpritePixels method605 = null;
                                        SpritePixels method606 = null;
                                        int subWidth5 = 0;
                                        int subWidth6 = 0;
                                        int subWidth7 = 0;
                                        int subWidth8 = 0;
                                        int xOffset5 = 0;
                                        int xOffset6 = 0;
                                        int xOffset7 = 0;
                                        int xOffset8 = 0;
                                        int n33 = 0;
                                        final SpritePixels dc2 = HitSplatDefinition.dc(hitSplatDefinition, 2059907674);
                                        if (null != dc2) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            subWidth = dc2.subWidth;
                                            final int subHeight2 = dc2.subHeight;
                                            if (subHeight2 > n33) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                n33 = subHeight2;
                                            }
                                            xOffset = dc2.xOffset;
                                        }
                                        final SpritePixels method607 = hitSplatDefinition.method1077(-2117307389);
                                        if (null != method607) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            subWidth2 = method607.subWidth;
                                            final int subHeight3 = method607.subHeight;
                                            if (subHeight3 > n33) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                n33 = subHeight3;
                                            }
                                            xOffset2 = method607.xOffset;
                                        }
                                        final SpritePixels method608 = hitSplatDefinition.method1072(1640774602);
                                        if (method608 != null) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            subWidth3 = method608.subWidth;
                                            final int subHeight4 = method608.subHeight;
                                            if (subHeight4 > n33) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                n33 = subHeight4;
                                            }
                                            xOffset3 = method608.xOffset;
                                        }
                                        final SpritePixels method609 = hitSplatDefinition.method1078((byte)57);
                                        if (method609 != null) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            subWidth4 = method609.subWidth;
                                            final int subHeight5 = method609.subHeight;
                                            if (subHeight5 > n33) {
                                                if (n7 != 1538298261) {
                                                    break;
                                                }
                                                n33 = subHeight5;
                                            }
                                            xOffset4 = method609.xOffset;
                                        }
                                        if (hitSplatDefinition2 != null) {
                                            dc = HitSplatDefinition.dc(hitSplatDefinition2, 732327385);
                                            if (dc != null) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                subWidth5 = dc.subWidth;
                                                final int subHeight6 = dc.subHeight;
                                                if (subHeight6 > n33) {
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                    n33 = subHeight6;
                                                }
                                                xOffset5 = dc.xOffset;
                                            }
                                            method604 = hitSplatDefinition2.method1077(-1343255179);
                                            if (method604 != null) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                subWidth6 = method604.subWidth;
                                                final int subHeight7 = method604.subHeight;
                                                if (subHeight7 > n33) {
                                                    n33 = subHeight7;
                                                }
                                                xOffset6 = method604.xOffset;
                                            }
                                            method605 = hitSplatDefinition2.method1072(1852360487);
                                            if (null != method605) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                subWidth7 = method605.subWidth;
                                                final int subHeight8 = method605.subHeight;
                                                if (subHeight8 > n33) {
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                    n33 = subHeight8;
                                                }
                                                xOffset7 = method605.xOffset;
                                            }
                                            method606 = hitSplatDefinition2.method1078((byte)33);
                                            if (null != method606) {
                                                subWidth8 = method606.subWidth;
                                                final int subHeight9 = method606.subHeight;
                                                if (subHeight9 > n33) {
                                                    n33 = subHeight9;
                                                }
                                                xOffset8 = method606.xOffset;
                                            }
                                        }
                                        Font font = hitSplatDefinition.getFont(1644925127);
                                        if (null == font) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            font = Language.fontPlain11;
                                        }
                                        Font font2;
                                        if (null != hitSplatDefinition2) {
                                            font2 = hitSplatDefinition2.getFont(1644925127);
                                            if (font2 == null) {
                                                font2 = Language.fontPlain11;
                                            }
                                        }
                                        else {
                                            font2 = Language.fontPlain11;
                                        }
                                        String string = null;
                                        int bf = 0;
                                        final String string2 = hitSplatDefinition.getString(actor.hitSplatTypes[j], -280765442);
                                        final int bf2 = font.bf(string2);
                                        if (hitSplatDefinition2 != null) {
                                            string = hitSplatDefinition2.getString(actor.hitSplatCycles[j], -1802175591);
                                            bf = font2.bf(string);
                                        }
                                        int n34 = 0;
                                        int n35 = 0;
                                        Label_4599: {
                                            if (subWidth2 > 0) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                if (null == method608) {
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (method609 == null) {
                                                        n34 = 1;
                                                        break Label_4599;
                                                    }
                                                }
                                                n34 = 1 + bf2 / subWidth2;
                                            }
                                        }
                                        Label_4696: {
                                            if (null != hitSplatDefinition2) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                if (subWidth6 > 0) {
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (null == method605) {
                                                        if (n7 != 1538298261) {
                                                            throw new IllegalStateException();
                                                        }
                                                        if (method606 == null) {
                                                            n35 = 1;
                                                            break Label_4696;
                                                        }
                                                        if (n7 != 1538298261) {
                                                            throw new IllegalStateException();
                                                        }
                                                    }
                                                    n35 = bf / subWidth6 + 1;
                                                }
                                            }
                                        }
                                        final int n37;
                                        int n36 = n37 = 0;
                                        if (subWidth > 0) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            n36 += subWidth;
                                        }
                                        n36 += 2;
                                        final int n38 = n36;
                                        if (subWidth3 > 0) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            n36 += subWidth3;
                                        }
                                        final int n39 = n36;
                                        int n40 = n36;
                                        int n42;
                                        if (subWidth2 > 0) {
                                            final int n41 = n34 * subWidth2;
                                            n42 = n36 + n41;
                                            n40 += (n41 - bf2) / 2;
                                        }
                                        else {
                                            n42 = n36 + bf2;
                                        }
                                        final int n43 = n42;
                                        if (subWidth4 > 0) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            n42 += subWidth4;
                                        }
                                        int n44 = 0;
                                        int n45 = 0;
                                        int n46 = 0;
                                        int n47 = 0;
                                        int n48 = 0;
                                        if (hitSplatDefinition2 != null) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            n42 += 2;
                                            n44 = n42;
                                            if (subWidth5 > 0) {
                                                n42 += subWidth5;
                                            }
                                            n42 += 2;
                                            n45 = n42;
                                            if (subWidth7 > 0) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                n42 += subWidth7;
                                            }
                                            n46 = n42;
                                            n48 = n42;
                                            if (subWidth6 > 0) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                final int n49 = subWidth6 * n35;
                                                n42 += n49;
                                                n48 += (n49 - bf) / 2;
                                            }
                                            else {
                                                n42 += bf;
                                            }
                                            n47 = n42;
                                            if (subWidth8 > 0) {
                                                if (n7 != 1538298261) {
                                                    break;
                                                }
                                                n42 += subWidth8;
                                            }
                                        }
                                        final int n50 = actor.hitSplatValues[j] - -1886224337 * Client.cycle;
                                        final int n51 = hitSplatDefinition.field1663 * 895105585 - 895105585 * hitSplatDefinition.field1663 * n50 / (292771999 * hitSplatDefinition.field1672);
                                        final int n52 = 498242719 * hitSplatDefinition.field1676 * n50 / (hitSplatDefinition.field1672 * 292771999) + -(hitSplatDefinition.field1676 * 498242719);
                                        final int n53 = n2 + -1848743379 * Client.viewportTempX - (n42 >> 1) + n51;
                                        int n55;
                                        final int n54 = n55 = n3 + Client.viewportTempY * 318977283 - 12 + n52;
                                        int n56 = n54 + n33;
                                        final int n57 = n54 + 15 + 1785373205 * hitSplatDefinition.field1680;
                                        final int n58 = n57 - font.at;
                                        final int n59 = font.aa + n57;
                                        if (n58 < n55) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            n55 = n58;
                                        }
                                        if (n59 > n56) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            n56 = n59;
                                        }
                                        int n60 = 0;
                                        if (null != hitSplatDefinition2) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            n60 = 1785373205 * hitSplatDefinition2.field1680 + (n54 + 15);
                                            final int n61 = n60 - font2.at;
                                            final int n62 = n60 + font2.aa;
                                            if (n61 < n55 && n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            if (n62 > n56) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                        }
                                        int n63 = 255;
                                        if (-1413310139 * hitSplatDefinition.field1683 >= 0) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            n63 = (n50 << 8) / (hitSplatDefinition.field1672 * 292771999 - hitSplatDefinition.field1683 * -1413310139);
                                        }
                                        if (n63 >= 0) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            if (n63 < 255) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                if (dc2 != null) {
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                    dc2.drawTransAt(n53 + n37 - xOffset, n54, n63);
                                                }
                                                if (null != method608) {
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                    method608.drawTransAt(n38 + n53 - xOffset3, n54, n63);
                                                }
                                                if (method607 != null) {
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                    for (int k = 0; k < n34; ++k) {
                                                        if (n7 != 1538298261) {
                                                            break Label_6381;
                                                        }
                                                        method607.drawTransAt(k * subWidth2 + (n39 + n53 - xOffset2), n54, n63);
                                                    }
                                                }
                                                if (method609 != null) {
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                    method609.drawTransAt(n53 + n43 - xOffset4, n54, n63);
                                                }
                                                font.am(string2, n40 + n53, n57, hitSplatDefinition.textColor * -2000718353, 0, n63);
                                                if (null == hitSplatDefinition2) {
                                                    continue;
                                                }
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                if (null != dc) {
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                    dc.drawTransAt(n44 + n53 - xOffset5, n54, n63);
                                                }
                                                if (method605 != null) {
                                                    if (n7 != 1538298261) {
                                                        throw new IllegalStateException();
                                                    }
                                                    method605.drawTransAt(n45 + n53 - xOffset7, n54, n63);
                                                }
                                                if (null != method604) {
                                                    if (n7 != 1538298261) {
                                                        break;
                                                    }
                                                    for (int l = 0; l < n35; ++l) {
                                                        if (n7 != 1538298261) {
                                                            break Label_6381;
                                                        }
                                                        method604.drawTransAt(n53 + n46 - xOffset6 + subWidth6 * l, n54, n63);
                                                    }
                                                }
                                                if (method606 != null) {
                                                    if (n7 != 1538298261) {
                                                        break;
                                                    }
                                                    method606.drawTransAt(n47 + n53 - xOffset8, n54, n63);
                                                }
                                                font2.am(string, n53 + n48, n60, hitSplatDefinition2.textColor * -2000718353, 0, n63);
                                                continue;
                                            }
                                        }
                                        if (dc2 != null) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            dc2.drawAt(n37 + n53 - xOffset, n54);
                                        }
                                        if (null != method608) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            method608.drawAt(n38 + n53 - xOffset3, n54);
                                        }
                                        if (null != method607) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            for (int n64 = 0; n64 < n34; ++n64) {
                                                if (n7 != 1538298261) {
                                                    throw new IllegalStateException();
                                                }
                                                method607.drawAt(subWidth2 * n64 + (n39 + n53 - xOffset2), n54);
                                            }
                                        }
                                        if (method609 != null) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            method609.drawAt(n53 + n43 - xOffset4, n54);
                                        }
                                        class492.xb(font, string2, n53 + n40, n57, hitSplatDefinition.textColor * -2000718353 | 0xFF000000, 0);
                                        if (null == hitSplatDefinition2) {
                                            continue;
                                        }
                                        if (n7 != 1538298261) {
                                            throw new IllegalStateException();
                                        }
                                        if (dc != null) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            dc.drawAt(n44 + n53 - xOffset5, n54);
                                        }
                                        if (method605 != null) {
                                            if (n7 != 1538298261) {
                                                throw new IllegalStateException();
                                            }
                                            method605.drawAt(n45 + n53 - xOffset7, n54);
                                        }
                                        if (method604 != null) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            for (int n65 = 0; n65 < n35; ++n65) {
                                                method604.drawAt(n53 + n46 - xOffset6 + n65 * subWidth6, n54);
                                            }
                                        }
                                        if (null != method606) {
                                            if (n7 != 1538298261) {
                                                break;
                                            }
                                            method606.drawAt(n53 + n47 - xOffset8, n54);
                                        }
                                        class492.xb(font2, string, n53 + n48, n60, hitSplatDefinition2.textColor * -2000718353 | 0xFF000000, 0);
                                        continue;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                catch (RuntimeException ex) {
                    throw HealthBar.get(ex, "bz.jm(" + ')');
                }
            }
        }
    }
    
    static final void updatePendingSpawn(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11) {
        try {
            PendingSpawn pendingSpawn = null;
            for (PendingSpawn pendingSpawn2 = (PendingSpawn)Client.pendingSpawns.last(); null != pendingSpawn2; pendingSpawn2 = (PendingSpawn)Client.pendingSpawns.previous()) {
                if (pendingSpawn2.plane * 593068225 == n && pendingSpawn2.x * 68300005 == n2) {
                    if (n11 != 87894197) {
                        throw new IllegalStateException();
                    }
                    if (n3 == 800888185 * pendingSpawn2.y) {
                        if (n11 != 87894197) {
                            return;
                        }
                        if (n4 == -1586499579 * pendingSpawn2.type) {
                            if (n11 != 87894197) {
                                return;
                            }
                            pendingSpawn = pendingSpawn2;
                            break;
                        }
                    }
                }
            }
            if (pendingSpawn == null) {
                if (n11 != 87894197) {
                    return;
                }
                pendingSpawn = new PendingSpawn();
                pendingSpawn.plane = -1417998527 * n;
                pendingSpawn.type = n4 * 2090818765;
                pendingSpawn.x = n2 * -1524387603;
                pendingSpawn.y = n3 * -1930509111;
                pendingSpawn.field931 = 620279391;
                Messages.method656(pendingSpawn, 910188661);
                Client.pendingSpawns.addFirst(pendingSpawn);
            }
            pendingSpawn.id = 1572573337 * n5;
            pendingSpawn.objectType = 192741763 * n6;
            pendingSpawn.rotation = 1233957891 * n7;
            pendingSpawn.startCycle = n9 * 237969965;
            pendingSpawn.endCycle = n10 * 376812409;
            pendingSpawn.method524(n8, (byte)(-9));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bz.jz(" + ')');
        }
    }
}
