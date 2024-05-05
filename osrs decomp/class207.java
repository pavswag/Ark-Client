import java.util.Arrays;

// 
// Decompiled by Procyon v0.5.36
// 

public class class207 implements class29
{
    public int[] field1856;
    int field1860;
    boolean[] field1865;
    public static final String kt = "";
    int[] field1859;
    int field1862;
    char[] field1861;
    public static final int bn = 62;
    int field1869;
    boolean[] field1858;
    int[] field1864;
    boolean[] field1863;
    public char field1866;
    public int field1867;
    public int pressedKeysCount;
    int field1857;
    static final int rz = 100;
    
    public class207() {
        this.field1861 = new char[128];
        this.field1864 = new int[128];
        this.field1856 = new int[128];
        this.pressedKeysCount = 0;
        this.field1859 = new int[128];
        this.field1862 = 0;
        this.field1860 = 0;
        this.field1857 = 0;
        this.field1869 = 0;
        this.field1858 = new boolean[112];
        this.field1865 = new boolean[112];
        this.field1863 = new boolean[112];
    }
    
    public final boolean ad() {
        if (-147657295 * this.field1869 == this.field1860 * 73809669) {
            return false;
        }
        this.field1867 = -2050262723 * this.field1864[73809669 * this.field1860];
        this.field1866 = this.field1861[73809669 * this.field1860];
        this.field1860 = -1675774515 * (1 + 73809669 * this.field1860 & 0x7F);
        return true;
    }
    
    public final boolean ae() {
        if (-147657295 * this.field1869 == this.field1860 * 73809669) {
            return false;
        }
        this.field1867 = -2050262723 * this.field1864[73809669 * this.field1860];
        this.field1866 = this.field1861[73809669 * this.field1860];
        this.field1860 = -1675774515 * (1 + 73809669 * this.field1860 & 0x7F);
        return true;
    }
    
    static final void PcmStream_disable(final PcmStream pcmStream, final int n) {
        try {
            pcmStream.active = false;
            if (null != pcmStream.sound) {
                if (n <= -1089860964) {
                    throw new IllegalStateException();
                }
                pcmStream.sound.position = 0;
            }
            for (PcmStream pcmStream2 = pcmStream.firstSubStream(); pcmStream2 != null; pcmStream2 = pcmStream.nextSubStream()) {
                if (n <= -1089860964) {
                    throw new IllegalStateException();
                }
                PcmStream_disable(pcmStream2, 401365532);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.bb(" + ')');
        }
    }
    
    public boolean PcmStream_disable(final int n) {
        return n >= 0 && n < 112 && this.field1865[n];
    }
    
    public static boolean da(final class207 class207, final int n) {
        if (class207 == null) {
            class207.ae();
        }
        return n >= 0 && n < 112 && class207.field1863[n];
    }
    
    static final void method1162(final int n) {
        try {
            final int n2 = -2010934433 * Players.Players_count;
            final int[] players_indices = Players.Players_indices;
            for (int i = 0; i < n2; ++i) {
                if (n >= -964267539) {
                    return;
                }
                final Player player = Client.players[players_indices[i]];
                if (player != null) {
                    if (n >= -964267539) {
                        throw new IllegalStateException();
                    }
                    ReflectionCheck.updateActorSequence(player, 1, (byte)(-110));
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.in(" + ')');
        }
    }
    
    @Override
    public boolean ao(final boolean b) {
        return false;
    }
    
    public static boolean mt(final class207 class207, final int n) {
        if (class207 == null) {
            return class207.method1154(n);
        }
        try {
            if (-147657295 * class207.field1869 != class207.field1860 * 73809669) {
                class207.field1867 = -2050262723 * class207.field1864[73809669 * class207.field1860];
                class207.field1866 = class207.field1861[73809669 * class207.field1860];
                class207.field1860 = -1675774515 * (1 + 73809669 * class207.field1860 & 0x7F);
                return true;
            }
            if (n <= 289925105) {
                throw new IllegalStateException();
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.ag(" + ')');
        }
    }
    
    @Override
    public boolean at(final char c) {
        final int n = 1 + this.field1857 * -1384260729 & 0x7F;
        if (n != this.field1860 * 73809669) {
            this.field1864[-1384260729 * this.field1857] = -1;
            this.field1861[-1384260729 * this.field1857] = c;
            this.field1857 = -1899169225 * n;
        }
        return false;
    }
    
    public void ak() {
        this.field1860 = this.field1869 * 56532349;
        this.field1869 = this.field1857 * 1600354243;
        this.pressedKeysCount = 0;
        this.field1862 = 0;
        Arrays.fill(this.field1865, false);
        Arrays.fill(this.field1863, false);
    }
    
    public boolean getKeyPressed(final int n, final int n2) {
        try {
            if (n >= 0) {
                if (n2 >= 1163786688) {
                    throw new IllegalStateException();
                }
                if (n < 112) {
                    return this.field1858[n];
                }
                if (n2 >= 1163786688) {
                    throw new IllegalStateException();
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.av(" + ')');
        }
    }
    
    public boolean be(final int n) {
        return n >= 0 && n < -655682410 && this.field1863[n];
    }
    
    public int[] method1152(final int n) {
        try {
            final int[] array = new int[2082731989 * this.field1862];
            for (int i = 0; i < this.field1862 * 2082731989; ++i) {
                if (n <= -84614457) {
                    throw new IllegalStateException();
                }
                array[i] = this.field1859[i];
            }
            return array;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.as(" + ')');
        }
    }
    
    public void az() {
        this.field1860 = this.field1869 * -1092387907;
        this.field1869 = this.field1857 * -206073161;
        this.pressedKeysCount = 0;
        this.field1862 = 0;
        Arrays.fill(this.field1865, false);
        Arrays.fill(this.field1863, false);
    }
    
    void method1149(final int n, final byte b) {
        try {
            final int n2 = -1384260729 * this.field1869 + 1 & 0x7F;
            if (n2 != 73809669 * this.field1860) {
                if (b >= 55) {
                    return;
                }
                this.field1864[this.field1862 * -1384260729] = n;
                this.field1861[-1384260729 * this.field1860] = '\0';
                this.field1869 = n2 * -1899169225;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.ax(" + ')');
        }
    }
    
    public boolean addObjects(final boolean b) {
        return false;
    }
    
    static final void addObjects(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Scene scene, final CollisionMap collisionMap, final int n7) {
        Client.kq(n, n2, n3, n4, n5, n6, scene, collisionMap);
        try {
            if (Client.isLowDetail) {
                if (n7 >= 480760824) {
                    throw new IllegalStateException();
                }
                if (0x0 == (Client.gk.oo[0][n2][n3] & 0x2) && (Client.gk.oo[n][n2][n3] & 0x10) != 0x0) {
                    if (n7 >= 480760824) {
                        throw new IllegalStateException();
                    }
                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                    return;
                }
            }
            if (n < 1401144457 * Tiles.Tiles_minPlane) {
                if (n7 >= 480760824) {
                    throw new IllegalStateException();
                }
                Tiles.Tiles_minPlane = -1087180359 * n;
            }
            final ObjectComposition vmethod3248 = class144.vmethod3248(n4, (short)25436);
            int n8 = 0;
            int n9 = 0;
            Label_0270: {
                if (n5 != 1) {
                    if (n7 >= 480760824) {
                        throw new IllegalStateException();
                    }
                    if (n5 != 3) {
                        n8 = vmethod3248.sizeX * -1339930361;
                        n9 = -1659393955 * vmethod3248.sizeY;
                        break Label_0270;
                    }
                    if (n7 >= 480760824) {
                        throw new IllegalStateException();
                    }
                }
                n8 = -1659393955 * vmethod3248.sizeY;
                n9 = -1339930361 * vmethod3248.sizeX;
            }
            int n10;
            int n11;
            if (n2 + n8 <= 104) {
                if (n7 >= 480760824) {
                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                    return;
                }
                n10 = n2 + (n8 >> 1);
                n11 = (1 + n8 >> 1) + n2;
            }
            else {
                n10 = n2;
                n11 = 1 + n2;
            }
            int n12;
            int n13;
            if (n9 + n3 <= 104) {
                if (n7 >= 480760824) {
                    throw new IllegalStateException();
                }
                n12 = n3 + (n9 >> 1);
                n13 = (1 + n9 >> 1) + n3;
            }
            else {
                n12 = n3;
                n13 = 1 + n3;
            }
            final int[][] array = Client.gk.kw[n];
            final int n14 = array[n11][n13] + (array[n10][n13] + (array[n10][n12] + array[n11][n12])) >> 2;
            final int n15 = (n8 << 6) + (n2 << 7);
            final int n16 = (n3 << 7) + (n9 << 6);
            final int n17 = 2;
            boolean b;
            if (0 == 415653149 * vmethod3248.int1) {
                if (n7 >= 480760824) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            final long calculateTag = FaceNormal.calculateTag(n2, n3, n17, b, n4, 1998456330);
            int n18 = n6 + (n5 << 6);
            if (-1850643527 * vmethod3248.int3 == 1) {
                n18 += 256;
            }
            if (vmethod3248.hasSound(-1940318911)) {
                if (n7 >= 480760824) {
                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                    return;
                }
                GameEngine.method189(n, n2, n3, vmethod3248, n5, (byte)(-47));
            }
            if (22 != n6) {
                if (10 != n6) {
                    if (n7 >= 480760824) {
                        throw new IllegalStateException();
                    }
                    if (n6 == 11) {
                        if (n7 >= 480760824) {
                            throw new IllegalStateException();
                        }
                    }
                    else if (n6 >= 12) {
                        if (n7 >= 480760824) {
                            throw new IllegalStateException();
                        }
                        Renderable entity = null;
                        Label_1721: {
                            if (vmethod3248.animationId * 1292954189 == -1) {
                                if (n7 >= 480760824) {
                                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                    return;
                                }
                                if (null == vmethod3248.soundEffectIds) {
                                    if (n7 >= 480760824) {
                                        throw new IllegalStateException();
                                    }
                                    entity = vmethod3248.getEntity(n6, n5, array, n15, n14, n16, (byte)(-110));
                                    break Label_1721;
                                }
                            }
                            entity = new DynamicObject(n4, n6, n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                        }
                        scene.method1288(n, n2, n3, n14, 1, 1, entity, 0, calculateTag, n18);
                        if (n6 >= 12) {
                            if (n7 >= 480760824) {
                                throw new IllegalStateException();
                            }
                            if (n6 <= 17) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                if (n6 != 13) {
                                    if (n7 >= 480760824) {
                                        throw new IllegalStateException();
                                    }
                                    if (n > 0) {
                                        final int[] array2 = Client.gk.bh[n][n2];
                                        array2[n3] |= 0x924;
                                    }
                                }
                            }
                        }
                        if (0 != vmethod3248.interactType * -973955889) {
                            if (n7 >= 480760824) {
                                Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                return;
                            }
                            if (null != collisionMap) {
                                CollisionMap.wa(collisionMap, n2, n3, n8, n9, vmethod3248.boolean1, (byte)(-123));
                            }
                        }
                        Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                        return;
                    }
                    else if (n6 == 0) {
                        if (n7 >= 480760824) {
                            throw new IllegalStateException();
                        }
                        Renderable entity2 = null;
                        Label_2070: {
                            if (-1 == vmethod3248.animationId * 1292954189) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                if (vmethod3248.soundEffectIds == null) {
                                    entity2 = vmethod3248.getEntity(0, n5, array, n15, n14, n16, (byte)(-17));
                                    break Label_2070;
                                }
                            }
                            entity2 = new DynamicObject(n4, 0, n5, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
                        }
                        scene.newBoundaryObject(n, n2, n3, n14, entity2, null, Tiles.field820[n5], 0, calculateTag, n18);
                        if (0 == n5) {
                            if (n7 >= 480760824) {
                                throw new IllegalStateException();
                            }
                            if (vmethod3248.clipped) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                Client.gk.dw[n][n2][n3] = 50;
                                Client.gk.dw[n][n2][n3 + 1] = 50;
                            }
                            if (vmethod3248.modelClipped) {
                                if (n7 >= 480760824) {
                                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                    return;
                                }
                                final int[] array3 = Client.gk.bh[n][n2];
                                array3[n3] |= 0x249;
                            }
                        }
                        else if (1 == n5) {
                            if (n7 >= 480760824) {
                                Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                return;
                            }
                            if (vmethod3248.clipped) {
                                if (n7 >= 480760824) {
                                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                    return;
                                }
                                Client.gk.dw[n][n2][1 + n3] = 50;
                                Client.gk.dw[n][n2 + 1][1 + n3] = 50;
                            }
                            if (vmethod3248.modelClipped) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                final int[] array4 = Client.gk.bh[n][n2];
                                final int n19 = 1 + n3;
                                array4[n19] |= 0x492;
                            }
                        }
                        else if (2 == n5) {
                            if (n7 >= 480760824) {
                                Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                return;
                            }
                            if (vmethod3248.clipped) {
                                if (n7 >= 480760824) {
                                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                    return;
                                }
                                Client.gk.dw[n][1 + n2][n3] = 50;
                                Client.gk.dw[n][1 + n2][1 + n3] = 50;
                            }
                            if (vmethod3248.modelClipped) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                final int[] array5 = Client.gk.bh[n][1 + n2];
                                array5[n3] |= 0x249;
                            }
                        }
                        else if (3 == n5) {
                            if (vmethod3248.clipped) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                Client.gk.dw[n][n2][n3] = 50;
                                Client.gk.dw[n][n2 + 1][n3] = 50;
                            }
                            if (vmethod3248.modelClipped) {
                                if (n7 >= 480760824) {
                                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                    return;
                                }
                                final int[] array6 = Client.gk.bh[n][n2];
                                array6[n3] |= 0x492;
                            }
                        }
                        if (vmethod3248.interactType * -973955889 != 0) {
                            if (n7 >= 480760824) {
                                Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                return;
                            }
                            if (null != collisionMap) {
                                if (n7 >= 480760824) {
                                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                    return;
                                }
                                collisionMap.method1163(n2, n3, n6, n5, vmethod3248.boolean1, -2067452311);
                            }
                        }
                        if (16 != -89408815 * vmethod3248.int2) {
                            if (n7 >= 480760824) {
                                Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                return;
                            }
                            scene.method1262(n, n2, n3, -89408815 * vmethod3248.int2);
                        }
                        Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                        return;
                    }
                    else if (n6 == 1) {
                        if (n7 >= 480760824) {
                            Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                            return;
                        }
                        Renderable entity3;
                        if (1292954189 * vmethod3248.animationId == -1 && vmethod3248.soundEffectIds == null) {
                            if (n7 >= 480760824) {
                                throw new IllegalStateException();
                            }
                            entity3 = vmethod3248.getEntity(1, n5, array, n15, n14, n16, (byte)(-60));
                        }
                        else {
                            entity3 = new DynamicObject(n4, 1, n5, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
                        }
                        scene.newBoundaryObject(n, n2, n3, n14, entity3, null, Tiles.field829[n5], 0, calculateTag, n18);
                        if (vmethod3248.clipped) {
                            if (n7 >= 480760824) {
                                throw new IllegalStateException();
                            }
                            if (n5 == 0) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                Client.gk.dw[n][n2][n3 + 1] = 50;
                            }
                            else if (1 == n5) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                Client.gk.dw[n][n2 + 1][1 + n3] = 50;
                            }
                            else if (2 == n5) {
                                if (n7 >= 480760824) {
                                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                    return;
                                }
                                Client.gk.dw[n][n2 + 1][n3] = 50;
                            }
                            else if (n5 == 3) {
                                Client.gk.dw[n][n2][n3] = 50;
                            }
                        }
                        if (-973955889 * vmethod3248.interactType != 0) {
                            if (n7 >= 480760824) {
                                Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                return;
                            }
                            if (collisionMap != null) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                collisionMap.method1163(n2, n3, n6, n5, vmethod3248.boolean1, -2067452311);
                            }
                        }
                        Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                        return;
                    }
                    else if (n6 == 2) {
                        if (n7 >= 480760824) {
                            throw new IllegalStateException();
                        }
                        final int n20 = 1 + n5 & 0x3;
                        Renderable entity4 = null;
                        Renderable entity5 = null;
                        Label_3214: {
                            if (1292954189 * vmethod3248.animationId == -1) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                if (null == vmethod3248.soundEffectIds) {
                                    if (n7 >= 480760824) {
                                        throw new IllegalStateException();
                                    }
                                    entity4 = vmethod3248.getEntity(2, n5 + 4, array, n15, n14, n16, (byte)(-33));
                                    entity5 = vmethod3248.getEntity(2, n20, array, n15, n14, n16, (byte)(-89));
                                    break Label_3214;
                                }
                            }
                            entity4 = new DynamicObject(n4, 2, 4 + n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                            entity5 = new DynamicObject(n4, 2, n20, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
                        }
                        scene.newBoundaryObject(n, n2, n3, n14, entity4, entity5, Tiles.field820[n5], Tiles.field820[n20], calculateTag, n18);
                        if (vmethod3248.modelClipped) {
                            if (n7 >= 480760824) {
                                throw new IllegalStateException();
                            }
                            if (n5 == 0) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                final int[] array7 = Client.gk.bh[n][n2];
                                array7[n3] |= 0x249;
                                final int[] array8 = Client.gk.bh[n][n2];
                                final int n21 = n3 + 1;
                                array8[n21] |= 0x492;
                            }
                            else if (1 == n5) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                final int[] array9 = Client.gk.bh[n][n2];
                                final int n22 = 1 + n3;
                                array9[n22] |= 0x492;
                                final int[] array10 = Client.gk.bh[n][1 + n2];
                                array10[n3] |= 0x249;
                            }
                            else if (n5 == 2) {
                                final int[] array11 = Client.gk.bh[n][n2 + 1];
                                array11[n3] |= 0x249;
                                final int[] array12 = Client.gk.bh[n][n2];
                                array12[n3] |= 0x492;
                            }
                            else if (n5 == 3) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                final int[] array13 = Client.gk.bh[n][n2];
                                array13[n3] |= 0x492;
                                final int[] array14 = Client.gk.bh[n][n2];
                                array14[n3] |= 0x249;
                            }
                        }
                        if (vmethod3248.interactType * -973955889 != 0) {
                            if (n7 >= 480760824) {
                                throw new IllegalStateException();
                            }
                            if (null != collisionMap) {
                                if (n7 >= 480760824) {
                                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                    return;
                                }
                                collisionMap.method1163(n2, n3, n6, n5, vmethod3248.boolean1, -2067452311);
                            }
                        }
                        if (16 != vmethod3248.int2 * -89408815) {
                            if (n7 >= 480760824) {
                                throw new IllegalStateException();
                            }
                            scene.method1262(n, n2, n3, vmethod3248.int2 * -89408815);
                        }
                        Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                        return;
                    }
                    else if (n6 == 3) {
                        if (n7 >= 480760824) {
                            throw new IllegalStateException();
                        }
                        Renderable entity6 = null;
                        Label_3711: {
                            if (-1 == 1292954189 * vmethod3248.animationId) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                if (vmethod3248.soundEffectIds == null) {
                                    entity6 = vmethod3248.getEntity(3, n5, array, n15, n14, n16, (byte)(-78));
                                    break Label_3711;
                                }
                            }
                            entity6 = new DynamicObject(n4, 3, n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                        }
                        scene.newBoundaryObject(n, n2, n3, n14, entity6, null, Tiles.field829[n5], 0, calculateTag, n18);
                        if (vmethod3248.clipped) {
                            if (n7 >= 480760824) {
                                Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                return;
                            }
                            if (0 == n5) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                Client.gk.dw[n][n2][1 + n3] = 50;
                            }
                            else if (1 == n5) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                Client.gk.dw[n][n2 + 1][n3 + 1] = 50;
                            }
                            else if (2 == n5) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                Client.gk.dw[n][n2 + 1][n3] = 50;
                            }
                            else if (n5 == 3) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                Client.gk.dw[n][n2][n3] = 50;
                            }
                        }
                        if (0 != vmethod3248.interactType * -973955889) {
                            if (n7 >= 480760824) {
                                throw new IllegalStateException();
                            }
                            if (null != collisionMap) {
                                collisionMap.method1163(n2, n3, n6, n5, vmethod3248.boolean1, -2067452311);
                            }
                        }
                        Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                        return;
                    }
                    else {
                        if (9 == n6) {
                            Renderable entity7 = null;
                            Label_4085: {
                                if (-1 == vmethod3248.animationId * 1292954189) {
                                    if (n7 >= 480760824) {
                                        throw new IllegalStateException();
                                    }
                                    if (vmethod3248.soundEffectIds == null) {
                                        if (n7 >= 480760824) {
                                            Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                            return;
                                        }
                                        entity7 = vmethod3248.getEntity(n6, n5, array, n15, n14, n16, (byte)(-96));
                                        break Label_4085;
                                    }
                                }
                                entity7 = new DynamicObject(n4, n6, n5, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
                            }
                            scene.method1288(n, n2, n3, n14, 1, 1, entity7, 0, calculateTag, n18);
                            if (vmethod3248.interactType * -973955889 != 0) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                if (collisionMap != null) {
                                    if (n7 >= 480760824) {
                                        Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                        return;
                                    }
                                    CollisionMap.wa(collisionMap, n2, n3, n8, n9, vmethod3248.boolean1, (byte)(-70));
                                }
                            }
                            if (-89408815 * vmethod3248.int2 != 16) {
                                if (n7 >= 480760824) {
                                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                    return;
                                }
                                scene.method1262(n, n2, n3, -89408815 * vmethod3248.int2);
                            }
                            Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                            return;
                        }
                        if (n6 == 4) {
                            if (n7 >= 480760824) {
                                throw new IllegalStateException();
                            }
                            while (true) {
                                Label_5151: {
                                    if (1292954189 * vmethod3248.animationId != -1) {
                                        break Label_5151;
                                    }
                                    if (n7 >= 480760824) {
                                        throw new IllegalStateException();
                                    }
                                    if (null != vmethod3248.soundEffectIds) {
                                        break Label_5151;
                                    }
                                    if (n7 >= 480760824) {
                                        throw new IllegalStateException();
                                    }
                                    final Renderable entity8 = vmethod3248.getEntity(4, n5, array, n15, n14, n16, (byte)(-85));
                                    scene.cw(n, n2, n3, n14, entity8, null, Tiles.field820[n5], 0, 0, 0, calculateTag, n18);
                                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                    return;
                                }
                                final Renderable entity8 = new DynamicObject(n4, 4, n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                                continue;
                            }
                        }
                        else if (5 == n6) {
                            if (n7 >= 480760824) {
                                throw new IllegalStateException();
                            }
                            int n23 = 16;
                            final long boundaryObjectTag = scene.getBoundaryObjectTag(n, n2, n3);
                            if (0L != boundaryObjectTag) {
                                n23 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag), (short)6583).int2 * -89408815;
                            }
                            Renderable entity9 = null;
                            Label_4607: {
                                if (vmethod3248.animationId * 1292954189 == -1) {
                                    if (n7 >= 480760824) {
                                        Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                        return;
                                    }
                                    if (null == vmethod3248.soundEffectIds) {
                                        if (n7 >= 480760824) {
                                            throw new IllegalStateException();
                                        }
                                        entity9 = vmethod3248.getEntity(4, n5, array, n15, n14, n16, (byte)(-90));
                                        break Label_4607;
                                    }
                                }
                                entity9 = new DynamicObject(n4, 4, n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                            }
                            scene.cw(n, n2, n3, n14, entity9, null, Tiles.field820[n5], 0, Tiles.field830[n5] * n23, n23 * Tiles.field827[n5], calculateTag, n18);
                            Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                            return;
                        }
                        else if (n6 == 6) {
                            if (n7 >= 480760824) {
                                Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                return;
                            }
                            int n24 = 8;
                            final long boundaryObjectTag2 = scene.getBoundaryObjectTag(n, n2, n3);
                            if (0L != boundaryObjectTag2) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                n24 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag2), (short)22010).int2 * -89408815 / 2;
                            }
                            Renderable entity10;
                            if (-1 == 1292954189 * vmethod3248.animationId && null == vmethod3248.soundEffectIds) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                entity10 = vmethod3248.getEntity(4, 4 + n5, array, n15, n14, n16, (byte)(-95));
                            }
                            else {
                                entity10 = new DynamicObject(n4, 4, 4 + n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                            }
                            scene.cw(n, n2, n3, n14, entity10, null, 256, n5, Tiles.field832[n5] * n24, n24 * Tiles.field833[n5], calculateTag, n18);
                            Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                            return;
                        }
                        else if (n6 == 7) {
                            if (n7 >= 480760824) {
                                throw new IllegalStateException();
                            }
                            final int n25 = 2 + n5 & 0x3;
                            Renderable entity11 = null;
                            Label_5088: {
                                if (vmethod3248.animationId * 1292954189 == -1) {
                                    if (n7 >= 480760824) {
                                        throw new IllegalStateException();
                                    }
                                    if (vmethod3248.soundEffectIds == null) {
                                        if (n7 >= 480760824) {
                                            Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                            return;
                                        }
                                        entity11 = vmethod3248.getEntity(4, 4 + n25, array, n15, n14, n16, (byte)(-87));
                                        break Label_5088;
                                    }
                                }
                                entity11 = new DynamicObject(n4, 4, n25 + 4, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
                            }
                            scene.cw(n, n2, n3, n14, entity11, null, 256, n25, 0, 0, calculateTag, n18);
                            Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                            return;
                        }
                        else {
                            if (8 == n6) {
                                int n26 = 8;
                                final long boundaryObjectTag3 = scene.getBoundaryObjectTag(n, n2, n3);
                                if (0L != boundaryObjectTag3) {
                                    if (n7 >= 480760824) {
                                        throw new IllegalStateException();
                                    }
                                    n26 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag3), (short)22609).int2 * -89408815 / 2;
                                }
                                final int n27 = 2 + n5 & 0x3;
                                while (true) {
                                    Label_5340: {
                                        if (vmethod3248.animationId * 1292954189 != -1) {
                                            break Label_5340;
                                        }
                                        if (n7 >= 480760824) {
                                            throw new IllegalStateException();
                                        }
                                        if (null != vmethod3248.soundEffectIds) {
                                            break Label_5340;
                                        }
                                        final Renderable entity12 = vmethod3248.getEntity(4, n5 + 4, array, n15, n14, n16, (byte)(-28));
                                        final Renderable entity13 = vmethod3248.getEntity(4, 4 + n27, array, n15, n14, n16, (byte)(-104));
                                        scene.cw(n, n2, n3, n14, entity12, entity13, 256, n5, Tiles.field832[n5] * n26, n26 * Tiles.field833[n5], calculateTag, n18);
                                        Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                                        return;
                                    }
                                    final Renderable entity12 = new DynamicObject(n4, 4, n5 + 4, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
                                    final Renderable entity13 = new DynamicObject(n4, 4, n27 + 4, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                                    continue;
                                }
                            }
                            Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                            return;
                        }
                    }
                }
                Renderable entity14 = null;
                Label_1146: {
                    if (-1 == vmethod3248.animationId * 1292954189) {
                        if (n7 >= 480760824) {
                            throw new IllegalStateException();
                        }
                        if (vmethod3248.soundEffectIds == null) {
                            if (n7 >= 480760824) {
                                throw new IllegalStateException();
                            }
                            entity14 = vmethod3248.getEntity(10, n5, array, n15, n14, n16, (byte)(-73));
                            break Label_1146;
                        }
                    }
                    entity14 = new DynamicObject(n4, 10, n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                }
                if (null != entity14) {
                    final int n28 = n14;
                    final int n29 = n8;
                    final int n30 = n9;
                    final Renderable renderable = entity14;
                    int n31;
                    if (11 == n6) {
                        if (n7 >= 480760824) {
                            throw new IllegalStateException();
                        }
                        n31 = 256;
                    }
                    else {
                        n31 = 0;
                    }
                    if (scene.method1288(n, n2, n3, n28, n29, n30, renderable, n31, calculateTag, n18) && vmethod3248.clipped) {
                        int n32 = 15;
                        if (entity14 instanceof Model) {
                            n32 = ((Model)entity14).method1318() / 4;
                            if (n32 > 30) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                n32 = 30;
                            }
                        }
                        for (int i = 0; i <= n8; ++i) {
                            if (n7 >= 480760824) {
                                throw new IllegalStateException();
                            }
                            for (int j = 0; j <= n9; ++j) {
                                if (n7 >= 480760824) {
                                    throw new IllegalStateException();
                                }
                                if (n32 > Client.gk.dw[n][n2 + i][n3 + j]) {
                                    if (n7 >= 480760824) {
                                        throw new IllegalStateException();
                                    }
                                    Client.gk.dw[n][n2 + i][j + n3] = (byte)n32;
                                }
                            }
                        }
                    }
                }
                if (0 != vmethod3248.interactType * -973955889 && collisionMap != null) {
                    if (n7 >= 480760824) {
                        throw new IllegalStateException();
                    }
                    CollisionMap.wa(collisionMap, n2, n3, n8, n9, vmethod3248.boolean1, (byte)(-64));
                }
                Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                return;
            }
            if (n7 >= 480760824) {
                Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                return;
            }
            if (Client.isLowDetail) {
                if (n7 >= 480760824) {
                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                    return;
                }
                if (0 == vmethod3248.int1 * 415653149 && 1 != vmethod3248.interactType * -973955889) {
                    if (n7 >= 480760824) {
                        Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                        return;
                    }
                    if (!vmethod3248.boolean2) {
                        Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                        return;
                    }
                }
            }
            Renderable entity15;
            if (-1 == 1292954189 * vmethod3248.animationId && null == vmethod3248.soundEffectIds) {
                if (n7 >= 480760824) {
                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                    return;
                }
                entity15 = vmethod3248.getEntity(22, n5, array, n15, n14, n16, (byte)(-65));
            }
            else {
                entity15 = new DynamicObject(n4, 22, n5, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
            }
            scene.newFloorDecoration(n, n2, n3, n14, entity15, calculateTag, n18);
            if (vmethod3248.interactType * -973955889 == 1) {
                if (n7 >= 480760824) {
                    Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                    return;
                }
                if (collisionMap != null) {
                    if (n7 >= 480760824) {
                        Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
                        return;
                    }
                    collisionMap.method1169(n2, n3, 93248030);
                }
            }
            Client.kv(n, n2, n3, n4, n5, n6, scene, collisionMap);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.ay(" + ')');
        }
    }
    
    public static User xp(final UserList list, final Username username) {
        if (list == null) {
            list.dy();
        }
        return UserList.fm(list, username, null, (byte)(-128));
    }
    
    public int[] bo() {
        final int[] array = new int[this.pressedKeysCount * 1888573011];
        for (int i = 0; i < 1888573011 * this.pressedKeysCount; ++i) {
            array[i] = this.field1856[i];
        }
        return array;
    }
    
    public static void dv(final class207 class207, final byte b) {
        if (class207 == null) {
            class207.method1151(b);
            return;
        }
        try {
            class207.field1860 = class207.field1869 * -1092387907;
            class207.field1869 = class207.field1857 * -206073161;
            class207.pressedKeysCount = 0;
            class207.field1862 = 0;
            Arrays.fill(class207.field1865, false);
            Arrays.fill(class207.field1863, false);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.ai(" + ')');
        }
    }
    
    @Override
    public boolean vmethod3951(final char c, final int n) {
        try {
            final int n2 = 1 + this.field1857 * -1384260729 & 0x7F;
            if (n2 != this.field1860 * 73809669) {
                if (n >= -592927922) {
                    throw new IllegalStateException();
                }
                this.field1864[-1384260729 * this.field1857] = -1;
                this.field1861[-1384260729 * this.field1857] = c;
                this.field1857 = -1899169225 * n2;
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.aw(" + ')');
        }
    }
    
    public int[] method1155(final int n) {
        try {
            final int[] array = new int[this.pressedKeysCount * 1888573011];
            for (int i = 0; i < 1888573011 * this.pressedKeysCount; ++i) {
                if (n <= 1199226105) {
                    throw new IllegalStateException();
                }
                array[i] = this.field1856[i];
            }
            return array;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.am(" + ')');
        }
    }
    
    @Override
    public boolean al(final char c) {
        final int n = 1 + this.field1857 * -1384260729 & 0x7F;
        if (n != this.field1860 * 1388150079) {
            this.field1864[-1203777774 * this.field1857] = -1;
            this.field1861[-1384260729 * this.field1857] = c;
            this.field1857 = -1314924538 * n;
        }
        return false;
    }
    
    public static void nh(final Message message, final int n, final String prefix, final String text, final String sender) {
        if (message == null) {
            message.bb();
            return;
        }
        message.type = class129.method762(-1728364522) * -1945835651;
        message.count = -795781739 * Client.cycle;
        message.cycle = n * -280274327;
        message.prefix = prefix;
        message.fillSenderUsername(1852348614);
        message.text = text;
        message.sender = sender;
        message.fillIsFromFriend((byte)(-86));
        Message.ur(message, 361292948);
    }
    
    @Override
    public boolean vmethod3989(final int n, final int n2) {
        try {
            this.field1858[n] = false;
            this.field1865[n] = false;
            this.field1863[n] = true;
            this.field1859[(this.field1862 -= 971798147) * 2082731989 - 1] = n;
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.an(" + ')');
        }
    }
    
    @Override
    public boolean vmethod3953(final boolean b, final byte b2) {
        try {
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.ac(" + ')');
        }
    }
    
    public static void nx(final class207 class207, final int n, final byte b) {
        if (class207 == null) {
            class207.method1149(n, b);
        }
        try {
            final int n2 = -1384260729 * class207.field1857 + 1 & 0x7F;
            if (n2 != 73809669 * class207.field1860) {
                if (b >= 55) {
                    return;
                }
                class207.field1864[class207.field1857 * -1384260729] = n;
                class207.field1861[-1384260729 * class207.field1857] = '\0';
                class207.field1857 = n2 * -1899169225;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.ax(" + ')');
        }
    }
    
    @Override
    public boolean au(final int n) {
        nx(this, n, (byte)(-128));
        this.field1858[n] = true;
        this.field1865[n] = true;
        this.field1863[n] = false;
        this.field1856[(this.pressedKeysCount -= 1818927653) * 1744372969 - 1] = n;
        return true;
    }
    
    @Override
    public boolean aa(final boolean b) {
        return false;
    }
    
    public void method1151(final byte b) {
        try {
            this.field1862 = this.field1869 * -1092387907;
            this.field1862 *= -206073161;
            this.field1867 = 0;
            this.field1857 = 0;
            Arrays.fill(this.field1858, false);
            Arrays.fill(this.field1863, false);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.ai(" + ')');
        }
    }
    
    public boolean by(final int n) {
        return n >= 0 && n < 112 && this.field1865[n];
    }
    
    public boolean bx(final int n) {
        return n >= 0 && n < 112 && this.field1863[n];
    }
    
    public boolean method1159(final int n, final int n2) {
        try {
            if (n >= 0) {
                if (n < 112) {
                    return this.field1858[n];
                }
                if (n2 != 1556637445) {
                    throw new IllegalStateException();
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.ar(" + ')');
        }
    }
    
    public final boolean ap() {
        if (-147657295 * this.field1869 == this.field1860 * 73809669) {
            return false;
        }
        this.field1867 = -2050262723 * this.field1864[73809669 * this.field1860];
        this.field1866 = this.field1861[73809669 * this.field1860];
        this.field1860 = -1675774515 * (1 + 73809669 * this.field1860 & 0x7F);
        return true;
    }
    
    public int[] bd() {
        final int[] array = new int[2082731989 * this.field1862];
        for (int i = 0; i < this.field1862 * 2082731989; ++i) {
            array[i] = this.field1859[i];
        }
        return array;
    }
    
    @Override
    public boolean vmethod3949(final int n, final int n2) {
        try {
            nx(this, n, (byte)30);
            this.field1858[n] = true;
            this.field1865[n] = true;
            this.field1863[n] = false;
            this.field1856[(this.pressedKeysCount -= 1818927653) * 1888573011 - 1] = n;
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.af(" + ')');
        }
    }
    
    @Override
    public boolean ab(final int n) {
        nx(this, n, (byte)(-62));
        this.field1858[n] = true;
        this.field1865[n] = true;
        this.field1863[n] = false;
        this.field1856[(this.pressedKeysCount -= 1818927653) * 1888573011 - 1] = n;
        return true;
    }
    
    @Override
    public boolean aq(final int n) {
        this.field1858[n] = false;
        this.field1865[n] = false;
        this.field1863[n] = true;
        this.field1859[(this.field1862 -= 971798147) * 2082731989 - 1] = n;
        return true;
    }
    
    void aj(final int n) {
        final int n2 = -1384260729 * this.field1857 + 1 & 0x30E15A9E;
        if (n2 != 73809669 * this.field1860) {
            this.field1864[this.field1857 * -1384260729] = n;
            this.field1861[-1384260729 * this.field1857] = '\0';
            this.field1857 = n2 * -2000372304;
        }
    }
    
    public final boolean method1154(final int n) {
        try {
            if (-147657295 * this.field1857 != this.field1862 * 73809669) {
                this.pressedKeysCount = -2050262723 * this.field1864[73809669 * this.field1860];
                this.field1866 = this.field1861[73809669 * this.field1869];
                this.field1860 = -1675774515 * (1 + 73809669 * this.field1857 & 0x7F);
                return true;
            }
            if (n <= 289925105) {
                throw new IllegalStateException();
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.ag(" + ')');
        }
    }
    
    public int[] bz() {
        final int[] array = new int[this.pressedKeysCount * 588071049];
        for (int i = 0; i < -739232436 * this.pressedKeysCount; ++i) {
            array[i] = this.field1856[i];
        }
        return array;
    }
    
    public int[] bm() {
        final int[] array = new int[2082731989 * this.field1862];
        for (int i = 0; i < this.field1862 * 2082731989; ++i) {
            array[i] = this.field1859[i];
        }
        return array;
    }
    
    public boolean[] method1153() {
        return this.field1858;
    }
    
    public boolean method1153(final int n, final byte b) {
        try {
            if (n >= 0) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                if (n < 112) {
                    return this.field1865[n];
                }
                if (b <= 0) {
                    throw new IllegalStateException();
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.ah(" + ')');
        }
    }
    
    public static boolean ux(final class207 class207, final int n, final int n2) {
        if (class207 == null) {
            class207.method1159(n, n);
        }
        try {
            if (n >= 0) {
                if (n < 112) {
                    return class207.field1863[n];
                }
                if (n2 != 1556637445) {
                    throw new IllegalStateException();
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hy.ar(" + ')');
        }
    }
}
