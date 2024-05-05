import net.runelite.api.Perspective;
import com.google.common.primitives.Doubles;

// 
// Decompiled by Procyon v0.5.36
// 

public class MusicPatchNode extends Node
{
    int field2783;
    int field2784;
    RawSound rawSound;
    MusicPatchNode2 field2786;
    static Player localPlayer;
    int field2788;
    int field2789;
    int field2790;
    int field2791;
    int field2792;
    int field2793;
    int field2794;
    int field2795;
    int field2796;
    RawPcmStream stream;
    int field2798;
    int field2799;
    MusicPatch patch;
    int field2801;
    int field2802;
    int field2803;
    int field2804;
    
    MusicPatchNode() {
    }
    
    public static short[] wc(final class489 class489) {
        return class489.field4053;
    }
    
    static String Widget_getSpellActionName(final Widget widget, final int n) {
        try {
            if (class195.method1052(KeyHandler.getWidgetFlags(widget, 1141757659), 1774308606) == 0) {
                return null;
            }
            if (widget.text2 != null) {
                if (n != 603369429) {
                    throw new IllegalStateException();
                }
                if (widget.text2.trim().length() != 0) {
                    return widget.text2;
                }
                if (n != 603369429) {
                    throw new IllegalStateException();
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lq.nu(" + ')');
        }
    }
    
    public static boolean method1676(final int n, final int n2) {
        try {
            boolean b;
            if (0x0 != (n >> 20 & 0x1)) {
                if (n2 <= -1808401495) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lq.aw(" + ')');
        }
    }
    
    void an() {
        this.patch = null;
        this.rawSound = null;
        this.field2786 = null;
        this.stream = null;
    }
    
    static final void checkIfMinimapClicked(final Widget widget, final int n, final int n2, final byte b) {
        if (!Client.wp && Client.jc == Client.wp) {
            final int n3 = -122;
            try {
                if (Client.minimapState * 1383336963 != 0 && 1383336963 * Client.minimapState != 3) {
                    if (n3 >= 2) {
                        throw new IllegalStateException();
                    }
                }
                else if (!Client.isMenuOpen) {
                    if (n3 >= 2) {
                        throw new IllegalStateException();
                    }
                    if (MouseHandler.MouseHandler_lastButton * -1222491879 != 1) {
                        if (n3 >= 2) {
                            throw new IllegalStateException();
                        }
                        if (class473.mouseCam) {
                            return;
                        }
                        if (n3 >= 2) {
                            throw new IllegalStateException();
                        }
                        if (MouseHandler.MouseHandler_lastButton * -1222491879 != 4) {
                            return;
                        }
                        if (n3 >= 2) {
                            return;
                        }
                    }
                    final SpriteMask vn = Widget.vn(widget, true, (byte)29);
                    if (null == vn) {
                        if (n3 >= 2) {}
                    }
                    else {
                        final int n4 = 2020601481 * MouseHandler.MouseHandler_lastPressedX - n;
                        final int n5 = MouseHandler.MouseHandler_lastPressedY * 1163896205 - n2;
                        if (vn.contains(n4, n5, -746690647)) {
                            if (n3 >= 2) {
                                throw new IllegalStateException();
                            }
                            final int n6 = n4 - vn.width * 1484188043 / 2;
                            final int n7 = n5 - vn.height * 939947663 / 2;
                            final int n8 = Client.camAngleY * 704283033 & 0x7FF;
                            final int n9 = Rasterizer3D.Rasterizer3D_sine[n8];
                            final int n10 = Rasterizer3D.Rasterizer3D_cosine[n8];
                            final int n11 = n6 * n10 + n7 * n9 >> 11;
                            final int n12 = n7 * n10 - n6 * n9 >> 11;
                            final int n13 = 1144428983 * MusicPatchNode.localPlayer.br + n11 >> 7;
                            final int n14 = MusicPatchNode.localPlayer.ep * -411750205 - n12 >> 7;
                            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2471, Client.packetWriter.isaacCipher, (short)(-28039));
                            packetBufferNode.packetBuffer.bf(18, (byte)72);
                            packetBufferNode.packetBuffer.ds(GameObject.baseY * 827352769 + n14, -1006440190);
                            Buffer.ap(packetBufferNode.packetBuffer, n13 + -1232093375 * WorldMapData_0.baseX, (byte)124);
                            final PacketBuffer packetBuffer = packetBufferNode.packetBuffer;
                            int n15;
                            if (Client.keyHandlerInstance.getKeyPressed(82, -1277851661)) {
                                if (n3 >= 2) {
                                    throw new IllegalStateException();
                                }
                                n15 = (Client.keyHandlerInstance.getKeyPressed(81, -1755032313) ? 2 : 1);
                            }
                            else {
                                n15 = 0;
                            }
                            packetBuffer.du(n15, -988290643);
                            packetBufferNode.packetBuffer.bf(n6, (byte)100);
                            packetBufferNode.packetBuffer.bf(n7, (byte)12);
                            packetBufferNode.packetBuffer.cq(704283033 * Client.camAngleY, (byte)48);
                            packetBufferNode.packetBuffer.bf(57, (byte)48);
                            packetBufferNode.packetBuffer.bf(0, (byte)19);
                            packetBufferNode.packetBuffer.bf(0, (byte)1);
                            packetBufferNode.packetBuffer.bf(89, (byte)23);
                            packetBufferNode.packetBuffer.cq(1144428983 * MusicPatchNode.localPlayer.br, (byte)(-99));
                            packetBufferNode.packetBuffer.cq(MusicPatchNode.localPlayer.ep * -411750205, (byte)3);
                            packetBufferNode.packetBuffer.bf(63, (byte)64);
                            Client.packetWriter.addNode(packetBufferNode, 414135591);
                            Client.destinationX = n13 * -1970850269;
                            Client.destinationY = 875414437 * n14;
                        }
                    }
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "lq.iw(" + ')');
            }
            return;
        }
        final int cd = ScriptFrame.client.cd();
        if (cd != 0 && cd != 3) {
            return;
        }
        if (ScriptFrame.client.isMenuOpen()) {
            return;
        }
        final int ui = ScriptFrame.client.ui();
        if (ui == 0) {
            final int rc = ScriptFrame.client.rc();
            if (Client.wp && rc != 0) {
                final int wk = ScriptFrame.client.wk();
                final int vw = ScriptFrame.client.vw();
                if (wk >= n && vw >= n2 && wk < n + widget.getWidth() && vw < n2 + widget.getHeight()) {
                    Client.xq = Doubles.constrainToRange(Client.xq + -rc * 0.25, 2.0, 8.0);
                }
            }
        }
        else {
            final SpriteMask un = widget.un(true);
            if (un == null) {
                return;
            }
            final int n16 = ScriptFrame.client.ge() - n;
            final int n17 = ScriptFrame.client.sr() - n2;
            if (!un.aw(n16, n17)) {
                return;
            }
            if (ui == 1 || (!ScriptFrame.client.kw() && ui == 4)) {
                final int n18 = n16 - un.he() / 2;
                final int n19 = n17 - un.da() / 2;
                final int n20 = ScriptFrame.client.getCameraYawTarget() & 0x7FF;
                final int n21 = Perspective.SINE[n20];
                final int n22 = Perspective.COSINE[n20];
                final int n23 = n22 * n18 + n21 * n19 >> 16;
                final int n24 = n22 * n19 - n21 * n18 >> 16;
                final float n25 = (float)Client.xq / 128.0f;
                final int n26 = (int)(n23 / n25);
                final int n27 = (int)(n24 / n25);
                final Player fv = ScriptFrame.client.fv();
                final int n28 = n26 + fv.fu() >> 7;
                final int n29 = fv.gk() - n27 >> 7;
                final boolean[] method108 = ScriptFrame.client.fv().method108();
                Client.nt(n18, n19, n28, n29, method108[82] ? (method108[81] ? 2 : 1) : 0);
                ScriptFrame.client.is(n28);
                ScriptFrame.client.nw(n29);
            }
            else if (ui == 2) {
                Client.xq = 4.0;
                ScriptFrame.client.vu(0);
            }
        }
    }
    
    void method1679(final byte b) {
        try {
            this.patch = null;
            this.rawSound = null;
            this.field2786 = null;
            this.stream = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lq.af(" + ')');
        }
    }
    
    public static float method1679(int n, final short n2) {
        try {
            n &= 0x3FFF;
            return (float)(n / 16384.0f * 6.283185307179586);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lq.af(" + ')');
        }
    }
    
    public static void bk(final MusicPatchNode musicPatchNode, final byte b) {
        if (musicPatchNode == null) {
            musicPatchNode.method1679(b);
            return;
        }
        try {
            musicPatchNode.patch = null;
            musicPatchNode.rawSound = null;
            musicPatchNode.field2786 = null;
            musicPatchNode.stream = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lq.af(" + ')');
        }
    }
}
