// 
// Decompiled by Procyon v0.5.36
// 

public class class127 implements class356
{
    static final class127 field1251;
    static final class127 field1252;
    static final class127 field1253;
    static final class127 field1254;
    static final class127 field1255;
    static final class127 field1256;
    static final class127 field1257;
    static final class127 field1258;
    static final class127 field1259;
    static final class127 field1260;
    static final class127 field1261;
    static final class127 field1262;
    static final class127 field1263;
    static final int db = 14;
    static final class127 field1264;
    static final class127 field1265;
    static final class127 field1266;
    final int field1267;
    final int field1268;
    final int field1269;
    static final byte by = Byte.MAX_VALUE;
    static int js5Port;
    static final class127 field1271;
    
    class127(final int n, final int n2, final String s, final int n3, final int n4) {
        this.field1267 = 40879509 * n;
        this.field1268 = 1377749943 * n2;
        this.field1269 = n3 * 1121387767;
    }
    
    static {
        field1252 = new class127(0, 0, null, -1, -1);
        field1254 = new class127(1, 1, null, 0, 2);
        field1253 = new class127(2, 2, null, 1, 2);
        field1251 = new class127(3, 3, null, 2, 2);
        field1271 = new class127(4, 4, null, 3, 1);
        field1266 = new class127(5, 5, null, 4, 1);
        field1257 = new class127(6, 6, null, 5, 1);
        field1258 = new class127(7, 7, null, 6, 3);
        field1259 = new class127(8, 8, null, 7, 3);
        field1260 = new class127(9, 9, null, 8, 3);
        field1261 = new class127(10, 10, null, 0, 7);
        field1255 = new class127(11, 11, null, 1, 7);
        field1263 = new class127(12, 12, null, 2, 7);
        field1256 = new class127(13, 13, null, 3, 7);
        field1262 = new class127(14, 14, null, 4, 7);
        field1265 = new class127(15, 15, null, 5, 7);
        field1264 = new class127(16, 16, null, 0, 5);
    }
    
    int ao() {
        return 1204354247 * this.field1269;
    }
    
    static class127[] at() {
        return new class127[] { class127.field1252, class127.field1254, class127.field1253, class127.field1251, class127.field1271, class127.field1266, class127.field1257, class127.field1258, class127.field1259, class127.field1260, class127.field1261, class127.field1255, class127.field1263, class127.field1256, class127.field1262, class127.field1265, class127.field1264 };
    }
    
    int ax() {
        return 1204354247 * this.field1269;
    }
    
    int ay() {
        return 1712129874 * this.field1269;
    }
    
    @Override
    public int aw() {
        return 1471072985 * this.field1268;
    }
    
    static class127[] al() {
        return new class127[] { class127.field1252, class127.field1254, class127.field1253, class127.field1251, class127.field1271, class127.field1266, class127.field1257, class127.field1258, class127.field1259, class127.field1260, class127.field1261, class127.field1255, class127.field1263, class127.field1256, class127.field1262, class127.field1265, class127.field1264 };
    }
    
    @Override
    public int an() {
        return -1158217209 * this.field1268;
    }
    
    static void sortWorldList(final int n, final boolean b, final int n2, final boolean b2, final byte b3) {
        try {
            if (class31.World_worlds != null) {
                if (b3 >= 1) {
                    throw new IllegalStateException();
                }
                class13.doWorldSorting(0, class31.World_worlds.length - 1, n, b, n2, b2, 986853816);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ec.ac(" + ')');
        }
    }
    
    public int sortWorldList() {
        return -1158217209 * this.field1268;
    }
    
    int aa() {
        return 1204354247 * this.field1269;
    }
    
    static class127 ai(final int n) {
        class127 field1252 = (class127)StructComposition.findEnumerated(class121.method721((byte)120), n, (short)173);
        if (null == field1252) {
            field1252 = class127.field1252;
        }
        return field1252;
    }
    
    static final void loadRegions(final boolean isInInstance, final PacketBuffer packetBuffer, final byte b) {
        Client.zz(isInInstance, packetBuffer);
        try {
            if (!(Client.isInInstance = isInInstance)) {
                if (b == 3) {
                    throw new IllegalStateException();
                }
                final int da = packetBuffer.da(437873455);
                final int da2 = packetBuffer.da(682891587);
                final int cl = packetBuffer.cl(-349681540);
                GameObject.xteaKeys = new int[cl][4];
                for (int i = 0; i < cl; ++i) {
                    if (b == 3) {
                        throw new IllegalStateException();
                    }
                    for (int j = 0; j < 4; ++j) {
                        if (b == 3) {
                            throw new IllegalStateException();
                        }
                        GameObject.xteaKeys[i][j] = packetBuffer.cx(-1144141568);
                    }
                }
                WorldMapAreaData.regions = new int[cl];
                FontName.regionMapArchiveIds = new int[cl];
                Archive.regionLandArchiveIds = new int[cl];
                class4.regionLandArchives = new byte[cl][];
                ObjectSound.regionMapArchives = new byte[cl][];
                int n = 0;
                for (int k = (da2 - 6) / 8; k <= (da2 + 6) / 8; ++k) {
                    if (b == 3) {
                        throw new IllegalStateException();
                    }
                    for (int l = (da - 6) / 8; l <= (6 + da) / 8; ++l) {
                        if (b == 3) {
                            throw new IllegalStateException();
                        }
                        WorldMapAreaData.regions[n] = (k << 8) + l;
                        FontName.regionMapArchiveIds[n] = AbstractArchive.getFileFlat(GrandExchangeOfferTotalQuantityComparator.archive9, "m" + k + "_" + l, -1959178612);
                        Archive.regionLandArchiveIds[n] = AbstractArchive.getFileFlat(GrandExchangeOfferTotalQuantityComparator.archive9, "l" + k + "_" + l, -1724706302);
                        ++n;
                    }
                }
                Decimator.method331(da2, da, true, (byte)101);
            }
            else {
                final int da3 = packetBuffer.da(1766938486);
                final boolean b2 = Buffer.ra(packetBuffer, (byte)7) == 1;
                final int zc = Buffer.zc(packetBuffer, 1729553397);
                final int cl2 = packetBuffer.cl(-172193304);
                PacketBuffer.jb(packetBuffer, (byte)50);
                for (int n2 = 0; n2 < 4; ++n2) {
                    if (b == 3) {
                        throw new IllegalStateException();
                    }
                    for (int n3 = 0; n3 < 13; ++n3) {
                        if (b == 3) {
                            throw new IllegalStateException();
                        }
                        for (int n4 = 0; n4 < 13; ++n4) {
                            if (b == 3) {
                                throw new IllegalStateException();
                            }
                            if (packetBuffer.bitsRemaining(1, -1971342711) == 1) {
                                if (b == 3) {
                                    throw new IllegalStateException();
                                }
                                Client.instanceChunkTemplates[n2][n3][n4] = packetBuffer.bitsRemaining(26, -1270590426);
                            }
                            else {
                                Client.instanceChunkTemplates[n2][n3][n4] = -1;
                            }
                        }
                    }
                }
                packetBuffer.exportIndex((byte)(-69));
                GameObject.xteaKeys = new int[cl2][4];
                for (int n5 = 0; n5 < cl2; ++n5) {
                    if (b == 3) {
                        Client.lc(isInInstance, packetBuffer);
                        return;
                    }
                    for (int n6 = 0; n6 < 4; ++n6) {
                        if (b == 3) {
                            throw new IllegalStateException();
                        }
                        GameObject.xteaKeys[n5][n6] = packetBuffer.cx(-2059609216);
                    }
                }
                WorldMapAreaData.regions = new int[cl2];
                FontName.regionMapArchiveIds = new int[cl2];
                Archive.regionLandArchiveIds = new int[cl2];
                class4.regionLandArchives = new byte[cl2][];
                ObjectSound.regionMapArchives = new byte[cl2][];
                int n7 = 0;
                for (int n8 = 0; n8 < 4; ++n8) {
                    if (b == 3) {
                        throw new IllegalStateException();
                    }
                    for (int n9 = 0; n9 < 13; ++n9) {
                        for (int n10 = 0; n10 < 13; ++n10) {
                            if (b == 3) {
                                Client.lc(isInInstance, packetBuffer);
                                return;
                            }
                            final int n11 = Client.instanceChunkTemplates[n8][n9][n10];
                            if (-1 != n11) {
                                if (b == 3) {
                                    Client.lc(isInInstance, packetBuffer);
                                    return;
                                }
                                int n12 = ((n11 >> 14 & 0x3FF) / 8 << 8) + (n11 >> 3 & 0x7FF) / 8;
                                int n13 = 0;
                                while (n13 < n7) {
                                    if (WorldMapAreaData.regions[n13] == n12) {
                                        if (b == 3) {
                                            throw new IllegalStateException();
                                        }
                                        n12 = -1;
                                        break;
                                    }
                                    else {
                                        ++n13;
                                    }
                                }
                                if (n12 != -1) {
                                    if (b == 3) {
                                        throw new IllegalStateException();
                                    }
                                    WorldMapAreaData.regions[n7] = n12;
                                    final int n14 = n12 >> 8 & 0xFF;
                                    final int n15 = n12 & 0xFF;
                                    FontName.regionMapArchiveIds[n7] = AbstractArchive.getFileFlat(GrandExchangeOfferTotalQuantityComparator.archive9, "m" + n14 + "_" + n15, -956450247);
                                    Archive.regionLandArchiveIds[n7] = AbstractArchive.getFileFlat(GrandExchangeOfferTotalQuantityComparator.archive9, "l" + n14 + "_" + n15, -1184476028);
                                    ++n7;
                                }
                            }
                        }
                    }
                }
                final int n16 = da3;
                final int n17 = zc;
                boolean b3;
                if (!b2) {
                    if (b == 3) {
                        throw new IllegalStateException();
                    }
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                Decimator.method331(n16, n17, b3, (byte)84);
            }
            Client.lc(isInInstance, packetBuffer);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ec.js(" + ')');
        }
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return -1158217209 * this.field1268;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ec.af(" + ')');
        }
    }
    
    int method756(final byte b) {
        try {
            return 1204354247 * this.field1269;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ec.ab(" + ')');
        }
    }
    
    public static void method761(final int n) {
        try {
            ItemComposition.ItemDefinition_cachedSprites.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ec.aj(" + ')');
        }
    }
    
    static class127 ag(final int n) {
        class127 field1252 = (class127)StructComposition.findEnumerated(class121.method721((byte)102), n, (short)173);
        if (null == field1252) {
            field1252 = class127.field1252;
        }
        return field1252;
    }
    
    static final void runIntfCloseListeners(final int n, final int n2, final byte b) {
        try {
            if (SoundSystem.loadInterface(n, 1376777516)) {
                class143.runComponentCloseListeners(VerticalAlignment.Widget_interfaceComponents[n], n2, (byte)119);
                return;
            }
            if (b != 63) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ec.mu(" + ')');
        }
    }
}
