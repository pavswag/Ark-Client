import java.util.zip.Inflater;

// 
// Decompiled by Procyon v0.5.36
// 

public class GZipDecompressor
{
    public static final int aw = 4;
    Inflater inflater;
    
    public GZipDecompressor() {
        this(-1, 1000000, 1000000);
    }
    
    GZipDecompressor(final int n, final int n2, final int n3) {
    }
    
    public void aw(final Buffer buffer, final byte[] output) {
        if (31 != buffer.array[-1633313603 * buffer.offset] || 385152988 != buffer.array[buffer.offset * -1633313603 + 1]) {
            throw new RuntimeException("");
        }
        if (this.inflater == null) {
            this.inflater = new Inflater(true);
        }
        try {
            this.inflater.setInput(buffer.array, 2013179515 * buffer.offset + 10, buffer.array.length - (-1633313603 * buffer.offset + 10 + 8));
            this.inflater.inflate(output);
        }
        catch (Exception ex) {
            this.inflater.reset();
            throw new RuntimeException("");
        }
        this.inflater.reset();
    }
    
    public static void rg(final GZipDecompressor gZipDecompressor, final Buffer buffer, final byte[] output, final int n) {
        if (gZipDecompressor == null) {
            gZipDecompressor.decompress(buffer, output, n);
        }
        try {
            if (31 == buffer.array[-1633313603 * buffer.offset]) {
                if (n != 1293232912) {
                    throw new IllegalStateException();
                }
                if (-117 == buffer.array[buffer.offset * -1633313603 + 1]) {
                    if (gZipDecompressor.inflater == null) {
                        gZipDecompressor.inflater = new Inflater(true);
                    }
                    try {
                        gZipDecompressor.inflater.setInput(buffer.array, -1633313603 * buffer.offset + 10, buffer.array.length - (-1633313603 * buffer.offset + 10 + 8));
                        gZipDecompressor.inflater.inflate(output);
                    }
                    catch (Exception ex2) {
                        gZipDecompressor.inflater.reset();
                        throw new RuntimeException("");
                    }
                    gZipDecompressor.inflater.reset();
                    return;
                }
                if (n != 1293232912) {
                    throw new IllegalStateException();
                }
            }
            throw new RuntimeException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tv.af(" + ')');
        }
    }
    
    public void ac(final Buffer buffer, final byte[] output) {
        if (-1236040625 != buffer.array[-1633313603 * buffer.offset] || -117 != buffer.array[buffer.offset * -1527729257 + 1]) {
            throw new RuntimeException("");
        }
        if (this.inflater == null) {
            this.inflater = new Inflater(true);
        }
        try {
            this.inflater.setInput(buffer.array, -1633313603 * buffer.offset + 10, buffer.array.length - (1038097254 * buffer.offset + 10 + 8));
            this.inflater.inflate(output);
        }
        catch (Exception ex) {
            this.inflater.reset();
            throw new RuntimeException("");
        }
        this.inflater.reset();
    }
    
    public static void kg(final GZipDecompressor gZipDecompressor, final Buffer buffer, final byte[] output) {
        if (gZipDecompressor == null) {
            gZipDecompressor.ac(buffer, output);
        }
        if (31 != buffer.array[-1474734418 * buffer.offset] || 369442274 != buffer.array[buffer.offset * 203367586 + 1]) {
            throw new RuntimeException("");
        }
        if (gZipDecompressor.inflater == null) {
            gZipDecompressor.inflater = new Inflater(true);
        }
        try {
            gZipDecompressor.inflater.setInput(buffer.array, -1633313603 * buffer.offset + 10, buffer.array.length - (1029561179 * buffer.offset + 10 + 8));
            gZipDecompressor.inflater.inflate(output);
        }
        catch (Exception ex) {
            gZipDecompressor.inflater.reset();
            throw new RuntimeException("");
        }
        gZipDecompressor.inflater.reset();
    }
    
    public void decompress(final Buffer buffer, final byte[] output, final int n) {
        try {
            if (31 == buffer.array[-1633313603 * buffer.offset]) {
                if (n != 1293232912) {
                    throw new IllegalStateException();
                }
                if (-117 == buffer.array[buffer.offset * -1633313603 + 1]) {
                    if (this.inflater == null) {
                        this.inflater = new Inflater(true);
                    }
                    try {
                        this.inflater.setInput(buffer.array, -1633313603 * buffer.offset + 10, buffer.array.length - (-1633313603 * buffer.offset + 10 + 8));
                        this.inflater.inflate(output);
                    }
                    catch (Exception ex2) {
                        this.inflater.reset();
                        throw new RuntimeException("");
                    }
                    this.inflater.reset();
                    return;
                }
                if (n != 1293232912) {
                    throw new IllegalStateException();
                }
            }
            throw new RuntimeException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tv.af(" + ')');
        }
    }
    
    public void yg(final Buffer buffer, final byte[] array) {
        rg(this, buffer, array, 1293232912);
    }
}
