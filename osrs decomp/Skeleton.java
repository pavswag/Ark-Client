// 
// Decompiled by Procyon v0.5.36
// 

public class Skeleton extends Node
{
    int count;
    public static final int af = 1;
    public static final int aw = 3;
    public static final int ac = 5;
    public static final int by = 2048;
    int id;
    int[] transformTypes;
    public static final int an = 2;
    class219 field2010;
    int[][] labels;
    
    public Skeleton(final int n, final byte[] array) {
        this.id = -185537285 * n;
        final Buffer buffer = new Buffer(array);
        this.count = Buffer.ra(buffer, (byte)7) * -714404747;
        this.transformTypes = new int[1158767581 * this.count];
        this.labels = new int[1158767581 * this.count][];
        for (int i = 0; i < this.count * 1158767581; ++i) {
            this.transformTypes[i] = Buffer.ra(buffer, (byte)7);
        }
        for (int j = 0; j < this.count * 1158767581; ++j) {
            this.labels[j] = new int[Buffer.ra(buffer, (byte)7)];
        }
        for (int k = 0; k < 1158767581 * this.count; ++k) {
            for (int l = 0; l < this.labels[k].length; ++l) {
                this.labels[k][l] = Buffer.ra(buffer, (byte)7);
            }
        }
        if (-1633313603 * buffer.offset < buffer.array.length) {
            final int unsignedShort = buffer.readUnsignedShort(556940689);
            if (unsignedShort > 0) {
                this.field2010 = new class219(buffer, unsignedShort);
            }
        }
    }
    
    public int[] xp() {
        return this.transformTypes;
    }
    
    public int[][] xp() {
        return this.labels;
    }
    
    public int pb() {
        return this.count * 1158767581;
    }
    
    public int aw() {
        return this.count * 1158767581;
    }
    
    public class219 method1235(final int n) {
        try {
            return this.field2010;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ik.an(" + ')');
        }
    }
    
    public class219 ac() {
        return this.field2010;
    }
    
    public static boolean nv(final UserList list, final Username username) {
        if (list == null) {
            list.ca();
        }
        final User gk = UserList.gk(list, username, (short)197);
        if (null == gk) {
            return false;
        }
        UserList.yv(list, gk, 779365628);
        return true;
    }
    
    public class219 tw() {
        return this.field2010;
    }
    
    public class219 au() {
        return this.field2010;
    }
    
    public int method1234(final int n) {
        try {
            return this.count * 1158767581;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ik.af(" + ')');
        }
    }
    
    public class219 ab() {
        return this.field2010;
    }
    
    public static class219 kz(final Skeleton skeleton, final int n) {
        if (skeleton == null) {
            skeleton.method1235(n);
        }
        try {
            return skeleton.field2010;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ik.an(" + ')');
        }
    }
}
