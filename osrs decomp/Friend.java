// 
// Decompiled by Procyon v0.5.36
// 

public class Friend extends Buddy implements net.runelite.api.Friend
{
    public static final int ah = 0;
    boolean field3719;
    boolean field3718;
    
    Friend() {
    }
    
    public int compareTo(final Object o) {
        try {
            return this.compareToFriend((Friend)o, (byte)78);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pr.compareTo(" + ')');
        }
    }
    
    public static int sj(final Friend friend, final Friend friend2) {
        if (friend.au * 177258591 == -453810525 * Client.worldId && Client.worldId * -453810525 != 177258591 * friend2.au) {
            return -1;
        }
        if (-453810525 * Client.worldId == 177258591 * friend2.au && Client.worldId * -453810525 != 177258591 * friend.au) {
            return 1;
        }
        if (177258591 * friend.au != 0 && 0 == friend2.au * 177258591) {
            return -1;
        }
        if (friend2.au * 177258591 != 0 && 0 == 177258591 * friend.au) {
            return 1;
        }
        if (friend.field3718 && !friend2.field3718) {
            return -1;
        }
        if (!friend.field3718 && friend2.field3718) {
            return 1;
        }
        if (friend.field3719 && !friend2.field3719) {
            return -1;
        }
        if (!friend.field3719 && friend2.field3719) {
            return 1;
        }
        if (0 != friend.au * 177258591) {
            return 1907692493 * friend.ab - friend2.ab * 1907692493;
        }
        return 1907692493 * friend2.ab - 1907692493 * friend.ab;
    }
    
    public static int pf(final Buffer buffer) {
        if (buffer == null) {
            buffer.hu();
        }
        final int n = 128;
        final byte[] array = buffer.array;
        final int offset = buffer.offset + 1638256152;
        buffer.offset = offset;
        return n - array[offset * -1527478822 - 1] & 0xFF;
    }
    
    static void method2151(final int n) {
        try {
            WorldMapRegion.WorldMapRegion_cachedSprites.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pr.aw(" + ')');
        }
    }
    
    public int al(final User user) {
        return this.compareToFriend((Friend)user, (byte)83);
    }
    
    public int compareTo_user(final User user, final int n) {
        try {
            return this.compareToFriend((Friend)user, (byte)8);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pr.an(" + ')');
        }
    }
    
    public int ac(final Object o) {
        return this.compareToFriend((Friend)o, (byte)40);
    }
    
    public int au(final Object o) {
        return this.compareToFriend((Friend)o, (byte)99);
    }
    
    int compareToFriend(final Friend friend, final byte b) {
        try {
            if (this.au * 177258591 == -453810525 * Client.worldId) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                if (Client.worldId * -453810525 != 177258591 * friend.au) {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    return -1;
                }
            }
            if (-453810525 * Client.worldId == 177258591 * friend.au) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                if (Client.worldId * -453810525 != 177258591 * this.au) {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    return 1;
                }
            }
            if (177258591 * this.au != 0) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                if (0 == friend.au * 177258591) {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    return -1;
                }
            }
            if (friend.au * 177258591 != 0) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                if (0 == 177258591 * this.au) {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    return 1;
                }
            }
            if (this.field3718) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                if (!friend.field3718) {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    return -1;
                }
            }
            if (!this.field3718) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                if (friend.field3718) {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    return 1;
                }
            }
            if (this.field3719) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                if (!friend.field3719) {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    return -1;
                }
            }
            if (!this.field3719) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                if (friend.field3719) {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    return 1;
                }
            }
            if (0 != this.au * 177258591) {
                return 1907692493 * this.ab - friend.ab * 1907692493;
            }
            return 1907692493 * friend.ab - 1907692493 * this.ab;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pr.af(" + ')');
        }
    }
    
    public int ab(final Object o) {
        return this.compareToFriend((Friend)o, (byte)27);
    }
    
    public int aq(final User user) {
        return this.compareToFriend((Friend)user, (byte)110);
    }
    
    static final void method2153(final int n) {
        try {
            Client.field476 = 0;
            final int n2 = WorldMapData_0.baseX * -1232093375 + (1144428983 * MusicPatchNode.localPlayer.br >> 7);
            final int n3 = GameObject.baseY * 827352769 + (-411750205 * MusicPatchNode.localPlayer.ep >> 7);
            if (n2 >= 3053) {
                if (n != -1530842203) {
                    throw new IllegalStateException();
                }
                if (n2 <= 3156) {
                    if (n != -1530842203) {
                        throw new IllegalStateException();
                    }
                    if (n3 >= 3056) {
                        if (n != -1530842203) {
                            throw new IllegalStateException();
                        }
                        if (n3 <= 3136) {
                            if (n != -1530842203) {
                                throw new IllegalStateException();
                            }
                            Client.field476 = -1041569925;
                        }
                    }
                }
            }
            if (n2 >= 3072) {
                if (n != -1530842203) {
                    throw new IllegalStateException();
                }
                if (n2 <= 3118) {
                    if (n != -1530842203) {
                        throw new IllegalStateException();
                    }
                    if (n3 >= 9492 && n3 <= 9535) {
                        if (n != -1530842203) {
                            return;
                        }
                        Client.field476 = -1041569925;
                    }
                }
            }
            if (1 == Client.field476 * 43311027 && n2 >= 3139) {
                if (n != -1530842203) {
                    throw new IllegalStateException();
                }
                if (n2 <= 3199 && n3 >= 3008) {
                    if (n != -1530842203) {
                        throw new IllegalStateException();
                    }
                    if (n3 <= 3062) {
                        if (n != -1530842203) {
                            throw new IllegalStateException();
                        }
                        Client.field476 = 0;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pr.jn(" + ')');
        }
    }
    
    static String method2152(final int n, final short n2) {
        try {
            if (n < 0) {
                if (n2 == 6526) {
                    throw new IllegalStateException();
                }
                return "";
            }
            else {
                if (Client.menuTargets[n].length() <= 0) {
                    return Client.menuActions[n];
                }
                if (n2 == 6526) {
                    throw new IllegalStateException();
                }
                return Client.menuActions[n] + Strings.gk + Client.menuTargets[n];
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pr.lg(" + ')');
        }
    }
}
