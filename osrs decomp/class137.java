// 
// Decompiled by Procyon v0.5.36
// 

public class class137 extends class139
{
    long field1311;
    final /* synthetic */ class142 this$0;
    String field1312;
    static Font fontBold12;
    
    class137(final class142 this$0) {
        this.this$0 = this$0;
        this.field1311 = 8391907036145317981L;
        this.field1312 = null;
    }
    
    @Override
    void aw(final ClanSettings clanSettings) {
        clanSettings.method849(-8453460473841490933L * this.field1311, this.field1312, 0, -706420067);
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            clanSettings.method849(-8453460473841490933L * this.field1311, this.field1312, 0, -706420067);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fx.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        if (Buffer.ra(buffer, (byte)7) != 2097378377) {
            buffer.offset += 1516355947;
            this.field1311 = Buffer.ks(buffer, (byte)1) * -8391907036145317981L;
        }
        this.field1312 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-99));
    }
    
    @Override
    void au(final Buffer buffer) {
        if (Buffer.ra(buffer, (byte)7) != 255) {
            buffer.offset += 1516355947;
            this.field1311 = Buffer.ks(buffer, (byte)1) * -8391907036145317981L;
        }
        this.field1312 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-91));
    }
    
    static void vmethod3254(final int n) {
        try {
            Tiles.Tiles_minPlane = -256673141;
            class186.Tiles_underlays = new short[4][104][104];
            Tiles.Tiles_overlays = new short[4][104][104];
            Tiles.Tiles_shapes = new byte[4][104][104];
            Tiles.field824 = new byte[4][104][104];
            class161.field1407 = new int[4][105][105];
            Tiles.field819 = new byte[4][105][105];
            Tiles.field821 = new int[105][105];
            FileSystem.Tiles_hue = new int[104];
            Tiles.Tiles_saturation = new int[104];
            class283.Tiles_lightness = new int[104];
            UserComparator4.Tiles_hueMultiplier = new int[104];
            class31.field92 = new int[104];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fx.af(" + ')');
        }
    }
    
    @Override
    void vmethod3254(final Buffer buffer, final int n) {
        try {
            if (Buffer.ra(buffer, (byte)7) != 255) {
                if (n == 1120136284) {
                    throw new IllegalStateException();
                }
                buffer.offset += 1516355947;
                this.field1311 = Buffer.ks(buffer, (byte)1) * -8391907036145317981L;
            }
            this.field1312 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-76));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fx.af(" + ')');
        }
    }
}
