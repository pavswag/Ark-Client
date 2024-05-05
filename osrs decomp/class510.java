// 
// Decompiled by Procyon v0.5.36
// 

public abstract class class510
{
    static final String[] field4167;
    public static final int af = 1;
    public static final int ab = 1024;
    public static final int al = 33554432;
    public static final int aw = 4;
    
    class510() throws Throwable {
        throw new Error();
    }
    
    static {
        (field4167 = new String[32])[0] = "MEMBERS";
        class510.field4167[1] = "QUICKCHAT";
        class510.field4167[2] = "PVPWORLD";
        class510.field4167[3] = "LOOTSHARE";
        class510.field4167[4] = "DEDICATEDACTIVITY";
        class510.field4167[5] = "BOUNTYWORLD";
        class510.field4167[6] = "PVPARENA";
        class510.field4167[7] = "HIGHLEVELONLY_1500";
        class510.field4167[8] = "SPEEDRUN";
        class510.field4167[9] = "EXISTINGPLAYERSONLY";
        class510.field4167[10] = "EXTRAHARDWILDERNESS";
        class510.field4167[11] = "DUNGEONEERING";
        class510.field4167[12] = "INSTANCE_SHARD";
        class510.field4167[13] = "RENTABLE";
        class510.field4167[14] = "LASTMANSTANDING";
        class510.field4167[15] = "NEW_PLAYERS";
        class510.field4167[16] = "BETA_WORLD";
        class510.field4167[17] = "STAFF_IP_ONLY";
        class510.field4167[18] = "HIGHLEVELONLY_2000";
        class510.field4167[19] = "HIGHLEVELONLY_2400";
        class510.field4167[20] = "VIPS_ONLY";
        class510.field4167[21] = "HIDDEN_WORLD";
        class510.field4167[22] = "LEGACY_ONLY";
        class510.field4167[23] = "EOC_ONLY";
        class510.field4167[24] = "BEHIND_PROXY";
        class510.field4167[25] = "NOSAVE_MODE";
        class510.field4167[26] = "TOURNAMENT_WORLD";
        class510.field4167[27] = "FRESHSTART";
        class510.field4167[28] = "HIGHLEVELONLY_1750";
        class510.field4167[29] = "DEADMAN";
        class510.field4167[30] = "SEASONAL";
        class510.field4167[31] = "EXTERNAL_PARTNER_ONLY";
    }
    
    public static Model jv(final SequenceDefinition sequenceDefinition, final Model model, int n) {
        if (sequenceDefinition == null) {
            sequenceDefinition.mb();
        }
        if (!sequenceDefinition.isCachedModelIdSet(-2054757048)) {
            n = sequenceDefinition.frameIds[n];
            final Frames frames = WorldMapID.getFrames(n >> 16, 1674145031);
            n &= 0xFD7EDFD0;
            if (frames == null) {
                return model.method1312(true);
            }
            final Model method1312 = model.method1312(!frames.hasAlphaTransform(n, 1049699721));
            Model.ug(method1312, frames, n);
            return method1312;
        }
        else {
            final class133 method1313 = TileItem.method626(-1479963300 * sequenceDefinition.SequenceDefinition_cachedModelId, 2146620436);
            if (method1313 == null) {
                return model.method1312(true);
            }
            final Model method1314 = model.method1312(!method1313.method770(1713081171));
            method1314.method1317(method1313, n);
            return method1314;
        }
    }
}
