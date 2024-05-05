// 
// Decompiled by Procyon v0.5.36
// 

public class class163 extends class139
{
    long field1413;
    int field1414;
    final /* synthetic */ class142 this$0;
    public static final int ac = 6;
    static final int bm = 0;
    public static final int aq = 0;
    
    class163(final class142 this$0) {
        this.this$0 = this$0;
    }
    
    static int method916(final int n, final Script script, final boolean b, final int n2) {
        try {
            if (n != 7108) {
                return 2;
            }
            if (n2 == 281973538) {
                throw new IllegalStateException();
            }
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (ByteArrayPool.method2091(1906032667) ? 1 : 0);
            return 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gt.bp(" + ')');
        }
    }
    
    @Override
    void aw(final ClanSettings clanSettings) {
        clanSettings.method859(745124117 * this.field1414, this.field1413 * 382806309398385789L);
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            clanSettings.method859(1515394365 * this.field1414, this.field1413 * 382806309398385789L);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gt.an(" + ')');
        }
    }
    
    static void method915(final int n, final int[] array, final int n2, final int n3) {
        try {
            for (int i = 0; i < 743589639 * KitDefinition.KitDefinition_fileCount; ++i) {
                if (n3 <= 1130159576) {
                    return;
                }
                final KitDefinition kitDefinition_get = class100.KitDefinition_get(i, 1112844336);
                if (kitDefinition_get != null) {
                    if (n3 <= 1130159576) {
                        throw new IllegalStateException();
                    }
                    if (!kitDefinition_get.nonSelectable) {
                        if (n3 <= 1130159576) {
                            throw new IllegalStateException();
                        }
                        if (((1 == n) ? 7 : 0) + n2 == 1015855167 * kitDefinition_get.bodypartID) {
                            if (n3 <= 1130159576) {
                                throw new IllegalStateException();
                            }
                            array[PlayerComposition.equipmentIndices[n2]] = 256 + i;
                            break;
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gt.ac(" + ')');
        }
    }
    
    void method915(final Buffer buffer) {
        this.field1414 = buffer.readInt(-1197790819) * 1614047765;
        this.field1413 = Buffer.ks(buffer, (byte)1) * -6759767620667767595L;
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1414 = buffer.readInt(-1593265395) * 2005525154;
        this.field1413 = Buffer.ks(buffer, (byte)1) * -6759767620667767595L;
    }
    
    @Override
    void vmethod3254(final Buffer buffer, final int n) {
        try {
            this.field1414 = buffer.readInt(-1637548262) * 1614047765;
            this.field1413 = Buffer.ks(buffer, (byte)1) * -6759767620667767595L;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gt.af(" + ')');
        }
    }
    
    public static int bf(final class424 class424) {
        return (int)(class424.field3791 + 31.0f * (31.0f * (31.0f * (31.0f * 1.0f + class424.field3788) + class424.field3789) + class424.field3790));
    }
}
