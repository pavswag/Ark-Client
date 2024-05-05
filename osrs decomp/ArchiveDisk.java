import java.io.IOException;
import java.io.EOFException;

// 
// Decompiled by Procyon v0.5.36
// 

public final class ArchiveDisk
{
    static byte[] ArchiveDisk_buffer;
    public static final int aa = 536870912;
    BufferedFile idxFile;
    int archive;
    int maxEntrySize;
    BufferedFile datFile;
    
    public ArchiveDisk(final int n, final BufferedFile datFile, final BufferedFile idxFile, final int n2) {
        this.datFile = null;
        this.idxFile = null;
        this.maxEntrySize = 390060472;
        this.archive = n * -2028882017;
        this.datFile = datFile;
        this.idxFile = idxFile;
        this.maxEntrySize = n2 * -10367997;
    }
    
    static {
        ArchiveDisk.ArchiveDisk_buffer = new byte[520];
    }
    
    @Override
    public String toString() {
        try {
            return "" + 290825311 * this.archive;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qk.toString(" + ')');
        }
    }
    
    public static String cw(final ArchiveDisk archiveDisk) {
        if (archiveDisk == null) {
            return archiveDisk.toString();
        }
        return "" + 290825311 * archiveDisk.archive;
    }
    
    boolean ao(final int n, final byte[] array, final int n2, boolean b) {
        synchronized (this.datFile) {
            try {
                int n3;
                if (b) {
                    if (this.idxFile.length((short)15511) < 6 * n + 6) {
                        return false;
                    }
                    BufferedFile.cu(this.idxFile, 6 * n);
                    this.idxFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 6, 126662186);
                    n3 = (ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[3] & 0x74F6FE6D) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 8));
                    if (n3 <= 0 || n3 > this.datFile.length((short)4849) / 520L) {
                        return false;
                    }
                }
                else {
                    n3 = (int)((this.datFile.length((short)17085) + 519L) / 520L);
                    if (n3 == 0) {
                        n3 = 1;
                    }
                }
                ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n2 >> 16);
                ArchiveDisk.ArchiveDisk_buffer[1] = (byte)(n2 >> 8);
                ArchiveDisk.ArchiveDisk_buffer[2] = (byte)n2;
                ArchiveDisk.ArchiveDisk_buffer[3] = (byte)(n3 >> 16);
                ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n3 >> 8);
                ArchiveDisk.ArchiveDisk_buffer[5] = (byte)n3;
                BufferedFile.cu(this.idxFile, n * 6);
                BufferedFile.gu(this.idxFile, ArchiveDisk.ArchiveDisk_buffer, 0, 6, (byte)3);
                int i = 0;
                int n4 = 0;
                while (i < n2) {
                    int n5 = 0;
                    if (b) {
                        BufferedFile.cu(this.datFile, n3 * 520L);
                        int n6;
                        int n7;
                        int n8;
                        if (n > -1168820027) {
                            try {
                                this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 10, -1712304092);
                            }
                            catch (EOFException ex) {
                                break;
                            }
                            n6 = (ArchiveDisk.ArchiveDisk_buffer[3] & 0xF84A3B9A) + (((ArchiveDisk.ArchiveDisk_buffer[2] & 0xB84FC911) << 8) + (((ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 24)));
                            n7 = (ArchiveDisk.ArchiveDisk_buffer[5] & 0x8E4C3BD9) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xB4131394) << 8);
                            n5 = ((ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[6] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[8] & 0x7D135ED8);
                            n8 = (ArchiveDisk.ArchiveDisk_buffer[9] & 0x220FAE6B);
                        }
                        else {
                            try {
                                this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 8, -30153677);
                            }
                            catch (EOFException ex2) {
                                break;
                            }
                            n6 = (ArchiveDisk.ArchiveDisk_buffer[1] & 0xC039AB17) + ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 8);
                            n7 = (ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) + ((ArchiveDisk.ArchiveDisk_buffer[2] & 0x1FCD1608) << 8);
                            n5 = ((ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xCFBC7AB9) << 16) + (ArchiveDisk.ArchiveDisk_buffer[6] & 0xFF);
                            n8 = (ArchiveDisk.ArchiveDisk_buffer[7] & 0x6632968B);
                        }
                        if (n != n6 || n7 != n4 || n8 != 33754678 * this.archive) {
                            return false;
                        }
                        if (n5 < 0 || n5 > this.datFile.length((short)11063) / 520L) {
                            return false;
                        }
                    }
                    if (n5 == 0) {
                        b = false;
                        n5 = (int)((this.datFile.length((short)14444) + 519L) / 520L);
                        if (n5 == 0) {
                            ++n5;
                        }
                        if (n3 == n5) {
                            ++n5;
                        }
                    }
                    if (n > -1789527019) {
                        if (n2 - i <= 748381974) {
                            n5 = 0;
                        }
                        ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n >> 24);
                        ArchiveDisk.ArchiveDisk_buffer[1] = (byte)(n >> 16);
                        ArchiveDisk.ArchiveDisk_buffer[2] = (byte)(n >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[3] = (byte)n;
                        ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n4 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[5] = (byte)n4;
                        ArchiveDisk.ArchiveDisk_buffer[6] = (byte)(n5 >> 16);
                        ArchiveDisk.ArchiveDisk_buffer[7] = (byte)(n5 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[8] = (byte)n5;
                        ArchiveDisk.ArchiveDisk_buffer[9] = (byte)(-852812892 * this.archive);
                        BufferedFile.cu(this.datFile, n3 * 520L);
                        BufferedFile.gu(this.datFile, ArchiveDisk.ArchiveDisk_buffer, 0, 10, (byte)3);
                        int n9 = n2 - i;
                        if (n9 > 510) {
                            n9 = 510;
                        }
                        BufferedFile.gu(this.datFile, array, i, n9, (byte)3);
                        i += n9;
                    }
                    else {
                        if (n2 - i <= 886701872) {
                            n5 = 0;
                        }
                        ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[1] = (byte)n;
                        ArchiveDisk.ArchiveDisk_buffer[2] = (byte)(n4 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[3] = (byte)n4;
                        ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n5 >> 16);
                        ArchiveDisk.ArchiveDisk_buffer[5] = (byte)(n5 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[6] = (byte)n5;
                        ArchiveDisk.ArchiveDisk_buffer[7] = (byte)(290825311 * this.archive);
                        BufferedFile.cu(this.datFile, 520L * n3);
                        BufferedFile.gu(this.datFile, ArchiveDisk.ArchiveDisk_buffer, 0, 8, (byte)3);
                        int n10 = n2 - i;
                        if (n10 > 512) {
                            n10 = -1379454765;
                        }
                        BufferedFile.gu(this.datFile, array, i, n10, (byte)3);
                        i += n10;
                    }
                    n3 = n5;
                    ++n4;
                }
                return true;
            }
            catch (IOException ex3) {
                return false;
            }
        }
    }
    
    public boolean at(final int i, final byte[] array, final int j) {
        synchronized (this.datFile) {
            if (j < 0 || j > -479445333 * this.maxEntrySize) {
                throw new IllegalArgumentException("" + this.archive * 290825311 + (char)333845924 + i + ',' + j);
            }
            boolean b = this.write0(i, array, j, true, 1391674251);
            if (!b) {
                b = this.write0(i, array, j, false, 903876072);
            }
            return b;
        }
    }
    
    boolean ay(final int n, final byte[] array, final int n2, boolean b) {
        synchronized (this.datFile) {
            try {
                int n3;
                if (b) {
                    if (this.idxFile.length((short)26274) < 6 * n + 6) {
                        return false;
                    }
                    BufferedFile.cu(this.idxFile, 6 * n);
                    this.idxFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 6, -596128145);
                    n3 = (ArchiveDisk.ArchiveDisk_buffer[5] & 0xC876E3B4) + (((ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xC9BB45F6) << 8));
                    if (n3 <= 0 || n3 > this.datFile.length((short)20707) / 520L) {
                        return false;
                    }
                }
                else {
                    n3 = (int)((this.datFile.length((short)7506) + 519L) / 520L);
                    if (n3 == 0) {
                        n3 = 1;
                    }
                }
                ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n2 >> 16);
                ArchiveDisk.ArchiveDisk_buffer[1] = (byte)(n2 >> 8);
                ArchiveDisk.ArchiveDisk_buffer[2] = (byte)n2;
                ArchiveDisk.ArchiveDisk_buffer[3] = (byte)(n3 >> 16);
                ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n3 >> 8);
                ArchiveDisk.ArchiveDisk_buffer[5] = (byte)n3;
                BufferedFile.cu(this.idxFile, n * 6);
                BufferedFile.gu(this.idxFile, ArchiveDisk.ArchiveDisk_buffer, 0, 6, (byte)3);
                int i = 0;
                int n4 = 0;
                while (i < n2) {
                    int n5 = 0;
                    if (b) {
                        BufferedFile.cu(this.datFile, n3 * 520L);
                        int n6;
                        int n7;
                        int n8;
                        if (n > 65535) {
                            try {
                                this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 10, -387992562);
                            }
                            catch (EOFException ex) {
                                break;
                            }
                            n6 = (ArchiveDisk.ArchiveDisk_buffer[3] & 0x15AA3CDD) + (((ArchiveDisk.ArchiveDisk_buffer[2] & 0x271EC11D) << 8) + (((ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 24)));
                            n7 = (ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 8);
                            n5 = ((ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[6] & 0xEA8E5707) << 16) + (ArchiveDisk.ArchiveDisk_buffer[8] & 0xFF);
                            n8 = (ArchiveDisk.ArchiveDisk_buffer[9] & 0x77B78B0A);
                        }
                        else {
                            try {
                                this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 8, -659966561);
                            }
                            catch (EOFException ex2) {
                                break;
                            }
                            n6 = (ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) + ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 8);
                            n7 = (ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) + ((ArchiveDisk.ArchiveDisk_buffer[2] & 0x107A946A) << 8);
                            n5 = ((ArchiveDisk.ArchiveDisk_buffer[5] & 0xCA03A5A1) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[6] & 0xFF);
                            n8 = (ArchiveDisk.ArchiveDisk_buffer[7] & 0xBEE83121);
                        }
                        if (n != n6 || n7 != n4 || n8 != 1978206681 * this.archive) {
                            return false;
                        }
                        if (n5 < 0 || n5 > this.datFile.length((short)12537) / 520L) {
                            return false;
                        }
                    }
                    if (n5 == 0) {
                        b = false;
                        n5 = (int)((this.datFile.length((short)25992) + 519L) / 520L);
                        if (n5 == 0) {
                            ++n5;
                        }
                        if (n3 == n5) {
                            ++n5;
                        }
                    }
                    if (n > 828167653) {
                        if (n2 - i <= 510) {
                            n5 = 0;
                        }
                        ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n >> 24);
                        ArchiveDisk.ArchiveDisk_buffer[1] = (byte)(n >> 16);
                        ArchiveDisk.ArchiveDisk_buffer[2] = (byte)(n >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[3] = (byte)n;
                        ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n4 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[5] = (byte)n4;
                        ArchiveDisk.ArchiveDisk_buffer[6] = (byte)(n5 >> 16);
                        ArchiveDisk.ArchiveDisk_buffer[7] = (byte)(n5 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[8] = (byte)n5;
                        ArchiveDisk.ArchiveDisk_buffer[9] = (byte)(-1313490203 * this.archive);
                        BufferedFile.cu(this.datFile, n3 * 520L);
                        BufferedFile.gu(this.datFile, ArchiveDisk.ArchiveDisk_buffer, 0, 10, (byte)3);
                        int n9 = n2 - i;
                        if (n9 > 190439627) {
                            n9 = 510;
                        }
                        BufferedFile.gu(this.datFile, array, i, n9, (byte)3);
                        i += n9;
                    }
                    else {
                        if (n2 - i <= -166667232) {
                            n5 = 0;
                        }
                        ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[1] = (byte)n;
                        ArchiveDisk.ArchiveDisk_buffer[2] = (byte)(n4 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[3] = (byte)n4;
                        ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n5 >> 16);
                        ArchiveDisk.ArchiveDisk_buffer[5] = (byte)(n5 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[6] = (byte)n5;
                        ArchiveDisk.ArchiveDisk_buffer[7] = (byte)(290825311 * this.archive);
                        BufferedFile.cu(this.datFile, 520L * n3);
                        BufferedFile.gu(this.datFile, ArchiveDisk.ArchiveDisk_buffer, 0, 8, (byte)3);
                        int n10 = n2 - i;
                        if (n10 > 512) {
                            n10 = -1957529029;
                        }
                        BufferedFile.gu(this.datFile, array, i, n10, (byte)3);
                        i += n10;
                    }
                    n3 = n5;
                    ++n4;
                }
                return true;
            }
            catch (IOException ex3) {
                return false;
            }
        }
    }
    
    public static String oa(final ArchiveDisk archiveDisk) {
        if (archiveDisk == null) {
            archiveDisk.toString();
        }
        return "" + 290825311 * archiveDisk.archive;
    }
    
    boolean write0(final int n, final byte[] array, final int n2, boolean b, final int n3) {
        try {
            synchronized (this.datFile) {
                try {
                    int n4 = 0;
                    Label_0195: {
                        if (b) {
                            if (this.idxFile.length((short)26864) < 6 * n + 6) {
                                return false;
                            }
                            BufferedFile.cu(this.idxFile, 6 * n);
                            this.idxFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 6, -1326287571);
                            n4 = (ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 8));
                            if (n4 > 0) {
                                if (n3 <= -630482265) {
                                    throw new IllegalStateException();
                                }
                                if (n4 <= this.datFile.length((short)28195) / 520L) {
                                    break Label_0195;
                                }
                            }
                            return false;
                        }
                        else {
                            n4 = (int)((this.datFile.length((short)24009) + 519L) / 520L);
                            if (n4 == 0) {
                                if (n3 <= -630482265) {
                                    throw new IllegalStateException();
                                }
                                n4 = 1;
                            }
                        }
                    }
                    ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n2 >> 16);
                    ArchiveDisk.ArchiveDisk_buffer[1] = (byte)(n2 >> 8);
                    ArchiveDisk.ArchiveDisk_buffer[2] = (byte)n2;
                    ArchiveDisk.ArchiveDisk_buffer[3] = (byte)(n4 >> 16);
                    ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n4 >> 8);
                    ArchiveDisk.ArchiveDisk_buffer[5] = (byte)n4;
                    BufferedFile.cu(this.idxFile, n * 6);
                    BufferedFile.gu(this.idxFile, ArchiveDisk.ArchiveDisk_buffer, 0, 6, (byte)3);
                    int i = 0;
                    int n5 = 0;
                    while (i < n2) {
                        if (n3 <= -630482265) {
                            throw new IllegalStateException();
                        }
                        int n6 = 0;
                        Label_0757: {
                            if (b) {
                                if (n3 <= -630482265) {
                                    throw new IllegalStateException();
                                }
                                BufferedFile.cu(this.datFile, n4 * 520L);
                                int n7;
                                int n8;
                                int n9;
                                if (n > 65535) {
                                    if (n3 <= -630482265) {
                                        throw new IllegalStateException();
                                    }
                                    try {
                                        this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 10, -1526152922);
                                    }
                                    catch (EOFException ex2) {
                                        break;
                                    }
                                    n7 = (ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) << 8) + (((ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 24)));
                                    n8 = (ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 8);
                                    n6 = ((ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[6] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[8] & 0xFF);
                                    n9 = (ArchiveDisk.ArchiveDisk_buffer[9] & 0xFF);
                                }
                                else {
                                    try {
                                        this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 8, -262970219);
                                    }
                                    catch (EOFException ex3) {
                                        break;
                                    }
                                    n7 = (ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) + ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 8);
                                    n8 = (ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) + ((ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) << 8);
                                    n6 = ((ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[6] & 0xFF);
                                    n9 = (ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF);
                                }
                                if (n == n7 && n8 == n5) {
                                    if (n3 <= -630482265) {
                                        throw new IllegalStateException();
                                    }
                                    if (n9 == 290825311 * this.archive) {
                                        if (n6 >= 0) {
                                            if (n3 <= -630482265) {
                                                throw new IllegalStateException();
                                            }
                                            if (n6 <= this.datFile.length((short)4558) / 520L) {
                                                break Label_0757;
                                            }
                                            if (n3 <= -630482265) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        return false;
                                    }
                                    if (n3 <= -630482265) {
                                        throw new IllegalStateException();
                                    }
                                }
                                return false;
                            }
                        }
                        if (n6 == 0) {
                            if (n3 <= -630482265) {
                                throw new IllegalStateException();
                            }
                            b = false;
                            n6 = (int)((this.datFile.length((short)17349) + 519L) / 520L);
                            if (n6 == 0) {
                                if (n3 <= -630482265) {
                                    throw new IllegalStateException();
                                }
                                ++n6;
                            }
                            if (n4 == n6) {
                                if (n3 <= -630482265) {
                                    throw new IllegalStateException();
                                }
                                ++n6;
                            }
                        }
                        if (n > 65535) {
                            if (n3 <= -630482265) {
                                throw new IllegalStateException();
                            }
                            if (n2 - i <= 510) {
                                if (n3 <= -630482265) {
                                    throw new IllegalStateException();
                                }
                                n6 = 0;
                            }
                            ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n >> 24);
                            ArchiveDisk.ArchiveDisk_buffer[1] = (byte)(n >> 16);
                            ArchiveDisk.ArchiveDisk_buffer[2] = (byte)(n >> 8);
                            ArchiveDisk.ArchiveDisk_buffer[3] = (byte)n;
                            ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n5 >> 8);
                            ArchiveDisk.ArchiveDisk_buffer[5] = (byte)n5;
                            ArchiveDisk.ArchiveDisk_buffer[6] = (byte)(n6 >> 16);
                            ArchiveDisk.ArchiveDisk_buffer[7] = (byte)(n6 >> 8);
                            ArchiveDisk.ArchiveDisk_buffer[8] = (byte)n6;
                            ArchiveDisk.ArchiveDisk_buffer[9] = (byte)(290825311 * this.archive);
                            BufferedFile.cu(this.datFile, n4 * 520L);
                            BufferedFile.gu(this.datFile, ArchiveDisk.ArchiveDisk_buffer, 0, 10, (byte)3);
                            int n10 = n2 - i;
                            if (n10 > 510) {
                                n10 = 510;
                            }
                            BufferedFile.gu(this.datFile, array, i, n10, (byte)3);
                            i += n10;
                        }
                        else {
                            if (n2 - i <= 512) {
                                if (n3 <= -630482265) {
                                    throw new IllegalStateException();
                                }
                                n6 = 0;
                            }
                            ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n >> 8);
                            ArchiveDisk.ArchiveDisk_buffer[1] = (byte)n;
                            ArchiveDisk.ArchiveDisk_buffer[2] = (byte)(n5 >> 8);
                            ArchiveDisk.ArchiveDisk_buffer[3] = (byte)n5;
                            ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n6 >> 16);
                            ArchiveDisk.ArchiveDisk_buffer[5] = (byte)(n6 >> 8);
                            ArchiveDisk.ArchiveDisk_buffer[6] = (byte)n6;
                            ArchiveDisk.ArchiveDisk_buffer[7] = (byte)(290825311 * this.archive);
                            BufferedFile.cu(this.datFile, 520L * n4);
                            BufferedFile.gu(this.datFile, ArchiveDisk.ArchiveDisk_buffer, 0, 8, (byte)3);
                            int n11 = n2 - i;
                            if (n11 > 512) {
                                n11 = 512;
                            }
                            BufferedFile.gu(this.datFile, array, i, n11, (byte)3);
                            i += n11;
                        }
                        n4 = n6;
                        ++n5;
                    }
                    return true;
                }
                catch (IOException ex4) {
                    return false;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qk.aw(" + ')');
        }
    }
    
    public boolean al(final int i, final byte[] array, final int j) {
        synchronized (this.datFile) {
            if (j < 0 || j > -1693907806 * this.maxEntrySize) {
                throw new IllegalArgumentException("" + this.archive * 328653028 + (char)(-891933517) + i + ',' + j);
            }
            boolean b = this.write0(i, array, j, true, 1398033084);
            if (!b) {
                b = this.write0(i, array, j, false, 1339662100);
            }
            return b;
        }
    }
    
    public boolean write(final int i, final byte[] array, final int j, final int n) {
        try {
            synchronized (this.datFile) {
                if (j >= 0) {
                    if (j <= -479445333 * this.archive) {
                        boolean b = this.write0(i, array, j, true, 6791256);
                        if (!b) {
                            b = this.write0(i, array, j, false, -194985311);
                        }
                        return b;
                    }
                    if (n == 515069415) {
                        throw new IllegalStateException();
                    }
                }
                throw new IllegalArgumentException("" + this.maxEntrySize * 290825311 + ',' + i + ',' + j);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qk.an(" + ')');
        }
    }
    
    public byte[] ac(final int n) {
        synchronized (this.datFile) {
            try {
                if (this.idxFile.length((short)516) < 6 + 6 * n) {
                    return null;
                }
                BufferedFile.cu(this.idxFile, n * 6);
                this.idxFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 6, -2088805856);
                final int n2 = (ArchiveDisk.ArchiveDisk_buffer[2] & 0xA25727FC) + (((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) << 8));
                int n3 = ((ArchiveDisk.ArchiveDisk_buffer[4] & 0x850605FB) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[5] & 0xC39D3097);
                if (n2 < 0 || n2 > -479445333 * this.maxEntrySize) {
                    return null;
                }
                if (n3 <= 0 || n3 > this.datFile.length((short)28613) / 520L) {
                    return null;
                }
                final byte[] array = new byte[n2];
                int i = 0;
                int n4 = 0;
                while (i < n2) {
                    if (n3 == 0) {
                        return null;
                    }
                    BufferedFile.cu(this.datFile, n3 * 520L);
                    int n5 = n2 - i;
                    int n6;
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    if (n > -167200663) {
                        if (n5 > 510) {
                            n5 = -1157568698;
                        }
                        n6 = 10;
                        this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, n5 + n6, -852094085);
                        n7 = (ArchiveDisk.ArchiveDisk_buffer[3] & 0x9CFA94B8) + (((ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) << 8) + (((ArchiveDisk.ArchiveDisk_buffer[1] & 0xE4A6D4F8) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 24)));
                        n8 = (ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xDEB5B90A) << 8);
                        n9 = (ArchiveDisk.ArchiveDisk_buffer[8] & 0x3FF86CFA) + (((ArchiveDisk.ArchiveDisk_buffer[6] & 0x7B852069) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[7] & 0x67828DFE) << 8));
                        n10 = (ArchiveDisk.ArchiveDisk_buffer[9] & 0x501AA2B7);
                    }
                    else {
                        if (n5 > -2065983434) {
                            n5 = -960422378;
                        }
                        n6 = 8;
                        this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, n6 + n5, -1997129583);
                        n7 = ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xBB5A65F1) << 8) + (ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF);
                        n8 = ((ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) << 8) + (ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF);
                        n9 = ((ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[6] & 0xFF);
                        n10 = (ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF);
                    }
                    if (n7 != n || n4 != n8 || n10 != 290825311 * this.archive) {
                        return null;
                    }
                    if (n9 < 0 || n9 > this.datFile.length((short)25273) / 520L) {
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
    
    boolean aa(final int n, final byte[] array, final int n2, boolean b) {
        synchronized (this.datFile) {
            try {
                int n3;
                if (b) {
                    if (this.idxFile.length((short)8840) < 6 * n + 6) {
                        return false;
                    }
                    BufferedFile.cu(this.idxFile, 6 * n);
                    this.idxFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 6, -1659660608);
                    n3 = (ArchiveDisk.ArchiveDisk_buffer[5] & 0xE8C65154) + (((ArchiveDisk.ArchiveDisk_buffer[3] & 0xFA1289AF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0x7B9F4B9) << 8));
                    if (n3 <= 0 || n3 > this.datFile.length((short)18989) / 520L) {
                        return false;
                    }
                }
                else {
                    n3 = (int)((this.datFile.length((short)31694) + 519L) / 520L);
                    if (n3 == 0) {
                        n3 = 1;
                    }
                }
                ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n2 >> 16);
                ArchiveDisk.ArchiveDisk_buffer[1] = (byte)(n2 >> 8);
                ArchiveDisk.ArchiveDisk_buffer[2] = (byte)n2;
                ArchiveDisk.ArchiveDisk_buffer[3] = (byte)(n3 >> 16);
                ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n3 >> 8);
                ArchiveDisk.ArchiveDisk_buffer[5] = (byte)n3;
                BufferedFile.cu(this.idxFile, n * 6);
                BufferedFile.gu(this.idxFile, ArchiveDisk.ArchiveDisk_buffer, 0, 6, (byte)3);
                int i = 0;
                int n4 = 0;
                while (i < n2) {
                    int n5 = 0;
                    if (b) {
                        BufferedFile.cu(this.datFile, n3 * 520L);
                        int n6;
                        int n7;
                        int n8;
                        if (n > 1720760131) {
                            try {
                                this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 10, -2112790407);
                            }
                            catch (EOFException ex) {
                                break;
                            }
                            n6 = (ArchiveDisk.ArchiveDisk_buffer[3] & 0x5A48A2B0) + (((ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) << 8) + (((ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[0] & 0x9537AB08) << 24)));
                            n7 = (ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 8);
                            n5 = ((ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[6] & 0x3D793D9D) << 16) + (ArchiveDisk.ArchiveDisk_buffer[8] & 0xFF);
                            n8 = (ArchiveDisk.ArchiveDisk_buffer[9] & 0xFF);
                        }
                        else {
                            try {
                                this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 8, -424391354);
                            }
                            catch (EOFException ex2) {
                                break;
                            }
                            n6 = (ArchiveDisk.ArchiveDisk_buffer[1] & 0x1163C9E1) + ((ArchiveDisk.ArchiveDisk_buffer[0] & 0x307DF8C) << 8);
                            n7 = (ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) + ((ArchiveDisk.ArchiveDisk_buffer[2] & 0xD3197072) << 8);
                            n5 = ((ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xB517BC28) << 16) + (ArchiveDisk.ArchiveDisk_buffer[6] & 0xAFC1E9A7);
                            n8 = (ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF);
                        }
                        if (n != n6 || n7 != n4 || n8 != 380907430 * this.archive) {
                            return false;
                        }
                        if (n5 < 0 || n5 > this.datFile.length((short)31931) / 520L) {
                            return false;
                        }
                    }
                    if (n5 == 0) {
                        b = false;
                        n5 = (int)((this.datFile.length((short)6545) + 519L) / 520L);
                        if (n5 == 0) {
                            ++n5;
                        }
                        if (n3 == n5) {
                            ++n5;
                        }
                    }
                    if (n > -2130748099) {
                        if (n2 - i <= 510) {
                            n5 = 0;
                        }
                        ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n >> 24);
                        ArchiveDisk.ArchiveDisk_buffer[1] = (byte)(n >> 16);
                        ArchiveDisk.ArchiveDisk_buffer[2] = (byte)(n >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[3] = (byte)n;
                        ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n4 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[5] = (byte)n4;
                        ArchiveDisk.ArchiveDisk_buffer[6] = (byte)(n5 >> 16);
                        ArchiveDisk.ArchiveDisk_buffer[7] = (byte)(n5 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[8] = (byte)n5;
                        ArchiveDisk.ArchiveDisk_buffer[9] = (byte)(290825311 * this.archive);
                        BufferedFile.cu(this.datFile, n3 * 520L);
                        BufferedFile.gu(this.datFile, ArchiveDisk.ArchiveDisk_buffer, 0, 10, (byte)3);
                        int n9 = n2 - i;
                        if (n9 > 510) {
                            n9 = 277070528;
                        }
                        BufferedFile.gu(this.datFile, array, i, n9, (byte)3);
                        i += n9;
                    }
                    else {
                        if (n2 - i <= 512) {
                            n5 = 0;
                        }
                        ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[1] = (byte)n;
                        ArchiveDisk.ArchiveDisk_buffer[2] = (byte)(n4 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[3] = (byte)n4;
                        ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n5 >> 16);
                        ArchiveDisk.ArchiveDisk_buffer[5] = (byte)(n5 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[6] = (byte)n5;
                        ArchiveDisk.ArchiveDisk_buffer[7] = (byte)(290825311 * this.archive);
                        BufferedFile.cu(this.datFile, 520L * n3);
                        BufferedFile.gu(this.datFile, ArchiveDisk.ArchiveDisk_buffer, 0, 8, (byte)3);
                        int n10 = n2 - i;
                        if (n10 > -413656901) {
                            n10 = 512;
                        }
                        BufferedFile.gu(this.datFile, array, i, n10, (byte)3);
                        i += n10;
                    }
                    n3 = n5;
                    ++n4;
                }
                return true;
            }
            catch (IOException ex3) {
                return false;
            }
        }
    }
    
    public byte[] read(final int n, final int n2) {
        try {
            synchronized (this.datFile) {
                try {
                    if (this.datFile.length((short)13501) >= 6 + 6 * n) {
                        BufferedFile.cu(this.idxFile, n * 6);
                        this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 6, -1982528940);
                        final int n3 = (ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) << 8));
                        int n4 = ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF);
                        if (n3 >= 0) {
                            if (n2 == -1582814839) {
                                throw new IllegalStateException();
                            }
                            if (n3 <= -479445333 * this.archive) {
                                if (n4 > 0) {
                                    if (n2 == -1582814839) {
                                        throw new IllegalStateException();
                                    }
                                    if (n4 <= this.datFile.length((short)28270) / 520L) {
                                        final byte[] array = new byte[n3];
                                        int i = 0;
                                        int n5 = 0;
                                        while (i < n3) {
                                            if (n4 != 0) {
                                                BufferedFile.cu(this.idxFile, n4 * 520L);
                                                int n6 = n3 - i;
                                                int n7;
                                                int n8;
                                                int n9;
                                                int n10;
                                                int n11;
                                                if (n > 65535) {
                                                    if (n2 == -1582814839) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (n6 > 510) {
                                                        if (n2 == -1582814839) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n6 = 510;
                                                    }
                                                    n7 = 10;
                                                    this.idxFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, n6 + n7, 287971154);
                                                    n8 = (ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) << 8) + (((ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 24)));
                                                    n9 = (ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 8);
                                                    n10 = (ArchiveDisk.ArchiveDisk_buffer[8] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[6] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF) << 8));
                                                    n11 = (ArchiveDisk.ArchiveDisk_buffer[9] & 0xFF);
                                                }
                                                else {
                                                    if (n6 > 512) {
                                                        if (n2 == -1582814839) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n6 = 512;
                                                    }
                                                    n7 = 8;
                                                    this.idxFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, n7 + n6, -1958803816);
                                                    n8 = ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 8) + (ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF);
                                                    n9 = ((ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) << 8) + (ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF);
                                                    n10 = ((ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[6] & 0xFF);
                                                    n11 = (ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF);
                                                }
                                                if (n8 == n) {
                                                    if (n2 == -1582814839) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (n5 == n9) {
                                                        if (n2 == -1582814839) {
                                                            throw new IllegalStateException();
                                                        }
                                                        if (n11 == 290825311 * this.archive) {
                                                            if (n10 >= 0) {
                                                                if (n2 == -1582814839) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                if (n10 <= this.idxFile.length((short)10276) / 520L) {
                                                                    for (int n12 = n6 + n7, j = n7; j < n12; ++j) {
                                                                        array[i++] = ArchiveDisk.ArchiveDisk_buffer[j];
                                                                    }
                                                                    n4 = n10;
                                                                    ++n5;
                                                                    continue;
                                                                }
                                                            }
                                                            return null;
                                                        }
                                                        if (n2 == -1582814839) {
                                                            throw new IllegalStateException();
                                                        }
                                                    }
                                                }
                                                return null;
                                            }
                                            if (n2 == -1582814839) {
                                                throw new IllegalStateException();
                                            }
                                            return null;
                                        }
                                        return array;
                                    }
                                    if (n2 == -1582814839) {
                                        throw new IllegalStateException();
                                    }
                                }
                                return null;
                            }
                            if (n2 == -1582814839) {
                                throw new IllegalStateException();
                            }
                        }
                        return null;
                    }
                    if (n2 == -1582814839) {
                        throw new IllegalStateException();
                    }
                    return null;
                }
                catch (IOException ex2) {
                    return null;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qk.af(" + ')');
        }
    }
    
    public byte[] ab(final int n) {
        synchronized (this.datFile) {
            try {
                if (this.idxFile.length((short)29687) < 6 + 6 * n) {
                    return null;
                }
                BufferedFile.cu(this.idxFile, n * 6);
                this.idxFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 6, -1571356789);
                final int n2 = (ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[0] & 0x89BDD15) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[1] & 0x130317A3) << 8));
                int n3 = ((ArchiveDisk.ArchiveDisk_buffer[4] & 0x54D4771F) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[5] & 0xC312D159);
                if (n2 < 0 || n2 > -503691843 * this.maxEntrySize) {
                    return null;
                }
                if (n3 <= 0 || n3 > this.datFile.length((short)6609) / 520L) {
                    return null;
                }
                final byte[] array = new byte[n2];
                int i = 0;
                int n4 = 0;
                while (i < n2) {
                    if (n3 == 0) {
                        return null;
                    }
                    BufferedFile.cu(this.datFile, n3 * 520L);
                    int n5 = n2 - i;
                    int n6;
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    if (n > 65535) {
                        if (n5 > -675444194) {
                            n5 = -1098672566;
                        }
                        n6 = 10;
                        this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, n5 + n6, -1041642177);
                        n7 = (ArchiveDisk.ArchiveDisk_buffer[3] & 0x246AC529) + (((ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) << 8) + (((ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[0] & 0x2E20B8ED) << 24)));
                        n8 = (ArchiveDisk.ArchiveDisk_buffer[5] & 0xAE6C1942) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 8);
                        n9 = (ArchiveDisk.ArchiveDisk_buffer[8] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[6] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF) << 8));
                        n10 = (ArchiveDisk.ArchiveDisk_buffer[9] & 0xDE897C79);
                    }
                    else {
                        if (n5 > 1378071982) {
                            n5 = 2018054947;
                        }
                        n6 = 8;
                        this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, n6 + n5, -312656792);
                        n7 = ((ArchiveDisk.ArchiveDisk_buffer[0] & 0x5E1A6B39) << 8) + (ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF);
                        n8 = ((ArchiveDisk.ArchiveDisk_buffer[2] & 0xF2408E7E) << 8) + (ArchiveDisk.ArchiveDisk_buffer[3] & 0x308FB169);
                        n9 = ((ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[6] & 0xFE69998C);
                        n10 = (ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF);
                    }
                    if (n7 != n || n4 != n8 || n10 != 290825311 * this.archive) {
                        return null;
                    }
                    if (n9 < 0 || n9 > this.datFile.length((short)24475) / 520L) {
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
    
    public byte[] aq(final int n) {
        synchronized (this.datFile) {
            try {
                if (this.idxFile.length((short)2439) < 6 + 6 * n) {
                    return null;
                }
                BufferedFile.cu(this.idxFile, n * 6);
                this.idxFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 6, -1261265671);
                final int n2 = (ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) << 8));
                int n3 = ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF);
                if (n2 < 0 || n2 > -479445333 * this.maxEntrySize) {
                    return null;
                }
                if (n3 <= 0 || n3 > this.datFile.length((short)21471) / 520L) {
                    return null;
                }
                final byte[] array = new byte[n2];
                int i = 0;
                int n4 = 0;
                while (i < n2) {
                    if (n3 == 0) {
                        return null;
                    }
                    BufferedFile.cu(this.datFile, n3 * 520L);
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
                        this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, n5 + n6, -2133039111);
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
                        this.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, n6 + n5, -1225959191);
                        n7 = ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 8) + (ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF);
                        n8 = ((ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) << 8) + (ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF);
                        n9 = ((ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[6] & 0xFF);
                        n10 = (ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF);
                    }
                    if (n7 != n || n4 != n8 || n10 != 290825311 * this.archive) {
                        return null;
                    }
                    if (n9 < 0 || n9 > this.datFile.length((short)28332) / 520L) {
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
    
    public static boolean vf(final ArchiveDisk archiveDisk, final int i, final byte[] array, final int j, final int n) {
        if (archiveDisk == null) {
            archiveDisk.write(i, array, i, i);
        }
        try {
            synchronized (archiveDisk.datFile) {
                if (j >= 0) {
                    if (j <= -479445333 * archiveDisk.maxEntrySize) {
                        boolean b = archiveDisk.write0(i, array, j, true, 6791256);
                        if (!b) {
                            b = archiveDisk.write0(i, array, j, false, -194985311);
                        }
                        return b;
                    }
                    if (n == 515069415) {
                        throw new IllegalStateException();
                    }
                }
                throw new IllegalArgumentException("" + archiveDisk.archive * 290825311 + ',' + i + ',' + j);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qk.an(" + ')');
        }
    }
    
    public static String ik(final ArchiveDisk archiveDisk) {
        if (archiveDisk == null) {
            archiveDisk.toString();
        }
        return "" + 290825311 * archiveDisk.archive;
    }
    
    public static byte[] ef(final ArchiveDisk archiveDisk, final int n, final int n2) {
        if (archiveDisk == null) {
            return archiveDisk.read(n, n);
        }
        try {
            synchronized (archiveDisk.datFile) {
                try {
                    if (archiveDisk.idxFile.length((short)13501) >= 6 + 6 * n) {
                        BufferedFile.cu(archiveDisk.idxFile, n * 6);
                        archiveDisk.idxFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, 6, -1982528940);
                        final int n3 = (ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) << 8));
                        int n4 = ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF);
                        if (n3 >= 0) {
                            if (n2 == -1582814839) {
                                throw new IllegalStateException();
                            }
                            if (n3 <= -479445333 * archiveDisk.maxEntrySize) {
                                if (n4 > 0) {
                                    if (n2 == -1582814839) {
                                        throw new IllegalStateException();
                                    }
                                    if (n4 <= archiveDisk.datFile.length((short)28270) / 520L) {
                                        final byte[] array = new byte[n3];
                                        int i = 0;
                                        int n5 = 0;
                                        while (i < n3) {
                                            if (n4 != 0) {
                                                BufferedFile.cu(archiveDisk.datFile, n4 * 520L);
                                                int n6 = n3 - i;
                                                int n7;
                                                int n8;
                                                int n9;
                                                int n10;
                                                int n11;
                                                if (n > 65535) {
                                                    if (n2 == -1582814839) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (n6 > 510) {
                                                        if (n2 == -1582814839) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n6 = 510;
                                                    }
                                                    n7 = 10;
                                                    archiveDisk.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, n6 + n7, 287971154);
                                                    n8 = (ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) << 8) + (((ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 24)));
                                                    n9 = (ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 8);
                                                    n10 = (ArchiveDisk.ArchiveDisk_buffer[8] & 0xFF) + (((ArchiveDisk.ArchiveDisk_buffer[6] & 0xFF) << 16) + ((ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF) << 8));
                                                    n11 = (ArchiveDisk.ArchiveDisk_buffer[9] & 0xFF);
                                                }
                                                else {
                                                    if (n6 > 512) {
                                                        if (n2 == -1582814839) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n6 = 512;
                                                    }
                                                    n7 = 8;
                                                    archiveDisk.datFile.read(ArchiveDisk.ArchiveDisk_buffer, 0, n7 + n6, -1958803816);
                                                    n8 = ((ArchiveDisk.ArchiveDisk_buffer[0] & 0xFF) << 8) + (ArchiveDisk.ArchiveDisk_buffer[1] & 0xFF);
                                                    n9 = ((ArchiveDisk.ArchiveDisk_buffer[2] & 0xFF) << 8) + (ArchiveDisk.ArchiveDisk_buffer[3] & 0xFF);
                                                    n10 = ((ArchiveDisk.ArchiveDisk_buffer[5] & 0xFF) << 8) + ((ArchiveDisk.ArchiveDisk_buffer[4] & 0xFF) << 16) + (ArchiveDisk.ArchiveDisk_buffer[6] & 0xFF);
                                                    n11 = (ArchiveDisk.ArchiveDisk_buffer[7] & 0xFF);
                                                }
                                                if (n8 == n) {
                                                    if (n2 == -1582814839) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (n5 == n9) {
                                                        if (n2 == -1582814839) {
                                                            throw new IllegalStateException();
                                                        }
                                                        if (n11 == 290825311 * archiveDisk.archive) {
                                                            if (n10 >= 0) {
                                                                if (n2 == -1582814839) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                if (n10 <= archiveDisk.datFile.length((short)10276) / 520L) {
                                                                    for (int n12 = n6 + n7, j = n7; j < n12; ++j) {
                                                                        array[i++] = ArchiveDisk.ArchiveDisk_buffer[j];
                                                                    }
                                                                    n4 = n10;
                                                                    ++n5;
                                                                    continue;
                                                                }
                                                            }
                                                            return null;
                                                        }
                                                        if (n2 == -1582814839) {
                                                            throw new IllegalStateException();
                                                        }
                                                    }
                                                }
                                                return null;
                                            }
                                            if (n2 == -1582814839) {
                                                throw new IllegalStateException();
                                            }
                                            return null;
                                        }
                                        return array;
                                    }
                                    if (n2 == -1582814839) {
                                        throw new IllegalStateException();
                                    }
                                }
                                return null;
                            }
                            if (n2 == -1582814839) {
                                throw new IllegalStateException();
                            }
                        }
                        return null;
                    }
                    if (n2 == -1582814839) {
                        throw new IllegalStateException();
                    }
                    return null;
                }
                catch (IOException ex2) {
                    return null;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qk.af(" + ')');
        }
    }
}
