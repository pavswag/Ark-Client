// 
// Decompiled by Procyon v0.5.36
// 

public class Animation
{
    static int[] field1957;
    int[] transformYs;
    boolean hasAlphaTransform;
    static int[] field1960;
    Skeleton skeleton;
    int transformCount;
    int[] transformSkeletonLabels;
    int[] transformXs;
    int[] transformZs;
    static int[] field1966;
    static int[] field1967;
    
    Animation(final byte[] array, final Skeleton skeleton) {
        this.skeleton = null;
        this.transformCount = -1;
        this.hasAlphaTransform = false;
        this.skeleton = skeleton;
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        buffer.offset = 1262255402;
        final int ra = Buffer.ra(buffer, (byte)7);
        int n = -1;
        int transformCount = 0;
        buffer2.offset = (buffer.offset * -1633313603 + ra) * -1516355947;
        for (int i = 0; i < ra; ++i) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            if (ra2 > 0) {
                if (this.skeleton.transformTypes[i] != 0) {
                    for (int j = i - 1; j > n; --j) {
                        if (this.skeleton.transformTypes[j] == 0) {
                            Animation.field1967[transformCount] = j;
                            Animation.field1966[transformCount] = 0;
                            Animation.field1957[transformCount] = 0;
                            Animation.field1960[transformCount] = 0;
                            ++transformCount;
                            break;
                        }
                    }
                }
                Animation.field1967[transformCount] = i;
                int n2 = 0;
                if (this.skeleton.transformTypes[i] == 3) {
                    n2 = 128;
                }
                if ((ra2 & 0x1) != 0x0) {
                    Animation.field1966[transformCount] = buffer2.readShortSmart(1570572456);
                }
                else {
                    Animation.field1966[transformCount] = n2;
                }
                if ((ra2 & 0x2) != 0x0) {
                    Animation.field1957[transformCount] = buffer2.readShortSmart(1757814522);
                }
                else {
                    Animation.field1957[transformCount] = n2;
                }
                if ((ra2 & 0x4) != 0x0) {
                    Animation.field1960[transformCount] = buffer2.readShortSmart(2032808326);
                }
                else {
                    Animation.field1960[transformCount] = n2;
                }
                n = i;
                ++transformCount;
                if (this.skeleton.transformTypes[i] == 5) {
                    this.hasAlphaTransform = true;
                }
            }
        }
        if (buffer2.offset * -1633313603 != array.length) {
            throw new RuntimeException();
        }
        this.transformCount = transformCount;
        this.transformSkeletonLabels = new int[transformCount];
        this.transformXs = new int[transformCount];
        this.transformYs = new int[transformCount];
        this.transformZs = new int[transformCount];
        for (int k = 0; k < transformCount; ++k) {
            this.transformSkeletonLabels[k] = Animation.field1967[k];
            this.transformXs[k] = Animation.field1966[k];
            this.transformYs[k] = Animation.field1957[k];
            this.transformZs[k] = Animation.field1960[k];
        }
    }
    
    static {
        Animation.field1967 = new int[500];
        Animation.field1966 = new int[500];
        Animation.field1957 = new int[500];
        Animation.field1960 = new int[500];
    }
    
    public int rv() {
        return this.transformCount;
    }
    
    public int[] sw() {
        return this.transformSkeletonLabels;
    }
    
    public Skeleton sn() {
        return this.skeleton;
    }
    
    public int[] gz() {
        return this.transformXs;
    }
    
    public int[] yz() {
        return this.transformZs;
    }
    
    public int[] wj() {
        return this.transformYs;
    }
    
    public boolean yk() {
        return this.hasAlphaTransform;
    }
}
