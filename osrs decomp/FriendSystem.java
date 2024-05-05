import net.runelite.api.Ignore;
import net.runelite.api.Nameable;
import net.runelite.api.events.RemovedFriend;

// 
// Decompiled by Procyon v0.5.36
// 

public class FriendSystem
{
    static final int aw = 2;
    final LoginType loginType;
    static final int ai = 8;
    public final FriendsList friendsList;
    public final IgnoreList ignoreList;
    int field672;
    public static final int bq = 69;
    static final int an = 1;
    
    FriendSystem(final LoginType loginType) {
        this.field672 = 0;
        this.loginType = loginType;
        this.friendsList = new FriendsList(loginType);
        this.ignoreList = new IgnoreList(loginType);
    }
    
    final void bs(final String str) {
        if (str == null) {
            return;
        }
        final Username username = new Username(str, this.loginType);
        if (!username.hasCleanName(-407440907)) {
            return;
        }
        if (this.friendsListIsFull((byte)(-8))) {
            VerticalAlignment.method1036(Strings.gl, -1693545360);
            return;
        }
        if (MusicPatchNode.localPlayer.username.equals(username)) {
            class33.method143(-2032631645);
            return;
        }
        if (this.isFriended(username, false, (byte)5)) {
            VerticalAlignment.method1036(str + Strings.gz, -344204661);
            return;
        }
        if (this.isIgnored(username, -492789329)) {
            Message.method350(str, (byte)33);
            return;
        }
        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2519, Client.packetWriter.isaacCipher, (short)(-20753));
        packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(str, (byte)23), (byte)71);
        packetBufferNode.packetBuffer.ce(str, -2142591730);
        Client.packetWriter.addNode(packetBufferNode, 414135591);
    }
    
    final boolean ca() {
        return UserList.hl(this.ignoreList, -856455342) || (this.ignoreList.bm(-992155790) >= 100 && Client.isMembers * -1811511707 != 1);
    }
    
    final void ad() {
        this.field672 = 0;
        this.friendsList.bz(712428566);
        this.ignoreList.bz(469846421);
    }
    
    static final void ba(final String str) {
        VerticalAlignment.method1036(Strings.hu + str + Strings.hx, -672546987);
    }
    
    final void ae(final Buffer buffer, final int n) {
        this.friendsList.read(buffer, n, (byte)(-104));
        this.field672 = 337115647;
        for (int i = 0; i < Players.Players_count * -2010934433; ++i) {
            Client.players[Players.Players_indices[i]].updateIsInClanChat((byte)2);
        }
        GameEngine.setMaxCanvasSize(-40729760);
        if (null != UserComparator5.friendsChat) {
            UserComparator5.friendsChat.clearFriends(-1763715872);
        }
    }
    
    static final void method425() {
        VerticalAlignment.method1036(Strings.hm, -1099505189);
    }
    
    static int method425(final int n, final Script script, final boolean b, final int n2) {
        try {
            return 2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.ce(" + ')');
        }
    }
    
    static final void cl(final String s, final int n) {
        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2517, Client.packetWriter.isaacCipher, (short)(-17702));
        packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)83) + 1, (byte)103);
        packetBufferNode.packetBuffer.ce(s, -1874580942);
        packetBufferNode.packetBuffer.bf(n, (byte)88);
        Client.packetWriter.addNode(packetBufferNode, 414135591);
    }
    
    final boolean cn() {
        return UserList.hl(this.ignoreList, 261050883) || (this.ignoreList.bm(868789551) >= 74579948 && Client.isMembers * -1811511707 != 1);
    }
    
    final void bw(final String s) {
        if (s == null) {
            return;
        }
        final Username username = new Username(s, this.loginType);
        if (!username.hasCleanName(332178756)) {
            return;
        }
        if (this.canAddIgnore(-300357261)) {
            VerticalAlignment.method1036(Strings.hw, -890526596);
            return;
        }
        if (MusicPatchNode.localPlayer.username.equals(username)) {
            GrandExchangeOfferOwnWorldComparator.method364(1883416197);
            return;
        }
        if (this.isIgnored(username, -1709144580)) {
            VerticalAlignment.method1036(s + Strings.hi, -1478804117);
            return;
        }
        if (this.isFriended(username, false, (byte)17)) {
            VerticalAlignment.method1036(Strings.hd + s + Strings.hv, -1545132114);
            return;
        }
        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2485, Client.packetWriter.isaacCipher, (short)(-335));
        packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)(-13)), (byte)2);
        packetBufferNode.packetBuffer.ce(s, -2037574224);
        Client.packetWriter.addNode(packetBufferNode, 414135591);
    }
    
    static final void cf(final String s, final int n) {
        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2517, Client.packetWriter.isaacCipher, (short)(-20918));
        packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)(-68)) + 1, (byte)13);
        packetBufferNode.packetBuffer.ce(s, -1877062299);
        packetBufferNode.packetBuffer.bf(n, (byte)110);
        Client.packetWriter.addNode(packetBufferNode, 414135591);
    }
    
    final boolean friendsListIsFull(final byte b) {
        try {
            if (!UserList.hl(this.friendsList, -1264370893)) {
                if (this.friendsList.bm(-1739649201) >= 200) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    if (-1811511707 * Client.isMembers != 1) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.ao(" + ')');
        }
    }
    
    boolean ak() {
        return -1736413869 * this.field672 == 2;
    }
    
    public final void removeIgnore(final String s, final boolean b, final byte b2) {
        this.eo(s, b);
        try {
            if (s == null) {
                if (b2 >= 84) {
                    throw new IllegalStateException();
                }
            }
            else {
                final Username username = new Username(s, this.loginType);
                if (username.hasCleanName(-1377823954)) {
                    if (this.ignoreList.br(username, (short)(-24190))) {
                        if (b2 >= 84) {
                            throw new IllegalStateException();
                        }
                        Client.field557 = 1831095645 * Client.cycleCntr;
                        if (b) {
                            if (b2 >= 84) {
                                throw new IllegalStateException();
                            }
                            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2478, Client.packetWriter.isaacCipher, (short)(-16123));
                            packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)(-6)), (byte)63);
                            packetBufferNode.packetBuffer.ce(s, -1814706581);
                            Client.packetWriter.addNode(packetBufferNode, 414135591);
                        }
                    }
                    Login.FriendSystem_invalidateIgnoreds(-681433942);
                    return;
                }
                if (b2 >= 84) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.av(" + ')');
        }
    }
    
    final void be() {
        this.field672 = 407527131;
    }
    
    public static void hc(final FriendSystem friendSystem, final String s) {
        if (friendSystem == null) {
            friendSystem.bw(s);
            return;
        }
        if (s == null) {
            return;
        }
        final Username username = new Username(s, friendSystem.loginType);
        if (!username.hasCleanName(1268308647)) {
            return;
        }
        if (friendSystem.friendsList.br(username, (short)19)) {
            Client.field557 = Client.cycleCntr * -503218810;
            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2560, Client.packetWriter.isaacCipher, (short)(-1129));
            packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)39), (byte)44);
            packetBufferNode.packetBuffer.ce(s, -1922138060);
            Client.packetWriter.addNode(packetBufferNode, 414135591);
        }
        for (int i = 0; i < -2010934433 * Players.Players_count; ++i) {
            Client.players[Players.Players_indices[i]].updateIsInClanChat((byte)2);
        }
        GameEngine.setMaxCanvasSize(-1009151057);
        if (UserComparator5.friendsChat != null) {
            UserComparator5.friendsChat.clearFriends(-1997846375);
        }
    }
    
    boolean as() {
        return -1736413869 * this.field672 == 2;
    }
    
    final void az() {
        for (FriendLoginUpdate friendLoginUpdate = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); null != friendLoginUpdate; friendLoginUpdate = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
            if (friendLoginUpdate.field3722 * 761297005 < class96.clockNow(358111450) / 1000L - 5L) {
                if (friendLoginUpdate.worldId > 0) {
                    UserComparator5.addGameMessage(5, "", friendLoginUpdate.friendUsername + Strings.ge, -397121414);
                }
                if (friendLoginUpdate.worldId == 0) {
                    UserComparator5.addGameMessage(5, "", friendLoginUpdate.friendUsername + Strings.ga, -397121414);
                }
                friendLoginUpdate.af();
            }
        }
    }
    
    final void addIgnore(final String s, final int n) {
        this.qw(s);
        try {
            if (s == null) {
                if (n >= -276182109) {
                    throw new IllegalStateException();
                }
            }
            else {
                final Username username = new Username(s, this.loginType);
                if (username.hasCleanName(1850556269)) {
                    if (this.friendsList.br(username, (short)(-21153))) {
                        if (n >= -276182109) {
                            return;
                        }
                        Client.camAngleDY = Client.field416 * 1831095645;
                        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2524, Client.packetWriter.isaacCipher, (short)(-1332));
                        packetBufferNode.packetBuffer.writeShortAddLE(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)(-61)), (byte)126);
                        packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(s, -1614111750);
                        Client.packetWriter.addNode(packetBufferNode, 414135591);
                    }
                    for (int i = 0; i < -2010934433 * Players.Players_pendingUpdateCount; ++i) {
                        if (n >= -276182109) {
                            throw new IllegalStateException();
                        }
                        Client.players[Players.Players_orientations[i]].checkIsFriend((byte)2);
                    }
                    GameEngine.setMaxCanvasSize(330254679);
                    if (UserComparator5.friendsChat != null) {
                        if (n >= -276182109) {
                            throw new IllegalStateException();
                        }
                        UserComparator5.friendsChat.clearFriends(-1997832771);
                    }
                    return;
                }
                if (n >= -276182109) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.ah(" + ')');
        }
    }
    
    final void bi() {
        this.field672 = 407527131;
    }
    
    static final void bv() {
        VerticalAlignment.method1036(Strings.hj, -1302470200);
    }
    
    public static void ti(final FriendSystem friendSystem, final String s, final int n) {
        if (friendSystem == null) {
            friendSystem.removeFriend(s, n);
            return;
        }
        friendSystem.qw(s);
        try {
            if (s == null) {
                if (n >= -276182109) {
                    throw new IllegalStateException();
                }
            }
            else {
                final Username username = new Username(s, friendSystem.loginType);
                if (username.hasCleanName(1850556269)) {
                    if (friendSystem.friendsList.br(username, (short)(-21153))) {
                        if (n >= -276182109) {
                            return;
                        }
                        Client.field557 = Client.cycleCntr * 1831095645;
                        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2560, Client.packetWriter.isaacCipher, (short)(-1332));
                        packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)(-61)), (byte)126);
                        packetBufferNode.packetBuffer.ce(s, -1614111750);
                        Client.packetWriter.addNode(packetBufferNode, 414135591);
                    }
                    for (int i = 0; i < -2010934433 * Players.Players_count; ++i) {
                        if (n >= -276182109) {
                            throw new IllegalStateException();
                        }
                        Client.players[Players.Players_indices[i]].updateIsInClanChat((byte)2);
                    }
                    GameEngine.setMaxCanvasSize(330254679);
                    if (UserComparator5.friendsChat != null) {
                        if (n >= -276182109) {
                            throw new IllegalStateException();
                        }
                        UserComparator5.friendsChat.clearFriends(-1997832771);
                    }
                    return;
                }
                if (n >= -276182109) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.ah(" + ')');
        }
    }
    
    final boolean bp() {
        return UserList.hl(this.friendsList, -1280281340) || (this.friendsList.bm(-544887583) >= -461648002 && -387206488 * Client.isMembers != 1);
    }
    
    final boolean cc() {
        return UserList.hl(this.ignoreList, 1027398481) || (this.ignoreList.bm(-178421347) >= 1577289744 && Client.isMembers * -340228979 != 1);
    }
    
    final boolean bt(final Username username) {
        return null != username && this.ignoreList.bt(username, -1751528026);
    }
    
    public boolean ws(final Username username, final boolean b) {
        return this.isFriended(username, b, (byte)(-51));
    }
    
    static final void br(final String s) {
        UserComparator5.addGameMessage(30, "", s, -397121414);
    }
    
    static final void ci() {
        VerticalAlignment.method1036(Strings.hm, 10090924);
    }
    
    final void readUpdate(final Buffer buffer, final int n, final int n2) {
        try {
            this.friendsList.read(buffer, n, (byte)(-80));
            this.field672 = 815054262;
            for (int i = 0; i < Players.Players_count * -2010934433; ++i) {
                if (n2 == 1524649042) {
                    return;
                }
                Client.players[Players.Players_indices[i]].updateIsInClanChat((byte)2);
            }
            GameEngine.setMaxCanvasSize(1687674321);
            if (null != UserComparator5.friendsChat) {
                if (n2 == 1524649042) {
                    throw new IllegalStateException();
                }
                UserComparator5.friendsChat.clearFriends(-1667948273);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.aw(" + ')');
        }
    }
    
    final boolean isFriendAndHasWorld(final Username username, final int n) {
        try {
            if (null == username) {
                if (n >= 1552863327) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                if (!this.ignoreList.bt(username, -958577890)) {
                    return false;
                }
                if (n >= 1552863327) {
                    throw new IllegalStateException();
                }
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.aq(" + ')');
        }
    }
    
    final void addFriend(final String str, final byte b) {
        try {
            if (str == null) {
                return;
            }
            final Username username = new Username(str, this.loginType);
            if (!username.hasCleanName(-1265114445)) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
            }
            else if (this.friendsListIsFull((byte)(-57))) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                VerticalAlignment.method1036(Strings.gl, -504948756);
            }
            else if (MusicPatchNode.localPlayer.username.equals(username)) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                class33.method143(-2064360869);
            }
            else if (this.isFriended(username, false, (byte)(-12))) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                VerticalAlignment.method1036(str + Strings.gz, -1014397667);
            }
            else {
                if (!this.isIgnored(username, -873974238)) {
                    final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2519, Client.packetWriter.isaacCipher, (short)(-25837));
                    packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(str, (byte)(-12)), (byte)88);
                    packetBufferNode.packetBuffer.ce(str, -2143999221);
                    Client.packetWriter.addNode(packetBufferNode, 414135591);
                    return;
                }
                if (b >= 1) {
                    return;
                }
                Message.method350(str, (byte)33);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.al(" + ')');
        }
    }
    
    public static boolean et(final FriendSystem friendSystem, final Username username) {
        if (friendSystem == null) {
            return friendSystem.cg(username);
        }
        return null != username && friendSystem.ignoreList.bt(username, -930013353);
    }
    
    final void cu(final String s) {
        if (s == null) {
            return;
        }
        final Username username = new Username(s, this.loginType);
        if (!username.hasCleanName(-1542412711)) {
            return;
        }
        if (this.friendsList.br(username, (short)(-12121))) {
            Client.field557 = Client.cycleCntr * 1831095645;
            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2560, Client.packetWriter.isaacCipher, (short)(-21828));
            packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)6), (byte)94);
            packetBufferNode.packetBuffer.ce(s, -1565196508);
            Client.packetWriter.addNode(packetBufferNode, 414135591);
        }
        for (int i = 0; i < -2010934433 * Players.Players_count; ++i) {
            Client.players[Players.Players_indices[i]].updateIsInClanChat((byte)2);
        }
        GameEngine.setMaxCanvasSize(-370101015);
        if (UserComparator5.friendsChat != null) {
            UserComparator5.friendsChat.clearFriends(-1196943931);
        }
    }
    
    public IgnoreList cu() {
        return this.ignoreList;
    }
    
    public boolean zh(final Username username) {
        return this.isIgnored(username, -1193559293);
    }
    
    final void method411(final byte b) {
        try {
            this.field672 = 407527131;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.an(" + ')');
        }
    }
    
    final void processFriendUpdates(final int n) {
        try {
            for (FriendLoginUpdate friendLoginUpdate = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); null != friendLoginUpdate; friendLoginUpdate = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
                if (n != 1673735823) {
                    throw new IllegalStateException();
                }
                if (friendLoginUpdate.field3722 * 761297005 < class96.clockNow(1490835045) / 1000L - 5L) {
                    if (n != 1673735823) {
                        throw new IllegalStateException();
                    }
                    if (friendLoginUpdate.worldId > 0) {
                        if (n != 1673735823) {
                            throw new IllegalStateException();
                        }
                        UserComparator5.addGameMessage(5, "", friendLoginUpdate.friendUsername + Strings.ge, -397121414);
                    }
                    if (friendLoginUpdate.worldId == 0) {
                        if (n != 1673735823) {
                            throw new IllegalStateException();
                        }
                        UserComparator5.addGameMessage(5, "", friendLoginUpdate.friendUsername + Strings.ga, -397121414);
                    }
                    friendLoginUpdate.af();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.ac(" + ')');
        }
    }
    
    public static boolean nk(final FriendSystem friendSystem) {
        return UserList.hl(friendSystem.ignoreList, -261214081) || (friendSystem.ignoreList.bm(-227143221) >= 100 && Client.isMembers * -1811511707 != 1);
    }
    
    static final void bq(final String str) {
        VerticalAlignment.method1036(Strings.hu + str + Strings.hx, -1587819500);
    }
    
    public static void gk(final FriendSystem friendSystem, final String str) {
        if (friendSystem == null) {
            friendSystem.aj();
        }
        if (str == null) {
            return;
        }
        final Username username = new Username(str, friendSystem.loginType);
        if (!username.hasCleanName(1191940503)) {
            return;
        }
        if (friendSystem.friendsListIsFull((byte)(-37))) {
            VerticalAlignment.method1036(Strings.gl, -1441945379);
            return;
        }
        if (MusicPatchNode.localPlayer.username.equals(username)) {
            class33.method143(-2093770446);
            return;
        }
        if (friendSystem.isFriended(username, false, (byte)(-32))) {
            VerticalAlignment.method1036(str + Strings.gz, -1762006006);
            return;
        }
        if (friendSystem.isIgnored(username, 136488303)) {
            Message.method350(str, (byte)33);
            return;
        }
        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2519, Client.packetWriter.isaacCipher, (short)(-11952));
        packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(str, (byte)(-50)), (byte)112);
        packetBufferNode.packetBuffer.ce(str, -1553226803);
        Client.packetWriter.addNode(packetBufferNode, 414135591);
    }
    
    final void clear(final byte b) {
        try {
            this.field672 = 0;
            this.friendsList.bz(-451237625);
            this.ignoreList.bz(735835820);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.au(" + ')');
        }
    }
    
    public static void jc(final Buffer buffer, final boolean b) {
        if (buffer == null) {
            buffer.bm();
        }
        buffer.writeShort(b ? 1 : 0, (byte)37);
    }
    
    final boolean bh() {
        return UserList.hl(this.friendsList, -1030983634) || (this.friendsList.bm(403776149) >= 200 && -1811511707 * Client.isMembers != 1);
    }
    
    final void by(final Buffer buffer, final int n) {
        this.friendsList.read(buffer, n, (byte)0);
        this.field672 = -24228764;
        for (int i = 0; i < Players.Players_count * -2010934433; ++i) {
            Client.players[Players.Players_indices[i]].updateIsInClanChat((byte)2);
        }
        GameEngine.setMaxCanvasSize(-1468724872);
        if (null != UserComparator5.friendsChat) {
            UserComparator5.friendsChat.clearFriends(-1424121629);
        }
    }
    
    final void ap(final Buffer buffer, final int n) {
        this.friendsList.read(buffer, n, (byte)(-14));
        this.field672 = 815054262;
        for (int i = 0; i < Players.Players_count * -2010934433; ++i) {
            Client.players[Players.Players_indices[i]].updateIsInClanChat((byte)2);
        }
        GameEngine.setMaxCanvasSize(-1940974480);
        if (null != UserComparator5.friendsChat) {
            UserComparator5.friendsChat.clearFriends(-1334739652);
        }
    }
    
    public final void cm(final String s, final boolean b) {
        if (s == null) {
            return;
        }
        final Username username = new Username(s, this.loginType);
        if (!username.hasCleanName(1578411814)) {
            return;
        }
        if (this.ignoreList.br(username, (short)(-32492))) {
            Client.field557 = 1831095645 * Client.cycleCntr;
            if (b) {
                final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2478, Client.packetWriter.isaacCipher, (short)(-6824));
                packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)(-33)), (byte)95);
                packetBufferNode.packetBuffer.ce(s, -2096922290);
                Client.packetWriter.addNode(packetBufferNode, 414135591);
            }
        }
        Login.FriendSystem_invalidateIgnoreds(-681433942);
    }
    
    static final void bg(final String s) {
        UserComparator5.addGameMessage(30, "", s, -397121414);
    }
    
    public FriendsList kb() {
        return this.friendsList;
    }
    
    final boolean cg(final Username username) {
        return null != username && this.ignoreList.bt(username, 1609382442);
    }
    
    public static void gh(final FriendSystem friendSystem, final byte b) {
        if (friendSystem == null) {
            friendSystem.method411(b);
            return;
        }
        try {
            friendSystem.field672 = 407527131;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.an(" + ')');
        }
    }
    
    boolean method420(final int n) {
        try {
            boolean b;
            if (-1736413869 * this.field672 == 2) {
                if (n == -446469085) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.af(" + ')');
        }
    }
    
    final boolean isFriended(final Username username, final boolean b, final byte b2) {
        try {
            if (null == username) {
                if (b2 >= 32) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                if (!username.equals(MusicPatchNode.localPlayer.username)) {
                    return this.friendsList.isFriended(username, b, -605757932);
                }
                if (b2 >= 32) {
                    throw new IllegalStateException();
                }
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.ab(" + ')');
        }
    }
    
    final boolean isIgnored(final Username username, final int n) {
        try {
            if (null == username) {
                if (n >= 1552863327) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                if (!this.ignoreList.bt(username, -958577890)) {
                    return false;
                }
                if (n >= 1552863327) {
                    throw new IllegalStateException();
                }
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.aq(" + ')');
        }
    }
    
    boolean aj() {
        return -1736413869 * this.field672 == 2;
    }
    
    final boolean canAddIgnore(final int n) {
        try {
            if (!UserList.hl(this.ignoreList, 1919425669)) {
                if (this.ignoreList.bm(-905179003) >= 100) {
                    if (n != -300357261) {
                        throw new IllegalStateException();
                    }
                    if (Client.isMembers * -1811511707 != 1) {
                        if (n != -300357261) {
                            throw new IllegalStateException();
                        }
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.ag(" + ')');
        }
    }
    
    static final void bl() {
        VerticalAlignment.method1036(Strings.hj, 140442610);
    }
    
    final boolean bz(final Username username, final boolean b) {
        return null != username && (username.equals(MusicPatchNode.localPlayer.username) || this.friendsList.isFriended(username, b, -944366012));
    }
    
    final boolean bj(final Username username) {
        final Friend friend = (Friend)UserList.uz(this.friendsList, username, 1089936727);
        return null != friend && Buddy.ro(friend, -1895769488);
    }
    
    public void qw(final String s) {
        final net.runelite.api.Friend friend = (net.runelite.api.Friend)this.kb().findByName(s);
        if (friend != null) {
            ScriptFrame.client.getCallbacks().post((Object)new RemovedFriend((Nameable)friend));
        }
    }
    
    public static boolean vf(final FriendSystem friendSystem, final Username username, final boolean b) {
        if (friendSystem == null) {
            friendSystem.ad();
        }
        return null != username && (username.equals(MusicPatchNode.localPlayer.username) || friendSystem.friendsList.isFriended(username, b, -172319643));
    }
    
    public static boolean zx(final FriendSystem friendSystem) {
        return UserList.hl(friendSystem.friendsList, -807400597) || (friendSystem.friendsList.bm(-1057967301) >= 1087683640 && -1811511707 * Client.isMembers != 1);
    }
    
    public static void zz(final FriendSystem friendSystem, final String s, final int n) {
        if (friendSystem == null) {
            friendSystem.addIgnore(s, n);
            return;
        }
        try {
            if (s == null) {
                if (n != 42988923) {
                    return;
                }
            }
            else {
                final Username username = new Username(s, friendSystem.loginType);
                if (!username.hasCleanName(-340224107)) {
                    if (n != 42988923) {
                        throw new IllegalStateException();
                    }
                }
                else if (friendSystem.canAddIgnore(-300357261)) {
                    if (n != 42988923) {
                        throw new IllegalStateException();
                    }
                    VerticalAlignment.method1036(Strings.hw, -1941555027);
                }
                else {
                    if (MusicPatchNode.localPlayer.username.equals(username)) {
                        GrandExchangeOfferOwnWorldComparator.method364(1294656591);
                        return;
                    }
                    if (friendSystem.isIgnored(username, -576047710)) {
                        if (n != 42988923) {
                            throw new IllegalStateException();
                        }
                        VerticalAlignment.method1036(s + Strings.hi, -1222570104);
                    }
                    else {
                        if (!friendSystem.isFriended(username, false, (byte)(-115))) {
                            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2485, Client.packetWriter.isaacCipher, (short)(-23156));
                            packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)(-26)), (byte)121);
                            packetBufferNode.packetBuffer.ce(s, -1693499307);
                            Client.packetWriter.addNode(packetBufferNode, 414135591);
                            return;
                        }
                        if (n != 42988923) {
                            throw new IllegalStateException();
                        }
                        VerticalAlignment.method1036(Strings.hd + s + Strings.hv, -1134522390);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.ax(" + ')');
        }
    }
    
    public static int zq(final class27 class27, final char c) {
        if (class27 == null) {
            return class27.am(c);
        }
        if (class27.dz(class27, c, 944330166)) {
            return class27.field82[c];
        }
        return 0;
    }
    
    final void cq(final String s) {
        if (s == null) {
            return;
        }
        final Username username = new Username(s, this.loginType);
        if (!username.hasCleanName(-1209749932)) {
            return;
        }
        if (this.friendsList.br(username, (short)(-3756))) {
            Client.field557 = Client.cycleCntr * 1831095645;
            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2560, Client.packetWriter.isaacCipher, (short)(-9064));
            packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)32), (byte)52);
            packetBufferNode.packetBuffer.ce(s, -1901291068);
            Client.packetWriter.addNode(packetBufferNode, 414135591);
        }
        for (int i = 0; i < -2010934433 * Players.Players_count; ++i) {
            Client.players[Players.Players_indices[i]].updateIsInClanChat((byte)2);
        }
        GameEngine.setMaxCanvasSize(-46177883);
        if (UserComparator5.friendsChat != null) {
            UserComparator5.friendsChat.clearFriends(-1649003068);
        }
    }
    
    final boolean bm(final Username username, final boolean b) {
        return null != username && (username.equals(MusicPatchNode.localPlayer.username) || this.friendsList.isFriended(username, b, -864080385));
    }
    
    final boolean bk(final Username username, final boolean b) {
        return null != username && (username.equals(MusicPatchNode.localPlayer.username) || this.friendsList.isFriended(username, b, -908414098));
    }
    
    public void eo(final String s, final boolean b) {
        final Ignore ignore = (Ignore)this.cu().findByName(s);
        if (ignore != null) {
            ScriptFrame.client.getCallbacks().post((Object)new RemovedFriend((Nameable)ignore));
        }
    }
    
    final void removeFriend(final String s, final int n) {
        this.qw(s);
        try {
            if (s == null) {
                if (n >= -276182109) {
                    throw new IllegalStateException();
                }
            }
            else {
                final Username username = new Username(s, this.loginType);
                if (username.hasCleanName(1850556269)) {
                    if (this.friendsList.br(username, (short)(-21153))) {
                        if (n >= -276182109) {
                            return;
                        }
                        Client.lastMouseRecordX = Client.field433 * 1831095645;
                        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher, (short)(-1332));
                        packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)(-61)), (byte)126);
                        packetBufferNode.packetBuffer.ce(s, -1614111750);
                        Client.packetWriter.addNode(packetBufferNode, 414135591);
                    }
                    for (int i = 0; i < -2010934433 * Players.Players_count; ++i) {
                        if (n >= -276182109) {
                            throw new IllegalStateException();
                        }
                        Client.players[Players.Players_indices[i]].checkIsFriend((byte)2);
                    }
                    GameEngine.setMaxCanvasSize(330254679);
                    if (UserComparator5.friendsChat != null) {
                        if (n >= -276182109) {
                            throw new IllegalStateException();
                        }
                        UserComparator5.friendsChat.clearFriends(-1997832771);
                    }
                    return;
                }
                if (n >= -276182109) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.ah(" + ')');
        }
    }
    
    public static boolean zm(final FriendSystem friendSystem, final Username username, final int n) {
        if (friendSystem == null) {
            friendSystem.isFriendAndHasWorld(username, n);
        }
        try {
            final Friend friend = (Friend)UserList.uz(friendSystem.friendsList, username, 1349374785);
            boolean b;
            if (null != friend && Buddy.ro(friend, -1103584997)) {
                if (n >= -1769112045) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cg.am(" + ')');
        }
    }
    
    public static void pz(final StructComposition structComposition, final Buffer buffer, final int n) {
        if (structComposition == null) {
            structComposition.getIntValue(n);
        }
        if (n == 249) {
            structComposition.params = ChatChannel.addMessage(buffer, structComposition.params, (byte)(-11));
        }
    }
    
    static final void bf(final String s) {
        UserComparator5.addGameMessage(30, "", s, -397121414);
    }
    
    static final void bu(final String s) {
        UserComparator5.addGameMessage(30, "", s, -397121414);
    }
}
