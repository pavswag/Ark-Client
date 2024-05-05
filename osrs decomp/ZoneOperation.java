// 
// Decompiled by Procyon v0.5.36
// 

public class ZoneOperation
{
    public static final ZoneOperation field2562;
    public static final ZoneOperation field2563;
    static final int ah = 18;
    public static final ZoneOperation field2564;
    public static final ZoneOperation field2565;
    public static final ZoneOperation field2566;
    public static final ZoneOperation field2567;
    public static final ZoneOperation field2568;
    public static final ZoneOperation field2569;
    public static final ZoneOperation field2570;
    public static final ZoneOperation field2571;
    public static final int ex = 8;
    public static final ZoneOperation field2572;
    
    ZoneOperation(final int n) {
    }
    
    static {
        field2571 = new ZoneOperation(2);
        field2563 = new ZoneOperation(14);
        field2566 = new ZoneOperation(6);
        field2564 = new ZoneOperation(4);
        field2565 = new ZoneOperation(16);
        field2567 = new ZoneOperation(5);
        field2572 = new ZoneOperation(5);
        field2568 = new ZoneOperation(4);
        field2569 = new ZoneOperation(7);
        field2570 = new ZoneOperation(14);
        field2562 = new ZoneOperation(11);
    }
    
    static void method1597(final int n, final byte b) {
        try {
            Language.tempMenuAction = new MenuAction();
            Language.tempMenuAction.param0 = 116605911 * Client.menuArguments1[n];
            Language.tempMenuAction.param1 = Client.menuArguments2[n] * 1112086437;
            Language.tempMenuAction.opcode = Client.menuOpcodes[n] * -1623394963;
            Language.tempMenuAction.identifier = Client.menuIdentifiers[n] * -1353871487;
            Language.tempMenuAction.itemId = 355643405 * Client.menuItemIds[n];
            Language.tempMenuAction.action = Client.menuActions[n];
            Language.tempMenuAction.target = Client.menuTargets[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lm.mv(" + ')');
        }
    }
    
    public static ZoneOperation[] aw() {
        return new ZoneOperation[] { ZoneOperation.field2571, ZoneOperation.field2563, ZoneOperation.field2566, ZoneOperation.field2564, ZoneOperation.field2565, ZoneOperation.field2567, ZoneOperation.field2572, ZoneOperation.field2568, ZoneOperation.field2569, ZoneOperation.field2570, ZoneOperation.field2562 };
    }
    
    public static ZoneOperation[] an() {
        return new ZoneOperation[] { ZoneOperation.field2571, ZoneOperation.field2563, ZoneOperation.field2566, ZoneOperation.field2564, ZoneOperation.field2565, ZoneOperation.field2567, ZoneOperation.field2572, ZoneOperation.field2568, ZoneOperation.field2569, ZoneOperation.field2570, ZoneOperation.field2562 };
    }
    
    public static ZoneOperation[] ac() {
        return new ZoneOperation[] { ZoneOperation.field2571, ZoneOperation.field2563, ZoneOperation.field2566, ZoneOperation.field2564, ZoneOperation.field2565, ZoneOperation.field2567, ZoneOperation.field2572, ZoneOperation.field2568, ZoneOperation.field2569, ZoneOperation.field2570, ZoneOperation.field2562 };
    }
    
    public static ZoneOperation[] au() {
        return new ZoneOperation[] { ZoneOperation.field2571, ZoneOperation.field2563, ZoneOperation.field2566, ZoneOperation.field2564, ZoneOperation.field2565, ZoneOperation.field2567, ZoneOperation.field2572, ZoneOperation.field2568, ZoneOperation.field2569, ZoneOperation.field2570, ZoneOperation.field2562 };
    }
    
    public static ZoneOperation[] ab() {
        return new ZoneOperation[] { ZoneOperation.field2571, ZoneOperation.field2563, ZoneOperation.field2566, ZoneOperation.field2564, ZoneOperation.field2565, ZoneOperation.field2567, ZoneOperation.field2572, ZoneOperation.field2568, ZoneOperation.field2569, ZoneOperation.field2570, ZoneOperation.field2562 };
    }
    
    static final void Widget_resetModelFrames(final int n, final int n2) {
        try {
            if (SoundSystem.loadInterface(n, 1376777516)) {
                final Widget[] array = VerticalAlignment.Widget_interfaceComponents[n];
                for (int i = 0; i < array.length; ++i) {
                    if (n2 <= 923211175) {
                        throw new IllegalStateException();
                    }
                    final Widget widget = array[i];
                    if (widget == null) {
                        if (n2 <= 923211175) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        widget.modelFrame = 0;
                        widget.modelFrameCycle = 0;
                    }
                }
                return;
            }
            if (n2 <= 923211175) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lm.mj(" + ')');
        }
    }
    
    static void method1599(final SequenceDefinition sequenceDefinition, final int n, final int n2, final int n3, final int n4) {
        try {
            if (-297150195 * Client.soundEffectCount < 50) {
                if (n4 != -1566363123) {
                    throw new IllegalStateException();
                }
                if (class20.clientPreferences.method573(-1676290123) != 0) {
                    if (null != sequenceDefinition.soundEffects) {
                        if (n < sequenceDefinition.soundEffects.length) {
                            class161.method908(sequenceDefinition.soundEffects[n], n2, n3, 1719542324);
                            return;
                        }
                        if (n4 != -1566363123) {
                            throw new IllegalStateException();
                        }
                    }
                    return;
                }
                if (n4 != -1566363123) {
                    return;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lm.hk(" + ')');
        }
    }
}
