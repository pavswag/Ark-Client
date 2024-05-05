// 
// Decompiled by Procyon v0.5.36
// 

public interface class2
{
    default void sa(final FriendsChat friendsChat) {
        if (friendsChat == null) {
            friendsChat.getMyRank();
        }
        for (int i = 0; i < friendsChat.bm(-1380015983); ++i) {
            ((ClanMate)UserList.pn(friendsChat, i, 1645013785)).clearIsIgnored(2127626051);
        }
    }
}
