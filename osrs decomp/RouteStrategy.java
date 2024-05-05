import java.net.URL;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class RouteStrategy
{
    public static AbstractRasterProvider rasterProvider;
    public static MusicTrack musicTrack;
    public int approxDestinationSizeX;
    public int approxDestinationSizeY;
    public int approxDestinationY;
    static final int cn = 72;
    public int approxDestinationX;
    
    protected RouteStrategy() {
    }
    
    static boolean method1177(final String s, final int n, final String s2, final int n2) {
        try {
            if (n == 0) {
                try {
                    if (!class31.field91.startsWith("win")) {
                        throw new Exception();
                    }
                    if (!s.startsWith("http://")) {
                        if (n2 >= -340055648) {
                            throw new IllegalStateException();
                        }
                        if (!s.startsWith("https://")) {
                            throw new Exception();
                        }
                    }
                    final String s3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    int i = 0;
                    while (i < s.length()) {
                        if (s3.indexOf(s.charAt(i)) == -1) {
                            if (n2 >= -340055648) {
                                throw new IllegalStateException();
                            }
                            throw new Exception();
                        }
                        else {
                            ++i;
                        }
                    }
                    Runtime.getRuntime().exec("cmd /c start \"j\" \"" + s + "\"");
                    return true;
                }
                catch (Throwable t) {
                    return false;
                }
            }
            if (1 == n) {
                if (n2 >= -340055648) {
                    throw new IllegalStateException();
                }
                try {
                    boolean b;
                    if (class26.method113(class31.field90, s2, new Object[] { new URL(class31.field90.getCodeBase(), s).toString() }, -1806937261) != null) {
                        if (n2 >= -340055648) {
                            throw new IllegalStateException();
                        }
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    return b;
                }
                catch (Throwable t2) {
                    return false;
                }
            }
            if (2 == n) {
                try {
                    class31.field90.getAppletContext().showDocument(new URL(class31.field90.getCodeBase(), s), "_blank");
                    return true;
                }
                catch (Exception ex2) {
                    return false;
                }
            }
            if (3 == n) {
                if (n2 >= -340055648) {
                    throw new IllegalStateException();
                }
                try {
                    class26.method112(class31.field90, "loggedout", (byte)(-25));
                }
                catch (Throwable t3) {}
                try {
                    class31.field90.getAppletContext().showDocument(new URL(class31.field90.getCodeBase(), s), "_top");
                    return true;
                }
                catch (Exception ex3) {
                    return false;
                }
            }
            throw new IllegalArgumentException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ia.aw(" + ')');
        }
    }
    
    protected abstract boolean method1177(final int p0, final int p1, final int p2, final CollisionMap p3);
    
    protected abstract boolean an(final int p0, final int p1, final int p2, final CollisionMap p3);
    
    protected abstract boolean method1176(final int p0, final int p1, final int p2, final CollisionMap p3);
    
    public static byte[] method1176(final CharSequence charSequence, final int n) {
        try {
            final int length = charSequence.length();
            final byte[] array = new byte[length];
            for (int i = 0; i < length; ++i) {
                if (n != 267322236) {
                    throw new IllegalStateException();
                }
                final char char1 = charSequence.charAt(i);
                Label_0211: {
                    if (char1 > '\0') {
                        if (n != 267322236) {
                            throw new IllegalStateException();
                        }
                        if (char1 < '\u0080') {
                            break Label_0211;
                        }
                        if (n != 267322236) {
                            throw new IllegalStateException();
                        }
                    }
                    if (char1 >= ' ') {
                        if (n != 267322236) {
                            throw new IllegalStateException();
                        }
                        if (char1 <= '\u00ff') {
                            break Label_0211;
                        }
                    }
                    if ('\u20ac' == char1) {
                        array[i] = -128;
                        continue;
                    }
                    if ('\u201a' == char1) {
                        array[i] = -126;
                        continue;
                    }
                    if ('\u0192' == char1) {
                        if (n != 267322236) {
                            throw new IllegalStateException();
                        }
                        array[i] = -125;
                        continue;
                    }
                    else {
                        if ('\u201e' == char1) {
                            array[i] = -124;
                            continue;
                        }
                        if ('\u2026' == char1) {
                            if (n != 267322236) {
                                throw new IllegalStateException();
                            }
                            array[i] = -123;
                            continue;
                        }
                        else if ('\u2020' == char1) {
                            if (n != 267322236) {
                                throw new IllegalStateException();
                            }
                            array[i] = -122;
                            continue;
                        }
                        else if (char1 == '\u2021') {
                            if (n != 267322236) {
                                throw new IllegalStateException();
                            }
                            array[i] = -121;
                            continue;
                        }
                        else if (char1 == '\u02c6') {
                            if (n != 267322236) {
                                throw new IllegalStateException();
                            }
                            array[i] = -120;
                            continue;
                        }
                        else {
                            if ('\u2030' == char1) {
                                array[i] = -119;
                                continue;
                            }
                            if (char1 == '\u0160') {
                                array[i] = -118;
                                continue;
                            }
                            if (char1 == '\u2039') {
                                if (n != 267322236) {
                                    throw new IllegalStateException();
                                }
                                array[i] = -117;
                                continue;
                            }
                            else if (char1 == '\u0152') {
                                if (n != 267322236) {
                                    throw new IllegalStateException();
                                }
                                array[i] = -116;
                                continue;
                            }
                            else if (char1 == '\u017d') {
                                if (n != 267322236) {
                                    throw new IllegalStateException();
                                }
                                array[i] = -114;
                                continue;
                            }
                            else if ('\u2018' == char1) {
                                if (n != 267322236) {
                                    throw new IllegalStateException();
                                }
                                array[i] = -111;
                                continue;
                            }
                            else {
                                if ('\u2019' == char1) {
                                    array[i] = -110;
                                    continue;
                                }
                                if (char1 == '\u201c') {
                                    if (n != 267322236) {
                                        throw new IllegalStateException();
                                    }
                                    array[i] = -109;
                                    continue;
                                }
                                else {
                                    if (char1 == '\u201d') {
                                        array[i] = -108;
                                        continue;
                                    }
                                    if (char1 == '\u2022') {
                                        array[i] = -107;
                                        continue;
                                    }
                                    if ('\u2013' == char1) {
                                        if (n != 267322236) {
                                            throw new IllegalStateException();
                                        }
                                        array[i] = -106;
                                        continue;
                                    }
                                    else if ('\u2014' == char1) {
                                        if (n != 267322236) {
                                            throw new IllegalStateException();
                                        }
                                        array[i] = -105;
                                        continue;
                                    }
                                    else if (char1 == '\u02dc') {
                                        if (n != 267322236) {
                                            throw new IllegalStateException();
                                        }
                                        array[i] = -104;
                                        continue;
                                    }
                                    else if (char1 == '\u2122') {
                                        if (n != 267322236) {
                                            throw new IllegalStateException();
                                        }
                                        array[i] = -103;
                                        continue;
                                    }
                                    else if ('\u0161' == char1) {
                                        if (n != 267322236) {
                                            throw new IllegalStateException();
                                        }
                                        array[i] = -102;
                                        continue;
                                    }
                                    else if ('\u203a' == char1) {
                                        if (n != 267322236) {
                                            throw new IllegalStateException();
                                        }
                                        array[i] = -101;
                                        continue;
                                    }
                                    else if ('\u0153' == char1) {
                                        if (n != 267322236) {
                                            throw new IllegalStateException();
                                        }
                                        array[i] = -100;
                                        continue;
                                    }
                                    else if (char1 == '\u017e') {
                                        if (n != 267322236) {
                                            throw new IllegalStateException();
                                        }
                                        array[i] = -98;
                                        continue;
                                    }
                                    else {
                                        if (char1 != '\u0178') {
                                            array[i] = 63;
                                            continue;
                                        }
                                        if (n != 267322236) {
                                            throw new IllegalStateException();
                                        }
                                        array[i] = -97;
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
                array[i] = (byte)char1;
            }
            return array;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ia.ac(" + ')');
        }
    }
    
    protected abstract boolean au(final int p0, final int p1, final int p2, final CollisionMap p3);
    
    static final void addNpcsToScene(final boolean b, final short n) {
        try {
            for (int i = 0; i < 265474485 * Client.npcCount; ++i) {
                final NPC npc = Client.npcs[Client.npcIndices[i]];
                if (npc != null && npc.isVisible(1666539507)) {
                    if (n <= 128) {
                        throw new IllegalStateException();
                    }
                    if (b == npc.definition.isVisible) {
                        if (n <= 128) {
                            throw new IllegalStateException();
                        }
                        if (npc.definition.transformIsVisible(41635170)) {
                            if (n <= 128) {
                                throw new IllegalStateException();
                            }
                            final int n2 = npc.br * 1144428983 >> 7;
                            final int n3 = npc.ep * -411750205 >> 7;
                            if (n2 >= 0) {
                                if (n <= 128) {
                                    return;
                                }
                                if (n2 < 104) {
                                    if (n <= 128) {
                                        return;
                                    }
                                    if (n3 >= 0) {
                                        if (n <= 128) {
                                            return;
                                        }
                                        if (n3 < 104) {
                                            if (n <= 128) {
                                                throw new IllegalStateException();
                                            }
                                            if (1 == npc.bt * 353040509) {
                                                if (n <= 128) {
                                                    throw new IllegalStateException();
                                                }
                                                if (0x40 == (npc.br * 1144428983 & 0x7F)) {
                                                    if (n <= 128) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (0x40 == (-411750205 * npc.ep & 0x7F)) {
                                                        if (n <= 128) {
                                                            throw new IllegalStateException();
                                                        }
                                                        if (Client.viewportDrawCount * 2041464667 == Client.tileLastDrawnActor[n2][n3]) {
                                                            if (n <= 128) {
                                                                return;
                                                            }
                                                            continue;
                                                        }
                                                        else {
                                                            Client.tileLastDrawnActor[n2][n3] = 2041464667 * Client.viewportDrawCount;
                                                        }
                                                    }
                                                }
                                            }
                                            final long calculateTag = FaceNormal.calculateTag(0, 0, 1, !npc.definition.isInteractable, Client.npcIndices[i], -71163605);
                                            npc.cx = -14183397 * Client.cycle;
                                            class31.scene.drawEntity(GameEngine.Client_plane * -1727408401, 1144428983 * npc.br, -411750205 * npc.ep, class147.getTileHeight(1119756096 * npc.bt - 64 + 1144428983 * npc.br, 1119756096 * npc.bt - 64 + npc.ep * -411750205, -1727408401 * GameEngine.Client_plane, (byte)8), 60 + (1119756096 * npc.bt - 64), npc, npc.dx * -1703696531, calculateTag, npc.an);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ia.jc(" + ')');
        }
    }
    
    protected abstract boolean hasArrived(final int p0, final int p1, final int p2, final CollisionMap p3, final int p4);
    
    protected abstract boolean ab(final int p0, final int p1, final int p2, final CollisionMap p3);
}
