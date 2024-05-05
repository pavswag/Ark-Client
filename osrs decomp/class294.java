// 
// Decompiled by Procyon v0.5.36
// 

public class class294
{
    static int field2713;
    public static AbstractArchive VarcInt_archive;
    static int field2715;
    static final int aq = 7;
    public static final int cd = 99;
    
    class294() throws Throwable {
        throw new Error();
    }
    
    public static void li(final FloorUnderlayDefinition floorUnderlayDefinition, final int n) {
        if (floorUnderlayDefinition == null) {
            floorUnderlayDefinition.setHsl(n, n);
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
            if (n2 == n6) {
                n7 = (n3 - n4) / (n6 - n5);
            }
            else if (n3 == n6) {
                n7 = (n4 - n2) / (n6 - n5) + 2.0;
            }
            else if (n4 == n6) {
                n7 = 4.0 + (n2 - n3) / (n6 - n5);
            }
        }
        final double n10 = n7 / 6.0;
        floorUnderlayDefinition.saturation = (int)(n8 * 256.0) * 479912699;
        floorUnderlayDefinition.lightness = (int)(n9 * 256.0) * 239606945;
        if (1058265139 * floorUnderlayDefinition.saturation < 0) {
            floorUnderlayDefinition.saturation = 0;
        }
        else if (floorUnderlayDefinition.saturation * 1058265139 > 255) {
            floorUnderlayDefinition.saturation = 2118653957;
        }
        if (floorUnderlayDefinition.lightness * -1527986335 < 0) {
            floorUnderlayDefinition.lightness = 0;
        }
        else if (-1527986335 * floorUnderlayDefinition.lightness > 255) {
            floorUnderlayDefinition.lightness = 970228831;
        }
        if (n9 > 0.5) {
            floorUnderlayDefinition.hueMultiplier = 335859721 * (int)((1.0 - n9) * n8 * 512.0);
        }
        else {
            floorUnderlayDefinition.hueMultiplier = (int)(512.0 * (n9 * n8)) * 335859721;
        }
        if (floorUnderlayDefinition.hueMultiplier * -2012234183 < 1) {
            floorUnderlayDefinition.hueMultiplier = 335859721;
        }
        floorUnderlayDefinition.hue = 1936467539 * (int)(floorUnderlayDefinition.hueMultiplier * -2012234183 * n10);
    }
    
    public static final void an(final long n) {
        if (n <= 0L) {
            return;
        }
        if (0L == n % 10L) {
            final long n2 = n - 1L;
            try {
                Thread.sleep(n2);
            }
            catch (InterruptedException ex) {}
            try {
                Thread.sleep(1L);
            }
            catch (InterruptedException ex2) {}
        }
        else {
            try {
                Thread.sleep(n);
            }
            catch (InterruptedException ex3) {}
        }
    }
    
    public static boolean vx(final World world) {
        return (0x2F18B0A9 & world.properties * 1810954985) != 0x0;
    }
    
    public static void method1607(final byte b) {
        try {
            FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lh.ab(" + ')');
        }
    }
    
    public static boolean ez(final World world) {
        if (world == null) {
            world.bh();
        }
        return 0x0 != (0x4 & 1810954985 * world.properties);
    }
    
    public static int uf(final GrandExchangeOfferAgeComparator grandExchangeOfferAgeComparator, final Object o, final Object o2) {
        if (grandExchangeOfferAgeComparator == null) {
            grandExchangeOfferAgeComparator.gq(o);
        }
        return grandExchangeOfferAgeComparator.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)19);
    }
}
