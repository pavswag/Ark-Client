// 
// Decompiled by Procyon v0.5.36
// 

public class class478 implements class356
{
    public static final class478 field4026;
    public static final class478 field4027;
    public static final class478 field4028;
    public final int field4029;
    public final int field4030;
    public final Class field4031;
    final class474 field4032;
    static final int ba = 56;
    public static final float at = 10000.0f;
    
    class478(final int n, final int n2, final Class field4031, final class474 field4032) {
        this.field4029 = 1357163045 * n;
        this.field4030 = n2 * 848999595;
        this.field4031 = field4031;
        this.field4032 = field4032;
    }
    
    static {
        field4028 = new class478(1, 0, Integer.class, new class475());
        field4027 = new class478(0, 1, Long.class, new class477());
        field4026 = new class478(2, 2, String.class, new class479());
    }
    
    public static void ao(final Object o, final Buffer buffer) {
        method2433(o.getClass(), -1458293291).vmethod8274(o, buffer, 204430724);
    }
    
    public Object method2435(final Buffer buffer, final int n) {
        try {
            return this.field4032.vmethod8273(buffer, -1690934499);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sh.at(" + ')');
        }
    }
    
    static final void clanKickUser(final String s, final byte b) {
        try {
            if (UserComparator5.friendsChat != null) {
                final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2550, Client.packetWriter.isaacCipher, (short)(-32141));
                packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)(-37)), (byte)4);
                packetBufferNode.packetBuffer.ce(s, -1834018420);
                Client.packetWriter.addNode(packetBufferNode, 414135591);
                return;
            }
            if (b <= 25) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sh.nm(" + ')');
        }
    }
    
    public static void ax(final Object o, final Buffer buffer) {
        method2433(o.getClass(), -1458293291).vmethod8274(o, buffer, -1985528033);
    }
    
    public static class478 ay(final Class clazz) {
        final class478[] method2432 = method2432(-1594990105);
        for (int i = 0; i < method2432.length; ++i) {
            final class478 class478 = method2432[i];
            if (clazz == class478.field4031) {
                return class478;
            }
        }
        return null;
    }
    
    public static PacketBufferNode method2430(final short n) {
        try {
            final PacketBufferNode method1044 = SpotAnimationDefinition.method1044((byte)0);
            method1044.clientPacket = null;
            method1044.clientPacketLength = 0;
            method1044.packetBuffer = new PacketBuffer(5000);
            return method1044;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sh.aw(" + ')');
        }
    }
    
    public int method2430() {
        return this.field4030 * -1312168892;
    }
    
    static final int method2437(final int n, int n2, final byte b) {
        try {
            if (-2 == n) {
                return 12345678;
            }
            if (-1 != n) {
                n2 = (n & 0x7F) * n2 / 128;
                if (n2 < 2) {
                    if (b != 0) {
                        throw new IllegalStateException();
                    }
                    n2 = 2;
                }
                else if (n2 > 126) {
                    if (b != 0) {
                        throw new IllegalStateException();
                    }
                    n2 = 126;
                }
                return (n & 0xFF80) + n2;
            }
            if (b != 0) {
                throw new IllegalStateException();
            }
            if (n2 < 2) {
                n2 = 2;
            }
            else if (n2 > 126) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                n2 = 126;
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sh.am(" + ')');
        }
    }
    
    static class474 method2433(final Class clazz, final int n) {
        try {
            final class478 method2431 = method2431(clazz, (short)(-27673));
            if (method2431 != null) {
                return method2431.field4032;
            }
            if (n != -1458293291) {
                throw new IllegalStateException();
            }
            throw new IllegalArgumentException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sh.al(" + ')');
        }
    }
    
    public int method2438() {
        return this.field4030 * 454796803;
    }
    
    public static void method2438(final AbstractArchive abstractArchive, final String s, final String s2, final int n, final boolean b, final int n2) {
        try {
            if (AbstractArchive.sh(abstractArchive, s, s2, -1313069490)) {
                if (n2 <= -1893671375) {
                    throw new IllegalStateException();
                }
                final int fileFlat = AbstractArchive.getFileFlat(abstractArchive, s, 480106733);
                Message.isFromFriend(abstractArchive, fileFlat, abstractArchive.getFileId(fileFlat, s2, (short)8192), n, b, -1544812816);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sh.an(" + ')');
        }
    }
    
    @Override
    public int ac() {
        return this.field4030 * 454796803;
    }
    
    public static class478[] method2432(final int n) {
        try {
            return new class478[] { class478.field4028, class478.field4027, class478.field4026 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sh.au(" + ')');
        }
    }
    
    public static class478[] aa() {
        return new class478[] { class478.field4028, class478.field4027, class478.field4026 };
    }
    
    public static void ai(final Object o, final Buffer buffer) {
        method2433(o.getClass(), -1458293291).vmethod8274(o, buffer, -1192953475);
    }
    
    public static int js(final class8 class8) {
        return class8.field18;
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return this.field4030 * 454796803;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sh.af(" + ')');
        }
    }
    
    public static class478 method2431(final Class clazz, final short n) {
        try {
            final class478[] method2432 = method2432(-1831694021);
            int i = 0;
            while (i < method2432.length) {
                if (n >= 256) {
                    throw new IllegalStateException();
                }
                final class478 class478 = method2432[i];
                if (clazz == class478.field4031) {
                    if (n >= 256) {
                        throw new IllegalStateException();
                    }
                    return class478;
                }
                else {
                    ++i;
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sh.ab(" + ')');
        }
    }
    
    public static void method2440(final Object o, final Buffer buffer, final int n) {
        try {
            method2433(o.getClass(), -1458293291).vmethod8274(o, buffer, -1451264347);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sh.aq(" + ')');
        }
    }
    
    public static void ag(final Object o, final Buffer buffer) {
        method2433(o.getClass(), -1458293291).vmethod8274(o, buffer, 1833941593);
    }
    
    static int method2436(final int n, final Script script, final boolean b, final byte b2) {
        try {
            if (3800 == n) {
                if (b2 != 0) {
                    throw new IllegalStateException();
                }
                if (null != ItemComposition.guestClanSettings) {
                    if (b2 != 0) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                    class133.field1286 = ItemComposition.guestClanSettings;
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                }
                return 1;
            }
            else if (3801 == n) {
                if (b2 != 0) {
                    throw new IllegalStateException();
                }
                final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                if (Client.currentClanSettings[n2] != null) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                    class133.field1286 = Client.currentClanSettings[n2];
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                }
                return 1;
            }
            else if (n == 3802) {
                if (b2 != 0) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class133.field1286.name;
                return 1;
            }
            else if (3803 == n) {
                if (b2 != 0) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class133.field1286.allowGuests ? 1 : 0);
                return 1;
            }
            else if (3804 == n) {
                if (b2 != 0) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.field1369;
                return 1;
            }
            else if (n == 3805) {
                if (b2 != 0) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.field1359;
                return 1;
            }
            else {
                if (3806 == n) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.field1360;
                    return 1;
                }
                if (n == 3807) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.field1351;
                    return 1;
                }
                if (n == 3809) {
                    if (b2 != 0) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1247430143 * class133.field1286.memberCount;
                    return 1;
                }
                else if (n == 3810) {
                    if (b2 != 0) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class133.field1286.memberNames[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
                    return 1;
                }
                else if (3811 == n) {
                    if (b2 != 0) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.memberRanks[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
                    return 1;
                }
                else if (n == 3812) {
                    if (b2 != 0) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.bannedMemberCount * -325159675;
                    return 1;
                }
                else if (3813 == n) {
                    if (b2 != 0) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class133.field1286.bannedMemberNames[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
                    return 1;
                }
                else {
                    if (n == 3814) {
                        Interpreter.Interpreter_intStackSize -= 1281407919;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ClanSettings.iq(class133.field1286, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539], (byte)60);
                        return 1;
                    }
                    if (n == 3815) {
                        if (b2 != 0) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.currentOwner * 680027429;
                        return 1;
                    }
                    else if (3816 == n) {
                        if (b2 != 0) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.field1374 * -1218077019;
                        return 1;
                    }
                    else if (n == 3817) {
                        if (b2 != 0) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.method851(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], (byte)79);
                        return 1;
                    }
                    else if (3818 == n) {
                        if (b2 != 0) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1] = class133.field1286.getSortedMembers((byte)33)[Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1]];
                        return 1;
                    }
                    else if (n == 3819) {
                        if (b2 != 0) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        WorldMapScaleHandler.method1567(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], (byte)46);
                        return 1;
                    }
                    else {
                        if (3820 == n) {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class133.field1286.field1366[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
                            return 1;
                        }
                        if (3821 == n) {
                            if (b2 != 0) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStackSize -= 1281407919;
                            final int n3 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                            boolean b3;
                            if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] == 1) {
                                if (b2 != 0) {
                                    throw new IllegalStateException();
                                }
                                b3 = true;
                            }
                            else {
                                b3 = false;
                            }
                            Clock.method970(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2], n3, b3, 787854296);
                        }
                        if (n == 3822) {
                            final int n4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                            final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                            final int n5 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                            boolean b4;
                            if (class133.field1286.field1375[n4]) {
                                if (b2 != 0) {
                                    throw new IllegalStateException();
                                }
                                b4 = true;
                            }
                            else {
                                b4 = false;
                            }
                            interpreter_intStack[n5] = (b4 ? 1 : 0);
                            return 1;
                        }
                        if (3850 == n) {
                            if (b2 != 0) {
                                throw new IllegalStateException();
                            }
                            if (MouseHandler.guestClanChannel != null) {
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                                class147.field1346 = MouseHandler.guestClanChannel;
                            }
                            else {
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                            }
                            return 1;
                        }
                        else if (3851 == n) {
                            if (b2 != 0) {
                                throw new IllegalStateException();
                            }
                            final int n6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                            if (Client.currentClanChannels[n6] != null) {
                                if (b2 != 0) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                                class147.field1346 = Client.currentClanChannels[n6];
                                Login.field763 = 1601506193 * n6;
                            }
                            else {
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                            }
                            return 1;
                        }
                        else if (n == 3852) {
                            if (b2 != 0) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class147.field1346.name;
                            return 1;
                        }
                        else {
                            if (n == 3853) {
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class147.field1346.field1401;
                                return 1;
                            }
                            if (3854 == n) {
                                if (b2 != 0) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class147.field1346.field1396;
                                return 1;
                            }
                            else if (3855 == n) {
                                if (b2 != 0) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class147.field1346.method898(390972136);
                                return 1;
                            }
                            else {
                                if (3856 == n) {
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class147.field1346.members.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).username.getName(-710264960);
                                    return 1;
                                }
                                if (3857 == n) {
                                    if (b2 != 0) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class147.field1346.members.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).rank;
                                    return 1;
                                }
                                else if (n == 3858) {
                                    if (b2 != 0) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class147.field1346.members.get(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]).world * -2113202541;
                                    return 1;
                                }
                                else if (3859 == n) {
                                    if (b2 != 0) {
                                        throw new IllegalStateException();
                                    }
                                    class151.method872(Login.field763 * -575466127, Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 201113676);
                                    return 1;
                                }
                                else if (n == 3860) {
                                    if (b2 != 0) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ClanChannel.iq(class147.field1346, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -1047252257);
                                    return 1;
                                }
                                else if (n == 3861) {
                                    if (b2 != 0) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = class147.field1346.getSortedMembers(67863678)[Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1]];
                                    return 1;
                                }
                                else {
                                    if (3890 != n) {
                                        return 2;
                                    }
                                    if (b2 != 0) {
                                        throw new IllegalStateException();
                                    }
                                    final int[] interpreter_intStack2 = Interpreter.Interpreter_intStack;
                                    final int n7 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                    boolean b5;
                                    if (Players.varclan != null) {
                                        if (b2 != 0) {
                                            throw new IllegalStateException();
                                        }
                                        b5 = true;
                                    }
                                    else {
                                        b5 = false;
                                    }
                                    interpreter_intStack2[n7] = (b5 ? 1 : 0);
                                    return 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sh.bk(" + ')');
        }
    }
    
    static class474 ah(final Class clazz) {
        final class478 method2431 = method2431(clazz, (short)(-29318));
        if (method2431 == null) {
            throw new IllegalArgumentException();
        }
        return method2431.field4032;
    }
}
