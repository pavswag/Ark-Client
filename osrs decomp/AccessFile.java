import java.io.SyncFailedException;
import java.io.EOFException;
import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;

// 
// Decompiled by Procyon v0.5.36
// 

public final class AccessFile
{
    long offset;
    final long maxSize;
    RandomAccessFile file;
    
    public AccessFile(final File file, final String mode, long n) throws IOException {
        if (n == -1L) {
            n = Long.MAX_VALUE;
        }
        if (file.length() > n) {
            file.delete();
        }
        this.file = new RandomAccessFile(file, mode);
        this.maxSize = n * 689358929283286861L;
        this.offset = 0L;
        final int read = this.file.read();
        if (-1 != read && !mode.equals("r")) {
            this.file.seek(0L);
            this.file.write(read);
        }
        this.file.seek(0L);
    }
    
    @Override
    protected void finalize() throws Throwable {
        try {
            if (this.file != null) {
                System.out.println("");
                this.close((byte)(-85));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sy.finalize(" + ')');
        }
    }
    
    public static void vs(final AccessFile accessFile, final byte[] b, final int off, final int len) throws IOException {
        if (accessFile.offset * 8269603235961323371L + len > -5454619620217714299L * accessFile.maxSize) {
            accessFile.file.seek(accessFile.maxSize * -5454619620217714299L);
            accessFile.file.write(1);
            throw new EOFException();
        }
        accessFile.file.write(b, off, len);
        accessFile.offset += len * 1783873278372083011L;
    }
    
    public final void ao() throws IOException {
        gr(this, false, (byte)10);
    }
    
    public final void at(final byte[] b, final int off, final int len) throws IOException {
        if (this.offset * 8269603235961323371L + len > -5454619620217714299L * this.maxSize) {
            this.file.seek(this.maxSize * -5454619620217714299L);
            this.file.write(1);
            throw new EOFException();
        }
        this.file.write(b, off, len);
        this.offset += len * 1783873278372083011L;
    }
    
    public final int av(final byte[] b, final int off, final int len) throws IOException {
        final int read = this.file.read(b, off, len);
        if (read > 0) {
            this.offset += 1783873278372083011L * read;
        }
        return read;
    }
    
    public long jv() {
        return this.offset * 8269603235961323371L;
    }
    
    public final void ax(final boolean b) throws IOException {
        if (this.file != null) {
            if (b) {
                try {
                    this.file.getFD().sync();
                }
                catch (SyncFailedException ex) {}
            }
            this.file.close();
            this.file = null;
        }
    }
    
    public final void ay(final byte[] b, final int off, final int len) throws IOException {
        if (this.offset * 8269603235961323371L + len > -5454619620217714299L * this.maxSize) {
            this.file.seek(this.maxSize * -5454619620217714299L);
            this.file.write(1);
            throw new EOFException();
        }
        this.file.write(b, off, len);
        this.offset += len * 1783873278372083011L;
    }
    
    public final void close(final byte b) throws IOException {
        try {
            gr(this, false, (byte)10);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sy.aw(" + ')');
        }
    }
    
    final void al(final long pos) throws IOException {
        this.file.seek(pos);
        this.offset = 1783873278372083011L * pos;
    }
    
    public final void write(final byte[] b, final int off, final int len, final int n) throws IOException {
        try {
            if (this.offset * 8269603235961323371L + len > -5454619620217714299L * this.maxSize) {
                this.file.seek(this.maxSize * -5454619620217714299L);
                this.file.write(1);
                throw new EOFException();
            }
            this.file.write(b, off, len);
            this.offset += len * 1783873278372083011L;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sy.an(" + ')');
        }
    }
    
    public final void closeSync(final boolean b, final byte b2) {
        try {
            if (this.file != null) {
                if (b2 != 10) {
                    throw new IllegalStateException();
                }
                if (b) {
                    if (b2 != 10) {
                        throw new IllegalStateException();
                    }
                    try {
                        this.file.getFD().sync();
                    }
                    catch (SyncFailedException ex2) {}
                }
                this.file.close();
                this.file = null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sy.ac(" + ')');
        }
    }
    
    public final long length(final int n) throws IOException {
        try {
            return this.file.length();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sy.au(" + ')');
        }
    }
    
    public final void ai(final boolean b) throws IOException {
        if (this.file != null) {
            if (b) {
                try {
                    this.file.getFD().sync();
                }
                catch (SyncFailedException ex) {}
            }
            this.file.close();
            this.file = null;
        }
    }
    
    public static void ar(final AccessFile accessFile) throws Throwable {
        if (accessFile.file != null) {
            System.out.println("");
            accessFile.close((byte)(-9));
        }
    }
    
    public void xs(final byte[] array, final int n, final int n2) {
        this.write(array, n, n2, 185047612);
    }
    
    final void seek(final long pos) throws IOException {
        try {
            this.file.seek(pos);
            this.offset = 1783873278372083011L * pos;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sy.af(" + ')');
        }
    }
    
    public final int read(final byte[] b, final int off, final int len, final int n) throws IOException {
        try {
            final int read = this.file.read(b, off, len);
            if (read > 0) {
                if (n == -863394549) {
                    throw new IllegalStateException();
                }
                this.offset += 1783873278372083011L * read;
            }
            return read;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sy.ab(" + ')');
        }
    }
    
    public final void ag(final boolean b) throws IOException {
        if (this.file != null) {
            if (b) {
                try {
                    this.file.getFD().sync();
                }
                catch (SyncFailedException ex) {}
            }
            this.file.close();
            this.file = null;
        }
    }
    
    public void fu(final boolean b) {
        gr(this, b, (byte)10);
    }
    
    public static void gr(final AccessFile accessFile, final boolean b, final byte b2) throws IOException {
        if (accessFile == null) {
            accessFile.closeSync(b, b2);
            return;
        }
        try {
            if (accessFile.file != null) {
                if (b2 != 10) {
                    throw new IllegalStateException();
                }
                if (b) {
                    if (b2 != 10) {
                        throw new IllegalStateException();
                    }
                    try {
                        accessFile.file.getFD().sync();
                    }
                    catch (SyncFailedException ex2) {}
                }
                accessFile.file.close();
                accessFile.file = null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sy.ac(" + ')');
        }
    }
    
    public RandomAccessFile wn() {
        return this.file;
    }
    
    public static void xt(final AccessFile accessFile, final long pos) throws IOException {
        accessFile.file.seek(pos);
        accessFile.offset = 1783873278372083011L * pos;
    }
    
    public final long ah() throws IOException {
        return this.file.length();
    }
    
    protected void aha() throws Throwable {
        if (this.file != null) {
            System.out.println("");
            this.close((byte)(-28));
        }
    }
}
