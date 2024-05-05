import net.runelite.api.MenuEntry;
import net.runelite.api.events.MenuOptionClicked;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.Principal;
import javax.net.ssl.SSLSession;

// 
// Decompiled by Procyon v0.5.36
// 

class class17 implements SSLSession
{
    final /* synthetic */ class12 this$1;
    static final int bd = 10;
    public static int[] SpriteBuffer_yOffsets;
    
    class17(final class12 this$1) {
        this.this$1 = this$1;
    }
    
    @Override
    public Object getValue(final String s) {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getValue(" + ')');
        }
    }
    
    public int ad() {
        return 0;
    }
    
    public Principal ae() throws SSLPeerUnverifiedException {
        return null;
    }
    
    public Principal bb() throws SSLPeerUnverifiedException {
        return null;
    }
    
    @Override
    public byte[] getId() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getId(" + ')');
        }
    }
    
    public int ao() {
        throw new UnsupportedOperationException();
    }
    
    public Certificate[] at() {
        throw new UnsupportedOperationException();
    }
    
    public X509Certificate[] av() throws SSLPeerUnverifiedException {
        return null;
    }
    
    public static boolean rv(final class17 class17) {
        if (class17 == null) {
            class17.getPeerCertificates();
        }
        throw new UnsupportedOperationException();
    }
    
    public String be() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public String getProtocol() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getProtocol(" + ')');
        }
    }
    
    public Certificate[] as() throws SSLPeerUnverifiedException {
        return this.this$1.field40;
    }
    
    public int az() {
        return 0;
    }
    
    public int ax() {
        throw new UnsupportedOperationException();
    }
    
    public String bi() {
        throw new UnsupportedOperationException();
    }
    
    public static int ms(final Buffer buffer) {
        if (buffer == null) {
            buffer.if();
        }
        buffer.offset += 1262255402;
        return ((buffer.array[-1633313603 * buffer.offset - 2] & 0xFF) << 8) + (buffer.array[buffer.offset * -1633313603 - 1] - 128 & 0xFF);
    }
    
    public String[] bt() {
        throw new UnsupportedOperationException();
    }
    
    public void br(final String s, final Object o) {
        throw new UnsupportedOperationException();
    }
    
    public static void ne(final class17 class17, final String s) {
        if (class17 == null) {
            class17.av();
        }
        throw new UnsupportedOperationException();
    }
    
    public int aw() {
        return 0;
    }
    
    public Certificate[] am() throws SSLPeerUnverifiedException {
        return this.this$1.field40;
    }
    
    @Override
    public boolean isValid() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.isValid(" + ')');
        }
    }
    
    public Certificate[] al() {
        throw new UnsupportedOperationException();
    }
    
    public int an() {
        return 0;
    }
    
    @Override
    public void putValue(final String s, final Object o) {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.putValue(" + ')');
        }
    }
    
    @Override
    public long getCreationTime() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getCreationTime(" + ')');
        }
    }
    
    @Override
    public void invalidate() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.invalidate(" + ')');
        }
    }
    
    public static long fo(final class17 class17) {
        if (class17 == null) {
            class17.ae();
        }
        throw new UnsupportedOperationException();
    }
    
    public static Object fm(final class17 class17, final String s) {
        if (class17 == null) {
            class17.aw();
        }
        throw new UnsupportedOperationException();
    }
    
    public Principal aa() {
        throw new UnsupportedOperationException();
    }
    
    public int ai() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public SSLSessionContext getSessionContext() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getSessionContext(" + ')');
        }
    }
    
    @Override
    public long getLastAccessedTime() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getLastAccessedTime(" + ')');
        }
    }
    
    @Override
    public void removeValue(final String s) {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.removeValue(" + ')');
        }
    }
    
    @Override
    public String[] getValueNames() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getValueNames(" + ')');
        }
    }
    
    @Override
    public Certificate[] getLocalCertificates() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getLocalCertificates(" + ')');
        }
    }
    
    @Override
    public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getPeerCertificateChain(" + ')');
        }
    }
    
    @Override
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getPeerPrincipal(" + ')');
        }
    }
    
    @Override
    public Principal getLocalPrincipal() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getLocalPrincipal(" + ')');
        }
    }
    
    @Override
    public String getCipherSuite() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getCipherSuite(" + ')');
        }
    }
    
    @Override
    public int getPacketBufferSize() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getPacketBufferSize(" + ')');
        }
    }
    
    @Override
    public int getApplicationBufferSize() {
        try {
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getApplicationBufferSize(" + ')');
        }
    }
    
    static final void menuAction(final int n, final int n2, final int n3, final int n4, final int n5, final String s, final String targetName, final int n6, final int n7, final int n8) {
        Object o = null;
        for (int i = Client.menuOptionsCount * 730065501 - 1; i >= 0; --i) {
            if (Client.menuOpcodes[i] == n3 && Client.menuIdentifiers[i] == n4 && Client.menuArguments1[i] == n && Client.menuArguments2[i] == n2 && Client.menuItemIds[i] == n5 && Client.menuActions[i] == s && Client.menuTargets[i] == targetName && (Client.qi[i] == null || Client.qi[i].ai == Client.tk)) {
                o = Client.ix[i];
                break;
            }
        }
        boolean b = false;
        if (Language.tempMenuAction != null) {
            b = (Language.tempMenuAction.xc() == n3 && Language.tempMenuAction.dg() == n4 && Language.tempMenuAction.mp() == s && Language.tempMenuAction.yi() == targetName && Language.tempMenuAction.kk() == n && Language.tempMenuAction.tj() == n2 && Language.tempMenuAction.xx() == n5);
        }
        if (o == null && b) {
            int n10;
            if (Client.menuOptionsCount * 730065501 < 500) {
                final int n9 = Client.menuOptionsCount * 730065501;
                Client.menuOptionsCount = (n9 + 1) * 1153055221;
                n10 = n9;
            }
            else {
                n10 = 0;
            }
            Client.menuOpcodes[n10] = n3;
            Client.menuIdentifiers[n10] = n4;
            Client.menuActions[n10] = s;
            Client.menuTargets[n10] = targetName;
            Client.menuArguments1[n10] = n;
            Client.menuArguments2[n10] = n2;
            Client.menuItemIds[n10] = n5;
            Client.menuShiftClick[n10] = false;
            Client.qi[n10] = null;
            o = Client.ix[n10];
            if (o == null) {
                final rl3[] ix = Client.ix;
                final int n11 = n10;
                final rl3 rl3 = new rl3(n10);
                ix[n11] = rl3;
                o = rl3;
            }
        }
        if (o == null) {
            if (n6 != -1 || n7 != -1) {
                Client.nw.warn("Unable to find clicked menu op {} targ {} action {} id {} p0 {} p1 {}", new Object[] { s, targetName, n3, n4, n, n2 });
            }
        }
        else {
            Client.nw.trace("Menu click op {} targ {} action {} id {} p0 {} p1 {}", new Object[] { s, targetName, n3, n4, n, n2 });
            final MenuOptionClicked menuOptionClicked = new MenuOptionClicked((MenuEntry)o);
            ScriptFrame.client.getCallbacks().post((Object)menuOptionClicked);
            if (((rl3)o).jj != null) {
                try {
                    ((rl3)o).jj.accept(o);
                }
                catch (Exception ex) {
                    Client.nw.warn("exception in menu callback", (Throwable)ex);
                }
            }
            if (menuOptionClicked.isConsumed()) {
                return;
            }
        }
        int n12 = n3;
        final int n13 = -1745540313;
        if (n12 >= 2000) {
            n12 -= 2000;
        }
        if (n12 == 11) {
            if (n13 == 408462048) {
                return;
            }
            if (null != Client.npcs[n4]) {
                Client.mouseCrossX = n6 * 1956692579;
                Client.mouseCrossY = 956660059 * n7;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = -1970850269 * n;
                Client.destinationY = 875414437 * n2;
                final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher, (short)(-20479));
                Buffer.ap(packetBufferNode.packetBuffer, n4, (byte)121);
                packetBufferNode.packetBuffer.eb((int)(Client.keyHandlerInstance.getKeyPressed(82, -963444701) ? 1 : 0), (byte)(-51));
                Client.packetWriter.addNode(packetBufferNode, 414135591);
            }
        }
        if (6 == n12) {
            if (n13 == 408462048) {
                return;
            }
            Client.mouseCrossX = 1956692579 * n6;
            Client.mouseCrossY = 956660059 * n7;
            Client.mouseCrossColor = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * n;
            Client.destinationY = 875414437 * n2;
            final PacketBufferNode packetBufferNode2 = class330.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher, (short)(-9192));
            packetBufferNode2.packetBuffer.bu(n4, (byte)64);
            packetBufferNode2.packetBuffer.eb((int)(Client.keyHandlerInstance.getKeyPressed(82, 488442551) ? 1 : 0), (byte)(-69));
            packetBufferNode2.packetBuffer.bu(n2 + 827352769 * GameObject.baseY, (byte)7);
            Buffer.ap(packetBufferNode2.packetBuffer, -1232093375 * WorldMapData_0.baseX + n, (byte)18);
            Client.packetWriter.addNode(packetBufferNode2, 414135591);
        }
        if (13 == n12 && Client.npcs[n4] != null) {
            if (n13 == 408462048) {
                return;
            }
            Client.mouseCrossX = n6 * 1956692579;
            Client.mouseCrossY = n7 * 956660059;
            Client.mouseCrossColor = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = n * -1970850269;
            Client.destinationY = n2 * 875414437;
            final PacketBufferNode packetBufferNode3 = class330.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher, (short)(-26365));
            final PacketBuffer packetBuffer = packetBufferNode3.packetBuffer;
            int n14;
            if (Client.keyHandlerInstance.getKeyPressed(82, 467304309)) {
                if (n13 == 408462048) {
                    return;
                }
                n14 = 1;
            }
            else {
                n14 = 0;
            }
            packetBuffer.bf(n14, (byte)61);
            packetBufferNode3.packetBuffer.bu(n4, (byte)12);
            Client.packetWriter.addNode(packetBufferNode3, 414135591);
        }
        if (5 == n12) {
            Client.mouseCrossX = 1956692579 * n6;
            Client.mouseCrossY = 956660059 * n7;
            Client.mouseCrossColor = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = n * -1970850269;
            Client.destinationY = 875414437 * n2;
            final PacketBufferNode packetBufferNode4 = class330.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher, (short)(-28885));
            packetBufferNode4.packetBuffer.ds(WorldMapData_0.baseX * -1232093375 + n, -964759202);
            Buffer.ap(packetBufferNode4.packetBuffer, n4, (byte)124);
            packetBufferNode4.packetBuffer.ds(827352769 * GameObject.baseY + n2, -1837608814);
            packetBufferNode4.packetBuffer.dp((int)(Client.keyHandlerInstance.getKeyPressed(82, 839573717) ? 1 : 0), -395479012);
            Client.packetWriter.addNode(packetBufferNode4, 414135591);
        }
        Label_1410: {
            if (n12 != 1008 && n12 != 1009) {
                if (n13 == 408462048) {
                    return;
                }
                if (n12 != 1010 && n12 != 1011) {
                    if (n13 == 408462048) {
                        return;
                    }
                    if (1012 != n12) {
                        break Label_1410;
                    }
                }
            }
            class126.worldMap.worldMapMenuAction(n12, n4, new Coord(n), new Coord(n2), -1912180740);
        }
        if (19 == n12) {
            Client.mouseCrossX = n6 * 1956692579;
            Client.mouseCrossY = n7 * 956660059;
            Client.mouseCrossColor = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = n * -1970850269;
            Client.destinationY = 875414437 * n2;
            final PacketBufferNode packetBufferNode5 = class330.getPacketBufferNode(ClientPacket.field2498, Client.packetWriter.isaacCipher, (short)(-18950));
            packetBufferNode5.packetBuffer.bu(n2 + GameObject.baseY * 827352769, (byte)60);
            packetBufferNode5.packetBuffer.ds(n4, -1079733013);
            final PacketBuffer packetBuffer2 = packetBufferNode5.packetBuffer;
            int n15;
            if (Client.keyHandlerInstance.getKeyPressed(82, -1508656553)) {
                if (n13 == 408462048) {
                    return;
                }
                n15 = 1;
            }
            else {
                n15 = 0;
            }
            packetBuffer2.bf(n15, (byte)44);
            packetBufferNode5.packetBuffer.ds(WorldMapData_0.baseX * -1232093375 + n, -1120781738);
            Client.packetWriter.addNode(packetBufferNode5, 414135591);
        }
        if (n12 == 1001) {
            Client.mouseCrossX = n6 * 1956692579;
            Client.mouseCrossY = n7 * 956660059;
            Client.mouseCrossColor = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * n;
            Client.destinationY = 875414437 * n2;
            final PacketBufferNode packetBufferNode6 = class330.getPacketBufferNode(ClientPacket.field2536, Client.packetWriter.isaacCipher, (short)(-28785));
            final PacketBuffer packetBuffer3 = packetBufferNode6.packetBuffer;
            int n16;
            if (Client.keyHandlerInstance.getKeyPressed(82, -452006755)) {
                if (n13 == 408462048) {
                    return;
                }
                n16 = 1;
            }
            else {
                n16 = 0;
            }
            packetBuffer3.dp(n16, 794958996);
            packetBufferNode6.packetBuffer.ds(n4, -1382789465);
            packetBufferNode6.packetBuffer.bu(-1232093375 * WorldMapData_0.baseX + n, (byte)99);
            packetBufferNode6.packetBuffer.ds(n2 + 827352769 * GameObject.baseY, -983425843);
            Client.packetWriter.addNode(packetBufferNode6, 414135591);
        }
        if (23 == n12) {
            if (Client.isMenuOpen) {
                class31.scene.setViewportWalking();
            }
            else {
                class31.scene.menuOpen(GameEngine.Client_plane * -1727408401, n, n2, true);
            }
        }
        if (n12 == 28) {
            final PacketBufferNode packetBufferNode7 = class330.getPacketBufferNode(ClientPacket.field2497, Client.packetWriter.isaacCipher, (short)(-3575));
            packetBufferNode7.packetBuffer.ba(n2, -2081835031);
            Client.packetWriter.addNode(packetBufferNode7, 414135591);
            final Widget vmethod3380 = class165.vmethod3380(n2, (byte)5);
            if (vmethod3380 != null && vmethod3380.cs1Instructions != null && vmethod3380.cs1Instructions[0][0] == 5) {
                final int n17 = vmethod3380.cs1Instructions[0][1];
                Varps.Varps_main[n17] = 1 - Varps.Varps_main[n17];
                Client.ye(n17);
                class7.changeGameOptions(n17, 1644042390);
            }
        }
        if (47 == n12 && Client.players[n4] != null) {
            if (n13 == 408462048) {
                return;
            }
            Client.mouseCrossX = 1956692579 * n6;
            Client.mouseCrossY = n7 * 956660059;
            Client.mouseCrossColor = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = n * -1970850269;
            Client.destinationY = 875414437 * n2;
            final PacketBufferNode packetBufferNode8 = class330.getPacketBufferNode(ClientPacket.field2526, Client.packetWriter.isaacCipher, (short)(-1753));
            packetBufferNode8.packetBuffer.dp((int)(Client.keyHandlerInstance.getKeyPressed(82, -1820811621) ? 1 : 0), 1368766268);
            Buffer.ap(packetBufferNode8.packetBuffer, n4, (byte)127);
            Client.packetWriter.addNode(packetBufferNode8, 414135591);
        }
        if (n12 == 7 && null != Client.npcs[n4]) {
            Client.mouseCrossX = n6 * 1956692579;
            Client.mouseCrossY = n7 * 956660059;
            Client.mouseCrossColor = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = n * -1970850269;
            Client.destinationY = n2 * 875414437;
            final PacketBufferNode packetBufferNode9 = class330.getPacketBufferNode(ClientPacket.field2557, Client.packetWriter.isaacCipher, (short)(-20284));
            packetBufferNode9.packetBuffer.du((int)(Client.keyHandlerInstance.getKeyPressed(82, -402070231) ? 1 : 0), -1237486138);
            packetBufferNode9.packetBuffer.ba(-1164741861 * class294.field2713, -2081835031);
            packetBufferNode9.packetBuffer.bu(n4, (byte)26);
            packetBufferNode9.packetBuffer.ds(class144.field1333 * -1518641849, -1435170690);
            packetBufferNode9.packetBuffer.cq(896780031 * WorldMapSectionType.field2385, (byte)(-84));
            Client.packetWriter.addNode(packetBufferNode9, 414135591);
        }
        if (n12 == 50 && null != Client.players[n4]) {
            Client.mouseCrossX = 1956692579 * n6;
            Client.mouseCrossY = 956660059 * n7;
            Client.mouseCrossColor = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * n;
            Client.destinationY = n2 * 875414437;
            final PacketBufferNode packetBufferNode10 = class330.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher, (short)(-13816));
            packetBufferNode10.packetBuffer.ds(n4, -1625962834);
            final PacketBuffer packetBuffer4 = packetBufferNode10.packetBuffer;
            int n18;
            if (Client.keyHandlerInstance.getKeyPressed(82, 901653330)) {
                if (n13 == 408462048) {
                    return;
                }
                n18 = 1;
            }
            else {
                n18 = 0;
            }
            packetBuffer4.eb(n18, (byte)(-57));
            Client.packetWriter.addNode(packetBufferNode10, 414135591);
        }
        if (n12 == 10) {
            if (n13 == 408462048) {
                return;
            }
            if (Client.npcs[n4] != null) {
                if (n13 == 408462048) {
                    return;
                }
                Client.mouseCrossX = 1956692579 * n6;
                Client.mouseCrossY = n7 * 956660059;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = -1970850269 * n;
                Client.destinationY = n2 * 875414437;
                final PacketBufferNode packetBufferNode11 = class330.getPacketBufferNode(ClientPacket.CLICK, Client.packetWriter.isaacCipher, (short)(-13200));
                packetBufferNode11.packetBuffer.bu(n4, (byte)36);
                packetBufferNode11.packetBuffer.eb((int)(Client.keyHandlerInstance.getKeyPressed(82, -747232375) ? 1 : 0), (byte)(-115));
                Client.packetWriter.addNode(packetBufferNode11, 414135591);
            }
        }
        Label_7222: {
            if (57 != n12) {
                if (n12 != 1007) {
                    break Label_7222;
                }
                if (n13 == 408462048) {
                    return;
                }
            }
            if (SoundSystem.getWidgetChild(n2, n, -310708295) != null) {
                Message.widgetDefaultMenuAction(n4, n2, n, n5, targetName, 1238902143);
            }
        }
        if (14 == n12 && null != Client.players[n4]) {
            Client.mouseCrossX = 1956692579 * n6;
            Client.mouseCrossY = n7 * 956660059;
            Client.mouseCrossColor = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = n * -1970850269;
            Client.destinationY = 875414437 * n2;
            final PacketBufferNode packetBufferNode12 = class330.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher, (short)(-2806));
            packetBufferNode12.packetBuffer.cq(n4, (byte)7);
            final PacketBuffer packetBuffer5 = packetBufferNode12.packetBuffer;
            int n19;
            if (Client.keyHandlerInstance.getKeyPressed(82, -1518424530)) {
                if (n13 == 408462048) {
                    return;
                }
                n19 = 1;
            }
            else {
                n19 = 0;
            }
            packetBuffer5.eb(n19, (byte)(-17));
            packetBufferNode12.packetBuffer.bu(896780031 * WorldMapSectionType.field2385, (byte)92);
            packetBufferNode12.packetBuffer.ba(class294.field2713 * -1164741861, -2081835031);
            packetBufferNode12.packetBuffer.cq(class144.field1333 * -1518641849, (byte)(-33));
            Client.packetWriter.addNode(packetBufferNode12, 414135591);
        }
        if (n12 == 48) {
            if (n13 == 408462048) {
                return;
            }
            if (null != Client.players[n4]) {
                Client.mouseCrossX = n6 * 1956692579;
                Client.mouseCrossY = 956660059 * n7;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = -1970850269 * n;
                Client.destinationY = n2 * 875414437;
                final PacketBufferNode packetBufferNode13 = class330.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher, (short)(-20191));
                packetBufferNode13.packetBuffer.dp((int)(Client.keyHandlerInstance.getKeyPressed(82, 459980631) ? 1 : 0), 634727631);
                packetBufferNode13.packetBuffer.cq(n4, (byte)10);
                Client.packetWriter.addNode(packetBufferNode13, 414135591);
            }
        }
        if (n12 == 9 && Client.npcs[n4] != null) {
            Client.mouseCrossX = n6 * 1956692579;
            Client.mouseCrossY = n7 * 956660059;
            Client.mouseCrossColor = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * n;
            Client.destinationY = 875414437 * n2;
            final PacketBufferNode packetBufferNode14 = class330.getPacketBufferNode(ClientPacket.field2555, Client.packetWriter.isaacCipher, (short)(-9205));
            packetBufferNode14.packetBuffer.bf((int)(Client.keyHandlerInstance.getKeyPressed(82, 774077599) ? 1 : 0), (byte)102);
            packetBufferNode14.packetBuffer.ds(n4, -1667371840);
            Client.packetWriter.addNode(packetBufferNode14, 414135591);
        }
        if (51 == n12 && null != Client.players[n4]) {
            Client.mouseCrossX = 1956692579 * n6;
            Client.mouseCrossY = 956660059 * n7;
            Client.mouseCrossColor = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * n;
            Client.destinationY = 875414437 * n2;
            final PacketBufferNode packetBufferNode15 = class330.getPacketBufferNode(ClientPacket.field2472, Client.packetWriter.isaacCipher, (short)(-23183));
            packetBufferNode15.packetBuffer.bu(n4, (byte)110);
            packetBufferNode15.packetBuffer.dp((int)(Client.keyHandlerInstance.getKeyPressed(82, 404877690) ? 1 : 0), 755730100);
            Client.packetWriter.addNode(packetBufferNode15, 414135591);
        }
        if (3 == n12) {
            if (n13 == 408462048) {
                return;
            }
            Client.mouseCrossX = n6 * 1956692579;
            Client.mouseCrossY = 956660059 * n7;
            Client.mouseCrossColor = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = n * -1970850269;
            Client.destinationY = n2 * 875414437;
            final PacketBufferNode packetBufferNode16 = class330.getPacketBufferNode(ClientPacket.field2474, Client.packetWriter.isaacCipher, (short)(-4062));
            Buffer.ap(packetBufferNode16.packetBuffer, -1232093375 * WorldMapData_0.baseX + n, (byte)117);
            packetBufferNode16.packetBuffer.eb((int)(Client.keyHandlerInstance.getKeyPressed(82, 913269766) ? 1 : 0), (byte)(-76));
            packetBufferNode16.packetBuffer.ds(n2 + GameObject.baseY * 827352769, -1630554057);
            packetBufferNode16.packetBuffer.bu(n4, (byte)39);
            Client.packetWriter.addNode(packetBufferNode16, 414135591);
        }
        if (n12 == 25) {
            if (n13 != 408462048) {
                final Widget widgetChild = SoundSystem.getWidgetChild(n2, n, -1518199168);
                if (null != widgetChild) {
                    class166.Widget_runOnTargetLeave((byte)69);
                    class18.selectSpell(n2, n, class195.method1052(KeyHandler.getWidgetFlags(widgetChild, 2051256775), 1258355492), n5, 2133418102);
                    Client.isItemSelected = 0;
                    Client.field530 = MusicPatchNode.Widget_getSpellActionName(widgetChild, 603369429);
                    if (null == Client.field530) {
                        if (n13 == 408462048) {
                            return;
                        }
                        Client.field530 = Strings.at;
                    }
                    if (widgetChild.modelOrthog) {
                        if (n13 != 408462048) {
                            Client.field522 = widgetChild.field3004 + class383.method2081(16777215, -2074377719);
                        }
                    }
                    else {
                        Client.field522 = class383.method2081(65280, 1687344484) + widgetChild.text + class383.method2081(16777215, -1853696006);
                    }
                }
            }
        }
        else {
            if (n12 == 24) {
                if (n13 == 408462048) {
                    return;
                }
                final Widget vmethod3381 = class165.vmethod3380(n2, (byte)5);
                if (null != vmethod3381) {
                    if (n13 == 408462048) {
                        return;
                    }
                    boolean method353 = true;
                    if (1021339961 * vmethod3381.contentType > 0) {
                        method353 = Message.method353(vmethod3381, (byte)(-85));
                    }
                    if (method353) {
                        if (n13 == 408462048) {
                            return;
                        }
                        final PacketBufferNode packetBufferNode17 = class330.getPacketBufferNode(ClientPacket.field2497, Client.packetWriter.isaacCipher, (short)(-28217));
                        packetBufferNode17.packetBuffer.ba(n2, -2081835031);
                        Client.packetWriter.addNode(packetBufferNode17, 414135591);
                    }
                }
            }
            if (n12 == 1003) {
                Client.mouseCrossX = n6 * 1956692579;
                Client.mouseCrossY = n7 * 956660059;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                final NPC npc = Client.npcs[n4];
                if (npc != null) {
                    NPCComposition npcComposition = npc.definition;
                    if (null != npcComposition.transforms) {
                        npcComposition = NPCComposition.ur(npcComposition, 1271441583);
                    }
                    if (null != npcComposition) {
                        final PacketBufferNode packetBufferNode18 = class330.getPacketBufferNode(ClientPacket.field2524, Client.packetWriter.isaacCipher, (short)(-23932));
                        Buffer.ap(packetBufferNode18.packetBuffer, -1115372301 * npcComposition.id, (byte)13);
                        Client.packetWriter.addNode(packetBufferNode18, 414135591);
                    }
                }
            }
            if (20 == n12) {
                Client.mouseCrossX = n6 * 1956692579;
                Client.mouseCrossY = n7 * 956660059;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = -1970850269 * n;
                Client.destinationY = 875414437 * n2;
                final PacketBufferNode packetBufferNode19 = class330.getPacketBufferNode(ClientPacket.field2492, Client.packetWriter.isaacCipher, (short)(-31045));
                packetBufferNode19.packetBuffer.bu(-1232093375 * WorldMapData_0.baseX + n, (byte)121);
                packetBufferNode19.packetBuffer.bf((int)(Client.keyHandlerInstance.getKeyPressed(82, -2095291881) ? 1 : 0), (byte)43);
                packetBufferNode19.packetBuffer.ds(n4, -1437048645);
                packetBufferNode19.packetBuffer.bu(n2 + GameObject.baseY * 827352769, (byte)14);
                Client.packetWriter.addNode(packetBufferNode19, 414135591);
            }
            if (n12 == 49 && Client.players[n4] != null) {
                if (n13 == 408462048) {
                    return;
                }
                Client.mouseCrossX = 1956692579 * n6;
                Client.mouseCrossY = n7 * 956660059;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = -1970850269 * n;
                Client.destinationY = n2 * 875414437;
                final PacketBufferNode packetBufferNode20 = class330.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher, (short)(-3330));
                packetBufferNode20.packetBuffer.bu(n4, (byte)110);
                packetBufferNode20.packetBuffer.dp((int)(Client.keyHandlerInstance.getKeyPressed(82, -192188497) ? 1 : 0), -1213900733);
                Client.packetWriter.addNode(packetBufferNode20, 414135591);
            }
            if (n12 == 8 && Client.npcs[n4] != null) {
                if (n13 == 408462048) {
                    return;
                }
                Client.mouseCrossX = n6 * 1956692579;
                Client.mouseCrossY = 956660059 * n7;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = -1970850269 * n;
                Client.destinationY = n2 * 875414437;
                final PacketBufferNode packetBufferNode21 = class330.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher, (short)(-13757));
                packetBufferNode21.packetBuffer.bu(616923277 * Client.selectedSpellItemId, (byte)11);
                packetBufferNode21.packetBuffer.dy(96656415 * Clips.selectedSpellWidget, (byte)34);
                Buffer.ap(packetBufferNode21.packetBuffer, n4, (byte)20);
                packetBufferNode21.packetBuffer.bu(145251849 * Client.selectedSpellChildIndex, (byte)77);
                packetBufferNode21.packetBuffer.eb((int)(Client.keyHandlerInstance.getKeyPressed(82, -841562540) ? 1 : 0), (byte)(-9));
                Client.packetWriter.addNode(packetBufferNode21, 414135591);
            }
            if (n12 == 2) {
                Client.mouseCrossX = n6 * 1956692579;
                Client.mouseCrossY = 956660059 * n7;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = -1970850269 * n;
                Client.destinationY = n2 * 875414437;
                final PacketBufferNode packetBufferNode22 = class330.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher, (short)(-26325));
                packetBufferNode22.packetBuffer.eb((int)(Client.keyHandlerInstance.getKeyPressed(82, 483976029) ? 1 : 0), (byte)(-21));
                Buffer.ap(packetBufferNode22.packetBuffer, n4, (byte)93);
                Buffer.ap(packetBufferNode22.packetBuffer, Client.selectedSpellItemId * 616923277, (byte)59);
                Buffer.ap(packetBufferNode22.packetBuffer, n + WorldMapData_0.baseX * -1232093375, (byte)117);
                packetBufferNode22.packetBuffer.ds(145251849 * Client.selectedSpellChildIndex, -1500814319);
                packetBufferNode22.packetBuffer.dy(96656415 * Clips.selectedSpellWidget, (byte)28);
                packetBufferNode22.packetBuffer.ds(n2 + 827352769 * GameObject.baseY, -1914484829);
                Client.packetWriter.addNode(packetBufferNode22, 414135591);
            }
            if (n12 == 1002) {
                Client.mouseCrossX = 1956692579 * n6;
                Client.mouseCrossY = n7 * 956660059;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                final PacketBufferNode packetBufferNode23 = class330.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher, (short)(-10243));
                packetBufferNode23.packetBuffer.ds(n4, -1957012874);
                Client.packetWriter.addNode(packetBufferNode23, 414135591);
            }
            if (n12 == 45 && null != Client.players[n4]) {
                Client.mouseCrossX = n6 * 1956692579;
                Client.mouseCrossY = n7 * 956660059;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = -1970850269 * n;
                Client.destinationY = 875414437 * n2;
                final PacketBufferNode packetBufferNode24 = class330.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher, (short)(-5080));
                packetBufferNode24.packetBuffer.eb((int)(Client.keyHandlerInstance.getKeyPressed(82, -767725076) ? 1 : 0), (byte)3);
                Buffer.ap(packetBufferNode24.packetBuffer, n4, (byte)50);
                Client.packetWriter.addNode(packetBufferNode24, 414135591);
            }
            if (n12 == 16) {
                Client.mouseCrossX = n6 * 1956692579;
                Client.mouseCrossY = 956660059 * n7;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = -1970850269 * n;
                Client.destinationY = n2 * 875414437;
                final PacketBufferNode packetBufferNode25 = class330.getPacketBufferNode(ClientPacket.field2479, Client.packetWriter.isaacCipher, (short)(-19780));
                packetBufferNode25.packetBuffer.cq(WorldMapSectionType.field2385 * 896780031, (byte)11);
                packetBufferNode25.packetBuffer.ds(WorldMapData_0.baseX * -1232093375 + n, -2019342265);
                packetBufferNode25.packetBuffer.ds(n4, -973294527);
                packetBufferNode25.packetBuffer.ds(GameObject.baseY * 827352769 + n2, -1028390671);
                packetBufferNode25.packetBuffer.cq(-1518641849 * class144.field1333, (byte)(-53));
                packetBufferNode25.packetBuffer.bf((int)(Client.keyHandlerInstance.getKeyPressed(82, 592259507) ? 1 : 0), (byte)107);
                packetBufferNode25.packetBuffer.dy(-1164741861 * class294.field2713, (byte)(-20));
                Client.packetWriter.addNode(packetBufferNode25, 414135591);
            }
            if (n12 == 46) {
                if (n13 == 408462048) {
                    return;
                }
                if (Client.players[n4] != null) {
                    Client.mouseCrossX = n6 * 1956692579;
                    Client.mouseCrossY = 956660059 * n7;
                    Client.mouseCrossColor = 1387316670;
                    Client.mouseCrossState = 0;
                    Client.destinationX = n * -1970850269;
                    Client.destinationY = n2 * 875414437;
                    final PacketBufferNode packetBufferNode26 = class330.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher, (short)(-18833));
                    Buffer.ap(packetBufferNode26.packetBuffer, n4, (byte)100);
                    packetBufferNode26.packetBuffer.du((int)(Client.keyHandlerInstance.getKeyPressed(82, -1057541553) ? 1 : 0), 1724606894);
                    Client.packetWriter.addNode(packetBufferNode26, 414135591);
                }
            }
            if (4 == n12) {
                if (n13 == 408462048) {
                    return;
                }
                Client.mouseCrossX = 1956692579 * n6;
                Client.mouseCrossY = n7 * 956660059;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = -1970850269 * n;
                Client.destinationY = n2 * 875414437;
                final PacketBufferNode packetBufferNode27 = class330.getPacketBufferNode(ClientPacket.field2513, Client.packetWriter.isaacCipher, (short)(-22882));
                packetBufferNode27.packetBuffer.ds(-1232093375 * WorldMapData_0.baseX + n, -2134313788);
                Buffer.ap(packetBufferNode27.packetBuffer, 827352769 * GameObject.baseY + n2, (byte)105);
                packetBufferNode27.packetBuffer.ds(n4, -1952954736);
                final PacketBuffer packetBuffer6 = packetBufferNode27.packetBuffer;
                int n20;
                if (Client.keyHandlerInstance.getKeyPressed(82, -1377607986)) {
                    if (n13 == 408462048) {
                        return;
                    }
                    n20 = 1;
                }
                else {
                    n20 = 0;
                }
                packetBuffer6.du(n20, -2106697566);
                Client.packetWriter.addNode(packetBufferNode27, 414135591);
            }
            if (n12 == 44 && null != Client.players[n4]) {
                Client.mouseCrossX = 1956692579 * n6;
                Client.mouseCrossY = n7 * 956660059;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = n * -1970850269;
                Client.destinationY = 875414437 * n2;
                final PacketBufferNode packetBufferNode28 = class330.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher, (short)(-27964));
                packetBufferNode28.packetBuffer.du((int)(Client.keyHandlerInstance.getKeyPressed(82, -1070735531) ? 1 : 0), 1007164116);
                packetBufferNode28.packetBuffer.cq(n4, (byte)(-108));
                Client.packetWriter.addNode(packetBufferNode28, 414135591);
            }
            if (n12 == 18) {
                if (n13 == 408462048) {
                    return;
                }
                Client.mouseCrossX = n6 * 1956692579;
                Client.mouseCrossY = n7 * 956660059;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = -1970850269 * n;
                Client.destinationY = n2 * 875414437;
                final PacketBufferNode packetBufferNode29 = class330.getPacketBufferNode(ClientPacket.field2548, Client.packetWriter.isaacCipher, (short)(-28351));
                packetBufferNode29.packetBuffer.ds(n4, -1036211832);
                packetBufferNode29.packetBuffer.cq(GameObject.baseY * 827352769 + n2, (byte)(-54));
                packetBufferNode29.packetBuffer.eb((int)(Client.keyHandlerInstance.getKeyPressed(82, -383379293) ? 1 : 0), (byte)(-64));
                Buffer.ap(packetBufferNode29.packetBuffer, n + WorldMapData_0.baseX * -1232093375, (byte)78);
                Client.packetWriter.addNode(packetBufferNode29, 414135591);
            }
            if (58 == n12) {
                final Widget widgetChild2 = SoundSystem.getWidgetChild(n2, n, -916019851);
                if (widgetChild2 != null) {
                    if (null != widgetChild2.field2984) {
                        final ScriptEvent scriptEvent = new ScriptEvent();
                        scriptEvent.dragTarget = widgetChild2;
                        scriptEvent.opIndex = n4 * -247460251;
                        scriptEvent.targetName = targetName;
                        scriptEvent.args = widgetChild2.field2984;
                        HealthBarUpdate.set(scriptEvent, (byte)16);
                    }
                    final PacketBufferNode packetBufferNode30 = class330.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher, (short)(-20865));
                    Buffer.ap(packetBufferNode30.packetBuffer, n, (byte)66);
                    packetBufferNode30.packetBuffer.cq(n5, (byte)(-1));
                    packetBufferNode30.packetBuffer.el(Clips.selectedSpellWidget * 96656415, -437883978);
                    packetBufferNode30.packetBuffer.ds(145251849 * Client.selectedSpellChildIndex, -1331306803);
                    packetBufferNode30.packetBuffer.dy(n2, (byte)93);
                    packetBufferNode30.packetBuffer.bu(Client.selectedSpellItemId * 616923277, (byte)48);
                    Client.packetWriter.addNode(packetBufferNode30, 414135591);
                }
            }
            if (30 == n12 && null == Client.meslayerContinueWidget) {
                class81.resumePauseWidget(n2, n, (short)27574);
                class144.invalidateWidget(Client.meslayerContinueWidget = SoundSystem.getWidgetChild(n2, n, 2043806412), -867755391);
            }
            if (26 == n12) {
                if (n13 == 408462048) {
                    return;
                }
                class148.method844(-1480705530);
            }
            if (n12 == 15 && Client.players[n4] != null) {
                if (n13 == 408462048) {
                    return;
                }
                Client.mouseCrossX = n6 * 1956692579;
                Client.mouseCrossY = n7 * 956660059;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = -1970850269 * n;
                Client.destinationY = 875414437 * n2;
                final PacketBufferNode packetBufferNode31 = class330.getPacketBufferNode(ClientPacket.field2511, Client.packetWriter.isaacCipher, (short)(-12182));
                packetBufferNode31.packetBuffer.ds(145251849 * Client.selectedSpellChildIndex, -1476524845);
                packetBufferNode31.packetBuffer.bu(616923277 * Client.selectedSpellItemId, (byte)123);
                Buffer.ap(packetBufferNode31.packetBuffer, n4, (byte)121);
                packetBufferNode31.packetBuffer.eb((int)(Client.keyHandlerInstance.getKeyPressed(82, 70832305) ? 1 : 0), (byte)(-3));
                packetBufferNode31.packetBuffer.ba(96656415 * Clips.selectedSpellWidget, -2081835031);
                Client.packetWriter.addNode(packetBufferNode31, 414135591);
            }
            if (12 == n12 && Client.npcs[n4] != null) {
                Client.mouseCrossX = n6 * 1956692579;
                Client.mouseCrossY = n7 * 956660059;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = n * -1970850269;
                Client.destinationY = 875414437 * n2;
                final PacketBufferNode packetBufferNode32 = class330.getPacketBufferNode(ClientPacket.field2528, Client.packetWriter.isaacCipher, (short)(-31343));
                packetBufferNode32.packetBuffer.bu(n4, (byte)65);
                packetBufferNode32.packetBuffer.du((int)(Client.keyHandlerInstance.getKeyPressed(82, 761786945) ? 1 : 0), 59242277);
                Client.packetWriter.addNode(packetBufferNode32, 414135591);
            }
            if (n12 != 0) {
                if (n13 == 408462048) {
                    return;
                }
                Client.mouseCrossX = 1956692579 * n6;
                Client.mouseCrossY = n7 * 956660059;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = n * -1970850269;
                Client.destinationY = n2 * 875414437;
                final PacketBufferNode packetBufferNode33 = class330.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher, (short)(-13041));
                packetBufferNode33.packetBuffer.bu(n4, (byte)63);
                packetBufferNode33.packetBuffer.dy(-1164741861 * class294.field2713, (byte)(-48));
                packetBufferNode33.packetBuffer.cq(896780031 * WorldMapSectionType.field2385, (byte)49);
                packetBufferNode33.packetBuffer.bu(n + -1232093375 * WorldMapData_0.baseX, (byte)52);
                packetBufferNode33.packetBuffer.eb((int)(Client.keyHandlerInstance.getKeyPressed(82, 1006532236) ? 1 : 0), (byte)(-42));
                packetBufferNode33.packetBuffer.bu(-1518641849 * class144.field1333, (byte)30);
                packetBufferNode33.packetBuffer.ds(n2 + 827352769 * GameObject.baseY, -1748301423);
                Client.packetWriter.addNode(packetBufferNode33, 414135591);
            }
            if (17 == n12) {
                Client.mouseCrossX = n6 * 1956692579;
                Client.mouseCrossY = n7 * 956660059;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = n * -1970850269;
                Client.destinationY = n2 * 875414437;
                final PacketBufferNode packetBufferNode34 = class330.getPacketBufferNode(ClientPacket.field2489, Client.packetWriter.isaacCipher, (short)(-7654));
                final PacketBuffer packetBuffer7 = packetBufferNode34.packetBuffer;
                int n21;
                if (Client.keyHandlerInstance.getKeyPressed(82, -993134036)) {
                    if (n13 == 408462048) {
                        return;
                    }
                    n21 = 1;
                }
                else {
                    n21 = 0;
                }
                packetBuffer7.eb(n21, (byte)(-46));
                packetBufferNode34.packetBuffer.dy(96656415 * Clips.selectedSpellWidget, (byte)53);
                packetBufferNode34.packetBuffer.ds(145251849 * Client.selectedSpellChildIndex, -1072413625);
                packetBufferNode34.packetBuffer.cq(n4, (byte)(-22));
                Buffer.ap(packetBufferNode34.packetBuffer, -1232093375 * WorldMapData_0.baseX + n, (byte)73);
                packetBufferNode34.packetBuffer.bu(n2 + GameObject.baseY * 827352769, (byte)8);
                packetBufferNode34.packetBuffer.bu(Client.selectedSpellItemId * 616923277, (byte)15);
                Client.packetWriter.addNode(packetBufferNode34, 414135591);
            }
            if (21 == n12) {
                Client.mouseCrossX = n6 * 1956692579;
                Client.mouseCrossY = 956660059 * n7;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = n * -1970850269;
                Client.destinationY = n2 * 875414437;
                final PacketBufferNode packetBufferNode35 = class330.getPacketBufferNode(ClientPacket.field2487, Client.packetWriter.isaacCipher, (short)(-9405));
                packetBufferNode35.packetBuffer.bu(WorldMapData_0.baseX * -1232093375 + n, (byte)55);
                packetBufferNode35.packetBuffer.eb((int)(Client.keyHandlerInstance.getKeyPressed(82, 321570624) ? 1 : 0), (byte)(-107));
                packetBufferNode35.packetBuffer.ds(827352769 * GameObject.baseY + n2, -1097924710);
                Buffer.ap(packetBufferNode35.packetBuffer, n4, (byte)104);
                Client.packetWriter.addNode(packetBufferNode35, 414135591);
            }
            if (n12 == 29) {
                final PacketBufferNode packetBufferNode36 = class330.getPacketBufferNode(ClientPacket.field2497, Client.packetWriter.isaacCipher, (short)(-1215));
                packetBufferNode36.packetBuffer.ba(n2, -2081835031);
                Client.packetWriter.addNode(packetBufferNode36, 414135591);
                final Widget vmethod3382 = class165.vmethod3380(n2, (byte)5);
                if (null != vmethod3382 && vmethod3382.cs1Instructions != null && 5 == vmethod3382.cs1Instructions[0][0]) {
                    final int n22 = vmethod3382.cs1Instructions[0][1];
                    if (vmethod3382.cs1ComparisonValues[0] != Varps.Varps_main[n22]) {
                        Varps.Varps_main[n22] = vmethod3382.cs1ComparisonValues[0];
                        Client.ye(n22);
                        class7.changeGameOptions(n22, 847189006);
                    }
                }
            }
            if (n12 == 22) {
                Client.mouseCrossX = 1956692579 * n6;
                Client.mouseCrossY = n7 * 956660059;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                Client.destinationX = -1970850269 * n;
                Client.destinationY = n2 * 875414437;
                final PacketBufferNode packetBufferNode37 = class330.getPacketBufferNode(ClientPacket.field2483, Client.packetWriter.isaacCipher, (short)(-26828));
                Buffer.ap(packetBufferNode37.packetBuffer, GameObject.baseY * 827352769 + n2, (byte)113);
                packetBufferNode37.packetBuffer.dp((int)(Client.keyHandlerInstance.getKeyPressed(82, -1459083149) ? 1 : 0), 2067411794);
                packetBufferNode37.packetBuffer.cq(n + WorldMapData_0.baseX * -1232093375, (byte)59);
                Buffer.ap(packetBufferNode37.packetBuffer, n4, (byte)40);
                Client.packetWriter.addNode(packetBufferNode37, 414135591);
            }
            if (1004 == n12) {
                Client.mouseCrossX = 1956692579 * n6;
                Client.mouseCrossY = 956660059 * n7;
                Client.mouseCrossColor = 1387316670;
                Client.mouseCrossState = 0;
                final PacketBufferNode packetBufferNode38 = class330.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher, (short)(-16362));
                packetBufferNode38.packetBuffer.cq(GameObject.baseY * 827352769 + n2, (byte)0);
                Buffer.ap(packetBufferNode38.packetBuffer, n4, (byte)120);
                Buffer.ap(packetBufferNode38.packetBuffer, -1232093375 * WorldMapData_0.baseX + n, (byte)17);
                Client.packetWriter.addNode(packetBufferNode38, 414135591);
            }
            if (0 != Client.isItemSelected * -303899309) {
                Client.isItemSelected = 0;
                class144.invalidateWidget(class165.vmethod3380(class294.field2713 * -1164741861, (byte)5), -1790820145);
            }
            if (Client.isSpellSelected) {
                class166.Widget_runOnTargetLeave((byte)113);
            }
        }
    }
    
    @Override
    public int getPeerPort() {
        try {
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getPeerPort(" + ')');
        }
    }
    
    public static int vk(final class17 class17) {
        if (class17 == null) {
            class17.getLastAccessedTime();
        }
        throw new UnsupportedOperationException();
    }
    
    public Principal by() throws SSLPeerUnverifiedException {
        return null;
    }
    
    public SSLSessionContext bx() {
        throw new UnsupportedOperationException();
    }
    
    public static SSLSessionContext xb(final class17 class17) {
        if (class17 == null) {
            class17.bx();
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public String getPeerHost() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getPeerHost(" + ')');
        }
    }
    
    public String[] bd() {
        throw new UnsupportedOperationException();
    }
    
    public void bg(final String s, final Object o) {
        throw new UnsupportedOperationException();
    }
    
    public int af() {
        return 0;
    }
    
    public void bn() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
        try {
            return this.this$1.field40;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ar.getPeerCertificates(" + ')');
        }
    }
    
    public long ab() {
        throw new UnsupportedOperationException();
    }
    
    public Certificate[] aq() {
        throw new UnsupportedOperationException();
    }
    
    public String aj() {
        throw new UnsupportedOperationException();
    }
    
    public X509Certificate[] ag() throws SSLPeerUnverifiedException {
        return null;
    }
    
    public static SSLSessionContext zk(final class17 class17) {
        if (class17 == null) {
            class17.getLocalCertificates();
        }
        throw new UnsupportedOperationException();
    }
    
    public static Object yc(final class17 class17, final String s) {
        if (class17 == null) {
            class17.ab();
        }
        throw new UnsupportedOperationException();
    }
    
    public String[] bj() {
        throw new UnsupportedOperationException();
    }
    
    public static long jd(final class17 class17) {
        if (class17 == null) {
            class17.af();
        }
        throw new UnsupportedOperationException();
    }
    
    public static void rz(final class17 class17, final String s) {
        if (class17 == null) {
            class17.bd();
        }
        throw new UnsupportedOperationException();
    }
    
    public static String rk(final class17 class17) {
        if (class17 == null) {
            class17.ao();
        }
        throw new UnsupportedOperationException();
    }
    
    public SSLSessionContext bk() {
        throw new UnsupportedOperationException();
    }
    
    public X509Certificate[] ah() throws SSLPeerUnverifiedException {
        return null;
    }
    
    public void bf(final String s, final Object o) {
        throw new UnsupportedOperationException();
    }
    
    public void bu(final String s, final Object o) {
        throw new UnsupportedOperationException();
    }
}
