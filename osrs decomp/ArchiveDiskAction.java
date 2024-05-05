// 
// Decompiled by Procyon v0.5.36
// 

public class ArchiveDiskAction extends Node
{
    int type;
    public byte[] data;
    public ArchiveDisk archiveDisk;
    public Archive archive;
    static final int ai = 16;
    
    ArchiveDiskAction() {
    }
    
    static class86[] method1858(final int n) {
        try {
            return new class86[] { class86.field880, class86.field884, class86.field881, class86.field886, class86.field883, class86.field882 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nw.au(" + ')');
        }
    }
    
    static final String formatItemStacks(final int i, final short n) {
        try {
            String str = Integer.toString(i);
            for (int j = str.length() - 3; j > 0; j -= 3) {
                if (n <= 141) {
                    throw new IllegalStateException();
                }
                str = str.substring(0, j) + class96.an + str.substring(j);
            }
            if (str.length() > 9) {
                if (n <= 141) {
                    throw new IllegalStateException();
                }
                return " " + class383.method2081(65408, -1521347825) + str.substring(0, str.length() - 8) + Strings.gb + " " + class96.ac + str + class96.au + class96.al;
            }
            else {
                if (str.length() <= 6) {
                    return " " + class383.method2081(16776960, 2128832594) + str + class96.al;
                }
                if (n <= 141) {
                    throw new IllegalStateException();
                }
                return " " + class383.method2081(16777215, -1204065259) + str.substring(0, str.length() - 4) + Strings.gn + " " + class96.ac + str + class96.au + class96.al;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nw.ly(" + ')');
        }
    }
}
