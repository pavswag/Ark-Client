import net.runelite.api.events.ItemQuantityChanged;

// 
// Decompiled by Procyon v0.5.36
// 

public final class TileItem extends Renderable implements net.runelite.api.TileItem
{
    static final int pa = 0;
    int quantity;
    static final int aw = 31;
    static final int al = 2;
    public int gq;
    public int yn;
    static final int ae = 25;
    int id;
    int field1078;
    static String field1079;
    
    TileItem() {
        this.gq = -1;
        this.yn = -1;
        this.field1078 = -2069082981;
    }
    
    public void of(final int gq) {
        this.gq = gq;
    }
    
    public int getId() {
        return this.id * 176307405;
    }
    
    public void os() {
        if (this.gq != -1 && ScriptFrame.client.ka() == null) {
            ScriptFrame.client.zd(this);
        }
    }
    
    boolean ao(final int n) {
        return n < 0 || n > 4 || 0x0 != (this.field1078 * -1891815889 & 1 << n);
    }
    
    static class133 method626(final int n, final int n2) {
        try {
            if (class20.method82(n, 854271946) == 0) {
                final class133 class133 = (class133)SequenceDefinition.SequenceDefinition_cachedModel.wr(n);
                class133 class134;
                if (null != class133) {
                    if (n2 <= 2139535413) {
                        throw new IllegalStateException();
                    }
                    class134 = class133;
                }
                else {
                    final class133 method1180 = class211.method1180(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, n, false, 684013048);
                    if (null != method1180) {
                        if (n2 <= 2139535413) {
                            throw new IllegalStateException();
                        }
                        SequenceDefinition.SequenceDefinition_cachedModel.put(method1180, n);
                    }
                    class134 = method1180;
                }
                return class134;
            }
            if (n2 <= 2139535413) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dx.av(" + ')');
        }
    }
    
    public int dw() {
        return this.yn;
    }
    
    boolean ay(final int n) {
        return n < 0 || n > 4 || 0x0 != (this.field1078 * 479857586 & 1 << n);
    }
    
    static void method627(final byte b) {
        try {
            if (Client.field482) {
                MouseHandler.addPlayerToScene(MusicPatchNode.localPlayer, false, -1861126010);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dx.ix(" + ')');
        }
    }
    
    static final void drawModelComponents(final Widget[] array, final int n, final byte b) {
        try {
            for (int i = 0; i < array.length; ++i) {
                if (b <= 10) {
                    throw new IllegalStateException();
                }
                final Widget widget = array[i];
                if (null == widget) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                }
                else if (n != widget.parentId * 913615679) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    if (widget.modelOrthog) {
                        if (b <= 10) {
                            throw new IllegalStateException();
                        }
                        if (class393.isComponentHidden(widget, (byte)1)) {
                            if (b <= 10) {
                                return;
                            }
                            continue;
                        }
                    }
                    if (0 == 883712245 * widget.type) {
                        if (!widget.modelOrthog && class393.isComponentHidden(widget, (byte)1)) {
                            if (b <= 10) {
                                throw new IllegalStateException();
                            }
                            if (widget != MidiPcmStream.mousedOverWidgetIf1) {
                                if (b <= 10) {
                                    throw new IllegalStateException();
                                }
                                continue;
                            }
                        }
                        drawModelComponents(array, widget.id * 1713081171, (byte)100);
                        if (null != widget.children) {
                            if (b <= 10) {
                                return;
                            }
                            drawModelComponents(widget.children, 1713081171 * widget.id, (byte)114);
                        }
                        final InterfaceParent interfaceParent = (InterfaceParent)Client.interfaceParents.at(widget.id * 1713081171);
                        if (interfaceParent != null) {
                            if (b <= 10) {
                                throw new IllegalStateException();
                            }
                            final int n2 = 944864121 * interfaceParent.group;
                            if (!SoundSystem.loadInterface(n2, 1376777516)) {
                                if (b <= 10) {
                                    throw new IllegalStateException();
                                }
                            }
                            else {
                                drawModelComponents(VerticalAlignment.Widget_interfaceComponents[n2], -1, (byte)30);
                            }
                        }
                    }
                    if (6 == widget.type * 883712245) {
                        Label_0662: {
                            if (-1 == widget.sequenceId * -1526544909) {
                                if (b <= 10) {
                                    throw new IllegalStateException();
                                }
                                if (widget.sequenceId2 * -717228843 == -1) {
                                    break Label_0662;
                                }
                                if (b <= 10) {
                                    return;
                                }
                            }
                            int n3;
                            if (class452.runCs1(widget, -1381305986)) {
                                if (b <= 10) {
                                    throw new IllegalStateException();
                                }
                                n3 = widget.sequenceId2 * -717228843;
                            }
                            else {
                                n3 = widget.sequenceId * -1526544909;
                            }
                            if (n3 != -1) {
                                final SequenceDefinition spotAnimationDefinition_get = ItemContainer.SpotAnimationDefinition_get(n3, (byte)104);
                                if (!spotAnimationDefinition_get.isCachedModelIdSet(1471844378)) {
                                    if (b <= 10) {
                                        throw new IllegalStateException();
                                    }
                                    final Widget widget2 = widget;
                                    widget2.modelFrameCycle += Client.field432 * 1742890489;
                                    while (1438245367 * widget.modelFrameCycle > spotAnimationDefinition_get.frameLengths[widget.modelFrame * 1575517389]) {
                                        if (b <= 10) {
                                            throw new IllegalStateException();
                                        }
                                        final Widget widget3 = widget;
                                        widget3.modelFrameCycle -= spotAnimationDefinition_get.frameLengths[widget.modelFrame * 1575517389] * -1830604857;
                                        final Widget widget4 = widget;
                                        widget4.modelFrame -= 1991520251;
                                        Label_0316: {
                                            if (widget.modelFrame * 1575517389 >= spotAnimationDefinition_get.frameIds.length) {
                                                final Widget widget5 = widget;
                                                widget5.modelFrame -= -149229203 * spotAnimationDefinition_get.frameCount;
                                                if (1575517389 * widget.modelFrame >= 0) {
                                                    if (1575517389 * widget.modelFrame < spotAnimationDefinition_get.frameIds.length) {
                                                        break Label_0316;
                                                    }
                                                    if (b <= 10) {
                                                        throw new IllegalStateException();
                                                    }
                                                }
                                                widget.modelFrame = 0;
                                            }
                                        }
                                        class144.invalidateWidget(widget, -701633967);
                                    }
                                }
                                else {
                                    final Widget widget6 = widget;
                                    widget6.modelFrame += 1198415163 * Client.field432;
                                    final int method1128 = spotAnimationDefinition_get.method1128(-1838545993);
                                    Label_0276: {
                                        if (widget.modelFrame * 1575517389 >= method1128) {
                                            if (b <= 10) {
                                                throw new IllegalStateException();
                                            }
                                            final Widget widget7 = widget;
                                            widget7.modelFrame -= -149229203 * spotAnimationDefinition_get.frameCount;
                                            if (widget.modelFrame * 1575517389 >= 0) {
                                                if (b <= 10) {
                                                    return;
                                                }
                                                if (1575517389 * widget.modelFrame < method1128) {
                                                    break Label_0276;
                                                }
                                            }
                                            widget.modelFrame = 0;
                                        }
                                    }
                                    class144.invalidateWidget(widget, -1972750241);
                                }
                            }
                        }
                        if (0 != -238796869 * widget.rotationKey) {
                            if (b <= 10) {
                                return;
                            }
                            if (!widget.modelOrthog) {
                                if (b <= 10) {
                                    throw new IllegalStateException();
                                }
                                final int n4 = widget.rotationKey * -238796869 >> 16;
                                final int n5 = widget.rotationKey * -238796869 << 16 >> 16;
                                final int n6 = n4 * (-1795081153 * Client.field432);
                                final int n7 = n5 * (-1795081153 * Client.field432);
                                widget.modelAngleX = -142910041 * (widget.modelAngleX * 797932055 + n6 & 0x7FF);
                                widget.modelAngleY = (widget.modelAngleY * -480949115 + n7 & 0x7FF) * -230241203;
                                class144.invalidateWidget(widget, -1934285081);
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dx.ms(" + ')');
        }
    }
    
    public static boolean rm(final TileItem tileItem, final int n, final int n2) {
        if (tileItem == null) {
            tileItem.method625(n, n);
        }
        try {
            if (n >= 0) {
                if (n2 <= 1640777576) {
                    throw new IllegalStateException();
                }
                if (n <= 4) {
                    boolean b;
                    if (0x0 != (tileItem.field1078 * -1724221235 & 1 << n)) {
                        if (n2 <= 1640777576) {
                            throw new IllegalStateException();
                        }
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    return b;
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dx.aw(" + ')');
        }
    }
    
    boolean method625(final int n, final int n2) {
        try {
            if (n >= 0) {
                if (n2 <= 1640777576) {
                    throw new IllegalStateException();
                }
                if (n <= 4) {
                    boolean b;
                    if (0x0 != (this.id * -1724221235 & 1 << n)) {
                        if (n2 <= 1640777576) {
                            throw new IllegalStateException();
                        }
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    return b;
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dx.aw(" + ')');
        }
    }
    
    @Override
    protected final Model al() {
        return HealthBarUpdate.set(176307405 * this.id, (byte)53).getModel(-1745152527 * this.quantity, -1814781300);
    }
    
    @Override
    protected final Model getModel(final byte b) {
        try {
            return HealthBarUpdate.set(176307405 * this.id, (byte)103).getModel(-1745152527 * this.quantity, -1518101570);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dx.an(" + ')');
        }
    }
    
    public static void mq(final TileItem tileItem, final int n, final byte b) {
        if (tileItem == null) {
            tileItem.method622(n, b);
        }
        try {
            tileItem.field1078 = 1318728709 * n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dx.af(" + ')');
        }
    }
    
    public void mi(final int yn) {
        this.yn = yn;
    }
    
    @Override
    protected final Model au() {
        return HealthBarUpdate.set(1032359208 * this.id, (byte)54).getModel(1564456112 * this.quantity, -1682687295);
    }
    
    boolean aa(final int n) {
        return n < 0 || n > 4 || 0x0 != (this.field1078 * 1177520578 & 1 << n);
    }
    
    void method622(final int n, final byte b) {
        try {
            this.id = 1318728709 * n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dx.af(" + ')');
        }
    }
    
    public static void wa(final TileItem tileItem, final int n) {
        if (tileItem == null) {
            tileItem.kp();
        }
        tileItem.field1078 = 1318728709 * n;
    }
    
    @Override
    protected final Model ab() {
        return HealthBarUpdate.set(176307405 * this.id, (byte)58).getModel(-1889137184 * this.quantity, -1757520650);
    }
    
    public Tile kp() {
        final int gq = this.gq;
        final int yn = this.yn;
        if (gq == -1 || yn == -1) {
            return null;
        }
        return ScriptFrame.client.la().je()[ScriptFrame.client.getPlane()][gq][yn];
    }
    
    @Override
    protected final Model aq() {
        return HealthBarUpdate.set(176307405 * this.id, (byte)46).getModel(-1745152527 * this.quantity, -62747448);
    }
    
    public void iu(final int i) {
        if (this.gq != -1) {
            Client.nw.debug("Item quantity changed: {} ({} -> {})", new Object[] { this.getId(), this.getQuantity(), i });
            ScriptFrame.client.getCallbacks().post((Object)new ItemQuantityChanged((net.runelite.api.TileItem)this, (net.runelite.api.Tile)this.kp(), this.getQuantity(), i));
        }
    }
    
    public int getQuantity() {
        return this.quantity * -1745152527;
    }
    
    public int yx() {
        return this.gq;
    }
}
