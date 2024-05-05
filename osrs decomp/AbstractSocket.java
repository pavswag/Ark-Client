import java.net.Socket;
import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class AbstractSocket
{
    static final int ac = 50;
    
    AbstractSocket() {
    }
    
    public abstract void ad();
    
    public abstract void ae();
    
    public abstract int ao() throws IOException;
    
    public static AbstractSocket at(final Socket socket, final int n, final int n2) throws IOException {
        return new BufferedNetSocket(socket, n, n2);
    }
    
    public abstract int ak(final byte[] p0, final int p1, final int p2) throws IOException;
    
    public abstract int av() throws IOException;
    
    public abstract int as(final byte[] p0, final int p1, final int p2) throws IOException;
    
    public abstract void az(final byte[] p0, final int p1, final int p2) throws IOException;
    
    public abstract int ax() throws IOException;
    
    public abstract int ay() throws IOException;
    
    public abstract int available(final int p0) throws IOException;
    
    public abstract int am(final byte[] p0, final int p1, final int p2) throws IOException;
    
    public static AbstractSocket al(final Socket socket, final int n, final int n2) throws IOException {
        return new BufferedNetSocket(socket, n, n2);
    }
    
    public abstract boolean isAvailable(final int p0, final int p1) throws IOException;
    
    public abstract int readUnsignedByte(final int p0) throws IOException;
    
    public abstract int read(final byte[] p0, final int p1, final int p2, final int p3) throws IOException;
    
    public static AbstractSocket aa(final Socket socket, final int n, final int n2) throws IOException {
        return new BufferedNetSocket(socket, n, n2);
    }
    
    public abstract int ai() throws IOException;
    
    public abstract boolean by(final int p0) throws IOException;
    
    public abstract int ar() throws IOException;
    
    public abstract boolean ap(final int p0) throws IOException;
    
    public abstract void write(final byte[] p0, final int p1, final int p2, final int p3) throws IOException;
    
    public abstract void close(final int p0);
    
    public abstract int aj(final byte[] p0, final int p1, final int p2) throws IOException;
    
    public abstract int ag() throws IOException;
    
    public abstract int ah() throws IOException;
}
