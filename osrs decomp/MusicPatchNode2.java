// 
// Decompiled by Procyon v0.5.36
// 

public class MusicPatchNode2
{
    byte[] field2717;
    byte[] field2718;
    int field2719;
    int field2720;
    int field2721;
    int field2722;
    int field2723;
    int field2724;
    int field2725;
    static final int bt = 43;
    static final int dj = 18;
    
    MusicPatchNode2() {
    }
    
    public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(final AbstractArchive abstractArchive, final String s, final String s2, final int n) {
        try {
            if (AbstractArchive.sh(abstractArchive, s, s2, -1313069490)) {
                final int fileFlat = AbstractArchive.getFileFlat(abstractArchive, s, 666526600);
                final byte[] takeFile = abstractArchive.takeFile(fileFlat, abstractArchive.getFileId(fileFlat, s2, (short)8192), (byte)(-76));
                int n2;
                if (takeFile == null) {
                    if (n == 1112690706) {
                        throw new IllegalStateException();
                    }
                    n2 = 0;
                }
                else {
                    class485.SpriteBuffer_decode(takeFile, 1145263442);
                    n2 = 1;
                }
                IndexedSprite method1852;
                if (n2 == 0) {
                    if (n == 1112690706) {
                        throw new IllegalStateException();
                    }
                    method1852 = null;
                }
                else {
                    method1852 = Strings.method1852((byte)1);
                }
                return method1852;
            }
            if (n == 1112690706) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lp.au(" + ')');
        }
    }
}
