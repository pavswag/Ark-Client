// 
// Decompiled by Procyon v0.5.36
// 

public class GraphicsDefaults
{
    public int field3767;
    public int field3768;
    public int mapScenes;
    public int headIconsPk;
    public int field3771;
    public int field3772;
    public int field3773;
    public int field3774;
    public int field3775;
    public int field3776;
    public int compass;
    
    public GraphicsDefaults() {
        this.compass = -658978373;
        this.field3767 = 363664783;
        this.mapScenes = -18237505;
        this.headIconsPk = -1245415821;
        this.field3775 = 2051613563;
        this.field3772 = 524907877;
        this.field3773 = -805566907;
        this.field3771 = 1802127851;
        this.field3774 = -2096300737;
        this.field3776 = -1395448323;
        this.field3768 = 1797432843;
    }
    
    public void aw(final AbstractArchive abstractArchive) {
        final Buffer buffer = new Buffer(AbstractArchive.sh(abstractArchive, 595484225 * DefaultsGroup.field3766.group, (byte)84));
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            switch (ra) {
                case 2: {
                    this.compass = buffer.method2516(28491091) * 658978373;
                    this.field3767 = buffer.method2516(1470608841) * -363664783;
                    this.mapScenes = buffer.method2516(1658985989) * 18237505;
                    this.headIconsPk = buffer.method2516(133205805) * 1245415821;
                    this.field3775 = buffer.method2516(1579796708) * -2051613563;
                    this.field3772 = buffer.method2516(582210523) * -524907877;
                    this.field3773 = buffer.method2516(1398972378) * 805566907;
                    this.field3771 = buffer.method2516(1286296698) * -1802127851;
                    this.field3774 = buffer.method2516(1515663998) * 2096300737;
                    this.field3776 = buffer.method2516(1708084307) * 1395448323;
                    this.field3768 = buffer.method2516(2027655759) * -1797432843;
                    continue;
                }
                default: {
                    continue;
                }
                case 1: {
                    buffer.readMedium(-106412299);
                    continue;
                }
            }
        }
    }
    
    public void an(final AbstractArchive abstractArchive) {
        final Buffer buffer = new Buffer(AbstractArchive.sh(abstractArchive, 251393081 * DefaultsGroup.field3766.group, (byte)31));
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            switch (ra) {
                case 2: {
                    this.compass = buffer.method2516(880863046) * 658978373;
                    this.field3767 = buffer.method2516(72996497) * 491601391;
                    this.mapScenes = buffer.method2516(176491159) * 18237505;
                    this.headIconsPk = buffer.method2516(2108606418) * 1245415821;
                    this.field3775 = buffer.method2516(369959886) * -145284902;
                    this.field3772 = buffer.method2516(1110520746) * -524907877;
                    this.field3773 = buffer.method2516(1593454303) * 805566907;
                    this.field3771 = buffer.method2516(1764815975) * 1710336119;
                    this.field3774 = buffer.method2516(862356252) * -704418199;
                    this.field3776 = buffer.method2516(881110961) * 1395448323;
                    this.field3768 = buffer.method2516(1844796909) * -1797432843;
                    continue;
                }
                case 1: {
                    buffer.readMedium(-1189069027);
                    continue;
                }
                default: {
                    continue;
                }
            }
        }
    }
    
    public static boolean hy(final WorldMapArchiveLoader worldMapArchiveLoader) {
        return worldMapArchiveLoader.loaded;
    }
    
    public static VarpDefinition decode(final int n, final int n2) {
        try {
            final VarpDefinition varpDefinition = (VarpDefinition)VarpDefinition.VarpDefinition_cached.wr(n);
            if (null != varpDefinition) {
                return varpDefinition;
            }
            final byte[] takeFile = VarpDefinition.VarpDefinition_archive.takeFile(16, n, (byte)(-1));
            final VarpDefinition varpDefinition2 = new VarpDefinition();
            if (takeFile != null) {
                if (n2 >= -654466346) {
                    throw new IllegalStateException();
                }
                varpDefinition2.ab(new Buffer(takeFile), 955579844);
            }
            VarpDefinition.VarpDefinition_cached.put(varpDefinition2, n);
            return varpDefinition2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qw.af(" + ')');
        }
    }
    
    public void decode(final AbstractArchive abstractArchive, final int n) {
        try {
            final Buffer buffer = new Buffer(AbstractArchive.sh(abstractArchive, 595484225 * DefaultsGroup.field3766.group, (byte)8));
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                switch (ra) {
                    default: {
                        continue;
                    }
                    case 2: {
                        this.compass = buffer.method2516(203805527) * 658978373;
                        this.field3767 = buffer.method2516(1227117525) * -363664783;
                        this.mapScenes = buffer.method2516(281879387) * 18237505;
                        this.headIconsPk = buffer.method2516(1309881932) * 1245415821;
                        this.field3775 = buffer.method2516(1588338223) * -2051613563;
                        this.field3772 = buffer.method2516(1788174195) * -524907877;
                        this.field3773 = buffer.method2516(1731635951) * 805566907;
                        this.field3771 = buffer.method2516(195444732) * -1802127851;
                        this.field3774 = buffer.method2516(1962763962) * 2096300737;
                        this.field3776 = buffer.method2516(352717850) * 1395448323;
                        this.field3768 = buffer.method2516(935264208) * -1797432843;
                        continue;
                    }
                    case 1: {
                        buffer.readMedium(2130592697);
                        continue;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qw.af(" + ')');
        }
    }
    
    static final void method2228(final byte b) {
        try {
            GraphicsObject graphicsObject = (GraphicsObject)Client.graphicsObjects.last();
        Label_0014_Outer:
            while (graphicsObject != null) {
                if (b >= 0) {
                    return;
                }
                while (true) {
                    Label_0040: {
                        if (graphicsObject.plane * 397044137 != -1727408401 * GameEngine.Client_plane) {
                            break Label_0040;
                        }
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        if (graphicsObject.isFinished) {
                            if (b >= 0) {
                                return;
                            }
                            break Label_0040;
                        }
                        else if (-1886224337 * Client.cycle >= -1927288833 * graphicsObject.cycleStart) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            graphicsObject.advance(Client.field432 * -1795081153, (byte)(-34));
                            if (graphicsObject.isFinished) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                graphicsObject.hw();
                            }
                            else {
                                class31.scene.drawEntity(graphicsObject.plane * 397044137, -1570643775 * graphicsObject.x, -161744223 * graphicsObject.y, graphicsObject.z * -769506393, 60, graphicsObject, 0, -1L, false);
                            }
                        }
                        graphicsObject = (GraphicsObject)Client.graphicsObjects.previous();
                        continue Label_0014_Outer;
                    }
                    graphicsObject.hw();
                    continue;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qw.jg(" + ')');
        }
    }
}
