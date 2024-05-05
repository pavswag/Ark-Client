// 
// Decompiled by Procyon v0.5.36
// 

public class class431 extends class432
{
    static final int ac = 0;
    static final int bf = 1;
    
    public class431(final int n) {
        super(n);
    }
    
    static int ItemContainer_getCount(final int n, final int n2, final int n3) {
        try {
            final ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
            if (itemContainer != null) {
                if (n2 >= 0) {
                    if (n3 != 2098730562) {
                        throw new IllegalStateException();
                    }
                    if (n2 < itemContainer.ids.length) {
                        return itemContainer.ids[n2];
                    }
                    if (n3 != 2098730562) {
                        throw new IllegalStateException();
                    }
                }
                return 0;
            }
            if (n3 != 2098730562) {
                throw new IllegalStateException();
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qb.an(" + ')');
        }
    }
    
    void ItemContainer_getCount(final Buffer buffer, final int n) {
    }
    
    public static boolean uk(final WorldMap worldMap, final int i) {
        return !worldMap.enabledCategories.contains(i);
    }
    
    @Override
    void vmethod7769(final Buffer buffer, final int n, final int n2) {
    }
    
    public static class381 xt(final class379 class379, final int index) {
        return class379.field3619.get(index);
    }
    
    static void method2278(final int n, final int n2, final byte b) {
        try {
            int bf = class137.fontBold12.bf(Strings.gd);
            for (int i = 0; i < Client.menuOptionsCount * 730065501; ++i) {
                final int bf2 = class137.fontBold12.bf(Friend.method2152(i, (short)(-12883)));
                if (bf2 > bf) {
                    if (b == 1) {
                        return;
                    }
                    bf = bf2;
                }
            }
            bf += 8;
            final int n3 = Client.menuOptionsCount * -1933919373 + 22;
            int n4 = n - bf / 2;
            if (bf + n4 > Client.aj * -1687260435) {
                if (b == 1) {
                    return;
                }
                n4 = -1687260435 * Client.aj - bf;
            }
            if (n4 < 0) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                n4 = 0;
            }
            int n5 = n2;
            if (n3 + n5 > 1658005443 * class262.canvasHeight) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                n5 = class262.canvasHeight * 1658005443 - n3;
            }
            if (n5 < 0) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                n5 = 0;
            }
            class192.menuX = n4 * -945723825;
            ArchiveLoader.menuY = 232216885 * n5;
            DesktopPlatformInfoProvider.menuWidth = -760159457 * bf;
            class147.menuHeight = 1585038229 * Client.menuOptionsCount + 167124602;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qb.kx(" + ')');
        }
    }
}
