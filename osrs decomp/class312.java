// 
// Decompiled by Procyon v0.5.36
// 

public class class312
{
    public Object[] field2821;
    class309 field2822;
    public class314 field2823;
    public Object[] field2824;
    public Object[] field2825;
    public Object[] field2826;
    class27 field2827;
    
    class312() {
        this.field2823 = new class314();
        this.field2822 = new class309();
        this.field2827 = new class27();
    }
    
    public static void le(final Message message) {
        if (message == null) {
            message.getTimestamp();
        }
        message.isFromFriend0 = TriBool.TriBool_unknown;
    }
    
    public static void az(final MidiPcmStream midiPcmStream, final int n, final int n2) {
        midiPcmStream.field2750[n] = n2;
        midiPcmStream.field2751[n] = (int)(2097152.0 * Math.pow(2.0, 5.4931640625E-4 * n2) + 0.5);
    }
    
    public static int bl(final class314 class314) {
        return class314.field2857 * -522869069;
    }
}
