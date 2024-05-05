// 
// Decompiled by Procyon v0.5.36
// 

public class class370
{
    public static BufferedFile[] JagexCache_idxFiles;
    static char[] field3591;
    static char[] field3592;
    static char[] field3593;
    static int[] field3594;
    static final int wp = 4;
    
    class370() throws Throwable {
        throw new Error();
    }
    
    static {
        class370.field3593 = new char[64];
        for (int i = 0; i < 26; ++i) {
            class370.field3593[i] = (char)(65 + i);
        }
        for (int j = 26; j < 52; ++j) {
            class370.field3593[j] = (char)(97 + j - 26);
        }
        for (int k = 52; k < 62; ++k) {
            class370.field3593[k] = (char)(k + 48 - 52);
        }
        class370.field3593[62] = '+';
        class370.field3593[63] = '/';
        class370.field3591 = new char[64];
        for (int l = 0; l < 26; ++l) {
            class370.field3591[l] = (char)(65 + l);
        }
        for (int n = 26; n < 52; ++n) {
            class370.field3591[n] = (char)(n + 97 - 26);
        }
        for (int n2 = 52; n2 < 62; ++n2) {
            class370.field3591[n2] = (char)(48 + n2 - 52);
        }
        class370.field3591[62] = '*';
        class370.field3591[63] = '-';
        class370.field3592 = new char[64];
        for (int n3 = 0; n3 < 26; ++n3) {
            class370.field3592[n3] = (char)(n3 + 65);
        }
        for (int n4 = 26; n4 < 52; ++n4) {
            class370.field3592[n4] = (char)(97 + n4 - 26);
        }
        for (int n5 = 52; n5 < 62; ++n5) {
            class370.field3592[n5] = (char)(n5 + 48 - 52);
        }
        class370.field3592[62] = '-';
        class370.field3592[63] = '_';
        class370.field3594 = new int[128];
        for (int n6 = 0; n6 < class370.field3594.length; ++n6) {
            class370.field3594[n6] = -1;
        }
        for (int n7 = 65; n7 <= 90; ++n7) {
            class370.field3594[n7] = n7 - 65;
        }
        for (int n8 = 97; n8 <= 122; ++n8) {
            class370.field3594[n8] = 26 + (n8 - 97);
        }
        for (int n9 = 48; n9 <= 57; ++n9) {
            class370.field3594[n9] = 52 + (n9 - 48);
        }
        class370.field3594[42] = (class370.field3594[43] = 62);
        class370.field3594[45] = (class370.field3594[47] = 63);
    }
    
    static String at(final byte[] array, final int n, final int n2) {
        final StringBuilder sb = new StringBuilder();
        for (int i = n; i < n2 + n; i += 3) {
            final int n3 = array[i] & 0xFF;
            sb.append(class370.field3593[n3 >>> 2]);
            if (i < n2 - 1) {
                final int n4 = array[1 + i] & 0xFF;
                sb.append(class370.field3593[(n3 & 0x3) << 4 | n4 >>> 4]);
                if (i < n2 - 2) {
                    final int n5 = array[i + 2] & 0xFF;
                    sb.append(class370.field3593[(n4 & 0xF) << 2 | n5 >>> 6]).append(class370.field3593[n5 & 0x3F]);
                }
                else {
                    sb.append(class370.field3593[(n4 & 0xF) << 2]).append("=");
                }
            }
            else {
                sb.append(class370.field3593[(n3 & 0x3) << 4]).append("==");
            }
        }
        return sb.toString();
    }
    
    public static String aw(final byte[] array) {
        return class144.vmethod3248(array, 0, array.length, -1782734500);
    }
    
    static final void clickWidget(final Widget clickedWidget, final int n, final int n2, final int n3) {
        try {
            if (Client.clickedWidget == null) {
                if (n3 >= -1795081153) {
                    throw new IllegalStateException();
                }
                if (!Client.isMenuOpen) {
                    if (clickedWidget != null) {
                        if (n3 >= -1795081153) {
                            throw new IllegalStateException();
                        }
                        Widget vmethod3380 = clickedWidget;
                        final int method1071 = StructComposition.method1071(KeyHandler.getWidgetFlags(vmethod3380, 1550671601), 1014749016);
                        Widget widget = null;
                        Label_0429: {
                            if (method1071 == 0) {
                                if (n3 >= -1795081153) {
                                    return;
                                }
                                widget = null;
                            }
                            else {
                                int i = 0;
                                while (i < method1071) {
                                    if (n3 >= -1795081153) {
                                        throw new IllegalStateException();
                                    }
                                    vmethod3380 = class165.vmethod3380(vmethod3380.parentId * 913615679, (byte)5);
                                    if (vmethod3380 == null) {
                                        if (n3 >= -1795081153) {
                                            return;
                                        }
                                        widget = null;
                                        break Label_0429;
                                    }
                                    else {
                                        ++i;
                                    }
                                }
                                widget = vmethod3380;
                            }
                        }
                        Widget parent = widget;
                        if (null == parent) {
                            if (n3 >= -1795081153) {
                                return;
                            }
                            parent = clickedWidget.parent;
                        }
                        if (parent != null) {
                            if (n3 >= -1795081153) {
                                throw new IllegalStateException();
                            }
                            Client.clickedWidget = clickedWidget;
                            Widget vmethod3381 = clickedWidget;
                            final int method1072 = StructComposition.method1071(KeyHandler.getWidgetFlags(vmethod3381, 610789584), -1713305302);
                            Widget widget2 = null;
                            Label_0365: {
                                if (method1072 == 0) {
                                    if (n3 >= -1795081153) {
                                        return;
                                    }
                                    widget2 = null;
                                }
                                else {
                                    for (int j = 0; j < method1072; ++j) {
                                        if (n3 >= -1795081153) {
                                            throw new IllegalStateException();
                                        }
                                        vmethod3381 = class165.vmethod3380(vmethod3381.parentId * 913615679, (byte)5);
                                        if (vmethod3381 == null) {
                                            widget2 = null;
                                            break Label_0365;
                                        }
                                    }
                                    widget2 = vmethod3381;
                                }
                            }
                            Widget parent2 = widget2;
                            if (parent2 == null) {
                                if (n3 >= -1795081153) {
                                    throw new IllegalStateException();
                                }
                                parent2 = clickedWidget.parent;
                            }
                            Client.clickedWidgetParent = parent2;
                            Client.widgetClickX = -489272497 * n;
                            Client.widgetClickY = n2 * 1757453321;
                            class96.widgetDragDuration = 0;
                            Client.isDraggingWidget = false;
                            Client.nn(-1);
                            final int method1073 = DynamicObject.method461((short)(-15047));
                            if (method1073 != -1) {
                                if (n3 >= -1795081153) {
                                    throw new IllegalStateException();
                                }
                                ZoneOperation.method1597(method1073, (byte)(-87));
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ol.mm(" + ')');
        }
    }
    
    static String al(final byte[] array, final int n, final int n2) {
        final StringBuilder sb = new StringBuilder();
        for (int i = n; i < n2 + n; i += 3) {
            final int n3 = array[i] & 0xFF;
            sb.append(class370.field3593[n3 >>> 2]);
            if (i < n2 - 1) {
                final int n4 = array[1 + i] & 0xFF;
                sb.append(class370.field3593[(n3 & 0x3) << 4 | n4 >>> 4]);
                if (i < n2 - 2) {
                    final int n5 = array[i + 2] & 0xFF;
                    sb.append(class370.field3593[(n4 & 0xF) << 2 | n5 >>> 6]).append(class370.field3593[n5 & 0x3F]);
                }
                else {
                    sb.append(class370.field3593[(n4 & 0xF) << 2]).append("=");
                }
            }
            else {
                sb.append(class370.field3593[(n3 & 0x3) << 4]).append("==");
            }
        }
        return sb.toString();
    }
    
    public static String ac(final byte[] array) {
        return class144.vmethod3248(array, 0, array.length, -1964648139);
    }
    
    public static Link wd(final LinkDeque linkDeque) {
        final Link sentinel = linkDeque.sentinel;
        if (sentinel == linkDeque.current) {
            return linkDeque.sentinel = null;
        }
        linkDeque.sentinel = sentinel.previous;
        return sentinel;
    }
    
    public static String au(final byte[] array) {
        return class144.vmethod3248(array, 0, array.length, -171102712);
    }
    
    static String ab(final byte[] array, final int n, final int n2) {
        final StringBuilder sb = new StringBuilder();
        for (int i = n; i < n2 + n; i += 3) {
            final int n3 = array[i] & 0xFF;
            sb.append(class370.field3593[n3 >>> 2]);
            if (i < n2 - 1) {
                final int n4 = array[1 + i] & 0xFF;
                sb.append(class370.field3593[(n3 & 0x3) << 4 | n4 >>> 4]);
                if (i < n2 - 2) {
                    final int n5 = array[i + 2] & 0x5CC92663;
                    sb.append(class370.field3593[(n4 & 0xF) << 2 | n5 >>> 6]).append(class370.field3593[n5 & 0x3F]);
                }
                else {
                    sb.append(class370.field3593[(n4 & 0xF) << 2]).append("=");
                }
            }
            else {
                sb.append(class370.field3593[(n3 & 0x3) << 4]).append("==");
            }
        }
        return sb.toString();
    }
    
    static String aq(final byte[] array, final int n, final int n2) {
        final StringBuilder sb = new StringBuilder();
        for (int i = n; i < n2 + n; i += 3) {
            final int n3 = array[i] & 0xFF;
            sb.append(class370.field3593[n3 >>> 2]);
            if (i < n2 - 1) {
                final int n4 = array[1 + i] & 0xFF;
                sb.append(class370.field3593[(n3 & 0x3) << 4 | n4 >>> 4]);
                if (i < n2 - 2) {
                    final int n5 = array[i + 2] & 0xFF;
                    sb.append(class370.field3593[(n4 & 0xF) << 2 | n5 >>> 6]).append(class370.field3593[n5 & 0x3F]);
                }
                else {
                    sb.append(class370.field3593[(n4 & 0xF) << 2]).append("=");
                }
            }
            else {
                sb.append(class370.field3593[(n3 & 0x3) << 4]).append("==");
            }
        }
        return sb.toString();
    }
    
    public static boolean xo(final KitDefinition kitDefinition) {
        if (kitDefinition.models2 == null) {
            return true;
        }
        boolean b = true;
        for (int i = 0; i < kitDefinition.models2.length; ++i) {
            if (!KitDefinition.KitDefinition_modelsArchive.tryLoadFile(kitDefinition.models2[i], 0, (byte)(-8))) {
                b = false;
            }
        }
        return b;
    }
}
