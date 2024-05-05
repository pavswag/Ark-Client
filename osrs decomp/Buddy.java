import net.runelite.api.ChatPlayer;

// 
// Decompiled by Procyon v0.5.36
// 

public class Buddy extends User implements ChatPlayer
{
    public static final int ai = 46;
    public int int2;
    public int rank;
    public int world;
    
    Buddy() {
        this.world = 1128162401;
    }
    
    public boolean hasWorld(final int n) {
        try {
            boolean b;
            if (this.int2 * 177258591 > 0) {
                if (n >= -510154471) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pb.ba(" + ')');
        }
    }
    
    public boolean ce() {
        return this.world * -2116221302 > 0;
    }
    
    public boolean bw() {
        return this.world * -1703359628 > 0;
    }
    
    public static int hn(final Buddy buddy, final int n) {
        if (buddy == null) {
            return buddy.getWorld(n);
        }
        try {
            return buddy.world * 177258591;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pb.bq(" + ')');
        }
    }
    
    public int mf() {
        return this.rank * 1922414955;
    }
    
    void bv(final int n, final int n2) {
        this.world = n * -1128162401;
        this.int2 = 1270747397 * n2;
    }
    
    public int bp() {
        return this.world * 177258591;
    }
    
    public int bc() {
        return this.world * 177258591;
    }
    
    public int getWorld(final int n) {
        try {
            return this.rank * 177258591;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pb.bq(" + ')');
        }
    }
    
    public static boolean ro(final Buddy buddy, final int n) {
        if (buddy == null) {
            return buddy.hasWorld(n);
        }
        try {
            boolean b;
            if (buddy.world * 177258591 > 0) {
                if (n >= -510154471) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pb.ba(" + ')');
        }
    }
    
    public boolean bh() {
        return this.int2 * 177258591 > 0;
    }
    
    public static boolean im(final Buddy buddy) {
        if (buddy == null) {
            return buddy.bh();
        }
        return buddy.world * 177258591 > 0;
    }
    
    void bl(final int n, final int n2) {
        this.world = n * -1128162401;
        this.int2 = 1270747397 * n2;
    }
    
    public int getWorld() {
        return this.world * 177258591;
    }
    
    void set(final int n, final int n2, final int n3) {
        try {
            this.world = n * -1128162401;
            this.int2 = 1270747397 * n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pb.bf(" + ')');
        }
    }
}
