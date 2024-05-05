// 
// Decompiled by Procyon v0.5.36
// 

public class class157 extends class139
{
    int field1393;
    static AbstractArchive ObjectDefinition_modelsArchive;
    final /* synthetic */ class142 this$0;
    static final int id = 104;
    int field1391;
    public static final int ag = 2;
    
    class157(final class142 this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    void aw(final ClanSettings clanSettings) {
        clanSettings.method861(this.field1393 * 1897105841, this.field1391 * 772555143, 1542996477);
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            clanSettings.method861(this.field1393 * 1897105841, this.field1391 * 772555143, 276195611);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "go.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        this.field1393 = buffer.readInt(-1834363181) * -776659119;
        this.field1391 = buffer.readInt(-1627598816) * -1491225545;
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1393 = buffer.readInt(-2040716861) * -776659119;
        this.field1391 = buffer.readInt(-1097991485) * -1491225545;
    }
    
    @Override
    void vmethod3254(final Buffer buffer, final int n) {
        try {
            this.field1393 = buffer.readInt(-1549531037) * -776659119;
            this.field1391 = buffer.readInt(-1101303116) * -1491225545;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "go.af(" + ')');
        }
    }
}
