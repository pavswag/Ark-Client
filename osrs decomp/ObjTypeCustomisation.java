// 
// Decompiled by Procyon v0.5.36
// 

public class ObjTypeCustomisation
{
    public static final int ag = 11;
    static final int an = 2;
    public short[] retex;
    public short[] recol;
    static final int bg = 33;
    static final int af = 1;
    static int field1471;
    
    ObjTypeCustomisation(final int n) {
        final ItemComposition set = HealthBarUpdate.set(n, (byte)82);
        if (set.hasRecolor((short)467)) {
            this.recol = new short[set.recolorTo.length];
            System.arraycopy(set.recolorTo, 0, this.recol, 0, this.recol.length);
        }
        if (ItemComposition.oz(set, -1913004166)) {
            this.retex = new short[set.retextureTo.length];
            System.arraycopy(set.retextureTo, 0, this.retex, 0, this.retex.length);
        }
    }
    
    public short[] ad() {
        return this.recol;
    }
    
    public static int method971(final String s, final byte b) {
        try {
            return s.length() + 2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gx.bw(" + ')');
        }
    }
    
    static SpritePixels method973(final int n) {
        try {
            final SpritePixels spritePixels = new SpritePixels();
            spritePixels.width = -822007097 * class503.SpriteBuffer_spriteWidth;
            spritePixels.height = class503.SpriteBuffer_spriteHeight * 378525975;
            spritePixels.xOffset = class503.SpriteBuffer_xOffsets[0];
            spritePixels.yOffset = class17.SpriteBuffer_yOffsets[0];
            spritePixels.subWidth = class97.SpriteBuffer_spriteWidths[0];
            spritePixels.subHeight = class138.SpriteBuffer_spriteHeights[0];
            final int n2 = spritePixels.subHeight * spritePixels.subWidth;
            final byte[] array = VarbitComposition.SpriteBuffer_pixels[0];
            spritePixels.pixels = new int[n2];
            for (int i = 0; i < n2; ++i) {
                if (n >= 687212254) {
                    throw new IllegalStateException();
                }
                spritePixels.pixels[i] = class394.SpriteBuffer_spritePalette[array[i] & 0xFF];
            }
            class398.method2125(-262861184);
            return spritePixels;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gx.at(" + ')');
        }
    }
    
    public static ObjTypeCustomisation aw(final int n, final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        final boolean b = 0x0 != (ra & 0x1);
        final boolean b2 = (ra & 0x2) != 0x0;
        final ObjTypeCustomisation objTypeCustomisation = new ObjTypeCustomisation(n);
        if (b) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            final int[] array = { ra2 & 0xF, ra2 >> 4 & 0xF };
            final boolean b3 = objTypeCustomisation.recol != null && array.length == objTypeCustomisation.recol.length;
            for (int i = 0; i < 2; ++i) {
                if (array[i] != 15) {
                    final short n2 = (short)buffer.readUnsignedShort(-1456699561);
                    if (b3) {
                        objTypeCustomisation.recol[array[i]] = n2;
                    }
                }
            }
        }
        if (b2) {
            final int ra3 = Buffer.ra(buffer, (byte)7);
            final int[] array2 = { ra3 & 0xF, ra3 >> 4 & 0xF };
            final boolean b4 = objTypeCustomisation.retex != null && array2.length == objTypeCustomisation.retex.length;
            for (int j = 0; j < 2; ++j) {
                if (15 != array2[j]) {
                    final short n3 = (short)buffer.readUnsignedShort(506620582);
                    if (b4) {
                        objTypeCustomisation.retex[array2[j]] = n3;
                    }
                }
            }
        }
        return objTypeCustomisation;
    }
    
    public static ObjTypeCustomisation an(final int n, final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        final boolean b = 0x0 != (ra & 0x1);
        final boolean b2 = (ra & 0x2) != 0x0;
        final ObjTypeCustomisation objTypeCustomisation = new ObjTypeCustomisation(n);
        if (b) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            final int[] array = { ra2 & 0xF, ra2 >> 4 & 0xF };
            final boolean b3 = objTypeCustomisation.recol != null && array.length == objTypeCustomisation.recol.length;
            for (int i = 0; i < 2; ++i) {
                if (array[i] != 15) {
                    final short n2 = (short)buffer.readUnsignedShort(-183568134);
                    if (b3) {
                        objTypeCustomisation.recol[array[i]] = n2;
                    }
                }
            }
        }
        if (b2) {
            final int ra3 = Buffer.ra(buffer, (byte)7);
            final int[] array2 = { ra3 & 0xF, ra3 >> 4 & 0xF };
            final boolean b4 = objTypeCustomisation.retex != null && array2.length == objTypeCustomisation.retex.length;
            for (int j = 0; j < 2; ++j) {
                if (15 != array2[j]) {
                    final short n3 = (short)buffer.readUnsignedShort(139723499);
                    if (b4) {
                        objTypeCustomisation.retex[array2[j]] = n3;
                    }
                }
            }
        }
        return objTypeCustomisation;
    }
    
    public static void method972(final Buffer buffer, final int n, final int n2) {
        try {
            if (null != JagexCache.JagexCache_randomDat) {
                try {
                    BufferedFile.cu(JagexCache.JagexCache_randomDat, 0L);
                    BufferedFile.gu(JagexCache.JagexCache_randomDat, buffer.array, n, 24, (byte)3);
                }
                catch (Exception ex2) {}
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gx.ac(" + ')');
        }
    }
    
    public static ObjTypeCustomisation method972(final int n, final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        final boolean b = 0x0 != (ra & 0x1);
        final boolean b2 = (ra & 0x2) != 0x0;
        final ObjTypeCustomisation objTypeCustomisation = new ObjTypeCustomisation(n);
        if (b) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            final int[] array = { ra2 & 0xF, ra2 >> 4 & 0xF };
            final boolean b3 = objTypeCustomisation.recol != null && array.length == objTypeCustomisation.recol.length;
            for (int i = 0; i < 2; ++i) {
                if (array[i] != 15) {
                    final short n2 = (short)buffer.readUnsignedShort(-1954855039);
                    if (b3) {
                        objTypeCustomisation.recol[array[i]] = n2;
                    }
                }
            }
        }
        if (b2) {
            final int ra3 = Buffer.ra(buffer, (byte)7);
            final int[] array2 = { ra3 & 0xF, ra3 >> 4 & 0xF };
            final boolean b4 = objTypeCustomisation.retex != null && array2.length == objTypeCustomisation.retex.length;
            for (int j = 0; j < 2; ++j) {
                if (15 != array2[j]) {
                    final short n3 = (short)buffer.readUnsignedShort(597502706);
                    if (b4) {
                        objTypeCustomisation.retex[array2[j]] = n3;
                    }
                }
            }
        }
        return objTypeCustomisation;
    }
    
    public static void jj(final ClientPreferences clientPreferences, final String rememberedUsername) {
        if (clientPreferences == null) {
            clientPreferences.wi();
        }
        clientPreferences.rememberedUsername = rememberedUsername;
        class100.savePreferences((byte)(-124));
    }
    
    public short[] hj() {
        return this.retex;
    }
}
