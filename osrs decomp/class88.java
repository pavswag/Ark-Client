// 
// Decompiled by Procyon v0.5.36
// 

public class class88
{
    static final int ru = 503;
    static final int an = 104;
    static final int ac = 100;
    static final int af = 4;
    static final int ag = 4;
    
    class88() throws Throwable {
        throw new Error();
    }
    
    static final boolean method522(final int n, final int n2, final RouteStrategy routeStrategy, final CollisionMap collisionMap, final int n3) {
        try {
            int n4 = n;
            int n5 = n2;
            final int n6 = 64;
            final int n7 = 64;
            final int n8 = n - n6;
            final int n9 = n2 - n7;
            class211.directions[n6][n7] = 99;
            class211.distances[n6][n7] = 0;
            int n10 = 0;
            int i = 0;
            class211.bufferX[n10] = n4;
            class211.bufferY[n10++] = n5;
            final int[][] flags = collisionMap.flags;
            while (i != n10) {
                n4 = class211.bufferX[i];
                n5 = class211.bufferY[i];
                i = (i + 1 & 0xFFF);
                final int n11 = n4 - n8;
                final int n12 = n5 - n9;
                final int n13 = n4 - collisionMap.xInset * 1724654229;
                final int n14 = n5 - -216630539 * collisionMap.yInset;
                if (routeStrategy.hasArrived(1, n4, n5, collisionMap, 291892190)) {
                    if (n3 != 1568495332) {
                        throw new IllegalStateException();
                    }
                    class18.field56 = n4 * -617213805;
                    class397.field3691 = 1169106949 * n5;
                    return true;
                }
                else {
                    final int n15 = 1 + class211.distances[n11][n12];
                    if (n11 > 0) {
                        if (n3 != 1568495332) {
                            throw new IllegalStateException();
                        }
                        if (class211.directions[n11 - 1][n12] == 0 && 0x0 == (flags[n13 - 1][n14] & 0x1240108)) {
                            if (n3 != 1568495332) {
                                throw new IllegalStateException();
                            }
                            class211.bufferX[n10] = n4 - 1;
                            class211.bufferY[n10] = n5;
                            n10 = (1 + n10 & 0xFFF);
                            class211.directions[n11 - 1][n12] = 2;
                            class211.distances[n11 - 1][n12] = n15;
                        }
                    }
                    if (n11 < 127) {
                        if (n3 != 1568495332) {
                            throw new IllegalStateException();
                        }
                        if (0 == class211.directions[1 + n11][n12]) {
                            if (n3 != 1568495332) {
                                throw new IllegalStateException();
                            }
                            if (0x0 == (flags[1 + n13][n14] & 0x1240180)) {
                                if (n3 != 1568495332) {
                                    throw new IllegalStateException();
                                }
                                class211.bufferX[n10] = n4 + 1;
                                class211.bufferY[n10] = n5;
                                n10 = (1 + n10 & 0xFFF);
                                class211.directions[1 + n11][n12] = 8;
                                class211.distances[n11 + 1][n12] = n15;
                            }
                        }
                    }
                    if (n12 > 0) {
                        if (n3 != 1568495332) {
                            throw new IllegalStateException();
                        }
                        if (class211.directions[n11][n12 - 1] == 0) {
                            if (n3 != 1568495332) {
                                throw new IllegalStateException();
                            }
                            if (0x0 == (flags[n13][n14 - 1] & 0x1240102)) {
                                if (n3 != 1568495332) {
                                    throw new IllegalStateException();
                                }
                                class211.bufferX[n10] = n4;
                                class211.bufferY[n10] = n5 - 1;
                                n10 = (n10 + 1 & 0xFFF);
                                class211.directions[n11][n12 - 1] = 1;
                                class211.distances[n11][n12 - 1] = n15;
                            }
                        }
                    }
                    if (n12 < 127) {
                        if (n3 != 1568495332) {
                            throw new IllegalStateException();
                        }
                        if (0 == class211.directions[n11][1 + n12]) {
                            if (n3 != 1568495332) {
                                throw new IllegalStateException();
                            }
                            if (0x0 == (flags[n13][n14 + 1] & 0x1240120)) {
                                class211.bufferX[n10] = n4;
                                class211.bufferY[n10] = n5 + 1;
                                n10 = (1 + n10 & 0xFFF);
                                class211.directions[n11][1 + n12] = 4;
                                class211.distances[n11][1 + n12] = n15;
                            }
                        }
                    }
                    if (n11 > 0) {
                        if (n3 != 1568495332) {
                            throw new IllegalStateException();
                        }
                        if (n12 > 0) {
                            if (n3 != 1568495332) {
                                throw new IllegalStateException();
                            }
                            if (0 == class211.directions[n11 - 1][n12 - 1]) {
                                if (n3 != 1568495332) {
                                    throw new IllegalStateException();
                                }
                                if ((flags[n13 - 1][n14 - 1] & 0x124010E) == 0x0) {
                                    if (n3 != 1568495332) {
                                        throw new IllegalStateException();
                                    }
                                    if ((flags[n13 - 1][n14] & 0x1240108) == 0x0) {
                                        if (n3 != 1568495332) {
                                            throw new IllegalStateException();
                                        }
                                        if ((flags[n13][n14 - 1] & 0x1240102) == 0x0) {
                                            if (n3 != 1568495332) {
                                                throw new IllegalStateException();
                                            }
                                            class211.bufferX[n10] = n4 - 1;
                                            class211.bufferY[n10] = n5 - 1;
                                            n10 = (n10 + 1 & 0xFFF);
                                            class211.directions[n11 - 1][n12 - 1] = 3;
                                            class211.distances[n11 - 1][n12 - 1] = n15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (n11 < 127) {
                        if (n3 != 1568495332) {
                            throw new IllegalStateException();
                        }
                        if (n12 > 0) {
                            if (n3 != 1568495332) {
                                throw new IllegalStateException();
                            }
                            if (class211.directions[1 + n11][n12 - 1] == 0) {
                                if (n3 != 1568495332) {
                                    throw new IllegalStateException();
                                }
                                if (0x0 == (flags[n13 + 1][n14 - 1] & 0x1240183) && (flags[n13 + 1][n14] & 0x1240180) == 0x0) {
                                    if (n3 != 1568495332) {
                                        throw new IllegalStateException();
                                    }
                                    if ((flags[n13][n14 - 1] & 0x1240102) == 0x0) {
                                        if (n3 != 1568495332) {
                                            throw new IllegalStateException();
                                        }
                                        class211.bufferX[n10] = 1 + n4;
                                        class211.bufferY[n10] = n5 - 1;
                                        n10 = (1 + n10 & 0xFFF);
                                        class211.directions[1 + n11][n12 - 1] = 9;
                                        class211.distances[1 + n11][n12 - 1] = n15;
                                    }
                                }
                            }
                        }
                    }
                    if (n11 > 0) {
                        if (n3 != 1568495332) {
                            throw new IllegalStateException();
                        }
                        if (n12 < 127) {
                            if (n3 != 1568495332) {
                                throw new IllegalStateException();
                            }
                            if (0 == class211.directions[n11 - 1][1 + n12]) {
                                if (n3 != 1568495332) {
                                    throw new IllegalStateException();
                                }
                                if ((flags[n13 - 1][n14 + 1] & 0x1240138) == 0x0) {
                                    if (n3 != 1568495332) {
                                        throw new IllegalStateException();
                                    }
                                    if ((flags[n13 - 1][n14] & 0x1240108) == 0x0) {
                                        if (n3 != 1568495332) {
                                            throw new IllegalStateException();
                                        }
                                        if ((flags[n13][n14 + 1] & 0x1240120) == 0x0) {
                                            class211.bufferX[n10] = n4 - 1;
                                            class211.bufferY[n10] = 1 + n5;
                                            n10 = (n10 + 1 & 0xFFF);
                                            class211.directions[n11 - 1][n12 + 1] = 6;
                                            class211.distances[n11 - 1][1 + n12] = n15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (n11 >= 127) {
                        continue;
                    }
                    if (n3 != 1568495332) {
                        throw new IllegalStateException();
                    }
                    if (n12 >= 127) {
                        continue;
                    }
                    if (n3 != 1568495332) {
                        throw new IllegalStateException();
                    }
                    if (class211.directions[n11 + 1][n12 + 1] != 0) {
                        continue;
                    }
                    if (n3 != 1568495332) {
                        throw new IllegalStateException();
                    }
                    if (0x0 != (flags[n13 + 1][n14 + 1] & 0x12401E0)) {
                        continue;
                    }
                    if (n3 != 1568495332) {
                        throw new IllegalStateException();
                    }
                    if ((flags[1 + n13][n14] & 0x1240180) != 0x0) {
                        continue;
                    }
                    if (n3 != 1568495332) {
                        throw new IllegalStateException();
                    }
                    if (0x0 != (flags[n13][n14 + 1] & 0x1240120)) {
                        continue;
                    }
                    if (n3 != 1568495332) {
                        throw new IllegalStateException();
                    }
                    class211.bufferX[n10] = 1 + n4;
                    class211.bufferY[n10] = n5 + 1;
                    n10 = (1 + n10 & 0xFFF);
                    class211.directions[n11 + 1][1 + n12] = 12;
                    class211.distances[n11 + 1][1 + n12] = n15;
                }
            }
            class18.field56 = -617213805 * n4;
            class397.field3691 = n5 * 1169106949;
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dz.an(" + ')');
        }
    }
    
    static WorldMap getWorldMap(final int n) {
        try {
            return class126.worldMap;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dz.gb(" + ')');
        }
    }
    
    public static String oq(final class18 class18) {
        return class18.field57;
    }
    
    public static int vv(final GrandExchangeOfferAgeComparator grandExchangeOfferAgeComparator, final Object o, final Object o2) {
        if (grandExchangeOfferAgeComparator == null) {
            return grandExchangeOfferAgeComparator.al(o, o);
        }
        return grandExchangeOfferAgeComparator.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)46);
    }
}
