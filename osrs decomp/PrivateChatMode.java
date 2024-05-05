// 
// Decompiled by Procyon v0.5.36
// 

public class PrivateChatMode
{
    public static final PrivateChatMode field4161;
    static final PrivateChatMode field4162;
    static final PrivateChatMode field4163;
    public final int id;
    
    PrivateChatMode(final int n) {
        this.id = 1099200387 * n;
    }
    
    static {
        field4163 = new PrivateChatMode(0);
        field4161 = new PrivateChatMode(1);
        field4162 = new PrivateChatMode(2);
    }
    
    public static PrivateChatMode aw(final int n) {
        final PrivateChatMode[] array = { PrivateChatMode.field4163, PrivateChatMode.field4162, PrivateChatMode.field4161 };
        for (int i = 0; i < array.length; ++i) {
            final PrivateChatMode privateChatMode = array[i];
            if (privateChatMode.id * 1843384107 == n) {
                return privateChatMode;
            }
        }
        return null;
    }
    
    public static PrivateChatMode an(final int n) {
        final PrivateChatMode[] array = { PrivateChatMode.field4163, PrivateChatMode.field4162, PrivateChatMode.field4161 };
        for (int i = 0; i < array.length; ++i) {
            final PrivateChatMode privateChatMode = array[i];
            if (privateChatMode.id * 1843384107 == n) {
                return privateChatMode;
            }
        }
        return null;
    }
    
    public static PrivateChatMode ac(final int n) {
        final PrivateChatMode[] array = { PrivateChatMode.field4163, PrivateChatMode.field4162, PrivateChatMode.field4161 };
        for (int i = 0; i < array.length; ++i) {
            final PrivateChatMode privateChatMode = array[i];
            if (privateChatMode.id * 1843384107 == n) {
                return privateChatMode;
            }
        }
        return null;
    }
}
