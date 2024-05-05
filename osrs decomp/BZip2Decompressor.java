// 
// Decompiled by Procyon v0.5.36
// 

public final class BZip2Decompressor
{
    static final int au = 1;
    static final int ab = 6;
    static final int aw = 23;
    static final int ac = 0;
    static BZip2State BZip2Decompressor_state;
    static final int an = 16;
    static final int aq = 50;
    static final int af = 4096;
    
    BZip2Decompressor() throws Throwable {
        throw new Error();
    }
    
    static {
        BZip2Decompressor.BZip2Decompressor_state = new BZip2State();
    }
    
    static void ad(final BZip2State bZip2State) {
        bZip2State.nInUse = 0;
        for (int i = 0; i < 256; ++i) {
            if (bZip2State.inUse[i]) {
                bZip2State.seqToUnseq[bZip2State.nInUse * -1198613029] = (byte)i;
                bZip2State.nInUse -= 1808394669;
            }
        }
    }
    
    static void ae(final int[] array, final int[] array2, final int[] array3, final byte[] array4, final int n, final int n2, final int n3) {
        int n4 = 0;
        for (int i = n; i <= n2; ++i) {
            for (int j = 0; j < n3; ++j) {
                if (array4[j] == i) {
                    array3[n4] = j;
                    ++n4;
                }
            }
        }
        for (int k = 0; k < 23; ++k) {
            array2[k] = 0;
        }
        for (int l = 0; l < n3; ++l) {
            final int n5 = array4[l] + 1;
            ++array2[n5];
        }
        for (int n6 = 1; n6 < 23; ++n6) {
            final int n7 = n6;
            array2[n7] += array2[n6 - 1];
        }
        for (int n8 = 0; n8 < 23; ++n8) {
            array[n8] = 0;
        }
        int n9 = 0;
        for (int n10 = n; n10 <= n2; ++n10) {
            final int n11 = n9 + (array2[n10 + 1] - array2[n10]);
            array[n10] = n11 - 1;
            n9 = n11 << 1;
        }
        for (int n12 = n + 1; n12 <= n2; ++n12) {
            array2[n12] = (array[n12 - 1] + 1 << 1) - array2[n12];
        }
    }
    
    static void ao(final BZip2State bZip2State) {
        byte out_char = bZip2State.out_char;
        int n = bZip2State.su_rNToGo * -845006579;
        int i = bZip2State.nblocks_used * -1752794807;
        int n2 = bZip2State.su_ch2 * -152862273;
        final int[] bZip2Decompressor_block = class206.BZip2Decompressor_block;
        int n3 = bZip2State.field4074 * 1540039981;
        final byte[] outputArray = bZip2State.outputArray;
        int n4 = bZip2State.next_out * -642536903;
        final int n5;
        int j = n5 = bZip2State.outputLength * -1452165841;
        final int n6 = bZip2State.field4092 * 311916497 + 1;
    Label_0515:
        while (true) {
            Label_0174: {
                if (n > 0) {
                    while (j != 0) {
                        if (n == 1) {
                            if (j == 0) {
                                n = 1;
                                break;
                            }
                            outputArray[n4] = out_char;
                            ++n4;
                            --j;
                            break Label_0174;
                        }
                        else {
                            outputArray[n4] = out_char;
                            --n;
                            ++n4;
                            --j;
                        }
                    }
                    break;
                }
            }
            while (i != n6) {
                out_char = (byte)n2;
                final int n7 = bZip2Decompressor_block[n3];
                final byte b = (byte)n7;
                n3 = n7 >> 8;
                ++i;
                if (b != n2) {
                    n2 = b;
                    if (j == 0) {
                        n = 1;
                        break Label_0515;
                    }
                    outputArray[n4] = out_char;
                    ++n4;
                    --j;
                }
                else if (i == n6) {
                    if (j == 0) {
                        n = 1;
                        break Label_0515;
                    }
                    outputArray[n4] = out_char;
                    ++n4;
                    --j;
                }
                else {
                    n = 2;
                    final int n8 = bZip2Decompressor_block[n3];
                    final byte b2 = (byte)n8;
                    n3 = n8 >> 8;
                    if (++i == n6) {
                        continue Label_0515;
                    }
                    if (b2 != n2) {
                        n2 = b2;
                        continue Label_0515;
                    }
                    n = 3;
                    final int n9 = bZip2Decompressor_block[n3];
                    final byte b3 = (byte)n9;
                    n3 = n9 >> 8;
                    if (++i == n6) {
                        continue Label_0515;
                    }
                    if (b3 != n2) {
                        n2 = b3;
                        continue Label_0515;
                    }
                    final int n10 = bZip2Decompressor_block[n3];
                    final byte b4 = (byte)n10;
                    final int n11 = n10 >> 8;
                    ++i;
                    n = (b4 & 0xFF) + 4;
                    final int n12 = bZip2Decompressor_block[n11];
                    n2 = (byte)n12;
                    n3 = n12 >> 8;
                    ++i;
                    continue Label_0515;
                }
            }
            n = 0;
            break;
        }
        final int n13 = bZip2State.field4067 * -1259159999;
        bZip2State.field4067 += (n5 - j) * 1808552385;
        if (bZip2State.field4067 * -1259159999 < n13) {}
        bZip2State.out_char = out_char;
        bZip2State.su_rNToGo = n * 1012547013;
        bZip2State.nblocks_used = i * 1591462137;
        bZip2State.su_ch2 = n2 * 1585278527;
        class206.BZip2Decompressor_block = bZip2Decompressor_block;
        bZip2State.field4074 = n3 * -445680987;
        bZip2State.outputArray = outputArray;
        bZip2State.next_out = n4 * -1766382583;
        bZip2State.outputLength = j * -1652051505;
    }
    
    public static int at(final byte[] outputArray, int n, final byte[] inputArray, final int n2, final int n3) {
        synchronized (BZip2Decompressor.BZip2Decompressor_state) {
            BZip2Decompressor.BZip2Decompressor_state.inputArray = inputArray;
            BZip2Decompressor.BZip2Decompressor_state.nextByte = n3 * -294994265;
            BZip2Decompressor.BZip2Decompressor_state.outputArray = outputArray;
            BZip2Decompressor.BZip2Decompressor_state.next_out = 0;
            BZip2Decompressor.BZip2Decompressor_state.outputLength = n * -1652051505;
            BZip2Decompressor.BZip2Decompressor_state.bsLive = 0;
            BZip2Decompressor.BZip2Decompressor_state.bsBuff = 0;
            BZip2Decompressor.BZip2Decompressor_state.nextBit_unused = 0;
            BZip2Decompressor.BZip2Decompressor_state.field4067 = 0;
            BZip2Decompressor_decompress(BZip2Decompressor.BZip2Decompressor_state);
            n -= BZip2Decompressor.BZip2Decompressor_state.outputLength * -1452165841;
            BZip2Decompressor.BZip2Decompressor_state.inputArray = null;
            BZip2Decompressor.BZip2Decompressor_state.outputArray = null;
            return n;
        }
    }
    
    static int ak(final int n, final BZip2State bZip2State) {
        while (bZip2State.bsLive * 481867753 < n) {
            bZip2State.bsBuff = (bZip2State.bsBuff * -550783029 << 8 | (bZip2State.inputArray[bZip2State.nextByte * 755196946] & 0x428B408B)) * -1398660307;
            bZip2State.bsLive -= 1490645908;
            bZip2State.nextByte -= 294994265;
            bZip2State.nextBit_unused -= 806810571;
            if (bZip2State.nextBit_unused * 807874955 == 0) {
                continue;
            }
        }
        final int n2 = bZip2State.bsBuff * -993525011 >> bZip2State.bsLive * -208048185 - n & (1 << n) - 1;
        bZip2State.bsLive -= n * -1870501974;
        return n2;
    }
    
    static byte av(final BZip2State bZip2State) {
        return (byte)BZip2Decompressor_readBits(8, bZip2State);
    }
    
    static int as(final int n, final BZip2State bZip2State) {
        while (bZip2State.bsLive * -208048185 < n) {
            bZip2State.bsBuff = (bZip2State.bsBuff * -993525011 << 8 | (bZip2State.inputArray[bZip2State.nextByte * 1648560407] & 0xFF)) * -348869915;
            bZip2State.bsLive -= 394457160;
            bZip2State.nextByte -= 294994265;
            bZip2State.nextBit_unused -= 806810571;
            if (bZip2State.nextBit_unused * -1956977123 == 0) {
                continue;
            }
        }
        final int n2 = bZip2State.bsBuff * -993525011 >> bZip2State.bsLive * -208048185 - n & (1 << n) - 1;
        bZip2State.bsLive -= n * -1123048969;
        return n2;
    }
    
    static int az(final int n, final BZip2State bZip2State) {
        while (bZip2State.bsLive * -208048185 < n) {
            bZip2State.bsBuff = (bZip2State.bsBuff * -993525011 << 8 | (bZip2State.inputArray[bZip2State.nextByte * 1648560407] & 0xFF)) * -348869915;
            bZip2State.bsLive -= 394457160;
            bZip2State.nextByte -= 294994265;
            bZip2State.nextBit_unused -= 806810571;
            if (bZip2State.nextBit_unused * -1956977123 == 0) {
                continue;
            }
        }
        final int n2 = bZip2State.bsBuff * -993525011 >> bZip2State.bsLive * -208048185 - n & (1 << n) - 1;
        bZip2State.bsLive -= n * -1123048969;
        return n2;
    }
    
    static void ax(final BZip2State bZip2State) {
        int n = 0;
        int[] array = null;
        int[] array2 = null;
        int[] array3 = null;
        bZip2State.blockSize100k = -240280401;
        if (class206.BZip2Decompressor_block == null) {
            class206.BZip2Decompressor_block = new int[bZip2State.blockSize100k * -2133275808];
        }
        int i = 1;
        while (i != 0) {
            if (BZip2Decompressor_readNextByte(bZip2State) == 23) {
                return;
            }
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            if (BZip2Decompressor_readNextBit(bZip2State) != 0) {}
            bZip2State.originalPointer = 0;
            bZip2State.originalPointer = (bZip2State.originalPointer * 463465659 << 8 | (BZip2Decompressor_readNextByte(bZip2State) & 0xFF)) * -301762445;
            bZip2State.originalPointer = (bZip2State.originalPointer * 463465659 << 8 | (BZip2Decompressor_readNextByte(bZip2State) & 0xFF)) * -301762445;
            bZip2State.originalPointer = (bZip2State.originalPointer * 463465659 << 8 | (BZip2Decompressor_readNextByte(bZip2State) & 0xFF)) * -301762445;
            for (int j = 0; j < 16; ++j) {
                if (BZip2Decompressor_readNextBit(bZip2State) == 1) {
                    bZip2State.inUse16[j] = true;
                }
                else {
                    bZip2State.inUse16[j] = false;
                }
            }
            for (int k = 0; k < 256; ++k) {
                bZip2State.inUse[k] = false;
            }
            for (int l = 0; l < 16; ++l) {
                if (bZip2State.inUse16[l]) {
                    for (int n2 = 0; n2 < 16; ++n2) {
                        if (BZip2Decompressor_readNextBit(bZip2State) == 1) {
                            bZip2State.inUse[l * 16 + n2] = true;
                        }
                    }
                }
            }
            makeMaps(bZip2State);
            final int n3 = bZip2State.nInUse * -1198613029 + 2;
            final int bZip2Decompressor_readBits = BZip2Decompressor_readBits(3, bZip2State);
            final int bZip2Decompressor_readBits2 = BZip2Decompressor_readBits(15, bZip2State);
            for (int n4 = 0; n4 < bZip2Decompressor_readBits2; ++n4) {
                int n5 = 0;
                while (BZip2Decompressor_readNextBit(bZip2State) != 0) {
                    ++n5;
                }
                bZip2State.selectorMtf[n4] = (byte)n5;
            }
            final byte[] array4 = new byte[6];
            for (byte b = 0; b < bZip2Decompressor_readBits; ++b) {
                array4[b] = b;
            }
            for (int n6 = 0; n6 < bZip2Decompressor_readBits2; ++n6) {
                byte b2 = bZip2State.selectorMtf[n6];
                final byte b3 = array4[b2];
                while (b2 > 0) {
                    array4[b2] = array4[b2 - 1];
                    --b2;
                }
                array4[0] = b3;
                bZip2State.selector[n6] = b3;
            }
            for (byte b4 = 0; b4 < bZip2Decompressor_readBits; ++b4) {
                int bZip2Decompressor_readBits3 = BZip2Decompressor_readBits(5, bZip2State);
                for (int n7 = 0; n7 < n3; ++n7) {
                    while (BZip2Decompressor_readNextBit(bZip2State) != 0) {
                        if (BZip2Decompressor_readNextBit(bZip2State) == 0) {
                            ++bZip2Decompressor_readBits3;
                        }
                        else {
                            --bZip2Decompressor_readBits3;
                        }
                    }
                    bZip2State.temp_charArray2d[b4][n7] = (byte)bZip2Decompressor_readBits3;
                }
            }
            for (byte b5 = 0; b5 < bZip2Decompressor_readBits; ++b5) {
                byte b6 = 32;
                byte b7 = 0;
                for (int n8 = 0; n8 < n3; ++n8) {
                    if (bZip2State.temp_charArray2d[b5][n8] > b7) {
                        b7 = bZip2State.temp_charArray2d[b5][n8];
                    }
                    if (bZip2State.temp_charArray2d[b5][n8] < b6) {
                        b6 = bZip2State.temp_charArray2d[b5][n8];
                    }
                }
                BZip2Decompressor_createHuffmanTables(bZip2State.limit[b5], bZip2State.base[b5], bZip2State.perm[b5], bZip2State.temp_charArray2d[b5], b6, b7, n3);
                bZip2State.minLens[b5] = b6;
            }
            final int n9 = bZip2State.nInUse * -1198613029 + 1;
            int n10 = -1;
            int n11 = 0;
            for (int n12 = 0; n12 <= 255; ++n12) {
                bZip2State.unzftab[n12] = 0;
            }
            int n13 = 4095;
            for (int n14 = 15; n14 >= 0; --n14) {
                for (int n15 = 15; n15 >= 0; --n15) {
                    bZip2State.ll8[n13] = (byte)(n14 * 16 + n15);
                    --n13;
                }
                bZip2State.getAndMoveToFrontDecode_yy[n14] = n13 + 1;
            }
            int n16 = 0;
            if (n11 == 0) {
                ++n10;
                n11 = 50;
                final byte b8 = bZip2State.selector[n10];
                n = bZip2State.minLens[b8];
                array = bZip2State.limit[b8];
                array3 = bZip2State.perm[b8];
                array2 = bZip2State.base[b8];
            }
            --n11;
            int n17;
            int bZip2Decompressor_readBits4;
            for (n17 = n, bZip2Decompressor_readBits4 = BZip2Decompressor_readBits(n17, bZip2State); bZip2Decompressor_readBits4 > array[n17]; ++n17, bZip2Decompressor_readBits4 = (bZip2Decompressor_readBits4 << 1 | BZip2Decompressor_readNextBit(bZip2State))) {}
            int n31;
            int bZip2Decompressor_readBits5;
            for (int n18 = array3[bZip2Decompressor_readBits4 - array2[n17]]; n18 != n9; n18 = array3[bZip2Decompressor_readBits5 - array2[n31]]) {
                if (n18 != 0 && n18 != 1) {
                    int n19 = n18 - 1;
                    byte b9;
                    if (n19 < 16) {
                        final int n20 = bZip2State.getAndMoveToFrontDecode_yy[0];
                        b9 = bZip2State.ll8[n20 + n19];
                        while (n19 > 3) {
                            final int n21 = n20 + n19;
                            bZip2State.ll8[n21] = bZip2State.ll8[n21 - 1];
                            bZip2State.ll8[n21 - 1] = bZip2State.ll8[n21 - 2];
                            bZip2State.ll8[n21 - 2] = bZip2State.ll8[n21 - 3];
                            bZip2State.ll8[n21 - 3] = bZip2State.ll8[n21 - 4];
                            n19 -= 4;
                        }
                        while (n19 > 0) {
                            bZip2State.ll8[n20 + n19] = bZip2State.ll8[n20 + n19 - 1];
                            --n19;
                        }
                        bZip2State.ll8[n20] = b9;
                    }
                    else {
                        int n22 = n19 / 16;
                        int n23 = bZip2State.getAndMoveToFrontDecode_yy[n22] + n19 % 16;
                        b9 = bZip2State.ll8[n23];
                        while (n23 > bZip2State.getAndMoveToFrontDecode_yy[n22]) {
                            bZip2State.ll8[n23] = bZip2State.ll8[n23 - 1];
                            --n23;
                        }
                        final int[] getAndMoveToFrontDecode_yy = bZip2State.getAndMoveToFrontDecode_yy;
                        final int n24 = n22;
                        ++getAndMoveToFrontDecode_yy[n24];
                        while (n22 > 0) {
                            final int[] getAndMoveToFrontDecode_yy2 = bZip2State.getAndMoveToFrontDecode_yy;
                            final int n25 = n22;
                            --getAndMoveToFrontDecode_yy2[n25];
                            bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[n22]] = bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[n22 - 1] + 16 - 1];
                            --n22;
                        }
                        final int[] getAndMoveToFrontDecode_yy3 = bZip2State.getAndMoveToFrontDecode_yy;
                        final int n26 = 0;
                        --getAndMoveToFrontDecode_yy3[n26];
                        bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[0]] = b9;
                        if (bZip2State.getAndMoveToFrontDecode_yy[0] == 0) {
                            int n27 = 4095;
                            for (int n28 = 15; n28 >= 0; --n28) {
                                for (int n29 = 15; n29 >= 0; --n29) {
                                    bZip2State.ll8[n27] = bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[n28] + n29];
                                    --n27;
                                }
                                bZip2State.getAndMoveToFrontDecode_yy[n28] = n27 + 1;
                            }
                        }
                    }
                    final int[] unzftab = bZip2State.unzftab;
                    final int n30 = bZip2State.seqToUnseq[b9 & 0xFF] & 0xFF;
                    ++unzftab[n30];
                    class206.BZip2Decompressor_block[n16] = (bZip2State.seqToUnseq[b9 & 0xFF] & 0xFF);
                    ++n16;
                    if (n11 == 0) {
                        ++n10;
                        n11 = 50;
                        final byte b10 = bZip2State.selector[n10];
                        n = bZip2State.minLens[b10];
                        array = bZip2State.limit[b10];
                        array3 = bZip2State.perm[b10];
                        array2 = bZip2State.base[b10];
                    }
                    --n11;
                    for (n31 = n, bZip2Decompressor_readBits5 = BZip2Decompressor_readBits(n31, bZip2State); bZip2Decompressor_readBits5 > array[n31]; ++n31, bZip2Decompressor_readBits5 = (bZip2Decompressor_readBits5 << 1 | BZip2Decompressor_readNextBit(bZip2State))) {}
                }
                else {
                    int n32 = -1;
                    int n33 = 1;
                    do {
                        if (n18 == 0) {
                            n32 += 1 * n33;
                        }
                        else if (n18 == 1) {
                            n32 += 2 * n33;
                        }
                        n33 *= 2;
                        if (n11 == 0) {
                            ++n10;
                            n11 = 50;
                            final byte b11 = bZip2State.selector[n10];
                            n = bZip2State.minLens[b11];
                            array = bZip2State.limit[b11];
                            array3 = bZip2State.perm[b11];
                            array2 = bZip2State.base[b11];
                        }
                        --n11;
                        int n34;
                        int bZip2Decompressor_readBits6;
                        for (n34 = n, bZip2Decompressor_readBits6 = BZip2Decompressor_readBits(n34, bZip2State); bZip2Decompressor_readBits6 > array[n34]; ++n34, bZip2Decompressor_readBits6 = (bZip2Decompressor_readBits6 << 1 | BZip2Decompressor_readNextBit(bZip2State))) {}
                        n18 = array3[bZip2Decompressor_readBits6 - array2[n34]];
                    } while (n18 == 0 || n18 == 1);
                    ++n32;
                    final byte b12 = bZip2State.seqToUnseq[bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[0]] & 0xFF];
                    final int[] unzftab2 = bZip2State.unzftab;
                    final int n35 = b12 & 0xFF;
                    unzftab2[n35] += n32;
                    while (n32 > 0) {
                        class206.BZip2Decompressor_block[n16] = (b12 & 0xFF);
                        ++n16;
                        --n32;
                    }
                }
            }
            bZip2State.su_rNToGo = 0;
            bZip2State.out_char = 0;
            bZip2State.cftab[0] = 0;
            for (int n36 = 1; n36 <= 256; ++n36) {
                bZip2State.cftab[n36] = bZip2State.unzftab[n36 - 1];
            }
            for (int n37 = 1; n37 <= 256; ++n37) {
                final int[] cftab = bZip2State.cftab;
                final int n38 = n37;
                cftab[n38] += bZip2State.cftab[n37 - 1];
            }
            for (int n39 = 0; n39 < n16; ++n39) {
                final byte b13 = (byte)(class206.BZip2Decompressor_block[n39] & 0xFF);
                final int[] bZip2Decompressor_block = class206.BZip2Decompressor_block;
                final int n40 = bZip2State.cftab[b13 & 0xFF];
                bZip2Decompressor_block[n40] |= n39 << 8;
                final int[] cftab2 = bZip2State.cftab;
                final int n41 = b13 & 0xFF;
                ++cftab2[n41];
            }
            bZip2State.field4074 = (class206.BZip2Decompressor_block[bZip2State.originalPointer * 463465659] >> 8) * -445680987;
            bZip2State.nblocks_used = 0;
            bZip2State.field4074 = class206.BZip2Decompressor_block[bZip2State.field4074 * 1540039981] * -445680987;
            bZip2State.su_ch2 = (byte)(bZip2State.field4074 * 1540039981 & 0xFF) * 1585278527;
            bZip2State.field4074 = (bZip2State.field4074 * 1540039981 >> 8) * -445680987;
            bZip2State.nblocks_used += 1591462137;
            bZip2State.field4092 = n16 * 1035354417;
            method2548(bZip2State);
            if (bZip2State.nblocks_used * -1752794807 == bZip2State.field4092 * 311916497 + 1 && bZip2State.su_rNToGo * -845006579 == 0) {
                i = 1;
            }
            else {
                i = 0;
            }
        }
    }
    
    static void ay(final BZip2State bZip2State) {
        byte out_char = bZip2State.out_char;
        int n = bZip2State.su_rNToGo * -845006579;
        int i = bZip2State.nblocks_used * -1752794807;
        int n2 = bZip2State.su_ch2 * -152862273;
        final int[] bZip2Decompressor_block = class206.BZip2Decompressor_block;
        int n3 = bZip2State.field4074 * 1540039981;
        final byte[] outputArray = bZip2State.outputArray;
        int n4 = bZip2State.next_out * -642536903;
        final int n5;
        int j = n5 = bZip2State.outputLength * -1452165841;
        final int n6 = bZip2State.field4092 * 311916497 + 1;
    Label_0179:
        while (true) {
            Label_0071: {
                break Label_0071;
            Label_0167_Outer:
                do {
                    if (n == 1) {
                        if (j == 0) {
                            n = 1;
                        }
                        else {
                            outputArray[n4] = out_char;
                            ++n4;
                            --j;
                        Block_6:
                            while (true) {
                                while (i != n6) {
                                    out_char = (byte)n2;
                                    final int n7 = bZip2Decompressor_block[n3];
                                    final byte b = (byte)n7;
                                    n3 = n7 >> 8;
                                    ++i;
                                    if (b != n2) {
                                        n2 = b;
                                        if (j == 0) {
                                            n = 1;
                                            break Label_0179;
                                        }
                                        outputArray[n4] = out_char;
                                        ++n4;
                                        --j;
                                    }
                                    else if (i == n6) {
                                        if (j == 0) {
                                            n = 1;
                                            break Label_0179;
                                        }
                                        outputArray[n4] = out_char;
                                        ++n4;
                                        --j;
                                    }
                                    else {
                                        n = 2;
                                        final int n8 = bZip2Decompressor_block[n3];
                                        final byte b2 = (byte)n8;
                                        n3 = n8 >> 8;
                                        ++i;
                                        if (i == n6) {
                                            break Label_0071;
                                        }
                                        if (b2 != n2) {
                                            n2 = b2;
                                            break Label_0071;
                                        }
                                        n = 3;
                                        final int n9 = bZip2Decompressor_block[n3];
                                        final byte b3 = (byte)n9;
                                        n3 = n9 >> 8;
                                        ++i;
                                        if (i == n6) {
                                            break Label_0071;
                                        }
                                        if (b3 != n2) {
                                            n2 = b3;
                                            break Label_0071;
                                        }
                                        final int n10 = bZip2Decompressor_block[n3];
                                        final byte b4 = (byte)n10;
                                        final int n11 = n10 >> 8;
                                        ++i;
                                        n = (b4 & 0xFF) + 4;
                                        final int n12 = bZip2Decompressor_block[n11];
                                        n2 = (byte)n12;
                                        n3 = n12 >> 8;
                                        ++i;
                                        break Label_0071;
                                    }
                                }
                                break Block_6;
                                if (n > 0) {
                                    continue Label_0167_Outer;
                                }
                                continue;
                            }
                            n = 0;
                        }
                        final int n13 = bZip2State.field4067 * -1259159999;
                        bZip2State.field4067 += (n5 - j) * 1808552385;
                        if (bZip2State.field4067 * -1259159999 < n13) {}
                        bZip2State.out_char = out_char;
                        bZip2State.su_rNToGo = n * 1012547013;
                        bZip2State.nblocks_used = i * 1591462137;
                        bZip2State.su_ch2 = n2 * 1585278527;
                        class206.BZip2Decompressor_block = bZip2Decompressor_block;
                        bZip2State.field4074 = n3 * -445680987;
                        bZip2State.outputArray = outputArray;
                        bZip2State.next_out = n4 * -1766382583;
                        bZip2State.outputLength = j * -1652051505;
                        return;
                    }
                    outputArray[n4] = out_char;
                    --n;
                    ++n4;
                    --j;
                } while (j != 0);
            }
            continue Label_0179;
        }
    }
    
    public static void ru(final PlayerComposition playerComposition) {
        playerComposition.method1693(playerComposition.bodyColors, playerComposition.field2841, playerComposition.equipment, 1693987821 * playerComposition.npcTransformId, -2131733097 * playerComposition.field2831, 676142866);
    }
    
    static void BZip2Decompressor_decompress(final BZip2State bZip2State) {
        int n = 0;
        int[] array = null;
        int[] array2 = null;
        int[] array3 = null;
        bZip2State.blockSize100k = -240280401;
        if (class206.BZip2Decompressor_block == null) {
            class206.BZip2Decompressor_block = new int[bZip2State.blockSize100k * -2133275808];
        }
        int i = 1;
        while (i != 0) {
            if (BZip2Decompressor_readNextByte(bZip2State) == 23) {
                return;
            }
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            if (BZip2Decompressor_readNextBit(bZip2State) != 0) {}
            bZip2State.originalPointer = 0;
            bZip2State.originalPointer = (bZip2State.originalPointer * 463465659 << 8 | (BZip2Decompressor_readNextByte(bZip2State) & 0xFF)) * -301762445;
            bZip2State.originalPointer = (bZip2State.originalPointer * 463465659 << 8 | (BZip2Decompressor_readNextByte(bZip2State) & 0xFF)) * -301762445;
            bZip2State.originalPointer = (bZip2State.originalPointer * 463465659 << 8 | (BZip2Decompressor_readNextByte(bZip2State) & 0xFF)) * -301762445;
            for (int j = 0; j < 16; ++j) {
                if (BZip2Decompressor_readNextBit(bZip2State) == 1) {
                    bZip2State.inUse16[j] = true;
                }
                else {
                    bZip2State.inUse16[j] = false;
                }
            }
            for (int k = 0; k < 256; ++k) {
                bZip2State.inUse[k] = false;
            }
            for (int l = 0; l < 16; ++l) {
                if (bZip2State.inUse16[l]) {
                    for (int n2 = 0; n2 < 16; ++n2) {
                        if (BZip2Decompressor_readNextBit(bZip2State) == 1) {
                            bZip2State.inUse[l * 16 + n2] = true;
                        }
                    }
                }
            }
            makeMaps(bZip2State);
            final int n3 = bZip2State.nInUse * -1198613029 + 2;
            final int bZip2Decompressor_readBits = BZip2Decompressor_readBits(3, bZip2State);
            final int bZip2Decompressor_readBits2 = BZip2Decompressor_readBits(15, bZip2State);
            for (int n4 = 0; n4 < bZip2Decompressor_readBits2; ++n4) {
                int n5 = 0;
                while (BZip2Decompressor_readNextBit(bZip2State) != 0) {
                    ++n5;
                }
                bZip2State.selectorMtf[n4] = (byte)n5;
            }
            final byte[] array4 = new byte[6];
            for (byte b = 0; b < bZip2Decompressor_readBits; ++b) {
                array4[b] = b;
            }
            for (int n6 = 0; n6 < bZip2Decompressor_readBits2; ++n6) {
                byte b2 = bZip2State.selectorMtf[n6];
                final byte b3 = array4[b2];
                while (b2 > 0) {
                    array4[b2] = array4[b2 - 1];
                    --b2;
                }
                array4[0] = b3;
                bZip2State.selector[n6] = b3;
            }
            for (byte b4 = 0; b4 < bZip2Decompressor_readBits; ++b4) {
                int bZip2Decompressor_readBits3 = BZip2Decompressor_readBits(5, bZip2State);
                for (int n7 = 0; n7 < n3; ++n7) {
                    while (BZip2Decompressor_readNextBit(bZip2State) != 0) {
                        if (BZip2Decompressor_readNextBit(bZip2State) == 0) {
                            ++bZip2Decompressor_readBits3;
                        }
                        else {
                            --bZip2Decompressor_readBits3;
                        }
                    }
                    bZip2State.temp_charArray2d[b4][n7] = (byte)bZip2Decompressor_readBits3;
                }
            }
            for (byte b5 = 0; b5 < bZip2Decompressor_readBits; ++b5) {
                byte b6 = 32;
                byte b7 = 0;
                for (int n8 = 0; n8 < n3; ++n8) {
                    if (bZip2State.temp_charArray2d[b5][n8] > b7) {
                        b7 = bZip2State.temp_charArray2d[b5][n8];
                    }
                    if (bZip2State.temp_charArray2d[b5][n8] < b6) {
                        b6 = bZip2State.temp_charArray2d[b5][n8];
                    }
                }
                BZip2Decompressor_createHuffmanTables(bZip2State.limit[b5], bZip2State.base[b5], bZip2State.perm[b5], bZip2State.temp_charArray2d[b5], b6, b7, n3);
                bZip2State.minLens[b5] = b6;
            }
            final int n9 = bZip2State.nInUse * -1198613029 + 1;
            int n10 = -1;
            int n11 = 0;
            for (int n12 = 0; n12 <= 255; ++n12) {
                bZip2State.unzftab[n12] = 0;
            }
            int n13 = 4095;
            for (int n14 = 15; n14 >= 0; --n14) {
                for (int n15 = 15; n15 >= 0; --n15) {
                    bZip2State.ll8[n13] = (byte)(n14 * 16 + n15);
                    --n13;
                }
                bZip2State.getAndMoveToFrontDecode_yy[n14] = n13 + 1;
            }
            int n16 = 0;
            if (n11 == 0) {
                ++n10;
                n11 = 50;
                final byte b8 = bZip2State.selector[n10];
                n = bZip2State.minLens[b8];
                array = bZip2State.limit[b8];
                array3 = bZip2State.perm[b8];
                array2 = bZip2State.base[b8];
            }
            --n11;
            int n17;
            int bZip2Decompressor_readBits4;
            for (n17 = n, bZip2Decompressor_readBits4 = BZip2Decompressor_readBits(n17, bZip2State); bZip2Decompressor_readBits4 > array[n17]; ++n17, bZip2Decompressor_readBits4 = (bZip2Decompressor_readBits4 << 1 | BZip2Decompressor_readNextBit(bZip2State))) {}
            int n31;
            int bZip2Decompressor_readBits5;
            for (int n18 = array3[bZip2Decompressor_readBits4 - array2[n17]]; n18 != n9; n18 = array3[bZip2Decompressor_readBits5 - array2[n31]]) {
                if (n18 != 0 && n18 != 1) {
                    int n19 = n18 - 1;
                    byte b9;
                    if (n19 < 16) {
                        final int n20 = bZip2State.getAndMoveToFrontDecode_yy[0];
                        b9 = bZip2State.ll8[n20 + n19];
                        while (n19 > 3) {
                            final int n21 = n20 + n19;
                            bZip2State.ll8[n21] = bZip2State.ll8[n21 - 1];
                            bZip2State.ll8[n21 - 1] = bZip2State.ll8[n21 - 2];
                            bZip2State.ll8[n21 - 2] = bZip2State.ll8[n21 - 3];
                            bZip2State.ll8[n21 - 3] = bZip2State.ll8[n21 - 4];
                            n19 -= 4;
                        }
                        while (n19 > 0) {
                            bZip2State.ll8[n20 + n19] = bZip2State.ll8[n20 + n19 - 1];
                            --n19;
                        }
                        bZip2State.ll8[n20] = b9;
                    }
                    else {
                        int n22 = n19 / 16;
                        int n23 = bZip2State.getAndMoveToFrontDecode_yy[n22] + n19 % 16;
                        b9 = bZip2State.ll8[n23];
                        while (n23 > bZip2State.getAndMoveToFrontDecode_yy[n22]) {
                            bZip2State.ll8[n23] = bZip2State.ll8[n23 - 1];
                            --n23;
                        }
                        final int[] getAndMoveToFrontDecode_yy = bZip2State.getAndMoveToFrontDecode_yy;
                        final int n24 = n22;
                        ++getAndMoveToFrontDecode_yy[n24];
                        while (n22 > 0) {
                            final int[] getAndMoveToFrontDecode_yy2 = bZip2State.getAndMoveToFrontDecode_yy;
                            final int n25 = n22;
                            --getAndMoveToFrontDecode_yy2[n25];
                            bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[n22]] = bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[n22 - 1] + 16 - 1];
                            --n22;
                        }
                        final int[] getAndMoveToFrontDecode_yy3 = bZip2State.getAndMoveToFrontDecode_yy;
                        final int n26 = 0;
                        --getAndMoveToFrontDecode_yy3[n26];
                        bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[0]] = b9;
                        if (bZip2State.getAndMoveToFrontDecode_yy[0] == 0) {
                            int n27 = 4095;
                            for (int n28 = 15; n28 >= 0; --n28) {
                                for (int n29 = 15; n29 >= 0; --n29) {
                                    bZip2State.ll8[n27] = bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[n28] + n29];
                                    --n27;
                                }
                                bZip2State.getAndMoveToFrontDecode_yy[n28] = n27 + 1;
                            }
                        }
                    }
                    final int[] unzftab = bZip2State.unzftab;
                    final int n30 = bZip2State.seqToUnseq[b9 & 0xFF] & 0xFF;
                    ++unzftab[n30];
                    class206.BZip2Decompressor_block[n16] = (bZip2State.seqToUnseq[b9 & 0xFF] & 0xFF);
                    ++n16;
                    if (n11 == 0) {
                        ++n10;
                        n11 = 50;
                        final byte b10 = bZip2State.selector[n10];
                        n = bZip2State.minLens[b10];
                        array = bZip2State.limit[b10];
                        array3 = bZip2State.perm[b10];
                        array2 = bZip2State.base[b10];
                    }
                    --n11;
                    for (n31 = n, bZip2Decompressor_readBits5 = BZip2Decompressor_readBits(n31, bZip2State); bZip2Decompressor_readBits5 > array[n31]; ++n31, bZip2Decompressor_readBits5 = (bZip2Decompressor_readBits5 << 1 | BZip2Decompressor_readNextBit(bZip2State))) {}
                }
                else {
                    int n32 = -1;
                    int n33 = 1;
                    do {
                        if (n18 == 0) {
                            n32 += 1 * n33;
                        }
                        else if (n18 == 1) {
                            n32 += 2 * n33;
                        }
                        n33 *= 2;
                        if (n11 == 0) {
                            ++n10;
                            n11 = 50;
                            final byte b11 = bZip2State.selector[n10];
                            n = bZip2State.minLens[b11];
                            array = bZip2State.limit[b11];
                            array3 = bZip2State.perm[b11];
                            array2 = bZip2State.base[b11];
                        }
                        --n11;
                        int n34;
                        int bZip2Decompressor_readBits6;
                        for (n34 = n, bZip2Decompressor_readBits6 = BZip2Decompressor_readBits(n34, bZip2State); bZip2Decompressor_readBits6 > array[n34]; ++n34, bZip2Decompressor_readBits6 = (bZip2Decompressor_readBits6 << 1 | BZip2Decompressor_readNextBit(bZip2State))) {}
                        n18 = array3[bZip2Decompressor_readBits6 - array2[n34]];
                    } while (n18 == 0 || n18 == 1);
                    ++n32;
                    final byte b12 = bZip2State.seqToUnseq[bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[0]] & 0xFF];
                    final int[] unzftab2 = bZip2State.unzftab;
                    final int n35 = b12 & 0xFF;
                    unzftab2[n35] += n32;
                    while (n32 > 0) {
                        class206.BZip2Decompressor_block[n16] = (b12 & 0xFF);
                        ++n16;
                        --n32;
                    }
                }
            }
            bZip2State.su_rNToGo = 0;
            bZip2State.out_char = 0;
            bZip2State.cftab[0] = 0;
            for (int n36 = 1; n36 <= 256; ++n36) {
                bZip2State.cftab[n36] = bZip2State.unzftab[n36 - 1];
            }
            for (int n37 = 1; n37 <= 256; ++n37) {
                final int[] cftab = bZip2State.cftab;
                final int n38 = n37;
                cftab[n38] += bZip2State.cftab[n37 - 1];
            }
            for (int n39 = 0; n39 < n16; ++n39) {
                final byte b13 = (byte)(class206.BZip2Decompressor_block[n39] & 0xFF);
                final int[] bZip2Decompressor_block = class206.BZip2Decompressor_block;
                final int n40 = bZip2State.cftab[b13 & 0xFF];
                bZip2Decompressor_block[n40] |= n39 << 8;
                final int[] cftab2 = bZip2State.cftab;
                final int n41 = b13 & 0xFF;
                ++cftab2[n41];
            }
            bZip2State.field4074 = (class206.BZip2Decompressor_block[bZip2State.originalPointer * 463465659] >> 8) * -445680987;
            bZip2State.nblocks_used = 0;
            bZip2State.field4074 = class206.BZip2Decompressor_block[bZip2State.field4074 * 1540039981] * -445680987;
            bZip2State.su_ch2 = (byte)(bZip2State.field4074 * 1540039981 & 0xFF) * 1585278527;
            bZip2State.field4074 = (bZip2State.field4074 * 1540039981 >> 8) * -445680987;
            bZip2State.nblocks_used += 1591462137;
            bZip2State.field4092 = n16 * 1035354417;
            method2548(bZip2State);
            if (bZip2State.nblocks_used * -1752794807 == bZip2State.field4092 * 311916497 + 1 && bZip2State.su_rNToGo * -845006579 == 0) {
                i = 1;
            }
            else {
                i = 0;
            }
        }
    }
    
    static byte am(final BZip2State bZip2State) {
        return (byte)BZip2Decompressor_readBits(1, bZip2State);
    }
    
    static void BZip2Decompressor_createHuffmanTables(final int[] array, final int[] array2, final int[] array3, final byte[] array4, final int n, final int n2, final int n3) {
        int n4 = 0;
        for (int i = n; i <= n2; ++i) {
            for (int j = 0; j < n3; ++j) {
                if (array4[j] == i) {
                    array3[n4] = j;
                    ++n4;
                }
            }
        }
        for (int k = 0; k < 23; ++k) {
            array2[k] = 0;
        }
        for (int l = 0; l < n3; ++l) {
            final int n5 = array4[l] + 1;
            ++array2[n5];
        }
        for (int n6 = 1; n6 < 23; ++n6) {
            final int n7 = n6;
            array2[n7] += array2[n6 - 1];
        }
        for (int n8 = 0; n8 < 23; ++n8) {
            array[n8] = 0;
        }
        int n9 = 0;
        for (int n10 = n; n10 <= n2; ++n10) {
            final int n11 = n9 + (array2[n10 + 1] - array2[n10]);
            array[n10] = n11 - 1;
            n9 = n11 << 1;
        }
        for (int n12 = n + 1; n12 <= n2; ++n12) {
            array2[n12] = (array[n12 - 1] + 1 << 1) - array2[n12];
        }
    }
    
    static void method2548(final BZip2State bZip2State) {
        byte out_char = bZip2State.out_char;
        int n = bZip2State.su_rNToGo * -845006579;
        int i = bZip2State.nblocks_used * -1752794807;
        int n2 = bZip2State.su_ch2 * -152862273;
        final int[] bZip2Decompressor_block = class206.BZip2Decompressor_block;
        int n3 = bZip2State.field4074 * 1540039981;
        final byte[] outputArray = bZip2State.outputArray;
        int n4 = bZip2State.next_out * -642536903;
        final int n5;
        int j = n5 = bZip2State.outputLength * -1452165841;
        final int n6 = bZip2State.field4092 * 311916497 + 1;
    Label_0518:
        while (true) {
            Label_0188: {
                if (n > 0) {
                    while (j != 0) {
                        if (n == 1) {
                            if (j == 0) {
                                n = 1;
                                break;
                            }
                            outputArray[n4] = out_char;
                            ++n4;
                            --j;
                            break Label_0188;
                        }
                        else {
                            outputArray[n4] = out_char;
                            --n;
                            ++n4;
                            --j;
                        }
                    }
                    break;
                }
            }
            while (i != n6) {
                out_char = (byte)n2;
                final int n7 = bZip2Decompressor_block[n3];
                final byte b = (byte)n7;
                n3 = n7 >> 8;
                ++i;
                if (b != n2) {
                    n2 = b;
                    if (j == 0) {
                        n = 1;
                        break Label_0518;
                    }
                    outputArray[n4] = out_char;
                    ++n4;
                    --j;
                }
                else if (i == n6) {
                    if (j == 0) {
                        n = 1;
                        break Label_0518;
                    }
                    outputArray[n4] = out_char;
                    ++n4;
                    --j;
                }
                else {
                    n = 2;
                    final int n8 = bZip2Decompressor_block[n3];
                    final byte b2 = (byte)n8;
                    n3 = n8 >> 8;
                    if (++i == n6) {
                        continue Label_0518;
                    }
                    if (b2 != n2) {
                        n2 = b2;
                        continue Label_0518;
                    }
                    n = 3;
                    final int n9 = bZip2Decompressor_block[n3];
                    final byte b3 = (byte)n9;
                    n3 = n9 >> 8;
                    ++i;
                    if (i == n6) {
                        continue Label_0518;
                    }
                    if (b3 != n2) {
                        n2 = b3;
                        continue Label_0518;
                    }
                    final int n10 = bZip2Decompressor_block[n3];
                    final byte b4 = (byte)n10;
                    final int n11 = n10 >> 8;
                    ++i;
                    n = (b4 & 0xFF) + 4;
                    final int n12 = bZip2Decompressor_block[n11];
                    n2 = (byte)n12;
                    n3 = n12 >> 8;
                    ++i;
                    continue Label_0518;
                }
            }
            n = 0;
            break;
        }
        final int n13 = bZip2State.field4067 * -1259159999;
        bZip2State.field4067 += (n5 - j) * 1808552385;
        if (bZip2State.field4067 * -1259159999 < n13) {}
        bZip2State.out_char = out_char;
        bZip2State.su_rNToGo = n * 1012547013;
        bZip2State.nblocks_used = i * 1591462137;
        bZip2State.su_ch2 = n2 * 1585278527;
        class206.BZip2Decompressor_block = bZip2Decompressor_block;
        bZip2State.field4074 = n3 * -445680987;
        bZip2State.outputArray = outputArray;
        bZip2State.next_out = n4 * -1766382583;
        bZip2State.outputLength = j * -1652051505;
    }
    
    static byte BZip2Decompressor_readNextByte(final BZip2State bZip2State) {
        return (byte)BZip2Decompressor_readBits(8, bZip2State);
    }
    
    static byte BZip2Decompressor_readNextBit(final BZip2State bZip2State) {
        return (byte)BZip2Decompressor_readBits(1, bZip2State);
    }
    
    public static int aa(final byte[] outputArray, int n, final byte[] inputArray, final int n2, final int n3) {
        synchronized (BZip2Decompressor.BZip2Decompressor_state) {
            BZip2Decompressor.BZip2Decompressor_state.inputArray = inputArray;
            BZip2Decompressor.BZip2Decompressor_state.nextByte = n3 * -294994265;
            BZip2Decompressor.BZip2Decompressor_state.outputArray = outputArray;
            BZip2Decompressor.BZip2Decompressor_state.next_out = 0;
            BZip2Decompressor.BZip2Decompressor_state.outputLength = n * -1652051505;
            BZip2Decompressor.BZip2Decompressor_state.bsLive = 0;
            BZip2Decompressor.BZip2Decompressor_state.bsBuff = 0;
            BZip2Decompressor.BZip2Decompressor_state.nextBit_unused = 0;
            BZip2Decompressor.BZip2Decompressor_state.field4067 = 0;
            BZip2Decompressor_decompress(BZip2Decompressor.BZip2Decompressor_state);
            n -= BZip2Decompressor.BZip2Decompressor_state.outputLength * -1452165841;
            BZip2Decompressor.BZip2Decompressor_state.inputArray = null;
            BZip2Decompressor.BZip2Decompressor_state.outputArray = null;
            return n;
        }
    }
    
    static void ai(final BZip2State bZip2State) {
        int n = 0;
        int[] array = null;
        int[] array2 = null;
        int[] array3 = null;
        bZip2State.blockSize100k = -240280401;
        if (class206.BZip2Decompressor_block == null) {
            class206.BZip2Decompressor_block = new int[bZip2State.blockSize100k * -2133275808];
        }
        int i = 1;
        while (i != 0) {
            if (BZip2Decompressor_readNextByte(bZip2State) == 23) {
                return;
            }
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            if (BZip2Decompressor_readNextBit(bZip2State) != 0) {}
            bZip2State.originalPointer = 0;
            bZip2State.originalPointer = (bZip2State.originalPointer * 463465659 << 8 | (BZip2Decompressor_readNextByte(bZip2State) & 0xFF)) * -301762445;
            bZip2State.originalPointer = (bZip2State.originalPointer * 463465659 << 8 | (BZip2Decompressor_readNextByte(bZip2State) & 0xFF)) * -301762445;
            bZip2State.originalPointer = (bZip2State.originalPointer * 463465659 << 8 | (BZip2Decompressor_readNextByte(bZip2State) & 0xFF)) * -301762445;
            for (int j = 0; j < 16; ++j) {
                if (BZip2Decompressor_readNextBit(bZip2State) == 1) {
                    bZip2State.inUse16[j] = true;
                }
                else {
                    bZip2State.inUse16[j] = false;
                }
            }
            for (int k = 0; k < 256; ++k) {
                bZip2State.inUse[k] = false;
            }
            for (int l = 0; l < 16; ++l) {
                if (bZip2State.inUse16[l]) {
                    for (int n2 = 0; n2 < 16; ++n2) {
                        if (BZip2Decompressor_readNextBit(bZip2State) == 1) {
                            bZip2State.inUse[l * 16 + n2] = true;
                        }
                    }
                }
            }
            makeMaps(bZip2State);
            final int n3 = bZip2State.nInUse * -1198613029 + 2;
            final int bZip2Decompressor_readBits = BZip2Decompressor_readBits(3, bZip2State);
            final int bZip2Decompressor_readBits2 = BZip2Decompressor_readBits(15, bZip2State);
            for (int n4 = 0; n4 < bZip2Decompressor_readBits2; ++n4) {
                int n5 = 0;
                while (BZip2Decompressor_readNextBit(bZip2State) != 0) {
                    ++n5;
                }
                bZip2State.selectorMtf[n4] = (byte)n5;
            }
            final byte[] array4 = new byte[6];
            for (byte b = 0; b < bZip2Decompressor_readBits; ++b) {
                array4[b] = b;
            }
            for (int n6 = 0; n6 < bZip2Decompressor_readBits2; ++n6) {
                byte b2 = bZip2State.selectorMtf[n6];
                final byte b3 = array4[b2];
                while (b2 > 0) {
                    array4[b2] = array4[b2 - 1];
                    --b2;
                }
                array4[0] = b3;
                bZip2State.selector[n6] = b3;
            }
            for (byte b4 = 0; b4 < bZip2Decompressor_readBits; ++b4) {
                int bZip2Decompressor_readBits3 = BZip2Decompressor_readBits(5, bZip2State);
                for (int n7 = 0; n7 < n3; ++n7) {
                    while (BZip2Decompressor_readNextBit(bZip2State) != 0) {
                        if (BZip2Decompressor_readNextBit(bZip2State) == 0) {
                            ++bZip2Decompressor_readBits3;
                        }
                        else {
                            --bZip2Decompressor_readBits3;
                        }
                    }
                    bZip2State.temp_charArray2d[b4][n7] = (byte)bZip2Decompressor_readBits3;
                }
            }
            for (byte b5 = 0; b5 < bZip2Decompressor_readBits; ++b5) {
                byte b6 = 32;
                byte b7 = 0;
                for (int n8 = 0; n8 < n3; ++n8) {
                    if (bZip2State.temp_charArray2d[b5][n8] > b7) {
                        b7 = bZip2State.temp_charArray2d[b5][n8];
                    }
                    if (bZip2State.temp_charArray2d[b5][n8] < b6) {
                        b6 = bZip2State.temp_charArray2d[b5][n8];
                    }
                }
                BZip2Decompressor_createHuffmanTables(bZip2State.limit[b5], bZip2State.base[b5], bZip2State.perm[b5], bZip2State.temp_charArray2d[b5], b6, b7, n3);
                bZip2State.minLens[b5] = b6;
            }
            final int n9 = bZip2State.nInUse * -1198613029 + 1;
            int n10 = -1;
            int n11 = 0;
            for (int n12 = 0; n12 <= 255; ++n12) {
                bZip2State.unzftab[n12] = 0;
            }
            int n13 = 4095;
            for (int n14 = 15; n14 >= 0; --n14) {
                for (int n15 = 15; n15 >= 0; --n15) {
                    bZip2State.ll8[n13] = (byte)(n14 * 16 + n15);
                    --n13;
                }
                bZip2State.getAndMoveToFrontDecode_yy[n14] = n13 + 1;
            }
            int n16 = 0;
            if (n11 == 0) {
                ++n10;
                n11 = 50;
                final byte b8 = bZip2State.selector[n10];
                n = bZip2State.minLens[b8];
                array = bZip2State.limit[b8];
                array3 = bZip2State.perm[b8];
                array2 = bZip2State.base[b8];
            }
            --n11;
            int n17;
            int bZip2Decompressor_readBits4;
            for (n17 = n, bZip2Decompressor_readBits4 = BZip2Decompressor_readBits(n17, bZip2State); bZip2Decompressor_readBits4 > array[n17]; ++n17, bZip2Decompressor_readBits4 = (bZip2Decompressor_readBits4 << 1 | BZip2Decompressor_readNextBit(bZip2State))) {}
            int n31;
            int bZip2Decompressor_readBits5;
            for (int n18 = array3[bZip2Decompressor_readBits4 - array2[n17]]; n18 != n9; n18 = array3[bZip2Decompressor_readBits5 - array2[n31]]) {
                if (n18 != 0 && n18 != 1) {
                    int n19 = n18 - 1;
                    byte b9;
                    if (n19 < 16) {
                        final int n20 = bZip2State.getAndMoveToFrontDecode_yy[0];
                        b9 = bZip2State.ll8[n20 + n19];
                        while (n19 > 3) {
                            final int n21 = n20 + n19;
                            bZip2State.ll8[n21] = bZip2State.ll8[n21 - 1];
                            bZip2State.ll8[n21 - 1] = bZip2State.ll8[n21 - 2];
                            bZip2State.ll8[n21 - 2] = bZip2State.ll8[n21 - 3];
                            bZip2State.ll8[n21 - 3] = bZip2State.ll8[n21 - 4];
                            n19 -= 4;
                        }
                        while (n19 > 0) {
                            bZip2State.ll8[n20 + n19] = bZip2State.ll8[n20 + n19 - 1];
                            --n19;
                        }
                        bZip2State.ll8[n20] = b9;
                    }
                    else {
                        int n22 = n19 / 16;
                        int n23 = bZip2State.getAndMoveToFrontDecode_yy[n22] + n19 % 16;
                        b9 = bZip2State.ll8[n23];
                        while (n23 > bZip2State.getAndMoveToFrontDecode_yy[n22]) {
                            bZip2State.ll8[n23] = bZip2State.ll8[n23 - 1];
                            --n23;
                        }
                        final int[] getAndMoveToFrontDecode_yy = bZip2State.getAndMoveToFrontDecode_yy;
                        final int n24 = n22;
                        ++getAndMoveToFrontDecode_yy[n24];
                        while (n22 > 0) {
                            final int[] getAndMoveToFrontDecode_yy2 = bZip2State.getAndMoveToFrontDecode_yy;
                            final int n25 = n22;
                            --getAndMoveToFrontDecode_yy2[n25];
                            bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[n22]] = bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[n22 - 1] + 16 - 1];
                            --n22;
                        }
                        final int[] getAndMoveToFrontDecode_yy3 = bZip2State.getAndMoveToFrontDecode_yy;
                        final int n26 = 0;
                        --getAndMoveToFrontDecode_yy3[n26];
                        bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[0]] = b9;
                        if (bZip2State.getAndMoveToFrontDecode_yy[0] == 0) {
                            int n27 = 4095;
                            for (int n28 = 15; n28 >= 0; --n28) {
                                for (int n29 = 15; n29 >= 0; --n29) {
                                    bZip2State.ll8[n27] = bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[n28] + n29];
                                    --n27;
                                }
                                bZip2State.getAndMoveToFrontDecode_yy[n28] = n27 + 1;
                            }
                        }
                    }
                    final int[] unzftab = bZip2State.unzftab;
                    final int n30 = bZip2State.seqToUnseq[b9 & 0xFF] & 0xFF;
                    ++unzftab[n30];
                    class206.BZip2Decompressor_block[n16] = (bZip2State.seqToUnseq[b9 & 0xFF] & 0xFF);
                    ++n16;
                    if (n11 == 0) {
                        ++n10;
                        n11 = 50;
                        final byte b10 = bZip2State.selector[n10];
                        n = bZip2State.minLens[b10];
                        array = bZip2State.limit[b10];
                        array3 = bZip2State.perm[b10];
                        array2 = bZip2State.base[b10];
                    }
                    --n11;
                    for (n31 = n, bZip2Decompressor_readBits5 = BZip2Decompressor_readBits(n31, bZip2State); bZip2Decompressor_readBits5 > array[n31]; ++n31, bZip2Decompressor_readBits5 = (bZip2Decompressor_readBits5 << 1 | BZip2Decompressor_readNextBit(bZip2State))) {}
                }
                else {
                    int n32 = -1;
                    int n33 = 1;
                    do {
                        if (n18 == 0) {
                            n32 += 1 * n33;
                        }
                        else if (n18 == 1) {
                            n32 += 2 * n33;
                        }
                        n33 *= 2;
                        if (n11 == 0) {
                            ++n10;
                            n11 = 50;
                            final byte b11 = bZip2State.selector[n10];
                            n = bZip2State.minLens[b11];
                            array = bZip2State.limit[b11];
                            array3 = bZip2State.perm[b11];
                            array2 = bZip2State.base[b11];
                        }
                        --n11;
                        int n34;
                        int bZip2Decompressor_readBits6;
                        for (n34 = n, bZip2Decompressor_readBits6 = BZip2Decompressor_readBits(n34, bZip2State); bZip2Decompressor_readBits6 > array[n34]; ++n34, bZip2Decompressor_readBits6 = (bZip2Decompressor_readBits6 << 1 | BZip2Decompressor_readNextBit(bZip2State))) {}
                        n18 = array3[bZip2Decompressor_readBits6 - array2[n34]];
                    } while (n18 == 0 || n18 == 1);
                    ++n32;
                    final byte b12 = bZip2State.seqToUnseq[bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[0]] & 0xFF];
                    final int[] unzftab2 = bZip2State.unzftab;
                    final int n35 = b12 & 0xFF;
                    unzftab2[n35] += n32;
                    while (n32 > 0) {
                        class206.BZip2Decompressor_block[n16] = (b12 & 0xFF);
                        ++n16;
                        --n32;
                    }
                }
            }
            bZip2State.su_rNToGo = 0;
            bZip2State.out_char = 0;
            bZip2State.cftab[0] = 0;
            for (int n36 = 1; n36 <= 256; ++n36) {
                bZip2State.cftab[n36] = bZip2State.unzftab[n36 - 1];
            }
            for (int n37 = 1; n37 <= 256; ++n37) {
                final int[] cftab = bZip2State.cftab;
                final int n38 = n37;
                cftab[n38] += bZip2State.cftab[n37 - 1];
            }
            for (int n39 = 0; n39 < n16; ++n39) {
                final byte b13 = (byte)(class206.BZip2Decompressor_block[n39] & 0xFF);
                final int[] bZip2Decompressor_block = class206.BZip2Decompressor_block;
                final int n40 = bZip2State.cftab[b13 & 0xFF];
                bZip2Decompressor_block[n40] |= n39 << 8;
                final int[] cftab2 = bZip2State.cftab;
                final int n41 = b13 & 0xFF;
                ++cftab2[n41];
            }
            bZip2State.field4074 = (class206.BZip2Decompressor_block[bZip2State.originalPointer * 463465659] >> 8) * -445680987;
            bZip2State.nblocks_used = 0;
            bZip2State.field4074 = class206.BZip2Decompressor_block[bZip2State.field4074 * 1540039981] * -445680987;
            bZip2State.su_ch2 = (byte)(bZip2State.field4074 * 1540039981 & 0xFF) * 1585278527;
            bZip2State.field4074 = (bZip2State.field4074 * 1540039981 >> 8) * -445680987;
            bZip2State.nblocks_used += 1591462137;
            bZip2State.field4092 = n16 * 1035354417;
            method2548(bZip2State);
            if (bZip2State.nblocks_used * -1752794807 == bZip2State.field4092 * 311916497 + 1 && bZip2State.su_rNToGo * -845006579 == 0) {
                i = 1;
            }
            else {
                i = 0;
            }
        }
    }
    
    static void by(final int[] array, final int[] array2, final int[] array3, final byte[] array4, final int n, final int n2, final int n3) {
        int n4 = 0;
        for (int i = n; i <= n2; ++i) {
            for (int j = 0; j < n3; ++j) {
                if (array4[j] == i) {
                    array3[n4] = j;
                    ++n4;
                }
            }
        }
        for (int k = 0; k < 23; ++k) {
            array2[k] = 0;
        }
        for (int l = 0; l < n3; ++l) {
            final int n5 = array4[l] + 1;
            ++array2[n5];
        }
        for (int n6 = 1; n6 < 23; ++n6) {
            final int n7 = n6;
            array2[n7] += array2[n6 - 1];
        }
        for (int n8 = 0; n8 < 23; ++n8) {
            array[n8] = 0;
        }
        int n9 = 0;
        for (int n10 = n; n10 <= n2; ++n10) {
            final int n11 = n9 + (array2[n10 + 1] - array2[n10]);
            array[n10] = n11 - 1;
            n9 = n11 << 1;
        }
        for (int n12 = n + 1; n12 <= n2; ++n12) {
            array2[n12] = (array[n12 - 1] + 1 << 1) - array2[n12];
        }
    }
    
    static byte ar(final BZip2State bZip2State) {
        return (byte)BZip2Decompressor_readBits(1, bZip2State);
    }
    
    static void ap(final int[] array, final int[] array2, final int[] array3, final byte[] array4, final int n, final int n2, final int n3) {
        int n4 = 0;
        for (int i = n; i <= n2; ++i) {
            for (int j = 0; j < n3; ++j) {
                if (array4[j] == i) {
                    array3[n4] = j;
                    ++n4;
                }
            }
        }
        for (int k = 0; k < 23; ++k) {
            array2[k] = 0;
        }
        for (int l = 0; l < n3; ++l) {
            final int n5 = array4[l] + 1;
            ++array2[n5];
        }
        for (int n6 = 1; n6 < 23; ++n6) {
            final int n7 = n6;
            array2[n7] += array2[n6 - 1];
        }
        for (int n8 = 0; n8 < 23; ++n8) {
            array[n8] = 0;
        }
        int n9 = 0;
        for (int n10 = n; n10 <= n2; ++n10) {
            final int n11 = n9 + (array2[n10 + 1] - array2[n10]);
            array[n10] = n11 - 1;
            n9 = n11 << 1;
        }
        for (int n12 = n + 1; n12 <= n2; ++n12) {
            array2[n12] = (array[n12 - 1] + 1 << 1) - array2[n12];
        }
    }
    
    public static int BZip2Decompressor_decompress(final byte[] outputArray, int n, final byte[] inputArray, final int n2, final int n3) {
        synchronized (BZip2Decompressor.BZip2Decompressor_state) {
            BZip2Decompressor.BZip2Decompressor_state.inputArray = inputArray;
            BZip2Decompressor.BZip2Decompressor_state.nextByte = n3 * -294994265;
            BZip2Decompressor.BZip2Decompressor_state.outputArray = outputArray;
            BZip2Decompressor.BZip2Decompressor_state.next_out = 0;
            BZip2Decompressor.BZip2Decompressor_state.outputLength = n * -1652051505;
            BZip2Decompressor.BZip2Decompressor_state.bsLive = 0;
            BZip2Decompressor.BZip2Decompressor_state.bsBuff = 0;
            BZip2Decompressor.BZip2Decompressor_state.nextBit_unused = 0;
            BZip2Decompressor.BZip2Decompressor_state.field4067 = 0;
            BZip2Decompressor_decompress(BZip2Decompressor.BZip2Decompressor_state);
            n -= BZip2Decompressor.BZip2Decompressor_state.outputLength * -1452165841;
            BZip2Decompressor.BZip2Decompressor_state.inputArray = null;
            BZip2Decompressor.BZip2Decompressor_state.outputArray = null;
            return n;
        }
    }
    
    static int BZip2Decompressor_readBits(final int n, final BZip2State bZip2State) {
        while (bZip2State.bsLive * -208048185 < n) {
            bZip2State.bsBuff = (bZip2State.bsBuff * -993525011 << 8 | (bZip2State.inputArray[bZip2State.nextByte * 1648560407] & 0xFF)) * -348869915;
            bZip2State.bsLive -= 394457160;
            bZip2State.nextByte -= 294994265;
            bZip2State.nextBit_unused -= 806810571;
            if (bZip2State.nextBit_unused * -1956977123 == 0) {
                continue;
            }
        }
        final int n2 = bZip2State.bsBuff * -993525011 >> bZip2State.bsLive * -208048185 - n & (1 << n) - 1;
        bZip2State.bsLive -= n * -1123048969;
        return n2;
    }
    
    static void makeMaps(final BZip2State bZip2State) {
        bZip2State.nInUse = 0;
        for (int i = 0; i < 256; ++i) {
            if (bZip2State.inUse[i]) {
                bZip2State.seqToUnseq[bZip2State.nInUse * -1198613029] = (byte)i;
                bZip2State.nInUse -= 1808394669;
            }
        }
    }
    
    static int aj(final int n, final BZip2State bZip2State) {
        while (bZip2State.bsLive * 404847808 < n) {
            bZip2State.bsBuff = (bZip2State.bsBuff * -993525011 << 8 | (bZip2State.inputArray[bZip2State.nextByte * 1648560407] & 0xFF)) * -348869915;
            bZip2State.bsLive -= 394457160;
            bZip2State.nextByte -= 162781325;
            bZip2State.nextBit_unused -= 226279679;
            if (bZip2State.nextBit_unused * -864465452 == 0) {
                continue;
            }
        }
        final int n2 = bZip2State.bsBuff * -993525011 >> bZip2State.bsLive * -208048185 - n & (1 << n) - 1;
        bZip2State.bsLive -= n * 885550957;
        return n2;
    }
    
    static void ag(final BZip2State bZip2State) {
        int n = 0;
        int[] array = null;
        int[] array2 = null;
        int[] array3 = null;
        bZip2State.blockSize100k = -240280401;
        if (class206.BZip2Decompressor_block == null) {
            class206.BZip2Decompressor_block = new int[bZip2State.blockSize100k * -2133275808];
        }
        int i = 1;
        while (i != 0) {
            if (BZip2Decompressor_readNextByte(bZip2State) == 23) {
                return;
            }
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            BZip2Decompressor_readNextByte(bZip2State);
            if (BZip2Decompressor_readNextBit(bZip2State) != 0) {}
            bZip2State.originalPointer = 0;
            bZip2State.originalPointer = (bZip2State.originalPointer * 463465659 << 8 | (BZip2Decompressor_readNextByte(bZip2State) & 0xFF)) * -301762445;
            bZip2State.originalPointer = (bZip2State.originalPointer * 463465659 << 8 | (BZip2Decompressor_readNextByte(bZip2State) & 0xFF)) * -301762445;
            bZip2State.originalPointer = (bZip2State.originalPointer * 463465659 << 8 | (BZip2Decompressor_readNextByte(bZip2State) & 0xFF)) * -301762445;
            for (int j = 0; j < 16; ++j) {
                if (BZip2Decompressor_readNextBit(bZip2State) == 1) {
                    bZip2State.inUse16[j] = true;
                }
                else {
                    bZip2State.inUse16[j] = false;
                }
            }
            for (int k = 0; k < 256; ++k) {
                bZip2State.inUse[k] = false;
            }
            for (int l = 0; l < 16; ++l) {
                if (bZip2State.inUse16[l]) {
                    for (int n2 = 0; n2 < 16; ++n2) {
                        if (BZip2Decompressor_readNextBit(bZip2State) == 1) {
                            bZip2State.inUse[l * 16 + n2] = true;
                        }
                    }
                }
            }
            makeMaps(bZip2State);
            final int n3 = bZip2State.nInUse * -1198613029 + 2;
            final int bZip2Decompressor_readBits = BZip2Decompressor_readBits(3, bZip2State);
            final int bZip2Decompressor_readBits2 = BZip2Decompressor_readBits(15, bZip2State);
            for (int n4 = 0; n4 < bZip2Decompressor_readBits2; ++n4) {
                int n5 = 0;
                while (BZip2Decompressor_readNextBit(bZip2State) != 0) {
                    ++n5;
                }
                bZip2State.selectorMtf[n4] = (byte)n5;
            }
            final byte[] array4 = new byte[6];
            for (byte b = 0; b < bZip2Decompressor_readBits; ++b) {
                array4[b] = b;
            }
            for (int n6 = 0; n6 < bZip2Decompressor_readBits2; ++n6) {
                byte b2 = bZip2State.selectorMtf[n6];
                final byte b3 = array4[b2];
                while (b2 > 0) {
                    array4[b2] = array4[b2 - 1];
                    --b2;
                }
                array4[0] = b3;
                bZip2State.selector[n6] = b3;
            }
            for (byte b4 = 0; b4 < bZip2Decompressor_readBits; ++b4) {
                int bZip2Decompressor_readBits3 = BZip2Decompressor_readBits(5, bZip2State);
                for (int n7 = 0; n7 < n3; ++n7) {
                    while (BZip2Decompressor_readNextBit(bZip2State) != 0) {
                        if (BZip2Decompressor_readNextBit(bZip2State) == 0) {
                            ++bZip2Decompressor_readBits3;
                        }
                        else {
                            --bZip2Decompressor_readBits3;
                        }
                    }
                    bZip2State.temp_charArray2d[b4][n7] = (byte)bZip2Decompressor_readBits3;
                }
            }
            for (byte b5 = 0; b5 < bZip2Decompressor_readBits; ++b5) {
                byte b6 = 32;
                byte b7 = 0;
                for (int n8 = 0; n8 < n3; ++n8) {
                    if (bZip2State.temp_charArray2d[b5][n8] > b7) {
                        b7 = bZip2State.temp_charArray2d[b5][n8];
                    }
                    if (bZip2State.temp_charArray2d[b5][n8] < b6) {
                        b6 = bZip2State.temp_charArray2d[b5][n8];
                    }
                }
                BZip2Decompressor_createHuffmanTables(bZip2State.limit[b5], bZip2State.base[b5], bZip2State.perm[b5], bZip2State.temp_charArray2d[b5], b6, b7, n3);
                bZip2State.minLens[b5] = b6;
            }
            final int n9 = bZip2State.nInUse * -1198613029 + 1;
            int n10 = -1;
            int n11 = 0;
            for (int n12 = 0; n12 <= 255; ++n12) {
                bZip2State.unzftab[n12] = 0;
            }
            int n13 = 4095;
            for (int n14 = 15; n14 >= 0; --n14) {
                for (int n15 = 15; n15 >= 0; --n15) {
                    bZip2State.ll8[n13] = (byte)(n14 * 16 + n15);
                    --n13;
                }
                bZip2State.getAndMoveToFrontDecode_yy[n14] = n13 + 1;
            }
            int n16 = 0;
            if (n11 == 0) {
                ++n10;
                n11 = 50;
                final byte b8 = bZip2State.selector[n10];
                n = bZip2State.minLens[b8];
                array = bZip2State.limit[b8];
                array3 = bZip2State.perm[b8];
                array2 = bZip2State.base[b8];
            }
            --n11;
            int n17;
            int bZip2Decompressor_readBits4;
            for (n17 = n, bZip2Decompressor_readBits4 = BZip2Decompressor_readBits(n17, bZip2State); bZip2Decompressor_readBits4 > array[n17]; ++n17, bZip2Decompressor_readBits4 = (bZip2Decompressor_readBits4 << 1 | BZip2Decompressor_readNextBit(bZip2State))) {}
            int n31;
            int bZip2Decompressor_readBits5;
            for (int n18 = array3[bZip2Decompressor_readBits4 - array2[n17]]; n18 != n9; n18 = array3[bZip2Decompressor_readBits5 - array2[n31]]) {
                if (n18 != 0 && n18 != 1) {
                    int n19 = n18 - 1;
                    byte b9;
                    if (n19 < 16) {
                        final int n20 = bZip2State.getAndMoveToFrontDecode_yy[0];
                        b9 = bZip2State.ll8[n20 + n19];
                        while (n19 > 3) {
                            final int n21 = n20 + n19;
                            bZip2State.ll8[n21] = bZip2State.ll8[n21 - 1];
                            bZip2State.ll8[n21 - 1] = bZip2State.ll8[n21 - 2];
                            bZip2State.ll8[n21 - 2] = bZip2State.ll8[n21 - 3];
                            bZip2State.ll8[n21 - 3] = bZip2State.ll8[n21 - 4];
                            n19 -= 4;
                        }
                        while (n19 > 0) {
                            bZip2State.ll8[n20 + n19] = bZip2State.ll8[n20 + n19 - 1];
                            --n19;
                        }
                        bZip2State.ll8[n20] = b9;
                    }
                    else {
                        int n22 = n19 / 16;
                        int n23 = bZip2State.getAndMoveToFrontDecode_yy[n22] + n19 % 16;
                        b9 = bZip2State.ll8[n23];
                        while (n23 > bZip2State.getAndMoveToFrontDecode_yy[n22]) {
                            bZip2State.ll8[n23] = bZip2State.ll8[n23 - 1];
                            --n23;
                        }
                        final int[] getAndMoveToFrontDecode_yy = bZip2State.getAndMoveToFrontDecode_yy;
                        final int n24 = n22;
                        ++getAndMoveToFrontDecode_yy[n24];
                        while (n22 > 0) {
                            final int[] getAndMoveToFrontDecode_yy2 = bZip2State.getAndMoveToFrontDecode_yy;
                            final int n25 = n22;
                            --getAndMoveToFrontDecode_yy2[n25];
                            bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[n22]] = bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[n22 - 1] + 16 - 1];
                            --n22;
                        }
                        final int[] getAndMoveToFrontDecode_yy3 = bZip2State.getAndMoveToFrontDecode_yy;
                        final int n26 = 0;
                        --getAndMoveToFrontDecode_yy3[n26];
                        bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[0]] = b9;
                        if (bZip2State.getAndMoveToFrontDecode_yy[0] == 0) {
                            int n27 = 4095;
                            for (int n28 = 15; n28 >= 0; --n28) {
                                for (int n29 = 15; n29 >= 0; --n29) {
                                    bZip2State.ll8[n27] = bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[n28] + n29];
                                    --n27;
                                }
                                bZip2State.getAndMoveToFrontDecode_yy[n28] = n27 + 1;
                            }
                        }
                    }
                    final int[] unzftab = bZip2State.unzftab;
                    final int n30 = bZip2State.seqToUnseq[b9 & 0xFF] & 0xFF;
                    ++unzftab[n30];
                    class206.BZip2Decompressor_block[n16] = (bZip2State.seqToUnseq[b9 & 0xFF] & 0xFF);
                    ++n16;
                    if (n11 == 0) {
                        ++n10;
                        n11 = 50;
                        final byte b10 = bZip2State.selector[n10];
                        n = bZip2State.minLens[b10];
                        array = bZip2State.limit[b10];
                        array3 = bZip2State.perm[b10];
                        array2 = bZip2State.base[b10];
                    }
                    --n11;
                    for (n31 = n, bZip2Decompressor_readBits5 = BZip2Decompressor_readBits(n31, bZip2State); bZip2Decompressor_readBits5 > array[n31]; ++n31, bZip2Decompressor_readBits5 = (bZip2Decompressor_readBits5 << 1 | BZip2Decompressor_readNextBit(bZip2State))) {}
                }
                else {
                    int n32 = -1;
                    int n33 = 1;
                    do {
                        if (n18 == 0) {
                            n32 += 1 * n33;
                        }
                        else if (n18 == 1) {
                            n32 += 2 * n33;
                        }
                        n33 *= 2;
                        if (n11 == 0) {
                            ++n10;
                            n11 = 50;
                            final byte b11 = bZip2State.selector[n10];
                            n = bZip2State.minLens[b11];
                            array = bZip2State.limit[b11];
                            array3 = bZip2State.perm[b11];
                            array2 = bZip2State.base[b11];
                        }
                        --n11;
                        int n34;
                        int bZip2Decompressor_readBits6;
                        for (n34 = n, bZip2Decompressor_readBits6 = BZip2Decompressor_readBits(n34, bZip2State); bZip2Decompressor_readBits6 > array[n34]; ++n34, bZip2Decompressor_readBits6 = (bZip2Decompressor_readBits6 << 1 | BZip2Decompressor_readNextBit(bZip2State))) {}
                        n18 = array3[bZip2Decompressor_readBits6 - array2[n34]];
                    } while (n18 == 0 || n18 == 1);
                    ++n32;
                    final byte b12 = bZip2State.seqToUnseq[bZip2State.ll8[bZip2State.getAndMoveToFrontDecode_yy[0]] & 0xFF];
                    final int[] unzftab2 = bZip2State.unzftab;
                    final int n35 = b12 & 0xFF;
                    unzftab2[n35] += n32;
                    while (n32 > 0) {
                        class206.BZip2Decompressor_block[n16] = (b12 & 0xFF);
                        ++n16;
                        --n32;
                    }
                }
            }
            bZip2State.su_rNToGo = 0;
            bZip2State.out_char = 0;
            bZip2State.cftab[0] = 0;
            for (int n36 = 1; n36 <= 256; ++n36) {
                bZip2State.cftab[n36] = bZip2State.unzftab[n36 - 1];
            }
            for (int n37 = 1; n37 <= 256; ++n37) {
                final int[] cftab = bZip2State.cftab;
                final int n38 = n37;
                cftab[n38] += bZip2State.cftab[n37 - 1];
            }
            for (int n39 = 0; n39 < n16; ++n39) {
                final byte b13 = (byte)(class206.BZip2Decompressor_block[n39] & 0xFF);
                final int[] bZip2Decompressor_block = class206.BZip2Decompressor_block;
                final int n40 = bZip2State.cftab[b13 & 0xFF];
                bZip2Decompressor_block[n40] |= n39 << 8;
                final int[] cftab2 = bZip2State.cftab;
                final int n41 = b13 & 0xFF;
                ++cftab2[n41];
            }
            bZip2State.field4074 = (class206.BZip2Decompressor_block[bZip2State.originalPointer * 463465659] >> 8) * -445680987;
            bZip2State.nblocks_used = 0;
            bZip2State.field4074 = class206.BZip2Decompressor_block[bZip2State.field4074 * 1540039981] * -445680987;
            bZip2State.su_ch2 = (byte)(bZip2State.field4074 * 1540039981 & 0xFF) * 1585278527;
            bZip2State.field4074 = (bZip2State.field4074 * 1540039981 >> 8) * -445680987;
            bZip2State.nblocks_used += 1591462137;
            bZip2State.field4092 = n16 * 1035354417;
            method2548(bZip2State);
            if (bZip2State.nblocks_used * -1752794807 == bZip2State.field4092 * 311916497 + 1 && bZip2State.su_rNToGo * -845006579 == 0) {
                i = 1;
            }
            else {
                i = 0;
            }
        }
    }
    
    static byte ah(final BZip2State bZip2State) {
        return (byte)BZip2Decompressor_readBits(8, bZip2State);
    }
}
