import java.util.concurrent.ThreadPoolExecutor;

// 
// Decompiled by Procyon v0.5.36
// 

public class class374 extends RuntimeException
{
    static ThreadPoolExecutor field3598;
    
    public class374(final String format, final Object[] args) {
        super(String.format(format, args));
    }
    
    static final void worldToScreen(int n, int n2, final int n3, final int n4) {
        try {
            if (n >= 128) {
                if (n4 >= 1630906241) {
                    throw new IllegalStateException();
                }
                if (n2 >= 128) {
                    if (n4 >= 1630906241) {
                        throw new IllegalStateException();
                    }
                    if (n <= 13056) {
                        if (n4 >= 1630906241) {
                            return;
                        }
                        if (n2 <= 13056) {
                            final int n5 = class147.getTileHeight(n, n2, -1727408401 * GameEngine.Client_plane, (byte)(-17)) - n3;
                            n -= class36.cameraX * -2100544359;
                            final int n6 = n5 - class174.cameraY * 1772923873;
                            n2 -= class297.cameraZ * -91399205;
                            final int n7 = Rasterizer3D.Rasterizer3D_sine[1897923909 * WorldMapSectionType.cameraPitch];
                            final int n8 = Rasterizer3D.Rasterizer3D_cosine[WorldMapSectionType.cameraPitch * 1897923909];
                            final int n9 = Rasterizer3D.Rasterizer3D_sine[-1010818347 * class125.cameraYaw];
                            final int n10 = Rasterizer3D.Rasterizer3D_cosine[-1010818347 * class125.cameraYaw];
                            final int n11 = n10 * n + n9 * n2 >> 16;
                            n2 = n2 * n10 - n9 * n >> 16;
                            n = n11;
                            final int n12 = n8 * n6 - n7 * n2 >> 16;
                            n2 = n2 * n8 + n6 * n7 >> 16;
                            final int n13 = n12;
                            if (n2 >= 50) {
                                if (n4 >= 1630906241) {
                                    throw new IllegalStateException();
                                }
                                Client.viewportTempX = (433849721 * Client.viewportWidth / 2 + n * (Client.viewportZoom * -1114517553) / n2) * -846498395;
                                Client.viewportTempY = -1610031701 * (Client.viewportHeight * 2042096749 / 2 + n13 * (-1114517553 * Client.viewportZoom) / n2);
                            }
                            else {
                                Client.viewportTempX = 846498395;
                                Client.viewportTempY = 1610031701;
                            }
                            return;
                        }
                        if (n4 >= 1630906241) {
                            throw new IllegalStateException();
                        }
                    }
                }
            }
            Client.viewportTempX = 846498395;
            Client.viewportTempY = 1610031701;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ot.jf(" + ')');
        }
    }
}
