// 
// Decompiled by Procyon v0.5.36
// 

public class AABB implements net.runelite.api.AABB
{
    int xMidOffset;
    static GameBuild field2070;
    public static final int ah = 65536;
    int xMid;
    int yMid;
    int yMidOffset;
    int zMidOffset;
    int zMid;
    
    AABB(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.zMidOffset = 1721407449 * n;
        this.xMidOffset = 1707404497 * n2;
        this.yMid = -1533203909 * n3;
        this.xMid = n4 * 2119680761;
        this.zMid = n5 * -2116275109;
        this.yMidOffset = n6 * 21950063;
    }
    
    public int getCenterX() {
        return this.zMidOffset * 108689513;
    }
    
    public int getCenterY() {
        return this.xMidOffset * 849275953;
    }
    
    public int getExtremeZ() {
        return this.yMidOffset * -452185969;
    }
    
    public int getCenterZ() {
        return this.yMid * -1615192333;
    }
    
    public int getExtremeX() {
        return this.xMid * -1923653815;
    }
    
    public int getExtremeY() {
        return this.zMid * -975840301;
    }
}
