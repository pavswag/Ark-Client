import java.io.IOException;
import net.runelite.api.CollisionData;

// 
// Decompiled by Procyon v0.5.36
// 

public class CollisionMap implements CollisionData
{
    static final int ad = 19136782;
    static final int an = 2;
    static final int ay = 1024;
    static final int au = 16;
    static final int aa = 512;
    static final int af = 1;
    static final int ah = 32768;
    static final int aw = 4;
    int xInset;
    static final int am = 262144;
    int yInset;
    int xSize;
    int ySize;
    public int[][] flags;
    
    public CollisionMap(final int n, final int n2) {
        this.xInset = 0;
        this.yInset = 0;
        this.xSize = n * 1684986745;
        this.ySize = -2120741623 * n2;
        this.flags = new int[this.xSize * 1145675465][this.ySize * -1150578375];
        this.clear(1836692462);
    }
    
    void ad(final int n, final int n2, final int n3) {
        final int[] array = this.flags[n];
        array[n2] |= n3;
    }
    
    void ae(final int n, final int n2, final int n3) {
        final int[] array = this.flags[n];
        array[n2] |= n3;
    }
    
    public void bb(int n, int n2, int n3, int n4, final int n5, final boolean b) {
        int n6 = 256;
        if (b) {
            n6 += 131072;
        }
        n -= this.xInset * 1724654229;
        n2 -= this.yInset * -216630539;
        if (1 == n5 || n5 == 3) {
            final int n7 = n3;
            n3 = n4;
            n4 = n7;
        }
        for (int i = n; i < n3 + n; ++i) {
            if (i >= 0 && i < this.xSize * 1145675465) {
                for (int j = n2; j < n4 + n2; ++j) {
                    if (j >= 0 && j < -1150578375 * this.ySize) {
                        this.setFlagOff(i, j, n6, 1835747327);
                    }
                }
            }
        }
    }
    
    public void ao(int n, int n2, final int n3, final int n4, final boolean b) {
        int n5 = 256;
        if (b) {
            n5 += 131072;
        }
        n -= this.yInset * 1724654229;
        n2 -= -216630539 * this.xInset;
        for (int i = n; i < n + n3; ++i) {
            if (i >= 0 && i < 1145675465 * this.yInset) {
                for (int j = n2; j < n4 + n2; ++j) {
                    if (j >= 0 && j < -1150578375 * this.xSize) {
                        this.setFlagOff(i, j, n5, -1982256434);
                    }
                }
            }
        }
    }
    
    void setFlagOff(final int n, final int n2, final int n3, final int n4) {
        try {
            final int[] array = this.flags[n];
            array[n2] &= ~n3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "if.at(" + ')');
        }
    }
    
    public void ak(int n, int n2) {
        n -= 1724654229 * this.xInset;
        n2 -= this.yInset * -216630539;
        final int[] array = this.flags[n];
        final int n3 = n2;
        array[n3] |= 0x40000;
    }
    
    public void av(int n, int n2, final int n3, final int n4, final boolean b) {
        n -= this.xInset * 1724654229;
        n2 -= -216630539 * this.yInset;
        if (n3 == 0) {
            if (n4 == 0) {
                this.setFlagOff(n, n2, 128, 1835747327);
                this.setFlagOff(n - 1, n2, 8, 1835747327);
            }
            if (1 == n4) {
                this.setFlagOff(n, n2, 2, 1835747327);
                this.setFlagOff(n, 1 + n2, 32, 1835747327);
            }
            if (n4 == 2) {
                this.setFlagOff(n, n2, 8, 1835747327);
                this.setFlagOff(1 + n, n2, 128, 1835747327);
            }
            if (n4 == 3) {
                this.setFlagOff(n, n2, 32, 1835747327);
                this.setFlagOff(n, n2 - 1, 2, 1835747327);
            }
        }
        if (n3 == 1 || n3 == 3) {
            if (0 == n4) {
                this.setFlagOff(n, n2, 1, 1835747327);
                this.setFlagOff(n - 1, n2 + 1, 16, 1835747327);
            }
            if (1 == n4) {
                this.setFlagOff(n, n2, 4, 1835747327);
                this.setFlagOff(n + 1, n2 + 1, 64, 1835747327);
            }
            if (n4 == 2) {
                this.setFlagOff(n, n2, 16, 1835747327);
                this.setFlagOff(n + 1, n2 - 1, 1, 1835747327);
            }
            if (n4 == 3) {
                this.setFlagOff(n, n2, 64, 1835747327);
                this.setFlagOff(n - 1, n2 - 1, 4, 1835747327);
            }
        }
        if (n3 == 2) {
            if (0 == n4) {
                this.setFlagOff(n, n2, 130, 1835747327);
                this.setFlagOff(n - 1, n2, 8, 1835747327);
                this.setFlagOff(n, 1 + n2, 32, 1835747327);
            }
            if (n4 == 1) {
                this.setFlagOff(n, n2, 10, 1835747327);
                this.setFlagOff(n, n2 + 1, 32, 1835747327);
                this.setFlagOff(n + 1, n2, 128, 1835747327);
            }
            if (n4 == 2) {
                this.setFlagOff(n, n2, 40, 1835747327);
                this.setFlagOff(n + 1, n2, 128, 1835747327);
                this.setFlagOff(n, n2 - 1, 2, 1835747327);
            }
            if (3 == n4) {
                this.setFlagOff(n, n2, 160, 1835747327);
                this.setFlagOff(n, n2 - 1, 2, 1835747327);
                this.setFlagOff(n - 1, n2, 8, 1835747327);
            }
        }
        if (b) {
            if (n3 == 0) {
                if (n4 == 0) {
                    this.setFlagOff(n, n2, 65536, 1835747327);
                    this.setFlagOff(n - 1, n2, 4096, 1835747327);
                }
                if (1 == n4) {
                    this.setFlagOff(n, n2, 1024, 1835747327);
                    this.setFlagOff(n, n2 + 1, 16384, 1835747327);
                }
                if (n4 == 2) {
                    this.setFlagOff(n, n2, 4096, 1835747327);
                    this.setFlagOff(n + 1, n2, 65536, 1835747327);
                }
                if (n4 == 3) {
                    this.setFlagOff(n, n2, 16384, 1835747327);
                    this.setFlagOff(n, n2 - 1, 1024, 1835747327);
                }
            }
            if (1 == n3 || n3 == 3) {
                if (n4 == 0) {
                    this.setFlagOff(n, n2, 512, 1835747327);
                    this.setFlagOff(n - 1, n2 + 1, 8192, 1835747327);
                }
                if (n4 == 1) {
                    this.setFlagOff(n, n2, 2048, 1835747327);
                    this.setFlagOff(n + 1, n2 + 1, 32768, 1835747327);
                }
                if (2 == n4) {
                    this.setFlagOff(n, n2, 8192, 1835747327);
                    this.setFlagOff(n + 1, n2 - 1, 512, 1835747327);
                }
                if (3 == n4) {
                    this.setFlagOff(n, n2, 32768, 1835747327);
                    this.setFlagOff(n - 1, n2 - 1, 2048, 1835747327);
                }
            }
            if (n3 == 2) {
                if (0 == n4) {
                    this.setFlagOff(n, n2, 66560, 1835747327);
                    this.setFlagOff(n - 1, n2, 4096, 1835747327);
                    this.setFlagOff(n, 1 + n2, 16384, 1835747327);
                }
                if (1 == n4) {
                    this.setFlagOff(n, n2, 5120, 1835747327);
                    this.setFlagOff(n, n2 + 1, 16384, 1835747327);
                    this.setFlagOff(n + 1, n2, 65536, 1835747327);
                }
                if (2 == n4) {
                    this.setFlagOff(n, n2, 20480, 1835747327);
                    this.setFlagOff(1 + n, n2, 65536, 1835747327);
                    this.setFlagOff(n, n2 - 1, 1024, 1835747327);
                }
                if (3 == n4) {
                    this.setFlagOff(n, n2, 81920, 1835747327);
                    this.setFlagOff(n, n2 - 1, 1024, 1835747327);
                    this.setFlagOff(n - 1, n2, 4096, 1835747327);
                }
            }
        }
    }
    
    public static void rv(final LoginScreenAnimation loginScreenAnimation) {
        if (loginScreenAnimation == null) {
            loginScreenAnimation.ay();
        }
        loginScreenAnimation.field1027 = new int[256];
        for (int i = 0; i < 64; ++i) {
            loginScreenAnimation.field1027[i] = i * 262144;
        }
        for (int j = 0; j < 64; ++j) {
            loginScreenAnimation.field1027[64 + j] = 16711680 + j * 1024;
        }
        for (int k = 0; k < 64; ++k) {
            loginScreenAnimation.field1027[k + 128] = 4 * k + 16776960;
        }
        for (int l = 0; l < 64; ++l) {
            loginScreenAnimation.field1027[l + 192] = 16777215;
        }
        loginScreenAnimation.field1018 = new int[256];
        for (int n = 0; n < 64; ++n) {
            loginScreenAnimation.field1018[n] = n * 1024;
        }
        for (int n2 = 0; n2 < 64; ++n2) {
            loginScreenAnimation.field1018[64 + n2] = n2 * 4 + 65280;
        }
        for (int n3 = 0; n3 < 64; ++n3) {
            loginScreenAnimation.field1018[n3 + 128] = 262144 * n3 + 65535;
        }
        for (int n4 = 0; n4 < 64; ++n4) {
            loginScreenAnimation.field1018[192 + n4] = 16777215;
        }
        loginScreenAnimation.field1012 = new int[256];
        for (int n5 = 0; n5 < 64; ++n5) {
            loginScreenAnimation.field1012[n5] = n5 * 4;
        }
        for (int n6 = 0; n6 < 64; ++n6) {
            loginScreenAnimation.field1012[n6 + 64] = 262144 * n6 + 255;
        }
        for (int n7 = 0; n7 < 64; ++n7) {
            loginScreenAnimation.field1012[128 + n7] = 16711935 + n7 * 1024;
        }
        for (int n8 = 0; n8 < 64; ++n8) {
            loginScreenAnimation.field1012[n8 + 192] = 16777215;
        }
        loginScreenAnimation.field1016 = new int[256];
        loginScreenAnimation.field1015 = 0;
        loginScreenAnimation.field1023 = new int[32768];
        loginScreenAnimation.field1019 = new int[32768];
        LoginScreenAnimation.bu(loginScreenAnimation, null, -1403569480);
        loginScreenAnimation.field1022 = new int[32768];
        loginScreenAnimation.field1017 = new int[32768];
    }
    
    void be(final int n, final int n2, final int n3) {
        final int[] array = this.flags[n];
        array[n2] &= ~n3;
    }
    
    public void az(int n, int n2) {
        n -= 1724654229 * this.xSize;
        n2 -= this.yInset * -216630539;
        final int[] array = this.flags[n];
        final int n3 = n2;
        array[n3] |= 0x40000;
    }
    
    public void ax(int n, int n2, final int n3, final int n4, final boolean b) {
        int n5 = 256;
        if (b) {
            n5 += 131072;
        }
        n -= this.xInset * 1724654229;
        n2 -= -216630539 * this.yInset;
        for (int i = n; i < n + n3; ++i) {
            if (i >= 0 && i < 1145675465 * this.xSize) {
                for (int j = n2; j < n4 + n2; ++j) {
                    if (j >= 0 && j < -1150578375 * this.ySize) {
                        this.setFlag(i, j, n5, -1982256434);
                    }
                }
            }
        }
    }
    
    void bo(final int n, final int n2, final int n3) {
        final int[] array = this.flags[n];
        array[n2] &= ~n3;
    }
    
    public void dh(final int n, final int n2) {
        this.setBlockedByFloor(n, n2, (byte)90);
    }
    
    public void addGameObject(int n, int n2, final int n3, final int n4, final boolean b, final byte b2) {
        try {
            int n5 = 256;
            if (b) {
                if (b2 >= 0) {
                    return;
                }
                n5 += 131072;
            }
            n -= this.ySize * 1724654229;
            n2 -= -216630539 * this.ySize;
            for (int i = n; i < n + n3; ++i) {
                if (b2 >= 0) {
                    return;
                }
                if (i >= 0) {
                    if (b2 >= 0) {
                        throw new IllegalStateException();
                    }
                    if (i < 1145675465 * this.ySize) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        for (int j = n2; j < n4 + n2; ++j) {
                            if (b2 >= 0) {
                                return;
                            }
                            if (j >= 0) {
                                if (b2 >= 0) {
                                    throw new IllegalStateException();
                                }
                                if (j < -1150578375 * this.yInset) {
                                    if (b2 >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    this.setFlag(i, j, n5, -617613217);
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "if.aw(" + ')');
        }
    }
    
    public void am(int n, int n2) {
        n -= this.xInset * -1620221059;
        n2 -= 409488021 * this.yInset;
        final int[] array = this.flags[n];
        final int n3 = n2;
        array[n3] |= 0x1267555A;
    }
    
    public void setFlagOffNonSquare(int n, int n2, int n3, int n4, final int n5, final boolean b, final int n6) {
        try {
            int n7 = 256;
            if (b) {
                if (n6 >= 1873871214) {
                    return;
                }
                n7 += 131072;
            }
            n -= this.xInset * 1724654229;
            n2 -= this.yInset * -216630539;
            while (true) {
                Label_0174: {
                    if (1 == n5) {
                        break Label_0174;
                    }
                    if (n6 >= 1873871214) {
                        throw new IllegalStateException();
                    }
                    if (n5 == 3) {
                        if (n6 >= 1873871214) {
                            throw new IllegalStateException();
                        }
                        break Label_0174;
                    }
                    for (int i = n; i < n3 + n; ++i) {
                        if (n6 >= 1873871214) {
                            throw new IllegalStateException();
                        }
                        if (i >= 0) {
                            if (n6 >= 1873871214) {
                                throw new IllegalStateException();
                            }
                            if (i < this.xSize * 1145675465) {
                                if (n6 >= 1873871214) {
                                    throw new IllegalStateException();
                                }
                                for (int j = n2; j < n4 + n2; ++j) {
                                    if (n6 >= 1873871214) {
                                        throw new IllegalStateException();
                                    }
                                    if (j >= 0) {
                                        if (n6 >= 1873871214) {
                                            throw new IllegalStateException();
                                        }
                                        if (j < -1150578375 * this.ySize) {
                                            if (n6 >= 1873871214) {
                                                throw new IllegalStateException();
                                            }
                                            this.setFlagOff(i, j, n7, 1835747327);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
                final int n8 = n3;
                n3 = n4;
                n4 = n8;
                continue;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "if.al(" + ')');
        }
    }
    
    public static byte[] nn(final ArchiveDisk archiveDisk, final int n) {
        synchronized (archiveDisk.datFile) {
            try {
                if (archiveDisk.idxFile.length((short)21057) < 6 + 6 * n) {
                    return null;
                }
                BufferedFile.cu(archiveDisk.idxFile, n * 6);
                archiveDisk.idxFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 6, -1880514774);
                final int n2 = (ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) << 8));
                int n3 = ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF);
                if (n2 < 0 || n2 > -479445333 * archiveDisk.maxEntrySize) {
                    return null;
                }
                if (n3 <= 0 || n3 > archiveDisk.datFile.length((short)12772) / 520L) {
                    return null;
                }
                final byte[] array = new byte[n2];
                int i = 0;
                int n4 = 0;
                while (i < n2) {
                    if (n3 == 0) {
                        return null;
                    }
                    BufferedFile.cu(archiveDisk.datFile, n3 * 520L);
                    int n5 = n2 - i;
                    int n6;
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    if (n > 65535) {
                        if (n5 > 510) {
                            n5 = 510;
                        }
                        n6 = 10;
                        archiveDisk.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, n5 + n6, -1036995559);
                        n7 = (ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) << 8) + (((ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 24)));
                        n8 = (ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 8);
                        n9 = (ArchiveDisk.ArchiveDisk_buffer[8] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[6] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF) << 8));
                        n10 = (ArchiveDisk.ArchiveDisk_buffer[9] & 0xFF);
                    }
                    else {
                        if (n5 > 512) {
                            n5 = 512;
                        }
                        n6 = 8;
                        archiveDisk.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, n6 + n5, -1492471990);
                        n7 = ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 8) + (ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF);
                        n8 = ((ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) << 8) + (ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF);
                        n9 = ((ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[6] & 0xFF);
                        n10 = (ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF);
                    }
                    if (n7 != n || n4 != n8 || n10 != 290825311 * archiveDisk.archive) {
                        return null;
                    }
                    if (n9 < 0 || n9 > archiveDisk.datFile.length((short)4299) / 520L) {
                        return null;
                    }
                    for (int n11 = n5 + n6, j = n6; j < n11; ++j) {
                        array[i++] = ArchiveDisk.ArchiveDisk_buffer[j];
                    }
                    n3 = n9;
                    ++n4;
                }
                return array;
            }
            catch (IOException ex) {
                return null;
            }
        }
    }
    
    public void method1163(int n, int n2, final int n3, final int n4, final boolean b, final int n5) {
        try {
            n -= 1724654229 * this.xInset;
            n2 -= -216630539 * this.yInset;
            if (0 == n3) {
                if (n5 != -2067452311) {
                    throw new IllegalStateException();
                }
                if (n4 == 0) {
                    this.setFlag(n, n2, 128, -1980468475);
                    this.setFlag(n - 1, n2, 8, -592915122);
                }
                if (n4 == 1) {
                    if (n5 != -2067452311) {
                        return;
                    }
                    this.setFlag(n, n2, 2, 1894082229);
                    this.setFlag(n, 1 + n2, 32, -2136189270);
                }
                if (2 == n4) {
                    if (n5 != -2067452311) {
                        throw new IllegalStateException();
                    }
                    this.setFlag(n, n2, 8, -220385584);
                    this.setFlag(1 + n, n2, 128, -183667112);
                }
                if (3 == n4) {
                    this.setFlag(n, n2, 32, 1094018251);
                    this.setFlag(n, n2 - 1, 2, 997248202);
                }
            }
            Label_0729: {
                if (1 != n3) {
                    if (n5 != -2067452311) {
                        throw new IllegalStateException();
                    }
                    if (3 != n3) {
                        break Label_0729;
                    }
                }
                if (0 == n4) {
                    if (n5 != -2067452311) {
                        throw new IllegalStateException();
                    }
                    this.setFlag(n, n2, 1, 1270556798);
                    this.setFlag(n - 1, n2 + 1, 16, -1904420287);
                }
                if (n4 == 1) {
                    this.setFlag(n, n2, 4, -1234074317);
                    this.setFlag(n + 1, n2 + 1, 64, -326624685);
                }
                if (n4 == 2) {
                    if (n5 != -2067452311) {
                        return;
                    }
                    this.setFlag(n, n2, 16, 498800564);
                    this.setFlag(1 + n, n2 - 1, 1, 858439809);
                }
                if (n4 == 3) {
                    if (n5 != -2067452311) {
                        throw new IllegalStateException();
                    }
                    this.setFlag(n, n2, 64, 209585500);
                    this.setFlag(n - 1, n2 - 1, 4, 1638247877);
                }
            }
            if (n3 == 2) {
                if (n5 != -2067452311) {
                    return;
                }
                if (n4 == 0) {
                    if (n5 != -2067452311) {
                        throw new IllegalStateException();
                    }
                    this.setFlag(n, n2, 130, -1812573145);
                    this.setFlag(n - 1, n2, 8, 1536765730);
                    this.setFlag(n, n2 + 1, 32, 35369921);
                }
                if (n4 == 1) {
                    if (n5 != -2067452311) {
                        return;
                    }
                    this.setFlag(n, n2, 10, 1486820658);
                    this.setFlag(n, 1 + n2, 32, -1027553383);
                    this.setFlag(1 + n, n2, 128, 2030351546);
                }
                if (2 == n4) {
                    if (n5 != -2067452311) {
                        throw new IllegalStateException();
                    }
                    this.setFlag(n, n2, 40, 434307567);
                    this.setFlag(n + 1, n2, 128, -1256562631);
                    this.setFlag(n, n2 - 1, 2, 1006837730);
                }
                if (3 == n4) {
                    if (n5 != -2067452311) {
                        throw new IllegalStateException();
                    }
                    this.setFlag(n, n2, 160, 341240436);
                    this.setFlag(n, n2 - 1, 2, -2066786685);
                    this.setFlag(n - 1, n2, 8, -454639093);
                }
            }
            if (b) {
                if (n5 != -2067452311) {
                    return;
                }
                if (n3 == 0) {
                    if (n5 != -2067452311) {
                        throw new IllegalStateException();
                    }
                    if (n4 == 0) {
                        if (n5 != -2067452311) {
                            return;
                        }
                        this.setFlag(n, n2, 65536, 1844003045);
                        this.setFlag(n - 1, n2, 4096, 874984966);
                    }
                    if (1 == n4) {
                        if (n5 != -2067452311) {
                            throw new IllegalStateException();
                        }
                        this.setFlag(n, n2, 1024, -1071472855);
                        this.setFlag(n, 1 + n2, 16384, 1174893417);
                    }
                    if (2 == n4) {
                        this.setFlag(n, n2, 4096, -1439893867);
                        this.setFlag(n + 1, n2, 65536, 89246651);
                    }
                    if (n4 == 3) {
                        if (n5 != -2067452311) {
                            throw new IllegalStateException();
                        }
                        this.setFlag(n, n2, 16384, 1634280093);
                        this.setFlag(n, n2 - 1, 1024, -1166486366);
                    }
                }
                while (true) {
                    Label_0650: {
                        if (1 == n3) {
                            break Label_0650;
                        }
                        if (n5 != -2067452311) {
                            throw new IllegalStateException();
                        }
                        if (n3 == 3) {
                            if (n5 != -2067452311) {
                                throw new IllegalStateException();
                            }
                            break Label_0650;
                        }
                        if (n3 != 2) {
                            return;
                        }
                        if (n5 != -2067452311) {
                            throw new IllegalStateException();
                        }
                        if (0 == n4) {
                            if (n5 != -2067452311) {
                                return;
                            }
                            this.setFlag(n, n2, 66560, 1561574969);
                            this.setFlag(n - 1, n2, 4096, 1350801642);
                            this.setFlag(n, 1 + n2, 16384, -1245887714);
                        }
                        if (n4 == 1) {
                            this.setFlag(n, n2, 5120, -254740978);
                            this.setFlag(n, 1 + n2, 16384, -1540737681);
                            this.setFlag(1 + n, n2, 65536, -1556821189);
                        }
                        if (n4 == 2) {
                            if (n5 != -2067452311) {
                                throw new IllegalStateException();
                            }
                            this.setFlag(n, n2, 20480, -1991368599);
                            this.setFlag(n + 1, n2, 65536, -718694627);
                            this.setFlag(n, n2 - 1, 1024, 921676810);
                        }
                        if (n4 != 3) {
                            return;
                        }
                        if (n5 != -2067452311) {
                            throw new IllegalStateException();
                        }
                        this.setFlag(n, n2, 81920, -163566198);
                        this.setFlag(n, n2 - 1, 1024, -55441375);
                        this.setFlag(n - 1, n2, 4096, -1792327412);
                        return;
                    }
                    if (0 == n4) {
                        if (n5 != -2067452311) {
                            return;
                        }
                        this.setFlag(n, n2, 512, 893708024);
                        this.setFlag(n - 1, 1 + n2, 8192, -1431506838);
                    }
                    if (n4 == 1) {
                        if (n5 != -2067452311) {
                            throw new IllegalStateException();
                        }
                        this.setFlag(n, n2, 2048, 476418732);
                        this.setFlag(n + 1, 1 + n2, 32768, 246927257);
                    }
                    if (n4 == 2) {
                        if (n5 != -2067452311) {
                            throw new IllegalStateException();
                        }
                        this.setFlag(n, n2, 8192, 1572848674);
                        this.setFlag(n + 1, n2 - 1, 512, 560233341);
                    }
                    if (3 != n4) {
                        continue;
                    }
                    if (n5 != -2067452311) {
                        throw new IllegalStateException();
                    }
                    this.setFlag(n, n2, 32768, -1079157197);
                    this.setFlag(n - 1, n2 - 1, 2048, 1897101757);
                    continue;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "if.an(" + ')');
        }
    }
    
    public void setBlockedByFloor(int n, int n2, final byte b) {
        try {
            n -= this.xInset * 1724654229;
            n2 -= -216630539 * this.yInset;
            final int[] array = this.flags[n];
            final int n3 = n2;
            array[n3] |= 0x200000;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "if.ac(" + ')');
        }
    }
    
    public int[][] getFlags() {
        return this.flags;
    }
    
    public static void de(final CollisionMap collisionMap, int n, int n2, final int n3, final int n4, final boolean b) {
        n -= 1604314777 * collisionMap.xInset;
        n2 -= 38866972 * collisionMap.yInset;
        if (0 == n3) {
            if (n4 == 0) {
                collisionMap.setFlag(n, n2, 128, 286396647);
                collisionMap.setFlag(n - 1, n2, 8, -1154529219);
            }
            if (n4 == 1) {
                collisionMap.setFlag(n, n2, 2, -1974053505);
                collisionMap.setFlag(n, 1 + n2, -108092454, -1448676108);
            }
            if (2 == n4) {
                collisionMap.setFlag(n, n2, 8, 1857413192);
                collisionMap.setFlag(1 + n, n2, 128, -1706051729);
            }
            if (3 == n4) {
                collisionMap.setFlag(n, n2, 32, 477322893);
                collisionMap.setFlag(n, n2 - 1, 2, -2044886405);
            }
        }
        if (1 == n3 || 3 == n3) {
            if (0 == n4) {
                collisionMap.setFlag(n, n2, 1, -1092657505);
                collisionMap.setFlag(n - 1, n2 + 1, 16, -1025511532);
            }
            if (n4 == 1) {
                collisionMap.setFlag(n, n2, 4, 574928745);
                collisionMap.setFlag(n + 1, n2 + 1, 64, 1094998263);
            }
            if (n4 == 2) {
                collisionMap.setFlag(n, n2, 16, 1036638465);
                collisionMap.setFlag(1 + n, n2 - 1, 1, 1566934196);
            }
            if (n4 == 3) {
                collisionMap.setFlag(n, n2, -1021203354, -1056139725);
                collisionMap.setFlag(n - 1, n2 - 1, 4, -544149316);
            }
        }
        if (n3 == 2) {
            if (n4 == 0) {
                collisionMap.setFlag(n, n2, -139901821, -536414440);
                collisionMap.setFlag(n - 1, n2, 8, -1017458705);
                collisionMap.setFlag(n, n2 + 1, 32, -400251747);
            }
            if (n4 == 1) {
                collisionMap.setFlag(n, n2, 10, -912603089);
                collisionMap.setFlag(n, 1 + n2, -673741079, -2040955620);
                collisionMap.setFlag(1 + n, n2, 128, 259817839);
            }
            if (2 == n4) {
                collisionMap.setFlag(n, n2, 2135490442, 1216537063);
                collisionMap.setFlag(n + 1, n2, 128, 1114641860);
                collisionMap.setFlag(n, n2 - 1, 2, -1788457513);
            }
            if (3 == n4) {
                collisionMap.setFlag(n, n2, 160, -8949134);
                collisionMap.setFlag(n, n2 - 1, 2, 1865991392);
                collisionMap.setFlag(n - 1, n2, 8, -49366529);
            }
        }
        if (b) {
            if (n3 == 0) {
                if (n4 == 0) {
                    collisionMap.setFlag(n, n2, 65536, -1111249760);
                    collisionMap.setFlag(n - 1, n2, -203365346, 1522448196);
                }
                if (1 == n4) {
                    collisionMap.setFlag(n, n2, 1024, 267689450);
                    collisionMap.setFlag(n, 1 + n2, -2121376844, 2034856310);
                }
                if (2 == n4) {
                    collisionMap.setFlag(n, n2, 4096, -907100321);
                    collisionMap.setFlag(n + 1, n2, -37271659, -1018039998);
                }
                if (n4 == 3) {
                    collisionMap.setFlag(n, n2, 16384, 630012149);
                    collisionMap.setFlag(n, n2 - 1, 506784169, -1855895859);
                }
            }
            if (1 == n3 || n3 == 3) {
                if (0 == n4) {
                    collisionMap.setFlag(n, n2, 512, 1890537614);
                    collisionMap.setFlag(n - 1, 1 + n2, 8192, -1506025257);
                }
                if (n4 == 1) {
                    collisionMap.setFlag(n, n2, 2048, 1201651587);
                    collisionMap.setFlag(n + 1, 1 + n2, -1970339212, -2103753543);
                }
                if (n4 == 2) {
                    collisionMap.setFlag(n, n2, 8192, 1936838965);
                    collisionMap.setFlag(n + 1, n2 - 1, 512, -225364095);
                }
                if (3 == n4) {
                    collisionMap.setFlag(n, n2, 23019969, 1833425570);
                    collisionMap.setFlag(n - 1, n2 - 1, -1805842461, -1139120131);
                }
            }
            if (n3 == 2) {
                if (0 == n4) {
                    collisionMap.setFlag(n, n2, 66560, -1189111059);
                    collisionMap.setFlag(n - 1, n2, 4096, 1320659404);
                    collisionMap.setFlag(n, 1 + n2, -1557709904, 1308234996);
                }
                if (n4 == 1) {
                    collisionMap.setFlag(n, n2, 5120, -532295314);
                    collisionMap.setFlag(n, 1 + n2, 16384, -1627557411);
                    collisionMap.setFlag(1 + n, n2, 65536, -1262665388);
                }
                if (n4 == 2) {
                    collisionMap.setFlag(n, n2, 1501135658, -1433895768);
                    collisionMap.setFlag(n + 1, n2, -1713690686, -1509738511);
                    collisionMap.setFlag(n, n2 - 1, 1318678631, 1645758143);
                }
                if (n4 == 3) {
                    collisionMap.setFlag(n, n2, 81920, -1350046009);
                    collisionMap.setFlag(n, n2 - 1, 349074860, 22644097);
                    collisionMap.setFlag(n - 1, n2, 1179416097, -1475503494);
                }
            }
        }
    }
    
    public void setBlockedByFloorDec(int n, int n2, final int n3) {
        try {
            n -= 1724654229 * this.xInset;
            n2 -= -216630539 * this.yInset;
            final int[] array = this.flags[n];
            final int n4 = n2;
            array[n4] &= 0xFFFBFFFF;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "if.aa(" + ')');
        }
    }
    
    public void method1169(int n, int n2, final int n3) {
        try {
            n -= 1724654229 * this.xInset;
            n2 -= this.yInset * -216630539;
            final int[] array = this.flags[n];
            final int n4 = n2;
            array[n4] |= 0x40000;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "if.au(" + ')');
        }
    }
    
    public void by(int n, int n2, final int n3, final int n4, final boolean b) {
        int n5 = 256;
        if (b) {
            n5 += 131072;
        }
        n -= this.xInset * 1724654229;
        n2 -= -216630539 * this.yInset;
        for (int i = n; i < n + n3; ++i) {
            if (i >= 0 && i < 1145675465 * this.xSize) {
                for (int j = n2; j < n4 + n2; ++j) {
                    if (j >= 0 && j < -1150578375 * this.ySize) {
                        this.setFlag(i, j, n5, -475702304);
                    }
                }
            }
        }
    }
    
    void bx(final int n, final int n2, final int n3) {
        final int[] array = this.flags[n];
        array[n2] &= ~n3;
    }
    
    public void ar(int n, int n2) {
        n -= this.xInset * 1724654229;
        n2 -= -216630539 * this.yInset;
        final int[] array = this.flags[n];
        final int n3 = n2;
        array[n3] |= 0x200000;
    }
    
    void ap(final int n, final int n2, final int n3) {
        final int[] array = this.flags[n];
        array[n2] |= n3;
    }
    
    public static void mx(final CollisionMap collisionMap, int n, int n2) {
        n -= collisionMap.xInset * 1724654229;
        n2 -= -216630539 * collisionMap.yInset;
        final int[] array = collisionMap.flags[n];
        final int n3 = n2;
        array[n3] |= 0x200000;
    }
    
    static void playJingle(final int n, final int n2, final int n3) {
        try {
            if (ClientPreferences.xp(class20.clientPreferences, 678255359) != 0) {
                if (n3 != 1287836101) {
                    throw new IllegalStateException();
                }
                if (-1 != n) {
                    if (n3 != 1287836101) {
                        throw new IllegalStateException();
                    }
                    Message.isFromFriend(class195.field1645, n, 0, ClientPreferences.xp(class20.clientPreferences, -1320951377), false, -1962828137);
                    Client.playingJingle = true;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "if.hy(" + ')');
        }
    }
    
    public static void eu(final CollisionMap collisionMap, int n, int n2) {
        if (collisionMap == null) {
            collisionMap.az(n, n);
        }
        n -= 1724654229 * collisionMap.xInset;
        n2 -= collisionMap.yInset * -216630539;
        final int[] array = collisionMap.flags[n];
        final int n3 = n2;
        array[n3] |= 0x40000;
    }
    
    public static void clear(final CollisionMap collisionMap, int n, int n2, int n3, int n4, final int n5, final boolean b) {
        if (collisionMap == null) {
            collisionMap.bb(n, n, n, n, n, b);
            return;
        }
        int n6 = 256;
        if (b) {
            n6 += 131072;
        }
        n -= collisionMap.xInset * 1724654229;
        n2 -= collisionMap.yInset * -216630539;
        if (1 == n5 || n5 == 3) {
            final int n7 = n3;
            n3 = n4;
            n4 = n7;
        }
        for (int i = n; i < n3 + n; ++i) {
            if (i >= 0 && i < collisionMap.xSize * 1145675465) {
                for (int j = n2; j < n4 + n2; ++j) {
                    if (j >= 0 && j < -1150578375 * collisionMap.ySize) {
                        collisionMap.setFlagOff(i, j, n6, 1835747327);
                    }
                }
            }
        }
    }
    
    public void clear(final int n) {
        try {
            for (int i = 0; i < 1145675465 * this.xSize; ++i) {
                if (n <= 1581872191) {
                    return;
                }
                for (int j = 0; j < this.ySize * -1150578375; ++j) {
                    if (i != 0 && j) {
                        if (n <= 1581872191) {
                            throw new IllegalStateException();
                        }
                        if (i < this.xSize * 1145675465 - 5) {
                            if (n <= 1581872191) {
                                throw new IllegalStateException();
                            }
                            if (j < this.ySize * -1150578375 - 5) {
                                this.flags[i][j] = 16777216;
                                continue;
                            }
                            if (n <= 1581872191) {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    this.flags[i][j] = 16777215;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "if.af(" + ')');
        }
    }
    
    public static void wa(final CollisionMap collisionMap, int n, int n2, final int n3, final int n4, final boolean b, final byte b2) {
        if (collisionMap == null) {
            collisionMap.addGameObject(n, n, n, n, b, b2);
            return;
        }
        try {
            int n5 = 256;
            if (b) {
                if (b2 >= 0) {
                    return;
                }
                n5 += 131072;
            }
            n -= collisionMap.xInset * 1724654229;
            n2 -= -216630539 * collisionMap.yInset;
            for (int i = n; i < n + n3; ++i) {
                if (b2 >= 0) {
                    return;
                }
                if (i >= 0) {
                    if (b2 >= 0) {
                        throw new IllegalStateException();
                    }
                    if (i < 1145675465 * collisionMap.xSize) {
                        if (b2 >= 0) {
                            throw new IllegalStateException();
                        }
                        for (int j = n2; j < n4 + n2; ++j) {
                            if (b2 >= 0) {
                                return;
                            }
                            if (j >= 0) {
                                if (b2 >= 0) {
                                    throw new IllegalStateException();
                                }
                                if (j < -1150578375 * collisionMap.ySize) {
                                    if (b2 >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    collisionMap.setFlag(i, j, n5, -617613217);
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "if.aw(" + ')');
        }
    }
    
    void setFlag(final int n, final int n2, final int n3, final int n4) {
        try {
            final int[] array = this.flags[n];
            array[n2] |= n3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "if.ab(" + ')');
        }
    }
    
    public static void setFlag(final CollisionMap collisionMap, int n, int n2, final int n3, final int n4, final boolean b) {
        if (collisionMap == null) {
            collisionMap.ao(n, n, n, n, b);
        }
        int n5 = -13403639;
        if (b) {
            n5 += 131072;
        }
        n -= collisionMap.xInset * -1604166768;
        n2 -= 1263255970 * collisionMap.yInset;
        for (int i = n; i < n + n3; ++i) {
            if (i >= 0 && i < 1240922597 * collisionMap.xSize) {
                for (int j = n2; j < n4 + n2; ++j) {
                    if (j >= 0 && j < 1097750985 * collisionMap.ySize) {
                        collisionMap.setFlag(i, j, n5, 1288190170);
                    }
                }
            }
        }
    }
    
    public void method1167(int n, int n2, final int n3, final int n4, final boolean b, final int n5) {
        try {
            n -= this.xInset * 1724654229;
            n2 -= -216630539 * this.yInset;
            if (n3 == 0) {
                if (n5 >= -453940114) {
                    throw new IllegalStateException();
                }
                if (n4 == 0) {
                    if (n5 >= -453940114) {
                        return;
                    }
                    this.setFlagOff(n, n2, 128, 1835747327);
                    this.setFlagOff(n - 1, n2, 8, 1835747327);
                }
                if (1 == n4) {
                    if (n5 >= -453940114) {
                        return;
                    }
                    this.setFlagOff(n, n2, 2, 1835747327);
                    this.setFlagOff(n, 1 + n2, 32, 1835747327);
                }
                if (n4 == 2) {
                    if (n5 >= -453940114) {
                        throw new IllegalStateException();
                    }
                    this.setFlagOff(n, n2, 8, 1835747327);
                    this.setFlagOff(1 + n, n2, 128, 1835747327);
                }
                if (n4 == 3) {
                    this.setFlagOff(n, n2, 32, 1835747327);
                    this.setFlagOff(n, n2 - 1, 2, 1835747327);
                }
            }
            Label_0426: {
                if (n3 != 1) {
                    if (n3 != 3) {
                        break Label_0426;
                    }
                    if (n5 >= -453940114) {
                        throw new IllegalStateException();
                    }
                }
                if (0 == n4) {
                    this.setFlagOff(n, n2, 1, 1835747327);
                    this.setFlagOff(n - 1, n2 + 1, 16, 1835747327);
                }
                if (1 == n4) {
                    if (n5 >= -453940114) {
                        throw new IllegalStateException();
                    }
                    this.setFlagOff(n, n2, 4, 1835747327);
                    this.setFlagOff(n + 1, n2 + 1, 64, 1835747327);
                }
                if (n4 == 2) {
                    if (n5 >= -453940114) {
                        return;
                    }
                    this.setFlagOff(n, n2, 16, 1835747327);
                    this.setFlagOff(n + 1, n2 - 1, 1, 1835747327);
                }
                if (n4 == 3) {
                    if (n5 >= -453940114) {
                        return;
                    }
                    this.setFlagOff(n, n2, 64, 1835747327);
                    this.setFlagOff(n - 1, n2 - 1, 4, 1835747327);
                }
            }
            if (n3 == 2) {
                if (n5 >= -453940114) {
                    throw new IllegalStateException();
                }
                if (0 == n4) {
                    if (n5 >= -453940114) {
                        throw new IllegalStateException();
                    }
                    this.setFlagOff(n, n2, 130, 1835747327);
                    this.setFlagOff(n - 1, n2, 8, 1835747327);
                    this.setFlagOff(n, 1 + n2, 32, 1835747327);
                }
                if (n4 == 1) {
                    this.setFlagOff(n, n2, 10, 1835747327);
                    this.setFlagOff(n, n2 + 1, 32, 1835747327);
                    this.setFlagOff(n + 1, n2, 128, 1835747327);
                }
                if (n4 == 2) {
                    if (n5 >= -453940114) {
                        throw new IllegalStateException();
                    }
                    this.setFlagOff(n, n2, 40, 1835747327);
                    this.setFlagOff(n + 1, n2, 128, 1835747327);
                    this.setFlagOff(n, n2 - 1, 2, 1835747327);
                }
                if (3 == n4) {
                    if (n5 >= -453940114) {
                        throw new IllegalStateException();
                    }
                    this.setFlagOff(n, n2, 160, 1835747327);
                    this.setFlagOff(n, n2 - 1, 2, 1835747327);
                    this.setFlagOff(n - 1, n2, 8, 1835747327);
                }
            }
            if (b) {
                if (n5 >= -453940114) {
                    throw new IllegalStateException();
                }
                if (n3 == 0) {
                    if (n5 >= -453940114) {
                        return;
                    }
                    if (n4 == 0) {
                        if (n5 >= -453940114) {
                            throw new IllegalStateException();
                        }
                        this.setFlagOff(n, n2, 65536, 1835747327);
                        this.setFlagOff(n - 1, n2, 4096, 1835747327);
                    }
                    if (1 == n4) {
                        if (n5 >= -453940114) {
                            return;
                        }
                        this.setFlagOff(n, n2, 1024, 1835747327);
                        this.setFlagOff(n, n2 + 1, 16384, 1835747327);
                    }
                    if (n4 == 2) {
                        if (n5 >= -453940114) {
                            throw new IllegalStateException();
                        }
                        this.setFlagOff(n, n2, 4096, 1835747327);
                        this.setFlagOff(n + 1, n2, 65536, 1835747327);
                    }
                    if (n4 == 3) {
                        if (n5 >= -453940114) {
                            throw new IllegalStateException();
                        }
                        this.setFlagOff(n, n2, 16384, 1835747327);
                        this.setFlagOff(n, n2 - 1, 1024, 1835747327);
                    }
                }
                Label_1077: {
                    if (1 != n3) {
                        if (n3 != 3) {
                            break Label_1077;
                        }
                        if (n5 >= -453940114) {
                            throw new IllegalStateException();
                        }
                    }
                    if (n4 == 0) {
                        if (n5 >= -453940114) {
                            throw new IllegalStateException();
                        }
                        this.setFlagOff(n, n2, 512, 1835747327);
                        this.setFlagOff(n - 1, n2 + 1, 8192, 1835747327);
                    }
                    if (n4 == 1) {
                        this.setFlagOff(n, n2, 2048, 1835747327);
                        this.setFlagOff(n + 1, n2 + 1, 32768, 1835747327);
                    }
                    if (2 == n4) {
                        if (n5 >= -453940114) {
                            throw new IllegalStateException();
                        }
                        this.setFlagOff(n, n2, 8192, 1835747327);
                        this.setFlagOff(n + 1, n2 - 1, 512, 1835747327);
                    }
                    if (3 == n4) {
                        if (n5 >= -453940114) {
                            return;
                        }
                        this.setFlagOff(n, n2, 32768, 1835747327);
                        this.setFlagOff(n - 1, n2 - 1, 2048, 1835747327);
                    }
                }
                if (n3 == 2) {
                    if (0 == n4) {
                        if (n5 >= -453940114) {
                            throw new IllegalStateException();
                        }
                        this.setFlagOff(n, n2, 66560, 1835747327);
                        this.setFlagOff(n - 1, n2, 4096, 1835747327);
                        this.setFlagOff(n, 1 + n2, 16384, 1835747327);
                    }
                    if (1 == n4) {
                        if (n5 >= -453940114) {
                            return;
                        }
                        this.setFlagOff(n, n2, 5120, 1835747327);
                        this.setFlagOff(n, n2 + 1, 16384, 1835747327);
                        this.setFlagOff(n + 1, n2, 65536, 1835747327);
                    }
                    if (2 == n4) {
                        if (n5 >= -453940114) {
                            throw new IllegalStateException();
                        }
                        this.setFlagOff(n, n2, 20480, 1835747327);
                        this.setFlagOff(1 + n, n2, 65536, 1835747327);
                        this.setFlagOff(n, n2 - 1, 1024, 1835747327);
                    }
                    if (3 == n4) {
                        if (n5 >= -453940114) {
                            return;
                        }
                        this.setFlagOff(n, n2, 81920, 1835747327);
                        this.setFlagOff(n, n2 - 1, 1024, 1835747327);
                        this.setFlagOff(n - 1, n2, 4096, 1835747327);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "if.aq(" + ')');
        }
    }
    
    public void aj(int n, int n2) {
        n -= 1724654229 * this.xInset;
        n2 -= this.yInset * -216630539;
        final int[] array = this.flags[n];
        final int n3 = n2;
        array[n3] |= 0x40000;
    }
    
    public void ag(int n, int n2, final int n3, final int n4, final boolean b) {
        n -= 1724654229 * this.xInset;
        n2 -= -216630539 * this.yInset;
        if (0 == n3) {
            if (n4 == 0) {
                this.setFlag(n, n2, 128, -450570053);
                this.setFlag(n - 1, n2, 8, -705207428);
            }
            if (n4 == 1) {
                this.setFlag(n, n2, 2, -913335823);
                this.setFlag(n, 1 + n2, 32, 2006702046);
            }
            if (2 == n4) {
                this.setFlag(n, n2, 8, 802894547);
                this.setFlag(1 + n, n2, 128, -1392454743);
            }
            if (3 == n4) {
                this.setFlag(n, n2, 32, -933050866);
                this.setFlag(n, n2 - 1, 2, 1698191276);
            }
        }
        if (1 == n3 || 3 == n3) {
            if (0 == n4) {
                this.setFlag(n, n2, 1, -287913576);
                this.setFlag(n - 1, n2 + 1, 16, -1175165017);
            }
            if (n4 == 1) {
                this.setFlag(n, n2, 4, 1225151041);
                this.setFlag(n + 1, n2 + 1, 64, -2096453538);
            }
            if (n4 == 2) {
                this.setFlag(n, n2, 16, -234387390);
                this.setFlag(1 + n, n2 - 1, 1, -1801859421);
            }
            if (n4 == 3) {
                this.setFlag(n, n2, 64, 1407767757);
                this.setFlag(n - 1, n2 - 1, 4, 1249701739);
            }
        }
        if (n3 == 2) {
            if (n4 == 0) {
                this.setFlag(n, n2, 130, 555571354);
                this.setFlag(n - 1, n2, 8, -932593446);
                this.setFlag(n, n2 + 1, 32, 1970289536);
            }
            if (n4 == 1) {
                this.setFlag(n, n2, 10, 349690967);
                this.setFlag(n, 1 + n2, 32, -311204615);
                this.setFlag(1 + n, n2, 128, 2124419479);
            }
            if (2 == n4) {
                this.setFlag(n, n2, 40, -199807556);
                this.setFlag(n + 1, n2, 128, 857987765);
                this.setFlag(n, n2 - 1, 2, -1453221305);
            }
            if (3 == n4) {
                this.setFlag(n, n2, 160, 1035862328);
                this.setFlag(n, n2 - 1, 2, 873770609);
                this.setFlag(n - 1, n2, 8, 440304683);
            }
        }
        if (b) {
            if (n3 == 0) {
                if (n4 == 0) {
                    this.setFlag(n, n2, 65536, 863791611);
                    this.setFlag(n - 1, n2, 4096, 1682231082);
                }
                if (1 == n4) {
                    this.setFlag(n, n2, 1024, 395705888);
                    this.setFlag(n, 1 + n2, 16384, -580103569);
                }
                if (2 == n4) {
                    this.setFlag(n, n2, 4096, -1387607008);
                    this.setFlag(n + 1, n2, 65536, -177173528);
                }
                if (n4 == 3) {
                    this.setFlag(n, n2, 16384, 59948249);
                    this.setFlag(n, n2 - 1, 1024, 850301250);
                }
            }
            if (1 == n3 || n3 == 3) {
                if (0 == n4) {
                    this.setFlag(n, n2, 512, 1576698190);
                    this.setFlag(n - 1, 1 + n2, 8192, 1606101758);
                }
                if (n4 == 1) {
                    this.setFlag(n, n2, 2048, 709053500);
                    this.setFlag(n + 1, 1 + n2, 32768, 1562742907);
                }
                if (n4 == 2) {
                    this.setFlag(n, n2, 8192, 1788515499);
                    this.setFlag(n + 1, n2 - 1, 512, 368039179);
                }
                if (3 == n4) {
                    this.setFlag(n, n2, 32768, -717131397);
                    this.setFlag(n - 1, n2 - 1, 2048, -1698228738);
                }
            }
            if (n3 == 2) {
                if (0 == n4) {
                    this.setFlag(n, n2, 66560, -1234952717);
                    this.setFlag(n - 1, n2, 4096, 613841336);
                    this.setFlag(n, 1 + n2, 16384, -1571080363);
                }
                if (n4 == 1) {
                    this.setFlag(n, n2, 5120, 330371007);
                    this.setFlag(n, 1 + n2, 16384, 110707564);
                    this.setFlag(1 + n, n2, 65536, 1585422789);
                }
                if (n4 == 2) {
                    this.setFlag(n, n2, 20480, -14675941);
                    this.setFlag(n + 1, n2, 65536, -899643965);
                    this.setFlag(n, n2 - 1, 1024, 1854045168);
                }
                if (n4 == 3) {
                    this.setFlag(n, n2, 81920, 1278771453);
                    this.setFlag(n, n2 - 1, 1024, -1473235025);
                    this.setFlag(n - 1, n2, 4096, -1391145954);
                }
            }
        }
    }
    
    public void bz(int n, int n2) {
        n -= -869604221 * this.xInset;
        n2 -= -783452397 * this.yInset;
        final int[] array = this.flags[n];
        final int n3 = n2;
        array[n3] &= 0x6BB226AB;
    }
    
    public static String jn(final GrandExchangeEvent grandExchangeEvent) {
        return grandExchangeEvent.offerName;
    }
    
    public static void zb(final CollisionMap collisionMap) {
        for (int i = 0; i < 1145675465 * collisionMap.xSize; ++i) {
            for (int j = 0; j < collisionMap.ySize * -1150578375; ++j) {
                if (i != 0 && j && i < collisionMap.xSize * 1145675465 - 5 && j < collisionMap.ySize * -1150578375 - 5) {
                    collisionMap.flags[i][j] = 16777216;
                }
                else {
                    collisionMap.flags[i][j] = 16777215;
                }
            }
        }
    }
    
    void bk(final int n, final int n2, final int n3) {
        final int[] array = this.flags[n];
        array[n2] &= ~n3;
    }
    
    public void ah(int n, int n2, final int n3, final int n4, final boolean b) {
        n -= -136375268 * this.xInset;
        n2 -= -216630539 * this.yInset;
        if (0 == n3) {
            if (n4 == 0) {
                this.setFlag(n, n2, 128, 709883260);
                this.setFlag(n - 1, n2, 8, 1963037027);
            }
            if (n4 == 1) {
                this.setFlag(n, n2, 2, 1384319882);
                this.setFlag(n, 1 + n2, 32, 537310929);
            }
            if (2 == n4) {
                this.setFlag(n, n2, 8, 1434662220);
                this.setFlag(1 + n, n2, 1441280386, -891196837);
            }
            if (3 == n4) {
                this.setFlag(n, n2, 1701835372, -231070762);
                this.setFlag(n, n2 - 1, 2, -1540621355);
            }
        }
        if (1 == n3 || 3 == n3) {
            if (0 == n4) {
                this.setFlag(n, n2, 1, 1473699266);
                this.setFlag(n - 1, n2 + 1, 16, 61352518);
            }
            if (n4 == 1) {
                this.setFlag(n, n2, 4, 1198321348);
                this.setFlag(n + 1, n2 + 1, 1014977790, -2107292175);
            }
            if (n4 == 2) {
                this.setFlag(n, n2, 16, 2129461302);
                this.setFlag(1 + n, n2 - 1, 1, 111960943);
            }
            if (n4 == 3) {
                this.setFlag(n, n2, 64, 1023699633);
                this.setFlag(n - 1, n2 - 1, 4, 1818406840);
            }
        }
        if (n3 == 2) {
            if (n4 == 0) {
                this.setFlag(n, n2, 130, -289779567);
                this.setFlag(n - 1, n2, 8, 327349556);
                this.setFlag(n, n2 + 1, 1582684661, -2072391280);
            }
            if (n4 == 1) {
                this.setFlag(n, n2, 10, -1118805554);
                this.setFlag(n, 1 + n2, 32, -1381898419);
                this.setFlag(1 + n, n2, -315882283, -1896505855);
            }
            if (2 == n4) {
                this.setFlag(n, n2, 40, 145521377);
                this.setFlag(n + 1, n2, -745741292, -1369160471);
                this.setFlag(n, n2 - 1, 2, 2072462191);
            }
            if (3 == n4) {
                this.setFlag(n, n2, -1319917346, -1384526510);
                this.setFlag(n, n2 - 1, 2, 1020394931);
                this.setFlag(n - 1, n2, 8, -659557428);
            }
        }
        if (b) {
            if (n3 == 0) {
                if (n4 == 0) {
                    this.setFlag(n, n2, -324637307, 73305234);
                    this.setFlag(n - 1, n2, 1435435643, -1829784139);
                }
                if (1 == n4) {
                    this.setFlag(n, n2, -749539774, 1485345448);
                    this.setFlag(n, 1 + n2, 16384, 1350495565);
                }
                if (2 == n4) {
                    this.setFlag(n, n2, 4096, -2017258275);
                    this.setFlag(n + 1, n2, -169385526, -1334731067);
                }
                if (n4 == 3) {
                    this.setFlag(n, n2, 16384, -1424771599);
                    this.setFlag(n, n2 - 1, 488716263, -410450353);
                }
            }
            if (1 == n3 || n3 == 3) {
                if (0 == n4) {
                    this.setFlag(n, n2, 842039010, -1206117621);
                    this.setFlag(n - 1, 1 + n2, -1422254481, 2046523183);
                }
                if (n4 == 1) {
                    this.setFlag(n, n2, 2048, 1758136653);
                    this.setFlag(n + 1, 1 + n2, 32768, -2076107832);
                }
                if (n4 == 2) {
                    this.setFlag(n, n2, -620182334, 1557646433);
                    this.setFlag(n + 1, n2 - 1, 512, -21846353);
                }
                if (3 == n4) {
                    this.setFlag(n, n2, 222301457, -1362921971);
                    this.setFlag(n - 1, n2 - 1, 2048, -41417541);
                }
            }
            if (n3 == 2) {
                if (0 == n4) {
                    this.setFlag(n, n2, 1773541390, 742688443);
                    this.setFlag(n - 1, n2, -474998065, 2140545043);
                    this.setFlag(n, 1 + n2, 21329084, -239431918);
                }
                if (n4 == 1) {
                    this.setFlag(n, n2, 5120, -1962163138);
                    this.setFlag(n, 1 + n2, -659676393, 1519409792);
                    this.setFlag(1 + n, n2, 485821977, -782322890);
                }
                if (n4 == 2) {
                    this.setFlag(n, n2, 20480, -1504955701);
                    this.setFlag(n + 1, n2, 65536, -1684341899);
                    this.setFlag(n, n2 - 1, 1024, -2072589145);
                }
                if (n4 == 3) {
                    this.setFlag(n, n2, 613973027, 660053765);
                    this.setFlag(n, n2 - 1, 1024, -1451594436);
                    this.setFlag(n - 1, n2, -1159969387, -1011573868);
                }
            }
        }
    }
}
