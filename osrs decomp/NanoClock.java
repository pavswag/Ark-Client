// 
// Decompiled by Procyon v0.5.36
// 

public class NanoClock extends Clock
{
    public long xh;
    long lastTimeNano;
    
    NanoClock() {
        this.lastTimeNano = System.nanoTime() * 6656301822495610875L;
    }
    
    @Override
    public void aw() {
        this.lastTimeNano = System.nanoTime() * 6656301822495610875L;
    }
    
    @Override
    public int wait(final int n, final int n2, final int n3) {
        if (!Client.fw || Client.gameState * -1275976559 < 25) {
            final int n4 = -1491982008;
            int n7;
            try {
                final long n5 = n2 * 1000000L;
                long n6 = 5545563677173652275L * this.lastTimeNano - System.nanoTime();
                if (n6 < n5) {
                    if (n4 >= -92512277) {
                        throw new IllegalStateException();
                    }
                    n6 = n5;
                }
                PlayerComposition.method1692(n6 / 1000000L);
                final long nanoTime = System.nanoTime();
                int i;
                for (i = 0; i < 10; ++i, this.lastTimeNano += -2862317670020565824L * n) {
                    if (n4 >= -92512277) {
                        throw new IllegalStateException();
                    }
                    if (i >= 1) {
                        if (n4 >= -92512277) {
                            throw new IllegalStateException();
                        }
                        if (5545563677173652275L * this.lastTimeNano >= nanoTime) {
                            break;
                        }
                        if (n4 >= -92512277) {
                            throw new IllegalStateException();
                        }
                    }
                }
                if (5545563677173652275L * this.lastTimeNano < nanoTime) {
                    this.lastTimeNano = 6656301822495610875L * nanoTime;
                }
                n7 = i;
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "gu.an(" + ')');
            }
            return n7;
        }
        long xh = System.nanoTime();
        if (xh < this.lastTimeNano * 5545563677173652275L || xh < this.xh) {
            final long xh2 = xh;
            this.xh = xh2;
            this.lastTimeNano = xh2 * 6656301822495610875L;
            return 1;
        }
        if (Client.ah > 0L) {
            final long n8 = (Client.ah - (xh - this.xh)) / 1000000L;
            if (n8 > 0L) {
                try {
                    if (n8 % 10L == 0L) {
                        Thread.sleep(n8 - 1L);
                        Thread.sleep(1L);
                    }
                    else {
                        Thread.sleep(n8);
                    }
                }
                catch (InterruptedException ex2) {}
                xh = System.nanoTime();
            }
        }
        this.xh = xh;
        final long n9 = n * 1000000L;
        int n10 = (int)((xh - this.lastTimeNano * 5545563677173652275L) / n9);
        this.lastTimeNano = (this.lastTimeNano * 5545563677173652275L + n10 * n9) * 6656301822495610875L;
        if (n10 > 10) {
            n10 = 10;
        }
        return n10;
    }
    
    @Override
    public void ac() {
        this.lastTimeNano = System.nanoTime() * 6656301822495610875L;
    }
    
    @Override
    public void au() {
        this.lastTimeNano = System.nanoTime() * 6656301822495610875L;
    }
    
    public static void ow(final class394 class394, final class435 class395) {
        class394.field3683.put("Content-Type", class435.mo(class395, 797480377));
    }
    
    @Override
    public void mark(final int n) {
        try {
            this.lastTimeNano = System.nanoTime() * 6656301822495610875L;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gu.af(" + ')');
        }
    }
    
    @Override
    public int ab(final int n, final int n2) {
        final long n3 = n2 * 1000000L;
        long n4 = 5545563677173652275L * this.lastTimeNano - System.nanoTime();
        if (n4 < n3) {
            n4 = n3;
        }
        PlayerComposition.method1692(n4 / 1000000L);
        long nanoTime;
        int n5;
        for (nanoTime = System.nanoTime(), n5 = 0; n5 < 10 && (n5 < 1 || 5545563677173652275L * this.lastTimeNano < nanoTime); ++n5, this.lastTimeNano += -2862317670020565824L * n) {}
        if (5545563677173652275L * this.lastTimeNano < nanoTime) {
            this.lastTimeNano = 6656301822495610875L * nanoTime;
        }
        return n5;
    }
    
    @Override
    public int aq(final int n, final int n2) {
        final long n3 = n2 * 1000000L;
        long n4 = 5545563677173652275L * this.lastTimeNano - System.nanoTime();
        if (n4 < n3) {
            n4 = n3;
        }
        PlayerComposition.method1692(n4 / 1000000L);
        long nanoTime;
        int n5;
        for (nanoTime = System.nanoTime(), n5 = 0; n5 < 10 && (n5 < 1 || 5545563677173652275L * this.lastTimeNano < nanoTime); ++n5, this.lastTimeNano += -2862317670020565824L * n) {}
        if (5545563677173652275L * this.lastTimeNano < nanoTime) {
            this.lastTimeNano = 6656301822495610875L * nanoTime;
        }
        return n5;
    }
    
    public static int fq(final GrandExchangeOfferWorldComparator grandExchangeOfferWorldComparator, final Object o, final Object o2) {
        if (grandExchangeOfferWorldComparator == null) {
            return grandExchangeOfferWorldComparator.compare(o, o);
        }
        return grandExchangeOfferWorldComparator.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, -1755360852);
    }
}
