import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.5.36
// 

public class ByteArrayPool
{
    static int field3655;
    static final int af = 1000;
    static int ByteArrayPool_smallCount;
    static byte[][] ByteArrayPool_medium;
    static int ByteArrayPool_largeCount;
    static final int an = 250;
    static int field3659;
    static int field3660;
    static int field3661;
    static ArrayList field3662;
    static byte[][] ByteArrayPool_small;
    static byte[][] field3664;
    static byte[][] ByteArrayPool_large;
    static int field3666;
    static int ByteArrayPool_mediumCount;
    static int field3668;
    static WorldMapEvent worldMapEvent;
    static final int ta = 48;
    
    ByteArrayPool() throws Throwable {
        throw new Error();
    }
    
    static {
        ByteArrayPool.ByteArrayPool_smallCount = 0;
        ByteArrayPool.ByteArrayPool_mediumCount = 0;
        ByteArrayPool.ByteArrayPool_largeCount = 0;
        ByteArrayPool.field3666 = 0;
        ByteArrayPool.field3659 = -1043983224;
        ByteArrayPool.field3660 = 1002979318;
        ByteArrayPool.field3661 = 2094465164;
        ByteArrayPool.field3655 = -1364074518;
        ByteArrayPool.ByteArrayPool_small = new byte[1000][];
        ByteArrayPool.ByteArrayPool_medium = new byte[250][];
        ByteArrayPool.ByteArrayPool_large = new byte[100][];
        ByteArrayPool.field3664 = new byte[50][];
        ByteArrayPool.field3662 = new ArrayList();
        class273.method1570(-975091517);
        new HashMap();
    }
    
    static void ao() {
        ByteArrayPool.field3662.clear();
        ByteArrayPool.field3662.add(100);
        ByteArrayPool.field3662.add(5000);
        ByteArrayPool.field3662.add(10000);
        ByteArrayPool.field3662.add(30000);
    }
    
    public static void at(final int[] byteArrayPool_alternativeSizes, final int[] array) {
        if (null != byteArrayPool_alternativeSizes && array != null) {
            ClanChannel.ByteArrayPool_alternativeSizes = byteArrayPool_alternativeSizes;
            class136.ByteArrayPool_altSizeArrayCounts = new int[byteArrayPool_alternativeSizes.length];
            UserComparator3.ByteArrayPool_arrays = new byte[byteArrayPool_alternativeSizes.length][][];
            for (int i = 0; i < ClanChannel.ByteArrayPool_alternativeSizes.length; ++i) {
                UserComparator3.ByteArrayPool_arrays[i] = new byte[array[i]][];
                ByteArrayPool.field3662.add(byteArrayPool_alternativeSizes[i]);
            }
            Collections.sort((List<Comparable>)ByteArrayPool.field3662);
            return;
        }
        ClanChannel.ByteArrayPool_alternativeSizes = null;
        class136.ByteArrayPool_altSizeArrayCounts = null;
        UserComparator3.ByteArrayPool_arrays = null;
        class273.method1570(1075528741);
    }
    
    public static synchronized byte[] ax(final int n, final boolean b) {
        if ((n == 100 || (n < 100 && b)) && ByteArrayPool.ByteArrayPool_smallCount * -1666526139 > 0) {
            final byte[] array = ByteArrayPool.ByteArrayPool_small[(ByteArrayPool.ByteArrayPool_smallCount += 1092459589) * -1822007306];
            ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount * 551392259] = null;
            return array;
        }
        if ((n == 5000 || (n < 628445478 && b)) && -661141202 * ByteArrayPool.ByteArrayPool_mediumCount > 0) {
            final byte[] array2 = ByteArrayPool.ByteArrayPool_medium[(ByteArrayPool.ByteArrayPool_mediumCount -= 1267792137) * -1205208593];
            ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount * 481846585] = null;
            return array2;
        }
        if ((n == -1598508657 || (n < 1427319002 && b)) && ByteArrayPool.ByteArrayPool_largeCount * -926544205 > 0) {
            final byte[] array3 = ByteArrayPool.ByteArrayPool_large[(ByteArrayPool.ByteArrayPool_largeCount -= 761958656) * 1720603757];
            ByteArrayPool.ByteArrayPool_large[-926544205 * ByteArrayPool.ByteArrayPool_largeCount] = null;
            return array3;
        }
        if ((n == 30000 || (n < 30000 && b)) && ByteArrayPool.field3666 * 767381159 > 0) {
            final byte[] array4 = ByteArrayPool.field3664[(ByteArrayPool.field3666 -= 1254586647) * -1724680952];
            ByteArrayPool.field3664[767381159 * ByteArrayPool.field3666] = null;
            return array4;
        }
        if (UserComparator3.ByteArrayPool_arrays != null) {
            for (int i = 0; i < ClanChannel.ByteArrayPool_alternativeSizes.length; ++i) {
                if ((n == ClanChannel.ByteArrayPool_alternativeSizes[i] || (n < ClanChannel.ByteArrayPool_alternativeSizes[i] && b)) && class136.ByteArrayPool_altSizeArrayCounts[i] > 0) {
                    final byte[][] array5 = UserComparator3.ByteArrayPool_arrays[i];
                    final int[] byteArrayPool_altSizeArrayCounts = class136.ByteArrayPool_altSizeArrayCounts;
                    final int n2 = i;
                    final int n3 = byteArrayPool_altSizeArrayCounts[n2] - 1;
                    byteArrayPool_altSizeArrayCounts[n2] = n3;
                    final byte[] array6 = array5[n3];
                    UserComparator3.ByteArrayPool_arrays[i][class136.ByteArrayPool_altSizeArrayCounts[i]] = null;
                    return array6;
                }
            }
        }
        if (b && ClanChannel.ByteArrayPool_alternativeSizes != null) {
            for (int j = 0; j < ClanChannel.ByteArrayPool_alternativeSizes.length; ++j) {
                if (n <= ClanChannel.ByteArrayPool_alternativeSizes[j] && class136.ByteArrayPool_altSizeArrayCounts[j] < UserComparator3.ByteArrayPool_arrays[j].length) {
                    return new byte[ClanChannel.ByteArrayPool_alternativeSizes[j]];
                }
            }
        }
        return new byte[n];
    }
    
    static void ay() {
        ByteArrayPool.field3662.clear();
        ByteArrayPool.field3662.add(1374813263);
        ByteArrayPool.field3662.add(-1129040604);
        ByteArrayPool.field3662.add(10000);
        ByteArrayPool.field3662.add(-1679940771);
    }
    
    public static synchronized byte[] ByteArrayPool_getArrayBool(final int n, final boolean b, final byte b2) {
        try {
            while (true) {
                Label_0155: {
                    if (n == 100) {
                        break Label_0155;
                    }
                    if (b2 == 0) {
                        throw new IllegalStateException();
                    }
                    if (n < 100) {
                        if (b2 == 0) {
                            throw new IllegalStateException();
                        }
                        if (b) {
                            if (b2 == 0) {
                                throw new IllegalStateException();
                            }
                            break Label_0155;
                        }
                    }
                    Label_0221: {
                        if (n != 5000) {
                            if (b2 == 0) {
                                throw new IllegalStateException();
                            }
                            if (n >= 5000 || !b) {
                                break Label_0221;
                            }
                            if (b2 == 0) {
                                throw new IllegalStateException();
                            }
                        }
                        if (481846585 * ByteArrayPool.ByteArrayPool_mediumCount > 0) {
                            if (b2 == 0) {
                                throw new IllegalStateException();
                            }
                            final byte[] array = ByteArrayPool.ByteArrayPool_medium[(ByteArrayPool.ByteArrayPool_mediumCount -= 1267792137) * 481846585];
                            ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount * 481846585] = null;
                            return array;
                        }
                    }
                    Label_0379: {
                        if (n != 10000) {
                            if (n >= 10000) {
                                break Label_0379;
                            }
                            if (b2 == 0) {
                                throw new IllegalStateException();
                            }
                            if (!b) {
                                break Label_0379;
                            }
                            if (b2 == 0) {
                                throw new IllegalStateException();
                            }
                        }
                        if (ByteArrayPool.ByteArrayPool_largeCount * -926544205 > 0) {
                            final byte[] array2 = ByteArrayPool.ByteArrayPool_large[(ByteArrayPool.ByteArrayPool_largeCount += 1706733445) * -926544205];
                            ByteArrayPool.ByteArrayPool_large[-926544205 * ByteArrayPool.ByteArrayPool_largeCount] = null;
                            return array2;
                        }
                    }
                    Label_0422: {
                        if (n != 30000) {
                            if (b2 == 0) {
                                throw new IllegalStateException();
                            }
                            if (n >= 30000) {
                                break Label_0422;
                            }
                            if (b2 == 0) {
                                throw new IllegalStateException();
                            }
                            if (!b) {
                                break Label_0422;
                            }
                            if (b2 == 0) {
                                throw new IllegalStateException();
                            }
                        }
                        if (ByteArrayPool.field3666 * 767381159 > 0) {
                            if (b2 == 0) {
                                throw new IllegalStateException();
                            }
                            final byte[] array3 = ByteArrayPool.field3664[(ByteArrayPool.field3666 -= 1254586647) * 767381159];
                            ByteArrayPool.field3664[767381159 * ByteArrayPool.field3666] = null;
                            return array3;
                        }
                    }
                    if (UserComparator3.ByteArrayPool_arrays != null) {
                        if (b2 == 0) {
                            throw new IllegalStateException();
                        }
                        for (int i = 0; i < ClanChannel.ByteArrayPool_alternativeSizes.length; ++i) {
                            if (b2 == 0) {
                                throw new IllegalStateException();
                            }
                            if (n != ClanChannel.ByteArrayPool_alternativeSizes[i]) {
                                if (b2 == 0) {
                                    throw new IllegalStateException();
                                }
                                if (n >= ClanChannel.ByteArrayPool_alternativeSizes[i]) {
                                    continue;
                                }
                                if (b2 == 0) {
                                    throw new IllegalStateException();
                                }
                                if (!b) {
                                    continue;
                                }
                                if (b2 == 0) {
                                    throw new IllegalStateException();
                                }
                            }
                            if (class136.ByteArrayPool_altSizeArrayCounts[i] > 0) {
                                if (b2 == 0) {
                                    throw new IllegalStateException();
                                }
                                final byte[][] array4 = UserComparator3.ByteArrayPool_arrays[i];
                                final int[] byteArrayPool_altSizeArrayCounts = class136.ByteArrayPool_altSizeArrayCounts;
                                final int n2 = i;
                                final int n3 = byteArrayPool_altSizeArrayCounts[n2] - 1;
                                byteArrayPool_altSizeArrayCounts[n2] = n3;
                                final byte[] array5 = array4[n3];
                                UserComparator3.ByteArrayPool_arrays[i][class136.ByteArrayPool_altSizeArrayCounts[i]] = null;
                                return array5;
                            }
                        }
                    }
                    if (b) {
                        if (b2 == 0) {
                            throw new IllegalStateException();
                        }
                        if (ClanChannel.ByteArrayPool_alternativeSizes != null) {
                            if (b2 == 0) {
                                throw new IllegalStateException();
                            }
                            for (int j = 0; j < ClanChannel.ByteArrayPool_alternativeSizes.length; ++j) {
                                if (b2 == 0) {
                                    throw new IllegalStateException();
                                }
                                if (n <= ClanChannel.ByteArrayPool_alternativeSizes[j]) {
                                    if (b2 == 0) {
                                        throw new IllegalStateException();
                                    }
                                    if (class136.ByteArrayPool_altSizeArrayCounts[j] < UserComparator3.ByteArrayPool_arrays[j].length) {
                                        if (b2 == 0) {
                                            throw new IllegalStateException();
                                        }
                                        return new byte[ClanChannel.ByteArrayPool_alternativeSizes[j]];
                                    }
                                }
                            }
                        }
                    }
                    return new byte[n];
                }
                if (ByteArrayPool.ByteArrayPool_smallCount * -300357261 <= 0) {
                    continue;
                }
                break;
            }
            if (b2 == 0) {
                throw new IllegalStateException();
            }
            final byte[] array6 = ByteArrayPool.ByteArrayPool_small[(ByteArrayPool.ByteArrayPool_smallCount += 1092459589) * -300357261];
            ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount * -300357261] = null;
            return array6;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oj.aw(" + ')');
        }
    }
    
    public static void al(final int[] byteArrayPool_alternativeSizes, final int[] array) {
        if (null != byteArrayPool_alternativeSizes && array != null) {
            ClanChannel.ByteArrayPool_alternativeSizes = byteArrayPool_alternativeSizes;
            class136.ByteArrayPool_altSizeArrayCounts = new int[byteArrayPool_alternativeSizes.length];
            UserComparator3.ByteArrayPool_arrays = new byte[byteArrayPool_alternativeSizes.length][][];
            for (int i = 0; i < ClanChannel.ByteArrayPool_alternativeSizes.length; ++i) {
                UserComparator3.ByteArrayPool_arrays[i] = new byte[array[i]][];
                ByteArrayPool.field3662.add(byteArrayPool_alternativeSizes[i]);
            }
            Collections.sort((List<Comparable>)ByteArrayPool.field3662);
            return;
        }
        ClanChannel.ByteArrayPool_alternativeSizes = null;
        class136.ByteArrayPool_altSizeArrayCounts = null;
        UserComparator3.ByteArrayPool_arrays = null;
        class273.method1570(-841941627);
    }
    
    static void aa() {
        ByteArrayPool.field3662.clear();
        ByteArrayPool.field3662.add(100);
        ByteArrayPool.field3662.add(1441979387);
        ByteArrayPool.field3662.add(1041114857);
        ByteArrayPool.field3662.add(30000);
    }
    
    public static synchronized void ai(final byte[] array) {
        if (array.length == 100 && -300357261 * ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field3659 * 255163693) {
            ByteArrayPool.ByteArrayPool_small[(ByteArrayPool.ByteArrayPool_smallCount -= 1092459589) * -300357261 - 1] = array;
            return;
        }
        if (5000 == array.length && 481846585 * ByteArrayPool.ByteArrayPool_mediumCount < 1720410087 * ByteArrayPool.field3660) {
            ByteArrayPool.ByteArrayPool_medium[(ByteArrayPool.ByteArrayPool_mediumCount += 1267792137) * 481846585 - 1] = array;
            return;
        }
        if (10000 == array.length && -926544205 * ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field3661 * -1922603885) {
            ByteArrayPool.ByteArrayPool_large[(ByteArrayPool.ByteArrayPool_largeCount -= 1706733445) * -926544205 - 1] = array;
            return;
        }
        if (30000 == array.length && ByteArrayPool.field3666 * 767381159 < -1866109675 * ByteArrayPool.field3655) {
            ByteArrayPool.field3664[(ByteArrayPool.field3666 += 1254586647) * 767381159 - 1] = array;
            return;
        }
        if (null != UserComparator3.ByteArrayPool_arrays) {
            for (int i = 0; i < ClanChannel.ByteArrayPool_alternativeSizes.length; ++i) {
                if (ClanChannel.ByteArrayPool_alternativeSizes[i] == array.length && class136.ByteArrayPool_altSizeArrayCounts[i] < UserComparator3.ByteArrayPool_arrays[i].length) {
                    UserComparator3.ByteArrayPool_arrays[i][class136.ByteArrayPool_altSizeArrayCounts[i]++] = array;
                    return;
                }
            }
        }
    }
    
    public static void ab(final int[] byteArrayPool_alternativeSizes, final int[] array) {
        if (null != byteArrayPool_alternativeSizes && array != null) {
            ClanChannel.ByteArrayPool_alternativeSizes = byteArrayPool_alternativeSizes;
            class136.ByteArrayPool_altSizeArrayCounts = new int[byteArrayPool_alternativeSizes.length];
            UserComparator3.ByteArrayPool_arrays = new byte[byteArrayPool_alternativeSizes.length][][];
            for (int i = 0; i < ClanChannel.ByteArrayPool_alternativeSizes.length; ++i) {
                UserComparator3.ByteArrayPool_arrays[i] = new byte[array[i]][];
                ByteArrayPool.field3662.add(byteArrayPool_alternativeSizes[i]);
            }
            Collections.sort((List<Comparable>)ByteArrayPool.field3662);
            return;
        }
        ClanChannel.ByteArrayPool_alternativeSizes = null;
        class136.ByteArrayPool_altSizeArrayCounts = null;
        UserComparator3.ByteArrayPool_arrays = null;
        class273.method1570(-105087377);
    }
    
    public static void aq(final int[] byteArrayPool_alternativeSizes, final int[] array) {
        if (null != byteArrayPool_alternativeSizes && array != null) {
            ClanChannel.ByteArrayPool_alternativeSizes = byteArrayPool_alternativeSizes;
            class136.ByteArrayPool_altSizeArrayCounts = new int[byteArrayPool_alternativeSizes.length];
            UserComparator3.ByteArrayPool_arrays = new byte[byteArrayPool_alternativeSizes.length][][];
            for (int i = 0; i < ClanChannel.ByteArrayPool_alternativeSizes.length; ++i) {
                UserComparator3.ByteArrayPool_arrays[i] = new byte[array[i]][];
                ByteArrayPool.field3662.add(byteArrayPool_alternativeSizes[i]);
            }
            Collections.sort((List<Comparable>)ByteArrayPool.field3662);
            return;
        }
        ClanChannel.ByteArrayPool_alternativeSizes = null;
        class136.ByteArrayPool_altSizeArrayCounts = null;
        UserComparator3.ByteArrayPool_arrays = null;
        class273.method1570(1864309760);
    }
    
    public static synchronized void ag(final byte[] array) {
        if (array.length == 983568426 && 78866759 * ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field3659 * -364723130) {
            ByteArrayPool.ByteArrayPool_small[(ByteArrayPool.ByteArrayPool_smallCount -= 1361767772) * -300357261 - 1] = array;
            return;
        }
        if (5000 == array.length && -1742120961 * ByteArrayPool.ByteArrayPool_mediumCount < -2146396632 * ByteArrayPool.field3660) {
            ByteArrayPool.ByteArrayPool_medium[(ByteArrayPool.ByteArrayPool_mediumCount += 1267792137) * 1430159187 - 1] = array;
            return;
        }
        if (280864981 == array.length && 576565251 * ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field3661 * -1922603885) {
            ByteArrayPool.ByteArrayPool_large[(ByteArrayPool.ByteArrayPool_largeCount -= 316088853) * -926544205 - 1] = array;
            return;
        }
        if (30000 == array.length && ByteArrayPool.field3666 * -606866171 < -1484345214 * ByteArrayPool.field3655) {
            ByteArrayPool.field3664[(ByteArrayPool.field3666 += 1254586647) * 1808311970 - 1] = array;
            return;
        }
        if (null != UserComparator3.ByteArrayPool_arrays) {
            for (int i = 0; i < ClanChannel.ByteArrayPool_alternativeSizes.length; ++i) {
                if (ClanChannel.ByteArrayPool_alternativeSizes[i] == array.length && class136.ByteArrayPool_altSizeArrayCounts[i] < UserComparator3.ByteArrayPool_arrays[i].length) {
                    UserComparator3.ByteArrayPool_arrays[i][class136.ByteArrayPool_altSizeArrayCounts[i]++] = array;
                    return;
                }
            }
        }
    }
    
    static final boolean method2091(final int n) {
        try {
            return Client.isMenuOpen;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oj.kj(" + ')');
        }
    }
}
