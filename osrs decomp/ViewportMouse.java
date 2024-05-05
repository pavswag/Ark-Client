// 
// Decompiled by Procyon v0.5.36
// 

public class ViewportMouse
{
    public static boolean ViewportMouse_false0;
    public static int ViewportMouse_entityCount;
    public static int ViewportMouse_y;
    public static boolean ViewportMouse_isInViewport;
    static int field2207;
    static int field2208;
    static int field2209;
    public static int ViewportMouse_x;
    static int field2211;
    public static long[] ViewportMouse_entityTags;
    public static final int ae = 127;
    static String field2213;
    
    ViewportMouse() throws Throwable {
        throw new Error();
    }
    
    static {
        ViewportMouse.ViewportMouse_isInViewport = false;
        ViewportMouse.ViewportMouse_x = 0;
        ViewportMouse.ViewportMouse_y = 0;
        ViewportMouse.ViewportMouse_false0 = false;
        ViewportMouse.ViewportMouse_entityCount = 0;
        ViewportMouse.ViewportMouse_entityTags = new long[1000];
    }
    
    static final void bs(final long n) {
        ViewportMouse.ViewportMouse_entityTags[(ViewportMouse.ViewportMouse_entityCount -= 429048361) * -1048050201 - 1] = n;
    }
    
    public static int ad(final int n) {
        return (int)(ViewportMouse.ViewportMouse_entityTags[n] >>> 0 & 0x7FL);
    }
    
    static final void ba() {
        if (ViewportMouse.ViewportMouse_false0) {
            return;
        }
        final int scene_cameraPitchSine = Scene.Scene_cameraPitchSine;
        final int scene_cameraPitchCosine = Scene.Scene_cameraPitchCosine;
        final int scene_cameraYawSine = Scene.Scene_cameraYawSine;
        final int scene_cameraYawCosine = Scene.Scene_cameraYawCosine;
        final int n = 50;
        final int n2 = 3500;
        final int n3 = (2139535413 * ViewportMouse.ViewportMouse_x - TaskHandler.getClipMidX(-826926980)) * n / UserComparator7.get3dZoom(1508621440);
        final int n4 = (148198745 * ViewportMouse.ViewportMouse_y - class12.getClipMidY(-1198218767)) * n / UserComparator7.get3dZoom(-1881694029);
        final int n5 = (2139535413 * ViewportMouse.ViewportMouse_x - TaskHandler.getClipMidX(1076380869)) * n2 / UserComparator7.get3dZoom(-1044261476);
        final int n6 = (ViewportMouse.ViewportMouse_y * 148198745 - class12.getClipMidY(4510370)) * n2 / UserComparator7.get3dZoom(1004375477);
        final int n7 = scene_cameraPitchCosine * n4 + scene_cameraPitchSine * n >> 16;
        final int n8 = scene_cameraPitchCosine * n - scene_cameraPitchSine * n4 >> 16;
        final int n9 = n7;
        final int n10 = n2 * scene_cameraPitchSine + scene_cameraPitchCosine * n6 >> 16;
        final int n11 = scene_cameraPitchCosine * n2 - n6 * scene_cameraPitchSine >> 16;
        final int n12 = n10;
        final int method2093 = class387.method2093(n3, n8, scene_cameraYawCosine, scene_cameraYawSine, (byte)(-48));
        final int method2094 = class437.method2295(n3, n8, scene_cameraYawCosine, scene_cameraYawSine, (byte)(-62));
        final int n13 = method2093;
        final int method2095 = class387.method2093(n5, n11, scene_cameraYawCosine, scene_cameraYawSine, (byte)(-51));
        final int method2096 = class437.method2295(n5, n11, scene_cameraYawCosine, scene_cameraYawSine, (byte)16);
        final int n14 = method2095;
        ViewportMouse.field2207 = -1666864639 * ((n13 + n14) / 2);
        class294.field2715 = -158275257 * ((n9 + n12) / 2);
        ViewportMouse.field2208 = -393366251 * ((method2096 + method2094) / 2);
        ViewportMouse.field2209 = (n14 - n13) / 2 * 1520532401;
        UserComparator8.field1157 = 101851969 * ((n12 - n9) / 2);
        ReflectionCheck.field166 = (method2096 - method2094) / 2 * 1785143657;
        EnumComposition.field1536 = Math.abs(ViewportMouse.field2209 * 1677061457) * 1650720741;
        ViewportMouse.field2211 = Math.abs(-864785215 * UserComparator8.field1157) * 1274213335;
        class9.field29 = Math.abs(-2085912871 * ReflectionCheck.field166) * 1268910509;
    }
    
    public static int ae(final int n) {
        return NPCComposition.method1022(ViewportMouse.ViewportMouse_entityTags[n]);
    }
    
    public static int bb(final long n) {
        return (int)(n >>> 7 & 0x7FL);
    }
    
    public static long ak(final int n) {
        return ViewportMouse.ViewportMouse_entityTags[n];
    }
    
    public static int av() {
        return -1983599686 * ViewportMouse.ViewportMouse_entityCount;
    }
    
    public static int be(final long n) {
        return (int)(n >>> 14 & 0x3L);
    }
    
    public static boolean as(final long n) {
        boolean b = 0L != n;
        if (b) {
            b = (1 != (int)(n >>> 16 & 0x1L));
        }
        return b;
    }
    
    public static long az(final int n) {
        return ViewportMouse.ViewportMouse_entityTags[n];
    }
    
    public static int bi(final long n) {
        return (int)(n >>> 14 & 0x3L);
    }
    
    static final boolean bv(final Model model, final int i, final int n, final int n2, final int n3) {
        if (!ViewportMouse.ViewportMouse_isInViewport) {
            return false;
        }
        class122.method737(-1668789662);
        final AABB aabb = model.aabb.get(i);
        final int n4 = -794720613 * aabb.zMidOffset + n;
        final int n5 = n2 + 1835155678 * aabb.xMidOffset;
        final int n6 = -1829833534 * aabb.yMid + n3;
        final int n7 = 1602696759 * aabb.xMid;
        final int n8 = 1831955167 * aabb.zMid;
        final int n9 = aabb.yMidOffset * -452185969;
        final int a = 891695392 * ViewportMouse.field2207 - n4;
        final int a2 = class294.field2715 * 483462680 - n5;
        final int a3 = 1731453430 * ViewportMouse.field2208 - n6;
        return Math.abs(a) <= -391109139 * EnumComposition.field1536 + n7 && Math.abs(a2) <= n8 + ViewportMouse.field2211 * -562124017 && Math.abs(a3) <= class9.field29 * 1536980811 + n9 && Math.abs(a3 * (-864785215 * UserComparator8.field1157) - a2 * (-667776874 * ReflectionCheck.field166)) <= n8 * (-2043788763 * class9.field29) + n9 * (ViewportMouse.field2211 * 1926934503) && Math.abs(-2085912871 * ReflectionCheck.field166 * a - a3 * (1472798785 * ViewportMouse.field2209)) <= EnumComposition.field1536 * -472007681 * n9 + n7 * (-137852382 * class9.field29) && Math.abs(a2 * (ViewportMouse.field2209 * 1677061457) - -864785215 * UserComparator8.field1157 * a) <= -391109139 * EnumComposition.field1536 * n8 + 872259618 * ViewportMouse.field2211 * n7;
    }
    
    public static long bo(final int n, final int n2, final int n3, final boolean b, final int n4) {
        long n5 = (long)((n & 0x8BD05460) << 0 | (n2 & 0x7F) << 7 | (n3 & 0x3) << 14) | ((long)n4 & 0xFFFFFFFFL) << 17;
        if (b) {
            n5 |= 0x10000L;
        }
        return n5;
    }
    
    static final boolean bp(final Model model, final int i, final int n, final int n2, final int n3) {
        if (!ViewportMouse.ViewportMouse_isInViewport) {
            return false;
        }
        class122.method737(-1310860098);
        final AABB aabb = model.aabb.get(i);
        final int n4 = 108689513 * aabb.zMidOffset + n;
        final int n5 = n2 + 849275953 * aabb.xMidOffset;
        final int n6 = -1615192333 * aabb.yMid + n3;
        final int n7 = -1923653815 * aabb.xMid;
        final int n8 = -975840301 * aabb.zMid;
        final int n9 = aabb.yMidOffset * -452185969;
        final int a = -1874962943 * ViewportMouse.field2207 - n4;
        final int a2 = class294.field2715 * 554168439 - n5;
        final int a3 = -1672023491 * ViewportMouse.field2208 - n6;
        return Math.abs(a) <= -391109139 * EnumComposition.field1536 + n7 && Math.abs(a2) <= n8 + ViewportMouse.field2211 * 1926934503 && Math.abs(a3) <= class9.field29 * -2043788763 + n9 && Math.abs(a3 * (-864785215 * UserComparator8.field1157) - a2 * (-2085912871 * ReflectionCheck.field166)) <= n8 * (-2043788763 * class9.field29) + n9 * (ViewportMouse.field2211 * 1926934503) && Math.abs(-2085912871 * ReflectionCheck.field166 * a - a3 * (1677061457 * ViewportMouse.field2209)) <= EnumComposition.field1536 * -391109139 * n9 + n7 * (-2043788763 * class9.field29) && Math.abs(a2 * (ViewportMouse.field2209 * 1677061457) - -864785215 * UserComparator8.field1157 * a) <= -391109139 * EnumComposition.field1536 * n8 + 1926934503 * ViewportMouse.field2211 * n7;
    }
    
    public static final void bt() {
        ViewportMouse.ViewportMouse_isInViewport = false;
        ViewportMouse.ViewportMouse_entityCount = 0;
    }
    
    static final int br() {
        return ViewportMouse.ViewportMouse_x * -123469290;
    }
    
    static boolean am(final long n) {
        return TextureProvider.animate(n) == 2;
    }
    
    static int method1345(final int n, final byte b) {
        try {
            return class28.KeyHandler_keyCodes[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ix.an(" + ')');
        }
    }
    
    static final void bq() {
        if (ViewportMouse.ViewportMouse_false0) {
            return;
        }
        final int scene_cameraPitchSine = Scene.Scene_cameraPitchSine;
        final int scene_cameraPitchCosine = Scene.Scene_cameraPitchCosine;
        final int scene_cameraYawSine = Scene.Scene_cameraYawSine;
        final int scene_cameraYawCosine = Scene.Scene_cameraYawCosine;
        final int n = 50;
        final int n2 = 3500;
        final int n3 = (2139535413 * ViewportMouse.ViewportMouse_x - TaskHandler.getClipMidX(-298533423)) * n / UserComparator7.get3dZoom(1734469583);
        final int n4 = (148198745 * ViewportMouse.ViewportMouse_y - class12.getClipMidY(229991533)) * n / UserComparator7.get3dZoom(2038076810);
        final int n5 = (2139535413 * ViewportMouse.ViewportMouse_x - TaskHandler.getClipMidX(614932004)) * n2 / UserComparator7.get3dZoom(-1610426044);
        final int n6 = (ViewportMouse.ViewportMouse_y * 148198745 - class12.getClipMidY(-647832588)) * n2 / UserComparator7.get3dZoom(-634129302);
        final int n7 = scene_cameraPitchCosine * n4 + scene_cameraPitchSine * n >> 16;
        final int n8 = scene_cameraPitchCosine * n - scene_cameraPitchSine * n4 >> 16;
        final int n9 = n7;
        final int n10 = n2 * scene_cameraPitchSine + scene_cameraPitchCosine * n6 >> 16;
        final int n11 = scene_cameraPitchCosine * n2 - n6 * scene_cameraPitchSine >> 16;
        final int n12 = n10;
        final int method2093 = class387.method2093(n3, n8, scene_cameraYawCosine, scene_cameraYawSine, (byte)(-96));
        final int method2094 = class437.method2295(n3, n8, scene_cameraYawCosine, scene_cameraYawSine, (byte)(-13));
        final int n13 = method2093;
        final int method2095 = class387.method2093(n5, n11, scene_cameraYawCosine, scene_cameraYawSine, (byte)(-52));
        final int method2096 = class437.method2295(n5, n11, scene_cameraYawCosine, scene_cameraYawSine, (byte)86);
        final int n14 = method2095;
        ViewportMouse.field2207 = -1666864639 * ((n13 + n14) / 2);
        class294.field2715 = -158275257 * ((n9 + n12) / 2);
        ViewportMouse.field2208 = -393366251 * ((method2096 + method2094) / 2);
        ViewportMouse.field2209 = (n14 - n13) / 2 * 1520532401;
        UserComparator8.field1157 = 101851969 * ((n12 - n9) / 2);
        ReflectionCheck.field166 = (method2096 - method2094) / 2 * 1785143657;
        EnumComposition.field1536 = Math.abs(ViewportMouse.field2209 * 1677061457) * 1650720741;
        ViewportMouse.field2211 = Math.abs(-864785215 * UserComparator8.field1157) * 1274213335;
        class9.field29 = Math.abs(-2085912871 * ReflectionCheck.field166) * 1268910509;
    }
    
    public static int by(final long n) {
        return (int)(n >>> 7 & 0x7FL);
    }
    
    public static int bx(final long n) {
        return (int)(n >>> 17 & 0xFFFFFFFFL);
    }
    
    public static int ar() {
        return -1048050201 * ViewportMouse.ViewportMouse_entityCount;
    }
    
    public static int ap(final long n) {
        return (int)(n >>> 7 & 0x7FL);
    }
    
    public static final void bd() {
        ViewportMouse.ViewportMouse_isInViewport = false;
        ViewportMouse.ViewportMouse_entityCount = 0;
    }
    
    static final int bg() {
        return ViewportMouse.ViewportMouse_x * 2139535413;
    }
    
    static final void bn(final long n) {
        ViewportMouse.ViewportMouse_entityTags[(ViewportMouse.ViewportMouse_entityCount -= 429048361) * -1048050201 - 1] = n;
    }
    
    public static boolean aj(final long n) {
        boolean b = 0L != n;
        if (b) {
            b = (1 != (int)(n >>> 16 & 0x1L));
        }
        return b;
    }
    
    static final boolean bl(final Model model, final int i, final int n, final int n2, final int n3) {
        if (!ViewportMouse.ViewportMouse_isInViewport) {
            return false;
        }
        class122.method737(-749522997);
        final AABB aabb = model.aabb.get(i);
        final int n4 = 108689513 * aabb.zMidOffset + n;
        final int n5 = n2 + 849275953 * aabb.xMidOffset;
        final int n6 = -1615192333 * aabb.yMid + n3;
        final int n7 = -1923653815 * aabb.xMid;
        final int n8 = -975840301 * aabb.zMid;
        final int n9 = aabb.yMidOffset * -452185969;
        final int a = -1874962943 * ViewportMouse.field2207 - n4;
        final int a2 = class294.field2715 * 554168439 - n5;
        final int a3 = -1672023491 * ViewportMouse.field2208 - n6;
        return Math.abs(a) <= -391109139 * EnumComposition.field1536 + n7 && Math.abs(a2) <= n8 + ViewportMouse.field2211 * 1926934503 && Math.abs(a3) <= class9.field29 * -2043788763 + n9 && Math.abs(a3 * (-864785215 * UserComparator8.field1157) - a2 * (-2085912871 * ReflectionCheck.field166)) <= n8 * (-2043788763 * class9.field29) + n9 * (ViewportMouse.field2211 * 1926934503) && Math.abs(-2085912871 * ReflectionCheck.field166 * a - a3 * (1677061457 * ViewportMouse.field2209)) <= EnumComposition.field1536 * -391109139 * n9 + n7 * (-2043788763 * class9.field29) && Math.abs(a2 * (ViewportMouse.field2209 * 1677061457) - -864785215 * UserComparator8.field1157 * a) <= -391109139 * EnumComposition.field1536 * n8 + 1926934503 * ViewportMouse.field2211 * n7;
    }
    
    public static long bz(final int n, final int n2, final int n3, final boolean b, final int n4) {
        long n5 = (long)((n & 0x7F) << 0 | (n2 & 0x7F) << 7 | (n3 & 0x3) << 14) | ((long)n4 & 0xFFFFFFFFL) << 17;
        if (b) {
            n5 |= 0x10000L;
        }
        return n5;
    }
    
    static final void bj(final long n) {
        ViewportMouse.ViewportMouse_entityTags[(ViewportMouse.ViewportMouse_entityCount -= 429048361) * -330651255 - 1] = n;
    }
    
    static final void updateInterface(final Widget[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        Client.qw(array, n, n2, n3, n4, n5, n6, n7);
        try {
            for (int i = 0; i < array.length; ++i) {
                final Widget widget = array[i];
                if (null != widget) {
                    if (n != widget.parentId * 913615679) {
                        if (n8 <= 976680902) {
                            return;
                        }
                    }
                    else if (Widget.pv(widget, -2144772982) || KeyHandler.getWidgetFlags(widget, 1867560317) != 0 || widget == Client.clickedWidgetParent) {
                        if (widget.modelOrthog) {
                            if (class393.isComponentHidden(widget, (byte)1)) {
                                continue;
                            }
                        }
                        else if (0 == widget.type * 883712245 && MidiPcmStream.mousedOverWidgetIf1 != widget && class393.isComponentHidden(widget, (byte)1)) {
                            continue;
                        }
                        if (11 == widget.type * 883712245) {
                            if (widget.method1820(class14.urlRequester, 622561639)) {
                                if (widget.method1807(-1778717342)) {
                                    class144.invalidateWidget(widget, -2024981879);
                                    WallDecoration.revalidateWidgetScroll(widget.children, widget, true, (byte)19);
                                }
                                if (widget.field2961 != null) {
                                    if (n8 <= 976680902) {
                                        return;
                                    }
                                    final ScriptEvent scriptEvent = new ScriptEvent();
                                    scriptEvent.dragTarget = widget;
                                    scriptEvent.args = widget.field2961;
                                    Client.scriptEvents.addFirst(scriptEvent);
                                }
                            }
                        }
                        else if (883712245 * widget.type == 12 && widget.method1822((byte)(-85))) {
                            class144.invalidateWidget(widget, -1230896704);
                        }
                        final int n9 = 262951665 * widget.x + n6;
                        final int n10 = -747355095 * widget.y + n7;
                        int n18;
                        int n19;
                        int n20;
                        int n21;
                        if (9 == 883712245 * widget.type) {
                            int n11 = n9;
                            int n12 = n10;
                            int n13 = -794961409 * widget.width + n9;
                            int n14 = widget.height * 1473950221 + n10;
                            if (n13 < n11) {
                                final int n15 = n11;
                                n11 = n13;
                                n13 = n15;
                            }
                            if (n14 < n12) {
                                final int n16 = n12;
                                n12 = n14;
                                n14 = n16;
                            }
                            ++n13;
                            ++n14;
                            int n17;
                            if (n11 > n2) {
                                if (n8 <= 976680902) {
                                    return;
                                }
                                n17 = n11;
                            }
                            else {
                                n17 = n2;
                            }
                            n18 = n17;
                            n19 = ((n12 > n3) ? n12 : n3);
                            n20 = ((n13 < n4) ? n13 : n4);
                            n21 = ((n14 < n5) ? n14 : n5);
                        }
                        else {
                            final int n22 = n9 + widget.width * -794961409;
                            final int n23 = n10 + widget.height * 1473950221;
                            n18 = ((n9 > n2) ? n9 : n2);
                            n19 = ((n10 > n3) ? n10 : n3);
                            n20 = ((n22 < n4) ? n22 : n4);
                            n21 = ((n23 < n5) ? n23 : n5);
                        }
                        if (widget == Client.clickedWidget) {
                            if (n8 <= 976680902) {
                                return;
                            }
                            Client.field622 = true;
                            Client.field544 = 463567197 * n9;
                            Client.field545 = 551918419 * n10;
                        }
                        boolean b = false;
                        if (widget.fill) {
                            switch (Client.field463 * -1722511035) {
                                case 0: {
                                    b = true;
                                    break;
                                }
                                case 3: {
                                    if (Client.field526 * -842617159 == widget.id * 1713081171) {
                                        b = true;
                                        break;
                                    }
                                    break;
                                }
                                case 2: {
                                    if (-842617159 * Client.field526 == widget.id * 1713081171 >>> 16) {
                                        b = true;
                                        break;
                                    }
                                    break;
                                }
                            }
                        }
                        if (!b && widget.modelOrthog) {
                            if (n18 >= n20) {
                                continue;
                            }
                            if (n19 >= n21) {
                                continue;
                            }
                        }
                        if (widget.modelOrthog) {
                            if (widget.hasListener) {
                                if (-2063363905 * MouseHandler.MouseHandler_x >= n18 && -1224153235 * MouseHandler.MouseHandler_y >= n19 && -2063363905 * MouseHandler.MouseHandler_x < n20 && MouseHandler.MouseHandler_y * -1224153235 < n21) {
                                    for (ScriptEvent scriptEvent2 = (ScriptEvent)Client.scriptEvents.last(); null != scriptEvent2; scriptEvent2 = (ScriptEvent)Client.scriptEvents.previous()) {
                                        if (scriptEvent2.field849) {
                                            scriptEvent2.hw();
                                            scriptEvent2.dragTarget.isHidden = false;
                                        }
                                    }
                                    WorldMapData_1.method1486((short)4393);
                                    if (0 == class96.widgetDragDuration * 1993201275) {
                                        Client.clickedWidget = null;
                                        Client.clickedWidgetParent = null;
                                    }
                                    if (!Client.isMenuOpen) {
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                        class156.addCancelMenuEntry(-742935767);
                                    }
                                }
                            }
                            else if (widget.prioritizeMenuEntry && MouseHandler.MouseHandler_x * -2063363905 >= n18 && -1224153235 * MouseHandler.MouseHandler_y >= n19 && MouseHandler.MouseHandler_x * -2063363905 < n20 && -1224153235 * MouseHandler.MouseHandler_y < n21) {
                                for (ScriptEvent scriptEvent3 = (ScriptEvent)Client.scriptEvents.last(); null != scriptEvent3; scriptEvent3 = (ScriptEvent)Client.scriptEvents.previous()) {
                                    if (n8 <= 976680902) {
                                        return;
                                    }
                                    if (scriptEvent3.field849 && scriptEvent3.args == scriptEvent3.dragTarget.onScroll) {
                                        scriptEvent3.hw();
                                    }
                                }
                            }
                        }
                        int n24 = MouseHandler.MouseHandler_x * -2063363905;
                        int n25 = MouseHandler.MouseHandler_y * -1224153235;
                        if (-1222491879 * MouseHandler.MouseHandler_lastButton != 0) {
                            n24 = MouseHandler.MouseHandler_lastPressedX * 2020601481;
                            n25 = MouseHandler.MouseHandler_lastPressedY * 1163896205;
                        }
                        final boolean b2 = n24 >= n18 && n25 >= n19 && n24 < n20 && n25 < n21;
                        if (1021339961 * widget.contentType == 1337) {
                            if (!Client.isLoading && !Client.isMenuOpen && b2) {
                                ScriptFrame.addSceneMenuOptions(n24, n25, n18, n19, -1708655552);
                            }
                        }
                        else if (1338 == 1021339961 * widget.contentType) {
                            MusicPatchNode.checkIfMinimapClicked(widget, n9, n10, (byte)(-122));
                        }
                        else {
                            if (1400 == widget.contentType * 1021339961) {
                                class126.worldMap.onCycle(-2063363905 * MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y * -1224153235, b2, n9, n10, widget.width * -794961409, widget.height * 1473950221, -529416730);
                            }
                            if (!Client.isMenuOpen && b2) {
                                if (n8 <= 976680902) {
                                    return;
                                }
                                if (1021339961 * widget.contentType == 1400) {
                                    class126.worldMap.addElementMenuOptions(n9, n10, -794961409 * widget.width, 1473950221 * widget.height, n24, n25, -746729453);
                                }
                                else {
                                    class335.method1851(widget, -478627331);
                                }
                            }
                            if (b) {
                                for (int j = 0; j < widget.field2954.length; ++j) {
                                    int n26 = 0;
                                    boolean b3 = false;
                                    if (n26 == 0 && widget.field2954[j] != null) {
                                        int k = 0;
                                    Label_0021_Outer:
                                        while (k < widget.field2954[j].length) {
                                            boolean keyPressed = false;
                                            if (null != widget.field2952) {
                                                keyPressed = Client.keyHandlerInstance.getKeyPressed(widget.field2954[j][k], -1689131084);
                                            }
                                            while (true) {
                                                Label_1826: {
                                                    if (class81.method485(widget.field2954[j][k], -2013563855)) {
                                                        break Label_1826;
                                                    }
                                                    if (keyPressed) {
                                                        if (n8 <= 976680902) {
                                                            return;
                                                        }
                                                        break Label_1826;
                                                    }
                                                    ++k;
                                                    continue Label_0021_Outer;
                                                }
                                                n26 = 1;
                                                if (null != widget.field2952) {
                                                    if (n8 <= 976680902) {
                                                        return;
                                                    }
                                                    if (widget.field2952[j] > -1886224337 * Client.cycle) {
                                                        break;
                                                    }
                                                }
                                                final byte b4 = widget.field2955[j][k];
                                                if (b4 != 0) {
                                                    if ((b4 & 0x8) != 0x0) {
                                                        if (n8 <= 976680902) {
                                                            return;
                                                        }
                                                        if (Client.keyHandlerInstance.getKeyPressed(86, -413159163) || Client.keyHandlerInstance.getKeyPressed(82, -675949675)) {
                                                            continue;
                                                        }
                                                        if (Client.keyHandlerInstance.getKeyPressed(81, 969046629)) {
                                                            if (n8 <= 976680902) {
                                                                return;
                                                            }
                                                            continue;
                                                        }
                                                    }
                                                    if ((b4 & 0x2) != 0x0) {
                                                        if (n8 <= 976680902) {
                                                            return;
                                                        }
                                                        if (!Client.keyHandlerInstance.getKeyPressed(86, 309886803)) {
                                                            continue;
                                                        }
                                                    }
                                                    if ((b4 & 0x1) != 0x0 && !Client.keyHandlerInstance.getKeyPressed(82, -890975453)) {
                                                        continue;
                                                    }
                                                    if (0x0 != (b4 & 0x4) && !Client.keyHandlerInstance.getKeyPressed(81, -1425585457)) {
                                                        continue;
                                                    }
                                                }
                                                break;
                                            }
                                            b3 = true;
                                            break;
                                        }
                                    }
                                    if (b3) {
                                        if (j < 10) {
                                            Message.widgetDefaultMenuAction(1 + j, widget.id * 1713081171, widget.childIndex * 55577617, -2006098851 * widget.itemId, "", 1238902143);
                                        }
                                        else if (j == 10) {
                                            class166.Widget_runOnTargetLeave((byte)9);
                                            class18.selectSpell(widget.id * 1713081171, 55577617 * widget.childIndex, class195.method1052(KeyHandler.getWidgetFlags(widget, 1804651039), 1489168609), -2006098851 * widget.itemId, -308434665);
                                            Client.field530 = MusicPatchNode.Widget_getSpellActionName(widget, 603369429);
                                            if (Client.field530 == null) {
                                                Client.field530 = Strings.at;
                                            }
                                            Client.field522 = widget.field3004 + class383.method2081(16777215, 637859337);
                                        }
                                        final int n27 = widget.field2936[j];
                                        if (null == widget.field2952) {
                                            widget.field2952 = new int[widget.field2954.length];
                                        }
                                        if (widget.field2977 == null) {
                                            widget.field2977 = new int[widget.field2954.length];
                                        }
                                        if (n27 != 0) {
                                            if (0 == widget.field2952[j]) {
                                                if (n8 <= 976680902) {
                                                    return;
                                                }
                                                widget.field2952[j] = -1886224337 * Client.cycle + n27 + widget.field2977[j];
                                            }
                                            else {
                                                widget.field2952[j] = n27 + Client.cycle * -1886224337;
                                            }
                                        }
                                        else {
                                            widget.field2952[j] = Integer.MAX_VALUE;
                                        }
                                    }
                                    if (n26 == 0 && null != widget.field2952) {
                                        widget.field2952[j] = 0;
                                    }
                                }
                            }
                            if (widget.modelOrthog) {
                                if (n8 <= 976680902) {
                                    return;
                                }
                                int n28;
                                if (-2063363905 * MouseHandler.MouseHandler_x >= n18 && -1224153235 * MouseHandler.MouseHandler_y >= n19 && MouseHandler.MouseHandler_x * -2063363905 < n20 && MouseHandler.MouseHandler_y * -1224153235 < n21) {
                                    n28 = 1;
                                }
                                else {
                                    n28 = 0;
                                }
                                int n29 = 0;
                                Label_2584: {
                                    if (1 != MouseHandler.MouseHandler_currentButton * 114417019) {
                                        if (class473.mouseCam) {
                                            break Label_2584;
                                        }
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                        if (4 != 114417019 * MouseHandler.MouseHandler_currentButton) {
                                            break Label_2584;
                                        }
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                    }
                                    if (n28 != 0) {
                                        n29 = 1;
                                    }
                                }
                                int n30 = 0;
                                Label_3742: {
                                    if (1 != -1222491879 * MouseHandler.MouseHandler_lastButton) {
                                        if (class473.mouseCam || MouseHandler.MouseHandler_lastButton * -1222491879 != 4) {
                                            break Label_3742;
                                        }
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                    }
                                    if (MouseHandler.MouseHandler_lastPressedX * 2020601481 >= n18) {
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                        if (MouseHandler.MouseHandler_lastPressedY * 1163896205 >= n19 && 2020601481 * MouseHandler.MouseHandler_lastPressedX < n20 && 1163896205 * MouseHandler.MouseHandler_lastPressedY < n21) {
                                            if (n8 <= 976680902) {
                                                return;
                                            }
                                            n30 = 1;
                                        }
                                    }
                                }
                                if (n30 != 0) {
                                    if (n8 <= 976680902) {
                                        return;
                                    }
                                    class370.clickWidget(widget, MouseHandler.MouseHandler_lastPressedX * 2020601481 - n9, 1163896205 * MouseHandler.MouseHandler_lastPressedY - n10, -1880681871);
                                }
                                if (Widget.sc(widget, 799063438)) {
                                    if (n8 <= 976680902) {
                                        return;
                                    }
                                    if (n30 != 0) {
                                        Client.field569.addFirst(new class206(0, -2063363905 * MouseHandler.MouseHandler_x - n9, -1224153235 * MouseHandler.MouseHandler_y - n10, widget));
                                    }
                                    if (n29 != 0) {
                                        Client.field569.addFirst(new class206(1, -2063363905 * MouseHandler.MouseHandler_x - n9, MouseHandler.MouseHandler_y * -1224153235 - n10, widget));
                                    }
                                }
                                if (1021339961 * widget.contentType == 1400) {
                                    class126.worldMap.method2331(n24, n25, (boolean)((n28 & n29) != 0x0), (boolean)((n28 & n30) != 0x0), -591700137);
                                }
                                if (null != Client.clickedWidget) {
                                    if (n8 <= 976680902) {
                                        return;
                                    }
                                    if (widget != Client.clickedWidget && n28 != 0 && MusicPatchNode.method1676(KeyHandler.getWidgetFlags(widget, 618819965), -1731174532)) {
                                        Client.draggedOnWidget = widget;
                                    }
                                }
                                if (widget == Client.clickedWidgetParent) {
                                    Client.field540 = true;
                                    Client.field495 = -1150287901 * n9;
                                    Client.field542 = 68006725 * n10;
                                }
                                if (widget.field2978) {
                                    if (n28 != 0) {
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                        if (0 != -121753353 * Client.mouseWheelRotation) {
                                            if (n8 <= 976680902) {
                                                return;
                                            }
                                            if (null != widget.onScroll) {
                                                final ScriptEvent scriptEvent4 = new ScriptEvent();
                                                scriptEvent4.field849 = true;
                                                scriptEvent4.dragTarget = widget;
                                                scriptEvent4.mouseY = 835807251 * Client.mouseWheelRotation;
                                                scriptEvent4.args = widget.onScroll;
                                                Client.scriptEvents.addFirst(scriptEvent4);
                                            }
                                        }
                                    }
                                    Label_3169: {
                                        if (null == Client.clickedWidget) {
                                            if (n8 <= 976680902) {
                                                return;
                                            }
                                            if (!Client.isMenuOpen) {
                                                break Label_3169;
                                            }
                                            if (n8 <= 976680902) {
                                                return;
                                            }
                                        }
                                        n30 = 0;
                                        n29 = 0;
                                        n28 = 0;
                                    }
                                    if (!widget.modelTransparency && n30 != 0) {
                                        widget.modelTransparency = true;
                                        if (widget.onClick != null) {
                                            final ScriptEvent scriptEvent5 = new ScriptEvent();
                                            scriptEvent5.field849 = true;
                                            scriptEvent5.dragTarget = widget;
                                            scriptEvent5.mouseX = (MouseHandler.MouseHandler_lastPressedX * 2020601481 - n9) * -2011830585;
                                            scriptEvent5.mouseY = 1126405829 * (MouseHandler.MouseHandler_lastPressedY * 1163896205 - n10);
                                            scriptEvent5.args = widget.onClick;
                                            Client.scriptEvents.addFirst(scriptEvent5);
                                        }
                                    }
                                    if (widget.modelTransparency && n29 != 0 && null != widget.onClickRepeat) {
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                        final ScriptEvent scriptEvent6 = new ScriptEvent();
                                        scriptEvent6.field849 = true;
                                        scriptEvent6.dragTarget = widget;
                                        scriptEvent6.mouseX = (-2063363905 * MouseHandler.MouseHandler_x - n9) * -2011830585;
                                        scriptEvent6.mouseY = (-1224153235 * MouseHandler.MouseHandler_y - n10) * 1126405829;
                                        scriptEvent6.args = widget.onClickRepeat;
                                        Client.scriptEvents.addFirst(scriptEvent6);
                                    }
                                    if (widget.modelTransparency && n29 == 0) {
                                        widget.modelTransparency = false;
                                        if (null != widget.onRelease) {
                                            if (n8 <= 976680902) {
                                                return;
                                            }
                                            final ScriptEvent scriptEvent7 = new ScriptEvent();
                                            scriptEvent7.field849 = true;
                                            scriptEvent7.dragTarget = widget;
                                            scriptEvent7.mouseX = (-2063363905 * MouseHandler.MouseHandler_x - n9) * -2011830585;
                                            scriptEvent7.mouseY = (MouseHandler.MouseHandler_y * -1224153235 - n10) * 1126405829;
                                            scriptEvent7.args = widget.onRelease;
                                            Client.field568.addFirst(scriptEvent7);
                                        }
                                    }
                                    if (n29 != 0 && null != widget.onHold) {
                                        final ScriptEvent scriptEvent8 = new ScriptEvent();
                                        scriptEvent8.field849 = true;
                                        scriptEvent8.dragTarget = widget;
                                        scriptEvent8.mouseX = (-2063363905 * MouseHandler.MouseHandler_x - n9) * -2011830585;
                                        scriptEvent8.mouseY = 1126405829 * (MouseHandler.MouseHandler_y * -1224153235 - n10);
                                        scriptEvent8.args = widget.onHold;
                                        Client.scriptEvents.addFirst(scriptEvent8);
                                    }
                                    if (!widget.isHidden && n28 != 0) {
                                        widget.isHidden = true;
                                        if (null != widget.onMouseOver) {
                                            final ScriptEvent scriptEvent9 = new ScriptEvent();
                                            scriptEvent9.field849 = true;
                                            scriptEvent9.dragTarget = widget;
                                            scriptEvent9.mouseX = (-2063363905 * MouseHandler.MouseHandler_x - n9) * -2011830585;
                                            scriptEvent9.mouseY = (MouseHandler.MouseHandler_y * -1224153235 - n10) * 1126405829;
                                            scriptEvent9.args = widget.onMouseOver;
                                            Client.scriptEvents.addFirst(scriptEvent9);
                                        }
                                    }
                                    if (widget.isHidden && n28 != 0 && null != widget.onMouseRepeat) {
                                        final ScriptEvent scriptEvent10 = new ScriptEvent();
                                        scriptEvent10.field849 = true;
                                        scriptEvent10.dragTarget = widget;
                                        scriptEvent10.mouseX = -2011830585 * (-2063363905 * MouseHandler.MouseHandler_x - n9);
                                        scriptEvent10.mouseY = (MouseHandler.MouseHandler_y * -1224153235 - n10) * 1126405829;
                                        scriptEvent10.args = widget.onMouseRepeat;
                                        Client.scriptEvents.addFirst(scriptEvent10);
                                    }
                                    if (widget.isHidden) {
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                        if (n28 == 0) {
                                            if (n8 <= 976680902) {
                                                return;
                                            }
                                            widget.isHidden = false;
                                            if (null != widget.onMouseLeave) {
                                                final ScriptEvent scriptEvent11 = new ScriptEvent();
                                                scriptEvent11.field849 = true;
                                                scriptEvent11.dragTarget = widget;
                                                scriptEvent11.mouseX = -2011830585 * (MouseHandler.MouseHandler_x * -2063363905 - n9);
                                                scriptEvent11.mouseY = (-1224153235 * MouseHandler.MouseHandler_y - n10) * 1126405829;
                                                scriptEvent11.args = widget.onMouseLeave;
                                                Client.field568.addFirst(scriptEvent11);
                                            }
                                        }
                                    }
                                    if (null != widget.onTimer) {
                                        final ScriptEvent scriptEvent12 = new ScriptEvent();
                                        scriptEvent12.dragTarget = widget;
                                        scriptEvent12.args = widget.onTimer;
                                        Client.field567.addFirst(scriptEvent12);
                                    }
                                    if (widget.onVarTransmit != null && -261310919 * Client.changedVarpCount > widget.field2870 * -1285197923) {
                                        Label_4370: {
                                            if (null != widget.varTransmitTriggers && Client.changedVarpCount * -261310919 - -1285197923 * widget.field2870 <= 32) {
                                                for (int l = -1285197923 * widget.field2870; l < -261310919 * Client.changedVarpCount; ++l) {
                                                    final int n31 = Client.changedVarps[l & 0x1F];
                                                    for (int n32 = 0; n32 < widget.varTransmitTriggers.length; ++n32) {
                                                        if (n31 == widget.varTransmitTriggers[n32]) {
                                                            final ScriptEvent scriptEvent13 = new ScriptEvent();
                                                            scriptEvent13.dragTarget = widget;
                                                            scriptEvent13.args = widget.onVarTransmit;
                                                            Client.scriptEvents.addFirst(scriptEvent13);
                                                            break Label_4370;
                                                        }
                                                    }
                                                }
                                            }
                                            else {
                                                final ScriptEvent scriptEvent14 = new ScriptEvent();
                                                scriptEvent14.dragTarget = widget;
                                                scriptEvent14.args = widget.onVarTransmit;
                                                Client.scriptEvents.addFirst(scriptEvent14);
                                            }
                                        }
                                        widget.field2870 = Client.changedVarpCount * 1401123917;
                                    }
                                    Label_4640: {
                                        if (null != widget.onInvTransmit && Client.changedItemContainersCount * -710491461 > -320567063 * widget.field3017) {
                                            if (n8 <= 976680902) {
                                                return;
                                            }
                                        Label_0954:
                                            while (true) {
                                                Label_4464: {
                                                    if (null == widget.invTransmitTriggers) {
                                                        break Label_4464;
                                                    }
                                                    if (n8 <= 976680902) {
                                                        return;
                                                    }
                                                    if (-710491461 * Client.changedItemContainersCount - widget.field3017 * -320567063 > 32) {
                                                        break Label_4464;
                                                    }
                                                    for (int n33 = widget.field3017 * -320567063; n33 < -710491461 * Client.changedItemContainersCount; ++n33) {
                                                        final int n34 = Client.changedItemContainers[n33 & 0x1F];
                                                        int n35 = 0;
                                                        while (n35 < widget.invTransmitTriggers.length) {
                                                            if (n34 == widget.invTransmitTriggers[n35]) {
                                                                if (n8 <= 976680902) {
                                                                    return;
                                                                }
                                                                final ScriptEvent scriptEvent15 = new ScriptEvent();
                                                                scriptEvent15.dragTarget = widget;
                                                                scriptEvent15.args = widget.onInvTransmit;
                                                                Client.scriptEvents.addFirst(scriptEvent15);
                                                                break Label_0954;
                                                            }
                                                            else {
                                                                ++n35;
                                                            }
                                                        }
                                                    }
                                                    widget.field3017 = 1811343363 * Client.changedItemContainersCount;
                                                    break Label_4640;
                                                }
                                                final ScriptEvent scriptEvent16 = new ScriptEvent();
                                                scriptEvent16.dragTarget = widget;
                                                scriptEvent16.args = widget.onInvTransmit;
                                                Client.scriptEvents.addFirst(scriptEvent16);
                                                continue Label_0954;
                                            }
                                        }
                                    }
                                    if (null != widget.onStatTransmit && Client.changedSkillsCount * -744210295 > widget.field3006 * 610184185) {
                                        Label_1252: {
                                            if (widget.statTransmitTriggers == null || Client.changedSkillsCount * -744210295 - widget.field3006 * 610184185 > 32) {
                                                final ScriptEvent scriptEvent17 = new ScriptEvent();
                                                scriptEvent17.dragTarget = widget;
                                                scriptEvent17.args = widget.onStatTransmit;
                                                Client.scriptEvents.addFirst(scriptEvent17);
                                            }
                                            else {
                                                for (int n36 = widget.field3006 * 610184185; n36 < -744210295 * Client.changedSkillsCount; ++n36) {
                                                    final int n37 = Client.changedSkills[n36 & 0x1F];
                                                    for (int n38 = 0; n38 < widget.statTransmitTriggers.length; ++n38) {
                                                        if (n8 <= 976680902) {
                                                            return;
                                                        }
                                                        if (widget.statTransmitTriggers[n38] == n37) {
                                                            final ScriptEvent scriptEvent18 = new ScriptEvent();
                                                            scriptEvent18.dragTarget = widget;
                                                            scriptEvent18.args = widget.onStatTransmit;
                                                            Client.scriptEvents.addFirst(scriptEvent18);
                                                            break Label_1252;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        widget.field3006 = -1736131311 * Client.changedSkillsCount;
                                    }
                                    if (-620063003 * Client.chatCycle > -288310997 * widget.field3015) {
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                        if (null != widget.onChatTransmit) {
                                            final ScriptEvent scriptEvent19 = new ScriptEvent();
                                            scriptEvent19.dragTarget = widget;
                                            scriptEvent19.args = widget.onChatTransmit;
                                            Client.scriptEvents.addFirst(scriptEvent19);
                                        }
                                    }
                                    if (-421621503 * Client.field557 > widget.field3015 * -288310997 && null != widget.onFriendTransmit) {
                                        final ScriptEvent scriptEvent20 = new ScriptEvent();
                                        scriptEvent20.dragTarget = widget;
                                        scriptEvent20.args = widget.onFriendTransmit;
                                        Client.scriptEvents.addFirst(scriptEvent20);
                                    }
                                    if (-1685007587 * Client.field558 > -288310997 * widget.field3015) {
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                        if (null != widget.onClanTransmit) {
                                            if (n8 <= 976680902) {
                                                return;
                                            }
                                            final ScriptEvent scriptEvent21 = new ScriptEvent();
                                            scriptEvent21.dragTarget = widget;
                                            scriptEvent21.args = widget.onClanTransmit;
                                            Client.scriptEvents.addFirst(scriptEvent21);
                                        }
                                    }
                                    if (Client.field559 * -1127640293 > widget.field3015 * -288310997 && widget.field2946 != null) {
                                        final ScriptEvent scriptEvent22 = new ScriptEvent();
                                        scriptEvent22.dragTarget = widget;
                                        scriptEvent22.args = widget.field2946;
                                        Client.scriptEvents.addFirst(scriptEvent22);
                                    }
                                    if (Client.field560 * 2059493293 > -288310997 * widget.field3015 && widget.field2876 != null) {
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                        final ScriptEvent scriptEvent23 = new ScriptEvent();
                                        scriptEvent23.dragTarget = widget;
                                        scriptEvent23.args = widget.field2876;
                                        Client.scriptEvents.addFirst(scriptEvent23);
                                    }
                                    if (Client.field629 * -1835030315 > widget.field3015 * -288310997) {
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                        if (null != widget.onStockTransmit) {
                                            final ScriptEvent scriptEvent24 = new ScriptEvent();
                                            scriptEvent24.dragTarget = widget;
                                            scriptEvent24.args = widget.onStockTransmit;
                                            Client.scriptEvents.addFirst(scriptEvent24);
                                        }
                                    }
                                    if (Client.field635 * -2057735521 > widget.field3015 * -288310997) {
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                        if (null != widget.field2998) {
                                            final ScriptEvent scriptEvent25 = new ScriptEvent();
                                            scriptEvent25.dragTarget = widget;
                                            scriptEvent25.args = widget.field2998;
                                            Client.scriptEvents.addFirst(scriptEvent25);
                                        }
                                    }
                                    if (Client.field433 * -440718331 > widget.field3015 * -288310997 && widget.onMiscTransmit != null) {
                                        final ScriptEvent scriptEvent26 = new ScriptEvent();
                                        scriptEvent26.dragTarget = widget;
                                        scriptEvent26.args = widget.onMiscTransmit;
                                        Client.scriptEvents.addFirst(scriptEvent26);
                                    }
                                    widget.field3015 = -1390983529 * Client.cycleCntr;
                                    if (null != widget.onKey) {
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                        for (int n39 = 0; n39 < -1685179677 * Client.field355; ++n39) {
                                            final ScriptEvent scriptEvent27 = new ScriptEvent();
                                            scriptEvent27.dragTarget = widget;
                                            scriptEvent27.keyTyped = -422970289 * Client.field424[n39];
                                            scriptEvent27.keyPressed = 1753443767 * Client.field592[n39];
                                            scriptEvent27.args = widget.onKey;
                                            Client.scriptEvents.addFirst(scriptEvent27);
                                        }
                                    }
                                    if (widget.field2988 != null) {
                                        final int[] method1155 = Client.keyHandlerInstance.method1155(1282850562);
                                        for (int n40 = 0; n40 < method1155.length; ++n40) {
                                            final ScriptEvent scriptEvent28 = new ScriptEvent();
                                            scriptEvent28.dragTarget = widget;
                                            scriptEvent28.keyTyped = -422970289 * method1155[n40];
                                            scriptEvent28.args = widget.field2988;
                                            Client.scriptEvents.addFirst(scriptEvent28);
                                        }
                                    }
                                    if (widget.field2892 != null) {
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                        final int[] method1156 = Client.keyHandlerInstance.method1152(1821496925);
                                        for (int n41 = 0; n41 < method1156.length; ++n41) {
                                            final ScriptEvent scriptEvent29 = new ScriptEvent();
                                            scriptEvent29.dragTarget = widget;
                                            scriptEvent29.keyTyped = method1156[n41] * -422970289;
                                            scriptEvent29.args = widget.field2892;
                                            Client.scriptEvents.addFirst(scriptEvent29);
                                        }
                                    }
                                }
                            }
                            if (!widget.modelOrthog) {
                                if (null != Client.clickedWidget) {
                                    continue;
                                }
                                if (Client.isMenuOpen) {
                                    continue;
                                }
                                if ((-529297769 * widget.mouseOverRedirect >= 0 || 0 != widget.mouseOverColor * 1614966389) && -2063363905 * MouseHandler.MouseHandler_x >= n18 && MouseHandler.MouseHandler_y * -1224153235 >= n19 && MouseHandler.MouseHandler_x * -2063363905 < n20 && -1224153235 * MouseHandler.MouseHandler_y < n21) {
                                    if (widget.mouseOverRedirect * -529297769 >= 0) {
                                        MidiPcmStream.mousedOverWidgetIf1 = array[widget.mouseOverRedirect * -529297769];
                                    }
                                    else {
                                        MidiPcmStream.mousedOverWidgetIf1 = widget;
                                    }
                                }
                                if (8 == 883712245 * widget.type && MouseHandler.MouseHandler_x * -2063363905 >= n18 && MouseHandler.MouseHandler_y * -1224153235 >= n19 && MouseHandler.MouseHandler_x * -2063363905 < n20 && -1224153235 * MouseHandler.MouseHandler_y < n21) {
                                    class130.field1274 = widget;
                                }
                                if (widget.scrollHeight * -1273374131 > widget.height * 1473950221) {
                                    if (n8 <= 976680902) {
                                        return;
                                    }
                                    class166.method944(widget, n9 + widget.width * -794961409, n10, widget.height * 1473950221, widget.scrollHeight * -1273374131, -2063363905 * MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y * -1224153235, (byte)(-101));
                                }
                            }
                            if (0 == 883712245 * widget.type) {
                                if (n8 <= 976680902) {
                                    return;
                                }
                                updateInterface(array, 1713081171 * widget.id, n18, n19, n20, n21, n9 - widget.scrollX * -1469632775, n10 - 1223232735 * widget.scrollY, 1235457233);
                                if (null != widget.children) {
                                    if (n8 <= 976680902) {
                                        return;
                                    }
                                    updateInterface(widget.children, widget.id * 1713081171, n18, n19, n20, n21, n9 - widget.scrollX * -1469632775, n10 - 1223232735 * widget.scrollY, 1217244724);
                                }
                                final InterfaceParent interfaceParent = (InterfaceParent)Client.interfaceParents.at(widget.id * 1713081171);
                                if (interfaceParent != null) {
                                    if (0 == -1702664641 * interfaceParent.type) {
                                        if (n8 <= 976680902) {
                                            return;
                                        }
                                        if (-2063363905 * MouseHandler.MouseHandler_x >= n18 && MouseHandler.MouseHandler_y * -1224153235 >= n19 && MouseHandler.MouseHandler_x * -2063363905 < n20 && -1224153235 * MouseHandler.MouseHandler_y < n21 && !Client.isMenuOpen) {
                                            for (ScriptEvent scriptEvent30 = (ScriptEvent)Client.scriptEvents.last(); null != scriptEvent30; scriptEvent30 = (ScriptEvent)Client.scriptEvents.previous()) {
                                                if (scriptEvent30.field849) {
                                                    scriptEvent30.hw();
                                                    scriptEvent30.dragTarget.isHidden = false;
                                                }
                                            }
                                            if (class96.widgetDragDuration * 1993201275 == 0) {
                                                Client.clickedWidget = null;
                                                Client.clickedWidgetParent = null;
                                            }
                                            if (!Client.isMenuOpen) {
                                                class156.addCancelMenuEntry(-742935767);
                                            }
                                        }
                                    }
                                    ReflectionCheck.updateRootInterface(944864121 * interfaceParent.group, n18, n19, n20, n21, n9, n10, -631543188);
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ix.mw(" + ')');
        }
    }
    
    public static long bm(final int n, final int n2, final int n3, final boolean b, final int n4) {
        long n5 = (long)((n & 0x9835F278) << 0 | (n2 & 0x7F) << 7 | (n3 & 0x3) << 14) | ((long)n4 & 0xFFFFFFFFL) << 17;
        if (b) {
            n5 |= 0x10000L;
        }
        return n5;
    }
    
    public static int bk(final long n) {
        return (int)(n >>> 17 & 0xFFFFFFFFL);
    }
    
    public static int ah() {
        return -1048050201 * ViewportMouse.ViewportMouse_entityCount;
    }
    
    static final void bf() {
        if (ViewportMouse.ViewportMouse_false0) {
            return;
        }
        final int scene_cameraPitchSine = Scene.Scene_cameraPitchSine;
        final int scene_cameraPitchCosine = Scene.Scene_cameraPitchCosine;
        final int scene_cameraYawSine = Scene.Scene_cameraYawSine;
        final int scene_cameraYawCosine = Scene.Scene_cameraYawCosine;
        final int n = -746082131;
        final int n2 = 3500;
        final int n3 = (678531018 * ViewportMouse.ViewportMouse_x - TaskHandler.getClipMidX(450289227)) * n / UserComparator7.get3dZoom(594531399);
        final int n4 = (148198745 * ViewportMouse.ViewportMouse_y - class12.getClipMidY(-1242958897)) * n / UserComparator7.get3dZoom(-1534538051);
        final int n5 = (2139535413 * ViewportMouse.ViewportMouse_x - TaskHandler.getClipMidX(-724707136)) * n2 / UserComparator7.get3dZoom(606866056);
        final int n6 = (ViewportMouse.ViewportMouse_y * 148198745 - class12.getClipMidY(1266568351)) * n2 / UserComparator7.get3dZoom(-1228495446);
        final int n7 = scene_cameraPitchCosine * n4 + scene_cameraPitchSine * n >> 16;
        final int n8 = scene_cameraPitchCosine * n - scene_cameraPitchSine * n4 >> 16;
        final int n9 = n7;
        final int n10 = n2 * scene_cameraPitchSine + scene_cameraPitchCosine * n6 >> 16;
        final int n11 = scene_cameraPitchCosine * n2 - n6 * scene_cameraPitchSine >> 16;
        final int n12 = n10;
        final int method2093 = class387.method2093(n3, n8, scene_cameraYawCosine, scene_cameraYawSine, (byte)(-61));
        final int method2094 = class437.method2295(n3, n8, scene_cameraYawCosine, scene_cameraYawSine, (byte)(-93));
        final int n13 = method2093;
        final int method2095 = class387.method2093(n5, n11, scene_cameraYawCosine, scene_cameraYawSine, (byte)(-116));
        final int method2096 = class437.method2295(n5, n11, scene_cameraYawCosine, scene_cameraYawSine, (byte)26);
        final int n14 = method2095;
        ViewportMouse.field2207 = 1444319480 * ((n13 + n14) / 2);
        class294.field2715 = -158275257 * ((n9 + n12) / 2);
        ViewportMouse.field2208 = -393366251 * ((method2096 + method2094) / 2);
        ViewportMouse.field2209 = (n14 - n13) / 2 * 1520532401;
        UserComparator8.field1157 = 2089260469 * ((n12 - n9) / 2);
        ReflectionCheck.field166 = (method2096 - method2094) / 2 * 1785143657;
        EnumComposition.field1536 = Math.abs(ViewportMouse.field2209 * 1677061457) * -884930569;
        ViewportMouse.field2211 = Math.abs(-864785215 * UserComparator8.field1157) * 414135591;
        class9.field29 = Math.abs(-2085912871 * ReflectionCheck.field166) * -490031483;
    }
    
    static final int bu() {
        return ViewportMouse.ViewportMouse_x * 2139535413;
    }
}
