// 
// Decompiled by Procyon v0.5.36
// 

public class HealthBarUpdate extends Node
{
    static final int be = 19136995;
    static final float us = 325.949f;
    int health2;
    int health;
    int cycle;
    int cycleOffset;
    public static final int ab = 5;
    static final int ag = 1;
    
    HealthBarUpdate(final int n, final int n2, final int n3, final int n4) {
        this.cycle = n * -1996034979;
        this.health = 329974251 * n2;
        this.health2 = n3 * -1727836311;
        this.cycleOffset = n4 * 1487825381;
    }
    
    public int tg() {
        return this.health * 1250696899;
    }
    
    void aw(final int n, final int n2, final int n3, final int n4) {
        this.cycle = n * -1996034979;
        this.health = 329974251 * n2;
        this.health2 = n3 * -1727836311;
        this.cycleOffset = 1487825381 * n4;
    }
    
    void an(final int n, final int n2, final int n3, final int n4) {
        this.cycle = n * -1996034979;
        this.health = 329974251 * n2;
        this.health2 = n3 * 99123202;
        this.cycleOffset = 1621352969 * n4;
    }
    
    void ac(final int n, final int n2, final int n3, final int n4) {
        this.cycle = n * -1996034979;
        this.health = 329974251 * n2;
        this.health2 = n3 * -1727836311;
        this.cycleOffset = 1487825381 * n4;
    }
    
    void au(final int n, final int n2, final int n3, final int n4) {
        this.cycle = n * -1996034979;
        this.health = 329974251 * n2;
        this.health2 = n3 * -1727836311;
        this.cycleOffset = 1487825381 * n4;
    }
    
    public static void set(final ScriptEvent scriptEvent, final byte b) {
        try {
            PlayerType.runScript(scriptEvent, 500000, 475000, 637714632);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dh.af(" + ')');
        }
    }
    
    public static ItemComposition set(final int n, final byte b) {
        try {
            final ItemComposition itemComposition = (ItemComposition)ItemComposition.ItemDefinition_cached.wr(n);
            if (null == itemComposition) {
                final byte[] takeFile = class355.ItemDefinition_archive.takeFile(10, n, (byte)(-19));
                final ItemComposition itemComposition2 = new ItemComposition();
                itemComposition2.id = n * 526060183;
                if (null != takeFile) {
                    if (b <= 7) {
                        throw new IllegalStateException();
                    }
                    ItemComposition.yb(itemComposition2, new Buffer(takeFile), (byte)(-17));
                }
                ItemComposition.ct(itemComposition2, -2125749046);
                if (-1 != -1375068187 * itemComposition2.noteTemplate) {
                    if (b <= 7) {
                        throw new IllegalStateException();
                    }
                    itemComposition2.genCert(set(itemComposition2.noteTemplate * -1375068187, (byte)24), set(1399852547 * itemComposition2.note, (byte)64), -1546193991);
                }
                if (itemComposition2.notedId * -1276549997 != -1) {
                    if (b <= 7) {
                        throw new IllegalStateException();
                    }
                    itemComposition2.genBought(set(itemComposition2.notedId * -1276549997, (byte)26), set(-1273418661 * itemComposition2.unnotedId, (byte)123), 797932055);
                }
                if (itemComposition2.placeholderTemplate * 119859889 != -1) {
                    if (b <= 7) {
                        throw new IllegalStateException();
                    }
                    itemComposition2.genPlaceholder(set(itemComposition2.placeholderTemplate * 119859889, (byte)93), set(-172219939 * itemComposition2.placeholder, (byte)9), -670361185);
                }
                if (!FileSystem.ItemDefinition_inMembersWorld) {
                    if (b <= 7) {
                        throw new IllegalStateException();
                    }
                    if (itemComposition2.isMembersOnly) {
                        if (b <= 7) {
                            throw new IllegalStateException();
                        }
                        itemComposition2.name = Strings.af;
                        itemComposition2.vx(-1);
                        itemComposition2.isTradable = false;
                        for (int i = 0; i < itemComposition2.groundActions.length; ++i) {
                            if (b <= 7) {
                                throw new IllegalStateException();
                            }
                            itemComposition2.groundActions[i] = null;
                        }
                        for (int j = 0; j < itemComposition2.inventoryActions.length; ++j) {
                            if (j != 4) {
                                if (b <= 7) {
                                    throw new IllegalStateException();
                                }
                                itemComposition2.inventoryActions[j] = null;
                            }
                        }
                        itemComposition2.shiftClickIndex = 1290787642;
                        itemComposition2.team = 0;
                        if (itemComposition2.params != null) {
                            if (b <= 7) {
                                throw new IllegalStateException();
                            }
                            int n2 = 0;
                            for (Node node = InvDefinition.xf(itemComposition2.params); null != node; node = IterableNodeHashTable.ow(itemComposition2.params)) {
                                if (b <= 7) {
                                    throw new IllegalStateException();
                                }
                                if (class33.getParamDefinition((int)node.key, 367699395).autoDisable) {
                                    if (b <= 7) {
                                        throw new IllegalStateException();
                                    }
                                    node.hw();
                                }
                                else {
                                    n2 = 1;
                                }
                            }
                            if (n2 == 0) {
                                if (b <= 7) {
                                    throw new IllegalStateException();
                                }
                                itemComposition2.params = null;
                            }
                        }
                    }
                }
                ItemComposition.ItemDefinition_cached.put(itemComposition2, n);
                return itemComposition2;
            }
            if (b <= 7) {
                throw new IllegalStateException();
            }
            return itemComposition;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dh.af(" + ')');
        }
    }
    
    void set(final int n, final int n2, final int n3, final int n4, final int n5) {
        try {
            this.cycle = n * -1996034979;
            this.health = 329974251 * n2;
            this.health2 = n3 * -1727836311;
            this.cycleOffset = 1487825381 * n4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dh.af(" + ')');
        }
    }
    
    public static class312 kq(final Widget widget) {
        return widget.field2951;
    }
    
    public int kq() {
        return this.health2 * -2028064551;
    }
    
    public static void uq(final MidiFileReader midiFileReader, final int n) {
        midiFileReader.buffer.offset = midiFileReader.trackPositions[n] * -1516355947;
    }
}
