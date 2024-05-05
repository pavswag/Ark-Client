// 
// Decompiled by Procyon v0.5.36
// 

public class IgnoreList extends UserList
{
    final LoginType field3706;
    static final int af = 400;
    static final int aw = 1;
    static final int ac = 4;
    public static final int an = 100;
    
    public IgnoreList(final LoginType field3706) {
        super(400);
        this.field3706 = field3706;
    }
    
    public void ao(final Buffer buffer, final int n) {
        while (-934915113 * buffer.offset < n) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (4 == ra) {
                final Username username = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.field3706);
                if (!username.hasCleanName(446870485)) {
                    throw new IllegalStateException();
                }
                World.friendSystem.removeIgnore(username.getName(-710264960), false, (byte)(-1));
            }
            else {
                final boolean b = 0x0 != (ra & 0x1);
                final Username username2 = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.field3706);
                final Username username3 = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.field3706);
                buffer.readStringCp1252NullTerminated((byte)0);
                if (!username2.hasCleanName(-884327148)) {
                    throw new IllegalStateException();
                }
                Ignored ignored = (Ignored)UserList.gk(this, username2, (short)197);
                if (b) {
                    final Ignored ignored2 = (Ignored)UserList.gk(this, username3, (short)197);
                    if (null != ignored2 && ignored2 != ignored) {
                        if (null != ignored) {
                            UserList.yv(this, ignored2, 1766887167);
                        }
                        else {
                            ignored = ignored2;
                        }
                    }
                }
                if (null != ignored) {
                    this.bv((User)ignored, username2, username3, 1466944342);
                }
                else {
                    if (this.bm(-974910963) >= -1573695201) {
                        continue;
                    }
                    ((Ignored)UserList.fm(this, username2, username3, (byte)(-114))).id = this.bm(-1308374091) * -1027271011;
                }
            }
        }
    }
    
    @Override
    User[] at(final int n) {
        return new Ignored[n];
    }
    
    public void ay(final Buffer buffer, final int n) {
        while (1395349363 * buffer.offset < n) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (4 == ra) {
                final Username username = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.field3706);
                if (!username.hasCleanName(-516854444)) {
                    throw new IllegalStateException();
                }
                World.friendSystem.removeIgnore(username.getName(-710264960), false, (byte)(-47));
            }
            else {
                final boolean b = 0x0 != (ra & 0x1);
                final Username username2 = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.field3706);
                final Username username3 = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.field3706);
                buffer.readStringCp1252NullTerminated((byte)0);
                if (!username2.hasCleanName(-1770255546)) {
                    throw new IllegalStateException();
                }
                Ignored ignored = (Ignored)UserList.gk(this, username2, (short)197);
                if (b) {
                    final Ignored ignored2 = (Ignored)UserList.gk(this, username3, (short)197);
                    if (null != ignored2 && ignored2 != ignored) {
                        if (null != ignored) {
                            UserList.yv(this, ignored2, -786160602);
                        }
                        else {
                            ignored = ignored2;
                        }
                    }
                }
                if (null != ignored) {
                    this.bv((User)ignored, username2, username3, 1667433811);
                }
                else {
                    if (this.bm(1647181808) >= 400) {
                        continue;
                    }
                    ((Ignored)UserList.fm(this, username2, username3, (byte)(-67))).id = this.bm(-1751830926) * -226167572;
                }
            }
        }
    }
    
    public void read(final Buffer buffer, final int n, final int n2) {
        try {
            while (-1633313603 * buffer.offset < n) {
                if (n2 >= -554119792) {
                    throw new IllegalStateException();
                }
                final int ra = Buffer.ra(buffer, (byte)7);
                if (4 == ra) {
                    if (n2 >= -554119792) {
                        throw new IllegalStateException();
                    }
                    final Username username = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.field3706);
                    if (!username.hasCleanName(-1688194993)) {
                        if (n2 >= -554119792) {
                            throw new IllegalStateException();
                        }
                        throw new IllegalStateException();
                    }
                    else {
                        World.friendSystem.removeIgnore(username.getName(-710264960), false, (byte)(-43));
                    }
                }
                else {
                    final boolean b = 0x0 != (ra & 0x1);
                    final Username username2 = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.field3706);
                    final Username username3 = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.field3706);
                    buffer.readStringCp1252NullTerminated((byte)0);
                    if (!username2.hasCleanName(-1560745560)) {
                        if (n2 >= -554119792) {
                            return;
                        }
                        throw new IllegalStateException();
                    }
                    else {
                        Ignored ignored = (Ignored)UserList.gk(this, username2, (short)197);
                        if (b) {
                            if (n2 >= -554119792) {
                                throw new IllegalStateException();
                            }
                            final Ignored ignored2 = (Ignored)UserList.gk(this, username3, (short)197);
                            if (null != ignored2) {
                                if (n2 >= -554119792) {
                                    throw new IllegalStateException();
                                }
                                if (ignored2 != ignored) {
                                    if (n2 >= -554119792) {
                                        throw new IllegalStateException();
                                    }
                                    if (null != ignored) {
                                        if (n2 >= -554119792) {
                                            return;
                                        }
                                        UserList.yv(this, ignored2, -1811641406);
                                    }
                                    else {
                                        ignored = ignored2;
                                    }
                                }
                            }
                        }
                        if (null != ignored) {
                            if (n2 >= -554119792) {
                                throw new IllegalStateException();
                            }
                            this.bv((User)ignored, username2, username3, -992785057);
                        }
                        else {
                            if (this.bm(1008276896) >= 400) {
                                continue;
                            }
                            if (n2 >= -554119792) {
                                throw new IllegalStateException();
                            }
                            ((Ignored)UserList.fm(this, username2, username3, (byte)(-111))).id = this.bm(-352107243) * -450340677;
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pu.aw(" + ')');
        }
    }
    
    @Override
    User[] al(final int n) {
        return new Ignored[n];
    }
    
    @Override
    User[] newTypedArray(final int n, final int n2) {
        try {
            return new Ignored[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pu.an(" + ')');
        }
    }
    
    @Override
    User ac() {
        return new Ignored();
    }
    
    @Override
    User au() {
        return new Ignored();
    }
    
    @Override
    User[] aa(final int n) {
        return new Ignored[n];
    }
    
    @Override
    User newInstance(final int n) {
        try {
            return new Ignored();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pu.af(" + ')');
        }
    }
    
    @Override
    User ab() {
        return new Ignored();
    }
    
    @Override
    User[] aq(final int n) {
        return new Ignored[n];
    }
}
