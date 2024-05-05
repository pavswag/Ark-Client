import net.runelite.api.WidgetNode;

// 
// Decompiled by Procyon v0.5.36
// 

public class InterfaceParent extends Node implements WidgetNode
{
    int group;
    int type;
    boolean field848;
    
    InterfaceParent() {
        this.field848 = false;
    }
    
    public int getId() {
        return this.group * 944864121;
    }
    
    public static int Entity_unpackID(final long n) {
        try {
            return (int)(n >>> 17 & 0xFFFFFFFFL);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "di.at(" + ')');
        }
    }
    
    public static void method488(final int n) {
        try {
            StructComposition.StructDefinition_cached.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "di.al(" + ')');
        }
    }
    
    public static synchronized void ByteArrayPool_release(final byte[] array, final byte b) {
        try {
            if (array.length == 100) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                if (-300357261 * ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field3659 * 255163693) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    ByteArrayPool.ByteArrayPool_small[(ByteArrayPool.ByteArrayPool_smallCount -= 1092459589) * -300357261 - 1] = array;
                    return;
                }
            }
            if (5000 == array.length) {
                if (b == 0) {
                    return;
                }
                if (481846585 * ByteArrayPool.ByteArrayPool_mediumCount < 1720410087 * ByteArrayPool.field3660) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    ByteArrayPool.ByteArrayPool_medium[(ByteArrayPool.ByteArrayPool_mediumCount += 1267792137) * 481846585 - 1] = array;
                    return;
                }
            }
            if (10000 == array.length) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                if (-926544205 * ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field3661 * -1922603885) {
                    if (b == 0) {
                        return;
                    }
                    ByteArrayPool.ByteArrayPool_large[(ByteArrayPool.ByteArrayPool_largeCount -= 1706733445) * -926544205 - 1] = array;
                    return;
                }
            }
            if (30000 == array.length) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                if (ByteArrayPool.field3666 * 767381159 < -1866109675 * ByteArrayPool.field3655) {
                    if (b == 0) {
                        return;
                    }
                    ByteArrayPool.field3664[(ByteArrayPool.field3666 += 1254586647) * 767381159 - 1] = array;
                    return;
                }
            }
            if (null != UserComparator3.ByteArrayPool_arrays) {
                for (int i = 0; i < ClanChannel.ByteArrayPool_alternativeSizes.length; ++i) {
                    if (b == 0) {
                        return;
                    }
                    if (ClanChannel.ByteArrayPool_alternativeSizes[i] == array.length) {
                        if (b == 0) {
                            throw new IllegalStateException();
                        }
                        if (class136.ByteArrayPool_altSizeArrayCounts[i] < UserComparator3.ByteArrayPool_arrays[i].length) {
                            if (b == 0) {
                                throw new IllegalStateException();
                            }
                            UserComparator3.ByteArrayPool_arrays[i][class136.ByteArrayPool_altSizeArrayCounts[i]++] = array;
                            return;
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "di.au(" + ')');
        }
    }
    
    public static boolean co(final class398 class398) {
        return class398.field3698 * 1638192103 != -1;
    }
    
    public int getModalMode() {
        return this.type * -1702664641;
    }
}
