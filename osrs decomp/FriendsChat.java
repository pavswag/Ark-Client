import net.runelite.api.events.FriendsChatMemberLeft;
import net.runelite.api.FriendsChatRank;
import java.awt.event.FocusEvent;
import net.runelite.api.events.FriendsChatMemberJoined;
import net.runelite.api.FriendsChatMember;
import net.runelite.api.FriendsChatManager;

// 
// Decompiled by Procyon v0.5.36
// 

public class FriendsChat extends UserList implements FriendsChatManager
{
    static final int af = 500;
    final LoginType loginType;
    final Usernamed localUser;
    public String name;
    public String owner;
    int memberCount;
    public int rank;
    public byte minKick;
    static int worldPort;
    
    public String getName() {
        return this.name;
    }
    
    public FriendsChat(final LoginType loginType, final Usernamed localUser) {
        super(500);
        this.name = null;
        this.owner = null;
        this.memberCount = 923743697;
        this.loginType = loginType;
        this.localUser = localUser;
    }
    
    public final void ad(final Buffer buffer, final int i) {
        this.method2147(buffer.readStringCp1252NullTerminated((byte)0), -978786129);
        this.method2141(class244.method1393(Buffer.ks(buffer, (byte)1)), -2073582217);
        this.minKick = Buffer.wu(buffer, 435772489);
        int n;
        int n2;
        if (1 == i) {
            n = Buffer.ra(buffer, (byte)7);
            n2 = 1102111594;
        }
        else {
            if (i != 2) {
                throw new IllegalArgumentException("Invalid friend chat full update version: " + i);
            }
            n = buffer.method2491(-300093630);
            n2 = -1;
        }
        if (n == n2) {
            return;
        }
        final int n3 = n;
        this.bz(-2092001396);
        for (int j = 0; j < n3; ++j) {
            final ClanMate clanMate = (ClanMate)this.bu(new Username(buffer.readStringCp1252NullTerminated((byte)0), this.loginType), (byte)(-16));
            clanMate.bf(buffer.readUnsignedShort(-949775076), (this.memberCount += 923743697) * -151581843 - 1, 1883230576);
            clanMate.aq = Buffer.wu(buffer, 435772489) * 1331866435;
            buffer.readStringCp1252NullTerminated((byte)0);
            zw(this, clanMate, -1376086769);
        }
    }
    
    public final void ae(final Buffer buffer, final int i) {
        this.method2147(buffer.readStringCp1252NullTerminated((byte)0), 891895805);
        this.method2141(class244.method1393(Buffer.ks(buffer, (byte)1)), 1601212501);
        this.minKick = Buffer.wu(buffer, 435772489);
        int n;
        int n2;
        if (1 == i) {
            n = Buffer.ra(buffer, (byte)7);
            n2 = 255;
        }
        else {
            if (i != 2) {
                throw new IllegalArgumentException("Invalid friend chat full update version: " + i);
            }
            n = buffer.method2491(-1033685322);
            n2 = -1;
        }
        if (n == n2) {
            return;
        }
        final int n3 = n;
        this.bz(-486578704);
        for (int j = 0; j < n3; ++j) {
            final ClanMate clanMate = (ClanMate)this.bu(new Username(buffer.readStringCp1252NullTerminated((byte)0), this.loginType), (byte)(-7));
            clanMate.bf(buffer.readUnsignedShort(-1644864463), (this.memberCount += 923743697) * -835632335 - 1, 1131002477);
            clanMate.aq = Buffer.wu(buffer, 435772489) * 1331866435;
            buffer.readStringCp1252NullTerminated((byte)0);
            zw(this, clanMate, 1608699137);
        }
    }
    
    public final void bb(final Buffer buffer) {
        final Username username = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.loginType);
        final int unsignedShort = buffer.readUnsignedShort(-1113914117);
        final byte wu = Buffer.wu(buffer, 435772489);
        boolean b = false;
        if (-789373839 == wu) {
            b = true;
        }
        if (b) {
            if (this.bm(-257280697) == 0) {
                return;
            }
            final ClanMate clanMate = (ClanMate)UserList.gk(this, username, (short)197);
            if (clanMate != null && Buddy.hn(clanMate, 2096752983) == unsignedShort) {
                UserList.yv(this, clanMate, -2086508076);
            }
        }
        else {
            buffer.readStringCp1252NullTerminated((byte)0);
            ClanMate clanMate2 = (ClanMate)UserList.gk(this, username, (short)197);
            if (null == clanMate2) {
                if (this.bm(-1619225497) > this.at * -271614236) {
                    return;
                }
                clanMate2 = (ClanMate)this.bu(username, (byte)(-109));
            }
            clanMate2.bf(unsignedShort, (this.memberCount -= 1061330987) * -1662708899 - 1, 2127954528);
            clanMate2.aq = 1331866435 * wu;
            zw(this, clanMate2, -808203700);
        }
    }
    
    public static float[] cb(final class122 class122, final int n) {
        if (class122 == null) {
            class122.gf(n);
        }
        return class122.field1198[n];
    }
    
    public byte si() {
        return this.minKick;
    }
    
    public final void method2142(final Buffer buffer, final int i, final byte b) {
        try {
            this.method2147(buffer.readStringCp1252NullTerminated((byte)0), -951582244);
            this.method2141(class244.method1393(Buffer.ks(buffer, (byte)1)), 455982360);
            this.minKick = Buffer.wu(buffer, 435772489);
            int n;
            int n2;
            if (1 == i) {
                if (b != 1) {
                    throw new IllegalStateException();
                }
                n = Buffer.ra(buffer, (byte)7);
                n2 = 255;
            }
            else {
                if (i != 2) {
                    throw new IllegalArgumentException("Invalid friend chat full update version: " + i);
                }
                n = buffer.method2491(-534505085);
                n2 = -1;
            }
            if (n == n2) {
                return;
            }
            final int n3 = n;
            this.bz(-1601244871);
            for (int j = 0; j < n3; ++j) {
                if (b != 1) {
                    throw new IllegalStateException();
                }
                final ClanMate clanMate = (ClanMate)this.bu(new Username(buffer.readStringCp1252NullTerminated((byte)0), this.loginType), (byte)19);
                clanMate.bf(buffer.readUnsignedShort(-1496375041), (this.memberCount += 923743697) * -835632335 - 1, 1375808116);
                clanMate.aq = Buffer.wu(buffer, 435772489) * 1331866435;
                buffer.readStringCp1252NullTerminated((byte)0);
                zw(this, clanMate, 300754990);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ps.ao(" + ')');
        }
    }
    
    @Override
    public void sj(final Username username, final Username username2) {
        final FriendsChatMember friendsChatMember = (FriendsChatMember)this.es(username);
        if (friendsChatMember == null) {
            return;
        }
        ScriptFrame.client.getCallbacks().postDeferred((Object)new FriendsChatMemberJoined(friendsChatMember));
    }
    
    @Override
    User[] at(final int n) {
        return new ClanMate[n];
    }
    
    final void av(final String s) {
        this.name = SecureRandomFuture.method458(s, 1248226916);
    }
    
    public final void be() {
        for (int i = 0; i < this.bm(1573945479); ++i) {
            ((ClanMate)UserList.pn(this, i, -273422176)).clearIsFriend((byte)12);
        }
    }
    
    public final void az(final Buffer buffer, final int i) {
        this.method2147(buffer.readStringCp1252NullTerminated((byte)0), -767254359);
        this.method2141(class244.method1393(Buffer.ks(buffer, (byte)1)), -1275296651);
        this.minKick = Buffer.wu(buffer, 435772489);
        int n;
        int n2;
        if (1 == i) {
            n = Buffer.ra(buffer, (byte)7);
            n2 = 1242228774;
        }
        else {
            if (i != 2) {
                throw new IllegalArgumentException("Invalid friend chat full update version: " + i);
            }
            n = buffer.method2491(1855867113);
            n2 = -1;
        }
        if (n == n2) {
            return;
        }
        final int n3 = n;
        this.bz(-449134005);
        for (int j = 0; j < n3; ++j) {
            final ClanMate clanMate = (ClanMate)this.bu(new Username(buffer.readStringCp1252NullTerminated((byte)0), this.loginType), (byte)(-53));
            clanMate.bf(buffer.readUnsignedShort(192277522), (this.memberCount += 923743697) * 554501222 - 1, 1203152290);
            clanMate.aq = Buffer.wu(buffer, 435772489) * 1331866435;
            buffer.readStringCp1252NullTerminated((byte)0);
            zw(this, clanMate, -507999479);
        }
    }
    
    public final void method2146(final Buffer buffer, final byte b) {
        try {
            final Username username = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.loginType);
            final int unsignedShort = buffer.readUnsignedShort(186460102);
            final byte wu = Buffer.wu(buffer, 435772489);
            int n = 0;
            if (-128 == wu) {
                n = 1;
            }
            if (n != 0) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                if (this.bm(-882944622) == 0) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    final ClanMate clanMate = (ClanMate)UserList.gk(this, username, (short)197);
                    if (clanMate != null) {
                        if (b >= 2) {
                            return;
                        }
                        if (Buddy.hn(clanMate, -199616481) == unsignedShort) {
                            if (b >= 2) {
                                throw new IllegalStateException();
                            }
                            UserList.yv(this, clanMate, -623771631);
                        }
                    }
                }
            }
            else {
                buffer.readStringCp1252NullTerminated((byte)0);
                ClanMate clanMate2 = (ClanMate)UserList.gk(this, username, (short)197);
                if (null == clanMate2) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    if (this.bm(-2019825610) > this.at * -734344935) {
                        return;
                    }
                    clanMate2 = (ClanMate)this.bu(username, (byte)31);
                }
                clanMate2.bf(unsignedShort, (this.memberCount += 923743697) * -835632335 - 1, 1994082485);
                clanMate2.aq = 1331866435 * wu;
                zw(this, clanMate2, -1829447137);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ps.ax(" + ')');
        }
    }
    
    final void method2147(final String s, final int n) {
        try {
            this.owner = SecureRandomFuture.method458(s, -86032975);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ps.ay(" + ')');
        }
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public final void bi() {
        for (int i = 0; i < this.bm(365942957); ++i) {
            ((ClanMate)UserList.pn(this, i, 121910923)).clearIsFriend((byte)12);
        }
    }
    
    public static void pf(final GameEngine gameEngine, final FocusEvent focusEvent) {
        if (gameEngine == null) {
            gameEngine.ch();
            return;
        }
        GameEngine.volatileFocus = false;
    }
    
    final void method2141(final String s, final int n) {
        try {
            this.name = SecureRandomFuture.method458(s, -1236850266);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ps.aw(" + ')');
        }
    }
    
    @Override
    User[] al(final int n) {
        return new ClanMate[n];
    }
    
    @Override
    User[] newTypedArray(final int n, final int n2) {
        try {
            return new ClanMate[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ps.an(" + ')');
        }
    }
    
    @Override
    User ac() {
        return new ClanMate();
    }
    
    @Override
    User au() {
        return new ClanMate();
    }
    
    @Override
    User[] aa(final int n) {
        return new ClanMate[n];
    }
    
    public final void clearFriends(final int n) {
        try {
            for (int i = 0; i < this.bm(1859432010); ++i) {
                ((ClanMate)UserList.pn(this, i, -74669048)).clearIsFriend((byte)12);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ps.ai(" + ')');
        }
    }
    
    static final void method2139(final int n, final int n2, final int n3, final int n4, final int n5) {
        try {
            for (int i = 0; i < -356793645 * Client.rootWidgetCount; ++i) {
                if (n5 != -1848509736) {
                    throw new IllegalStateException();
                }
                if (Client.rootWidgetXs[i] + Client.rootWidgetWidths[i] > n && Client.rootWidgetXs[i] < n3 + n) {
                    if (n5 != -1848509736) {
                        throw new IllegalStateException();
                    }
                    if (Client.rootWidgetHeights[i] + Client.rootWidgetYs[i] > n2) {
                        if (n5 != -1848509736) {
                            throw new IllegalStateException();
                        }
                        if (Client.rootWidgetYs[i] < n2 + n4) {
                            Client.field574[i] = true;
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ps.ki(" + ')');
        }
    }
    
    public final void by(final Buffer buffer) {
        final Username username = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.loginType);
        final int unsignedShort = buffer.readUnsignedShort(-901452470);
        final byte wu = Buffer.wu(buffer, 435772489);
        int n = 0;
        if (-128 == wu) {
            n = 1;
        }
        if (n != 0) {
            if (this.bm(827079507) == 0) {
                return;
            }
            final ClanMate clanMate = (ClanMate)UserList.gk(this, username, (short)197);
            if (clanMate != null && Buddy.hn(clanMate, 1420976780) == unsignedShort) {
                UserList.yv(this, clanMate, 3442721);
            }
        }
        else {
            buffer.readStringCp1252NullTerminated((byte)0);
            ClanMate clanMate2 = (ClanMate)UserList.gk(this, username, (short)197);
            if (null == clanMate2) {
                if (this.bm(-756653644) > this.at * 602004280) {
                    return;
                }
                clanMate2 = (ClanMate)this.bu(username, (byte)(-46));
            }
            clanMate2.bf(unsignedShort, (this.memberCount += 923743697) * -835632335 - 1, 1903124306);
            clanMate2.aq = 1331866435 * wu;
            zw(this, clanMate2, -1653054194);
        }
    }
    
    public final void bx() {
        for (int i = 0; i < this.bm(-791726632); ++i) {
            ((ClanMate)UserList.pn(this, i, 871060465)).clearIsIgnored(402172393);
        }
    }
    
    public static void ny(final FriendsChat friendsChat, final Buffer buffer, final int i) {
        if (friendsChat == null) {
            friendsChat.aq(i);
        }
        friendsChat.method2147(buffer.readStringCp1252NullTerminated((byte)0), -1285481312);
        friendsChat.method2141(class244.method1393(Buffer.ks(buffer, (byte)1)), -477600755);
        friendsChat.minKick = Buffer.wu(buffer, 435772489);
        int n;
        int n2;
        if (1 == i) {
            n = Buffer.ra(buffer, (byte)7);
            n2 = -838297693;
        }
        else {
            if (i != 2) {
                throw new IllegalArgumentException("Invalid friend chat full update version: " + i);
            }
            n = buffer.method2491(1578349610);
            n2 = -1;
        }
        if (n == n2) {
            return;
        }
        final int n3 = n;
        friendsChat.bz(-1563785454);
        for (int j = 0; j < n3; ++j) {
            final ClanMate clanMate = (ClanMate)friendsChat.bu(new Username(buffer.readStringCp1252NullTerminated((byte)0), friendsChat.loginType), (byte)19);
            clanMate.bf(buffer.readUnsignedShort(-62484546), (friendsChat.memberCount -= 1589203227) * -835632335 - 1, 1267325166);
            clanMate.aq = Buffer.wu(buffer, 435772489) * 1331866435;
            buffer.readStringCp1252NullTerminated((byte)0);
            zw(friendsChat, clanMate, -485868387);
        }
    }
    
    final void ar(final String s) {
        this.name = SecureRandomFuture.method458(s, 1154205470);
    }
    
    public final void ap(final Buffer buffer) {
        final Username username = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.loginType);
        final int unsignedShort = buffer.readUnsignedShort(243947533);
        final byte wu = Buffer.wu(buffer, 435772489);
        boolean b = false;
        if (-128 == wu) {
            b = true;
        }
        if (b) {
            if (this.bm(1418953947) == 0) {
                return;
            }
            final ClanMate clanMate = (ClanMate)UserList.gk(this, username, (short)197);
            if (clanMate != null && Buddy.hn(clanMate, 1694678223) == unsignedShort) {
                UserList.yv(this, clanMate, 79524041);
            }
        }
        else {
            buffer.readStringCp1252NullTerminated((byte)0);
            ClanMate clanMate2 = (ClanMate)UserList.gk(this, username, (short)197);
            if (null == clanMate2) {
                if (this.bm(1482791185) > this.at * -734344935) {
                    return;
                }
                clanMate2 = (ClanMate)this.bu(username, (byte)(-2));
            }
            clanMate2.bf(unsignedShort, (this.memberCount += 923743697) * -835632335 - 1, 1107396519);
            clanMate2.aq = 1331866435 * wu;
            zw(this, clanMate2, -1362294849);
        }
    }
    
    public int xb() {
        return this.rank * 1788650387;
    }
    
    public static void we(final FriendsChat friendsChat, final String s) {
        if (friendsChat == null) {
            friendsChat.getMyRank();
        }
        friendsChat.owner = SecureRandomFuture.method458(s, 942954986);
    }
    
    @Override
    User newInstance(final int n) {
        try {
            return new ClanMate();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ps.af(" + ')');
        }
    }
    
    @Override
    User ab() {
        return new ClanMate();
    }
    
    @Override
    User[] aq(final int n) {
        return new ClanMate[n];
    }
    
    final void aj(final String s) {
        this.owner = SecureRandomFuture.method458(s, 1306198444);
    }
    
    public final void invalidateIgnoreds(final byte b) {
        try {
            for (int i = 0; i < this.bm(1603660447); ++i) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                ((ClanMate)UserList.pn(this, i, 818709767)).clearIsIgnored(629220603);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ps.ag(" + ')');
        }
    }
    
    public FriendsChatRank getMyRank() {
        return FriendsChatRank.valueOf(this.xb());
    }
    
    public static void lh(final Client client) {
        if (client == null) {
            client.getCameraYawTarget();
        }
        if (-1 != Client.rootInterface * -533736847) {
            final int n = Client.rootInterface * 1078655742;
            if (SoundSystem.loadInterface(n, 1376777516)) {
                TileItem.drawModelComponents(VerticalAlignment.Widget_interfaceComponents[n], -1, (byte)26);
            }
        }
        for (int i = 0; i < Client.rootWidgetCount * -356793645; ++i) {
            if (Client.field573[i]) {
                Client.field574[i] = true;
            }
            Client.field519[i] = Client.field573[i];
            Client.field573[i] = false;
        }
        Client.field527 = Client.cycle * -1299398686;
        Client.viewportX = 617954226;
        Client.viewportY = -2111961447;
        if (-1 != Client.rootInterface * -544656521) {
            Client.rootWidgetCount = 0;
            class13.drawWidgets(Client.rootInterface * -896157613, 0, 0, Client.aj * -1687260435, class262.canvasHeight * -1577887723, 0, 0, -1, (byte)(-10));
        }
        Rasterizer2D.Rasterizer2D_resetClip();
        if (Client.showMouseCross) {
            if (-1278851743 * Client.mouseCrossColor == 1) {
                class173.crossSprites[1513573489 * Client.mouseCrossState / 100].drawAt(-902574261 * Client.mouseCrossX - 8, 682495699 * Client.mouseCrossY - 8);
            }
            if (1190969789 * Client.mouseCrossColor == 2) {
                class173.crossSprites[4 + -1953424173 * Client.mouseCrossState / 337919808].drawAt(1150640978 * Client.mouseCrossX - 8, 682495699 * Client.mouseCrossY - 8);
            }
        }
        if (!Client.isMenuOpen) {
            if (-1 != Client.viewportX * -85798182) {
                class85.method498(893956248 * Client.viewportX, Client.viewportY * -870509993, (byte)(-50));
            }
        }
        else {
            final int n2 = 1266845 * class192.menuX;
            final int n3 = ArchiveLoader.menuY * 571102051;
            final int n4 = -960964385 * DesktopPlatformInfoProvider.menuWidth;
            final int n5 = -1631920366 * class147.menuHeight;
            final int n6 = 6116423;
            Rasterizer2D.Rasterizer2D_fillRectangle(n2, n3, n4, n5, n6);
            Rasterizer2D.Rasterizer2D_fillRectangle(1 + n2, 1 + n3, n4 - 2, 16, 0);
            Rasterizer2D.Rasterizer2D_drawRectangle(1 + n2, n3 + 18, n4 - 2, n5 - 19, 0);
            class492.xb(class137.fontBold12, Strings.gd, 3 + n2, 14 + n3, n6, -1);
            final int n7 = -2063363905 * MouseHandler.MouseHandler_x;
            final int n8 = MouseHandler.MouseHandler_y * -1224153235;
            for (int j = 0; j < 730065501 * Client.menuOptionsCount; ++j) {
                final int n9 = n3 + 31 + 15 * (Client.menuOptionsCount * 543789836 - 1 - j);
                int n10 = 16777215;
                if (n7 > n2 && n7 < n2 + n4 && n8 > n9 - 13 && n8 < n9 + 3) {
                    n10 = 16776960;
                }
                class492.xb(class137.fontBold12, Friend.method2152(j, (short)(-15537)), 3 + n2, n9, n10, 0);
            }
            method2139(-435165666 * class192.menuX, -115281635 * ArchiveLoader.menuY, 388062983 * DesktopPlatformInfoProvider.menuWidth, class147.menuHeight * 245252327, -1848509736);
        }
        if (3 == -1928160607 * Client.gameDrawingMode) {
            for (int k = 0; k < Client.rootWidgetCount * -2117500044; ++k) {
                if (Client.field519[k]) {
                    Rasterizer2D.Rasterizer2D_fillRectangleAlpha(Client.rootWidgetXs[k], Client.rootWidgetYs[k], Client.rootWidgetWidths[k], Client.rootWidgetHeights[k], -1195981741, 128);
                }
                else if (Client.field574[k]) {
                    Rasterizer2D.Rasterizer2D_fillRectangleAlpha(Client.rootWidgetXs[k], Client.rootWidgetYs[k], Client.rootWidgetWidths[k], Client.rootWidgetHeights[k], 16711680, 1122735735);
                }
            }
        }
        class324.method1839(GameEngine.Client_plane * -1727408401, MusicPatchNode.localPlayer.br * 1144428983, MusicPatchNode.localPlayer.ep * -411750205, Client.field432 * 259687262, (short)(-13900));
        Client.field432 = 0;
    }
    
    @Override
    public void zn(final User user) {
        final FriendsChatMember friendsChatMember = (FriendsChatMember)this.es(user.hb());
        if (friendsChatMember == null) {
            return;
        }
        ScriptFrame.client.getCallbacks().postDeferred((Object)new FriendsChatMemberLeft(friendsChatMember));
    }
    
    public final void bk() {
        for (int i = 0; i < this.bm(-1883954293); ++i) {
            ((ClanMate)UserList.pn(this, i, 1258272352)).clearIsFriend((byte)12);
        }
    }
    
    final void isLocalPlayer(final ClanMate clanMate, final int n) {
        try {
            if (clanMate.be(473993579).gk(this.localUser.username(637501068))) {
                if (n <= -1900179119) {
                    return;
                }
                this.rank = clanMate.aq * 2092329417;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ps.ah(" + ')');
        }
    }
    
    public static void zw(final FriendsChat friendsChat, final ClanMate clanMate, final int n) {
        if (friendsChat == null) {
            friendsChat.isLocalPlayer(clanMate, n);
        }
        try {
            if (clanMate.be(473993579).equals(friendsChat.localUser.username(637501068))) {
                if (n <= -1900179119) {
                    return;
                }
                friendsChat.rank = clanMate.aq * 2092329417;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ps.ah(" + ')');
        }
    }
    
    public FriendsChatRank getKickRank() {
        return FriendsChatRank.valueOf((int)this.si());
    }
}
