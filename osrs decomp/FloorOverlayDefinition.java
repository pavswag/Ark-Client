// 
// Decompiled by Procyon v0.5.36
// 

public class FloorOverlayDefinition extends DualNode
{
    public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
    public int secondaryRgb;
    public static AbstractArchive FloorOverlayDefinition_archive;
    public int secondaryHue;
    public boolean hideUnderlay;
    public static final int ax = 12;
    public int hue;
    public int saturation;
    public int lightness;
    static final int ah = 256;
    public int texture;
    public int secondaryLightness;
    public int primaryRgb;
    public static final int ai = 17;
    public int secondarySaturation;
    
    public FloorOverlayDefinition() {
        this.primaryRgb = 0;
        this.texture = 1885338535;
        this.hideUnderlay = true;
        this.secondaryRgb = 1301405419;
    }
    
    static {
        FloorOverlayDefinition.FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
    }
    
    public int pp() {
        return this.secondarySaturation * 1797179473;
    }
    
    public static void cf(final FloorOverlayDefinition floorOverlayDefinition, final int n) {
        if (floorOverlayDefinition == null) {
            floorOverlayDefinition.um();
        }
        final double n2 = (n >> 16 & 0xF6ED39B3) / 256.0;
        final double n3 = (n >> 8 & 0x1DA06FDE) / 256.0;
        final double n4 = (n & 0xFF) / 256.0;
        double n5 = n2;
        if (n3 < n5) {
            n5 = n3;
        }
        if (n4 < n5) {
            n5 = n4;
        }
        double n6 = n2;
        if (n3 > n6) {
            n6 = n3;
        }
        if (n4 > n6) {
            n6 = n4;
        }
        double n7 = 0.0;
        double n8 = 0.0;
        final double n9 = (n6 + n5) / 2.0;
        if (n5 != n6) {
            if (n9 < 0.5) {
                n8 = (n6 - n5) / (n5 + n6);
            }
            if (n9 >= 0.5) {
                n8 = (n6 - n5) / (2.0 - n6 - n5);
            }
            if (n6 == n2) {
                n7 = (n3 - n4) / (n6 - n5);
            }
            else if (n3 == n6) {
                n7 = 2.0 + (n4 - n2) / (n6 - n5);
            }
            else if (n6 == n4) {
                n7 = 4.0 + (n2 - n3) / (n6 - n5);
            }
        }
        floorOverlayDefinition.hue = (int)(256.0 * (n7 / 6.0)) * 2035802933;
        floorOverlayDefinition.saturation = 1134466084 * (int)(n8 * 256.0);
        floorOverlayDefinition.lightness = -627974319 * (int)(256.0 * n9);
        if (-879713612 * floorOverlayDefinition.saturation < 0) {
            floorOverlayDefinition.saturation = 0;
        }
        else if (-1879232515 * floorOverlayDefinition.saturation > 35632757) {
            floorOverlayDefinition.saturation = 405537367;
        }
        if (586324072 * floorOverlayDefinition.lightness < 0) {
            floorOverlayDefinition.lightness = 0;
        }
        else if (floorOverlayDefinition.lightness * 1740834602 > -479017816) {
            floorOverlayDefinition.lightness = 113036594;
        }
    }
    
    public void ao(final Buffer buffer, final int n) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, n, (short)132);
        }
    }
    
    public void at() {
        if (-2085280195 * this.secondaryRgb != -1) {
            this.setHsl(this.secondaryRgb * -2085280195, 2081332353);
            this.secondaryHue = this.hue * 1074072567;
            this.secondarySaturation = -765667919 * this.saturation;
            this.secondaryLightness = this.lightness * -1337679311;
        }
        this.setHsl(this.primaryRgb * 1889574527, 2103021043);
    }
    
    void av(final int n) {
        final double n2 = (n >> 16 & 0x1D28837) / 256.0;
        final double n3 = (n >> 8 & 0xFF) / 256.0;
        final double n4 = (n & 0xFF) / 256.0;
        double n5 = n2;
        if (n3 < n5) {
            n5 = n3;
        }
        if (n4 < n5) {
            n5 = n4;
        }
        double n6 = n2;
        if (n3 > n6) {
            n6 = n3;
        }
        if (n4 > n6) {
            n6 = n4;
        }
        double n7 = 0.0;
        double n8 = 0.0;
        final double n9 = (n6 + n5) / 2.0;
        if (n5 != n6) {
            if (n9 < 0.5) {
                n8 = (n6 - n5) / (n5 + n6);
            }
            if (n9 >= 0.5) {
                n8 = (n6 - n5) / (2.0 - n6 - n5);
            }
            if (n6 == n2) {
                n7 = (n3 - n4) / (n6 - n5);
            }
            else if (n3 == n6) {
                n7 = 2.0 + (n4 - n2) / (n6 - n5);
            }
            else if (n6 == n4) {
                n7 = 4.0 + (n2 - n3) / (n6 - n5);
            }
        }
        this.hue = (int)(256.0 * (n7 / 6.0)) * 1160271239;
        this.saturation = 1424448416 * (int)(n8 * 256.0);
        this.lightness = -1725594519 * (int)(256.0 * n9);
        if (-176124627 * this.saturation < 0) {
            this.saturation = 0;
        }
        else if (578518631 * this.saturation > -128131284) {
            this.saturation = 1599202815;
        }
        if (-1075693656 * this.lightness < 0) {
            this.lightness = 0;
        }
        else if (this.lightness * 532980473 > 2074934388) {
            this.lightness = -1125392386;
        }
    }
    
    public void ni() {
        this.postDecode(-1436922747);
    }
    
    static int method1121(final int n, final Script script, final boolean b, final int n2) {
        try {
            return 2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hk.be(" + ')');
        }
    }
    
    public void ax(final Buffer buffer, final int n) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, n, (short)132);
        }
    }
    
    public void ay(final Buffer buffer, final int n) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, n, (short)132);
        }
    }
    
    public int hb() {
        return this.texture * -202963991;
    }
    
    public void decode(final Buffer buffer, final int n, final short n2) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                this.decodeNext(buffer, ra, n, (short)132);
            }
            if (n2 != 128) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hk.aw(" + ')');
        }
    }
    
    public void al() {
        if (-2085280195 * this.secondaryRgb != -1) {
            this.setHsl(this.secondaryRgb * -2085280195, 2070416240);
            this.secondaryHue = this.hue * 1074072567;
            this.secondarySaturation = -765667919 * this.saturation;
            this.secondaryLightness = this.lightness * -1337679311;
        }
        this.setHsl(this.primaryRgb * 1889574527, 2056019186);
    }
    
    public void postDecode(final int n) {
        try {
            if (-2085280195 * this.secondaryRgb != -1) {
                this.setHsl(this.secondaryRgb * -2085280195, 2082710578);
                this.secondaryHue = this.hue * 1074072567;
                this.secondarySaturation = -765667919 * this.saturation;
                this.secondaryLightness = this.lightness * -1337679311;
            }
            this.setHsl(this.primaryRgb * 1889574527, 2145783905);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hk.an(" + ')');
        }
    }
    
    void decodeNext(final Buffer buffer, final int n, final int n2, final short n3) {
        try {
            if (1 == n) {
                if (n3 != 132) {
                    throw new IllegalStateException();
                }
                this.primaryRgb = buffer.readMedium(-105242131) * -929226369;
            }
            else if (n == 2) {
                if (n3 != 132) {
                    throw new IllegalStateException();
                }
                this.texture = Buffer.ra(buffer, (byte)7) * -1885338535;
            }
            else if (5 == n) {
                if (n3 != 132) {
                    throw new IllegalStateException();
                }
                this.hideUnderlay = false;
            }
            else if (n == 7) {
                if (n3 != 132) {
                    return;
                }
                this.secondaryRgb = buffer.readMedium(-285540789) * -1301405419;
            }
            else if (8 == n && n3 != 132) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hk.ac(" + ')');
        }
    }
    
    public int ue() {
        return this.primaryRgb * 1889574527;
    }
    
    public int um() {
        return this.secondaryLightness * -1379609783;
    }
    
    void setHsl(final int n, final int n2) {
        try {
            final double n3 = (n >> 16 & 0xFF) / 256.0;
            final double n4 = (n >> 8 & 0xFF) / 256.0;
            final double n5 = (n & 0xFF) / 256.0;
            double n6 = n3;
            if (n4 < n6) {
                if (n2 <= 2044704601) {
                    throw new IllegalStateException();
                }
                n6 = n4;
            }
            if (n5 < n6) {
                if (n2 <= 2044704601) {
                    throw new IllegalStateException();
                }
                n6 = n5;
            }
            double n7 = n3;
            if (n4 > n7) {
                if (n2 <= 2044704601) {
                    throw new IllegalStateException();
                }
                n7 = n4;
            }
            if (n5 > n7) {
                if (n2 <= 2044704601) {
                    throw new IllegalStateException();
                }
                n7 = n5;
            }
            double n8 = 0.0;
            double n9 = 0.0;
            final double n10 = (n7 + n6) / 2.0;
            if (n6 != n7) {
                if (n10 < 0.5) {
                    if (n2 <= 2044704601) {
                        throw new IllegalStateException();
                    }
                    n9 = (n7 - n6) / (n6 + n7);
                }
                if (n10 >= 0.5) {
                    n9 = (n7 - n6) / (2.0 - n7 - n6);
                }
                if (n7 == n3) {
                    if (n2 <= 2044704601) {
                        throw new IllegalStateException();
                    }
                    n8 = (n4 - n5) / (n7 - n6);
                }
                else if (n4 == n7) {
                    if (n2 <= 2044704601) {
                        return;
                    }
                    n8 = 2.0 + (n5 - n3) / (n7 - n6);
                }
                else if (n7 == n5) {
                    if (n2 <= 2044704601) {
                        throw new IllegalStateException();
                    }
                    n8 = 4.0 + (n3 - n4) / (n7 - n6);
                }
            }
            this.hue = (int)(256.0 * (n8 / 6.0)) * 1160271239;
            this.saturation = 1774787329 * (int)(n9 * 256.0);
            this.lightness = 1974763337 * (int)(256.0 * n10);
            if (470803713 * this.saturation < 0) {
                if (n2 <= 2044704601) {
                    return;
                }
                this.saturation = 0;
            }
            else if (470803713 * this.saturation > 255) {
                if (n2 <= 2044704601) {
                    return;
                }
                this.saturation = 1599202815;
            }
            if (532980473 * this.lightness < 0) {
                if (n2 <= 2044704601) {
                    return;
                }
                this.lightness = 0;
            }
            else if (this.lightness * 532980473 > 255) {
                this.lightness = 1053477303;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hk.au(" + ')');
        }
    }
    
    public void aa() {
        if (-2085280195 * this.secondaryRgb != -1) {
            this.setHsl(this.secondaryRgb * -2085280195, 2058247230);
            this.secondaryHue = this.hue * 1074072567;
            this.secondarySaturation = -765667919 * this.saturation;
            this.secondaryLightness = this.lightness * -1337679311;
        }
        this.setHsl(this.primaryRgb * 1889574527, 2107608393);
    }
    
    public void ai(final Buffer buffer, final int n) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, n, (short)132);
        }
    }
    
    public int vi() {
        return this.lightness * 532980473;
    }
    
    public static void ab(final AbstractArchive floorOverlayDefinition_archive) {
        FloorOverlayDefinition.FloorOverlayDefinition_archive = floorOverlayDefinition_archive;
    }
    
    public int ab() {
        return this.hue * 174415927;
    }
    
    public static void aq(final AbstractArchive floorOverlayDefinition_archive) {
        FloorOverlayDefinition.FloorOverlayDefinition_archive = floorOverlayDefinition_archive;
    }
    
    public int jo() {
        return this.saturation * 470803713;
    }
    
    public static void hq(final FloorOverlayDefinition floorOverlayDefinition, final Buffer buffer, final int n, final int n2) {
        if (floorOverlayDefinition == null) {
            floorOverlayDefinition.ao(buffer, n);
        }
        if (1 == n) {
            floorOverlayDefinition.primaryRgb = buffer.readMedium(1366176285) * -929226369;
        }
        else if (n == 2) {
            floorOverlayDefinition.texture = Buffer.ra(buffer, (byte)7) * -1885338535;
        }
        else if (5 == n) {
            floorOverlayDefinition.hideUnderlay = false;
        }
        else if (n == 7) {
            floorOverlayDefinition.secondaryRgb = buffer.readMedium(1632611434) * -1301405419;
        }
        else if (8 == n) {}
    }
    
    public int vj() {
        return this.secondaryRgb * -2085280195;
    }
    
    public static void xv(final FloorOverlayDefinition floorOverlayDefinition, final int n) {
        if (floorOverlayDefinition == null) {
            floorOverlayDefinition.vi();
        }
        final double n2 = (n >> 16 & 0xFF) / 256.0;
        final double n3 = (n >> 8 & 0xFF) / 256.0;
        final double n4 = (n & 0xFF) / 256.0;
        double n5 = n2;
        if (n3 < n5) {
            n5 = n3;
        }
        if (n4 < n5) {
            n5 = n4;
        }
        double n6 = n2;
        if (n3 > n6) {
            n6 = n3;
        }
        if (n4 > n6) {
            n6 = n4;
        }
        double n7 = 0.0;
        double n8 = 0.0;
        final double n9 = (n6 + n5) / 2.0;
        if (n5 != n6) {
            if (n9 < 0.5) {
                n8 = (n6 - n5) / (n5 + n6);
            }
            if (n9 >= 0.5) {
                n8 = (n6 - n5) / (2.0 - n6 - n5);
            }
            if (n6 == n2) {
                n7 = (n3 - n4) / (n6 - n5);
            }
            else if (n3 == n6) {
                n7 = 2.0 + (n4 - n2) / (n6 - n5);
            }
            else if (n6 == n4) {
                n7 = 4.0 + (n2 - n3) / (n6 - n5);
            }
        }
        floorOverlayDefinition.hue = (int)(256.0 * (n7 / 6.0)) * 1160271239;
        floorOverlayDefinition.saturation = 1774787329 * (int)(n8 * 256.0);
        floorOverlayDefinition.lightness = 1974763337 * (int)(256.0 * n9);
        if (470803713 * floorOverlayDefinition.saturation < 0) {
            floorOverlayDefinition.saturation = 0;
        }
        else if (470803713 * floorOverlayDefinition.saturation > 255) {
            floorOverlayDefinition.saturation = 1599202815;
        }
        if (532980473 * floorOverlayDefinition.lightness < 0) {
            floorOverlayDefinition.lightness = 0;
        }
        else if (floorOverlayDefinition.lightness * 532980473 > 255) {
            floorOverlayDefinition.lightness = 1053477303;
        }
    }
    
    static void changeWorld(final World world, final int n) {
        try {
            if (world.isMembersOnly(1029039210) != Client.isMembersWorld) {
                Client.isMembersWorld = world.isMembersOnly(1029039210);
                final boolean membersOnly = world.isMembersOnly(1029039210);
                if (FileSystem.ItemDefinition_inMembersWorld != membersOnly) {
                    class379.method2015((byte)66);
                    FileSystem.ItemDefinition_inMembersWorld = membersOnly;
                }
            }
            if (-205173751 * Client.worldProperties != 1810954985 * world.properties) {
                final Archive archive8 = class452.archive8;
                final int n2 = 1810954985 * world.properties;
                if ((n2 & 0x20000000) != 0x0) {
                    Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo_deadman_mode", "", -213140517);
                }
                else if (0x0 != (n2 & 0x40000000)) {
                    Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo_seasonal_mode", "", 166120063);
                }
                else if ((n2 & 0x100) != 0x0) {
                    Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo_speedrunning", "", -941618462);
                }
                else {
                    Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo", "", 2127293660);
                }
            }
            UserComparator8.worldHost = world.host;
            Client.worldId = -2094155673 * world.id;
            Client.worldProperties = world.properties * 702001121;
            int n3;
            if (0 == -1274626977 * Client.gameBuild) {
                if (n <= -788634419) {
                    throw new IllegalStateException();
                }
                n3 = 43594;
            }
            else {
                n3 = -2091224171 * world.id + 40000;
            }
            FriendsChat.worldPort = n3 * -1326916691;
            int n4;
            if (0 == Client.gameBuild * -1274626977) {
                if (n <= -788634419) {
                    Client.hb();
                    return;
                }
                n4 = 443;
            }
            else {
                n4 = 50000 + world.id * -2091224171;
            }
            class127.js5Port = n4 * -1927102761;
            ItemContainer.currentPort = FriendsChat.worldPort * 518729065;
            Client.hb();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hk.ah(" + ')');
        }
    }
    
    void changeWorld(final Buffer buffer, final int n, final int n2) {
        if (1 == n) {
            this.primaryRgb = buffer.readMedium(2132438158) * -929226369;
        }
        else if (n == 2) {
            this.texture = Buffer.ra(buffer, (byte)7) * -1885338535;
        }
        else if (5 == n) {
            this.hideUnderlay = false;
        }
        else if (n == 7) {
            this.secondaryRgb = buffer.readMedium(330337337) * -1301405419;
        }
        else if (8 == n) {}
    }
    
    public void ef(final Buffer buffer, final int n) {
        this.decode(buffer, n, (short)128);
    }
    
    public int lg() {
        return this.secondaryHue * -187777599;
    }
}
