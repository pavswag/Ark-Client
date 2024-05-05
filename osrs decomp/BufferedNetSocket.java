import java.io.IOException;
import java.net.Socket;

// 
// Decompiled by Procyon v0.5.36
// 

public class BufferedNetSocket extends AbstractSocket
{
    BufferedSink sink;
    BufferedSource source;
    Socket socket;
    
    BufferedNetSocket(final Socket socket, final int n, final int n2) throws IOException {
        (this.socket = socket).setSoTimeout(30000);
        this.socket.setTcpNoDelay(true);
        this.socket.setReceiveBufferSize(65536);
        this.socket.setSendBufferSize(65536);
        this.source = new BufferedSource(this.socket.getInputStream(), n);
        this.sink = new BufferedSink(this.socket.getOutputStream(), n2);
    }
    
    @Override
    protected void finalize() {
        try {
            this.close(323141636);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pv.finalize(" + ')');
        }
    }
    
    @Override
    public void ad() {
        this.sink.close(-1422439694);
        try {
            this.socket.close();
        }
        catch (IOException ex) {}
        BufferedSource.es(this.source, -1118938495);
    }
    
    @Override
    public void ae() {
        this.sink.close(410103038);
        try {
            this.socket.close();
        }
        catch (IOException ex) {}
        BufferedSource.es(this.source, -1118938495);
    }
    
    @Override
    public int ao() throws IOException {
        return this.source.available((byte)78);
    }
    
    @Override
    public int ak(final byte[] array, final int n, final int n2) throws IOException {
        return this.source.read(array, n, n2, 469715753);
    }
    
    @Override
    public int av() throws IOException {
        return this.source.readUnsignedByte((short)29189);
    }
    
    @Override
    public int as(final byte[] array, final int n, final int n2) throws IOException {
        return this.source.read(array, n, n2, 189303635);
    }
    
    @Override
    public void az(final byte[] array, final int n, final int n2) throws IOException {
        this.sink.write(array, n, n2, (byte)(-40));
    }
    
    @Override
    public int ax() throws IOException {
        return this.source.available((byte)75);
    }
    
    @Override
    public int ay() throws IOException {
        return this.source.available((byte)12);
    }
    
    static int available(final int n, final int n2, final int n3) {
        try {
            final ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
            if (null == itemContainer) {
                if (n3 >= 705212246) {
                    throw new IllegalStateException();
                }
                return 0;
            }
            else {
                if (-1 != n2) {
                    int n4 = 0;
                    for (int i = 0; i < itemContainer.ids.length; ++i) {
                        if (n3 >= 705212246) {
                            throw new IllegalStateException();
                        }
                        if (n2 == itemContainer.quantities[i]) {
                            n4 += itemContainer.ids[i];
                        }
                    }
                    return n4;
                }
                if (n3 >= 705212246) {
                    throw new IllegalStateException();
                }
                return 0;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pv.aw(" + ')');
        }
    }
    
    @Override
    public int available(final int n) throws IOException {
        try {
            return this.source.available((byte)25);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pv.aw(" + ')');
        }
    }
    
    @Override
    public int am(final byte[] array, final int n, final int n2) throws IOException {
        return this.source.read(array, n, n2, 121858257);
    }
    
    @Override
    public boolean isAvailable(final int n, final int n2) throws IOException {
        try {
            return BufferedSource.oq(this.source, n, -1797531866);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pv.an(" + ')');
        }
    }
    
    @Override
    public int readUnsignedByte(final int n) throws IOException {
        try {
            return this.source.readUnsignedByte((short)28528);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pv.ac(" + ')');
        }
    }
    
    public static void cx(final BufferedNetSocket bufferedNetSocket) {
        if (bufferedNetSocket == null) {
            bufferedNetSocket.ad();
        }
        bufferedNetSocket.close(1055756721);
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2, final int n3) throws IOException {
        try {
            return this.source.read(array, n, n2, -744884869);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pv.au(" + ')');
        }
    }
    
    @Override
    public int ai() throws IOException {
        return this.source.available((byte)37);
    }
    
    @Override
    public boolean by(final int n) throws IOException {
        return BufferedSource.oq(this.source, n, -1780836105);
    }
    
    @Override
    public int ar() throws IOException {
        return this.source.readUnsignedByte((short)20839);
    }
    
    @Override
    public boolean ap(final int n) throws IOException {
        return BufferedSource.oq(this.source, n, -2008288638);
    }
    
    public static Font write(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final String s, final String s2, final int n) {
        try {
            if (AbstractArchive.sh(abstractArchive, s, s2, -1313069490)) {
                final int fileFlat = AbstractArchive.getFileFlat(abstractArchive, s, -507580052);
                final int fileId = abstractArchive.getFileId(fileFlat, s2, (short)8192);
                final byte[] takeFile = abstractArchive.takeFile(fileFlat, fileId, (byte)(-79));
                int n2;
                if (null == takeFile) {
                    n2 = 0;
                }
                else {
                    class485.SpriteBuffer_decode(takeFile, 1145263442);
                    n2 = 1;
                }
                Font font;
                if (n2 == 0) {
                    if (n != 1606925660) {
                        throw new IllegalStateException();
                    }
                    font = null;
                }
                else {
                    final byte[] takeFile2 = abstractArchive2.takeFile(fileFlat, fileId, (byte)(-77));
                    Font font2;
                    if (null == takeFile2) {
                        if (n != 1606925660) {
                            throw new IllegalStateException();
                        }
                        font2 = null;
                    }
                    else {
                        final Font font3 = new Font(takeFile2, class503.SpriteBuffer_xOffsets, class17.SpriteBuffer_yOffsets, class97.SpriteBuffer_spriteWidths, class138.SpriteBuffer_spriteHeights, class394.SpriteBuffer_spritePalette, VarbitComposition.SpriteBuffer_pixels);
                        class398.method2125(-262861184);
                        font2 = font3;
                    }
                    font = font2;
                }
                return font;
            }
            if (n != 1606925660) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pv.ab(" + ')');
        }
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2, final int n3) throws IOException {
        try {
            this.sink.write(array, n, n2, (byte)(-78));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pv.ab(" + ')');
        }
    }
    
    @Override
    public void close(final int n) {
        try {
            this.sink.close(663754894);
            try {
                this.socket.close();
            }
            catch (IOException ex2) {}
            BufferedSource.es(this.source, -1118938495);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pv.aq(" + ')');
        }
    }
    
    @Override
    public int aj(final byte[] array, final int n, final int n2) throws IOException {
        return this.source.read(array, n, n2, 130409839);
    }
    
    @Override
    public int ag() throws IOException {
        return this.source.available((byte)57);
    }
    
    @Override
    public int ah() throws IOException {
        return this.source.readUnsignedByte((short)21079);
    }
    
    protected void aha() {
        this.close(-954350717);
    }
}
