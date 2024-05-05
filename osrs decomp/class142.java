// 
// Decompiled by Procyon v0.5.36
// 

public class class142
{
    static final int kl = 512;
    int field1322;
    IterableNodeDeque field1323;
    static final int ac = 1;
    static final int at = 6;
    long field1324;
    static final int aq = 4;
    static final int ay = 8;
    static final int aa = 7;
    static final int au = 2;
    static final int ab = 3;
    
    public class142(final Buffer buffer) {
        this.field1322 = -2023339089;
        this.field1323 = new IterableNodeDeque();
        this.method809(buffer, -1541444446);
    }
    
    public static void vs(final class142 class142, final Buffer buffer) {
        if (class142 == null) {
            class142.ab(buffer);
            return;
        }
        class142.field1324 = Buffer.ks(buffer, (byte)1) * -6484480482305074947L;
        class142.field1322 = buffer.readInt(-1269181047) * 2023339089;
        for (int i = Buffer.ra(buffer, (byte)7); i != 0; i = Buffer.ra(buffer, (byte)7)) {
            class139 class143;
            if (3 == i) {
                class143 = new class161(class142);
            }
            else if (i == 1) {
                class143 = new class137(class142);
            }
            else if (13 == i) {
                class143 = new class154(class142);
            }
            else if (i == 4) {
                class143 = new class146(class142);
            }
            else if (i == 6) {
                class143 = new class153(class142);
            }
            else if (5 == i) {
                class143 = new class138(class142);
            }
            else if (2 == i) {
                class143 = new class143(class142);
            }
            else if (i == 7) {
                class143 = new class136(class142);
            }
            else if (i == 14) {
                class143 = new class140(class142);
            }
            else if (8 == i) {
                class143 = new class157(class142);
            }
            else if (i == 9) {
                class143 = new class163(class142);
            }
            else if (10 == i) {
                class143 = new class149(class142);
            }
            else if (11 == i) {
                class143 = new class144(class142);
            }
            else if (12 == i) {
                class143 = new class148(class142);
            }
            else {
                if (15 != i) {
                    throw new RuntimeException("");
                }
                class143 = new class158(class142);
            }
            class143.vmethod3254(buffer, 683804813);
            class142.field1323.addFirst(class143);
        }
    }
    
    public void at(final ClanSettings clanSettings) {
        if (-7997171180678003627L * this.field1324 == 3071145065741142973L * clanSettings.field1370 && clanSettings.field1356 * -584024417 == 1818498225 * this.field1322) {
            for (class139 class139 = (class139)this.field1323.up(); class139 != null; class139 = (class139)this.field1323.by()) {
                class139.vmethod3248(clanSettings, 1979300621);
            }
            clanSettings.field1356 += 826018390;
            return;
        }
        throw new RuntimeException("");
    }
    
    public static void hi(final Buffer buffer, final Buffer buffer2) {
        if (buffer == null) {
            buffer.hr();
        }
        buffer.writeBytes(buffer2.array, 0, buffer2.offset * -1633313603, (byte)83);
    }
    
    public static void td(final Client client, final boolean b) {
        if (client == null) {
            client.kw();
        }
        SequenceDefinition.method1129(Client.rootInterface * -42648877, Client.aj * -1989369781, class262.canvasHeight * -588380128, b, -726165376);
    }
    
    public static void pb(final class142 class142, final Buffer buffer) {
        if (class142 == null) {
            class142.ab(buffer);
            return;
        }
        class142.field1324 = Buffer.ks(buffer, (byte)1) * -6484480482305074947L;
        class142.field1322 = buffer.readInt(-1275051574) * 2023339089;
        for (int i = Buffer.ra(buffer, (byte)7); i != 0; i = Buffer.ra(buffer, (byte)7)) {
            class139 class143;
            if (3 == i) {
                class143 = new class161(class142);
            }
            else if (i == 1) {
                class143 = new class137(class142);
            }
            else if (13 == i) {
                class143 = new class154(class142);
            }
            else if (i == 4) {
                class143 = new class146(class142);
            }
            else if (i == 6) {
                class143 = new class153(class142);
            }
            else if (5 == i) {
                class143 = new class138(class142);
            }
            else if (2 == i) {
                class143 = new class143(class142);
            }
            else if (i == 7) {
                class143 = new class136(class142);
            }
            else if (i == 14) {
                class143 = new class140(class142);
            }
            else if (8 == i) {
                class143 = new class157(class142);
            }
            else if (i == 9) {
                class143 = new class163(class142);
            }
            else if (10 == i) {
                class143 = new class149(class142);
            }
            else if (11 == i) {
                class143 = new class144(class142);
            }
            else if (12 == i) {
                class143 = new class148(class142);
            }
            else {
                if (15 != i) {
                    throw new RuntimeException("");
                }
                class143 = new class158(class142);
            }
            class143.vmethod3254(buffer, -320930988);
            class142.field1323.addFirst(class143);
        }
    }
    
    public void getClipMidY2(final ClanSettings clanSettings) {
        if (-7997171180678003627L * this.field1324 == 3071145065741142973L * clanSettings.field1370 && clanSettings.field1356 * -584024417 == 1818498225 * this.field1322) {
            for (class139 class139 = (class139)this.field1323.up(); class139 != null; class139 = (class139)this.field1323.by()) {
                class139.vmethod3248(clanSettings, 1697285864);
            }
            clanSettings.field1356 += 2008489311;
            return;
        }
        throw new RuntimeException("");
    }
    
    static int getClipMidY2(final byte b) {
        try {
            return 1145780727 * Rasterizer3D.clips.field2238;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fa.al(" + ')');
        }
    }
    
    public void method807(final ClanSettings clanSettings, final byte b) {
        try {
            if (-7997171180678003627L * this.field1324 != 3071145065741142973L * clanSettings.field1370 || clanSettings.field1356 * -584024417 != 1818498225 * this.field1322) {
                throw new RuntimeException("");
            }
            for (class139 class139 = (class139)this.field1323.up(); class139 != null; class139 = (class139)this.field1323.by()) {
                class139.vmethod3248(clanSettings, 1712319228);
            }
            clanSettings.field1356 += 2008489311;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fa.an(" + ')');
        }
    }
    
    static final void method810(final int n) {
        try {
            for (Projectile projectile = (Projectile)Client.projectiles.last(); null != projectile; projectile = (Projectile)Client.projectiles.previous()) {
                if (n != 1215119663) {
                    throw new IllegalStateException();
                }
                if (GameEngine.Client_plane * -1727408401 == -850668143 * projectile.plane) {
                    if (n != 1215119663) {
                        throw new IllegalStateException();
                    }
                    if (-1886224337 * Client.cycle > -1203783373 * projectile.cycleEnd) {
                        if (n != 1215119663) {
                            return;
                        }
                    }
                    else {
                        if (Client.cycle * -1886224337 >= -2048301599 * projectile.cycleStart) {
                            if (803751093 * projectile.targetIndex > 0) {
                                if (n != 1215119663) {
                                    return;
                                }
                                final NPC npc = Client.npcs[projectile.targetIndex * 803751093 - 1];
                                if (null != npc) {
                                    if (n != 1215119663) {
                                        throw new IllegalStateException();
                                    }
                                    if (1144428983 * npc.br >= 0) {
                                        if (n != 1215119663) {
                                            throw new IllegalStateException();
                                        }
                                        if (1144428983 * npc.br < 13312) {
                                            if (n != 1215119663) {
                                                return;
                                            }
                                            if (npc.ep * -411750205 >= 0) {
                                                if (n != 1215119663) {
                                                    throw new IllegalStateException();
                                                }
                                                if (-411750205 * npc.ep < 13312) {
                                                    if (n != 1215119663) {
                                                        throw new IllegalStateException();
                                                    }
                                                    projectile.setDestination(1144428983 * npc.br, -411750205 * npc.ep, class147.getTileHeight(npc.br * 1144428983, -411750205 * npc.ep, -850668143 * projectile.plane, (byte)(-22)) - projectile.endHeight * -860121869, -1886224337 * Client.cycle, -335674854);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (projectile.targetIndex * 803751093 < 0) {
                                if (n != 1215119663) {
                                    throw new IllegalStateException();
                                }
                                final int n2 = -(803751093 * projectile.targetIndex) - 1;
                                Player localPlayer;
                                if (-549033243 * Client.localPlayerIndex == n2) {
                                    if (n != 1215119663) {
                                        throw new IllegalStateException();
                                    }
                                    localPlayer = MusicPatchNode.localPlayer;
                                }
                                else {
                                    localPlayer = Client.players[n2];
                                }
                                if (localPlayer != null && 1144428983 * localPlayer.br >= 0) {
                                    if (n != 1215119663) {
                                        throw new IllegalStateException();
                                    }
                                    if (localPlayer.br * 1144428983 < 13312 && -411750205 * localPlayer.ep >= 0) {
                                        if (n != 1215119663) {
                                            throw new IllegalStateException();
                                        }
                                        if (-411750205 * localPlayer.ep < 13312) {
                                            projectile.setDestination(1144428983 * localPlayer.br, localPlayer.ep * -411750205, class147.getTileHeight(localPlayer.br * 1144428983, -411750205 * localPlayer.ep, -850668143 * projectile.plane, (byte)(-47)) - -860121869 * projectile.endHeight, Client.cycle * -1886224337, -335674854);
                                        }
                                    }
                                }
                            }
                            projectile.advance(-1795081153 * Client.field432, 1703494104);
                            class31.scene.drawEntity(-1727408401 * GameEngine.Client_plane, (int)projectile.x, (int)projectile.y, (int)projectile.z, 60, projectile, 650783873 * projectile.yaw, -1L, false);
                        }
                        continue;
                    }
                }
                projectile.hw();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fa.ji(" + ')');
        }
    }
    
    public void aa(final ClanSettings clanSettings) {
        if (-7997171180678003627L * this.field1324 == 3071145065741142973L * clanSettings.field1370 && clanSettings.field1356 * 2070693 == 821356256 * this.field1322) {
            for (class139 class139 = (class139)this.field1323.up(); class139 != null; class139 = (class139)this.field1323.by()) {
                class139.vmethod3248(clanSettings, 1865406859);
            }
            clanSettings.field1356 -= 126169115;
            return;
        }
        throw new RuntimeException("");
    }
    
    static void method811(final NPC npc, final byte b) {
        try {
            npc.bt = 1763542591 * npc.definition.size;
            npc.cv = npc.definition.rotation * -1952936367;
            npc.cr = npc.definition.walkSequence * 869101579;
            npc.bf = -1784513249 * npc.definition.walkBackSequence;
            npc.dl = 1886938753 * npc.definition.walkLeftSequence;
            npc.dp = npc.definition.walkRightSequence * 2010418861;
            npc.cd = npc.definition.idleSequence * -133009915;
            npc.bh = npc.definition.turnLeftSequence * -1457034847;
            npc.dz = npc.definition.turnRightSequence * -1686059033;
            npc.dr = -1079417805 * npc.definition.runSequence;
            npc.bx = npc.definition.runBackSequence * -2020975041;
            npc.bg = npc.definition.runLeftSequence * 1337010697;
            npc.eo = 269496349 * npc.definition.runRightSequence;
            npc.ba = -2121315781 * npc.definition.crawlSequence;
            npc.bm = npc.definition.crawlBackSequence * -605946035;
            npc.bs = npc.definition.crawlLeftSequence * -76847983;
            npc.bu = npc.definition.crawlRightSequence * -1771433781;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fa.kg(" + ')');
        }
    }
    
    void method809(final Buffer buffer, final int n) {
        try {
            this.field1324 = Buffer.ks(buffer, (byte)1) * -6484480482305074947L;
            this.field1322 = buffer.readInt(-1787022667) * 2023339089;
            for (int i = Buffer.ra(buffer, (byte)7); i != 0; i = Buffer.ra(buffer, (byte)7)) {
                if (n != -1541444446) {
                    throw new IllegalStateException();
                }
                class139 class139;
                if (3 == i) {
                    class139 = new class161(this);
                }
                else if (i == 1) {
                    if (n != -1541444446) {
                        return;
                    }
                    class139 = new class137(this);
                }
                else if (13 == i) {
                    if (n != -1541444446) {
                        throw new IllegalStateException();
                    }
                    class139 = new class154(this);
                }
                else if (i == 4) {
                    if (n != -1541444446) {
                        throw new IllegalStateException();
                    }
                    class139 = new class146(this);
                }
                else if (i == 6) {
                    if (n != -1541444446) {
                        return;
                    }
                    class139 = new class153(this);
                }
                else if (5 == i) {
                    if (n != -1541444446) {
                        throw new IllegalStateException();
                    }
                    class139 = new class138(this);
                }
                else if (2 == i) {
                    if (n != -1541444446) {
                        return;
                    }
                    class139 = new class143(this);
                }
                else if (i == 7) {
                    class139 = new class136(this);
                }
                else if (i == 14) {
                    if (n != -1541444446) {
                        throw new IllegalStateException();
                    }
                    class139 = new class140(this);
                }
                else if (8 == i) {
                    if (n != -1541444446) {
                        throw new IllegalStateException();
                    }
                    class139 = new class157(this);
                }
                else if (i == 9) {
                    if (n != -1541444446) {
                        throw new IllegalStateException();
                    }
                    class139 = new class163(this);
                }
                else if (10 == i) {
                    if (n != -1541444446) {
                        return;
                    }
                    class139 = new class149(this);
                }
                else if (11 == i) {
                    if (n != -1541444446) {
                        return;
                    }
                    class139 = new class144(this);
                }
                else if (12 == i) {
                    if (n != -1541444446) {
                        throw new IllegalStateException();
                    }
                    class139 = new class148(this);
                }
                else {
                    if (15 != i) {
                        throw new RuntimeException("");
                    }
                    if (n != -1541444446) {
                        throw new IllegalStateException();
                    }
                    class139 = new class158(this);
                }
                class139.vmethod3254(buffer, 168736686);
                this.field1323.addFirst(class139);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fa.af(" + ')');
        }
    }
    
    void ab(final Buffer buffer) {
        this.field1324 = Buffer.ks(buffer, (byte)1) * -6484480482305074947L;
        this.field1322 = buffer.readInt(-1505101201) * 2023339089;
        for (int i = Buffer.ra(buffer, (byte)7); i != 0; i = Buffer.ra(buffer, (byte)7)) {
            class139 class139;
            if (3 == i) {
                class139 = new class161(this);
            }
            else if (i == 1) {
                class139 = new class137(this);
            }
            else if (13 == i) {
                class139 = new class154(this);
            }
            else if (i == 4) {
                class139 = new class146(this);
            }
            else if (i == 6) {
                class139 = new class153(this);
            }
            else if (5 == i) {
                class139 = new class138(this);
            }
            else if (2 == i) {
                class139 = new class143(this);
            }
            else if (i == 7) {
                class139 = new class136(this);
            }
            else if (i == 14) {
                class139 = new class140(this);
            }
            else if (8 == i) {
                class139 = new class157(this);
            }
            else if (i == 9) {
                class139 = new class163(this);
            }
            else if (10 == i) {
                class139 = new class149(this);
            }
            else if (11 == i) {
                class139 = new class144(this);
            }
            else if (12 == i) {
                class139 = new class148(this);
            }
            else {
                if (15 != i) {
                    throw new RuntimeException("");
                }
                class139 = new class158(this);
            }
            class139.vmethod3254(buffer, 380472982);
            this.field1323.addFirst(class139);
        }
    }
    
    public void aq(final ClanSettings clanSettings) {
        if (-7997171180678003627L * this.field1324 == 3071145065741142973L * clanSettings.field1370 && clanSettings.field1356 * -584024417 == 1818498225 * this.field1322) {
            for (class139 class139 = (class139)this.field1323.up(); class139 != null; class139 = (class139)this.field1323.by()) {
                class139.vmethod3248(clanSettings, 2108132764);
            }
            clanSettings.field1356 += 2008489311;
            return;
        }
        throw new RuntimeException("");
    }
    
    public static void bk(final class142 class142, final Buffer buffer) {
        if (class142 == null) {
            class142.ab(buffer);
            return;
        }
        class142.field1324 = Buffer.ks(buffer, (byte)1) * -6484480482305074947L;
        class142.field1322 = buffer.readInt(-968662519) * 2023339089;
        for (int i = Buffer.ra(buffer, (byte)7); i != 0; i = Buffer.ra(buffer, (byte)7)) {
            class139 class143;
            if (3 == i) {
                class143 = new class161(class142);
            }
            else if (i == 1) {
                class143 = new class137(class142);
            }
            else if (13 == i) {
                class143 = new class154(class142);
            }
            else if (i == 4) {
                class143 = new class146(class142);
            }
            else if (i == 6) {
                class143 = new class153(class142);
            }
            else if (5 == i) {
                class143 = new class138(class142);
            }
            else if (2 == i) {
                class143 = new class143(class142);
            }
            else if (i == 7) {
                class143 = new class136(class142);
            }
            else if (i == 14) {
                class143 = new class140(class142);
            }
            else if (8 == i) {
                class143 = new class157(class142);
            }
            else if (i == 9) {
                class143 = new class163(class142);
            }
            else if (10 == i) {
                class143 = new class149(class142);
            }
            else if (11 == i) {
                class143 = new class144(class142);
            }
            else if (12 == i) {
                class143 = new class148(class142);
            }
            else {
                if (15 != i) {
                    throw new RuntimeException("");
                }
                class143 = new class158(class142);
            }
            class143.vmethod3254(buffer, 2091393821);
            class142.field1323.addFirst(class143);
        }
    }
}
