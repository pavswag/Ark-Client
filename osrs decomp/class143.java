import java.awt.datatransfer.Clipboard;

// 
// Decompiled by Procyon v0.5.36
// 

public class class143 extends class139
{
    final /* synthetic */ class142 this$0;
    int field1325;
    byte field1326;
    static final int ah = 10;
    static int loginBoxCenter;
    
    class143(final class142 this$0) {
        this.this$0 = this$0;
        this.field1325 = 722551969;
    }
    
    public static void se(final PcmStreamMixer pcmStreamMixer, final PcmStreamMixerListener pcmStreamMixerListener) {
        if (pcmStreamMixer == null) {
            pcmStreamMixer.ak();
        }
        pcmStreamMixerListener.hw();
        pcmStreamMixerListener.remove2();
        final Node previous = pcmStreamMixer.field169.sentinel.previous;
        if (previous == pcmStreamMixer.field169.sentinel) {
            pcmStreamMixer.field170 = -1;
        }
        else {
            pcmStreamMixer.field170 = ((PcmStreamMixerListener)previous).field300;
        }
    }
    
    public static int at(final Buffer buffer) {
        if ((buffer.array[-544473965 * buffer.offset] & 0xBF840AB1) < 1686349829) {
            return Buffer.ra(buffer, (byte)7) - 1;
        }
        return buffer.readUnsignedShort(313580628) + 377307727;
    }
    
    @Override
    void aw(final ClanSettings clanSettings) {
        clanSettings.method866(this.field1325 * -263561057, this.field1326, -456839417);
    }
    
    static byte[] aw(final byte[] array, final byte b) {
        try {
            final int length = array.length;
            final byte[] array2 = new byte[length];
            System.arraycopy(array, 0, array2, 0, length);
            return array2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fy.aw(" + ')');
        }
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            clanSettings.method866(this.field1325 * -263561057, this.field1326, -456839417);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fy.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        this.field1325 = buffer.readUnsignedShort(-1348736794) * -722551969;
        this.field1326 = Buffer.wu(buffer, 435772489);
    }
    
    static final void runComponentCloseListeners(final Widget[] array, final int n, final byte b) {
        try {
            for (int i = 0; i < array.length; ++i) {
                final Widget widget = array[i];
                if (null != widget) {
                    if (0 == 883712245 * widget.type) {
                        if (widget.children != null) {
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            runComponentCloseListeners(widget.children, n, (byte)107);
                        }
                        final InterfaceParent interfaceParent = (InterfaceParent)Client.interfaceParents.at(1713081171 * widget.id);
                        if (null != interfaceParent) {
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            class127.runIntfCloseListeners(interfaceParent.group * 944864121, n, (byte)63);
                        }
                    }
                    if (n == 0) {
                        if (b <= 4) {
                            throw new IllegalStateException();
                        }
                        if (null != widget.onDialogAbort) {
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            final ScriptEvent scriptEvent = new ScriptEvent();
                            scriptEvent.dragTarget = widget;
                            scriptEvent.args = widget.onDialogAbort;
                            HealthBarUpdate.set(scriptEvent, (byte)40);
                        }
                    }
                    if (1 == n && widget.onSubChange != null) {
                        if (b <= 4) {
                            throw new IllegalStateException();
                        }
                        if (widget.childIndex * 55577617 >= 0) {
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            final Widget vmethod3380 = class165.vmethod3380(widget.id * 1713081171, (byte)5);
                            if (vmethod3380 == null) {
                                continue;
                            }
                            if (b <= 4) {
                                return;
                            }
                            if (vmethod3380.children == null) {
                                continue;
                            }
                            if (b <= 4) {
                                return;
                            }
                            if (widget.childIndex * 55577617 >= vmethod3380.children.length) {
                                continue;
                            }
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            if (vmethod3380.children[55577617 * widget.childIndex] != widget) {
                                continue;
                            }
                        }
                        final ScriptEvent scriptEvent2 = new ScriptEvent();
                        scriptEvent2.dragTarget = widget;
                        scriptEvent2.args = widget.onSubChange;
                        HealthBarUpdate.set(scriptEvent2, (byte)51);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fy.mq(" + ')');
        }
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1325 = buffer.readUnsignedShort(-265692380) * -722551969;
        this.field1326 = Buffer.wu(buffer, 435772489);
    }
    
    static final int vmethod3254(final int n, final int n2, final int n3, final int n4, final byte b) {
        try {
            return n2 * n4 + n * n3 >> 16;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fy.af(" + ')');
        }
    }
    
    @Override
    void vmethod3254(final Buffer buffer, final int n) {
        try {
            this.field1325 = buffer.readUnsignedShort(-2001702280) * -722551969;
            this.field1326 = Buffer.wu(buffer, 435772489);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fy.af(" + ')');
        }
    }
    
    public static int iq(final Buffer buffer, final int n) {
        final int method1135 = SequenceDefinition.method1135(buffer.array, n, -1633313603 * buffer.offset, -895888730);
        buffer.writeInt(method1135, -2081835031);
        return method1135;
    }
    
    public static Clipboard method815(final int n) {
        try {
            return GameEngine.zr(ScriptFrame.client, -481768005);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fy.ol(" + ')');
        }
    }
}
