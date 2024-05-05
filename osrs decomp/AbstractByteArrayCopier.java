// 
// Decompiled by Procyon v0.5.36
// 

public abstract class AbstractByteArrayCopier
{
    static final int aw = 104;
    public static final int ap = 32768;
    static final int ci = 69;
    protected static boolean hasFocus;
    
    AbstractByteArrayCopier() {
    }
    
    public static byte[] ao(final Object o, final boolean b) {
        if (null == o) {
            return null;
        }
        if (o instanceof byte[]) {
            final byte[] array = (byte[])o;
            if (b) {
                final int length = array.length;
                final byte[] array2 = new byte[length];
                System.arraycopy(array, 0, array2, 0, length);
                return array2;
            }
            return array;
        }
        else {
            if (o instanceof AbstractByteArrayCopier) {
                return ((AbstractByteArrayCopier)o).get(-302524425);
            }
            throw new IllegalArgumentException();
        }
    }
    
    public static Object at(final byte[] array, final boolean b) {
        if (null == array) {
            return null;
        }
        if (array.length > 136) {
            final DirectByteArrayCopier directByteArrayCopier = new DirectByteArrayCopier();
            directByteArrayCopier.set(array, 1503790515);
            return directByteArrayCopier;
        }
        if (b) {
            return class143.aw(array, (byte)12);
        }
        return array;
    }
    
    abstract byte[] av();
    
    static byte[] ax(final byte[] array) {
        final int length = array.length;
        final byte[] array2 = new byte[length];
        System.arraycopy(array, 0, array2, 0, length);
        return array2;
    }
    
    public static byte[] ay(final Object o, final boolean b) {
        if (null == o) {
            return null;
        }
        if (o instanceof byte[]) {
            final byte[] array = (byte[])o;
            if (b) {
                final int length = array.length;
                final byte[] array2 = new byte[length];
                System.arraycopy(array, 0, array2, 0, length);
                return array2;
            }
            return array;
        }
        else {
            if (o instanceof AbstractByteArrayCopier) {
                return ((AbstractByteArrayCopier)o).get(-302524425);
            }
            throw new IllegalArgumentException();
        }
    }
    
    public static Object al(final byte[] array, final boolean b) {
        if (null == array) {
            return null;
        }
        if (array.length > -2064516402) {
            final DirectByteArrayCopier directByteArrayCopier = new DirectByteArrayCopier();
            directByteArrayCopier.set(array, 1503790515);
            return directByteArrayCopier;
        }
        if (b) {
            return class143.aw(array, (byte)12);
        }
        return array;
    }
    
    abstract byte[] get(final int p0);
    
    abstract void set(final byte[] p0, final int p1);
    
    public static byte[] aa(final Object o, final boolean b) {
        if (null == o) {
            return null;
        }
        if (o instanceof byte[]) {
            final byte[] array = (byte[])o;
            if (b) {
                final int length = array.length;
                final byte[] array2 = new byte[length];
                System.arraycopy(array, 0, array2, 0, length);
                return array2;
            }
            return array;
        }
        else {
            if (o instanceof AbstractByteArrayCopier) {
                return ((AbstractByteArrayCopier)o).get(-302524425);
            }
            throw new IllegalArgumentException();
        }
    }
    
    static byte[] ai(final byte[] array) {
        final int length = array.length;
        final byte[] array2 = new byte[length];
        System.arraycopy(array, 0, array2, 0, length);
        return array2;
    }
    
    abstract void ar(final byte[] p0);
    
    static Script getScript(final int n, final int n2) {
        try {
            final Script script = (Script)Script.Script_cached.wr(n);
            if (null != script) {
                if (n2 <= 392700909) {
                    throw new IllegalStateException();
                }
                return script;
            }
            else {
                final byte[] bh = class126.archive12.bh(n, 0, (byte)(-38));
                if (null != bh) {
                    final Script script2 = class33.newScript(bh, (byte)1);
                    Script.Script_cached.put(script2, n);
                    return script2;
                }
                if (n2 <= 392700909) {
                    throw new IllegalStateException();
                }
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mx.af(" + ')');
        }
    }
    
    public static Object ab(final byte[] array, final boolean b) {
        if (null == array) {
            return null;
        }
        if (array.length > 136) {
            final DirectByteArrayCopier directByteArrayCopier = new DirectByteArrayCopier();
            directByteArrayCopier.set(array, 1503790515);
            return directByteArrayCopier;
        }
        if (b) {
            return class143.aw(array, (byte)12);
        }
        return array;
    }
    
    public static Object aq(final byte[] array, final boolean b) {
        if (null == array) {
            return null;
        }
        if (array.length > -1960748921) {
            final DirectByteArrayCopier directByteArrayCopier = new DirectByteArrayCopier();
            directByteArrayCopier.set(array, 1503790515);
            return directByteArrayCopier;
        }
        if (b) {
            return class143.aw(array, (byte)12);
        }
        return array;
    }
    
    static byte[] ag(final byte[] array) {
        final int length = array.length;
        final byte[] array2 = new byte[length];
        System.arraycopy(array, 0, array2, 0, length);
        return array2;
    }
    
    static byte[] ah(final byte[] array) {
        final int length = array.length;
        final byte[] array2 = new byte[length];
        System.arraycopy(array, 0, array2, 0, length);
        return array2;
    }
}
