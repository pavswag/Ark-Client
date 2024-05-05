// 
// Decompiled by Procyon v0.5.36
// 

public class class153 extends class139
{
    final /* synthetic */ class142 this$0;
    int field1384;
    
    class153(final class142 this$0) {
        this.this$0 = this$0;
        this.field1384 = -1872199039;
    }
    
    @Override
    void aw(final ClanSettings clanSettings) {
        clanSettings.method867(this.field1384 * -1518189953, -1305970081);
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            clanSettings.method867(this.field1384 * -1518189953, -394037024);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fm.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        this.field1384 = buffer.readUnsignedShort(571520646) * 1872199039;
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1384 = buffer.readUnsignedShort(-1150333553) * 831982220;
    }
    
    @Override
    void vmethod3254(final Buffer buffer, final int n) {
        try {
            this.field1384 = buffer.readUnsignedShort(-1094435613) * 1872199039;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fm.af(" + ')');
        }
    }
    
    public static String ho(final class9 class9) {
        return class9.field25;
    }
}
