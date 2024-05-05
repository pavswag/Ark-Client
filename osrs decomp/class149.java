// 
// Decompiled by Procyon v0.5.36
// 

public class class149 extends class139
{
    final /* synthetic */ class142 this$0;
    String field1349;
    int field1350;
    static final int be = 36;
    public static final int ay = 512;
    
    class149(final class142 this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    void aw(final ClanSettings clanSettings) {
        ClanSettings.da(clanSettings, 801047195 * this.field1350, this.field1349, 1893134742);
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            ClanSettings.da(clanSettings, 801047195 * this.field1350, this.field1349, 1681536577);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ff.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        this.field1350 = buffer.readInt(-1898825290) * 710939539;
        this.field1349 = buffer.readStringCp1252NullTerminated((byte)0);
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1350 = buffer.readInt(-1813017622) * 710939539;
        this.field1349 = buffer.readStringCp1252NullTerminated((byte)0);
    }
    
    public static boolean isDigit(final char c, final int n) {
        try {
            if (c >= '0') {
                if (n == -307814037) {
                    throw new IllegalStateException();
                }
                if (c <= '9') {
                    if (n == -307814037) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ff.aa(" + ')');
        }
    }
    
    @Override
    void vmethod3254(final Buffer buffer, final int n) {
        try {
            this.field1350 = buffer.readInt(-1868178252) * 710939539;
            this.field1349 = buffer.readStringCp1252NullTerminated((byte)0);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ff.af(" + ')');
        }
    }
    
    public static Object ab(final IterableDualNodeQueueIterator iterableDualNodeQueueIterator) {
        DualNode head = iterableDualNodeQueueIterator.head;
        if (head == iterableDualNodeQueueIterator.queue.sentinel) {
            head = null;
            iterableDualNodeQueueIterator.head = null;
        }
        else {
            iterableDualNodeQueueIterator.head = head.nextDual;
        }
        return iterableDualNodeQueueIterator.last = head;
    }
    
    static final void drawObject(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        try {
            final long boundaryObjectTag = class31.scene.getBoundaryObjectTag(n, n2, n3);
            if (boundaryObjectTag != 0L) {
                if (n6 >= -596637590) {
                    throw new IllegalStateException();
                }
                final int objectFlags = class31.scene.getObjectFlags(n, n2, n3, boundaryObjectTag);
                final int n7 = objectFlags >> 6 & 0x3;
                final int n8 = objectFlags & 0x1F;
                int n9 = n4;
                if (class173.method957(boundaryObjectTag)) {
                    if (n6 >= -596637590) {
                        throw new IllegalStateException();
                    }
                    n9 = n5;
                }
                final int[] pixels = UrlRequester.sceneMinimapSprite.pixels;
                final int n10 = (103 - n3) * 2048 + (n2 * 4 + 24624);
                final ObjectComposition vmethod3248 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag), (short)20893);
                if (-1 != vmethod3248.mapSceneId * 771086195) {
                    final IndexedSprite indexedSprite = class333.mapSceneSprites[vmethod3248.mapSceneId * 771086195];
                    if (indexedSprite != null) {
                        indexedSprite.ax((vmethod3248.sizeX * -1064754148 - indexedSprite.yOffset) / 2 + (48 + n2 * 4), (vmethod3248.sizeY * 1952358772 - indexedSprite.subWidth) / 2 + ((104 - n3 - -1659393955 * vmethod3248.sizeY) * 4 + 48));
                    }
                }
                else {
                    Label_0594: {
                        if (n8 != 0) {
                            if (n8 != 2) {
                                break Label_0594;
                            }
                            if (n6 >= -596637590) {
                                throw new IllegalStateException();
                            }
                        }
                        if (n7 == 0) {
                            if (n6 >= -596637590) {
                                throw new IllegalStateException();
                            }
                            pixels[512 + n10] = (pixels[n10] = n9);
                            pixels[1536 + n10] = (pixels[n10 + 1024] = n9);
                        }
                        else if (n7 == 1) {
                            if (n6 >= -596637590) {
                                throw new IllegalStateException();
                            }
                            pixels[1 + n10] = (pixels[n10] = n9);
                            pixels[3 + n10] = (pixels[n10 + 2] = n9);
                        }
                        else if (2 == n7) {
                            pixels[512 + (n10 + 3)] = (pixels[n10 + 3] = n9);
                            pixels[1536 + (3 + n10)] = (pixels[3 + n10 + 1024] = n9);
                        }
                        else if (n7 == 3) {
                            pixels[1 + (n10 + 1536)] = (pixels[n10 + 1536] = n9);
                            pixels[1536 + n10 + 3] = (pixels[1536 + n10 + 2] = n9);
                        }
                    }
                    if (3 == n8) {
                        if (n6 >= -596637590) {
                            throw new IllegalStateException();
                        }
                        if (n7 == 0) {
                            pixels[n10] = n9;
                        }
                        else if (n7 == 1) {
                            if (n6 >= -596637590) {
                                throw new IllegalStateException();
                            }
                            pixels[3 + n10] = n9;
                        }
                        else if (2 == n7) {
                            if (n6 >= -596637590) {
                                throw new IllegalStateException();
                            }
                            pixels[n10 + 3 + 1536] = n9;
                        }
                        else if (3 == n7) {
                            if (n6 >= -596637590) {
                                return;
                            }
                            pixels[1536 + n10] = n9;
                        }
                    }
                    if (n8 == 2) {
                        if (n6 >= -596637590) {
                            throw new IllegalStateException();
                        }
                        if (3 == n7) {
                            if (n6 >= -596637590) {
                                return;
                            }
                            pixels[n10 + 512] = (pixels[n10] = n9);
                            pixels[1536 + n10] = (pixels[n10 + 1024] = n9);
                        }
                        else if (n7 == 0) {
                            if (n6 >= -596637590) {
                                return;
                            }
                            pixels[n10 + 1] = (pixels[n10] = n9);
                            pixels[n10 + 3] = (pixels[n10 + 2] = n9);
                        }
                        else if (n7 == 1) {
                            if (n6 >= -596637590) {
                                throw new IllegalStateException();
                            }
                            pixels[512 + (3 + n10)] = (pixels[3 + n10] = n9);
                            pixels[n10 + 3 + 1536] = (pixels[n10 + 3 + 1024] = n9);
                        }
                        else if (2 == n7) {
                            if (n6 >= -596637590) {
                                return;
                            }
                            pixels[1 + (1536 + n10)] = (pixels[n10 + 1536] = n9);
                            pixels[1536 + n10 + 3] = (pixels[2 + (1536 + n10)] = n9);
                        }
                    }
                }
            }
            final long gameObjectTag = class31.scene.getGameObjectTag(n, n2, n3);
            Label_1455: {
                if (gameObjectTag != 0L) {
                    if (n6 >= -596637590) {
                        throw new IllegalStateException();
                    }
                    final int objectFlags2 = class31.scene.getObjectFlags(n, n2, n3, gameObjectTag);
                    final int n11 = objectFlags2 >> 6 & 0x3;
                    final int n12 = objectFlags2 & 0x1F;
                    final ObjectComposition vmethod3249 = class144.vmethod3248(InterfaceParent.Entity_unpackID(gameObjectTag), (short)7370);
                    if (-1 != vmethod3249.mapSceneId * 771086195) {
                        if (n6 >= -596637590) {
                            throw new IllegalStateException();
                        }
                        final IndexedSprite indexedSprite2 = class333.mapSceneSprites[771086195 * vmethod3249.mapSceneId];
                        if (indexedSprite2 != null) {
                            indexedSprite2.ax(48 + n2 * 4 + (-1064754148 * vmethod3249.sizeX - indexedSprite2.yOffset) / 2, (1952358772 * vmethod3249.sizeY - indexedSprite2.subWidth) / 2 + (4 * (104 - n3 - vmethod3249.sizeY * -1659393955) + 48));
                        }
                    }
                    else if (n12 == 9) {
                        if (n6 >= -596637590) {
                            throw new IllegalStateException();
                        }
                        int n13 = 15658734;
                        if (class173.method957(gameObjectTag)) {
                            n13 = 15597568;
                        }
                        final int[] pixels2 = UrlRequester.sceneMinimapSprite.pixels;
                        final int n14 = 24624 + n2 * 4 + (103 - n3) * 2048;
                        if (n11 != 0) {
                            if (n11 != 2) {
                                pixels2[1 + (512 + n14)] = (pixels2[n14] = n13);
                                pixels2[n14 + 1536 + 3] = (pixels2[2 + (n14 + 1024)] = n13);
                                break Label_1455;
                            }
                            if (n6 >= -596637590) {
                                throw new IllegalStateException();
                            }
                        }
                        pixels2[1 + (n14 + 1024)] = (pixels2[1536 + n14] = n13);
                        pixels2[3 + n14] = (pixels2[2 + (n14 + 512)] = n13);
                    }
                }
            }
            final long floorDecorationTag = class31.scene.getFloorDecorationTag(n, n2, n3);
            if (0L != floorDecorationTag) {
                if (n6 >= -596637590) {
                    return;
                }
                final ObjectComposition vmethod3250 = class144.vmethod3248(InterfaceParent.Entity_unpackID(floorDecorationTag), (short)13389);
                if (vmethod3250.mapSceneId * 771086195 != -1) {
                    if (n6 >= -596637590) {
                        throw new IllegalStateException();
                    }
                    final IndexedSprite indexedSprite3 = class333.mapSceneSprites[771086195 * vmethod3250.mapSceneId];
                    if (null != indexedSprite3) {
                        if (n6 >= -596637590) {
                            throw new IllegalStateException();
                        }
                        indexedSprite3.ax(n2 * 4 + 48 + (vmethod3250.sizeX * -1064754148 - indexedSprite3.yOffset) / 2, 48 + (104 - n3 - -1659393955 * vmethod3250.sizeY) * 4 + (vmethod3250.sizeY * 1952358772 - indexedSprite3.subWidth) / 2);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ff.jy(" + ')');
        }
    }
}
