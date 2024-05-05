import java.util.Comparator;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapAreaData extends WorldMapArea
{
    List iconList;
    HashSet worldMapData1Set;
    public static final int ah = 12;
    HashSet worldMapData0Set;
    static int[] regions;
    
    WorldMapAreaData() {
    }
    
    void cr(final Buffer buffer, final Buffer buffer2, final int n, final boolean b) {
        this.af(buffer, n, (byte)24);
        final int unsignedShort = buffer2.readUnsignedShort(-758521105);
        this.worldMapData1Set = new HashSet(unsignedShort);
        for (int i = 0; i < unsignedShort; ++i) {
            final WorldMapData_0 e = new WorldMapData_0();
            try {
                e.init(buffer2, 1432634769);
            }
            catch (IllegalStateException ex) {
                continue;
            }
            this.worldMapData1Set.add(e);
        }
        final int unsignedShort2 = buffer2.readUnsignedShort(-675842663);
        this.worldMapData0Set = new HashSet(unsignedShort2);
        for (int j = 0; j < unsignedShort2; ++j) {
            final WorldMapData_1 e2 = new WorldMapData_1();
            try {
                WorldMapData_1.nb(e2, buffer2, 2051577769);
            }
            catch (IllegalStateException ex2) {
                continue;
            }
            this.worldMapData0Set.add(e2);
        }
        this.initIconsList(buffer2, b, 296734291);
    }
    
    void cb(final Buffer buffer, final boolean b) {
        this.iconList = new LinkedList();
        for (int unsignedShort = buffer.readUnsignedShort(-1998958587), i = 0; i < unsignedShort; ++i) {
            final int method2516 = buffer.method2516(1282002574);
            final Coord coord = new Coord(buffer.readInt(-1067443890));
            final boolean b2 = Buffer.ra(buffer, (byte)7) == 1;
            if (b || b2) {
                this.iconList.add(new WorldMapIcon_0(null, coord, method2516, null));
            }
        }
    }
    
    void init(final Buffer buffer, final Buffer buffer2, final int n, final boolean b, final byte b2) {
        try {
            this.af(buffer, n, (byte)18);
            final int unsignedShort = buffer2.readUnsignedShort(-707598822);
            this.worldMapData1Set = new HashSet(unsignedShort);
            for (int i = 0; i < unsignedShort; ++i) {
                if (b2 == 1) {
                    throw new IllegalStateException();
                }
                final WorldMapData_0 e = new WorldMapData_0();
                try {
                    e.init(buffer2, -1901491736);
                }
                catch (IllegalStateException ex2) {
                    continue;
                }
                this.worldMapData1Set.add(e);
            }
            final int unsignedShort2 = buffer2.readUnsignedShort(-541249217);
            this.worldMapData0Set = new HashSet(unsignedShort2);
            for (int j = 0; j < unsignedShort2; ++j) {
                if (b2 == 1) {
                    throw new IllegalStateException();
                }
                final WorldMapData_1 e2 = new WorldMapData_1();
                try {
                    WorldMapData_1.nb(e2, buffer2, 1529906024);
                }
                catch (IllegalStateException ex3) {
                    continue;
                }
                this.worldMapData0Set.add(e2);
            }
            this.initIconsList(buffer2, b, 1022421975);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kk.cl(" + ')');
        }
    }
    
    static int method1556(final int n, final Script script, final boolean b, final int n2) {
        try {
            if (n == 3600) {
                if (n2 != 1038224910) {
                    throw new IllegalStateException();
                }
                if (World.friendSystem.field672 * -1736413869 == 0) {
                    if (n2 != 1038224910) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2;
                }
                else if (World.friendSystem.field672 * -1736413869 == 1) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.friendSystem.friendsList.bm(-348042385);
                }
                return 1;
            }
            else if (3601 == n) {
                if (n2 != 1038224910) {
                    throw new IllegalStateException();
                }
                final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                Label_5264: {
                    if (!World.friendSystem.method420(-405500659)) {
                        break Label_5264;
                    }
                    if (n2 != 1038224910) {
                        throw new IllegalStateException();
                    }
                    if (n3 < 0) {
                        break Label_5264;
                    }
                    if (n2 != 1038224910) {
                        throw new IllegalStateException();
                    }
                    if (n3 >= World.friendSystem.friendsList.bm(1190824187)) {
                        break Label_5264;
                    }
                    if (n2 != 1038224910) {
                        throw new IllegalStateException();
                    }
                    final Friend friend = (Friend)UserList.pn(World.friendSystem.friendsList, n3, 963304822);
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = friend.bx(-238021346);
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = User.tg(friend, -43557433);
                    return 1;
                }
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                return 1;
            }
            else {
                if (n == 3602) {
                    final int n4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                    if (World.friendSystem.method420(730650293)) {
                        if (n2 != 1038224910) {
                            throw new IllegalStateException();
                        }
                        if (n4 >= 0 && n4 < World.friendSystem.friendsList.bm(1611004102)) {
                            if (n2 != 1038224910) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Buddy)UserList.pn(World.friendSystem.friendsList, n4, 882370308)).world * 177258591;
                            return 1;
                        }
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    return 1;
                }
                if (3603 == n) {
                    final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                    if (World.friendSystem.method420(654615523)) {
                        if (n2 != 1038224910) {
                            throw new IllegalStateException();
                        }
                        if (n5 >= 0) {
                            if (n2 != 1038224910) {
                                throw new IllegalStateException();
                            }
                            if (n5 < World.friendSystem.friendsList.bm(1236419289)) {
                                if (n2 != 1038224910) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Buddy)UserList.pn(World.friendSystem.friendsList, n5, 1924376358)).rank * 1922414955;
                                return 1;
                            }
                        }
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    return 1;
                }
                if (3604 == n) {
                    if (n2 != 1038224910) {
                        throw new IllegalStateException();
                    }
                    LoginScreenAnimation.method554(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)(-36));
                    return 1;
                }
                else {
                    if (3605 == n) {
                        World.friendSystem.addFriend(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], (byte)(-60));
                        return 1;
                    }
                    if (3606 == n) {
                        if (n2 != 1038224910) {
                            throw new IllegalStateException();
                        }
                        FriendSystem.ti(World.friendSystem, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], -1657474548);
                        return 1;
                    }
                    else {
                        if (n == 3607) {
                            FriendSystem.zz(World.friendSystem, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 42988923);
                            return 1;
                        }
                        if (n == 3608) {
                            if (n2 != 1038224910) {
                                throw new IllegalStateException();
                            }
                            World.friendSystem.removeIgnore(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], true, (byte)49);
                            return 1;
                        }
                        else if (n == 3609) {
                            if (n2 != 1038224910) {
                                throw new IllegalStateException();
                            }
                            final String method1953 = ModeWhere.method1953(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 1227239523);
                            final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                            final int n6 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                            boolean b2;
                            if (World.friendSystem.isFriended(new Username(method1953, class70.loginType), false, (byte)(-51))) {
                                if (n2 != 1038224910) {
                                    throw new IllegalStateException();
                                }
                                b2 = true;
                            }
                            else {
                                b2 = false;
                            }
                            interpreter_intStack[n6] = (b2 ? 1 : 0);
                            return 1;
                        }
                        else if (n == 3611) {
                            if (n2 != 1038224910) {
                                throw new IllegalStateException();
                            }
                            if (UserComparator5.friendsChat != null) {
                                if (n2 != 1038224910) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = UserComparator5.friendsChat.name;
                            }
                            else {
                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                            }
                            return 1;
                        }
                        else if (n == 3612) {
                            if (n2 != 1038224910) {
                                throw new IllegalStateException();
                            }
                            if (UserComparator5.friendsChat != null) {
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = UserComparator5.friendsChat.bm(1196697260);
                            }
                            else {
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                            }
                            return 1;
                        }
                        else if (n == 3613) {
                            if (n2 != 1038224910) {
                                throw new IllegalStateException();
                            }
                            final int n7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                            if (null != UserComparator5.friendsChat && n7 < UserComparator5.friendsChat.bm(1742835252)) {
                                if (n2 != 1038224910) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = UserList.pn(UserComparator5.friendsChat, n7, 534440360).getUsername(473993579).getName(-710264960);
                            }
                            else {
                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                            }
                            return 1;
                        }
                        else if (n == 3614) {
                            if (n2 != 1038224910) {
                                throw new IllegalStateException();
                            }
                            final int n8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                            if (UserComparator5.friendsChat != null && n8 < UserComparator5.friendsChat.bm(1290906441)) {
                                if (n2 != 1038224910) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Buddy.hn((Buddy)UserList.pn(UserComparator5.friendsChat, n8, -438427501), 129347781);
                            }
                            else {
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                            }
                            return 1;
                        }
                        else if (3615 == n) {
                            if (n2 != 1038224910) {
                                throw new IllegalStateException();
                            }
                            final int n9 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                            Label_2619: {
                                if (null == UserComparator5.friendsChat) {
                                    break Label_2619;
                                }
                                if (n2 != 1038224910) {
                                    throw new IllegalStateException();
                                }
                                if (n9 >= UserComparator5.friendsChat.bm(-957593587)) {
                                    break Label_2619;
                                }
                                if (n2 != 1038224910) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((Buddy)UserList.pn(UserComparator5.friendsChat, n9, 1925231499)).rank * 1922414955;
                                return 1;
                            }
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                            return 1;
                        }
                        else {
                            if (3616 == n) {
                                final int[] interpreter_intStack2 = Interpreter.Interpreter_intStack;
                                final int n10 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                byte minKick;
                                if (UserComparator5.friendsChat != null) {
                                    if (n2 != 1038224910) {
                                        throw new IllegalStateException();
                                    }
                                    minKick = UserComparator5.friendsChat.minKick;
                                }
                                else {
                                    minKick = 0;
                                }
                                interpreter_intStack2[n10] = minKick;
                                return 1;
                            }
                            if (3617 == n) {
                                if (n2 != 1038224910) {
                                    throw new IllegalStateException();
                                }
                                class478.clanKickUser(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], (byte)90);
                                return 1;
                            }
                            else if (3618 == n) {
                                if (n2 != 1038224910) {
                                    throw new IllegalStateException();
                                }
                                final int[] interpreter_intStack3 = Interpreter.Interpreter_intStack;
                                final int n11 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                int n12;
                                if (UserComparator5.friendsChat != null) {
                                    if (n2 != 1038224910) {
                                        throw new IllegalStateException();
                                    }
                                    n12 = 1788650387 * UserComparator5.friendsChat.rank;
                                }
                                else {
                                    n12 = 0;
                                }
                                interpreter_intStack3[n11] = n12;
                                return 1;
                            }
                            else if (3619 == n) {
                                if (n2 != 1038224910) {
                                    throw new IllegalStateException();
                                }
                                class379.Clan_joinChat(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 613256531);
                                return 1;
                            }
                            else if (3620 == n) {
                                if (n2 != 1038224910) {
                                    throw new IllegalStateException();
                                }
                                WorldMapData_0.Clan_leaveChat(1629805896);
                                return 1;
                            }
                            else if (3621 == n) {
                                if (n2 != 1038224910) {
                                    throw new IllegalStateException();
                                }
                                if (!World.friendSystem.method420(-172766100)) {
                                    if (n2 != 1038224910) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                }
                                else {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = World.friendSystem.ignoreList.bm(390898749);
                                }
                                return 1;
                            }
                            else {
                                if (3622 == n) {
                                    final int n13 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                    if (World.friendSystem.method420(-1722877690)) {
                                        if (n2 != 1038224910) {
                                            throw new IllegalStateException();
                                        }
                                        if (n13 >= 0) {
                                            if (n2 != 1038224910) {
                                                throw new IllegalStateException();
                                            }
                                            if (n13 < World.friendSystem.ignoreList.bm(1318332360)) {
                                                if (n2 != 1038224910) {
                                                    throw new IllegalStateException();
                                                }
                                                final Ignored ignored = (Ignored)UserList.pn(World.friendSystem.ignoreList, n13, 67332413);
                                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ignored.bx(-1576234334);
                                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = User.tg(ignored, -43557433);
                                                return 1;
                                            }
                                        }
                                    }
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                    return 1;
                                }
                                if (3623 == n) {
                                    if (n2 != 1038224910) {
                                        throw new IllegalStateException();
                                    }
                                    final String method1954 = ModeWhere.method1953(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], 1227239523);
                                    final int[] interpreter_intStack4 = Interpreter.Interpreter_intStack;
                                    final int n14 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                    boolean b3;
                                    if (World.friendSystem.isIgnored(new Username(method1954, class70.loginType), -754962431)) {
                                        if (n2 != 1038224910) {
                                            throw new IllegalStateException();
                                        }
                                        b3 = true;
                                    }
                                    else {
                                        b3 = false;
                                    }
                                    interpreter_intStack4[n14] = (b3 ? 1 : 0);
                                    return 1;
                                }
                                else if (n == 3624) {
                                    if (n2 != 1038224910) {
                                        throw new IllegalStateException();
                                    }
                                    final int n15 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                    Label_2259: {
                                        if (null == UserComparator5.friendsChat) {
                                            break Label_2259;
                                        }
                                        if (n2 != 1038224910) {
                                            throw new IllegalStateException();
                                        }
                                        if (n15 >= UserComparator5.friendsChat.bm(-352014483) || !UserList.pn(UserComparator5.friendsChat, n15, -240385906).getUsername(473993579).equals(MusicPatchNode.localPlayer.username)) {
                                            break Label_2259;
                                        }
                                        if (n2 != 1038224910) {
                                            throw new IllegalStateException();
                                        }
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                                        return 1;
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                    return 1;
                                }
                                else if (3625 == n) {
                                    if (n2 != 1038224910) {
                                        throw new IllegalStateException();
                                    }
                                    if (null != UserComparator5.friendsChat) {
                                        if (n2 != 1038224910) {
                                            throw new IllegalStateException();
                                        }
                                        if (UserComparator5.friendsChat.owner != null) {
                                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = UserComparator5.friendsChat.owner;
                                            return 1;
                                        }
                                    }
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                    return 1;
                                }
                                else if (3626 == n) {
                                    if (n2 != 1038224910) {
                                        throw new IllegalStateException();
                                    }
                                    final int n16 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                    if (null != UserComparator5.friendsChat) {
                                        if (n2 != 1038224910) {
                                            throw new IllegalStateException();
                                        }
                                        if (n16 < UserComparator5.friendsChat.bm(-1224051640)) {
                                            if (n2 != 1038224910) {
                                                throw new IllegalStateException();
                                            }
                                            if (((ClanMate)UserList.pn(UserComparator5.friendsChat, n16, 379318628)).isFriend(-1838290453)) {
                                                if (n2 != 1038224910) {
                                                    throw new IllegalStateException();
                                                }
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                                                return 1;
                                            }
                                        }
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                    return 1;
                                }
                                else if (3627 == n) {
                                    if (n2 != 1038224910) {
                                        throw new IllegalStateException();
                                    }
                                    final int n17 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                    if (UserComparator5.friendsChat != null) {
                                        if (n2 != 1038224910) {
                                            throw new IllegalStateException();
                                        }
                                        if (n17 < UserComparator5.friendsChat.bm(288578462) && ((ClanMate)UserList.pn(UserComparator5.friendsChat, n17, -407066307)).isIgnored(-1806675774)) {
                                            if (n2 != 1038224910) {
                                                throw new IllegalStateException();
                                            }
                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                                            return 1;
                                        }
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                    return 1;
                                }
                                else if (n == 3628) {
                                    if (n2 != 1038224910) {
                                        throw new IllegalStateException();
                                    }
                                    World.friendSystem.friendsList.ce(357528038);
                                    return 1;
                                }
                                else if (n == 3629) {
                                    if (n2 != 1038224910) {
                                        throw new IllegalStateException();
                                    }
                                    boolean b4;
                                    if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                        if (n2 != 1038224910) {
                                            throw new IllegalStateException();
                                        }
                                        b4 = true;
                                    }
                                    else {
                                        b4 = false;
                                    }
                                    World.friendSystem.friendsList.ci((Comparator)new UserComparator1(b4), (byte)78);
                                    return 1;
                                }
                                else if (n == 3630) {
                                    if (n2 != 1038224910) {
                                        throw new IllegalStateException();
                                    }
                                    boolean b5;
                                    if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                        if (n2 != 1038224910) {
                                            throw new IllegalStateException();
                                        }
                                        b5 = true;
                                    }
                                    else {
                                        b5 = false;
                                    }
                                    World.friendSystem.friendsList.ci((Comparator)new UserComparator2(b5), (byte)98);
                                    return 1;
                                }
                                else if (3631 == n) {
                                    if (n2 != 1038224910) {
                                        throw new IllegalStateException();
                                    }
                                    World.friendSystem.friendsList.ci((Comparator)new UserComparator3(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)99);
                                    return 1;
                                }
                                else {
                                    if (n == 3632) {
                                        World.friendSystem.friendsList.ci((Comparator)new UserComparator4(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)89);
                                        return 1;
                                    }
                                    if (n == 3633) {
                                        if (n2 != 1038224910) {
                                            throw new IllegalStateException();
                                        }
                                        boolean b6;
                                        if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                            if (n2 != 1038224910) {
                                                throw new IllegalStateException();
                                            }
                                            b6 = true;
                                        }
                                        else {
                                            b6 = false;
                                        }
                                        World.friendSystem.friendsList.ci((Comparator)new UserComparator5(b6), (byte)116);
                                        return 1;
                                    }
                                    else if (3634 == n) {
                                        if (n2 != 1038224910) {
                                            throw new IllegalStateException();
                                        }
                                        World.friendSystem.friendsList.ci((Comparator)new UserComparator6(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1), (byte)118);
                                        return 1;
                                    }
                                    else {
                                        if (n == 3635) {
                                            boolean b7;
                                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                if (n2 != 1038224910) {
                                                    throw new IllegalStateException();
                                                }
                                                b7 = true;
                                            }
                                            else {
                                                b7 = false;
                                            }
                                            World.friendSystem.friendsList.ci((Comparator)new UserComparator7(b7), (byte)75);
                                            return 1;
                                        }
                                        if (n == 3636) {
                                            if (n2 != 1038224910) {
                                                throw new IllegalStateException();
                                            }
                                            boolean b8;
                                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                if (n2 != 1038224910) {
                                                    throw new IllegalStateException();
                                                }
                                                b8 = true;
                                            }
                                            else {
                                                b8 = false;
                                            }
                                            World.friendSystem.friendsList.ci((Comparator)new UserComparator8(b8), (byte)65);
                                            return 1;
                                        }
                                        else if (n == 3637) {
                                            if (n2 != 1038224910) {
                                                throw new IllegalStateException();
                                            }
                                            boolean b9;
                                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                if (n2 != 1038224910) {
                                                    throw new IllegalStateException();
                                                }
                                                b9 = true;
                                            }
                                            else {
                                                b9 = false;
                                            }
                                            World.friendSystem.friendsList.ci((Comparator)new UserComparator9(b9), (byte)124);
                                            return 1;
                                        }
                                        else if (3638 == n) {
                                            if (n2 != 1038224910) {
                                                throw new IllegalStateException();
                                            }
                                            boolean b10;
                                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                if (n2 != 1038224910) {
                                                    throw new IllegalStateException();
                                                }
                                                b10 = true;
                                            }
                                            else {
                                                b10 = false;
                                            }
                                            World.friendSystem.friendsList.ci((Comparator)new UserComparator10(b10), (byte)115);
                                            return 1;
                                        }
                                        else if (n == 3639) {
                                            if (n2 != 1038224910) {
                                                throw new IllegalStateException();
                                            }
                                            UserList.ge(World.friendSystem.friendsList, (byte)28);
                                            return 1;
                                        }
                                        else if (3640 == n) {
                                            if (n2 != 1038224910) {
                                                throw new IllegalStateException();
                                            }
                                            World.friendSystem.ignoreList.ce(357528038);
                                            return 1;
                                        }
                                        else if (n == 3641) {
                                            if (n2 != 1038224910) {
                                                throw new IllegalStateException();
                                            }
                                            boolean b11;
                                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                if (n2 != 1038224910) {
                                                    throw new IllegalStateException();
                                                }
                                                b11 = true;
                                            }
                                            else {
                                                b11 = false;
                                            }
                                            World.friendSystem.ignoreList.ci((Comparator)new UserComparator1(b11), (byte)53);
                                            return 1;
                                        }
                                        else if (n == 3642) {
                                            if (n2 != 1038224910) {
                                                throw new IllegalStateException();
                                            }
                                            boolean b12;
                                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                if (n2 != 1038224910) {
                                                    throw new IllegalStateException();
                                                }
                                                b12 = true;
                                            }
                                            else {
                                                b12 = false;
                                            }
                                            World.friendSystem.ignoreList.ci((Comparator)new UserComparator2(b12), (byte)60);
                                            return 1;
                                        }
                                        else if (3643 == n) {
                                            if (n2 != 1038224910) {
                                                throw new IllegalStateException();
                                            }
                                            UserList.ge(World.friendSystem.ignoreList, (byte)(-93));
                                            return 1;
                                        }
                                        else {
                                            if (3644 == n) {
                                                if (UserComparator5.friendsChat != null) {
                                                    if (n2 != 1038224910) {
                                                        throw new IllegalStateException();
                                                    }
                                                    UserComparator5.friendsChat.ce(357528038);
                                                }
                                                return 1;
                                            }
                                            if (3645 == n) {
                                                if (n2 != 1038224910) {
                                                    throw new IllegalStateException();
                                                }
                                                boolean b13;
                                                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                    if (n2 != 1038224910) {
                                                        throw new IllegalStateException();
                                                    }
                                                    b13 = true;
                                                }
                                                else {
                                                    b13 = false;
                                                }
                                                final boolean b14 = b13;
                                                if (null != UserComparator5.friendsChat) {
                                                    if (n2 != 1038224910) {
                                                        throw new IllegalStateException();
                                                    }
                                                    UserComparator5.friendsChat.ci((Comparator)new UserComparator1(b14), (byte)99);
                                                }
                                                return 1;
                                            }
                                            else if (3646 == n) {
                                                if (n2 != 1038224910) {
                                                    throw new IllegalStateException();
                                                }
                                                final boolean b15 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                                                if (null != UserComparator5.friendsChat) {
                                                    if (n2 != 1038224910) {
                                                        throw new IllegalStateException();
                                                    }
                                                    UserComparator5.friendsChat.ci((Comparator)new UserComparator2(b15), (byte)18);
                                                }
                                                return 1;
                                            }
                                            else if (3647 == n) {
                                                if (n2 != 1038224910) {
                                                    throw new IllegalStateException();
                                                }
                                                boolean b16;
                                                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                    if (n2 != 1038224910) {
                                                        throw new IllegalStateException();
                                                    }
                                                    b16 = true;
                                                }
                                                else {
                                                    b16 = false;
                                                }
                                                final boolean b17 = b16;
                                                if (null != UserComparator5.friendsChat) {
                                                    if (n2 != 1038224910) {
                                                        throw new IllegalStateException();
                                                    }
                                                    UserComparator5.friendsChat.ci((Comparator)new UserComparator3(b17), (byte)30);
                                                }
                                                return 1;
                                            }
                                            else if (3648 == n) {
                                                if (n2 != 1038224910) {
                                                    throw new IllegalStateException();
                                                }
                                                final boolean b18 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                                                if (null != UserComparator5.friendsChat) {
                                                    UserComparator5.friendsChat.ci((Comparator)new UserComparator4(b18), (byte)21);
                                                }
                                                return 1;
                                            }
                                            else if (n == 3649) {
                                                if (n2 != 1038224910) {
                                                    throw new IllegalStateException();
                                                }
                                                boolean b19;
                                                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                    if (n2 != 1038224910) {
                                                        throw new IllegalStateException();
                                                    }
                                                    b19 = true;
                                                }
                                                else {
                                                    b19 = false;
                                                }
                                                final boolean b20 = b19;
                                                if (null != UserComparator5.friendsChat) {
                                                    UserComparator5.friendsChat.ci((Comparator)new UserComparator5(b20), (byte)101);
                                                }
                                                return 1;
                                            }
                                            else if (3650 == n) {
                                                if (n2 != 1038224910) {
                                                    throw new IllegalStateException();
                                                }
                                                boolean b21;
                                                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                    if (n2 != 1038224910) {
                                                        throw new IllegalStateException();
                                                    }
                                                    b21 = true;
                                                }
                                                else {
                                                    b21 = false;
                                                }
                                                final boolean b22 = b21;
                                                if (UserComparator5.friendsChat != null) {
                                                    if (n2 != 1038224910) {
                                                        throw new IllegalStateException();
                                                    }
                                                    UserComparator5.friendsChat.ci((Comparator)new UserComparator6(b22), (byte)8);
                                                }
                                                return 1;
                                            }
                                            else {
                                                if (n == 3651) {
                                                    final boolean b23 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                                                    if (UserComparator5.friendsChat != null) {
                                                        if (n2 != 1038224910) {
                                                            throw new IllegalStateException();
                                                        }
                                                        UserComparator5.friendsChat.ci((Comparator)new UserComparator7(b23), (byte)112);
                                                    }
                                                    return 1;
                                                }
                                                if (n == 3652) {
                                                    if (n2 != 1038224910) {
                                                        throw new IllegalStateException();
                                                    }
                                                    boolean b24;
                                                    if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                        if (n2 != 1038224910) {
                                                            throw new IllegalStateException();
                                                        }
                                                        b24 = true;
                                                    }
                                                    else {
                                                        b24 = false;
                                                    }
                                                    final boolean b25 = b24;
                                                    if (UserComparator5.friendsChat != null) {
                                                        UserComparator5.friendsChat.ci((Comparator)new UserComparator8(b25), (byte)106);
                                                    }
                                                    return 1;
                                                }
                                                else {
                                                    if (3653 == n) {
                                                        boolean b26;
                                                        if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                            if (n2 != 1038224910) {
                                                                throw new IllegalStateException();
                                                            }
                                                            b26 = true;
                                                        }
                                                        else {
                                                            b26 = false;
                                                        }
                                                        final boolean b27 = b26;
                                                        if (UserComparator5.friendsChat != null) {
                                                            if (n2 != 1038224910) {
                                                                throw new IllegalStateException();
                                                            }
                                                            UserComparator5.friendsChat.ci((Comparator)new UserComparator9(b27), (byte)33);
                                                        }
                                                        return 1;
                                                    }
                                                    if (3654 == n) {
                                                        if (n2 != 1038224910) {
                                                            throw new IllegalStateException();
                                                        }
                                                        final boolean b28 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                                                        if (UserComparator5.friendsChat != null) {
                                                            if (n2 != 1038224910) {
                                                                throw new IllegalStateException();
                                                            }
                                                            UserComparator5.friendsChat.ci((Comparator)new UserComparator10(b28), (byte)41);
                                                        }
                                                        return 1;
                                                    }
                                                    else if (n == 3655) {
                                                        if (n2 != 1038224910) {
                                                            throw new IllegalStateException();
                                                        }
                                                        if (UserComparator5.friendsChat != null) {
                                                            if (n2 != 1038224910) {
                                                                throw new IllegalStateException();
                                                            }
                                                            UserList.ge(UserComparator5.friendsChat, (byte)(-19));
                                                        }
                                                        return 1;
                                                    }
                                                    else {
                                                        if (n == 3656) {
                                                            boolean b29;
                                                            if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                                if (n2 != 1038224910) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                b29 = true;
                                                            }
                                                            else {
                                                                b29 = false;
                                                            }
                                                            World.friendSystem.friendsList.ci((Comparator)new BuddyRankComparator(b29), (byte)75);
                                                            return 1;
                                                        }
                                                        if (3657 != n) {
                                                            return 2;
                                                        }
                                                        if (n2 != 1038224910) {
                                                            throw new IllegalStateException();
                                                        }
                                                        boolean b30;
                                                        if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                                            if (n2 != 1038224910) {
                                                                throw new IllegalStateException();
                                                            }
                                                            b30 = true;
                                                        }
                                                        else {
                                                            b30 = false;
                                                        }
                                                        final boolean b31 = b30;
                                                        if (null != UserComparator5.friendsChat) {
                                                            if (n2 != 1038224910) {
                                                                throw new IllegalStateException();
                                                            }
                                                            UserComparator5.friendsChat.ci((Comparator)new BuddyRankComparator(b31), (byte)89);
                                                        }
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
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kk.bi(" + ')');
        }
    }
    
    public static void ai(final WorldMapAreaData worldMapAreaData, final Buffer buffer, final boolean b) {
        if (worldMapAreaData == null) {
            worldMapAreaData.cb(buffer, b);
        }
        worldMapAreaData.iconList = new LinkedList();
        for (int unsignedShort = buffer.readUnsignedShort(-2031356606), i = 0; i < unsignedShort; ++i) {
            final int method2516 = buffer.method2516(-28531776);
            final Coord coord = new Coord(buffer.readInt(-1211129751));
            final boolean b2 = Buffer.ra(buffer, (byte)7) == 1;
            if (b || !b2) {
                worldMapAreaData.iconList.add(new WorldMapIcon_0(null, coord, method2516, null));
            }
        }
    }
    
    void initIconsList(final Buffer buffer, final boolean b, final int n) {
        try {
            this.iconList = new LinkedList();
            for (int unsignedShort = buffer.readUnsignedShort(-1524494369), i = 0; i < unsignedShort; ++i) {
                if (n <= -1633313603) {
                    throw new IllegalStateException();
                }
                final int method2516 = buffer.method2516(1051942603);
                final Coord coord = new Coord(buffer.readInt(-1970417183));
                boolean b2;
                if (Buffer.ra(buffer, (byte)7) == 1) {
                    if (n <= -1633313603) {
                        return;
                    }
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                final boolean b3 = b2;
                if (!b) {
                    if (n <= -1633313603) {
                        return;
                    }
                    if (b3) {
                        continue;
                    }
                }
                this.iconList.add(new WorldMapIcon_0(null, coord, method2516, null));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kk.cg(" + ')');
        }
    }
    
    void cy(final Buffer buffer, final boolean b) {
        this.iconList = new LinkedList();
        for (int unsignedShort = buffer.readUnsignedShort(-2124907656), i = 0; i < unsignedShort; ++i) {
            final int method2516 = buffer.method2516(520955335);
            final Coord coord = new Coord(buffer.readInt(-938969125));
            final boolean b2 = Buffer.ra(buffer, (byte)7) == 1;
            if (b || !b2) {
                this.iconList.add(new WorldMapIcon_0(null, coord, method2516, null));
            }
        }
    }
    
    public static void gu(final Message message) {
        if (message == null) {
            message.ar();
        }
        message.isFromIgnored0 = TriBool.TriBool_unknown;
    }
    
    public static void vp(final WorldMapAreaData worldMapAreaData, final Buffer buffer, final boolean b) {
        if (worldMapAreaData == null) {
            worldMapAreaData.cb(buffer, b);
        }
        worldMapAreaData.iconList = new LinkedList();
        for (int unsignedShort = buffer.readUnsignedShort(35183519), i = 0; i < unsignedShort; ++i) {
            final int method2516 = buffer.method2516(1191960084);
            final Coord coord = new Coord(buffer.readInt(-1478364856));
            final boolean b2 = Buffer.ra(buffer, (byte)7) == 1;
            if (b || !b2) {
                worldMapAreaData.iconList.add(new WorldMapIcon_0(null, coord, method2516, null));
            }
        }
    }
    
    public static int yn(final WorldMapData_1 worldMapData_1) {
        return -1275112475 * worldMapData_1.chunkXLow;
    }
}
