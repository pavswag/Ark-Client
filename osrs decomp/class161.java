// 
// Decompiled by Procyon v0.5.36
// 

public class class161 extends class139
{
    String field1406;
    static int[][][] field1407;
    long field1408;
    final /* synthetic */ class142 this$0;
    
    class161(final class142 this$0) {
        this.this$0 = this$0;
        this.field1408 = -3404272251065138399L;
        this.field1406 = null;
    }
    
    @Override
    void aw(final ClanSettings clanSettings) {
        ClanSettings.ts(clanSettings, this.field1408 * -7266015123784483041L, this.field1406, -1787643966);
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            ClanSettings.ts(clanSettings, this.field1408 * -7266015123784483041L, this.field1406, -1787643966);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ge.an(" + ')');
        }
    }
    
    static int vmethod3248(final int n, final byte b, final byte b2, final byte b3, final byte b4, final byte b5) {
        try {
            int n2 = n >> 10 & 0x3F;
            int n3 = n >> 7 & 0x7;
            int n4 = n & 0x7F;
            final int n5 = b4 & 0xFF;
            if (-1 != b) {
                if (b5 >= 0) {
                    throw new IllegalStateException();
                }
                n2 += n5 * (b - n2) >> 7;
            }
            if (-1 != b2) {
                n3 += (b2 - n3) * n5 >> 7;
            }
            if (b3 != -1) {
                if (b5 >= 0) {
                    throw new IllegalStateException();
                }
                n4 += n5 * (b3 - n4) >> 7;
            }
            return (n2 << 10 | n3 << 7 | n4) & 0xFFFF;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ge.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        if (Buffer.ra(buffer, (byte)7) != 737066798) {
            buffer.offset += 1516355947;
            this.field1408 = Buffer.ks(buffer, (byte)1) * 3404272251065138399L;
        }
        this.field1406 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-47));
    }
    
    @Override
    void au(final Buffer buffer) {
        if (Buffer.ra(buffer, (byte)7) != 255) {
            buffer.offset += 1516355947;
            this.field1408 = Buffer.ks(buffer, (byte)1) * 3404272251065138399L;
        }
        this.field1406 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-74));
    }
    
    static void method908(final int n, final int n2, final int n3, final int n4) {
        try {
            if (n != 0) {
                final int n5 = n >> 8;
                final int n6 = n >> 4 & 0x7;
                final int n7 = n & 0xF;
                Client.soundEffectIds[-297150195 * Client.soundEffectCount] = n5;
                Client.queuedSoundEffectLoops[Client.soundEffectCount * -297150195] = n6;
                Client.queuedSoundEffectDelays[-297150195 * Client.soundEffectCount] = 0;
                Client.soundEffects[-297150195 * Client.soundEffectCount] = null;
                Client.soundLocations[Client.soundEffectCount * -297150195] = n7 + (((n2 - 64) / 128 << 16) + ((n3 - 64) / 128 << 8));
                Client.soundEffectCount += 831233477;
                Client.ua(-1);
                return;
            }
            if (n4 <= 263059632) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ge.hp(" + ')');
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
                this.field1408 = Buffer.ks(buffer, (byte)1) * 3404272251065138399L;
            }
            this.field1406 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-105));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ge.af(" + ')');
        }
    }
}
