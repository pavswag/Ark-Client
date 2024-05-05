import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public final class IndexedSprite extends Rasterizer2D implements net.runelite.api.IndexedSprite
{
    public int subHeight;
    public int[] palette;
    public int yOffset;
    public int subWidth;
    public byte[] pixels;
    public int xOffset;
    public int width;
    public int height;
    
    IndexedSprite() {
    }
    
    public void ao(int bk, int bi) {
        bk += this.height;
        bi += this.xOffset;
        int n = bk + bi * IndexedSprite.ae;
        int n2 = 0;
        int subWidth = this.subWidth;
        int yOffset = this.yOffset;
        int n3 = IndexedSprite.ae - yOffset;
        int n4 = 0;
        if (bi < IndexedSprite.bi) {
            final int n5 = IndexedSprite.bi - bi;
            subWidth -= n5;
            bi = IndexedSprite.bi;
            n2 += n5 * yOffset;
            n += n5 * IndexedSprite.ae;
        }
        if (bi + subWidth > IndexedSprite.be) {
            subWidth -= bi + subWidth - IndexedSprite.be;
        }
        if (bk < IndexedSprite.bk) {
            final int n6 = IndexedSprite.bk - bk;
            yOffset -= n6;
            bk = IndexedSprite.bk;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (bk + yOffset > IndexedSprite.bx) {
            final int n7 = bk + yOffset - IndexedSprite.bx;
            yOffset -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (yOffset > 0 && subWidth > 0) {
            IndexedSprite_two(IndexedSprite.ad, this.pixels, this.palette, n2, n, yOffset, subWidth, n3, n4);
        }
    }
    
    public static void mh(final BufferedFile bufferedFile, final byte[] array) throws IOException {
        if (bufferedFile == null) {
            bufferedFile.az();
        }
        bufferedFile.read(array, 0, array.length, -1865691760);
    }
    
    static void ak(final int[] array, final byte[] array2, final int[] array3, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        final int n10 = n;
        for (int i = -n6; i < 0; ++i) {
            final int n11 = (n2 >> 16) * n9;
            for (int j = -n5; j < 0; ++j) {
                final byte b = array2[(n >> 16) + n11];
                if (b != 0) {
                    array[n3++] = array3[b & 0x6B19C089];
                }
                else {
                    ++n3;
                }
                n += n7;
            }
            n2 += n8;
            n = n10;
            n3 += n4;
        }
    }
    
    static void av(final int[] array, final byte[] array2, final int[] array3, int n, int n2, int n3, final int n4, final int n5, final int n6) {
        final int n7 = -(n3 >> 2);
        n3 = -(n3 & 0x3);
        for (int i = -n4; i < 0; ++i) {
            for (int j = n7; j < 0; ++j) {
                final byte b = array2[n++];
                if (b != 0) {
                    array[n2++] = array3[b & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b2 = array2[n++];
                if (b2 != 0) {
                    array[n2++] = array3[b2 & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b3 = array2[n++];
                if (b3 != 0) {
                    array[n2++] = array3[b3 & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b4 = array2[n++];
                if (b4 != 0) {
                    array[n2++] = array3[b4 & 0xFF];
                }
                else {
                    ++n2;
                }
            }
            for (int k = n3; k < 0; ++k) {
                final byte b5 = array2[n++];
                if (b5 != 0) {
                    array[n2++] = array3[b5 & 0xFF];
                }
                else {
                    ++n2;
                }
            }
            n2 += n5;
            n += n6;
        }
    }
    
    static void as(final int[] array, final byte[] array2, final int[] array3, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        final int n10 = n;
        for (int i = -n6; i < 0; ++i) {
            final int n11 = (n2 >> 16) * n9;
            for (int j = -n5; j < 0; ++j) {
                final byte b = array2[(n >> 16) + n11];
                if (b != 0) {
                    array[n3++] = array3[b & 0xFF];
                }
                else {
                    ++n3;
                }
                n += n7;
            }
            n2 += n8;
            n = n10;
            n3 += n4;
        }
    }
    
    public void ax(int bk, int bi) {
        bk += this.height;
        bi += this.xOffset;
        int n = bk + bi * IndexedSprite.ae;
        int n2 = 0;
        int subWidth = this.subWidth;
        int yOffset = this.yOffset;
        int n3 = IndexedSprite.ae - yOffset;
        int n4 = 0;
        if (bi < IndexedSprite.bi) {
            final int n5 = IndexedSprite.bi - bi;
            subWidth -= n5;
            bi = IndexedSprite.bi;
            n2 += n5 * yOffset;
            n += n5 * IndexedSprite.ae;
        }
        if (bi + subWidth > IndexedSprite.be) {
            subWidth -= bi + subWidth - IndexedSprite.be;
        }
        if (bk < IndexedSprite.bk) {
            final int n6 = IndexedSprite.bk - bk;
            yOffset -= n6;
            bk = IndexedSprite.bk;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (bk + yOffset > IndexedSprite.bx) {
            final int n7 = bk + yOffset - IndexedSprite.bx;
            yOffset -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (yOffset <= 0 || subWidth <= 0) {
            return;
        }
        IndexedSprite_two(IndexedSprite.ad, this.pixels, this.palette, n2, n, yOffset, subWidth, n3, n4);
    }
    
    public void ay(int bk, int bi) {
        bk += this.height;
        bi += this.xOffset;
        int n = bk + bi * IndexedSprite.ae;
        int n2 = 0;
        int subWidth = this.subWidth;
        int yOffset = this.yOffset;
        int n3 = IndexedSprite.ae - yOffset;
        int n4 = 0;
        if (bi < IndexedSprite.bi) {
            final int n5 = IndexedSprite.bi - bi;
            subWidth -= n5;
            bi = IndexedSprite.bi;
            n2 += n5 * yOffset;
            n += n5 * IndexedSprite.ae;
        }
        if (bi + subWidth > IndexedSprite.be) {
            subWidth -= bi + subWidth - IndexedSprite.be;
        }
        if (bk < IndexedSprite.bk) {
            final int n6 = IndexedSprite.bk - bk;
            yOffset -= n6;
            bk = IndexedSprite.bk;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (bk + yOffset > IndexedSprite.bx) {
            final int n7 = bk + yOffset - IndexedSprite.bx;
            yOffset -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (yOffset <= 0 || subWidth <= 0) {
            return;
        }
        IndexedSprite_two(IndexedSprite.ad, this.pixels, this.palette, n2, n, yOffset, subWidth, n3, n4);
    }
    
    public void drawAt(int bk, int bi) {
        bk += this.height;
        bi += this.xOffset;
        int n = bk + bi * IndexedSprite.ae;
        int n2 = 0;
        int subWidth = this.subWidth;
        int yOffset = this.yOffset;
        int n3 = IndexedSprite.ae - yOffset;
        int n4 = 0;
        if (bi < IndexedSprite.bi) {
            final int n5 = IndexedSprite.bi - bi;
            subWidth -= n5;
            bi = IndexedSprite.bi;
            n2 += n5 * yOffset;
            n += n5 * IndexedSprite.ae;
        }
        if (bi + subWidth > IndexedSprite.be) {
            subWidth -= bi + subWidth - IndexedSprite.be;
        }
        if (bk < IndexedSprite.bk) {
            final int n6 = IndexedSprite.bk - bk;
            yOffset -= n6;
            bk = IndexedSprite.bk;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (bk + yOffset > IndexedSprite.bx) {
            final int n7 = bk + yOffset - IndexedSprite.bx;
            yOffset -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (yOffset > 0 && subWidth > 0) {
            IndexedSprite_two(IndexedSprite.ad, this.pixels, this.palette, n2, n, yOffset, subWidth, n3, n4);
        }
    }
    
    public void am(int n, int n2, int n3, int n4) {
        final int yOffset = this.yOffset;
        final int subWidth = this.subWidth;
        int n5 = 0;
        int n6 = 0;
        final int subHeight = this.subHeight;
        final int width = this.width;
        final int n7 = (subHeight << 16) / n3;
        final int n8 = (width << 16) / n4;
        if (this.height > 0) {
            final int n9 = ((this.height << 16) + n7 - 1) / n7;
            n += n9;
            n5 += n9 * n7 - (this.height << 16);
        }
        if (this.xOffset > 0) {
            final int n10 = ((this.xOffset << 16) + n8 - 1) / n8;
            n2 += n10;
            n6 += n10 * n8 - (this.xOffset << 16);
        }
        if (yOffset < subHeight) {
            n3 = ((yOffset << 16) - n5 + n7 - 1) / n7;
        }
        if (subWidth < width) {
            n4 = ((subWidth << 16) - n6 + n8 - 1) / n8;
        }
        int n11 = n + n2 * IndexedSprite.ae;
        int n12 = IndexedSprite.ae - n3;
        if (n2 + n4 > IndexedSprite.be) {
            n4 -= n2 + n4 - IndexedSprite.be;
        }
        if (n2 < IndexedSprite.bi) {
            final int n13 = IndexedSprite.bi - n2;
            n4 -= n13;
            n11 += n13 * IndexedSprite.ae;
            n6 += n8 * n13;
        }
        if (n + n3 > IndexedSprite.bx) {
            final int n14 = n + n3 - IndexedSprite.bx;
            n3 -= n14;
            n12 += n14;
        }
        if (n < IndexedSprite.bk) {
            final int n15 = IndexedSprite.bk - n;
            n3 -= n15;
            n11 += n15;
            n5 += n7 * n15;
            n12 += n15;
        }
        IndexedSprite_something(IndexedSprite.ad, this.pixels, this.palette, n5, n6, n11, n12, n3, n4, n7, n8, yOffset);
    }
    
    public void shiftColors(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.palette.length; ++i) {
            int n4 = (this.palette[i] >> 16 & 0xFF) + n;
            if (n4 < 0) {
                n4 = 0;
            }
            else if (n4 > 255) {
                n4 = 255;
            }
            int n5 = (this.palette[i] >> 8 & 0xFF) + n2;
            if (n5 < 0) {
                n5 = 0;
            }
            else if (n5 > 255) {
                n5 = 255;
            }
            int n6 = (this.palette[i] & 0xFF) + n3;
            if (n6 < 0) {
                n6 = 0;
            }
            else if (n6 > 255) {
                n6 = 255;
            }
            this.palette[i] = (n4 << 16) + (n5 << 8) + n6;
        }
    }
    
    static void IndexedSprite_two(final int[] array, final byte[] array2, final int[] array3, int n, int n2, int n3, final int n4, final int n5, final int n6) {
        final int n7 = -(n3 >> 2);
        n3 = -(n3 & 0x3);
        for (int i = -n4; i < 0; ++i) {
            for (int j = n7; j < 0; ++j) {
                final byte b = array2[n++];
                if (b != 0) {
                    array[n2++] = (array3[b & 0xFF] | 0xFF000000);
                }
                else {
                    ++n2;
                }
                final byte b2 = array2[n++];
                if (b2 != 0) {
                    array[n2++] = (array3[b2 & 0xFF] | 0xFF000000);
                }
                else {
                    ++n2;
                }
                final byte b3 = array2[n++];
                if (b3 != 0) {
                    array[n2++] = (array3[b3 & 0xFF] | 0xFF000000);
                }
                else {
                    ++n2;
                }
                final byte b4 = array2[n++];
                if (b4 != 0) {
                    array[n2++] = (array3[b4 & 0xFF] | 0xFF000000);
                }
                else {
                    ++n2;
                }
            }
            for (int k = n3; k < 0; ++k) {
                final byte b5 = array2[n++];
                if (b5 != 0) {
                    array[n2++] = (array3[b5 & 0xFF] | 0xFF000000);
                }
                else {
                    ++n2;
                }
            }
            n2 += n5;
            n += n6;
        }
    }
    
    public void nx(final int n, final int n2, final int n3, final int n4) {
        this.method2596(n, n2, n3, n4);
    }
    
    public void method2596(int n, int n2, int n3, int n4) {
        final int yOffset = this.yOffset;
        final int subWidth = this.subWidth;
        int n5 = 0;
        int n6 = 0;
        final int subHeight = this.subHeight;
        final int width = this.width;
        final int n7 = (subHeight << 16) / n3;
        final int n8 = (width << 16) / n4;
        if (this.height > 0) {
            final int n9 = ((this.height << 16) + n7 - 1) / n7;
            n += n9;
            n5 += n9 * n7 - (this.height << 16);
        }
        if (this.xOffset > 0) {
            final int n10 = ((this.xOffset << 16) + n8 - 1) / n8;
            n2 += n10;
            n6 += n10 * n8 - (this.xOffset << 16);
        }
        if (yOffset < subHeight) {
            n3 = ((yOffset << 16) - n5 + n7 - 1) / n7;
        }
        if (subWidth < width) {
            n4 = ((subWidth << 16) - n6 + n8 - 1) / n8;
        }
        int n11 = n + n2 * IndexedSprite.ae;
        int n12 = IndexedSprite.ae - n3;
        if (n2 + n4 > IndexedSprite.be) {
            n4 -= n2 + n4 - IndexedSprite.be;
        }
        if (n2 < IndexedSprite.bi) {
            final int n13 = IndexedSprite.bi - n2;
            n4 -= n13;
            n11 += n13 * IndexedSprite.ae;
            n6 += n8 * n13;
        }
        if (n + n3 > IndexedSprite.bx) {
            final int n14 = n + n3 - IndexedSprite.bx;
            n3 -= n14;
            n12 += n14;
        }
        if (n < IndexedSprite.bk) {
            final int n15 = IndexedSprite.bk - n;
            n3 -= n15;
            n11 += n15;
            n5 += n7 * n15;
            n12 += n15;
        }
        IndexedSprite_something(IndexedSprite.ad, this.pixels, this.palette, n5, n6, n11, n12, n3, n4, n7, n8, yOffset);
    }
    
    public void aa(int bk, int bi) {
        bk += this.height;
        bi += this.xOffset;
        int n = bk + bi * IndexedSprite.ae;
        int n2 = 0;
        int subWidth = this.subWidth;
        int yOffset = this.yOffset;
        int n3 = IndexedSprite.ae - yOffset;
        int n4 = 0;
        if (bi < IndexedSprite.bi) {
            final int n5 = IndexedSprite.bi - bi;
            subWidth -= n5;
            bi = IndexedSprite.bi;
            n2 += n5 * yOffset;
            n += n5 * IndexedSprite.ae;
        }
        if (bi + subWidth > IndexedSprite.be) {
            subWidth -= bi + subWidth - IndexedSprite.be;
        }
        if (bk < IndexedSprite.bk) {
            final int n6 = IndexedSprite.bk - bk;
            yOffset -= n6;
            bk = IndexedSprite.bk;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (bk + yOffset > IndexedSprite.bx) {
            final int n7 = bk + yOffset - IndexedSprite.bx;
            yOffset -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (yOffset > 0 && subWidth > 0) {
            IndexedSprite_two(IndexedSprite.ad, this.pixels, this.palette, n2, n, yOffset, subWidth, n3, n4);
        }
    }
    
    static void ai(final int[] array, final byte[] array2, final int[] array3, int n, int n2, int n3, final int n4, final int n5, final int n6) {
        final int n7 = -(n3 >> 2);
        n3 = -(n3 & 0x3);
        for (int i = -n4; i < 0; ++i) {
            for (int j = n7; j < 0; ++j) {
                final byte b = array2[n++];
                if (b != 0) {
                    array[n2++] = array3[b & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b2 = array2[n++];
                if (b2 != 0) {
                    array[n2++] = array3[b2 & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b3 = array2[n++];
                if (b3 != 0) {
                    array[n2++] = array3[b3 & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b4 = array2[n++];
                if (b4 != 0) {
                    array[n2++] = array3[b4 & 0xFF];
                }
                else {
                    ++n2;
                }
            }
            for (int k = n3; k < 0; ++k) {
                final byte b5 = array2[n++];
                if (b5 != 0) {
                    array[n2++] = array3[b5 & 0xFF];
                }
                else {
                    ++n2;
                }
            }
            n2 += n5;
            n += n6;
        }
    }
    
    public int getWidth() {
        return this.yOffset;
    }
    
    public byte[] getPixels() {
        return this.pixels;
    }
    
    public void setPixels(final byte[] pixels) {
        this.pixels = pixels;
    }
    
    public void ar(int n, int n2, int n3, int n4) {
        final int yOffset = this.yOffset;
        final int subWidth = this.subWidth;
        int n5 = 0;
        int n6 = 0;
        final int subHeight = this.subHeight;
        final int width = this.width;
        final int n7 = (subHeight << 16) / n3;
        final int n8 = (width << 16) / n4;
        if (this.height > 0) {
            final int n9 = ((this.height << 16) + n7 - 1) / n7;
            n += n9;
            n5 += n9 * n7 - (this.height << 16);
        }
        if (this.xOffset > 0) {
            final int n10 = ((this.xOffset << 16) + n8 - 1) / n8;
            n2 += n10;
            n6 += n10 * n8 - (this.xOffset << 16);
        }
        if (yOffset < subHeight) {
            n3 = ((yOffset << 16) - n5 + n7 - 1) / n7;
        }
        if (subWidth < width) {
            n4 = ((subWidth << 16) - n6 + n8 - 1) / n8;
        }
        int n11 = n + n2 * IndexedSprite.ae;
        int n12 = IndexedSprite.ae - n3;
        if (n2 + n4 > IndexedSprite.be) {
            n4 -= n2 + n4 - IndexedSprite.be;
        }
        if (n2 < IndexedSprite.bi) {
            final int n13 = IndexedSprite.bi - n2;
            n4 -= n13;
            n11 += n13 * IndexedSprite.ae;
            n6 += n8 * n13;
        }
        if (n + n3 > IndexedSprite.bx) {
            final int n14 = n + n3 - IndexedSprite.bx;
            n3 -= n14;
            n12 += n14;
        }
        if (n < IndexedSprite.bk) {
            final int n15 = IndexedSprite.bk - n;
            n3 -= n15;
            n11 += n15;
            n5 += n7 * n15;
            n12 += n15;
        }
        IndexedSprite_something(IndexedSprite.ad, this.pixels, this.palette, n5, n6, n11, n12, n3, n4, n7, n8, yOffset);
    }
    
    public void setWidth(final int yOffset) {
        this.yOffset = yOffset;
    }
    
    public void normalize() {
        if (this.yOffset == this.subHeight && this.subWidth == this.width) {
            return;
        }
        final byte[] pixels = new byte[this.subHeight * this.width];
        int n = 0;
        for (int i = 0; i < this.subWidth; ++i) {
            for (int j = 0; j < this.yOffset; ++j) {
                pixels[j + this.height + (i + this.xOffset) * this.subHeight] = this.pixels[n++];
            }
        }
        this.pixels = pixels;
        this.yOffset = this.subHeight;
        this.subWidth = this.width;
        this.height = 0;
        this.xOffset = 0;
    }
    
    static void IndexedSprite_something(final int[] array, final byte[] array2, final int[] array3, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        final int n10 = n;
        for (int i = -n6; i < 0; ++i) {
            final int n11 = (n2 >> 16) * n9;
            for (int j = -n5; j < 0; ++j) {
                final byte b = array2[(n >> 16) + n11];
                if (b != 0) {
                    array[n3++] = (array3[b & 0xFF] | 0xFF000000);
                }
                else {
                    ++n3;
                }
                n += n7;
            }
            n2 += n8;
            n = n10;
            n3 += n4;
        }
    }
    
    public void aq() {
        if (this.yOffset == this.subHeight && this.subWidth == this.width) {
            return;
        }
        final byte[] pixels = new byte[this.subHeight * this.width];
        int n = 0;
        for (int i = 0; i < this.subWidth; ++i) {
            for (int j = 0; j < this.yOffset; ++j) {
                pixels[j + this.height + (i + this.xOffset) * this.subHeight] = this.pixels[n++];
            }
        }
        this.pixels = pixels;
        this.yOffset = this.subHeight;
        this.subWidth = this.width;
        this.height = 0;
        this.xOffset = 0;
    }
    
    static void aj(final int[] array, final byte[] array2, final int[] array3, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        final int n10 = n;
        for (int i = -n6; i < 0; ++i) {
            final int n11 = (n2 >> 16) * n9;
            for (int j = -n5; j < 0; ++j) {
                final byte b = array2[(n >> 16) + n11];
                if (b != 0) {
                    array[n3++] = array3[b & 0xFF];
                }
                else {
                    ++n3;
                }
                n += n7;
            }
            n2 += n8;
            n = n10;
            n3 += n4;
        }
    }
    
    static void ag(final int[] array, final byte[] array2, final int[] array3, int n, int n2, int n3, final int n4, final int n5, final int n6) {
        final int n7 = -(n3 >> 2);
        n3 = -(n3 & 0x3);
        for (int i = -n4; i < 0; ++i) {
            for (int j = n7; j < 0; ++j) {
                final byte b = array2[n++];
                if (b != 0) {
                    array[n2++] = array3[b & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b2 = array2[n++];
                if (b2 != 0) {
                    array[n2++] = array3[b2 & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b3 = array2[n++];
                if (b3 != 0) {
                    array[n2++] = array3[b3 & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b4 = array2[n++];
                if (b4 != 0) {
                    array[n2++] = array3[b4 & 0xFF];
                }
                else {
                    ++n2;
                }
            }
            for (int k = n3; k < 0; ++k) {
                final byte b5 = array2[n++];
                if (b5 != 0) {
                    array[n2++] = array3[b5 & 0xFF];
                }
                else {
                    ++n2;
                }
            }
            n2 += n5;
            n += n6;
        }
    }
    
    public void setOriginalHeight(final int width) {
        this.width = width;
    }
    
    public void setPalette(final int[] palette) {
        this.palette = palette;
    }
    
    public void setOffsetX(final int height) {
        this.height = height;
    }
    
    public void setOriginalWidth(final int subHeight) {
        this.subHeight = subHeight;
    }
    
    public void setOffsetY(final int xOffset) {
        this.xOffset = xOffset;
    }
    
    public void setHeight(final int subWidth) {
        this.subWidth = subWidth;
    }
    
    public int getHeight() {
        return this.subWidth;
    }
    
    public static void yx(final IndexedSprite indexedSprite) {
        if (indexedSprite.yOffset == indexedSprite.subHeight && indexedSprite.subWidth == indexedSprite.width) {
            return;
        }
        final byte[] pixels = new byte[indexedSprite.subHeight * indexedSprite.width];
        int n = 0;
        for (int i = 0; i < indexedSprite.subWidth; ++i) {
            for (int j = 0; j < indexedSprite.yOffset; ++j) {
                pixels[j + indexedSprite.height + (i + indexedSprite.xOffset) * indexedSprite.subHeight] = indexedSprite.pixels[n++];
            }
        }
        indexedSprite.pixels = pixels;
        indexedSprite.yOffset = indexedSprite.subHeight;
        indexedSprite.subWidth = indexedSprite.width;
        indexedSprite.height = 0;
        indexedSprite.xOffset = 0;
    }
    
    public int getOriginalHeight() {
        return this.width;
    }
    
    public int getOriginalWidth() {
        return this.subHeight;
    }
    
    public static void jg(final IndexedSprite indexedSprite) {
        if (indexedSprite.yOffset == indexedSprite.subHeight && indexedSprite.subWidth == indexedSprite.width) {
            return;
        }
        final byte[] pixels = new byte[indexedSprite.subHeight * indexedSprite.width];
        int n = 0;
        for (int i = 0; i < indexedSprite.subWidth; ++i) {
            for (int j = 0; j < indexedSprite.yOffset; ++j) {
                pixels[j + indexedSprite.height + (i + indexedSprite.xOffset) * indexedSprite.subHeight] = indexedSprite.pixels[n++];
            }
        }
        indexedSprite.pixels = pixels;
        indexedSprite.yOffset = indexedSprite.subHeight;
        indexedSprite.subWidth = indexedSprite.width;
        indexedSprite.height = 0;
        indexedSprite.xOffset = 0;
    }
    
    static void ah(final int[] array, final byte[] array2, final int[] array3, int n, int n2, int n3, final int n4, final int n5, final int n6) {
        final int n7 = -(n3 >> 2);
        n3 = -(n3 & 0x3);
        for (int i = -n4; i < 0; ++i) {
            for (int j = n7; j < 0; ++j) {
                final byte b = array2[n++];
                if (b != 0) {
                    array[n2++] = array3[b & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b2 = array2[n++];
                if (b2 != 0) {
                    array[n2++] = array3[b2 & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b3 = array2[n++];
                if (b3 != 0) {
                    array[n2++] = array3[b3 & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b4 = array2[n++];
                if (b4 != 0) {
                    array[n2++] = array3[b4 & 0xFF];
                }
                else {
                    ++n2;
                }
            }
            for (int k = n3; k < 0; ++k) {
                final byte b5 = array2[n++];
                if (b5 != 0) {
                    array[n2++] = array3[b5 & 0xFF];
                }
                else {
                    ++n2;
                }
            }
            n2 += n5;
            n += n6;
        }
    }
    
    public static void ik(final IndexedSprite indexedSprite, final int n, final int n2, final int n3) {
        if (indexedSprite == null) {
            indexedSprite.shiftColors(n, n, n);
            return;
        }
        for (int i = 0; i < indexedSprite.palette.length; ++i) {
            int n4 = (indexedSprite.palette[i] >> 16 & 0xFF) + n;
            if (n4 < 0) {
                n4 = 0;
            }
            else if (n4 > 255) {
                n4 = 255;
            }
            int n5 = (indexedSprite.palette[i] >> 8 & 0xFF) + n2;
            if (n5 < 0) {
                n5 = 0;
            }
            else if (n5 > 255) {
                n5 = 255;
            }
            int n6 = (indexedSprite.palette[i] & 0xFF) + n3;
            if (n6 < 0) {
                n6 = 0;
            }
            else if (n6 > 255) {
                n6 = 255;
            }
            indexedSprite.palette[i] = (n4 << 16) + (n5 << 8) + n6;
        }
    }
    
    public int getOffsetY() {
        return this.xOffset;
    }
    
    public int getOffsetX() {
        return this.height;
    }
    
    public int[] getPalette() {
        return this.palette;
    }
}
