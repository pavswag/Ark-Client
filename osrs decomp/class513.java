import java.io.File;

// 
// Decompiled by Procyon v0.5.36
// 

public class class513
{
    static final int aw = 50;
    public static File FileSystem_cacheDir;
    static final int ao = 31;
    
    class513() throws Throwable {
        throw new Error();
    }
    
    public static PacketBufferNode aw(final int n, String s, final Language language, final int n2) {
        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2476, Client.packetWriter.isaacCipher, (short)(-18225));
        packetBufferNode.packetBuffer.bf(0, (byte)29);
        final int n3 = -1633313603 * packetBufferNode.packetBuffer.at;
        packetBufferNode.packetBuffer.bf(n, (byte)76);
        final String lowerCase = s.toLowerCase();
        int n4 = 0;
        if (lowerCase.startsWith(Strings.hs)) {
            n4 = 0;
            s = s.substring(Strings.hs.length());
        }
        else if (lowerCase.startsWith(Strings.hl)) {
            n4 = 1;
            s = s.substring(Strings.hl.length());
        }
        else if (lowerCase.startsWith(Strings.hr)) {
            n4 = 2;
            s = s.substring(Strings.hr.length());
        }
        else if (lowerCase.startsWith(Strings.hg)) {
            n4 = 3;
            s = s.substring(Strings.hg.length());
        }
        else if (lowerCase.startsWith(Strings.ht)) {
            n4 = 4;
            s = s.substring(Strings.ht.length());
        }
        else if (lowerCase.startsWith(Strings.hq)) {
            n4 = 5;
            s = s.substring(Strings.hq.length());
        }
        else if (lowerCase.startsWith(Strings.hk)) {
            n4 = 6;
            s = s.substring(Strings.hk.length());
        }
        else if (lowerCase.startsWith(Strings.hp)) {
            n4 = 7;
            s = s.substring(Strings.hp.length());
        }
        else if (lowerCase.startsWith(Strings.hf)) {
            n4 = 8;
            s = s.substring(Strings.hf.length());
        }
        else if (lowerCase.startsWith(Strings.if)) {
            n4 = 9;
            s = s.substring(Strings.if.length());
        }
        else if (lowerCase.startsWith(Strings.iu)) {
            n4 = 10;
            s = s.substring(Strings.iu.length());
        }
        else if (lowerCase.startsWith(Strings.iy)) {
            n4 = 11;
            s = s.substring(Strings.iy.length());
        }
        else if (Language.Language_EN != language) {
            if (lowerCase.startsWith(Strings.hn)) {
                n4 = 0;
                s = s.substring(Strings.hn.length());
            }
            else if (lowerCase.startsWith(Strings.hh)) {
                n4 = 1;
                s = s.substring(Strings.hh.length());
            }
            else if (lowerCase.startsWith(Strings.hc)) {
                n4 = 2;
                s = s.substring(Strings.hc.length());
            }
            else if (lowerCase.startsWith(Strings.ho)) {
                n4 = 3;
                s = s.substring(Strings.ho.length());
            }
            else if (lowerCase.startsWith(Strings.hb)) {
                n4 = 4;
                s = s.substring(Strings.hb.length());
            }
            else if (lowerCase.startsWith(Strings.hz)) {
                n4 = 5;
                s = s.substring(Strings.hz.length());
            }
            else if (lowerCase.startsWith(Strings.ha)) {
                n4 = 6;
                s = s.substring(Strings.ha.length());
            }
            else if (lowerCase.startsWith(Strings.he)) {
                n4 = 7;
                s = s.substring(Strings.he.length());
            }
            else if (lowerCase.startsWith(Strings.hy)) {
                n4 = 8;
                s = s.substring(Strings.hy.length());
            }
            else if (lowerCase.startsWith(Strings.ia)) {
                n4 = 9;
                s = s.substring(Strings.ia.length());
            }
            else if (lowerCase.startsWith(Strings.iw)) {
                n4 = 10;
                s = s.substring(Strings.iw.length());
            }
            else if (lowerCase.startsWith(Strings.iz)) {
                n4 = 11;
                s = s.substring(Strings.iz.length());
            }
        }
        final String lowerCase2 = s.toLowerCase();
        int n5 = 0;
        if (lowerCase2.startsWith(Strings.ig)) {
            n5 = 1;
            s = s.substring(Strings.ig.length());
        }
        else if (lowerCase2.startsWith(Strings.il)) {
            n5 = 2;
            s = s.substring(Strings.il.length());
        }
        else if (lowerCase2.startsWith(Strings.in)) {
            n5 = 3;
            s = s.substring(Strings.in.length());
        }
        else if (lowerCase2.startsWith(Strings.ii)) {
            n5 = 4;
            s = s.substring(Strings.ii.length());
        }
        else if (lowerCase2.startsWith(Strings.ie)) {
            n5 = 5;
            s = s.substring(Strings.ie.length());
        }
        else if (Language.Language_EN != language) {
            if (lowerCase2.startsWith(Strings.ih)) {
                n5 = 1;
                s = s.substring(Strings.ih.length());
            }
            else if (lowerCase2.startsWith(Strings.is)) {
                n5 = 2;
                s = s.substring(Strings.is.length());
            }
            else if (lowerCase2.startsWith(Strings.ic)) {
                n5 = 3;
                s = s.substring(Strings.ic.length());
            }
            else if (lowerCase2.startsWith(Strings.ik)) {
                n5 = 4;
                s = s.substring(Strings.ik.length());
            }
            else if (lowerCase2.startsWith(Strings.iq)) {
                n5 = 5;
                s = s.substring(Strings.iq.length());
            }
        }
        packetBufferNode.packetBuffer.bf(n4, (byte)101);
        packetBufferNode.packetBuffer.bf(n5, (byte)87);
        WorldMapArea.readWorldMapSection(packetBufferNode.packetBuffer, s, -53610141);
        if (n == class324.field3040.rsOrdinal(897135367)) {
            packetBufferNode.packetBuffer.bf(n2, (byte)53);
        }
        packetBufferNode.packetBuffer.cu(packetBufferNode.packetBuffer.at * -1633313603 - n3, -23565935);
        return packetBufferNode;
    }
    
    public static PacketBufferNode an(final int n, String s, final Language language, final int n2) {
        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2476, Client.packetWriter.isaacCipher, (short)(-31444));
        packetBufferNode.packetBuffer.bf(0, (byte)121);
        final int n3 = -1633313603 * packetBufferNode.packetBuffer.at;
        packetBufferNode.packetBuffer.bf(n, (byte)38);
        final String lowerCase = s.toLowerCase();
        int n4 = 0;
        if (lowerCase.startsWith(Strings.hs)) {
            n4 = 0;
            s = s.substring(Strings.hs.length());
        }
        else if (lowerCase.startsWith(Strings.hl)) {
            n4 = 1;
            s = s.substring(Strings.hl.length());
        }
        else if (lowerCase.startsWith(Strings.hr)) {
            n4 = 2;
            s = s.substring(Strings.hr.length());
        }
        else if (lowerCase.startsWith(Strings.hg)) {
            n4 = 3;
            s = s.substring(Strings.hg.length());
        }
        else if (lowerCase.startsWith(Strings.ht)) {
            n4 = 4;
            s = s.substring(Strings.ht.length());
        }
        else if (lowerCase.startsWith(Strings.hq)) {
            n4 = 5;
            s = s.substring(Strings.hq.length());
        }
        else if (lowerCase.startsWith(Strings.hk)) {
            n4 = 6;
            s = s.substring(Strings.hk.length());
        }
        else if (lowerCase.startsWith(Strings.hp)) {
            n4 = 7;
            s = s.substring(Strings.hp.length());
        }
        else if (lowerCase.startsWith(Strings.hf)) {
            n4 = 8;
            s = s.substring(Strings.hf.length());
        }
        else if (lowerCase.startsWith(Strings.if)) {
            n4 = 9;
            s = s.substring(Strings.if.length());
        }
        else if (lowerCase.startsWith(Strings.iu)) {
            n4 = 10;
            s = s.substring(Strings.iu.length());
        }
        else if (lowerCase.startsWith(Strings.iy)) {
            n4 = 11;
            s = s.substring(Strings.iy.length());
        }
        else if (Language.Language_EN != language) {
            if (lowerCase.startsWith(Strings.hn)) {
                n4 = 0;
                s = s.substring(Strings.hn.length());
            }
            else if (lowerCase.startsWith(Strings.hh)) {
                n4 = 1;
                s = s.substring(Strings.hh.length());
            }
            else if (lowerCase.startsWith(Strings.hc)) {
                n4 = 2;
                s = s.substring(Strings.hc.length());
            }
            else if (lowerCase.startsWith(Strings.ho)) {
                n4 = 3;
                s = s.substring(Strings.ho.length());
            }
            else if (lowerCase.startsWith(Strings.hb)) {
                n4 = 4;
                s = s.substring(Strings.hb.length());
            }
            else if (lowerCase.startsWith(Strings.hz)) {
                n4 = 5;
                s = s.substring(Strings.hz.length());
            }
            else if (lowerCase.startsWith(Strings.ha)) {
                n4 = 6;
                s = s.substring(Strings.ha.length());
            }
            else if (lowerCase.startsWith(Strings.he)) {
                n4 = 7;
                s = s.substring(Strings.he.length());
            }
            else if (lowerCase.startsWith(Strings.hy)) {
                n4 = 8;
                s = s.substring(Strings.hy.length());
            }
            else if (lowerCase.startsWith(Strings.ia)) {
                n4 = 9;
                s = s.substring(Strings.ia.length());
            }
            else if (lowerCase.startsWith(Strings.iw)) {
                n4 = 10;
                s = s.substring(Strings.iw.length());
            }
            else if (lowerCase.startsWith(Strings.iz)) {
                n4 = 11;
                s = s.substring(Strings.iz.length());
            }
        }
        final String lowerCase2 = s.toLowerCase();
        int n5 = 0;
        if (lowerCase2.startsWith(Strings.ig)) {
            n5 = 1;
            s = s.substring(Strings.ig.length());
        }
        else if (lowerCase2.startsWith(Strings.il)) {
            n5 = 2;
            s = s.substring(Strings.il.length());
        }
        else if (lowerCase2.startsWith(Strings.in)) {
            n5 = 3;
            s = s.substring(Strings.in.length());
        }
        else if (lowerCase2.startsWith(Strings.ii)) {
            n5 = 4;
            s = s.substring(Strings.ii.length());
        }
        else if (lowerCase2.startsWith(Strings.ie)) {
            n5 = 5;
            s = s.substring(Strings.ie.length());
        }
        else if (Language.Language_EN != language) {
            if (lowerCase2.startsWith(Strings.ih)) {
                n5 = 1;
                s = s.substring(Strings.ih.length());
            }
            else if (lowerCase2.startsWith(Strings.is)) {
                n5 = 2;
                s = s.substring(Strings.is.length());
            }
            else if (lowerCase2.startsWith(Strings.ic)) {
                n5 = 3;
                s = s.substring(Strings.ic.length());
            }
            else if (lowerCase2.startsWith(Strings.ik)) {
                n5 = 4;
                s = s.substring(Strings.ik.length());
            }
            else if (lowerCase2.startsWith(Strings.iq)) {
                n5 = 5;
                s = s.substring(Strings.iq.length());
            }
        }
        packetBufferNode.packetBuffer.bf(n4, (byte)43);
        packetBufferNode.packetBuffer.bf(n5, (byte)19);
        WorldMapArea.readWorldMapSection(packetBufferNode.packetBuffer, s, -53610141);
        if (n == class324.field3040.rsOrdinal(1156764717)) {
            packetBufferNode.packetBuffer.bf(n2, (byte)86);
        }
        packetBufferNode.packetBuffer.cu(packetBufferNode.packetBuffer.at * -1633313603 - n3, -1262728292);
        return packetBufferNode;
    }
    
    public static PacketBufferNode ac(final int n, String s, final Language language, final int n2) {
        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2476, Client.packetWriter.isaacCipher, (short)(-27474));
        packetBufferNode.packetBuffer.bf(0, (byte)49);
        final int n3 = -1633313603 * packetBufferNode.packetBuffer.at;
        packetBufferNode.packetBuffer.bf(n, (byte)5);
        final String lowerCase = s.toLowerCase();
        int n4 = 0;
        if (lowerCase.startsWith(Strings.hs)) {
            n4 = 0;
            s = s.substring(Strings.hs.length());
        }
        else if (lowerCase.startsWith(Strings.hl)) {
            n4 = 1;
            s = s.substring(Strings.hl.length());
        }
        else if (lowerCase.startsWith(Strings.hr)) {
            n4 = 2;
            s = s.substring(Strings.hr.length());
        }
        else if (lowerCase.startsWith(Strings.hg)) {
            n4 = 3;
            s = s.substring(Strings.hg.length());
        }
        else if (lowerCase.startsWith(Strings.ht)) {
            n4 = 4;
            s = s.substring(Strings.ht.length());
        }
        else if (lowerCase.startsWith(Strings.hq)) {
            n4 = 5;
            s = s.substring(Strings.hq.length());
        }
        else if (lowerCase.startsWith(Strings.hk)) {
            n4 = 6;
            s = s.substring(Strings.hk.length());
        }
        else if (lowerCase.startsWith(Strings.hp)) {
            n4 = 7;
            s = s.substring(Strings.hp.length());
        }
        else if (lowerCase.startsWith(Strings.hf)) {
            n4 = 8;
            s = s.substring(Strings.hf.length());
        }
        else if (lowerCase.startsWith(Strings.if)) {
            n4 = 9;
            s = s.substring(Strings.if.length());
        }
        else if (lowerCase.startsWith(Strings.iu)) {
            n4 = 10;
            s = s.substring(Strings.iu.length());
        }
        else if (lowerCase.startsWith(Strings.iy)) {
            n4 = 11;
            s = s.substring(Strings.iy.length());
        }
        else if (Language.Language_EN != language) {
            if (lowerCase.startsWith(Strings.hn)) {
                n4 = 0;
                s = s.substring(Strings.hn.length());
            }
            else if (lowerCase.startsWith(Strings.hh)) {
                n4 = 1;
                s = s.substring(Strings.hh.length());
            }
            else if (lowerCase.startsWith(Strings.hc)) {
                n4 = 2;
                s = s.substring(Strings.hc.length());
            }
            else if (lowerCase.startsWith(Strings.ho)) {
                n4 = 3;
                s = s.substring(Strings.ho.length());
            }
            else if (lowerCase.startsWith(Strings.hb)) {
                n4 = 4;
                s = s.substring(Strings.hb.length());
            }
            else if (lowerCase.startsWith(Strings.hz)) {
                n4 = 5;
                s = s.substring(Strings.hz.length());
            }
            else if (lowerCase.startsWith(Strings.ha)) {
                n4 = 6;
                s = s.substring(Strings.ha.length());
            }
            else if (lowerCase.startsWith(Strings.he)) {
                n4 = 7;
                s = s.substring(Strings.he.length());
            }
            else if (lowerCase.startsWith(Strings.hy)) {
                n4 = 8;
                s = s.substring(Strings.hy.length());
            }
            else if (lowerCase.startsWith(Strings.ia)) {
                n4 = 9;
                s = s.substring(Strings.ia.length());
            }
            else if (lowerCase.startsWith(Strings.iw)) {
                n4 = 10;
                s = s.substring(Strings.iw.length());
            }
            else if (lowerCase.startsWith(Strings.iz)) {
                n4 = 11;
                s = s.substring(Strings.iz.length());
            }
        }
        final String lowerCase2 = s.toLowerCase();
        int n5 = 0;
        if (lowerCase2.startsWith(Strings.ig)) {
            n5 = 1;
            s = s.substring(Strings.ig.length());
        }
        else if (lowerCase2.startsWith(Strings.il)) {
            n5 = 2;
            s = s.substring(Strings.il.length());
        }
        else if (lowerCase2.startsWith(Strings.in)) {
            n5 = 3;
            s = s.substring(Strings.in.length());
        }
        else if (lowerCase2.startsWith(Strings.ii)) {
            n5 = 4;
            s = s.substring(Strings.ii.length());
        }
        else if (lowerCase2.startsWith(Strings.ie)) {
            n5 = 5;
            s = s.substring(Strings.ie.length());
        }
        else if (Language.Language_EN != language) {
            if (lowerCase2.startsWith(Strings.ih)) {
                n5 = 1;
                s = s.substring(Strings.ih.length());
            }
            else if (lowerCase2.startsWith(Strings.is)) {
                n5 = 2;
                s = s.substring(Strings.is.length());
            }
            else if (lowerCase2.startsWith(Strings.ic)) {
                n5 = 3;
                s = s.substring(Strings.ic.length());
            }
            else if (lowerCase2.startsWith(Strings.ik)) {
                n5 = 4;
                s = s.substring(Strings.ik.length());
            }
            else if (lowerCase2.startsWith(Strings.iq)) {
                n5 = 5;
                s = s.substring(Strings.iq.length());
            }
        }
        packetBufferNode.packetBuffer.bf(n4, (byte)72);
        packetBufferNode.packetBuffer.bf(n5, (byte)37);
        WorldMapArea.readWorldMapSection(packetBufferNode.packetBuffer, s, -53610141);
        if (n == class324.field3040.rsOrdinal(892604826)) {
            packetBufferNode.packetBuffer.bf(n2, (byte)21);
        }
        packetBufferNode.packetBuffer.cu(packetBufferNode.packetBuffer.at * -1633313603 - n3, 778161361);
        return packetBufferNode;
    }
    
    public static PacketBufferNode au(final int n, String s, final Language language, final int n2) {
        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2476, Client.packetWriter.isaacCipher, (short)(-8410));
        packetBufferNode.packetBuffer.bf(0, (byte)110);
        final int n3 = 955968017 * packetBufferNode.packetBuffer.at;
        packetBufferNode.packetBuffer.bf(n, (byte)6);
        final String lowerCase = s.toLowerCase();
        int n4 = 0;
        if (lowerCase.startsWith(Strings.hs)) {
            n4 = 0;
            s = s.substring(Strings.hs.length());
        }
        else if (lowerCase.startsWith(Strings.hl)) {
            n4 = 1;
            s = s.substring(Strings.hl.length());
        }
        else if (lowerCase.startsWith(Strings.hr)) {
            n4 = 2;
            s = s.substring(Strings.hr.length());
        }
        else if (lowerCase.startsWith(Strings.hg)) {
            n4 = 3;
            s = s.substring(Strings.hg.length());
        }
        else if (lowerCase.startsWith(Strings.ht)) {
            n4 = 4;
            s = s.substring(Strings.ht.length());
        }
        else if (lowerCase.startsWith(Strings.hq)) {
            n4 = 5;
            s = s.substring(Strings.hq.length());
        }
        else if (lowerCase.startsWith(Strings.hk)) {
            n4 = 6;
            s = s.substring(Strings.hk.length());
        }
        else if (lowerCase.startsWith(Strings.hp)) {
            n4 = 7;
            s = s.substring(Strings.hp.length());
        }
        else if (lowerCase.startsWith(Strings.hf)) {
            n4 = 8;
            s = s.substring(Strings.hf.length());
        }
        else if (lowerCase.startsWith(Strings.if)) {
            n4 = 9;
            s = s.substring(Strings.if.length());
        }
        else if (lowerCase.startsWith(Strings.iu)) {
            n4 = 10;
            s = s.substring(Strings.iu.length());
        }
        else if (lowerCase.startsWith(Strings.iy)) {
            n4 = 11;
            s = s.substring(Strings.iy.length());
        }
        else if (Language.Language_EN != language) {
            if (lowerCase.startsWith(Strings.hn)) {
                n4 = 0;
                s = s.substring(Strings.hn.length());
            }
            else if (lowerCase.startsWith(Strings.hh)) {
                n4 = 1;
                s = s.substring(Strings.hh.length());
            }
            else if (lowerCase.startsWith(Strings.hc)) {
                n4 = 2;
                s = s.substring(Strings.hc.length());
            }
            else if (lowerCase.startsWith(Strings.ho)) {
                n4 = 3;
                s = s.substring(Strings.ho.length());
            }
            else if (lowerCase.startsWith(Strings.hb)) {
                n4 = 4;
                s = s.substring(Strings.hb.length());
            }
            else if (lowerCase.startsWith(Strings.hz)) {
                n4 = 5;
                s = s.substring(Strings.hz.length());
            }
            else if (lowerCase.startsWith(Strings.ha)) {
                n4 = 6;
                s = s.substring(Strings.ha.length());
            }
            else if (lowerCase.startsWith(Strings.he)) {
                n4 = 7;
                s = s.substring(Strings.he.length());
            }
            else if (lowerCase.startsWith(Strings.hy)) {
                n4 = 8;
                s = s.substring(Strings.hy.length());
            }
            else if (lowerCase.startsWith(Strings.ia)) {
                n4 = 9;
                s = s.substring(Strings.ia.length());
            }
            else if (lowerCase.startsWith(Strings.iw)) {
                n4 = 10;
                s = s.substring(Strings.iw.length());
            }
            else if (lowerCase.startsWith(Strings.iz)) {
                n4 = 11;
                s = s.substring(Strings.iz.length());
            }
        }
        final String lowerCase2 = s.toLowerCase();
        int n5 = 0;
        if (lowerCase2.startsWith(Strings.ig)) {
            n5 = 1;
            s = s.substring(Strings.ig.length());
        }
        else if (lowerCase2.startsWith(Strings.il)) {
            n5 = 2;
            s = s.substring(Strings.il.length());
        }
        else if (lowerCase2.startsWith(Strings.in)) {
            n5 = 3;
            s = s.substring(Strings.in.length());
        }
        else if (lowerCase2.startsWith(Strings.ii)) {
            n5 = 4;
            s = s.substring(Strings.ii.length());
        }
        else if (lowerCase2.startsWith(Strings.ie)) {
            n5 = 5;
            s = s.substring(Strings.ie.length());
        }
        else if (Language.Language_EN != language) {
            if (lowerCase2.startsWith(Strings.ih)) {
                n5 = 1;
                s = s.substring(Strings.ih.length());
            }
            else if (lowerCase2.startsWith(Strings.is)) {
                n5 = 2;
                s = s.substring(Strings.is.length());
            }
            else if (lowerCase2.startsWith(Strings.ic)) {
                n5 = 3;
                s = s.substring(Strings.ic.length());
            }
            else if (lowerCase2.startsWith(Strings.ik)) {
                n5 = 4;
                s = s.substring(Strings.ik.length());
            }
            else if (lowerCase2.startsWith(Strings.iq)) {
                n5 = 5;
                s = s.substring(Strings.iq.length());
            }
        }
        packetBufferNode.packetBuffer.bf(n4, (byte)90);
        packetBufferNode.packetBuffer.bf(n5, (byte)97);
        WorldMapArea.readWorldMapSection(packetBufferNode.packetBuffer, s, -53610141);
        if (n == class324.field3040.rsOrdinal(1783750358)) {
            packetBufferNode.packetBuffer.bf(n2, (byte)14);
        }
        packetBufferNode.packetBuffer.cu(packetBufferNode.packetBuffer.at * 1491813518 - n3, 51164652);
        return packetBufferNode;
    }
}
