// 
// Decompiled by Procyon v0.5.36
// 

public class class8
{
    final int field18;
    final int field17;
    final String field19;
    
    class8(final int field17, final int field18, final String field19) {
        this.field17 = field17;
        this.field18 = field18;
        this.field19 = field19;
    }
    
    class8(final Buffer buffer) {
        this(Buffer.ra(buffer, (byte)7), Buffer.ra(buffer, (byte)7), buffer.readStringCp1252NullTerminated((byte)0));
    }
    
    String aw() {
        return Integer.toHexString(this.field17) + Integer.toHexString(this.field18) + this.field19;
    }
    
    int method28() {
        return this.field18;
    }
    
    int au() {
        return this.field18;
    }
    
    String method29() {
        return Integer.toHexString(this.field17) + Integer.toHexString(this.field18) + this.field19;
    }
}
