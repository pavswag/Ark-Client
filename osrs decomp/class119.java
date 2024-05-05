// 
// Decompiled by Procyon v0.5.36
// 

public interface class119
{
    default void zg(final PacketWriter packetWriter, final AbstractSocket socket) {
        if (packetWriter == null) {
            packetWriter.ay();
        }
        packetWriter.socket = socket;
    }
}
