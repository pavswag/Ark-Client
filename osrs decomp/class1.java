import java.util.Iterator;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.5.36
// 

public class class1 implements Callable
{
    static final int ey = 2;
    final Buffer field0;
    final /* synthetic */ class7 this$0;
    static final int ag = 17;
    final class3 field1;
    static Task socketTask;
    static Widget scriptActiveWidget;
    static Iterator field4;
    static final int ap = 127;
    
    class1(final class7 this$0, final Buffer field0, final class3 field2) {
        this.this$0 = this$0;
        this.field0 = field0;
        this.field1 = field2;
    }
    
    public static void method2(final int[] array, final int n, final int n2, final float[] array2, final int n3) {
        try {
            if (null == array2) {
                if (n3 != 580310026) {
                    throw new IllegalStateException();
                }
                if (Rasterizer3D.field1992 == Rasterizer3D.field1999) {
                    Rasterizer3D.field1999 = Rasterizer3D.field1998;
                }
            }
            class220.rj(Rasterizer3D.field1999, array, n, n2, array2, -643944102);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "an.ay(" + ')');
        }
    }
    
    @Override
    public Object call() {
        try {
            return this.field1.vmethod12(this.field0);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "an.call(" + ')');
        }
    }
    
    static final void method5(final byte b) {
        try {
            class133.method777(-621320819 * WorldMapRectangle.field2405, Players.field1095 * -1852915743, -760417651 * KitDefinition.field1519, 23489612);
            GraphicsObject.method433(ScriptEvent.field851 * -1829847369, class86.field888 * -1642659271, (byte)119);
            if (-2100544359 * class36.cameraX == -621320819 * WorldMapRectangle.field2405) {
                if (b == 0) {
                    return;
                }
                if (1772923873 * class174.cameraY == -1852915743 * Players.field1095) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    if (class297.cameraZ * -91399205 == -760417651 * KitDefinition.field1519) {
                        if (b == 0) {
                            throw new IllegalStateException();
                        }
                        if (ScriptEvent.field851 * -1829847369 == WorldMapSectionType.cameraPitch * 1897923909 && -1010818347 * class125.cameraYaw == class86.field888 * -1642659271) {
                            if (b == 0) {
                                throw new IllegalStateException();
                            }
                            Client.field598 = false;
                            Client.isCameraLocked = false;
                            Client.field541 = false;
                            Client.field614 = false;
                            FontName.field3970 = 0;
                            MilliClock.field1455 = 0;
                            ScriptFrame.field343 = 0;
                            Archive.field3467 = 0;
                            WorldMapElement.field1503 = 0;
                            class138.field1314 = 0;
                            KeyHandler.field81 = 0;
                            ObjTypeCustomisation.field1471 = 0;
                            class123.field1209 = 0;
                            class16.field54 = 0;
                            Client.field535 = null;
                            Client.field604 = null;
                            Client.field617 = null;
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "an.ih(" + ')');
        }
    }
    
    public Object aw() {
        return this.field1.vmethod12(this.field0);
    }
    
    static void method4(final int n) {
        try {
            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2480, Client.packetWriter.isaacCipher, (short)(-32752));
            packetBufferNode.packetBuffer.bf(GrandExchangeOfferNameComparator.getWindowedMode(1409389772), (byte)86);
            packetBufferNode.packetBuffer.cq(Client.aj * -1687260435, (byte)40);
            packetBufferNode.packetBuffer.cq(class262.canvasHeight * 1658005443, (byte)(-84));
            Client.packetWriter.addNode(packetBufferNode, 414135591);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "an.io(" + ')');
        }
    }
    
    public static int vc(final FloorUnderlayDefinition floorUnderlayDefinition) {
        return floorUnderlayDefinition.hue * 372444635;
    }
    
    public static String[] co(final class15 class15) {
        if (class15 == null) {
            class15.aq();
        }
        return null;
    }
    
    public Object af() {
        return this.field1.vmethod12(this.field0);
    }
    
    static void playSong(final int n, final int n2) {
        try {
            Label_0144: {
                if (n == -1) {
                    if (n2 == 427135973) {
                        throw new IllegalStateException();
                    }
                    if (!Client.playingJingle) {
                        if (n2 == 427135973) {
                            throw new IllegalStateException();
                        }
                        FloorUnderlayDefinition.setHsl(-852125385);
                        break Label_0144;
                    }
                }
                if (-1 != n) {
                    if (n2 == 427135973) {
                        throw new IllegalStateException();
                    }
                    if (1976903761 * Client.currentTrackGroupId != n) {
                        if (n2 == 427135973) {
                            throw new IllegalStateException();
                        }
                        if (ClientPreferences.xp(class20.clientPreferences, 501882701) != 0 && !Client.playingJingle) {
                            if (n2 == 427135973) {
                                throw new IllegalStateException();
                            }
                            Actor.method538(2, class399.archive6, n, 0, ClientPreferences.xp(class20.clientPreferences, -930938744), false, -1229709463);
                        }
                    }
                }
            }
            Client.currentTrackGroupId = 1225072817 * n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "an.hf(" + ')');
        }
    }
}
