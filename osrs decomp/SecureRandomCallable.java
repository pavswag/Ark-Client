import java.util.Arrays;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.5.36
// 

public class SecureRandomCallable implements Callable
{
    static int Interpreter_stringStackSize;
    
    SecureRandomCallable() {
    }
    
    public static Object hn(final SecureRandomCallable secureRandomCallable) {
        if (secureRandomCallable == null) {
            return secureRandomCallable.call();
        }
        final SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextInt();
        return secureRandom;
    }
    
    @Override
    public Object call() {
        try {
            final SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextInt();
            return secureRandom;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dm.call(" + ')');
        }
    }
    
    public static void method476(final Widget widget, final PlayerComposition playerComposition, final boolean b, final short n) {
        try {
            widget.modelType = 883531787;
            widget.field2894 = new PlayerComposition(playerComposition);
            if (!b) {
                if (n == 233) {
                    throw new IllegalStateException();
                }
                widget.field2894.field2841 = Arrays.copyOf(widget.field2894.bodyColors, widget.field2894.bodyColors.length);
                widget.field2894.setHash(-469114674);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dm.bv(" + ')');
        }
    }
    
    public static int sn(final UserComparator10 userComparator10, final Object o, final Object o2) {
        if (userComparator10 == null) {
            return userComparator10.compare(o, o);
        }
        return userComparator10.compareBuddy((Buddy)o, (Buddy)o2, 987427124);
    }
    
    public Object aw() {
        final SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextInt();
        return secureRandom;
    }
    
    public Object an() {
        final SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextInt();
        return secureRandom;
    }
    
    public static void ou(final NPC npc) {
        if (npc == null) {
            npc.ab();
        }
        npc.field1048 = null;
    }
    
    public static void ig(final SpritePixels spritePixels) {
        if (spritePixels == null) {
            spritePixels.flipVertically();
        }
        final int[] pixels = new int[spritePixels.subWidth * spritePixels.subHeight];
        int n = 0;
        for (int i = spritePixels.subHeight - 1; i >= 0; --i) {
            for (int j = 0; j < spritePixels.subWidth; ++j) {
                pixels[n++] = spritePixels.pixels[j + i * spritePixels.subWidth];
            }
        }
        spritePixels.pixels = pixels;
        spritePixels.yOffset = spritePixels.height - spritePixels.subHeight - spritePixels.yOffset;
    }
}
