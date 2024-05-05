import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class class177
{
    final /* synthetic */ class166 this$0;
    static final int aw = 1;
    String field1468;
    static final byte bb = 126;
    static final int ad = 26;
    public static final int an = 0;
    
    class177(final class166 this$0, final String field1468) {
        this.this$0 = this$0;
        this.field1468 = field1468;
    }
    
    public String method963(final byte b) {
        try {
            return this.field1468;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gn.ao(" + ')');
        }
    }
    
    public int at() {
        return -1;
    }
    
    public int ay() {
        return -1;
    }
    
    public abstract int aw();
    
    public int vmethod3378(final int n) {
        try {
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gn.al(" + ')');
        }
    }
    
    public static void vmethod3380(final boolean b, final int n) {
        try {
            if (null != NetCache.NetCache_socket) {
                try {
                    final Buffer buffer2;
                    final Buffer buffer = buffer2 = new Buffer(4);
                    int n2;
                    if (b) {
                        if (n <= 901407888) {
                            throw new IllegalStateException();
                        }
                        n2 = 2;
                    }
                    else {
                        n2 = 3;
                    }
                    buffer2.writeShort(n2, (byte)83);
                    Buffer.gi(buffer, 0, 677397190);
                    NetCache.NetCache_socket.write(buffer.array, 0, 4, -2115422184);
                }
                catch (IOException ex2) {
                    try {
                        NetCache.NetCache_socket.close(1813299129);
                    }
                    catch (Exception ex3) {}
                    NetCache.NetCache_ioExceptions -= 161323731;
                    NetCache.NetCache_socket = null;
                }
                return;
            }
            if (n <= 901407888) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gn.an(" + ')');
        }
    }
    
    public String vmethod3380(final byte b) {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gn.an(" + ')');
        }
    }
    
    public abstract int ac();
    
    public static void lb(final Player player) {
        if (player == null) {
            player.getId();
        }
        player.isInClanChat = TriBool.TriBool_unknown;
    }
    
    public abstract int au();
    
    public int aa() {
        return -1;
    }
    
    public abstract int vmethod3379(final byte p0);
    
    public String ab() {
        return null;
    }
    
    public String aq() {
        return null;
    }
    
    public static void wk(final ClanChannel clanChannel, final ClanChannelMember clanChannelMember) {
        clanChannel.members.add(clanChannelMember);
        clanChannel.sortedMembers = null;
    }
}
