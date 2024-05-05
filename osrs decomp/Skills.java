// 
// Decompiled by Procyon v0.5.36
// 

public class Skills
{
    public static int[] Skills_experienceTable;
    public static final boolean[] Skills_enabled;
    public static final int af = 25;
    
    Skills() throws Throwable {
        throw new Error();
    }
    
    static {
        Skills_enabled = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
        Skills.Skills_experienceTable = new int[99];
        int n = 0;
        for (int i = 0; i < 99; ++i) {
            final int n2 = 1 + i;
            n += (int)(n2 + 300.0 * Math.pow(2.0, n2 / 7.0));
            Skills.Skills_experienceTable[i] = n / 4;
        }
    }
    
    public static Object jn(final class1 class1) {
        if (class1 == null) {
            return class1.af();
        }
        return class1.field1.vmethod12(class1.field0);
    }
}
