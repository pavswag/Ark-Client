// 
// Decompiled by Procyon v0.5.36
// 

public abstract class Clock
{
    public static final int aq = -1;
    static final int ap = 32;
    static final int sa = 100;
    
    Clock() {
    }
    
    public static Clock at() {
        try {
            return new NanoClock();
        }
        catch (Throwable t) {
            return new MilliClock();
        }
    }
    
    static final void method970(final int n, final int n2, final boolean b, final int n3) {
        try {
            if (Client.currentClanChannels[n] == null) {
                return;
            }
            if (n2 >= 0) {
                if (n3 <= 775874239) {
                    return;
                }
                if (n2 < Client.currentClanChannels[n].method898(-468925821)) {
                    final ClanChannelMember clanChannelMember = Client.currentClanChannels[n].members.get(n2);
                    final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2543, Client.packetWriter.isaacCipher, (short)(-2902));
                    packetBufferNode.packetBuffer.bf(4 + DynamicObject.stringCp1252NullTerminatedByteSize(clanChannelMember.username.getName(-710264960), (byte)(-54)), (byte)61);
                    packetBufferNode.packetBuffer.bf(n, (byte)73);
                    packetBufferNode.packetBuffer.cq(n2, (byte)(-71));
                    packetBufferNode.packetBuffer.bp(b, 614283261);
                    packetBufferNode.packetBuffer.ce(clanChannelMember.username.getName(-710264960), -1690364185);
                    Client.packetWriter.addNode(packetBufferNode, 414135591);
                    return;
                }
                if (n3 <= 775874239) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gv.np(" + ')');
        }
    }
    
    public abstract void aw();
    
    public abstract int wait(final int p0, final int p1, final int p2);
    
    public abstract void ac();
    
    public abstract void au();
    
    public static Clock aa() {
        try {
            return new NanoClock();
        }
        catch (Throwable t) {
            return new MilliClock();
        }
    }
    
    public abstract void mark(final int p0);
    
    public abstract int ab(final int p0, final int p1);
    
    public abstract int aq(final int p0, final int p1);
}
