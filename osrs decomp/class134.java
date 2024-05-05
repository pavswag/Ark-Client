import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.5.36
// 

public class class134 implements class356
{
    static final class134 field1288;
    static final class134 field1289;
    public static final int bx = 32;
    static final class134 field1290;
    static final class134 field1291;
    static final class134 field1292;
    static final class134 field1293;
    static final class134 field1294;
    static final class134 field1295;
    final int field1296;
    final int field1297;
    static final class134 field1298;
    static final int bd = 1;
    public static final int bf = 68;
    public static final int bp = 1011;
    
    class134(final int n, final int n2) {
        this.field1296 = -225909867 * n;
        this.field1297 = 1597349905 * n2;
    }
    
    static {
        field1291 = new class134(0, 0);
        field1298 = new class134(1, 1);
        field1290 = new class134(2, 2);
        field1293 = new class134(3, 3);
        field1288 = new class134(4, 4);
        field1292 = new class134(5, 5);
        field1289 = new class134(6, 6);
        field1294 = new class134(7, 7);
        field1295 = new class134(8, 8);
    }
    
    static class134 ao(final int n) {
        class134 field1295 = (class134)StructComposition.findEnumerated(class425.method2246(-237742485), n, (short)173);
        if (field1295 == null) {
            field1295 = class134.field1295;
        }
        return field1295;
    }
    
    static class134[] isCharAlphabetic() {
        return new class134[] { class134.field1291, class134.field1298, class134.field1290, class134.field1293, class134.field1288, class134.field1292, class134.field1289, class134.field1294, class134.field1295 };
    }
    
    public static boolean isCharAlphabetic(final char c, final byte b) {
        try {
            Label_0020: {
                if (c < 'A') {
                    break Label_0020;
                }
                if (b != 3) {
                    throw new IllegalStateException();
                }
                if (c <= 'Z') {
                    return true;
                }
                if (b != 3) {
                    throw new IllegalStateException();
                }
                break Label_0020;
            }
            if (c >= 'a') {
                if (b != 3) {
                    throw new IllegalStateException();
                }
                if (c <= 'z') {
                    if (b != 3) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
            return false;
            b2 = true;
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fl.at(" + ')');
        }
    }
    
    static class134 ax(final int n) {
        class134 field1295 = (class134)StructComposition.findEnumerated(class425.method2246(449594446), n, (short)173);
        if (field1295 == null) {
            field1295 = class134.field1295;
        }
        return field1295;
    }
    
    static class134 ay(final int n) {
        class134 field1295 = (class134)StructComposition.findEnumerated(class425.method2246(-1759595969), n, (short)173);
        if (field1295 == null) {
            field1295 = class134.field1295;
        }
        return field1295;
    }
    
    @Override
    public int aw() {
        return 59724017 * this.field1297;
    }
    
    static class134[] al() {
        return new class134[] { class134.field1291, class134.field1298, class134.field1290, class134.field1293, class134.field1288, class134.field1292, class134.field1289, class134.field1294, class134.field1295 };
    }
    
    @Override
    public int an() {
        return 59724017 * this.field1297;
    }
    
    @Override
    public int ac() {
        return 59724017 * this.field1297;
    }
    
    public static int method780(int n, final int n2, final int n3, final byte b) {
        try {
            n |= class140.vmethod3248(n3 - n2 + 1, (byte)86) << n2;
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fl.au(" + ')');
        }
    }
    
    static class134 aa(final int n) {
        class134 field1295 = (class134)StructComposition.findEnumerated(class425.method2246(1887149301), n, (short)173);
        if (field1295 == null) {
            field1295 = class134.field1295;
        }
        return field1295;
    }
    
    static class134 ai(final int n) {
        class134 field1295 = (class134)StructComposition.findEnumerated(class425.method2246(70134726), n, (short)173);
        if (field1295 == null) {
            field1295 = class134.field1295;
        }
        return field1295;
    }
    
    public static void rsOrdinal(final int[] byteArrayPool_alternativeSizes, final int[] array, final int n) {
        try {
            if (null != byteArrayPool_alternativeSizes) {
                if (n >= 53993777) {
                    throw new IllegalStateException();
                }
                if (array != null) {
                    ClanChannel.ByteArrayPool_alternativeSizes = byteArrayPool_alternativeSizes;
                    class136.ByteArrayPool_altSizeArrayCounts = new int[byteArrayPool_alternativeSizes.length];
                    UserComparator3.ByteArrayPool_arrays = new byte[byteArrayPool_alternativeSizes.length][][];
                    for (int i = 0; i < ClanChannel.ByteArrayPool_alternativeSizes.length; ++i) {
                        if (n >= 53993777) {
                            throw new IllegalStateException();
                        }
                        UserComparator3.ByteArrayPool_arrays[i] = new byte[array[i]][];
                        ByteArrayPool.field3662.add(byteArrayPool_alternativeSizes[i]);
                    }
                    Collections.sort((List<Comparable>)ByteArrayPool.field3662);
                    return;
                }
            }
            ClanChannel.ByteArrayPool_alternativeSizes = null;
            class136.ByteArrayPool_altSizeArrayCounts = null;
            UserComparator3.ByteArrayPool_arrays = null;
            class273.method1570(1372150454);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fl.af(" + ')');
        }
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return 59724017 * this.field1297;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fl.af(" + ')');
        }
    }
    
    static class134[] aq() {
        return new class134[] { class134.field1291, class134.field1298, class134.field1290, class134.field1293, class134.field1288, class134.field1292, class134.field1289, class134.field1294, class134.field1295 };
    }
    
    static boolean method779(final byte b) {
        try {
            boolean b2;
            if (class20.clientPreferences.getCurrentSoundEffectsVolume(-964267539) >= Client.param21 * 976454555) {
                if (b <= 9) {
                    throw new IllegalStateException();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fl.oi(" + ')');
        }
    }
}
