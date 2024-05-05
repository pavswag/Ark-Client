import java.io.File;

// 
// Decompiled by Procyon v0.5.36
// 

public class class335
{
    public static final int ai = 2;
    static final int an = 8;
    public static File cacheDir;
    static final int af = 8;
    public static final int ba = 1008;
    static int field3093;
    
    class335() throws Throwable {
        throw new Error();
    }
    
    static {
        int n = 0;
        int n2 = 0;
        final class330[] method7 = class4.method7(-574756815);
        for (int i = 0; i < method7.length; ++i) {
            final class330 class330 = method7[i];
            if (413496273 * class330.field3073 > n) {
                n = 413496273 * class330.field3073;
            }
            if (1618476451 * class330.field3074 > n2) {
                n2 = class330.field3074 * 1618476451;
            }
        }
    }
    
    static final void method1851(final Widget widget, final int n) {
        try {
            if (1 == widget.buttonType * 35076151) {
                SceneTilePaint.insertMenuItem(widget.dataText, "", 24, 0, 0, 1713081171 * widget.id, widget.itemId * -2006098851, false, (byte)18);
            }
            if (widget.buttonType * 35076151 == 2) {
                if (n >= 101571753) {
                    throw new IllegalStateException();
                }
                if (!Client.isSpellSelected) {
                    if (n >= 101571753) {
                        throw new IllegalStateException();
                    }
                    final String widget_getSpellActionName = MusicPatchNode.Widget_getSpellActionName(widget, 603369429);
                    if (widget_getSpellActionName != null) {
                        class138.method796(widget_getSpellActionName, class383.method2081(65280, 1284882506) + widget.text, 25, 0, -1, widget.id * 1713081171, widget.itemId * -2006098851, (short)2663);
                    }
                }
            }
            if (widget.buttonType * 35076151 == 3) {
                if (n >= 101571753) {
                    throw new IllegalStateException();
                }
                MenuAction.insertMenuItemNoShift(Strings.gq, "", 26, 0, 0, widget.id * 1713081171, (byte)93);
            }
            if (4 == 35076151 * widget.buttonType) {
                if (n >= 101571753) {
                    throw new IllegalStateException();
                }
                MenuAction.insertMenuItemNoShift(widget.dataText, "", 28, 0, 0, 1713081171 * widget.id, (byte)52);
            }
            if (widget.buttonType * 35076151 == 5) {
                if (n >= 101571753) {
                    return;
                }
                MenuAction.insertMenuItemNoShift(widget.dataText, "", 29, 0, 0, 1713081171 * widget.id, (byte)74);
            }
            if (6 == 35076151 * widget.buttonType) {
                if (n >= 101571753) {
                    return;
                }
                if (Client.meslayerContinueWidget == null) {
                    if (n >= 101571753) {
                        return;
                    }
                    MenuAction.insertMenuItemNoShift(widget.dataText, "", 30, 0, -1, widget.id * 1713081171, (byte)117);
                }
            }
            if (widget.modelOrthog) {
                if (Client.isSpellSelected) {
                    if (ScriptEvent.method492(KeyHandler.getWidgetFlags(widget, 975853329), -404046027)) {
                        if (n >= 101571753) {
                            throw new IllegalStateException();
                        }
                        if ((1457791911 * SecureRandomFuture.selectedSpellFlags & 0x20) == 0x20) {
                            if (n >= 101571753) {
                                throw new IllegalStateException();
                            }
                            class138.method796(Client.field530, Client.field522 + " " + class96.ab + " " + widget.field3004, 58, 0, 55577617 * widget.childIndex, widget.id * 1713081171, -2006098851 * widget.itemId, (short)1006);
                        }
                    }
                }
                else {
                    for (int i = 9; i >= 5; --i) {
                        if (n >= 101571753) {
                            throw new IllegalStateException();
                        }
                        boolean b;
                        if (0x0 != (KeyHandler.getWidgetFlags(widget, 830342511) >> 1 + i & 0x1)) {
                            if (n >= 101571753) {
                                throw new IllegalStateException();
                            }
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        String s = null;
                        Label_0061: {
                            if (!b && null == widget.onOp) {
                                if (n >= 101571753) {
                                    return;
                                }
                                s = null;
                            }
                            else {
                                if (null != widget.actions && widget.actions.length > i) {
                                    if (n >= 101571753) {
                                        throw new IllegalStateException();
                                    }
                                    if (null != widget.actions[i]) {
                                        if (n >= 101571753) {
                                            throw new IllegalStateException();
                                        }
                                        if (widget.actions[i].trim().length() != 0) {
                                            s = widget.actions[i];
                                            break Label_0061;
                                        }
                                        if (n >= 101571753) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                }
                                s = null;
                            }
                        }
                        final String s2 = s;
                        if (s2 != null) {
                            if (n >= 101571753) {
                                throw new IllegalStateException();
                            }
                            class138.method796(s2, widget.field3004, 1007, i + 1, widget.childIndex * 55577617, widget.id * 1713081171, widget.itemId * -2006098851, (short)(-16999));
                        }
                    }
                    final String widget_getSpellActionName2 = MusicPatchNode.Widget_getSpellActionName(widget, 603369429);
                    if (null != widget_getSpellActionName2) {
                        if (n >= 101571753) {
                            throw new IllegalStateException();
                        }
                        class138.method796(widget_getSpellActionName2, widget.field3004, 25, 0, 55577617 * widget.childIndex, widget.id * 1713081171, widget.itemId * -2006098851, (short)(-3165));
                    }
                    for (int j = 4; j >= 0; --j) {
                        if (n >= 101571753) {
                            return;
                        }
                        boolean b2;
                        if (0x0 != (KeyHandler.getWidgetFlags(widget, 1509783147) >> 1 + j & 0x1)) {
                            if (n >= 101571753) {
                                return;
                            }
                            b2 = true;
                        }
                        else {
                            b2 = false;
                        }
                        String s3 = null;
                        Label_1053: {
                            if (!b2) {
                                if (n >= 101571753) {
                                    throw new IllegalStateException();
                                }
                                if (null == widget.onOp) {
                                    if (n >= 101571753) {
                                        throw new IllegalStateException();
                                    }
                                    s3 = null;
                                    break Label_1053;
                                }
                            }
                            if (widget.actions != null && widget.actions.length > j && widget.actions[j] != null && widget.actions[j].trim().length() != 0) {
                                s3 = widget.actions[j];
                            }
                            else {
                                s3 = null;
                            }
                        }
                        final String s4 = s3;
                        if (null != s4) {
                            if (n >= 101571753) {
                                throw new IllegalStateException();
                            }
                            SceneTilePaint.insertMenuItem(s4, widget.field3004, 57, 1 + j, 55577617 * widget.childIndex, widget.id * 1713081171, widget.itemId * -2006098851, widget.field2969, (byte)127);
                        }
                    }
                    boolean b3;
                    if ((KeyHandler.getWidgetFlags(widget, 978651431) & 0x1) != 0x0) {
                        if (n >= 101571753) {
                            throw new IllegalStateException();
                        }
                        b3 = true;
                    }
                    else {
                        b3 = false;
                    }
                    if (b3) {
                        if (n >= 101571753) {
                            throw new IllegalStateException();
                        }
                        MenuAction.insertMenuItemNoShift(Strings.aq, "", 30, 0, widget.childIndex * 55577617, widget.id * 1713081171, (byte)89);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "my.lo(" + ')');
        }
    }
    
    public static void lm(final ModelData modelData) {
        if (modelData == null) {
            modelData.cs();
        }
        modelData.vertexNormals = null;
        modelData.vertexVertices = null;
        modelData.faceNormals = null;
        modelData.isBoundsCalculated = false;
    }
}
