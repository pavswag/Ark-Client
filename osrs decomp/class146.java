import net.runelite.api.Actor;
import net.runelite.api.events.AnimationChanged;

// 
// Decompiled by Procyon v0.5.36
// 

public class class146 extends class139
{
    byte field1338;
    byte field1339;
    byte field1340;
    final /* synthetic */ class142 this$0;
    byte field1341;
    boolean field1342;
    static AbstractArchive Widget_fontsArchive;
    public static final int av = 0;
    
    class146(final class142 this$0) {
        this.this$0 = this$0;
    }
    
    public static final void method829(final int n) {
        try {
            ViewportMouse.ViewportMouse_isInViewport = false;
            ViewportMouse.ViewportMouse_entityCount = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fv.ay(" + ')');
        }
    }
    
    void method833(final ClanSettings clanSettings) {
        clanSettings.allowGuests = this.field1342;
        clanSettings.field1369 = this.field1339;
        clanSettings.field1359 = this.field1340;
        clanSettings.field1360 = this.field1341;
        clanSettings.field1351 = this.field1338;
    }
    
    public static int method833(final int n, final int n2) {
        try {
            return (n & 265217111 * class484.field4044) - 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fv.aw(" + ')');
        }
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            clanSettings.allowGuests = this.field1342;
            clanSettings.field1369 = this.field1339;
            clanSettings.field1359 = this.field1340;
            clanSettings.field1360 = this.field1341;
            clanSettings.field1351 = this.field1338;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fv.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        this.field1342 = (Buffer.ra(buffer, (byte)7) == 1);
        this.field1339 = Buffer.wu(buffer, 435772489);
        this.field1340 = Buffer.wu(buffer, 435772489);
        this.field1341 = Buffer.wu(buffer, 435772489);
        this.field1338 = Buffer.wu(buffer, 435772489);
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1342 = (Buffer.ra(buffer, (byte)7) == 1);
        this.field1339 = Buffer.wu(buffer, 435772489);
        this.field1340 = Buffer.wu(buffer, 435772489);
        this.field1341 = Buffer.wu(buffer, 435772489);
        this.field1338 = Buffer.wu(buffer, 435772489);
    }
    
    static final void updateNpcs(final boolean b, final PacketBuffer packetBuffer, final int n) {
        Client.ql(b, packetBuffer);
        try {
            Client.field484 = 0;
            Client.field416 = 0;
            class30.method131(packetBuffer, 900654741);
            ItemLayer.method1181(b, packetBuffer, -875746645);
            for (int i = 0; i < Client.field416 * 606834121; ++i) {
                if (n != -1232221421) {
                    throw new IllegalStateException();
                }
                final NPC npc = Client.npcs[Client.field417[i]];
                int ra = Buffer.ra(packetBuffer, (byte)7);
                if (0x0 != (ra & 0x80)) {
                    if (n != -1232221421) {
                        throw new IllegalStateException();
                    }
                    ra += Buffer.ra(packetBuffer, (byte)7) << 8;
                }
                if (0x0 != (ra & 0x100)) {
                    if (n != -1232221421) {
                        Client.doCycleJs5(b, packetBuffer);
                        return;
                    }
                    ra += Buffer.ra(packetBuffer, (byte)7) << 16;
                }
                Label_0647: {
                    if (0x0 != (ra & 0x40)) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        int cl = packetBuffer.cl(412358679);
                        if (cl == 65535) {
                            cl = -1;
                        }
                        final int eq = packetBuffer.eq((byte)(-93));
                        if (-1372355773 * npc.cs == cl) {
                            if (n != -1232221421) {
                                throw new IllegalStateException();
                            }
                            if (-1 != cl) {
                                final int n2 = ItemContainer.SpotAnimationDefinition_get(cl, (byte)5).replyMode * 789159225;
                                if (n2 == 1) {
                                    if (n != -1232221421) {
                                        throw new IllegalStateException();
                                    }
                                    npc.dw = 0;
                                    npc.dn = 0;
                                    npc.bd = -401806131 * eq;
                                    npc.bo = 0;
                                }
                                if (2 == n2) {
                                    if (n != -1232221421) {
                                        throw new IllegalStateException();
                                    }
                                    npc.bo = 0;
                                }
                                break Label_0647;
                            }
                        }
                        if (cl != -1) {
                            if (n != -1232221421) {
                                throw new IllegalStateException();
                            }
                            if (-1372355773 * npc.cs != -1) {
                                if (n != -1232221421) {
                                    throw new IllegalStateException();
                                }
                                if (ItemContainer.SpotAnimationDefinition_get(cl, (byte)116).forcedPriority * -1932560049 < ItemContainer.SpotAnimationDefinition_get(-1372355773 * npc.cs, (byte)2).forcedPriority * -1932560049) {
                                    break Label_0647;
                                }
                            }
                        }
                        npc.cs = -1690721941 * cl;
                        final NPC actor = npc;
                        Label_0595: {
                            if (actor instanceof NPC) {
                                switch (actor.getId()) {
                                    case 8615:
                                    case 8616:
                                    case 8617:
                                    case 8618:
                                    case 8619:
                                    case 8620:
                                    case 8621:
                                    case 8622: {
                                        break Label_0595;
                                    }
                                }
                            }
                            final AnimationChanged animationChanged = new AnimationChanged();
                            animationChanged.setActor((Actor)actor);
                            ScriptFrame.client.getCallbacks().post((Object)animationChanged);
                        }
                        npc.dw = 0;
                        npc.dn = 0;
                        npc.bd = -401806131 * eq;
                        npc.bo = 0;
                        npc.dk = -1718989897 * npc.cb;
                    }
                }
                if ((ra & 0x20) != 0x0) {
                    if (n != -1232221421) {
                        Client.doCycleJs5(b, packetBuffer);
                        return;
                    }
                    npc.bz = packetBuffer.cl(-328477384) * 1052277865;
                    npc.zr(-1);
                    final NPC npc2 = npc;
                    npc2.bz += (packetBuffer.eq((byte)(-127)) << 16) * 1052277865;
                    npc.zr(-1);
                    if (16777215 == 1005900761 * npc.bz) {
                        npc.bz = -1052277865;
                        npc.zr(-1);
                    }
                }
                if (0x0 != (ra & 0x2)) {
                    if (n != -1232221421) {
                        throw new IllegalStateException();
                    }
                    npc.bw = packetBuffer.cw((byte)0);
                    npc.te(-1);
                    npc.dt = -1924554444;
                }
                if (0x0 != (ra & 0x4)) {
                    if (n != -1232221421) {
                        throw new IllegalStateException();
                    }
                    final int ra2 = Buffer.ra(packetBuffer, (byte)7);
                    if (ra2 > 0) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        for (int j = 0; j < ra2; ++j) {
                            if (n != -1232221421) {
                                throw new IllegalStateException();
                            }
                            int cd = -1;
                            int n3 = -1;
                            int cd2 = -1;
                            int n4 = packetBuffer.cd(-53042423);
                            if (n4 == 32767) {
                                if (n != -1232221421) {
                                    throw new IllegalStateException();
                                }
                                n4 = packetBuffer.cd(-1013005421);
                                n3 = packetBuffer.cd(-738243490);
                                cd = packetBuffer.cd(-1594717523);
                                cd2 = packetBuffer.cd(-1604471571);
                            }
                            else if (32766 != n4) {
                                n3 = packetBuffer.cd(-651141391);
                            }
                            else {
                                n4 = -1;
                            }
                            npc.co(n4, n3, cd, cd2, -1886224337 * Client.cycle, packetBuffer.cd(-1995934976), 1919870398);
                        }
                    }
                    final int df = packetBuffer.df(-2110389308);
                    if (df > 0) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        for (int k = 0; k < df; ++k) {
                            final int cd3 = packetBuffer.cd(-1118841547);
                            final int cd4 = packetBuffer.cd(-1847028101);
                            if (cd4 != 32767) {
                                if (n != -1232221421) {
                                    Client.doCycleJs5(b, packetBuffer);
                                    return;
                                }
                                final int cd5 = packetBuffer.cd(-664950594);
                                final int ra3 = Buffer.ra(packetBuffer, (byte)7);
                                int df2;
                                if (cd4 > 0) {
                                    if (n != -1232221421) {
                                        throw new IllegalStateException();
                                    }
                                    df2 = packetBuffer.df(-2030175664);
                                }
                                else {
                                    df2 = ra3;
                                }
                                npc.cz(cd3, -1886224337 * Client.cycle, cd4, cd5, ra3, df2, (byte)121);
                            }
                            else {
                                Actor.dn(npc, cd3, 1269115179);
                            }
                        }
                    }
                }
                if (0x0 != (ra & 0x8)) {
                    if (n != -1232221421) {
                        Client.doCycleJs5(b, packetBuffer);
                        return;
                    }
                    final NPC npc3 = npc;
                    final NPCComposition npcDefinition = AbstractArchive.getNpcDefinition(Buffer.zc(packetBuffer, -1426367109), (byte)(-113));
                    npc.pv(npcDefinition);
                    npc3.definition = npcDefinition;
                    class142.method811(npc, (byte)76);
                    npc.method606((byte)47);
                }
                if ((ra & 0x1) != 0x0) {
                    if (n != -1232221421) {
                        throw new IllegalStateException();
                    }
                    final int cl2 = packetBuffer.cl(-1831796070);
                    final int en = packetBuffer.en(383378593);
                    npc.cj(0, cl2, en >> 16, en & 0xFFFF, -817052815);
                }
                Label_1665: {
                    if (0x0 != (ra & 0x10)) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        final int or = Buffer.or(packetBuffer, -523126268);
                        final int or2 = Buffer.or(packetBuffer, -523126268);
                        final NPC npc4 = npc;
                        boolean co;
                        if (packetBuffer.eq((byte)(-73)) == 1) {
                            if (n != -1232221421) {
                                Client.doCycleJs5(b, packetBuffer);
                                return;
                            }
                            co = true;
                        }
                        else {
                            co = false;
                        }
                        npc4.co = co;
                        if (-1931866699 * Client.param25 >= 212) {
                            npc.bq = -1213206377 * or;
                            npc.cj = or2 * 1388623137;
                        }
                        else {
                            final int n5 = 1144428983 * npc.br - (or - -1232093375 * WorldMapData_0.baseX - WorldMapData_0.baseX * -1232093375) * 64;
                            final int n6 = -411750205 * npc.ep - (or2 - GameObject.baseY * 827352769 - 827352769 * GameObject.baseY) * 64;
                            if (n5 == 0) {
                                if (n != -1232221421) {
                                    Client.doCycleJs5(b, packetBuffer);
                                    return;
                                }
                                if (n6 == 0) {
                                    break Label_1665;
                                }
                                if (n != -1232221421) {
                                    Client.doCycleJs5(b, packetBuffer);
                                    return;
                                }
                            }
                            npc.di = -1409690365 * ((int)(Math.atan2(n5, n6) * 325.94932345220167) & 0x7FF);
                        }
                    }
                }
                if (0x0 != (ra & 0x4000)) {
                    if (n != -1232221421) {
                        throw new IllegalStateException();
                    }
                    npc.cc = Buffer.wu(packetBuffer, 435772489) * -278393391;
                    npc.cz = packetBuffer.dj(916064469) * -1448856093;
                    npc.dd = packetBuffer.dj(227566312) * 242410523;
                    npc.bl = packetBuffer.dj(599607163) * 2106434927;
                    npc.dv = (Buffer.or(packetBuffer, -523126268) + -1886224337 * Client.cycle) * -608537751;
                    npc.cw = (packetBuffer.da(560305948) + -1886224337 * Client.cycle) * -2100738849;
                    npc.ct = Buffer.zc(packetBuffer, -1438285532) * -698990457;
                    npc.cb = 400971895;
                    npc.dk = 0;
                    final NPC npc5 = npc;
                    npc5.cc += npc.cf[0] * -278393391;
                    final NPC npc6 = npc;
                    npc6.cz += -1448856093 * npc.dy[0];
                    final NPC npc7 = npc;
                    npc7.dd += npc.cf[0] * 242410523;
                    final NPC npc8 = npc;
                    npc8.bl += 2106434927 * npc.dy[0];
                }
                if ((ra & 0x8000) != 0x0) {
                    if (n != -1232221421) {
                        throw new IllegalStateException();
                    }
                    npc.dm = packetBuffer.cx(-1826144972) * 1392091407;
                }
                if ((ra & 0x800) != 0x0) {
                    if (n != -1232221421) {
                        throw new IllegalStateException();
                    }
                    npc.dj = (Client.cycle * -1886224337 + packetBuffer.da(2028770606)) * -887211183;
                    npc.bn = (Client.cycle * -1886224337 + packetBuffer.cl(-1031172461)) * -368061749;
                    npc.du = Buffer.writeByteNeg(packetBuffer, 797294812);
                    npc.db = packetBuffer.dj(-984504244);
                    npc.df = packetBuffer.dx(-2086413203);
                    npc.dq = (byte)packetBuffer.dq(-2070899692);
                }
                if (0x0 != (ra & 0x200)) {
                    if (n != -1232221421) {
                        throw new IllegalStateException();
                    }
                    npc.method592(packetBuffer.cw((byte)0), -1586819780);
                }
                if ((ra & 0x2000) != 0x0) {
                    if (n != -1232221421) {
                        Client.doCycleJs5(b, packetBuffer);
                        return;
                    }
                    npc.method607(Buffer.ra(packetBuffer, (byte)7), -1826007749);
                }
                if (0x0 != (ra & 0x1000)) {
                    if (n != -1232221421) {
                        throw new IllegalStateException();
                    }
                    final int dq = packetBuffer.dq(-2070899692);
                    if ((dq & 0x1) == 0x1) {
                        if (n != -1232221421) {
                            Client.doCycleJs5(b, packetBuffer);
                            return;
                        }
                        NPC.we(npc, (short)17996);
                    }
                    else {
                        int[] array = null;
                        if (0x2 == (dq & 0x2)) {
                            if (n != -1232221421) {
                                throw new IllegalStateException();
                            }
                            final int dq2 = packetBuffer.dq(-2070899692);
                            array = new int[dq2];
                            for (int l = 0; l < dq2; ++l) {
                                if (n != -1232221421) {
                                    throw new IllegalStateException();
                                }
                                final int cl3 = packetBuffer.cl(-801366224);
                                array[l] = ((cl3 == 65535) ? -1 : cl3);
                            }
                        }
                        short[] array2 = null;
                        if ((dq & 0x4) == 0x4) {
                            if (n != -1232221421) {
                                throw new IllegalStateException();
                            }
                            int length = 0;
                            if (npc.definition.retextureTo != null) {
                                if (n != -1232221421) {
                                    throw new IllegalStateException();
                                }
                                length = npc.definition.retextureTo.length;
                            }
                            array2 = new short[length];
                            for (int n7 = 0; n7 < length; ++n7) {
                                array2[n7] = (short)packetBuffer.da(1077275980);
                            }
                        }
                        short[] array3 = null;
                        if ((dq & 0x8) == 0x8) {
                            if (n != -1232221421) {
                                throw new IllegalStateException();
                            }
                            int length2 = 0;
                            if (npc.definition.recolorTo != null) {
                                length2 = npc.definition.recolorTo.length;
                            }
                            array3 = new short[length2];
                            for (int n8 = 0; n8 < length2; ++n8) {
                                if (n != -1232221421) {
                                    throw new IllegalStateException();
                                }
                                array3[n8] = (short)Buffer.or(packetBuffer, -523126268);
                            }
                        }
                        boolean b2 = false;
                        if ((dq & 0x10) != 0x0) {
                            boolean b3;
                            if (Buffer.ra(packetBuffer, (byte)7) == 1) {
                                if (n != -1232221421) {
                                    throw new IllegalStateException();
                                }
                                b3 = true;
                            }
                            else {
                                b3 = false;
                            }
                            b2 = b3;
                        }
                        npc.method600(new NewShit((NPC.field1047 -= 1963015503) * 413681233 - 1, array, array2, array3, b2), -1457608941);
                    }
                }
                if (0x0 != (ra & 0x400)) {
                    if (n != -1232221421) {
                        throw new IllegalStateException();
                    }
                    final int eq2 = packetBuffer.eq((byte)(-120));
                    if ((eq2 & 0x1) == 0x1) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        NPC.sr(npc, (byte)(-112));
                    }
                    else {
                        int[] array4 = null;
                        if ((eq2 & 0x2) == 0x2) {
                            final int eq3 = packetBuffer.eq((byte)(-11));
                            array4 = new int[eq3];
                            for (int n9 = 0; n9 < eq3; ++n9) {
                                if (n != -1232221421) {
                                    throw new IllegalStateException();
                                }
                                final int zc = Buffer.zc(packetBuffer, 1547349819);
                                int n10;
                                if (zc == 65535) {
                                    if (n != -1232221421) {
                                        throw new IllegalStateException();
                                    }
                                    n10 = -1;
                                }
                                else {
                                    n10 = zc;
                                }
                                array4[n9] = n10;
                            }
                        }
                        short[] array5 = null;
                        if (0x4 == (eq2 & 0x4)) {
                            if (n != -1232221421) {
                                throw new IllegalStateException();
                            }
                            int length3 = 0;
                            if (null != npc.definition.retextureTo) {
                                if (n != -1232221421) {
                                    throw new IllegalStateException();
                                }
                                length3 = npc.definition.retextureTo.length;
                            }
                            array5 = new short[length3];
                            for (int n11 = 0; n11 < length3; ++n11) {
                                if (n != -1232221421) {
                                    throw new IllegalStateException();
                                }
                                array5[n11] = (short)packetBuffer.da(1052580750);
                            }
                        }
                        short[] array6 = null;
                        if ((eq2 & 0x8) == 0x8) {
                            int length4 = 0;
                            if (npc.definition.recolorTo != null) {
                                if (n != -1232221421) {
                                    throw new IllegalStateException();
                                }
                                length4 = npc.definition.recolorTo.length;
                            }
                            array6 = new short[length4];
                            for (int n12 = 0; n12 < length4; ++n12) {
                                if (n != -1232221421) {
                                    throw new IllegalStateException();
                                }
                                array6[n12] = (short)Buffer.zc(packetBuffer, 483094229);
                            }
                        }
                        boolean b4 = false;
                        if (0x0 != (eq2 & 0x10)) {
                            if (n != -1232221421) {
                                throw new IllegalStateException();
                            }
                            b4 = (Buffer.ra(packetBuffer, (byte)7) == 1);
                        }
                        npc.method598(new NewShit((NPC.field1050 -= 1714612375) * -1770985255 - 1, array4, array5, array6, b4), 1428478753);
                    }
                }
                if ((ra & 0x20000) != 0x0) {
                    if (n != -1232221421) {
                        Client.doCycleJs5(b, packetBuffer);
                        return;
                    }
                    final int dq3 = packetBuffer.dq(-2070899692);
                    final int[] array7 = new int[8];
                    final short[] array8 = new short[8];
                    for (int n13 = 0; n13 < 8; ++n13) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        if ((dq3 & 1 << n13) != 0x0) {
                            if (n != -1232221421) {
                                throw new IllegalStateException();
                            }
                            array7[n13] = packetBuffer.do(1266103064);
                            array8[n13] = (short)packetBuffer.dm(-1370697348);
                        }
                        else {
                            array7[n13] = -1;
                            array8[n13] = -1;
                        }
                    }
                    npc.method603(array7, array8, 1712497596);
                }
                if (0x0 != (ra & 0x40000)) {
                    if (n != -1232221421) {
                        throw new IllegalStateException();
                    }
                    final int cx = packetBuffer.cx(-916752754);
                    final NPC npc9 = npc;
                    int cl4;
                    if ((cx & 0x1) != 0x0) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        cl4 = packetBuffer.cl(-1430533565);
                    }
                    else {
                        cl4 = -2117504177 * npc.definition.turnLeftSequence;
                    }
                    npc9.bh = cl4 * -767436785;
                    final NPC npc10 = npc;
                    int cl5;
                    if (0x0 != (cx & 0x2)) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        cl5 = packetBuffer.cl(-397899594);
                    }
                    else {
                        cl5 = npc.definition.turnRightSequence * 1635935495;
                    }
                    npc10.dz = cl5 * -603869663;
                    npc.cr = ((0x0 != (cx & 0x4)) ? Buffer.zc(packetBuffer, 1131590434) : (npc.definition.walkSequence * 849832979)) * 1672510249;
                    final NPC npc11 = npc;
                    int cl6;
                    if (0x0 != (cx & 0x8)) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        cl6 = packetBuffer.cl(-1729909218);
                    }
                    else {
                        cl6 = npc.definition.walkBackSequence * 606174455;
                    }
                    npc11.bf = cl6 * -1683505383;
                    final NPC npc12 = npc;
                    int cl7;
                    if ((cx & 0x10) != 0x0) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        cl7 = packetBuffer.cl(-1451542115);
                    }
                    else {
                        cl7 = 429445119 * npc.definition.walkLeftSequence;
                    }
                    npc12.dl = cl7 * 497469823;
                    npc.dp = ((0x0 != (cx & 0x20)) ? packetBuffer.cl(371800336) : (npc.definition.walkRightSequence * -1237616413)) * 1927855919;
                    final NPC npc13 = npc;
                    int cl8;
                    if ((cx & 0x40) != 0x0) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        cl8 = packetBuffer.cl(598391576);
                    }
                    else {
                        cl8 = -1565402875 * npc.definition.runSequence;
                    }
                    npc13.dr = cl8 * 140602839;
                    npc.bx = (((cx & 0x80) != 0x0) ? packetBuffer.da(1420443594) : (npc.definition.runBackSequence * 1434909561)) * -1320156809;
                    final NPC npc14 = npc;
                    int da;
                    if (0x0 != (cx & 0x100)) {
                        if (n != -1232221421) {
                            Client.doCycleJs5(b, packetBuffer);
                            return;
                        }
                        da = packetBuffer.da(1878073532);
                    }
                    else {
                        da = -1171795391 * npc.definition.runLeftSequence;
                    }
                    npc14.bg = da * 725472713;
                    final NPC npc15 = npc;
                    int da2;
                    if (0x0 != (cx & 0x200)) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        da2 = packetBuffer.da(1527871692);
                    }
                    else {
                        da2 = npc.definition.runRightSequence * 1924156607;
                    }
                    npc15.eo = da2 * -1530081757;
                    npc.ba = ((0x0 != (cx & 0x400)) ? packetBuffer.cl(-817963034) : (-1186532489 * npc.definition.crawlSequence)) * -1035736995;
                    final NPC npc16 = npc;
                    int cl9;
                    if ((cx & 0x800) != 0x0) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        cl9 = packetBuffer.cl(-1420449257);
                    }
                    else {
                        cl9 = npc.definition.crawlBackSequence * 1456216629;
                    }
                    npc16.bm = cl9 * -1110395975;
                    final NPC npc17 = npc;
                    int or3;
                    if ((cx & 0x1000) != 0x0) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        or3 = Buffer.or(packetBuffer, -523126268);
                    }
                    else {
                        or3 = npc.definition.crawlLeftSequence * -750567499;
                    }
                    npc17.bs = or3 * -2025717011;
                    final NPC npc18 = npc;
                    int zc2;
                    if ((cx & 0x2000) != 0x0) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        zc2 = Buffer.zc(packetBuffer, -732373798);
                    }
                    else {
                        zc2 = npc.definition.crawlRightSequence * 1520351037;
                    }
                    npc18.bu = zc2 * -919918425;
                    final NPC npc19 = npc;
                    int or4;
                    if ((cx & 0x4000) != 0x0) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        or4 = Buffer.or(packetBuffer, -523126268);
                    }
                    else {
                        or4 = npc.definition.idleSequence * 1235033537;
                    }
                    npc19.cd = or4 * 1196796229;
                }
                if ((ra & 0x10000) != 0x0) {
                    if (n != -1232221421) {
                        throw new IllegalStateException();
                    }
                    for (int eq4 = packetBuffer.eq((byte)(-26)), n14 = 0; n14 < eq4; ++n14) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        final int dq4 = packetBuffer.dq(-2070899692);
                        final int zc3 = Buffer.zc(packetBuffer, 1483574464);
                        final int en2 = packetBuffer.en(383378593);
                        npc.cj(dq4, zc3, en2 >> 16, en2 & 0xFFFF, -605803370);
                    }
                }
            }
            for (int n15 = 0; n15 < 216061641 * Client.field484; ++n15) {
                if (n != -1232221421) {
                    Client.doCycleJs5(b, packetBuffer);
                    return;
                }
                final int n16 = Client.field485[n15];
                if (Client.cycle * -1886224337 != Client.npcs[n16].de * -523202873) {
                    if (n != -1232221421) {
                        throw new IllegalStateException();
                    }
                    final NPC npc20 = Client.npcs[n16];
                    final NPCComposition definition = null;
                    Client.npcs[n16].pv(definition);
                    npc20.definition = definition;
                    Client.npcs[n16] = null;
                    Client.method369(n16);
                }
            }
            if (-1633313603 * packetBuffer.at == Client.packetWriter.serverPacketLength * 889658999) {
                int m = 0;
                while (m < 265474485 * Client.npcCount) {
                    if (n != -1232221421) {
                        Client.doCycleJs5(b, packetBuffer);
                        return;
                    }
                    if (Client.npcs[Client.npcIndices[m]] == null) {
                        if (n != -1232221421) {
                            throw new IllegalStateException();
                        }
                        throw new RuntimeException(m + class96.an + Client.npcCount * 265474485);
                    }
                    else {
                        ++m;
                    }
                }
                Client.doCycleJs5(b, packetBuffer);
                return;
            }
            if (n != -1232221421) {
                Client.doCycleJs5(b, packetBuffer);
                return;
            }
            throw new RuntimeException(packetBuffer.at * -1633313603 + class96.an + 889658999 * Client.packetWriter.serverPacketLength);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fv.kb(" + ')');
        }
    }
    
    public static GameBuild vmethod3254(final int n, final int n2) {
        try {
            final GameBuild[] array = { GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP };
            int i = 0;
            while (i < array.length) {
                if (n2 == -724447164) {
                    throw new IllegalStateException();
                }
                final GameBuild gameBuild = array[i];
                if (n == gameBuild.buildId * -978256915) {
                    if (n2 == -724447164) {
                        throw new IllegalStateException();
                    }
                    return gameBuild;
                }
                else {
                    ++i;
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fv.af(" + ')');
        }
    }
    
    @Override
    void vmethod3254(final Buffer buffer, final int n) {
        try {
            boolean field1342;
            if (Buffer.ra(buffer, (byte)7) == 1) {
                if (n == 1120136284) {
                    throw new IllegalStateException();
                }
                field1342 = true;
            }
            else {
                field1342 = false;
            }
            this.field1342 = field1342;
            this.field1339 = Buffer.wu(buffer, 435772489);
            this.field1340 = Buffer.wu(buffer, 435772489);
            this.field1341 = Buffer.wu(buffer, 435772489);
            this.field1338 = Buffer.wu(buffer, 435772489);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fv.af(" + ')');
        }
    }
}
