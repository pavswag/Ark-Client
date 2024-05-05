import net.runelite.api.SkullIcon;
import java.util.ArrayList;
import java.awt.Polygon;
import net.runelite.api.HeadIcon;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import java.awt.Shape;
import net.runelite.api.events.PlayerChanged;
import java.util.Iterator;
import net.runelite.api.events.AnimationChanged;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Player extends Actor implements net.runelite.api.Player
{
    TriBool isFriendTriBool;
    int skillLevel;
    int baseTileHeight;
    int minY;
    static final int ab = 3;
    Username username;
    int headIconPk;
    int maxX;
    int tileHeight;
    int animationCycleStart;
    int animationCycleEnd;
    int field899;
    boolean isUnanimated;
    PlayerComposition appearance;
    Model attachedModel;
    int field903;
    int minX;
    int maxY;
    int combatLevel;
    String[] actions;
    int team;
    boolean isHidden;
    int plane;
    int index;
    int headIconPrayer;
    TriBool isInFriendsChat;
    TriBool isInClanChat;
    boolean hasMovementPending;
    int tileX;
    int tileY;
    
    public String getName() {
        final Username ab = this.ab();
        if (ab == null) {
            return null;
        }
        final String wu = ab.wu();
        if (wu == null) {
            return null;
        }
        return wu.replace(' ', ' ');
    }
    
    Player() {
        this.headIconPk = -1162421511;
        this.headIconPrayer = 914676177;
        this.actions = new String[3];
        for (int i = 0; i < 3; ++i) {
            this.actions[i] = "";
        }
        this.combatLevel = 0;
        this.skillLevel = 0;
        this.animationCycleStart = 0;
        this.animationCycleEnd = 0;
        this.isUnanimated = false;
        this.team = 0;
        this.isHidden = false;
        this.isFriendTriBool = TriBool.TriBool_unknown;
        this.isInFriendsChat = TriBool.TriBool_unknown;
        this.isInClanChat = TriBool.TriBool_unknown;
        this.hasMovementPending = false;
    }
    
    boolean cs() {
        if (this.isInClanChat == TriBool.TriBool_unknown) {
            this.updateIsInFriendsChat((byte)(-98));
        }
        return this.isInClanChat == TriBool.TriBool_true;
    }
    
    void bs() {
        this.isInFriendsChat = TriBool.TriBool_unknown;
    }
    
    int ca() {
        if (this.appearance != null && -1 != -2131733097 * this.appearance.field2831) {
            return AbstractArchive.getNpcDefinition(1396787240 * this.appearance.field2831, (byte)(-25)).size * 828317312;
        }
        return 1;
    }
    
    boolean ae() {
        if (this.isFriendTriBool == TriBool.TriBool_unknown) {
            this.clearIsFriend((byte)28);
        }
        return this.isFriendTriBool == TriBool.TriBool_true;
    }
    
    final void cr(final int n, final int n2, final MoveSpeed moveSpeed) {
        if (this.cb * 1134756167 < 9) {
            this.cb += 400971895;
        }
        for (int i = 1134756167 * this.cb; i > 0; --i) {
            this.cf[i] = this.cf[i - 1];
            this.dy[i] = this.dy[i - 1];
            this.da[i] = this.da[i - 1];
        }
        this.cf[0] = n;
        this.dy[0] = n2;
        this.da[0] = moveSpeed;
    }
    
    void ce() {
        this.isInClanChat = TriBool.TriBool_unknown;
    }
    
    void bb() {
        this.isFriendTriBool = TriBool.TriBool_unknown;
    }
    
    void cl(final int n, final int n2) {
        this.cb = 0;
        this.dk = 0;
        this.bc = 0;
        this.cf[0] = n;
        this.dy[0] = n2;
        final int transformedSize = this.transformedSize((byte)(-80));
        this.br = -1102445696 * this.cf[0] + 478936340 * transformedSize;
        this.ep = transformedSize * -1815504847 + -171358884 * this.dy[0];
    }
    
    public int getId() {
        return this.index * -1232170701;
    }
    
    void bw() {
        this.isInClanChat = TriBool.TriBool_unknown;
    }
    
    final void cf(final int n, final int n2, final MoveSpeed moveSpeed) {
        if (super.field975 * -1372355773 != -1 && ItemContainer.SpotAnimationDefinition_get(-1007015736 * super.recolourEndCycle, (byte)98).forcedPriority * -1783292256 == 1) {
            super.movementSequence = 1590035220;
        }
        this.method533(-2143782261);
        if (n < 0 || n >= 104 || n2 < 0 || n2 >= 104) {
            this.resetPath(n, n2, -970599363);
        }
        else if (super.hitSplatCycles[0] >= 0 && super.hitSplatValues2[0] < 928821171 && this.dy[0] >= 0 && super.hitSplatValues[0] < 104) {
            if (MoveSpeed.RUN == moveSpeed) {
                Decimator.method325(this, n, n2, MoveSpeed.STATIONARY, -1796483670);
            }
            this.method513(n, n2, moveSpeed, 475560620);
        }
        else {
            this.resetPath(n, n2, -1939289893);
        }
    }
    
    @Override
    final boolean cv() {
        return this.appearance != null;
    }
    
    void updateIsInFriendsChat(final byte b) {
        try {
            for (int i = 0; i < 4; ++i) {
                if (Client.currentClanSettings[i] != null) {
                    if (b >= 8) {
                        throw new IllegalStateException();
                    }
                    if (Client.currentClanSettings[i].method851(this.username.getName(-710264960), (byte)55) != -1) {
                        if (b >= 8) {
                            throw new IllegalStateException();
                        }
                        if (2 != i) {
                            if (b >= 8) {
                                throw new IllegalStateException();
                            }
                            this.isInClanChat = TriBool.TriBool_true;
                            return;
                        }
                    }
                }
            }
            this.isInClanChat = TriBool.TriBool_false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.ax(" + ')');
        }
    }
    
    public static boolean sj(final Player player) {
        if (player.isFriendTriBool == TriBool.TriBool_unknown) {
            player.clearIsFriend((byte)77);
        }
        return player.isFriendTriBool == TriBool.TriBool_true;
    }
    
    void checkIsFriend(final byte b) {
        try {
            while (true) {
                Label_0033: {
                    if (UserComparator5.friendsChat == null) {
                        break Label_0033;
                    }
                    if (b <= 32) {
                        throw new IllegalStateException();
                    }
                    if (!UserComparator5.friendsChat.bt(this.username, -1263792908)) {
                        break Label_0033;
                    }
                    if (b <= 32) {
                        throw new IllegalStateException();
                    }
                    final TriBool isInFriendsChat = TriBool.TriBool_true;
                    this.isInFriendsChat = isInFriendsChat;
                    return;
                }
                final TriBool isInFriendsChat = TriBool.TriBool_false;
                continue;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.ao(" + ')');
        }
    }
    
    final void move(final int n, final int n2, final MoveSpeed moveSpeed, final byte b) {
        try {
            Label_0147: {
                if (this.cs * -1372355773 != -1) {
                    if (b >= 10) {
                        return;
                    }
                    if (ItemContainer.SpotAnimationDefinition_get(-1372355773 * this.cs, (byte)61).priority * 1957040329 == 1) {
                        if (b >= 10) {
                            throw new IllegalStateException();
                        }
                        this.cs = 1690721941;
                        if (this instanceof NPC) {
                            switch (((NPC)this).getId()) {
                                case 8615:
                                case 8616:
                                case 8617:
                                case 8618:
                                case 8619:
                                case 8620:
                                case 8621:
                                case 8622: {
                                    break Label_0147;
                                }
                            }
                        }
                        final AnimationChanged animationChanged = new AnimationChanged();
                        animationChanged.setActor((net.runelite.api.Actor)this);
                        ScriptFrame.client.getCallbacks().post((Object)animationChanged);
                    }
                }
            }
            this.cd(-2110924342);
            Label_0322: {
                if (n < 0) {
                    break Label_0322;
                }
                if (b >= 10) {
                    throw new IllegalStateException();
                }
                if (n >= 104 || n2 < 0) {
                    break Label_0322;
                }
                if (b >= 10) {
                    return;
                }
                if (n2 >= 104) {
                    if (b >= 10) {
                        throw new IllegalStateException();
                    }
                    break Label_0322;
                }
                else {
                    if (this.cf[0] >= 0) {
                        if (b >= 10) {
                            return;
                        }
                        if (this.cf[0] < 104) {
                            if (b >= 10) {
                                throw new IllegalStateException();
                            }
                            if (this.dy[0] >= 0) {
                                if (b >= 10) {
                                    return;
                                }
                                if (this.dy[0] < 104) {
                                    if (MoveSpeed.RUN == moveSpeed) {
                                        if (b >= 10) {
                                            throw new IllegalStateException();
                                        }
                                        Decimator.method325(this, n, n2, MoveSpeed.RUN, -1796483670);
                                    }
                                    this.method513(n, n2, moveSpeed, 475560620);
                                    return;
                                }
                                if (b >= 10) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                    }
                    this.resetPath(n, n2, -160290835);
                }
                return;
            }
            this.resetPath(n, n2, -511348482);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.av(" + ')');
        }
    }
    
    void be() {
        this.isFriendTriBool = (FriendSystem.zm(World.friendSystem, this.username, -1902824386) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    public static void hc(final Player player, final Buffer buffer) {
        if (player == null) {
            player.cx();
        }
        buffer.offset = 0;
        final int ra = Buffer.ra(buffer, (byte)7);
        player.headIconPk = Buffer.wu(buffer, 435772489) * 1162421511;
        player.headIconPrayer = Buffer.wu(buffer, 435772489) * -914676177;
        int unsignedShort = -1;
        player.team = 0;
        final int[] array = new int[12];
        for (int i = 0; i < 12; ++i) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            if (ra2 == 0) {
                array[i] = 0;
            }
            else {
                array[i] = Buffer.ra(buffer, (byte)7) + (ra2 << 8);
                if (i == 0 && 65535 == array[0]) {
                    unsignedShort = buffer.readUnsignedShort(769850293);
                    break;
                }
                if (array[i] >= 512) {
                    final int n = HealthBarUpdate.set(array[i] - 512, (byte)16).team * -919846075;
                    if (n != 0) {
                        player.team = -248928759 * n;
                    }
                }
            }
        }
        int[] array2 = null;
        if (-1931866699 * Client.param25 >= 213) {
            array2 = new int[12];
            for (int j = 0; j < 12; ++j) {
                final int ra3 = Buffer.ra(buffer, (byte)7);
                if (ra3 == 0) {
                    array2[j] = 0;
                }
                else {
                    array2[j] = (ra3 << 8) + Buffer.ra(buffer, (byte)7);
                }
            }
        }
        final int[] array3 = new int[5];
        for (int k = 0; k < 5; ++k) {
            int ra4 = Buffer.ra(buffer, (byte)7);
            if (ra4 < 0 || ra4 >= PlayerComposition.field2828[k].length) {
                ra4 = 0;
            }
            array3[k] = ra4;
        }
        player.cd = buffer.readUnsignedShort(-862188727) * 1196796229;
        if (65535 == player.cd * 1590591885) {
            player.cd = -1196796229;
        }
        player.bh = buffer.readUnsignedShort(-1590985391) * -767436785;
        if (65535 == player.bh * 1319769839) {
            player.bh = 767436785;
        }
        player.dz = player.bh * 980575951;
        player.cr = buffer.readUnsignedShort(-1463339340) * 1672510249;
        if (player.cr * 736907545 == 65535) {
            player.cr = -1672510249;
        }
        player.bf = buffer.readUnsignedShort(-1172289359) * -1683505383;
        if (65535 == 1648569641 * player.bf) {
            player.bf = 1683505383;
        }
        player.dl = buffer.readUnsignedShort(-1144460320) * 497469823;
        if (-127994241 * player.dl == 65535) {
            player.dl = -497469823;
        }
        player.dp = buffer.readUnsignedShort(139611322) * 1927855919;
        if (65535 == player.dp * -1059657777) {
            player.dp = -1927855919;
        }
        player.dr = buffer.readUnsignedShort(-444844051) * 140602839;
        if (1939789287 * player.dr == 65535) {
            player.dr = -140602839;
        }
        player.username = new Username(buffer.readStringCp1252NullTerminated((byte)0), class70.loginType);
        player.updateIsInClanChat((byte)2);
        player.clearIsInFriendsChat(1516152544);
        ue(player, 453146982);
        if (MusicPatchNode.localPlayer == player) {
            RunException.field4180 = player.username.getName(-710264960);
        }
        player.combatLevel = Buffer.ra(buffer, (byte)7) * 225691243;
        player.skillLevel = buffer.readUnsignedShort(-1655414721) * 1353643761;
        player.isHidden = (Buffer.ra(buffer, (byte)7) == 1);
        if (Client.gameBuild * -1274626977 == 0 && Client.staffModLevel * 324465533 >= 2) {
            player.isHidden = false;
        }
        ObjTypeCustomisation[] array4 = null;
        final int unsignedShort2 = buffer.readUnsignedShort(-394748441);
        final boolean b = (unsignedShort2 >> 15 & 0x1) == 0x1;
        if (unsignedShort2 > 0 && 32768 != unsignedShort2) {
            array4 = new ObjTypeCustomisation[12];
            for (int l = 0; l < 12; ++l) {
                if (0x1 == (unsignedShort2 >> 12 - l & 0x1)) {
                    array4[l] = Projectile.setDestination(array[l] - 512, buffer, -1555712175);
                }
            }
        }
        for (int n2 = 0; n2 < 3; ++n2) {
            player.actions[n2] = buffer.readStringCp1252NullTerminated((byte)0);
        }
        final int ra5 = Buffer.ra(buffer, (byte)7);
        if (player.appearance == null) {
            player.appearance = new PlayerComposition();
        }
        player.appearance.method1692(array2, array, array4, b, array3, ra, unsignedShort, ra5, (byte)73);
    }
    
    @Override
    final boolean isVisible(final int n) {
        try {
            if (this.appearance != null) {
                return true;
            }
            if (n != 1666539507) {
                throw new IllegalStateException();
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.as(" + ')');
        }
    }
    
    final void az(final Buffer buffer) {
        buffer.offset = 0;
        final int ra = Buffer.ra(buffer, (byte)7);
        this.headIconPk = Buffer.wu(buffer, 435772489) * 1162421511;
        this.headIconPrayer = Buffer.wu(buffer, 435772489) * -914676177;
        int unsignedShort = -1;
        this.team = 0;
        final int[] array = new int[12];
        for (int i = 0; i < 12; ++i) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            if (ra2 == 0) {
                array[i] = 0;
            }
            else {
                array[i] = Buffer.ra(buffer, (byte)7) + (ra2 << 8);
                if (i == 0 && 65535 == array[0]) {
                    unsignedShort = buffer.readUnsignedShort(-1992438584);
                    break;
                }
                if (array[i] >= 512) {
                    final int n = HealthBarUpdate.set(array[i] - 512, (byte)118).team * -919846075;
                    if (n != 0) {
                        this.team = -248928759 * n;
                    }
                }
            }
        }
        int[] array2 = null;
        if (-1931866699 * Client.param25 >= 213) {
            array2 = new int[12];
            for (int j = 0; j < 12; ++j) {
                final int ra3 = Buffer.ra(buffer, (byte)7);
                if (ra3 == 0) {
                    array2[j] = 0;
                }
                else {
                    array2[j] = (ra3 << 8) + Buffer.ra(buffer, (byte)7);
                }
            }
        }
        final int[] array3 = new int[5];
        for (int k = 0; k < 5; ++k) {
            int ra4 = Buffer.ra(buffer, (byte)7);
            if (ra4 < 0 || ra4 >= PlayerComposition.field2828[k].length) {
                ra4 = 0;
            }
            array3[k] = ra4;
        }
        this.cd = buffer.readUnsignedShort(694872059) * 1196796229;
        if (65535 == this.cd * 1590591885) {
            this.cd = -1196796229;
        }
        this.bh = buffer.readUnsignedShort(-1887360262) * -767436785;
        if (65535 == this.bh * 1319769839) {
            this.bh = 767436785;
        }
        this.dz = this.bh * 980575951;
        this.cr = buffer.readUnsignedShort(555559596) * 1672510249;
        if (this.cr * 736907545 == 65535) {
            this.cr = -1672510249;
        }
        this.bf = buffer.readUnsignedShort(531598444) * -1683505383;
        if (65535 == 1648569641 * this.bf) {
            this.bf = 1683505383;
        }
        this.dl = buffer.readUnsignedShort(145781136) * 497469823;
        if (-127994241 * this.dl == 65535) {
            this.dl = -497469823;
        }
        this.dp = buffer.readUnsignedShort(-1616491548) * 1927855919;
        if (65535 == this.dp * -1059657777) {
            this.dp = -1927855919;
        }
        this.dr = buffer.readUnsignedShort(-313399836) * 140602839;
        if (1939789287 * this.dr == 65535) {
            this.dr = -140602839;
        }
        this.username = new Username(buffer.readStringCp1252NullTerminated((byte)0), class70.loginType);
        this.updateIsInClanChat((byte)2);
        this.clearIsInFriendsChat(1950508446);
        ue(this, 453146982);
        if (MusicPatchNode.localPlayer == this) {
            RunException.field4180 = this.username.getName(-710264960);
        }
        this.combatLevel = Buffer.ra(buffer, (byte)7) * 225691243;
        this.skillLevel = buffer.readUnsignedShort(434239624) * 1353643761;
        this.isHidden = (Buffer.ra(buffer, (byte)7) == 1);
        if (Client.gameBuild * -1274626977 == 0 && Client.staffModLevel * 324465533 >= 2) {
            this.isHidden = false;
        }
        ObjTypeCustomisation[] array4 = null;
        final int unsignedShort2 = buffer.readUnsignedShort(336365197);
        final boolean b = (unsignedShort2 >> 15 & 0x1) == 0x1;
        if (unsignedShort2 > 0 && 32768 != unsignedShort2) {
            array4 = new ObjTypeCustomisation[12];
            for (int l = 0; l < 12; ++l) {
                if (0x1 == (unsignedShort2 >> 12 - l & 0x1)) {
                    array4[l] = Projectile.setDestination(array[l] - 512, buffer, -981770893);
                }
            }
        }
        for (int n2 = 0; n2 < 3; ++n2) {
            this.actions[n2] = buffer.readStringCp1252NullTerminated((byte)0);
        }
        final int ra5 = Buffer.ra(buffer, (byte)7);
        if (this.appearance == null) {
            this.appearance = new PlayerComposition();
        }
        this.appearance.method1692(array2, array, array4, b, array3, ra, unsignedShort, ra5, (byte)32);
    }
    
    void updateIsInClanChat(final byte b) {
        try {
            this.isFriendTriBool = TriBool.TriBool_unknown;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.ac(" + ')');
        }
    }
    
    void clearIsInFriendsChat(final int n) {
        try {
            this.isInFriendsChat = TriBool.TriBool_unknown;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.ay(" + ')');
        }
    }
    
    void bi() {
        this.isFriendTriBool = TriBool.TriBool_unknown;
    }
    
    void bv() {
        for (int i = 0; i < 4; ++i) {
            if (Client.currentClanSettings[i] != null && Client.currentClanSettings[i].method851(this.username.getName(-710264960), (byte)22) != -1 && 2 != i) {
                this.isInClanChat = TriBool.TriBool_true;
                return;
            }
        }
        this.isInClanChat = TriBool.TriBool_false;
    }
    
    final void ck(final int n, final int n2, final MoveSpeed moveSpeed) {
        if (this.cs * -1372355773 != -1 && ItemContainer.SpotAnimationDefinition_get(-1372355773 * this.cs, (byte)11).priority * 1957040329 == 1) {
            this.cs = 1690721941;
        }
        this.cd(-2140163181);
        if (n >= 0 && n < 104 && n2 >= 0 && n2 < 104) {
            if (this.cf[0] >= 0 && this.cf[0] < 104 && this.dy[0] >= 0 && this.dy[0] < 104) {
                if (MoveSpeed.RUN == moveSpeed) {
                    Decimator.method325(this, n, n2, MoveSpeed.RUN, -1796483670);
                }
                this.method513(n, n2, moveSpeed, 475560620);
            }
            else {
                this.resetPath(n, n2, -134979483);
            }
        }
        else {
            this.resetPath(n, n2, -252492907);
        }
    }
    
    void bo() {
        this.isInClanChat = (FriendSystem.zm(World.friendSystem, this.username, -1927462840) ? TriBool.TriBool_unknown : TriBool.TriBool_false);
    }
    
    public PlayerComposition sn() {
        return this.appearance;
    }
    
    public static int ie(final Player player) {
        if (player == null) {
            player.getPlayerComposition();
        }
        if (player.appearance != null && -1 != 747584608 * player.appearance.field2831) {
            return AbstractArchive.getNpcDefinition(1671322384 * player.appearance.field2831, (byte)(-19)).size * 1458410691;
        }
        return 1;
    }
    
    boolean cc() {
        if (this.isInClanChat == TriBool.TriBool_unknown) {
            this.updateIsInFriendsChat((byte)(-115));
        }
        return this.isInClanChat == TriBool.TriBool_true;
    }
    
    public static void tt(final Player player, final int n, final int n2, final MoveSpeed moveSpeed) {
        if (player.cb * 1134756167 < 9) {
            player.cb += 400971895;
        }
        for (int i = 1134756167 * player.cb; i > 0; --i) {
            player.cf[i] = player.cf[i - 1];
            player.dy[i] = player.dy[i - 1];
            player.da[i] = player.da[i - 1];
        }
        player.cf[0] = n;
        player.dy[0] = n2;
        player.da[0] = moveSpeed;
    }
    
    boolean bt() {
        if (TriBool.TriBool_unknown == this.isInFriendsChat) {
            this.checkIsFriend((byte)124);
        }
        return this.isInFriendsChat == TriBool.TriBool_true;
    }
    
    void br() {
        this.isInFriendsChat = ((UserComparator5.friendsChat != null && UserComparator5.friendsChat.bt(this.username, 395597273)) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    boolean ci() {
        if (this.isInClanChat == TriBool.TriBool_unknown) {
            this.updateIsInFriendsChat((byte)(-3));
        }
        return this.isInClanChat == TriBool.TriBool_true;
    }
    
    boolean isFriend(final int n) {
        try {
            if (this.appearance != null) {
                return true;
            }
            if (n != 1666539507) {
                throw new IllegalStateException();
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.as(" + ')');
        }
    }
    
    final void method513(final int n, final int n2, final MoveSpeed moveSpeed, final int n3) {
        try {
            if (this.cb * 1134756167 < 9) {
                if (n3 != 475560620) {
                    return;
                }
                this.cb += 400971895;
            }
            for (int i = 1134756167 * this.cb; i > 0; --i) {
                if (n3 != 475560620) {
                    throw new IllegalStateException();
                }
                this.cf[i] = this.cf[i - 1];
                this.dy[i] = this.dy[i - 1];
                this.da[i] = this.da[i - 1];
            }
            this.cf[0] = n;
            this.dy[0] = n2;
            this.da[0] = moveSpeed;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.am(" + ')');
        }
    }
    
    protected final Model al() {
        if (this.appearance == null) {
            return null;
        }
        final SequenceDefinition sequenceDefinition = (this.cs * -1372355773 != -1 && 0 == this.bd * 1253892101) ? ItemContainer.SpotAnimationDefinition_get(this.cs * -1372355773, (byte)6) : null;
        Model model = this.appearance.getModel(sequenceDefinition, -41215169 * this.dw, (-1 != this.dg * -1302441815 && !this.isUnanimated && (this.dg * -1302441815 != this.cd * 1590591885 || sequenceDefinition == null)) ? ItemContainer.SpotAnimationDefinition_get(this.dg * -1302441815, (byte)43) : null, 728999224 * this.bp, (byte)13);
        if (model == null) {
            return null;
        }
        model.calculateBoundsCylinder();
        this.cp = 193820574 * model.et;
        final int indicesCount = model.indicesCount;
        if (!this.isUnanimated) {
            model = this.cp(model, (byte)126);
        }
        if (!this.isUnanimated && this.attachedModel != null) {
            if (Client.cycle * 247431094 >= this.animationCycleEnd * 794366454) {
                this.attachedModel = null;
            }
            if (-1886224337 * Client.cycle >= 874303174 * this.animationCycleStart && 1975247366 * Client.cycle < -917046344 * this.animationCycleEnd) {
                final Model attachedModel = this.attachedModel;
                attachedModel.offsetBy(this.field899 * 1793688517 - 1144428983 * this.br, this.baseTileHeight * 1238902143 - -1802890636 * this.tileHeight, 240546619 * this.field903 - -411750205 * this.ep);
                if (this.bj * -1751341433 == 512) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                else if (-1767137765 == -1751341433 * this.bj) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                else if (1536 == -480095205 * this.bj) {
                    attachedModel.rotateY90Ccw();
                }
                model = new Model(new Model[] { model, attachedModel }, 2);
                if (this.bj * -1751341433 == 2082605643) {
                    attachedModel.rotateY90Ccw();
                }
                else if (1024 == this.bj * -900528962) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                else if (-1535659614 * this.bj == 1536) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                attachedModel.offsetBy(this.br * -468773866 - 973718370 * this.field899, 561204023 * this.tileHeight - this.baseTileHeight * 1238902143, -345359696 * this.ep - this.field903 * 1536960610);
            }
        }
        model.isSingleTile = true;
        if (this.dq != 0 && Client.cycle * -1963576077 >= this.dj * 974107602 && Client.cycle * -555974452 < -1003437728 * this.bn) {
            model.overrideHue = this.du;
            model.overrideSaturation = this.db;
            model.overrideLuminance = this.df;
            model.overrideAmount = this.dq;
            model.field2196 = (short)indicesCount;
        }
        else {
            model.overrideAmount = 0;
        }
        return model;
    }
    
    int cu() {
        if (this.appearance != null && -1 != -2131733097 * this.appearance.field2831) {
            return AbstractArchive.getNpcDefinition(-2131733097 * this.appearance.field2831, (byte)(-89)).size * 1458410691;
        }
        return 1;
    }
    
    protected final Model getModel(final byte b) {
        if (!ScriptFrame.client.isInterpolatePlayerAnimations() || (this.getPoseAnimation() == 244 && super.overheadTextCyclesRemaining * -1372355773 == -1)) {
            final int n = -112;
            Model model2;
            try {
                if (this.appearance != null) {
                    SequenceDefinition spotAnimationDefinition_get = null;
                    Label_1081: {
                        if (this.cs * -1372355773 != -1) {
                            if (n >= 14) {
                                throw new IllegalStateException();
                            }
                            if (0 == this.bd * 1253892101) {
                                if (n >= 14) {
                                    throw new IllegalStateException();
                                }
                                spotAnimationDefinition_get = ItemContainer.SpotAnimationDefinition_get(this.cs * -1372355773, (byte)73);
                                break Label_1081;
                            }
                        }
                        spotAnimationDefinition_get = null;
                    }
                    final SequenceDefinition sequenceDefinition = spotAnimationDefinition_get;
                    while (true) {
                        Label_0483: {
                            if (-1 == this.dg * -1302441815) {
                                break Label_0483;
                            }
                            if (n >= 14) {
                                throw new IllegalStateException();
                            }
                            if (this.isUnanimated) {
                                break Label_0483;
                            }
                            if (n >= 14) {
                                throw new IllegalStateException();
                            }
                            if (this.dg * -1302441815 == this.cd * 1590591885) {
                                if (n >= 14) {
                                    throw new IllegalStateException();
                                }
                                if (sequenceDefinition != null) {
                                    break Label_0483;
                                }
                                if (n >= 14) {
                                    throw new IllegalStateException();
                                }
                            }
                            final SequenceDefinition spotAnimationDefinition_get2 = ItemContainer.SpotAnimationDefinition_get(this.dg * -1302441815, (byte)57);
                            Model model = this.appearance.getModel(sequenceDefinition, -41215169 * this.dw, spotAnimationDefinition_get2, 424813829 * this.bp, (byte)31);
                            if (model != null) {
                                model.calculateBoundsCylinder();
                                this.cp = 2070391287 * model.et;
                                final int indicesCount = model.indicesCount;
                                if (!this.isUnanimated) {
                                    if (n >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    model = this.cp(model, (byte)106);
                                }
                                if (!this.isUnanimated) {
                                    if (n >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    if (this.attachedModel != null) {
                                        if (n >= 14) {
                                            throw new IllegalStateException();
                                        }
                                        if (Client.cycle * -1886224337 >= this.animationCycleEnd * -935505685) {
                                            this.attachedModel = null;
                                        }
                                        if (-1886224337 * Client.cycle >= -1402262375 * this.animationCycleStart) {
                                            if (n >= 14) {
                                                throw new IllegalStateException();
                                            }
                                            if (-1886224337 * Client.cycle < -935505685 * this.animationCycleEnd) {
                                                if (n >= 14) {
                                                    throw new IllegalStateException();
                                                }
                                                final Model attachedModel = this.attachedModel;
                                                attachedModel.offsetBy(this.field899 * 1793688517 - 1144428983 * this.br, this.baseTileHeight * 1238902143 - 561204023 * this.tileHeight, 240546619 * this.field903 - -411750205 * this.ep);
                                                if (this.bj * -1751341433 == 512) {
                                                    if (n >= 14) {
                                                        throw new IllegalStateException();
                                                    }
                                                    attachedModel.rotateY90Ccw();
                                                    attachedModel.rotateY90Ccw();
                                                    attachedModel.rotateY90Ccw();
                                                }
                                                else if (1024 == -1751341433 * this.bj) {
                                                    if (n >= 14) {
                                                        throw new IllegalStateException();
                                                    }
                                                    attachedModel.rotateY90Ccw();
                                                    attachedModel.rotateY90Ccw();
                                                }
                                                else if (1536 == -1751341433 * this.bj) {
                                                    if (n >= 14) {
                                                        throw new IllegalStateException();
                                                    }
                                                    attachedModel.rotateY90Ccw();
                                                }
                                                model = new Model(new Model[] { model, attachedModel }, 2);
                                                if (this.bj * -1751341433 == 512) {
                                                    if (n >= 14) {
                                                        throw new IllegalStateException();
                                                    }
                                                    attachedModel.rotateY90Ccw();
                                                }
                                                else if (1024 == this.bj * -1751341433) {
                                                    if (n >= 14) {
                                                        throw new IllegalStateException();
                                                    }
                                                    attachedModel.rotateY90Ccw();
                                                    attachedModel.rotateY90Ccw();
                                                }
                                                else if (-1751341433 * this.bj == 1536) {
                                                    if (n >= 14) {
                                                        throw new IllegalStateException();
                                                    }
                                                    attachedModel.rotateY90Ccw();
                                                    attachedModel.rotateY90Ccw();
                                                    attachedModel.rotateY90Ccw();
                                                }
                                                attachedModel.offsetBy(this.br * 1144428983 - 1793688517 * this.field899, 561204023 * this.tileHeight - this.baseTileHeight * 1238902143, -411750205 * this.ep - this.field903 * 240546619);
                                            }
                                        }
                                    }
                                }
                                model.isSingleTile = true;
                                Label_1127: {
                                    if (this.dq == 0 || Client.cycle * -1886224337 < this.dj * 1182789041) {
                                        break Label_1127;
                                    }
                                    if (n >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    if (Client.cycle * -1886224337 >= 707232483 * this.bn) {
                                        break Label_1127;
                                    }
                                    if (n >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    model.overrideHue = this.du;
                                    model.overrideSaturation = this.db;
                                    model.overrideLuminance = this.df;
                                    model.overrideAmount = this.dq;
                                    model.field2196 = (short)indicesCount;
                                    model2 = model;
                                    return model2;
                                }
                                model.overrideAmount = 0;
                                return model;
                            }
                            if (n >= 14) {
                                throw new IllegalStateException();
                            }
                            model2 = null;
                            return model2;
                        }
                        final SequenceDefinition spotAnimationDefinition_get2 = null;
                        continue;
                    }
                }
                model2 = null;
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "dv.an(" + ')');
            }
            return model2;
        }
        final int animationFrame = this.getAnimationFrame();
        final int poseAnimationFrame = this.getPoseAnimationFrame();
        try {
            this.setAnimationFrame(0xC0000000 | this.fr() << 16 | animationFrame);
            this.setPoseAnimationFrame(Integer.MIN_VALUE | this.qz() << 16 | poseAnimationFrame);
            for (final Graphic graphic : this.wz()) {
                final int frame = graphic.getFrame();
                if (frame != -1) {
                    graphic.setFrame(Integer.MIN_VALUE | graphic.getCycle() << 16 | frame);
                }
            }
            final int n2 = -112;
            Model model4;
            try {
                if (this.appearance != null) {
                    SequenceDefinition spotAnimationDefinition_get3 = null;
                    Label_2322: {
                        if (this.cs * -1372355773 != -1) {
                            if (n2 >= 14) {
                                throw new IllegalStateException();
                            }
                            if (0 == this.bd * 1253892101) {
                                if (n2 >= 14) {
                                    throw new IllegalStateException();
                                }
                                spotAnimationDefinition_get3 = ItemContainer.SpotAnimationDefinition_get(this.cs * -1372355773, (byte)73);
                                break Label_2322;
                            }
                        }
                        spotAnimationDefinition_get3 = null;
                    }
                    final SequenceDefinition sequenceDefinition2 = spotAnimationDefinition_get3;
                    while (true) {
                        Label_1724: {
                            if (-1 == this.dg * -1302441815) {
                                break Label_1724;
                            }
                            if (n2 >= 14) {
                                throw new IllegalStateException();
                            }
                            if (this.isUnanimated) {
                                break Label_1724;
                            }
                            if (n2 >= 14) {
                                throw new IllegalStateException();
                            }
                            if (this.dg * -1302441815 == this.cd * 1590591885) {
                                if (n2 >= 14) {
                                    throw new IllegalStateException();
                                }
                                if (sequenceDefinition2 != null) {
                                    break Label_1724;
                                }
                                if (n2 >= 14) {
                                    throw new IllegalStateException();
                                }
                            }
                            final SequenceDefinition spotAnimationDefinition_get4 = ItemContainer.SpotAnimationDefinition_get(this.dg * -1302441815, (byte)57);
                            Model model3 = this.appearance.getModel(sequenceDefinition2, -41215169 * this.dw, spotAnimationDefinition_get4, 424813829 * this.bp, (byte)31);
                            if (model3 != null) {
                                model3.calculateBoundsCylinder();
                                this.cp = 2070391287 * model3.et;
                                final int indicesCount2 = model3.indicesCount;
                                if (!this.isUnanimated) {
                                    if (n2 >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    model3 = this.cp(model3, (byte)106);
                                }
                                if (!this.isUnanimated) {
                                    if (n2 >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    if (this.attachedModel != null) {
                                        if (n2 >= 14) {
                                            throw new IllegalStateException();
                                        }
                                        if (Client.cycle * -1886224337 >= this.animationCycleEnd * -935505685) {
                                            this.attachedModel = null;
                                        }
                                        if (-1886224337 * Client.cycle >= -1402262375 * this.animationCycleStart) {
                                            if (n2 >= 14) {
                                                throw new IllegalStateException();
                                            }
                                            if (-1886224337 * Client.cycle < -935505685 * this.animationCycleEnd) {
                                                if (n2 >= 14) {
                                                    throw new IllegalStateException();
                                                }
                                                final Model attachedModel2 = this.attachedModel;
                                                attachedModel2.offsetBy(this.field899 * 1793688517 - 1144428983 * this.br, this.baseTileHeight * 1238902143 - 561204023 * this.tileHeight, 240546619 * this.field903 - -411750205 * this.ep);
                                                if (this.bj * -1751341433 == 512) {
                                                    if (n2 >= 14) {
                                                        throw new IllegalStateException();
                                                    }
                                                    attachedModel2.rotateY90Ccw();
                                                    attachedModel2.rotateY90Ccw();
                                                    attachedModel2.rotateY90Ccw();
                                                }
                                                else if (1024 == -1751341433 * this.bj) {
                                                    if (n2 >= 14) {
                                                        throw new IllegalStateException();
                                                    }
                                                    attachedModel2.rotateY90Ccw();
                                                    attachedModel2.rotateY90Ccw();
                                                }
                                                else if (1536 == -1751341433 * this.bj) {
                                                    if (n2 >= 14) {
                                                        throw new IllegalStateException();
                                                    }
                                                    attachedModel2.rotateY90Ccw();
                                                }
                                                model3 = new Model(new Model[] { model3, attachedModel2 }, 2);
                                                if (this.bj * -1751341433 == 512) {
                                                    if (n2 >= 14) {
                                                        throw new IllegalStateException();
                                                    }
                                                    attachedModel2.rotateY90Ccw();
                                                }
                                                else if (1024 == this.bj * -1751341433) {
                                                    if (n2 >= 14) {
                                                        throw new IllegalStateException();
                                                    }
                                                    attachedModel2.rotateY90Ccw();
                                                    attachedModel2.rotateY90Ccw();
                                                }
                                                else if (-1751341433 * this.bj == 1536) {
                                                    if (n2 >= 14) {
                                                        throw new IllegalStateException();
                                                    }
                                                    attachedModel2.rotateY90Ccw();
                                                    attachedModel2.rotateY90Ccw();
                                                    attachedModel2.rotateY90Ccw();
                                                }
                                                attachedModel2.offsetBy(this.br * 1144428983 - 1793688517 * this.field899, 561204023 * this.tileHeight - this.baseTileHeight * 1238902143, -411750205 * this.ep - this.field903 * 240546619);
                                            }
                                        }
                                    }
                                }
                                model3.isSingleTile = true;
                                Label_2368: {
                                    if (this.dq == 0 || Client.cycle * -1886224337 < this.dj * 1182789041) {
                                        break Label_2368;
                                    }
                                    if (n2 >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    if (Client.cycle * -1886224337 >= 707232483 * this.bn) {
                                        break Label_2368;
                                    }
                                    if (n2 >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    model3.overrideHue = this.du;
                                    model3.overrideSaturation = this.db;
                                    model3.overrideLuminance = this.df;
                                    model3.overrideAmount = this.dq;
                                    model3.field2196 = (short)indicesCount2;
                                    model4 = model3;
                                    return model4;
                                }
                                model3.overrideAmount = 0;
                                return model3;
                            }
                            if (n2 >= 14) {
                                throw new IllegalStateException();
                            }
                            model4 = null;
                            return model4;
                        }
                        final SequenceDefinition spotAnimationDefinition_get4 = null;
                        continue;
                    }
                }
                model4 = null;
            }
            catch (RuntimeException ex2) {
                throw HealthBar.get(ex2, "dv.an(" + ')');
            }
            return model4;
        }
        finally {
            this.setAnimationFrame(animationFrame);
            this.setPoseAnimationFrame(poseAnimationFrame);
            for (final Graphic graphic2 : this.wz()) {
                final int frame2 = graphic2.getFrame();
                if (frame2 != -1) {
                    graphic2.setFrame(frame2 & 0xFFFF);
                }
            }
        }
    }
    
    void clearIsFriend(final byte b) {
        try {
            TriBool isFriendTriBool;
            if (FriendSystem.zm(World.friendSystem, this.username, -2018991784)) {
                if (b <= 1) {
                    return;
                }
                isFriendTriBool = TriBool.TriBool_true;
            }
            else {
                isFriendTriBool = TriBool.TriBool_false;
            }
            this.isFriendTriBool = isFriendTriBool;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.at(" + ')');
        }
    }
    
    @Override
    final boolean cx() {
        return this.appearance != null;
    }
    
    void bq() {
        for (int i = 0; i < 4; ++i) {
            if (Client.currentClanSettings[i] != null && Client.currentClanSettings[i].method851(this.username.getName(-710264960), (byte)32) != -1 && 2 != i) {
                this.isInClanChat = TriBool.TriBool_true;
                return;
            }
        }
        this.isInClanChat = TriBool.TriBool_false;
    }
    
    public static void ue(final Player player, final int n) {
        if (player == null) {
            player.clearIsInClanChat(n);
        }
        try {
            player.isInClanChat = TriBool.TriBool_unknown;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.ai(" + ')');
        }
    }
    
    public int nd() {
        return this.headIconPrayer * -1905401649;
    }
    
    static void method519(final int n) {
        try {
            if (class12.clearLoginScreen) {
                Login.titleboxSprite = null;
                class292.titlebuttonSprite = null;
                class396.runesSprite = null;
                class123.leftTitleSprite = null;
                Client.qg(-1);
                ParamComposition.rightTitleSprite = null;
                Client.ut(-1);
                Canvas.logoSprite = null;
                class148.title_muteSprite = null;
                Login.options_buttons_0Sprite = null;
                class158.options_buttons_2Sprite = null;
                class476.worldSelectBackSprites = null;
                class16.worldSelectFlagSprites = null;
                DevicePcmPlayerProvider.worldSelectArrows = null;
                World.worldSelectStars = null;
                class319.field3030 = null;
                class121.field1184.method555(1639975847);
                class297.musicPlayerStatus = -626822165;
                class297.musicTrackArchive = null;
                class379.musicTrackGroupId = 1643562499;
                VarpDefinition.musicTrackFileId = -1823837761;
                class100.musicTrackVolume = 0;
                class120.musicTrackBoolean = false;
                class162.pcmSampleLength = 440964570;
                class177.vmethod3380(true, 1735285531);
                class12.clearLoginScreen = false;
                return;
            }
            if (n == Integer.MIN_VALUE) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.au(" + ')');
        }
    }
    
    protected final Model method519() {
        if (this.appearance == null) {
            return null;
        }
        final SequenceDefinition sequenceDefinition = (this.cs * -1372355773 != -1 && 0 == this.bd * 1253892101) ? ItemContainer.SpotAnimationDefinition_get(this.cs * -1372355773, (byte)121) : null;
        Model model = this.appearance.getModel(sequenceDefinition, -41215169 * this.dw, (-1 != this.dg * -1302441815 && !this.isUnanimated && (this.dg * -1302441815 != this.cd * 1590591885 || sequenceDefinition == null)) ? ItemContainer.SpotAnimationDefinition_get(this.dg * -1302441815, (byte)61) : null, 424813829 * this.bp, (byte)69);
        if (model == null) {
            return null;
        }
        model.calculateBoundsCylinder();
        this.cp = 2070391287 * model.et;
        final int indicesCount = model.indicesCount;
        if (!this.isUnanimated) {
            model = this.cp(model, (byte)127);
        }
        if (!this.isUnanimated && this.attachedModel != null) {
            if (Client.cycle * -1886224337 >= this.animationCycleEnd * -935505685) {
                this.attachedModel = null;
            }
            if (-1886224337 * Client.cycle >= -1402262375 * this.animationCycleStart && -1886224337 * Client.cycle < -935505685 * this.animationCycleEnd) {
                final Model attachedModel = this.attachedModel;
                attachedModel.offsetBy(this.field899 * 1793688517 - 1144428983 * this.br, this.baseTileHeight * 1238902143 - 561204023 * this.tileHeight, 240546619 * this.field903 - -411750205 * this.ep);
                if (this.bj * -1751341433 == 512) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                else if (1024 == -1751341433 * this.bj) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                else if (1536 == -1751341433 * this.bj) {
                    attachedModel.rotateY90Ccw();
                }
                model = new Model(new Model[] { model, attachedModel }, 2);
                if (this.bj * -1751341433 == 512) {
                    attachedModel.rotateY90Ccw();
                }
                else if (1024 == this.bj * -1751341433) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                else if (-1751341433 * this.bj == 1536) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                attachedModel.offsetBy(this.br * 1144428983 - 1793688517 * this.field899, 561204023 * this.tileHeight - this.baseTileHeight * 1238902143, -411750205 * this.ep - this.field903 * 240546619);
            }
        }
        model.isSingleTile = true;
        if (this.dq != 0 && Client.cycle * -1886224337 >= this.dj * 1182789041 && Client.cycle * -1886224337 < 707232483 * this.bn) {
            model.overrideHue = this.du;
            model.overrideSaturation = this.db;
            model.overrideLuminance = this.df;
            model.overrideAmount = this.dq;
            model.field2196 = (short)indicesCount;
        }
        else {
            model.overrideAmount = 0;
        }
        return model;
    }
    
    boolean isFriendsChatMember(final byte b) {
        try {
            if (TriBool.TriBool_unknown == this.isFriendTriBool) {
                if (b >= 31) {
                    throw new IllegalStateException();
                }
                this.updateIsInFriendsChat((byte)45);
            }
            boolean b2;
            if (this.isInClanChat == TriBool.TriBool_unknown) {
                if (b >= 31) {
                    throw new IllegalStateException();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.aa(" + ')');
        }
    }
    
    void clearIsInClanChat(final int n) {
        try {
            this.isFriendTriBool = TriBool.TriBool_unknown;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.ai(" + ')');
        }
    }
    
    public static void ii(final Player player) {
        if (player == null) {
            player.bx();
        }
        for (int i = 0; i < 4; ++i) {
            if (Client.currentClanSettings[i] != null && Client.currentClanSettings[i].method851(player.username.getName(-710264960), (byte)112) != -1 && 2 != i) {
                player.isInClanChat = TriBool.TriBool_true;
                return;
            }
        }
        player.isInClanChat = TriBool.TriBool_false;
    }
    
    public static void wy(final Player player, final int n, final int n2, final MoveSpeed moveSpeed) {
        if (player == null) {
            player.cf(n, n, moveSpeed);
        }
        if (player.cs * 1452941382 != -1 && ItemContainer.SpotAnimationDefinition_get(-723947764 * player.cs, (byte)74).priority * 1957040329 == 1) {
            player.cs = 711061820;
        }
        player.cd(-2116499920);
        if (n >= 0 && n < 877147991 && n2 >= 0 && n2 < 920160810) {
            if (player.cf[0] < 0 || player.cf[0] >= 104 || player.dy[0] < 0 || player.dy[0] >= 104) {
                player.resetPath(n, n2, -857390184);
            }
            else {
                if (MoveSpeed.RUN == moveSpeed) {
                    Decimator.method325(player, n, n2, MoveSpeed.RUN, -1796483670);
                }
                player.method513(n, n2, moveSpeed, 475560620);
            }
        }
        else {
            player.resetPath(n, n2, -1320647815);
        }
    }
    
    void bh() {
        this.isInClanChat = TriBool.TriBool_unknown;
    }
    
    boolean by() {
        if (this.isFriendTriBool == TriBool.TriBool_unknown) {
            this.clearIsFriend((byte)48);
        }
        return this.isFriendTriBool == TriBool.TriBool_true;
    }
    
    void bx() {
        this.isFriendTriBool = (FriendSystem.zm(World.friendSystem, this.username, -2046225107) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    public boolean ny() {
        return this.isHidden;
    }
    
    void resetPath(final int n, final int n2, final int n3) {
        try {
            this.cb = 0;
            this.dk = 0;
            this.bc = 0;
            this.cf[0] = n;
            this.dy[0] = n2;
            final int transformedSize = this.transformedSize((byte)(-38));
            this.br = -1102445696 * this.cf[0] + -551222848 * transformedSize;
            this.ep = transformedSize * -943719744 + -1887439488 * this.dy[0];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.ar(" + ')');
        }
    }
    
    boolean ap() {
        if (this.isFriendTriBool == TriBool.TriBool_unknown) {
            this.clearIsFriend((byte)94);
        }
        return this.isFriendTriBool == TriBool.TriBool_true;
    }
    
    boolean bd() {
        if (TriBool.TriBool_unknown == this.isInFriendsChat) {
            this.checkIsFriend((byte)74);
        }
        return this.isInFriendsChat == TriBool.TriBool_true;
    }
    
    final void cm(final int n, final int n2, final MoveSpeed moveSpeed) {
        if (this.cs * -1372355773 != -1 && ItemContainer.SpotAnimationDefinition_get(-1007015736 * this.cs, (byte)98).priority * -1783292256 == 1) {
            this.cs = 1590035220;
        }
        this.cd(-2143782261);
        if (n < 0 || n >= 104 || n2 < 0 || n2 >= 104) {
            this.resetPath(n, n2, -970599363);
        }
        else if (this.cf[0] >= 0 && this.cf[0] < 928821171 && this.dy[0] >= 0 && this.dy[0] < 104) {
            if (MoveSpeed.RUN == moveSpeed) {
                Decimator.method325(this, n, n2, MoveSpeed.RUN, -1796483670);
            }
            this.method513(n, n2, moveSpeed, 475560620);
        }
        else {
            this.resetPath(n, n2, -1939289893);
        }
    }
    
    void bg() {
        this.isInFriendsChat = ((UserComparator5.friendsChat != null && UserComparator5.friendsChat.bt(this.username, -1565064385)) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    void cg(final int n, final int n2) {
        this.cb = 0;
        this.dk = 0;
        this.bc = 0;
        this.cf[0] = n;
        this.dy[0] = n2;
        final int transformedSize = this.transformedSize((byte)(-85));
        this.br = -1102445696 * this.cf[0] + -551222848 * transformedSize;
        this.ep = transformedSize * -943719744 + -1887439488 * this.dy[0];
    }
    
    static int read(final int n, final int n2, final byte b) {
        try {
            final ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
            if (itemContainer != null) {
                if (n2 >= 0) {
                    if (b != 0) {
                        throw new IllegalStateException();
                    }
                    if (n2 < itemContainer.quantities.length) {
                        return itemContainer.quantities[n2];
                    }
                    if (b != 0) {
                        throw new IllegalStateException();
                    }
                }
                return -1;
            }
            if (b != 0) {
                throw new IllegalStateException();
            }
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.af(" + ')');
        }
    }
    
    final void read(final Buffer buffer, final int n) {
        try {
            buffer.offset = 0;
            final int ra = Buffer.ra(buffer, (byte)7);
            this.headIconPk = Buffer.wu(buffer, 435772489) * 1162421511;
            this.headIconPrayer = Buffer.wu(buffer, 435772489) * -914676177;
            int unsignedShort = -1;
            this.team = 0;
            final int[] array = new int[12];
            for (int i = 0; i < 12; ++i) {
                if (n == 316483960) {
                    throw new IllegalStateException();
                }
                final int ra2 = Buffer.ra(buffer, (byte)7);
                if (ra2 == 0) {
                    if (n == 316483960) {
                        throw new IllegalStateException();
                    }
                    array[i] = 0;
                }
                else {
                    array[i] = Buffer.ra(buffer, (byte)7) + (ra2 << 8);
                    if (i == 0) {
                        if (n == 316483960) {
                            this.dd();
                            return;
                        }
                        if (65535 == array[0]) {
                            unsignedShort = buffer.readUnsignedShort(715081390);
                            break;
                        }
                    }
                    if (array[i] >= 512) {
                        if (n == 316483960) {
                            this.dd();
                            return;
                        }
                        final int n2 = HealthBarUpdate.set(array[i] - 512, (byte)116).team * -919846075;
                        if (n2 != 0) {
                            if (n == 316483960) {
                                throw new IllegalStateException();
                            }
                            this.team = -248928759 * n2;
                        }
                    }
                }
            }
            int[] array2 = null;
            if (-1931866699 * Client.param25 >= 213) {
                if (n == 316483960) {
                    throw new IllegalStateException();
                }
                array2 = new int[12];
                for (int j = 0; j < 12; ++j) {
                    final int ra3 = Buffer.ra(buffer, (byte)7);
                    if (ra3 == 0) {
                        array2[j] = 0;
                    }
                    else {
                        array2[j] = (ra3 << 8) + Buffer.ra(buffer, (byte)7);
                    }
                }
            }
            final int[] array3 = new int[5];
            for (int k = 0; k < 5; ++k) {
                if (n == 316483960) {
                    this.dd();
                    return;
                }
                int ra4 = Buffer.ra(buffer, (byte)7);
                Label_0546: {
                    if (ra4 >= 0) {
                        if (ra4 < PlayerComposition.field2828[k].length) {
                            break Label_0546;
                        }
                        if (n == 316483960) {
                            throw new IllegalStateException();
                        }
                    }
                    ra4 = 0;
                }
                array3[k] = ra4;
            }
            this.cd = buffer.readUnsignedShort(403920818) * 1196796229;
            if (65535 == this.cd * 1590591885) {
                if (n == 316483960) {
                    throw new IllegalStateException();
                }
                this.cd = -1196796229;
            }
            this.bh = buffer.readUnsignedShort(-111684246) * -767436785;
            if (65535 == this.bh * 1319769839) {
                if (n == 316483960) {
                    throw new IllegalStateException();
                }
                this.bh = 767436785;
            }
            this.dz = this.bh * 980575951;
            this.cr = buffer.readUnsignedShort(-900366720) * 1672510249;
            if (this.cr * 736907545 == 65535) {
                if (n == 316483960) {
                    throw new IllegalStateException();
                }
                this.cr = -1672510249;
            }
            this.bf = buffer.readUnsignedShort(-1978017770) * -1683505383;
            if (65535 == 1648569641 * this.bf) {
                if (n == 316483960) {
                    throw new IllegalStateException();
                }
                this.bf = 1683505383;
            }
            this.dl = buffer.readUnsignedShort(216748442) * 497469823;
            if (-127994241 * this.dl == 65535) {
                if (n == 316483960) {
                    throw new IllegalStateException();
                }
                this.dl = -497469823;
            }
            this.dp = buffer.readUnsignedShort(-456544714) * 1927855919;
            if (65535 == this.dp * -1059657777) {
                if (n == 316483960) {
                    this.dd();
                    return;
                }
                this.dp = -1927855919;
            }
            this.dr = buffer.readUnsignedShort(-850104511) * 140602839;
            if (1939789287 * this.dr == 65535) {
                if (n == 316483960) {
                    throw new IllegalStateException();
                }
                this.dr = -140602839;
            }
            this.username = new Username(buffer.readStringCp1252NullTerminated((byte)0), class70.loginType);
            this.updateIsInClanChat((byte)2);
            this.clearIsInFriendsChat(2109204603);
            ue(this, 453146982);
            if (MusicPatchNode.localPlayer == this) {
                if (n == 316483960) {
                    this.dd();
                    return;
                }
                RunException.field4180 = this.username.getName(-710264960);
            }
            this.combatLevel = Buffer.ra(buffer, (byte)7) * 225691243;
            this.skillLevel = buffer.readUnsignedShort(-303616420) * 1353643761;
            boolean isHidden;
            if (Buffer.ra(buffer, (byte)7) == 1) {
                if (n == 316483960) {
                    throw new IllegalStateException();
                }
                isHidden = true;
            }
            else {
                isHidden = false;
            }
            this.isHidden = isHidden;
            if (Client.gameBuild * -1274626977 == 0 && Client.staffModLevel * 324465533 >= 2) {
                if (n == 316483960) {
                    throw new IllegalStateException();
                }
                this.isHidden = false;
            }
            ObjTypeCustomisation[] array4 = null;
            final int unsignedShort2 = buffer.readUnsignedShort(-1952907902);
            final boolean b = (unsignedShort2 >> 15 & 0x1) == 0x1;
            if (unsignedShort2 > 0) {
                if (n == 316483960) {
                    throw new IllegalStateException();
                }
                if (32768 != unsignedShort2) {
                    if (n == 316483960) {
                        throw new IllegalStateException();
                    }
                    array4 = new ObjTypeCustomisation[12];
                    for (int l = 0; l < 12; ++l) {
                        if (n == 316483960) {
                            this.dd();
                            return;
                        }
                        if (0x1 == (unsignedShort2 >> 12 - l & 0x1)) {
                            array4[l] = Projectile.setDestination(array[l] - 512, buffer, -1162920359);
                        }
                    }
                }
            }
            for (int n3 = 0; n3 < 3; ++n3) {
                this.actions[n3] = buffer.readStringCp1252NullTerminated((byte)0);
            }
            final int ra5 = Buffer.ra(buffer, (byte)7);
            if (this.appearance == null) {
                if (n == 316483960) {
                    throw new IllegalStateException();
                }
                this.appearance = new PlayerComposition();
            }
            this.appearance.method1692(array2, array, array4, b, array3, ra, unsignedShort, ra5, (byte)21);
            this.dd();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.af(" + ')');
        }
    }
    
    public static boolean te(final Player player) {
        if (TriBool.TriBool_unknown == player.isInFriendsChat) {
            player.checkIsFriend((byte)91);
        }
        return player.isInFriendsChat == TriBool.TriBool_true;
    }
    
    protected final Model ab() {
        if (this.appearance == null) {
            return null;
        }
        final SequenceDefinition sequenceDefinition = (this.cs * -932948515 != -1 && 0 == this.bd * 1253892101) ? ItemContainer.SpotAnimationDefinition_get(this.cs * -1372355773, (byte)114) : null;
        Model model = this.appearance.getModel(sequenceDefinition, -41215169 * this.dw, (-1 != this.dg * -1302441815 && !this.isUnanimated && (this.dg * -1302441815 != this.cd * 796201815 || sequenceDefinition == null)) ? ItemContainer.SpotAnimationDefinition_get(this.dg * -638499823, (byte)16) : null, 401006219 * this.bp, (byte)37);
        if (model == null) {
            return null;
        }
        model.calculateBoundsCylinder();
        this.cp = -782197158 * model.et;
        final int indicesCount = model.indicesCount;
        if (!this.isUnanimated) {
            model = this.cp(model, (byte)116);
        }
        if (!this.isUnanimated && this.attachedModel != null) {
            if (Client.cycle * 1979434 >= this.animationCycleEnd * -935505685) {
                this.attachedModel = null;
            }
            if (-1886224337 * Client.cycle >= -1402262375 * this.animationCycleStart && 1743377105 * Client.cycle < -1675531961 * this.animationCycleEnd) {
                final Model attachedModel = this.attachedModel;
                attachedModel.offsetBy(this.field899 * 1793688517 - -923556392 * this.br, this.baseTileHeight * 1238902143 - -29095639 * this.tileHeight, 240546619 * this.field903 - 1290387295 * this.ep);
                if (this.bj * -353800634 == 1370518934) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                else if (-1919311210 == -1751341433 * this.bj) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                else if (415025260 == -1134332089 * this.bj) {
                    attachedModel.rotateY90Ccw();
                }
                model = new Model(new Model[] { model, attachedModel }, 2);
                if (this.bj * -1751341433 == -1944817061) {
                    attachedModel.rotateY90Ccw();
                }
                else if (-1018834405 == this.bj * -1751341433) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                else if (-556770947 * this.bj == 1536) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                attachedModel.offsetBy(this.br * 1144428983 - -1897519143 * this.field899, 1285682795 * this.tileHeight - this.baseTileHeight * -154406366, 1786536813 * this.ep - this.field903 * 240546619);
            }
        }
        model.isSingleTile = true;
        if (this.dq != 0 && Client.cycle * 1719791262 >= this.dj * -1212607814 && Client.cycle * -1886224337 < 707232483 * this.bn) {
            model.overrideHue = this.du;
            model.overrideSaturation = this.db;
            model.overrideLuminance = this.df;
            model.overrideAmount = this.dq;
            model.field2196 = (short)indicesCount;
        }
        else {
            model.overrideAmount = 0;
        }
        return model;
    }
    
    public Username ab() {
        return this.username;
    }
    
    protected final Model aq() {
        if (this.appearance == null) {
            return null;
        }
        final SequenceDefinition sequenceDefinition = (this.cs * -1372355773 != -1 && 0 == this.bd * 1253892101) ? ItemContainer.SpotAnimationDefinition_get(this.cs * -1372355773, (byte)117) : null;
        Model model = this.appearance.getModel(sequenceDefinition, -41215169 * this.dw, (-1 != this.dg * -1302441815 && !this.isUnanimated && (this.dg * -1302441815 != this.cd * 1590591885 || sequenceDefinition == null)) ? ItemContainer.SpotAnimationDefinition_get(this.dg * -1302441815, (byte)90) : null, 424813829 * this.bp, (byte)9);
        if (model == null) {
            return null;
        }
        model.calculateBoundsCylinder();
        this.cp = 2070391287 * model.et;
        final int indicesCount = model.indicesCount;
        if (!this.isUnanimated) {
            model = this.cp(model, (byte)124);
        }
        if (!this.isUnanimated && this.attachedModel != null) {
            if (Client.cycle * -1886224337 >= this.animationCycleEnd * -935505685) {
                this.attachedModel = null;
            }
            if (-1886224337 * Client.cycle >= -1402262375 * this.animationCycleStart && -1886224337 * Client.cycle < -935505685 * this.animationCycleEnd) {
                final Model attachedModel = this.attachedModel;
                attachedModel.offsetBy(this.field899 * 1793688517 - 1144428983 * this.br, this.baseTileHeight * 1238902143 - 561204023 * this.tileHeight, 240546619 * this.field903 - -411750205 * this.ep);
                if (this.bj * -1751341433 == 512) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                else if (1024 == -1751341433 * this.bj) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                else if (1536 == -1751341433 * this.bj) {
                    attachedModel.rotateY90Ccw();
                }
                model = new Model(new Model[] { model, attachedModel }, 2);
                if (this.bj * -1751341433 == 512) {
                    attachedModel.rotateY90Ccw();
                }
                else if (1024 == this.bj * -1751341433) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                else if (-1751341433 * this.bj == 1536) {
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                    attachedModel.rotateY90Ccw();
                }
                attachedModel.offsetBy(this.br * 1144428983 - 1793688517 * this.field899, 561204023 * this.tileHeight - this.baseTileHeight * 1238902143, -411750205 * this.ep - this.field903 * 240546619);
            }
        }
        model.isSingleTile = true;
        if (this.dq != 0 && Client.cycle * -1886224337 >= this.dj * 1182789041 && Client.cycle * -1886224337 < 707232483 * this.bn) {
            model.overrideHue = this.du;
            model.overrideSaturation = this.db;
            model.overrideLuminance = this.df;
            model.overrideAmount = this.dq;
            model.field2196 = (short)indicesCount;
        }
        else {
            model.overrideAmount = 0;
        }
        return model;
    }
    
    final void aj(final Buffer buffer) {
        buffer.offset = 0;
        final int ra = Buffer.ra(buffer, (byte)7);
        this.headIconPk = Buffer.wu(buffer, 435772489) * 1162421511;
        this.headIconPrayer = Buffer.wu(buffer, 435772489) * -914676177;
        int unsignedShort = -1;
        this.team = 0;
        final int[] array = new int[12];
        for (int i = 0; i < 12; ++i) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            if (ra2 == 0) {
                array[i] = 0;
            }
            else {
                array[i] = Buffer.ra(buffer, (byte)7) + (ra2 << 8);
                if (i == 0 && -1562577922 == array[0]) {
                    unsignedShort = buffer.readUnsignedShort(421047883);
                    break;
                }
                if (array[i] >= -587271768) {
                    final int n = HealthBarUpdate.set(array[i] + 515159163, (byte)119).team * -919846075;
                    if (n != 0) {
                        this.team = -248928759 * n;
                    }
                }
            }
        }
        int[] array2 = null;
        if (-1850708740 * Client.param25 >= 213) {
            array2 = new int[12];
            for (int j = 0; j < 12; ++j) {
                final int ra3 = Buffer.ra(buffer, (byte)7);
                if (ra3 == 0) {
                    array2[j] = 0;
                }
                else {
                    array2[j] = (ra3 << 8) + Buffer.ra(buffer, (byte)7);
                }
            }
        }
        final int[] array3 = new int[5];
        for (int k = 0; k < 5; ++k) {
            int ra4 = Buffer.ra(buffer, (byte)7);
            if (ra4 < 0 || ra4 >= PlayerComposition.field2828[k].length) {
                ra4 = 0;
            }
            array3[k] = ra4;
        }
        this.cd = buffer.readUnsignedShort(211804824) * -2104770339;
        if (65535 == this.cd * 540629456) {
            this.cd = 1854796544;
        }
        this.bh = buffer.readUnsignedShort(-774450636) * -767436785;
        if (65535 == this.bh * 1319769839) {
            this.bh = 767436785;
        }
        this.dz = this.bh * 119568838;
        this.cr = buffer.readUnsignedShort(-326442015) * 1044048311;
        if (this.cr * 1574056336 == -767100629) {
            this.cr = -1672510249;
        }
        this.bf = buffer.readUnsignedShort(-2009546153) * 510067687;
        if (65535 == 1852866297 * this.bf) {
            this.bf = 1683505383;
        }
        this.dl = buffer.readUnsignedShort(-2047181364) * 497469823;
        if (-913480968 * this.dl == 65535) {
            this.dl = 1181460204;
        }
        this.dp = buffer.readUnsignedShort(-2106043552) * 1927855919;
        if (-873619200 == this.dp * -1059657777) {
            this.dp = 1502742191;
        }
        this.dr = buffer.readUnsignedShort(-1048728214) * 795502895;
        if (-939233395 * this.dr == 1979145742) {
            this.dr = -140602839;
        }
        this.username = new Username(buffer.readStringCp1252NullTerminated((byte)0), class70.loginType);
        this.updateIsInClanChat((byte)2);
        this.clearIsInFriendsChat(1473801296);
        ue(this, 453146982);
        if (MusicPatchNode.localPlayer == this) {
            RunException.field4180 = this.username.getName(-710264960);
        }
        this.combatLevel = Buffer.ra(buffer, (byte)7) * 225691243;
        this.skillLevel = buffer.readUnsignedShort(-720177024) * 805431832;
        this.isHidden = (Buffer.ra(buffer, (byte)7) == 1);
        if (Client.gameBuild * -1029070184 == 0 && Client.staffModLevel * 324465533 >= 2) {
            this.isHidden = false;
        }
        ObjTypeCustomisation[] array4 = null;
        final int unsignedShort2 = buffer.readUnsignedShort(-918019724);
        final boolean b = (unsignedShort2 >> 15 & 0x1) == 0x1;
        if (unsignedShort2 > 0 && 32768 != unsignedShort2) {
            array4 = new ObjTypeCustomisation[12];
            for (int l = 0; l < 12; ++l) {
                if (0x1 == (unsignedShort2 >> 12 - l & 0x1)) {
                    array4[l] = Projectile.setDestination(array[l] - 1507135733, buffer, 1129075533);
                }
            }
        }
        for (int n2 = 0; n2 < 3; ++n2) {
            this.actions[n2] = buffer.readStringCp1252NullTerminated((byte)0);
        }
        final int ra5 = Buffer.ra(buffer, (byte)7);
        if (this.appearance == null) {
            this.appearance = new PlayerComposition();
        }
        this.appearance.method1692(array2, array, array4, b, array3, ra, unsignedShort, ra5, (byte)21);
    }
    
    boolean isClanMember(final byte b) {
        try {
            if (this.isInClanChat == TriBool.TriBool_unknown) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                this.updateIsInFriendsChat((byte)(-64));
            }
            boolean b2;
            if (this.isInClanChat == TriBool.TriBool_true) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.ag(" + ')');
        }
    }
    
    void bl() {
        this.isInClanChat = TriBool.TriBool_unknown;
    }
    
    public boolean isFriendsChatMember() {
        return zk(this, (byte)(-120));
    }
    
    public static boolean zk(final Player player, final byte b) {
        if (player == null) {
            player.isFriendsChatMember(b);
        }
        try {
            if (TriBool.TriBool_unknown == player.isInFriendsChat) {
                if (b >= 31) {
                    throw new IllegalStateException();
                }
                player.checkIsFriend((byte)45);
            }
            boolean b2;
            if (player.isInFriendsChat == TriBool.TriBool_true) {
                if (b >= 31) {
                    throw new IllegalStateException();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.aa(" + ')');
        }
    }
    
    boolean bz() {
        if (TriBool.TriBool_unknown == this.isInFriendsChat) {
            this.checkIsFriend((byte)44);
        }
        return this.isInFriendsChat == TriBool.TriBool_true;
    }
    
    public int qp() {
        return this.skillLevel * 761215505;
    }
    
    public static boolean yc(final Player player, final int n) {
        if (player == null) {
            return player.isFriend(n);
        }
        try {
            if (player.isFriendTriBool == TriBool.TriBool_unknown) {
                if (n >= -934859703) {
                    throw new IllegalStateException();
                }
                player.clearIsFriend((byte)94);
            }
            boolean b;
            if (player.isFriendTriBool == TriBool.TriBool_true) {
                if (n >= -934859703) {
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
            throw HealthBar.get(ex, "dv.aw(" + ')');
        }
    }
    
    void bj() {
        this.isInFriendsChat = TriBool.TriBool_unknown;
    }
    
    public void dd() {
        ScriptFrame.client.getCallbacks().post((Object)new PlayerChanged((net.runelite.api.Player)this));
    }
    
    public static int oy(final WorldMap worldMap) {
        return 1077411767 * worldMap.worldMapDisplayHeight;
    }
    
    public Shape getConvexHull() {
        final Model tb = this.tb();
        if (tb == null) {
            return null;
        }
        return tb.no(this.fu(), this.gk(), this.getCurrentOrientation(), Perspective.getTileHeight((net.runelite.api.Client)ScriptFrame.client, new LocalPoint(this.fu(), this.gk()), ScriptFrame.client.getPlane()));
    }
    
    final void cq(final int n, final int n2, final MoveSpeed moveSpeed) {
        if (this.cs * -1372355773 != -1 && ItemContainer.SpotAnimationDefinition_get(-1372355773 * this.cs, (byte)126).priority * 1957040329 == 1) {
            this.cs = 1690721941;
        }
        this.cd(-2143858086);
        if (n < 0 || n >= 104 || n2 < 0 || n2 >= 104) {
            this.resetPath(n, n2, -817136496);
        }
        else if (this.cf[0] >= 0 && this.cf[0] < 104 && this.dy[0] >= 0 && this.dy[0] < 104) {
            if (MoveSpeed.RUN == moveSpeed) {
                Decimator.method325(this, n, n2, MoveSpeed.RUN, -1796483670);
            }
            this.method513(n, n2, moveSpeed, 475560620);
        }
        else {
            this.resetPath(n, n2, -200652475);
        }
    }
    
    void bk() {
        this.isFriendTriBool = (FriendSystem.zm(World.friendSystem, this.username, -1881605934) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    public static void ho(final Player player) {
        if (player == null) {
            player.bo();
            return;
        }
        player.isFriendTriBool = (FriendSystem.zm(World.friendSystem, player.username, -1927462840) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    int transformedSize(final byte b) {
        try {
            if (this.appearance != null) {
                if (b >= 20) {
                    throw new IllegalStateException();
                }
                if (-1 != -2131733097 * this.appearance.field2831) {
                    if (b >= 20) {
                        throw new IllegalStateException();
                    }
                    return AbstractArchive.getNpcDefinition(-2131733097 * this.appearance.field2831, (byte)(-35)).size * 1458410691;
                }
            }
            return 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dv.ah(" + ')');
        }
    }
    
    void bf() {
        for (int i = 0; i < 4; ++i) {
            if (Client.currentClanSettings[i] != null && Client.currentClanSettings[i].method851(this.username.getName(-710264960), (byte)97) != -1 && 2 != i) {
                this.isInClanChat = TriBool.TriBool_true;
                return;
            }
        }
        this.isInClanChat = TriBool.TriBool_false;
    }
    
    void bu() {
        this.isInFriendsChat = ((UserComparator5.friendsChat != null && UserComparator5.friendsChat.bt(this.username, -1789131921)) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    public boolean isFriend() {
        return yc(this, -1214578435);
    }
    
    public int getTeam() {
        return this.team * -55850951;
    }
    
    public boolean isClanMember() {
        return this.isClanMember((byte)0);
    }
    
    public HeadIcon getOverheadIcon() {
        switch (this.nd()) {
            case 0: {
                return HeadIcon.MELEE;
            }
            case 1: {
                return HeadIcon.RANGED;
            }
            case 2: {
                return HeadIcon.MAGIC;
            }
            case 3: {
                return HeadIcon.RETRIBUTION;
            }
            case 4: {
                return HeadIcon.SMITE;
            }
            case 5: {
                return HeadIcon.REDEMPTION;
            }
            case 6: {
                return HeadIcon.RANGE_MAGE;
            }
            case 7: {
                return HeadIcon.RANGE_MELEE;
            }
            case 8: {
                return HeadIcon.MAGE_MELEE;
            }
            case 9: {
                return HeadIcon.RANGE_MAGE_MELEE;
            }
            case 10: {
                return HeadIcon.WRATH;
            }
            case 11: {
                return HeadIcon.SOUL_SPLIT;
            }
            case 12: {
                return HeadIcon.DEFLECT_MELEE;
            }
            case 13: {
                return HeadIcon.DEFLECT_RANGE;
            }
            case 14: {
                return HeadIcon.DEFLECT_MAGE;
            }
            default: {
                return null;
            }
        }
    }
    
    public Polygon[] getPolygons() {
        final Model tb = this.tb();
        if (tb == null) {
            return null;
        }
        final int[] array = new int[((net.runelite.api.Model)tb).getVerticesCount()];
        final int[] array2 = new int[((net.runelite.api.Model)tb).getVerticesCount()];
        final int fu = this.fu();
        final int gk = this.gk();
        Perspective.modelToCanvas((net.runelite.api.Client)ScriptFrame.client, ((net.runelite.api.Model)tb).getVerticesCount(), fu, gk, Perspective.getTileHeight((net.runelite.api.Client)ScriptFrame.client, new LocalPoint(fu, gk), ScriptFrame.client.getPlane()), this.getCurrentOrientation(), ((net.runelite.api.Model)tb).getVerticesX(), ((net.runelite.api.Model)tb).getVerticesZ(), ((net.runelite.api.Model)tb).getVerticesY(), array, array2);
        final ArrayList list = new ArrayList<Polygon>(((net.runelite.api.Model)tb).getFaceCount());
        final int[] faceIndices1 = ((net.runelite.api.Model)tb).getFaceIndices1();
        final int[] faceIndices2 = ((net.runelite.api.Model)tb).getFaceIndices2();
        final int[] faceIndices3 = ((net.runelite.api.Model)tb).getFaceIndices3();
        final int[] xpoints = new int[3];
        final int[] ypoints = new int[3];
        for (int i = 0; i < ((net.runelite.api.Model)tb).getFaceCount(); ++i) {
            final int n = faceIndices1[i];
            xpoints[0] = array[n];
            ypoints[0] = array2[n];
            final int n2 = faceIndices2[i];
            xpoints[1] = array[n2];
            ypoints[1] = array2[n2];
            final int n3 = faceIndices3[i];
            xpoints[2] = array[n3];
            ypoints[2] = array2[n3];
            list.add(new Polygon(xpoints, ypoints, 3));
        }
        return list.toArray(new Polygon[0]);
    }
    
    public SkullIcon getSkullIcon() {
        if (this != ScriptFrame.client.fv()) {
            return null;
        }
        switch (this.headIconPk * -1875167049) {
            case 0: {
                return SkullIcon.SKULL;
            }
            case 1: {
                return SkullIcon.SKULL_FIGHT_PIT;
            }
            case 8: {
                return SkullIcon.DEAD_MAN_FIVE;
            }
            case 9: {
                return SkullIcon.DEAD_MAN_FOUR;
            }
            case 10: {
                return SkullIcon.DEAD_MAN_THREE;
            }
            case 11: {
                return SkullIcon.DEAD_MAN_TWO;
            }
            case 12: {
                return SkullIcon.DEAD_MAN_ONE;
            }
            default: {
                return null;
            }
        }
    }
    
    public int getCombatLevel() {
        return this.combatLevel * 1302967875;
    }
}
