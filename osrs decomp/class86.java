// 
// Decompiled by Procyon v0.5.36
// 

public class class86 implements class356
{
    static int[] field879;
    static final class86 field880;
    static final class86 field881;
    static final class86 field882;
    static final class86 field883;
    static final class86 field884;
    final int field885;
    static final class86 field886;
    final int field887;
    static int field888;
    
    class86(final int n, final int n2) {
        this.field887 = n * 968435365;
        this.field885 = 1823410001 * n2;
    }
    
    static {
        field886 = new class86(0, -1);
        field880 = new class86(1, 2);
        field881 = new class86(2, 3);
        field882 = new class86(3, 4);
        field883 = new class86(4, 5);
        field884 = new class86(5, 6);
    }
    
    static class86[] at() {
        return new class86[] { class86.field880, class86.field884, class86.field881, class86.field886, class86.field883, class86.field882 };
    }
    
    @Override
    public int aw() {
        return 2093130161 * this.field885;
    }
    
    static class86[] al() {
        return new class86[] { class86.field880, class86.field884, class86.field881, class86.field886, class86.field883, class86.field882 };
    }
    
    @Override
    public int an() {
        return 2093130161 * this.field885;
    }
    
    @Override
    public int ac() {
        return 2093130161 * this.field885;
    }
    
    static final void method502(int min, final byte b) {
        try {
            min = Math.min(Math.max(min, 0), 255);
            if (min != ClientPreferences.xp(class20.clientPreferences, -747004874)) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                Label_0152: {
                    if (ClientPreferences.xp(class20.clientPreferences, 834708098) == 0) {
                        if (b >= 1) {
                            throw new IllegalStateException();
                        }
                        if (-1 != Client.currentTrackGroupId * 1976903761) {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            Message.isFromFriend(class399.archive6, 1976903761 * Client.currentTrackGroupId, 0, min, false, -1321934258);
                            Client.playingJingle = false;
                            break Label_0152;
                        }
                    }
                    if (min == 0) {
                        if (b >= 1) {
                            throw new IllegalStateException();
                        }
                        FloorUnderlayDefinition.setHsl(-852125385);
                        Client.playingJingle = false;
                    }
                    else {
                        class220.method1224(min, -1445318523);
                    }
                }
                ClientPreferences.ql(class20.clientPreferences, min, -935900203);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dt.mo(" + ')');
        }
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return 2093130161 * this.field885;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dt.af(" + ')');
        }
    }
    
    static class86[] ab() {
        return new class86[] { class86.field880, class86.field884, class86.field881, class86.field886, class86.field883, class86.field882 };
    }
    
    static class86[] aq() {
        return new class86[] { class86.field880, class86.field884, class86.field881, class86.field886, class86.field883, class86.field882 };
    }
}
