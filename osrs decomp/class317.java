// 
// Decompiled by Procyon v0.5.36
// 

public class class317
{
    static final int dt = 6;
    
    class317() throws Throwable {
        throw new Error();
    }
    
    public static int ao(final int n) {
        return n >> 17 & 0x7;
    }
    
    public static int at(final int n) {
        return n >> 11 & 0x3F;
    }
    
    public static boolean av(final int n) {
        return 0x0 != (n >> 21 & 0x1);
    }
    
    public static boolean as(final int n) {
        return 0x0 != (n >> 22 & 0x1);
    }
    
    public static int ax(final int n) {
        return n >> 17 & 0x7;
    }
    
    public static int ay(final int n) {
        return n >> 17 & 0x7;
    }
    
    public static boolean am(final int n) {
        return 0x0 != (n >> 22 & 0x1);
    }
    
    public static int al(final int n) {
        return n >> 11 & 0x3F;
    }
    
    public static int aa(final int n) {
        return n >> 17 & 0x7;
    }
    
    public static boolean ai(final int n) {
        return 0x0 != (n >> 20 & 0x1);
    }
    
    public static boolean ar(final int n) {
        return 0x0 != (n >> 21 & 0x1);
    }
    
    public static int ab(final int n) {
        return n >> 11 & 0x3F;
    }
    
    public static int aq(final int n) {
        return n >> 11 & 0x3F;
    }
    
    public static boolean ag(final int n) {
        return 0x0 != (n >> 20 & 0x1);
    }
    
    static final void method1828(final int n, final int n2, final int n3) {
        try {
            if (2 == Client.hintArrowType * 633821975) {
                class374.worldToScreen(Client.hintArrowSubX * 1774830445 + (-1178855237 * Client.hintArrowX - WorldMapData_0.baseX * -1232093375 << 7), Client.hintArrowSubY * 1772868165 + (Client.hintArrowY * 796703205 - GameObject.baseY * 827352769 << 7), Client.hintArrowHeight * -887816298, -1989421163);
                if (Client.viewportTempX * -1848743379 > -1 && Client.cycle * -1886224337 % 20 < 10) {
                    if (n3 <= 1541081651) {
                        return;
                    }
                    KitDefinition.headIconHintSprites[0].drawAt(n + -1848743379 * Client.viewportTempX - 12, Client.viewportTempY * 318977283 + n2 - 28);
                }
                return;
            }
            if (n3 <= 1541081651) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mm.jo(" + ')');
        }
    }
    
    public static boolean ah(final int n) {
        return 0x0 != (n >> 20 & 0x1);
    }
}
