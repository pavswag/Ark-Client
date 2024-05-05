import java.awt.Color;
import java.awt.image.BufferedImage;

// 
// Decompiled by Procyon v0.5.36
// 

public final class SpritePixels extends Rasterizer2D implements net.runelite.api.SpritePixels
{
    public int height;
    public int subWidth;
    public int[] pixels;
    public int xOffset;
    int yOffset;
    public int width;
    public int subHeight;
    static final int al = 4;
    static final int at = 15;
    static final int aa = 8;
    static final int ay = 12;
    static final int ao = 4095;
    
    public SpritePixels(final int n, final int n2) {
        this(new int[n * n2], n, n2);
    }
    
    public SpritePixels(final int[] pixels, final int n, final int n2) {
        this.pixels = pixels;
        this.width = n;
        this.subWidth = n;
        this.height = n2;
        this.subHeight = n2;
        this.yOffset = 0;
        this.xOffset = 0;
    }
    
    SpritePixels() {
    }
    
    public void cs(final int n) {
        final int[] pixels = new int[this.subWidth * this.subHeight];
        int n2 = 0;
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = 0; j < this.subWidth; ++j) {
                int n3 = this.pixels[n2];
                if (n3 == 0) {
                    if (j > 0 && this.pixels[n2 - 1] != 0) {
                        n3 = n;
                    }
                    else if (i > 0 && this.pixels[n2 - this.subWidth] != 0) {
                        n3 = n;
                    }
                    else if (j < this.subWidth - 1 && this.pixels[n2 + 1] != 0) {
                        n3 = n;
                    }
                    else if (i < this.subHeight - 1 && this.pixels[n2 + this.subWidth] != 0) {
                        n3 = n;
                    }
                }
                pixels[n2++] = n3;
            }
        }
        this.pixels = pixels;
    }
    
    public void dp(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int[] array, final int[] array2) {
        final int n7 = (n2 < 0) ? (-n2) : 0;
        final int n8 = (n2 + this.subHeight <= n6) ? this.subHeight : (n6 - n2);
        final int n9 = (n < 0) ? (-n) : 0;
        if (n + this.subWidth <= n5) {
            final int subWidth = this.subWidth;
        }
        int n10 = n3 + n + n9 + (n4 + n2 + n7) * SpritePixels.ae;
        int n11 = n2 + n7;
        for (int i = n7; i < n8; ++i) {
            final int n12 = array[n11];
            final int n13 = array2[n11++];
            int n14 = n10;
            int n15;
            if (n < n12) {
                n15 = n12 - n;
                n14 += n15 - n9;
            }
            else {
                n15 = n9;
            }
            int subWidth2;
            if (n + this.subWidth <= n12 + n13) {
                subWidth2 = this.subWidth;
            }
            else {
                subWidth2 = n12 + n13 - n;
            }
            for (int j = n15; j < subWidth2; ++j) {
                final int n16 = this.pixels[j + i * this.subWidth];
                if (n16 != 0) {
                    SpritePixels.ad[n14++] = n16;
                }
                else {
                    ++n14;
                }
            }
            n10 += SpritePixels.ae;
        }
    }
    
    public SpritePixels bs() {
        final SpritePixels spritePixels = new SpritePixels(this.subWidth, this.subHeight);
        spritePixels.width = this.width;
        spritePixels.height = this.height;
        spritePixels.xOffset = this.xOffset;
        spritePixels.yOffset = this.yOffset;
        for (int length = this.pixels.length, i = 0; i < length; ++i) {
            spritePixels.pixels[i] = this.pixels[i];
        }
        return spritePixels;
    }
    
    public void ca(int bk, int bi) {
        bk += this.xOffset;
        bi += this.yOffset;
        int n = bk + bi * SpritePixels.ae;
        int n2 = 0;
        int subHeight = this.subHeight;
        int subWidth = this.subWidth;
        int n3 = SpritePixels.ae - subWidth;
        int n4 = 0;
        if (bi < SpritePixels.bi) {
            final int n5 = SpritePixels.bi - bi;
            subHeight -= n5;
            bi = SpritePixels.bi;
            n2 += n5 * subWidth;
            n += n5 * SpritePixels.ae;
        }
        if (bi + subHeight > SpritePixels.be) {
            subHeight -= bi + subHeight - SpritePixels.be;
        }
        if (bk < SpritePixels.bk) {
            final int n6 = SpritePixels.bk - bk;
            subWidth -= n6;
            bk = SpritePixels.bk;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (bk + subWidth > SpritePixels.bx) {
            final int n7 = bk + subWidth - SpritePixels.bx;
            subWidth -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (subWidth <= 0 || subHeight <= 0) {
            return;
        }
        Sprite_draw(SpritePixels.ad, this.pixels, n2, n, subWidth, subHeight, n3, n4);
    }
    
    static void method2618(int n, int n2, int n3, final int[] array, final int[] array2, int n4, int i, int n5, int j, final int n6, final int n7, final int n8, final int n9) {
        for (j = -n7; j < 0; ++j) {
            for (i = -n6; i < 0; ++i) {
                n = array2[n4++];
                if (n != 0) {
                    n2 = array[n5];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array[n5++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n5;
                }
            }
            n5 += n8;
            n4 += n9;
        }
    }
    
    public void cd(int n, int n2, int n3, int n4, final int n5) {
        if (n3 > 0 && n4 > 0) {
            final int subWidth = this.subWidth;
            final int subHeight = this.subHeight;
            int n6 = 0;
            int n7 = 0;
            final int width = this.width;
            final int height = this.height;
            final int n8 = (width << 16) / n3;
            final int n9 = (height << 16) / n4;
            if (this.xOffset > 0) {
                final int n10 = ((this.xOffset << 16) + n8 - 1) / n8;
                n += n10;
                n6 += n10 * n8 - (this.xOffset << 16);
            }
            if (this.yOffset > 0) {
                final int n11 = ((this.yOffset << 16) + n9 - 1) / n9;
                n2 += n11;
                n7 += n11 * n9 - (this.yOffset << 16);
            }
            if (subWidth < width) {
                n3 = ((subWidth << 16) - n6 + n8 - 1) / n8;
            }
            if (subHeight < height) {
                n4 = ((subHeight << 16) - n7 + n9 - 1) / n9;
            }
            int n12 = n + n2 * SpritePixels.ae;
            int n13 = SpritePixels.ae - n3;
            if (n2 + n4 > SpritePixels.be) {
                n4 -= n2 + n4 - SpritePixels.be;
            }
            if (n2 < SpritePixels.bi) {
                final int n14 = SpritePixels.bi - n2;
                n4 -= n14;
                n12 += n14 * SpritePixels.ae;
                n7 += n9 * n14;
            }
            if (n + n3 > SpritePixels.bx) {
                final int n15 = n + n3 - SpritePixels.bx;
                n3 -= n15;
                n13 += n15;
            }
            if (n < SpritePixels.bk) {
                final int n16 = SpritePixels.bk - n;
                n3 -= n16;
                n12 += n16;
                n6 += n8 * n16;
                n13 += n16;
            }
            Sprite_drawTransScaled(SpritePixels.ad, this.pixels, 0, n6, n7, n12, n13, n3, n4, n8, n9, subWidth, n5);
        }
    }
    
    public void ba() {
        if (this.subWidth == this.width && this.subHeight == this.height) {
            return;
        }
        final int[] pixels = new int[this.width * this.height];
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = 0; j < this.subWidth; ++j) {
                pixels[(i + this.yOffset) * this.width + (j + this.xOffset)] = this.pixels[i * this.subWidth + j];
            }
        }
        this.pixels = pixels;
        this.subWidth = this.width;
        this.subHeight = this.height;
        this.xOffset = 0;
        this.yOffset = 0;
    }
    
    static void method2619(int n, int n2, int n3, final int[] array, final int[] array2, int n4, int i, int n5, int j, final int n6, final int n7, final int n8, final int n9, final int n10) {
        for (j = -n7; j < 0; ++j) {
            for (i = -n6; i < 0; ++i) {
                n = array2[n4++];
                if (n != 0) {
                    n2 = (n & 0xFF00FF) * n10;
                    n = (n2 & 0xFF00FF00) + (n * n10 - n2 & 0xFF0000) >>> 8;
                    n2 = array[n5];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array[n5++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n5;
                }
            }
            n5 += n8;
            n4 += n9;
        }
    }
    
    public static void method2619(final SpritePixels spritePixels, int i, int j, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int[] array, final int[] array2) {
        if (spritePixels == null) {
            spritePixels.dx(i, i, i, i, i, i, i, i, array, array);
        }
        try {
            final int n7 = -n / 2;
            final int n8 = -n2 / 2;
            final int n9 = (int)(Math.sin(n5 / 326.11) * 65536.0);
            final int n10 = (int)(Math.cos(n5 / 326.11) * 65536.0);
            final int n11 = n9 * n6 >> 8;
            final int n12 = n10 * n6 >> 8;
            int n13 = (n3 << 16) + (n8 * n11 + n7 * n12);
            int n14 = (n4 << 16) + (n8 * n12 - n7 * n11);
            int n15 = i + j * SpritePixels.ae;
            int n16;
            int n17;
            int n18;
            int n19;
            for (j = 0; j < n2; ++j) {
                n16 = array[j];
                n17 = n15 + n16;
                n18 = n13 + n12 * n16;
                n19 = n14 - n11 * n16;
                for (i = -array2[j]; i < 0; ++i) {
                    SpritePixels.ad[n17++] = spritePixels.pixels[(n18 >> 16) + (n19 >> 16) * spritePixels.subWidth];
                    n18 += n12;
                    n19 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += SpritePixels.ae;
            }
        }
        catch (Exception ex) {}
    }
    
    public void cr(int n, int n2, int n3, int n4) {
        if (n3 > 0 && n4 > 0) {
            final int subWidth = this.subWidth;
            final int subHeight = this.subHeight;
            int n5 = 0;
            int n6 = 0;
            final int width = this.width;
            final int height = this.height;
            final int n7 = (width << 16) / n3;
            final int n8 = (height << 16) / n4;
            if (this.xOffset > 0) {
                final int n9 = ((this.xOffset << 16) + n7 - 1) / n7;
                n += n9;
                n5 += n9 * n7 - (this.xOffset << 16);
            }
            if (this.yOffset > 0) {
                final int n10 = ((this.yOffset << 16) + n8 - 1) / n8;
                n2 += n10;
                n6 += n10 * n8 - (this.yOffset << 16);
            }
            if (subWidth < width) {
                n3 = ((subWidth << 16) - n5 + n7 - 1) / n7;
            }
            if (subHeight < height) {
                n4 = ((subHeight << 16) - n6 + n8 - 1) / n8;
            }
            int n11 = n + n2 * SpritePixels.ae;
            int n12 = SpritePixels.ae - n3;
            if (n2 + n4 > SpritePixels.be) {
                n4 -= n2 + n4 - SpritePixels.be;
            }
            if (n2 < SpritePixels.bi) {
                final int n13 = SpritePixels.bi - n2;
                n4 -= n13;
                n11 += n13 * SpritePixels.ae;
                n6 += n8 * n13;
            }
            if (n + n3 > SpritePixels.bx) {
                final int n14 = n + n3 - SpritePixels.bx;
                n3 -= n14;
                n12 += n14;
            }
            if (n < SpritePixels.bk) {
                final int n15 = SpritePixels.bk - n;
                n3 -= n15;
                n11 += n15;
                n5 += n7 * n15;
                n12 += n15;
            }
            Sprite_drawScaled(SpritePixels.ad, this.pixels, 0, n5, n6, n11, n12, n3, n4, n7, n8, subWidth);
        }
    }
    
    public void ce() {
        final int[] pixels = new int[this.subHeight * this.width];
        int n = 0;
        for (int i = this.width - 1; i >= 0; --i) {
            for (int j = 0; j < this.width; ++j) {
                pixels[n++] = this.pixels[j + i * this.xOffset];
            }
        }
        this.pixels = pixels;
        this.yOffset = this.height - this.xOffset - this.yOffset;
    }
    
    static void method2627(int n, int n2, int n3, int n4, final int[] array, final int[] array2, int i, int n5, int j, int n6, int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13) {
        final int n14 = n4;
        while (j < 0) {
            n5 = (n6 >> 16) * n12;
            for (i = -n9; i < 0; ++i) {
                n = array[(n4 >> 16) + n5];
                if (n != 0) {
                    n2 = (n & 0xFF00FF) * n13;
                    n = (n2 & 0xFF00FF00) + (n * n13 - n2 & 0xFF0000) >>> 8;
                    n2 = array2[n7];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array2[n7++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n7;
                }
                n4 += n10;
            }
            n6 += n11;
            n4 = n14;
            n7 += n8;
            ++j;
        }
    }
    
    public void cb(int bk, int bi, final int n) {
        bk += this.xOffset;
        bi += this.yOffset;
        int n2 = bk + bi * SpritePixels.ae;
        int n3 = 0;
        int subHeight = this.subHeight;
        int subWidth = this.subWidth;
        int n4 = SpritePixels.ae - subWidth;
        int n5 = 0;
        if (bi < SpritePixels.bi) {
            final int n6 = SpritePixels.bi - bi;
            subHeight -= n6;
            bi = SpritePixels.bi;
            n3 += n6 * subWidth;
            n2 += n6 * SpritePixels.ae;
        }
        if (bi + subHeight > SpritePixels.be) {
            subHeight -= bi + subHeight - SpritePixels.be;
        }
        if (bk < SpritePixels.bk) {
            final int n7 = SpritePixels.bk - bk;
            subWidth -= n7;
            bk = SpritePixels.bk;
            n3 += n7;
            n2 += n7;
            n5 += n7;
            n4 += n7;
        }
        if (bk + subWidth > SpritePixels.bx) {
            final int n8 = bk + subWidth - SpritePixels.bx;
            subWidth -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (subWidth <= 0 || subHeight <= 0) {
            return;
        }
        Sprite_drawTransparent(SpritePixels.ad, this.pixels, 0, n3, n2, subWidth, subHeight, n4, n5, n);
    }
    
    public void da(int i, int j, final int n, final int n2, final int n3, final int n4, final double n5, final int n6) {
        try {
            final int n7 = -n / 2;
            final int n8 = -n2 / 2;
            final int n9 = (int)(Math.sin(n5) * 65536.0);
            final int n10 = (int)(Math.cos(n5) * 65536.0);
            final int n11 = n9 * n6 >> 8;
            final int n12 = n10 * n6 >> 8;
            int n13 = (n3 << 16) + (n8 * n11 + n7 * n12);
            int n14 = (n4 << 16) + (n8 * n12 - n7 * n11);
            int n15 = i + j * SpritePixels.ae;
            int n16;
            int n17;
            int n18;
            int n19;
            for (j = 0; j < n2; ++j) {
                n16 = n15;
                n17 = n13;
                n18 = n14;
                for (i = -n; i < 0; ++i) {
                    n19 = this.pixels[(n17 >> 16) + (n18 >> 16) * this.subWidth];
                    if (n19 != 0) {
                        SpritePixels.ad[n16++] = n19;
                    }
                    else {
                        ++n16;
                    }
                    n17 += n12;
                    n18 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += SpritePixels.ae;
            }
        }
        catch (Exception ex) {}
    }
    
    public static void pa(final SpritePixels spritePixels) {
        final int[] pixels = new int[spritePixels.subWidth * spritePixels.subHeight];
        int n = 0;
        for (int i = 0; i < spritePixels.subHeight; ++i) {
            for (int j = spritePixels.subWidth - 1; j >= 0; --j) {
                pixels[n++] = spritePixels.pixels[j + i * spritePixels.subWidth];
            }
        }
        spritePixels.pixels = pixels;
        spritePixels.xOffset = spritePixels.width - spritePixels.subWidth - spritePixels.xOffset;
    }
    
    static void ch(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int n9 = -298475141 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    final int n10 = array[n3];
                    array[n3++] = ((n & 0xFF00FF) * n8 + (n10 & 0xFF00FF) * n9 & 0xD1965B5E) + ((n & 0xE79EA83A) * n8 + (n10 & 0xFF00) * n9 & 0xFF0000) >> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    public void cl(int n, int n2, int n3, int n4) {
        if (n3 > 0 && n4 > 0) {
            final int subWidth = this.subWidth;
            final int subHeight = this.subHeight;
            int n5 = 0;
            int n6 = 0;
            final int width = this.width;
            final int height = this.height;
            final int n7 = (width << 16) / n3;
            final int n8 = (height << 16) / n4;
            if (this.xOffset > 0) {
                final int n9 = ((this.xOffset << 16) + n7 - 1) / n7;
                n += n9;
                n5 += n9 * n7 - (this.xOffset << 16);
            }
            if (this.yOffset > 0) {
                final int n10 = ((this.yOffset << 16) + n8 - 1) / n8;
                n2 += n10;
                n6 += n10 * n8 - (this.yOffset << 16);
            }
            if (subWidth < width) {
                n3 = ((subWidth << 16) - n5 + n7 - 1) / n7;
            }
            if (subHeight < height) {
                n4 = ((subHeight << 16) - n6 + n8 - 1) / n8;
            }
            int n11 = n + n2 * SpritePixels.ae;
            int n12 = SpritePixels.ae - n3;
            if (n2 + n4 > SpritePixels.be) {
                n4 -= n2 + n4 - SpritePixels.be;
            }
            if (n2 < SpritePixels.bi) {
                final int n13 = SpritePixels.bi - n2;
                n4 -= n13;
                n11 += n13 * SpritePixels.ae;
                n6 += n8 * n13;
            }
            if (n + n3 > SpritePixels.bx) {
                final int n14 = n + n3 - SpritePixels.bx;
                n3 -= n14;
                n12 += n14;
            }
            if (n < SpritePixels.bk) {
                final int n15 = SpritePixels.bk - n;
                n3 -= n15;
                n11 += n15;
                n5 += n7 * n15;
                n12 += n15;
            }
            Sprite_drawScaled(SpritePixels.ad, this.pixels, 0, n5, n6, n11, n12, n3, n4, n7, n8, subWidth);
        }
    }
    
    public void cn(final int n) {
        for (int i = this.subHeight - 1; i > 0; --i) {
            final int n2 = i * this.subWidth;
            for (int j = this.subWidth - 1; j > 0; --j) {
                if (this.pixels[j + n2] == 0 && this.pixels[j + n2 - 1 - this.subWidth] != 0) {
                    this.pixels[j + n2] = n;
                }
            }
        }
    }
    
    public void db(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int[] array, final int[] array2) {
        final int n7 = (n2 < 0) ? (-n2) : 0;
        final int n8 = (n2 + this.subHeight <= n6) ? this.subHeight : (n6 - n2);
        final int n9 = (n < 0) ? (-n) : 0;
        if (n + this.subWidth <= n5) {
            final int subWidth = this.subWidth;
        }
        int n10 = n3 + n + n9 + (n4 + n2 + n7) * SpritePixels.ae;
        int n11 = n2 + n7;
        for (int i = n7; i < n8; ++i) {
            final int n12 = array[n11];
            final int n13 = array2[n11++];
            int n14 = n10;
            int n15;
            if (n < n12) {
                n15 = n12 - n;
                n14 += n15 - n9;
            }
            else {
                n15 = n9;
            }
            int subWidth2;
            if (n + this.subWidth <= n12 + n13) {
                subWidth2 = this.subWidth;
            }
            else {
                subWidth2 = n12 + n13 - n;
            }
            for (int j = n15; j < subWidth2; ++j) {
                final int n16 = this.pixels[j + i * this.subWidth];
                if (n16 != 0) {
                    SpritePixels.ad[n14++] = n16;
                }
                else {
                    ++n14;
                }
            }
            n10 += SpritePixels.ae;
        }
    }
    
    static void dc(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11) {
        final int n12 = 256 - n11;
        final int n13 = n2;
        for (int i = -n7; i < 0; ++i) {
            final int n14 = (n3 >> 16) * n10;
            for (int j = -n6; j < 0; ++j) {
                n = array2[(n2 >> 16) + n14];
                if (n != 0) {
                    final int n15 = array[n4];
                    array[n4++] = ((n & 0xFF00FF) * n11 + (n15 & 0xFF00FF) * n12 & 0xFF00FF00) + ((n & 0xFF00) * n11 + (n15 & 0xFA24B4B2) * n12 & 0xFF0000) >> 8;
                }
                else {
                    ++n4;
                }
                n2 += n8;
            }
            n3 += n9;
            n2 = n13;
            n4 += n5;
        }
    }
    
    public void bw() {
        final int[] pixels = new int[this.subWidth * this.subHeight];
        int n = 0;
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = this.subWidth - 1; j >= 0; --j) {
                pixels[n++] = this.pixels[j + i * this.subWidth];
            }
        }
        this.pixels = pixels;
        this.xOffset = this.width - this.subWidth - this.xOffset;
    }
    
    static void cf(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                n = array2[n2++];
                if (n != 0) {
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
    
    public SpritePixels cf() {
        return this.method2602();
    }
    
    static void cw(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int n9 = 256 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    final int n10 = array[n3];
                    array[n3++] = ((n & 0xFF00FF) * n8 + (n10 & 0xFF00FF) * n9 & 0xFF00FF00) + ((n & 0xFF00) * n8 + (n10 & 0xFF00) * n9 & 0xFF0000) >> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    static void cv(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8, int n9) {
        final int n10 = 1969567913 - n8;
        n9 = (((n9 & 0xFF00FF) * n10 & 0xFF00FF00) | ((n9 & 0xE749C4E3) * n10 & 0x2EE62232)) >>> 8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = ((((n & 0x64B519CF) * n8 & 0xFF00FF00) | ((n & 0xFF00) * n8 & 0x866B4318)) >>> 8) + n9;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    static void Sprite_draw(final int[] array, final int[] array2, int n, int i, final int n2, final int n3, final int n4, final int n5) {
        for (int j = -n3; j < 0; ++j) {
            int n6;
            for (n6 = i + n2 - 3; i < n6; array[i++] = (array2[n++] | 0xFF000000), array[i++] = (array2[n++] | 0xFF000000), array[i++] = (array2[n++] | 0xFF000000), array[i++] = (array2[n++] | 0xFF000000)) {}
            for (n6 += 3; i < n6; array[i++] = (array2[n++] | 0xFF000000)) {}
            i += n4;
            n += n5;
        }
    }
    
    public void outline(final int n) {
        final int[] pixels = new int[this.subWidth * this.subHeight];
        int n2 = 0;
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = 0; j < this.subWidth; ++j) {
                int n3 = this.pixels[n2];
                if (n3 == 0) {
                    if (j > 0 && this.pixels[n2 - 1] != 0) {
                        n3 = n;
                    }
                    else if (i > 0 && this.pixels[n2 - this.subWidth] != 0) {
                        n3 = n;
                    }
                    else if (j < this.subWidth - 1 && this.pixels[n2 + 1] != 0) {
                        n3 = n;
                    }
                    else if (i < this.subHeight - 1 && this.pixels[n2 + this.subWidth] != 0) {
                        n3 = n;
                    }
                }
                pixels[n2++] = n3;
            }
        }
        this.pixels = pixels;
    }
    
    static void Sprite_drawTransScaled(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11) {
        final int n12 = 256 - n11;
        final int n13 = n2;
        for (int i = -n7; i < 0; ++i) {
            final int n14 = (n3 >> 16) * n10;
            for (int j = -n6; j < 0; ++j) {
                n = array2[(n2 >> 16) + n14];
                if (n != 0) {
                    final int n15 = array[n4];
                    Client.ri(array, n4++, ((n & 0xFF00FF) * n11 + (n15 & 0xFF00FF) * n12 & 0xFF00FF00) + ((n & 0xFF00) * n11 + (n15 & 0xFF00) * n12 & 0xFF0000) >> 8, n11);
                }
                else {
                    ++n4;
                }
                n2 += n8;
            }
            n3 += n9;
            n2 = n13;
            n4 += n5;
        }
    }
    
    public void drawTransOverlayAt(final int n, final int n2, final int n3, final int n4) {
        this.method2623(this.height << 3, this.height << 3, n << 4, n2 << 4, n3, n4);
    }
    
    public static void ni(final SpritePixels spritePixels, int i, int j, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int[] array, final int[] array2) {
        if (spritePixels == null) {
            spritePixels.bj();
        }
        try {
            final int n7 = -n / 2;
            final int n8 = -n2 / 2;
            final int n9 = (int)(Math.sin(n5 / 326.11) * 65536.0);
            final int n10 = (int)(Math.cos(n5 / 326.11) * 65536.0);
            final int n11 = n9 * n6 >> 8;
            final int n12 = n10 * n6 >> 8;
            int n13 = (n3 << 16) + (n8 * n11 + n7 * n12);
            int n14 = (n4 << 16) + (n8 * n12 - n7 * n11);
            int n15 = i + j * SpritePixels.ae;
            int n16;
            int n17;
            int n18;
            int n19;
            for (j = 0; j < n2; ++j) {
                n16 = array[j];
                n17 = n15 + n16;
                n18 = n13 + n12 * n16;
                n19 = n14 - n11 * n16;
                for (i = -array2[j]; i < 0; ++i) {
                    SpritePixels.ad[n17++] = spritePixels.pixels[(n18 >> 16) + (n19 >> 16) * spritePixels.subWidth];
                    n18 += n12;
                    n19 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += SpritePixels.ae;
            }
        }
        catch (Exception ex) {}
    }
    
    static void dw(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11) {
        final int n12 = 256 - n11;
        final int n13 = n2;
        for (int i = -n7; i < 0; ++i) {
            final int n14 = (n3 >> 16) * n10;
            for (int j = -n6; j < 0; ++j) {
                n = array2[(n2 >> 16) + n14];
                if (n != 0) {
                    final int n15 = array[n4];
                    array[n4++] = ((n & 0x38A36F5A) * n11 + (n15 & 0xCD91F2F) * n12 & 0xFF00FF00) + ((n & 0x66DB58A9) * n11 + (n15 & 0x474E41E9) * n12 & 0xFD12D010) >> 8;
                }
                else {
                    ++n4;
                }
                n2 += n8;
            }
            n3 += n9;
            n2 = n13;
            n4 += n5;
        }
    }
    
    static void cj(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int n9 = 256 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    final int n10 = array[n3];
                    array[n3++] = ((n & 0xFF00FF) * n8 + (n10 & 0xFF00FF) * n9 & 0xFF00FF00) + ((n & 0xFF00) * n8 + (n10 & 0xFF00) * n9 & 0xFF0000) >> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    public void drawRotatedMaskedCenteredAround(int i, int j, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int[] array, final int[] array2) {
        try {
            final int n7 = -n / 2;
            final int n8 = -n2 / 2;
            final int n9 = (int)(Math.sin(n5 / 326.11) * 65536.0);
            final int n10 = (int)(Math.cos(n5 / 326.11) * 65536.0);
            final int n11 = n9 * n6 >> 8;
            final int n12 = n10 * n6 >> 8;
            int n13 = (n3 << 16) + (n8 * n11 + n7 * n12);
            int n14 = (n4 << 16) + (n8 * n12 - n7 * n11);
            int n15 = i + j * SpritePixels.ae;
            int n16;
            int n17;
            int n18;
            int n19;
            for (j = 0; j < n2; ++j) {
                n16 = array[j];
                n17 = n15 + n16;
                n18 = n13 + n12 * n16;
                n19 = n14 - n11 * n16;
                for (i = -array2[j]; i < 0; ++i) {
                    SpritePixels.ad[n17++] = (this.pixels[(n18 >> 16) + (n19 >> 16) * this.subWidth] | 0xFF000000);
                    n18 += n12;
                    n19 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += SpritePixels.ae;
            }
        }
        catch (Exception ex) {}
    }
    
    static void cp(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int n9 = 256 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    final int n10 = array[n3];
                    array[n3++] = ((n & 0xFF00FF) * n8 + (n10 & 0xFF00FF) * n9 & 0xFF00FF00) + ((n & 0xFF00) * n8 + (n10 & 0xFF00) * n9 & 0xFF0000) >> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    static void Sprite_drawTransparent(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int n9 = 256 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    final int n10 = array[n3];
                    Client.ri(array, n3++, ((n & 0xFF00FF) * n8 + (n10 & 0xFF00FF) * n9 & 0xFF00FF00) + ((n & 0xFF00) * n8 + (n10 & 0xFF00) * n9 & 0xFF0000) >> 8, n8);
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    public void method2631(int bk, int bi, final int n) {
        bk += this.xOffset;
        bi += this.yOffset;
        int n2 = bk + bi * SpritePixels.ae;
        int n3 = 0;
        int subHeight = this.subHeight;
        int subWidth = this.subWidth;
        int n4 = SpritePixels.ae - subWidth;
        int n5 = 0;
        if (bi < SpritePixels.bi) {
            final int n6 = SpritePixels.bi - bi;
            subHeight -= n6;
            bi = SpritePixels.bi;
            n3 += n6 * subWidth;
            n2 += n6 * SpritePixels.ae;
        }
        if (bi + subHeight > SpritePixels.be) {
            subHeight -= bi + subHeight - SpritePixels.be;
        }
        if (bk < SpritePixels.bk) {
            final int n7 = SpritePixels.bk - bk;
            subWidth -= n7;
            bk = SpritePixels.bk;
            n3 += n7;
            n2 += n7;
            n5 += n7;
            n4 += n7;
        }
        if (bk + subWidth > SpritePixels.bx) {
            final int n8 = bk + subWidth - SpritePixels.bx;
            subWidth -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (subWidth > 0 && subHeight > 0) {
            if (n == 256) {
                method2618(0, 0, 0, SpritePixels.ad, this.pixels, n3, 0, n2, 0, subWidth, subHeight, n4, n5);
            }
            else {
                method2619(0, 0, 0, SpritePixels.ad, this.pixels, n3, 0, n2, 0, subWidth, subHeight, n4, n5, n);
            }
        }
    }
    
    public void drawTransBgAt(int bk, int bi) {
        bk += this.xOffset;
        bi += this.yOffset;
        int n = bk + bi * SpritePixels.ae;
        int n2 = 0;
        int subHeight = this.subHeight;
        int subWidth = this.subWidth;
        int n3 = SpritePixels.ae - subWidth;
        int n4 = 0;
        if (bi < SpritePixels.bi) {
            final int n5 = SpritePixels.bi - bi;
            subHeight -= n5;
            bi = SpritePixels.bi;
            n2 += n5 * subWidth;
            n += n5 * SpritePixels.ae;
        }
        if (bi + subHeight > SpritePixels.be) {
            subHeight -= bi + subHeight - SpritePixels.be;
        }
        if (bk < SpritePixels.bk) {
            final int n6 = SpritePixels.bk - bk;
            subWidth -= n6;
            bk = SpritePixels.bk;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (bk + subWidth > SpritePixels.bx) {
            final int n7 = bk + subWidth - SpritePixels.bx;
            subWidth -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (subWidth > 0 && subHeight > 0) {
            Sprite_drawTransBg(SpritePixels.ad, this.pixels, 0, n2, n, subWidth, subHeight, n3, n4);
        }
    }
    
    public void drawAt(int bk, int bi) {
        bk += this.xOffset;
        bi += this.yOffset;
        int n = bk + bi * SpritePixels.ae;
        int n2 = 0;
        int subHeight = this.subHeight;
        int subWidth = this.subWidth;
        int n3 = SpritePixels.ae - subWidth;
        int n4 = 0;
        if (bi < SpritePixels.bi) {
            final int n5 = SpritePixels.bi - bi;
            subHeight -= n5;
            bi = SpritePixels.bi;
            n2 += n5 * subWidth;
            n += n5 * SpritePixels.ae;
        }
        if (bi + subHeight > SpritePixels.be) {
            subHeight -= bi + subHeight - SpritePixels.be;
        }
        if (bk < SpritePixels.bk) {
            final int n6 = SpritePixels.bk - bk;
            subWidth -= n6;
            bk = SpritePixels.bk;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (bk + subWidth > SpritePixels.bx) {
            final int n7 = bk + subWidth - SpritePixels.bx;
            subWidth -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (subWidth > 0 && subHeight > 0) {
            Sprite_drawTransBg(SpritePixels.ad, this.pixels, 0, n2, n, subWidth, subHeight, n3, n4);
        }
    }
    
    public void dt(int n, int n2, int n3, int n4, final int n5) {
        if (n3 > 0 && n4 > 0) {
            final int subWidth = this.subWidth;
            final int subHeight = this.subHeight;
            int n6 = 0;
            int n7 = 0;
            final int width = this.width;
            final int height = this.height;
            final int n8 = (width << 16) / n3;
            final int n9 = (height << 16) / n4;
            if (this.xOffset > 0) {
                final int n10 = ((this.xOffset << 16) + n8 - 1) / n8;
                n += n10;
                n6 += n10 * n8 - (this.xOffset << 16);
            }
            if (this.yOffset > 0) {
                final int n11 = ((this.yOffset << 16) + n9 - 1) / n9;
                n2 += n11;
                n7 += n11 * n9 - (this.yOffset << 16);
            }
            if (subWidth < width) {
                n3 = ((subWidth << 16) - n6 + n8 - 1) / n8;
            }
            if (subHeight < height) {
                n4 = ((subHeight << 16) - n7 + n9 - 1) / n9;
            }
            int n12 = n + n2 * SpritePixels.ae;
            int n13 = SpritePixels.ae - n3;
            if (n2 + n4 > SpritePixels.be) {
                n4 -= n2 + n4 - SpritePixels.be;
            }
            if (n2 < SpritePixels.bi) {
                final int n14 = SpritePixels.bi - n2;
                n4 -= n14;
                n12 += n14 * SpritePixels.ae;
                n7 += n9 * n14;
            }
            if (n + n3 > SpritePixels.bx) {
                final int n15 = n + n3 - SpritePixels.bx;
                n3 -= n15;
                n13 += n15;
            }
            if (n < SpritePixels.bk) {
                final int n16 = SpritePixels.bk - n;
                n3 -= n16;
                n12 += n16;
                n6 += n8 * n16;
                n13 += n16;
            }
            if (n5 == 256) {
                method2617(0, 0, 0, n6, this.pixels, SpritePixels.ad, 0, 0, -n4, n7, n12, n13, n3, n8, n9, subWidth);
            }
            else {
                method2627(0, 0, 0, n6, this.pixels, SpritePixels.ad, 0, 0, -n4, n7, n12, n13, n3, n8, n9, subWidth, n5);
            }
        }
    }
    
    public void method2609(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int[] array, final int[] array2) {
        final int n7 = (n2 < 0) ? (-n2) : 0;
        final int n8 = (n2 + this.subHeight <= n6) ? this.subHeight : (n6 - n2);
        final int n9 = (n < 0) ? (-n) : 0;
        final int n10 = (n + this.subWidth <= n5) ? this.subWidth : (n5 - n);
        int n11 = n3 + n + n9 + (n4 + n2 + n7) * SpritePixels.ae;
        int n12 = n2 + n7;
        for (int i = n7; i < n8; ++i) {
            final int n13 = array[n12];
            final int n14 = array2[n12++];
            int n15 = n11;
            int n16;
            if (n < n13) {
                n16 = n13 - n;
                n15 += n16 - n9;
            }
            else {
                n16 = n9;
            }
            int subWidth;
            if (n + this.subWidth <= n13 + n14) {
                subWidth = this.subWidth;
            }
            else {
                subWidth = n13 + n14 - n;
            }
            for (int j = n16; j < subWidth; ++j) {
                final int n17 = this.pixels[j + i * this.subWidth];
                if (n17 != 0) {
                    SpritePixels.ad[n15++] = (n17 | 0xFF000000);
                }
                else {
                    ++n15;
                }
            }
            n11 += SpritePixels.ae;
        }
    }
    
    public void bv(final int n) {
        if (this.subWidth == this.width && this.subHeight == this.height) {
            return;
        }
        int xOffset = n;
        if (xOffset > this.xOffset) {
            xOffset = this.xOffset;
        }
        int n2 = n;
        if (n2 + this.xOffset + this.subWidth > this.width) {
            n2 = this.width - this.xOffset - this.subWidth;
        }
        int yOffset = n;
        if (yOffset > this.yOffset) {
            yOffset = this.yOffset;
        }
        int n3 = n;
        if (n3 + this.yOffset + this.subHeight > this.height) {
            n3 = this.height - this.yOffset - this.subHeight;
        }
        final int subWidth = this.subWidth + xOffset + n2;
        final int subHeight = this.subHeight + yOffset + n3;
        final int[] pixels = new int[subWidth * subHeight];
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = 0; j < this.subWidth; ++j) {
                pixels[(i + yOffset) * subWidth + (j + xOffset)] = this.pixels[i * this.subWidth + j];
            }
        }
        this.pixels = pixels;
        this.subWidth = subWidth;
        this.subHeight = subHeight;
        this.xOffset -= xOffset;
        this.yOffset -= yOffset;
    }
    
    public void dl(int n, int n2, int n3, int n4, final int n5) {
        if (n3 > 0 && n4 > 0) {
            final int subWidth = this.subWidth;
            final int subHeight = this.subHeight;
            int n6 = 0;
            int n7 = 0;
            final int width = this.width;
            final int height = this.height;
            final int n8 = (width << 16) / n3;
            final int n9 = (height << 16) / n4;
            if (this.xOffset > 0) {
                final int n10 = ((this.xOffset << 16) + n8 - 1) / n8;
                n += n10;
                n6 += n10 * n8 - (this.xOffset << 16);
            }
            if (this.yOffset > 0) {
                final int n11 = ((this.yOffset << 16) + n9 - 1) / n9;
                n2 += n11;
                n7 += n11 * n9 - (this.yOffset << 16);
            }
            if (subWidth < width) {
                n3 = ((subWidth << 16) - n6 + n8 - 1) / n8;
            }
            if (subHeight < height) {
                n4 = ((subHeight << 16) - n7 + n9 - 1) / n9;
            }
            int n12 = n + n2 * SpritePixels.ae;
            int n13 = SpritePixels.ae - n3;
            if (n2 + n4 > SpritePixels.be) {
                n4 -= n2 + n4 - SpritePixels.be;
            }
            if (n2 < SpritePixels.bi) {
                final int n14 = SpritePixels.bi - n2;
                n4 -= n14;
                n12 += n14 * SpritePixels.ae;
                n7 += n9 * n14;
            }
            if (n + n3 > SpritePixels.bx) {
                final int n15 = n + n3 - SpritePixels.bx;
                n3 -= n15;
                n13 += n15;
            }
            if (n < SpritePixels.bk) {
                final int n16 = SpritePixels.bk - n;
                n3 -= n16;
                n12 += n16;
                n6 += n8 * n16;
                n13 += n16;
            }
            if (n5 == 256) {
                method2617(0, 0, 0, n6, this.pixels, SpritePixels.ad, 0, 0, -n4, n7, n12, n13, n3, n8, n9, subWidth);
            }
            else {
                method2627(0, 0, 0, n6, this.pixels, SpritePixels.ad, 0, 0, -n4, n7, n12, n13, n3, n8, n9, subWidth, n5);
            }
        }
    }
    
    static void ck(final int[] array, final int[] array2, int n, int i, final int n2, final int n3, final int n4, final int n5) {
        for (int j = -n3; j < 0; ++j) {
            int n6;
            for (n6 = i + n2 - 3; i < n6; array[i++] = array2[n++], array[i++] = array2[n++], array[i++] = array2[n++], array[i++] = array2[n++]) {}
            for (n6 += 3; i < n6; array[i++] = array2[n++]) {}
            i += n4;
            n += n5;
        }
    }
    
    void method2623(int n, int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n6 == 0) {
            return;
        }
        n -= this.xOffset << 4;
        n2 -= this.yOffset << 4;
        final double n7 = (n5 & 0x3F94E43F) * 9.587379924285257E-5;
        final int n8 = (int)Math.floor(Math.sin(n7) * n6 + 0.5);
        final int n9 = (int)Math.floor(Math.cos(n7) * n6 + 0.5);
        final int n10 = -n * n9 + -n2 * n8;
        final int n11 = -(-n) * n8 + -n2 * n9;
        final int n12 = ((this.subWidth << 4) - n) * n9 + -n2 * n8;
        final int n13 = -((this.subWidth << 4) - n) * n8 + -n2 * n9;
        final int n14 = -n * n9 + ((this.subHeight << 4) - n2) * n8;
        final int n15 = -(-n) * n8 + ((this.subHeight << 4) - n2) * n9;
        final int n16 = ((this.subWidth << 4) - n) * n9 + ((this.subHeight << 4) - n2) * n8;
        final int n17 = -((this.subWidth << 4) - n) * n8 + ((this.subHeight << 4) - n2) * n9;
        int n18;
        int n19;
        if (n10 < n12) {
            n18 = n10;
            n19 = n12;
        }
        else {
            n18 = n12;
            n19 = n10;
        }
        if (n14 < n18) {
            n18 = n14;
        }
        if (n16 < n18) {
            n18 = n16;
        }
        if (n14 > n19) {
            n19 = n14;
        }
        if (n16 > n19) {
            n19 = n16;
        }
        int n20;
        int n21;
        if (n11 < n13) {
            n20 = n11;
            n21 = n13;
        }
        else {
            n20 = n13;
            n21 = n11;
        }
        if (n15 < n20) {
            n20 = n15;
        }
        if (n17 < n20) {
            n20 = n17;
        }
        if (n15 > n21) {
            n21 = n15;
        }
        if (n17 > n21) {
            n21 = n17;
        }
        final int n22 = n18 >> 12;
        final int n23 = n19 + 4095 >> 12;
        final int n24 = n20 >> 12;
        final int n25 = n21 - 457404483 >> 12;
        final int n26 = n22 + n3;
        final int n27 = n23 + n3;
        final int n28 = n24 + n4;
        final int n29 = n25 + n4;
        int bk = n26 >> 4;
        int bx = n27 + 15 >> 4;
        int bi = n28 >> 4;
        int be = n29 + 15 >> 4;
        if (bk < SpritePixels.bk) {
            bk = SpritePixels.bk;
        }
        if (bx > SpritePixels.bx) {
            bx = SpritePixels.bx;
        }
        if (bi < SpritePixels.bi) {
            bi = SpritePixels.bi;
        }
        if (be > SpritePixels.be) {
            be = SpritePixels.be;
        }
        final int n30 = bk - bx;
        if (n30 >= 0) {
            return;
        }
        final int n31 = bi - be;
        if (n31 >= 0) {
            return;
        }
        int n32 = bi * SpritePixels.ae + bk;
        final double n33 = 1.6777216E7 / n6;
        final int n34 = (int)Math.floor(Math.sin(n7) * n33 + 0.5);
        final int n35 = (int)Math.floor(Math.cos(n7) * n33 + 0.5);
        final int n36 = (bk << 4) + 8 - n3;
        final int n37 = (bi << 4) + 8 - n4;
        int n38 = (n << 8) - (n37 * n34 >> 4);
        int n39 = (n2 << 8) + (n37 * n35 >> 4);
        if (n35 == 0) {
            if (n34 == 0) {
                for (int i = n31; i < 0; ++i, n32 += SpritePixels.ae) {
                    int n40 = n32;
                    final int n41 = n38;
                    final int n42 = n39;
                    int j = n30;
                    if (n41 >= 0) {
                        if (n42 >= 0) {
                            if (n41 - (this.subWidth << 12) < 0) {
                                if (n42 - (this.subHeight << 12) < 0) {
                                    while (j < 0) {
                                        final int n43 = this.pixels[(n42 >> 12) * this.subWidth + (n41 >> 12)];
                                        if (n43 != 0) {
                                            SpritePixels.ad[n40++] = n43;
                                        }
                                        else {
                                            ++n40;
                                        }
                                        ++j;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (n34 < 0) {
                for (int k = n31; k < 0; ++k, n38 -= n34, n32 += SpritePixels.ae) {
                    int n44 = n32;
                    final int n45 = n38;
                    int n46 = n39 + (n36 * n34 >> 4);
                    int l = n30;
                    if (n45 >= 0) {
                        if (n45 - (this.subWidth << 12) < 0) {
                            final int n47;
                            if ((n47 = n46 - (this.subHeight << 12)) >= 0) {
                                final int n48 = (n34 - n47) / n34;
                                l += n48;
                                n46 += n34 * n48;
                                n44 += n48;
                            }
                            final int n49;
                            if ((n49 = (n46 - n34) / n34) > l) {
                                l = n49;
                            }
                            while (l < 0) {
                                final int n50 = this.pixels[(n46 >> 12) * this.subWidth + (n45 >> 12)];
                                if (n50 != 0) {
                                    SpritePixels.ad[n44++] = n50;
                                }
                                else {
                                    ++n44;
                                }
                                n46 += n34;
                                ++l;
                            }
                        }
                    }
                }
            }
            else {
                for (int n51 = n31; n51 < 0; ++n51, n38 -= n34, n32 += SpritePixels.ae) {
                    int n52 = n32;
                    final int n53 = n38;
                    int n54 = n39 + (n36 * n34 >> 4);
                    int n55 = n30;
                    if (n53 >= 0) {
                        if (n53 - (this.subWidth << 12) < 0) {
                            if (n54 < 0) {
                                final int n56 = (n34 - 1 - n54) / n34;
                                n55 += n56;
                                n54 += n34 * n56;
                                n52 += n56;
                            }
                            final int n57;
                            if ((n57 = (1 + n54 - (this.subHeight << 12) - n34) / n34) > n55) {
                                n55 = n57;
                            }
                            while (n55 < 0) {
                                final int n58 = this.pixels[(n54 >> 12) * this.subWidth + (n53 >> 12)];
                                if (n58 != 0) {
                                    SpritePixels.ad[n52++] = n58;
                                }
                                else {
                                    ++n52;
                                }
                                n54 += n34;
                                ++n55;
                            }
                        }
                    }
                }
            }
        }
        else if (n35 < 0) {
            if (n34 == 0) {
                for (int n59 = n31; n59 < 0; ++n59, n39 += n35, n32 += SpritePixels.ae) {
                    int n60 = n32;
                    int n61 = n38 + (n36 * n35 >> 4);
                    final int n62 = n39;
                    int n63 = n30;
                    if (n62 >= 0) {
                        if (n62 - (this.subHeight << 12) < 0) {
                            final int n64;
                            if ((n64 = n61 - (this.subWidth << 12)) >= 0) {
                                final int n65 = (n35 - n64) / n35;
                                n63 += n65;
                                n61 += n35 * n65;
                                n60 += n65;
                            }
                            final int n66;
                            if ((n66 = (n61 - n35) / n35) > n63) {
                                n63 = n66;
                            }
                            while (n63 < 0) {
                                final int n67 = this.pixels[(n62 >> 12) * this.subWidth + (n61 >> 12)];
                                if (n67 != 0) {
                                    SpritePixels.ad[n60++] = n67;
                                }
                                else {
                                    ++n60;
                                }
                                n61 += n35;
                                ++n63;
                            }
                        }
                    }
                }
            }
            else if (n34 < 0) {
                for (int n68 = n31; n68 < 0; ++n68, n38 -= n34, n39 += n35, n32 += SpritePixels.ae) {
                    int n69 = n32;
                    int n70 = n38 + (n36 * n35 >> 4);
                    int n71 = n39 + (n36 * n34 >> 4);
                    int n72 = n30;
                    final int n73;
                    if ((n73 = n70 - (this.subWidth << 12)) >= 0) {
                        final int n74 = (n35 - n73) / n35;
                        n72 += n74;
                        n70 += n35 * n74;
                        n71 += n34 * n74;
                        n69 += n74;
                    }
                    final int n75;
                    if ((n75 = (n70 - n35) / n35) > n72) {
                        n72 = n75;
                    }
                    final int n76;
                    if ((n76 = n71 - (this.subHeight << 12)) >= 0) {
                        final int n77 = (n34 - n76) / n34;
                        n72 += n77;
                        n70 += n35 * n77;
                        n71 += n34 * n77;
                        n69 += n77;
                    }
                    final int n78;
                    if ((n78 = (n71 - n34) / n34) > n72) {
                        n72 = n78;
                    }
                    while (n72 < 0) {
                        final int n79 = this.pixels[(n71 >> 12) * this.subWidth + (n70 >> 12)];
                        if (n79 != 0) {
                            SpritePixels.ad[n69++] = n79;
                        }
                        else {
                            ++n69;
                        }
                        n70 += n35;
                        n71 += n34;
                        ++n72;
                    }
                }
            }
            else {
                for (int n80 = n31; n80 < 0; ++n80, n38 -= n34, n39 += n35, n32 += SpritePixels.ae) {
                    int n81 = n32;
                    int n82 = n38 + (n36 * n35 >> 4);
                    int n83 = n39 + (n36 * n34 >> 4);
                    int n84 = n30;
                    final int n85;
                    if ((n85 = n82 - (this.subWidth << 12)) >= 0) {
                        final int n86 = (n35 - n85) / n35;
                        n84 += n86;
                        n82 += n35 * n86;
                        n83 += n34 * n86;
                        n81 += n86;
                    }
                    final int n87;
                    if ((n87 = (n82 - n35) / n35) > n84) {
                        n84 = n87;
                    }
                    if (n83 < 0) {
                        final int n88 = (n34 - 1 - n83) / n34;
                        n84 += n88;
                        n82 += n35 * n88;
                        n83 += n34 * n88;
                        n81 += n88;
                    }
                    final int n89;
                    if ((n89 = (1 + n83 - (this.subHeight << 12) - n34) / n34) > n84) {
                        n84 = n89;
                    }
                    while (n84 < 0) {
                        final int n90 = this.pixels[(n83 >> 12) * this.subWidth + (n82 >> 12)];
                        if (n90 != 0) {
                            SpritePixels.ad[n81++] = n90;
                        }
                        else {
                            ++n81;
                        }
                        n82 += n35;
                        n83 += n34;
                        ++n84;
                    }
                }
            }
        }
        else if (n34 == 0) {
            for (int n91 = n31; n91 < 0; ++n91, n39 += n35, n32 += SpritePixels.ae) {
                int n92 = n32;
                int n93 = n38 + (n36 * n35 >> 4);
                final int n94 = n39;
                int n95 = n30;
                if (n94 >= 0) {
                    if (n94 - (this.subHeight << 12) < 0) {
                        if (n93 < 0) {
                            final int n96 = (n35 - 1 - n93) / n35;
                            n95 += n96;
                            n93 += n35 * n96;
                            n92 += n96;
                        }
                        final int n97;
                        if ((n97 = (1 + n93 - (this.subWidth << 12) - n35) / n35) > n95) {
                            n95 = n97;
                        }
                        while (n95 < 0) {
                            final int n98 = this.pixels[(n94 >> 12) * this.subWidth + (n93 >> 12)];
                            if (n98 != 0) {
                                SpritePixels.ad[n92++] = n98;
                            }
                            else {
                                ++n92;
                            }
                            n93 += n35;
                            ++n95;
                        }
                    }
                }
            }
        }
        else if (n34 < 0) {
            for (int n99 = n31; n99 < 0; ++n99, n38 -= n34, n39 += n35, n32 += SpritePixels.ae) {
                int n100 = n32;
                int n101 = n38 + (n36 * n35 >> 4);
                int n102 = n39 + (n36 * n34 >> 4);
                int n103 = n30;
                if (n101 < 0) {
                    final int n104 = (n35 - 1 - n101) / n35;
                    n103 += n104;
                    n101 += n35 * n104;
                    n102 += n34 * n104;
                    n100 += n104;
                }
                final int n105;
                if ((n105 = (1 + n101 - (this.subWidth << 12) - n35) / n35) > n103) {
                    n103 = n105;
                }
                final int n106;
                if ((n106 = n102 - (this.subHeight << 12)) >= 0) {
                    final int n107 = (n34 - n106) / n34;
                    n103 += n107;
                    n101 += n35 * n107;
                    n102 += n34 * n107;
                    n100 += n107;
                }
                final int n108;
                if ((n108 = (n102 - n34) / n34) > n103) {
                    n103 = n108;
                }
                while (n103 < 0) {
                    final int n109 = this.pixels[(n102 >> 12) * this.subWidth + (n101 >> 12)];
                    if (n109 != 0) {
                        SpritePixels.ad[n100++] = n109;
                    }
                    else {
                        ++n100;
                    }
                    n101 += n35;
                    n102 += n34;
                    ++n103;
                }
            }
        }
        else {
            for (int n110 = n31; n110 < 0; ++n110, n38 -= n34, n39 += n35, n32 += SpritePixels.ae) {
                int n111 = n32;
                int n112 = n38 + (n36 * n35 >> 4);
                int n113 = n39 + (n36 * n34 >> 4);
                int n114 = n30;
                if (n112 < 0) {
                    final int n115 = (n35 - 1 - n112) / n35;
                    n114 += n115;
                    n112 += n35 * n115;
                    n113 += n34 * n115;
                    n111 += n115;
                }
                final int n116;
                if ((n116 = (1 + n112 - (this.subWidth << 12) - n35) / n35) > n114) {
                    n114 = n116;
                }
                if (n113 < 0) {
                    final int n117 = (n34 - 1 - n113) / n34;
                    n114 += n117;
                    n112 += n35 * n117;
                    n113 += n34 * n117;
                    n111 += n117;
                }
                final int n118;
                if ((n118 = (1 + n113 - (this.subHeight << 12) - n34) / n34) > n114) {
                    n114 = n118;
                }
                while (n114 < 0) {
                    final int n119 = this.pixels[(n113 >> 12) * this.subWidth + (n112 >> 12)];
                    if (n119 != 0) {
                        SpritePixels.ad[n111++] = n119;
                    }
                    else {
                        ++n111;
                    }
                    n112 += n35;
                    n113 += n34;
                    ++n114;
                }
            }
        }
    }
    
    static void di(int n, int n2, int n3, final int[] array, final int[] array2, int n4, int i, int n5, int j, final int n6, final int n7, final int n8, final int n9, final int n10) {
        for (j = -n7; j < 0; ++j) {
            for (i = -n6; i < 0; ++i) {
                n = array2[n4++];
                if (n != 0) {
                    n2 = (n & 0xFF00FF) * n10;
                    n = (n2 & 0xFF00FF00) + (n * n10 - n2 & 0xFF0000) >>> 8;
                    n2 = array[n5];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0x616873);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array[n5++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n5;
                }
            }
            n5 += n8;
            n4 += n9;
        }
    }
    
    public void bp() {
        final int[] pixels = new int[this.subWidth * this.subHeight];
        int n = 0;
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = this.subWidth - 1; j >= 0; --j) {
                pixels[n++] = this.pixels[j + i * this.subWidth];
            }
        }
        this.pixels = pixels;
        this.xOffset = this.width - this.subWidth - this.xOffset;
    }
    
    static void ct(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int n9 = 256 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    final int n10 = array[n3];
                    array[n3++] = ((n & 0xFF00FF) * n8 + (n10 & 0xFF00FF) * n9 & 0xFF00FF00) + ((n & 0xFF00) * n8 + (n10 & 0xFF00) * n9 & 0xFF0000) >> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    public void cc(final int n) {
        final int[] pixels = new int[this.subWidth * this.subHeight];
        int n2 = 0;
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = 0; j < this.subWidth; ++j) {
                int n3 = this.pixels[n2];
                if (n3 == 0) {
                    if (j > 0 && this.pixels[n2 - 1] != 0) {
                        n3 = n;
                    }
                    else if (i > 0 && this.pixels[n2 - this.subWidth] != 0) {
                        n3 = n;
                    }
                    else if (j < this.subWidth - 1 && this.pixels[n2 + 1] != 0) {
                        n3 = n;
                    }
                    else if (i < this.subHeight - 1 && this.pixels[n2 + this.subWidth] != 0) {
                        n3 = n;
                    }
                }
                pixels[n2++] = n3;
            }
        }
        this.pixels = pixels;
    }
    
    static void dv(int n, int n2, int n3, int n4, final int[] array, final int[] array2, int i, int n5, int j, int n6, int n7, final int n8, final int n9, final int n10, final int n11, final int n12) {
        final int n13 = n4;
        while (j < 0) {
            n5 = (n6 >> 16) * n12;
            for (i = -n9; i < 0; ++i) {
                n = array[(n4 >> 16) + n5];
                if (n != 0) {
                    n2 = array2[n7];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array2[n7++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n7;
                }
                n4 += n10;
            }
            n6 += n11;
            n4 = n13;
            n7 += n8;
            ++j;
        }
    }
    
    public static void td(final SpritePixels spritePixels, final int n, final int n2, final int n3, final int n4) {
        spritePixels.et(spritePixels.width << 3, spritePixels.height << 3, n << 4, n2 << 4, n3, n4);
    }
    
    public SpritePixels bt() {
        final SpritePixels spritePixels = new SpritePixels(this.subWidth, this.subHeight);
        spritePixels.width = this.width;
        spritePixels.height = this.height;
        spritePixels.xOffset = this.width - this.subWidth - this.xOffset;
        spritePixels.yOffset = this.yOffset;
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = 0; j < this.subWidth; ++j) {
                spritePixels.pixels[i * this.subWidth + j] = this.pixels[i * this.subWidth + this.subWidth - 1 - j];
            }
        }
        return spritePixels;
    }
    
    public void ds(int i, int j, final int n, final int n2, final int n3, final int n4, final double n5, final int n6) {
        try {
            final int n7 = -n / 2;
            final int n8 = -n2 / 2;
            final int n9 = (int)(Math.sin(n5) * 65536.0);
            final int n10 = (int)(Math.cos(n5) * 65536.0);
            final int n11 = n9 * n6 >> 8;
            final int n12 = n10 * n6 >> 8;
            int n13 = (n3 << 16) + (n8 * n11 + n7 * n12);
            int n14 = (n4 << 16) + (n8 * n12 - n7 * n11);
            int n15 = i + j * SpritePixels.ae;
            int n16;
            int n17;
            int n18;
            int n19;
            for (j = 0; j < n2; ++j) {
                n16 = n15;
                n17 = n13;
                n18 = n14;
                for (i = -n; i < 0; ++i) {
                    n19 = this.pixels[(n17 >> 16) + (n18 >> 16) * this.subWidth];
                    if (n19 != 0) {
                        SpritePixels.ad[n16++] = n19;
                    }
                    else {
                        ++n16;
                    }
                    n17 += n12;
                    n18 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += SpritePixels.ae;
            }
        }
        catch (Exception ex) {}
    }
    
    static void dh(int n, int n2, int n3, int n4, final int[] array, final int[] array2, int i, int n5, int j, int n6, int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13) {
        final int n14 = n4;
        while (j < 0) {
            n5 = (n6 >> 16) * n12;
            for (i = -n9; i < 0; ++i) {
                n = array[(n4 >> 16) + n5];
                if (n != 0) {
                    n2 = (n & 0xFF00FF) * n13;
                    n = (n2 & 0xFF00FF00) + (n * n13 - n2 & 0x86FAA96D) >>> 8;
                    n2 = array2[n7];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x90E1263F) + (n3 - n & 0x10000);
                    array2[n7++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n7;
                }
                n4 += n10;
            }
            n6 += n11;
            n4 = n14;
            n7 += n8;
            ++j;
        }
    }
    
    public SpritePixels br() {
        final SpritePixels spritePixels = new SpritePixels(this.subWidth, this.subHeight);
        spritePixels.width = this.width;
        spritePixels.height = this.height;
        spritePixels.xOffset = this.xOffset;
        spritePixels.yOffset = this.yOffset;
        for (int length = this.pixels.length, i = 0; i < length; ++i) {
            spritePixels.pixels[i] = this.pixels[i];
        }
        return spritePixels;
    }
    
    public void ci() {
        final int[] pixels = new int[this.subWidth * this.subHeight];
        int n = 0;
        for (int i = this.subHeight - 1; i >= 0; --i) {
            for (int j = 0; j < this.subWidth; ++j) {
                pixels[n++] = this.pixels[j + i * this.subWidth];
            }
        }
        this.pixels = pixels;
        this.yOffset = this.height - this.subHeight - this.yOffset;
    }
    
    public SpritePixels copyNormalized() {
        final SpritePixels spritePixels = new SpritePixels(this.height, this.width);
        for (int i = 0; i < this.xOffset; ++i) {
            for (int j = 0; j < this.subWidth; ++j) {
                spritePixels.pixels[(i + this.yOffset) * this.subHeight + (j + this.width)] = this.pixels[i * this.width + j];
            }
        }
        return spritePixels;
    }
    
    public void drawTransAt(int bk, int bi, final int n) {
        bk += this.xOffset;
        bi += this.yOffset;
        int n2 = bk + bi * SpritePixels.ae;
        int n3 = 0;
        int subHeight = this.subHeight;
        int subWidth = this.subWidth;
        int n4 = SpritePixels.ae - subWidth;
        int n5 = 0;
        if (bi < SpritePixels.bi) {
            final int n6 = SpritePixels.bi - bi;
            subHeight -= n6;
            bi = SpritePixels.bi;
            n3 += n6 * subWidth;
            n2 += n6 * SpritePixels.ae;
        }
        if (bi + subHeight > SpritePixels.be) {
            subHeight -= bi + subHeight - SpritePixels.be;
        }
        if (bk < SpritePixels.bk) {
            final int n7 = SpritePixels.bk - bk;
            subWidth -= n7;
            bk = SpritePixels.bk;
            n3 += n7;
            n2 += n7;
            n5 += n7;
            n4 += n7;
        }
        if (bk + subWidth > SpritePixels.bx) {
            final int n8 = bk + subWidth - SpritePixels.bx;
            subWidth -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (subWidth <= 0 || subHeight <= 0) {
            return;
        }
        Sprite_drawTransparent(SpritePixels.ad, this.pixels, 0, n3, n2, subWidth, subHeight, n4, n5, n);
    }
    
    public void flipVertically() {
        final int[] pixels = new int[this.width * this.width];
        int n = 0;
        for (int i = 0; i < this.height; ++i) {
            for (int j = this.subWidth - 1; j >= 0; --j) {
                pixels[n++] = this.pixels[j + i * this.height];
            }
        }
        this.pixels = pixels;
        this.width = this.width - this.width - this.height;
    }
    
    void et(int n, int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n6 == 0) {
            return;
        }
        n -= this.xOffset << 4;
        n2 -= this.yOffset << 4;
        final double n7 = (n5 & 0xFFFF) * 9.587379924285257E-5;
        final int n8 = (int)Math.floor(Math.sin(n7) * n6 + 0.5);
        final int n9 = (int)Math.floor(Math.cos(n7) * n6 + 0.5);
        final int n10 = -n * n9 + -n2 * n8;
        final int n11 = -(-n) * n8 + -n2 * n9;
        final int n12 = ((this.subWidth << 4) - n) * n9 + -n2 * n8;
        final int n13 = -((this.subWidth << 4) - n) * n8 + -n2 * n9;
        final int n14 = -n * n9 + ((this.subHeight << 4) - n2) * n8;
        final int n15 = -(-n) * n8 + ((this.subHeight << 4) - n2) * n9;
        final int n16 = ((this.subWidth << 4) - n) * n9 + ((this.subHeight << 4) - n2) * n8;
        final int n17 = -((this.subWidth << 4) - n) * n8 + ((this.subHeight << 4) - n2) * n9;
        int n18;
        int n19;
        if (n10 < n12) {
            n18 = n10;
            n19 = n12;
        }
        else {
            n18 = n12;
            n19 = n10;
        }
        if (n14 < n18) {
            n18 = n14;
        }
        if (n16 < n18) {
            n18 = n16;
        }
        if (n14 > n19) {
            n19 = n14;
        }
        if (n16 > n19) {
            n19 = n16;
        }
        int n20;
        int n21;
        if (n11 < n13) {
            n20 = n11;
            n21 = n13;
        }
        else {
            n20 = n13;
            n21 = n11;
        }
        if (n15 < n20) {
            n20 = n15;
        }
        if (n17 < n20) {
            n20 = n17;
        }
        if (n15 > n21) {
            n21 = n15;
        }
        if (n17 > n21) {
            n21 = n17;
        }
        final int n22 = n18 >> 12;
        final int n23 = n19 + 4095 >> 12;
        final int n24 = n20 >> 12;
        final int n25 = n21 + 4095 >> 12;
        final int n26 = n22 + n3;
        final int n27 = n23 + n3;
        final int n28 = n24 + n4;
        final int n29 = n25 + n4;
        int bk = n26 >> 4;
        int bx = n27 + 15 >> 4;
        int bi = n28 >> 4;
        int be = n29 + 15 >> 4;
        if (bk < SpritePixels.bk) {
            bk = SpritePixels.bk;
        }
        if (bx > SpritePixels.bx) {
            bx = SpritePixels.bx;
        }
        if (bi < SpritePixels.bi) {
            bi = SpritePixels.bi;
        }
        if (be > SpritePixels.be) {
            be = SpritePixels.be;
        }
        final int n30 = bk - bx;
        if (n30 >= 0) {
            return;
        }
        final int n31 = bi - be;
        if (n31 >= 0) {
            return;
        }
        int n32 = bi * SpritePixels.ae + bk;
        final double n33 = 1.6777216E7 / n6;
        final int n34 = (int)Math.floor(Math.sin(n7) * n33 + 0.5);
        final int n35 = (int)Math.floor(Math.cos(n7) * n33 + 0.5);
        final int n36 = (bk << 4) + 8 - n3;
        final int n37 = (bi << 4) + 8 - n4;
        int n38 = (n << 8) - (n37 * n34 >> 4);
        int n39 = (n2 << 8) + (n37 * n35 >> 4);
        if (n35 == 0) {
            if (n34 == 0) {
                for (int i = n31; i < 0; ++i, n32 += SpritePixels.ae) {
                    int n40 = n32;
                    final int n41 = n38;
                    final int n42 = n39;
                    int j = n30;
                    if (n41 >= 0) {
                        if (n42 >= 0) {
                            if (n41 - (this.subWidth << 12) < 0) {
                                if (n42 - (this.subHeight << 12) < 0) {
                                    while (j < 0) {
                                        final int n43 = this.pixels[(n42 >> 12) * this.subWidth + (n41 >> 12)];
                                        if (n43 != 0) {
                                            SpritePixels.ad[n40++] = (n43 | 0xFF000000);
                                        }
                                        else {
                                            ++n40;
                                        }
                                        ++j;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (n34 < 0) {
                for (int k = n31; k < 0; ++k, n38 -= n34, n32 += SpritePixels.ae) {
                    int n44 = n32;
                    final int n45 = n38;
                    int n46 = n39 + (n36 * n34 >> 4);
                    int l = n30;
                    if (n45 >= 0) {
                        if (n45 - (this.subWidth << 12) < 0) {
                            final int n47;
                            if ((n47 = n46 - (this.subHeight << 12)) >= 0) {
                                final int n48 = (n34 - n47) / n34;
                                l += n48;
                                n46 += n34 * n48;
                                n44 += n48;
                            }
                            final int n49;
                            if ((n49 = (n46 - n34) / n34) > l) {
                                l = n49;
                            }
                            while (l < 0) {
                                final int n50 = this.pixels[(n46 >> 12) * this.subWidth + (n45 >> 12)];
                                if (n50 != 0) {
                                    SpritePixels.ad[n44++] = (n50 | 0xFF000000);
                                }
                                else {
                                    ++n44;
                                }
                                n46 += n34;
                                ++l;
                            }
                        }
                    }
                }
            }
            else {
                for (int n51 = n31; n51 < 0; ++n51, n38 -= n34, n32 += SpritePixels.ae) {
                    int n52 = n32;
                    final int n53 = n38;
                    int n54 = n39 + (n36 * n34 >> 4);
                    int n55 = n30;
                    if (n53 >= 0) {
                        if (n53 - (this.subWidth << 12) < 0) {
                            if (n54 < 0) {
                                final int n56 = (n34 - 1 - n54) / n34;
                                n55 += n56;
                                n54 += n34 * n56;
                                n52 += n56;
                            }
                            final int n57;
                            if ((n57 = (1 + n54 - (this.subHeight << 12) - n34) / n34) > n55) {
                                n55 = n57;
                            }
                            while (n55 < 0) {
                                final int n58 = this.pixels[(n54 >> 12) * this.subWidth + (n53 >> 12)];
                                if (n58 != 0) {
                                    SpritePixels.ad[n52++] = (n58 | 0xFF000000);
                                }
                                else {
                                    ++n52;
                                }
                                n54 += n34;
                                ++n55;
                            }
                        }
                    }
                }
            }
        }
        else if (n35 < 0) {
            if (n34 == 0) {
                for (int n59 = n31; n59 < 0; ++n59, n39 += n35, n32 += SpritePixels.ae) {
                    int n60 = n32;
                    int n61 = n38 + (n36 * n35 >> 4);
                    final int n62 = n39;
                    int n63 = n30;
                    if (n62 >= 0) {
                        if (n62 - (this.subHeight << 12) < 0) {
                            final int n64;
                            if ((n64 = n61 - (this.subWidth << 12)) >= 0) {
                                final int n65 = (n35 - n64) / n35;
                                n63 += n65;
                                n61 += n35 * n65;
                                n60 += n65;
                            }
                            final int n66;
                            if ((n66 = (n61 - n35) / n35) > n63) {
                                n63 = n66;
                            }
                            while (n63 < 0) {
                                final int n67 = this.pixels[(n62 >> 12) * this.subWidth + (n61 >> 12)];
                                if (n67 != 0) {
                                    SpritePixels.ad[n60++] = (n67 | 0xFF000000);
                                }
                                else {
                                    ++n60;
                                }
                                n61 += n35;
                                ++n63;
                            }
                        }
                    }
                }
            }
            else if (n34 < 0) {
                for (int n68 = n31; n68 < 0; ++n68, n38 -= n34, n39 += n35, n32 += SpritePixels.ae) {
                    int n69 = n32;
                    int n70 = n38 + (n36 * n35 >> 4);
                    int n71 = n39 + (n36 * n34 >> 4);
                    int n72 = n30;
                    final int n73;
                    if ((n73 = n70 - (this.subWidth << 12)) >= 0) {
                        final int n74 = (n35 - n73) / n35;
                        n72 += n74;
                        n70 += n35 * n74;
                        n71 += n34 * n74;
                        n69 += n74;
                    }
                    final int n75;
                    if ((n75 = (n70 - n35) / n35) > n72) {
                        n72 = n75;
                    }
                    final int n76;
                    if ((n76 = n71 - (this.subHeight << 12)) >= 0) {
                        final int n77 = (n34 - n76) / n34;
                        n72 += n77;
                        n70 += n35 * n77;
                        n71 += n34 * n77;
                        n69 += n77;
                    }
                    final int n78;
                    if ((n78 = (n71 - n34) / n34) > n72) {
                        n72 = n78;
                    }
                    while (n72 < 0) {
                        final int n79 = this.pixels[(n71 >> 12) * this.subWidth + (n70 >> 12)];
                        if (n79 != 0) {
                            SpritePixels.ad[n69++] = (n79 | 0xFF000000);
                        }
                        else {
                            ++n69;
                        }
                        n70 += n35;
                        n71 += n34;
                        ++n72;
                    }
                }
            }
            else {
                for (int n80 = n31; n80 < 0; ++n80, n38 -= n34, n39 += n35, n32 += SpritePixels.ae) {
                    int n81 = n32;
                    int n82 = n38 + (n36 * n35 >> 4);
                    int n83 = n39 + (n36 * n34 >> 4);
                    int n84 = n30;
                    final int n85;
                    if ((n85 = n82 - (this.subWidth << 12)) >= 0) {
                        final int n86 = (n35 - n85) / n35;
                        n84 += n86;
                        n82 += n35 * n86;
                        n83 += n34 * n86;
                        n81 += n86;
                    }
                    final int n87;
                    if ((n87 = (n82 - n35) / n35) > n84) {
                        n84 = n87;
                    }
                    if (n83 < 0) {
                        final int n88 = (n34 - 1 - n83) / n34;
                        n84 += n88;
                        n82 += n35 * n88;
                        n83 += n34 * n88;
                        n81 += n88;
                    }
                    final int n89;
                    if ((n89 = (1 + n83 - (this.subHeight << 12) - n34) / n34) > n84) {
                        n84 = n89;
                    }
                    while (n84 < 0) {
                        final int n90 = this.pixels[(n83 >> 12) * this.subWidth + (n82 >> 12)];
                        if (n90 != 0) {
                            SpritePixels.ad[n81++] = (n90 | 0xFF000000);
                        }
                        else {
                            ++n81;
                        }
                        n82 += n35;
                        n83 += n34;
                        ++n84;
                    }
                }
            }
        }
        else if (n34 == 0) {
            for (int n91 = n31; n91 < 0; ++n91, n39 += n35, n32 += SpritePixels.ae) {
                int n92 = n32;
                int n93 = n38 + (n36 * n35 >> 4);
                final int n94 = n39;
                int n95 = n30;
                if (n94 >= 0) {
                    if (n94 - (this.subHeight << 12) < 0) {
                        if (n93 < 0) {
                            final int n96 = (n35 - 1 - n93) / n35;
                            n95 += n96;
                            n93 += n35 * n96;
                            n92 += n96;
                        }
                        final int n97;
                        if ((n97 = (1 + n93 - (this.subWidth << 12) - n35) / n35) > n95) {
                            n95 = n97;
                        }
                        while (n95 < 0) {
                            final int n98 = this.pixels[(n94 >> 12) * this.subWidth + (n93 >> 12)];
                            if (n98 != 0) {
                                SpritePixels.ad[n92++] = (n98 | 0xFF000000);
                            }
                            else {
                                ++n92;
                            }
                            n93 += n35;
                            ++n95;
                        }
                    }
                }
            }
        }
        else if (n34 < 0) {
            for (int n99 = n31; n99 < 0; ++n99, n38 -= n34, n39 += n35, n32 += SpritePixels.ae) {
                int n100 = n32;
                int n101 = n38 + (n36 * n35 >> 4);
                int n102 = n39 + (n36 * n34 >> 4);
                int n103 = n30;
                if (n101 < 0) {
                    final int n104 = (n35 - 1 - n101) / n35;
                    n103 += n104;
                    n101 += n35 * n104;
                    n102 += n34 * n104;
                    n100 += n104;
                }
                final int n105;
                if ((n105 = (1 + n101 - (this.subWidth << 12) - n35) / n35) > n103) {
                    n103 = n105;
                }
                final int n106;
                if ((n106 = n102 - (this.subHeight << 12)) >= 0) {
                    final int n107 = (n34 - n106) / n34;
                    n103 += n107;
                    n101 += n35 * n107;
                    n102 += n34 * n107;
                    n100 += n107;
                }
                final int n108;
                if ((n108 = (n102 - n34) / n34) > n103) {
                    n103 = n108;
                }
                while (n103 < 0) {
                    final int n109 = this.pixels[(n102 >> 12) * this.subWidth + (n101 >> 12)];
                    if (n109 != 0) {
                        SpritePixels.ad[n100++] = (n109 | 0xFF000000);
                    }
                    else {
                        ++n100;
                    }
                    n101 += n35;
                    n102 += n34;
                    ++n103;
                }
            }
        }
        else {
            for (int n110 = n31; n110 < 0; ++n110, n38 -= n34, n39 += n35, n32 += SpritePixels.ae) {
                int n111 = n32;
                int n112 = n38 + (n36 * n35 >> 4);
                int n113 = n39 + (n36 * n34 >> 4);
                int n114 = n30;
                if (n112 < 0) {
                    final int n115 = (n35 - 1 - n112) / n35;
                    n114 += n115;
                    n112 += n35 * n115;
                    n113 += n34 * n115;
                    n111 += n115;
                }
                final int n116;
                if ((n116 = (1 + n112 - (this.subWidth << 12) - n35) / n35) > n114) {
                    n114 = n116;
                }
                if (n113 < 0) {
                    final int n117 = (n34 - 1 - n113) / n34;
                    n114 += n117;
                    n112 += n35 * n117;
                    n113 += n34 * n117;
                    n111 += n117;
                }
                final int n118;
                if ((n118 = (1 + n113 - (this.subHeight << 12) - n34) / n34) > n114) {
                    n114 = n118;
                }
                while (n114 < 0) {
                    final int n119 = this.pixels[(n113 >> 12) * this.subWidth + (n112 >> 12)];
                    if (n119 != 0) {
                        SpritePixels.ad[n111++] = (n119 | 0xFF000000);
                    }
                    else {
                        ++n111;
                    }
                    n112 += n35;
                    n113 += n34;
                    ++n114;
                }
            }
        }
    }
    
    public void cu(int bk, int bi) {
        bk += this.xOffset;
        bi += this.yOffset;
        int n = bk + bi * SpritePixels.ae;
        int n2 = 0;
        int subHeight = this.subHeight;
        int subWidth = this.subWidth;
        int n3 = SpritePixels.ae - subWidth;
        int n4 = 0;
        if (bi < SpritePixels.bi) {
            final int n5 = SpritePixels.bi - bi;
            subHeight -= n5;
            bi = SpritePixels.bi;
            n2 += n5 * subWidth;
            n += n5 * SpritePixels.ae;
        }
        if (bi + subHeight > SpritePixels.be) {
            subHeight -= bi + subHeight - SpritePixels.be;
        }
        if (bk < SpritePixels.bk) {
            final int n6 = SpritePixels.bk - bk;
            subWidth -= n6;
            bk = SpritePixels.bk;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (bk + subWidth > SpritePixels.bx) {
            final int n7 = bk + subWidth - SpritePixels.bx;
            subWidth -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (subWidth > 0 && subHeight > 0) {
            Sprite_drawTransBg(SpritePixels.ad, this.pixels, 0, n2, n, subWidth, subHeight, n3, n4);
        }
    }
    
    public void dm(int n, int n2, int n3, int n4, final int n5) {
        if (n3 > 0 && n4 > 0) {
            final int subWidth = this.subWidth;
            final int subHeight = this.subHeight;
            int n6 = 0;
            int n7 = 0;
            final int width = this.width;
            final int height = this.height;
            final int n8 = (width << 16) / n3;
            final int n9 = (height << 16) / n4;
            if (this.xOffset > 0) {
                final int n10 = ((this.xOffset << 16) + n8 - 1) / n8;
                n += n10;
                n6 += n10 * n8 - (this.xOffset << 16);
            }
            if (this.yOffset > 0) {
                final int n11 = ((this.yOffset << 16) + n9 - 1) / n9;
                n2 += n11;
                n7 += n11 * n9 - (this.yOffset << 16);
            }
            if (subWidth < width) {
                n3 = ((subWidth << 16) - n6 + n8 - 1) / n8;
            }
            if (subHeight < height) {
                n4 = ((subHeight << 16) - n7 + n9 - 1) / n9;
            }
            int n12 = n + n2 * SpritePixels.ae;
            int n13 = SpritePixels.ae - n3;
            if (n2 + n4 > SpritePixels.be) {
                n4 -= n2 + n4 - SpritePixels.be;
            }
            if (n2 < SpritePixels.bi) {
                final int n14 = SpritePixels.bi - n2;
                n4 -= n14;
                n12 += n14 * SpritePixels.ae;
                n7 += n9 * n14;
            }
            if (n + n3 > SpritePixels.bx) {
                final int n15 = n + n3 - SpritePixels.bx;
                n3 -= n15;
                n13 += n15;
            }
            if (n < SpritePixels.bk) {
                final int n16 = SpritePixels.bk - n;
                n3 -= n16;
                n12 += n16;
                n6 += n8 * n16;
                n13 += n16;
            }
            Sprite_drawTransScaled(SpritePixels.ad, this.pixels, 0, n6, n7, n12, n13, n3, n4, n8, n9, subWidth, n5);
        }
    }
    
    public static void method2602(final SpritePixels spritePixels) {
        if (spritePixels == null) {
            spritePixels.ce();
            return;
        }
        final int[] pixels = new int[spritePixels.subWidth * spritePixels.subHeight];
        int n = 0;
        for (int i = spritePixels.subHeight - 1; i >= 0; --i) {
            for (int j = 0; j < spritePixels.subWidth; ++j) {
                pixels[n++] = spritePixels.pixels[j + i * spritePixels.subWidth];
            }
        }
        spritePixels.pixels = pixels;
        spritePixels.yOffset = spritePixels.height - spritePixels.subHeight - spritePixels.yOffset;
    }
    
    public SpritePixels method2602() {
        final SpritePixels spritePixels = new SpritePixels(this.subWidth, this.subHeight);
        spritePixels.width = this.width;
        spritePixels.height = this.height;
        spritePixels.xOffset = this.xOffset;
        spritePixels.yOffset = this.yOffset;
        for (int length = this.pixels.length, i = 0; i < length; ++i) {
            spritePixels.pixels[i] = this.pixels[i];
        }
        return spritePixels;
    }
    
    public void setRaster() {
        final int[] pixels = new int[this.height * this.height];
        int n = 0;
        for (int i = 0; i < this.xOffset; ++i) {
            for (int j = this.width - 1; j >= 0; --j) {
                pixels[n++] = this.pixels[j + i * this.subHeight];
            }
        }
        this.pixels = pixels;
        this.width = this.height - this.subHeight - this.subWidth;
    }
    
    public void cx(int bk, int bi, final int n, final int n2) {
        if (n == 256) {
            this.drawAt(bk, bi);
            return;
        }
        bk += this.xOffset;
        bi += this.yOffset;
        int n3 = bk + bi * SpritePixels.ae;
        int n4 = 0;
        int subHeight = this.subHeight;
        int subWidth = this.subWidth;
        int n5 = SpritePixels.ae - subWidth;
        int n6 = 0;
        if (bi < SpritePixels.bi) {
            final int n7 = SpritePixels.bi - bi;
            subHeight -= n7;
            bi = SpritePixels.bi;
            n4 += n7 * subWidth;
            n3 += n7 * SpritePixels.ae;
        }
        if (bi + subHeight > SpritePixels.be) {
            subHeight -= bi + subHeight - SpritePixels.be;
        }
        if (bk < SpritePixels.bk) {
            final int n8 = SpritePixels.bk - bk;
            subWidth -= n8;
            bk = SpritePixels.bk;
            n4 += n8;
            n3 += n8;
            n6 += n8;
            n5 += n8;
        }
        if (bk + subWidth > SpritePixels.bx) {
            final int n9 = bk + subWidth - SpritePixels.bx;
            subWidth -= n9;
            n6 += n9;
            n5 += n9;
        }
        if (subWidth <= 0 || subHeight <= 0) {
            return;
        }
        Sprite_drawTransOverlay(SpritePixels.ad, this.pixels, 0, n4, n3, subWidth, subHeight, n5, n6, n, n2);
    }
    
    public void bq() {
        ea(this.pixels, this.subWidth, this.subHeight, (float[])null);
    }
    
    public void dk(int n, int n2, int n3, int n4, final int n5) {
        if (n3 > 0 && n4 > 0) {
            final int subWidth = this.subWidth;
            final int subHeight = this.subHeight;
            int n6 = 0;
            int n7 = 0;
            final int width = this.width;
            final int height = this.height;
            final int n8 = (width << 16) / n3;
            final int n9 = (height << 16) / n4;
            if (this.xOffset > 0) {
                final int n10 = ((this.xOffset << 16) + n8 - 1) / n8;
                n += n10;
                n6 += n10 * n8 - (this.xOffset << 16);
            }
            if (this.yOffset > 0) {
                final int n11 = ((this.yOffset << 16) + n9 - 1) / n9;
                n2 += n11;
                n7 += n11 * n9 - (this.yOffset << 16);
            }
            if (subWidth < width) {
                n3 = ((subWidth << 16) - n6 + n8 - 1) / n8;
            }
            if (subHeight < height) {
                n4 = ((subHeight << 16) - n7 + n9 - 1) / n9;
            }
            int n12 = n + n2 * SpritePixels.ae;
            int n13 = SpritePixels.ae - n3;
            if (n2 + n4 > SpritePixels.be) {
                n4 -= n2 + n4 - SpritePixels.be;
            }
            if (n2 < SpritePixels.bi) {
                final int n14 = SpritePixels.bi - n2;
                n4 -= n14;
                n12 += n14 * SpritePixels.ae;
                n7 += n9 * n14;
            }
            if (n + n3 > SpritePixels.bx) {
                final int n15 = n + n3 - SpritePixels.bx;
                n3 -= n15;
                n13 += n15;
            }
            if (n < SpritePixels.bk) {
                final int n16 = SpritePixels.bk - n;
                n3 -= n16;
                n12 += n16;
                n6 += n8 * n16;
                n13 += n16;
            }
            if (n5 == 256) {
                method2617(0, 0, 0, n6, this.pixels, SpritePixels.ad, 0, 0, -n4, n7, n12, n13, n3, n8, n9, subWidth);
            }
            else {
                method2627(0, 0, 0, n6, this.pixels, SpritePixels.ad, 0, 0, -n4, n7, n12, n13, n3, n8, n9, subWidth, n5);
            }
        }
    }
    
    public void do(int bk, int bi, final int n) {
        bk += this.xOffset;
        bi += this.yOffset;
        int n2 = bk + bi * SpritePixels.ae;
        int n3 = 0;
        int subHeight = this.subHeight;
        int subWidth = this.subWidth;
        int n4 = SpritePixels.ae - subWidth;
        int n5 = 0;
        if (bi < SpritePixels.bi) {
            final int n6 = SpritePixels.bi - bi;
            subHeight -= n6;
            bi = SpritePixels.bi;
            n3 += n6 * subWidth;
            n2 += n6 * SpritePixels.ae;
        }
        if (bi + subHeight > SpritePixels.be) {
            subHeight -= bi + subHeight - SpritePixels.be;
        }
        if (bk < SpritePixels.bk) {
            final int n7 = SpritePixels.bk - bk;
            subWidth -= n7;
            bk = SpritePixels.bk;
            n3 += n7;
            n2 += n7;
            n5 += n7;
            n4 += n7;
        }
        if (bk + subWidth > SpritePixels.bx) {
            final int n8 = bk + subWidth - SpritePixels.bx;
            subWidth -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (subWidth > 0 && subHeight > 0) {
            if (n == 256) {
                method2618(0, 0, 0, SpritePixels.ad, this.pixels, n3, 0, n2, 0, subWidth, subHeight, n4, n5);
            }
            else {
                method2619(0, 0, 0, SpritePixels.ad, this.pixels, n3, 0, n2, 0, subWidth, subHeight, n4, n5, n);
            }
        }
    }
    
    public static void gd(final SpritePixels spritePixels, int i, int j, final int n, final int n2, final int n3, final int n4, final double n5, final int n6) {
        if (spritePixels == null) {
            spritePixels.bd();
        }
        try {
            final int n7 = -n / 2;
            final int n8 = -n2 / 2;
            final int n9 = (int)(Math.sin(n5) * 65536.0);
            final int n10 = (int)(Math.cos(n5) * 65536.0);
            final int n11 = n9 * n6 >> 8;
            final int n12 = n10 * n6 >> 8;
            int n13 = (n3 << 16) + (n8 * n11 + n7 * n12);
            int n14 = (n4 << 16) + (n8 * n12 - n7 * n11);
            int n15 = i + j * SpritePixels.ae;
            int n16;
            int n17;
            int n18;
            int n19;
            for (j = 0; j < n2; ++j) {
                n16 = n15;
                n17 = n13;
                n18 = n14;
                for (i = -n; i < 0; ++i) {
                    n19 = spritePixels.pixels[(n17 >> 16) + (n18 >> 16) * spritePixels.subWidth];
                    if (n19 != 0) {
                        SpritePixels.ad[n16++] = n19;
                    }
                    else {
                        ++n16;
                    }
                    n17 += n12;
                    n18 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += SpritePixels.ae;
            }
        }
        catch (Exception ex) {}
    }
    
    static void dz(int n, int n2, int n3, int n4, final int[] array, final int[] array2, int i, int n5, int j, int n6, int n7, final int n8, final int n9, final int n10, final int n11, final int n12) {
        final int n13 = n4;
        while (j < 0) {
            n5 = (n6 >> 16) * n12;
            for (i = -n9; i < 0; ++i) {
                n = array[(n4 >> 16) + n5];
                if (n != 0) {
                    n2 = array2[n7];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array2[n7++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n7;
                }
                n4 += n10;
            }
            n6 += n11;
            n4 = n13;
            n7 += n8;
            ++j;
        }
    }
    
    static void de(int n, int n2, int n3, int n4, final int[] array, final int[] array2, int i, int n5, int j, int n6, int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13) {
        final int n14 = n4;
        while (j < 0) {
            n5 = (n6 >> 16) * n12;
            for (i = -n9; i < 0; ++i) {
                n = array[(n4 >> 16) + n5];
                if (n != 0) {
                    n2 = (n & 0xFF00FF) * n13;
                    n = (n2 & 0xFF00FF00) + (n * n13 - n2 & 0xFF0000) >>> 8;
                    n2 = array2[n7];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array2[n7++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n7;
                }
                n4 += n10;
            }
            n6 += n11;
            n4 = n14;
            n7 += n8;
            ++j;
        }
    }
    
    public static SpritePixels tw(final SpritePixels spritePixels) {
        final SpritePixels spritePixels2 = new SpritePixels(spritePixels.width, spritePixels.height);
        for (int i = 0; i < spritePixels.subHeight; ++i) {
            for (int j = 0; j < spritePixels.subWidth; ++j) {
                spritePixels2.pixels[(i + spritePixels.yOffset) * spritePixels.width + (j + spritePixels.xOffset)] = spritePixels.pixels[i * spritePixels.subWidth + j];
            }
        }
        return spritePixels2;
    }
    
    public void normalize() {
        if (this.subWidth == this.width && this.subHeight == this.height) {
            return;
        }
        final int[] pixels = new int[this.width * this.height];
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = 0; j < this.subWidth; ++j) {
                pixels[(i + this.yOffset) * this.width + (j + this.xOffset)] = this.pixels[i * this.subWidth + j];
            }
        }
        this.pixels = pixels;
        this.subWidth = this.width;
        this.subHeight = this.height;
        this.xOffset = 0;
        this.yOffset = 0;
    }
    
    public void shadow(final int n) {
        for (int i = this.subHeight - 1; i > 0; --i) {
            final int n2 = i * this.subWidth;
            for (int j = this.subWidth - 1; j > 0; --j) {
                if (this.pixels[j + n2] == 0 && this.pixels[j + n2 - 1 - this.subWidth] != 0) {
                    this.pixels[j + n2] = n;
                }
            }
        }
    }
    
    static void Sprite_drawTransBg(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = (n | 0xFF000000);
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = (n | 0xFF000000);
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = (n | 0xFF000000);
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = (n | 0xFF000000);
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                n = array2[n2++];
                if (n != 0) {
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
    
    public int getWidth() {
        return this.subWidth;
    }
    
    public void dx(int i, int j, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int[] array, final int[] array2) {
        try {
            final int n7 = -n / 2;
            final int n8 = -n2 / 2;
            final int n9 = (int)(Math.sin(n5 / 326.11) * 65536.0);
            final int n10 = (int)(Math.cos(n5 / 326.11) * 65536.0);
            final int n11 = n9 * n6 >> 8;
            final int n12 = n10 * n6 >> 8;
            int n13 = (n3 << 16) + (n8 * n11 + n7 * n12);
            int n14 = (n4 << 16) + (n8 * n12 - n7 * n11);
            int n15 = i + j * Rasterizer2D.Rasterizer2D_height;
            int n16;
            int n17;
            int n18;
            int n19;
            for (j = 0; j < n2; ++j) {
                n16 = array[j];
                n17 = n15 + n16;
                n18 = n13 + n12 * n16;
                n19 = n14 - n11 * n16;
                for (i = -array2[j]; i < 0; ++i) {
                    SpritePixels.ad[n17++] = this.pixels[(n18 >> 16) + (n19 >> 16) * this.subHeight];
                    n18 += n12;
                    n19 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += Rasterizer2D.Rasterizer2D_yClipEnd;
            }
        }
        catch (Exception ex) {}
    }
    
    public void dy(int i, int j, final int n, final int n2, final int n3, final int n4, final double n5, final int n6) {
        try {
            final int n7 = -n / 2;
            final int n8 = -n2 / 2;
            final int n9 = (int)(Math.sin(n5) * 65536.0);
            final int n10 = (int)(Math.cos(n5) * 65536.0);
            final int n11 = n9 * n6 >> 8;
            final int n12 = n10 * n6 >> 8;
            int n13 = (n3 << 16) + (n8 * n11 + n7 * n12);
            int n14 = (n4 << 16) + (n8 * n12 - n7 * n11);
            int n15 = i + j * SpritePixels.ae;
            int n16;
            int n17;
            int n18;
            int n19;
            for (j = 0; j < n2; ++j) {
                n16 = n15;
                n17 = n13;
                n18 = n14;
                for (i = -n; i < 0; ++i) {
                    n19 = this.pixels[(n17 >> 16) + (n18 >> 16) * this.subWidth];
                    if (n19 != 0) {
                        SpritePixels.ad[n16++] = n19;
                    }
                    else {
                        ++n16;
                    }
                    n17 += n12;
                    n18 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += SpritePixels.ae;
            }
        }
        catch (Exception ex) {}
    }
    
    public void bh() {
        final int[] pixels = new int[this.subWidth * this.subHeight];
        int n = 0;
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = this.subWidth - 1; j >= 0; --j) {
                pixels[n++] = this.pixels[j + i * this.subWidth];
            }
        }
        this.pixels = pixels;
        this.xOffset = this.width - this.subWidth - this.xOffset;
    }
    
    public int[] getPixels() {
        return this.pixels;
    }
    
    static void method2617(int n, int n2, int n3, int n4, final int[] array, final int[] array2, int i, int n5, int j, int n6, int n7, final int n8, final int n9, final int n10, final int n11, final int n12) {
        final int n13 = n4;
        while (j < 0) {
            n5 = (n6 >> 16) * n12;
            for (i = -n9; i < 0; ++i) {
                n = array[(n4 >> 16) + n5];
                if (n != 0) {
                    n2 = array2[n7];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array2[n7++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n7;
                }
                n4 += n10;
            }
            n6 += n11;
            n4 = n13;
            n7 += n8;
            ++j;
        }
    }
    
    public void method2632(final int n, final int n2, final int n3, final int n4) {
        this.et(this.width << 3, this.height << 3, n << 4, n2 << 4, n3, n4);
    }
    
    static void Sprite_drawTransOverlay(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8, int n9) {
        final int n10 = 256 - n8;
        n9 = (((n9 & 0xFF00FF) * n10 & 0xFF00FF00) | ((n9 & 0xFF00) * n10 & 0xFF0000)) >>> 8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = (((((n & 0xFF00FF) * n8 & 0xFF00FF00) | ((n & 0xFF00) * n8 & 0xFF0000)) >>> 8) + n9 | 0xFF000000);
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    public static void vi(final SpritePixels spritePixels, final int n, final int n2, final int n3, final int n4) {
        if (n3 > spritePixels.width || n4 > spritePixels.height) {
            throw new IllegalArgumentException();
        }
        int bk = n + spritePixels.xOffset * n3 / spritePixels.width;
        int bx = n + ((spritePixels.xOffset + spritePixels.subWidth) * n3 + spritePixels.width - 1) / spritePixels.width;
        int bi = n2 + spritePixels.yOffset * n4 / spritePixels.height;
        int be = n2 + ((spritePixels.yOffset + spritePixels.subHeight) * n4 + spritePixels.height - 1) / spritePixels.height;
        if (bk < SpritePixels.bk) {
            bk = SpritePixels.bk;
        }
        if (bx > SpritePixels.bx) {
            bx = SpritePixels.bx;
        }
        if (bi < SpritePixels.bi) {
            bi = SpritePixels.bi;
        }
        if (be > SpritePixels.be) {
            be = SpritePixels.be;
        }
        if (bk >= bx || bi >= be) {
            return;
        }
        int n5 = bi * SpritePixels.ae + bk;
        final int n6 = SpritePixels.ae - (bx - bk);
        if (n5 >= SpritePixels.ad.length) {
            return;
        }
        for (int i = bi; i < be; ++i) {
            for (int j = bk; j < bx; ++j) {
                final int n7 = j - n << 4;
                final int n8 = i - n2 << 4;
                int n9 = n7 * spritePixels.width / n3 - (spritePixels.xOffset << 4);
                int n10 = (n7 + 16) * spritePixels.width / n3 - (spritePixels.xOffset << 4);
                int n11 = n8 * spritePixels.height / n4 - (spritePixels.yOffset << 4);
                int n12 = (n8 + 16) * spritePixels.height / n4 - (spritePixels.yOffset << 4);
                final int n13 = (n10 - n9) * (n12 - n11) >> 1;
                if (n13 != 0) {
                    if (n9 < 0) {
                        n9 = 0;
                    }
                    if (n10 >= spritePixels.subWidth << 4) {
                        n10 = spritePixels.subWidth << 4;
                    }
                    if (n11 < 0) {
                        n11 = 0;
                    }
                    if (n12 >= spritePixels.subHeight << 4) {
                        n12 = spritePixels.subHeight << 4;
                    }
                    --n10;
                    --n12;
                    final int n14 = 16 - (n9 & 0xF);
                    final int n15 = (n10 & 0xF) + 1;
                    final int n16 = 16 - (n11 & 0xF);
                    final int n17 = (n12 & 0xF) + 1;
                    final int n18 = n9 >> 4;
                    final int n19 = n10 >> 4;
                    final int n20 = n11 >> 4;
                    final int n21 = n12 >> 4;
                    int n22 = 0;
                    int n23 = 0;
                    int n24 = 0;
                    int n25 = 0;
                    for (int k = n20; k <= n21; ++k) {
                        int n26 = 16;
                        if (k == n20) {
                            n26 = n16;
                        }
                        if (k == n21) {
                            n26 = n17;
                        }
                        for (int l = n18; l <= n19; ++l) {
                            final int n27 = spritePixels.pixels[k * spritePixels.subWidth + l];
                            if (n27 != 0) {
                                final int n28 = n26;
                                int n29;
                                if (l == n18) {
                                    n29 = n28 * n14;
                                }
                                else if (l == n19) {
                                    n29 = n28 * n15;
                                }
                                else {
                                    n29 = n28 << 4;
                                }
                                n25 += n29;
                                n22 += (n27 >> 16 & 0xFF) * n29;
                                n23 += (n27 >> 8 & 0xFF) * n29;
                                n24 += (n27 & 0xFF) * n29;
                            }
                        }
                    }
                    if (n25 >= n13) {
                        int n30 = (n22 / n25 << 16) + (n23 / n25 << 8) + n24 / n25;
                        if (n30 == 0) {
                            n30 = 1;
                        }
                        SpritePixels.ad[n5] = n30;
                    }
                    ++n5;
                }
            }
            n5 += n6;
        }
    }
    
    public void method2607(int n, int n2, int n3, int n4, final int n5) {
        if (n3 > 0 && n4 > 0) {
            final int subWidth = this.subWidth;
            final int subHeight = this.subHeight;
            int n6 = 0;
            int n7 = 0;
            final int width = this.width;
            final int height = this.height;
            final int n8 = (width << 16) / n3;
            final int n9 = (height << 16) / n4;
            if (this.xOffset > 0) {
                final int n10 = ((this.xOffset << 16) + n8 - 1) / n8;
                n += n10;
                n6 += n10 * n8 - (this.xOffset << 16);
            }
            if (this.yOffset > 0) {
                final int n11 = ((this.yOffset << 16) + n9 - 1) / n9;
                n2 += n11;
                n7 += n11 * n9 - (this.yOffset << 16);
            }
            if (subWidth < width) {
                n3 = ((subWidth << 16) - n6 + n8 - 1) / n8;
            }
            if (subHeight < height) {
                n4 = ((subHeight << 16) - n7 + n9 - 1) / n9;
            }
            int n12 = n + n2 * SpritePixels.ae;
            int n13 = SpritePixels.ae - n3;
            if (n2 + n4 > SpritePixels.be) {
                n4 -= n2 + n4 - SpritePixels.be;
            }
            if (n2 < SpritePixels.bi) {
                final int n14 = SpritePixels.bi - n2;
                n4 -= n14;
                n12 += n14 * SpritePixels.ae;
                n7 += n9 * n14;
            }
            if (n + n3 > SpritePixels.bx) {
                final int n15 = n + n3 - SpritePixels.bx;
                n3 -= n15;
                n13 += n15;
            }
            if (n < SpritePixels.bk) {
                final int n16 = SpritePixels.bk - n;
                n3 -= n16;
                n12 += n16;
                n6 += n8 * n16;
                n13 += n16;
            }
            if (n5 == 256) {
                method2617(0, 0, 0, n6, this.pixels, SpritePixels.ad, 0, 0, -n4, n7, n12, n13, n3, n8, n9, subWidth);
            }
            else {
                method2627(0, 0, 0, n6, this.pixels, SpritePixels.ad, 0, 0, -n4, n7, n12, n13, n3, n8, n9, subWidth, n5);
            }
        }
    }
    
    public void xs() {
        bg(this);
    }
    
    public SpritePixels bd() {
        final SpritePixels spritePixels = new SpritePixels(this.subWidth, this.subHeight);
        spritePixels.width = this.width;
        spritePixels.height = this.height;
        spritePixels.xOffset = this.width - this.subWidth - this.xOffset;
        spritePixels.yOffset = this.yOffset;
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = 0; j < this.subWidth; ++j) {
                spritePixels.pixels[i * this.subWidth + j] = this.pixels[i * this.subWidth + this.subWidth - 1 - j];
            }
        }
        return spritePixels;
    }
    
    public void cm(int bk, int bi) {
        bk += this.xOffset;
        bi += this.yOffset;
        int n = bk + bi * SpritePixels.ae;
        int n2 = 0;
        int subHeight = this.subHeight;
        int subWidth = this.subWidth;
        int n3 = SpritePixels.ae - subWidth;
        int n4 = 0;
        if (bi < SpritePixels.bi) {
            final int n5 = SpritePixels.bi - bi;
            subHeight -= n5;
            bi = SpritePixels.bi;
            n2 += n5 * subWidth;
            n += n5 * SpritePixels.ae;
        }
        if (bi + subHeight > SpritePixels.be) {
            subHeight -= bi + subHeight - SpritePixels.be;
        }
        if (bk < SpritePixels.bk) {
            final int n6 = SpritePixels.bk - bk;
            subWidth -= n6;
            bk = SpritePixels.bk;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (bk + subWidth > SpritePixels.bx) {
            final int n7 = bk + subWidth - SpritePixels.bx;
            subWidth -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (subWidth > 0 && subHeight > 0) {
            Sprite_draw(SpritePixels.ad, this.pixels, n2, n, subWidth, subHeight, n3, n4);
        }
    }
    
    public static void bg(final SpritePixels spritePixels) {
        if (spritePixels == null) {
            spritePixels.setRaster();
        }
        ea(spritePixels.pixels, spritePixels.subWidth, spritePixels.subHeight, (float[])null);
    }
    
    public SpritePixels bg() {
        final SpritePixels spritePixels = new SpritePixels(this.subWidth, this.subHeight);
        spritePixels.width = this.width;
        spritePixels.height = this.height;
        spritePixels.xOffset = this.xOffset;
        spritePixels.yOffset = this.yOffset;
        for (int length = this.pixels.length, i = 0; i < length; ++i) {
            spritePixels.pixels[i] = this.pixels[i];
        }
        return spritePixels;
    }
    
    public void cg(int n, int n2, int n3, int n4) {
        if (n3 > 0 && n4 > 0) {
            final int subWidth = this.subWidth;
            final int subHeight = this.subHeight;
            int n5 = 0;
            int n6 = 0;
            final int width = this.width;
            final int height = this.height;
            final int n7 = (width << 16) / n3;
            final int n8 = (height << 16) / n4;
            if (this.xOffset > 0) {
                final int n9 = ((this.xOffset << 16) + n7 - 1) / n7;
                n += n9;
                n5 += n9 * n7 - (this.xOffset << 16);
            }
            if (this.yOffset > 0) {
                final int n10 = ((this.yOffset << 16) + n8 - 1) / n8;
                n2 += n10;
                n6 += n10 * n8 - (this.yOffset << 16);
            }
            if (subWidth < width) {
                n3 = ((subWidth << 16) - n5 + n7 - 1) / n7;
            }
            if (subHeight < height) {
                n4 = ((subHeight << 16) - n6 + n8 - 1) / n8;
            }
            int n11 = n + n2 * SpritePixels.ae;
            int n12 = SpritePixels.ae - n3;
            if (n2 + n4 > SpritePixels.be) {
                n4 -= n2 + n4 - SpritePixels.be;
            }
            if (n2 < SpritePixels.bi) {
                final int n13 = SpritePixels.bi - n2;
                n4 -= n13;
                n11 += n13 * SpritePixels.ae;
                n6 += n8 * n13;
            }
            if (n + n3 > SpritePixels.bx) {
                final int n14 = n + n3 - SpritePixels.bx;
                n3 -= n14;
                n12 += n14;
            }
            if (n < SpritePixels.bk) {
                final int n15 = SpritePixels.bk - n;
                n3 -= n15;
                n11 += n15;
                n5 += n7 * n15;
                n12 += n15;
            }
            Sprite_drawScaled(SpritePixels.ad, this.pixels, 0, n5, n6, n11, n12, n3, n4, n7, n8, subWidth);
        }
    }
    
    public void co(int bk, int bi, final int n) {
        bk += this.xOffset;
        bi += this.yOffset;
        int n2 = bk + bi * SpritePixels.ae;
        int n3 = 0;
        int subHeight = this.subHeight;
        int subWidth = this.subWidth;
        int n4 = SpritePixels.ae - subWidth;
        int n5 = 0;
        if (bi < SpritePixels.bi) {
            final int n6 = SpritePixels.bi - bi;
            subHeight -= n6;
            bi = SpritePixels.bi;
            n3 += n6 * subWidth;
            n2 += n6 * SpritePixels.ae;
        }
        if (bi + subHeight > SpritePixels.be) {
            subHeight -= bi + subHeight - SpritePixels.be;
        }
        if (bk < SpritePixels.bk) {
            final int n7 = SpritePixels.bk - bk;
            subWidth -= n7;
            bk = SpritePixels.bk;
            n3 += n7;
            n2 += n7;
            n5 += n7;
            n4 += n7;
        }
        if (bk + subWidth > SpritePixels.bx) {
            final int n8 = bk + subWidth - SpritePixels.bx;
            subWidth -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (subWidth > 0 && subHeight > 0) {
            Sprite_drawTransparent(SpritePixels.ad, this.pixels, 0, n3, n2, subWidth, subHeight, n4, n5, n);
        }
    }
    
    static void cy(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        final int n11 = n2;
        for (int i = -n7; i < 0; ++i) {
            final int n12 = (n3 >> 16) * n10;
            for (int j = -n6; j < 0; ++j) {
                n = array2[(n2 >> 16) + n12];
                if (n != 0) {
                    array[n4++] = n;
                }
                else {
                    ++n4;
                }
                n2 += n8;
            }
            n3 += n9;
            n2 = n11;
            n4 += n5;
        }
    }
    
    public SpritePixels mirrorHorizontally() {
        final SpritePixels spritePixels = new SpritePixels(this.subWidth, this.subHeight);
        spritePixels.width = this.width;
        spritePixels.height = this.height;
        spritePixels.xOffset = this.width - this.subWidth - this.xOffset;
        spritePixels.yOffset = this.yOffset;
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = 0; j < this.subWidth; ++j) {
                spritePixels.pixels[i * this.subWidth + j] = this.pixels[i * this.subWidth + this.subWidth - 1 - j];
            }
        }
        return spritePixels;
    }
    
    public SpritePixels bn() {
        final SpritePixels spritePixels = new SpritePixels(this.subWidth, this.subHeight);
        spritePixels.width = this.width;
        spritePixels.height = this.height;
        spritePixels.xOffset = this.xOffset;
        spritePixels.yOffset = this.yOffset;
        for (int length = this.pixels.length, i = 0; i < length; ++i) {
            spritePixels.pixels[i] = this.pixels[i];
        }
        return spritePixels;
    }
    
    static void cz(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int n9 = -1595484277 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    final int n10 = array[n3];
                    array[n3++] = ((n & 0xFF00FF) * n8 + (n10 & 0xFE012DE0) * n9 & 0x6A7BE0BC) + ((n & 0x52388D55) * n8 + (n10 & 0xFF00) * n9 & 0x5E89DFCE) >> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    static void dr(int n, int n2, int n3, final int[] array, final int[] array2, int n4, int i, int n5, int j, final int n6, final int n7, final int n8, final int n9, final int n10) {
        for (j = -n7; j < 0; ++j) {
            for (i = -n6; i < 0; ++i) {
                n = array2[n4++];
                if (n != 0) {
                    n2 = (n & 0xFF00FF) * n10;
                    n = (n2 & 0x40FEB551) + (n * n10 - n2 & 0xFF0000) >>> 8;
                    n2 = array[n5];
                    n3 = n + n2;
                    n = (n & 0x17AFD4F3) + (n2 & 0xB74BBD77);
                    n2 = (n & 0x1000100) + (n3 - n & 0x90712C58);
                    array[n5++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n5;
                }
            }
            n5 += n8;
            n4 += n9;
        }
    }
    
    public void pad(final int n) {
        if (this.height == this.width && this.subHeight == this.width) {
            return;
        }
        int subWidth = n;
        if (subWidth > this.height) {
            subWidth = this.subWidth;
        }
        int n2 = n;
        if (n2 + this.xOffset + this.width > this.width) {
            n2 = this.subHeight - this.height - this.subWidth;
        }
        int yOffset = n;
        if (yOffset > this.yOffset) {
            yOffset = this.yOffset;
        }
        int n3 = n;
        if (n3 + this.yOffset + this.subHeight > this.subHeight) {
            n3 = this.xOffset - this.yOffset - this.subHeight;
        }
        final int width = this.xOffset + subWidth + n2;
        final int subWidth2 = this.height + yOffset + n3;
        final int[] pixels = new int[width * subWidth2];
        for (int i = 0; i < this.width; ++i) {
            for (int j = 0; j < this.subHeight; ++j) {
                pixels[(i + yOffset) * width + (j + subWidth)] = this.pixels[i * this.subHeight + j];
            }
        }
        this.pixels = pixels;
        this.width = width;
        this.subWidth = subWidth2;
        this.height = this.xOffset - subWidth;
        this.yOffset -= yOffset;
    }
    
    public void flipHorizontally() {
        final int[] pixels = new int[this.subHeight * this.subHeight];
        int n = 0;
        for (int i = 0; i < this.xOffset; ++i) {
            for (int j = this.subWidth - 1; j >= 0; --j) {
                pixels[n++] = this.pixels[j + i * this.subHeight];
            }
        }
        this.pixels = pixels;
        this.subHeight = this.subWidth - this.subWidth - this.subWidth;
    }
    
    public void drawTransScaledAt(int n, int n2, int n3, int n4, final int n5) {
        if (n3 > 0 && n4 > 0) {
            final int subWidth = this.subWidth;
            final int subHeight = this.subHeight;
            int n6 = 0;
            int n7 = 0;
            final int width = this.width;
            final int height = this.height;
            final int n8 = (width << 16) / n3;
            final int n9 = (height << 16) / n4;
            if (this.xOffset > 0) {
                final int n10 = ((this.xOffset << 16) + n8 - 1) / n8;
                n += n10;
                n6 += n10 * n8 - (this.xOffset << 16);
            }
            if (this.yOffset > 0) {
                final int n11 = ((this.yOffset << 16) + n9 - 1) / n9;
                n2 += n11;
                n7 += n11 * n9 - (this.yOffset << 16);
            }
            if (subWidth < width) {
                n3 = ((subWidth << 16) - n6 + n8 - 1) / n8;
            }
            if (subHeight < height) {
                n4 = ((subHeight << 16) - n7 + n9 - 1) / n9;
            }
            int n12 = n + n2 * SpritePixels.ae;
            int n13 = SpritePixels.ae - n3;
            if (n2 + n4 > SpritePixels.be) {
                n4 -= n2 + n4 - SpritePixels.be;
            }
            if (n2 < SpritePixels.bi) {
                final int n14 = SpritePixels.bi - n2;
                n4 -= n14;
                n12 += n14 * SpritePixels.ae;
                n7 += n9 * n14;
            }
            if (n + n3 > SpritePixels.bx) {
                final int n15 = n + n3 - SpritePixels.bx;
                n3 -= n15;
                n13 += n15;
            }
            if (n < SpritePixels.bk) {
                final int n16 = SpritePixels.bk - n;
                n3 -= n16;
                n12 += n16;
                n6 += n8 * n16;
                n13 += n16;
            }
            Sprite_drawTransScaled(SpritePixels.ad, this.pixels, 0, n6, n7, n12, n13, n3, n4, n8, n9, subWidth, n5);
        }
    }
    
    public void drawScaledAt(int n, int n2, int n3, int n4) {
        if (n3 > 0 && n4 > 0) {
            final int subWidth = this.subWidth;
            final int subHeight = this.subHeight;
            int n5 = 0;
            int n6 = 0;
            final int width = this.width;
            final int height = this.height;
            final int n7 = (width << 16) / n3;
            final int n8 = (height << 16) / n4;
            if (this.xOffset > 0) {
                final int n9 = ((this.xOffset << 16) + n7 - 1) / n7;
                n += n9;
                n5 += n9 * n7 - (this.xOffset << 16);
            }
            if (this.yOffset > 0) {
                final int n10 = ((this.yOffset << 16) + n8 - 1) / n8;
                n2 += n10;
                n6 += n10 * n8 - (this.yOffset << 16);
            }
            if (subWidth < width) {
                n3 = ((subWidth << 16) - n5 + n7 - 1) / n7;
            }
            if (subHeight < height) {
                n4 = ((subHeight << 16) - n6 + n8 - 1) / n8;
            }
            int n11 = n + n2 * SpritePixels.ae;
            int n12 = SpritePixels.ae - n3;
            if (n2 + n4 > SpritePixels.be) {
                n4 -= n2 + n4 - SpritePixels.be;
            }
            if (n2 < SpritePixels.bi) {
                final int n13 = SpritePixels.bi - n2;
                n4 -= n13;
                n11 += n13 * SpritePixels.ae;
                n6 += n8 * n13;
            }
            if (n + n3 > SpritePixels.bx) {
                final int n14 = n + n3 - SpritePixels.bx;
                n3 -= n14;
                n12 += n14;
            }
            if (n < SpritePixels.bk) {
                final int n15 = SpritePixels.bk - n;
                n3 -= n15;
                n11 += n15;
                n5 += n7 * n15;
                n12 += n15;
            }
            Sprite_drawScaled(SpritePixels.ad, this.pixels, 0, n5, n6, n11, n12, n3, n4, n7, n8, subWidth);
        }
    }
    
    public void bl() {
        final int[] pixels = new int[this.subWidth * this.subHeight];
        int n = 0;
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = this.subWidth - 1; j >= 0; --j) {
                pixels[n++] = this.pixels[j + i * this.subWidth];
            }
        }
        this.pixels = pixels;
        this.xOffset = this.width - this.subWidth - this.xOffset;
    }
    
    public void setOffsetX(final int xOffset) {
        this.xOffset = xOffset;
    }
    
    public void setOffsetY(final int yOffset) {
        this.yOffset = yOffset;
    }
    
    public void ep(final int n, final int n2, final int n3, final int n4) {
        this.et(this.width << 3, this.height << 3, n << 4, n2 << 4, n3, n4);
    }
    
    public int getHeight() {
        return this.subHeight;
    }
    
    static void dg(int n, int n2, int n3, int n4, final int[] array, final int[] array2, int i, int n5, int j, int n6, int n7, final int n8, final int n9, final int n10, final int n11, final int n12) {
        final int n13 = n4;
        while (j < 0) {
            n5 = (n6 >> 16) * n12;
            for (i = -n9; i < 0; ++i) {
                n = array[(n4 >> 16) + n5];
                if (n != 0) {
                    n2 = array2[n7];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array2[n7++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n7;
                }
                n4 += n10;
            }
            n6 += n11;
            n4 = n13;
            n7 += n8;
            ++j;
        }
    }
    
    public void drawScaledWorldmap(final int n, final int n2, final int n3, final int n4) {
        if (n3 > this.width || n4 > this.height) {
            throw new IllegalArgumentException();
        }
        int bk = n + this.xOffset * n3 / this.width;
        int bx = n + ((this.xOffset + this.subWidth) * n3 + this.width - 1) / this.width;
        int bi = n2 + this.yOffset * n4 / this.height;
        int be = n2 + ((this.yOffset + this.subHeight) * n4 + this.height - 1) / this.height;
        if (bk < SpritePixels.bk) {
            bk = SpritePixels.bk;
        }
        if (bx > SpritePixels.bx) {
            bx = SpritePixels.bx;
        }
        if (bi < SpritePixels.bi) {
            bi = SpritePixels.bi;
        }
        if (be > SpritePixels.be) {
            be = SpritePixels.be;
        }
        if (bk >= bx || bi >= be) {
            return;
        }
        int n5 = bi * SpritePixels.ae + bk;
        final int n6 = SpritePixels.ae - (bx - bk);
        if (n5 >= SpritePixels.ad.length) {
            return;
        }
        for (int i = bi; i < be; ++i) {
            for (int j = bk; j < bx; ++j) {
                final int n7 = j - n << 4;
                final int n8 = i - n2 << 4;
                int n9 = n7 * this.width / n3 - (this.xOffset << 4);
                int n10 = (n7 + 16) * this.width / n3 - (this.xOffset << 4);
                int n11 = n8 * this.height / n4 - (this.yOffset << 4);
                int n12 = (n8 + 16) * this.height / n4 - (this.yOffset << 4);
                final int n13 = (n10 - n9) * (n12 - n11) >> 1;
                if (n13 != 0) {
                    if (n9 < 0) {
                        n9 = 0;
                    }
                    if (n10 >= this.subWidth << 4) {
                        n10 = this.subWidth << 4;
                    }
                    if (n11 < 0) {
                        n11 = 0;
                    }
                    if (n12 >= this.subHeight << 4) {
                        n12 = this.subHeight << 4;
                    }
                    --n10;
                    --n12;
                    final int n14 = 16 - (n9 & 0xF);
                    final int n15 = (n10 & 0xF) + 1;
                    final int n16 = 16 - (n11 & 0xF);
                    final int n17 = (n12 & 0xF) + 1;
                    final int n18 = n9 >> 4;
                    final int n19 = n10 >> 4;
                    final int n20 = n11 >> 4;
                    final int n21 = n12 >> 4;
                    int n22 = 0;
                    int n23 = 0;
                    int n24 = 0;
                    int n25 = 0;
                    for (int k = n20; k <= n21; ++k) {
                        int n26 = 16;
                        if (k == n20) {
                            n26 = n16;
                        }
                        if (k == n21) {
                            n26 = n17;
                        }
                        for (int l = n18; l <= n19; ++l) {
                            final int n27 = this.pixels[k * this.subWidth + l];
                            if (n27 != 0) {
                                final int n28 = n26;
                                int n29;
                                if (l == n18) {
                                    n29 = n28 * n14;
                                }
                                else if (l == n19) {
                                    n29 = n28 * n15;
                                }
                                else {
                                    n29 = n28 << 4;
                                }
                                n25 += n29;
                                n22 += (n27 >> 16 & 0xFF) * n29;
                                n23 += (n27 >> 8 & 0xFF) * n29;
                                n24 += (n27 & 0xFF) * n29;
                            }
                        }
                    }
                    if (n25 >= n13) {
                        int n30 = (n22 / n25 << 16) + (n23 / n25 << 8) + n24 / n25;
                        if (n30 == 0) {
                            n30 = 1;
                        }
                        SpritePixels.ad[n5] = (n30 | 0xFF000000);
                    }
                    ++n5;
                }
            }
            n5 += n6;
        }
    }
    
    public BufferedImage toBufferedImage() {
        final BufferedImage bufferedImage = new BufferedImage(this.getWidth(), this.getHeight(), 2);
        this.toBufferedImage(bufferedImage);
        return bufferedImage;
    }
    
    public void toBufferedImage(final BufferedImage bufferedImage) {
        final int width = this.getWidth();
        final int height = this.getHeight();
        if (bufferedImage.getWidth() != width || bufferedImage.getHeight() != height) {
            throw new IllegalArgumentException("Image bounds do not match SpritePixels");
        }
        final int[] pixels = this.getPixels();
        final int[] rgbArray = new int[pixels.length];
        for (int i = 0; i < pixels.length; ++i) {
            if (pixels[i] != 0) {
                rgbArray[i] = (pixels[i] | 0xFF000000);
            }
        }
        bufferedImage.setRGB(0, 0, width, height, rgbArray, 0, width);
    }
    
    public void toBufferedOutline(final BufferedImage bufferedImage, final int n) {
        final int width = this.getWidth();
        final int height = this.getHeight();
        if (bufferedImage.getWidth() != width || bufferedImage.getHeight() != height) {
            throw new IllegalArgumentException("Image bounds do not match SpritePixels");
        }
        final int[] pixels = this.getPixels();
        final int[] rgbArray = new int[width * height];
        int n2 = 0;
        for (int i = 0; i < height; ++i) {
            for (int j = 0; j < width; ++j) {
                int n3 = pixels[n2];
                if (n3 == 16777215 || n3 == 0) {
                    if (j > 0 && pixels[n2 - 1] != 0) {
                        n3 = n;
                    }
                    else if (i > 0 && pixels[n2 - width] != 0) {
                        n3 = n;
                    }
                    else if (j < width - 1 && pixels[n2 + 1] != 0) {
                        n3 = n;
                    }
                    else if (i < height - 1 && pixels[n2 + width] != 0) {
                        n3 = n;
                    }
                    rgbArray[n2] = n3;
                }
                ++n2;
            }
        }
        bufferedImage.setRGB(0, 0, width, height, rgbArray, 0, width);
    }
    
    public BufferedImage toBufferedOutline(final Color color) {
        final BufferedImage bufferedImage = new BufferedImage(this.getWidth(), this.getHeight(), 2);
        this.toBufferedOutline(bufferedImage, color.getRGB());
        return bufferedImage;
    }
    
    public SpritePixels bj() {
        final SpritePixels spritePixels = new SpritePixels(this.subWidth, this.subHeight);
        spritePixels.width = this.width;
        spritePixels.height = this.height;
        spritePixels.xOffset = this.width - this.subWidth - this.xOffset;
        spritePixels.yOffset = this.yOffset;
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = 0; j < this.subWidth; ++j) {
                spritePixels.pixels[i * this.subWidth + j] = this.pixels[i * this.subWidth + this.subWidth - 1 - j];
            }
        }
        return spritePixels;
    }
    
    public static SpritePixels gm(final SpritePixels spritePixels) {
        if (spritePixels == null) {
            return spritePixels.copyNormalized();
        }
        final SpritePixels spritePixels2 = new SpritePixels(spritePixels.width, spritePixels.height);
        for (int i = 0; i < spritePixels.subHeight; ++i) {
            for (int j = 0; j < spritePixels.subWidth; ++j) {
                spritePixels2.pixels[(i + spritePixels.yOffset) * spritePixels.width + (j + spritePixels.xOffset)] = spritePixels.pixels[i * spritePixels.subWidth + j];
            }
        }
        return spritePixels2;
    }
    
    public void dd(int i, int j, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int[] array, final int[] array2) {
        try {
            final int n7 = -n / 2;
            final int n8 = -n2 / 2;
            final int n9 = (int)(Math.sin(n5 / 326.11) * 65536.0);
            final int n10 = (int)(Math.cos(n5 / 326.11) * 65536.0);
            final int n11 = n9 * n6 >> 8;
            final int n12 = n10 * n6 >> 8;
            int n13 = (n3 << 16) + (n8 * n11 + n7 * n12);
            int n14 = (n4 << 16) + (n8 * n12 - n7 * n11);
            int n15 = i + j * SpritePixels.ae;
            int n16;
            int n17;
            int n18;
            int n19;
            for (j = 0; j < n2; ++j) {
                n16 = array[j];
                n17 = n15 + n16;
                n18 = n13 + n12 * n16;
                n19 = n14 - n11 * n16;
                for (i = -array2[j]; i < 0; ++i) {
                    SpritePixels.ad[n17++] = this.pixels[(n18 >> 16) + (n19 >> 16) * this.subWidth];
                    n18 += n12;
                    n19 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += SpritePixels.ae;
            }
        }
        catch (Exception ex) {}
    }
    
    public void dj(int i, int j, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int[] array, final int[] array2) {
        try {
            final int n7 = -n / 2;
            final int n8 = -n2 / 2;
            final int n9 = (int)(Math.sin(n5 / 326.11) * 65536.0);
            final int n10 = (int)(Math.cos(n5 / 326.11) * 65536.0);
            final int n11 = n9 * n6 >> 8;
            final int n12 = n10 * n6 >> 8;
            int n13 = (n3 << 16) + (n8 * n11 + n7 * n12);
            int n14 = (n4 << 16) + (n8 * n12 - n7 * n11);
            int n15 = i + j * SpritePixels.ae;
            int n16;
            int n17;
            int n18;
            int n19;
            for (j = 0; j < n2; ++j) {
                n16 = array[j];
                n17 = n15 + n16;
                n18 = n13 + n12 * n16;
                n19 = n14 - n11 * n16;
                for (i = -array2[j]; i < 0; ++i) {
                    SpritePixels.ad[n17++] = this.pixels[(n18 >> 16) + (n19 >> 16) * this.subWidth];
                    n18 += n12;
                    n19 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += SpritePixels.ae;
            }
        }
        catch (Exception ex) {}
    }
    
    public static void jx(final SpritePixels spritePixels, final int n) {
        if (spritePixels == null) {
            spritePixels.pad(n);
            return;
        }
        if (spritePixels.subWidth == spritePixels.width && spritePixels.subHeight == spritePixels.height) {
            return;
        }
        int xOffset = n;
        if (xOffset > spritePixels.xOffset) {
            xOffset = spritePixels.xOffset;
        }
        int n2 = n;
        if (n2 + spritePixels.xOffset + spritePixels.subWidth > spritePixels.width) {
            n2 = spritePixels.width - spritePixels.xOffset - spritePixels.subWidth;
        }
        int yOffset = n;
        if (yOffset > spritePixels.yOffset) {
            yOffset = spritePixels.yOffset;
        }
        int n3 = n;
        if (n3 + spritePixels.yOffset + spritePixels.subHeight > spritePixels.height) {
            n3 = spritePixels.height - spritePixels.yOffset - spritePixels.subHeight;
        }
        final int subWidth = spritePixels.subWidth + xOffset + n2;
        final int subHeight = spritePixels.subHeight + yOffset + n3;
        final int[] pixels = new int[subWidth * subHeight];
        for (int i = 0; i < spritePixels.subHeight; ++i) {
            for (int j = 0; j < spritePixels.subWidth; ++j) {
                pixels[(i + yOffset) * subWidth + (j + xOffset)] = spritePixels.pixels[i * spritePixels.subWidth + j];
            }
        }
        spritePixels.pixels = pixels;
        spritePixels.subWidth = subWidth;
        spritePixels.subHeight = subHeight;
        spritePixels.xOffset -= xOffset;
        spritePixels.yOffset -= yOffset;
    }
    
    public static SpritePixels zd(final int n, final int n2) {
        return new SpritePixels(n, n2);
    }
    
    public static void xw(final SpritePixels spritePixels) {
        if (spritePixels == null) {
            spritePixels.flipHorizontally();
            return;
        }
        final int[] pixels = new int[spritePixels.subWidth * spritePixels.subHeight];
        int n = 0;
        for (int i = 0; i < spritePixels.subHeight; ++i) {
            for (int j = spritePixels.subWidth - 1; j >= 0; --j) {
                pixels[n++] = spritePixels.pixels[j + i * spritePixels.subWidth];
            }
        }
        spritePixels.pixels = pixels;
        spritePixels.xOffset = spritePixels.width - spritePixels.subWidth - spritePixels.xOffset;
    }
    
    public void gs(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int[] array, final int[] array2) {
        this.drawRotatedMaskedCenteredAround(n, n2, n3, n4, n5, n6, n7, n8, array, array2);
    }
    
    public void cq(int bk, int bi) {
        bk += this.xOffset;
        bi += this.yOffset;
        int n = bk + bi * SpritePixels.ae;
        int n2 = 0;
        int subHeight = this.subHeight;
        int subWidth = this.subWidth;
        int n3 = SpritePixels.ae - subWidth;
        int n4 = 0;
        if (bi < SpritePixels.bi) {
            final int n5 = SpritePixels.bi - bi;
            subHeight -= n5;
            bi = SpritePixels.bi;
            n2 += n5 * subWidth;
            n += n5 * SpritePixels.ae;
        }
        if (bi + subHeight > SpritePixels.be) {
            subHeight -= bi + subHeight - SpritePixels.be;
        }
        if (bk < SpritePixels.bk) {
            final int n6 = SpritePixels.bk - bk;
            subWidth -= n6;
            bk = SpritePixels.bk;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (bk + subWidth > SpritePixels.bx) {
            final int n7 = bk + subWidth - SpritePixels.bx;
            subWidth -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (subWidth <= 0 || subHeight <= 0) {
            return;
        }
        Sprite_draw(SpritePixels.ad, this.pixels, n2, n, subWidth, subHeight, n3, n4);
    }
    
    public SpritePixels bm() {
        final SpritePixels spritePixels = new SpritePixels(this.subWidth, this.subHeight);
        spritePixels.width = this.width;
        spritePixels.height = this.height;
        spritePixels.xOffset = this.width - this.subWidth - this.xOffset;
        spritePixels.yOffset = this.yOffset;
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = 0; j < this.subWidth; ++j) {
                spritePixels.pixels[i * this.subWidth + j] = this.pixels[i * this.subWidth + this.subWidth - 1 - j];
            }
        }
        return spritePixels;
    }
    
    public void method2621(int i, int j, final int n, final int n2, final int n3, final int n4, final double n5, final int n6) {
        try {
            final int n7 = -n / 2;
            final int n8 = -n2 / 2;
            final int n9 = (int)(Math.sin(n5) * 65536.0);
            final int n10 = (int)(Math.cos(n5) * 65536.0);
            final int n11 = n9 * n6 >> 8;
            final int n12 = n10 * n6 >> 8;
            int n13 = (n3 << 16) + (n8 * n11 + n7 * n12);
            int n14 = (n4 << 16) + (n8 * n12 - n7 * n11);
            int n15 = i + j * SpritePixels.ae;
            int n16;
            int n17;
            int n18;
            int n19;
            for (j = 0; j < n2; ++j) {
                n16 = n15;
                n17 = n13;
                n18 = n14;
                for (i = -n; i < 0; ++i) {
                    n19 = this.pixels[(n17 >> 16) + (n18 >> 16) * this.subWidth];
                    if (n19 != 0) {
                        SpritePixels.ad[n16++] = (n19 | 0xFF000000);
                    }
                    else {
                        ++n16;
                    }
                    n17 += n12;
                    n18 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += SpritePixels.ae;
            }
        }
        catch (Exception ex) {}
    }
    
    public void ez(final int n, final int n2, final int n3, final int n4) {
        if (n3 > this.width || n4 > this.height) {
            throw new IllegalArgumentException();
        }
        int bk = n + this.xOffset * n3 / this.width;
        int bx = n + ((this.xOffset + this.subWidth) * n3 + this.width - 1) / this.width;
        int bi = n2 + this.yOffset * n4 / this.height;
        int be = n2 + ((this.yOffset + this.subHeight) * n4 + this.height - 1) / this.height;
        if (bk < SpritePixels.bk) {
            bk = SpritePixels.bk;
        }
        if (bx > SpritePixels.bx) {
            bx = SpritePixels.bx;
        }
        if (bi < SpritePixels.bi) {
            bi = SpritePixels.bi;
        }
        if (be > SpritePixels.be) {
            be = SpritePixels.be;
        }
        if (bk >= bx || bi >= be) {
            return;
        }
        int n5 = bi * SpritePixels.ae + bk;
        final int n6 = SpritePixels.ae - (bx - bk);
        if (n5 >= SpritePixels.ad.length) {
            return;
        }
        for (int i = bi; i < be; ++i) {
            for (int j = bk; j < bx; ++j) {
                final int n7 = j - n << 4;
                final int n8 = i - n2 << 4;
                int n9 = n7 * this.width / n3 - (this.xOffset << 4);
                int n10 = (n7 + 16) * this.width / n3 - (this.xOffset << 4);
                int n11 = n8 * this.height / n4 - (this.yOffset << 4);
                int n12 = (n8 + 16) * this.height / n4 - (this.yOffset << 4);
                final int n13 = (n10 - n9) * (n12 - n11) >> 1;
                if (n13 != 0) {
                    if (n9 < 0) {
                        n9 = 0;
                    }
                    if (n10 >= this.subWidth << 4) {
                        n10 = this.subWidth << 4;
                    }
                    if (n11 < 0) {
                        n11 = 0;
                    }
                    if (n12 >= this.subHeight << 4) {
                        n12 = this.subHeight << 4;
                    }
                    --n10;
                    --n12;
                    final int n14 = 16 - (n9 & 0xF);
                    final int n15 = (n10 & 0xF) + 1;
                    final int n16 = 16 - (n11 & 0xF);
                    final int n17 = (n12 & 0xF) + 1;
                    final int n18 = n9 >> 4;
                    final int n19 = n10 >> 4;
                    final int n20 = n11 >> 4;
                    final int n21 = n12 >> 4;
                    int n22 = 0;
                    int n23 = 0;
                    int n24 = 0;
                    int n25 = 0;
                    for (int k = n20; k <= n21; ++k) {
                        int n26 = 16;
                        if (k == n20) {
                            n26 = n16;
                        }
                        if (k == n21) {
                            n26 = n17;
                        }
                        for (int l = n18; l <= n19; ++l) {
                            final int n27 = this.pixels[k * this.subWidth + l];
                            if (n27 != 0) {
                                final int n28 = n26;
                                int n29;
                                if (l == n18) {
                                    n29 = n28 * n14;
                                }
                                else if (l == n19) {
                                    n29 = n28 * n15;
                                }
                                else {
                                    n29 = n28 << 4;
                                }
                                n25 += n29;
                                n22 += (n27 >> 16 & 0xFF) * n29;
                                n23 += (n27 >> 8 & 0xFF) * n29;
                                n24 += (n27 & 0xFF) * n29;
                            }
                        }
                    }
                    if (n25 >= n13) {
                        int n30 = (n22 / n25 << 16) + (n23 / n25 << 8) + n24 / n25;
                        if (n30 == 0) {
                            n30 = 1;
                        }
                        SpritePixels.ad[n5] = n30;
                    }
                    ++n5;
                }
            }
            n5 += n6;
        }
    }
    
    public void dq(int i, int j, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int[] array, final int[] array2) {
        try {
            final int n7 = -n / 2;
            final int n8 = -n2 / 2;
            final int n9 = (int)(Math.sin(n5 / 326.11) * 65536.0);
            final int n10 = (int)(Math.cos(n5 / 326.11) * 65536.0);
            final int n11 = n9 * n6 >> 8;
            final int n12 = n10 * n6 >> 8;
            int n13 = (n3 << 16) + (n8 * n11 + n7 * n12);
            int n14 = (n4 << 16) + (n8 * n12 - n7 * n11);
            int n15 = i + j * SpritePixels.ae;
            int n16;
            int n17;
            int n18;
            int n19;
            for (j = 0; j < n2; ++j) {
                n16 = array[j];
                n17 = n15 + n16;
                n18 = n13 + n12 * n16;
                n19 = n14 - n11 * n16;
                for (i = -array2[j]; i < 0; ++i) {
                    SpritePixels.ad[n17++] = this.pixels[(n18 >> 16) + (n19 >> 16) * this.subWidth];
                    n18 += n12;
                    n19 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += SpritePixels.ae;
            }
        }
        catch (Exception ex) {}
    }
    
    static void Sprite_drawScaled(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        final int n11 = n2;
        for (int i = -n7; i < 0; ++i) {
            final int n12 = (n3 >> 16) * n10;
            for (int j = -n6; j < 0; ++j) {
                n = array2[(n2 >> 16) + n12];
                if (n != 0) {
                    array[n4++] = (n | 0xFF000000);
                }
                else {
                    ++n4;
                }
                n2 += n8;
            }
            n3 += n9;
            n2 = n11;
            n4 += n5;
        }
    }
    
    public SpritePixels bf() {
        final SpritePixels spritePixels = new SpritePixels(this.width, this.height);
        for (int i = 0; i < this.subHeight; ++i) {
            for (int j = 0; j < this.subWidth; ++j) {
                spritePixels.pixels[(i + this.yOffset) * this.width + (j + this.xOffset)] = this.pixels[i * this.subWidth + j];
            }
        }
        return spritePixels;
    }
    
    public void du(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int[] array, final int[] array2) {
        final int n7 = (n2 < 0) ? (-n2) : 0;
        final int n8 = (n2 + this.subHeight <= n6) ? this.subHeight : (n6 - n2);
        final int n9 = (n < 0) ? (-n) : 0;
        if (n + this.subWidth <= n5) {
            final int subWidth = this.subWidth;
        }
        int n10 = n3 + n + n9 + (n4 + n2 + n7) * SpritePixels.ae;
        int n11 = n2 + n7;
        for (int i = n7; i < n8; ++i) {
            final int n12 = array[n11];
            final int n13 = array2[n11++];
            int n14 = n10;
            int n15;
            if (n < n12) {
                n15 = n12 - n;
                n14 += n15 - n9;
            }
            else {
                n15 = n9;
            }
            int subWidth2;
            if (n + this.subWidth <= n12 + n13) {
                subWidth2 = this.subWidth;
            }
            else {
                subWidth2 = n12 + n13 - n;
            }
            for (int j = n15; j < subWidth2; ++j) {
                final int n16 = this.pixels[j + i * this.subWidth];
                if (n16 != 0) {
                    SpritePixels.ad[n14++] = n16;
                }
                else {
                    ++n14;
                }
            }
            n10 += SpritePixels.ae;
        }
    }
    
    public void setMaxHeight(final int height) {
        this.height = height;
    }
    
    public void setMaxWidth(final int width) {
        this.width = width;
    }
    
    public int getOffsetY() {
        return this.yOffset;
    }
    
    public int getOffsetX() {
        return this.xOffset;
    }
    
    public int getMaxHeight() {
        return this.height;
    }
    
    public int getMaxWidth() {
        return this.width;
    }
    
    public void drawAt(final int n, final int n2) {
        this.drawAt(n, n2);
    }
}
