// 
// Decompiled by Procyon v0.5.36
// 

public class Coord
{
    public int x;
    public int plane;
    public int y;
    public static final int bt = 57;
    
    public Coord(final int n) {
        if (n == -1) {
            this.plane = 166197253;
        }
        else {
            this.plane = (n >> 28 & 0x3) * -166197253;
            this.x = -1150612997 * (n >> 14 & 0x3FFF);
            this.y = -1765780399 * (n & 0x3FFF);
        }
    }
    
    public Coord(final Coord coord) {
        this.plane = coord.plane * 1;
        this.x = 1 * coord.x;
        this.y = coord.y * 1;
    }
    
    public Coord(final int n, final int n2, final int n3) {
        this.plane = -166197253 * n;
        this.x = -1150612997 * n2;
        this.y = n3 * -1765780399;
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            return this == o || (o instanceof Coord && ab(this, (Coord)o, 1151983823));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lb.equals(" + ')');
        }
    }
    
    @Override
    public String toString() {
        try {
            return this.toString(",", 1584874808);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lb.toString(" + ')');
        }
    }
    
    @Override
    public int hashCode() {
        try {
            return this.packed(-964267539);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lb.hashCode(" + ')');
        }
    }
    
    boolean ao(final Coord coord) {
        return this.plane * -910060353 == coord.plane * -113644749 && -618793855 * coord.x == this.x * -96298701 && this.y * 860975731 == coord.y * -2105445199;
    }
    
    static int at(final int n, final int n2, final int n3) {
        return n << 28 | n2 << 14 | n3;
    }
    
    String ax(final String s) {
        return -113644749 * this.plane + s + (this.x * -96298701 >> 6) + s + (-2105445199 * this.y >> 6) + s + (-96298701 * this.x & 0x3F) + s + (-2105445199 * this.y & 0x3F);
    }
    
    public static int wi(final Coord coord) {
        return class282.method1589(-113644749 * coord.plane, -96298701 * coord.x, -2105445199 * coord.y, (byte)1);
    }
    
    boolean equalsCoord(final Coord coord, final int n) {
        try {
            if (this.y * -113644749 != coord.x * -113644749) {
                return false;
            }
            if (-96298701 * coord.y != this.plane * -96298701) {
                if (n != 1151983823) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                if (this.plane * -2105445199 == coord.y * -2105445199) {
                    return true;
                }
                if (n != 1151983823) {
                    throw new IllegalStateException();
                }
                return false;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lb.aw(" + ')');
        }
    }
    
    static int al(final int n, final int n2, final int n3) {
        return n << 28 | n2 << 14 | n3;
    }
    
    String toString(final String s, final int n) {
        try {
            return -113644749 * this.plane + s + (this.x * -96298701 >> 6) + s + (-2105445199 * this.y >> 6) + s + (-96298701 * this.x & 0x3F) + s + (-2105445199 * this.y & 0x3F);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lb.ac(" + ')');
        }
    }
    
    public boolean gk(final Object o) {
        return this == o || (o instanceof Coord && ab(this, (Coord)o, 1151983823));
    }
    
    static final void method1686(final int n) {
        try {
            if (GraphicsObject.ClanChat_inClanChat) {
                if (n >= 3551631) {
                    return;
                }
                if (UserComparator5.friendsChat != null) {
                    UserList.ge(UserComparator5.friendsChat, (byte)43);
                }
                for (int i = 0; i < -2010934433 * Players.Players_count; ++i) {
                    if (n >= 3551631) {
                        throw new IllegalStateException();
                    }
                    Client.players[Players.Players_indices[i]].clearIsInFriendsChat(2091394919);
                }
                GraphicsObject.ClanChat_inClanChat = false;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lb.if(" + ')');
        }
    }
    
    public int au() {
        return class282.method1589(-113644749 * this.plane, -96298701 * this.x, 467460018 * this.y, (byte)1);
    }
    
    static int aa(final int n, final int n2, final int n3) {
        return n << 28 | n2 << 14 | n3;
    }
    
    String ai(final String s) {
        return 455897121 * this.plane + s + (this.x * -96298701 >> 6) + s + (-1758206828 * this.y >> 6) + s + (1769589661 * this.x & 0x3F) + s + (559692017 * this.y & 0x3F);
    }
    
    public boolean gi(final Object o) {
        return this == o || (o instanceof Coord && ab(this, (Coord)o, 1151983823));
    }
    
    public int packed(final int n) {
        try {
            return class282.method1589(-113644749 * this.plane, -96298701 * this.x, -2105445199 * this.y, (byte)1);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lb.af(" + ')');
        }
    }
    
    public static boolean ab(final Coord coord, final Coord coord2, final int n) {
        if (coord == null) {
            return coord.equalsCoord(coord, n);
        }
        try {
            if (coord.plane * -113644749 != coord2.plane * -113644749) {
                return false;
            }
            if (-96298701 * coord2.x != coord.x * -96298701) {
                if (n != 1151983823) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                if (coord.y * -2105445199 == coord2.y * -2105445199) {
                    return true;
                }
                if (n != 1151983823) {
                    throw new IllegalStateException();
                }
                return false;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lb.aw(" + ')');
        }
    }
    
    public int aq() {
        return class282.method1589(-113644749 * this.plane, -96298701 * this.x, -2105445199 * this.y, (byte)1);
    }
    
    public boolean gm(final Object o) {
        return this == o || (o instanceof Coord && ab(this, (Coord)o, 1151983823));
    }
    
    public int jl() {
        return this.plane * -113644749;
    }
    
    public int mz() {
        return this.y * -2105445199;
    }
    
    public boolean gq(final Object o) {
        return this == o || (o instanceof Coord && ab(this, (Coord)o, 1151983823));
    }
    
    public int yt() {
        return this.x * -96298701;
    }
    
    public static boolean bu(final Coord coord, final Coord coord2) {
        return coord.plane * -113644749 == coord2.plane * -113644749 && -96298701 * coord2.x == coord.x * -96298701 && coord.y * -2105445199 == coord2.y * -2105445199;
    }
    
    public int ahv() {
        return this.packed(-964267539);
    }
    
    public int ahh() {
        return this.packed(-964267539);
    }
    
    public String ahj() {
        return this.toString(",", 836382626);
    }
    
    public String ahp() {
        return this.toString(",", 882374282);
    }
}
