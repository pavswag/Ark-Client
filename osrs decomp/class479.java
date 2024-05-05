// 
// Decompiled by Procyon v0.5.36
// 

final class class479 implements class474
{
    @Override
    public Object ao(final Buffer buffer) {
        return buffer.readStringCp1252NullTerminated((byte)0);
    }
    
    @Override
    public Object at(final Buffer buffer) {
        return buffer.readStringCp1252NullTerminated((byte)0);
    }
    
    void method2443(final String s, final Buffer buffer, final byte b) {
        try {
            buffer.writeStringCp1252NullCircumfixed(s, -1552390337);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "si.ax(" + ')');
        }
    }
    
    @Override
    public Object ay(final Buffer buffer) {
        return buffer.readStringCp1252NullTerminated((byte)0);
    }
    
    @Override
    public void aw(final Object o, final Buffer buffer) {
        this.method2443((String)o, buffer, (byte)37);
    }
    
    @Override
    public void al(final Object o, final Buffer buffer) {
        this.method2443((String)o, buffer, (byte)16);
    }
    
    @Override
    public Object vmethod8273(final Buffer buffer, final int n) {
        try {
            return buffer.readStringCp1252NullTerminated((byte)0);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "si.an(" + ')');
        }
    }
    
    @Override
    public void ac(final Object o, final Buffer buffer) {
        this.method2443((String)o, buffer, (byte)20);
    }
    
    @Override
    public void au(final Object o, final Buffer buffer) {
        this.method2443((String)o, buffer, (byte)7);
    }
    
    @Override
    public Object aa(final Buffer buffer) {
        return buffer.readStringCp1252NullTerminated((byte)0);
    }
    
    void ai(final String s, final Buffer buffer) {
        buffer.writeStringCp1252NullCircumfixed(s, -1470841795);
    }
    
    @Override
    public void vmethod8274(final Object o, final Buffer buffer, final int n) {
        try {
            this.method2443((String)o, buffer, (byte)(-97));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "si.af(" + ')');
        }
    }
    
    @Override
    public void ab(final Object o, final Buffer buffer) {
        this.method2443((String)o, buffer, (byte)32);
    }
    
    @Override
    public void aq(final Object o, final Buffer buffer) {
        this.method2443((String)o, buffer, (byte)85);
    }
    
    void ag(final String s, final Buffer buffer) {
        buffer.writeStringCp1252NullCircumfixed(s, -1461995325);
    }
}
