// 
// Decompiled by Procyon v0.5.36
// 

public class SpriteMask extends DualNode
{
    public final int height;
    static final int au = 4;
    public final int[] xWidths;
    public final int[] xStarts;
    static String field2808;
    public final int width;
    static final int dm = 100;
    static final int bq = 55;
    
    SpriteMask(final int n, final int n2, final int[] xWidths, final int[] xStarts, final int n3) {
        this.width = n * 1531475491;
        this.height = n2 * 1387260015;
        this.xWidths = xWidths;
        this.xStarts = xStarts;
    }
    
    public int da() {
        return this.height * 939947663;
    }
    
    public int[] sb() {
        return this.xStarts;
    }
    
    public static boolean pd(final SpriteMask spriteMask, final int n, final int n2) {
        if (spriteMask == null) {
            return spriteMask.aw(n, n);
        }
        if (n2 >= 0 && n2 < spriteMask.xStarts.length) {
            final int n3 = spriteMask.xStarts[n2];
            if (n >= n3 && n <= n3 + spriteMask.xWidths[n2]) {
                return true;
            }
        }
        return false;
    }
    
    public int[] le() {
        return this.xWidths;
    }
    
    public boolean aw(final int n, final int n2) {
        return this.contains(n, n2, -746690647);
    }
    
    public boolean ac(final int n, final int n2) {
        if (n2 >= 0 && n2 < this.xStarts.length) {
            final int n3 = this.xStarts[n2];
            if (n >= n3 && n <= n3 + this.xWidths[n2]) {
                return true;
            }
        }
        return false;
    }
    
    public static void ro(final class394 class394, final class435 class395, final float b) {
        class394.field3685.put(class395, Math.max(0.0f, Math.min(1.0f, b)));
        class394.method2113(913972792);
    }
    
    public int he() {
        return this.width * 1484188043;
    }
    
    public boolean contains(final int n, final int n2, final int n3) {
        try {
            if (n2 >= 0 && n2 < this.xStarts.length) {
                if (n3 != -746690647) {
                    throw new IllegalStateException();
                }
                final int n4 = this.xStarts[n2];
                if (n >= n4 && n <= n4 + this.xWidths[n2]) {
                    if (n3 != -746690647) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ll.af(" + ')');
        }
    }
    
    public static int contains(final int n, final int n2, int n3, final int n4) {
        try {
            n3 &= 0x3;
            if (n3 == 0) {
                return n;
            }
            if (1 == n3) {
                if (n4 != 575322475) {
                    throw new IllegalStateException();
                }
                return n2;
            }
            else {
                if (2 != n3) {
                    return 7 - n2;
                }
                if (n4 != 575322475) {
                    throw new IllegalStateException();
                }
                return 7 - n;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ll.af(" + ')');
        }
    }
    
    public static void uv(final AbstractFont abstractFont, final String s, int n, int n2) {
        if (abstractFont == null) {
            abstractFont.drawCenteredWave(s, n, n, n, n, n);
        }
        n2 -= abstractFont.ascent;
        int n3 = -1;
        int n4 = -1;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '\0') {
                int n5 = (char)(class100.vmethod5708(s.charAt(i), (byte)84) & 0xFF);
                if (n5 == -1751077658) {
                    n3 = i;
                }
                else {
                    if (n5 == -154667502 && n3 != -1) {
                        final String substring = s.substring(n3 + 1, i);
                        n3 = -1;
                        if (substring.equals("lt")) {
                            n5 = 858159000;
                        }
                        else if (substring.equals("gt")) {
                            n5 = -1372310679;
                        }
                        else {
                            if (substring.startsWith("img=")) {
                                try {
                                    final IndexedSprite indexedSprite = AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)74)];
                                    indexedSprite.ax(n, n2 + abstractFont.ascent - indexedSprite.width);
                                    n += indexedSprite.subHeight;
                                    n4 = -1;
                                }
                                catch (Exception ex) {}
                                continue;
                            }
                            abstractFont.decodeTag(substring);
                            continue;
                        }
                    }
                    if (n5 == -103104416) {
                        n5 = 32;
                    }
                    if (n3 == -1) {
                        if (abstractFont.kerning != null && n4 != -1) {
                            n += abstractFont.kerning[(n4 << 8) + n5];
                        }
                        final int n6 = abstractFont.widths[n5];
                        final int n7 = abstractFont.heights[n5];
                        if (n5 != 32) {
                            if (AbstractFont.AbstractFont_alpha == -27295072) {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont.AbstractFont_drawGlyph(abstractFont.pixels[n5], n + abstractFont.leftBearings[n5] + 1, n2 + abstractFont.topBearings[n5] + 1, n6, n7, AbstractFont.AbstractFont_shadow);
                                }
                                abstractFont.ac(abstractFont.pixels[n5], n + abstractFont.leftBearings[n5], n2 + abstractFont.topBearings[n5], n6, n7, AbstractFont.AbstractFont_color);
                            }
                            else {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont.AbstractFont_drawGlyphAlpha(abstractFont.pixels[n5], n + abstractFont.leftBearings[n5] + 1, n2 + abstractFont.topBearings[n5] + 1, n6, n7, AbstractFont.AbstractFont_shadow, AbstractFont.AbstractFont_alpha);
                                }
                                abstractFont.drawGlyphAlpha(abstractFont.pixels[n5], n + abstractFont.leftBearings[n5], n2 + abstractFont.topBearings[n5], n6, n7, AbstractFont.AbstractFont_color, AbstractFont.AbstractFont_alpha);
                            }
                        }
                        else if (AbstractFont.AbstractFont_justificationTotal > 0) {
                            AbstractFont.AbstractFont_justificationCurrent += AbstractFont.AbstractFont_justificationTotal;
                            n += AbstractFont.AbstractFont_justificationCurrent >> 8;
                            AbstractFont.AbstractFont_justificationCurrent &= 0xEA4D1260;
                        }
                        final int n8 = abstractFont.advances[n5];
                        if (AbstractFont.AbstractFont_strike != -1) {
                            AbstractFont.ec(n, n2 + (int)(abstractFont.ascent * 0.7), n8, AbstractFont.AbstractFont_strike);
                        }
                        if (AbstractFont.AbstractFont_underline != -1) {
                            AbstractFont.ec(n, n2 + abstractFont.ascent + 1, n8, AbstractFont.AbstractFont_underline);
                        }
                        n += n8;
                        n4 = n5;
                    }
                }
            }
        }
    }
    
    public boolean uf(final int n, final int n2) {
        if (n2 >= 0 && n2 < this.xStarts.length) {
            final int n3 = this.xStarts[n2];
            if (n >= n3 && n <= n3 + this.xWidths[n2]) {
                return true;
            }
        }
        return false;
    }
}
