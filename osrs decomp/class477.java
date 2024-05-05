// 
// Decompiled by Procyon v0.5.36
// 

final class class477 implements class474
{
    static SpritePixels[] mapDotSprites;
    
    @Override
    public Object ao(final Buffer buffer) {
        return Buffer.ks(buffer, (byte)1);
    }
    
    @Override
    public Object at(final Buffer buffer) {
        return Buffer.ks(buffer, (byte)1);
    }
    
    void method2427(final Long n, final Buffer buffer, final byte b) {
        try {
            buffer.fs(n);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sf.ax(" + ')');
        }
    }
    
    @Override
    public Object ay(final Buffer buffer) {
        return Buffer.ks(buffer, (byte)1);
    }
    
    @Override
    public void aw(final Object o, final Buffer buffer) {
        jr(this, (Long)o, buffer, (byte)0);
    }
    
    @Override
    public void al(final Object o, final Buffer buffer) {
        jr(this, (Long)o, buffer, (byte)0);
    }
    
    @Override
    public Object vmethod8273(final Buffer buffer, final int n) {
        try {
            return Buffer.ks(buffer, (byte)1);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sf.an(" + ')');
        }
    }
    
    @Override
    public void ac(final Object o, final Buffer buffer) {
        jr(this, (Long)o, buffer, (byte)0);
    }
    
    @Override
    public void au(final Object o, final Buffer buffer) {
        jr(this, (Long)o, buffer, (byte)0);
    }
    
    @Override
    public Object aa(final Buffer buffer) {
        return Buffer.ks(buffer, (byte)1);
    }
    
    void ai(final Long n, final Buffer buffer) {
        buffer.writeLong(n);
    }
    
    @Override
    public void vmethod8274(final Object o, final Buffer buffer, final int n) {
        try {
            jr(this, (Long)o, buffer, (byte)0);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sf.af(" + ')');
        }
    }
    
    @Override
    public void ab(final Object o, final Buffer buffer) {
        jr(this, (Long)o, buffer, (byte)0);
    }
    
    @Override
    public void aq(final Object o, final Buffer buffer) {
        jr(this, (Long)o, buffer, (byte)0);
    }
    
    public static void jr(final class477 class477, final Long n, final Buffer buffer, final byte b) {
        if (class477 == null) {
            class477.method2427(n, buffer, b);
        }
        try {
            buffer.writeLong(n);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sf.ax(" + ')');
        }
    }
}
