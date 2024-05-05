// 
// Decompiled by Procyon v0.5.36
// 

public class SpotAnimationDefinition extends DualNode
{
    int id;
    short[] retextureTo;
    short[] recolorTo;
    public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
    int archive;
    static AbstractArchive SpotAnimationDefinition_archive;
    public int sequence;
    short[] recolorFrom;
    int orientation;
    public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
    short[] retextureFrom;
    int widthScale;
    int heightScale;
    static AbstractArchive SpotAnimationDefinition_modelArchive;
    int ambient;
    int contrast;
    
    SpotAnimationDefinition() {
        this.sequence = -1861808927;
        this.widthScale = 122094464;
        this.heightScale = -370064768;
        this.orientation = 0;
        this.ambient = 0;
        this.contrast = 0;
    }
    
    static {
        SpotAnimationDefinition.SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
        SpotAnimationDefinition.SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
    }
    
    void ao(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, (byte)115);
        }
    }
    
    public static void at(final AbstractArchive spotAnimationDefinition_archive, final AbstractArchive spotAnimationDefinition_modelArchive) {
        SpotAnimationDefinition.SpotAnimationDefinition_archive = spotAnimationDefinition_archive;
        SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = spotAnimationDefinition_modelArchive;
    }
    
    public final Model av(final int n) {
        final Model method1042 = this.method1042(-1560238880);
        Model model;
        if (this.sequence * 374130911 != -1 && n != -1) {
            model = ItemContainer.SpotAnimationDefinition_get(this.sequence * 374130911, (byte)66).method1130(method1042, n, -1658298068);
        }
        else {
            model = method1042.method1312(true);
        }
        if (128 != -1761247305 * this.widthScale || 128 != this.heightScale * -1083521459) {
            model.scale(-1761247305 * this.widthScale, this.heightScale * -1083521459, this.widthScale * -1761247305);
        }
        if (-906961103 * this.orientation != 0) {
            if (this.orientation * -906961103 == 90) {
                model.rotateY90Ccw();
            }
            if (this.orientation * -906961103 == 180) {
                model.rotateY90Ccw();
                model.rotateY90Ccw();
            }
            if (this.orientation * -906961103 == 270) {
                model.rotateY90Ccw();
                model.rotateY90Ccw();
                model.rotateY90Ccw();
            }
        }
        return model;
    }
    
    public final Model as() {
        Model dg = (Model)SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.wr(this.id * 779651160);
        if (dg == null) {
            final ModelData modelData_get = ModelData.ModelData_get(SpotAnimationDefinition.SpotAnimationDefinition_modelArchive, this.archive * -1640205174, 0);
            if (modelData_get == null) {
                return null;
            }
            if (null != this.recolorFrom) {
                for (int i = 0; i < this.recolorFrom.length; ++i) {
                    ModelData.lm(modelData_get, this.recolorFrom[i], this.recolorTo[i]);
                }
            }
            if (this.retextureFrom != null) {
                for (int j = 0; j < this.retextureFrom.length; ++j) {
                    ModelData.jw(modelData_get, this.retextureFrom[j], this.retextureTo[j]);
                }
            }
            dg = modelData_get.dg(this.ambient * -681541055 - 1666433828, 1811753035 + this.contrast * -138140925, 196752769, -50, -730911673);
            SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.put(dg, -190570391 * this.id);
        }
        return dg;
    }
    
    void ax(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, (byte)66);
        }
    }
    
    public static SpotAnimationDefinition ay(final int n) {
        final SpotAnimationDefinition spotAnimationDefinition = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.wr(n);
        if (spotAnimationDefinition != null) {
            return spotAnimationDefinition;
        }
        final byte[] takeFile = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, n, (byte)(-80));
        final SpotAnimationDefinition spotAnimationDefinition2 = new SpotAnimationDefinition();
        spotAnimationDefinition2.id = n * 903573465;
        if (takeFile != null) {
            spotAnimationDefinition2.decode(new Buffer(takeFile), (byte)(-83));
        }
        SpotAnimationDefinition.SpotAnimationDefinition_cached.put(spotAnimationDefinition2, n);
        return spotAnimationDefinition2;
    }
    
    public static Model ia(final SpotAnimationDefinition spotAnimationDefinition, final int n) {
        if (spotAnimationDefinition == null) {
            return spotAnimationDefinition.method1042(n);
        }
        final Model method1042 = spotAnimationDefinition.method1042(-1620276070);
        Model model;
        if (spotAnimationDefinition.sequence * 374130911 != -1 && n != -1) {
            model = ItemContainer.SpotAnimationDefinition_get(spotAnimationDefinition.sequence * 374130911, (byte)85).method1130(method1042, n, -1114979702);
        }
        else {
            model = method1042.method1312(true);
        }
        if (128 != -1761247305 * spotAnimationDefinition.widthScale || 128 != spotAnimationDefinition.heightScale * -1083521459) {
            model.scale(-1761247305 * spotAnimationDefinition.widthScale, spotAnimationDefinition.heightScale * -1083521459, spotAnimationDefinition.widthScale * -1761247305);
        }
        if (-906961103 * spotAnimationDefinition.orientation != 0) {
            if (spotAnimationDefinition.orientation * -906961103 == 90) {
                model.rotateY90Ccw();
            }
            if (spotAnimationDefinition.orientation * -906961103 == 180) {
                model.rotateY90Ccw();
                model.rotateY90Ccw();
            }
            if (spotAnimationDefinition.orientation * -906961103 == 270) {
                model.rotateY90Ccw();
                model.rotateY90Ccw();
                model.rotateY90Ccw();
            }
        }
        return model;
    }
    
    void decode(final Buffer buffer, final byte b) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                this.decodeNext(buffer, ra, (byte)4);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hh.aw(" + ')');
        }
    }
    
    public final Model am() {
        Model dg = (Model)SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.wr(this.id * -190570391);
        if (dg == null) {
            final ModelData modelData_get = ModelData.ModelData_get(SpotAnimationDefinition.SpotAnimationDefinition_modelArchive, this.archive * -170244579, 0);
            if (modelData_get == null) {
                return null;
            }
            if (null != this.recolorFrom) {
                for (int i = 0; i < this.recolorFrom.length; ++i) {
                    ModelData.lm(modelData_get, this.recolorFrom[i], this.recolorTo[i]);
                }
            }
            if (this.retextureFrom != null) {
                for (int j = 0; j < this.retextureFrom.length; ++j) {
                    ModelData.jw(modelData_get, this.retextureFrom[j], this.retextureTo[j]);
                }
            }
            dg = modelData_get.dg(this.ambient * 742442999 + 1807148956, 850 + this.contrast * -138140925, 1917261223, -15417995, 1665631501);
            SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.put(dg, -190570391 * this.id);
        }
        return dg;
    }
    
    public static void al(final AbstractArchive spotAnimationDefinition_archive, final AbstractArchive spotAnimationDefinition_modelArchive) {
        SpotAnimationDefinition.SpotAnimationDefinition_archive = spotAnimationDefinition_archive;
        SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = spotAnimationDefinition_modelArchive;
    }
    
    void decodeNext(final Buffer buffer, final int n, final byte b) {
        try {
            if (1 == n) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                this.archive = buffer.readUnsignedShort(-148790003) * -1354453963;
            }
            else if (n == 2) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                this.sequence = buffer.readUnsignedShort(-1816793442) * 1861808927;
            }
            else if (n == 4) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                this.widthScale = buffer.readUnsignedShort(-1000416008) * -636580345;
            }
            else if (5 == n) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                this.heightScale = buffer.readUnsignedShort(-721114990) * -1110187387;
            }
            else if (n == 6) {
                this.orientation = buffer.readUnsignedShort(-1690091831) * -1376904751;
            }
            else if (7 == n) {
                this.ambient = Buffer.ra(buffer, (byte)7) * 399649223;
            }
            else if (n == 8) {
                if (b <= 1) {
                    return;
                }
                this.contrast = Buffer.ra(buffer, (byte)7) * 1837096875;
            }
            else if (n == 40) {
                final int ra = Buffer.ra(buffer, (byte)7);
                this.recolorFrom = new short[ra];
                this.recolorTo = new short[ra];
                for (int i = 0; i < ra; ++i) {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    this.recolorFrom[i] = (short)buffer.readUnsignedShort(-699499278);
                    this.recolorTo[i] = (short)buffer.readUnsignedShort(-1037040176);
                }
            }
            else if (n == 41) {
                final int ra2 = Buffer.ra(buffer, (byte)7);
                this.retextureFrom = new short[ra2];
                this.retextureTo = new short[ra2];
                for (int j = 0; j < ra2; ++j) {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    this.retextureFrom[j] = (short)buffer.readUnsignedShort(-1792662823);
                    this.retextureTo[j] = (short)buffer.readUnsignedShort(353372987);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hh.ac(" + ')');
        }
    }
    
    public final Model getModel(final int n, final int n2) {
        try {
            final Model method1042 = this.method1042(-972501101);
            Model model;
            if (this.sequence * 374130911 != -1 && n != -1) {
                if (n2 == 1971549177) {
                    throw new IllegalStateException();
                }
                model = ItemContainer.SpotAnimationDefinition_get(this.sequence * 374130911, (byte)74).method1130(method1042, n, -1926546328);
            }
            else {
                model = method1042.method1312(true);
            }
            while (true) {
                Label_0257: {
                    if (128 != -1761247305 * this.widthScale) {
                        break Label_0257;
                    }
                    if (128 != this.heightScale * -1083521459) {
                        if (n2 == 1971549177) {
                            throw new IllegalStateException();
                        }
                        break Label_0257;
                    }
                    if (-906961103 * this.orientation != 0) {
                        if (n2 == 1971549177) {
                            throw new IllegalStateException();
                        }
                        if (this.orientation * -906961103 == 90) {
                            if (n2 == 1971549177) {
                                throw new IllegalStateException();
                            }
                            model.rotateY90Ccw();
                        }
                        if (this.orientation * -906961103 == 180) {
                            if (n2 == 1971549177) {
                                throw new IllegalStateException();
                            }
                            model.rotateY90Ccw();
                            model.rotateY90Ccw();
                        }
                        if (this.orientation * -906961103 == 270) {
                            if (n2 == 1971549177) {
                                throw new IllegalStateException();
                            }
                            model.rotateY90Ccw();
                            model.rotateY90Ccw();
                            model.rotateY90Ccw();
                        }
                    }
                    return model;
                }
                model.scale(-1761247305 * this.widthScale, this.heightScale * -1083521459, this.widthScale * -1761247305);
                continue;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hh.au(" + ')');
        }
    }
    
    public static SpotAnimationDefinition aa(final int n) {
        final SpotAnimationDefinition spotAnimationDefinition = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.wr(n);
        if (spotAnimationDefinition != null) {
            return spotAnimationDefinition;
        }
        final byte[] takeFile = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, n, (byte)(-105));
        final SpotAnimationDefinition spotAnimationDefinition2 = new SpotAnimationDefinition();
        spotAnimationDefinition2.id = n * 446010286;
        if (takeFile != null) {
            spotAnimationDefinition2.decode(new Buffer(takeFile), (byte)26);
        }
        SpotAnimationDefinition.SpotAnimationDefinition_cached.put(spotAnimationDefinition2, n);
        return spotAnimationDefinition2;
    }
    
    public static void ty(final SpritePixels spritePixels, int n, int n2, final int n3, final int n4, final int n5, final int n6) {
        if (spritePixels == null) {
            spritePixels.bs();
        }
        if (n6 == 0) {
            return;
        }
        n -= spritePixels.xOffset << 4;
        n2 -= spritePixels.yOffset << 4;
        final double n7 = (n5 & 0xFFFF) * 9.587379924285257E-5;
        final int n8 = (int)Math.floor(Math.sin(n7) * n6 + 0.5);
        final int n9 = (int)Math.floor(Math.cos(n7) * n6 + 0.5);
        final int n10 = -n * n9 + -n2 * n8;
        final int n11 = -(-n) * n8 + -n2 * n9;
        final int n12 = ((spritePixels.subWidth << 4) - n) * n9 + -n2 * n8;
        final int n13 = -((spritePixels.subWidth << 4) - n) * n8 + -n2 * n9;
        final int n14 = -n * n9 + ((spritePixels.subHeight << 4) - n2) * n8;
        final int n15 = -(-n) * n8 + ((spritePixels.subHeight << 4) - n2) * n9;
        final int n16 = ((spritePixels.subWidth << 4) - n) * n9 + ((spritePixels.subHeight << 4) - n2) * n8;
        final int n17 = -((spritePixels.subWidth << 4) - n) * n8 + ((spritePixels.subHeight << 4) - n2) * n9;
        int n18;
        int n19;
        if (n10 < n12) {
            n18 = n10;
            n19 = n12;
        }
        else {
            n18 = n12;
            n19 = n10;
        }
        if (n14 < n18) {
            n18 = n14;
        }
        if (n16 < n18) {
            n18 = n16;
        }
        if (n14 > n19) {
            n19 = n14;
        }
        if (n16 > n19) {
            n19 = n16;
        }
        int n20;
        int n21;
        if (n11 < n13) {
            n20 = n11;
            n21 = n13;
        }
        else {
            n20 = n13;
            n21 = n11;
        }
        if (n15 < n20) {
            n20 = n15;
        }
        if (n17 < n20) {
            n20 = n17;
        }
        if (n15 > n21) {
            n21 = n15;
        }
        if (n17 > n21) {
            n21 = n17;
        }
        final int n22 = n18 >> 12;
        final int n23 = n19 + 4095 >> 12;
        final int n24 = n20 >> 12;
        final int n25 = n21 + 4095 >> 12;
        final int n26 = n22 + n3;
        final int n27 = n23 + n3;
        final int n28 = n24 + n4;
        final int n29 = n25 + n4;
        int bk = n26 >> 4;
        int bx = n27 + 15 >> 4;
        int bi = n28 >> 4;
        int be = n29 + 15 >> 4;
        if (bk < SpritePixels.bk) {
            bk = SpritePixels.bk;
        }
        if (bx > SpritePixels.bx) {
            bx = SpritePixels.bx;
        }
        if (bi < SpritePixels.bi) {
            bi = SpritePixels.bi;
        }
        if (be > SpritePixels.be) {
            be = SpritePixels.be;
        }
        final int n30 = bk - bx;
        if (n30 >= 0) {
            return;
        }
        final int n31 = bi - be;
        if (n31 >= 0) {
            return;
        }
        int n32 = bi * SpritePixels.ae + bk;
        final double n33 = 1.6777216E7 / n6;
        final int n34 = (int)Math.floor(Math.sin(n7) * n33 + 0.5);
        final int n35 = (int)Math.floor(Math.cos(n7) * n33 + 0.5);
        final int n36 = (bk << 4) + 8 - n3;
        final int n37 = (bi << 4) + 8 - n4;
        int n38 = (n << 8) - (n37 * n34 >> 4);
        int n39 = (n2 << 8) + (n37 * n35 >> 4);
        if (n35 == 0) {
            if (n34 == 0) {
                for (int i = n31; i < 0; ++i, n32 += SpritePixels.ae) {
                    int n40 = n32;
                    final int n41 = n38;
                    final int n42 = n39;
                    int j = n30;
                    if (n41 >= 0) {
                        if (n42 >= 0) {
                            if (n41 - (spritePixels.subWidth << 12) < 0) {
                                if (n42 - (spritePixels.subHeight << 12) < 0) {
                                    while (j < 0) {
                                        final int n43 = spritePixels.pixels[(n42 >> 12) * spritePixels.subWidth + (n41 >> 12)];
                                        if (n43 != 0) {
                                            SpritePixels.ad[n40++] = n43;
                                        }
                                        else {
                                            ++n40;
                                        }
                                        ++j;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (n34 < 0) {
                for (int k = n31; k < 0; ++k, n38 -= n34, n32 += SpritePixels.ae) {
                    int n44 = n32;
                    final int n45 = n38;
                    int n46 = n39 + (n36 * n34 >> 4);
                    int l = n30;
                    if (n45 >= 0) {
                        if (n45 - (spritePixels.subWidth << 12) < 0) {
                            final int n47;
                            if ((n47 = n46 - (spritePixels.subHeight << 12)) >= 0) {
                                final int n48 = (n34 - n47) / n34;
                                l += n48;
                                n46 += n34 * n48;
                                n44 += n48;
                            }
                            final int n49;
                            if ((n49 = (n46 - n34) / n34) > l) {
                                l = n49;
                            }
                            while (l < 0) {
                                final int n50 = spritePixels.pixels[(n46 >> 12) * spritePixels.subWidth + (n45 >> 12)];
                                if (n50 != 0) {
                                    SpritePixels.ad[n44++] = n50;
                                }
                                else {
                                    ++n44;
                                }
                                n46 += n34;
                                ++l;
                            }
                        }
                    }
                }
            }
            else {
                for (int n51 = n31; n51 < 0; ++n51, n38 -= n34, n32 += SpritePixels.ae) {
                    int n52 = n32;
                    final int n53 = n38;
                    int n54 = n39 + (n36 * n34 >> 4);
                    int n55 = n30;
                    if (n53 >= 0) {
                        if (n53 - (spritePixels.subWidth << 12) < 0) {
                            if (n54 < 0) {
                                final int n56 = (n34 - 1 - n54) / n34;
                                n55 += n56;
                                n54 += n34 * n56;
                                n52 += n56;
                            }
                            final int n57;
                            if ((n57 = (1 + n54 - (spritePixels.subHeight << 12) - n34) / n34) > n55) {
                                n55 = n57;
                            }
                            while (n55 < 0) {
                                final int n58 = spritePixels.pixels[(n54 >> 12) * spritePixels.subWidth + (n53 >> 12)];
                                if (n58 != 0) {
                                    SpritePixels.ad[n52++] = n58;
                                }
                                else {
                                    ++n52;
                                }
                                n54 += n34;
                                ++n55;
                            }
                        }
                    }
                }
            }
        }
        else if (n35 < 0) {
            if (n34 == 0) {
                for (int n59 = n31; n59 < 0; ++n59, n39 += n35, n32 += SpritePixels.ae) {
                    int n60 = n32;
                    int n61 = n38 + (n36 * n35 >> 4);
                    final int n62 = n39;
                    int n63 = n30;
                    if (n62 >= 0) {
                        if (n62 - (spritePixels.subHeight << 12) < 0) {
                            final int n64;
                            if ((n64 = n61 - (spritePixels.subWidth << 12)) >= 0) {
                                final int n65 = (n35 - n64) / n35;
                                n63 += n65;
                                n61 += n35 * n65;
                                n60 += n65;
                            }
                            final int n66;
                            if ((n66 = (n61 - n35) / n35) > n63) {
                                n63 = n66;
                            }
                            while (n63 < 0) {
                                final int n67 = spritePixels.pixels[(n62 >> 12) * spritePixels.subWidth + (n61 >> 12)];
                                if (n67 != 0) {
                                    SpritePixels.ad[n60++] = n67;
                                }
                                else {
                                    ++n60;
                                }
                                n61 += n35;
                                ++n63;
                            }
                        }
                    }
                }
            }
            else if (n34 < 0) {
                for (int n68 = n31; n68 < 0; ++n68, n38 -= n34, n39 += n35, n32 += SpritePixels.ae) {
                    int n69 = n32;
                    int n70 = n38 + (n36 * n35 >> 4);
                    int n71 = n39 + (n36 * n34 >> 4);
                    int n72 = n30;
                    final int n73;
                    if ((n73 = n70 - (spritePixels.subWidth << 12)) >= 0) {
                        final int n74 = (n35 - n73) / n35;
                        n72 += n74;
                        n70 += n35 * n74;
                        n71 += n34 * n74;
                        n69 += n74;
                    }
                    final int n75;
                    if ((n75 = (n70 - n35) / n35) > n72) {
                        n72 = n75;
                    }
                    final int n76;
                    if ((n76 = n71 - (spritePixels.subHeight << 12)) >= 0) {
                        final int n77 = (n34 - n76) / n34;
                        n72 += n77;
                        n70 += n35 * n77;
                        n71 += n34 * n77;
                        n69 += n77;
                    }
                    final int n78;
                    if ((n78 = (n71 - n34) / n34) > n72) {
                        n72 = n78;
                    }
                    while (n72 < 0) {
                        final int n79 = spritePixels.pixels[(n71 >> 12) * spritePixels.subWidth + (n70 >> 12)];
                        if (n79 != 0) {
                            SpritePixels.ad[n69++] = n79;
                        }
                        else {
                            ++n69;
                        }
                        n70 += n35;
                        n71 += n34;
                        ++n72;
                    }
                }
            }
            else {
                for (int n80 = n31; n80 < 0; ++n80, n38 -= n34, n39 += n35, n32 += SpritePixels.ae) {
                    int n81 = n32;
                    int n82 = n38 + (n36 * n35 >> 4);
                    int n83 = n39 + (n36 * n34 >> 4);
                    int n84 = n30;
                    final int n85;
                    if ((n85 = n82 - (spritePixels.subWidth << 12)) >= 0) {
                        final int n86 = (n35 - n85) / n35;
                        n84 += n86;
                        n82 += n35 * n86;
                        n83 += n34 * n86;
                        n81 += n86;
                    }
                    final int n87;
                    if ((n87 = (n82 - n35) / n35) > n84) {
                        n84 = n87;
                    }
                    if (n83 < 0) {
                        final int n88 = (n34 - 1 - n83) / n34;
                        n84 += n88;
                        n82 += n35 * n88;
                        n83 += n34 * n88;
                        n81 += n88;
                    }
                    final int n89;
                    if ((n89 = (1 + n83 - (spritePixels.subHeight << 12) - n34) / n34) > n84) {
                        n84 = n89;
                    }
                    while (n84 < 0) {
                        final int n90 = spritePixels.pixels[(n83 >> 12) * spritePixels.subWidth + (n82 >> 12)];
                        if (n90 != 0) {
                            SpritePixels.ad[n81++] = n90;
                        }
                        else {
                            ++n81;
                        }
                        n82 += n35;
                        n83 += n34;
                        ++n84;
                    }
                }
            }
        }
        else if (n34 == 0) {
            for (int n91 = n31; n91 < 0; ++n91, n39 += n35, n32 += SpritePixels.ae) {
                int n92 = n32;
                int n93 = n38 + (n36 * n35 >> 4);
                final int n94 = n39;
                int n95 = n30;
                if (n94 >= 0) {
                    if (n94 - (spritePixels.subHeight << 12) < 0) {
                        if (n93 < 0) {
                            final int n96 = (n35 - 1 - n93) / n35;
                            n95 += n96;
                            n93 += n35 * n96;
                            n92 += n96;
                        }
                        final int n97;
                        if ((n97 = (1 + n93 - (spritePixels.subWidth << 12) - n35) / n35) > n95) {
                            n95 = n97;
                        }
                        while (n95 < 0) {
                            final int n98 = spritePixels.pixels[(n94 >> 12) * spritePixels.subWidth + (n93 >> 12)];
                            if (n98 != 0) {
                                SpritePixels.ad[n92++] = n98;
                            }
                            else {
                                ++n92;
                            }
                            n93 += n35;
                            ++n95;
                        }
                    }
                }
            }
        }
        else if (n34 < 0) {
            for (int n99 = n31; n99 < 0; ++n99, n38 -= n34, n39 += n35, n32 += SpritePixels.ae) {
                int n100 = n32;
                int n101 = n38 + (n36 * n35 >> 4);
                int n102 = n39 + (n36 * n34 >> 4);
                int n103 = n30;
                if (n101 < 0) {
                    final int n104 = (n35 - 1 - n101) / n35;
                    n103 += n104;
                    n101 += n35 * n104;
                    n102 += n34 * n104;
                    n100 += n104;
                }
                final int n105;
                if ((n105 = (1 + n101 - (spritePixels.subWidth << 12) - n35) / n35) > n103) {
                    n103 = n105;
                }
                final int n106;
                if ((n106 = n102 - (spritePixels.subHeight << 12)) >= 0) {
                    final int n107 = (n34 - n106) / n34;
                    n103 += n107;
                    n101 += n35 * n107;
                    n102 += n34 * n107;
                    n100 += n107;
                }
                final int n108;
                if ((n108 = (n102 - n34) / n34) > n103) {
                    n103 = n108;
                }
                while (n103 < 0) {
                    final int n109 = spritePixels.pixels[(n102 >> 12) * spritePixels.subWidth + (n101 >> 12)];
                    if (n109 != 0) {
                        SpritePixels.ad[n100++] = n109;
                    }
                    else {
                        ++n100;
                    }
                    n101 += n35;
                    n102 += n34;
                    ++n103;
                }
            }
        }
        else {
            for (int n110 = n31; n110 < 0; ++n110, n38 -= n34, n39 += n35, n32 += SpritePixels.ae) {
                int n111 = n32;
                int n112 = n38 + (n36 * n35 >> 4);
                int n113 = n39 + (n36 * n34 >> 4);
                int n114 = n30;
                if (n112 < 0) {
                    final int n115 = (n35 - 1 - n112) / n35;
                    n114 += n115;
                    n112 += n35 * n115;
                    n113 += n34 * n115;
                    n111 += n115;
                }
                final int n116;
                if ((n116 = (1 + n112 - (spritePixels.subWidth << 12) - n35) / n35) > n114) {
                    n114 = n116;
                }
                if (n113 < 0) {
                    final int n117 = (n34 - 1 - n113) / n34;
                    n114 += n117;
                    n112 += n35 * n117;
                    n113 += n34 * n117;
                    n111 += n117;
                }
                final int n118;
                if ((n118 = (1 + n113 - (spritePixels.subHeight << 12) - n34) / n34) > n114) {
                    n114 = n118;
                }
                while (n114 < 0) {
                    final int n119 = spritePixels.pixels[(n113 >> 12) * spritePixels.subWidth + (n112 >> 12)];
                    if (n119 != 0) {
                        SpritePixels.ad[n111++] = n119;
                    }
                    else {
                        ++n111;
                    }
                    n112 += n35;
                    n113 += n34;
                    ++n114;
                }
            }
        }
    }
    
    void ai(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, (byte)72);
        }
    }
    
    public final Model ar(final int n) {
        final Model method1042 = this.method1042(-907584259);
        Model model;
        if (this.sequence * 374130911 != -1 && n != -1) {
            model = ItemContainer.SpotAnimationDefinition_get(this.sequence * 374130911, (byte)58).method1130(method1042, n, -976120299);
        }
        else {
            model = method1042.method1312(true);
        }
        if (128 != -1161812646 * this.widthScale || 1320847730 != this.heightScale * -1083521459) {
            model.scale(-772687482 * this.widthScale, this.heightScale * -1083521459, this.widthScale * -1509503606);
        }
        if (251617364 * this.orientation != 0) {
            if (this.orientation * -906961103 == 90) {
                model.rotateY90Ccw();
            }
            if (this.orientation * -906961103 == 180) {
                model.rotateY90Ccw();
                model.rotateY90Ccw();
            }
            if (this.orientation * -906961103 == 275420136) {
                model.rotateY90Ccw();
                model.rotateY90Ccw();
                model.rotateY90Ccw();
            }
        }
        return model;
    }
    
    public static Model cy(final SpotAnimationDefinition spotAnimationDefinition, final int n) {
        if (spotAnimationDefinition == null) {
            spotAnimationDefinition.av(n);
        }
        final Model method1042 = spotAnimationDefinition.method1042(1515185329);
        Model model;
        if (spotAnimationDefinition.sequence * 374130911 != -1 && n != -1) {
            model = ItemContainer.SpotAnimationDefinition_get(spotAnimationDefinition.sequence * 374130911, (byte)11).method1130(method1042, n, 11138431);
        }
        else {
            model = method1042.method1312(true);
        }
        if (128 != -1761247305 * spotAnimationDefinition.widthScale || 128 != spotAnimationDefinition.heightScale * -1083521459) {
            model.scale(-1761247305 * spotAnimationDefinition.widthScale, spotAnimationDefinition.heightScale * -1083521459, spotAnimationDefinition.widthScale * -1761247305);
        }
        if (-906961103 * spotAnimationDefinition.orientation != 0) {
            if (spotAnimationDefinition.orientation * -906961103 == 90) {
                model.rotateY90Ccw();
            }
            if (spotAnimationDefinition.orientation * -906961103 == 180) {
                model.rotateY90Ccw();
                model.rotateY90Ccw();
            }
            if (spotAnimationDefinition.orientation * -906961103 == 270) {
                model.rotateY90Ccw();
                model.rotateY90Ccw();
                model.rotateY90Ccw();
            }
        }
        return model;
    }
    
    static PacketBufferNode method1044(final byte b) {
        try {
            if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount * 380401923 != 0) {
                return PacketBufferNode.PacketBufferNode_packetBufferNodes[(PacketBufferNode.PacketBufferNode_packetBufferNodeCount += 1882670677) * 380401923];
            }
            if (b != 0) {
                throw new IllegalStateException();
            }
            return new PacketBufferNode();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hh.af(" + ')');
        }
    }
    
    public final Model method1042(final int n) {
        try {
            Model dg = (Model)SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.wr(this.id * -190570391);
            if (dg == null) {
                if (n <= Integer.MIN_VALUE) {
                    throw new IllegalStateException();
                }
                final ModelData modelData_get = ModelData.ModelData_get(SpotAnimationDefinition.SpotAnimationDefinition_modelArchive, this.archive * -170244579, 0);
                if (modelData_get == null) {
                    if (n <= Integer.MIN_VALUE) {
                        throw new IllegalStateException();
                    }
                    return null;
                }
                else {
                    if (null != this.recolorFrom) {
                        if (n <= Integer.MIN_VALUE) {
                            throw new IllegalStateException();
                        }
                        for (int i = 0; i < this.recolorFrom.length; ++i) {
                            if (n <= Integer.MIN_VALUE) {
                                throw new IllegalStateException();
                            }
                            ModelData.lm(modelData_get, this.recolorFrom[i], this.recolorTo[i]);
                        }
                    }
                    if (this.retextureFrom != null) {
                        if (n <= Integer.MIN_VALUE) {
                            throw new IllegalStateException();
                        }
                        for (int j = 0; j < this.retextureFrom.length; ++j) {
                            if (n <= Integer.MIN_VALUE) {
                                throw new IllegalStateException();
                            }
                            ModelData.jw(modelData_get, this.retextureFrom[j], this.retextureTo[j]);
                        }
                    }
                    dg = modelData_get.dg(this.ambient * 742442999 + 64, 850 + this.contrast * -138140925, -30, -50, -30);
                    SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.put(dg, -190570391 * this.id);
                }
            }
            return dg;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hh.ab(" + ')');
        }
    }
    
    public static void aq(final AbstractArchive spotAnimationDefinition_archive, final AbstractArchive spotAnimationDefinition_modelArchive) {
        SpotAnimationDefinition.SpotAnimationDefinition_archive = spotAnimationDefinition_archive;
        SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = spotAnimationDefinition_modelArchive;
    }
}
