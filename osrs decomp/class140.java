// 
// Decompiled by Procyon v0.5.36
// 

public class class140 extends class139
{
    boolean field1317;
    int field1318;
    final /* synthetic */ class142 this$0;
    static final int cx = 74;
    
    class140(final class142 this$0) {
        this.this$0 = this$0;
        this.field1318 = -209663463;
    }
    
    @Override
    void aw(final ClanSettings clanSettings) {
        clanSettings.method860(562761175 * this.field1318, this.field1317, (short)(-22236));
    }
    
    public static int vmethod3248(final int n, final byte b) {
        try {
            return class295.field2716[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fn.an(" + ')');
        }
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            clanSettings.method860(562761175 * this.field1318, this.field1317, (short)(-16552));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fn.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        this.field1318 = buffer.readUnsignedShort(-2141188649) * 209663463;
        this.field1317 = (Buffer.ra(buffer, (byte)7) == 1);
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1318 = buffer.readUnsignedShort(-1580473601) * 209663463;
        this.field1317 = (Buffer.ra(buffer, (byte)7) == 1);
    }
    
    @Override
    void vmethod3254(final Buffer buffer, final int n) {
        try {
            this.field1318 = buffer.readUnsignedShort(-1543722563) * 209663463;
            boolean field1317;
            if (Buffer.ra(buffer, (byte)7) == 1) {
                if (n == 1120136284) {
                    throw new IllegalStateException();
                }
                field1317 = true;
            }
            else {
                field1317 = false;
            }
            this.field1317 = field1317;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fn.af(" + ')');
        }
    }
    
    public static int qz(final class314 class314) {
        if (class314 == null) {
            return class314.ip();
        }
        return class314.field2851.method2038(-1296915014);
    }
}
