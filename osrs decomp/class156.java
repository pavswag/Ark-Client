// 
// Decompiled by Procyon v0.5.36
// 

public class class156
{
    static final int al = 5;
    long field1388;
    long field1389;
    static final int ac = 1;
    IterableNodeDeque field1390;
    public static final int be = 29;
    
    public class156(final Buffer buffer) {
        this.field1388 = -9024109114974923449L;
        this.field1390 = new IterableNodeDeque();
        this.method887(buffer, -1593521254);
    }
    
    void aw(final Buffer buffer) {
        this.field1389 = Buffer.ks(buffer, (byte)1) * 7340227119084236931L;
        this.field1388 = Buffer.ks(buffer, (byte)1) * 9024109114974923449L;
        for (int n = Buffer.ra(buffer, (byte)7); n; n = Buffer.ra(buffer, (byte)7)) {
            class155 class155;
            if (n != 0) {
                class155 = new class151(this);
            }
            else if (4 == n) {
                class155 = new class162(this);
            }
            else if (3 == n) {
                class155 = new class147(this);
            }
            else if (2 == n) {
                class155 = new class145(this);
            }
            else {
                if (5 != n) {
                    throw new RuntimeException("");
                }
                class155 = new class152(this);
            }
            class155.vmethod3238(buffer, -1949352075);
            this.field1390.addFirst(class155);
        }
    }
    
    public void method888(final ClanChannel clanChannel, final byte b) {
        try {
            if (this.field1389 * 5227141310100233771L == clanChannel.hr) {
                if (this.field1389 * 3503076607081773961L == clanChannel.field1399 * -3803380935026318657L) {
                    for (class155 class155 = (class155)this.field1390.last(); null != class155; class155 = (class155)this.field1390.up()) {
                        if (b >= 3) {
                            return;
                        }
                        class155.vmethod3239(clanChannel, (byte)(-49));
                    }
                    clanChannel.field1399 -= 5510785032985703105L;
                    return;
                }
                if (b >= 3) {
                    throw new IllegalStateException();
                }
            }
            throw new RuntimeException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gr.an(" + ')');
        }
    }
    
    void ac(final Buffer buffer) {
        this.field1389 = Buffer.ks(buffer, (byte)1) * 7340227119084236931L;
        this.field1388 = Buffer.ks(buffer, (byte)1) * 9024109114974923449L;
        for (int n = Buffer.ra(buffer, (byte)7); n; n = Buffer.ra(buffer, (byte)7)) {
            class155 class155;
            if (n != 0) {
                class155 = new class151(this);
            }
            else if (4 == n) {
                class155 = new class162(this);
            }
            else if (3 == n) {
                class155 = new class147(this);
            }
            else if (2 == n) {
                class155 = new class145(this);
            }
            else {
                if (5 != n) {
                    throw new RuntimeException("");
                }
                class155 = new class152(this);
            }
            class155.vmethod3238(buffer, -1949352075);
            this.field1390.addFirst(class155);
        }
    }
    
    public void au(final ClanChannel clanChannel) {
        if (this.field1389 * 5227141310100233771L == clanChannel.hr && this.field1388 * 3503076607081773961L == clanChannel.field1399 * -3803380935026318657L) {
            for (class155 class155 = (class155)this.field1390.up(); null != class155; class155 = (class155)this.field1390.by()) {
                class155.vmethod3239(clanChannel, (byte)26);
            }
            clanChannel.field1399 -= 5510785032985703105L;
            return;
        }
        throw new RuntimeException("");
    }
    
    public static void ny(final class156 class156, final ClanChannel clanChannel, final byte b) {
        if (class156 == null) {
            class156.method888(clanChannel, b);
        }
        try {
            if (class156.field1389 * 5227141310100233771L == clanChannel.hr) {
                if (class156.field1388 * 3503076607081773961L == clanChannel.field1399 * -3803380935026318657L) {
                    for (class155 class157 = (class155)class156.field1390.up(); null != class157; class157 = (class155)class156.field1390.by()) {
                        if (b >= 3) {
                            return;
                        }
                        class157.vmethod3239(clanChannel, (byte)(-49));
                    }
                    clanChannel.field1399 -= 5510785032985703105L;
                    return;
                }
                if (b >= 3) {
                    throw new IllegalStateException();
                }
            }
            throw new RuntimeException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gr.an(" + ')');
        }
    }
    
    void method887(final Buffer buffer, final int n) {
        try {
            this.field1389 = Buffer.ks(buffer, (byte)1) * 7340227119084236931L;
            this.field1388 = Buffer.ks(buffer, (byte)1) * 9024109114974923449L;
            for (int n2 = Buffer.ra(buffer, (byte)7); n2; n2 = Buffer.ra(buffer, (byte)7)) {
                class155 class155;
                if (n2 != 0) {
                    if (n >= 65280) {
                        throw new IllegalStateException();
                    }
                    class155 = new class151(this);
                }
                else if (4 == n2) {
                    if (n >= 65280) {
                        return;
                    }
                    class155 = new class162(this);
                }
                else if (3 == n2) {
                    class155 = new class147(this);
                }
                else if (2 == n2) {
                    if (n >= 65280) {
                        throw new IllegalStateException();
                    }
                    class155 = new class145(this);
                }
                else {
                    if (5 != n2) {
                        throw new RuntimeException("");
                    }
                    class155 = new class152(this);
                }
                class155.vmethod3238(buffer, -1949352075);
                this.field1390.addFirst(class155);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gr.af(" + ')');
        }
    }
    
    public void ab(final ClanChannel clanChannel) {
        if (this.field1389 * 5227141310100233771L == clanChannel.hr && this.field1388 * 3503076607081773961L == clanChannel.field1399 * -3803380935026318657L) {
            for (class155 class155 = (class155)this.field1390.up(); null != class155; class155 = (class155)this.field1390.by()) {
                class155.vmethod3239(clanChannel, (byte)(-86));
            }
            clanChannel.field1399 -= 5510785032985703105L;
            return;
        }
        throw new RuntimeException("");
    }
    
    static void addCancelMenuEntry(final int n) {
        try {
            Client.menuOptionsCount = 0;
            Client.un(-1);
            Client.isMenuOpen = false;
            Client.menuActions[0] = Strings.jl;
            Client.menuTargets[0] = "";
            Client.menuOpcodes[0] = 1006;
            Client.menuShiftClick[0] = false;
            Client.menuOptionsCount = 1153055221;
            Client.un(-1);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gr.kw(" + ')');
        }
    }
}
