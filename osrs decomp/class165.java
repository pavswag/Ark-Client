// 
// Decompiled by Procyon v0.5.36
// 

public class class165 extends class177
{
    String field1416;
    static final int am = 21;
    static final int al = 128;
    final /* synthetic */ class166 this$0;
    
    class165(final class166 this$0, final String s, final String field1416) {
        this.this$0 = this$0;
        super(this$0, s);
        this.field1416 = field1416;
    }
    
    static final void method923(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final Scene scene, final CollisionMap collisionMap, final int n9) {
        try {
            final ObjectComposition vmethod3248 = class144.vmethod3248(n5, (short)17115);
            int n10;
            if (n8 >= 0) {
                if (n9 != -1255092021) {
                    throw new IllegalStateException();
                }
                n10 = n8;
            }
            else {
                n10 = 1292954189 * vmethod3248.animationId;
            }
            final int n11 = n10;
            int n12 = 0;
            int n13 = 0;
            Label_0126: {
                if (n6 != 1) {
                    if (n9 != -1255092021) {
                        return;
                    }
                    if (n6 != 3) {
                        n12 = vmethod3248.sizeX * -1339930361;
                        n13 = vmethod3248.sizeY * -1659393955;
                        break Label_0126;
                    }
                    if (n9 != -1255092021) {
                        throw new IllegalStateException();
                    }
                }
                n12 = vmethod3248.sizeY * -1659393955;
                n13 = vmethod3248.sizeX * -1339930361;
            }
            int n14;
            int n15;
            if (n3 + n12 <= 104) {
                if (n9 != -1255092021) {
                    throw new IllegalStateException();
                }
                n14 = (n12 >> 1) + n3;
                n15 = (1 + n12 >> 1) + n3;
            }
            else {
                n14 = n3;
                n15 = n3 + 1;
            }
            int n16;
            int n17;
            if (n4 + n13 <= 104) {
                if (n9 != -1255092021) {
                    throw new IllegalStateException();
                }
                n16 = (n13 >> 1) + n4;
                n17 = n4 + (n13 + 1 >> 1);
            }
            else {
                n16 = n4;
                n17 = 1 + n4;
            }
            final int[][] array = Tiles.Tiles_heights[n2];
            final int n18 = array[n14][n16] + array[n15][n16] + array[n14][n17] + array[n15][n17] >> 2;
            final int n19 = (n3 << 7) + (n12 << 6);
            final int n20 = (n13 << 6) + (n4 << 7);
            final int n21 = 2;
            boolean b;
            if (0 == 415653149 * vmethod3248.int1) {
                if (n9 != -1255092021) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            final long calculateTag = FaceNormal.calculateTag(n3, n4, n21, b, n5, 1218220316);
            int n22 = (n6 << 6) + n7;
            if (1 == -1850643527 * vmethod3248.int3) {
                n22 += 256;
            }
            if (n7 == 22) {
                Renderable model;
                if (-1 == n11 && null == vmethod3248.soundEffectIds) {
                    if (n9 != -1255092021) {
                        return;
                    }
                    model = vmethod3248.getModel(22, n6, array, n19, n18, n20, (byte)(-51));
                }
                else {
                    model = new DynamicObject(n5, 22, n6, n2, n3, n4, n11, vmethod3248.boolean3, null);
                }
                scene.newFloorDecoration(n, n3, n4, n18, model, calculateTag, n22);
                if (vmethod3248.interactType * -973955889 == 1) {
                    if (n9 != -1255092021) {
                        throw new IllegalStateException();
                    }
                    collisionMap.method1169(n3, n4, -360808658);
                }
                return;
            }
            if (n7 != 10) {
                if (n9 != -1255092021) {
                    throw new IllegalStateException();
                }
                if (n7 == 11) {
                    if (n9 != -1255092021) {
                        throw new IllegalStateException();
                    }
                }
                else if (n7 >= 12) {
                    if (n9 != -1255092021) {
                        throw new IllegalStateException();
                    }
                    while (true) {
                        Label_2602: {
                            if (-1 != n11) {
                                break Label_2602;
                            }
                            if (n9 != -1255092021) {
                                return;
                            }
                            if (null != vmethod3248.soundEffectIds) {
                                break Label_2602;
                            }
                            final Renderable model2 = vmethod3248.getModel(n7, n6, array, n19, n18, n20, (byte)(-108));
                            scene.method1288(n, n3, n4, n18, 1, 1, model2, 0, calculateTag, n22);
                            if (vmethod3248.interactType * -973955889 != 0) {
                                CollisionMap.wa(collisionMap, n3, n4, n12, n13, vmethod3248.boolean1, (byte)(-38));
                            }
                            return;
                        }
                        final Renderable model2 = new DynamicObject(n5, n7, n6, n2, n3, n4, n11, vmethod3248.boolean3, null);
                        continue;
                    }
                }
                else {
                    if (n7 == 0) {
                        Renderable model3;
                        if (-1 == n11 && vmethod3248.soundEffectIds == null) {
                            if (n9 != -1255092021) {
                                throw new IllegalStateException();
                            }
                            model3 = vmethod3248.getModel(0, n6, array, n19, n18, n20, (byte)120);
                        }
                        else {
                            model3 = new DynamicObject(n5, 0, n6, n2, n3, n4, n11, vmethod3248.boolean3, null);
                        }
                        scene.newBoundaryObject(n, n3, n4, n18, model3, null, Tiles.field820[n6], 0, calculateTag, n22);
                        if (-973955889 * vmethod3248.interactType != 0) {
                            collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
                        }
                        return;
                    }
                    if (1 == n7) {
                        if (n9 != -1255092021) {
                            return;
                        }
                        Renderable model4 = null;
                        Label_1317: {
                            if (-1 == n11) {
                                if (n9 != -1255092021) {
                                    throw new IllegalStateException();
                                }
                                if (vmethod3248.soundEffectIds == null) {
                                    if (n9 != -1255092021) {
                                        return;
                                    }
                                    model4 = vmethod3248.getModel(1, n6, array, n19, n18, n20, (byte)27);
                                    break Label_1317;
                                }
                            }
                            model4 = new DynamicObject(n5, 1, n6, n2, n3, n4, n11, vmethod3248.boolean3, null);
                        }
                        scene.newBoundaryObject(n, n3, n4, n18, model4, null, Tiles.field829[n6], 0, calculateTag, n22);
                        if (0 != -973955889 * vmethod3248.interactType) {
                            if (n9 != -1255092021) {
                                throw new IllegalStateException();
                            }
                            collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
                        }
                        return;
                    }
                    else {
                        if (2 == n7) {
                            final int n23 = 1 + n6 & 0x3;
                            while (true) {
                                Label_2225: {
                                    if (n11 != -1) {
                                        break Label_2225;
                                    }
                                    if (n9 != -1255092021) {
                                        throw new IllegalStateException();
                                    }
                                    if (vmethod3248.soundEffectIds != null) {
                                        break Label_2225;
                                    }
                                    if (n9 != -1255092021) {
                                        return;
                                    }
                                    final Renderable model5 = vmethod3248.getModel(2, 4 + n6, array, n19, n18, n20, (byte)71);
                                    final Renderable model6 = vmethod3248.getModel(2, n23, array, n19, n18, n20, (byte)105);
                                    scene.newBoundaryObject(n, n3, n4, n18, model5, model6, Tiles.field820[n6], Tiles.field820[n23], calculateTag, n22);
                                    if (-973955889 * vmethod3248.interactType != 0) {
                                        if (n9 != -1255092021) {
                                            throw new IllegalStateException();
                                        }
                                        collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
                                    }
                                    return;
                                }
                                final Renderable model5 = new DynamicObject(n5, 2, n6 + 4, n2, n3, n4, n11, vmethod3248.boolean3, null);
                                final Renderable model6 = new DynamicObject(n5, 2, n23, n2, n3, n4, n11, vmethod3248.boolean3, null);
                                continue;
                            }
                        }
                        if (n7 == 3) {
                            if (n9 != -1255092021) {
                                throw new IllegalStateException();
                            }
                            Renderable model7 = null;
                            Label_1678: {
                                if (n11 == -1) {
                                    if (n9 != -1255092021) {
                                        throw new IllegalStateException();
                                    }
                                    if (null == vmethod3248.soundEffectIds) {
                                        if (n9 != -1255092021) {
                                            throw new IllegalStateException();
                                        }
                                        model7 = vmethod3248.getModel(3, n6, array, n19, n18, n20, (byte)(-26));
                                        break Label_1678;
                                    }
                                }
                                model7 = new DynamicObject(n5, 3, n6, n2, n3, n4, n11, vmethod3248.boolean3, null);
                            }
                            scene.newBoundaryObject(n, n3, n4, n18, model7, null, Tiles.field829[n6], 0, calculateTag, n22);
                            if (-973955889 * vmethod3248.interactType != 0) {
                                if (n9 != -1255092021) {
                                    throw new IllegalStateException();
                                }
                                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
                            }
                            return;
                        }
                        else if (n7 == 9) {
                            if (n9 != -1255092021) {
                                throw new IllegalStateException();
                            }
                            while (true) {
                                Label_1123: {
                                    if (n11 != -1) {
                                        break Label_1123;
                                    }
                                    if (n9 != -1255092021) {
                                        throw new IllegalStateException();
                                    }
                                    if (vmethod3248.soundEffectIds != null) {
                                        break Label_1123;
                                    }
                                    if (n9 != -1255092021) {
                                        return;
                                    }
                                    final Renderable model8 = vmethod3248.getModel(n7, n6, array, n19, n18, n20, (byte)(-28));
                                    scene.method1288(n, n3, n4, n18, 1, 1, model8, 0, calculateTag, n22);
                                    if (-973955889 * vmethod3248.interactType != 0) {
                                        if (n9 != -1255092021) {
                                            return;
                                        }
                                        CollisionMap.wa(collisionMap, n3, n4, n12, n13, vmethod3248.boolean1, (byte)(-113));
                                    }
                                    return;
                                }
                                final Renderable model8 = new DynamicObject(n5, n7, n6, n2, n3, n4, n11, vmethod3248.boolean3, null);
                                continue;
                            }
                        }
                        else {
                            if (4 == n7) {
                                Renderable model9 = null;
                                Label_2499: {
                                    if (-1 == n11) {
                                        if (n9 != -1255092021) {
                                            throw new IllegalStateException();
                                        }
                                        if (null == vmethod3248.soundEffectIds) {
                                            model9 = vmethod3248.getModel(4, n6, array, n19, n18, n20, (byte)21);
                                            break Label_2499;
                                        }
                                    }
                                    model9 = new DynamicObject(n5, 4, n6, n2, n3, n4, n11, vmethod3248.boolean3, null);
                                }
                                scene.cw(n, n3, n4, n18, model9, null, Tiles.field820[n6], 0, 0, 0, calculateTag, n22);
                                return;
                            }
                            if (5 == n7) {
                                int n24 = 16;
                                final long boundaryObjectTag = scene.getBoundaryObjectTag(n, n3, n4);
                                if (boundaryObjectTag != 0L) {
                                    if (n9 != -1255092021) {
                                        throw new IllegalStateException();
                                    }
                                    n24 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag), (short)10737).int2 * -89408815;
                                }
                                Renderable model10 = null;
                                Label_2172: {
                                    if (-1 == n11) {
                                        if (n9 != -1255092021) {
                                            return;
                                        }
                                        if (vmethod3248.soundEffectIds == null) {
                                            if (n9 != -1255092021) {
                                                throw new IllegalStateException();
                                            }
                                            model10 = vmethod3248.getModel(4, n6, array, n19, n18, n20, (byte)(-45));
                                            break Label_2172;
                                        }
                                    }
                                    model10 = new DynamicObject(n5, 4, n6, n2, n3, n4, n11, vmethod3248.boolean3, null);
                                }
                                scene.cw(n, n3, n4, n18, model10, null, Tiles.field820[n6], 0, Tiles.field830[n6] * n24, Tiles.field827[n6] * n24, calculateTag, n22);
                                return;
                            }
                            if (n7 == 6) {
                                int n25 = 8;
                                final long boundaryObjectTag2 = scene.getBoundaryObjectTag(n, n3, n4);
                                if (0L != boundaryObjectTag2) {
                                    if (n9 != -1255092021) {
                                        throw new IllegalStateException();
                                    }
                                    n25 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag2), (short)19905).int2 * -89408815 / 2;
                                }
                                Renderable model11;
                                if (n11 == -1 && vmethod3248.soundEffectIds == null) {
                                    if (n9 != -1255092021) {
                                        throw new IllegalStateException();
                                    }
                                    model11 = vmethod3248.getModel(4, 4 + n6, array, n19, n18, n20, (byte)(-10));
                                }
                                else {
                                    model11 = new DynamicObject(n5, 4, n6 + 4, n2, n3, n4, n11, vmethod3248.boolean3, null);
                                }
                                scene.cw(n, n3, n4, n18, model11, null, 256, n6, Tiles.field832[n6] * n25, n25 * Tiles.field833[n6], calculateTag, n22);
                                return;
                            }
                            if (n7 == 7) {
                                if (n9 != -1255092021) {
                                    throw new IllegalStateException();
                                }
                                final int n26 = n6 + 2 & 0x3;
                                Renderable model12 = null;
                                Label_2555: {
                                    if (n11 == -1) {
                                        if (n9 != -1255092021) {
                                            throw new IllegalStateException();
                                        }
                                        if (vmethod3248.soundEffectIds == null) {
                                            if (n9 != -1255092021) {
                                                return;
                                            }
                                            model12 = vmethod3248.getModel(4, 4 + n26, array, n19, n18, n20, (byte)98);
                                            break Label_2555;
                                        }
                                    }
                                    model12 = new DynamicObject(n5, 4, 4 + n26, n2, n3, n4, n11, vmethod3248.boolean3, null);
                                }
                                scene.cw(n, n3, n4, n18, model12, null, 256, n26, 0, 0, calculateTag, n22);
                                return;
                            }
                            else {
                                if (8 != n7) {
                                    return;
                                }
                                if (n9 != -1255092021) {
                                    throw new IllegalStateException();
                                }
                                int n27 = 8;
                                final long boundaryObjectTag3 = scene.getBoundaryObjectTag(n, n3, n4);
                                if (0L != boundaryObjectTag3) {
                                    if (n9 != -1255092021) {
                                        throw new IllegalStateException();
                                    }
                                    n27 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag3), (short)19671).int2 * -89408815 / 2;
                                }
                                final int n28 = n6 + 2 & 0x3;
                                Renderable model13;
                                Renderable model14;
                                if (-1 == n11 && vmethod3248.soundEffectIds == null) {
                                    if (n9 != -1255092021) {
                                        return;
                                    }
                                    model13 = vmethod3248.getModel(4, 4 + n6, array, n19, n18, n20, (byte)51);
                                    model14 = vmethod3248.getModel(4, 4 + n28, array, n19, n18, n20, (byte)(-40));
                                }
                                else {
                                    model13 = new DynamicObject(n5, 4, n6 + 4, n2, n3, n4, n11, vmethod3248.boolean3, null);
                                    model14 = new DynamicObject(n5, 4, 4 + n28, n2, n3, n4, n11, vmethod3248.boolean3, null);
                                }
                                scene.cw(n, n3, n4, n18, model13, model14, 256, n6, n27 * Tiles.field832[n6], n27 * Tiles.field833[n6], calculateTag, n22);
                                return;
                            }
                        }
                    }
                }
            }
            Renderable model15 = null;
            Label_0738: {
                if (n11 == -1) {
                    if (n9 != -1255092021) {
                        throw new IllegalStateException();
                    }
                    if (vmethod3248.soundEffectIds == null) {
                        if (n9 != -1255092021) {
                            throw new IllegalStateException();
                        }
                        model15 = vmethod3248.getModel(10, n6, array, n19, n18, n20, (byte)(-28));
                        break Label_0738;
                    }
                }
                model15 = new DynamicObject(n5, 10, n6, n2, n3, n4, n11, vmethod3248.boolean3, null);
            }
            if (null != model15) {
                if (n9 != -1255092021) {
                    throw new IllegalStateException();
                }
                scene.method1288(n, n3, n4, n18, n12, n13, model15, (11 == n7) ? 256 : 0, calculateTag, n22);
            }
            if (0 != vmethod3248.interactType * -973955889) {
                if (n9 != -1255092021) {
                    throw new IllegalStateException();
                }
                CollisionMap.wa(collisionMap, n3, n4, n12, n13, vmethod3248.boolean1, (byte)(-48));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gh.ak(" + ')');
        }
    }
    
    public static Object nm(final class398 class398, final Object o) {
        if (class398 == null) {
            return class398.ao(o);
        }
        synchronized (class398) {
            if (-1L != -5966338096779578459L * class398.field3695) {
                class398.mm(class398, (byte)1);
            }
            final class399 class399 = class398.field3693.get(o);
            if (null == class399) {
                return null;
            }
            class398.method2123(class399, false, (byte)19);
            return class399.field3700;
        }
    }
    
    @Override
    public int aw() {
        return 1;
    }
    
    public static void et(final PacketWriter packetWriter, final PacketBufferNode packetBufferNode) {
        packetWriter.packetBufferNodes.addFirst(packetBufferNode);
        packetBufferNode.index = 1257014177 * packetBufferNode.packetBuffer.at;
        packetBufferNode.packetBuffer.at = 0;
        packetWriter.bufferSize += packetBufferNode.index * -1332166483;
    }
    
    @Override
    public String vmethod3380(final byte b) {
        try {
            return this.field1416;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gh.an(" + ')');
        }
    }
    
    public static Widget vmethod3380(final int n, final byte b) {
        try {
            final int n2 = n >> 16;
            final int n3 = n & 0xFFFF;
            if (VerticalAlignment.Widget_interfaceComponents[n2] != null) {
                if (b != 5) {
                    throw new IllegalStateException();
                }
                if (VerticalAlignment.Widget_interfaceComponents[n2][n3] != null) {
                    return VerticalAlignment.Widget_interfaceComponents[n2][n3];
                }
                if (b != 5) {
                    throw new IllegalStateException();
                }
            }
            if (!SoundSystem.loadInterface(n2, 1376777516)) {
                return null;
            }
            return VerticalAlignment.Widget_interfaceComponents[n2][n3];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gh.an(" + ')');
        }
    }
    
    @Override
    public int ac() {
        return 1;
    }
    
    @Override
    public int au() {
        return 1;
    }
    
    @Override
    public int vmethod3379(final byte b) {
        try {
            return 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gh.af(" + ')');
        }
    }
    
    @Override
    public String ab() {
        return this.field1416;
    }
    
    public String method921() {
        return this.field1416;
    }
    
    public static void method921(final int n) {
        try {
            ParamComposition.ParamDefinition_cached.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gh.aq(" + ')');
        }
    }
}
