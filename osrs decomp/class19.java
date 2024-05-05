import java.io.IOException;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.5.36
// 

public class class19 implements Callable
{
    static final int ab = Integer.MAX_VALUE;
    static Bounds field60;
    static final int ae = 27;
    static final int ct = 40;
    final /* synthetic */ class14 this$0;
    final class10 field61;
    
    class19(final class14 this$0, final class10 field61) {
        this.this$0 = this$0;
        this.field61 = field61;
    }
    
    public static Object cn(final class19 class19) throws Exception {
        try {
            while (class19.field61.method37((byte)122)) {
                PlayerComposition.method1692(10L);
            }
        }
        catch (IOException ex) {
            return new class20("Error servicing REST query: " + ex.getMessage());
        }
        return class19.field61.method35((byte)(-95));
    }
    
    public static boolean tc(final WorldMap worldMap, final int i) {
        return !worldMap.enabledElements.contains(i);
    }
    
    @Override
    public Object call() throws Exception {
        try {
            try {
                while (this.field61.method37((byte)41)) {
                    PlayerComposition.method1692(10L);
                }
            }
            catch (IOException ex) {
                return new class20("Error servicing REST query: " + ex.getMessage());
            }
            return this.field61.method35((byte)(-27));
        }
        catch (RuntimeException ex2) {
            throw HealthBar.get(ex2, "as.call(" + ')');
        }
    }
    
    public Object aw() throws Exception {
        try {
            while (this.field61.method37((byte)112)) {
                PlayerComposition.method1692(10L);
            }
        }
        catch (IOException ex) {
            return new class20("Error servicing REST query: " + ex.getMessage());
        }
        return this.field61.method35((byte)(-48));
    }
    
    static final void method78(final byte[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final CollisionMap[] array2, final int n10) {
        try {
            for (int i = 0; i < 8; ++i) {
                if (n10 <= -1086759664) {
                    return;
                }
                for (int j = 0; j < 8; ++j) {
                    if (n10 <= -1086759664) {
                        throw new IllegalStateException();
                    }
                    if (n2 + i > 0 && i + n2 < 103) {
                        if (n10 <= -1086759664) {
                            return;
                        }
                        if (n3 + j > 0) {
                            if (n10 <= -1086759664) {
                                return;
                            }
                            if (n3 + j < 103) {
                                if (n10 <= -1086759664) {
                                    throw new IllegalStateException();
                                }
                                final int[] array3 = array2[n].flags[i + n2];
                                final int n11 = j + n3;
                                array3[n11] &= 0xFEFFFFFF;
                            }
                        }
                    }
                }
            }
            final Buffer buffer = new Buffer(array);
            for (int k = 0; k < 4; ++k) {
                if (n10 <= -1086759664) {
                    throw new IllegalStateException();
                }
                for (int l = 0; l < 64; ++l) {
                    if (n10 <= -1086759664) {
                        throw new IllegalStateException();
                    }
                    int n12 = 0;
                Label_0483_Outer:
                    while (n12 < 64) {
                        while (true) {
                            Label_0526: {
                                if (n4 != k) {
                                    break Label_0526;
                                }
                                if (n10 <= -1086759664) {
                                    throw new IllegalStateException();
                                }
                                if (l < n5) {
                                    break Label_0526;
                                }
                                if (n10 <= -1086759664) {
                                    throw new IllegalStateException();
                                }
                                if (l >= 8 + n5) {
                                    break Label_0526;
                                }
                                if (n10 <= -1086759664) {
                                    return;
                                }
                                if (n12 < n6) {
                                    break Label_0526;
                                }
                                if (n10 <= -1086759664) {
                                    throw new IllegalStateException();
                                }
                                if (n12 >= n6 + 8) {
                                    break Label_0526;
                                }
                                if (n10 <= -1086759664) {
                                    throw new IllegalStateException();
                                }
                                final int n13 = n2 + SpriteMask.contains(l & 0x7, n12 & 0x7, n7, 575322475);
                                final int n14 = l & 0x7;
                                final int n15 = n12 & 0x7;
                                final int n16 = n7 & 0x3;
                                int n17;
                                if (n16 == 0) {
                                    if (n10 <= -1086759664) {
                                        throw new IllegalStateException();
                                    }
                                    n17 = n15;
                                }
                                else if (n16 == 1) {
                                    if (n10 <= -1086759664) {
                                        return;
                                    }
                                    n17 = 7 - n14;
                                }
                                else if (2 == n16) {
                                    if (n10 <= -1086759664) {
                                        throw new IllegalStateException();
                                    }
                                    n17 = 7 - n15;
                                }
                                else {
                                    n17 = n14;
                                }
                                class372.loadTerrain(buffer, n, n13, n3 + n17, (l & 0x7) + (n8 + n2), (n12 & 0x7) + (n9 + n3), n7, (byte)(-96));
                                ++n12;
                                continue Label_0483_Outer;
                            }
                            class372.loadTerrain(buffer, 0, -1, -1, 0, 0, 0, (byte)(-107));
                            continue;
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "as.au(" + ')');
        }
    }
    
    public Object af() throws Exception {
        try {
            while (this.field61.method37((byte)95)) {
                PlayerComposition.method1692(10L);
            }
        }
        catch (IOException ex) {
            return new class20("Error servicing REST query: " + ex.getMessage());
        }
        return this.field61.method35((byte)(-15));
    }
}
