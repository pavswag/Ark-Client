import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class class20
{
    final String field62;
    final Map field63;
    final int field64;
    public static final int ak = 47;
    static ClientPreferences clientPreferences;
    static final int bi = 2;
    
    class20(final HttpURLConnection httpURLConnection) throws IOException {
        this.field64 = httpURLConnection.getResponseCode() * -1146261411;
        httpURLConnection.getResponseMessage();
        this.field63 = httpURLConnection.getHeaderFields();
        final StringBuilder sb = new StringBuilder();
        final InputStream in = (-673848331 * this.field64 >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
        if (in != null) {
            String line;
            while ((line = new BufferedReader(new InputStreamReader(in)).readLine()) != null) {
                sb.append(line);
            }
            in.close();
        }
        this.field62 = sb.toString();
    }
    
    class20(final String s) {
        this.field64 = 1056936272;
        this.field63 = null;
        this.field62 = "";
    }
    
    public String at() {
        return this.field62;
    }
    
    public static void up(final PacketWriter packetWriter, final PacketBufferNode packetBufferNode) {
        if (packetWriter == null) {
            packetWriter.ar();
            return;
        }
        packetWriter.packetBufferNodes.addFirst(packetBufferNode);
        packetBufferNode.index = -1120134497 * packetBufferNode.packetBuffer.at;
        packetBufferNode.packetBuffer.at = 0;
        packetWriter.bufferSize += packetBufferNode.index * -56666229;
    }
    
    public String method81(final int n) {
        try {
            return this.field62;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aj.aw(" + ')');
        }
    }
    
    public String al() {
        return this.field62;
    }
    
    public Map method80(final int n) {
        try {
            return this.field63;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aj.an(" + ')');
        }
    }
    
    static int method83(final int n, final int n2, final int n3) {
        try {
            final long n4 = n2 + (n << 16);
            if (Script.NetCache_currentResponse != null) {
                if (n3 != -964267539) {
                    throw new IllegalStateException();
                }
                if (Script.NetCache_currentResponse.hr == n4) {
                    return 1510710551 * NetCache.NetCache_responseArchiveBuffer.offset / (NetCache.NetCache_responseArchiveBuffer.array.length - Script.NetCache_currentResponse.padding) + 1;
                }
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aj.ac(" + ')');
        }
    }
    
    public int au() {
        return this.field64 * -673848331;
    }
    
    public static class383 wx(final class314 class314) {
        return class314.field2851.method2035(542296527 * class314.field2853, class314.field2852 * 1681960994, (byte)75);
    }
    
    public int method79(final int n) {
        try {
            return this.field64 * -673848331;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aj.af(" + ')');
        }
    }
    
    public static Map cz(final class20 class20, final int n) {
        if (class20 == null) {
            return class20.method80(n);
        }
        try {
            return class20.field63;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aj.an(" + ')');
        }
    }
    
    public int ab() {
        return this.field64 * -1973670823;
    }
    
    public Map aq() {
        return this.field63;
    }
    
    public static int method82(final int n, final int n2) {
        try {
            final class133 class133 = (class133)SequenceDefinition.SequenceDefinition_cachedModel.wr(n);
            class133 class134;
            if (class133 != null) {
                if (n2 != 854271946) {
                    throw new IllegalStateException();
                }
                class134 = class133;
            }
            else {
                final class133 method1180 = class211.method1180(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, n, false, 1641739959);
                if (null != method1180) {
                    if (n2 != 854271946) {
                        throw new IllegalStateException();
                    }
                    SequenceDefinition.SequenceDefinition_cachedModel.put(method1180, n);
                }
                class134 = method1180;
            }
            final class133 class135 = class134;
            if (null != class135) {
                int n3;
                if (class135.method774(-63286081)) {
                    if (n2 != 854271946) {
                        throw new IllegalStateException();
                    }
                    n3 = 0;
                }
                else {
                    n3 = 1;
                }
                return n3;
            }
            if (n2 != 854271946) {
                throw new IllegalStateException();
            }
            return 2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aj.ag(" + ')');
        }
    }
    
    public static void yp(final MidiPcmStream midiPcmStream, final int n, final int n2, final int n3) {
        final MusicPatchNode musicPatchNode = midiPcmStream.field2753[n][n2];
        if (null == musicPatchNode) {
            return;
        }
        midiPcmStream.field2753[n][n2] = null;
        if (0x0 != (midiPcmStream.field2746[n] & 0x2)) {
            for (MusicPatchNode musicPatchNode2 = (MusicPatchNode)midiPcmStream.patchStream.queue.last(); null != musicPatchNode2; musicPatchNode2 = (MusicPatchNode)midiPcmStream.patchStream.queue.previous()) {
                if (1667899725 * musicPatchNode2.field2801 == -461993591 * musicPatchNode.field2801 && musicPatchNode2.field2798 * -602614853 < 0 && musicPatchNode2 != musicPatchNode) {
                    musicPatchNode.field2798 = 0;
                    break;
                }
            }
        }
        else {
            musicPatchNode.field2798 = 0;
        }
    }
}
