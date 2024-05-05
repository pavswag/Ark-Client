// 
// Decompiled by Procyon v0.5.36
// 

final class class475 implements class474
{
    public static MidiPcmStream midiPcmStream;
    
    @Override
    public Object ao(final Buffer buffer) {
        return buffer.readInt(-1617600110);
    }
    
    @Override
    public Object at(final Buffer buffer) {
        return buffer.readInt(-1197822997);
    }
    
    void method2424(final Integer n, final Buffer buffer, final int n2) {
        try {
            buffer.writeIntIME(n, -2081835031);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sa.ax(" + ')');
        }
    }
    
    @Override
    public Object ay(final Buffer buffer) {
        return buffer.readInt(-1293212998);
    }
    
    @Override
    public void aw(final Object o, final Buffer buffer) {
        vf(this, (Integer)o, buffer, -636946598);
    }
    
    @Override
    public void al(final Object o, final Buffer buffer) {
        vf(this, (Integer)o, buffer, -551896639);
    }
    
    @Override
    public Object vmethod8273(final Buffer buffer, final int n) {
        try {
            return buffer.readInt(-2129337797);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sa.an(" + ')');
        }
    }
    
    @Override
    public void ac(final Object o, final Buffer buffer) {
        vf(this, (Integer)o, buffer, -1068357359);
    }
    
    @Override
    public void au(final Object o, final Buffer buffer) {
        vf(this, (Integer)o, buffer, -1444621105);
    }
    
    @Override
    public Object aa(final Buffer buffer) {
        return buffer.readInt(-1753131893);
    }
    
    void ai(final Integer n, final Buffer buffer) {
        buffer.writeInt(n, -2081835031);
    }
    
    @Override
    public void vmethod8274(final Object o, final Buffer buffer, final int n) {
        try {
            vf(this, (Integer)o, buffer, -1039582694);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sa.af(" + ')');
        }
    }
    
    @Override
    public void ab(final Object o, final Buffer buffer) {
        vf(this, (Integer)o, buffer, -329990057);
    }
    
    @Override
    public void aq(final Object o, final Buffer buffer) {
        vf(this, (Integer)o, buffer, 1699168591);
    }
    
    public static void vf(final class475 class475, final Integer n, final Buffer buffer, final int n2) {
        if (class475 == null) {
            class475.method2424(n, buffer, n2);
        }
        try {
            buffer.writeInt(n, -2081835031);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sa.ax(" + ')');
        }
    }
    
    public static void jl(final class475 class475, final Integer n, final Buffer buffer) {
        if (class475 == null) {
            class475.ai(n, buffer);
        }
        buffer.writeInt(n, -2081835031);
    }
}
