import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.36
// 

public class class357
{
    static final int aq = 1;
    static Fonts WorldMapElement_fonts;
    public static final int ah = 32;
    static final int ac = 100;
    public static final int an = 2;
    
    class357() throws Throwable {
        throw new Error();
    }
    
    static {
        new HashMap();
    }
    
    static final void closeInterface(final InterfaceParent interfaceParent, final boolean b, final int n) {
        Client.shouldLeftClickOpenMenu(interfaceParent, b);
        try {
            final int n2 = 944864121 * interfaceParent.group;
            final int n3 = (int)interfaceParent.hr;
            interfaceParent.hw();
            if (b) {
                if (n >= 1782994133) {
                    throw new IllegalStateException();
                }
                if (-1 == n2) {
                    if (n >= 1782994133) {
                        throw new IllegalStateException();
                    }
                }
                else if (!class264.Widget_loadedInterfaces[n2]) {
                    if (n >= 1782994133) {
                        return;
                    }
                }
                else {
                    UserComparator3.Widget_archive.clearFilesGroup(n2, (byte)(-93));
                    if (VerticalAlignment.Widget_interfaceComponents[n2] == null) {
                        if (n >= 1782994133) {
                            return;
                        }
                    }
                    else {
                        for (int i = 0; i < VerticalAlignment.Widget_interfaceComponents[n2].length; ++i) {
                            if (VerticalAlignment.Widget_interfaceComponents[n2][i] != null) {
                                if (n >= 1782994133) {
                                    throw new IllegalStateException();
                                }
                                VerticalAlignment.Widget_interfaceComponents[n2][i] = null;
                            }
                        }
                        VerticalAlignment.Widget_interfaceComponents[n2] = null;
                        class264.Widget_loadedInterfaces[n2] = false;
                    }
                }
            }
            for (IntegerNode integerNode = (IntegerNode)Client.widgetFlags.first(); integerNode != null; integerNode = (IntegerNode)Client.widgetFlags.next()) {
                if (n >= 1782994133) {
                    throw new IllegalStateException();
                }
                if ((integerNode.hr >> 48 & 0xFFFFL) == n2) {
                    if (n >= 1782994133) {
                        return;
                    }
                    integerNode.hw();
                }
            }
            final Widget vmethod3380 = class165.vmethod3380(n3, (byte)5);
            if (null != vmethod3380) {
                if (n >= 1782994133) {
                    throw new IllegalStateException();
                }
                class144.invalidateWidget(vmethod3380, -2114818257);
            }
            if (-896157613 * Client.rootInterface != -1) {
                if (n >= 1782994133) {
                    return;
                }
                class127.runIntfCloseListeners(-896157613 * Client.rootInterface, 1, (byte)63);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nv.my(" + ')');
        }
    }
}
