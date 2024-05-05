// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapDecoration
{
    final int rotation;
    final int decoration;
    final int objectDefinitionId;
    static final int ac = 1;
    
    WorldMapDecoration(final int n, final int n2, final int n3) {
        this.objectDefinitionId = 1358143841 * n;
        this.decoration = n2 * 1865707777;
        this.rotation = n3 * 1079176927;
    }
    
    static final void drawLoadingMessage(final String s, final boolean b, final int n) {
        try {
            if (!Client.showLoadingMessages) {
                return;
            }
            final int n2 = 4;
            final int n3 = n2 + 6;
            final int n4 = n2 + 6;
            final int fa = AbstractFont.fa(WallDecoration.fontPlain12, s, 250);
            final int n5 = class292.fo(WallDecoration.fontPlain12, s, 250) * 13;
            Rasterizer2D.Rasterizer2D_fillRectangle(n3 - n2, n4 - n2, n2 + (n2 + fa), n2 + (n2 + n5), 0);
            Rasterizer2D.Rasterizer2D_drawRectangle(n3 - n2, n4 - n2, fa + n2 + n2, n5 + n2 + n2, 16777215);
            WallDecoration.fontPlain12.ak(s, n3, n4, fa, n5, 16777215, -1, 1, 1, 0);
            final int n6 = n3 - n2;
            final int n7 = n4 - n2;
            final int n8 = fa + n2 + n2;
            final int n9 = n2 + (n5 + n2);
            for (int i = 0; i < -356793645 * Client.rootWidgetCount; ++i) {
                if (n == -1957273559) {
                    return;
                }
                if (Client.rootWidgetWidths[i] + Client.rootWidgetXs[i] > n6) {
                    if (n == -1957273559) {
                        throw new IllegalStateException();
                    }
                    if (Client.rootWidgetXs[i] < n8 + n6) {
                        if (n == -1957273559) {
                            return;
                        }
                        if (Client.rootWidgetYs[i] + Client.rootWidgetHeights[i] > n7) {
                            if (n == -1957273559) {
                                throw new IllegalStateException();
                            }
                            if (Client.rootWidgetYs[i] < n7 + n9) {
                                Client.field573[i] = true;
                            }
                        }
                    }
                }
            }
            if (b) {
                RouteStrategy.rasterProvider.drawFull(0, 0, 1570141358);
            }
            else {
                FriendsChat.method2139(n3, n4, fa, n5, -1848509736);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jl.ij(" + ')');
        }
    }
}
