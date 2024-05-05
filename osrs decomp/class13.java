import org.bouncycastle.crypto.tls.TlsAuthentication;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.Certificate;
import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.DefaultTlsClient;

// 
// Decompiled by Procyon v0.5.36
// 

class class13 extends DefaultTlsClient
{
    static final int cb = 5;
    static final int av = 14;
    public static final int bw = 67;
    static IndexedSprite worldSelectRightSprite;
    static int field43;
    final /* synthetic */ class12 this$1;
    static final int ak = 24;
    static final int af = 200000000;
    
    class13(final class12 this$1) {
        this.this$1 = this$1;
    }
    
    static final byte[] decompressBytes(final byte[] array, final int n) {
        final Buffer yp = Buffer.yp(array);
        final int oo = yp.oo();
        final int ev = yp.ev();
        if (ev < 0) {
            throw new RuntimeException();
        }
        if (oo == 0) {
            final byte[] array2 = new byte[ev];
            yp.to(array2, 0, ev);
            return array2;
        }
        final int ev2 = yp.ev();
        if (ev2 < 0) {
            throw new RuntimeException();
        }
        final byte[] array3 = new byte[ev2];
        if (oo == 1) {
            Archive.ww(array3, ev2, array, ev, 9);
        }
        else {
            synchronized (AbstractArchive.gzipDecompressor) {
                AbstractArchive.gzipDecompressor.yg(yp, array3);
            }
        }
        return array3;
    }
    
    static boolean getTapToDrop(final int n) {
        try {
            return Client.tapToDrop;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ai.lr(" + ')');
        }
    }
    
    public Hashtable aw() throws IOException {
        Hashtable<Integer, byte[]> clientExtensions = (Hashtable<Integer, byte[]>)super.getClientExtensions();
        if (null == clientExtensions) {
            clientExtensions = new Hashtable<Integer, byte[]>();
        }
        final byte[] bytes = this.this$1.val$host.getBytes();
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream = new DataOutputStream(out);
        dataOutputStream.writeShort(bytes.length + 3);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(bytes.length);
        dataOutputStream.write(bytes);
        dataOutputStream.close();
        clientExtensions.put(0, out.toByteArray());
        return clientExtensions;
    }
    
    static int method48(final int n, final Script script, final boolean b, final short n2) {
        try {
            if (1927 != n) {
                if (n2 != 511) {
                    throw new IllegalStateException();
                }
                if (n == 2927) {
                    if (n2 != 511) {
                        throw new IllegalStateException();
                    }
                }
                else if (1928 == n) {
                    if (n2 != 511) {
                        throw new IllegalStateException();
                    }
                    Widget widget;
                    if (b) {
                        if (n2 != 511) {
                            throw new IllegalStateException();
                        }
                        widget = SoundSystem.scriptDotWidget;
                    }
                    else {
                        widget = class1.scriptActiveWidget;
                    }
                    final Widget widget2 = widget;
                    final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                    if (n3 >= 1) {
                        if (n2 != 511) {
                            throw new IllegalStateException();
                        }
                        if (n3 <= 10) {
                            Interpreter.field690.add(new class97(n3, 1713081171 * widget2.id, widget2.childIndex * 55577617, widget2.itemId * -2006098851));
                            return 1;
                        }
                        if (n2 != 511) {
                            throw new IllegalStateException();
                        }
                    }
                    throw new RuntimeException();
                }
                else {
                    if (n != 2928) {
                        return 2;
                    }
                    if (n2 != 511) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStackSize -= 1281407919;
                    final int n4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                    final int n5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                    final int n6 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
                    if (n6 >= 1) {
                        if (n6 <= 10) {
                            Interpreter.field690.add(new class97(n6, n4, n5, class165.vmethod3380(n4, (byte)5).itemId * -2006098851));
                            return 1;
                        }
                        if (n2 != 511) {
                            throw new IllegalStateException();
                        }
                    }
                    throw new RuntimeException();
                }
            }
            if (1484376709 * Interpreter.field703 >= 10) {
                if (n2 != 511) {
                    throw new IllegalStateException();
                }
                throw new RuntimeException();
            }
            else {
                Widget vmethod3380;
                if (n >= 2000) {
                    if (n2 != 511) {
                        throw new IllegalStateException();
                    }
                    vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
                }
                else {
                    vmethod3380 = (b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget);
                }
                if (vmethod3380.onResize != null) {
                    final ScriptEvent scriptEvent = new ScriptEvent();
                    scriptEvent.dragTarget = vmethod3380;
                    scriptEvent.args = vmethod3380.onResize;
                    scriptEvent.field859 = -1685365847 + Interpreter.field703 * 815462605;
                    Client.scriptEvents.addFirst(scriptEvent);
                    return 1;
                }
                if (n2 != 511) {
                    throw new IllegalStateException();
                }
                return 0;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ai.am(" + ')');
        }
    }
    
    public static void et(final Player player) {
        if (player == null) {
            player.bz();
        }
        player.isInFriendsChat = TriBool.TriBool_unknown;
    }
    
    static final void drawWidgets(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final byte b) {
        try {
            if (SoundSystem.loadInterface(n, 1376777516)) {
                WorldMapSection2.field2292 = null;
                class11.drawInterface(VerticalAlignment.Widget_interfaceComponents[n], -1, n2, n3, n4, n5, n6, n7, n8, -465475629);
                if (null != WorldMapSection2.field2292) {
                    class11.drawInterface(WorldMapSection2.field2292, -1412584499, n2, n3, n4, n5, 1983519339 * class230.field2130, class101.field1082 * -2041029009, n8, -465475629);
                    WorldMapSection2.field2292 = null;
                }
                return;
            }
            if (b >= 0) {
                throw new IllegalStateException();
            }
            if (-1 != n8) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                Client.field573[n8] = true;
            }
            else {
                for (int i = 0; i < 100; ++i) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    Client.field573[i] = true;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ai.lk(" + ')');
        }
    }
    
    public Hashtable an() throws IOException {
        Hashtable<Integer, byte[]> clientExtensions = (Hashtable<Integer, byte[]>)super.getClientExtensions();
        if (null == clientExtensions) {
            clientExtensions = new Hashtable<Integer, byte[]>();
        }
        final byte[] bytes = this.this$1.val$host.getBytes();
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream = new DataOutputStream(out);
        dataOutputStream.writeShort(bytes.length + 3);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(bytes.length);
        dataOutputStream.write(bytes);
        dataOutputStream.close();
        clientExtensions.put(0, out.toByteArray());
        return clientExtensions;
    }
    
    public Hashtable ac() throws IOException {
        Hashtable<Integer, byte[]> clientExtensions = (Hashtable<Integer, byte[]>)super.getClientExtensions();
        if (null == clientExtensions) {
            clientExtensions = new Hashtable<Integer, byte[]>();
        }
        final byte[] bytes = this.this$1.val$host.getBytes();
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream = new DataOutputStream(out);
        dataOutputStream.writeShort(bytes.length + 3);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(bytes.length);
        dataOutputStream.write(bytes);
        dataOutputStream.close();
        clientExtensions.put(0, out.toByteArray());
        return clientExtensions;
    }
    
    static void doWorldSorting(final int n, final int n2, final int n3, final boolean b, final int n4, final boolean b2, final int n5) {
        try {
            if (n < n2) {
                if (n5 <= 177258591) {
                    throw new IllegalStateException();
                }
                final int n6 = (n + n2) / 2;
                int n7 = n;
                final World world = class31.World_worlds[n6];
                class31.World_worlds[n6] = class31.World_worlds[n2];
                class31.World_worlds[n2] = world;
                for (int i = n; i < n2; ++i) {
                    final World world2 = class31.World_worlds[i];
                    final int compareWorlds = class297.compareWorlds(world2, world, n3, b, (byte)52);
                    int n8;
                    if (compareWorlds != 0) {
                        if (n5 <= 177258591) {
                            throw new IllegalStateException();
                        }
                        if (b) {
                            if (n5 <= 177258591) {
                                throw new IllegalStateException();
                            }
                            n8 = -compareWorlds;
                        }
                        else {
                            n8 = compareWorlds;
                        }
                    }
                    else if (n4 == -1) {
                        if (n5 <= 177258591) {
                            throw new IllegalStateException();
                        }
                        n8 = 0;
                    }
                    else {
                        final int compareWorlds2 = class297.compareWorlds(world2, world, n4, b2, (byte)115);
                        if (b2) {
                            if (n5 <= 177258591) {
                                return;
                            }
                            n8 = -compareWorlds2;
                        }
                        else {
                            n8 = compareWorlds2;
                        }
                    }
                    if (n8 <= 0) {
                        if (n5 <= 177258591) {
                            throw new IllegalStateException();
                        }
                        final World world3 = class31.World_worlds[i];
                        class31.World_worlds[i] = class31.World_worlds[n7];
                        class31.World_worlds[n7++] = world3;
                    }
                }
                class31.World_worlds[n2] = class31.World_worlds[n7];
                class31.World_worlds[n7] = world;
                doWorldSorting(n, n7 - 1, n3, b, n4, b2, 1620808109);
                doWorldSorting(n7 + 1, n2, n3, b, n4, b2, 1610801400);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ai.au(" + ')');
        }
    }
    
    public Hashtable doWorldSorting() throws IOException {
        Hashtable<Integer, byte[]> clientExtensions = (Hashtable<Integer, byte[]>)super.getClientExtensions();
        if (null == clientExtensions) {
            clientExtensions = new Hashtable<Integer, byte[]>();
        }
        final byte[] bytes = this.this$1.val$host.getBytes();
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream = new DataOutputStream(out);
        dataOutputStream.writeShort(bytes.length + 3);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(bytes.length);
        dataOutputStream.write(bytes);
        dataOutputStream.close();
        clientExtensions.put(0, out.toByteArray());
        return clientExtensions;
    }
    
    public static Certificate[] ii(final class17 class17) throws SSLPeerUnverifiedException {
        return class17.this$1.field40;
    }
    
    static boolean method46(final Player player, final int n) {
        try {
            if (0 == -1387790283 * Client.drawPlayerNames) {
                if (n <= -409959323) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                if (player == MusicPatchNode.localPlayer) {
                    boolean b;
                    if (0x0 != (-1387790283 * Client.drawPlayerNames & 0x8)) {
                        if (n <= -409959323) {
                            throw new IllegalStateException();
                        }
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    return b;
                }
                if (n <= -409959323) {
                    throw new IllegalStateException();
                }
                int n2;
                if ((-1387790283 * Client.drawPlayerNames & 0x4) != 0x0) {
                    if (n <= -409959323) {
                        throw new IllegalStateException();
                    }
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                int n3 = n2;
                if (n3 == 0) {
                    if (n <= -409959323) {
                        throw new IllegalStateException();
                    }
                    boolean b2;
                    if (0x0 != (Client.drawPlayerNames * -1387790283 & 0x1)) {
                        if (n <= -409959323) {
                            throw new IllegalStateException();
                        }
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    boolean b3 = false;
                    Label_0191: {
                        if (b2) {
                            if (n <= -409959323) {
                                throw new IllegalStateException();
                            }
                            if (Player.yc(player, -1545521422)) {
                                if (n <= -409959323) {
                                    throw new IllegalStateException();
                                }
                                b3 = true;
                                break Label_0191;
                            }
                        }
                        b3 = false;
                    }
                    n3 = (b3 ? 1 : 0);
                }
                int n4 = n3;
                if (n4 == 0) {
                    if (n <= -409959323) {
                        throw new IllegalStateException();
                    }
                    boolean b4;
                    if (0x0 != (Client.drawPlayerNames * -1387790283 & 0x2)) {
                        if (n <= -409959323) {
                            throw new IllegalStateException();
                        }
                        b4 = true;
                    }
                    else {
                        b4 = false;
                    }
                    boolean b5;
                    if (b4 && Player.zk(player, (byte)(-33))) {
                        if (n <= -409959323) {
                            throw new IllegalStateException();
                        }
                        b5 = true;
                    }
                    else {
                        b5 = false;
                    }
                    n4 = (b5 ? 1 : 0);
                }
                return n4 != 0;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ai.jj(" + ')');
        }
    }
    
    public Hashtable af() throws IOException {
        Hashtable<Integer, byte[]> clientExtensions = (Hashtable<Integer, byte[]>)super.getClientExtensions();
        if (null == clientExtensions) {
            clientExtensions = new Hashtable<Integer, byte[]>();
        }
        final byte[] bytes = this.this$1.val$host.getBytes();
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream = new DataOutputStream(out);
        dataOutputStream.writeShort(bytes.length + 3);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(bytes.length);
        dataOutputStream.write(bytes);
        dataOutputStream.close();
        clientExtensions.put(0, out.toByteArray());
        return clientExtensions;
    }
    
    public Hashtable ab() throws IOException {
        Hashtable<Integer, byte[]> clientExtensions = (Hashtable<Integer, byte[]>)super.getClientExtensions();
        if (null == clientExtensions) {
            clientExtensions = new Hashtable<Integer, byte[]>();
        }
        final byte[] bytes = this.this$1.val$host.getBytes();
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream = new DataOutputStream(out);
        dataOutputStream.writeShort(bytes.length + 3);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(bytes.length);
        dataOutputStream.write(bytes);
        dataOutputStream.close();
        clientExtensions.put(0, out.toByteArray());
        return clientExtensions;
    }
    
    public TlsAuthentication aq() throws IOException {
        return (TlsAuthentication)new class11(this);
    }
    
    public Hashtable getClientExtensions() throws IOException {
        try {
            Hashtable<Integer, byte[]> clientExtensions = (Hashtable<Integer, byte[]>)super.getClientExtensions();
            if (null == clientExtensions) {
                clientExtensions = new Hashtable<Integer, byte[]>();
            }
            final byte[] bytes = this.this$1.val$host.getBytes();
            final ByteArrayOutputStream out = new ByteArrayOutputStream();
            final DataOutputStream dataOutputStream = new DataOutputStream(out);
            dataOutputStream.writeShort(bytes.length + 3);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeShort(bytes.length);
            dataOutputStream.write(bytes);
            dataOutputStream.close();
            clientExtensions.put(0, out.toByteArray());
            return clientExtensions;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ai.getClientExtensions(" + ')');
        }
    }
    
    public TlsAuthentication getAuthentication() throws IOException {
        try {
            return (TlsAuthentication)new class11(this);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ai.getAuthentication(" + ')');
        }
    }
}
