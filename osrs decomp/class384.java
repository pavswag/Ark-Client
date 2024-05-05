// 
// Decompiled by Procyon v0.5.36
// 

public class class384
{
    class384() throws Throwable {
        throw new Error();
    }
    
    public static void bs(final int[] array, int i, int n) {
        for (n = i + n - 7; i < n; array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0) {}
        for (n += 7; i < n; array[i++] = 0) {}
    }
    
    static void ad(final long[] array, int i, final long[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 3; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 3; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 3; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 3; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void ae(final long[] array, int i, final long[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 3; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 3; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 3; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 3; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void bb(final float[] array, int i, final float[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    public static void ao(final byte[] array, int i, final byte[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void at(final Object[] array, int i, final Object[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void ak(final int[] array, int i, final int[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void av(final short[] array, int i, final short[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void be(final double[] array, int i, final double[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 3; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 3; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 3; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 3; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void as(final char[] array, int i, final char[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void az(final int[] array, int i, final int[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    public static void ax(final byte[] array, int i, final byte[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    public static void ay(final byte[] array, int i, final byte[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void bi(final double[] array, int i, final double[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 3; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 3; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 3; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 3; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void bo(final double[] array, int i, final double[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 3; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 3; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 3; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 3; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void bt(final Object[] array, int i, final Object[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void aw(final char[] array, int i, final char[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void am(final char[] array, int i, final char[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void al(final boolean[] array, int i, final boolean[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void an(final short[] array, int i, final short[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void ac(final int[] array, int i, final int[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void au(final long[] array, int i, final long[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 3; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 3; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 3; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 3; i < n2; array2[n++] = array[i++]) {}
    }
    
    public static void clearIntArray(final int[] array, int i, int n) {
        for (n = i + n - 7; i < n; array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0) {}
        for (n += 7; i < n; array[i++] = 0) {}
    }
    
    public static void ai(final byte[] array, int i, final byte[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void by(final float[] array, int i, final float[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void bx(final double[] array, int i, final double[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 3; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 3; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 3; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 3; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void ar(final char[] array, int i, final char[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void ap(final long[] array, int i, final long[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 3; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 3; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 3; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 3; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void bd(final Object[] array, int i, final Object[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    public static void writeRandomDat(final byte[] array, int i, final byte[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    public static void bn(final int[] array, int i, int n) {
        for (n = i + n - 7; i < n; array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0) {}
        for (n += 7; i < n; array[i++] = 0) {}
    }
    
    static void ab(final float[] array, int i, final float[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void aq(final double[] array, int i, final double[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 3; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 3; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 3; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 3; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void aj(final char[] array, int i, final char[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void ag(final short[] array, int i, final short[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void bz(final boolean[] array, int i, final boolean[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void bj(final Object[] array, int i, final Object[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void bm(final boolean[] array, int i, final boolean[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void bk(final double[] array, int i, final double[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 3; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 3; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 3; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 3; i < n2; array2[n++] = array[i++]) {}
    }
    
    static void ah(final short[] array, int i, final short[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
}
