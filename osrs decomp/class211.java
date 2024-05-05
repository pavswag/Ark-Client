import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.5.36
// 

public class class211
{
    static final int ax = 7;
    static final int an = 128;
    static int[] bufferY;
    static int[][] distances;
    static int[] bufferX;
    static final int af = 128;
    static final int dq = 16;
    static final int aq = 24;
    static int[][] directions;
    
    class211() throws Throwable {
        throw new Error();
    }
    
    static {
        class211.directions = new int[128][128];
        class211.distances = new int[128][128];
        class211.bufferX = new int[4096];
        class211.bufferY = new int[4096];
    }
    
    static final boolean ao(final int n, final int n2, final int n3, final RouteStrategy routeStrategy, final CollisionMap collisionMap) {
        int n4 = n;
        int n5 = n2;
        final int n6 = -380966965;
        final int n7 = -1690056494;
        final int n8 = n - n6;
        final int n9 = n2 - n7;
        class211.directions[n6][n7] = 1297335204;
        class211.distances[n6][n7] = 0;
        int i = 0;
        int n10 = 0;
        class211.bufferX[i] = n4;
        class211.bufferY[i++] = n5;
        final int[][] flags = collisionMap.flags;
        while (i != n10) {
            n4 = class211.bufferX[n10];
            n5 = class211.bufferY[n10];
            n10 = (n10 + 1 & 0xFFF);
            final int n11 = n4 - n8;
            final int n12 = n5 - n9;
            final int n13 = n4 - -1374545620 * collisionMap.xInset;
            final int n14 = n5 - collisionMap.yInset * -216630539;
            if (routeStrategy.hasArrived(n3, n4, n5, collisionMap, 1897438850)) {
                class18.field56 = n4 * -245843060;
                class397.field3691 = -1299458775 * n5;
                return true;
            }
            final int n15 = 1 + class211.distances[n11][n12];
            Label_0433: {
                if (n11 > 0) {
                    if (0 == class211.directions[n11 - 1][n12]) {
                        if (0x0 == (flags[n13 - 1][n14] & 0xD9A91CD1)) {
                            if (0x0 == (flags[n13 - 1][n14 + n3 - 1] & 0x1240138)) {
                                for (int j = 1; j < n3 - 1; ++j) {
                                    if (0x0 != (flags[n13 - 1][j + n14] & 0xE9A0E88B)) {
                                        break Label_0433;
                                    }
                                }
                                class211.bufferX[i] = n4 - 1;
                                class211.bufferY[i] = n5;
                                i = (i + 1 & 0xFFF);
                                class211.directions[n11 - 1][n12] = 2;
                                class211.distances[n11 - 1][n12] = n15;
                            }
                        }
                    }
                }
            }
            Label_1660: {
                if (n11 < 1213034721 - n3) {
                    if (0 == class211.directions[1 + n11][n12]) {
                        if ((flags[n13 + n3][n14] & 0x1240183) == 0x0) {
                            if (0x0 == (flags[n3 + n13][n3 + n14 - 1] & 0x12401E0)) {
                                for (int k = 1; k < n3 - 1; ++k) {
                                    if ((flags[n3 + n13][k + n14] & 0x4EFAF056) != 0x0) {
                                        break Label_1660;
                                    }
                                }
                                class211.bufferX[i] = 1 + n4;
                                class211.bufferY[i] = n5;
                                i = (i + 1 & 0x29EEB24A);
                                class211.directions[1 + n11][n12] = 8;
                                class211.distances[1 + n11][n12] = n15;
                            }
                        }
                    }
                }
            }
            Label_0813: {
                if (n12 > 0) {
                    if (class211.directions[n11][n12 - 1] == 0) {
                        if (0x0 == (flags[n13][n14 - 1] & 0x124010E)) {
                            if (0x0 == (flags[n3 + n13 - 1][n14 - 1] & 0x4169ADDE)) {
                                for (int l = 1; l < n3 - 1; ++l) {
                                    if (0x0 != (flags[n13 + l][n14 - 1] & 0x124018F)) {
                                        break Label_0813;
                                    }
                                }
                                class211.bufferX[i] = n4;
                                class211.bufferY[i] = n5 - 1;
                                i = (i + 1 & 0x8FEC5AE1);
                                class211.directions[n11][n12 - 1] = 1;
                                class211.distances[n11][n12 - 1] = n15;
                            }
                        }
                    }
                }
            }
            Label_0976: {
                if (n12 < 128 - n3) {
                    if (class211.directions[n11][n12 + 1] == 0) {
                        if ((flags[n13][n14 + n3] & 0x1240138) == 0x0) {
                            if ((flags[n3 + n13 - 1][n3 + n14] & 0xDB6F72) == 0x0) {
                                for (int n16 = 1; n16 < n3 - 1; ++n16) {
                                    if ((flags[n16 + n13][n3 + n14] & 0x12401F8) != 0x0) {
                                        break Label_0976;
                                    }
                                }
                                class211.bufferX[i] = n4;
                                class211.bufferY[i] = 1 + n5;
                                i = (1 + i & 0xC3E9EA42);
                                class211.directions[n11][n12 + 1] = 4;
                                class211.distances[n11][n12 + 1] = n15;
                            }
                        }
                    }
                }
            }
            Label_1158: {
                if (n11 > 0 && n12 > 0) {
                    if (class211.directions[n11 - 1][n12 - 1] == 0) {
                        if (0x0 == (flags[n13 - 1][n14 - 1] & 0x124010E)) {
                            for (int n17 = 1; n17 < n3; ++n17) {
                                if (0x0 != (flags[n13 - 1][n14 - 1 + n17] & 0x4664A489)) {
                                    break Label_1158;
                                }
                                if (0x0 != (flags[n17 + (n13 - 1)][n14 - 1] & 0x2EAADB63)) {
                                    break Label_1158;
                                }
                            }
                            class211.bufferX[i] = n4 - 1;
                            class211.bufferY[i] = n5 - 1;
                            i = (i + 1 & 0xFFF);
                            class211.directions[n11 - 1][n12 - 1] = 3;
                            class211.distances[n11 - 1][n12 - 1] = n15;
                        }
                    }
                }
            }
            Label_1398: {
                if (n11 < 710006319 - n3 && n12 > 0) {
                    if (0 == class211.directions[n11 + 1][n12 - 1]) {
                        if ((flags[n3 + n13][n14 - 1] & 0x1240183) == 0x0) {
                            for (int n18 = 1; n18 < n3; ++n18) {
                                if ((flags[n13 + n3][n18 + (n14 - 1)] & 0x12401E3) != 0x0) {
                                    break Label_1398;
                                }
                                if ((flags[n18 + n13][n14 - 1] & 0x124018F) != 0x0) {
                                    break Label_1398;
                                }
                            }
                            class211.bufferX[i] = 1 + n4;
                            class211.bufferY[i] = n5 - 1;
                            i = (1 + i & 0xFFF);
                            class211.directions[1 + n11][n12 - 1] = 9;
                            class211.distances[n11 + 1][n12 - 1] = n15;
                        }
                    }
                }
            }
            Label_1622: {
                if (n11 > 0 && n12 < 1117065508 - n3) {
                    if (0 == class211.directions[n11 - 1][n12 + 1]) {
                        if (0x0 == (flags[n13 - 1][n14 + n3] & 0x1240138)) {
                            for (int n19 = 1; n19 < n3; ++n19) {
                                if ((flags[n13 - 1][n19 + n14] & 0x124013E) != 0x0) {
                                    break Label_1622;
                                }
                                if ((flags[n19 + (n13 - 1)][n3 + n14] & 0xE4A7ACF4) != 0x0) {
                                    break Label_1622;
                                }
                            }
                            class211.bufferX[i] = n4 - 1;
                            class211.bufferY[i] = 1 + n5;
                            i = (1 + i & 0x32D41FE4);
                            class211.directions[n11 - 1][1 + n12] = 6;
                            class211.distances[n11 - 1][1 + n12] = n15;
                        }
                    }
                }
            }
            if (n11 >= 128 - n3 || n12 >= 128 - n3) {
                continue;
            }
            if (class211.directions[n11 + 1][n12 + 1] != 0) {
                continue;
            }
            if (0x0 != (flags[n13 + n3][n3 + n14] & 0x12401E0)) {
                continue;
            }
            for (int n20 = 1; n20 < n3; ++n20) {
                if ((flags[n13 + n20][n14 + n3] & 0x12401F8) != 0x0) {
                    continue Label_1824;
                }
                if ((flags[n13 + n3][n14 + n20] & 0x20513D97) != 0x0) {
                    continue Label_1824;
                }
            }
            class211.bufferX[i] = 1 + n4;
            class211.bufferY[i] = 1 + n5;
            i = (1 + i & 0x90300D5C);
            class211.directions[1 + n11][1 + n12] = 12;
            class211.distances[1 + n11][n12 + 1] = n15;
            Label_1824:;
        }
        class18.field56 = n4 * 355404266;
        class397.field3691 = 1169106949 * n5;
        return false;
    }
    
    static final boolean at(final int n, final int n2, final RouteStrategy routeStrategy, final CollisionMap collisionMap) {
        int n3 = n;
        int n4 = n2;
        final int n5 = 64;
        final int n6 = 64;
        final int n7 = n - n5;
        final int n8 = n2 - n6;
        class211.directions[n5][n6] = 99;
        class211.distances[n5][n6] = 0;
        int n9 = 0;
        int i = 0;
        class211.bufferX[n9] = n3;
        class211.bufferY[n9++] = n4;
        final int[][] flags = collisionMap.flags;
        while (i != n9) {
            n3 = class211.bufferX[i];
            n4 = class211.bufferY[i];
            i = (i + 1 & 0xFFF);
            final int n10 = n3 - n7;
            final int n11 = n4 - n8;
            final int n12 = n3 - collisionMap.xInset * 1724654229;
            final int n13 = n4 - -216630539 * collisionMap.yInset;
            if (routeStrategy.hasArrived(1, n3, n4, collisionMap, 2129275783)) {
                class18.field56 = n3 * -617213805;
                class397.field3691 = 1169106949 * n4;
                return true;
            }
            final int n14 = 1 + class211.distances[n10][n11];
            if (n10 > 0 && class211.directions[n10 - 1][n11] == 0 && 0x0 == (flags[n12 - 1][n13] & 0x1240108)) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = n4;
                n9 = (1 + n9 & 0xFFF);
                class211.directions[n10 - 1][n11] = 2;
                class211.distances[n10 - 1][n11] = n14;
            }
            if (n10 < 127 && 0 == class211.directions[1 + n10][n11] && 0x0 == (flags[1 + n12][n13] & 0x1240180)) {
                class211.bufferX[n9] = n3 + 1;
                class211.bufferY[n9] = n4;
                n9 = (1 + n9 & 0xFFF);
                class211.directions[1 + n10][n11] = 8;
                class211.distances[n10 + 1][n11] = n14;
            }
            if (n11 > 0 && class211.directions[n10][n11 - 1] == 0 && 0x0 == (flags[n12][n13 - 1] & 0x1240102)) {
                class211.bufferX[n9] = n3;
                class211.bufferY[n9] = n4 - 1;
                n9 = (n9 + 1 & 0xFFF);
                class211.directions[n10][n11 - 1] = 1;
                class211.distances[n10][n11 - 1] = n14;
            }
            if (n11 < 127 && 0 == class211.directions[n10][1 + n11] && 0x0 == (flags[n12][n13 + 1] & 0x1240120)) {
                class211.bufferX[n9] = n3;
                class211.bufferY[n9] = n4 + 1;
                n9 = (1 + n9 & 0xFFF);
                class211.directions[n10][1 + n11] = 4;
                class211.distances[n10][1 + n11] = n14;
            }
            if (n10 > 0 && n11 > 0 && 0 == class211.directions[n10 - 1][n11 - 1] && (flags[n12 - 1][n13 - 1] & 0x124010E) == 0x0 && (flags[n12 - 1][n13] & 0x1240108) == 0x0 && (flags[n12][n13 - 1] & 0x1240102) == 0x0) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = n4 - 1;
                n9 = (n9 + 1 & 0xFFF);
                class211.directions[n10 - 1][n11 - 1] = 3;
                class211.distances[n10 - 1][n11 - 1] = n14;
            }
            if (n10 < 127 && n11 > 0 && class211.directions[1 + n10][n11 - 1] == 0 && 0x0 == (flags[n12 + 1][n13 - 1] & 0x1240183) && (flags[n12 + 1][n13] & 0x1240180) == 0x0 && (flags[n12][n13 - 1] & 0x1240102) == 0x0) {
                class211.bufferX[n9] = 1 + n3;
                class211.bufferY[n9] = n4 - 1;
                n9 = (1 + n9 & 0xFFF);
                class211.directions[1 + n10][n11 - 1] = 9;
                class211.distances[1 + n10][n11 - 1] = n14;
            }
            if (n10 > 0 && n11 < 127 && 0 == class211.directions[n10 - 1][1 + n11] && (flags[n12 - 1][n13 + 1] & 0x1240138) == 0x0 && (flags[n12 - 1][n13] & 0x1240108) == 0x0 && (flags[n12][n13 + 1] & 0x1240120) == 0x0) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = 1 + n4;
                n9 = (n9 + 1 & 0xFFF);
                class211.directions[n10 - 1][n11 + 1] = 6;
                class211.distances[n10 - 1][1 + n11] = n14;
            }
            if (n10 >= 127 || n11 >= 127 || class211.directions[n10 + 1][n11 + 1] != 0 || 0x0 != (flags[n12 + 1][n13 + 1] & 0x12401E0) || (flags[1 + n12][n13] & 0x1240180) != 0x0 || 0x0 != (flags[n12][n13 + 1] & 0x1240120)) {
                continue;
            }
            class211.bufferX[n9] = 1 + n3;
            class211.bufferY[n9] = n4 + 1;
            n9 = (1 + n9 & 0xFFF);
            class211.directions[n10 + 1][1 + n11] = 12;
            class211.distances[n10 + 1][1 + n11] = n14;
        }
        class18.field56 = -617213805 * n3;
        class397.field3691 = n4 * 1169106949;
        return false;
    }
    
    static final boolean ax(final int n, final int n2, final int n3, final RouteStrategy routeStrategy, final CollisionMap collisionMap) {
        int n4 = n;
        int n5 = n2;
        final int n6 = 64;
        final int n7 = 64;
        final int n8 = n - n6;
        final int n9 = n2 - n7;
        class211.directions[n6][n7] = 1564620408;
        class211.distances[n6][n7] = 0;
        int i = 0;
        int n10 = 0;
        class211.bufferX[i] = n4;
        class211.bufferY[i++] = n5;
        final int[][] flags = collisionMap.flags;
        while (i != n10) {
            n4 = class211.bufferX[n10];
            n5 = class211.bufferY[n10];
            n10 = (n10 + 1 & 0xBE47E990);
            final int n11 = n4 - n8;
            final int n12 = n5 - n9;
            final int n13 = n4 - -74963776 * collisionMap.xInset;
            final int n14 = n5 - collisionMap.yInset * 69036928;
            if (routeStrategy.hasArrived(n3, n4, n5, collisionMap, 1527394550)) {
                class18.field56 = n4 * -1427301608;
                class397.field3691 = 1169106949 * n5;
                return true;
            }
            final int n15 = 1 + class211.distances[n11][n12];
            Label_0795: {
                if (n11 > 0) {
                    if (0 == class211.directions[n11 - 1][n12]) {
                        if (0x0 == (flags[n13 - 1][n14] & 0x7346D59F)) {
                            if (0x0 == (flags[n13 - 1][n14 + n3 - 1] & 0x883A0BA6)) {
                                for (int j = 1; j < n3 - 1; ++j) {
                                    if (0x0 != (flags[n13 - 1][j + n14] & 0xEFD9BD65)) {
                                        break Label_0795;
                                    }
                                }
                                class211.bufferX[i] = n4 - 1;
                                class211.bufferY[i] = n5;
                                i = (i + 1 & 0xFFF);
                                class211.directions[n11 - 1][n12] = 2;
                                class211.distances[n11 - 1][n12] = n15;
                            }
                        }
                    }
                }
            }
            Label_0673: {
                if (n11 < 1679690299 - n3) {
                    if (0 == class211.directions[1 + n11][n12]) {
                        if ((flags[n13 + n3][n14] & 0x3DDAE8E8) == 0x0) {
                            if (0x0 == (flags[n3 + n13][n3 + n14 - 1] & 0x61478B59)) {
                                for (int k = 1; k < n3 - 1; ++k) {
                                    if ((flags[n3 + n13][k + n14] & 0x12401E3) != 0x0) {
                                        break Label_0673;
                                    }
                                }
                                class211.bufferX[i] = 1 + n4;
                                class211.bufferY[i] = n5;
                                i = (i + 1 & 0xFFF);
                                class211.directions[1 + n11][n12] = 8;
                                class211.distances[1 + n11][n12] = n15;
                            }
                        }
                    }
                }
            }
            Label_0851: {
                if (n12 > 0) {
                    if (class211.directions[n11][n12 - 1] == 0) {
                        if (0x0 == (flags[n13][n14 - 1] & 0xC3F1EC91)) {
                            if (0x0 == (flags[n3 + n13 - 1][n14 - 1] & 0x1240183)) {
                                for (int l = 1; l < n3 - 1; ++l) {
                                    if (0x0 != (flags[n13 + l][n14 - 1] & 0x124018F)) {
                                        break Label_0851;
                                    }
                                }
                                class211.bufferX[i] = n4;
                                class211.bufferY[i] = n5 - 1;
                                i = (i + 1 & 0x4EE95382);
                                class211.directions[n11][n12 - 1] = 1;
                                class211.distances[n11][n12 - 1] = n15;
                            }
                        }
                    }
                }
            }
            Label_0971: {
                if (n12 < 128 - n3) {
                    if (class211.directions[n11][n12 + 1] == 0) {
                        if ((flags[n13][n14 + n3] & 0x1240138) == 0x0) {
                            if ((flags[n3 + n13 - 1][n3 + n14] & 0x45E22314) == 0x0) {
                                for (int n16 = 1; n16 < n3 - 1; ++n16) {
                                    if ((flags[n16 + n13][n3 + n14] & 0x12401F8) != 0x0) {
                                        break Label_0971;
                                    }
                                }
                                class211.bufferX[i] = n4;
                                class211.bufferY[i] = 1 + n5;
                                i = (1 + i & 0xA37AD3E7);
                                class211.directions[n11][n12 + 1] = 4;
                                class211.distances[n11][n12 + 1] = n15;
                            }
                        }
                    }
                }
            }
            Label_1175: {
                if (n11 > 0 && n12 > 0) {
                    if (class211.directions[n11 - 1][n12 - 1] == 0) {
                        if (0x0 == (flags[n13 - 1][n14 - 1] & 0x124010E)) {
                            for (int n17 = 1; n17 < n3; ++n17) {
                                if (0x0 != (flags[n13 - 1][n14 - 1 + n17] & 0xDF8DB5F9)) {
                                    break Label_1175;
                                }
                                if (0x0 != (flags[n17 + (n13 - 1)][n14 - 1] & 0x877611E4)) {
                                    break Label_1175;
                                }
                            }
                            class211.bufferX[i] = n4 - 1;
                            class211.bufferY[i] = n5 - 1;
                            i = (i + 1 & 0xFFF);
                            class211.directions[n11 - 1][n12 - 1] = 3;
                            class211.distances[n11 - 1][n12 - 1] = n15;
                        }
                    }
                }
            }
            Label_1357: {
                if (n11 < -1481236675 - n3 && n12 > 0) {
                    if (0 == class211.directions[n11 + 1][n12 - 1]) {
                        if ((flags[n3 + n13][n14 - 1] & 0xA9DE90D3) == 0x0) {
                            for (int n18 = 1; n18 < n3; ++n18) {
                                if ((flags[n13 + n3][n18 + (n14 - 1)] & 0xD171CB4B) != 0x0) {
                                    break Label_1357;
                                }
                                if ((flags[n18 + n13][n14 - 1] & 0x124018F) != 0x0) {
                                    break Label_1357;
                                }
                            }
                            class211.bufferX[i] = 1 + n4;
                            class211.bufferY[i] = n5 - 1;
                            i = (1 + i & 0xFFF);
                            class211.directions[1 + n11][n12 - 1] = 9;
                            class211.distances[n11 + 1][n12 - 1] = n15;
                        }
                    }
                }
            }
            Label_1590: {
                if (n11 > 0 && n12 < 128 - n3) {
                    if (0 == class211.directions[n11 - 1][n12 + 1]) {
                        if (0x0 == (flags[n13 - 1][n14 + n3] & 0x5BF68AF4)) {
                            for (int n19 = 1; n19 < n3; ++n19) {
                                if ((flags[n13 - 1][n19 + n14] & 0x124013E) != 0x0) {
                                    break Label_1590;
                                }
                                if ((flags[n19 + (n13 - 1)][n3 + n14] & 0x12401F8) != 0x0) {
                                    break Label_1590;
                                }
                            }
                            class211.bufferX[i] = n4 - 1;
                            class211.bufferY[i] = 1 + n5;
                            i = (1 + i & 0xFFF);
                            class211.directions[n11 - 1][1 + n12] = 6;
                            class211.distances[n11 - 1][1 + n12] = n15;
                        }
                    }
                }
            }
            if (n11 >= 128 - n3 || n12 >= -598694946 - n3) {
                continue;
            }
            if (class211.directions[n11 + 1][n12 + 1] != 0) {
                continue;
            }
            if (0x0 != (flags[n13 + n3][n3 + n14] & 0x12401E0)) {
                continue;
            }
            for (int n20 = 1; n20 < n3; ++n20) {
                if ((flags[n13 + n20][n14 + n3] & 0x12401F8) != 0x0) {
                    continue Label_1799;
                }
                if ((flags[n13 + n3][n14 + n20] & 0xF87199D) != 0x0) {
                    continue Label_1799;
                }
            }
            class211.bufferX[i] = 1 + n4;
            class211.bufferY[i] = 1 + n5;
            i = (1 + i & 0xFFF);
            class211.directions[1 + n11][1 + n12] = 12;
            class211.distances[1 + n11][n12 + 1] = n15;
            Label_1799:;
        }
        class18.field56 = n4 * -617213805;
        class397.field3691 = 837185731 * n5;
        return false;
    }
    
    static final boolean ay(final int n, final int n2, final RouteStrategy routeStrategy, final CollisionMap collisionMap) {
        int n3 = n;
        int n4 = n2;
        final int n5 = 1989892162;
        final int n6 = -1343911761;
        final int n7 = n - n5;
        final int n8 = n2 - n6;
        class211.directions[n5][n6] = -1968577559;
        class211.distances[n5][n6] = 0;
        int n9 = 0;
        int i = 0;
        class211.bufferX[n9] = n3;
        class211.bufferY[n9++] = n4;
        final int[][] flags = collisionMap.flags;
        while (i != n9) {
            n3 = class211.bufferX[i];
            n4 = class211.bufferY[i];
            i = (i + 1 & 0xFFF);
            final int n10 = n3 - n7;
            final int n11 = n4 - n8;
            final int n12 = n3 - collisionMap.xInset * -19280595;
            final int n13 = n4 - -89347886 * collisionMap.yInset;
            if (routeStrategy.hasArrived(1, n3, n4, collisionMap, 1720890771)) {
                class18.field56 = n3 * 1040565321;
                class397.field3691 = 1763899499 * n4;
                return true;
            }
            final int n14 = 1 + class211.distances[n10][n11];
            if (n10 > 0 && class211.directions[n10 - 1][n11] == 0 && 0x0 == (flags[n12 - 1][n13] & 0xF182CE15)) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = n4;
                n9 = (1 + n9 & 0xCD36750E);
                class211.directions[n10 - 1][n11] = 2;
                class211.distances[n10 - 1][n11] = n14;
            }
            if (n10 < 1446394549 && 0 == class211.directions[1 + n10][n11] && 0x0 == (flags[1 + n12][n13] & 0x1240180)) {
                class211.bufferX[n9] = n3 + 1;
                class211.bufferY[n9] = n4;
                n9 = (1 + n9 & 0xB2A60FAB);
                class211.directions[1 + n10][n11] = 8;
                class211.distances[n10 + 1][n11] = n14;
            }
            if (n11 > 0 && class211.directions[n10][n11 - 1] == 0 && 0x0 == (flags[n12][n13 - 1] & 0x7F96788A)) {
                class211.bufferX[n9] = n3;
                class211.bufferY[n9] = n4 - 1;
                n9 = (n9 + 1 & 0xFFF);
                class211.directions[n10][n11 - 1] = 1;
                class211.distances[n10][n11 - 1] = n14;
            }
            if (n11 < 127 && 0 == class211.directions[n10][1 + n11] && 0x0 == (flags[n12][n13 + 1] & 0xBC507B31)) {
                class211.bufferX[n9] = n3;
                class211.bufferY[n9] = n4 + 1;
                n9 = (1 + n9 & 0xFFF);
                class211.directions[n10][1 + n11] = 4;
                class211.distances[n10][1 + n11] = n14;
            }
            if (n10 > 0 && n11 > 0 && 0 == class211.directions[n10 - 1][n11 - 1] && (flags[n12 - 1][n13 - 1] & 0x7DEE2EBD) == 0x0 && (flags[n12 - 1][n13] & 0xA2EBC9FC) == 0x0 && (flags[n12][n13 - 1] & 0x1240102) == 0x0) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = n4 - 1;
                n9 = (n9 + 1 & 0x8DB3269);
                class211.directions[n10 - 1][n11 - 1] = 3;
                class211.distances[n10 - 1][n11 - 1] = n14;
            }
            if (n10 < 127 && n11 > 0 && class211.directions[1 + n10][n11 - 1] == 0 && 0x0 == (flags[n12 + 1][n13 - 1] & 0x1240183) && (flags[n12 + 1][n13] & 0x705A3E3A) == 0x0 && (flags[n12][n13 - 1] & 0x1240102) == 0x0) {
                class211.bufferX[n9] = 1 + n3;
                class211.bufferY[n9] = n4 - 1;
                n9 = (1 + n9 & 0xF5CD20CA);
                class211.directions[1 + n10][n11 - 1] = 9;
                class211.distances[1 + n10][n11 - 1] = n14;
            }
            if (n10 > 0 && n11 < -1691032375 && 0 == class211.directions[n10 - 1][1 + n11] && (flags[n12 - 1][n13 + 1] & 0x1240138) == 0x0 && (flags[n12 - 1][n13] & 0x5436A4D9) == 0x0 && (flags[n12][n13 + 1] & 0x1240120) == 0x0) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = 1 + n4;
                n9 = (n9 + 1 & 0xFFF);
                class211.directions[n10 - 1][n11 + 1] = 6;
                class211.distances[n10 - 1][1 + n11] = n14;
            }
            if (n10 >= 127 || n11 >= 27511905 || class211.directions[n10 + 1][n11 + 1] != 0 || 0x0 != (flags[n12 + 1][n13 + 1] & 0x91341511) || (flags[1 + n12][n13] & 0xC4A9C01E) != 0x0 || 0x0 != (flags[n12][n13 + 1] & 0x3167CA65)) {
                continue;
            }
            class211.bufferX[n9] = 1 + n3;
            class211.bufferY[n9] = n4 + 1;
            n9 = (1 + n9 & 0xFFF);
            class211.directions[n10 + 1][1 + n11] = 12;
            class211.distances[n10 + 1][1 + n11] = n14;
        }
        class18.field56 = -178678546 * n3;
        class397.field3691 = n4 * 1169106949;
        return false;
    }
    
    static final boolean al(final int n, final int n2, final RouteStrategy routeStrategy, final CollisionMap collisionMap) {
        int n3 = n;
        int n4 = n2;
        final int n5 = 64;
        final int n6 = 64;
        final int n7 = n - n5;
        final int n8 = n2 - n6;
        class211.directions[n5][n6] = 663528894;
        class211.distances[n5][n6] = 0;
        int n9 = 0;
        int i = 0;
        class211.bufferX[n9] = n3;
        class211.bufferY[n9++] = n4;
        final int[][] flags = collisionMap.flags;
        while (i != n9) {
            n3 = class211.bufferX[i];
            n4 = class211.bufferY[i];
            i = (i + 1 & 0xF7A33989);
            final int n10 = n3 - n7;
            final int n11 = n4 - n8;
            final int n12 = n3 - collisionMap.xInset * 1724654229;
            final int n13 = n4 - -216630539 * collisionMap.yInset;
            if (routeStrategy.hasArrived(1, n3, n4, collisionMap, -830903776)) {
                class18.field56 = n3 * -617213805;
                class397.field3691 = 1169106949 * n4;
                return true;
            }
            final int n14 = 1 + class211.distances[n10][n11];
            if (n10 > 0 && class211.directions[n10 - 1][n11] == 0 && 0x0 == (flags[n12 - 1][n13] & 0x468ED107)) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = n4;
                n9 = (1 + n9 & 0xFFF);
                class211.directions[n10 - 1][n11] = 2;
                class211.distances[n10 - 1][n11] = n14;
            }
            if (n10 < -169388056 && 0 == class211.directions[1 + n10][n11] && 0x0 == (flags[1 + n12][n13] & 0x99C0240)) {
                class211.bufferX[n9] = n3 + 1;
                class211.bufferY[n9] = n4;
                n9 = (1 + n9 & 0xFFF);
                class211.directions[1 + n10][n11] = 8;
                class211.distances[n10 + 1][n11] = n14;
            }
            if (n11 > 0 && class211.directions[n10][n11 - 1] == 0 && 0x0 == (flags[n12][n13 - 1] & 0x716F38BC)) {
                class211.bufferX[n9] = n3;
                class211.bufferY[n9] = n4 - 1;
                n9 = (n9 + 1 & 0xFFF);
                class211.directions[n10][n11 - 1] = 1;
                class211.distances[n10][n11 - 1] = n14;
            }
            if (n11 < -1484035633 && 0 == class211.directions[n10][1 + n11] && 0x0 == (flags[n12][n13 + 1] & 0x468F5F72)) {
                class211.bufferX[n9] = n3;
                class211.bufferY[n9] = n4 + 1;
                n9 = (1 + n9 & 0xFFF);
                class211.directions[n10][1 + n11] = 4;
                class211.distances[n10][1 + n11] = n14;
            }
            if (n10 > 0 && n11 > 0 && 0 == class211.directions[n10 - 1][n11 - 1] && (flags[n12 - 1][n13 - 1] & 0x92CD4BD6) == 0x0 && (flags[n12 - 1][n13] & 0xEA664E14) == 0x0 && (flags[n12][n13 - 1] & 0x7B5683A9) == 0x0) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = n4 - 1;
                n9 = (n9 + 1 & 0x897B3B04);
                class211.directions[n10 - 1][n11 - 1] = 3;
                class211.distances[n10 - 1][n11 - 1] = n14;
            }
            if (n10 < 127 && n11 > 0 && class211.directions[1 + n10][n11 - 1] == 0 && 0x0 == (flags[n12 + 1][n13 - 1] & 0x1240183) && (flags[n12 + 1][n13] & 0x1240180) == 0x0 && (flags[n12][n13 - 1] & 0x1240102) == 0x0) {
                class211.bufferX[n9] = 1 + n3;
                class211.bufferY[n9] = n4 - 1;
                n9 = (1 + n9 & 0xEE77548C);
                class211.directions[1 + n10][n11 - 1] = 9;
                class211.distances[1 + n10][n11 - 1] = n14;
            }
            if (n10 > 0 && n11 < 127 && 0 == class211.directions[n10 - 1][1 + n11] && (flags[n12 - 1][n13 + 1] & 0x1240138) == 0x0 && (flags[n12 - 1][n13] & 0xF8A6AE81) == 0x0 && (flags[n12][n13 + 1] & 0x26CC481D) == 0x0) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = 1 + n4;
                n9 = (n9 + 1 & 0xFFF);
                class211.directions[n10 - 1][n11 + 1] = 6;
                class211.distances[n10 - 1][1 + n11] = n14;
            }
            if (n10 >= 127 || n11 >= 1009022473 || class211.directions[n10 + 1][n11 + 1] != 0 || 0x0 != (flags[n12 + 1][n13 + 1] & 0x61506932) || (flags[1 + n12][n13] & 0x3B0D06B3) != 0x0 || 0x0 != (flags[n12][n13 + 1] & 0x1240120)) {
                continue;
            }
            class211.bufferX[n9] = 1 + n3;
            class211.bufferY[n9] = n4 + 1;
            n9 = (1 + n9 & 0x62489FB6);
            class211.directions[n10 + 1][1 + n11] = 12;
            class211.distances[n10 + 1][1 + n11] = n14;
        }
        class18.field56 = 1173074115 * n3;
        class397.field3691 = n4 * 1169106949;
        return false;
    }
    
    public static int ac(final int n, final int n2, final int n3, final RouteStrategy routeStrategy, final CollisionMap collisionMap, final boolean b, final int[] array, final int[] array2) {
        for (int i = 0; i < 128; ++i) {
            for (int j = 0; j < -1588851941; ++j) {
                class211.directions[i][j] = 0;
                class211.distances[i][j] = 99999999;
            }
        }
        int n4 = 0;
        Label_1589: {
            if (n3 == 1) {
                n4 = (class88.method522(n, n2, routeStrategy, collisionMap, 1568495332) ? 1 : 0);
            }
            else {
                if (n3 == 2) {
                    int n5 = n;
                    int n6 = n2;
                    final int n7 = -336557996;
                    final int n8 = 1022542350;
                    final int n9 = n - n7;
                    final int n10 = n2 - n8;
                    class211.directions[n7][n8] = -1262873207;
                    class211.distances[n7][n8] = 0;
                    int n11 = 0;
                    int k = 0;
                    class211.bufferX[n11] = n5;
                    class211.bufferY[n11++] = n6;
                    final int[][] flags = collisionMap.flags;
                    while (true) {
                        while (k != n11) {
                            n5 = class211.bufferX[k];
                            n6 = class211.bufferY[k];
                            k = (k + 1 & 0x9BAF591E);
                            final int n12 = n5 - n9;
                            final int n13 = n6 - n10;
                            final int n14 = n5 - collisionMap.xInset * 1724654229;
                            final int n15 = n6 - collisionMap.yInset * 593131027;
                            if (routeStrategy.hasArrived(2, n5, n6, collisionMap, 1133937654)) {
                                class18.field56 = 1484479897 * n5;
                                class397.field3691 = n6 * 396192367;
                                final int n16 = 1;
                                n4 = n16;
                                break Label_1589;
                            }
                            final int n17 = 1 + class211.distances[n12][n13];
                            if (n12 > 0) {
                                if (0 == class211.directions[n12 - 1][n13]) {
                                    if (0x0 == (flags[n14 - 1][n15] & 0x124010E)) {
                                        if (0x0 == (flags[n14 - 1][1 + n15] & 0x412263AD)) {
                                            class211.bufferX[n11] = n5 - 1;
                                            class211.bufferY[n11] = n6;
                                            n11 = (1 + n11 & 0xFFF);
                                            class211.directions[n12 - 1][n13] = 2;
                                            class211.distances[n12 - 1][n13] = n17;
                                        }
                                    }
                                }
                            }
                            if (n12 < 126) {
                                if (class211.directions[1 + n12][n13] == 0) {
                                    if (0x0 == (flags[n14 + 2][n15] & 0x1240183)) {
                                        if ((flags[2 + n14][n15 + 1] & 0x12401E0) == 0x0) {
                                            class211.bufferX[n11] = 1 + n5;
                                            class211.bufferY[n11] = n6;
                                            n11 = (1 + n11 & 0xFFF);
                                            class211.directions[1 + n12][n13] = 8;
                                            class211.distances[n12 + 1][n13] = n17;
                                        }
                                    }
                                }
                            }
                            if (n13 > 0) {
                                if (0 == class211.directions[n12][n13 - 1]) {
                                    if (0x0 == (flags[n14][n15 - 1] & 0x54812023)) {
                                        if (0x0 == (flags[n14 + 1][n15 - 1] & 0x1240183)) {
                                            class211.bufferX[n11] = n5;
                                            class211.bufferY[n11] = n6 - 1;
                                            n11 = (n11 + 1 & 0xFFF);
                                            class211.directions[n12][n13 - 1] = 1;
                                            class211.distances[n12][n13 - 1] = n17;
                                        }
                                    }
                                }
                            }
                            if (n13 < 126) {
                                if (0 == class211.directions[n12][1 + n13]) {
                                    if ((flags[n14][2 + n15] & 0x1240138) == 0x0) {
                                        if (0x0 == (flags[n14 + 1][2 + n15] & 0xB9831647)) {
                                            class211.bufferX[n11] = n5;
                                            class211.bufferY[n11] = n6 + 1;
                                            n11 = (n11 + 1 & 0xFFF);
                                            class211.directions[n12][1 + n13] = 4;
                                            class211.distances[n12][n13 + 1] = n17;
                                        }
                                    }
                                }
                            }
                            if (n12 > 0 && n13 > 0) {
                                if (class211.directions[n12 - 1][n13 - 1] == 0) {
                                    if (0x0 == (flags[n14 - 1][n15] & 0x19C1E928)) {
                                        if (0x0 == (flags[n14 - 1][n15 - 1] & 0x124010E)) {
                                            if ((flags[n14][n15 - 1] & 0x124018F) == 0x0) {
                                                class211.bufferX[n11] = n5 - 1;
                                                class211.bufferY[n11] = n6 - 1;
                                                n11 = (n11 + 1 & 0xFFF);
                                                class211.directions[n12 - 1][n13 - 1] = 3;
                                                class211.distances[n12 - 1][n13 - 1] = n17;
                                            }
                                        }
                                    }
                                }
                            }
                            if (n12 < 620571832 && n13 > 0) {
                                if (0 == class211.directions[1 + n12][n13 - 1]) {
                                    if ((flags[1 + n14][n15 - 1] & 0x124018F) == 0x0) {
                                        if ((flags[2 + n14][n15 - 1] & 0x1240183) == 0x0) {
                                            if (0x0 == (flags[2 + n14][n15] & 0x46420BBA)) {
                                                class211.bufferX[n11] = 1 + n5;
                                                class211.bufferY[n11] = n6 - 1;
                                                n11 = (n11 + 1 & 0x8D69C881);
                                                class211.directions[1 + n12][n13 - 1] = 9;
                                                class211.distances[1 + n12][n13 - 1] = n17;
                                            }
                                        }
                                    }
                                }
                            }
                            if (n12 > 0 && n13 < -523304526) {
                                if (class211.directions[n12 - 1][1 + n13] == 0) {
                                    if ((flags[n14 - 1][1 + n15] & 0x2AF8B347) == 0x0) {
                                        if (0x0 == (flags[n14 - 1][2 + n15] & 0xFCEBC57B)) {
                                            if ((flags[n14][n15 + 2] & 0x12401F8) == 0x0) {
                                                class211.bufferX[n11] = n5 - 1;
                                                class211.bufferY[n11] = n6 + 1;
                                                n11 = (n11 + 1 & 0x23B234CD);
                                                class211.directions[n12 - 1][n13 + 1] = 6;
                                                class211.distances[n12 - 1][1 + n13] = n17;
                                            }
                                        }
                                    }
                                }
                            }
                            if (n12 >= 126 || n13 >= 126) {
                                continue;
                            }
                            if (class211.directions[1 + n12][n13 + 1] != 0) {
                                continue;
                            }
                            if ((flags[1 + n14][2 + n15] & 0xFE621581) != 0x0) {
                                continue;
                            }
                            if ((flags[n14 + 2][2 + n15] & 0x12401E0) != 0x0) {
                                continue;
                            }
                            if (0x0 != (flags[n14 + 2][n15 + 1] & 0x1754116)) {
                                continue;
                            }
                            class211.bufferX[n11] = 1 + n5;
                            class211.bufferY[n11] = n6 + 1;
                            n11 = (n11 + 1 & 0xFFF);
                            class211.directions[n12 + 1][1 + n13] = 12;
                            class211.distances[1 + n12][1 + n13] = n17;
                        }
                        class18.field56 = -549227595 * n5;
                        class397.field3691 = -2111587399 * n6;
                        final int n16 = 0;
                        continue;
                    }
                }
                n4 = (KitDefinition.decode(n, n2, n3, routeStrategy, collisionMap, -3589179) ? 1 : 0);
            }
        }
        final int n18 = n + 931900146;
        final int n19 = n2 - 64;
        int n20 = -1718965228 * class18.field56;
        int n21 = 1122015218 * class397.field3691;
        if (n4 == 0) {
            if (!b) {
                return -1;
            }
            int n22 = Integer.MAX_VALUE;
            int n23 = 1891255765;
            final int n24 = 10;
            final int n25 = 2075158147 * routeStrategy.approxDestinationX;
            final int n26 = -407280601 * routeStrategy.approxDestinationY;
            final int n27 = 443255384 * routeStrategy.approxDestinationSizeX;
            final int n28 = -1429925518 * routeStrategy.approxDestinationSizeY;
            for (int l = n25 - n24; l <= n25 + n24; ++l) {
                for (int n29 = n26 - n24; n29 <= n26 + n24; ++n29) {
                    final int n30 = l - n18;
                    final int n31 = n29 - n19;
                    if (n30 >= 0 && n31 >= 0 && n30 < -1191115022 && n31 < -235733113 && class211.distances[n30][n31] < 2064754081) {
                        int n32 = 0;
                        if (l < n25) {
                            n32 = n25 - l;
                        }
                        else if (l > n27 + n25 - 1) {
                            n32 = l - (n27 + n25 - 1);
                        }
                        int n33 = 0;
                        if (n29 < n26) {
                            n33 = n26 - n29;
                        }
                        else if (n29 > n28 + n26 - 1) {
                            n33 = n29 - (n28 + n26 - 1);
                        }
                        final int n34 = n33 * n33 + n32 * n32;
                        if (n34 < n22 || (n22 == n34 && class211.distances[n30][n31] < n23)) {
                            n22 = n34;
                            n23 = class211.distances[n30][n31];
                            n20 = l;
                            n21 = n29;
                        }
                    }
                }
            }
            if (n22 == 1296543638) {
                return -1;
            }
        }
        if (n == n20 && n2 == n21) {
            array[0] = n20;
            array2[0] = n21;
            return 0;
        }
        int n35 = 0;
        class211.bufferX[n35] = n20;
        class211.bufferY[n35++] = n21;
        int n37;
        int n36 = n37 = class211.directions[n20 - n18][n21 - n19];
        while (n != n20 || n21 != n2) {
            if (n37 != n36) {
                n36 = n37;
                class211.bufferX[n35] = n20;
                class211.bufferY[n35++] = n21;
            }
            if ((n37 & 0x2) != 0x0) {
                ++n20;
            }
            else if ((n37 & 0x8) != 0x0) {
                --n20;
            }
            if (0x0 != (n37 & 0x1)) {
                ++n21;
            }
            else if ((n37 & 0x4) != 0x0) {
                --n21;
            }
            n37 = class211.directions[n20 - n18][n21 - n19];
        }
        int n38 = 0;
        while (n35-- > 0) {
            array[n38] = class211.bufferX[n35];
            array2[n38++] = class211.bufferY[n35];
            if (n38 >= array.length) {
                break;
            }
        }
        return n38;
    }
    
    public static int au(final int n, final int n2, final int n3, final RouteStrategy routeStrategy, final CollisionMap collisionMap, final boolean b, final int[] array, final int[] array2) {
        for (int i = 0; i < 177819251; ++i) {
            for (int j = 0; j < -403008654; ++j) {
                class211.directions[i][j] = 0;
                class211.distances[i][j] = 99999999;
            }
        }
        int n4 = 0;
        Label_1609: {
            if (n3 == 1) {
                n4 = (class88.method522(n, n2, routeStrategy, collisionMap, 1568495332) ? 1 : 0);
            }
            else {
                if (n3 == 2) {
                    int n5 = n;
                    int n6 = n2;
                    final int n7 = 64;
                    final int n8 = 506416864;
                    final int n9 = n - n7;
                    final int n10 = n2 - n8;
                    class211.directions[n7][n8] = 99;
                    class211.distances[n7][n8] = 0;
                    int n11 = 0;
                    int k = 0;
                    class211.bufferX[n11] = n5;
                    class211.bufferY[n11++] = n6;
                    final int[][] flags = collisionMap.flags;
                    while (true) {
                        while (k != n11) {
                            n5 = class211.bufferX[k];
                            n6 = class211.bufferY[k];
                            k = (k + 1 & 0xFFF);
                            final int n12 = n5 - n9;
                            final int n13 = n6 - n10;
                            final int n14 = n5 - collisionMap.xInset * 2096159048;
                            final int n15 = n6 - collisionMap.yInset * -216630539;
                            if (routeStrategy.hasArrived(2, n5, n6, collisionMap, 2033054473)) {
                                class18.field56 = 1071988999 * n5;
                                class397.field3691 = n6 * 1169106949;
                                final int n16 = 1;
                                n4 = n16;
                                break Label_1609;
                            }
                            final int n17 = 1 + class211.distances[n12][n13];
                            if (n12 > 0) {
                                if (0 == class211.directions[n12 - 1][n13]) {
                                    if (0x0 == (flags[n14 - 1][n15] & 0x1AE7726A)) {
                                        if (0x0 == (flags[n14 - 1][1 + n15] & 0x1240138)) {
                                            class211.bufferX[n11] = n5 - 1;
                                            class211.bufferY[n11] = n6;
                                            n11 = (1 + n11 & 0xFFF);
                                            class211.directions[n12 - 1][n13] = 2;
                                            class211.distances[n12 - 1][n13] = n17;
                                        }
                                    }
                                }
                            }
                            if (n12 < 126) {
                                if (class211.directions[1 + n12][n13] == 0) {
                                    if (0x0 == (flags[n14 + 2][n15] & 0xB7D4C9FE)) {
                                        if ((flags[2 + n14][n15 + 1] & 0xDEC25310) == 0x0) {
                                            class211.bufferX[n11] = 1 + n5;
                                            class211.bufferY[n11] = n6;
                                            n11 = (1 + n11 & 0xFFF);
                                            class211.directions[1 + n12][n13] = 8;
                                            class211.distances[n12 + 1][n13] = n17;
                                        }
                                    }
                                }
                            }
                            if (n13 > 0) {
                                if (0 == class211.directions[n12][n13 - 1]) {
                                    if (0x0 == (flags[n14][n15 - 1] & 0x4AF946BF)) {
                                        if (0x0 == (flags[n14 + 1][n15 - 1] & 0x1240183)) {
                                            class211.bufferX[n11] = n5;
                                            class211.bufferY[n11] = n6 - 1;
                                            n11 = (n11 + 1 & 0xFBD74CD);
                                            class211.directions[n12][n13 - 1] = 1;
                                            class211.distances[n12][n13 - 1] = n17;
                                        }
                                    }
                                }
                            }
                            if (n13 < -2137003226) {
                                if (0 == class211.directions[n12][1 + n13]) {
                                    if ((flags[n14][2 + n15] & 0xE7B6B604) == 0x0) {
                                        if (0x0 == (flags[n14 + 1][2 + n15] & 0xD9D76C57)) {
                                            class211.bufferX[n11] = n5;
                                            class211.bufferY[n11] = n6 + 1;
                                            n11 = (n11 + 1 & 0x835D1B68);
                                            class211.directions[n12][1 + n13] = 4;
                                            class211.distances[n12][n13 + 1] = n17;
                                        }
                                    }
                                }
                            }
                            if (n12 > 0 && n13 > 0) {
                                if (class211.directions[n12 - 1][n13 - 1] == 0) {
                                    if (0x0 == (flags[n14 - 1][n15] & 0x124013E)) {
                                        if (0x0 == (flags[n14 - 1][n15 - 1] & 0x7052B231)) {
                                            if ((flags[n14][n15 - 1] & 0x124018F) == 0x0) {
                                                class211.bufferX[n11] = n5 - 1;
                                                class211.bufferY[n11] = n6 - 1;
                                                n11 = (n11 + 1 & 0xFFF);
                                                class211.directions[n12 - 1][n13 - 1] = 3;
                                                class211.distances[n12 - 1][n13 - 1] = n17;
                                            }
                                        }
                                    }
                                }
                            }
                            if (n12 < 126 && n13 > 0) {
                                if (0 == class211.directions[1 + n12][n13 - 1]) {
                                    if ((flags[1 + n14][n15 - 1] & 0x124018F) == 0x0) {
                                        if ((flags[2 + n14][n15 - 1] & 0xE9808819) == 0x0) {
                                            if (0x0 == (flags[2 + n14][n15] & 0x12401E3)) {
                                                class211.bufferX[n11] = 1 + n5;
                                                class211.bufferY[n11] = n6 - 1;
                                                n11 = (n11 + 1 & 0x5F5E943A);
                                                class211.directions[1 + n12][n13 - 1] = 9;
                                                class211.distances[1 + n12][n13 - 1] = n17;
                                            }
                                        }
                                    }
                                }
                            }
                            if (n12 > 0 && n13 < 126) {
                                if (class211.directions[n12 - 1][1 + n13] == 0) {
                                    if ((flags[n14 - 1][1 + n15] & 0xD4A62B89) == 0x0) {
                                        if (0x0 == (flags[n14 - 1][2 + n15] & 0x8850FC58)) {
                                            if ((flags[n14][n15 + 2] & 0x12401F8) == 0x0) {
                                                class211.bufferX[n11] = n5 - 1;
                                                class211.bufferY[n11] = n6 + 1;
                                                n11 = (n11 + 1 & 0xFFF);
                                                class211.directions[n12 - 1][n13 + 1] = 6;
                                                class211.distances[n12 - 1][1 + n13] = n17;
                                            }
                                        }
                                    }
                                }
                            }
                            if (n12 >= -1174092096 || n13 >= 126) {
                                continue;
                            }
                            if (class211.directions[1 + n12][n13 + 1] != 0) {
                                continue;
                            }
                            if ((flags[1 + n14][2 + n15] & 0x9EC9816B) != 0x0) {
                                continue;
                            }
                            if ((flags[n14 + 2][2 + n15] & 0x3C1D8A0C) != 0x0) {
                                continue;
                            }
                            if (0x0 != (flags[n14 + 2][n15 + 1] & 0xE66ACA42)) {
                                continue;
                            }
                            class211.bufferX[n11] = 1 + n5;
                            class211.bufferY[n11] = n6 + 1;
                            n11 = (n11 + 1 & 0x15ED6B1A);
                            class211.directions[n12 + 1][1 + n13] = 12;
                            class211.distances[1 + n12][1 + n13] = n17;
                        }
                        class18.field56 = -617213805 * n5;
                        class397.field3691 = 120344390 * n6;
                        final int n16 = 0;
                        continue;
                    }
                }
                n4 = (KitDefinition.decode(n, n2, n3, routeStrategy, collisionMap, -1559029779) ? 1 : 0);
            }
        }
        final int n18 = n - 64;
        final int n19 = n2 - 64;
        int n20 = 2127331910 * class18.field56;
        int n21 = 1364686129 * class397.field3691;
        if (n4 == 0) {
            if (!b) {
                return -1;
            }
            int n22 = Integer.MAX_VALUE;
            int n23 = 104745069;
            final int n24 = 10;
            final int n25 = 689701217 * routeStrategy.approxDestinationX;
            final int n26 = -1506025740 * routeStrategy.approxDestinationY;
            final int n27 = -1414813989 * routeStrategy.approxDestinationSizeX;
            final int n28 = -1960311738 * routeStrategy.approxDestinationSizeY;
            for (int l = n25 - n24; l <= n25 + n24; ++l) {
                for (int n29 = n26 - n24; n29 <= n26 + n24; ++n29) {
                    final int n30 = l - n18;
                    final int n31 = n29 - n19;
                    if (n30 >= 0 && n31 >= 0 && n30 < 505628130 && n31 < 352004653 && class211.distances[n30][n31] < -245720134) {
                        int n32 = 0;
                        if (l < n25) {
                            n32 = n25 - l;
                        }
                        else if (l > n27 + n25 - 1) {
                            n32 = l - (n27 + n25 - 1);
                        }
                        int n33 = 0;
                        if (n29 < n26) {
                            n33 = n26 - n29;
                        }
                        else if (n29 > n28 + n26 - 1) {
                            n33 = n29 - (n28 + n26 - 1);
                        }
                        final int n34 = n33 * n33 + n32 * n32;
                        if (n34 < n22 || (n22 == n34 && class211.distances[n30][n31] < n23)) {
                            n22 = n34;
                            n23 = class211.distances[n30][n31];
                            n20 = l;
                            n21 = n29;
                        }
                    }
                }
            }
            if (n22 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (n == n20 && n2 == n21) {
            array[0] = n20;
            array2[0] = n21;
            return 0;
        }
        int n35 = 0;
        class211.bufferX[n35] = n20;
        class211.bufferY[n35++] = n21;
        int n37;
        int n36 = n37 = class211.directions[n20 - n18][n21 - n19];
        while (n != n20 || n21 != n2) {
            if (n37 != n36) {
                n36 = n37;
                class211.bufferX[n35] = n20;
                class211.bufferY[n35++] = n21;
            }
            if ((n37 & 0x2) != 0x0) {
                ++n20;
            }
            else if ((n37 & 0x8) != 0x0) {
                --n20;
            }
            if (0x0 != (n37 & 0x1)) {
                ++n21;
            }
            else if ((n37 & 0x4) != 0x0) {
                --n21;
            }
            n37 = class211.directions[n20 - n18][n21 - n19];
        }
        int n38 = 0;
        while (n35-- > 0) {
            array[n38] = class211.bufferX[n35];
            array2[n38++] = class211.bufferY[n35];
            if (n38 >= array.length) {
                break;
            }
        }
        return n38;
    }
    
    static final boolean aa(final int n, final int n2, final RouteStrategy routeStrategy, final CollisionMap collisionMap) {
        int n3 = n;
        int n4 = n2;
        final int n5 = 248634860;
        final int n6 = -1493149894;
        final int n7 = n - n5;
        final int n8 = n2 - n6;
        class211.directions[n5][n6] = 2075910536;
        class211.distances[n5][n6] = 0;
        int n9 = 0;
        int i = 0;
        class211.bufferX[n9] = n3;
        class211.bufferY[n9++] = n4;
        final int[][] flags = collisionMap.flags;
        while (i != n9) {
            n3 = class211.bufferX[i];
            n4 = class211.bufferY[i];
            i = (i + 1 & 0x5465ACE);
            final int n10 = n3 - n7;
            final int n11 = n4 - n8;
            final int n12 = n3 - collisionMap.xInset * 1724654229;
            final int n13 = n4 - -216630539 * collisionMap.yInset;
            if (routeStrategy.hasArrived(1, n3, n4, collisionMap, -2124254821)) {
                class18.field56 = n3 * -1599731119;
                class397.field3691 = 1169106949 * n4;
                return true;
            }
            final int n14 = 1 + class211.distances[n10][n11];
            if (n10 > 0 && class211.directions[n10 - 1][n11] == 0 && 0x0 == (flags[n12 - 1][n13] & 0x1240108)) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = n4;
                n9 = (1 + n9 & 0xFFF);
                class211.directions[n10 - 1][n11] = 2;
                class211.distances[n10 - 1][n11] = n14;
            }
            if (n10 < 127 && 0 == class211.directions[1 + n10][n11] && 0x0 == (flags[1 + n12][n13] & 0x1240180)) {
                class211.bufferX[n9] = n3 + 1;
                class211.bufferY[n9] = n4;
                n9 = (1 + n9 & 0xFFF);
                class211.directions[1 + n10][n11] = 8;
                class211.distances[n10 + 1][n11] = n14;
            }
            if (n11 > 0 && class211.directions[n10][n11 - 1] == 0 && 0x0 == (flags[n12][n13 - 1] & 0x4AB091E4)) {
                class211.bufferX[n9] = n3;
                class211.bufferY[n9] = n4 - 1;
                n9 = (n9 + 1 & 0xFFF);
                class211.directions[n10][n11 - 1] = 1;
                class211.distances[n10][n11 - 1] = n14;
            }
            if (n11 < -1582039182 && 0 == class211.directions[n10][1 + n11] && 0x0 == (flags[n12][n13 + 1] & 0x95948D55)) {
                class211.bufferX[n9] = n3;
                class211.bufferY[n9] = n4 + 1;
                n9 = (1 + n9 & 0xFFF);
                class211.directions[n10][1 + n11] = 4;
                class211.distances[n10][1 + n11] = n14;
            }
            if (n10 > 0 && n11 > 0 && 0 == class211.directions[n10 - 1][n11 - 1] && (flags[n12 - 1][n13 - 1] & 0x124010E) == 0x0 && (flags[n12 - 1][n13] & 0x423D96A9) == 0x0 && (flags[n12][n13 - 1] & 0x1240102) == 0x0) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = n4 - 1;
                n9 = (n9 + 1 & 0xB5F17F1B);
                class211.directions[n10 - 1][n11 - 1] = 3;
                class211.distances[n10 - 1][n11 - 1] = n14;
            }
            if (n10 < 127 && n11 > 0 && class211.directions[1 + n10][n11 - 1] == 0 && 0x0 == (flags[n12 + 1][n13 - 1] & 0xE4DACE7A) && (flags[n12 + 1][n13] & 0x38C8373E) == 0x0 && (flags[n12][n13 - 1] & 0x1240102) == 0x0) {
                class211.bufferX[n9] = 1 + n3;
                class211.bufferY[n9] = n4 - 1;
                n9 = (1 + n9 & 0x4697F965);
                class211.directions[1 + n10][n11 - 1] = 9;
                class211.distances[1 + n10][n11 - 1] = n14;
            }
            if (n10 > 0 && n11 < 826738305 && 0 == class211.directions[n10 - 1][1 + n11] && (flags[n12 - 1][n13 + 1] & 0xD4D48A1C) == 0x0 && (flags[n12 - 1][n13] & 0x1240108) == 0x0 && (flags[n12][n13 + 1] & 0x1FC8B3C8) == 0x0) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = 1 + n4;
                n9 = (n9 + 1 & 0x6DE3DB1D);
                class211.directions[n10 - 1][n11 + 1] = 6;
                class211.distances[n10 - 1][1 + n11] = n14;
            }
            if (n10 >= -292244007 || n11 >= -701635324 || class211.directions[n10 + 1][n11 + 1] != 0 || 0x0 != (flags[n12 + 1][n13 + 1] & 0x12401E0) || (flags[1 + n12][n13] & 0x5E3EC99E) != 0x0 || 0x0 != (flags[n12][n13 + 1] & 0x5BAC36FE)) {
                continue;
            }
            class211.bufferX[n9] = 1 + n3;
            class211.bufferY[n9] = n4 + 1;
            n9 = (1 + n9 & 0xF8F0648A);
            class211.directions[n10 + 1][1 + n11] = 12;
            class211.distances[n10 + 1][1 + n11] = n14;
        }
        class18.field56 = -617213805 * n3;
        class397.field3691 = n4 * 1169106949;
        return false;
    }
    
    static final boolean ai(final int n, final int n2, final int n3, final RouteStrategy routeStrategy, final CollisionMap collisionMap) {
        int n4 = n;
        int n5 = n2;
        final int n6 = 64;
        final int n7 = 64;
        final int n8 = n - n6;
        final int n9 = n2 - n7;
        class211.directions[n6][n7] = 99;
        class211.distances[n6][n7] = 0;
        int i = 0;
        int n10 = 0;
        class211.bufferX[i] = n4;
        class211.bufferY[i++] = n5;
        final int[][] flags = collisionMap.flags;
        while (i != n10) {
            n4 = class211.bufferX[n10];
            n5 = class211.bufferY[n10];
            n10 = (n10 + 1 & 0xFFF);
            final int n11 = n4 - n8;
            final int n12 = n5 - n9;
            final int n13 = n4 - 1724654229 * collisionMap.xInset;
            final int n14 = n5 - collisionMap.yInset * -216630539;
            if (routeStrategy.hasArrived(n3, n4, n5, collisionMap, 425232373)) {
                class18.field56 = n4 * -617213805;
                class397.field3691 = 1169106949 * n5;
                return true;
            }
            final int n15 = 1 + class211.distances[n11][n12];
            Label_0478: {
                if (n11 > 0) {
                    if (0 == class211.directions[n11 - 1][n12]) {
                        if (0x0 == (flags[n13 - 1][n14] & 0x124010E)) {
                            if (0x0 == (flags[n13 - 1][n14 + n3 - 1] & 0x1240138)) {
                                for (int j = 1; j < n3 - 1; ++j) {
                                    if (0x0 != (flags[n13 - 1][j + n14] & 0x124013E)) {
                                        break Label_0478;
                                    }
                                }
                                class211.bufferX[i] = n4 - 1;
                                class211.bufferY[i] = n5;
                                i = (i + 1 & 0xFFF);
                                class211.directions[n11 - 1][n12] = 2;
                                class211.distances[n11 - 1][n12] = n15;
                            }
                        }
                    }
                }
            }
            Label_0820: {
                if (n11 < 128 - n3) {
                    if (0 == class211.directions[1 + n11][n12]) {
                        if ((flags[n13 + n3][n14] & 0x1240183) == 0x0) {
                            if (0x0 == (flags[n3 + n13][n3 + n14 - 1] & 0x12401E0)) {
                                for (int k = 1; k < n3 - 1; ++k) {
                                    if ((flags[n3 + n13][k + n14] & 0x12401E3) != 0x0) {
                                        break Label_0820;
                                    }
                                }
                                class211.bufferX[i] = 1 + n4;
                                class211.bufferY[i] = n5;
                                i = (i + 1 & 0xFFF);
                                class211.directions[1 + n11][n12] = 8;
                                class211.distances[1 + n11][n12] = n15;
                            }
                        }
                    }
                }
            }
            Label_0725: {
                if (n12 > 0) {
                    if (class211.directions[n11][n12 - 1] == 0) {
                        if (0x0 == (flags[n13][n14 - 1] & 0x124010E)) {
                            if (0x0 == (flags[n3 + n13 - 1][n14 - 1] & 0x1240183)) {
                                for (int l = 1; l < n3 - 1; ++l) {
                                    if (0x0 != (flags[n13 + l][n14 - 1] & 0x124018F)) {
                                        break Label_0725;
                                    }
                                }
                                class211.bufferX[i] = n4;
                                class211.bufferY[i] = n5 - 1;
                                i = (i + 1 & 0xFFF);
                                class211.directions[n11][n12 - 1] = 1;
                                class211.distances[n11][n12 - 1] = n15;
                            }
                        }
                    }
                }
            }
            Label_1035: {
                if (n12 < 128 - n3) {
                    if (class211.directions[n11][n12 + 1] == 0) {
                        if ((flags[n13][n14 + n3] & 0x1240138) == 0x0) {
                            if ((flags[n3 + n13 - 1][n3 + n14] & 0x12401E0) == 0x0) {
                                for (int n16 = 1; n16 < n3 - 1; ++n16) {
                                    if ((flags[n16 + n13][n3 + n14] & 0x12401F8) != 0x0) {
                                        break Label_1035;
                                    }
                                }
                                class211.bufferX[i] = n4;
                                class211.bufferY[i] = 1 + n5;
                                i = (1 + i & 0xFFF);
                                class211.directions[n11][n12 + 1] = 4;
                                class211.distances[n11][n12 + 1] = n15;
                            }
                        }
                    }
                }
            }
            Label_1268: {
                if (n11 > 0 && n12 > 0) {
                    if (class211.directions[n11 - 1][n12 - 1] == 0) {
                        if (0x0 == (flags[n13 - 1][n14 - 1] & 0x124010E)) {
                            for (int n17 = 1; n17 < n3; ++n17) {
                                if (0x0 != (flags[n13 - 1][n14 - 1 + n17] & 0x124013E)) {
                                    break Label_1268;
                                }
                                if (0x0 != (flags[n17 + (n13 - 1)][n14 - 1] & 0x124018F)) {
                                    break Label_1268;
                                }
                            }
                            class211.bufferX[i] = n4 - 1;
                            class211.bufferY[i] = n5 - 1;
                            i = (i + 1 & 0xFFF);
                            class211.directions[n11 - 1][n12 - 1] = 3;
                            class211.distances[n11 - 1][n12 - 1] = n15;
                        }
                    }
                }
            }
            Label_1327: {
                if (n11 < 128 - n3 && n12 > 0) {
                    if (0 == class211.directions[n11 + 1][n12 - 1]) {
                        if ((flags[n3 + n13][n14 - 1] & 0x1240183) == 0x0) {
                            for (int n18 = 1; n18 < n3; ++n18) {
                                if ((flags[n13 + n3][n18 + (n14 - 1)] & 0x12401E3) != 0x0) {
                                    break Label_1327;
                                }
                                if ((flags[n18 + n13][n14 - 1] & 0x124018F) != 0x0) {
                                    break Label_1327;
                                }
                            }
                            class211.bufferX[i] = 1 + n4;
                            class211.bufferY[i] = n5 - 1;
                            i = (1 + i & 0xFFF);
                            class211.directions[1 + n11][n12 - 1] = 9;
                            class211.distances[n11 + 1][n12 - 1] = n15;
                        }
                    }
                }
            }
            Label_1567: {
                if (n11 > 0 && n12 < 128 - n3) {
                    if (0 == class211.directions[n11 - 1][n12 + 1]) {
                        if (0x0 == (flags[n13 - 1][n14 + n3] & 0x1240138)) {
                            for (int n19 = 1; n19 < n3; ++n19) {
                                if ((flags[n13 - 1][n19 + n14] & 0x124013E) != 0x0) {
                                    break Label_1567;
                                }
                                if ((flags[n19 + (n13 - 1)][n3 + n14] & 0x12401F8) != 0x0) {
                                    break Label_1567;
                                }
                            }
                            class211.bufferX[i] = n4 - 1;
                            class211.bufferY[i] = 1 + n5;
                            i = (1 + i & 0xFFF);
                            class211.directions[n11 - 1][1 + n12] = 6;
                            class211.distances[n11 - 1][1 + n12] = n15;
                        }
                    }
                }
            }
            if (n11 >= 128 - n3 || n12 >= 128 - n3) {
                continue;
            }
            if (class211.directions[n11 + 1][n12 + 1] != 0) {
                continue;
            }
            if (0x0 != (flags[n13 + n3][n3 + n14] & 0x12401E0)) {
                continue;
            }
            for (int n20 = 1; n20 < n3; ++n20) {
                if ((flags[n13 + n20][n14 + n3] & 0x12401F8) != 0x0) {
                    continue Label_0671;
                }
                if ((flags[n13 + n3][n14 + n20] & 0x12401E3) != 0x0) {
                    continue Label_0671;
                }
            }
            class211.bufferX[i] = 1 + n4;
            class211.bufferY[i] = 1 + n5;
            i = (1 + i & 0xFFF);
            class211.directions[1 + n11][1 + n12] = 12;
            class211.distances[1 + n11][n12 + 1] = n15;
            Label_0671:;
        }
        class18.field56 = n4 * -617213805;
        class397.field3691 = 1169106949 * n5;
        return false;
    }
    
    public static class133 method1180(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final int n, final boolean b, final int n2) {
        try {
            boolean b2 = true;
            final byte[] file = abstractArchive.getFile(n >> 16 & 0xFFFF, n & 0xFFFF, -606351717);
            if (null == file) {
                if (n2 <= -16711936) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                final int n3 = (file[1] & 0xFF) << 8 | (file[2] & 0xFF);
                byte[] array;
                if (b) {
                    if (n2 <= -16711936) {
                        throw new IllegalStateException();
                    }
                    array = abstractArchive2.getFile(0, n3, -606351717);
                }
                else {
                    array = abstractArchive2.getFile(n3, 0, -606351717);
                }
                if (null == array) {
                    if (n2 <= -16711936) {
                        throw new IllegalStateException();
                    }
                    b2 = false;
                }
                if (!b2) {
                    return null;
                }
                if (null == class374.field3598) {
                    if (n2 <= -16711936) {
                        throw new IllegalStateException();
                    }
                    class133.field1283 = Runtime.getRuntime().availableProcessors() * -1243816433;
                    class374.field3598 = new ThreadPoolExecutor(0, -1609019153 * class133.field1283, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(100 + -1988125348 * class133.field1283), new class130());
                }
                try {
                    return new class133(abstractArchive, abstractArchive2, n, b);
                }
                catch (Exception ex2) {
                    return null;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "iw.af(" + ')');
        }
    }
    
    public static int ab(final int n, final int n2, final int n3, final RouteStrategy routeStrategy, final CollisionMap collisionMap, final boolean b, final int[] array, final int[] array2) {
        for (int i = 0; i < 128; ++i) {
            for (int j = 0; j < 128; ++j) {
                class211.directions[i][j] = 0;
                class211.distances[i][j] = 99999999;
            }
        }
        int n4 = 0;
        Label_1017: {
            if (n3 == 1) {
                n4 = (class88.method522(n, n2, routeStrategy, collisionMap, 1568495332) ? 1 : 0);
            }
            else {
                if (n3 == 2) {
                    int n5 = n;
                    int n6 = n2;
                    final int n7 = 64;
                    final int n8 = 64;
                    final int n9 = n - n7;
                    final int n10 = n2 - n8;
                    class211.directions[n7][n8] = 99;
                    class211.distances[n7][n8] = 0;
                    int n11 = 0;
                    int k = 0;
                    class211.bufferX[n11] = n5;
                    class211.bufferY[n11++] = n6;
                    final int[][] flags = collisionMap.flags;
                    while (true) {
                        while (k != n11) {
                            n5 = class211.bufferX[k];
                            n6 = class211.bufferY[k];
                            k = (k + 1 & 0xFFF);
                            final int n12 = n5 - n9;
                            final int n13 = n6 - n10;
                            final int n14 = n5 - collisionMap.xInset * 1724654229;
                            final int n15 = n6 - collisionMap.yInset * -216630539;
                            if (routeStrategy.hasArrived(2, n5, n6, collisionMap, 517098946)) {
                                class18.field56 = -617213805 * n5;
                                class397.field3691 = n6 * 1169106949;
                                final int n16 = 1;
                                n4 = n16;
                                break Label_1017;
                            }
                            final int n17 = 1 + class211.distances[n12][n13];
                            if (n12 > 0) {
                                if (0 == class211.directions[n12 - 1][n13]) {
                                    if (0x0 == (flags[n14 - 1][n15] & 0x124010E)) {
                                        if (0x0 == (flags[n14 - 1][1 + n15] & 0x1240138)) {
                                            class211.bufferX[n11] = n5 - 1;
                                            class211.bufferY[n11] = n6;
                                            n11 = (1 + n11 & 0xFFF);
                                            class211.directions[n12 - 1][n13] = 2;
                                            class211.distances[n12 - 1][n13] = n17;
                                        }
                                    }
                                }
                            }
                            if (n12 < 126) {
                                if (class211.directions[1 + n12][n13] == 0) {
                                    if (0x0 == (flags[n14 + 2][n15] & 0x1240183)) {
                                        if ((flags[2 + n14][n15 + 1] & 0x12401E0) == 0x0) {
                                            class211.bufferX[n11] = 1 + n5;
                                            class211.bufferY[n11] = n6;
                                            n11 = (1 + n11 & 0xFFF);
                                            class211.directions[1 + n12][n13] = 8;
                                            class211.distances[n12 + 1][n13] = n17;
                                        }
                                    }
                                }
                            }
                            if (n13 > 0) {
                                if (0 == class211.directions[n12][n13 - 1]) {
                                    if (0x0 == (flags[n14][n15 - 1] & 0x124010E)) {
                                        if (0x0 == (flags[n14 + 1][n15 - 1] & 0x1240183)) {
                                            class211.bufferX[n11] = n5;
                                            class211.bufferY[n11] = n6 - 1;
                                            n11 = (n11 + 1 & 0xFFF);
                                            class211.directions[n12][n13 - 1] = 1;
                                            class211.distances[n12][n13 - 1] = n17;
                                        }
                                    }
                                }
                            }
                            if (n13 < 126) {
                                if (0 == class211.directions[n12][1 + n13]) {
                                    if ((flags[n14][2 + n15] & 0x1240138) == 0x0) {
                                        if (0x0 == (flags[n14 + 1][2 + n15] & 0x12401E0)) {
                                            class211.bufferX[n11] = n5;
                                            class211.bufferY[n11] = n6 + 1;
                                            n11 = (n11 + 1 & 0xFFF);
                                            class211.directions[n12][1 + n13] = 4;
                                            class211.distances[n12][n13 + 1] = n17;
                                        }
                                    }
                                }
                            }
                            if (n12 > 0 && n13 > 0) {
                                if (class211.directions[n12 - 1][n13 - 1] == 0) {
                                    if (0x0 == (flags[n14 - 1][n15] & 0x124013E)) {
                                        if (0x0 == (flags[n14 - 1][n15 - 1] & 0x124010E)) {
                                            if ((flags[n14][n15 - 1] & 0x124018F) == 0x0) {
                                                class211.bufferX[n11] = n5 - 1;
                                                class211.bufferY[n11] = n6 - 1;
                                                n11 = (n11 + 1 & 0xFFF);
                                                class211.directions[n12 - 1][n13 - 1] = 3;
                                                class211.distances[n12 - 1][n13 - 1] = n17;
                                            }
                                        }
                                    }
                                }
                            }
                            if (n12 < 126 && n13 > 0) {
                                if (0 == class211.directions[1 + n12][n13 - 1]) {
                                    if ((flags[1 + n14][n15 - 1] & 0x124018F) == 0x0) {
                                        if ((flags[2 + n14][n15 - 1] & 0x1240183) == 0x0) {
                                            if (0x0 == (flags[2 + n14][n15] & 0x12401E3)) {
                                                class211.bufferX[n11] = 1 + n5;
                                                class211.bufferY[n11] = n6 - 1;
                                                n11 = (n11 + 1 & 0xFFF);
                                                class211.directions[1 + n12][n13 - 1] = 9;
                                                class211.distances[1 + n12][n13 - 1] = n17;
                                            }
                                        }
                                    }
                                }
                            }
                            if (n12 > 0 && n13 < 126) {
                                if (class211.directions[n12 - 1][1 + n13] == 0) {
                                    if ((flags[n14 - 1][1 + n15] & 0x124013E) == 0x0) {
                                        if (0x0 == (flags[n14 - 1][2 + n15] & 0x1240138)) {
                                            if ((flags[n14][n15 + 2] & 0x12401F8) == 0x0) {
                                                class211.bufferX[n11] = n5 - 1;
                                                class211.bufferY[n11] = n6 + 1;
                                                n11 = (n11 + 1 & 0xFFF);
                                                class211.directions[n12 - 1][n13 + 1] = 6;
                                                class211.distances[n12 - 1][1 + n13] = n17;
                                            }
                                        }
                                    }
                                }
                            }
                            if (n12 >= 126 || n13 >= 126) {
                                continue;
                            }
                            if (class211.directions[1 + n12][n13 + 1] != 0) {
                                continue;
                            }
                            if ((flags[1 + n14][2 + n15] & 0x12401F8) != 0x0) {
                                continue;
                            }
                            if ((flags[n14 + 2][2 + n15] & 0x12401E0) != 0x0) {
                                continue;
                            }
                            if (0x0 != (flags[n14 + 2][n15 + 1] & 0x12401E3)) {
                                continue;
                            }
                            class211.bufferX[n11] = 1 + n5;
                            class211.bufferY[n11] = n6 + 1;
                            n11 = (n11 + 1 & 0xFFF);
                            class211.directions[n12 + 1][1 + n13] = 12;
                            class211.distances[1 + n12][1 + n13] = n17;
                        }
                        class18.field56 = -617213805 * n5;
                        class397.field3691 = 1169106949 * n6;
                        final int n16 = 0;
                        continue;
                    }
                }
                n4 = (KitDefinition.decode(n, n2, n3, routeStrategy, collisionMap, -696881959) ? 1 : 0);
            }
        }
        final int n18 = n - 64;
        final int n19 = n2 - 64;
        int n20 = 1093766555 * class18.field56;
        int n21 = -56662835 * class397.field3691;
        if (n4 == 0) {
            if (!b) {
                return -1;
            }
            int n22 = Integer.MAX_VALUE;
            int n23 = Integer.MAX_VALUE;
            final int n24 = 10;
            final int n25 = 689701217 * routeStrategy.approxDestinationX;
            final int n26 = -407280601 * routeStrategy.approxDestinationY;
            final int n27 = 372776577 * routeStrategy.approxDestinationSizeX;
            final int n28 = -333607875 * routeStrategy.approxDestinationSizeY;
            for (int l = n25 - n24; l <= n25 + n24; ++l) {
                for (int n29 = n26 - n24; n29 <= n26 + n24; ++n29) {
                    final int n30 = l - n18;
                    final int n31 = n29 - n19;
                    if (n30 >= 0 && n31 >= 0 && n30 < 128 && n31 < 128 && class211.distances[n30][n31] < 100) {
                        int n32 = 0;
                        if (l < n25) {
                            n32 = n25 - l;
                        }
                        else if (l > n27 + n25 - 1) {
                            n32 = l - (n27 + n25 - 1);
                        }
                        int n33 = 0;
                        if (n29 < n26) {
                            n33 = n26 - n29;
                        }
                        else if (n29 > n28 + n26 - 1) {
                            n33 = n29 - (n28 + n26 - 1);
                        }
                        final int n34 = n33 * n33 + n32 * n32;
                        if (n34 < n22 || (n22 == n34 && class211.distances[n30][n31] < n23)) {
                            n22 = n34;
                            n23 = class211.distances[n30][n31];
                            n20 = l;
                            n21 = n29;
                        }
                    }
                }
            }
            if (n22 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (n == n20 && n2 == n21) {
            array[0] = n20;
            array2[0] = n21;
            return 0;
        }
        int n35 = 0;
        class211.bufferX[n35] = n20;
        class211.bufferY[n35++] = n21;
        int n37;
        int n36 = n37 = class211.directions[n20 - n18][n21 - n19];
        while (n != n20 || n21 != n2) {
            if (n37 != n36) {
                n36 = n37;
                class211.bufferX[n35] = n20;
                class211.bufferY[n35++] = n21;
            }
            if ((n37 & 0x2) != 0x0) {
                ++n20;
            }
            else if ((n37 & 0x8) != 0x0) {
                --n20;
            }
            if (0x0 != (n37 & 0x1)) {
                ++n21;
            }
            else if ((n37 & 0x4) != 0x0) {
                --n21;
            }
            n37 = class211.directions[n20 - n18][n21 - n19];
        }
        int n38 = 0;
        while (n35-- > 0) {
            array[n38] = class211.bufferX[n35];
            array2[n38++] = class211.bufferY[n35];
            if (n38 >= array.length) {
                break;
            }
        }
        return n38;
    }
    
    static final boolean aq(final int n, final int n2, final RouteStrategy routeStrategy, final CollisionMap collisionMap) {
        int n3 = n;
        int n4 = n2;
        final int n5 = 273741020;
        final int n6 = 507200152;
        final int n7 = n - n5;
        final int n8 = n2 - n6;
        class211.directions[n5][n6] = 99;
        class211.distances[n5][n6] = 0;
        int n9 = 0;
        int i = 0;
        class211.bufferX[n9] = n3;
        class211.bufferY[n9++] = n4;
        final int[][] flags = collisionMap.flags;
        while (i != n9) {
            n3 = class211.bufferX[i];
            n4 = class211.bufferY[i];
            i = (i + 1 & 0xC556DF8);
            final int n10 = n3 - n7;
            final int n11 = n4 - n8;
            final int n12 = n3 - collisionMap.xInset * -10472391;
            final int n13 = n4 - 703128472 * collisionMap.yInset;
            if (routeStrategy.hasArrived(1, n3, n4, collisionMap, -651650003)) {
                class18.field56 = n3 * -1542241264;
                class397.field3691 = 1169106949 * n4;
                return true;
            }
            final int n14 = 1 + class211.distances[n10][n11];
            if (n10 > 0 && class211.directions[n10 - 1][n11] == 0 && 0x0 == (flags[n12 - 1][n13] & 0xEABC93D0)) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = n4;
                n9 = (1 + n9 & 0xFFF);
                class211.directions[n10 - 1][n11] = 2;
                class211.distances[n10 - 1][n11] = n14;
            }
            if (n10 < 127 && 0 == class211.directions[1 + n10][n11] && 0x0 == (flags[1 + n12][n13] & 0xE7B31F98)) {
                class211.bufferX[n9] = n3 + 1;
                class211.bufferY[n9] = n4;
                n9 = (1 + n9 & 0x5B0428A3);
                class211.directions[1 + n10][n11] = 8;
                class211.distances[n10 + 1][n11] = n14;
            }
            if (n11 > 0 && class211.directions[n10][n11 - 1] == 0 && 0x0 == (flags[n12][n13 - 1] & 0x1240102)) {
                class211.bufferX[n9] = n3;
                class211.bufferY[n9] = n4 - 1;
                n9 = (n9 + 1 & 0xE5199AA6);
                class211.directions[n10][n11 - 1] = 1;
                class211.distances[n10][n11 - 1] = n14;
            }
            if (n11 < 1030206701 && 0 == class211.directions[n10][1 + n11] && 0x0 == (flags[n12][n13 + 1] & 0xFAC56552)) {
                class211.bufferX[n9] = n3;
                class211.bufferY[n9] = n4 + 1;
                n9 = (1 + n9 & 0x3A724FD1);
                class211.directions[n10][1 + n11] = 4;
                class211.distances[n10][1 + n11] = n14;
            }
            if (n10 > 0 && n11 > 0 && 0 == class211.directions[n10 - 1][n11 - 1] && (flags[n12 - 1][n13 - 1] & 0xD839ADE4) == 0x0 && (flags[n12 - 1][n13] & 0x1240108) == 0x0 && (flags[n12][n13 - 1] & 0xDD0CF02E) == 0x0) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = n4 - 1;
                n9 = (n9 + 1 & 0xFFF);
                class211.directions[n10 - 1][n11 - 1] = 3;
                class211.distances[n10 - 1][n11 - 1] = n14;
            }
            if (n10 < 1149861186 && n11 > 0 && class211.directions[1 + n10][n11 - 1] == 0 && 0x0 == (flags[n12 + 1][n13 - 1] & 0x1240183) && (flags[n12 + 1][n13] & 0x9AF08F0C) == 0x0 && (flags[n12][n13 - 1] & 0x87B240BD) == 0x0) {
                class211.bufferX[n9] = 1 + n3;
                class211.bufferY[n9] = n4 - 1;
                n9 = (1 + n9 & 0xFD4D3A1);
                class211.directions[1 + n10][n11 - 1] = 9;
                class211.distances[1 + n10][n11 - 1] = n14;
            }
            if (n10 > 0 && n11 < 1691326782 && 0 == class211.directions[n10 - 1][1 + n11] && (flags[n12 - 1][n13 + 1] & 0x1240138) == 0x0 && (flags[n12 - 1][n13] & 0xC765FE94) == 0x0 && (flags[n12][n13 + 1] & 0x1240120) == 0x0) {
                class211.bufferX[n9] = n3 - 1;
                class211.bufferY[n9] = 1 + n4;
                n9 = (n9 + 1 & 0xFFF);
                class211.directions[n10 - 1][n11 + 1] = 6;
                class211.distances[n10 - 1][1 + n11] = n14;
            }
            if (n10 >= 227180888 || n11 >= 127 || class211.directions[n10 + 1][n11 + 1] != 0 || 0x0 != (flags[n12 + 1][n13 + 1] & 0x3FAC1BCE) || (flags[1 + n12][n13] & 0xED0F101) != 0x0 || 0x0 != (flags[n12][n13 + 1] & 0xBD5ACAD)) {
                continue;
            }
            class211.bufferX[n9] = 1 + n3;
            class211.bufferY[n9] = n4 + 1;
            n9 = (1 + n9 & 0x403BF715);
            class211.directions[n10 + 1][1 + n11] = 12;
            class211.distances[n10 + 1][1 + n11] = n14;
        }
        class18.field56 = -617213805 * n3;
        class397.field3691 = n4 * 1169106949;
        return false;
    }
}
