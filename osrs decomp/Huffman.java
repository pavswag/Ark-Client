// 
// Decompiled by Procyon v0.5.36
// 

public class Huffman
{
    int[] keys;
    byte[] bits;
    static int[] field3027;
    int[] masks;
    
    public Huffman(final byte[] bits) {
        final int length = bits.length;
        this.keys = new int[length];
        this.bits = bits;
        final int[] array = new int[33];
        this.masks = new int[8];
        int n = 0;
        for (int i = 0; i < length; ++i) {
            final byte b = bits[i];
            if (b != 0) {
                final int n2 = 1 << 32 - b;
                final int n3 = array[b];
                this.keys[i] = n3;
                int n4;
                if (0x0 != (n3 & n2)) {
                    n4 = array[b - 1];
                }
                else {
                    n4 = (n3 | n2);
                    for (int j = b - 1; j >= 1; --j) {
                        final int n5 = array[j];
                        if (n3 != n5) {
                            break;
                        }
                        final int n6 = 1 << 32 - j;
                        if ((n5 & n6) != 0x0) {
                            array[j] = array[j - 1];
                            break;
                        }
                        array[j] = (n5 | n6);
                    }
                }
                array[b] = n4;
                for (int k = 1 + b; k <= 32; ++k) {
                    if (array[k] == n3) {
                        array[k] = n4;
                    }
                }
                int n7 = 0;
                for (byte b2 = 0; b2 < b; ++b2) {
                    if ((n3 & Integer.MIN_VALUE >>> b2) != 0x0) {
                        if (this.masks[n7] == 0) {
                            this.masks[n7] = n;
                        }
                        n7 = this.masks[n7];
                    }
                    else {
                        ++n7;
                    }
                    if (n7 >= this.masks.length) {
                        final int[] masks = new int[2 * this.masks.length];
                        for (int l = 0; l < this.masks.length; ++l) {
                            masks[l] = this.masks[l];
                        }
                        this.masks = masks;
                    }
                }
                this.masks[n7] = ~i;
                if (n7 >= n) {
                    n = n7 + 1;
                }
            }
        }
    }
    
    int aw(final byte[] array, int i, int n, final byte[] array2, final int n2) {
        int n3 = 0;
        int n4 = n2 << 3;
        int j;
        int n5;
        byte b;
        int n6;
        int n7;
        int n8;
        int n9;
        for (n += i; i < n; ++i) {
            j = (array[i] & 0xFF);
            n5 = this.keys[j];
            b = this.bits[j];
            if (b == 0) {
                throw new RuntimeException("" + j);
            }
            n6 = n4 >> 3;
            n7 = (n4 & 0x7);
            n8 = (n3 & -n7 >> 469917065);
            n9 = n6 + (b + n7 - 1 >> 3);
            n7 += 24;
            array2[n6] = (byte)(n3 = (n8 | n5 >>> n7));
            if (n6 < n9) {
                ++n6;
                n7 -= 8;
                array2[n6] = (byte)(n3 = n5 >>> n7);
                if (n6 < n9) {
                    ++n6;
                    n7 -= 8;
                    array2[n6] = (byte)(n3 = n5 >>> n7);
                    if (n6 < n9) {
                        ++n6;
                        n7 -= 8;
                        array2[n6] = (byte)(n3 = n5 >>> n7);
                        if (n6 < n9) {
                            ++n6;
                            n7 -= 8;
                            array2[n6] = (byte)(n3 = n5 << -n7);
                        }
                    }
                }
            }
            n4 += b;
        }
        return (n4 + 7 >> 3) - n2;
    }
    
    int decompress(final byte[] array, final int n, final byte[] array2, int n2, int n3, final int n4) {
        try {
            if (n3 == 0) {
                return 0;
            }
            int n5 = 0;
            n3 += n2;
            int n6 = n;
            while (true) {
                final byte b = array[n6];
                if (b < 0) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    n5 = this.masks[n5];
                }
                else {
                    ++n5;
                }
                final int n7;
                if ((n7 = this.masks[n5]) < 0) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    array2[n2++] = (byte)~n7;
                    if (n2 >= n3) {
                        if (n4 == 493483212) {
                            throw new IllegalStateException();
                        }
                        break;
                    }
                    else {
                        n5 = 0;
                    }
                }
                if ((b & 0x40) != 0x0) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    n5 = this.masks[n5];
                }
                else {
                    ++n5;
                }
                final int n8;
                if ((n8 = this.masks[n5]) < 0) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    array2[n2++] = (byte)~n8;
                    if (n2 >= n3) {
                        if (n4 == 493483212) {
                            throw new IllegalStateException();
                        }
                        break;
                    }
                    else {
                        n5 = 0;
                    }
                }
                if (0x0 != (b & 0x20)) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    n5 = this.masks[n5];
                }
                else {
                    ++n5;
                }
                final int n9;
                if ((n9 = this.masks[n5]) < 0) {
                    array2[n2++] = (byte)~n9;
                    if (n2 >= n3) {
                        if (n4 == 493483212) {
                            throw new IllegalStateException();
                        }
                        break;
                    }
                    else {
                        n5 = 0;
                    }
                }
                if (0x0 != (b & 0x10)) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    n5 = this.masks[n5];
                }
                else {
                    ++n5;
                }
                final int n10;
                if ((n10 = this.masks[n5]) < 0) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    array2[n2++] = (byte)~n10;
                    if (n2 >= n3) {
                        if (n4 == 493483212) {
                            throw new IllegalStateException();
                        }
                        break;
                    }
                    else {
                        n5 = 0;
                    }
                }
                if ((b & 0x8) != 0x0) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    n5 = this.masks[n5];
                }
                else {
                    ++n5;
                }
                final int n11;
                if ((n11 = this.masks[n5]) < 0) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    array2[n2++] = (byte)~n11;
                    if (n2 >= n3) {
                        break;
                    }
                    n5 = 0;
                }
                if (0x0 != (b & 0x4)) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    n5 = this.masks[n5];
                }
                else {
                    ++n5;
                }
                final int n12;
                if ((n12 = this.masks[n5]) < 0) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    array2[n2++] = (byte)~n12;
                    if (n2 >= n3) {
                        if (n4 == 493483212) {
                            throw new IllegalStateException();
                        }
                        break;
                    }
                    else {
                        n5 = 0;
                    }
                }
                if (0x0 != (b & 0x2)) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    n5 = this.masks[n5];
                }
                else {
                    ++n5;
                }
                final int n13;
                if ((n13 = this.masks[n5]) < 0) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    array2[n2++] = (byte)~n13;
                    if (n2 >= n3) {
                        if (n4 == 493483212) {
                            throw new IllegalStateException();
                        }
                        break;
                    }
                    else {
                        n5 = 0;
                    }
                }
                if ((b & 0x1) != 0x0) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    n5 = this.masks[n5];
                }
                else {
                    ++n5;
                }
                final int n14;
                if ((n14 = this.masks[n5]) < 0) {
                    if (n4 == 493483212) {
                        throw new IllegalStateException();
                    }
                    array2[n2++] = (byte)~n14;
                    if (n2 >= n3) {
                        if (n4 == 493483212) {
                            throw new IllegalStateException();
                        }
                        break;
                    }
                    else {
                        n5 = 0;
                    }
                }
                ++n6;
            }
            return n6 + 1 - n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "me.an(" + ')');
        }
    }
    
    int au(final byte[] array, final int n, final byte[] array2, int n2, int n3) {
        if (n3 == 0) {
            return 0;
        }
        int n4 = 0;
        n3 += n2;
        int n5 = n;
        while (true) {
            final byte b = array[n5];
            if (b < 0) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n6;
            if ((n6 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n6;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if ((b & 0x40) != 0x0) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n7;
            if ((n7 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n7;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if (0x0 != (b & 0x20)) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n8;
            if ((n8 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n8;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if (0x0 != (b & 0x10)) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n9;
            if ((n9 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n9;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if ((b & 0x8) != 0x0) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n10;
            if ((n10 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n10;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if (0x0 != (b & 0x4)) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n11;
            if ((n11 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n11;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if (0x0 != (b & 0x2)) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n12;
            if ((n12 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n12;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if ((b & 0x1) != 0x0) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n13;
            if ((n13 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n13;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            ++n5;
        }
        return n5 + 1 - n;
    }
    
    public static int ra(final Huffman huffman, final byte[] array, int i, int n, final byte[] array2, final int n2) {
        if (huffman == null) {
            huffman.compress(array, i, i, array, i, i);
        }
        int n3 = 0;
        int n4 = n2 << 3;
        int j;
        int n5;
        byte b;
        int n6;
        int n7;
        int n8;
        int n9;
        for (n += i; i < n; ++i) {
            j = (array[i] & 0xFF);
            n5 = huffman.keys[j];
            b = huffman.bits[j];
            if (b == 0) {
                throw new RuntimeException("" + j);
            }
            n6 = n4 >> 3;
            n7 = (n4 & 0x7);
            n8 = (n3 & -n7 >> -355946890);
            n9 = n6 + (b + n7 - 1 >> 3);
            n7 += 24;
            array2[n6] = (byte)(n3 = (n8 | n5 >>> n7));
            if (n6 < n9) {
                ++n6;
                n7 -= 8;
                array2[n6] = (byte)(n3 = n5 >>> n7);
                if (n6 < n9) {
                    ++n6;
                    n7 -= 8;
                    array2[n6] = (byte)(n3 = n5 >>> n7);
                    if (n6 < n9) {
                        ++n6;
                        n7 -= 8;
                        array2[n6] = (byte)(n3 = n5 >>> n7);
                        if (n6 < n9) {
                            ++n6;
                            n7 -= 8;
                            array2[n6] = (byte)(n3 = n5 << -n7);
                        }
                    }
                }
            }
            n4 += b;
        }
        return (n4 + 7 >> 3) - n2;
    }
    
    int compress(final byte[] array, int i, int n, final byte[] array2, final int n2, final int n3) {
        try {
            int n4 = 0;
            int n5 = n2 << 3;
            n += i;
            while (i < n) {
                if (n3 >= 424813829) {
                    throw new IllegalStateException();
                }
                final int j = array[i] & 0xFF;
                final int n6 = this.keys[j];
                final byte b = this.bits[j];
                if (b == 0) {
                    if (n3 >= 424813829) {
                        throw new IllegalStateException();
                    }
                    throw new RuntimeException("" + j);
                }
                else {
                    int n7 = n5 >> 3;
                    int n8 = n5 & 0x7;
                    final int n9 = n4 & -n8 >> 31;
                    final int n10 = n7 + (b + n8 - 1 >> 3);
                    n8 += 24;
                    array2[n7] = (byte)(n4 = (n9 | n6 >>> n8));
                    if (n7 >= n10) {
                        if (n3 >= 424813829) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        ++n7;
                        n8 -= 8;
                        array2[n7] = (byte)(n4 = n6 >>> n8);
                        if (n7 >= n10) {
                            if (n3 >= 424813829) {
                                throw new IllegalStateException();
                            }
                        }
                        else {
                            ++n7;
                            n8 -= 8;
                            array2[n7] = (byte)(n4 = n6 >>> n8);
                            if (n7 < n10) {
                                ++n7;
                                n8 -= 8;
                                array2[n7] = (byte)(n4 = n6 >>> n8);
                                if (n7 >= n10) {
                                    if (n3 >= 424813829) {
                                        throw new IllegalStateException();
                                    }
                                }
                                else {
                                    ++n7;
                                    n8 -= 8;
                                    array2[n7] = (byte)(n4 = n6 << -n8);
                                }
                            }
                        }
                    }
                    n5 += b;
                    ++i;
                }
            }
            return (n5 + 7 >> 3) - n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "me.af(" + ')');
        }
    }
    
    int ab(final byte[] array, final int n, final byte[] array2, int i, int n2) {
        if (n2 == 0) {
            return 0;
        }
        int n3 = 0;
        n2 += i;
        int n4 = n;
        Label_0033: {
            break Label_0033;
        Label_0382_Outer:
            do {
                n3 = 0;
                while (true) {
                    final byte b;
                    if (0x0 != (b & 0x4)) {
                        n3 = this.masks[n3];
                    }
                    else {
                        ++n3;
                    }
                    final int n5;
                    if ((n5 = this.masks[n3]) < 0) {
                        array2[i++] = (byte)~n5;
                        if (i >= n2) {
                            break;
                        }
                        n3 = 0;
                    }
                    if (0x0 != (b & 0x2)) {
                        n3 = this.masks[n3];
                    }
                    else {
                        ++n3;
                    }
                    final int n6;
                    if ((n6 = this.masks[n3]) < 0) {
                        array2[i++] = (byte)~n6;
                        if (i >= n2) {
                            break;
                        }
                        n3 = 0;
                    }
                    if ((b & 0x1) != 0x0) {
                        n3 = this.masks[n3];
                    }
                    else {
                        ++n3;
                    }
                    final int n7;
                    if ((n7 = this.masks[n3]) < 0) {
                        array2[i++] = (byte)~n7;
                        if (i >= n2) {
                            break;
                        }
                        n3 = 0;
                    }
                    ++n4;
                    b = array[n4];
                    if (b < 0) {
                        n3 = this.masks[n3];
                    }
                    else {
                        ++n3;
                    }
                    final int n8;
                    if ((n8 = this.masks[n3]) < 0) {
                        array2[i++] = (byte)~n8;
                        if (i >= n2) {
                            break;
                        }
                        n3 = 0;
                    }
                    if ((b & 0x40) != 0x0) {
                        n3 = this.masks[n3];
                    }
                    else {
                        ++n3;
                    }
                    final int n9;
                    if ((n9 = this.masks[n3]) < 0) {
                        array2[i++] = (byte)~n9;
                        if (i >= n2) {
                            break;
                        }
                        n3 = 0;
                    }
                    if (0x0 != (b & 0x20)) {
                        n3 = this.masks[n3];
                    }
                    else {
                        ++n3;
                    }
                    final int n10;
                    if ((n10 = this.masks[n3]) < 0) {
                        array2[i++] = (byte)~n10;
                        if (i >= n2) {
                            break;
                        }
                        n3 = 0;
                    }
                    if (0x0 != (b & 0x10)) {
                        n3 = this.masks[n3];
                    }
                    else {
                        ++n3;
                    }
                    final int n11;
                    if ((n11 = this.masks[n3]) < 0) {
                        array2[i++] = (byte)~n11;
                        if (i >= n2) {
                            break;
                        }
                        n3 = 0;
                    }
                    if ((b & 0x8) != 0x0) {
                        n3 = this.masks[n3];
                    }
                    else {
                        ++n3;
                    }
                    final int n12;
                    if ((n12 = this.masks[n3]) < 0) {
                        array2[i++] = (byte)~n12;
                        continue Label_0382_Outer;
                    }
                    continue;
                }
            } while (i < n2);
        }
        return n4 + 1 - n;
    }
    
    int aq(final byte[] array, final int n, final byte[] array2, int n2, int n3) {
        if (n3 == 0) {
            return 0;
        }
        int n4 = 0;
        n3 += n2;
        int n5 = n;
        while (true) {
            final byte b = array[n5];
            if (b < 0) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n6;
            if ((n6 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n6;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if ((b & 0x40) != 0x0) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n7;
            if ((n7 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n7;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if (0x0 != (b & 0x20)) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n8;
            if ((n8 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n8;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if (0x0 != (b & 0x10)) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n9;
            if ((n9 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n9;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if ((b & 0x8) != 0x0) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n10;
            if ((n10 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n10;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if (0x0 != (b & 0x4)) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n11;
            if ((n11 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n11;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if (0x0 != (b & 0x2)) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n12;
            if ((n12 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n12;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if ((b & 0x1) != 0x0) {
                n4 = this.masks[n4];
            }
            else {
                ++n4;
            }
            final int n13;
            if ((n13 = this.masks[n4]) < 0) {
                array2[n2++] = (byte)~n13;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            ++n5;
        }
        return n5 + 1 - n;
    }
}
