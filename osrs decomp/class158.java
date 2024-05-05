// 
// Decompiled by Procyon v0.5.36
// 

public class class158 extends class139
{
    final /* synthetic */ class142 this$0;
    int field1394;
    static IndexedSprite options_buttons_2Sprite;
    
    class158(final class142 this$0) {
        this.this$0 = this$0;
        this.field1394 = 536303009;
    }
    
    public static void cl(final VarbitComposition varbitComposition, final Buffer buffer, final int n) {
        if (varbitComposition == null) {
            varbitComposition.ao(buffer);
            return;
        }
        if (n == 1) {
            varbitComposition.baseVar = buffer.readUnsignedShort(-738152601) * -893309655;
            varbitComposition.startBit = Buffer.ra(buffer, (byte)7) * -1466027509;
            varbitComposition.endBit = Buffer.ra(buffer, (byte)7) * 909304255;
        }
    }
    
    @Override
    void aw(final ClanSettings clanSettings) {
        clanSettings.method850(1899901343 * this.field1394, (byte)(-1));
    }
    
    public static VarbitComposition vmethod3248(final int n, final int n2) {
        try {
            final VarbitComposition varbitComposition = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.wr(n);
            if (varbitComposition == null) {
                final byte[] takeFile = VarbitComposition.VarbitDefinition_archive.takeFile(14, n, (byte)(-77));
                final VarbitComposition varbitComposition2 = new VarbitComposition();
                if (takeFile != null) {
                    if (n2 >= 107410892) {
                        throw new IllegalStateException();
                    }
                    VarbitComposition.rt(varbitComposition2, new Buffer(takeFile), -27344201);
                }
                VarbitComposition.VarbitDefinition_cached.put(varbitComposition2, n);
                return varbitComposition2;
            }
            if (n2 >= 107410892) {
                throw new IllegalStateException();
            }
            return varbitComposition;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gs.an(" + ')');
        }
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            clanSettings.method850(1899901343 * this.field1394, (byte)(-1));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gs.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        this.field1394 = buffer.readUnsignedShort(-163425855) * -536303009;
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1394 = buffer.readUnsignedShort(-823282392) * -536303009;
    }
    
    static void vmethod3254(final byte b) {
        try {
            if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
                if (b != 4) {
                    throw new IllegalStateException();
                }
                class28.KeyHandler_keyCodes[186] = 57;
                class28.KeyHandler_keyCodes[187] = 27;
                class28.KeyHandler_keyCodes[188] = 71;
                class28.KeyHandler_keyCodes[189] = 26;
                class28.KeyHandler_keyCodes[190] = 72;
                class28.KeyHandler_keyCodes[191] = 73;
                class28.KeyHandler_keyCodes[192] = 58;
                class28.KeyHandler_keyCodes[219] = 42;
                class28.KeyHandler_keyCodes[220] = 74;
                class28.KeyHandler_keyCodes[221] = 43;
                class28.KeyHandler_keyCodes[222] = 59;
                class28.KeyHandler_keyCodes[223] = 28;
            }
            else {
                class28.KeyHandler_keyCodes[44] = 71;
                class28.KeyHandler_keyCodes[45] = 26;
                class28.KeyHandler_keyCodes[46] = 72;
                class28.KeyHandler_keyCodes[47] = 73;
                class28.KeyHandler_keyCodes[59] = 57;
                class28.KeyHandler_keyCodes[61] = 27;
                class28.KeyHandler_keyCodes[91] = 42;
                class28.KeyHandler_keyCodes[92] = 74;
                class28.KeyHandler_keyCodes[93] = 43;
                class28.KeyHandler_keyCodes[192] = 28;
                class28.KeyHandler_keyCodes[222] = 58;
                class28.KeyHandler_keyCodes[520] = 59;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gs.af(" + ')');
        }
    }
    
    @Override
    void vmethod3254(final Buffer buffer, final int n) {
        try {
            this.field1394 = buffer.readUnsignedShort(-279562647) * -536303009;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gs.af(" + ')');
        }
    }
    
    static void alignWidgetSize(final Widget widget, final int n, final int n2, final boolean b, final int n3) {
        try {
            final int n4 = widget.width * -794961409;
            final int n5 = widget.height * 1473950221;
            if (widget.widthAlignment * 241981169 == 0) {
                widget.width = -1212957085 * widget.rawWidth;
            }
            else if (241981169 * widget.widthAlignment == 1) {
                if (n3 >= -2093290365) {
                    throw new IllegalStateException();
                }
                widget.width = 1774069247 * (n - widget.rawWidth * -1960603747);
            }
            else if (widget.widthAlignment * 241981169 == 2) {
                if (n3 >= -2093290365) {
                    throw new IllegalStateException();
                }
                widget.width = 1774069247 * (n * (widget.rawWidth * -1960603747) >> 14);
            }
            if (-480604969 * widget.heightAlignment == 0) {
                widget.height = 1850345051 * widget.rawHeight;
            }
            else if (-480604969 * widget.heightAlignment == 1) {
                if (n3 >= -2093290365) {
                    return;
                }
                widget.height = 60157125 * (n2 - 1756076191 * widget.rawHeight);
            }
            else if (widget.heightAlignment * -480604969 == 2) {
                if (n3 >= -2093290365) {
                    throw new IllegalStateException();
                }
                widget.height = 60157125 * (n2 * (1756076191 * widget.rawHeight) >> 14);
            }
            if (widget.widthAlignment * 241981169 == 4) {
                if (n3 >= -2093290365) {
                    throw new IllegalStateException();
                }
                widget.width = 1774069247 * (widget.field2896 * 640195305 * (1473950221 * widget.height) / (276729069 * widget.field2897));
            }
            if (4 == widget.heightAlignment * -480604969) {
                if (n3 >= -2093290365) {
                    throw new IllegalStateException();
                }
                widget.height = widget.field2897 * 276729069 * (widget.width * -794961409) / (widget.field2896 * 640195305) * 60157125;
            }
            if (1337 == 1021339961 * widget.contentType) {
                if (n3 >= -2093290365) {
                    throw new IllegalStateException();
                }
                Client.viewportWidget = widget;
            }
            if (12 == widget.type * 883712245) {
                if (n3 >= -2093290365) {
                    throw new IllegalStateException();
                }
                widget.method1815((byte)(-78)).method1710(widget.width * -794961409, 1473950221 * widget.height, (byte)63);
            }
            if (b) {
                if (n3 >= -2093290365) {
                    throw new IllegalStateException();
                }
                if (null != widget.onResize) {
                    if (widget.width * -794961409 == n4) {
                        if (n3 >= -2093290365) {
                            throw new IllegalStateException();
                        }
                        if (widget.height * 1473950221 == n5) {
                            return;
                        }
                    }
                    final ScriptEvent scriptEvent = new ScriptEvent();
                    scriptEvent.dragTarget = widget;
                    scriptEvent.args = widget.onResize;
                    Client.scriptEvents.addFirst(scriptEvent);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gs.lq(" + ')');
        }
    }
}
