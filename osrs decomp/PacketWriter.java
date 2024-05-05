import java.io.IOException;
import java.awt.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public class PacketWriter
{
    IterableNodeDeque packetBufferNodes;
    ServerPacket field1133;
    int bufferSize;
    Buffer buffer;
    public IsaacCipher isaacCipher;
    PacketBuffer packetBuffer;
    ServerPacket field1139;
    int serverPacketLength;
    boolean field1135;
    int field1136;
    int pendingWrites;
    ServerPacket serverPacket;
    ServerPacket field1138;
    AbstractSocket socket;
    static Image field1141;
    
    PacketWriter() {
        this.packetBufferNodes = new IterableNodeDeque();
        this.bufferSize = 0;
        this.buffer = new Buffer(5000);
        this.packetBuffer = new PacketBuffer(40000);
        this.field1133 = null;
        this.serverPacketLength = 0;
        this.field1135 = true;
        this.field1136 = 0;
        this.pendingWrites = 0;
    }
    
    public static void ta(final PacketWriter packetWriter, final PacketBufferNode packetBufferNode) {
        packetWriter.packetBufferNodes.addFirst(packetBufferNode);
        packetBufferNode.index = 2022932994 * packetBufferNode.packetBuffer.at;
        packetBufferNode.packetBuffer.at = 0;
        packetWriter.bufferSize += packetBufferNode.index * -56666229;
    }
    
    public static void cv(final PacketWriter packetWriter, final AbstractSocket socket) {
        if (packetWriter == null) {
            packetWriter.ay();
        }
        packetWriter.socket = socket;
    }
    
    final void at() {
        this.packetBufferNodes.rsClear();
        this.bufferSize = 0;
    }
    
    void ak() {
        this.socket = null;
    }
    
    void as() {
        this.socket = null;
    }
    
    AbstractSocket az() {
        return this.socket;
    }
    
    final void ay() {
        this.packetBufferNodes.rsClear();
        this.bufferSize = 0;
    }
    
    public static void ms(final PacketWriter packetWriter) {
        if (packetWriter == null) {
            packetWriter.aa();
        }
        packetWriter.socket = null;
    }
    
    public static void ok(final PacketWriter packetWriter, final int n) throws IOException {
        if (packetWriter == null) {
            packetWriter.flush(n);
            return;
        }
        try {
            if (null != packetWriter.socket) {
                if (n != 421941662) {
                    throw new IllegalStateException();
                }
                if (-1859952183 * packetWriter.bufferSize > 0) {
                    if (n != 421941662) {
                        throw new IllegalStateException();
                    }
                    packetWriter.buffer.offset = 0;
                    while (true) {
                        Label_0043: {
                            break Label_0043;
                            PacketBufferNode packetBufferNode = null;
                            do {
                                packetWriter.buffer.writeBytes(packetBufferNode.packetBuffer.al, 0, 1816684323 * packetBufferNode.index, (byte)114);
                                packetWriter.bufferSize -= -56666229 * packetBufferNode.index;
                                packetBufferNode.hw();
                                packetBufferNode.packetBuffer.jr(265255722);
                                packetBufferNode.release(-2073453785);
                                packetBufferNode = (PacketBufferNode)packetWriter.packetBufferNodes.up();
                                if (null == packetBufferNode) {
                                    if (n != 421941662) {
                                        throw new IllegalStateException();
                                    }
                                    packetWriter.socket.write(packetWriter.buffer.array, 0, packetWriter.buffer.offset * -1633313603, -2115422184);
                                    packetWriter.pendingWrites = 0;
                                    return;
                                }
                            } while (1816684323 * packetBufferNode.index <= packetWriter.buffer.array.length - packetWriter.buffer.offset * -1633313603);
                        }
                        if (n != 421941662) {
                            throw new IllegalStateException();
                        }
                        continue;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eq.an(" + ')');
        }
    }
    
    public final void addNode(final PacketBufferNode packetBufferNode, final int n) {
        try {
            this.packetBufferNodes.addFirst(packetBufferNode);
            packetBufferNode.index = -1120134497 * packetBufferNode.packetBuffer.at;
            packetBufferNode.packetBuffer.at = 0;
            this.bufferSize += packetBufferNode.index * -56666229;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eq.aw(" + ')');
        }
    }
    
    void am() {
        if (this.socket != null) {
            this.socket.close(-1267075320);
            this.socket = null;
        }
    }
    
    final void al() {
        this.packetBufferNodes.clear();
        this.serverPacketLength = 0;
    }
    
    final void flush(final int n) {
        try {
            if (this.socket != null) {
                this.socket.close(-103517959);
                this.socket = null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eq.au(" + ')');
        }
    }
    
    void setSocket(final AbstractSocket socket, final byte b) {
        try {
            this.socket = socket;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eq.ac(" + ')');
        }
    }
    
    void close(final int n) {
        try {
            if (this.socket != null) {
                this.socket.close(-103517959);
                this.socket = null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eq.au(" + ')');
        }
    }
    
    final void aa() throws IOException {
        if (null != this.socket && -1859952183 * this.bufferSize > 0) {
            this.buffer.offset = 0;
            while (true) {
                final PacketBufferNode packetBufferNode = (PacketBufferNode)this.packetBufferNodes.up();
                if (null == packetBufferNode) {
                    break;
                }
                if (1816684323 * packetBufferNode.index > this.buffer.array.length - this.buffer.offset * -1633313603) {
                    break;
                }
                this.buffer.writeBytes(packetBufferNode.packetBuffer.al, 0, 1816684323 * packetBufferNode.index, (byte)39);
                this.bufferSize -= -56666229 * packetBufferNode.index;
                packetBufferNode.hw();
                packetBufferNode.packetBuffer.jr(265255722);
                packetBufferNode.release(-1361015242);
            }
            this.socket.write(this.buffer.array, 0, this.buffer.offset * -1633313603, -2115422184);
            this.pendingWrites = 0;
        }
    }
    
    public static void ty(final PacketWriter packetWriter, final int n) {
        if (packetWriter == null) {
            packetWriter.removeSocket(n);
        }
        try {
            packetWriter.socket = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eq.ab(" + ')');
        }
    }
    
    public static void kg(final PacketWriter packetWriter, final int n) {
        if (packetWriter == null) {
            packetWriter.clearBuffer(n);
        }
        try {
            packetWriter.packetBufferNodes.rsClear();
            packetWriter.bufferSize = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eq.af(" + ')');
        }
    }
    
    public final void ai(final PacketBufferNode packetBufferNode) {
        this.packetBufferNodes.addFirst(packetBufferNode);
        packetBufferNode.index = -1120134497 * packetBufferNode.packetBuffer.at;
        packetBufferNode.packetBuffer.at = 0;
        this.bufferSize += packetBufferNode.index * -56666229;
    }
    
    void ar() {
        if (this.socket != null) {
            this.socket.close(-486787121);
            this.socket = null;
        }
    }
    
    public static void ir(final PacketWriter packetWriter, final AbstractSocket socket, final byte b) {
        if (packetWriter == null) {
            packetWriter.setSocket(socket, b);
        }
        try {
            packetWriter.socket = socket;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eq.ac(" + ')');
        }
    }
    
    final void clearBuffer(final int n) {
        try {
            this.packetBufferNodes.ax();
            this.pendingWrites = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eq.af(" + ')');
        }
    }
    
    void removeSocket(final int n) {
        try {
            this.socket = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eq.ab(" + ')');
        }
    }
    
    AbstractSocket getSocket(final byte b) {
        try {
            return this.socket;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eq.aq(" + ')');
        }
    }
}
