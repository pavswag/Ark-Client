// 
// Decompiled by Procyon v0.5.36
// 

public final class Font extends AbstractFont
{
    public Font(final byte[] array, final int[] array2, final int[] array3, final int[] array4, final int[] array5, final int[] array6, final byte[][] array7) {
        super(array, array2, array3, array4, array5, array6, array7);
    }
    
    public Font(final byte[] array) {
        super(array);
    }
    
    @Override
    final void aw(final byte[] array, int bk, int bi, int n, int n2, final int n3) {
        int n4 = bk + bi * Font.ae;
        int n5 = Font.ae - n;
        int n6 = 0;
        int n7 = 0;
        if (bi < Font.bi) {
            final int n8 = Font.bi - bi;
            n2 -= n8;
            bi = Font.bi;
            n7 += n8 * n;
            n4 += n8 * Font.ae;
        }
        if (bi + n2 > Font.be) {
            n2 -= bi + n2 - Font.be;
        }
        if (bk < Font.bk) {
            final int n9 = Font.bk - bk;
            n -= n9;
            bk = Font.bk;
            n7 += n9;
            n4 += n9;
            n6 += n9;
            n5 += n9;
        }
        if (bk + n > Font.bx) {
            final int n10 = bk + n - Font.bx;
            n -= n10;
            n6 += n10;
            n5 += n10;
        }
        if (n > 0 && n2 > 0) {
            bm(Font.ad, array, n3, n7, n4, n, n2, n5, n6);
        }
    }
    
    @Override
    final void al(final byte[] array, int bk, int bi, int n, int n2, final int n3, final int n4) {
        int n5 = bk + bi * Font.ae;
        int n6 = Font.ae - n;
        int n7 = 0;
        int n8 = 0;
        if (bi < Font.bi) {
            final int n9 = Font.bi - bi;
            n2 -= n9;
            bi = Font.bi;
            n8 += n9 * n;
            n5 += n9 * Font.ae;
        }
        if (bi + n2 > Font.be) {
            n2 -= bi + n2 - Font.be;
        }
        if (bk < Font.bk) {
            final int n10 = Font.bk - bk;
            n -= n10;
            bk = Font.bk;
            n8 += n10;
            n5 += n10;
            n7 += n10;
            n6 += n10;
        }
        if (bk + n > Font.bx) {
            final int n11 = bk + n - Font.bx;
            n -= n11;
            n7 += n11;
            n6 += n11;
        }
        if (n > 0 && n2 > 0) {
            bt(Font.ad, array, n3, n8, n5, n, n2, n6, n7, n4);
        }
    }
    
    @Override
    final void drawGlyphAlpha(final byte[] array, int bk, int bi, int n, int n2, final int n3, final int n4) {
        int n5 = bk + bi * Font.ae;
        int n6 = Font.ae - n;
        int n7 = 0;
        int n8 = 0;
        if (bi < Font.bi) {
            final int n9 = Font.bi - bi;
            n2 -= n9;
            bi = Font.bi;
            n8 += n9 * n;
            n5 += n9 * Font.ae;
        }
        if (bi + n2 > Font.be) {
            n2 -= bi + n2 - Font.be;
        }
        if (bk < Font.bk) {
            final int n10 = Font.bk - bk;
            n -= n10;
            bk = Font.bk;
            n8 += n10;
            n5 += n10;
            n7 += n10;
            n6 += n10;
        }
        if (bk + n > Font.bx) {
            final int n11 = bk + n - Font.bx;
            n -= n11;
            n7 += n11;
            n6 += n11;
        }
        if (n <= 0 || n2 <= 0) {
            return;
        }
        bt(Font.ad, array, n3, n8, n5, n, n2, n6, n7, n4);
    }
    
    @Override
    final void ac(final byte[] array, int bk, int bi, int n, int n2, final int n3) {
        int n4 = bk + bi * Font.ae;
        int n5 = Font.ae - n;
        int n6 = 0;
        int n7 = 0;
        if (bi < Font.bi) {
            final int n8 = Font.bi - bi;
            n2 -= n8;
            bi = Font.bi;
            n7 += n8 * n;
            n4 += n8 * Font.ae;
        }
        if (bi + n2 > Font.be) {
            n2 -= bi + n2 - Font.be;
        }
        if (bk < Font.bk) {
            final int n9 = Font.bk - bk;
            n -= n9;
            bk = Font.bk;
            n7 += n9;
            n4 += n9;
            n6 += n9;
            n5 += n9;
        }
        if (bk + n > Font.bx) {
            final int n10 = bk + n - Font.bx;
            n -= n10;
            n6 += n10;
            n5 += n10;
        }
        if (n <= 0 || n2 <= 0) {
            return;
        }
        bm(Font.ad, array, n3, n7, n4, n, n2, n5, n6);
    }
    
    @Override
    final void au(final byte[] array, int bk, int bi, int n, int n2, final int n3) {
        int n4 = bk + bi * Font.ae;
        int n5 = Font.ae - n;
        int n6 = 0;
        int n7 = 0;
        if (bi < Font.bi) {
            final int n8 = Font.bi - bi;
            n2 -= n8;
            bi = Font.bi;
            n7 += n8 * n;
            n4 += n8 * Font.ae;
        }
        if (bi + n2 > Font.be) {
            n2 -= bi + n2 - Font.be;
        }
        if (bk < Font.bk) {
            final int n9 = Font.bk - bk;
            n -= n9;
            bk = Font.bk;
            n7 += n9;
            n4 += n9;
            n6 += n9;
            n5 += n9;
        }
        if (bk + n > Font.bx) {
            final int n10 = bk + n - Font.bx;
            n -= n10;
            n6 += n10;
            n5 += n10;
        }
        if (n > 0 && n2 > 0) {
            bm(Font.ad, array, n3, n7, n4, n, n2, n5, n6);
        }
    }
    
    @Override
    final void drawGlyph(final byte[] array, int bk, int bi, int n, int n2, final int n3) {
        int n4 = bk + bi * Font.ae;
        int n5 = Font.ae - n;
        int n6 = 0;
        int n7 = 0;
        if (bi < Font.bi) {
            final int n8 = Font.bi - bi;
            n2 -= n8;
            bi = Font.bi;
            n7 += n8 * n;
            n4 += n8 * Font.ae;
        }
        if (bi + n2 > Font.be) {
            n2 -= bi + n2 - Font.be;
        }
        if (bk < Font.bk) {
            final int n9 = Font.bk - bk;
            n -= n9;
            bk = Font.bk;
            n7 += n9;
            n4 += n9;
            n6 += n9;
            n5 += n9;
        }
        if (bk + n > Font.bx) {
            final int n10 = bk + n - Font.bx;
            n -= n10;
            n6 += n10;
            n5 += n10;
        }
        if (n > 0 && n2 > 0) {
            bm(Font.ad, array, n3, n7, n4, n, n2, n5, n6);
        }
    }
    
    @Override
    final void ab(final byte[] array, int bk, int bi, int n, int n2, final int n3, final int n4) {
        int n5 = bk + bi * Font.ae;
        int n6 = Font.ae - n;
        int n7 = 0;
        int n8 = 0;
        if (bi < Font.bi) {
            final int n9 = Font.bi - bi;
            n2 -= n9;
            bi = Font.bi;
            n8 += n9 * n;
            n5 += n9 * Font.ae;
        }
        if (bi + n2 > Font.be) {
            n2 -= bi + n2 - Font.be;
        }
        if (bk < Font.bk) {
            final int n10 = Font.bk - bk;
            n -= n10;
            bk = Font.bk;
            n8 += n10;
            n5 += n10;
            n7 += n10;
            n6 += n10;
        }
        if (bk + n > Font.bx) {
            final int n11 = bk + n - Font.bx;
            n -= n11;
            n7 += n11;
            n6 += n11;
        }
        if (n > 0 && n2 > 0) {
            bt(Font.ad, array, n3, n8, n5, n, n2, n6, n7, n4);
        }
    }
    
    @Override
    final void aq(final byte[] array, int bk, int bi, int n, int n2, final int n3, final int n4) {
        int n5 = bk + bi * Font.ae;
        int n6 = Font.ae - n;
        int n7 = 0;
        int n8 = 0;
        if (bi < Font.bi) {
            final int n9 = Font.bi - bi;
            n2 -= n9;
            bi = Font.bi;
            n8 += n9 * n;
            n5 += n9 * Font.ae;
        }
        if (bi + n2 > Font.be) {
            n2 -= bi + n2 - Font.be;
        }
        if (bk < Font.bk) {
            final int n10 = Font.bk - bk;
            n -= n10;
            bk = Font.bk;
            n8 += n10;
            n5 += n10;
            n7 += n10;
            n6 += n10;
        }
        if (bk + n > Font.bx) {
            final int n11 = bk + n - Font.bx;
            n -= n11;
            n7 += n11;
            n6 += n11;
        }
        if (n > 0 && n2 > 0) {
            bt(Font.ad, array, n3, n8, n5, n, n2, n6, n7, n4);
        }
    }
}
