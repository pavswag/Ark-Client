// 
// Decompiled by Procyon v0.5.36
// 

public class IntHashTable
{
    public static final int at = 1280;
    int[] array;
    
    public IntHashTable(final int[] array) {
        int i;
        for (i = 1; i <= (array.length >> 1) + array.length; i <<= 1) {}
        this.array = new int[i + i];
        for (int j = 0; j < i + i; ++j) {
            this.array[j] = -1;
        }
        for (int k = 0; k < array.length; ++k) {
            int n;
            for (n = (array[k] & i - 1); -1 != this.array[n + n + 1]; n = (1 + n & i - 1)) {}
            this.array[n + n] = array[k];
            this.array[n + n + 1] = k;
        }
    }
    
    public static int cs(final IntHashTable intHashTable, final int n) {
        final int n2 = (intHashTable.array.length >> 1) - 1;
        int n3 = n & n2;
        while (true) {
            final int n4 = intHashTable.array[1 + (n3 + n3)];
            if (-1 == n4) {
                return -1;
            }
            if (intHashTable.array[n3 + n3] == n) {
                return n4;
            }
            n3 = (1 + n3 & n2);
        }
    }
    
    public static void ae(final class314 class314) {
        class314.field2843 = Math.max(0, class314.field2843 * 607166941 - class379.he(class314.field2851, -297150195)) * -2081112459;
    }
    
    public static DualNode pp(final IterableDualNodeQueue iterableDualNodeQueue) {
        if (iterableDualNodeQueue == null) {
            iterableDualNodeQueue.last();
        }
        return iterableDualNodeQueue.previousOrLast(null);
    }
    
    public int aw(final int n) {
        final int n2 = (this.array.length >> 1) - 1;
        int n3 = n & n2;
        while (true) {
            final int n4 = this.array[1 + (n3 + n3)];
            if (-1 == n4) {
                return -1;
            }
            if (this.array[n3 + n3] == n) {
                return n4;
            }
            n3 = (1 + n3 & n2);
        }
    }
    
    public static void sk(final GameEngine gameEngine) {
        if (gameEngine == null) {
            gameEngine.ft();
        }
        gameEngine.resizeCanvasNextFrame = true;
    }
    
    public int au(final int n) {
        final int n2 = (this.array.length >> 1) - 1;
        int n3 = n & n2;
        Label_0058: {
            break Label_0058;
            int n4 = 0;
            do {
                if (this.array[n3 + n3] == n) {
                    return n4;
                }
                n3 = (1 + n3 & n2);
                n4 = this.array[1 + (n3 + n3)];
            } while (-1 != n4);
        }
        return -1;
    }
    
    public static int xb(final IntHashTable intHashTable, final int n) {
        final int n2 = (intHashTable.array.length >> 1) - 1;
        int n3 = n & n2;
        Label_0061: {
            break Label_0061;
            int n4 = 0;
            do {
                if (intHashTable.array[n3 + n3] == n) {
                    return n4;
                }
                n3 = (1 + n3 & n2);
                n4 = intHashTable.array[1 + (n3 + n3)];
            } while (-1 != n4);
        }
        return -1;
    }
    
    public int get(final int n, final int n2) {
        try {
            final int n3 = (this.array.length >> 1) - 1;
            int n4 = n & n3;
            Label_0088: {
                break Label_0088;
                int n5 = 0;
                do {
                    if (this.array[n4 + n4] == n) {
                        if (n2 == -1815433325) {
                            throw new IllegalStateException();
                        }
                        return n5;
                    }
                    else {
                        n4 = (1 + n4 & n3);
                        n5 = this.array[1 + (n4 + n4)];
                    }
                } while (-1 != n5);
            }
            if (n2 == -1815433325) {
                throw new IllegalStateException();
            }
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "td.af(" + ')');
        }
    }
    
    public static void nq(final LoginScreenAnimation loginScreenAnimation) {
        if (loginScreenAnimation == null) {
            loginScreenAnimation.aa();
        }
        loginScreenAnimation.field1027 = null;
        loginScreenAnimation.field1018 = null;
        loginScreenAnimation.field1012 = null;
        loginScreenAnimation.field1016 = null;
        loginScreenAnimation.field1023 = null;
        loginScreenAnimation.field1019 = null;
        loginScreenAnimation.field1022 = null;
        loginScreenAnimation.field1017 = null;
        loginScreenAnimation.field1015 = 0;
        loginScreenAnimation.field1024 = 0;
    }
}
