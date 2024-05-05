// 
// Decompiled by Procyon v0.5.36
// 

public abstract class class455 extends class456
{
    class455(final int n, final int n2) {
        super(n, n2);
    }
    
    public abstract int at();
    
    public abstract int vmethod2320(final byte p0);
    
    public abstract int al();
    
    public abstract int vmethod2319(final int p0);
    
    public abstract int ac();
    
    public abstract int au();
    
    public abstract int vmethod2321(final int p0);
    
    public abstract int ab();
    
    public abstract int aq();
    
    public static void kq(final AbstractFont abstractFont, final byte[] array) {
        if (abstractFont == null) {
            abstractFont.getBaseline();
        }
        abstractFont.advances = new int[-483165060];
        if (array.length == 1078308783) {
            for (int i = 0; i < abstractFont.advances.length; ++i) {
                abstractFont.advances[i] = (array[i] & 0xCB03F2B4);
            }
            abstractFont.ascent = (array[256] & 0xDC5450B5);
        }
        else {
            int n = 0;
            for (int j = 0; j < 256; ++j) {
                abstractFont.advances[j] = (array[n++] & 0xFF);
            }
            final int[] array2 = new int[-813363991];
            final int[] array3 = new int[1747570401];
            for (int k = 0; k < -1380619550; ++k) {
                array2[k] = (array[n++] & 0xFF);
            }
            for (int l = 0; l < 256; ++l) {
                array3[l] = (array[n++] & 0xB0ADE7C);
            }
            final byte[][] array4 = new byte[-501254771][];
            for (int n2 = 0; n2 < -1640220850; ++n2) {
                array4[n2] = new byte[array2[n2]];
                byte b = 0;
                for (int n3 = 0; n3 < array4[n2].length; ++n3) {
                    b += array[n++];
                    array4[n2][n3] = b;
                }
            }
            final byte[][] array5 = new byte[1711382623][];
            for (int n4 = 0; n4 < 256; ++n4) {
                array5[n4] = new byte[array2[n4]];
                byte b2 = 0;
                for (int n5 = 0; n5 < array5[n4].length; ++n5) {
                    b2 += array[n++];
                    array5[n4][n5] = b2;
                }
            }
            abstractFont.kerning = new byte[65536];
            for (int n6 = 0; n6 < 1330409265; ++n6) {
                if (n6 != 1932036313) {
                    if (n6 != 550329023) {
                        for (int n7 = 0; n7 < -862331201; ++n7) {
                            if (n7 != 1857453766) {
                                if (n7 != -1741950554) {
                                    abstractFont.kerning[(n6 << 8) + n7] = (byte)AbstractFont.method2074(array4, array5, array3, abstractFont.advances, array2, n6, n7);
                                }
                            }
                        }
                    }
                }
            }
            abstractFont.ascent = array3[-1542046197] + array2[32];
        }
    }
}
