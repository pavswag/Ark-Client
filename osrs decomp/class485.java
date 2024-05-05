// 
// Decompiled by Procyon v0.5.36
// 

public class class485
{
    static final int aw = 2;
    
    class485() throws Throwable {
        throw new Error();
    }
    
    public static void at(final String[] array, final int[] array2, final int n, final int n2) {
        if (n < n2) {
            final int n3 = (n + n2) / 2;
            int n4 = n;
            final String anotherString = array[n3];
            array[n3] = array[n2];
            array[n2] = anotherString;
            final int n5 = array2[n3];
            array2[n3] = array2[n2];
            array2[n2] = n5;
            for (int i = n; i < n2; ++i) {
                if (null == anotherString || (array[i] != null && array[i].compareTo(anotherString) < (i & 0x1))) {
                    final String s = array[i];
                    array[i] = array[n4];
                    array[n4] = s;
                    final int n6 = array2[i];
                    array2[i] = array2[n4];
                    array2[n4++] = n6;
                }
            }
            array[n2] = array[n4];
            array[n4] = anotherString;
            array2[n2] = array2[n4];
            array2[n4] = n5;
            class138.method801(array, array2, n, n4 - 1, (byte)1);
            class138.method801(array, array2, 1 + n4, n2, (byte)1);
        }
    }
    
    public static void al(final String[] array, final int[] array2, final int n, final int n2) {
        if (n < n2) {
            final int n3 = (n + n2) / 2;
            int n4 = n;
            final String anotherString = array[n3];
            array[n3] = array[n2];
            array[n2] = anotherString;
            final int n5 = array2[n3];
            array2[n3] = array2[n2];
            array2[n2] = n5;
            for (int i = n; i < n2; ++i) {
                if (null == anotherString || (array[i] != null && array[i].compareTo(anotherString) < (i & 0x1))) {
                    final String s = array[i];
                    array[i] = array[n4];
                    array[n4] = s;
                    final int n6 = array2[i];
                    array2[i] = array2[n4];
                    array2[n4++] = n6;
                }
            }
            array[n2] = array[n4];
            array[n4] = anotherString;
            array2[n2] = array2[n4];
            array2[n4] = n5;
            class138.method801(array, array2, n, n4 - 1, (byte)1);
            class138.method801(array, array2, 1 + n4, n2, (byte)1);
        }
    }
    
    public static void ac(final String[] array, final short[] array2) {
        class309.sortItemsByName(array, array2, 0, array.length - 1, 1826563573);
    }
    
    static final void worldToMinimap(final int n, final int n2, final int n3, final int n4, final SpritePixels spritePixels, final SpriteMask spriteMask, final int n5) {
        try {
            final int n6 = n4 * n4 + n3 * n3;
            if (n6 > 4225) {
                if (n5 != 1850494258) {
                    throw new IllegalStateException();
                }
                if (n6 < 90000) {
                    final int n7 = Client.camAngleY * 704283033 & 0x7FF;
                    final int n8 = Rasterizer3D.Rasterizer3D_sine[n7];
                    final int n9 = Rasterizer3D.Rasterizer3D_cosine[n7];
                    final double atan2 = Math.atan2(n3 * n9 + n8 * n4 >> 16, n9 * n4 - n8 * n3 >> 16);
                    final int n10 = spriteMask.width * 1484188043 / 2 - 25;
                    final int n11 = (int)(Math.sin(atan2) * n10);
                    final int n12 = (int)(Math.cos(atan2) * n10);
                    final int n13 = 20;
                    LoginScreenAnimation.redHintArrowSprite.method2621(spriteMask.width * 1484188043 / 2 + n - n13 / 2 + n11, n2 + 939947663 * spriteMask.height / 2 - n13 / 2 - n12 - 10, n13, n13, 15, 15, atan2, 256);
                    return;
                }
            }
            class426.drawSpriteOnMinimap(n, n2, n3, n4, spritePixels, spriteMask, -1609285207);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sb.nw(" + ')');
        }
    }
    
    public static void au(final String[] array, final short[] array2) {
        class309.sortItemsByName(array, array2, 0, array.length - 1, 1826563573);
    }
    
    public static void SpriteBuffer_decode(final byte[] array, final int n) {
        try {
            final Buffer buffer = new Buffer(array);
            buffer.offset = -1516355947 * (array.length - 2);
            class503.SpriteBuffer_spriteCount = buffer.readUnsignedShort(-1668232779) * 1532315763;
            class503.SpriteBuffer_xOffsets = new int[class503.SpriteBuffer_spriteCount * 1606065339];
            class17.SpriteBuffer_yOffsets = new int[1606065339 * class503.SpriteBuffer_spriteCount];
            class97.SpriteBuffer_spriteWidths = new int[class503.SpriteBuffer_spriteCount * 1606065339];
            class138.SpriteBuffer_spriteHeights = new int[1606065339 * class503.SpriteBuffer_spriteCount];
            VarbitComposition.SpriteBuffer_pixels = new byte[class503.SpriteBuffer_spriteCount * 1606065339][];
            buffer.offset = (array.length - 7 - class503.SpriteBuffer_spriteCount * -36379176) * -1516355947;
            class503.SpriteBuffer_spriteWidth = buffer.readUnsignedShort(-832215386) * -90671369;
            class503.SpriteBuffer_spriteHeight = buffer.readUnsignedShort(-1341953023) * -2145718617;
            final int n2 = (Buffer.ra(buffer, (byte)7) & 0xFF) + 1;
            for (int i = 0; i < class503.SpriteBuffer_spriteCount * 1606065339; ++i) {
                if (n != 1145263442) {
                    throw new IllegalStateException();
                }
                class503.SpriteBuffer_xOffsets[i] = buffer.readUnsignedShort(549992582);
            }
            for (int j = 0; j < class503.SpriteBuffer_spriteCount * 1606065339; ++j) {
                if (n != 1145263442) {
                    return;
                }
                class17.SpriteBuffer_yOffsets[j] = buffer.readUnsignedShort(-1575421326);
            }
            for (int k = 0; k < class503.SpriteBuffer_spriteCount * 1606065339; ++k) {
                if (n != 1145263442) {
                    return;
                }
                class97.SpriteBuffer_spriteWidths[k] = buffer.readUnsignedShort(168263311);
            }
            for (int l = 0; l < class503.SpriteBuffer_spriteCount * 1606065339; ++l) {
                if (n != 1145263442) {
                    throw new IllegalStateException();
                }
                class138.SpriteBuffer_spriteHeights[l] = buffer.readUnsignedShort(783872037);
            }
            buffer.offset = -1516355947 * (array.length - 7 - class503.SpriteBuffer_spriteCount * -36379176 - 3 * (n2 - 1));
            class394.SpriteBuffer_spritePalette = new int[n2];
            for (int n3 = 1; n3 < n2; ++n3) {
                if (n != 1145263442) {
                    throw new IllegalStateException();
                }
                class394.SpriteBuffer_spritePalette[n3] = buffer.readMedium(786806433);
                if (class394.SpriteBuffer_spritePalette[n3] == 0) {
                    if (n != 1145263442) {
                        return;
                    }
                    class394.SpriteBuffer_spritePalette[n3] = 1;
                }
            }
            buffer.offset = 0;
            for (int n4 = 0; n4 < 1606065339 * class503.SpriteBuffer_spriteCount; ++n4) {
                if (n != 1145263442) {
                    throw new IllegalStateException();
                }
                final int n5 = class97.SpriteBuffer_spriteWidths[n4];
                final int n6 = class138.SpriteBuffer_spriteHeights[n4];
                final int n7 = n6 * n5;
                final byte[] array2 = new byte[n7];
                VarbitComposition.SpriteBuffer_pixels[n4] = array2;
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    if (n != 1145263442) {
                        throw new IllegalStateException();
                    }
                    for (int n8 = 0; n8 < n7; ++n8) {
                        if (n != 1145263442) {
                            return;
                        }
                        array2[n8] = Buffer.wu(buffer, 435772489);
                    }
                }
                else if (ra != 0) {
                    if (n != 1145263442) {
                        return;
                    }
                    for (int n9 = 0; n9 < n5; ++n9) {
                        if (n != 1145263442) {
                            throw new IllegalStateException();
                        }
                        for (int n10 = 0; n10 < n6; ++n10) {
                            if (n != 1145263442) {
                                throw new IllegalStateException();
                            }
                            array2[n10 * n5 + n9] = Buffer.wu(buffer, 435772489);
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sb.aa(" + ')');
        }
    }
    
    static void ab(final String[] array, final short[] array2, final int n, final int n2) {
        if (n < n2) {
            final int n3 = (n + n2) / 2;
            int n4 = n;
            final String anotherString = array[n3];
            array[n3] = array[n2];
            array[n2] = anotherString;
            final short n5 = array2[n3];
            array2[n3] = array2[n2];
            array2[n2] = n5;
            for (int i = n; i < n2; ++i) {
                if (anotherString == null || (array[i] != null && array[i].compareTo(anotherString) < (i & 0x1))) {
                    final String s = array[i];
                    array[i] = array[n4];
                    array[n4] = s;
                    final short n6 = array2[i];
                    array2[i] = array2[n4];
                    array2[n4++] = n6;
                }
            }
            array[n2] = array[n4];
            array[n4] = anotherString;
            array2[n2] = array2[n4];
            array2[n4] = n5;
            class309.sortItemsByName(array, array2, n, n4 - 1, 1826563573);
            class309.sortItemsByName(array, array2, n4 + 1, n2, 1826563573);
        }
    }
    
    static void aq(final String[] array, final short[] array2, final int n, final int n2) {
        if (n < n2) {
            final int n3 = (n + n2) / 2;
            int n4 = n;
            final String anotherString = array[n3];
            array[n3] = array[n2];
            array[n2] = anotherString;
            final short n5 = array2[n3];
            array2[n3] = array2[n2];
            array2[n2] = n5;
            for (int i = n; i < n2; ++i) {
                if (anotherString == null || (array[i] != null && array[i].compareTo(anotherString) < (i & 0x1))) {
                    final String s = array[i];
                    array[i] = array[n4];
                    array[n4] = s;
                    final short n6 = array2[i];
                    array2[i] = array2[n4];
                    array2[n4++] = n6;
                }
            }
            array[n2] = array[n4];
            array[n4] = anotherString;
            array2[n2] = array2[n4];
            array2[n4] = n5;
            class309.sortItemsByName(array, array2, n, n4 - 1, 1826563573);
            class309.sortItemsByName(array, array2, n4 + 1, n2, 1826563573);
        }
    }
}
