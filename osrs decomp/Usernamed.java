// 
// Decompiled by Procyon v0.5.36
// 

public interface Usernamed
{
    Username username(final int p0);
    
    default boolean yi(final WorldMap worldMap) {
        return worldMap.cacheLoader.isLoaded(-1961797245);
    }
    
    default int[] oj(final ClanChannel clanChannel) {
        if (clanChannel.sortedMembers == null) {
            final String[] array = new String[clanChannel.members.size()];
            clanChannel.sortedMembers = new int[clanChannel.members.size()];
            for (int i = 0; i < clanChannel.members.size(); ++i) {
                array[i] = ((ClanChannelMember)clanChannel.members.get(i)).username.method2643(-1569964208);
                clanChannel.sortedMembers[i] = i;
            }
            class138.method801(array, clanChannel.sortedMembers, 0, array.length - 1, (byte)1);
        }
        return clanChannel.sortedMembers;
    }
    
    Username afo();
    
    Username afh();
    
    Username afy();
    
    Username afx();
}
