// 
// Decompiled by Procyon v0.5.36
// 

public class class162 extends class155
{
    static final int se = 128;
    final /* synthetic */ class156 this$0;
    byte field1409;
    byte field1410;
    String field1411;
    public static int pcmSampleLength;
    static final int dh = 11;
    
    class162(final class156 this$0) {
        this.this$0 = this$0;
    }
    
    public static void rp(final Model model, final int n) {
        if (model == null) {
            model.rotateZ(n);
            return;
        }
        final int n2 = Model.field2192[n];
        final int n3 = Model.field2132[n];
        for (int i = 0; i < model.verticesCount; ++i) {
            final int n4 = model.verticesY[i] * n3 - model.verticesZ[i] * n2 >> 16;
            model.verticesZ[i] = model.verticesY[i] * n2 + model.verticesZ[i] * n3 >> 16;
            model.verticesY[i] = n4;
        }
        Model.dv(model);
    }
    
    @Override
    void aw(final Buffer buffer) {
        this.field1411 = buffer.readStringCp1252NullTerminatedOrNull((byte)15);
        if (null != this.field1411) {
            Buffer.ra(buffer, (byte)7);
            this.field1410 = Buffer.wu(buffer, 435772489);
            this.field1409 = Buffer.wu(buffer, 435772489);
        }
    }
    
    @Override
    void vmethod3239(final ClanChannel clanChannel, final byte b) {
        try {
            clanChannel.name = this.field1411;
            if (null != this.field1411) {
                if (b == 19) {
                    return;
                }
                clanChannel.field1396 = this.field1410;
                clanChannel.field1401 = this.field1409;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ga.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        this.field1411 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-19));
        if (null != this.field1411) {
            Buffer.ra(buffer, (byte)7);
            this.field1410 = Buffer.wu(buffer, 435772489);
            this.field1409 = Buffer.wu(buffer, 435772489);
        }
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1411 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-87));
        if (null != this.field1411) {
            Buffer.ra(buffer, (byte)7);
            this.field1410 = Buffer.wu(buffer, 435772489);
            this.field1409 = Buffer.wu(buffer, 435772489);
        }
    }
    
    @Override
    void vmethod3238(final Buffer buffer, final int n) {
        try {
            this.field1411 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-35));
            if (null != this.field1411) {
                if (n != -1949352075) {
                    return;
                }
                Buffer.ra(buffer, (byte)7);
                this.field1410 = Buffer.wu(buffer, 435772489);
                this.field1409 = Buffer.wu(buffer, 435772489);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ga.af(" + ')');
        }
    }
    
    @Override
    void ab(final ClanChannel clanChannel) {
        clanChannel.name = this.field1411;
        if (null != this.field1411) {
            clanChannel.field1396 = this.field1410;
            clanChannel.field1401 = this.field1409;
        }
    }
    
    static void method912(final byte b) {
        try {
            Messages.Messages_channels.clear();
            Messages.Messages_hashTable.clear();
            class125.yv(Messages.Messages_queue);
            Messages.Messages_count = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ga.aq(" + ')');
        }
    }
    
    void method912(final ClanChannel clanChannel) {
        clanChannel.name = this.field1411;
        if (null != this.field1411) {
            clanChannel.field1396 = this.field1410;
            clanChannel.field1401 = this.field1409;
        }
    }
    
    public static void method911(final Widget widget, final int n, final int n2, final byte b) {
        try {
            final PlayerComposition field2894 = widget.field2894;
            boolean b2;
            if (n2 != 1693987821 * field2894.npcTransformId) {
                if (b >= 0) {
                    return;
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            final boolean b3 = b2;
            field2894.npcTransformId = 325591525 * n2;
            if (b3) {
                if (1693987821 * field2894.npcTransformId == n) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    for (int i = 0; i < PlayerComposition.equipmentIndices.length; ++i) {
                        final int n3 = PlayerComposition.equipmentIndices[i];
                        if (field2894.field2841[n3] > 0 && field2894.field2841[n3] < 512) {
                            if (b >= 0) {
                                return;
                            }
                            field2894.field2841[n3] = field2894.bodyColors[n3];
                        }
                    }
                }
                else {
                    Label_0456: {
                        if (field2894.field2841[0] >= 512) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            boolean b5;
                            if (field2894.field2841[0] >= 512) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                final ItemComposition set = HealthBarUpdate.set(field2894.field2841[0] - 512, (byte)110);
                                boolean b4 = false;
                                Label_0285: {
                                    if (622494345 * class204.field1840.field1831 != set.maleModel1 * -1719338253) {
                                        if (b >= 0) {
                                            return;
                                        }
                                        if (class204.field1840.field1831 * 622494345 != 723093341 * set.maleModel2) {
                                            b4 = true;
                                            break Label_0285;
                                        }
                                    }
                                    b4 = false;
                                }
                                b5 = b4;
                            }
                            else {
                                b5 = false;
                            }
                            if (!b5) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                break Label_0456;
                            }
                        }
                        field2894.field2841[622494345 * class204.field1840.field1831] = 1;
                    }
                    for (int j = 0; j < 7; ++j) {
                        final int n4 = PlayerComposition.equipmentIndices[j];
                        if (field2894.field2841[n4] > 0) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            if (field2894.field2841[n4] < 512) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                class163.method915(n2, field2894.field2841, j, 2068575587);
                            }
                        }
                    }
                }
            }
            field2894.setHash(-469114674);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ga.bf(" + ')');
        }
    }
}
