// 
// Decompiled by Procyon v0.5.36
// 

public class class428 implements class356
{
    static final class428 field3814;
    static final class428 field3815;
    static final class428 field3816;
    static final class428 field3817;
    final int field3818;
    final int field3819;
    
    class428(final int n, final int n2) {
        this.field3818 = -199539953 * n;
        this.field3819 = n2 * -344766935;
    }
    
    static {
        field3815 = new class428(1, 1);
        field3817 = new class428(2, 2);
        field3816 = new class428(0, 3);
        field3814 = new class428(3, 10);
    }
    
    @Override
    public int aw() {
        return -779978281 * this.field3819;
    }
    
    @Override
    public int an() {
        return 2023077401 * this.field3819;
    }
    
    @Override
    public int ac() {
        return -1129845991 * this.field3819;
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return 2023077401 * this.field3819;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qf.af(" + ')');
        }
    }
    
    static final boolean method2272(final Model model, final int i, final int n, final int n2, final int n3, final byte b) {
        try {
            if (!ViewportMouse.ViewportMouse_isInViewport) {
                return false;
            }
            class122.method737(-702557639);
            final AABB aabb = model.aabb.get(i);
            final int n4 = 108689513 * aabb.zMidOffset + n;
            final int n5 = n2 + 849275953 * aabb.xMidOffset;
            final int n6 = -1615192333 * aabb.yMid + n3;
            final int n7 = -1923653815 * aabb.xMid;
            final int n8 = -975840301 * aabb.zMid;
            final int n9 = aabb.yMidOffset * -452185969;
            final int a = -1874962943 * ViewportMouse.field2207 - n4;
            final int a2 = class294.field2715 * 554168439 - n5;
            final int a3 = -1672023491 * ViewportMouse.field2208 - n6;
            if (Math.abs(a) > -391109139 * EnumComposition.field1536 + n7) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else if (Math.abs(a2) > n8 + ViewportMouse.field2211 * 1926934503) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else if (Math.abs(a3) > class9.field29 * -2043788763 + n9) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else if (Math.abs(a3 * (-864785215 * UserComparator8.field1157) - a2 * (-2085912871 * ReflectionCheck.field166)) > n8 * (-2043788763 * class9.field29) + n9 * (ViewportMouse.field2211 * 1926934503)) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else if (Math.abs(-2085912871 * ReflectionCheck.field166 * a - a3 * (1677061457 * ViewportMouse.field2209)) > EnumComposition.field1536 * -391109139 * n9 + n7 * (-2043788763 * class9.field29)) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                if (Math.abs(a2 * (ViewportMouse.field2209 * 1677061457) - -864785215 * UserComparator8.field1157 * a) <= -391109139 * EnumComposition.field1536 * n8 + 1926934503 * ViewportMouse.field2211 * n7) {
                    return true;
                }
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                return false;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qf.ag(" + ')');
        }
    }
}
