// 
// Decompiled by Procyon v0.5.36
// 

public class class323
{
    public static final String kk = "Please try again later. If the problem ";
    static final int af = 0;
    static long field3037;
    
    class323() throws Throwable {
        throw new Error();
    }
    
    static final void playPcmPlayers(final int n) {
        try {
            if (HorizontalAlignment.pcmPlayer1 != null) {
                if (n >= 51429879) {
                    throw new IllegalStateException();
                }
                HorizontalAlignment.pcmPlayer1.tryDiscard(336870901);
            }
            if (null != class28.pcmPlayer0) {
                if (n >= 51429879) {
                    return;
                }
                class28.pcmPlayer0.tryDiscard(336870901);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mj.hz(" + ')');
        }
    }
    
    public static int yn(final class399 class399) {
        return class399.field3699.hashCode();
    }
}
