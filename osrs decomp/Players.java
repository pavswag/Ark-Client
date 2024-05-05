import java.net.URL;

// 
// Decompiled by Procyon v0.5.36
// 

public class Players
{
    static byte[] activityFlags;
    static int[] Players_regions;
    static final int an = 1;
    static MoveSpeed[] playerMovementSpeeds;
    static Buffer[] cachedAppearanceBuffer;
    static int Players_count;
    static final int cp = 45;
    static final int af = 2;
    static int[] Players_emptyIndices;
    static int[] Players_orientations;
    static class429 varclan;
    static int[] Players_indices;
    static int Players_pendingUpdateCount;
    static int[] Players_pendingUpdateIndices;
    static Buffer field1094;
    static int field1095;
    static int Players_emptyIdxCount;
    static int[] Players_targetIndices;
    static SpritePixels[] mapMarkerSprites;
    
    Players() throws Throwable {
        throw new Error();
    }
    
    static {
        Players.activityFlags = new byte[2048];
        Players.playerMovementSpeeds = new MoveSpeed[2048];
        Players.cachedAppearanceBuffer = new Buffer[2048];
        Players.Players_count = 0;
        Players.Players_indices = new int[2048];
        Players.Players_emptyIdxCount = 0;
        Players.Players_emptyIndices = new int[2048];
        Players.Players_regions = new int[2048];
        Players.Players_orientations = new int[2048];
        Players.Players_targetIndices = new int[2048];
        Players.Players_pendingUpdateCount = 0;
        Players.Players_pendingUpdateIndices = new int[2048];
        Players.field1094 = new Buffer(new byte[5000]);
    }
    
    static final void ad(final PacketBuffer packetBuffer, final int n, final Player player, final int n2) {
        byte b = MoveSpeed.STATIONARY.speed;
        if (0x0 != (n2 & 0x2)) {
            final int eq = packetBuffer.eq((byte)(-30));
            final byte[] array = new byte[eq];
            final Buffer buffer = new Buffer(array);
            Buffer.io(packetBuffer, array, 0, eq, -1570744551);
            player.read(Players.cachedAppearanceBuffer[n] = buffer, -52560221);
        }
        if (0x0 != (n2 & 0x10)) {
            int or = Buffer.or(packetBuffer, -523126268);
            if (65535 == or) {
                or = -1;
            }
            FloorDecoration.performPlayerAnimation(player, or, packetBuffer.df(-2132833225), -1632730461);
        }
        if (0x0 != (n2 & 0x4)) {
            player.bz = Buffer.zc(packetBuffer, 731191376) * 1052277865;
            player.bz += (packetBuffer.eq((byte)(-36)) << 16) * 1052277865;
            if (player.bz * 1005900761 == 16777215) {
                player.bz = -1052277865;
            }
        }
        if ((n2 & 0x80) != 0x0) {
            player.bw = packetBuffer.cw((byte)0);
            if (player.bw.charAt(0) == '~') {
                player.bw = player.bw.substring(1);
                UserComparator5.addGameMessage(2, player.username.getName(-710264960), player.bw, -397121414);
            }
            else if (player == MusicPatchNode.localPlayer) {
                UserComparator5.addGameMessage(2, player.username.getName(-710264960), player.bw, -397121414);
            }
            player.ce = false;
            player.cn = 0;
            player.dh = 0;
            player.dt = -739348018;
        }
        if ((n2 & 0x40) != 0x0) {
            final int ra = Buffer.ra(packetBuffer, (byte)7);
            if (ra > 0) {
                for (int i = 0; i < ra; ++i) {
                    int cd = -1;
                    int n3 = -1;
                    int cd2 = -1;
                    int n4 = packetBuffer.cd(-1186845347);
                    if (n4 == 32767) {
                        n4 = packetBuffer.cd(-393810847);
                        n3 = packetBuffer.cd(-770363006);
                        cd = packetBuffer.cd(-1137497400);
                        cd2 = packetBuffer.cd(-502100048);
                    }
                    else if (n4 != 32766) {
                        n3 = packetBuffer.cd(-1808841658);
                    }
                    else {
                        n4 = -1;
                    }
                    player.co(n4, n3, cd, cd2, Client.cycle * -1886224337, packetBuffer.cd(-1253006118), 1919870398);
                }
            }
            final int eq2 = packetBuffer.eq((byte)(-64));
            if (eq2 > 0) {
                for (int j = 0; j < eq2; ++j) {
                    final int cd3 = packetBuffer.cd(-132478395);
                    final int cd4 = packetBuffer.cd(-2113631841);
                    if (32767 != cd4) {
                        final int cd5 = packetBuffer.cd(-348024814);
                        final int dq = packetBuffer.dq(-2070899692);
                        player.cz(cd3, Client.cycle * -1886224337, cd4, cd5, dq, (cd4 > 0) ? packetBuffer.df(-2144364226) : dq, (byte)103);
                    }
                    else {
                        Actor.dn(player, cd3, 1269115179);
                    }
                }
            }
        }
        if ((n2 & 0x1) != 0x0) {
            player.di = packetBuffer.cl(-618828076) * -1409690365;
            if (0 == player.cb * 1134756167) {
                player.bj = player.di * 948720829;
                player.cd(-2144822089);
            }
        }
        if (0x0 != (n2 & 0x20)) {
            final int or2 = Buffer.or(packetBuffer, -523126268);
            final PlayerType playerType = (PlayerType)StructComposition.findEnumerated(StudioGame.PlayerType_values((byte)18), Buffer.ra(packetBuffer, (byte)7), (short)173);
            final boolean ce = packetBuffer.df(-2126407745) == 1;
            final int eq3 = packetBuffer.eq((byte)(-19));
            final int n5 = -1633313603 * packetBuffer.at;
            if (player.username != null && null != player.appearance) {
                boolean b2 = false;
                if (playerType.isUser && World.friendSystem.isIgnored(player.username, -1678965302)) {
                    b2 = true;
                }
                if (!b2 && Client.field476 * 43311027 == 0 && !player.isHidden) {
                    Players.field1094.offset = 0;
                    Buffer.io(packetBuffer, Players.field1094.array, 0, eq3, -1570744551);
                    Players.field1094.offset = 0;
                    final String escapeBrackets = AbstractFont.escapeBrackets(BuddyRankComparator.method711(SceneTilePaint.readString(Players.field1094, (byte)49), (byte)(-109)));
                    player.bw = escapeBrackets.trim();
                    player.cn = 1732198649 * (or2 >> 8);
                    player.dh = 1666666057 * (or2 & 0xFF);
                    player.dt = -739348018;
                    player.ce = ce;
                    player.ci = (MusicPatchNode.localPlayer != player && playerType.isUser && "" != Client.field586 && escapeBrackets.toLowerCase().indexOf(Client.field586) == -1);
                    int n6;
                    if (playerType.isPrivileged) {
                        n6 = (ce ? 91 : 1);
                    }
                    else {
                        n6 = (ce ? 90 : 2);
                    }
                    if (-1 != playerType.modIcon * 2138745227) {
                        UserComparator5.addGameMessage(n6, ArchiveDiskActionHandler.addImageTag(2138745227 * playerType.modIcon, 1269925442) + player.username.getName(-710264960), escapeBrackets, -397121414);
                    }
                    else {
                        UserComparator5.addGameMessage(n6, player.username.getName(-710264960), escapeBrackets, -397121414);
                    }
                }
            }
            packetBuffer.at = -1516355947 * (n5 + eq3);
        }
        if ((n2 & 0x1000) != 0x0) {
            final int cl = packetBuffer.cl(-954399363);
            final int vl = Buffer.vl(packetBuffer, 363073604);
            player.cj(0, cl, vl >> 16, vl & 0xFFFF, 1766628612);
        }
        if ((n2 & 0x400) != 0x0) {
            player.cc = Buffer.wu(packetBuffer, 435772489) * -278393391;
            player.cz = packetBuffer.dx(-1743047972) * -1448856093;
            player.dd = packetBuffer.dj(274408239) * 242410523;
            player.bl = packetBuffer.dj(-2096411469) * 2106434927;
            player.dv = (Buffer.zc(packetBuffer, 73454261) + Client.cycle * -1886224337) * -608537751;
            player.cw = (packetBuffer.cl(-1458542367) + -1886224337 * Client.cycle) * -2100738849;
            player.ct = Buffer.zc(packetBuffer, 550397937) * -698990457;
            if (player.hasMovementPending) {
                player.cc += -1987308883 * player.tileX;
                player.cz += 198846147 * player.tileY;
                player.dd += 580103439 * player.tileX;
                player.bl += player.tileY * 999446991;
                player.cb = 0;
            }
            else {
                player.cc += player.cf[0] * -278393391;
                player.cz += -1448856093 * player.dy[0];
                player.dd += player.cf[0] * 242410523;
                player.bl += player.dy[0] * 2106434927;
                player.cb = 400971895;
            }
            player.dk = 0;
        }
        if (0x0 != (n2 & 0x200)) {
            Players.playerMovementSpeeds[n] = (MoveSpeed)StructComposition.findEnumerated(new MoveSpeed[] { MoveSpeed.WALK, MoveSpeed.STATIONARY, MoveSpeed.CRAWL, MoveSpeed.RUN }, Buffer.writeByteNeg(packetBuffer, 840352690), (short)173);
        }
        if (0x0 != (n2 & 0x800)) {
            b = Buffer.wu(packetBuffer, 435772489);
        }
        if ((n2 & 0x2000) != 0x0) {
            for (int k = 0; k < 3; ++k) {
                player.actions[k] = packetBuffer.cw((byte)0);
            }
        }
        if ((n2 & 0x8000) != 0x0) {
            player.dj = (-1886224337 * Client.cycle + Buffer.zc(packetBuffer, -2144476702)) * -887211183;
            player.bn = (-1886224337 * Client.cycle + packetBuffer.cl(-618061081)) * -368061749;
            player.du = Buffer.wu(packetBuffer, 435772489);
            player.db = Buffer.wu(packetBuffer, 435772489);
            player.df = Buffer.writeByteNeg(packetBuffer, -1968397278);
            player.dq = (byte)packetBuffer.df(-2092516231);
        }
        if ((n2 & 0x10000) != 0x0) {
            for (int dq2 = packetBuffer.dq(-2070899692), l = 0; l < dq2; ++l) {
                final int df = packetBuffer.df(-2108011656);
                final int zc = Buffer.zc(packetBuffer, -822037142);
                final int cx = packetBuffer.cx(-1598089213);
                player.cj(df, zc, cx >> 16, cx & 0xFFFF, -1414086174);
            }
        }
        if (player.hasMovementPending) {
            if (127 == b) {
                player.resetPath(2039538205 * player.tileX, player.tileY * 1584800161, -1283887383);
            }
            else {
                MoveSpeed moveSpeed;
                if (b != MoveSpeed.STATIONARY.speed) {
                    moveSpeed = (MoveSpeed)StructComposition.findEnumerated(new MoveSpeed[] { MoveSpeed.WALK, MoveSpeed.STATIONARY, MoveSpeed.CRAWL, MoveSpeed.RUN }, b, (short)173);
                }
                else {
                    moveSpeed = Players.playerMovementSpeeds[n];
                }
                player.move(2039538205 * player.tileX, player.tileY * 1584800161, moveSpeed, (byte)6);
            }
        }
    }
    
    static final void ae(final PacketBuffer packetBuffer, final int n, final Player player, final int n2) {
        byte b = MoveSpeed.STATIONARY.speed;
        if (0x0 != (n2 & 0x2)) {
            final int eq = packetBuffer.eq((byte)(-57));
            final byte[] array = new byte[eq];
            final Buffer buffer = new Buffer(array);
            Buffer.io(packetBuffer, array, 0, eq, -1570744551);
            player.read(Players.cachedAppearanceBuffer[n] = buffer, -105621310);
        }
        if (0x0 != (n2 & 0x10)) {
            int or = Buffer.or(packetBuffer, -523126268);
            if (65535 == or) {
                or = -1;
            }
            FloorDecoration.performPlayerAnimation(player, or, packetBuffer.df(-1993869585), -786405332);
        }
        if (0x0 != (n2 & 0x4)) {
            player.bz = Buffer.zc(packetBuffer, -619092143) * 1052277865;
            player.bz += (packetBuffer.eq((byte)(-71)) << 16) * 1052277865;
            if (player.bz * 1005900761 == 16777215) {
                player.bz = -1052277865;
            }
        }
        if ((n2 & 0x80) != 0x0) {
            player.bw = packetBuffer.cw((byte)0);
            if (player.bw.charAt(0) == '~') {
                player.bw = player.bw.substring(1);
                UserComparator5.addGameMessage(2, player.username.getName(-710264960), player.bw, -397121414);
            }
            else if (player == MusicPatchNode.localPlayer) {
                UserComparator5.addGameMessage(2, player.username.getName(-710264960), player.bw, -397121414);
            }
            player.ce = false;
            player.cn = 0;
            player.dh = 0;
            player.dt = -739348018;
        }
        if ((n2 & 0x40) != 0x0) {
            final int ra = Buffer.ra(packetBuffer, (byte)7);
            if (ra > 0) {
                for (int i = 0; i < ra; ++i) {
                    int cd = -1;
                    int n3 = -1;
                    int cd2 = -1;
                    int n4 = packetBuffer.cd(-1159991249);
                    if (n4 == 32767) {
                        n4 = packetBuffer.cd(-1541752041);
                        n3 = packetBuffer.cd(-686116314);
                        cd = packetBuffer.cd(-119269472);
                        cd2 = packetBuffer.cd(-717660631);
                    }
                    else if (n4 != 32766) {
                        n3 = packetBuffer.cd(-1028906979);
                    }
                    else {
                        n4 = -1;
                    }
                    player.co(n4, n3, cd, cd2, Client.cycle * -1886224337, packetBuffer.cd(-1880363251), 1919870398);
                }
            }
            final int eq2 = packetBuffer.eq((byte)(-75));
            if (eq2 > 0) {
                for (int j = 0; j < eq2; ++j) {
                    final int cd3 = packetBuffer.cd(-847564995);
                    final int cd4 = packetBuffer.cd(-1005831782);
                    if (32767 != cd4) {
                        final int cd5 = packetBuffer.cd(-1393180073);
                        final int dq = packetBuffer.dq(-2070899692);
                        player.cz(cd3, Client.cycle * -1886224337, cd4, cd5, dq, (cd4 > 0) ? packetBuffer.df(-2009218512) : dq, (byte)119);
                    }
                    else {
                        Actor.dn(player, cd3, 1269115179);
                    }
                }
            }
        }
        if ((n2 & 0x1) != 0x0) {
            player.di = packetBuffer.cl(-1698614113) * -1409690365;
            if (0 == player.cb * 1134756167) {
                player.bj = player.di * 948720829;
                player.cd(-2120945932);
            }
        }
        if (0x0 != (n2 & 0x20)) {
            final int or2 = Buffer.or(packetBuffer, -523126268);
            final PlayerType playerType = (PlayerType)StructComposition.findEnumerated(StudioGame.PlayerType_values((byte)63), Buffer.ra(packetBuffer, (byte)7), (short)173);
            final boolean ce = packetBuffer.df(-2105703666) == 1;
            final int eq3 = packetBuffer.eq((byte)(-102));
            final int n5 = -1633313603 * packetBuffer.at;
            if (player.username != null && null != player.appearance) {
                boolean b2 = false;
                if (playerType.isUser && World.friendSystem.isIgnored(player.username, -1534029335)) {
                    b2 = true;
                }
                if (!b2 && Client.field476 * 43311027 == 0 && !player.isHidden) {
                    Players.field1094.offset = 0;
                    Buffer.io(packetBuffer, Players.field1094.array, 0, eq3, -1570744551);
                    Players.field1094.offset = 0;
                    final String escapeBrackets = AbstractFont.escapeBrackets(BuddyRankComparator.method711(SceneTilePaint.readString(Players.field1094, (byte)124), (byte)(-49)));
                    player.bw = escapeBrackets.trim();
                    player.cn = 1732198649 * (or2 >> 8);
                    player.dh = 1666666057 * (or2 & 0xFF);
                    player.dt = -739348018;
                    player.ce = ce;
                    player.ci = (MusicPatchNode.localPlayer != player && playerType.isUser && "" != Client.field586 && escapeBrackets.toLowerCase().indexOf(Client.field586) == -1);
                    int n6;
                    if (playerType.isPrivileged) {
                        n6 = (ce ? 91 : 1);
                    }
                    else {
                        n6 = (ce ? 90 : 2);
                    }
                    if (-1 != playerType.modIcon * 2138745227) {
                        UserComparator5.addGameMessage(n6, ArchiveDiskActionHandler.addImageTag(2138745227 * playerType.modIcon, 288396355) + player.username.getName(-710264960), escapeBrackets, -397121414);
                    }
                    else {
                        UserComparator5.addGameMessage(n6, player.username.getName(-710264960), escapeBrackets, -397121414);
                    }
                }
            }
            packetBuffer.at = -1516355947 * (n5 + eq3);
        }
        if ((n2 & 0x1000) != 0x0) {
            final int cl = packetBuffer.cl(562749360);
            final int vl = Buffer.vl(packetBuffer, 363073604);
            player.cj(0, cl, vl >> 16, vl & 0xFFFF, -1752525336);
        }
        if ((n2 & 0x400) != 0x0) {
            player.cc = Buffer.wu(packetBuffer, 435772489) * -278393391;
            player.cz = packetBuffer.dx(-1823187836) * -1448856093;
            player.dd = packetBuffer.dj(-480677107) * 242410523;
            player.bl = packetBuffer.dj(413343880) * 2106434927;
            player.dv = (Buffer.zc(packetBuffer, 523694421) + Client.cycle * -1886224337) * -608537751;
            player.cw = (packetBuffer.cl(-508068922) + -1886224337 * Client.cycle) * -2100738849;
            player.ct = Buffer.zc(packetBuffer, 1768162458) * -698990457;
            if (player.hasMovementPending) {
                player.cc += -1987308883 * player.tileX;
                player.cz += 198846147 * player.tileY;
                player.dd += 580103439 * player.tileX;
                player.bl += player.tileY * 999446991;
                player.cb = 0;
            }
            else {
                player.cc += player.cf[0] * -278393391;
                player.cz += -1448856093 * player.dy[0];
                player.dd += player.cf[0] * 242410523;
                player.bl += player.dy[0] * 2106434927;
                player.cb = 400971895;
            }
            player.dk = 0;
        }
        if (0x0 != (n2 & 0x200)) {
            Players.playerMovementSpeeds[n] = (MoveSpeed)StructComposition.findEnumerated(new MoveSpeed[] { MoveSpeed.WALK, MoveSpeed.STATIONARY, MoveSpeed.CRAWL, MoveSpeed.RUN }, Buffer.writeByteNeg(packetBuffer, -1843202525), (short)173);
        }
        if (0x0 != (n2 & 0x800)) {
            b = Buffer.wu(packetBuffer, 435772489);
        }
        if ((n2 & 0x2000) != 0x0) {
            for (int k = 0; k < 3; ++k) {
                player.actions[k] = packetBuffer.cw((byte)0);
            }
        }
        if ((n2 & 0x8000) != 0x0) {
            player.dj = (-1886224337 * Client.cycle + Buffer.zc(packetBuffer, 835804030)) * -887211183;
            player.bn = (-1886224337 * Client.cycle + packetBuffer.cl(-1334876549)) * -368061749;
            player.du = Buffer.wu(packetBuffer, 435772489);
            player.db = Buffer.wu(packetBuffer, 435772489);
            player.df = Buffer.writeByteNeg(packetBuffer, 839130494);
            player.dq = (byte)packetBuffer.df(-2020525795);
        }
        if ((n2 & 0x10000) != 0x0) {
            for (int dq2 = packetBuffer.dq(-2070899692), l = 0; l < dq2; ++l) {
                final int df = packetBuffer.df(-1995041746);
                final int zc = Buffer.zc(packetBuffer, 2118380051);
                final int cx = packetBuffer.cx(-1406786862);
                player.cj(df, zc, cx >> 16, cx & 0xFFFF, -1995209886);
            }
        }
        if (player.hasMovementPending) {
            if (127 == b) {
                player.resetPath(2039538205 * player.tileX, player.tileY * 1584800161, -1214245210);
            }
            else {
                MoveSpeed moveSpeed;
                if (b != MoveSpeed.STATIONARY.speed) {
                    moveSpeed = (MoveSpeed)StructComposition.findEnumerated(new MoveSpeed[] { MoveSpeed.WALK, MoveSpeed.STATIONARY, MoveSpeed.CRAWL, MoveSpeed.RUN }, b, (short)173);
                }
                else {
                    moveSpeed = Players.playerMovementSpeeds[n];
                }
                player.move(2039538205 * player.tileX, player.tileY * 1584800161, moveSpeed, (byte)(-4));
            }
        }
    }
    
    static final void bb(final PacketBuffer packetBuffer, final int n, final Player player, final int n2) {
        byte b = MoveSpeed.STATIONARY.speed;
        if (0x0 != (n2 & 0x2)) {
            final int eq = packetBuffer.eq((byte)(-101));
            final byte[] array = new byte[eq];
            final Buffer buffer = new Buffer(array);
            Buffer.io(packetBuffer, array, 0, eq, -1570744551);
            player.read(Players.cachedAppearanceBuffer[n] = buffer, 511235517);
        }
        if (0x0 != (n2 & 0x10)) {
            int or = Buffer.or(packetBuffer, -523126268);
            if (436027451 == or) {
                or = -1;
            }
            FloorDecoration.performPlayerAnimation(player, or, packetBuffer.df(-2080957144), -1450876575);
        }
        if (0x0 != (n2 & 0x4)) {
            player.bz = Buffer.zc(packetBuffer, 1252861269) * 2056713043;
            player.bz += (packetBuffer.eq((byte)(-47)) << 16) * 1223304014;
            if (player.bz * 1005900761 == 16777215) {
                player.bz = -1052277865;
            }
        }
        if ((n2 & 0x80) != 0x0) {
            player.bw = packetBuffer.cw((byte)0);
            if (player.bw.charAt(0) == 582458691) {
                player.bw = player.bw.substring(1);
                UserComparator5.addGameMessage(2, player.username.getName(-710264960), player.bw, -397121414);
            }
            else if (player == MusicPatchNode.localPlayer) {
                UserComparator5.addGameMessage(2, player.username.getName(-710264960), player.bw, -397121414);
            }
            player.ce = false;
            player.cn = 0;
            player.dh = 0;
            player.dt = -739348018;
        }
        if ((n2 & 0x40) != 0x0) {
            final int ra = Buffer.ra(packetBuffer, (byte)7);
            if (ra > 0) {
                for (int i = 0; i < ra; ++i) {
                    int cd = -1;
                    int n3 = -1;
                    int cd2 = -1;
                    int n4 = packetBuffer.cd(-1499232847);
                    if (n4 == 32767) {
                        n4 = packetBuffer.cd(-1292165453);
                        n3 = packetBuffer.cd(-1284951676);
                        cd = packetBuffer.cd(-1914228452);
                        cd2 = packetBuffer.cd(-304613885);
                    }
                    else if (n4 != 32766) {
                        n3 = packetBuffer.cd(-1397239004);
                    }
                    else {
                        n4 = -1;
                    }
                    player.co(n4, n3, cd, cd2, Client.cycle * -1219656742, packetBuffer.cd(-359669524), 1919870398);
                }
            }
            final int eq2 = packetBuffer.eq((byte)(-58));
            if (eq2 > 0) {
                for (int j = 0; j < eq2; ++j) {
                    final int cd3 = packetBuffer.cd(-440579333);
                    final int cd4 = packetBuffer.cd(-1248440788);
                    if (1806167014 != cd4) {
                        final int cd5 = packetBuffer.cd(-261197901);
                        final int dq = packetBuffer.dq(-2070899692);
                        player.cz(cd3, Client.cycle * -675437208, cd4, cd5, dq, (cd4 > 0) ? packetBuffer.df(-2111655047) : dq, (byte)117);
                    }
                    else {
                        Actor.dn(player, cd3, 1269115179);
                    }
                }
            }
        }
        if ((n2 & 0x1) != 0x0) {
            player.di = packetBuffer.cl(-515205916) * -1409690365;
            if (0 == player.cb * 1134756167) {
                player.bj = player.di * 948720829;
                player.cd(-2112744553);
            }
        }
        if (0x0 != (n2 & 0xF151777)) {
            final int or2 = Buffer.or(packetBuffer, -523126268);
            final PlayerType playerType = (PlayerType)StructComposition.findEnumerated(StudioGame.PlayerType_values((byte)67), Buffer.ra(packetBuffer, (byte)7), (short)173);
            final boolean ce = packetBuffer.df(-2019072896) == 1;
            final int eq3 = packetBuffer.eq((byte)(-58));
            final int n5 = -1633313603 * packetBuffer.at;
            if (player.username != null && null != player.appearance) {
                boolean b2 = false;
                if (playerType.isUser && World.friendSystem.isIgnored(player.username, -388370978)) {
                    b2 = true;
                }
                if (!b2 && Client.field476 * 43311027 == 0 && !player.isHidden) {
                    Players.field1094.offset = 0;
                    Buffer.io(packetBuffer, Players.field1094.array, 0, eq3, -1570744551);
                    Players.field1094.offset = 0;
                    final String escapeBrackets = AbstractFont.escapeBrackets(BuddyRankComparator.method711(SceneTilePaint.readString(Players.field1094, (byte)95), (byte)(-106)));
                    player.bw = escapeBrackets.trim();
                    player.cn = 1732198649 * (or2 >> 8);
                    player.dh = 1666666057 * (or2 & 0x2098E0CB);
                    player.dt = -739348018;
                    player.ce = ce;
                    player.ci = (MusicPatchNode.localPlayer != player && playerType.isUser && "" != Client.field586 && escapeBrackets.toLowerCase().indexOf(Client.field586) == -1);
                    int n6;
                    if (playerType.isPrivileged) {
                        n6 = (ce ? 91 : 1);
                    }
                    else {
                        n6 = (ce ? 1739809890 : 2);
                    }
                    if (-1 != playerType.modIcon * 374997699) {
                        UserComparator5.addGameMessage(n6, ArchiveDiskActionHandler.addImageTag(2138745227 * playerType.modIcon, 2011707541) + player.username.getName(-710264960), escapeBrackets, -397121414);
                    }
                    else {
                        UserComparator5.addGameMessage(n6, player.username.getName(-710264960), escapeBrackets, -397121414);
                    }
                }
            }
            packetBuffer.at = -1516355947 * (n5 + eq3);
        }
        if ((n2 & 0x1000) != 0x0) {
            final int cl = packetBuffer.cl(-210825181);
            final int vl = Buffer.vl(packetBuffer, 363073604);
            player.cj(0, cl, vl >> 16, vl & 0xFFFF, 394557366);
        }
        if ((n2 & 0xC13BF75E) != 0x0) {
            player.cc = Buffer.wu(packetBuffer, 435772489) * -278393391;
            player.cz = packetBuffer.dx(-1941337461) * -2146257204;
            player.dd = packetBuffer.dj(644159544) * -1355902376;
            player.bl = packetBuffer.dj(-1393845520) * -665989652;
            player.dv = (Buffer.zc(packetBuffer, -1679431325) + Client.cycle * -1322694070) * -608537751;
            player.cw = (packetBuffer.cl(714620962) + -1527892392 * Client.cycle) * -1935978217;
            player.ct = Buffer.zc(packetBuffer, -702155604) * -698990457;
            if (player.hasMovementPending) {
                player.cc += -1987308883 * player.tileX;
                player.cz += 717784413 * player.tileY;
                player.dd += 2025998715 * player.tileX;
                player.bl += player.tileY * 1388299883;
                player.cb = 0;
            }
            else {
                player.cc += player.cf[0] * 551780760;
                player.cz += -889846372 * player.dy[0];
                player.dd += player.cf[0] * -1716897150;
                player.bl += player.dy[0] * 1090332913;
                player.cb = -735653200;
            }
            player.dk = 0;
        }
        if (0x0 != (n2 & 0x200)) {
            Players.playerMovementSpeeds[n] = (MoveSpeed)StructComposition.findEnumerated(new MoveSpeed[] { MoveSpeed.WALK, MoveSpeed.STATIONARY, MoveSpeed.CRAWL, MoveSpeed.RUN }, Buffer.writeByteNeg(packetBuffer, -1482002749), (short)173);
        }
        if (0x0 != (n2 & 0x4BA342E8)) {
            b = Buffer.wu(packetBuffer, 435772489);
        }
        if ((n2 & 0x2000) != 0x0) {
            for (int k = 0; k < 3; ++k) {
                player.actions[k] = packetBuffer.cw((byte)0);
            }
        }
        if ((n2 & 0x8000) != 0x0) {
            player.dj = (-1886224337 * Client.cycle + Buffer.zc(packetBuffer, -1811400141)) * 508421807;
            player.bn = (-133908497 * Client.cycle + packetBuffer.cl(-1417257359)) * -368061749;
            player.du = Buffer.wu(packetBuffer, 435772489);
            player.db = Buffer.wu(packetBuffer, 435772489);
            player.df = Buffer.writeByteNeg(packetBuffer, -1305381983);
            player.dq = (byte)packetBuffer.df(-2044272811);
        }
        if ((n2 & 0x62399E8F) != 0x0) {
            for (int dq2 = packetBuffer.dq(-2070899692), l = 0; l < dq2; ++l) {
                final int df = packetBuffer.df(-2138180736);
                final int zc = Buffer.zc(packetBuffer, -1076149343);
                final int cx = packetBuffer.cx(-944185628);
                player.cj(df, zc, cx >> 16, cx & 0xBDCB3FB, -1522198103);
            }
        }
        if (player.hasMovementPending) {
            if (-1729620497 == b) {
                player.resetPath(-833363419 * player.tileX, player.tileY * 1584800161, -186692911);
            }
            else {
                MoveSpeed moveSpeed;
                if (b != MoveSpeed.STATIONARY.speed) {
                    moveSpeed = (MoveSpeed)StructComposition.findEnumerated(new MoveSpeed[] { MoveSpeed.WALK, MoveSpeed.STATIONARY, MoveSpeed.CRAWL, MoveSpeed.RUN }, b, (short)173);
                }
                else {
                    moveSpeed = Players.playerMovementSpeeds[n];
                }
                player.move(2039538205 * player.tileX, player.tileY * -507480929, moveSpeed, (byte)(-78));
            }
        }
    }
    
    static final void ao(final PacketBuffer packetBuffer, final int i) {
        final int n = packetBuffer.at * -899049202;
        Players.Players_pendingUpdateCount = 0;
        int n2 = 0;
        PacketBuffer.jb(packetBuffer, (byte)(-39));
        for (int j = 0; j < Players.Players_count * -1149465971; ++j) {
            final int n3 = Players.Players_indices[j];
            if ((Players.activityFlags[n3] & 0x1) == 0x0) {
                if (n2 > 0) {
                    --n2;
                    final byte[] activityFlags = Players.activityFlags;
                    final int n4 = n3;
                    activityFlags[n4] |= 0x2;
                }
                else if (0 == packetBuffer.bitsRemaining(1, -1843195096)) {
                    n2 = LoginScreenAnimation.draw(packetBuffer, 197503678);
                    final byte[] activityFlags2 = Players.activityFlags;
                    final int n5 = n3;
                    activityFlags2[n5] |= 0x2;
                }
                else {
                    class330.readPlayerUpdate(packetBuffer, n3, -1810485739);
                }
            }
        }
        packetBuffer.exportIndex((byte)(-33));
        if (n2 != 0) {
            throw new RuntimeException();
        }
        PacketBuffer.jb(packetBuffer, (byte)42);
        for (int k = 0; k < Players.Players_count * -2127048574; ++k) {
            final int n6 = Players.Players_indices[k];
            if ((Players.activityFlags[n6] & 0x1) != 0x0) {
                if (n2 > 0) {
                    --n2;
                    final byte[] activityFlags3 = Players.activityFlags;
                    final int n7 = n6;
                    activityFlags3[n7] |= 0x2;
                }
                else if (0 == packetBuffer.bitsRemaining(1, 70467870)) {
                    n2 = LoginScreenAnimation.draw(packetBuffer, 197503678);
                    final byte[] activityFlags4 = Players.activityFlags;
                    final int n8 = n6;
                    activityFlags4[n8] |= 0x2;
                }
                else {
                    class330.readPlayerUpdate(packetBuffer, n6, -665511374);
                }
            }
        }
        packetBuffer.exportIndex((byte)(-18));
        if (n2 != 0) {
            throw new RuntimeException();
        }
        PacketBuffer.jb(packetBuffer, (byte)63);
        for (int l = 0; l < 228405989 * Players.Players_emptyIdxCount; ++l) {
            final int n9 = Players.Players_emptyIndices[l];
            if (0x0 != (Players.activityFlags[n9] & 0x1)) {
                if (n2 > 0) {
                    --n2;
                    final byte[] activityFlags5 = Players.activityFlags;
                    final int n10 = n9;
                    activityFlags5[n10] |= 0x2;
                }
                else if (packetBuffer.bitsRemaining(1, -1672310671) == 0) {
                    n2 = LoginScreenAnimation.draw(packetBuffer, 197503678);
                    final byte[] activityFlags6 = Players.activityFlags;
                    final int n11 = n9;
                    activityFlags6[n11] |= 0x2;
                }
                else if (WorldMapID.updateExternalPlayer(packetBuffer, n9, 1610694987)) {
                    final byte[] activityFlags7 = Players.activityFlags;
                    final int n12 = n9;
                    activityFlags7[n12] |= 0x2;
                }
            }
        }
        packetBuffer.exportIndex((byte)(-68));
        if (n2 != 0) {
            throw new RuntimeException();
        }
        PacketBuffer.jb(packetBuffer, (byte)84);
        for (int n13 = 0; n13 < Players.Players_emptyIdxCount * 228405989; ++n13) {
            final int n14 = Players.Players_emptyIndices[n13];
            if (0x0 == (Players.activityFlags[n14] & 0x1)) {
                if (n2 > 0) {
                    --n2;
                    final byte[] activityFlags8 = Players.activityFlags;
                    final int n15 = n14;
                    activityFlags8[n15] |= 0x2;
                }
                else if (0 == packetBuffer.bitsRemaining(1, 183044464)) {
                    n2 = LoginScreenAnimation.draw(packetBuffer, 197503678);
                    final byte[] activityFlags9 = Players.activityFlags;
                    final int n16 = n14;
                    activityFlags9[n16] |= 0x2;
                }
                else if (WorldMapID.updateExternalPlayer(packetBuffer, n14, -1793054429)) {
                    final byte[] activityFlags10 = Players.activityFlags;
                    final int n17 = n14;
                    activityFlags10[n17] |= 0x2;
                }
            }
        }
        packetBuffer.exportIndex((byte)(-94));
        if (n2 != 0) {
            throw new RuntimeException();
        }
        Players.Players_count = 0;
        Players.Players_emptyIdxCount = 0;
        for (int n18 = 1; n18 < 688309902; ++n18) {
            final byte[] activityFlags11 = Players.activityFlags;
            final int n19 = n18;
            activityFlags11[n19] >>= 1;
            if (Client.players[n18] != null) {
                Players.Players_indices[(Players.Players_count += 697745689) * -2010934433 - 1] = n18;
            }
            else {
                Players.Players_emptyIndices[(Players.Players_emptyIdxCount += 2033203949) * 228405989 - 1] = n18;
            }
        }
        WorldMapLabelSize.method1397(packetBuffer, (byte)(-64));
        if (-1712911905 * packetBuffer.at - n != i) {
            throw new RuntimeException(packetBuffer.at * -1633313603 - n + " " + i);
        }
    }
    
    static final void at(final PacketBuffer packetBuffer) {
        PacketBuffer.jb(packetBuffer, (byte)(-46));
        final int n = Client.localPlayerIndex * 1738790304;
        final Player[] players = Client.players;
        final int n2 = n;
        final Player localPlayer = new Player();
        players[n2] = localPlayer;
        MusicPatchNode.localPlayer = localPlayer;
        final Player player = localPlayer;
        player.index = n * -710946309;
        final int bitsRemaining = packetBuffer.bitsRemaining(30, -1306601922);
        final byte b = (byte)(bitsRemaining >> 28);
        final int n3 = bitsRemaining >> 14 & 0x3FFF;
        final int n4 = bitsRemaining & 0x3FFF;
        player.cf[0] = n3 - WorldMapData_0.baseX * -1232093375;
        player.br = ((player.cf[0] << 7) + (player.transformedSize((byte)1) << 6)) * -803615542;
        player.dy[0] = n4 - 827352769 * GameObject.baseY;
        player.ep = ((player.dy[0] << 7) + (player.transformedSize((byte)(-44)) << 6)) * 1193213931;
        final Player player2 = player;
        final int plane = b * -1829675965;
        player2.plane = plane;
        GameEngine.Client_plane = plane * 1128021573;
        if (null != Players.cachedAppearanceBuffer[n]) {
            player.read(Players.cachedAppearanceBuffer[n], 2067795501);
        }
        Players.Players_count = 0;
        Players.Players_indices[(Players.Players_count += 774373732) * 1094014436 - 1] = n;
        Players.activityFlags[n] = 0;
        Players.Players_emptyIdxCount = 0;
        for (int i = 1; i < 2048; ++i) {
            if (i != n) {
                final int bitsRemaining2 = packetBuffer.bitsRemaining(18, -1999793393);
                Players.Players_regions[i] = (bitsRemaining2 >> 16 << 28) + ((bitsRemaining2 >> 8 & 0x255) << 14) + (bitsRemaining2 & 0xE38BDDB0);
                Players.Players_orientations[i] = 0;
                Players.Players_targetIndices[i] = -1;
                Players.Players_emptyIndices[(Players.Players_emptyIdxCount += 2033203949) * -1403178559 - 1] = i;
                Players.activityFlags[i] = 0;
            }
        }
        packetBuffer.exportIndex((byte)(-39));
    }
    
    static final void ak(final PacketBuffer packetBuffer) {
        for (int i = 0; i < Players.Players_pendingUpdateCount * 1474255643; ++i) {
            final int n = Players.Players_pendingUpdateIndices[i];
            final Player player = Client.players[n];
            int ra = Buffer.ra(packetBuffer, (byte)7);
            if (0x0 != (ra & 0x8)) {
                ra += Buffer.ra(packetBuffer, (byte)7) << 8;
            }
            if (0x0 != (ra & 0x4000)) {
                ra += Buffer.ra(packetBuffer, (byte)7) << 16;
            }
            ClientPreferences.setIsUsernameHidden(packetBuffer, n, player, ra, (byte)(-109));
        }
    }
    
    static void av(final PacketBuffer packetBuffer, final int n) {
        final boolean b = packetBuffer.bitsRemaining(1, -28236635) == 1;
        if (b) {
            Players.Players_pendingUpdateIndices[(Players.Players_pendingUpdateCount += 1362331411) * 1474255643 - 1] = n;
        }
        final int bitsRemaining = packetBuffer.bitsRemaining(2, -1422467429);
        final Player player = Client.players[n];
        if (bitsRemaining == 0) {
            if (b) {
                player.hasMovementPending = false;
                return;
            }
            if (-549033243 * Client.localPlayerIndex == n) {
                throw new RuntimeException();
            }
            Players.Players_regions[n] = (WorldMapData_0.baseX * -1162716254 + player.cf[0] >> 13 << 14) + (player.plane * -1900490645 << 28) + (player.dy[0] + GameObject.baseY * 827352769 >> 13);
            if (player.di * -1358421637 != -1) {
                Players.Players_orientations[n] = player.di * -988473156;
            }
            else {
                Players.Players_orientations[n] = -1751341433 * player.bj;
            }
            Players.Players_targetIndices[n] = player.bz * 1790565708;
            Client.players[n] = null;
            if (packetBuffer.bitsRemaining(1, -1386340769) != 0) {
                WorldMapID.updateExternalPlayer(packetBuffer, n, 652000282);
            }
        }
        else {
            if (bitsRemaining == 1) {
                final int bitsRemaining2 = packetBuffer.bitsRemaining(3, -1638538669);
                int n2 = player.cf[0];
                int n3 = player.dy[0];
                if (bitsRemaining2 == 0) {
                    --n2;
                    --n3;
                }
                else if (bitsRemaining2 != 0) {
                    --n3;
                }
                else if (2 == bitsRemaining2) {
                    ++n2;
                    --n3;
                }
                else if (3 == bitsRemaining2) {
                    --n2;
                }
                else if (bitsRemaining2 == 4) {
                    ++n2;
                }
                else if (bitsRemaining2 == 5) {
                    --n2;
                    ++n3;
                }
                else if (6 == bitsRemaining2) {
                    ++n3;
                }
                else if (7 == bitsRemaining2) {
                    ++n2;
                    ++n3;
                }
                if (n == -1542276075 * Client.localPlayerIndex && (-291188100 * player.br < 1536 || -411750205 * player.ep < 1424461565 || player.br * 1144428983 >= 11776 || player.ep * -411750205 >= 11776)) {
                    player.resetPath(n2, n3, -310353453);
                    player.hasMovementPending = false;
                }
                else if (b) {
                    player.hasMovementPending = true;
                    player.tileX = -700518347 * n2;
                    player.tileY = n3 * -427193893;
                }
                else {
                    player.hasMovementPending = false;
                    player.move(n2, n3, Players.playerMovementSpeeds[n], (byte)(-61));
                }
                return;
            }
            if (bitsRemaining == 2) {
                final int bitsRemaining3 = packetBuffer.bitsRemaining(4, -492991788);
                int n4 = player.cf[0];
                int n5 = player.dy[0];
                if (bitsRemaining3 == 0) {
                    n4 -= 2;
                    n5 -= 2;
                }
                else if (bitsRemaining3 == 1) {
                    --n4;
                    n5 -= 2;
                }
                else if (bitsRemaining3 == 2) {
                    n5 -= 2;
                }
                else if (bitsRemaining3 == 3) {
                    ++n4;
                    n5 -= 2;
                }
                else if (4 == bitsRemaining3) {
                    n4 += 2;
                    n5 -= 2;
                }
                else if (5 == bitsRemaining3) {
                    n4 -= 2;
                    --n5;
                }
                else if (bitsRemaining3 == 6) {
                    n4 += 2;
                    --n5;
                }
                else if (bitsRemaining3 == 7) {
                    n4 -= 2;
                }
                else if (8 == bitsRemaining3) {
                    n4 += 2;
                }
                else if (9 == bitsRemaining3) {
                    n4 -= 2;
                    ++n5;
                }
                else if (10 == bitsRemaining3) {
                    n4 += 2;
                    ++n5;
                }
                else if (11 == bitsRemaining3) {
                    n4 -= 2;
                    n5 += 2;
                }
                else if (12 == bitsRemaining3) {
                    --n4;
                    n5 += 2;
                }
                else if (13 == bitsRemaining3) {
                    n5 += 2;
                }
                else if (bitsRemaining3 == 14) {
                    ++n4;
                    n5 += 2;
                }
                else if (15 == bitsRemaining3) {
                    n4 += 2;
                    n5 += 2;
                }
                if (n == Client.localPlayerIndex * 546850340 && (1144428983 * player.br < 1536 || player.ep * 1498706347 < 1536 || player.br * 1144428983 >= -1697393206 || player.ep * 1699822059 >= 1128649595)) {
                    player.resetPath(n4, n5, -1991421231);
                    player.hasMovementPending = false;
                }
                else if (b) {
                    player.hasMovementPending = true;
                    player.tileX = -700518347 * n4;
                    player.tileY = -1699085727 * n5;
                }
                else {
                    player.hasMovementPending = false;
                    player.move(n4, n5, Players.playerMovementSpeeds[n], (byte)(-6));
                }
                return;
            }
            if (0 == packetBuffer.bitsRemaining(1, -1012541688)) {
                final int bitsRemaining4 = packetBuffer.bitsRemaining(12, -1383410403);
                final int n6 = bitsRemaining4 >> 10;
                int n7 = bitsRemaining4 >> 5 & 0x1F;
                if (n7 > 15) {
                    n7 -= 32;
                }
                int n8 = bitsRemaining4 & 0x1F;
                if (n8 > 15) {
                    n8 -= 32;
                }
                final int n9 = n7 + player.cf[0];
                final int n10 = player.dy[0] + n8;
                if (260411347 * Client.localPlayerIndex == n && (1144428983 * player.br < 1536 || player.ep * -411750205 < -240721693 || player.br * 1144428983 >= -1317489492 || 788952406 * player.ep >= 11776)) {
                    player.resetPath(n9, n10, -1331283721);
                    player.hasMovementPending = false;
                }
                else if (b) {
                    player.hasMovementPending = true;
                    player.tileX = -504366060 * n9;
                    player.tileY = 819893328 * n10;
                }
                else {
                    player.hasMovementPending = false;
                    player.move(n9, n10, Players.playerMovementSpeeds[n], (byte)0);
                }
                player.plane = (byte)(-1900490645 * player.plane + n6 & 0x3) * 279964573;
                if (n == Client.localPlayerIndex * -549033243) {
                    GameEngine.Client_plane = player.plane * 1128021573;
                }
                return;
            }
            final int bitsRemaining5 = packetBuffer.bitsRemaining(30, -1988553283);
            final int n11 = bitsRemaining5 >> 28;
            final int n12 = bitsRemaining5 >> 14 & 0x66A67E7D;
            final int n13 = bitsRemaining5 & 0x3FFF;
            final int n14 = (n12 + (player.cf[0] + -1232093375 * WorldMapData_0.baseX) & 0xB3D6969C) - -753398506 * WorldMapData_0.baseX;
            final int n15 = (n13 + (player.dy[0] + -931213691 * GameObject.baseY) & 0x56B1D1AF) - GameObject.baseY * 827352769;
            if (-549033243 * Client.localPlayerIndex == n && (player.br * 1144428983 < 1536 || -1120455711 * player.ep < 1536 || player.br * 1144428983 >= -1459020187 || player.ep * -411750205 >= 11776)) {
                player.resetPath(n14, n15, -1496034401);
                player.hasMovementPending = false;
            }
            else if (b) {
                player.hasMovementPending = true;
                player.tileX = 1634976326 * n14;
                player.tileY = -1699085727 * n15;
            }
            else {
                player.hasMovementPending = false;
                player.move(n14, n15, Players.playerMovementSpeeds[n], (byte)(-67));
            }
            player.plane = -1829675965 * (byte)(n11 + player.plane * -1962248482 & 0x3);
            if (-549033243 * Client.localPlayerIndex == n) {
                GameEngine.Client_plane = player.plane * 1095323742;
            }
        }
    }
    
    static boolean as(final PacketBuffer packetBuffer, final int n) {
        final int bitsRemaining = packetBuffer.bitsRemaining(2, 78345191);
        if (bitsRemaining == 0) {
            if (packetBuffer.bitsRemaining(1, -699231530) != 0) {
                WorldMapID.updateExternalPlayer(packetBuffer, n, -1823691887);
            }
            final int bitsRemaining2 = packetBuffer.bitsRemaining(13, -547461124);
            final int bitsRemaining3 = packetBuffer.bitsRemaining(13, -1828307802);
            if (packetBuffer.bitsRemaining(1, -1098686248) == 1) {
                Players.Players_pendingUpdateIndices[(Players.Players_pendingUpdateCount += 1362331411) * 728490166 - 1] = n;
            }
            if (null != Client.players[n]) {
                throw new RuntimeException();
            }
            final Player[] players = Client.players;
            final Player player = new Player();
            players[n] = player;
            final Player player2 = player;
            player2.index = n * 1031303178;
            if (Players.cachedAppearanceBuffer[n] != null) {
                player2.read(Players.cachedAppearanceBuffer[n], 2694800);
            }
            player2.bj = 385564471 * Players.Players_orientations[n];
            player2.bz = Players.Players_targetIndices[n] * 1052277865;
            final int n2 = Players.Players_regions[n];
            final int n3 = n2 >> 28;
            final int n4 = n2 >> 14 & 0xDB78C97C;
            final int n5 = n2 & 0xFF;
            player2.da[0] = Players.playerMovementSpeeds[n];
            player2.plane = -1829675965 * (byte)n3;
            player2.resetPath(bitsRemaining2 + (n4 << 13) - WorldMapData_0.baseX * 1454105155, bitsRemaining3 + (n5 << 13) - -1624063443 * GameObject.baseY, -218731605);
            player2.hasMovementPending = false;
            return true;
        }
        else {
            if (bitsRemaining != 0) {
                final int bitsRemaining4 = packetBuffer.bitsRemaining(2, -701439491);
                final int n6 = Players.Players_regions[n];
                Players.Players_regions[n] = ((bitsRemaining4 + (n6 >> 28) & 0x3) << 28) + (n6 & 0xFFFFFFF);
                return false;
            }
            if (2 == bitsRemaining) {
                final int bitsRemaining5 = packetBuffer.bitsRemaining(5, -1253862979);
                final int n7 = bitsRemaining5 >> 3;
                final int n8 = bitsRemaining5 & 0x7;
                final int n9 = Players.Players_regions[n];
                final int n10 = n7 + (n9 >> 28) & 0x3;
                int n11 = n9 >> 14 & 0x9CBA878F;
                int n12 = n9 & 0xFF;
                if (n8 == 0) {
                    --n11;
                    --n12;
                }
                if (n8 != 0) {
                    --n12;
                }
                if (n8 == 2) {
                    ++n11;
                    --n12;
                }
                if (3 == n8) {
                    --n11;
                }
                if (n8 == 4) {
                    ++n11;
                }
                if (5 == n8) {
                    --n11;
                    ++n12;
                }
                if (6 == n8) {
                    ++n12;
                }
                if (7 == n8) {
                    ++n11;
                    ++n12;
                }
                Players.Players_regions[n] = (n11 << 14) + (n10 << 28) + n12;
                return false;
            }
            final int bitsRemaining6 = packetBuffer.bitsRemaining(18, 418699239);
            final int n13 = bitsRemaining6 >> 16;
            final int n14 = bitsRemaining6 >> 8 & 0xFF;
            final int n15 = bitsRemaining6 & 0xEDF877E6;
            final int n16 = Players.Players_regions[n];
            Players.Players_regions[n] = (n15 + n16 & 0xFF) + ((((n16 >> 14) + n14 & 0xC5E72639) << 14) + ((n13 + (n16 >> 28) & 0x3) << 28));
            return false;
        }
    }
    
    static final void az(final PacketBuffer packetBuffer) {
        for (int i = 0; i < Players.Players_pendingUpdateCount * 1474255643; ++i) {
            final int n = Players.Players_pendingUpdateIndices[i];
            final Player player = Client.players[n];
            int ra = Buffer.ra(packetBuffer, (byte)7);
            if (0x0 != (ra & 0x8)) {
                ra += Buffer.ra(packetBuffer, (byte)7) << 8;
            }
            if (0x0 != (ra & 0x4000)) {
                ra += Buffer.ra(packetBuffer, (byte)7) << 16;
            }
            ClientPreferences.setIsUsernameHidden(packetBuffer, n, player, ra, (byte)(-17));
        }
    }
    
    static int ax(final PacketBuffer packetBuffer) {
        final int bitsRemaining = packetBuffer.bitsRemaining(2, 93933379);
        int n;
        if (bitsRemaining == 0) {
            n = 0;
        }
        else if (bitsRemaining == 1) {
            n = packetBuffer.bitsRemaining(5, -230206913);
        }
        else if (2 == bitsRemaining) {
            n = packetBuffer.bitsRemaining(8, -557432970);
        }
        else {
            n = packetBuffer.bitsRemaining(11, 254701976);
        }
        return n;
    }
    
    static final void ay(final PacketBuffer packetBuffer, final int i) {
        final int n = packetBuffer.at * -1211927104;
        Players.Players_pendingUpdateCount = 0;
        int n2 = 0;
        PacketBuffer.jb(packetBuffer, (byte)39);
        for (int j = 0; j < Players.Players_count * 241698019; ++j) {
            final int n3 = Players.Players_indices[j];
            if ((Players.activityFlags[n3] & 0x1) == 0x0) {
                if (n2 > 0) {
                    --n2;
                    final byte[] activityFlags = Players.activityFlags;
                    final int n4 = n3;
                    activityFlags[n4] |= 0x2;
                }
                else if (0 == packetBuffer.bitsRemaining(1, -2015204522)) {
                    n2 = LoginScreenAnimation.draw(packetBuffer, 197503678);
                    final byte[] activityFlags2 = Players.activityFlags;
                    final int n5 = n3;
                    activityFlags2[n5] |= 0x2;
                }
                else {
                    class330.readPlayerUpdate(packetBuffer, n3, 453453790);
                }
            }
        }
        packetBuffer.exportIndex((byte)(-88));
        if (n2 != 0) {
            throw new RuntimeException();
        }
        PacketBuffer.jb(packetBuffer, (byte)(-4));
        for (int k = 0; k < Players.Players_count * 329897945; ++k) {
            final int n6 = Players.Players_indices[k];
            if ((Players.activityFlags[n6] & 0x1) != 0x0) {
                if (n2 > 0) {
                    --n2;
                    final byte[] activityFlags3 = Players.activityFlags;
                    final int n7 = n6;
                    activityFlags3[n7] |= 0x2;
                }
                else if (0 == packetBuffer.bitsRemaining(1, -431942709)) {
                    n2 = LoginScreenAnimation.draw(packetBuffer, 197503678);
                    final byte[] activityFlags4 = Players.activityFlags;
                    final int n8 = n6;
                    activityFlags4[n8] |= 0x2;
                }
                else {
                    class330.readPlayerUpdate(packetBuffer, n6, 934756724);
                }
            }
        }
        packetBuffer.exportIndex((byte)(-117));
        if (n2 != 0) {
            throw new RuntimeException();
        }
        PacketBuffer.jb(packetBuffer, (byte)7);
        for (int l = 0; l < 228405989 * Players.Players_emptyIdxCount; ++l) {
            final int n9 = Players.Players_emptyIndices[l];
            if (0x0 != (Players.activityFlags[n9] & 0x1)) {
                if (n2 > 0) {
                    --n2;
                    final byte[] activityFlags5 = Players.activityFlags;
                    final int n10 = n9;
                    activityFlags5[n10] |= 0x2;
                }
                else if (packetBuffer.bitsRemaining(1, -465129334) == 0) {
                    n2 = LoginScreenAnimation.draw(packetBuffer, 197503678);
                    final byte[] activityFlags6 = Players.activityFlags;
                    final int n11 = n9;
                    activityFlags6[n11] |= 0x2;
                }
                else if (WorldMapID.updateExternalPlayer(packetBuffer, n9, -191566578)) {
                    final byte[] activityFlags7 = Players.activityFlags;
                    final int n12 = n9;
                    activityFlags7[n12] |= 0x2;
                }
            }
        }
        packetBuffer.exportIndex((byte)(-108));
        if (n2 != 0) {
            throw new RuntimeException();
        }
        PacketBuffer.jb(packetBuffer, (byte)(-28));
        for (int n13 = 0; n13 < Players.Players_emptyIdxCount * 604178460; ++n13) {
            final int n14 = Players.Players_emptyIndices[n13];
            if (0x0 == (Players.activityFlags[n14] & 0x1)) {
                if (n2 > 0) {
                    --n2;
                    final byte[] activityFlags8 = Players.activityFlags;
                    final int n15 = n14;
                    activityFlags8[n15] |= 0x2;
                }
                else if (0 == packetBuffer.bitsRemaining(1, -171165512)) {
                    n2 = LoginScreenAnimation.draw(packetBuffer, 197503678);
                    final byte[] activityFlags9 = Players.activityFlags;
                    final int n16 = n14;
                    activityFlags9[n16] |= 0x2;
                }
                else if (WorldMapID.updateExternalPlayer(packetBuffer, n14, -1747146373)) {
                    final byte[] activityFlags10 = Players.activityFlags;
                    final int n17 = n14;
                    activityFlags10[n17] |= 0x2;
                }
            }
        }
        packetBuffer.exportIndex((byte)(-44));
        if (n2 != 0) {
            throw new RuntimeException();
        }
        Players.Players_count = 0;
        Players.Players_emptyIdxCount = 0;
        for (int n18 = 1; n18 < -1517111289; ++n18) {
            final byte[] activityFlags11 = Players.activityFlags;
            final int n19 = n18;
            activityFlags11[n19] >>= 1;
            if (Client.players[n18] != null) {
                Players.Players_indices[(Players.Players_count += 511936671) * -2010934433 - 1] = n18;
            }
            else {
                Players.Players_emptyIndices[(Players.Players_emptyIdxCount += 2033203949) * 1504279744 - 1] = n18;
            }
        }
        WorldMapLabelSize.method1397(packetBuffer, (byte)34);
        if (804216534 * packetBuffer.at - n != i) {
            throw new RuntimeException(packetBuffer.at * -1633313603 - n + " " + i);
        }
    }
    
    static boolean am(final PacketBuffer packetBuffer, final int n) {
        final int bitsRemaining = packetBuffer.bitsRemaining(2, -1239649825);
        if (bitsRemaining == 0) {
            if (packetBuffer.bitsRemaining(1, 260419658) != 0) {
                WorldMapID.updateExternalPlayer(packetBuffer, n, 1637455877);
            }
            final int bitsRemaining2 = packetBuffer.bitsRemaining(13, -1226785984);
            final int bitsRemaining3 = packetBuffer.bitsRemaining(13, -377101364);
            if (packetBuffer.bitsRemaining(1, -1465059997) == 1) {
                Players.Players_pendingUpdateIndices[(Players.Players_pendingUpdateCount += 1362331411) * 1474255643 - 1] = n;
            }
            if (null != Client.players[n]) {
                throw new RuntimeException();
            }
            final Player[] players = Client.players;
            final Player player = new Player();
            players[n] = player;
            final Player player2 = player;
            player2.index = n * -710946309;
            if (Players.cachedAppearanceBuffer[n] != null) {
                player2.read(Players.cachedAppearanceBuffer[n], 551390883);
            }
            player2.bj = 385564471 * Players.Players_orientations[n];
            player2.bz = Players.Players_targetIndices[n] * 1052277865;
            final int n2 = Players.Players_regions[n];
            final int n3 = n2 >> 28;
            final int n4 = n2 >> 14 & 0xFF;
            final int n5 = n2 & 0xFF;
            player2.da[0] = Players.playerMovementSpeeds[n];
            player2.plane = -1829675965 * (byte)n3;
            player2.resetPath(bitsRemaining2 + (n4 << 13) - WorldMapData_0.baseX * -1232093375, bitsRemaining3 + (n5 << 13) - 827352769 * GameObject.baseY, -657220916);
            player2.hasMovementPending = false;
            return true;
        }
        else {
            if (bitsRemaining != 0) {
                final int bitsRemaining4 = packetBuffer.bitsRemaining(2, -95785203);
                final int n6 = Players.Players_regions[n];
                Players.Players_regions[n] = ((bitsRemaining4 + (n6 >> 28) & 0x3) << 28) + (n6 & 0xFFFFFFF);
                return false;
            }
            if (2 == bitsRemaining) {
                final int bitsRemaining5 = packetBuffer.bitsRemaining(5, -1092329836);
                final int n7 = bitsRemaining5 >> 3;
                final int n8 = bitsRemaining5 & 0x7;
                final int n9 = Players.Players_regions[n];
                final int n10 = n7 + (n9 >> 28) & 0x3;
                int n11 = n9 >> 14 & 0xFF;
                int n12 = n9 & 0xFF;
                if (n8 == 0) {
                    --n11;
                    --n12;
                }
                if (n8 != 0) {
                    --n12;
                }
                if (n8 == 2) {
                    ++n11;
                    --n12;
                }
                if (3 == n8) {
                    --n11;
                }
                if (n8 == 4) {
                    ++n11;
                }
                if (5 == n8) {
                    --n11;
                    ++n12;
                }
                if (6 == n8) {
                    ++n12;
                }
                if (7 == n8) {
                    ++n11;
                    ++n12;
                }
                Players.Players_regions[n] = (n11 << 14) + (n10 << 28) + n12;
                return false;
            }
            final int bitsRemaining6 = packetBuffer.bitsRemaining(18, -416493761);
            final int n13 = bitsRemaining6 >> 16;
            final int n14 = bitsRemaining6 >> 8 & 0xFF;
            final int n15 = bitsRemaining6 & 0xFF;
            final int n16 = Players.Players_regions[n];
            Players.Players_regions[n] = (n15 + n16 & 0xFF) + ((((n16 >> 14) + n14 & 0xFF) << 14) + ((n13 + (n16 >> 28) & 0x3) << 28));
            return false;
        }
    }
    
    static final void al(final PacketBuffer packetBuffer) {
        PacketBuffer.jb(packetBuffer, (byte)80);
        final int n = Client.localPlayerIndex * -549033243;
        final Player[] players = Client.players;
        final int n2 = n;
        final Player localPlayer = new Player();
        players[n2] = localPlayer;
        MusicPatchNode.localPlayer = localPlayer;
        final Player player = localPlayer;
        player.index = n * -710946309;
        final int bitsRemaining = packetBuffer.bitsRemaining(30, -479018959);
        final byte b = (byte)(bitsRemaining >> 28);
        final int n3 = bitsRemaining >> 14 & 0x3FFF;
        final int n4 = bitsRemaining & 0x3FFF;
        player.cf[0] = n3 - WorldMapData_0.baseX * -1232093375;
        player.br = ((player.cf[0] << 7) + (player.transformedSize((byte)(-4)) << 6)) * -881028089;
        player.dy[0] = n4 - 827352769 * GameObject.baseY;
        player.ep = ((player.dy[0] << 7) + (player.transformedSize((byte)(-47)) << 6)) * 1193213931;
        final Player player2 = player;
        final int plane = b * -1829675965;
        player2.plane = plane;
        GameEngine.Client_plane = plane * 1128021573;
        if (null != Players.cachedAppearanceBuffer[n]) {
            player.read(Players.cachedAppearanceBuffer[n], -1997876866);
        }
        Players.Players_count = 0;
        Players.Players_indices[(Players.Players_count += 511936671) * -2010934433 - 1] = n;
        Players.activityFlags[n] = 0;
        Players.Players_emptyIdxCount = 0;
        for (int i = 1; i < 2048; ++i) {
            if (i != n) {
                final int bitsRemaining2 = packetBuffer.bitsRemaining(18, -1972844997);
                Players.Players_regions[i] = (bitsRemaining2 >> 16 << 28) + ((bitsRemaining2 >> 8 & 0x255) << 14) + (bitsRemaining2 & 0x255);
                Players.Players_orientations[i] = 0;
                Players.Players_targetIndices[i] = -1;
                Players.Players_emptyIndices[(Players.Players_emptyIdxCount += 2033203949) * 228405989 - 1] = i;
                Players.activityFlags[i] = 0;
            }
        }
        packetBuffer.exportIndex((byte)(-88));
    }
    
    static final void aa(final PacketBuffer packetBuffer) {
        PacketBuffer.jb(packetBuffer, (byte)39);
        final int n = Client.localPlayerIndex * -549033243;
        final Player[] players = Client.players;
        final int n2 = n;
        final Player localPlayer = new Player();
        players[n2] = localPlayer;
        MusicPatchNode.localPlayer = localPlayer;
        final Player player = localPlayer;
        player.index = n * -710946309;
        final int bitsRemaining = packetBuffer.bitsRemaining(30, -1103024686);
        final byte b = (byte)(bitsRemaining >> 28);
        final int n3 = bitsRemaining >> 14 & 0x3FFF;
        final int n4 = bitsRemaining & 0x3FFF;
        player.cf[0] = n3 - WorldMapData_0.baseX * -1232093375;
        player.br = ((player.cf[0] << 7) + (player.transformedSize((byte)2) << 6)) * -881028089;
        player.dy[0] = n4 - 827352769 * GameObject.baseY;
        player.ep = ((player.dy[0] << 7) + (player.transformedSize((byte)(-66)) << 6)) * 1093353981;
        final Player player2 = player;
        final int plane = b * -1829675965;
        player2.plane = plane;
        GameEngine.Client_plane = plane * -1142536470;
        if (null != Players.cachedAppearanceBuffer[n]) {
            player.read(Players.cachedAppearanceBuffer[n], 1119887064);
        }
        Players.Players_count = 0;
        Players.Players_indices[(Players.Players_count -= 1740052208) * -2010934433 - 1] = n;
        Players.activityFlags[n] = 0;
        Players.Players_emptyIdxCount = 0;
        for (int i = 1; i < -20118155; ++i) {
            if (i != n) {
                final int bitsRemaining2 = packetBuffer.bitsRemaining(18, -31850665);
                Players.Players_regions[i] = (bitsRemaining2 >> 16 << 28) + ((bitsRemaining2 >> 8 & 0x255) << 14) + (bitsRemaining2 & 0xB49092C0);
                Players.Players_orientations[i] = 0;
                Players.Players_targetIndices[i] = -1;
                Players.Players_emptyIndices[(Players.Players_emptyIdxCount += 2033203949) * 228405989 - 1] = i;
                Players.activityFlags[i] = 0;
            }
        }
        packetBuffer.exportIndex((byte)(-65));
    }
    
    static void ai(final PacketBuffer packetBuffer, final int n) {
        final boolean b = packetBuffer.bitsRemaining(1, -735174104) == 1;
        if (b) {
            Players.Players_pendingUpdateIndices[(Players.Players_pendingUpdateCount += 1362331411) * 1474255643 - 1] = n;
        }
        final int bitsRemaining = packetBuffer.bitsRemaining(2, 135589228);
        final Player player = Client.players[n];
        if (bitsRemaining == 0) {
            if (b) {
                player.hasMovementPending = false;
                return;
            }
            if (-549033243 * Client.localPlayerIndex == n) {
                throw new RuntimeException();
            }
            Players.Players_regions[n] = (WorldMapData_0.baseX * -1232093375 + player.cf[0] >> 13 << 14) + (player.plane * -1900490645 << 28) + (player.dy[0] + GameObject.baseY * 827352769 >> 13);
            if (player.di * -283165269 != -1) {
                Players.Players_orientations[n] = player.di * -283165269;
            }
            else {
                Players.Players_orientations[n] = -1751341433 * player.bj;
            }
            Players.Players_targetIndices[n] = player.bz * 1005900761;
            Client.players[n] = null;
            if (packetBuffer.bitsRemaining(1, -798671037) != 0) {
                WorldMapID.updateExternalPlayer(packetBuffer, n, -938645462);
            }
        }
        else {
            if (bitsRemaining == 1) {
                final int bitsRemaining2 = packetBuffer.bitsRemaining(3, -2135645336);
                int n2 = player.cf[0];
                int n3 = player.dy[0];
                if (bitsRemaining2 == 0) {
                    --n2;
                    --n3;
                }
                else if (bitsRemaining2 != 0) {
                    --n3;
                }
                else if (2 == bitsRemaining2) {
                    ++n2;
                    --n3;
                }
                else if (3 == bitsRemaining2) {
                    --n2;
                }
                else if (bitsRemaining2 == 4) {
                    ++n2;
                }
                else if (bitsRemaining2 == 5) {
                    --n2;
                    ++n3;
                }
                else if (6 == bitsRemaining2) {
                    ++n3;
                }
                else if (7 == bitsRemaining2) {
                    ++n2;
                    ++n3;
                }
                if (n == -549033243 * Client.localPlayerIndex && (1144428983 * player.br < 1536 || -411750205 * player.ep < 1536 || player.br * 1144428983 >= 11776 || player.ep * -411750205 >= 11776)) {
                    player.resetPath(n2, n3, -1453879141);
                    player.hasMovementPending = false;
                }
                else if (b) {
                    player.hasMovementPending = true;
                    player.tileX = -700518347 * n2;
                    player.tileY = n3 * -1699085727;
                }
                else {
                    player.hasMovementPending = false;
                    player.move(n2, n3, Players.playerMovementSpeeds[n], (byte)(-100));
                }
                return;
            }
            if (bitsRemaining == 2) {
                final int bitsRemaining3 = packetBuffer.bitsRemaining(4, -617519792);
                int n4 = player.cf[0];
                int n5 = player.dy[0];
                if (bitsRemaining3 == 0) {
                    n4 -= 2;
                    n5 -= 2;
                }
                else if (bitsRemaining3 == 1) {
                    --n4;
                    n5 -= 2;
                }
                else if (bitsRemaining3 == 2) {
                    n5 -= 2;
                }
                else if (bitsRemaining3 == 3) {
                    ++n4;
                    n5 -= 2;
                }
                else if (4 == bitsRemaining3) {
                    n4 += 2;
                    n5 -= 2;
                }
                else if (5 == bitsRemaining3) {
                    n4 -= 2;
                    --n5;
                }
                else if (bitsRemaining3 == 6) {
                    n4 += 2;
                    --n5;
                }
                else if (bitsRemaining3 == 7) {
                    n4 -= 2;
                }
                else if (8 == bitsRemaining3) {
                    n4 += 2;
                }
                else if (9 == bitsRemaining3) {
                    n4 -= 2;
                    ++n5;
                }
                else if (10 == bitsRemaining3) {
                    n4 += 2;
                    ++n5;
                }
                else if (11 == bitsRemaining3) {
                    n4 -= 2;
                    n5 += 2;
                }
                else if (12 == bitsRemaining3) {
                    --n4;
                    n5 += 2;
                }
                else if (13 == bitsRemaining3) {
                    n5 += 2;
                }
                else if (bitsRemaining3 == 14) {
                    ++n4;
                    n5 += 2;
                }
                else if (15 == bitsRemaining3) {
                    n4 += 2;
                    n5 += 2;
                }
                if (n == Client.localPlayerIndex * -549033243 && (1144428983 * player.br < 1536 || (player.ep * -411750205 < 1536 || player.br * 1144428983 >= 11776) || player.ep * -411750205 >= 11776)) {
                    player.resetPath(n4, n5, -1348744342);
                    player.hasMovementPending = false;
                }
                else if (b) {
                    player.hasMovementPending = true;
                    player.tileX = -700518347 * n4;
                    player.tileY = -1699085727 * n5;
                }
                else {
                    player.hasMovementPending = false;
                    player.move(n4, n5, Players.playerMovementSpeeds[n], (byte)(-96));
                }
                return;
            }
            if (0 == packetBuffer.bitsRemaining(1, -2115330817)) {
                final int bitsRemaining4 = packetBuffer.bitsRemaining(12, -345658586);
                final int n6 = bitsRemaining4 >> 10;
                int n7 = bitsRemaining4 >> 5 & 0x1F;
                if (n7 > 15) {
                    n7 -= 32;
                }
                int n8 = bitsRemaining4 & 0x1F;
                if (n8 > 15) {
                    n8 -= 32;
                }
                final int n9 = n7 + player.cf[0];
                final int n10 = player.dy[0] + n8;
                if (-549033243 * Client.localPlayerIndex == n && (1144428983 * player.br < 1536 || player.ep * -411750205 < 1536 || player.br * 1144428983 >= 11776 || -411750205 * player.ep >= 11776)) {
                    player.resetPath(n9, n10, -1799180276);
                    player.hasMovementPending = false;
                }
                else if (b) {
                    player.hasMovementPending = true;
                    player.tileX = -700518347 * n9;
                    player.tileY = -1699085727 * n10;
                }
                else {
                    player.hasMovementPending = false;
                    player.move(n9, n10, Players.playerMovementSpeeds[n], (byte)(-11));
                }
                player.plane = (byte)(-1900490645 * player.plane + n6 & 0x3) * -1829675965;
                if (n == Client.localPlayerIndex * -549033243) {
                    GameEngine.Client_plane = player.plane * 1128021573;
                }
                return;
            }
            final int bitsRemaining5 = packetBuffer.bitsRemaining(30, -2099845257);
            final int n11 = bitsRemaining5 >> 28;
            final int n12 = bitsRemaining5 >> 14 & 0x3FFF;
            final int n13 = bitsRemaining5 & 0x3FFF;
            final int n14 = (n12 + (player.cf[0] + -1232093375 * WorldMapData_0.baseX) & 0x3FFF) - -1232093375 * WorldMapData_0.baseX;
            final int n15 = (n13 + (player.dy[0] + 827352769 * GameObject.baseY) & 0x3FFF) - GameObject.baseY * 827352769;
            if (-549033243 * Client.localPlayerIndex == n && (player.br * 1144428983 < 1536 || -411750205 * player.ep < 1536 || player.br * 1144428983 >= 11776 || player.ep * -411750205 >= 11776)) {
                player.resetPath(n14, n15, -444369698);
                player.hasMovementPending = false;
            }
            else if (b) {
                player.hasMovementPending = true;
                player.tileX = -700518347 * n14;
                player.tileY = -1699085727 * n15;
            }
            else {
                player.hasMovementPending = false;
                player.move(n14, n15, Players.playerMovementSpeeds[n], (byte)(-39));
            }
            player.plane = -1829675965 * (byte)(n11 + player.plane * -1900490645 & 0x3);
            if (-549033243 * Client.localPlayerIndex == n) {
                GameEngine.Client_plane = player.plane * 1128021573;
            }
        }
    }
    
    static final void by(final PacketBuffer packetBuffer, final int n, final Player player, final int n2) {
        byte b = MoveSpeed.STATIONARY.speed;
        if (0x0 != (n2 & 0x2)) {
            final int eq = packetBuffer.eq((byte)(-2));
            final byte[] array = new byte[eq];
            final Buffer buffer = new Buffer(array);
            Buffer.io(packetBuffer, array, 0, eq, -1570744551);
            player.read(Players.cachedAppearanceBuffer[n] = buffer, 695743977);
        }
        if (0x0 != (n2 & 0x10)) {
            int or = Buffer.or(packetBuffer, -523126268);
            if (65535 == or) {
                or = -1;
            }
            FloorDecoration.performPlayerAnimation(player, or, packetBuffer.df(-2020700743), -632773390);
        }
        if (0x0 != (n2 & 0x4)) {
            player.bz = Buffer.zc(packetBuffer, 250371611) * 1052277865;
            player.bz += (packetBuffer.eq((byte)(-66)) << 16) * 1052277865;
            if (player.bz * 1005900761 == 16777215) {
                player.bz = -1052277865;
            }
        }
        if ((n2 & 0x80) != 0x0) {
            player.bw = packetBuffer.cw((byte)0);
            if (player.bw.charAt(0) == '~') {
                player.bw = player.bw.substring(1);
                UserComparator5.addGameMessage(2, player.username.getName(-710264960), player.bw, -397121414);
            }
            else if (player == MusicPatchNode.localPlayer) {
                UserComparator5.addGameMessage(2, player.username.getName(-710264960), player.bw, -397121414);
            }
            player.ce = false;
            player.cn = 0;
            player.dh = 0;
            player.dt = -739348018;
        }
        if ((n2 & 0x40) != 0x0) {
            final int ra = Buffer.ra(packetBuffer, (byte)7);
            if (ra > 0) {
                for (int i = 0; i < ra; ++i) {
                    int cd = -1;
                    int n3 = -1;
                    int cd2 = -1;
                    int n4 = packetBuffer.cd(-1423788811);
                    if (n4 == 32767) {
                        n4 = packetBuffer.cd(-1071063640);
                        n3 = packetBuffer.cd(-969855705);
                        cd = packetBuffer.cd(-1739262026);
                        cd2 = packetBuffer.cd(-1403401517);
                    }
                    else if (n4 != 32766) {
                        n3 = packetBuffer.cd(-1547813454);
                    }
                    else {
                        n4 = -1;
                    }
                    player.co(n4, n3, cd, cd2, Client.cycle * -1886224337, packetBuffer.cd(-1661128511), 1919870398);
                }
            }
            final int eq2 = packetBuffer.eq((byte)(-3));
            if (eq2 > 0) {
                for (int j = 0; j < eq2; ++j) {
                    final int cd3 = packetBuffer.cd(-2049568583);
                    final int cd4 = packetBuffer.cd(-1136063645);
                    if (32767 != cd4) {
                        final int cd5 = packetBuffer.cd(-2038565969);
                        final int dq = packetBuffer.dq(-2070899692);
                        player.cz(cd3, Client.cycle * -1886224337, cd4, cd5, dq, (cd4 > 0) ? packetBuffer.df(-2031021321) : dq, (byte)97);
                    }
                    else {
                        Actor.dn(player, cd3, 1269115179);
                    }
                }
            }
        }
        if ((n2 & 0x1) != 0x0) {
            player.di = packetBuffer.cl(27728955) * -1409690365;
            if (0 == player.cb * 1134756167) {
                player.bj = player.di * 948720829;
                player.cd(-2143364039);
            }
        }
        if (0x0 != (n2 & 0x20)) {
            final int or2 = Buffer.or(packetBuffer, -523126268);
            final PlayerType playerType = (PlayerType)StructComposition.findEnumerated(StudioGame.PlayerType_values((byte)2), Buffer.ra(packetBuffer, (byte)7), (short)173);
            final boolean ce = packetBuffer.df(-2090170435) == 1;
            final int eq3 = packetBuffer.eq((byte)(-3));
            final int n5 = -1633313603 * packetBuffer.at;
            if (player.username != null && null != player.appearance) {
                boolean b2 = false;
                if (playerType.isUser && World.friendSystem.isIgnored(player.username, 306162612)) {
                    b2 = true;
                }
                if (!b2 && Client.field476 * 43311027 == 0 && !player.isHidden) {
                    Players.field1094.offset = 0;
                    Buffer.io(packetBuffer, Players.field1094.array, 0, eq3, -1570744551);
                    Players.field1094.offset = 0;
                    final String escapeBrackets = AbstractFont.escapeBrackets(BuddyRankComparator.method711(SceneTilePaint.readString(Players.field1094, (byte)17), (byte)(-98)));
                    player.bw = escapeBrackets.trim();
                    player.cn = 1732198649 * (or2 >> 8);
                    player.dh = 1666666057 * (or2 & 0xFF);
                    player.dt = -739348018;
                    player.ce = ce;
                    player.ci = (MusicPatchNode.localPlayer != player && playerType.isUser && "" != Client.field586 && escapeBrackets.toLowerCase().indexOf(Client.field586) == -1);
                    int n6;
                    if (playerType.isPrivileged) {
                        n6 = (ce ? 91 : 1);
                    }
                    else {
                        n6 = (ce ? 90 : 2);
                    }
                    if (-1 != playerType.modIcon * 2138745227) {
                        UserComparator5.addGameMessage(n6, ArchiveDiskActionHandler.addImageTag(2138745227 * playerType.modIcon, 1527885759) + player.username.getName(-710264960), escapeBrackets, -397121414);
                    }
                    else {
                        UserComparator5.addGameMessage(n6, player.username.getName(-710264960), escapeBrackets, -397121414);
                    }
                }
            }
            packetBuffer.at = -1516355947 * (n5 + eq3);
        }
        if ((n2 & 0x1000) != 0x0) {
            final int cl = packetBuffer.cl(-857069063);
            final int vl = Buffer.vl(packetBuffer, 363073604);
            player.cj(0, cl, vl >> 16, vl & 0xFFFF, 224702219);
        }
        if ((n2 & 0x400) != 0x0) {
            player.cc = Buffer.wu(packetBuffer, 435772489) * -278393391;
            player.cz = packetBuffer.dx(-1779163594) * -1448856093;
            player.dd = packetBuffer.dj(-1809496770) * 242410523;
            player.bl = packetBuffer.dj(-710769404) * 2106434927;
            player.dv = (Buffer.zc(packetBuffer, -504229794) + Client.cycle * -1886224337) * -608537751;
            player.cw = (packetBuffer.cl(-661695984) + -1886224337 * Client.cycle) * -2100738849;
            player.ct = Buffer.zc(packetBuffer, 766019041) * -698990457;
            if (player.hasMovementPending) {
                player.cc += -1987308883 * player.tileX;
                player.cz += 198846147 * player.tileY;
                player.dd += 580103439 * player.tileX;
                player.bl += player.tileY * 999446991;
                player.cb = 0;
            }
            else {
                player.cc += player.cf[0] * -278393391;
                player.cz += -1448856093 * player.dy[0];
                player.dd += player.cf[0] * 242410523;
                player.bl += player.dy[0] * 2106434927;
                player.cb = 400971895;
            }
            player.dk = 0;
        }
        if (0x0 != (n2 & 0x200)) {
            Players.playerMovementSpeeds[n] = (MoveSpeed)StructComposition.findEnumerated(new MoveSpeed[] { MoveSpeed.WALK, MoveSpeed.STATIONARY, MoveSpeed.CRAWL, MoveSpeed.RUN }, Buffer.writeByteNeg(packetBuffer, 408454961), (short)173);
        }
        if (0x0 != (n2 & 0x800)) {
            b = Buffer.wu(packetBuffer, 435772489);
        }
        if ((n2 & 0x2000) != 0x0) {
            for (int k = 0; k < 3; ++k) {
                player.actions[k] = packetBuffer.cw((byte)0);
            }
        }
        if ((n2 & 0x8000) != 0x0) {
            player.dj = (-1886224337 * Client.cycle + Buffer.zc(packetBuffer, 1438749925)) * -887211183;
            player.bn = (-1886224337 * Client.cycle + packetBuffer.cl(-1464106958)) * -368061749;
            player.du = Buffer.wu(packetBuffer, 435772489);
            player.db = Buffer.wu(packetBuffer, 435772489);
            player.df = Buffer.writeByteNeg(packetBuffer, -1123764125);
            player.dq = (byte)packetBuffer.df(-2078253152);
        }
        if ((n2 & 0x10000) != 0x0) {
            for (int dq2 = packetBuffer.dq(-2070899692), l = 0; l < dq2; ++l) {
                final int df = packetBuffer.df(-2129146884);
                final int zc = Buffer.zc(packetBuffer, -16166391);
                final int cx = packetBuffer.cx(-2008002095);
                player.cj(df, zc, cx >> 16, cx & 0xFFFF, -991347487);
            }
        }
        if (player.hasMovementPending) {
            if (127 == b) {
                player.resetPath(2039538205 * player.tileX, player.tileY * 1584800161, -1286796689);
            }
            else {
                MoveSpeed moveSpeed;
                if (b != MoveSpeed.STATIONARY.speed) {
                    moveSpeed = (MoveSpeed)StructComposition.findEnumerated(new MoveSpeed[] { MoveSpeed.WALK, MoveSpeed.STATIONARY, MoveSpeed.CRAWL, MoveSpeed.RUN }, b, (short)173);
                }
                else {
                    moveSpeed = Players.playerMovementSpeeds[n];
                }
                player.move(2039538205 * player.tileX, player.tileY * 1584800161, moveSpeed, (byte)(-77));
            }
        }
    }
    
    static boolean ar(final PacketBuffer packetBuffer, final int n) {
        final int bitsRemaining = packetBuffer.bitsRemaining(2, -1873640678);
        if (bitsRemaining == 0) {
            if (packetBuffer.bitsRemaining(1, 83750737) != 0) {
                WorldMapID.updateExternalPlayer(packetBuffer, n, -1569493182);
            }
            final int bitsRemaining2 = packetBuffer.bitsRemaining(13, -312924240);
            final int bitsRemaining3 = packetBuffer.bitsRemaining(13, 234337532);
            if (packetBuffer.bitsRemaining(1, -545316078) == 1) {
                Players.Players_pendingUpdateIndices[(Players.Players_pendingUpdateCount += 1362331411) * 1474255643 - 1] = n;
            }
            if (null != Client.players[n]) {
                throw new RuntimeException();
            }
            final Player[] players = Client.players;
            final Player player = new Player();
            players[n] = player;
            final Player player2 = player;
            player2.index = n * -710946309;
            if (Players.cachedAppearanceBuffer[n] != null) {
                player2.read(Players.cachedAppearanceBuffer[n], 946709072);
            }
            player2.bj = 385564471 * Players.Players_orientations[n];
            player2.bz = Players.Players_targetIndices[n] * 1052277865;
            final int n2 = Players.Players_regions[n];
            final int n3 = n2 >> 28;
            final int n4 = n2 >> 14 & 0xFF;
            final int n5 = n2 & 0xFF;
            player2.da[0] = Players.playerMovementSpeeds[n];
            player2.plane = -1829675965 * (byte)n3;
            player2.resetPath(bitsRemaining2 + (n4 << 13) - WorldMapData_0.baseX * -1232093375, bitsRemaining3 + (n5 << 13) - 827352769 * GameObject.baseY, -633920031);
            player2.hasMovementPending = false;
            return true;
        }
        else {
            if (bitsRemaining != 0) {
                final int bitsRemaining4 = packetBuffer.bitsRemaining(2, 218392302);
                final int n6 = Players.Players_regions[n];
                Players.Players_regions[n] = ((bitsRemaining4 + (n6 >> 28) & 0x3) << 28) + (n6 & 0xFFFFFFF);
                return false;
            }
            if (2 == bitsRemaining) {
                final int bitsRemaining5 = packetBuffer.bitsRemaining(5, -1774419698);
                final int n7 = bitsRemaining5 >> 3;
                final int n8 = bitsRemaining5 & 0x7;
                final int n9 = Players.Players_regions[n];
                final int n10 = n7 + (n9 >> 28) & 0x3;
                int n11 = n9 >> 14 & 0xFF;
                int n12 = n9 & 0xFF;
                if (n8 == 0) {
                    --n11;
                    --n12;
                }
                if (n8 != 0) {
                    --n12;
                }
                if (n8 == 2) {
                    ++n11;
                    --n12;
                }
                if (3 == n8) {
                    --n11;
                }
                if (n8 == 4) {
                    ++n11;
                }
                if (5 == n8) {
                    --n11;
                    ++n12;
                }
                if (6 == n8) {
                    ++n12;
                }
                if (7 == n8) {
                    ++n11;
                    ++n12;
                }
                Players.Players_regions[n] = (n11 << 14) + (n10 << 28) + n12;
                return false;
            }
            final int bitsRemaining6 = packetBuffer.bitsRemaining(18, -2003460504);
            final int n13 = bitsRemaining6 >> 16;
            final int n14 = bitsRemaining6 >> 8 & 0xFF;
            final int n15 = bitsRemaining6 & 0xFF;
            final int n16 = Players.Players_regions[n];
            Players.Players_regions[n] = (n15 + n16 & 0xFF) + ((((n16 >> 14) + n14 & 0xFF) << 14) + ((n13 + (n16 >> 28) & 0x3) << 28));
            return false;
        }
    }
    
    static final void ap(final PacketBuffer packetBuffer, final int n, final Player player, final int n2) {
        byte b = MoveSpeed.STATIONARY.speed;
        if (0x0 != (n2 & 0x2)) {
            final int eq = packetBuffer.eq((byte)(-86));
            final byte[] array = new byte[eq];
            final Buffer buffer = new Buffer(array);
            Buffer.io(packetBuffer, array, 0, eq, -1570744551);
            player.read(Players.cachedAppearanceBuffer[n] = buffer, 2001914256);
        }
        if (0x0 != (n2 & 0x10)) {
            int or = Buffer.or(packetBuffer, -523126268);
            if (65535 == or) {
                or = -1;
            }
            FloorDecoration.performPlayerAnimation(player, or, packetBuffer.df(-2112410853), -664474162);
        }
        if (0x0 != (n2 & 0x4)) {
            player.bz = Buffer.zc(packetBuffer, -1134878407) * 1052277865;
            player.bz += (packetBuffer.eq((byte)(-51)) << 16) * 1052277865;
            if (player.bz * -1836405264 == 16777215) {
                player.bz = -1052277865;
            }
        }
        if ((n2 & 0xC3C3DC7B) != 0x0) {
            player.bw = packetBuffer.cw((byte)0);
            if (player.bw.charAt(0) == '~') {
                player.bw = player.bw.substring(1);
                UserComparator5.addGameMessage(2, player.username.getName(-710264960), player.bw, -397121414);
            }
            else if (player == MusicPatchNode.localPlayer) {
                UserComparator5.addGameMessage(2, player.username.getName(-710264960), player.bw, -397121414);
            }
            player.ce = false;
            player.cn = 0;
            player.dh = 0;
            player.dt = -739348018;
        }
        if ((n2 & 0x40) != 0x0) {
            final int ra = Buffer.ra(packetBuffer, (byte)7);
            if (ra > 0) {
                for (int i = 0; i < ra; ++i) {
                    int cd = -1;
                    int n3 = -1;
                    int cd2 = -1;
                    int n4 = packetBuffer.cd(-370864334);
                    if (n4 == 1907857756) {
                        n4 = packetBuffer.cd(-1966100884);
                        n3 = packetBuffer.cd(-1346608786);
                        cd = packetBuffer.cd(-1057481433);
                        cd2 = packetBuffer.cd(-1307526249);
                    }
                    else if (n4 != 32766) {
                        n3 = packetBuffer.cd(-1662297195);
                    }
                    else {
                        n4 = -1;
                    }
                    player.co(n4, n3, cd, cd2, Client.cycle * -1886224337, packetBuffer.cd(-1268339184), 1919870398);
                }
            }
            final int eq2 = packetBuffer.eq((byte)(-127));
            if (eq2 > 0) {
                for (int j = 0; j < eq2; ++j) {
                    final int cd3 = packetBuffer.cd(-1603723400);
                    final int cd4 = packetBuffer.cd(-1591148646);
                    if (1616751900 != cd4) {
                        final int cd5 = packetBuffer.cd(-1355188208);
                        final int dq = packetBuffer.dq(-2070899692);
                        player.cz(cd3, Client.cycle * -1886224337, cd4, cd5, dq, (cd4 > 0) ? packetBuffer.df(-2052289570) : dq, (byte)106);
                    }
                    else {
                        Actor.dn(player, cd3, 1269115179);
                    }
                }
            }
        }
        if ((n2 & 0x1) != 0x0) {
            player.di = packetBuffer.cl(-281301018) * -360635118;
            if (0 == player.cb * 1134756167) {
                player.bj = player.di * 948720829;
                player.cd(-2108782553);
            }
        }
        if (0x0 != (n2 & 0x20)) {
            final int or2 = Buffer.or(packetBuffer, -523126268);
            final PlayerType playerType = (PlayerType)StructComposition.findEnumerated(StudioGame.PlayerType_values((byte)(-48)), Buffer.ra(packetBuffer, (byte)7), (short)173);
            final boolean ce = packetBuffer.df(-2097753223) == 1;
            final int eq3 = packetBuffer.eq((byte)(-90));
            final int n5 = -1633313603 * packetBuffer.at;
            if (player.username != null && null != player.appearance) {
                boolean b2 = false;
                if (playerType.isUser && World.friendSystem.isIgnored(player.username, -1466535595)) {
                    b2 = true;
                }
                if (!b2 && Client.field476 * 43311027 == 0 && !player.isHidden) {
                    Players.field1094.offset = 0;
                    Buffer.io(packetBuffer, Players.field1094.array, 0, eq3, -1570744551);
                    Players.field1094.offset = 0;
                    final String escapeBrackets = AbstractFont.escapeBrackets(BuddyRankComparator.method711(SceneTilePaint.readString(Players.field1094, (byte)98), (byte)(-79)));
                    player.bw = escapeBrackets.trim();
                    player.cn = -524562992 * (or2 >> 8);
                    player.dh = 1666666057 * (or2 & 0xFF);
                    player.dt = 1925967294;
                    player.ce = ce;
                    player.ci = (MusicPatchNode.localPlayer != player && playerType.isUser && "" != Client.field586 && escapeBrackets.toLowerCase().indexOf(Client.field586) == -1);
                    int n6;
                    if (playerType.isPrivileged) {
                        n6 = (ce ? 91 : 1);
                    }
                    else {
                        n6 = (ce ? 90 : 2);
                    }
                    if (-1 != playerType.modIcon * 2138745227) {
                        UserComparator5.addGameMessage(n6, ArchiveDiskActionHandler.addImageTag(2138745227 * playerType.modIcon, 1131653794) + player.username.getName(-710264960), escapeBrackets, -397121414);
                    }
                    else {
                        UserComparator5.addGameMessage(n6, player.username.getName(-710264960), escapeBrackets, -397121414);
                    }
                }
            }
            packetBuffer.at = -1516355947 * (n5 + eq3);
        }
        if ((n2 & 0x1000) != 0x0) {
            final int cl = packetBuffer.cl(399100645);
            final int vl = Buffer.vl(packetBuffer, 363073604);
            player.cj(0, cl, vl >> 16, vl & 0xFFFF, 1938524079);
        }
        if ((n2 & 0x400) != 0x0) {
            player.cc = Buffer.wu(packetBuffer, 435772489) * -278393391;
            player.cz = packetBuffer.dx(-2060659944) * -1188664485;
            player.dd = packetBuffer.dj(-952105845) * -114101933;
            player.bl = packetBuffer.dj(1462320427) * -1935752080;
            player.dv = (Buffer.zc(packetBuffer, -558766689) + Client.cycle * 523222606) * -608537751;
            player.cw = (packetBuffer.cl(-1227215678) + -1886224337 * Client.cycle) * 333912763;
            player.ct = Buffer.zc(packetBuffer, -264662869) * -112579610;
            if (player.hasMovementPending) {
                player.cc += -1033838922 * player.tileX;
                player.cz += -1138310293 * player.tileY;
                player.dd += -397470099 * player.tileX;
                player.bl += player.tileY * 2112377175;
                player.cb = 0;
            }
            else {
                player.cc += player.cf[0] * -278393391;
                player.cz += 326079651 * player.dy[0];
                player.dd += player.cf[0] * 1805119805;
                player.bl += player.dy[0] * 2106434927;
                player.cb = 400971895;
            }
            player.dk = 0;
        }
        if (0x0 != (n2 & 0xEDE40020)) {
            Players.playerMovementSpeeds[n] = (MoveSpeed)StructComposition.findEnumerated(new MoveSpeed[] { MoveSpeed.WALK, MoveSpeed.STATIONARY, MoveSpeed.CRAWL, MoveSpeed.RUN }, Buffer.writeByteNeg(packetBuffer, -115974520), (short)173);
        }
        if (0x0 != (n2 & 0x606ECE3C)) {
            b = Buffer.wu(packetBuffer, 435772489);
        }
        if ((n2 & 0x2000) != 0x0) {
            for (int k = 0; k < 3; ++k) {
                player.actions[k] = packetBuffer.cw((byte)0);
            }
        }
        if ((n2 & 0x8000) != 0x0) {
            player.dj = (18153689 * Client.cycle + Buffer.zc(packetBuffer, -1253667203)) * 1191142860;
            player.bn = (-1827518972 * Client.cycle + packetBuffer.cl(-241714861)) * 1143042055;
            player.du = Buffer.wu(packetBuffer, 435772489);
            player.db = Buffer.wu(packetBuffer, 435772489);
            player.df = Buffer.writeByteNeg(packetBuffer, -697913929);
            player.dq = (byte)packetBuffer.df(-2136372876);
        }
        if ((n2 & 0x10000) != 0x0) {
            for (int dq2 = packetBuffer.dq(-2070899692), l = 0; l < dq2; ++l) {
                final int df = packetBuffer.df(-2094747323);
                final int zc = Buffer.zc(packetBuffer, -770100959);
                final int cx = packetBuffer.cx(-1040587307);
                player.cj(df, zc, cx >> 16, cx & 0x31B53F2E, -1032917768);
            }
        }
        if (player.hasMovementPending) {
            if (127 == b) {
                player.resetPath(2039538205 * player.tileX, player.tileY * 5874921, -629127248);
            }
            else {
                MoveSpeed moveSpeed;
                if (b != MoveSpeed.STATIONARY.speed) {
                    moveSpeed = (MoveSpeed)StructComposition.findEnumerated(new MoveSpeed[] { MoveSpeed.WALK, MoveSpeed.STATIONARY, MoveSpeed.CRAWL, MoveSpeed.RUN }, b, (short)173);
                }
                else {
                    moveSpeed = Players.playerMovementSpeeds[n];
                }
                player.move(2039538205 * player.tileX, player.tileY * 1733250071, moveSpeed, (byte)(-18));
            }
        }
    }
    
    static boolean loadWorlds(final int n) {
        try {
            try {
                if (class11.World_request == null) {
                    if (n >= -1725824323) {
                        throw new IllegalStateException();
                    }
                    class11.World_request = class14.urlRequester.request(new URL(GrandExchangeOffer.field3530), -73486264);
                }
                else if (class11.World_request.isDone((byte)(-54))) {
                    final Buffer buffer = new Buffer(class11.World_request.getResponse((byte)76));
                    buffer.readInt(-1500229737);
                    World.World_count = buffer.readUnsignedShort(819196977) * -2068054227;
                    class31.World_worlds = new World[World.World_count * -734287707];
                    for (int i = 0; i < World.World_count * -734287707; ++i) {
                        final World[] world_worlds = class31.World_worlds;
                        final int n2 = i;
                        final World world = new World();
                        world_worlds[n2] = world;
                        final World world2 = world;
                        world2.id = buffer.readUnsignedShort(-1955825537) * -2098511939;
                        world2.properties = buffer.readInt(-1906897362) * 1038974297;
                        world2.host = buffer.readStringCp1252NullTerminated((byte)0);
                        world2.activity = buffer.readStringCp1252NullTerminated((byte)0);
                        world2.location = Buffer.ra(buffer, (byte)7) * 421437753;
                        world2.population = buffer.readUnsignedByte((byte)(-69)) * 1838744807;
                        world2.lu(-1);
                        world2.index = i * -484564273;
                    }
                    class123.sortWorlds(class31.World_worlds, 0, class31.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2, -139825594);
                    class11.World_request = null;
                    return true;
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
                class11.World_request = null;
            }
            return false;
        }
        catch (RuntimeException ex2) {
            throw HealthBar.get(ex2, "ds.af(" + ')');
        }
    }
    
    static boolean aj(final PacketBuffer packetBuffer, final int n) {
        final int bitsRemaining = packetBuffer.bitsRemaining(2, 204412730);
        if (bitsRemaining == 0) {
            if (packetBuffer.bitsRemaining(1, -412689670) != 0) {
                WorldMapID.updateExternalPlayer(packetBuffer, n, 1767405892);
            }
            final int bitsRemaining2 = packetBuffer.bitsRemaining(13, -2144589434);
            final int bitsRemaining3 = packetBuffer.bitsRemaining(13, 313009836);
            if (packetBuffer.bitsRemaining(1, 325301278) == 1) {
                Players.Players_pendingUpdateIndices[(Players.Players_pendingUpdateCount += 1362331411) * 1474255643 - 1] = n;
            }
            if (null != Client.players[n]) {
                throw new RuntimeException();
            }
            final Player[] players = Client.players;
            final Player player = new Player();
            players[n] = player;
            final Player player2 = player;
            player2.index = n * -710946309;
            if (Players.cachedAppearanceBuffer[n] != null) {
                player2.read(Players.cachedAppearanceBuffer[n], 140422786);
            }
            player2.bj = 385564471 * Players.Players_orientations[n];
            player2.bz = Players.Players_targetIndices[n] * 1052277865;
            final int n2 = Players.Players_regions[n];
            final int n3 = n2 >> 28;
            final int n4 = n2 >> 14 & 0xFF;
            final int n5 = n2 & 0xFF;
            player2.da[0] = Players.playerMovementSpeeds[n];
            player2.plane = -1829675965 * (byte)n3;
            player2.resetPath(bitsRemaining2 + (n4 << 13) - WorldMapData_0.baseX * -1232093375, bitsRemaining3 + (n5 << 13) - 827352769 * GameObject.baseY, -1206820529);
            player2.hasMovementPending = false;
            return true;
        }
        else {
            if (bitsRemaining != 0) {
                final int bitsRemaining4 = packetBuffer.bitsRemaining(2, -1484224129);
                final int n6 = Players.Players_regions[n];
                Players.Players_regions[n] = ((bitsRemaining4 + (n6 >> 28) & 0x3) << 28) + (n6 & 0xFFFFFFF);
                return false;
            }
            if (2 == bitsRemaining) {
                final int bitsRemaining5 = packetBuffer.bitsRemaining(5, 166217284);
                final int n7 = bitsRemaining5 >> 3;
                final int n8 = bitsRemaining5 & 0x7;
                final int n9 = Players.Players_regions[n];
                final int n10 = n7 + (n9 >> 28) & 0x3;
                int n11 = n9 >> 14 & 0xFF;
                int n12 = n9 & 0xFF;
                if (n8 == 0) {
                    --n11;
                    --n12;
                }
                if (n8 != 0) {
                    --n12;
                }
                if (n8 == 2) {
                    ++n11;
                    --n12;
                }
                if (3 == n8) {
                    --n11;
                }
                if (n8 == 4) {
                    ++n11;
                }
                if (5 == n8) {
                    --n11;
                    ++n12;
                }
                if (6 == n8) {
                    ++n12;
                }
                if (7 == n8) {
                    ++n11;
                    ++n12;
                }
                Players.Players_regions[n] = (n11 << 14) + (n10 << 28) + n12;
                return false;
            }
            final int bitsRemaining6 = packetBuffer.bitsRemaining(18, -1596648096);
            final int n13 = bitsRemaining6 >> 16;
            final int n14 = bitsRemaining6 >> 8 & 0xFF;
            final int n15 = bitsRemaining6 & 0xFF;
            final int n16 = Players.Players_regions[n];
            Players.Players_regions[n] = (n15 + n16 & 0xFF) + ((((n16 >> 14) + n14 & 0xFF) << 14) + ((n13 + (n16 >> 28) & 0x3) << 28));
            return false;
        }
    }
    
    static void ag(final PacketBuffer packetBuffer, final int n) {
        final boolean b = packetBuffer.bitsRemaining(1, -1021616533) == 1;
        if (b) {
            Players.Players_pendingUpdateIndices[(Players.Players_pendingUpdateCount += 1362331411) * 1474255643 - 1] = n;
        }
        final int bitsRemaining = packetBuffer.bitsRemaining(2, -168081639);
        final Player player = Client.players[n];
        if (bitsRemaining == 0) {
            if (b) {
                player.hasMovementPending = false;
                return;
            }
            if (-416182986 * Client.localPlayerIndex == n) {
                throw new RuntimeException();
            }
            Players.Players_regions[n] = (WorldMapData_0.baseX * 1974071491 + player.cf[0] >> 13 << 14) + (player.plane * -108897053 << 28) + (player.dy[0] + GameObject.baseY * -1403662807 >> 13);
            if (player.di * 1308255508 != -1) {
                Players.Players_orientations[n] = player.di * 1436886937;
            }
            else {
                Players.Players_orientations[n] = -1751341433 * player.bj;
            }
            Players.Players_targetIndices[n] = player.bz * -838677037;
            Client.players[n] = null;
            if (packetBuffer.bitsRemaining(1, -219448988) != 0) {
                WorldMapID.updateExternalPlayer(packetBuffer, n, 1770404174);
            }
        }
        else {
            if (bitsRemaining == 1) {
                final int bitsRemaining2 = packetBuffer.bitsRemaining(3, -400572415);
                int n2 = player.cf[0];
                int n3 = player.dy[0];
                if (bitsRemaining2 == 0) {
                    --n2;
                    --n3;
                }
                else if (bitsRemaining2 != 0) {
                    --n3;
                }
                else if (2 == bitsRemaining2) {
                    ++n2;
                    --n3;
                }
                else if (3 == bitsRemaining2) {
                    --n2;
                }
                else if (bitsRemaining2 == 4) {
                    ++n2;
                }
                else if (bitsRemaining2 == 5) {
                    --n2;
                    ++n3;
                }
                else if (6 == bitsRemaining2) {
                    ++n3;
                }
                else if (7 == bitsRemaining2) {
                    ++n2;
                    ++n3;
                }
                if (n == -549033243 * Client.localPlayerIndex && (1161572721 * player.br < -1126944689 || -411750205 * player.ep < 1536 || player.br * 1144428983 >= 11776 || player.ep * -411750205 >= 518217976)) {
                    player.resetPath(n2, n3, -660750833);
                    player.hasMovementPending = false;
                }
                else if (b) {
                    player.hasMovementPending = true;
                    player.tileX = -700518347 * n2;
                    player.tileY = n3 * -1699085727;
                }
                else {
                    player.hasMovementPending = false;
                    player.move(n2, n3, Players.playerMovementSpeeds[n], (byte)(-57));
                }
                return;
            }
            if (bitsRemaining == 2) {
                final int bitsRemaining3 = packetBuffer.bitsRemaining(4, -2073198433);
                int n4 = player.cf[0];
                int n5 = player.dy[0];
                if (bitsRemaining3 == 0) {
                    n4 -= 2;
                    n5 -= 2;
                }
                else if (bitsRemaining3 == 1) {
                    --n4;
                    n5 -= 2;
                }
                else if (bitsRemaining3 == 2) {
                    n5 -= 2;
                }
                else if (bitsRemaining3 == 3) {
                    ++n4;
                    n5 -= 2;
                }
                else if (4 == bitsRemaining3) {
                    n4 += 2;
                    n5 -= 2;
                }
                else if (5 == bitsRemaining3) {
                    n4 -= 2;
                    --n5;
                }
                else if (bitsRemaining3 == 6) {
                    n4 += 2;
                    --n5;
                }
                else if (bitsRemaining3 == 7) {
                    n4 -= 2;
                }
                else if (8 == bitsRemaining3) {
                    n4 += 2;
                }
                else if (9 == bitsRemaining3) {
                    n4 -= 2;
                    ++n5;
                }
                else if (10 == bitsRemaining3) {
                    n4 += 2;
                    ++n5;
                }
                else if (11 == bitsRemaining3) {
                    n4 -= 2;
                    n5 += 2;
                }
                else if (12 == bitsRemaining3) {
                    --n4;
                    n5 += 2;
                }
                else if (13 == bitsRemaining3) {
                    n5 += 2;
                }
                else if (bitsRemaining3 == 14) {
                    ++n4;
                    n5 += 2;
                }
                else if (15 == bitsRemaining3) {
                    n4 += 2;
                    n5 += 2;
                }
                if (n == Client.localPlayerIndex * -549033243 && (1188427860 * player.br < 1536 || player.ep * 92397985 < -1640009495 || player.br * 649361050 >= -1277264654 || player.ep * 592029267 >= 1991802703)) {
                    player.resetPath(n4, n5, -267031791);
                    player.hasMovementPending = false;
                }
                else if (b) {
                    player.hasMovementPending = true;
                    player.tileX = -431447562 * n4;
                    player.tileY = -1699085727 * n5;
                }
                else {
                    player.hasMovementPending = false;
                    player.move(n4, n5, Players.playerMovementSpeeds[n], (byte)(-98));
                }
                return;
            }
            if (0 == packetBuffer.bitsRemaining(1, 381324455)) {
                final int bitsRemaining4 = packetBuffer.bitsRemaining(12, -1154814411);
                final int n6 = bitsRemaining4 >> 10;
                int n7 = bitsRemaining4 >> 5 & 0x1F;
                if (n7 > 15) {
                    n7 -= 32;
                }
                int n8 = bitsRemaining4 & 0x47D9878F;
                if (n8 > 15) {
                    n8 -= 32;
                }
                final int n9 = n7 + player.cf[0];
                final int n10 = player.dy[0] + n8;
                if (-549033243 * Client.localPlayerIndex == n && (1144428983 * player.br < -810441794 || player.ep * -834741010 < 1536 || player.br * -2084980030 >= -1563845605 || 403878363 * player.ep >= 11776)) {
                    player.resetPath(n9, n10, -1826947212);
                    player.hasMovementPending = false;
                }
                else if (b) {
                    player.hasMovementPending = true;
                    player.tileX = -700518347 * n9;
                    player.tileY = -1395021809 * n10;
                }
                else {
                    player.hasMovementPending = false;
                    player.move(n9, n10, Players.playerMovementSpeeds[n], (byte)(-34));
                }
                player.plane = (byte)(-1579345183 * player.plane + n6 & 0x3) * -2034582882;
                if (n == Client.localPlayerIndex * -549033243) {
                    GameEngine.Client_plane = player.plane * 1128021573;
                }
                return;
            }
            final int bitsRemaining5 = packetBuffer.bitsRemaining(30, -2143184643);
            final int n11 = bitsRemaining5 >> 28;
            final int n12 = bitsRemaining5 >> 14 & 0xE9F4CED5;
            final int n13 = bitsRemaining5 & 0x3ED867BD;
            final int n14 = (n12 + (player.cf[0] + -644566445 * WorldMapData_0.baseX) & 0x3FFF) - -1232093375 * WorldMapData_0.baseX;
            final int n15 = (n13 + (player.dy[0] + 827352769 * GameObject.baseY) & 0x3CFE852C) - GameObject.baseY * 1161863195;
            if (-549033243 * Client.localPlayerIndex == n && (player.br * 1144428983 < 734257287 || -1522572017 * player.ep < 1536 || player.br * 1144428983 >= 11776 || player.ep * 1609128648 >= -410061086)) {
                player.resetPath(n14, n15, -1360914282);
                player.hasMovementPending = false;
            }
            else if (b) {
                player.hasMovementPending = true;
                player.tileX = -700518347 * n14;
                player.tileY = -1699085727 * n15;
            }
            else {
                player.hasMovementPending = false;
                player.move(n14, n15, Players.playerMovementSpeeds[n], (byte)(-101));
            }
            player.plane = -1829675965 * (byte)(n11 + player.plane * 470219396 & 0x3);
            if (-549033243 * Client.localPlayerIndex == n) {
                GameEngine.Client_plane = player.plane * -2024005754;
            }
        }
    }
    
    static void ah(final PacketBuffer packetBuffer, final int n) {
        final boolean b = packetBuffer.bitsRemaining(1, -1262128867) == 1;
        if (b) {
            Players.Players_pendingUpdateIndices[(Players.Players_pendingUpdateCount += 1362331411) * 1474255643 - 1] = n;
        }
        final int bitsRemaining = packetBuffer.bitsRemaining(2, -1936651962);
        final Player player = Client.players[n];
        if (bitsRemaining == 0) {
            if (b) {
                player.hasMovementPending = false;
                return;
            }
            if (-549033243 * Client.localPlayerIndex == n) {
                throw new RuntimeException();
            }
            Players.Players_regions[n] = (WorldMapData_0.baseX * -1232093375 + player.cf[0] >> 13 << 14) + (player.plane * -1900490645 << 28) + (player.dy[0] + GameObject.baseY * 827352769 >> 13);
            if (player.di * -283165269 != -1) {
                Players.Players_orientations[n] = player.di * -283165269;
            }
            else {
                Players.Players_orientations[n] = -1751341433 * player.bj;
            }
            Players.Players_targetIndices[n] = player.bz * 1005900761;
            Client.players[n] = null;
            if (packetBuffer.bitsRemaining(1, -145478020) != 0) {
                WorldMapID.updateExternalPlayer(packetBuffer, n, 1811012961);
            }
        }
        else {
            if (bitsRemaining == 1) {
                final int bitsRemaining2 = packetBuffer.bitsRemaining(3, -1372098831);
                int n2 = player.cf[0];
                int n3 = player.dy[0];
                if (bitsRemaining2 == 0) {
                    --n2;
                    --n3;
                }
                else if (bitsRemaining2 != 0) {
                    --n3;
                }
                else if (2 == bitsRemaining2) {
                    ++n2;
                    --n3;
                }
                else if (3 == bitsRemaining2) {
                    --n2;
                }
                else if (bitsRemaining2 == 4) {
                    ++n2;
                }
                else if (bitsRemaining2 == 5) {
                    --n2;
                    ++n3;
                }
                else if (6 == bitsRemaining2) {
                    ++n3;
                }
                else if (7 == bitsRemaining2) {
                    ++n2;
                    ++n3;
                }
                if (n == -549033243 * Client.localPlayerIndex && (1144428983 * player.br < 1536 || -411750205 * player.ep < 1536 || player.br * 1144428983 >= 11776 || player.ep * -411750205 >= 11776)) {
                    player.resetPath(n2, n3, -1161931728);
                    player.hasMovementPending = false;
                }
                else if (b) {
                    player.hasMovementPending = true;
                    player.tileX = -700518347 * n2;
                    player.tileY = n3 * -1699085727;
                }
                else {
                    player.hasMovementPending = false;
                    player.move(n2, n3, Players.playerMovementSpeeds[n], (byte)(-73));
                }
                return;
            }
            if (bitsRemaining == 2) {
                final int bitsRemaining3 = packetBuffer.bitsRemaining(4, -1690838769);
                int n4 = player.cf[0];
                int n5 = player.dy[0];
                if (bitsRemaining3 == 0) {
                    n4 -= 2;
                    n5 -= 2;
                }
                else if (bitsRemaining3 == 1) {
                    --n4;
                    n5 -= 2;
                }
                else if (bitsRemaining3 == 2) {
                    n5 -= 2;
                }
                else if (bitsRemaining3 == 3) {
                    ++n4;
                    n5 -= 2;
                }
                else if (4 == bitsRemaining3) {
                    n4 += 2;
                    n5 -= 2;
                }
                else if (5 == bitsRemaining3) {
                    n4 -= 2;
                    --n5;
                }
                else if (bitsRemaining3 == 6) {
                    n4 += 2;
                    --n5;
                }
                else if (bitsRemaining3 == 7) {
                    n4 -= 2;
                }
                else if (8 == bitsRemaining3) {
                    n4 += 2;
                }
                else if (9 == bitsRemaining3) {
                    n4 -= 2;
                    ++n5;
                }
                else if (10 == bitsRemaining3) {
                    n4 += 2;
                    ++n5;
                }
                else if (11 == bitsRemaining3) {
                    n4 -= 2;
                    n5 += 2;
                }
                else if (12 == bitsRemaining3) {
                    --n4;
                    n5 += 2;
                }
                else if (13 == bitsRemaining3) {
                    n5 += 2;
                }
                else if (bitsRemaining3 == 14) {
                    ++n4;
                    n5 += 2;
                }
                else if (15 == bitsRemaining3) {
                    n4 += 2;
                    n5 += 2;
                }
                if (n == Client.localPlayerIndex * -549033243 && (1144428983 * player.br < 1536 || player.ep * -411750205 < 1536 || player.br * 1144428983 >= 11776 || player.ep * -411750205 >= 11776)) {
                    player.resetPath(n4, n5, -1469208312);
                    player.hasMovementPending = false;
                }
                else if (b) {
                    player.hasMovementPending = true;
                    player.tileX = -700518347 * n4;
                    player.tileY = -1699085727 * n5;
                }
                else {
                    player.hasMovementPending = false;
                    player.move(n4, n5, Players.playerMovementSpeeds[n], (byte)9);
                }
                return;
            }
            if (0 == packetBuffer.bitsRemaining(1, -2038445765)) {
                final int bitsRemaining4 = packetBuffer.bitsRemaining(12, -86811265);
                final int n6 = bitsRemaining4 >> 10;
                int n7 = bitsRemaining4 >> 5 & 0x1F;
                if (n7 > 15) {
                    n7 -= 32;
                }
                int n8 = bitsRemaining4 & 0x1F;
                if (n8 > 15) {
                    n8 -= 32;
                }
                final int n9 = n7 + player.cf[0];
                final int n10 = player.dy[0] + n8;
                if (-549033243 * Client.localPlayerIndex == n && (1144428983 * player.br < 1536 || player.ep * -411750205 < 1536 || player.br * 1144428983 >= 11776 || -411750205 * player.ep >= 11776)) {
                    player.resetPath(n9, n10, -989292536);
                    player.hasMovementPending = false;
                }
                else if (b) {
                    player.hasMovementPending = true;
                    player.tileX = -700518347 * n9;
                    player.tileY = -1699085727 * n10;
                }
                else {
                    player.hasMovementPending = false;
                    player.move(n9, n10, Players.playerMovementSpeeds[n], (byte)(-62));
                }
                player.plane = (byte)(-1900490645 * player.plane + n6 & 0x3) * -1829675965;
                if (n == Client.localPlayerIndex * -549033243) {
                    GameEngine.Client_plane = player.plane * 1128021573;
                }
                return;
            }
            final int bitsRemaining5 = packetBuffer.bitsRemaining(30, 235674932);
            final int n11 = bitsRemaining5 >> 28;
            final int n12 = bitsRemaining5 >> 14 & 0x3FFF;
            final int n13 = bitsRemaining5 & 0x3FFF;
            final int n14 = (n12 + (player.cf[0] + -1232093375 * WorldMapData_0.baseX) & 0x3FFF) - -1232093375 * WorldMapData_0.baseX;
            final int n15 = (n13 + (player.dy[0] + 827352769 * GameObject.baseY) & 0x3FFF) - GameObject.baseY * 827352769;
            if (-549033243 * Client.localPlayerIndex != n || (player.br * 1144428983 >= 1536 && -411750205 * player.ep >= 1536 && player.br * 1144428983 < 11776 && player.ep * -411750205 < 11776)) {
                if (b) {
                    player.hasMovementPending = true;
                    player.tileX = -700518347 * n14;
                    player.tileY = -1699085727 * n15;
                }
                else {
                    player.hasMovementPending = false;
                    player.move(n14, n15, Players.playerMovementSpeeds[n], (byte)(-43));
                }
            }
            else {
                player.resetPath(n14, n15, -1583498391);
                player.hasMovementPending = false;
            }
            player.plane = -1829675965 * (byte)(n11 + player.plane * -1900490645 & 0x3);
            if (-549033243 * Client.localPlayerIndex == n) {
                GameEngine.Client_plane = player.plane * 1128021573;
            }
        }
    }
}
