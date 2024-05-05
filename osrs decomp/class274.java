// 
// Decompiled by Procyon v0.5.36
// 

public interface class274
{
    default boolean vy(final ClientPreferences clientPreferences) {
        return clientPreferences.roofsHidden;
    }
    
    default void qz(final NPCComposition npcComposition, final Buffer buffer) {
        if (npcComposition == null) {
            npcComposition.getCombatLevel();
        }
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            npcComposition.decodeNext(buffer, ra, 1239995114);
        }
    }
}
