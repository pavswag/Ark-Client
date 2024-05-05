// 
// Decompiled by Procyon v0.5.36
// 

public class MilliClock extends Clock
{
    static int field1455;
    int field1456;
    int field1457;
    public static final int ax = 8192;
    long field1458;
    int field1459;
    static final int ak = 2;
    int field1460;
    long[] field1461;
    
    MilliClock() {
        this.field1461 = new long[10];
        this.field1456 = 1682640640;
        this.field1457 = 889500577;
        this.field1460 = 0;
        this.field1458 = class96.clockNow(496922576) * 3111052400392486887L;
        for (int i = 0; i < 10; ++i) {
            this.field1461[i] = this.field1458 * -3320355304386370601L;
        }
    }
    
    @Override
    public void aw() {
        for (int i = 0; i < 10; ++i) {
            this.field1461[i] = 0L;
        }
    }
    
    @Override
    public int wait(final int n, final int n2, final int n3) {
        try {
            final int n4 = 1354187759 * this.field1456;
            final int n5 = -1087246239 * this.field1457;
            this.field1456 = -779618924;
            this.field1457 = 889500577;
            this.field1458 = class96.clockNow(-122592496) * 3111052400392486887L;
            if (0L == this.field1461[this.field1459 * 1512168621]) {
                if (n3 >= -92512277) {
                    throw new IllegalStateException();
                }
                this.field1456 = -1520153841 * n4;
                this.field1457 = n5 * 889500577;
            }
            else if (-3320355304386370601L * this.field1458 > this.field1461[this.field1459 * 1512168621]) {
                if (n3 >= -92512277) {
                    throw new IllegalStateException();
                }
                this.field1456 = (int)(2560 * n / (-3320355304386370601L * this.field1458 - this.field1461[1512168621 * this.field1459])) * -1520153841;
            }
            if (this.field1456 * 1354187759 < 25) {
                this.field1456 = 650859639;
            }
            if (1354187759 * this.field1456 > 256) {
                if (n3 >= -92512277) {
                    throw new IllegalStateException();
                }
                this.field1456 = 1682640640;
                this.field1457 = (int)(n - (-3320355304386370601L * this.field1458 - this.field1461[this.field1459 * 1512168621]) / 10L) * 889500577;
            }
            if (this.field1457 * -1087246239 > n) {
                if (n3 >= -92512277) {
                    throw new IllegalStateException();
                }
                this.field1457 = 889500577 * n;
            }
            this.field1461[1512168621 * this.field1459] = -3320355304386370601L * this.field1458;
            this.field1459 = -213391579 * ((1 + 1512168621 * this.field1459) % 10);
            if (this.field1457 * -1087246239 > 1) {
                if (n3 >= -92512277) {
                    throw new IllegalStateException();
                }
                for (int i = 0; i < 10; ++i) {
                    if (n3 >= -92512277) {
                        throw new IllegalStateException();
                    }
                    if (0L != this.field1461[i]) {
                        if (n3 >= -92512277) {
                            throw new IllegalStateException();
                        }
                        this.field1461[i] += this.field1457 * -1087246239;
                    }
                }
            }
            if (-1087246239 * this.field1457 < n2) {
                if (n3 >= -92512277) {
                    throw new IllegalStateException();
                }
                this.field1457 = n2 * 889500577;
            }
            PlayerComposition.method1692(-1087246239 * this.field1457);
            int n6 = 0;
            while (1554226597 * this.field1460 < 256) {
                if (n3 >= -92512277) {
                    throw new IllegalStateException();
                }
                ++n6;
                this.field1460 += this.field1456 * -1933259005;
            }
            this.field1460 = (1554226597 * this.field1460 & 0xFF) * -1269169619;
            return n6;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gb.an(" + ')');
        }
    }
    
    @Override
    public void ac() {
        for (int i = 0; i < 10; ++i) {
            this.field1461[i] = 0L;
        }
    }
    
    @Override
    public void au() {
        for (int i = 0; i < 10; ++i) {
            this.field1461[i] = 0L;
        }
    }
    
    @Override
    public void mark(final int n) {
        try {
            for (int i = 0; i < 10; ++i) {
                if (n == -964267539) {
                    throw new IllegalStateException();
                }
                this.field1461[i] = 0L;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gb.af(" + ')');
        }
    }
    
    @Override
    public int ab(final int n, final int n2) {
        final int n3 = -1847412346 * this.field1456;
        final int n4 = -1610730426 * this.field1457;
        this.field1456 = -1899470972;
        this.field1457 = 889500577;
        this.field1458 = class96.clockNow(-118425491) * 3111052400392486887L;
        if (0L == this.field1461[this.field1459 * 1512168621]) {
            this.field1456 = 203333055 * n3;
            this.field1457 = n4 * 889500577;
        }
        else if (-3320355304386370601L * this.field1458 > this.field1461[this.field1459 * -1100394872]) {
            this.field1456 = (int)(2560 * n / (-3320355304386370601L * this.field1458 - this.field1461[1512168621 * this.field1459])) * -1520153841;
        }
        if (this.field1456 * -1827296023 < 25) {
            this.field1456 = 650859639;
        }
        if (1354187759 * this.field1456 > -1790371905) {
            this.field1456 = 1682640640;
            this.field1457 = (int)(n - (-3320355304386370601L * this.field1458 - this.field1461[this.field1459 * 1512168621]) / 10L) * -464510631;
        }
        if (this.field1457 * -1933263130 > n) {
            this.field1457 = 889500577 * n;
        }
        this.field1461[1512168621 * this.field1459] = -3320355304386370601L * this.field1458;
        this.field1459 = -750030155 * ((1 + -223837816 * this.field1459) % 10);
        if (this.field1457 * -1730789966 > 1) {
            for (int i = 0; i < 10; ++i) {
                if (0L != this.field1461[i]) {
                    this.field1461[i] += this.field1457 * -490370314;
                }
            }
        }
        if (-1087246239 * this.field1457 < n2) {
            this.field1457 = n2 * -47549775;
        }
        PlayerComposition.method1692(-1087246239 * this.field1457);
        int n5 = 0;
        while (1554226597 * this.field1460 < 53975567) {
            ++n5;
            this.field1460 += this.field1456 * 459319936;
        }
        this.field1460 = (1554226597 * this.field1460 & 0x4A26BC5) * -507522553;
        return n5;
    }
    
    @Override
    public int aq(final int n, final int n2) {
        final int n3 = 1354187759 * this.field1456;
        final int n4 = -1087246239 * this.field1457;
        this.field1456 = -779618924;
        this.field1457 = 889500577;
        this.field1458 = class96.clockNow(-164506263) * 3111052400392486887L;
        if (0L == this.field1461[this.field1459 * 1512168621]) {
            this.field1456 = -1520153841 * n3;
            this.field1457 = n4 * 889500577;
        }
        else if (-3320355304386370601L * this.field1458 > this.field1461[this.field1459 * 1512168621]) {
            this.field1456 = (int)(2560 * n / (-3320355304386370601L * this.field1458 - this.field1461[1512168621 * this.field1459])) * -1520153841;
        }
        if (this.field1456 * 1354187759 < 25) {
            this.field1456 = 650859639;
        }
        if (1354187759 * this.field1456 > 256) {
            this.field1456 = 1682640640;
            this.field1457 = (int)(n - (-3320355304386370601L * this.field1458 - this.field1461[this.field1459 * 1512168621]) / 10L) * 889500577;
        }
        if (this.field1457 * -1087246239 > n) {
            this.field1457 = 889500577 * n;
        }
        this.field1461[1512168621 * this.field1459] = -3320355304386370601L * this.field1458;
        this.field1459 = -213391579 * ((1 + 1512168621 * this.field1459) % 10);
        if (this.field1457 * -1087246239 > 1) {
            for (int i = 0; i < 10; ++i) {
                if (0L != this.field1461[i]) {
                    this.field1461[i] += this.field1457 * -1087246239;
                }
            }
        }
        if (-1087246239 * this.field1457 < n2) {
            this.field1457 = n2 * 889500577;
        }
        PlayerComposition.method1692(-1087246239 * this.field1457);
        int n5 = 0;
        while (1554226597 * this.field1460 < 256) {
            ++n5;
            this.field1460 += this.field1456 * -1933259005;
        }
        this.field1460 = (1554226597 * this.field1460 & 0xFF) * -1269169619;
        return n5;
    }
}
