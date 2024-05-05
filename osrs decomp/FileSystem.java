import java.io.RandomAccessFile;
import java.io.File;
import java.util.Hashtable;

// 
// Decompiled by Procyon v0.5.36
// 

public class FileSystem
{
    public static boolean FileSystem_hasPermissions;
    static Hashtable FileSystem_cacheFiles;
    public static boolean ItemDefinition_inMembersWorld;
    public static final int at = 4096;
    static final int av = 65536;
    static int[] Tiles_hue;
    
    FileSystem() throws Throwable {
        throw new Error();
    }
    
    static {
        FileSystem.FileSystem_hasPermissions = false;
        FileSystem.FileSystem_cacheFiles = new Hashtable(16);
    }
    
    public static File aw(final String key) {
        if (!FileSystem.FileSystem_hasPermissions) {
            throw new RuntimeException("");
        }
        final File file = FileSystem.FileSystem_cacheFiles.get(key);
        if (null != file) {
            return file;
        }
        final File file2 = new File(class513.FileSystem_cacheDir, key);
        RandomAccessFile randomAccessFile = null;
        try {
            if (!new File(file2.getParent()).exists()) {
                throw new RuntimeException("");
            }
            randomAccessFile = new RandomAccessFile(file2, "rw");
            final int read = randomAccessFile.read();
            randomAccessFile.seek(0L);
            randomAccessFile.write(read);
            randomAccessFile.seek(0L);
            randomAccessFile.close();
            FileSystem.FileSystem_cacheFiles.put(key, file2);
            return file2;
        }
        catch (Exception ex) {
            try {
                if (null != randomAccessFile) {
                    randomAccessFile.close();
                }
            }
            catch (Exception ex2) {}
            throw new RuntimeException();
        }
    }
    
    public static File an(final String key) {
        if (!FileSystem.FileSystem_hasPermissions) {
            throw new RuntimeException("");
        }
        final File file = FileSystem.FileSystem_cacheFiles.get(key);
        if (null != file) {
            return file;
        }
        final File file2 = new File(class513.FileSystem_cacheDir, key);
        RandomAccessFile randomAccessFile = null;
        try {
            if (!new File(file2.getParent()).exists()) {
                throw new RuntimeException("");
            }
            randomAccessFile = new RandomAccessFile(file2, "rw");
            final int read = randomAccessFile.read();
            randomAccessFile.seek(0L);
            randomAccessFile.write(read);
            randomAccessFile.seek(0L);
            randomAccessFile.close();
            FileSystem.FileSystem_cacheFiles.put(key, file2);
            return file2;
        }
        catch (Exception ex) {
            try {
                if (null != randomAccessFile) {
                    randomAccessFile.close();
                }
            }
            catch (Exception ex2) {}
            throw new RuntimeException();
        }
    }
    
    public static File ac(final String key) {
        if (!FileSystem.FileSystem_hasPermissions) {
            throw new RuntimeException("");
        }
        final File file = FileSystem.FileSystem_cacheFiles.get(key);
        if (null != file) {
            return file;
        }
        final File file2 = new File(class513.FileSystem_cacheDir, key);
        RandomAccessFile randomAccessFile = null;
        try {
            if (!new File(file2.getParent()).exists()) {
                throw new RuntimeException("");
            }
            randomAccessFile = new RandomAccessFile(file2, "rw");
            final int read = randomAccessFile.read();
            randomAccessFile.seek(0L);
            randomAccessFile.write(read);
            randomAccessFile.seek(0L);
            randomAccessFile.close();
            FileSystem.FileSystem_cacheFiles.put(key, file2);
            return file2;
        }
        catch (Exception ex) {
            try {
                if (null != randomAccessFile) {
                    randomAccessFile.close();
                }
            }
            catch (Exception ex2) {}
            throw new RuntimeException();
        }
    }
    
    public static int jt(final class397 class397, final Object o, final Object o2) {
        if (class397 == null) {
            return class397.au(o, o);
        }
        return class397.ov(class397, (class399)o, (class399)o2, 2015069283);
    }
}
