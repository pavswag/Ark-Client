import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;

// 
// Decompiled by Procyon v0.5.36
// 

public class JagexCache
{
    public static final int af = 1048576000;
    public static final int an = 1048576;
    public static final String aw = "rw";
    static File JagexCache_locationFile;
    public static int idxCount;
    public static final String al = "main_file_cache.idx";
    public static BufferedFile JagexCache_randomDat;
    public static BufferedFile JagexCache_dat2File;
    static final int ay = 70;
    public static int cacheGamebuild;
    public static final String at = "main_file_cache.idx255";
    public static final int ag = 13;
    public static BufferedFile JagexCache_idx255File;
    
    JagexCache() throws Throwable {
        throw new Error();
    }
    
    static {
        JagexCache.JagexCache_randomDat = null;
        JagexCache.JagexCache_dat2File = null;
        JagexCache.JagexCache_idx255File = null;
    }
    
    public static void ao() {
        try {
            final File file = new File(HorizontalAlignment.userHomeDirectory, "random.dat");
            Label_0162: {
                if (file.exists()) {
                    JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file, "rw", 25L), 24, 0);
                }
                else {
                    for (int i = 0; i < class96.cacheSubPaths.length; ++i) {
                        for (int j = 0; j < class130.cacheParentPaths.length; ++j) {
                            final File file2 = new File(class130.cacheParentPaths[j] + class96.cacheSubPaths[i] + File.separatorChar + "random.dat");
                            if (file2.exists()) {
                                JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file2, "rw", 25L), 24, 0);
                                break Label_0162;
                            }
                        }
                    }
                }
            }
            if (JagexCache.JagexCache_randomDat == null) {
                final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                final int read = randomAccessFile.read();
                randomAccessFile.seek(0L);
                randomAccessFile.write(read);
                randomAccessFile.seek(0L);
                randomAccessFile.close();
                JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file, "rw", 25L), 24, 0);
            }
        }
        catch (IOException ex) {}
    }
    
    public static AccessFile at(final String s, final String str, final boolean b) {
        final File file = new File(class335.cacheDir, "preferences" + s + ".dat");
        if (file.exists()) {
            try {
                return new AccessFile(file, "rw", 10000L);
            }
            catch (IOException ex) {}
        }
        String str2 = "";
        if (33 == -1325133847 * JagexCache.cacheGamebuild) {
            str2 = "_rc";
        }
        else if (34 == -1325133847 * JagexCache.cacheGamebuild) {
            str2 = "_wip";
        }
        final File file2 = new File(HorizontalAlignment.userHomeDirectory, "jagex_" + str + "_preferences" + s + str2 + ".dat");
        if (!b && file2.exists()) {
            try {
                return new AccessFile(file2, "rw", 10000L);
            }
            catch (IOException ex2) {}
        }
        try {
            return new AccessFile(file, "rw", 10000L);
        }
        catch (IOException ex3) {
            throw new RuntimeException();
        }
    }
    
    public static void ax() {
        try {
            final File file = new File(HorizontalAlignment.userHomeDirectory, "random.dat");
            Label_0162: {
                if (file.exists()) {
                    JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file, "rw", 25L), 24, 0);
                }
                else {
                    for (int i = 0; i < class96.cacheSubPaths.length; ++i) {
                        for (int j = 0; j < class130.cacheParentPaths.length; ++j) {
                            final File file2 = new File(class130.cacheParentPaths[j] + class96.cacheSubPaths[i] + File.separatorChar + "random.dat");
                            if (file2.exists()) {
                                JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file2, "rw", 25L), 24, 0);
                                break Label_0162;
                            }
                        }
                    }
                }
            }
            if (JagexCache.JagexCache_randomDat == null) {
                final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                final int read = randomAccessFile.read();
                randomAccessFile.seek(0L);
                randomAccessFile.write(read);
                randomAccessFile.seek(0L);
                randomAccessFile.close();
                JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file, "rw", 25L), 24, 0);
            }
        }
        catch (IOException ex) {}
    }
    
    public static void ay() {
        try {
            final File file = new File(HorizontalAlignment.userHomeDirectory, "random.dat");
            Label_0162: {
                if (file.exists()) {
                    JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file, "rw", 25L), 24, 0);
                }
                else {
                    for (int i = 0; i < class96.cacheSubPaths.length; ++i) {
                        for (int j = 0; j < class130.cacheParentPaths.length; ++j) {
                            final File file2 = new File(class130.cacheParentPaths[j] + class96.cacheSubPaths[i] + File.separatorChar + "random.dat");
                            if (file2.exists()) {
                                JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file2, "rw", 25L), 24, 0);
                                break Label_0162;
                            }
                        }
                    }
                }
            }
            if (JagexCache.JagexCache_randomDat == null) {
                final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                final int read = randomAccessFile.read();
                randomAccessFile.seek(0L);
                randomAccessFile.write(read);
                randomAccessFile.seek(0L);
                randomAccessFile.close();
                JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file, "rw", 25L), 24, 0);
            }
        }
        catch (IOException ex) {}
    }
    
    public static AccessFile al(final String s, final String str, final boolean b) {
        final File file = new File(class335.cacheDir, "preferences" + s + ".dat");
        if (file.exists()) {
            try {
                return new AccessFile(file, "rw", 10000L);
            }
            catch (IOException ex) {}
        }
        String str2 = "";
        if (1520906580 == -1325133847 * JagexCache.cacheGamebuild) {
            str2 = "_rc";
        }
        else if (-1268736961 == 596924080 * JagexCache.cacheGamebuild) {
            str2 = "_wip";
        }
        final File file2 = new File(HorizontalAlignment.userHomeDirectory, "jagex_" + str + "_preferences" + s + str2 + ".dat");
        if (!b && file2.exists()) {
            try {
                return new AccessFile(file2, "rw", 10000L);
            }
            catch (IOException ex2) {}
        }
        try {
            return new AccessFile(file, "rw", 10000L);
        }
        catch (IOException ex3) {
            throw new RuntimeException();
        }
    }
    
    public static File au(final String str, final String s, final int i) {
        final String s2 = (i == 0) ? "" : ("" + i);
        JagexCache.JagexCache_locationFile = new File(HorizontalAlignment.userHomeDirectory, "jagex_cl_" + str + "_" + s + s2 + ".dat");
        String pathname = null;
        String pathname2 = null;
        boolean b = false;
        if (JagexCache.JagexCache_locationFile.exists()) {
            try {
                final AccessFile accessFile = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
                final Buffer buffer = new Buffer((int)accessFile.length(2089959036));
                while (buffer.offset * -1633313603 < buffer.array.length) {
                    final int read = accessFile.read(buffer.array, -1633313603 * buffer.offset, buffer.array.length - buffer.offset * -1633313603, 1021032550);
                    if (-1 == read) {
                        throw new IOException();
                    }
                    final Buffer buffer2 = buffer;
                    buffer2.offset += -1516355947 * read;
                }
                buffer.offset = 0;
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra < 1 || ra > 3) {
                    throw new IOException("" + ra);
                }
                int ra2 = 0;
                if (ra > 1) {
                    ra2 = Buffer.ra(buffer, (byte)7);
                }
                if (ra <= 2) {
                    pathname = buffer.readStringCp1252NullCircumfixed((short)(-6844));
                    if (ra2 == 1) {
                        pathname2 = buffer.readStringCp1252NullCircumfixed((short)(-21039));
                    }
                }
                else {
                    pathname = Buffer.writeStringCp1252NullTerminated(buffer, 1604748104);
                    if (ra2 != 0) {
                        pathname2 = Buffer.writeStringCp1252NullTerminated(buffer, 1753984565);
                    }
                }
                accessFile.close((byte)(-31));
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
            if (pathname != null && !new File(pathname).exists()) {
                pathname = null;
            }
            if (pathname != null) {
                final File file = new File(pathname, "test.dat");
                boolean b2;
                try {
                    final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                    final int read2 = randomAccessFile.read();
                    randomAccessFile.seek(0L);
                    randomAccessFile.write(read2);
                    randomAccessFile.seek(0L);
                    randomAccessFile.close();
                    file.delete();
                    b2 = true;
                }
                catch (Exception ex4) {
                    b2 = false;
                }
                if (!b2) {
                    pathname = null;
                }
            }
        }
        Label_0678: {
            if (pathname == null && i == 0) {
                for (int j = 0; j < class96.cacheSubPaths.length; ++j) {
                    for (int k = 0; k < class130.cacheParentPaths.length; ++k) {
                        final File parent = new File(class130.cacheParentPaths[k] + class96.cacheSubPaths[j] + File.separatorChar + str + File.separatorChar);
                        if (parent.exists()) {
                            final File file2 = new File(parent, "test.dat");
                            boolean b3;
                            try {
                                final RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                                final int read3 = randomAccessFile2.read();
                                randomAccessFile2.seek(0L);
                                randomAccessFile2.write(read3);
                                randomAccessFile2.seek(0L);
                                randomAccessFile2.close();
                                file2.delete();
                                b3 = true;
                            }
                            catch (Exception ex5) {
                                b3 = false;
                            }
                            if (b3) {
                                pathname = parent.toString();
                                b = true;
                                break Label_0678;
                            }
                        }
                    }
                }
            }
        }
        if (pathname == null) {
            pathname = HorizontalAlignment.userHomeDirectory + File.separatorChar + "jagexcache" + s2 + File.separatorChar + str + File.separatorChar + s + File.separatorChar;
            b = true;
        }
        if (pathname2 != null) {
            final File file3 = new File(pathname2);
            final File parent2 = new File(pathname);
            try {
                final File[] listFiles = file3.listFiles();
                for (int l = 0; l < listFiles.length; ++l) {
                    final File file4 = listFiles[l];
                    if (!file4.renameTo(new File(parent2, file4.getName()))) {
                        throw new IOException();
                    }
                }
            }
            catch (Exception ex2) {
                ex2.printStackTrace();
            }
            b = true;
        }
        if (b) {
            final File file5 = new File(pathname);
            final File file6 = null;
            try {
                final AccessFile accessFile2 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
                final Buffer buffer3 = new Buffer(500);
                buffer3.writeShort(3, (byte)70);
                buffer3.writeShort((null != file6) ? 1 : 0, (byte)88);
                Buffer.ru(buffer3, file5.getPath(), (byte)(-86));
                if (file6 != null) {
                    Buffer.ru(buffer3, file6.getPath(), (byte)(-26));
                }
                accessFile2.write(buffer3.array, 0, -1633313603 * buffer3.offset, 185047612);
                accessFile2.close((byte)(-52));
            }
            catch (IOException ex3) {
                ex3.printStackTrace();
            }
        }
        return new File(pathname);
    }
    
    public static AccessFile aa(final String s, final String str, final boolean b) {
        final File file = new File(class335.cacheDir, "preferences" + s + ".dat");
        if (file.exists()) {
            try {
                return new AccessFile(file, "rw", 10000L);
            }
            catch (IOException ex) {}
        }
        String str2 = "";
        if (33 == -1325133847 * JagexCache.cacheGamebuild) {
            str2 = "_rc";
        }
        else if (34 == -1325133847 * JagexCache.cacheGamebuild) {
            str2 = "_wip";
        }
        final File file2 = new File(HorizontalAlignment.userHomeDirectory, "jagex_" + str + "_preferences" + s + str2 + ".dat");
        if (!b && file2.exists()) {
            try {
                return new AccessFile(file2, "rw", 10000L);
            }
            catch (IOException ex2) {}
        }
        try {
            return new AccessFile(file, "rw", 10000L);
        }
        catch (IOException ex3) {
            throw new RuntimeException();
        }
    }
    
    public static void ai(final Buffer buffer, final int n) {
        if (null != JagexCache.JagexCache_randomDat) {
            try {
                BufferedFile.cu(JagexCache.JagexCache_randomDat, 0L);
                BufferedFile.gu(JagexCache.JagexCache_randomDat, buffer.array, n, 24, (byte)3);
            }
            catch (Exception ex) {}
        }
    }
    
    public static File ab(final String str, final String s, final int i) {
        final String s2 = (i == 0) ? "" : ("" + i);
        JagexCache.JagexCache_locationFile = new File(HorizontalAlignment.userHomeDirectory, "jagex_cl_" + str + "_" + s + s2 + ".dat");
        String pathname = null;
        String pathname2 = null;
        boolean b = false;
        if (JagexCache.JagexCache_locationFile.exists()) {
            try {
                final AccessFile accessFile = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
                final Buffer buffer = new Buffer((int)accessFile.length(2023426130));
                while (buffer.offset * -1633313603 < buffer.array.length) {
                    final int read = accessFile.read(buffer.array, -1633313603 * buffer.offset, buffer.array.length - buffer.offset * -1633313603, 864855333);
                    if (-1 == read) {
                        throw new IOException();
                    }
                    final Buffer buffer2 = buffer;
                    buffer2.offset += -1516355947 * read;
                }
                buffer.offset = 0;
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra < 1 || ra > 3) {
                    throw new IOException("" + ra);
                }
                int ra2 = 0;
                if (ra > 1) {
                    ra2 = Buffer.ra(buffer, (byte)7);
                }
                if (ra <= 2) {
                    pathname = buffer.readStringCp1252NullCircumfixed((short)(-5554));
                    if (ra2 == 1) {
                        pathname2 = buffer.readStringCp1252NullCircumfixed((short)(-12771));
                    }
                }
                else {
                    pathname = Buffer.writeStringCp1252NullTerminated(buffer, 1699621261);
                    if (ra2 != 0) {
                        pathname2 = Buffer.writeStringCp1252NullTerminated(buffer, 2089501422);
                    }
                }
                accessFile.close((byte)(-51));
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
            if (pathname != null && !new File(pathname).exists()) {
                pathname = null;
            }
            if (pathname != null) {
                final File file = new File(pathname, "test.dat");
                boolean b2;
                try {
                    final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                    final int read2 = randomAccessFile.read();
                    randomAccessFile.seek(0L);
                    randomAccessFile.write(read2);
                    randomAccessFile.seek(0L);
                    randomAccessFile.close();
                    file.delete();
                    b2 = true;
                }
                catch (Exception ex4) {
                    b2 = false;
                }
                if (!b2) {
                    pathname = null;
                }
            }
        }
        Label_0678: {
            if (pathname == null && i == 0) {
                for (int j = 0; j < class96.cacheSubPaths.length; ++j) {
                    for (int k = 0; k < class130.cacheParentPaths.length; ++k) {
                        final File parent = new File(class130.cacheParentPaths[k] + class96.cacheSubPaths[j] + File.separatorChar + str + File.separatorChar);
                        if (parent.exists()) {
                            final File file2 = new File(parent, "test.dat");
                            boolean b3;
                            try {
                                final RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                                final int read3 = randomAccessFile2.read();
                                randomAccessFile2.seek(0L);
                                randomAccessFile2.write(read3);
                                randomAccessFile2.seek(0L);
                                randomAccessFile2.close();
                                file2.delete();
                                b3 = true;
                            }
                            catch (Exception ex5) {
                                b3 = false;
                            }
                            if (b3) {
                                pathname = parent.toString();
                                b = true;
                                break Label_0678;
                            }
                        }
                    }
                }
            }
        }
        if (pathname == null) {
            pathname = HorizontalAlignment.userHomeDirectory + File.separatorChar + "jagexcache" + s2 + File.separatorChar + str + File.separatorChar + s + File.separatorChar;
            b = true;
        }
        if (pathname2 != null) {
            final File file3 = new File(pathname2);
            final File parent2 = new File(pathname);
            try {
                final File[] listFiles = file3.listFiles();
                for (int l = 0; l < listFiles.length; ++l) {
                    final File file4 = listFiles[l];
                    if (!file4.renameTo(new File(parent2, file4.getName()))) {
                        throw new IOException();
                    }
                }
            }
            catch (Exception ex2) {
                ex2.printStackTrace();
            }
            b = true;
        }
        if (b) {
            final File file5 = new File(pathname);
            final File file6 = null;
            try {
                final AccessFile accessFile2 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
                final Buffer buffer3 = new Buffer(500);
                buffer3.writeShort(3, (byte)53);
                buffer3.writeShort((null != file6) ? 1 : 0, (byte)20);
                Buffer.ru(buffer3, file5.getPath(), (byte)(-115));
                if (file6 != null) {
                    Buffer.ru(buffer3, file6.getPath(), (byte)(-49));
                }
                accessFile2.write(buffer3.array, 0, -1633313603 * buffer3.offset, 185047612);
                accessFile2.close((byte)(-118));
            }
            catch (IOException ex3) {
                ex3.printStackTrace();
            }
        }
        return new File(pathname);
    }
    
    public static AccessFile aq(final String s, final String str, final boolean b) {
        final File file = new File(class335.cacheDir, "preferences" + s + ".dat");
        if (file.exists()) {
            try {
                return new AccessFile(file, "rw", 10000L);
            }
            catch (IOException ex) {}
        }
        String str2 = "";
        if (-1185618340 == 1332374694 * JagexCache.cacheGamebuild) {
            str2 = "_rc";
        }
        else if (1856129774 == -1325133847 * JagexCache.cacheGamebuild) {
            str2 = "_wip";
        }
        final File file2 = new File(HorizontalAlignment.userHomeDirectory, "jagex_" + str + "_preferences" + s + str2 + ".dat");
        if (!b && file2.exists()) {
            try {
                return new AccessFile(file2, "rw", 10000L);
            }
            catch (IOException ex2) {}
        }
        try {
            return new AccessFile(file, "rw", 10000L);
        }
        catch (IOException ex3) {
            throw new RuntimeException();
        }
    }
    
    static final int method952(final int n, final int n2, final int n3, final int n4, final byte b) {
        try {
            final int n5 = 65536 - Rasterizer3D.Rasterizer3D_cosine[n3 * 1024 / n4] >> 1;
            return (n * (65536 - n5) >> 16) + (n2 * n5 >> 16);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gc.ag(" + ')');
        }
    }
}
