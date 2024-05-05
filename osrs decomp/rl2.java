import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.api.CollisionData;

// 
// Decompiled by Procyon v0.5.36
// 

public class rl2 implements Runnable
{
    public int[][] se;
    public int[] ti;
    public int[] kq;
    public int py;
    public NodeDeque oh;
    public byte[][][] mm;
    public EvictingDualNodeHashTable ay;
    public int[] ri;
    public int[][][] ee;
    public short[][][] nq;
    public int jk;
    public int[] dg;
    public boolean bq;
    public static final /* synthetic */ boolean dz;
    public byte[][][] dw;
    public int[] zq;
    public int[][][] bh;
    public int[] bm;
    public Scene iy;
    public EvictingDualNodeHashTable sa;
    public byte[][][] oo;
    public int uk;
    public byte[][][] go;
    public byte[][] jb;
    public CollisionMap[] se;
    public short[][][] nm;
    public int[] xk;
    public int[] fv;
    public int[][][] kw;
    public byte[][] en;
    public int[][] em;
    public int js;
    
    public rl2() {
        this.bh = new int[4][105][105];
        this.dw = new byte[4][105][105];
        this.em = new int[105][105];
        this.dg = new int[104];
        this.kq = new int[104];
        this.zq = new int[104];
        this.ri = new int[104];
        this.fv = new int[104];
        this.sa = EvictingDualNodeHashTable.nv(64);
        this.ay = EvictingDualNodeHashTable.nv(64);
        this.oh = NodeDeque.qz();
    }
    
    static {
        dz = !rl2.class.desiredAssertionStatus();
    }
    
    @Override
    public void run() {
        try {
            while (!this.oa()) {
                try {
                    Thread.sleep(20L);
                }
                catch (InterruptedException ex) {}
            }
        }
        catch (Throwable t) {
            dh("map loading", t);
            throw t;
        }
    }
    
    public FloorOverlayDefinition mt(final int n) {
        final FloorOverlayDefinition floorOverlayDefinition = (FloorOverlayDefinition)this.ay.get(n);
        if (floorOverlayDefinition != null) {
            return floorOverlayDefinition;
        }
        final byte[] loadData = Client.az[2].loadData(4, n);
        final FloorOverlayDefinition pe = this.pe();
        if (loadData != null) {
            pe.ef(Buffer.yp(loadData), n);
        }
        pe.ni();
        return pe;
    }
    
    public CollisionMap nf(final int n, final int n2) {
        return new CollisionMap(n, n2);
    }
    
    public FloorUnderlayDefinition gf(final int n) {
        final FloorUnderlayDefinition floorUnderlayDefinition = (FloorUnderlayDefinition)this.sa.get(n);
        if (floorUnderlayDefinition != null) {
            return floorUnderlayDefinition;
        }
        final byte[] loadData = Client.az[2].loadData(1, n);
        final FloorUnderlayDefinition ve = this.ve();
        if (loadData != null) {
            ve.uj(Buffer.yp(loadData), n);
        }
        ve.kb();
        this.sa.vq(ve, n);
        return ve;
    }
    
    public static void fk(final int n, final int n2, final int n3, final int n4) {
        class122.method727(n, n2, n3, n4, -1549240794);
    }
    
    public Scene sh(final int n, final int n2, final int n3, final int[][][] array) {
        return new Scene(n, n2, n3, array);
    }
    
    public FloorOverlayDefinition pe() {
        return new FloorOverlayDefinition();
    }
    
    public boolean oa() {
        final Archive archive = Client.az[5];
        int n = 0;
        for (int i = 0; i < this.en.length; ++i) {
            if (this.xk[i] != -1 && this.en[i] == null) {
                this.en[i] = archive.loadData(this.xk[i], 0);
                if (this.en[i] == null) {
                    ++n;
                }
            }
            if (this.ti[i] != -1 && this.jb[i] == null) {
                this.jb[i] = archive.tf(this.ti[i], 0, this.se[i]);
                if (this.jb[i] == null) {
                    ++n;
                }
            }
        }
        if (n > 0) {
            return false;
        }
        boolean b = true;
        for (int j = 0; j < this.en.length; ++j) {
            final byte[] array = this.jb[j];
            if (array != null) {
                int n2 = (this.bm[j] >> 8) * 64 - this.jk;
                int n3 = (this.bm[j] & 0xFF) * 64 - this.uk;
                if (this.bq) {
                    n2 = 10;
                    n3 = 10;
                }
                b &= ck(array, n2, n3);
            }
        }
        if (!b) {
            return false;
        }
        this.kw = new int[4][105][105];
        this.iy = this.sh(4, 104, 104, this.kw);
        this.iy.sg = false;
        this.se = new CollisionMap[4];
        for (int k = 0; k < 4; ++k) {
            this.se[k] = this.nf(104, 104);
        }
        this.oo = new byte[4][104][104];
        Tiles.Tiles_minPlane = 99 * -1087180359;
        this.nq = new short[4][104][104];
        this.nm = new short[4][104][104];
        this.go = new byte[4][104][104];
        this.mm = new byte[4][104][104];
        this.iy.wf = this.nq;
        this.iy.cb = this.nm;
        this.iy.sh = this.go;
        this.iy.wb = this.oo;
        this.iy.zc = this.jk;
        this.iy.iq = this.uk;
        this.iy.kp = this.bq;
        this.iy.om = this.ee;
        if (!this.bq) {
            for (int l = 0; l < this.en.length; ++l) {
                final byte[] array2 = this.en[l];
                if (array2 != null) {
                    final int n4 = this.bm[l];
                    final int n5 = (n4 >> 8 << 6) - this.jk;
                    final int n6 = ((n4 & 0xFF) << 6) - this.uk;
                    if (!rl2.dz && this.js * 8 - 48 != this.jk) {
                        throw new AssertionError();
                    }
                    if (!rl2.dz && this.py * 8 - 48 != this.uk) {
                        throw new AssertionError();
                    }
                    xq(array2, n5, n6, this.jk, this.uk, this.se);
                }
            }
            for (int n7 = 0; n7 < this.en.length; ++n7) {
                if (this.en[n7] == null && this.py < 800) {
                    final int n8 = this.bm[n7];
                    fk((n8 >> 8 << 6) - this.jk, ((n8 & 0xFF) << 6) - this.uk, 64, 64);
                }
            }
            for (int n9 = 0; n9 < this.en.length; ++n9) {
                final byte[] array3 = this.jb[n9];
                if (array3 != null) {
                    final int n10 = this.bm[n9];
                    jl(array3, (n10 >> 8 << 6) - this.jk, ((n10 & 0xFF) << 6) - this.uk, (net.runelite.api.Scene)this.iy, (CollisionData[])this.se);
                }
            }
        }
        else {
            for (int n11 = 0; n11 < 4; ++n11) {
                for (int n12 = 0; n12 < 13; ++n12) {
                    for (int n13 = 0; n13 < 13; ++n13) {
                        boolean b2 = false;
                        final int n14 = this.ee[n11][n12][n13];
                        if (n14 != -1) {
                            final int n15 = n14 >> 24 & 0x3;
                            final int n16 = n14 >> 1 & 0x3;
                            final int n17 = n14 >> 14 & 0x3FF;
                            final int n18 = n14 >> 3 & 0x7FF;
                            final int n19 = (n17 / 8 << 8) + n18 / 8;
                            for (int n20 = 0; n20 < this.bm.length; ++n20) {
                                if (this.bm[n20] == n19 && this.en[n20] != null) {
                                    qi(this.en[n20], n11, n12 * 8, n13 * 8, n15, (n17 & 0x7) * 8, (n18 & 0x7) * 8, n16, (n17 - n12) * 8, (n18 - n13) * 8, (CollisionData[])this.se);
                                    b2 = true;
                                    break;
                                }
                            }
                        }
                        if (!b2) {
                            nj(n11, n12 * 8, n13 * 8);
                        }
                    }
                }
            }
            for (int n21 = 0; n21 < 13; ++n21) {
                for (int n22 = 0; n22 < 13; ++n22) {
                    if (this.ee[0][n21][n22] == -1) {
                        fk(n21 * 8, n22 * 8, 8, 8);
                    }
                }
            }
            for (int n23 = 0; n23 < 4; ++n23) {
                for (int n24 = 0; n24 < 13; ++n24) {
                    for (int n25 = 0; n25 < 13; ++n25) {
                        final int n26 = this.ee[n23][n24][n25];
                        if (n26 != -1) {
                            final int n27 = n26 >> 24 & 0x3;
                            final int n28 = n26 >> 1 & 0x3;
                            final int n29 = n26 >> 14 & 0x3FF;
                            final int n30 = n26 >> 3 & 0x7FF;
                            final int n31 = (n29 / 8 << 8) + n30 / 8;
                            for (int n32 = 0; n32 < this.bm.length; ++n32) {
                                if (this.bm[n32] == n31 && this.jb[n32] != null) {
                                    lu(this.jb[n32], n23, n24 * 8, n25 * 8, n27, (n29 & 0x7) * 8, (n30 & 0x7) * 8, n28, (net.runelite.api.Scene)this.iy, (CollisionData[])this.se);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.jt();
        if (Client.isLowDetail) {
            this.iy.tg(Tiles.Tiles_minPlane * 1401144457);
        }
        else {
            this.iy.tg(0);
        }
        synchronized (ObjectComposition.ObjectDefinition_cachedModelData) {
            ObjectComposition.ObjectDefinition_cachedModelData.reset();
        }
        ObjectComposition.ObjectDefinition_cachedEntities.reset();
        if (!this.bq) {
            final int n33 = (this.js - 6) / 8;
            final int n34 = (this.js + 6) / 8;
            final int n35 = (this.py - 6) / 8;
            final int n36 = (this.py + 6) / 8;
            for (int n37 = n33 - 1; n37 <= n34 + 1; ++n37) {
                for (int n38 = n35 - 1; n38 <= n36 + 1; ++n38) {
                    if (n37 < n33 || n37 > n34 || n38 < n35 || n38 > n36) {
                        archive.is("m" + n37 + "_" + n38);
                        archive.is("l" + n37 + "_" + n38);
                    }
                }
            }
        }
        final DrawCallbacks rz = Client.rz;
        if (rz != null) {
            rz.loadScene((net.runelite.api.Scene)this.iy);
        }
        return true;
    }
    
    public static boolean ck(final byte[] array, final int n, final int n2) {
        return KitDefinition.getKitDefinitionModels(array, n, n2, -1749443577);
    }
    
    public static void dh(final String s, final Throwable t) {
        class387.RunException_sendStackTrace(s, t, (byte)8);
    }
    
    public static int ro(final int n, int n2) {
        if (n == -1) {
            return 12345678;
        }
        n2 = (n & 0x7F) * n2 / 128;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    public FloorUnderlayDefinition ve() {
        return new FloorUnderlayDefinition();
    }
    
    public static void qi(final byte[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final CollisionData[] array2) {
        class19.method78(array, n, n2, n3, n4, n5, n6, n7, n8, n9, (CollisionMap[])array2, 146668751);
    }
    
    public static void nj(final int n, final int n2, final int n3) {
        TextureProvider.isLowDetail(n, n2, n3, 2117448791);
    }
    
    public static int vp(final int n, int n2) {
        if (n == -2) {
            return 12345678;
        }
        if (n == -1) {
            if (n2 < 2) {
                n2 = 2;
            }
            else if (n2 > 126) {
                n2 = 126;
            }
            return n2;
        }
        n2 = (n & 0x7F) * n2 / 128;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    public static void xq(final byte[] array, final int n, final int n2, final int n3, final int n4, final CollisionMap[] array2) {
        WallDecoration.method1385(array, n, n2, n3, n4, array2, 960745047);
    }
    
    public static int xz(final int n, int n2, final int n3) {
        if (n3 > 179) {
            n2 /= 2;
        }
        if (n3 > 192) {
            n2 /= 2;
        }
        if (n3 > 217) {
            n2 /= 2;
        }
        if (n3 > 243) {
            n2 /= 2;
        }
        return (n2 / 32 << 7) + (n / 4 << 10) + n3 / 2;
    }
    
    public static void jl(final byte[] array, final int n, final int n2, final net.runelite.api.Scene scene, final CollisionData[] array2) {
        class147.method837(array, n, n2, (Scene)scene, (CollisionMap[])array2, 1108782763);
    }
    
    public void jt() {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 104; ++j) {
                for (int k = 0; k < 104; ++k) {
                    if ((this.oo[i][j][k] & 0x1) == 0x1) {
                        int n = i;
                        if ((this.oo[1][j][k] & 0x2) == 0x2) {
                            n = i - 1;
                        }
                        if (n >= 0) {
                            this.se[n].dh(j, k);
                        }
                    }
                }
            }
        }
        final int n2 = (int)Math.sqrt(5100.0) * 768 >> 8;
        for (int l = 0; l < 4; ++l) {
            final byte[][] array = this.dw[l];
            for (int n3 = 1; n3 < 103; ++n3) {
                for (int n4 = 1; n4 < 103; ++n4) {
                    final int n5 = this.kw[l][n4 + 1][n3] - this.kw[l][n4 - 1][n3];
                    final int n6 = this.kw[l][n4][n3 + 1] - this.kw[l][n4][n3 - 1];
                    final int n7 = (int)Math.sqrt(n6 * n6 + n5 * n5 + 65536);
                    this.em[n4][n3] = ((n6 << 8) / n7 * -50 + (n5 << 8) / n7 * -50 + 65536 / n7 * -10) / n2 + 96 - ((array[n4][n3 + 1] >> 3) + (array[n4 - 1][n3] >> 2) + (array[n4][n3 - 1] >> 2) + (array[n4 + 1][n3] >> 3) + (array[n4][n3] >> 1));
                }
            }
            for (int n8 = 0; n8 < 104; ++n8) {
                this.dg[n8] = 0;
                this.kq[n8] = 0;
                this.zq[n8] = 0;
                this.ri[n8] = 0;
                this.fv[n8] = 0;
            }
            for (int n9 = -5; n9 < 109; ++n9) {
                for (int n10 = 0; n10 < 104; ++n10) {
                    final int n11 = n9 + 5;
                    if (n11 >= 0 && n11 < 104) {
                        final int n12 = this.nq[l][n11][n10] & 0x7FFF;
                        if (n12 > 0) {
                            final FloorUnderlayDefinition gf = this.gf(n12 - 1);
                            final int[] dg = this.dg;
                            final int n13 = n10;
                            dg[n13] += class1.vc(gf);
                            final int[] kq = this.kq;
                            final int n14 = n10;
                            kq[n14] += gf.jo();
                            final int[] zq = this.zq;
                            final int n15 = n10;
                            zq[n15] += gf.um();
                            final int[] ri = this.ri;
                            final int n16 = n10;
                            ri[n16] += gf.bt();
                            final int[] fv = this.fv;
                            final int n17 = n10;
                            ++fv[n17];
                        }
                    }
                    final int n18 = n9 - 5;
                    if (n18 >= 0 && n18 < 104) {
                        final int n19 = this.nq[l][n18][n10] & 0x7FFF;
                        if (n19 > 0) {
                            final FloorUnderlayDefinition gf2 = this.gf(n19 - 1);
                            final int[] dg2 = this.dg;
                            final int n20 = n10;
                            dg2[n20] -= class1.vc(gf2);
                            final int[] kq2 = this.kq;
                            final int n21 = n10;
                            kq2[n21] -= gf2.jo();
                            final int[] zq2 = this.zq;
                            final int n22 = n10;
                            zq2[n22] -= gf2.um();
                            final int[] ri2 = this.ri;
                            final int n23 = n10;
                            ri2[n23] -= gf2.bt();
                            final int[] fv2 = this.fv;
                            final int n24 = n10;
                            --fv2[n24];
                        }
                    }
                }
                if (n9 >= 1 && n9 < 103) {
                    int n25 = 0;
                    int n26 = 0;
                    int n27 = 0;
                    int n28 = 0;
                    int n29 = 0;
                    for (int n30 = -5; n30 < 109; ++n30) {
                        final int n31 = n30 + 5;
                        if (n31 >= 0 && n31 < 104) {
                            n25 += this.dg[n31];
                            n26 += this.kq[n31];
                            n27 += this.zq[n31];
                            n28 += this.ri[n31];
                            n29 += this.fv[n31];
                        }
                        final int n32 = n30 - 5;
                        if (n32 >= 0 && n32 < 104) {
                            n25 -= this.dg[n32];
                            n26 -= this.kq[n32];
                            n27 -= this.zq[n32];
                            n28 -= this.ri[n32];
                            n29 -= this.fv[n32];
                        }
                        if (n30 >= 1 && n30 < 103 && (!Client.isLowDetail || (this.oo[0][n9][n30] & 0x2) != 0x0 || (this.oo[l][n9][n30] & 0x10) == 0x0)) {
                            if (l < Tiles.Tiles_minPlane * 1401144457) {
                                Tiles.Tiles_minPlane = l * -1087180359;
                            }
                            final int n33 = this.nq[l][n9][n30] & 0x7FFF;
                            final int n34 = this.nm[l][n9][n30] & 0x7FFF;
                            if (n33 > 0 || n34 > 0) {
                                final int n35 = this.kw[l][n9][n30];
                                final int n36 = this.kw[l][n9 + 1][n30];
                                final int n37 = this.kw[l][n9 + 1][n30 + 1];
                                final int n38 = this.kw[l][n9][n30 + 1];
                                final int n39 = this.em[n9][n30];
                                final int n40 = this.em[n9 + 1][n30];
                                final int n41 = this.em[n9 + 1][n30 + 1];
                                final int n42 = this.em[n9][n30 + 1];
                                int n43 = -1;
                                int xz = -1;
                                if (n33 > 0) {
                                    n43 = (xz = xz(n25 * 256 / n28, n26 / n29, n27 / n29));
                                }
                                int n44 = 0;
                                if (xz != -1) {
                                    n44 = Rasterizer3D.Rasterizer3D_colorPalette[ro(xz, 96)];
                                }
                                if (n34 == 0) {
                                    this.iy.qg(l, n9, n30, 0, 0, -1, n35, n36, n37, n38, ro(n43, n39), ro(n43, n40), ro(n43, n41), ro(n43, n42), 0, 0, 0, 0, n44, 0);
                                }
                                else {
                                    final int n45 = this.go[l][n9][n30] + 1;
                                    final byte b = this.mm[l][n9][n30];
                                    final FloorOverlayDefinition mt = this.mt(n34 - 1);
                                    int hb = mt.hb();
                                    int n46;
                                    int n47;
                                    if (hb >= 0) {
                                        n46 = class7.textureProvider.getDefaultColor(hb);
                                        n47 = -1;
                                    }
                                    else if (mt.ue() == 16711935) {
                                        n47 = -2;
                                        hb = -1;
                                        n46 = -2;
                                    }
                                    else {
                                        n47 = (n46 = xz(mt.ab(), mt.jo(), mt.vi()));
                                    }
                                    int n48 = 0;
                                    if (n46 != -2) {
                                        n48 = Rasterizer3D.Rasterizer3D_colorPalette[vp(n46, 96)];
                                    }
                                    if (mt.vj() != -1) {
                                        n48 = Rasterizer3D.Rasterizer3D_colorPalette[vp(xz(mt.lg(), mt.pp(), mt.um()), 96)];
                                    }
                                    this.iy.qg(l, n9, n30, n45, b, hb, n35, n36, n37, n38, ro(n43, n39), ro(n43, n40), ro(n43, n41), ro(n43, n42), vp(n47, n39), vp(n47, n40), vp(n47, n41), vp(n47, n42), n44, n48);
                                }
                            }
                        }
                    }
                }
            }
            for (int n49 = 1; n49 < 103; ++n49) {
                for (int n50 = 1; n50 < 103; ++n50) {
                    this.iy.qo(l, n50, n49, ((this.oo[l][n50][n49] & 0x8) != 0x0) ? 0 : ((l > 0 && (this.oo[1][n50][n49] & 0x2) != 0x0) ? (l - 1) : l));
                }
            }
        }
        this.iy.removeGameObject(-50, -10, -50);
        for (int n51 = 0; n51 < 104; ++n51) {
            for (int n52 = 0; n52 < 104; ++n52) {
                if ((this.oo[1][n51][n52] & 0x2) == 0x2) {
                    this.iy.py(n51, n52);
                }
            }
        }
    }
    
    public static void lu(final byte[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final net.runelite.api.Scene scene, final CollisionData[] array2) {
        Tiles.method473(array, n, n2, n3, n4, n5, n6, n7, (Scene)scene, (CollisionMap[])array2);
    }
}
