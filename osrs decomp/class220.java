import net.runelite.api.Rasterizer;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class class220 extends Rasterizer2D
{
    public static final int bl = 73;
    boolean field2003;
    static final int au = 14;
    int[] field2004;
    Clips field2005;
    public static final Rasterizer ks;
    boolean field2006;
    static final int ah = 10;
    
    class220(final Clips field2005) {
        this.field2006 = false;
        this.field2003 = false;
        this.field2004 = Rasterizer3D.Rasterizer3D_colorPalette;
        this.field2005 = field2005;
    }
    
    static {
        ks = (Rasterizer)new rl8();
    }
    
    public static void pc(final class220 class220, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, int n10, final byte b, final byte b2, final byte b3, final byte b4) {
        if (class220 == null) {
            class220.ad(n, n, n, n, n, n, n7, n7, n7, n, b, b, b, b);
        }
        n10 = class220.field2004[class161.vmethod3248(n10, b, b2, b3, b4, (byte)(-126))];
        class220.be(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    static void method1229(final int n, final Coord coord, final boolean b, final byte b2) {
        try {
            class88.getWorldMap(-1080694136).method2350(class88.getWorldMap(1347059277).getMapArea(n, -1113732625), new Coord(-1900490645 * MusicPatchNode.localPlayer.plane, (MusicPatchNode.localPlayer.br * 1144428983 >> 7) + -1232093375 * WorldMapData_0.baseX, GameObject.baseY * 827352769 + (-411750205 * MusicPatchNode.localPlayer.ep >> 7)), coord, b, 2112134948);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ii.cs(" + ')');
        }
    }
    
    void ad(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, int n10, final byte b, final byte b2, final byte b3, final byte b4) {
        n10 = this.field2004[class161.vmethod3248(n10, b, b2, b3, b4, (byte)(-9))];
        this.vmethod1366(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    abstract void bb(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9, final int p10, final int p11);
    
    public static void sm() {
        Rasterizer2D.Rasterizer2D_resetClip();
    }
    
    public static void nf(final int n, final int n2, final int n3, final int n4) {
        Rasterizer2D.Rasterizer2D_drawVerticalLine(n, n2, n3, n4);
    }
    
    abstract void vmethod1362(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9, final int p10, final int p11, final int p12, final int p13, final int p14, final int p15, final int p16, final int p17, final int p18, final int p19, final int p20, final int p21);
    
    void ak(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, int n10, final byte b, final byte b2, final byte b3, final byte b4) {
        n10 = this.field2004[class161.vmethod3248(n10, b, b2, b3, b4, (byte)(-78))];
        this.be(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    static final int av(final int n, int n2) {
        n2 = (n & 0x7F) * n2 >> 7;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    abstract void be(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9);
    
    public static void cp() {
        RouteStrategy.rasterProvider.tz();
    }
    
    void as(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, int vmethod3248, int vmethod3249, int vmethod3250, final byte b, final byte b2, final byte b3, final byte b4) {
        vmethod3248 = class161.vmethod3248(vmethod3248, b, b2, b3, b4, (byte)(-104));
        vmethod3249 = class161.vmethod3248(vmethod3249, b, b2, b3, b4, (byte)(-114));
        vmethod3250 = class161.vmethod3248(vmethod3250, b, b2, b3, b4, (byte)(-77));
        this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, vmethod3248, vmethod3249, vmethod3250);
    }
    
    public static int ev(final AbstractArchive abstractArchive, String lowerCase) {
        if (abstractArchive == null) {
            abstractArchive.eb(lowerCase, lowerCase);
        }
        lowerCase = lowerCase.toLowerCase();
        return abstractArchive.groupLoadPercent(abstractArchive.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 1850481810), 396085290), -2101543574);
    }
    
    void az(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, int n10, final byte b, final byte b2, final byte b3, final byte b4) {
        n10 = this.field2004[class161.vmethod3248(n10, b, b2, b3, b4, (byte)(-9))];
        this.be(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    static int ax(final int n, final byte b, final byte b2, final byte b3, final byte b4) {
        int n2 = n >> 10 & 0x3F;
        int n3 = n >> 7 & 0x7;
        int n4 = n & 0x7F;
        final int n5 = b4 & 0xFF;
        if (-1 != b) {
            n2 += n5 * (b - n2) >> 7;
        }
        if (-1 != b2) {
            n3 += (b2 - n3) * n5 >> 7;
        }
        if (b3 != -1) {
            n4 += n5 * (b3 - n4) >> 7;
        }
        return (n2 << 10 | n3 << 7 | n4) & 0xFFFF;
    }
    
    abstract void bi(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9, final int p10, final int p11);
    
    abstract void bo(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9, final int p10, final int p11, final int p12, final int p13, final int p14, final int p15, final int p16, final int p17, final int p18, final int p19, final int p20, final int p21);
    
    public static void ui(final int n, final int n2, final int n3, final int n4) {
        Rasterizer2D.Rasterizer2D_setClip(n, n2, n3, n4);
    }
    
    abstract void bt(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9, final int p10, final int p11, final int p12, final int p13, final int p14, final int p15, final int p16, final int p17, final int p18, final int p19, final int p20, final int p21);
    
    public static int method1228(final byte[] array, final int n, final byte b) {
        try {
            return SequenceDefinition.method1135(array, 0, n, 645656657);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ii.br(" + ')');
        }
    }
    
    void am(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, int vmethod3248, int vmethod3249, int vmethod3250, final byte b, final byte b2, final byte b3, final byte b4) {
        vmethod3248 = class161.vmethod3248(vmethod3248, b, b2, b3, b4, (byte)(-4));
        vmethod3249 = class161.vmethod3248(vmethod3249, b, b2, b3, b4, (byte)(-93));
        vmethod3250 = class161.vmethod3248(vmethod3250, b, b2, b3, b4, (byte)(-60));
        this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, vmethod3248, vmethod3249, vmethod3250);
    }
    
    abstract void vmethod1378(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9, final int p10, final int p11, final int p12, final int p13, final int p14, final int p15, final int p16, final int p17, final int p18, final int p19, final int p20, final int p21);
    
    public static void method1224(final int n, final int n2) {
        try {
            if (926096579 * class297.musicPlayerStatus != 0) {
                if (n2 >= -1012890131) {
                    throw new IllegalStateException();
                }
                class100.musicTrackVolume = n * 111967803;
            }
            else {
                class475.midiPcmStream.setPcmStreamVolume(n, (byte)19);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ii.ac(" + ')');
        }
    }
    
    void method1224(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, int vmethod3248, int vmethod3249, int vmethod3250, final byte b, final byte b2, final byte b3, final byte b4, final byte b5) {
        try {
            vmethod3248 = class161.vmethod3248(vmethod3248, b, b2, b3, b4, (byte)(-65));
            vmethod3249 = class161.vmethod3248(vmethod3249, b, b2, b3, b4, (byte)(-50));
            vmethod3250 = class161.vmethod3248(vmethod3250, b, b2, b3, b4, (byte)(-50));
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, vmethod3248, vmethod3249, vmethod3250);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ii.ac(" + ')');
        }
    }
    
    public static void ot(final class220 class220, final int[] array, final int n, final int n2, final float[] array2) {
        if (class220 == null) {
            class220.aa(array, n, n, array2);
            return;
        }
        ea(array, n, n2, array2);
    }
    
    void method1231(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, int n10, final byte b, final byte b2, final byte b3, final byte b4, final int n11) {
        try {
            n10 = this.field2004[class161.vmethod3248(n10, b, b2, b3, b4, (byte)(-39))];
            this.bk(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ii.au(" + ')');
        }
    }
    
    void aa(final int[] array, final int n, final int n2, final float[] array2) {
        ea(array, n, n2, array2);
    }
    
    static int ai(final int n, final byte b, final byte b2, final byte b3, final byte b4) {
        int n2 = n >> 10 & 0x3F;
        int n3 = n >> 7 & 0x7;
        int n4 = n & 0xE19229EB;
        final int n5 = b4 & 0xFF;
        if (-1 != b) {
            n2 += n5 * (b - n2) >> 7;
        }
        if (-1 != b2) {
            n3 += (b2 - n3) * n5 >> 7;
        }
        if (b3 != -1) {
            n4 += n5 * (b3 - n4) >> 7;
        }
        return (n2 << 10 | n3 << 7 | n4) & 0xFFFF;
    }
    
    public static void ic(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, final int n10, final int n11, final int n12) {
        BoundaryObject.method1379(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, -428480375);
    }
    
    public static void ve(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, final int n10) {
        class144.method825(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, -515253774);
    }
    
    public static void lv(final int n, final int n2, final int n3, final int n4, final int n5) {
        Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, n3, n4, n5);
    }
    
    abstract void by(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9, final int p10, final int p11);
    
    abstract void bx(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9, final int p10, final int p11, final int p12, final int p13, final int p14, final int p15, final int p16, final int p17, final int p18, final int p19, final int p20, final int p21);
    
    void ar(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, int vmethod3248, int vmethod3249, int vmethod3250, final byte b, final byte b2, final byte b3, final byte b4) {
        vmethod3248 = class161.vmethod3248(vmethod3248, b, b2, b3, b4, (byte)(-103));
        vmethod3249 = class161.vmethod3248(vmethod3249, b, b2, b3, b4, (byte)(-15));
        vmethod3250 = class161.vmethod3248(vmethod3250, b, b2, b3, b4, (byte)(-53));
        this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, vmethod3248, vmethod3249, vmethod3250);
    }
    
    abstract void ap(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9, final int p10, final int p11);
    
    abstract void bd(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9, final int p10, final int p11, final int p12, final int p13, final int p14, final int p15, final int p16, final int p17, final int p18, final int p19, final int p20, final int p21);
    
    public static void cy(final class220 class220, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, int n10, final byte b, final byte b2, final byte b3, final byte b4, final int n11) {
        if (class220 == null) {
            class220.method1231(n, n, n, n, n, n, n7, n7, n7, n, b, b, b, b, n);
            return;
        }
        try {
            n10 = class220.field2004[class161.vmethod3248(n10, b, b2, b3, b4, (byte)(-39))];
            class220.be(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ii.au(" + ')');
        }
    }
    
    void method1223(final int[] array, final int n, final int n2, final float[] array2, final int n3) {
        try {
            ea(array, n, n2, array2);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ii.af(" + ')');
        }
    }
    
    abstract void vmethod1374(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9, final int p10, final int p11);
    
    abstract void vmethod1366(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9);
    
    static void method1233(final byte b) {
        try {
            class129.method763(24, (byte)82);
            class205.method1137(Strings.jr, Strings.jv, Strings.jh, 24926455);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ii.aj(" + ')');
        }
    }
    
    static final int ag(final int n, int n2) {
        n2 = (n & 0x7F) * n2 >> 7;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    public static void dg(final class220 class220, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, int vmethod3248, int vmethod3249, int vmethod3250, final byte b, final byte b2, final byte b3, final byte b4) {
        if (class220 == null) {
            class220.az(n, n, n, n, n, n, n7, n7, n7, n, b, b, b, b);
            return;
        }
        vmethod3248 = class161.vmethod3248(vmethod3248, b, b2, b3, b4, (byte)(-83));
        vmethod3249 = class161.vmethod3248(vmethod3249, b, b2, b3, b4, (byte)(-125));
        vmethod3250 = class161.vmethod3248(vmethod3250, b, b2, b3, b4, (byte)(-22));
        class220.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, vmethod3248, vmethod3249, vmethod3250);
    }
    
    abstract void bz(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9, final int p10, final int p11, final int p12, final int p13, final int p14, final int p15, final int p16, final int p17, final int p18, final int p19, final int p20, final int p21);
    
    public static void ej(final class220 class220, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, int n10, final byte b, final byte b2, final byte b3, final byte b4) {
        if (class220 == null) {
            class220.method1224(n, n, n, n, n, n, n7, n7, n7, n, n, n, b, b, b, b, b);
            return;
        }
        n10 = class220.field2004[class161.vmethod3248(n10, b, b2, b3, b4, (byte)(-123))];
        class220.be(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    public static void wf(final int n, final int n2, final int n3, final int n4) {
        Rasterizer2D.Rasterizer2D_drawHorizontalLine(n, n2, n3, n4);
    }
    
    public static void xd() {
        class18.method68(1601417771);
    }
    
    public static void yd(final int n, final int n2, final int n3, final int n4, final int n5) {
        Rasterizer2D.Rasterizer2D_drawLine(n, n2, n3, n4, n5);
    }
    
    abstract void bm(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9, final int p10, final int p11, final int p12, final int p13, final int p14, final int p15, final int p16, final int p17, final int p18, final int p19, final int p20, final int p21);
    
    abstract void bk(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6, final float p7, final float p8, final int p9);
    
    public static void rj(final class220 class220, final int[] array, final int n, final int n2, final float[] array2, final int n3) {
        if (class220 == null) {
            class220.method1223(array, n, n, array2, n);
        }
        try {
            ea(array, n, n2, array2);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ii.af(" + ')');
        }
    }
    
    static final int ah(final int n, int n2) {
        n2 = (n & 0x7F) * n2 >> 7;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0x63C0361C) + n2;
    }
    
    public static void vr(final class220 class220, final int[] array, final int n, final int n2, final float[] array2) {
        if (class220 == null) {
            class220.method1223(array, n, n, array2, n);
            return;
        }
        ea(array, n, n2, array2);
    }
}
