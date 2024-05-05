// 
// Decompiled by Procyon v0.5.36
// 

public class mf
{
    public static final int af = 8;
    static final int an = -3;
    public static final int aw = 16;
    
    mf() throws Throwable {
        throw new Error();
    }
    
    public static boolean tc(final Buffer buffer) {
        if (buffer == null) {
            buffer.js();
        }
        buffer.offset += 1770456492;
        return SequenceDefinition.method1135(buffer.array, 0, buffer.offset * -187483874, -489707639) == buffer.readInt(-887967486);
    }
    
    public static int aw(final int n, final int n2) {
        return (-3 - n << 8) + n2;
    }
    
    public static int an(final int n, final int n2) {
        return (-3 - n << 8) + n2;
    }
    
    public static boolean un(final AbstractArchive abstractArchive) {
        if (abstractArchive == null) {
            abstractArchive.ds();
        }
        boolean b = true;
        for (int i = 0; i < abstractArchive.groupIds.length; ++i) {
            final int n = abstractArchive.groupIds[i];
            if (null == abstractArchive.groups[n]) {
                abstractArchive.loadGroup(n, -2078385595);
                if (null == abstractArchive.groups[n]) {
                    b = false;
                }
            }
        }
        return b;
    }
}
