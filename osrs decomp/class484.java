// 
// Decompiled by Procyon v0.5.36
// 

public class class484
{
    static final int rn = 2;
    static final int field4044;
    static final int field4045;
    static final int af = 4;
    static final String hn = "shield/oauth/token";
    
    class484() throws Throwable {
        throw new Error();
    }
    
    static {
        field4044 = (int)(Math.pow(2.0, 4.0) - 1.0) * 1010976615;
        field4045 = (int)(Math.pow(2.0, 8.0) - 1.0) * 998296027;
    }
    
    public static int ao(final int n) {
        return (n & 1211275346 * class484.field4044) - 1;
    }
    
    public static int at(final int n) {
        return n >>> 4 & 1885164930 * class484.field4045;
    }
    
    public static int ax(final int n) {
        return (n & 265217111 * class484.field4044) - 1;
    }
    
    public static int ay(final int n) {
        return (n & 844080606 * class484.field4044) - 1;
    }
    
    public static SpritePixels SpriteBuffer_getSprite(final AbstractArchive abstractArchive, final int i, final int n, final int n2) {
        final net.runelite.api.SpritePixels spritePixels = Client.ym.get(i);
        if (spritePixels != null) {
            return ((SpritePixels)spritePixels).cf();
        }
        final int n3 = -1572989467;
        SpritePixels method973;
        try {
            final byte[] takeFile = abstractArchive.takeFile(i, n, (byte)(-67));
            int n4;
            if (takeFile == null) {
                if (n3 == 959841720) {
                    throw new IllegalStateException();
                }
                n4 = 0;
            }
            else {
                class485.SpriteBuffer_decode(takeFile, 1145263442);
                n4 = 1;
            }
            if (n4 == 0) {
                if (n3 == 959841720) {
                    throw new IllegalStateException();
                }
                method973 = null;
            }
            else {
                method973 = ObjTypeCustomisation.method973(-1490841904);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sc.aw(" + ')');
        }
        return method973;
    }
    
    public static int al(final int n) {
        return n >>> 12;
    }
    
    public static int au(final int n) {
        return n >>> 12;
    }
    
    public static int aa(final int n) {
        return (n & 265217111 * class484.field4044) - 1;
    }
    
    static Object[] ai(final Buffer buffer, final int[] array) {
        final int uShortSmart = buffer.readUShortSmart(-514047468);
        final Object[] array2 = new Object[uShortSmart * array.length];
        for (int i = 0; i < uShortSmart; ++i) {
            for (int j = 0; j < array.length; ++j) {
                array2[j + i * array.length] = class103.method639(array[j], -1116187866).method2435(buffer, -1183771146);
            }
        }
        return array2;
    }
    
    public static int ab(final int n) {
        return n >>> 12;
    }
    
    public static int aq(final int n) {
        return n >>> 12;
    }
    
    static Object[] ag(final Buffer buffer, final int[] array) {
        final int uShortSmart = buffer.readUShortSmart(-1142565996);
        final Object[] array2 = new Object[uShortSmart * array.length];
        for (int i = 0; i < uShortSmart; ++i) {
            for (int j = 0; j < array.length; ++j) {
                array2[j + i * array.length] = class103.method639(array[j], -1981678092).method2435(buffer, -1183771146);
            }
        }
        return array2;
    }
    
    static Object[] ah(final Buffer buffer, final int[] array) {
        final int uShortSmart = buffer.readUShortSmart(-788186050);
        final Object[] array2 = new Object[uShortSmart * array.length];
        for (int i = 0; i < uShortSmart; ++i) {
            for (int j = 0; j < array.length; ++j) {
                array2[j + i * array.length] = class103.method639(array[j], 1998220821).method2435(buffer, -1183771146);
            }
        }
        return array2;
    }
}
