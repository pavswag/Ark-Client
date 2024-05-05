import java.util.Random;
import net.runelite.api.FontTypeFace;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class AbstractFont extends Rasterizer2D implements FontTypeFace
{
    static int AbstractFont_justificationTotal;
    byte[][] pixels;
    int[] advances;
    int[] widths;
    byte[] kerning;
    static int AbstractFont_alpha;
    int[] topBearings;
    public static final StringBuilder jz;
    public int ascent;
    public int maxAscent;
    public int maxDescent;
    public static IndexedSprite[] AbstractFont_modIconSprites;
    int[] leftBearings;
    static int AbstractFont_previousShadow;
    static int AbstractFont_underline;
    int[] heights;
    static int AbstractFont_shadow;
    static int AbstractFont_previousColor;
    static int AbstractFont_color;
    static final int af = 256;
    static int AbstractFont_justificationCurrent;
    static int AbstractFont_strike;
    static Random AbstractFont_random;
    static String[] AbstractFont_lines;
    
    AbstractFont(final byte[] array, final int[] leftBearings, final int[] topBearings, final int[] widths, final int[] heights, final int[] array2, final byte[][] pixels) {
        this.pixels = new byte[256][];
        this.ascent = 0;
        this.leftBearings = leftBearings;
        this.topBearings = topBearings;
        this.widths = widths;
        this.heights = heights;
        this.readMetrics(array);
        this.pixels = pixels;
        int n = Integer.MAX_VALUE;
        int n2 = Integer.MIN_VALUE;
        for (int i = 0; i < 256; ++i) {
            if (this.topBearings[i] < n && this.heights[i] != 0) {
                n = this.topBearings[i];
            }
            if (this.topBearings[i] + this.heights[i] > n2) {
                n2 = this.topBearings[i] + this.heights[i];
            }
        }
        this.maxAscent = this.ascent - n;
        this.maxDescent = n2 - this.ascent;
    }
    
    AbstractFont(final byte[] array) {
        this.pixels = new byte[256][];
        this.ascent = 0;
        this.readMetrics(array);
    }
    
    static {
        AbstractFont.AbstractFont_strike = -1;
        AbstractFont.AbstractFont_underline = -1;
        AbstractFont.AbstractFont_previousShadow = -1;
        AbstractFont.AbstractFont_shadow = -1;
        AbstractFont.AbstractFont_previousColor = 0;
        AbstractFont.AbstractFont_color = 0;
        AbstractFont.AbstractFont_alpha = 256;
        AbstractFont.AbstractFont_justificationTotal = 0;
        AbstractFont.AbstractFont_justificationCurrent = 0;
        AbstractFont.AbstractFont_random = new Random();
        AbstractFont.AbstractFont_lines = new String[100];
        jz = new StringBuilder(100);
    }
    
    public Bounds cs(final int n, final int n2, final String s, final int n3, final int n4) {
        if (s != null && s.length() >= n + n2) {
            return new Bounds(n3 - this.stringWidth(s) / 2 + this.bu(s.substring(0, n)), n4 - this.maxDescent, this.getTextWidth(s.substring(n, n + n2)), this.ascent + this.ascent);
        }
        return new Bounds(n3, n4, 0, 0);
    }
    
    void dp(final String s, int n, int n2) {
        n2 -= this.ascent;
        int n3 = -1;
        int n4 = -1;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '\0') {
                int n5 = (char)(class100.vmethod5708(s.charAt(i), (byte)72) & 0xFF);
                if (n5 == 60) {
                    n3 = i;
                }
                else {
                    if (n5 == 62 && n3 != -1) {
                        final String substring = s.substring(n3 + 1, i);
                        n3 = -1;
                        if (substring.equals("lt")) {
                            n5 = 60;
                        }
                        else if (substring.equals("gt")) {
                            n5 = 62;
                        }
                        else {
                            if (substring.startsWith("img=")) {
                                try {
                                    final IndexedSprite indexedSprite = AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)(-104))];
                                    indexedSprite.ax(n, n2 + this.ascent - indexedSprite.width);
                                    n += indexedSprite.subHeight;
                                    n4 = -1;
                                }
                                catch (Exception ex) {}
                                continue;
                            }
                            this.decodeTag(substring);
                            continue;
                        }
                    }
                    if (n5 == 160) {
                        n5 = 32;
                    }
                    if (n3 == -1) {
                        if (this.kerning != null && n4 != -1) {
                            n += this.kerning[(n4 << 8) + n5];
                        }
                        final int n6 = this.widths[n5];
                        final int n7 = this.heights[n5];
                        if (n5 != 32) {
                            if (AbstractFont.AbstractFont_alpha == 256) {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont_drawGlyph(this.pixels[n5], n + this.leftBearings[n5] + 1, n2 + this.topBearings[n5] + 1, n6, n7, AbstractFont.AbstractFont_shadow);
                                }
                                this.ac(this.pixels[n5], n + this.leftBearings[n5], n2 + this.topBearings[n5], n6, n7, AbstractFont.AbstractFont_color);
                            }
                            else {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont_drawGlyphAlpha(this.pixels[n5], n + this.leftBearings[n5] + 1, n2 + this.topBearings[n5] + 1, n6, n7, AbstractFont.AbstractFont_shadow, AbstractFont.AbstractFont_alpha);
                                }
                                this.drawGlyphAlpha(this.pixels[n5], n + this.leftBearings[n5], n2 + this.topBearings[n5], n6, n7, AbstractFont.AbstractFont_color, AbstractFont.AbstractFont_alpha);
                            }
                        }
                        else if (AbstractFont.AbstractFont_justificationTotal > 0) {
                            AbstractFont.AbstractFont_justificationCurrent += AbstractFont.AbstractFont_justificationTotal;
                            n += AbstractFont.AbstractFont_justificationCurrent >> 8;
                            AbstractFont.AbstractFont_justificationCurrent &= 0xFF;
                        }
                        final int n8 = this.advances[n5];
                        if (AbstractFont.AbstractFont_strike != -1) {
                            ec(n, n2 + (int)(this.ascent * 0.7), n8, AbstractFont.AbstractFont_strike);
                        }
                        if (AbstractFont.AbstractFont_underline != -1) {
                            ec(n, n2 + this.ascent + 1, n8, AbstractFont.AbstractFont_underline);
                        }
                        n += n8;
                        n4 = n5;
                    }
                }
            }
        }
    }
    
    static int bs(final byte[][] array, final byte[][] array2, final int[] array3, final int[] array4, final int[] array5, final int n, final int n2) {
        final int n3 = array3[n];
        final int n4 = n3 + array5[n];
        final int n5 = array3[n2];
        final int n6 = n5 + array5[n2];
        int n7 = n3;
        if (n5 > n3) {
            n7 = n5;
        }
        int n8;
        if (n6 < (n8 = n4)) {
            n8 = n6;
        }
        int n9 = array4[n];
        if (array4[n2] < n9) {
            n9 = array4[n2];
        }
        final byte[] array6 = array2[n];
        final byte[] array7 = array[n2];
        int n10 = n7 - n3;
        int n11 = n7 - n5;
        for (int i = n7; i < n8; ++i) {
            final int n12 = array6[n10++] + array7[n11++];
            if (n12 < n9) {
                n9 = n12;
            }
        }
        return -n9;
    }
    
    public class461 method2056(final class383 class383, final int n, int n2, final int n3, final int n4, final int n5) {
        if (!class383.method2078(-1740357709)) {
            pr(this, n3, n4);
            n2 -= this.ascent;
            for (int i = 0; i < class383.ud(class383, (byte)99); ++i) {
                final class381 method2080 = class383.method2080(i, -1037292745);
                if (n5 != -1 && method2080.field3623 * -727185157 > n5) {
                    return new class461(method2080.field3625 * 1620071571, method2080.field3623 * -727185157);
                }
                int field3624 = method2080.field3624;
                if (field3624 != 10) {
                    if (class383.method2081(i, 1783943189)) {
                        field3624 = 42;
                    }
                    if (field3624 != 9) {
                        if (field3624 == 160) {
                            field3624 = 32;
                        }
                        final int n6 = n + method2080.field3625 * 1620071571;
                        final int n7 = n2 + method2080.field3623 * -727185157;
                        final int n8 = this.widths[field3624];
                        final int n9 = this.heights[field3624];
                        if (AbstractFont.AbstractFont_shadow != -1) {
                            this.ac(this.pixels[field3624], n6 + this.leftBearings[field3624] + 1, n7 + this.topBearings[field3624] + 1, n8, n9, AbstractFont.AbstractFont_shadow);
                        }
                        this.ac(this.pixels[field3624], n6 + this.leftBearings[field3624], n7 + this.topBearings[field3624], n8, n9, AbstractFont.AbstractFont_color);
                    }
                }
            }
        }
        return class383.cy(class383, (byte)55);
    }
    
    public int ba(final String s, final int[] array, final String[] array2) {
        if (s == null) {
            return 0;
        }
        int n = 0;
        int length = 0;
        final StringBuilder sb = new StringBuilder(100);
        int n2 = -1;
        byte b = 0;
        int n3 = 0;
        int n4 = -1;
        int n5 = 0;
        int n6 = 0;
        for (int length2 = s.length(), i = 0; i < length2; ++i) {
            char char1 = s.charAt(i);
            if (char1 == '<') {
                n4 = i;
            }
            else {
                if (char1 == 536368456 && n4 != -1) {
                    final String substring = s.substring(n4 + 1, i);
                    n4 = -1;
                    sb.append('<');
                    sb.append(substring);
                    sb.append((char)1681099101);
                    if (substring.equals("br")) {
                        array2[n6] = sb.toString().substring(length, sb.length());
                        ++n6;
                        length = sb.length();
                        n = 0;
                        n2 = -1;
                        n5 = 0;
                    }
                    else if (substring.equals("lt")) {
                        n += this.charWidth((char)(-1066952973));
                        if (this.kerning != null && n5 != -1) {
                            n += this.kerning[(n5 << 8) + 508126706];
                        }
                        n5 = -1800207734;
                    }
                    else if (substring.equals("gt")) {
                        n += this.charWidth((char)(-280705284));
                        if (this.kerning != null && n5 != -1) {
                            n += this.kerning[(n5 << 8) - 1705716054];
                        }
                        n5 = 1469165597;
                    }
                    else if (substring.startsWith("img=")) {
                        try {
                            n += AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)86)].subHeight;
                            n5 = 0;
                        }
                        catch (Exception ex) {}
                    }
                    char1 = '\0';
                }
                if (n4 == -1) {
                    if (char1 != '\0') {
                        sb.append(char1);
                        n += this.charWidth(char1);
                        if (this.kerning != null && n5 != -1) {
                            n += this.kerning[(n5 << 8) + char1];
                        }
                        n5 = char1;
                    }
                    if (char1 == 1569653186) {
                        n2 = sb.length();
                        b = (byte)n;
                        n3 = 1;
                    }
                    if (array != null && n > array[(n6 < array.length) ? n6 : (array.length - 1)] && n2 >= 0) {
                        array2[n6] = sb.toString().substring(length, n2 - n3);
                        ++n6;
                        length = n2;
                        n2 = -1;
                        n -= b;
                        n5 = 0;
                    }
                    if (char1 == -1873327973) {
                        n2 = sb.length();
                        b = (byte)n;
                        n3 = 0;
                    }
                }
            }
        }
        final String string = sb.toString();
        if (string.length() > length) {
            array2[n6++] = string.substring(length, string.length());
        }
        return n6;
    }
    
    public void drawCenteredWave(final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        final int[] array = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            array[i] = (int)(Math.sin(i / 2.0 + n5 / 5.0) * 5.0);
        }
        vd(this, s, n - this.bf(s) / 2, n2, null, array);
    }
    
    public void cr(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        this.draw0(s, n - this.bf(s), n2);
    }
    
    public static String ce(final String s) {
        final int length = s.length();
        int n = 0;
        for (int i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '<' || char1 == '>') {
                n += 3;
            }
        }
        final StringBuilder sb = new StringBuilder(length + n);
        for (int j = 0; j < length; ++j) {
            final char char2 = s.charAt(j);
            if (char2 == '<') {
                sb.append("<lt>");
            }
            else if (char2 == '>') {
                sb.append("<gt>");
            }
            else {
                sb.append(char2);
            }
        }
        return sb.toString();
    }
    
    public void drawRandomAlphaAndSpacing(final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        AbstractFont.AbstractFont_random.setSeed(n5);
        AbstractFont.AbstractFont_justificationTotal = 192 + (AbstractFont.AbstractFont_random.nextInt() & 0x1F);
        final int[] array = new int[s.length()];
        int n6 = 0;
        for (int i = 0; i < s.length(); ++i) {
            array[i] = n6;
            if ((AbstractFont.AbstractFont_random.nextInt() & 0x3) == 0x0) {
                ++n6;
            }
        }
        vd(this, s, n, n2, array, null);
    }
    
    public int cb(final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        return this.method2055(s, n, n2, n3, n4, n5, n6, 256, n7, n8, n9);
    }
    
    static void da(final int[] array, final byte[] array2, final int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    public static void uc(final AbstractFont abstractFont, final String s, final int n) {
        if (abstractFont == null) {
            abstractFont.calculateLineJustification(s, n);
            return;
        }
        int n2 = 0;
        boolean b = false;
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '<') {
                b = true;
            }
            else if (char1 == '>') {
                b = false;
            }
            else if (!b && char1 == ' ') {
                ++n2;
            }
        }
        if (n2 > 0) {
            AbstractFont.AbstractFont_justificationTotal = (n - abstractFont.bf(s) << 8) / n2;
        }
    }
    
    public int ch(final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, int abstractFont_alpha, final int n7, int n8, int ascent) {
        if (s == null) {
            return 0;
        }
        if (abstractFont_alpha == 255) {
            abstractFont_alpha = 256;
        }
        pr(this, n5, n6);
        AbstractFont.AbstractFont_alpha = abstractFont_alpha;
        if (ascent == 0) {
            ascent = this.ascent;
        }
        int[] array = { n3 };
        if (n4 < this.maxAscent + this.maxDescent + ascent && n4 < ascent + ascent) {
            array = null;
        }
        final int mk = mk(this, s, array, AbstractFont.AbstractFont_lines);
        if (n8 == 3 && mk == 1) {
            n8 = 1;
        }
        int n9;
        if (n8 == 0) {
            n9 = n2 + this.maxAscent;
        }
        else if (n8 == 1) {
            n9 = n2 + this.maxAscent + (n4 - this.maxAscent - this.maxDescent - (mk - 1) * ascent) / 2;
        }
        else if (n8 == 2) {
            n9 = n2 + n4 - this.maxDescent - (mk - 1) * ascent;
        }
        else {
            int n10 = (n4 - this.maxAscent - this.maxDescent - (mk - 1) * ascent) / (mk + 1);
            if (n10 < 0) {
                n10 = 0;
            }
            n9 = n2 + this.maxAscent + n10;
            ascent += n10;
        }
        for (int i = 0; i < mk; ++i) {
            if (n7 == 0) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n, n9);
            }
            else if (n7 == 1) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n + (n3 - this.bf(AbstractFont.AbstractFont_lines[i])) / 2, n9);
            }
            else if (n7 == 2) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n + n3 - this.bf(AbstractFont.AbstractFont_lines[i]), n9);
            }
            else if (i == mk - 1) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n, n9);
            }
            else {
                uc(this, AbstractFont.AbstractFont_lines[i], n3);
                this.draw0(AbstractFont.AbstractFont_lines[i], n, n9);
                AbstractFont.AbstractFont_justificationTotal = 0;
            }
            n9 += ascent;
        }
        return mk;
    }
    
    public void cl(final String s, final int n, final int n2, final int n3, final int n4, final int abstractFont_alpha) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        AbstractFont.AbstractFont_alpha = abstractFont_alpha;
        this.draw0(s, n, n2);
    }
    
    public Bounds cn(final int n, final int n2, final String s, final int n3, final int n4) {
        if (s != null && s.length() >= n + n2) {
            return new Bounds(n3 - this.bf(s) / 2 + this.bf(s.substring(0, n)), n4 - this.maxAscent, this.bf(s.substring(n, n + n2)), this.maxAscent + this.maxDescent);
        }
        return new Bounds(n3, n4, 0, 0);
    }
    
    void db(final String s, int n, int n2, final int[] array, final int[] array2) {
        n2 -= this.ascent;
        int n3 = -1;
        int n4 = -1;
        int n5 = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '\0') {
                int n6 = (char)(class100.vmethod5708(s.charAt(i), (byte)(-60)) & 0xFF);
                if (n6 == 60) {
                    n3 = i;
                }
                else {
                    if (n6 == 62 && n3 != -1) {
                        final String substring = s.substring(n3 + 1, i);
                        n3 = -1;
                        if (substring.equals("lt")) {
                            n6 = 60;
                        }
                        else if (substring.equals("gt")) {
                            n6 = 62;
                        }
                        else {
                            if (substring.startsWith("img=")) {
                                try {
                                    int n7;
                                    if (array != null) {
                                        n7 = array[n5];
                                    }
                                    else {
                                        n7 = 0;
                                    }
                                    int n8;
                                    if (array2 != null) {
                                        n8 = array2[n5];
                                    }
                                    else {
                                        n8 = 0;
                                    }
                                    ++n5;
                                    final IndexedSprite indexedSprite = AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)(-49))];
                                    indexedSprite.ax(n + n7, n2 + this.ascent - indexedSprite.width + n8);
                                    n += indexedSprite.subHeight;
                                    n4 = -1;
                                }
                                catch (Exception ex) {}
                                continue;
                            }
                            this.decodeTag(substring);
                            continue;
                        }
                    }
                    if (n6 == 160) {
                        n6 = 32;
                    }
                    if (n3 == -1) {
                        if (this.kerning != null && n4 != -1) {
                            n += this.kerning[(n4 << 8) + n6];
                        }
                        final int n9 = this.widths[n6];
                        final int n10 = this.heights[n6];
                        int n11;
                        if (array != null) {
                            n11 = array[n5];
                        }
                        else {
                            n11 = 0;
                        }
                        int n12;
                        if (array2 != null) {
                            n12 = array2[n5];
                        }
                        else {
                            n12 = 0;
                        }
                        ++n5;
                        if (n6 != 32) {
                            if (AbstractFont.AbstractFont_alpha == 256) {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont_drawGlyph(this.pixels[n6], n + this.leftBearings[n6] + 1 + n11, n2 + this.topBearings[n6] + 1 + n12, n9, n10, AbstractFont.AbstractFont_shadow);
                                }
                                this.ac(this.pixels[n6], n + this.leftBearings[n6] + n11, n2 + this.topBearings[n6] + n12, n9, n10, AbstractFont.AbstractFont_color);
                            }
                            else {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont_drawGlyphAlpha(this.pixels[n6], n + this.leftBearings[n6] + 1 + n11, n2 + this.topBearings[n6] + 1 + n12, n9, n10, AbstractFont.AbstractFont_shadow, AbstractFont.AbstractFont_alpha);
                                }
                                this.drawGlyphAlpha(this.pixels[n6], n + this.leftBearings[n6] + n11, n2 + this.topBearings[n6] + n12, n9, n10, AbstractFont.AbstractFont_color, AbstractFont.AbstractFont_alpha);
                            }
                        }
                        else if (AbstractFont.AbstractFont_justificationTotal > 0) {
                            AbstractFont.AbstractFont_justificationCurrent += AbstractFont.AbstractFont_justificationTotal;
                            n += AbstractFont.AbstractFont_justificationCurrent >> 8;
                            AbstractFont.AbstractFont_justificationCurrent &= 0xFF;
                        }
                        final int n13 = this.advances[n6];
                        if (AbstractFont.AbstractFont_strike != -1) {
                            ec(n, n2 + (int)(this.ascent * 0.7), n13, AbstractFont.AbstractFont_strike);
                        }
                        if (AbstractFont.AbstractFont_underline != -1) {
                            ec(n, n2 + this.ascent, n13, AbstractFont.AbstractFont_underline);
                        }
                        n += n13;
                        n4 = n6;
                    }
                }
            }
        }
    }
    
    public void me(final String s, final int n, final int n2, final int n3, final int n4) {
        class492.xb(this, s, n, n2, n3, n4);
    }
    
    public int bw(final String s, final int n) {
        final int mk = mk(this, s, new int[] { n }, AbstractFont.AbstractFont_lines);
        int n2 = 0;
        for (int i = 0; i < mk; ++i) {
            final int bf = this.bf(AbstractFont.AbstractFont_lines[i]);
            if (bf > n2) {
                n2 = bf;
            }
        }
        return n2;
    }
    
    public void cf(final String s, final int n, final int n2, final int n3, final int n4, final int abstractFont_alpha) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        AbstractFont.AbstractFont_alpha = abstractFont_alpha;
        this.draw0(s, n, n2);
    }
    
    static void dn(final int[] array, final byte[] array2, final int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    public int cw(final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, int abstractFont_alpha, final int n7, int n8, int ascent) {
        if (s == null) {
            return 0;
        }
        if (abstractFont_alpha == 255) {
            abstractFont_alpha = 256;
        }
        pr(this, n5, n6);
        AbstractFont.AbstractFont_alpha = abstractFont_alpha;
        if (ascent == 0) {
            ascent = this.ascent;
        }
        int[] array = { n3 };
        if (n4 < this.maxAscent + this.maxDescent + ascent && n4 < ascent + ascent) {
            array = null;
        }
        final int mk = mk(this, s, array, AbstractFont.AbstractFont_lines);
        if (n8 == 3 && mk == 1) {
            n8 = 1;
        }
        int n9;
        if (n8 == 0) {
            n9 = n2 + this.maxAscent;
        }
        else if (n8 == 1) {
            n9 = n2 + this.maxAscent + (n4 - this.maxAscent - this.maxDescent - (mk - 1) * ascent) / 2;
        }
        else if (n8 == 2) {
            n9 = n2 + n4 - this.maxDescent - (mk - 1) * ascent;
        }
        else {
            int n10 = (n4 - this.maxAscent - this.maxDescent - (mk - 1) * ascent) / (mk + 1);
            if (n10 < 0) {
                n10 = 0;
            }
            n9 = n2 + this.maxAscent + n10;
            ascent += n10;
        }
        for (int i = 0; i < mk; ++i) {
            if (n7 == 0) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n, n9);
            }
            else if (n7 == 1) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n + (n3 - this.bf(AbstractFont.AbstractFont_lines[i])) / 2, n9);
            }
            else if (n7 == 2) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n + n3 - this.bf(AbstractFont.AbstractFont_lines[i]), n9);
            }
            else if (i == mk - 1) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n, n9);
            }
            else {
                uc(this, AbstractFont.AbstractFont_lines[i], n3);
                this.draw0(AbstractFont.AbstractFont_lines[i], n, n9);
                AbstractFont.AbstractFont_justificationTotal = 0;
            }
            n9 += ascent;
        }
        return mk;
    }
    
    public void cv(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        this.draw0(s, n - this.bf(s) / 2, n2);
    }
    
    public int stringWidth(final String s) {
        if (s == null) {
            return 0;
        }
        int n = -1;
        int n2 = -1;
        int n3 = 0;
        for (int i = 0; i < s.length(); ++i) {
            char char1 = s.charAt(i);
            if (char1 == '<') {
                n = i;
            }
            else {
                if (char1 == '>' && n != -1) {
                    final String substring = s.substring(n + 1, i);
                    n = -1;
                    if (substring.equals("lt")) {
                        char1 = '<';
                    }
                    else if (substring.equals("gt")) {
                        char1 = '>';
                    }
                    else {
                        if (substring.startsWith("img=")) {
                            try {
                                n3 += AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)(-2))].subHeight;
                                n2 = -1;
                            }
                            catch (Exception ex) {}
                        }
                        continue;
                    }
                }
                if (char1 == ' ') {
                    char1 = ' ';
                }
                if (n == -1) {
                    n3 += this.advances[(char)(class100.vmethod5708(char1, (byte)(-76)) & 0xFF)];
                    if (this.kerning != null && n2 != -1) {
                        n3 += this.kerning[(n2 << 8) + char1];
                    }
                    n2 = char1;
                }
            }
        }
        return n3;
    }
    
    void readMetrics(final byte[] array) {
        this.advances = new int[256];
        if (array.length == 257) {
            for (int i = 0; i < this.advances.length; ++i) {
                this.advances[i] = (array[i] & 0xFF);
            }
            this.ascent = (array[256] & 0xFF);
        }
        else {
            int n = 0;
            for (int j = 0; j < 256; ++j) {
                this.advances[j] = (array[n++] & 0xFF);
            }
            final int[] array2 = new int[256];
            final int[] array3 = new int[256];
            for (int k = 0; k < 256; ++k) {
                array2[k] = (array[n++] & 0xFF);
            }
            for (int l = 0; l < 256; ++l) {
                array3[l] = (array[n++] & 0xFF);
            }
            final byte[][] array4 = new byte[256][];
            for (int n2 = 0; n2 < 256; ++n2) {
                array4[n2] = new byte[array2[n2]];
                byte b = 0;
                for (int n3 = 0; n3 < array4[n2].length; ++n3) {
                    b += array[n++];
                    array4[n2][n3] = b;
                }
            }
            final byte[][] array5 = new byte[256][];
            for (int n4 = 0; n4 < 256; ++n4) {
                array5[n4] = new byte[array2[n4]];
                byte b2 = 0;
                for (int n5 = 0; n5 < array5[n4].length; ++n5) {
                    b2 += array[n++];
                    array5[n4][n5] = b2;
                }
            }
            this.kerning = new byte[65536];
            for (int n6 = 0; n6 < 256; ++n6) {
                if (n6 != 32) {
                    if (n6 != 160) {
                        for (int n7 = 0; n7 < 256; ++n7) {
                            if (n7 != 32) {
                                if (n7 != 160) {
                                    this.kerning[(n6 << 8) + n7] = (byte)method2074(array4, array5, array3, this.advances, array2, n6, n7);
                                }
                            }
                        }
                    }
                }
            }
            this.ascent = array3[32] + array2[32];
        }
    }
    
    public int drawLines(final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        return this.method2055(s, n, n2, n3, n4, n5, n6, 256, n7, n8, n9);
    }
    
    public Bounds method2051(final int n, final int n2, final String s, final int n3, final int n4) {
        if (s != null && s.length() >= n + n2) {
            return new Bounds(n3 - this.bf(s) / 2 + this.bf(s.substring(0, n)), n4 - this.maxAscent, this.bf(s.substring(n, n + n2)), this.maxAscent + this.maxDescent);
        }
        return new Bounds(n3, n4, 0, 0);
    }
    
    public int cj(final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, int abstractFont_alpha, final int n7, int n8, int ascent) {
        if (s == null) {
            return 0;
        }
        if (abstractFont_alpha == 255) {
            abstractFont_alpha = 511853322;
        }
        pr(this, n5, n6);
        AbstractFont.AbstractFont_alpha = abstractFont_alpha;
        if (ascent == 0) {
            ascent = this.ascent;
        }
        int[] array = { n3 };
        if (n4 < this.maxAscent + this.maxDescent + ascent && n4 < ascent + ascent) {
            array = null;
        }
        final int mk = mk(this, s, array, AbstractFont.AbstractFont_lines);
        if (n8 == 3 && mk == 1) {
            n8 = 1;
        }
        int n9;
        if (n8 == 0) {
            n9 = n2 + this.maxAscent;
        }
        else if (n8 == 1) {
            n9 = n2 + this.maxAscent + (n4 - this.maxAscent - this.maxDescent - (mk - 1) * ascent) / 2;
        }
        else if (n8 == 2) {
            n9 = n2 + n4 - this.maxDescent - (mk - 1) * ascent;
        }
        else {
            int n10 = (n4 - this.maxAscent - this.maxDescent - (mk - 1) * ascent) / (mk + 1);
            if (n10 < 0) {
                n10 = 0;
            }
            n9 = n2 + this.maxAscent + n10;
            ascent += n10;
        }
        for (int i = 0; i < mk; ++i) {
            if (n7 == 0) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n, n9);
            }
            else if (n7 == 1) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n + (n3 - this.bf(AbstractFont.AbstractFont_lines[i])) / 2, n9);
            }
            else if (n7 == 2) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n + n3 - this.bf(AbstractFont.AbstractFont_lines[i]), n9);
            }
            else if (i == mk - 1) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n, n9);
            }
            else {
                uc(this, AbstractFont.AbstractFont_lines[i], n3);
                this.draw0(AbstractFont.AbstractFont_lines[i], n, n9);
                AbstractFont.AbstractFont_justificationTotal = 0;
            }
            n9 += ascent;
        }
        return mk;
    }
    
    void decodeTag(final String s) {
        try {
            if (s.startsWith("col=")) {
                AbstractFont.AbstractFont_color = SecureRandomFuture.method456(s.substring(4), 16, true, (byte)(-102));
            }
            else if (s.equals("/col")) {
                AbstractFont.AbstractFont_color = AbstractFont.AbstractFont_previousColor;
            }
            else if (s.startsWith("str=")) {
                AbstractFont.AbstractFont_strike = SecureRandomFuture.method456(s.substring(4), 16, true, (byte)(-39));
            }
            else if (s.equals("str")) {
                AbstractFont.AbstractFont_strike = 8388608;
            }
            else if (s.equals("/str")) {
                AbstractFont.AbstractFont_strike = -1;
            }
            else if (s.startsWith("u=")) {
                AbstractFont.AbstractFont_underline = SecureRandomFuture.method456(s.substring(2), 16, true, (byte)(-57));
            }
            else if (s.equals("u")) {
                AbstractFont.AbstractFont_underline = 0;
            }
            else if (s.equals("/u")) {
                AbstractFont.AbstractFont_underline = -1;
            }
            else if (s.startsWith("shad=")) {
                AbstractFont.AbstractFont_shadow = SecureRandomFuture.method456(s.substring(5), 16, true, (byte)(-48));
            }
            else if (s.equals("shad")) {
                AbstractFont.AbstractFont_shadow = 0;
            }
            else if (s.equals("/shad")) {
                AbstractFont.AbstractFont_shadow = AbstractFont.AbstractFont_previousShadow;
            }
            else if (s.equals("br")) {
                pr(this, AbstractFont.AbstractFont_previousColor, AbstractFont.AbstractFont_previousShadow);
            }
        }
        catch (Exception ex) {}
    }
    
    public class461 cp(final class383 class383, final int n, int n2, final int n3, final int n4, final int n5) {
        if (!class383.method2078(1581984877)) {
            pr(this, n3, n4);
            n2 -= this.ascent;
            for (int i = 0; i < class383.ud(class383, (byte)27); ++i) {
                final class381 method2080 = class383.method2080(i, -1037292745);
                if (n5 != -1 && method2080.field3623 * -727185157 > n5) {
                    return new class461(method2080.field3625 * 1620071571, method2080.field3623 * -727185157);
                }
                int field3624 = method2080.field3624;
                if (field3624 != 10) {
                    if (class383.method2081(i, 1404469435)) {
                        field3624 = -1171105219;
                    }
                    if (field3624 != 9) {
                        if (field3624 == 160) {
                            field3624 = 425177749;
                        }
                        final int n6 = n + method2080.field3625 * 1620071571;
                        final int n7 = n2 + method2080.field3623 * -9508372;
                        final int n8 = this.widths[field3624];
                        final int n9 = this.heights[field3624];
                        if (AbstractFont.AbstractFont_shadow != -1) {
                            this.ac(this.pixels[field3624], n6 + this.leftBearings[field3624] + 1, n7 + this.topBearings[field3624] + 1, n8, n9, AbstractFont.AbstractFont_shadow);
                        }
                        this.ac(this.pixels[field3624], n6 + this.leftBearings[field3624], n7 + this.topBearings[field3624], n8, n9, AbstractFont.AbstractFont_color);
                    }
                }
            }
        }
        return class383.cy(class383, (byte)33);
    }
    
    public void drawRightAligned(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        this.draw0(s, n - this.bf(s), n2);
    }
    
    public static int mk(final AbstractFont abstractFont, final String s, final int[] array, final String[] array2) {
        if (abstractFont == null) {
            return abstractFont.breakLines(s, array, array2);
        }
        if (s == null) {
            return 0;
        }
        int n = 0;
        int n2 = 0;
        int n3 = -1;
        byte b = 0;
        int n4 = 0;
        int n5 = -1;
        int n6 = 0;
        int n7 = 0;
        final int length = s.length();
        AbstractFont.jz.setLength(0);
        for (int i = 0; i < length; ++i) {
            char char1 = s.charAt(i);
            if (char1 == '<') {
                n5 = i;
            }
            else {
                if (char1 == '>' && n5 != -1) {
                    final String substring = s.substring(n5 + 1, i);
                    n5 = -1;
                    AbstractFont.jz.append('<');
                    AbstractFont.jz.append(substring);
                    AbstractFont.jz.append('>');
                    if (substring.equals("br")) {
                        array2[n7++] = AbstractFont.jz.substring(n2);
                        AbstractFont.jz.setLength(0);
                        n2 = 0;
                        n = 0;
                        n3 = -1;
                        n6 = 0;
                    }
                    else if (substring.equals("lt")) {
                        n += abstractFont.di('<');
                        if (abstractFont.kerning != null && n6 != -1) {
                            n += abstractFont.kerning[(n6 << 8) + 60];
                        }
                        n6 = 60;
                    }
                    else if (substring.equals("gt")) {
                        n += abstractFont.di('>');
                        if (abstractFont.kerning != null && n6 != -1) {
                            n += abstractFont.kerning[(n6 << 8) + 62];
                        }
                        n6 = 62;
                    }
                    else if (substring.startsWith("img=")) {
                        try {
                            n += ScriptFrame.client.ru()[Integer.parseInt(substring.substring(4))].getOriginalWidth();
                            n6 = 0;
                        }
                        catch (Exception ex) {}
                    }
                    char1 = '\0';
                }
                if (n5 == -1) {
                    if (char1 != '\0') {
                        AbstractFont.jz.append(char1);
                        n += abstractFont.di(char1);
                        if (abstractFont.kerning != null && n6 != -1) {
                            n += abstractFont.kerning[char1 + (n6 << 8)];
                        }
                        n6 = char1;
                    }
                    if (char1 == ' ') {
                        n3 = AbstractFont.jz.length();
                        b = (byte)n;
                        n4 = 1;
                    }
                    if (array != null && n > array[(n7 < array.length) ? n7 : (array.length - 1)] && n3 >= 0) {
                        array2[n7++] = AbstractFont.jz.substring(n2, n3 - n4);
                        n2 = n3;
                        n3 = -1;
                        n -= b;
                        n6 = 0;
                    }
                    if (char1 == '-') {
                        n3 = AbstractFont.jz.length();
                        b = (byte)n;
                        n4 = 0;
                    }
                }
            }
        }
        if (AbstractFont.jz.length() > n2) {
            array2[n7++] = AbstractFont.jz.substring(n2);
        }
        return n7;
    }
    
    static void eq(final byte[] array, int bk, int bi, int n, int n2, final int n3, final int n4) {
        int n5 = bk + bi * AbstractFont.ae;
        int n6 = AbstractFont.ae - n;
        int n7 = 0;
        int n8 = 0;
        if (bi < AbstractFont.bi) {
            final int n9 = AbstractFont.bi - bi;
            n2 -= n9;
            bi = AbstractFont.bi;
            n8 += n9 * n;
            n5 += n9 * AbstractFont.ae;
        }
        if (bi + n2 > AbstractFont.be) {
            n2 -= bi + n2 - AbstractFont.be;
        }
        if (bk < AbstractFont.bk) {
            final int n10 = AbstractFont.bk - bk;
            n -= n10;
            bk = AbstractFont.bk;
            n8 += n10;
            n5 += n10;
            n7 += n10;
            n6 += n10;
        }
        if (bk + n > AbstractFont.bx) {
            final int n11 = bk + n - AbstractFont.bx;
            n -= n11;
            n7 += n11;
            n6 += n11;
        }
        if (n <= 0 || n2 <= 0) {
            return;
        }
        AbstractFont_placeGlyphAlpha(AbstractFont.ad, array, n3, n8, n5, n, n2, n6, n7, n4);
    }
    
    public static void eq(final AbstractFont abstractFont, final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (abstractFont == null) {
            abstractFont.drawRandomAlphaAndSpacing(s, n, n, n, n, n);
        }
        if (s == null) {
            return;
        }
        pr(abstractFont, n3, n4);
        final int[] array = new int[s.length()];
        final int[] array2 = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            array[i] = (int)(Math.sin(i / 5.0 + n5 / 5.0) * 5.0);
            array2[i] = (int)(Math.sin(i / 3.0 + n5 / 5.0) * 5.0);
        }
        vd(abstractFont, s, n - abstractFont.bf(s) / 2, n2, array, array2);
    }
    
    public int method2055(final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, int abstractFont_alpha, final int n7, int n8, int ascent) {
        if (s == null) {
            return 0;
        }
        if (abstractFont_alpha == 255) {
            abstractFont_alpha = 256;
        }
        pr(this, n5, n6);
        AbstractFont.AbstractFont_alpha = abstractFont_alpha;
        if (ascent == 0) {
            ascent = this.ascent;
        }
        int[] array = { n3 };
        if (n4 < this.maxAscent + this.maxDescent + ascent && n4 < ascent + ascent) {
            array = null;
        }
        final int mk = mk(this, s, array, AbstractFont.AbstractFont_lines);
        if (n8 == 3 && mk == 1) {
            n8 = 1;
        }
        int n9;
        if (n8 == 0) {
            n9 = n2 + this.maxAscent;
        }
        else if (n8 == 1) {
            n9 = n2 + this.maxAscent + (n4 - this.maxAscent - this.maxDescent - (mk - 1) * ascent) / 2;
        }
        else if (n8 == 2) {
            n9 = n2 + n4 - this.maxDescent - (mk - 1) * ascent;
        }
        else {
            int n10 = (n4 - this.maxAscent - this.maxDescent - (mk - 1) * ascent) / (mk + 1);
            if (n10 < 0) {
                n10 = 0;
            }
            n9 = n2 + this.maxAscent + n10;
            ascent += n10;
        }
        for (int i = 0; i < mk; ++i) {
            if (n7 == 0) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n, n9);
            }
            else if (n7 == 1) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n + (n3 - this.bf(AbstractFont.AbstractFont_lines[i])) / 2, n9);
            }
            else if (n7 == 2) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n + n3 - this.bf(AbstractFont.AbstractFont_lines[i]), n9);
            }
            else if (i == mk - 1) {
                this.draw0(AbstractFont.AbstractFont_lines[i], n, n9);
            }
            else {
                uc(this, AbstractFont.AbstractFont_lines[i], n3);
                this.draw0(AbstractFont.AbstractFont_lines[i], n, n9);
                AbstractFont.AbstractFont_justificationTotal = 0;
            }
            n9 += ascent;
        }
        return mk;
    }
    
    public int breakLines(final String s, final int[] array, final String[] array2) {
        if (s == null) {
            return 0;
        }
        int n = 0;
        int length = 0;
        final StringBuilder sb = new StringBuilder(100);
        int n2 = -1;
        byte b = 0;
        int n3 = 0;
        int n4 = -1;
        int n5 = 0;
        int n6 = 0;
        for (int length2 = s.length(), i = 0; i < length2; ++i) {
            char char1 = s.charAt(i);
            if (char1 == '<') {
                n4 = i;
            }
            else {
                if (char1 == 536368456 && n4 != -1) {
                    final String substring = s.substring(n4 + 1, i);
                    n4 = -1;
                    sb.append('<');
                    sb.append(substring);
                    sb.append((char)1681099101);
                    if (substring.equals("br")) {
                        array2[n6] = sb.toString().substring(length, sb.length());
                        ++n6;
                        length = sb.length();
                        n = 0;
                        n2 = -1;
                        n5 = 0;
                    }
                    else if (substring.equals("lt")) {
                        n += this.di((char)(-1066952973));
                        if (this.kerning != null && n5 != -1) {
                            n += this.kerning[(n5 << 8) + 508126706];
                        }
                        n5 = -1800207734;
                    }
                    else if (substring.equals("gt")) {
                        n += this.charWidth((char)(-280705284));
                        if (this.kerning != null && n5 != -1) {
                            n += this.kerning[(n5 << 8) - 1705716054];
                        }
                        n5 = 1469165597;
                    }
                    else if (substring.startsWith("img=")) {
                        try {
                            n += AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)86)].yOffset;
                            n5 = 0;
                        }
                        catch (Exception ex) {}
                    }
                    char1 = '\0';
                }
                if (n4 == -1) {
                    if (char1 != '\0') {
                        sb.append(char1);
                        n += this.di(char1);
                        if (this.kerning != null && n5 != -1) {
                            n += this.kerning[(n5 << 8) + char1];
                        }
                        n5 = char1;
                    }
                    if (char1 == 1569653186) {
                        n2 = sb.length();
                        b = (byte)n;
                        n3 = 1;
                    }
                    if (array != null && n > array[(n6 < array.length) ? n6 : (array.length - 1)] && n2 >= 0) {
                        array2[n6] = sb.toString().substring(length, n2 - n3);
                        ++n6;
                        length = n2;
                        n2 = -1;
                        n -= b;
                        n5 = 0;
                    }
                    if (char1 == -1873327973) {
                        n2 = sb.length();
                        b = (byte)n;
                        n3 = 0;
                    }
                }
            }
        }
        final String string = sb.toString();
        if (string.length() > length) {
            array2[n6++] = string.substring(length, string.length());
        }
        return n6;
    }
    
    public int charWidth(char c) {
        if (c == ' ') {
            c = ' ';
        }
        return this.advances[class100.vmethod5708(c, (byte)0) & 0xFF];
    }
    
    void dt(final int n, final int n2) {
        AbstractFont.AbstractFont_strike = -1;
        AbstractFont.AbstractFont_underline = -1;
        AbstractFont.AbstractFont_previousShadow = n2;
        AbstractFont.AbstractFont_shadow = n2;
        AbstractFont.AbstractFont_previousColor = n;
        AbstractFont.AbstractFont_color = n;
        AbstractFont.AbstractFont_alpha = 256;
        AbstractFont.AbstractFont_justificationTotal = 0;
        AbstractFont.AbstractFont_justificationCurrent = 0;
    }
    
    public static void pr(final AbstractFont abstractFont, final int n, final int n2) {
        if (abstractFont == null) {
            abstractFont.reset(n, n);
            return;
        }
        AbstractFont.AbstractFont_strike = -1;
        AbstractFont.AbstractFont_underline = -1;
        AbstractFont.AbstractFont_previousShadow = n2;
        AbstractFont.AbstractFont_shadow = n2;
        AbstractFont.AbstractFont_previousColor = n;
        AbstractFont.AbstractFont_color = n;
        AbstractFont.AbstractFont_alpha = 256;
        AbstractFont.AbstractFont_justificationTotal = 0;
        AbstractFont.AbstractFont_justificationCurrent = 0;
    }
    
    void reset(final int n, final int n2) {
        AbstractFont.AbstractFont_alpha = -1;
        AbstractFont.AbstractFont_alpha = -1;
        AbstractFont.AbstractFont_previousShadow = n2;
        AbstractFont.AbstractFont_alpha = n2;
        AbstractFont.AbstractFont_shadow = n;
        AbstractFont.AbstractFont_justificationCurrent = n;
        AbstractFont.AbstractFont_color = 256;
        AbstractFont.AbstractFont_alpha = 0;
        AbstractFont.AbstractFont_previousColor = 0;
    }
    
    public int bv(final String s, final int[] array, final String[] array2) {
        if (s == null) {
            return 0;
        }
        int n = 0;
        int length = 0;
        final StringBuilder sb = new StringBuilder(100);
        int n2 = -1;
        byte b = 0;
        int n3 = 0;
        int n4 = -1;
        int n5 = 0;
        int n6 = 0;
        for (int length2 = s.length(), i = 0; i < length2; ++i) {
            char char1 = s.charAt(i);
            if (char1 == '<') {
                n4 = i;
            }
            else {
                if (char1 == '>' && n4 != -1) {
                    final String substring = s.substring(n4 + 1, i);
                    n4 = -1;
                    sb.append('<');
                    sb.append(substring);
                    sb.append('>');
                    if (substring.equals("br")) {
                        array2[n6] = sb.toString().substring(length, sb.length());
                        ++n6;
                        length = sb.length();
                        n = 0;
                        n2 = -1;
                        n5 = 0;
                    }
                    else if (substring.equals("lt")) {
                        n += this.charWidth('<');
                        if (this.kerning != null && n5 != -1) {
                            n += this.kerning[(n5 << 8) + 60];
                        }
                        n5 = 60;
                    }
                    else if (substring.equals("gt")) {
                        n += this.charWidth('>');
                        if (this.kerning != null && n5 != -1) {
                            n += this.kerning[(n5 << 8) + 62];
                        }
                        n5 = 62;
                    }
                    else if (substring.startsWith("img=")) {
                        try {
                            n += AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)(-34))].subHeight;
                            n5 = 0;
                        }
                        catch (Exception ex) {}
                    }
                    char1 = '\0';
                }
                if (n4 == -1) {
                    if (char1 != '\0') {
                        sb.append(char1);
                        n += this.charWidth(char1);
                        if (this.kerning != null && n5 != -1) {
                            n += this.kerning[(n5 << 8) + char1];
                        }
                        n5 = char1;
                    }
                    if (char1 == ' ') {
                        n2 = sb.length();
                        b = (byte)n;
                        n3 = 1;
                    }
                    if (array != null && n > array[(n6 < array.length) ? n6 : (array.length - 1)] && n2 >= 0) {
                        array2[n6] = sb.toString().substring(length, n2 - n3);
                        ++n6;
                        length = n2;
                        n2 = -1;
                        n -= b;
                        n5 = 0;
                    }
                    if (char1 == '-') {
                        n2 = sb.length();
                        b = (byte)n;
                        n3 = 0;
                    }
                }
            }
        }
        final String string = sb.toString();
        if (string.length() > length) {
            array2[n6++] = string.substring(length, string.length());
        }
        return n6;
    }
    
    public void ck(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        this.draw0(s, n, n2);
    }
    
    void drawWithOffsets0(final String s, int n, int n2, final int[] array, final int[] array2) {
        n2 -= this.ascent;
        int n3 = -1;
        int n4 = -1;
        int n5 = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '\0') {
                int n6 = (char)(class100.vmethod5708(s.charAt(i), (byte)(-18)) & 0xFF);
                if (n6 == 60) {
                    n3 = i;
                }
                else {
                    if (n6 == 62 && n3 != -1) {
                        final String substring = s.substring(n3 + 1, i);
                        n3 = -1;
                        if (substring.equals("lt")) {
                            n6 = 60;
                        }
                        else if (substring.equals("gt")) {
                            n6 = 62;
                        }
                        else {
                            if (substring.startsWith("img=")) {
                                try {
                                    int n7;
                                    if (array != null) {
                                        n7 = array[n5];
                                    }
                                    else {
                                        n7 = 0;
                                    }
                                    int n8;
                                    if (array2 != null) {
                                        n8 = array2[n5];
                                    }
                                    else {
                                        n8 = 0;
                                    }
                                    ++n5;
                                    final IndexedSprite indexedSprite = AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)(-101))];
                                    indexedSprite.aa(n + n7, n2 + this.maxAscent - indexedSprite.yOffset + n8);
                                    n += indexedSprite.width;
                                    n4 = -1;
                                }
                                catch (Exception ex) {}
                                continue;
                            }
                            this.decodeTag(substring);
                            continue;
                        }
                    }
                    if (n6 == 160) {
                        n6 = 32;
                    }
                    if (n3 == -1) {
                        if (this.kerning != null && n4 != -1) {
                            n += this.kerning[(n4 << 8) + n6];
                        }
                        final int n9 = this.topBearings[n6];
                        final int n10 = this.advances[n6];
                        int n11;
                        if (array != null) {
                            n11 = array[n5];
                        }
                        else {
                            n11 = 0;
                        }
                        int n12;
                        if (array2 != null) {
                            n12 = array2[n5];
                        }
                        else {
                            n12 = 0;
                        }
                        ++n5;
                        if (n6 != 32) {
                            if (AbstractFont.AbstractFont_alpha == 256) {
                                if (AbstractFont.AbstractFont_color != -1) {
                                    dj(this.pixels[n6], n + this.advances[n6] + 1 + n11, n2 + this.advances[n6] + 1 + n12, n9, n10, AbstractFont.AbstractFont_shadow);
                                }
                                this.drawGlyph(this.pixels[n6], n + this.topBearings[n6] + n11, n2 + this.topBearings[n6] + n12, n9, n10, AbstractFont.AbstractFont_strike);
                            }
                            else {
                                if (AbstractFont.AbstractFont_justificationTotal != -1) {
                                    AbstractFont_drawGlyphAlpha(this.pixels[n6], n + this.widths[n6] + 1 + n11, n2 + this.leftBearings[n6] + 1 + n12, n9, n10, AbstractFont.AbstractFont_underline, AbstractFont.AbstractFont_underline);
                                }
                                this.ab(this.pixels[n6], n + this.advances[n6] + n11, n2 + this.leftBearings[n6] + n12, n9, n10, AbstractFont.AbstractFont_strike, AbstractFont.AbstractFont_strike);
                            }
                        }
                        else if (AbstractFont.AbstractFont_justificationTotal > 0) {
                            AbstractFont.AbstractFont_strike = AbstractFont.AbstractFont_alpha + AbstractFont.AbstractFont_justificationTotal;
                            n += AbstractFont.AbstractFont_previousColor >> 8;
                            AbstractFont.AbstractFont_alpha &= 0xFF;
                        }
                        final int n13 = this.heights[n6];
                        if (AbstractFont.AbstractFont_shadow != -1) {
                            Rasterizer2D.fq(n, n2 + (int)(this.maxDescent * 0.7), n13, AbstractFont.AbstractFont_strike);
                        }
                        if (AbstractFont.AbstractFont_justificationCurrent != -1) {
                            Rasterizer2D.hd(n, n2 + this.maxDescent, n13, AbstractFont.AbstractFont_justificationTotal);
                        }
                        n += n13;
                        n4 = n6;
                    }
                }
            }
        }
    }
    
    public int di(final char c) {
        return this.charWidth(c);
    }
    
    public Bounds cc(final int n, final int n2, final String s, final int n3, final int n4) {
        if (s != null && s.length() >= n + n2) {
            return new Bounds(n3 - this.bf(s) / 2 + this.bf(s.substring(0, n)), n4 - this.maxAscent, this.bf(s.substring(n, n + n2)), this.maxAscent + this.maxDescent);
        }
        return new Bounds(n3, n4, 0, 0);
    }
    
    void dv(final int n, final int n2) {
        AbstractFont.AbstractFont_strike = -1;
        AbstractFont.AbstractFont_underline = -1;
        AbstractFont.AbstractFont_previousShadow = n2;
        AbstractFont.AbstractFont_shadow = n2;
        AbstractFont.AbstractFont_previousColor = n;
        AbstractFont.AbstractFont_color = n;
        AbstractFont.AbstractFont_alpha = 1633806546;
        AbstractFont.AbstractFont_justificationTotal = 0;
        AbstractFont.AbstractFont_justificationCurrent = 0;
    }
    
    static void AbstractFont_placeGlyphAlpha(final int[] array, final byte[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, int n8) {
        n = ((n & 0xFF00FF) * n8 & 0xFF00FF00) + ((n & 0xFF00) * n8 & 0xFF0000) >> 8;
        n8 = 256 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    final int n9 = array[n3];
                    Client.ri(array, n3++, (((n9 & 0xFF00FF) * n8 & 0xFF00FF00) + ((n9 & 0xFF00) * n8 & 0xFF0000) >> 8) + n, 255 - n8);
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    static void ds(final int[] array, final byte[] array2, final int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    public static void xl(final AbstractFont abstractFont, final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (abstractFont == null) {
            abstractFont.ck(s, n, n, n, n);
            return;
        }
        if (s == null) {
            return;
        }
        pr(abstractFont, n3, n4);
        AbstractFont.AbstractFont_random.setSeed(n5);
        AbstractFont.AbstractFont_alpha = 192 + (AbstractFont.AbstractFont_random.nextInt() & 0x1F);
        final int[] array = new int[s.length()];
        int n6 = 0;
        for (int i = 0; i < s.length(); ++i) {
            array[i] = n6;
            if ((AbstractFont.AbstractFont_random.nextInt() & 0x3) == 0x0) {
                ++n6;
            }
        }
        vd(abstractFont, s, n, n2, array, null);
    }
    
    public int bc(final String s, final int n) {
        final int mk = mk(this, s, new int[] { n }, AbstractFont.AbstractFont_lines);
        int n2 = 0;
        for (int i = 0; i < mk; ++i) {
            final int bf = this.bf(AbstractFont.AbstractFont_lines[i]);
            if (bf > n2) {
                n2 = bf;
            }
        }
        return n2;
    }
    
    public static String ci(final String s) {
        final int length = s.length();
        int n = 0;
        for (int i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '<' || char1 == '>') {
                n += 3;
            }
        }
        final StringBuilder sb = new StringBuilder(length + n);
        for (int j = 0; j < length; ++j) {
            final char char2 = s.charAt(j);
            if (char2 == '<') {
                sb.append("<lt>");
            }
            else if (char2 == '>') {
                sb.append("<gt>");
            }
            else {
                sb.append(char2);
            }
        }
        return sb.toString();
    }
    
    abstract void aw(final byte[] p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    public void drawAlpha(final String s, final int n, final int n2, final int n3, final int n4, final int abstractFont_alpha) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        AbstractFont.AbstractFont_alpha = abstractFont_alpha;
        this.draw0(s, n, n2);
    }
    
    abstract void al(final byte[] p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6);
    
    void df(final String s, int n, int n2, final int[] array, final int[] array2) {
        n2 -= this.ascent;
        int n3 = -1;
        int n4 = -1;
        int n5 = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '\0') {
                int n6 = (char)(class100.vmethod5708(s.charAt(i), (byte)(-88)) & 0xFF);
                if (n6 == 1749083189) {
                    n3 = i;
                }
                else {
                    if (n6 == -694075184 && n3 != -1) {
                        final String substring = s.substring(n3 + 1, i);
                        n3 = -1;
                        if (substring.equals("lt")) {
                            n6 = -395741129;
                        }
                        else if (substring.equals("gt")) {
                            n6 = 1088666303;
                        }
                        else {
                            if (substring.startsWith("img=")) {
                                try {
                                    int n7;
                                    if (array != null) {
                                        n7 = array[n5];
                                    }
                                    else {
                                        n7 = 0;
                                    }
                                    int n8;
                                    if (array2 != null) {
                                        n8 = array2[n5];
                                    }
                                    else {
                                        n8 = 0;
                                    }
                                    ++n5;
                                    final IndexedSprite indexedSprite = AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)(-38))];
                                    indexedSprite.ax(n + n7, n2 + this.ascent - indexedSprite.width + n8);
                                    n += indexedSprite.subHeight;
                                    n4 = -1;
                                }
                                catch (Exception ex) {}
                                continue;
                            }
                            this.decodeTag(substring);
                            continue;
                        }
                    }
                    if (n6 == 1483463158) {
                        n6 = 32;
                    }
                    if (n3 == -1) {
                        if (this.kerning != null && n4 != -1) {
                            n += this.kerning[(n4 << 8) + n6];
                        }
                        final int n9 = this.widths[n6];
                        final int n10 = this.heights[n6];
                        int n11;
                        if (array != null) {
                            n11 = array[n5];
                        }
                        else {
                            n11 = 0;
                        }
                        int n12;
                        if (array2 != null) {
                            n12 = array2[n5];
                        }
                        else {
                            n12 = 0;
                        }
                        ++n5;
                        if (n6 != 32) {
                            if (AbstractFont.AbstractFont_alpha == 256) {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont_drawGlyph(this.pixels[n6], n + this.leftBearings[n6] + 1 + n11, n2 + this.topBearings[n6] + 1 + n12, n9, n10, AbstractFont.AbstractFont_shadow);
                                }
                                this.ac(this.pixels[n6], n + this.leftBearings[n6] + n11, n2 + this.topBearings[n6] + n12, n9, n10, AbstractFont.AbstractFont_color);
                            }
                            else {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont_drawGlyphAlpha(this.pixels[n6], n + this.leftBearings[n6] + 1 + n11, n2 + this.topBearings[n6] + 1 + n12, n9, n10, AbstractFont.AbstractFont_shadow, AbstractFont.AbstractFont_alpha);
                                }
                                this.drawGlyphAlpha(this.pixels[n6], n + this.leftBearings[n6] + n11, n2 + this.topBearings[n6] + n12, n9, n10, AbstractFont.AbstractFont_color, AbstractFont.AbstractFont_alpha);
                            }
                        }
                        else if (AbstractFont.AbstractFont_justificationTotal > 0) {
                            AbstractFont.AbstractFont_justificationCurrent += AbstractFont.AbstractFont_justificationTotal;
                            n += AbstractFont.AbstractFont_justificationCurrent >> 8;
                            AbstractFont.AbstractFont_justificationCurrent &= 0xE670E3F6;
                        }
                        final int n13 = this.advances[n6];
                        if (AbstractFont.AbstractFont_strike != -1) {
                            ec(n, n2 + (int)(this.ascent * 0.7), n13, AbstractFont.AbstractFont_strike);
                        }
                        if (AbstractFont.AbstractFont_underline != -1) {
                            ec(n, n2 + this.ascent, n13, AbstractFont.AbstractFont_underline);
                        }
                        n += n13;
                        n4 = n6;
                    }
                }
            }
        }
    }
    
    static void et(final byte[] array, int bk, int bi, int n, int n2, final int n3, final int n4) {
        int n5 = bk + bi * AbstractFont.ae;
        int n6 = AbstractFont.ae - n;
        int n7 = 0;
        int n8 = 0;
        if (bi < AbstractFont.bi) {
            final int n9 = AbstractFont.bi - bi;
            n2 -= n9;
            bi = AbstractFont.bi;
            n8 += n9 * n;
            n5 += n9 * AbstractFont.ae;
        }
        if (bi + n2 > AbstractFont.be) {
            n2 -= bi + n2 - AbstractFont.be;
        }
        if (bk < AbstractFont.bk) {
            final int n10 = AbstractFont.bk - bk;
            n -= n10;
            bk = AbstractFont.bk;
            n8 += n10;
            n5 += n10;
            n7 += n10;
            n6 += n10;
        }
        if (bk + n > AbstractFont.bx) {
            final int n11 = bk + n - AbstractFont.bx;
            n -= n11;
            n7 += n11;
            n6 += n11;
        }
        if (n > 0 && n2 > 0) {
            AbstractFont_placeGlyphAlpha(AbstractFont.ad, array, n3, n8, n5, n, n2, n6, n7, n4);
        }
    }
    
    public void cu(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        this.draw0(s, n, n2);
    }
    
    public static Bounds zh(final AbstractFont abstractFont, final int n, final int n2, final String s, final int n3, final int n4) {
        if (abstractFont == null) {
            abstractFont.cs(n, n, s, n, n);
        }
        if (s != null && s.length() >= n + n2) {
            return new Bounds(n3 - abstractFont.bf(s) / 2 + abstractFont.bf(s.substring(0, n)), n4 - abstractFont.maxAscent, abstractFont.bf(s.substring(n, n + n2)), abstractFont.maxAscent + abstractFont.maxDescent);
        }
        return new Bounds(n3, n4, 0, 0);
    }
    
    public void dm(final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        final int[] array = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            array[i] = (int)(Math.sin(i / 2.0 + n5 / 5.0) * 5.0);
        }
        vd(this, s, n - this.bf(s) / 2, n2, null, array);
    }
    
    abstract void drawGlyphAlpha(final byte[] p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6);
    
    abstract void ac(final byte[] p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    public int bq(final String s) {
        if (s == null) {
            return 0;
        }
        int n = -1;
        int n2 = -1;
        int n3 = 0;
        for (int i = 0; i < s.length(); ++i) {
            int char1 = s.charAt(i);
            if (char1 == 60) {
                n = i;
            }
            else {
                if (char1 == 443792420 && n != -1) {
                    final String substring = s.substring(n + 1, i);
                    n = -1;
                    if (substring.equals("lt")) {
                        char1 = 1497553537;
                    }
                    else if (substring.equals("gt")) {
                        char1 = -856498976;
                    }
                    else {
                        if (substring.startsWith("img=")) {
                            try {
                                n3 += AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)(-121))].subHeight;
                                n2 = -1;
                            }
                            catch (Exception ex) {}
                        }
                        continue;
                    }
                }
                if (char1 == -1986767004) {
                    char1 = 32;
                }
                if (n == -1) {
                    n3 += this.advances[(char)(class100.vmethod5708((char)char1, (byte)60) & 0xFF)];
                    if (this.kerning != null && n2 != -1) {
                        n3 += this.kerning[(n2 << 8) + char1];
                    }
                    n2 = char1;
                }
            }
        }
        return n3;
    }
    
    void dk(final int n, final int n2) {
        AbstractFont.AbstractFont_strike = -1;
        AbstractFont.AbstractFont_underline = -1;
        AbstractFont.AbstractFont_previousShadow = n2;
        AbstractFont.AbstractFont_shadow = n2;
        AbstractFont.AbstractFont_previousColor = n;
        AbstractFont.AbstractFont_color = n;
        AbstractFont.AbstractFont_alpha = 256;
        AbstractFont.AbstractFont_justificationTotal = 0;
        AbstractFont.AbstractFont_justificationCurrent = 0;
    }
    
    public void do(final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        final int[] array = new int[s.length()];
        final int[] array2 = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            array[i] = (int)(Math.sin(i / 5.0 + n5 / 5.0) * 5.0);
            array2[i] = (int)(Math.sin(i / 3.0 + n5 / 5.0) * 5.0);
        }
        vd(this, s, n - this.bf(s) / 2, n2, array, array2);
    }
    
    public static Bounds vm(final AbstractFont abstractFont, final int n, final int n2, final String s, final int n3, final int n4) {
        if (abstractFont == null) {
            abstractFont.cl(s, n, n, n, n, n);
        }
        if (s != null && s.length() >= n + n2) {
            return new Bounds(n3 - abstractFont.bf(s) / 2 + abstractFont.bf(s.substring(0, n)), n4 - abstractFont.maxAscent, abstractFont.bf(s.substring(n, n + n2)), abstractFont.maxAscent + abstractFont.maxDescent);
        }
        return new Bounds(n3, n4, 0, 0);
    }
    
    void dz(final int n, final int n2) {
        AbstractFont.AbstractFont_strike = -1;
        AbstractFont.AbstractFont_underline = -1;
        AbstractFont.AbstractFont_previousShadow = n2;
        AbstractFont.AbstractFont_shadow = n2;
        AbstractFont.AbstractFont_previousColor = n;
        AbstractFont.AbstractFont_color = n;
        AbstractFont.AbstractFont_alpha = 256;
        AbstractFont.AbstractFont_justificationTotal = 0;
        AbstractFont.AbstractFont_justificationCurrent = 0;
    }
    
    public static int fa(final AbstractFont abstractFont, final String s, final int n) {
        if (abstractFont == null) {
            abstractFont.lineWidth(s, n);
        }
        final int mk = mk(abstractFont, s, new int[] { n }, AbstractFont.AbstractFont_lines);
        int n2 = 0;
        for (int i = 0; i < mk; ++i) {
            final int bf = abstractFont.bf(AbstractFont.AbstractFont_lines[i]);
            if (bf > n2) {
                n2 = bf;
            }
        }
        return n2;
    }
    
    abstract void au(final byte[] p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    static int method2074(final byte[][] array, final byte[][] array2, final int[] array3, final int[] array4, final int[] array5, final int n, final int n2) {
        final int n3 = array3[n];
        final int n4 = n3 + array5[n];
        final int n5 = array3[n2];
        final int n6 = n5 + array5[n2];
        int n7 = n3;
        if (n5 > n3) {
            n7 = n5;
        }
        int n8;
        if (n6 < (n8 = n4)) {
            n8 = n6;
        }
        int n9 = array4[n];
        if (array4[n2] < n9) {
            n9 = array4[n2];
        }
        final byte[] array6 = array2[n];
        final byte[] array7 = array[n2];
        int n10 = n7 - n3;
        int n11 = n7 - n5;
        for (int i = n7; i < n8; ++i) {
            final int n12 = array6[n10++] + array7[n11++];
            if (n12 < n9) {
                n9 = n12;
            }
        }
        return -n9;
    }
    
    public static int ty(final AbstractFont abstractFont, char c) {
        if (c == 554384171) {
            c = (char)(-1930259009);
        }
        return abstractFont.advances[class100.vmethod5708(c, (byte)(-7)) & 0x7802E177];
    }
    
    public static void vd(final AbstractFont abstractFont, final String s, int n, int n2, final int[] array, final int[] array2) {
        if (abstractFont == null) {
            abstractFont.drawWithOffsets0(s, n, n, array, array);
            return;
        }
        n2 -= abstractFont.ascent;
        int n3 = -1;
        int n4 = -1;
        int n5 = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '\0') {
                int n6 = (char)(class100.vmethod5708(s.charAt(i), (byte)(-18)) & 0xFF);
                if (n6 == 60) {
                    n3 = i;
                }
                else {
                    if (n6 == 62 && n3 != -1) {
                        final String substring = s.substring(n3 + 1, i);
                        n3 = -1;
                        if (substring.equals("lt")) {
                            n6 = 60;
                        }
                        else if (substring.equals("gt")) {
                            n6 = 62;
                        }
                        else {
                            if (substring.startsWith("img=")) {
                                try {
                                    int n7;
                                    if (array != null) {
                                        n7 = array[n5];
                                    }
                                    else {
                                        n7 = 0;
                                    }
                                    int n8;
                                    if (array2 != null) {
                                        n8 = array2[n5];
                                    }
                                    else {
                                        n8 = 0;
                                    }
                                    ++n5;
                                    final IndexedSprite indexedSprite = AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)(-101))];
                                    indexedSprite.ax(n + n7, n2 + abstractFont.ascent - indexedSprite.width + n8);
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
                    if (n6 == 160) {
                        n6 = 32;
                    }
                    if (n3 == -1) {
                        if (abstractFont.kerning != null && n4 != -1) {
                            n += abstractFont.kerning[(n4 << 8) + n6];
                        }
                        final int n9 = abstractFont.widths[n6];
                        final int n10 = abstractFont.heights[n6];
                        int n11;
                        if (array != null) {
                            n11 = array[n5];
                        }
                        else {
                            n11 = 0;
                        }
                        int n12;
                        if (array2 != null) {
                            n12 = array2[n5];
                        }
                        else {
                            n12 = 0;
                        }
                        ++n5;
                        if (n6 != 32) {
                            if (AbstractFont.AbstractFont_alpha == 256) {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont_drawGlyph(abstractFont.pixels[n6], n + abstractFont.leftBearings[n6] + 1 + n11, n2 + abstractFont.topBearings[n6] + 1 + n12, n9, n10, AbstractFont.AbstractFont_shadow);
                                }
                                abstractFont.ac(abstractFont.pixels[n6], n + abstractFont.leftBearings[n6] + n11, n2 + abstractFont.topBearings[n6] + n12, n9, n10, AbstractFont.AbstractFont_color);
                            }
                            else {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont_drawGlyphAlpha(abstractFont.pixels[n6], n + abstractFont.leftBearings[n6] + 1 + n11, n2 + abstractFont.topBearings[n6] + 1 + n12, n9, n10, AbstractFont.AbstractFont_shadow, AbstractFont.AbstractFont_alpha);
                                }
                                abstractFont.drawGlyphAlpha(abstractFont.pixels[n6], n + abstractFont.leftBearings[n6] + n11, n2 + abstractFont.topBearings[n6] + n12, n9, n10, AbstractFont.AbstractFont_color, AbstractFont.AbstractFont_alpha);
                            }
                        }
                        else if (AbstractFont.AbstractFont_justificationTotal > 0) {
                            AbstractFont.AbstractFont_justificationCurrent += AbstractFont.AbstractFont_justificationTotal;
                            n += AbstractFont.AbstractFont_justificationCurrent >> 8;
                            AbstractFont.AbstractFont_justificationCurrent &= 0xFF;
                        }
                        final int n13 = abstractFont.advances[n6];
                        if (AbstractFont.AbstractFont_strike != -1) {
                            ec(n, n2 + (int)(abstractFont.ascent * 0.7), n13, AbstractFont.AbstractFont_strike);
                        }
                        if (AbstractFont.AbstractFont_underline != -1) {
                            ec(n, n2 + abstractFont.ascent, n13, AbstractFont.AbstractFont_underline);
                        }
                        n += n13;
                        n4 = n6;
                    }
                }
            }
        }
    }
    
    public int lineWidth(final String s, final int n) {
        final int mk = mk(this, s, new int[] { n }, AbstractFont.AbstractFont_lines);
        int n2 = 0;
        for (int i = 0; i < mk; ++i) {
            final int bu = this.bu(AbstractFont.AbstractFont_lines[i]);
            if (bu > n2) {
                n2 = bu;
            }
        }
        return n2;
    }
    
    static void dx(final byte[] array, int bk, int bi, int n, int n2, final int n3) {
        int n4 = bk + bi * AbstractFont.ae;
        int n5 = AbstractFont.ae - n;
        int n6 = 0;
        int n7 = 0;
        if (bi < AbstractFont.bi) {
            final int n8 = AbstractFont.bi - bi;
            n2 -= n8;
            bi = AbstractFont.bi;
            n7 += n8 * n;
            n4 += n8 * AbstractFont.ae;
        }
        if (bi + n2 > AbstractFont.be) {
            n2 -= bi + n2 - AbstractFont.be;
        }
        if (bk < AbstractFont.bk) {
            final int n9 = AbstractFont.bk - bk;
            n -= n9;
            bk = AbstractFont.bk;
            n7 += n9;
            n4 += n9;
            n6 += n9;
            n5 += n9;
        }
        if (bk + n > AbstractFont.bx) {
            final int n10 = bk + n - AbstractFont.bx;
            n -= n10;
            n6 += n10;
            n5 += n10;
        }
        if (n > 0 && n2 > 0) {
            AbstractFont_placeGlyph(AbstractFont.ad, array, n3, n7, n4, n, n2, n5, n6);
        }
    }
    
    static void dy(final int[] array, final byte[] array2, final int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    public int bh(final String s, final int n) {
        final int mk = mk(this, s, new int[] { n }, AbstractFont.AbstractFont_lines);
        int n2 = 0;
        for (int i = 0; i < mk; ++i) {
            final int bf = this.bf(AbstractFont.AbstractFont_lines[i]);
            if (bf > n2) {
                n2 = bf;
            }
        }
        return n2;
    }
    
    public int getBaseline() {
        return this.ascent;
    }
    
    public void drawCenteredShake(final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        double n7 = 7.0 - n6 / 8.0;
        if (n7 < 0.0) {
            n7 = 0.0;
        }
        final int[] array = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            array[i] = (int)(Math.sin(i / 1.5 + n5 / 1.0) * n7);
        }
        vd(this, s, n - this.bf(s) / 2, n2, null, array);
    }
    
    void draw0(final String s, int n, int n2) {
        n2 -= this.ascent;
        int n3 = -1;
        int n4 = -1;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '\0') {
                int n5 = (char)(class100.vmethod5708(s.charAt(i), (byte)(-63)) & 0xFF);
                if (n5 == 60) {
                    n3 = i;
                }
                else {
                    if (n5 == 62 && n3 != -1) {
                        final String substring = s.substring(n3 + 1, i);
                        n3 = -1;
                        if (substring.equals("lt")) {
                            n5 = 60;
                        }
                        else if (substring.equals("gt")) {
                            n5 = 62;
                        }
                        else {
                            if (substring.startsWith("img=")) {
                                try {
                                    final IndexedSprite indexedSprite = AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)(-15))];
                                    indexedSprite.ax(n, n2 + this.ascent - indexedSprite.width);
                                    n += indexedSprite.subHeight;
                                    n4 = -1;
                                }
                                catch (Exception ex) {}
                                continue;
                            }
                            this.decodeTag(substring);
                            continue;
                        }
                    }
                    if (n5 == 160) {
                        n5 = 32;
                    }
                    if (n3 == -1) {
                        if (this.kerning != null && n4 != -1) {
                            n += this.kerning[(n4 << 8) + n5];
                        }
                        final int n6 = this.widths[n5];
                        final int n7 = this.heights[n5];
                        if (n5 != 32) {
                            if (AbstractFont.AbstractFont_alpha == 256) {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont_drawGlyph(this.pixels[n5], n + this.leftBearings[n5] + 1, n2 + this.topBearings[n5] + 1, n6, n7, AbstractFont.AbstractFont_shadow);
                                }
                                this.ac(this.pixels[n5], n + this.leftBearings[n5], n2 + this.topBearings[n5], n6, n7, AbstractFont.AbstractFont_color);
                            }
                            else {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont_drawGlyphAlpha(this.pixels[n5], n + this.leftBearings[n5] + 1, n2 + this.topBearings[n5] + 1, n6, n7, AbstractFont.AbstractFont_shadow, AbstractFont.AbstractFont_alpha);
                                }
                                this.drawGlyphAlpha(this.pixels[n5], n + this.leftBearings[n5], n2 + this.topBearings[n5], n6, n7, AbstractFont.AbstractFont_color, AbstractFont.AbstractFont_alpha);
                            }
                        }
                        else if (AbstractFont.AbstractFont_justificationTotal > 0) {
                            AbstractFont.AbstractFont_justificationCurrent += AbstractFont.AbstractFont_justificationTotal;
                            n += AbstractFont.AbstractFont_justificationCurrent >> 8;
                            AbstractFont.AbstractFont_justificationCurrent &= 0xFF;
                        }
                        final int n8 = this.advances[n5];
                        if (AbstractFont.AbstractFont_strike != -1) {
                            ec(n, n2 + (int)(this.ascent * 0.7), n8, AbstractFont.AbstractFont_strike);
                        }
                        if (AbstractFont.AbstractFont_underline != -1) {
                            ec(n, n2 + this.ascent + 1, n8, AbstractFont.AbstractFont_underline);
                        }
                        n += n8;
                        n4 = n5;
                    }
                }
            }
        }
    }
    
    public void draw(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        this.dp(s, n - this.bq(s), n2);
    }
    
    public static void drawCenteredWave2(final AbstractFont abstractFont, final String s, final int n, final int n2, final int n3, final int n4) {
        if (abstractFont == null) {
            abstractFont.co(s, n, n, n, n, n, n, n, n, n);
        }
        if (s == null) {
            return;
        }
        pr(abstractFont, n3, n4);
        abstractFont.draw0(s, n, n2);
    }
    
    public void drawCenteredWave2(final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        final int[] array = new int[s.length()];
        final int[] array2 = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            array[i] = (int)(Math.sin(i / 5.0 + n5 / 5.0) * 5.0);
            array2[i] = (int)(Math.sin(i / 3.0 + n5 / 5.0) * 5.0);
        }
        vd(this, s, n - this.bf(s) / 2, n2, array, array2);
    }
    
    static void AbstractFont_drawGlyphAlpha(final byte[] array, int bk, int bi, int n, int n2, final int n3, final int n4) {
        int n5 = bk + bi * AbstractFont.ae;
        int n6 = AbstractFont.ae - n;
        int n7 = 0;
        int n8 = 0;
        if (bi < AbstractFont.bi) {
            final int n9 = AbstractFont.bi - bi;
            n2 -= n9;
            bi = AbstractFont.bi;
            n8 += n9 * n;
            n5 += n9 * AbstractFont.ae;
        }
        if (bi + n2 > AbstractFont.be) {
            n2 -= bi + n2 - AbstractFont.be;
        }
        if (bk < AbstractFont.bk) {
            final int n10 = AbstractFont.bk - bk;
            n -= n10;
            bk = AbstractFont.bk;
            n8 += n10;
            n5 += n10;
            n7 += n10;
            n6 += n10;
        }
        if (bk + n > AbstractFont.bx) {
            final int n11 = bk + n - AbstractFont.bx;
            n -= n11;
            n7 += n11;
            n6 += n11;
        }
        if (n > 0 && n2 > 0) {
            AbstractFont_placeGlyphAlpha(AbstractFont.ad, array, n3, n8, n5, n, n2, n6, n7, n4);
        }
    }
    
    public static int AbstractFont_drawGlyphAlpha(final AbstractFont abstractFont, final String s, final int n) {
        if (abstractFont == null) {
            abstractFont.method2051(n, n, s, n, n);
        }
        final int mk = mk(abstractFont, s, new int[] { n }, AbstractFont.AbstractFont_lines);
        int n2 = 0;
        for (int i = 0; i < mk; ++i) {
            final int bf = abstractFont.bf(AbstractFont.AbstractFont_lines[i]);
            if (bf > n2) {
                n2 = bf;
            }
        }
        return n2;
    }
    
    public void cm(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        this.draw0(s, n, n2);
    }
    
    public void cg(final String s, final int n, final int n2, final int n3, final int n4, final int abstractFont_alpha) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        AbstractFont.AbstractFont_alpha = abstractFont_alpha;
        this.draw0(s, n, n2);
    }
    
    public int co(final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        return this.method2055(s, n, n2, n3, n4, n5, n6, 256, n7, n8, n9);
    }
    
    public void cy(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        this.draw0(s, n - this.bf(s), n2);
    }
    
    abstract void drawGlyph(final byte[] p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    public int cz(final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        return this.method2055(s, n, n2, n3, n4, n5, n6, 256, n7, n8, n9);
    }
    
    public void dr(final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        AbstractFont.AbstractFont_random.setSeed(n5);
        AbstractFont.AbstractFont_alpha = 192 + (AbstractFont.AbstractFont_random.nextInt() & 0x935EA347);
        final int[] array = new int[s.length()];
        int n6 = 0;
        for (int i = 0; i < s.length(); ++i) {
            array[i] = n6;
            if ((AbstractFont.AbstractFont_random.nextInt() & 0x3) == 0x0) {
                ++n6;
            }
        }
        vd(this, s, n, n2, array, null);
    }
    
    public static class461 wb(final AbstractFont abstractFont, final class383 class383, final int n, int n2, final int n3, final int n4, final int n5) {
        if (abstractFont == null) {
            abstractFont.dt(n, n);
        }
        if (!class383.method2078(-2143219860)) {
            pr(abstractFont, n3, n4);
            n2 -= abstractFont.ascent;
            for (int i = 0; i < class383.ud(class383, (byte)37); ++i) {
                final class381 method2080 = class383.method2080(i, -1037292745);
                if (n5 != -1 && method2080.field3623 * -727185157 > n5) {
                    return new class461(method2080.field3625 * 1620071571, method2080.field3623 * -727185157);
                }
                int field3624 = method2080.field3624;
                if (field3624 != 10) {
                    if (class383.method2081(i, 931166090)) {
                        field3624 = 42;
                    }
                    if (field3624 != 9) {
                        if (field3624 == 160) {
                            field3624 = 32;
                        }
                        final int n6 = n + method2080.field3625 * 1620071571;
                        final int n7 = n2 + method2080.field3623 * -727185157;
                        final int n8 = abstractFont.widths[field3624];
                        final int n9 = abstractFont.heights[field3624];
                        if (AbstractFont.AbstractFont_shadow != -1) {
                            abstractFont.ac(abstractFont.pixels[field3624], n6 + abstractFont.leftBearings[field3624] + 1, n7 + abstractFont.topBearings[field3624] + 1, n8, n9, AbstractFont.AbstractFont_shadow);
                        }
                        abstractFont.ac(abstractFont.pixels[field3624], n6 + abstractFont.leftBearings[field3624], n7 + abstractFont.topBearings[field3624], n8, n9, AbstractFont.AbstractFont_color);
                    }
                }
            }
        }
        return class383.cy(class383, (byte)42);
    }
    
    abstract void ab(final byte[] p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6);
    
    abstract void aq(final byte[] p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6);
    
    public void drawCentered(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        pr(this, n3, n4);
        this.draw0(s, n - this.bf(s) / 2, n2);
    }
    
    public int lineCount(final String s, final int n) {
        final int mk = mk(this, s, new int[] { n }, AbstractFont.AbstractFont_lines);
        int n2 = 0;
        for (int i = 0; i < mk; ++i) {
            final int stringWidth = this.stringWidth(AbstractFont.AbstractFont_lines[i]);
            if (stringWidth > n2) {
                n2 = stringWidth;
            }
        }
        return n2;
    }
    
    public int bl(final String s, final int[] array, final String[] array2) {
        if (s == null) {
            return 0;
        }
        int n = 0;
        int length = 0;
        final StringBuilder sb = new StringBuilder(100);
        int n2 = -1;
        byte b = 0;
        int n3 = 0;
        int n4 = -1;
        int n5 = 0;
        int n6 = 0;
        for (int length2 = s.length(), i = 0; i < length2; ++i) {
            char char1 = s.charAt(i);
            if (char1 == '<') {
                n4 = i;
            }
            else {
                if (char1 == '>' && n4 != -1) {
                    final String substring = s.substring(n4 + 1, i);
                    n4 = -1;
                    sb.append('<');
                    sb.append(substring);
                    sb.append('>');
                    if (substring.equals("br")) {
                        array2[n6] = sb.toString().substring(length, sb.length());
                        ++n6;
                        length = sb.length();
                        n = 0;
                        n2 = -1;
                        n5 = 0;
                    }
                    else if (substring.equals("lt")) {
                        n += this.charWidth('<');
                        if (this.kerning != null && n5 != -1) {
                            n += this.kerning[(n5 << 8) + 60];
                        }
                        n5 = 60;
                    }
                    else if (substring.equals("gt")) {
                        n += this.charWidth('>');
                        if (this.kerning != null && n5 != -1) {
                            n += this.kerning[(n5 << 8) + 62];
                        }
                        n5 = 62;
                    }
                    else if (substring.startsWith("img=")) {
                        try {
                            n += AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)(-5))].subHeight;
                            n5 = 0;
                        }
                        catch (Exception ex) {}
                    }
                    char1 = '\0';
                }
                if (n4 == -1) {
                    if (char1 != '\0') {
                        sb.append(char1);
                        n += this.charWidth(char1);
                        if (this.kerning != null && n5 != -1) {
                            n += this.kerning[(n5 << 8) + char1];
                        }
                        n5 = char1;
                    }
                    if (char1 == ' ') {
                        n2 = sb.length();
                        b = (byte)n;
                        n3 = 1;
                    }
                    if (array != null && n > array[(n6 < array.length) ? n6 : (array.length - 1)] && n2 >= 0) {
                        array2[n6] = sb.toString().substring(length, n2 - n3);
                        ++n6;
                        length = n2;
                        n2 = -1;
                        n -= b;
                        n5 = 0;
                    }
                    if (char1 == '-') {
                        n2 = sb.length();
                        b = (byte)n;
                        n3 = 0;
                    }
                }
            }
        }
        final String string = sb.toString();
        if (string.length() > length) {
            array2[n6++] = string.substring(length, string.length());
        }
        return n6;
    }
    
    static void ep(final int[] array, final byte[] array2, final int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    static void AbstractFont_drawGlyph(final byte[] array, int bk, int bi, int n, int n2, final int n3) {
        int n4 = bk + bi * AbstractFont.ae;
        int n5 = AbstractFont.ae - n;
        int n6 = 0;
        int n7 = 0;
        if (bi < AbstractFont.bi) {
            final int n8 = AbstractFont.bi - bi;
            n2 -= n8;
            bi = AbstractFont.bi;
            n7 += n8 * n;
            n4 += n8 * AbstractFont.ae;
        }
        if (bi + n2 > AbstractFont.be) {
            n2 -= bi + n2 - AbstractFont.be;
        }
        if (bk < AbstractFont.bk) {
            final int n9 = AbstractFont.bk - bk;
            n -= n9;
            bk = AbstractFont.bk;
            n7 += n9;
            n4 += n9;
            n6 += n9;
            n5 += n9;
        }
        if (bk + n > AbstractFont.bx) {
            final int n10 = bk + n - AbstractFont.bx;
            n -= n10;
            n6 += n10;
            n5 += n10;
        }
        if (n > 0 && n2 > 0) {
            AbstractFont_placeGlyph(AbstractFont.ad, array, n3, n7, n4, n, n2, n5, n6);
        }
    }
    
    static void ej(final int[] array, final byte[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, int n8) {
        n = ((n & 0xFF00FF) * n8 & 0xFF00FF00) + ((n & 0xFF00) * n8 & 0xFF0000) >> 8;
        n8 = 256 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    final int n9 = array[n3];
                    array[n3++] = (((n9 & 0xFF00FF) * n8 & 0xFF00FF00) + ((n9 & 0xFF00) * n8 & 0xFF0000) >> 8) + n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    void bj(final byte[] array) {
        this.advances = new int[292672682];
        if (array.length == -2111897478) {
            for (int i = 0; i < this.advances.length; ++i) {
                this.advances[i] = (array[i] & 0xFF);
            }
            this.ascent = (array[256] & 0xFF);
        }
        else {
            int n = 0;
            for (int j = 0; j < 256; ++j) {
                this.advances[j] = (array[n++] & 0xFF);
            }
            final int[] array2 = new int[-1509605744];
            final int[] array3 = new int[929995407];
            for (int k = 0; k < 256; ++k) {
                array2[k] = (array[n++] & 0xFF);
            }
            for (int l = 0; l < -47305467; ++l) {
                array3[l] = (array[n++] & 0xD421DC77);
            }
            final byte[][] array4 = new byte[256][];
            for (int n2 = 0; n2 < -1732073128; ++n2) {
                array4[n2] = new byte[array2[n2]];
                byte b = 0;
                for (int n3 = 0; n3 < array4[n2].length; ++n3) {
                    b += array[n++];
                    array4[n2][n3] = b;
                }
            }
            final byte[][] array5 = new byte[256][];
            for (int n4 = 0; n4 < 256; ++n4) {
                array5[n4] = new byte[array2[n4]];
                byte b2 = 0;
                for (int n5 = 0; n5 < array5[n4].length; ++n5) {
                    b2 += array[n++];
                    array5[n4][n5] = b2;
                }
            }
            this.kerning = new byte[1135027598];
            for (int n6 = 0; n6 < 256; ++n6) {
                if (n6 != 1803693006) {
                    if (n6 != 160) {
                        for (int n7 = 0; n7 < 256; ++n7) {
                            if (n7 != -1792232037) {
                                if (n7 != -2125471068) {
                                    this.kerning[(n6 << 8) + n7] = (byte)method2074(array4, array5, array3, this.advances, array2, n6, n7);
                                }
                            }
                        }
                    }
                }
            }
            this.ascent = array3[2042363698] + array2[32];
        }
    }
    
    static void dd(final byte[] array, int bk, int bi, int n, int n2, final int n3) {
        int n4 = bk + bi * AbstractFont.ae;
        int n5 = AbstractFont.ae - n;
        int n6 = 0;
        int n7 = 0;
        if (bi < AbstractFont.bi) {
            final int n8 = AbstractFont.bi - bi;
            n2 -= n8;
            bi = AbstractFont.bi;
            n7 += n8 * n;
            n4 += n8 * AbstractFont.ae;
        }
        if (bi + n2 > AbstractFont.be) {
            n2 -= bi + n2 - AbstractFont.be;
        }
        if (bk < AbstractFont.bk) {
            final int n9 = AbstractFont.bk - bk;
            n -= n9;
            bk = AbstractFont.bk;
            n7 += n9;
            n4 += n9;
            n6 += n9;
            n5 += n9;
        }
        if (bk + n > AbstractFont.bx) {
            final int n10 = bk + n - AbstractFont.bx;
            n -= n10;
            n6 += n10;
            n5 += n10;
        }
        if (n > 0 && n2 > 0) {
            AbstractFont_placeGlyph(AbstractFont.ad, array, n3, n7, n4, n, n2, n5, n6);
        }
    }
    
    static void dj(final byte[] array, int bk, int bi, int n, int n2, final int n3) {
        int n4 = bk + bi * AbstractFont.ae;
        int n5 = AbstractFont.ae - n;
        int n6 = 0;
        int n7 = 0;
        if (bi < AbstractFont.bi) {
            final int n8 = AbstractFont.bi - bi;
            n2 -= n8;
            bi = AbstractFont.bi;
            n7 += n8 * n;
            n4 += n8 * AbstractFont.ae;
        }
        if (bi + n2 > AbstractFont.be) {
            n2 -= bi + n2 - AbstractFont.be;
        }
        if (bk < AbstractFont.bk) {
            final int n9 = AbstractFont.bk - bk;
            n -= n9;
            bk = AbstractFont.bk;
            n7 += n9;
            n4 += n9;
            n6 += n9;
            n5 += n9;
        }
        if (bk + n > AbstractFont.bx) {
            final int n10 = bk + n - AbstractFont.bx;
            n -= n10;
            n6 += n10;
            n5 += n10;
        }
        if (n > 0 && n2 > 0) {
            AbstractFont_placeGlyph(AbstractFont.ad, array, n3, n7, n4, n, n2, n5, n6);
        }
    }
    
    public static int yx(final AbstractFont abstractFont, char c) {
        if (abstractFont == null) {
            abstractFont.di(c);
        }
        if (c == ' ') {
            c = ' ';
        }
        return abstractFont.advances[class100.vmethod5708(c, (byte)82) & 0xA10E6616];
    }
    
    public static void gs(final AbstractFont abstractFont, final String s, final int n, final int n2, final int n3, final int n4) {
        if (abstractFont == null) {
            abstractFont.cs(n, n, s, n, n);
        }
        if (s == null) {
            return;
        }
        pr(abstractFont, n3, n4);
        abstractFont.draw0(s, n - abstractFont.bf(s) / 2, n2);
    }
    
    static void AbstractFont_placeGlyph(final int[] array, final byte[] array2, final int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    array[n3++] = (n | 0xFF000000);
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = (n | 0xFF000000);
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = (n | 0xFF000000);
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = (n | 0xFF000000);
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                if (array2[n2++] != 0) {
                    array[n3++] = (n | 0xFF000000);
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    void calculateLineJustification(final String s, final int n) {
        int n2 = 0;
        boolean b = false;
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '<') {
                b = true;
            }
            else if (char1 == '>') {
                b = false;
            }
            else if (!b && char1 == ' ') {
                ++n2;
            }
        }
        if (n2 > 0) {
            AbstractFont.AbstractFont_strike = (n - this.stringWidth(s) << 8) / n2;
        }
    }
    
    public static void lu(final AbstractFont abstractFont, final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (abstractFont == null) {
            abstractFont.drawRandomAlphaAndSpacing(s, n, n, n, n, n);
        }
        if (s == null) {
            return;
        }
        pr(abstractFont, n3, n4);
        AbstractFont.AbstractFont_random.setSeed(n5);
        AbstractFont.AbstractFont_alpha = 192 + (AbstractFont.AbstractFont_random.nextInt() & 0x1F);
        final int[] array = new int[s.length()];
        int n6 = 0;
        for (int i = 0; i < s.length(); ++i) {
            array[i] = n6;
            if ((AbstractFont.AbstractFont_random.nextInt() & 0x3) == 0x0) {
                ++n6;
            }
        }
        vd(abstractFont, s, n, n2, array, null);
    }
    
    static void ez(final int[] array, final byte[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, int n8) {
        n = ((n & 0xB26940B1) * n8 & 0xFF00FF00) + ((n & 0x36E89408) * n8 & 0xD182A9CE) >> 8;
        n8 = 256 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    final int n9 = array[n3];
                    array[n3++] = (((n9 & 0x711CC3C1) * n8 & 0x21E2EDDA) + ((n9 & 0xFF00) * n8 & 0xFF0000) >> 8) + n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    static void dq(final byte[] array, int bk, int bi, int n, int n2, final int n3) {
        int n4 = bk + bi * AbstractFont.ae;
        int n5 = AbstractFont.ae - n;
        int n6 = 0;
        int n7 = 0;
        if (bi < AbstractFont.bi) {
            final int n8 = AbstractFont.bi - bi;
            n2 -= n8;
            bi = AbstractFont.bi;
            n7 += n8 * n;
            n4 += n8 * AbstractFont.ae;
        }
        if (bi + n2 > AbstractFont.be) {
            n2 -= bi + n2 - AbstractFont.be;
        }
        if (bk < AbstractFont.bk) {
            final int n9 = AbstractFont.bk - bk;
            n -= n9;
            bk = AbstractFont.bk;
            n7 += n9;
            n4 += n9;
            n6 += n9;
            n5 += n9;
        }
        if (bk + n > AbstractFont.bx) {
            final int n10 = bk + n - AbstractFont.bx;
            n -= n10;
            n6 += n10;
            n5 += n10;
        }
        if (n > 0 && n2 > 0) {
            AbstractFont_placeGlyph(AbstractFont.ad, array, n3, n7, n4, n, n2, n5, n6);
        }
    }
    
    static void eo(final byte[] array, int bk, int bi, int n, int n2, final int n3, final int n4) {
        int n5 = bk + bi * AbstractFont.ae;
        int n6 = AbstractFont.ae - n;
        int n7 = 0;
        int n8 = 0;
        if (bi < AbstractFont.bi) {
            final int n9 = AbstractFont.bi - bi;
            n2 -= n9;
            bi = AbstractFont.bi;
            n8 += n9 * n;
            n5 += n9 * AbstractFont.ae;
        }
        if (bi + n2 > AbstractFont.be) {
            n2 -= bi + n2 - AbstractFont.be;
        }
        if (bk < AbstractFont.bk) {
            final int n10 = AbstractFont.bk - bk;
            n -= n10;
            bk = AbstractFont.bk;
            n8 += n10;
            n5 += n10;
            n7 += n10;
            n6 += n10;
        }
        if (bk + n > AbstractFont.bx) {
            final int n11 = bk + n - AbstractFont.bx;
            n -= n11;
            n7 += n11;
            n6 += n11;
        }
        if (n > 0 && n2 > 0) {
            AbstractFont_placeGlyphAlpha(AbstractFont.ad, array, n3, n8, n5, n, n2, n6, n7, n4);
        }
    }
    
    public static String escapeBrackets(final String s) {
        final int length = s.length();
        int n = 0;
        for (int i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '<' || char1 == '>') {
                n += 3;
            }
        }
        final StringBuilder sb = new StringBuilder(length + n);
        for (int j = 0; j < length; ++j) {
            final char char2 = s.charAt(j);
            if (char2 == '<') {
                sb.append("<lt>");
            }
            else if (char2 == '>') {
                sb.append("<gt>");
            }
            else {
                sb.append(char2);
            }
        }
        return sb.toString();
    }
    
    public static class461 wq(final AbstractFont abstractFont, final class383 class383, final int n, int n2, final int n3, final int n4, final int n5) {
        if (abstractFont == null) {
            abstractFont.method2056(class383, n, n, n, n, n);
        }
        if (!class383.method2078(305604555)) {
            pr(abstractFont, n3, n4);
            n2 -= abstractFont.ascent;
            for (int i = 0; i < class383.ud(class383, (byte)63); ++i) {
                final class381 method2080 = class383.method2080(i, -1037292745);
                if (n5 != -1 && method2080.field3623 * 1198403325 > n5) {
                    return new class461(method2080.field3625 * -1327658589, method2080.field3623 * -396091070);
                }
                int field3624 = method2080.field3624;
                if (field3624 != 10) {
                    if (class383.method2081(i, 2049054764)) {
                        field3624 = 1058589023;
                    }
                    if (field3624 != 9) {
                        if (field3624 == 1988804832) {
                            field3624 = -1502161211;
                        }
                        final int n6 = n + method2080.field3625 * -474322663;
                        final int n7 = n2 + method2080.field3623 * -727185157;
                        final int n8 = abstractFont.widths[field3624];
                        final int n9 = abstractFont.heights[field3624];
                        if (AbstractFont.AbstractFont_shadow != -1) {
                            abstractFont.ac(abstractFont.pixels[field3624], n6 + abstractFont.leftBearings[field3624] + 1, n7 + abstractFont.topBearings[field3624] + 1, n8, n9, AbstractFont.AbstractFont_shadow);
                        }
                        abstractFont.ac(abstractFont.pixels[field3624], n6 + abstractFont.leftBearings[field3624], n7 + abstractFont.topBearings[field3624], n8, n9, AbstractFont.AbstractFont_color);
                    }
                }
            }
        }
        return class383.cy(class383, (byte)105);
    }
    
    static void ef(final int[] array, final byte[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, int n8) {
        n = ((n & 0x1FCB3B13) * n8 & 0x85B18758) + ((n & 0x46551B8D) * n8 & 0xFF0000) >> 8;
        n8 = 256 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    final int n9 = array[n3];
                    array[n3++] = (((n9 & 0xF09E2ACC) * n8 & 0x7071E225) + ((n9 & 0xA42152A1) * n8 & 0xFF0000) >> 8) + n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    public static void uu(final AbstractFont abstractFont, final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (abstractFont == null) {
            abstractFont.drawLines(s, n, n, n, n, n, n, n, n, n);
        }
        if (s == null) {
            return;
        }
        pr(abstractFont, n3, n4);
        final int[] array = new int[s.length()];
        final int[] array2 = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            array[i] = (int)(Math.sin(i / 5.0 + n5 / 5.0) * 5.0);
            array2[i] = (int)(Math.sin(i / 3.0 + n5 / 5.0) * 5.0);
        }
        vd(abstractFont, s, n - abstractFont.bf(s) / 2, n2, array, array2);
    }
    
    public static void uj(final AbstractFont abstractFont, final String s, int n, int n2) {
        n2 -= abstractFont.ascent;
        int n3 = -1;
        int n4 = -1;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '\0') {
                int n5 = (char)(class100.vmethod5708(s.charAt(i), (byte)42) & 0xFF);
                if (n5 == 60) {
                    n3 = i;
                }
                else {
                    if (n5 == 62 && n3 != -1) {
                        final String substring = s.substring(n3 + 1, i);
                        n3 = -1;
                        if (substring.equals("lt")) {
                            n5 = 60;
                        }
                        else if (substring.equals("gt")) {
                            n5 = 62;
                        }
                        else {
                            if (substring.startsWith("img=")) {
                                try {
                                    final IndexedSprite indexedSprite = AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)48)];
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
                    if (n5 == 160) {
                        n5 = 32;
                    }
                    if (n3 == -1) {
                        if (abstractFont.kerning != null && n4 != -1) {
                            n += abstractFont.kerning[(n4 << 8) + n5];
                        }
                        final int n6 = abstractFont.widths[n5];
                        final int n7 = abstractFont.heights[n5];
                        if (n5 != 32) {
                            if (AbstractFont.AbstractFont_alpha == 256) {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont_drawGlyph(abstractFont.pixels[n5], n + abstractFont.leftBearings[n5] + 1, n2 + abstractFont.topBearings[n5] + 1, n6, n7, AbstractFont.AbstractFont_shadow);
                                }
                                abstractFont.ac(abstractFont.pixels[n5], n + abstractFont.leftBearings[n5], n2 + abstractFont.topBearings[n5], n6, n7, AbstractFont.AbstractFont_color);
                            }
                            else {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont_drawGlyphAlpha(abstractFont.pixels[n5], n + abstractFont.leftBearings[n5] + 1, n2 + abstractFont.topBearings[n5] + 1, n6, n7, AbstractFont.AbstractFont_shadow, AbstractFont.AbstractFont_alpha);
                                }
                                abstractFont.drawGlyphAlpha(abstractFont.pixels[n5], n + abstractFont.leftBearings[n5], n2 + abstractFont.topBearings[n5], n6, n7, AbstractFont.AbstractFont_color, AbstractFont.AbstractFont_alpha);
                            }
                        }
                        else if (AbstractFont.AbstractFont_justificationTotal > 0) {
                            AbstractFont.AbstractFont_justificationCurrent += AbstractFont.AbstractFont_justificationTotal;
                            n += AbstractFont.AbstractFont_justificationCurrent >> 8;
                            AbstractFont.AbstractFont_justificationCurrent &= 0xFF;
                        }
                        final int n8 = abstractFont.advances[n5];
                        if (AbstractFont.AbstractFont_strike != -1) {
                            ec(n, n2 + (int)(abstractFont.ascent * 0.7), n8, AbstractFont.AbstractFont_strike);
                        }
                        if (AbstractFont.AbstractFont_underline != -1) {
                            ec(n, n2 + abstractFont.ascent + 1, n8, AbstractFont.AbstractFont_underline);
                        }
                        n += n8;
                        n4 = n5;
                    }
                }
            }
        }
    }
    
    public int bf(final String s) {
        if (s == null) {
            return 0;
        }
        int n = -1;
        int n2 = -1;
        int n3 = 0;
        for (int i = 0; i < s.length(); ++i) {
            char char1 = s.charAt(i);
            if (char1 == '<') {
                n = i;
            }
            else {
                if (char1 == '>' && n != -1) {
                    final String substring = s.substring(n + 1, i);
                    n = -1;
                    if (substring.equals("lt")) {
                        char1 = '<';
                    }
                    else if (substring.equals("gt")) {
                        char1 = '>';
                    }
                    else {
                        if (substring.startsWith("img=")) {
                            try {
                                n3 += AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)(-126))].subHeight;
                                n2 = -1;
                            }
                            catch (Exception ex) {}
                        }
                        continue;
                    }
                }
                if (char1 == ' ') {
                    char1 = ' ';
                }
                if (n == -1) {
                    n3 += this.advances[(char)(class100.vmethod5708(char1, (byte)51) & 0xFF)];
                    if (this.kerning != null && n2 != -1) {
                        n3 += this.kerning[(n2 << 8) + char1];
                    }
                    n2 = char1;
                }
            }
        }
        return n3;
    }
    
    public int bu(final String s) {
        if (s == null) {
            return 0;
        }
        int n = -1;
        int n2 = -1;
        int n3 = 0;
        for (int i = 0; i < s.length(); ++i) {
            char char1 = s.charAt(i);
            if (char1 == '<') {
                n = i;
            }
            else {
                if (char1 == '>' && n != -1) {
                    final String substring = s.substring(n + 1, i);
                    n = -1;
                    if (substring.equals("lt")) {
                        char1 = '<';
                    }
                    else if (substring.equals("gt")) {
                        char1 = '>';
                    }
                    else {
                        if (substring.startsWith("img=")) {
                            try {
                                n3 += AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)(-44))].subHeight;
                                n2 = -1;
                            }
                            catch (Exception ex) {}
                        }
                        continue;
                    }
                }
                if (char1 == ' ') {
                    char1 = ' ';
                }
                if (n == -1) {
                    n3 += this.advances[(char)(class100.vmethod5708(char1, (byte)(-14)) & 0xFF)];
                    if (this.kerning != null && n2 != -1) {
                        n3 += this.kerning[(n2 << 8) + char1];
                    }
                    n2 = char1;
                }
            }
        }
        return n3;
    }
    
    void du(final String s, int n, int n2, final int[] array, final int[] array2) {
        n2 -= this.ascent;
        int n3 = -1;
        int n4 = -1;
        int n5 = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '\0') {
                int n6 = (char)(class100.vmethod5708(s.charAt(i), (byte)0) & 0xFF);
                if (n6 == 60) {
                    n3 = i;
                }
                else {
                    if (n6 == 62 && n3 != -1) {
                        final String substring = s.substring(n3 + 1, i);
                        n3 = -1;
                        if (substring.equals("lt")) {
                            n6 = 1693351857;
                        }
                        else if (substring.equals("gt")) {
                            n6 = 62;
                        }
                        else {
                            if (substring.startsWith("img=")) {
                                try {
                                    int n7;
                                    if (array != null) {
                                        n7 = array[n5];
                                    }
                                    else {
                                        n7 = 0;
                                    }
                                    int n8;
                                    if (array2 != null) {
                                        n8 = array2[n5];
                                    }
                                    else {
                                        n8 = 0;
                                    }
                                    ++n5;
                                    final IndexedSprite indexedSprite = AbstractFont.AbstractFont_modIconSprites[PacketBufferNode.release(substring.substring(4), (byte)(-77))];
                                    indexedSprite.ax(n + n7, n2 + this.ascent - indexedSprite.width + n8);
                                    n += indexedSprite.subHeight;
                                    n4 = -1;
                                }
                                catch (Exception ex) {}
                                continue;
                            }
                            this.decodeTag(substring);
                            continue;
                        }
                    }
                    if (n6 == 160) {
                        n6 = 32;
                    }
                    if (n3 == -1) {
                        if (this.kerning != null && n4 != -1) {
                            n += this.kerning[(n4 << 8) + n6];
                        }
                        final int n9 = this.widths[n6];
                        final int n10 = this.heights[n6];
                        int n11;
                        if (array != null) {
                            n11 = array[n5];
                        }
                        else {
                            n11 = 0;
                        }
                        int n12;
                        if (array2 != null) {
                            n12 = array2[n5];
                        }
                        else {
                            n12 = 0;
                        }
                        ++n5;
                        if (n6 != 32) {
                            if (AbstractFont.AbstractFont_alpha == 256) {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont_drawGlyph(this.pixels[n6], n + this.leftBearings[n6] + 1 + n11, n2 + this.topBearings[n6] + 1 + n12, n9, n10, AbstractFont.AbstractFont_shadow);
                                }
                                this.ac(this.pixels[n6], n + this.leftBearings[n6] + n11, n2 + this.topBearings[n6] + n12, n9, n10, AbstractFont.AbstractFont_color);
                            }
                            else {
                                if (AbstractFont.AbstractFont_shadow != -1) {
                                    AbstractFont_drawGlyphAlpha(this.pixels[n6], n + this.leftBearings[n6] + 1 + n11, n2 + this.topBearings[n6] + 1 + n12, n9, n10, AbstractFont.AbstractFont_shadow, AbstractFont.AbstractFont_alpha);
                                }
                                this.drawGlyphAlpha(this.pixels[n6], n + this.leftBearings[n6] + n11, n2 + this.topBearings[n6] + n12, n9, n10, AbstractFont.AbstractFont_color, AbstractFont.AbstractFont_alpha);
                            }
                        }
                        else if (AbstractFont.AbstractFont_justificationTotal > 0) {
                            AbstractFont.AbstractFont_justificationCurrent += AbstractFont.AbstractFont_justificationTotal;
                            n += AbstractFont.AbstractFont_justificationCurrent >> 8;
                            AbstractFont.AbstractFont_justificationCurrent &= 0xFF;
                        }
                        final int n13 = this.advances[n6];
                        if (AbstractFont.AbstractFont_strike != -1) {
                            ec(n, n2 + (int)(this.ascent * 0.7), n13, AbstractFont.AbstractFont_strike);
                        }
                        if (AbstractFont.AbstractFont_underline != -1) {
                            ec(n, n2 + this.ascent, n13, AbstractFont.AbstractFont_underline);
                        }
                        n += n13;
                        n4 = n6;
                    }
                }
            }
        }
    }
    
    public int getTextWidth(final String s) {
        return this.bf(s);
    }
}
