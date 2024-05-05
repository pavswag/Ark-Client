import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class Messages
{
    static String otp;
    static final IterableNodeHashTable Messages_hashTable;
    static final Map Messages_channels;
    static int Messages_count;
    static final IterableDualNodeQueue Messages_queue;
    static final int ay = -306674912;
    static final int ek = 1;
    
    Messages() throws Throwable {
        throw new Error();
    }
    
    static {
        Messages_channels = new HashMap();
        Messages_hashTable = new IterableNodeHashTable(1024);
        Messages_queue = new IterableDualNodeQueue();
        Messages.Messages_count = 0;
    }
    
    static int bs(final int n) {
        final Message message = (Message)Messages.Messages_hashTable.aa(n);
        if (null == message) {
            return -1;
        }
        if (Messages.Messages_queue.sentinel == message.ej) {
            return -1;
        }
        return 971130017 * ((Message)message.ej).type;
    }
    
    static Message ad(final int i, final int n) {
        return Messages.Messages_channels.get(i).getMessage(n, -2124613734);
    }
    
    static Message ae(final int i, final int n) {
        return Messages.Messages_channels.get(i).getMessage(n, -2145516425);
    }
    
    static Message bb(final int n) {
        return (Message)Messages.Messages_hashTable.aa(n);
    }
    
    static int ao() {
        return (Messages.Messages_count -= 284896739) * -1810202571 - 1;
    }
    
    static void ak(final int n, final String s, final String s2, final String s3) {
        ChatChannel chatChannel = Messages.Messages_channels.get(n);
        if (chatChannel == null) {
            chatChannel = new ChatChannel();
            Messages.Messages_channels.put(n, chatChannel);
        }
        final Message dh = ChatChannel.dh(chatChannel, n, s, s2, s3, (short)9344);
        Messages.Messages_hashTable.put(dh, dh.type * -1620703475);
        Messages.Messages_queue.add(dh);
        Client.chatCycle = Client.cycleCntr * 657105990;
    }
    
    static void av(final int n, final String s, final String s2) {
        class136.addChatMessage(n, s, s2, null, (short)7454);
    }
    
    static void be() {
        Messages.Messages_channels.clear();
        Messages.Messages_hashTable.clear();
        class125.yv(Messages.Messages_queue);
        Messages.Messages_count = 0;
    }
    
    static void as(final int n, final String s, final String s2, final String s3) {
        ChatChannel chatChannel = Messages.Messages_channels.get(n);
        if (chatChannel == null) {
            chatChannel = new ChatChannel();
            Messages.Messages_channels.put(n, chatChannel);
        }
        final Message dh = ChatChannel.dh(chatChannel, n, s, s2, s3, (short)(-29006));
        Messages.Messages_hashTable.put(dh, dh.type * -1534651056);
        Messages.Messages_queue.add(dh);
        Client.chatCycle = Client.cycleCntr * -183933364;
    }
    
    static final void method656(final PendingSpawn pendingSpawn, final int n) {
        try {
            long n2 = 0L;
            int entity_unpackID = -1;
            int n3 = 0;
            int n4 = 0;
            if (0 == -1586499579 * pendingSpawn.type) {
                if (n == -2129916877) {
                    throw new IllegalStateException();
                }
                n2 = class31.scene.getBoundaryObjectTag(593068225 * pendingSpawn.plane, pendingSpawn.x * 68300005, 800888185 * pendingSpawn.y);
            }
            if (1 == pendingSpawn.type * -1586499579) {
                if (n == -2129916877) {
                    return;
                }
                n2 = class31.scene.getWallDecorationTag(593068225 * pendingSpawn.plane, pendingSpawn.x * 68300005, 800888185 * pendingSpawn.y);
            }
            if (-1586499579 * pendingSpawn.type == 2) {
                n2 = class31.scene.getGameObjectTag(593068225 * pendingSpawn.plane, pendingSpawn.x * 68300005, 800888185 * pendingSpawn.y);
            }
            if (3 == pendingSpawn.type * -1586499579) {
                if (n == -2129916877) {
                    throw new IllegalStateException();
                }
                n2 = class31.scene.getFloorDecorationTag(pendingSpawn.plane * 593068225, 68300005 * pendingSpawn.x, pendingSpawn.y * 800888185);
            }
            if (n2 != 0L) {
                if (n == -2129916877) {
                    throw new IllegalStateException();
                }
                final int objectFlags = class31.scene.getObjectFlags(pendingSpawn.plane * 593068225, pendingSpawn.x * 68300005, 800888185 * pendingSpawn.y, n2);
                entity_unpackID = InterfaceParent.Entity_unpackID(n2);
                n3 = (objectFlags & 0x1F);
                n4 = (objectFlags >> 6 & 0x3);
            }
            pendingSpawn.objectId = entity_unpackID * -309952939;
            pendingSpawn.field922 = n3 * -176021621;
            pendingSpawn.field927 = n4 * -884492625;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eo.kc(" + ')');
        }
    }
    
    static void az(final int n, final String s, final String s2, final String s3) {
        ChatChannel chatChannel = Messages.Messages_channels.get(n);
        if (chatChannel == null) {
            chatChannel = new ChatChannel();
            Messages.Messages_channels.put(n, chatChannel);
        }
        final Message dh = ChatChannel.dh(chatChannel, n, s, s2, s3, (short)24611);
        Messages.Messages_hashTable.put(dh, dh.type * -1117255211);
        Messages.Messages_queue.add(dh);
        Client.chatCycle = Client.cycleCntr * -2073795047;
    }
    
    static int ax() {
        return (Messages.Messages_count -= 669370628) * -1810202571 - 1;
    }
    
    static Message bi(final int n) {
        return (Message)Messages.Messages_hashTable.aa(n);
    }
    
    static void bo() {
        final Iterator iterator = Messages.Messages_hashTable.iterator();
        while (iterator.hasNext()) {
            Message.ur(iterator.next(), 673353909);
        }
    }
    
    static int bt(final int n) {
        final Message message = (Message)Messages.Messages_hashTable.aa(n);
        if (message == null) {
            return -1;
        }
        if (Messages.Messages_queue.sentinel == message.ez) {
            return -1;
        }
        return -1117255211 * ((Message)message.ez).type;
    }
    
    static int br(final int n) {
        final Message message = (Message)Messages.Messages_hashTable.aa(n);
        if (null == message) {
            return -1;
        }
        if (Messages.Messages_queue.sentinel == message.ej) {
            return -1;
        }
        return -1117255211 * ((Message)message.ej).type;
    }
    
    static void am(final int n, final String s, final String s2) {
        class136.addChatMessage(n, s, s2, null, (short)299);
    }
    
    static class123[] method655(final int n) {
        try {
            return new class123[] { class123.field1207, class123.field1200, class123.field1202, class123.field1203, class123.field1204 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eo.au(" + ')');
        }
    }
    
    static int ai() {
        return (Messages.Messages_count -= 284896739) * -1810202571 - 1;
    }
    
    static Message by(final int i, final int n) {
        return Messages.Messages_channels.get(i).getMessage(n, -2111277705);
    }
    
    static void bx() {
        final Iterator iterator = Messages.Messages_hashTable.iterator();
        while (iterator.hasNext()) {
            iterator.next().fillIsFromFriend((byte)(-105));
        }
    }
    
    static void ar(final int n, final String s, final String s2) {
        class136.addChatMessage(n, s, s2, null, (short)8132);
    }
    
    static Message ap(final int i, final int n) {
        return Messages.Messages_channels.get(i).getMessage(n, -2109007117);
    }
    
    static void bd() {
        final Iterator iterator = Messages.Messages_hashTable.iterator();
        while (iterator.hasNext()) {
            Message.ur(iterator.next(), -2021663279);
        }
    }
    
    static int bg(final int n) {
        final Message message = (Message)Messages.Messages_hashTable.aa(n);
        if (null == message) {
            return -1;
        }
        if (Messages.Messages_queue.sentinel == message.ej) {
            return -1;
        }
        return 1039096355 * ((Message)message.ej).type;
    }
    
    static int bn(final int n) {
        final Message message = (Message)Messages.Messages_hashTable.aa(n);
        if (message == null) {
            return -1;
        }
        if (Messages.Messages_queue.sentinel == message.ez) {
            return -1;
        }
        return -1117255211 * ((Message)message.ez).type;
    }
    
    static void aj(final int n, final String s, final String s2, final String s3) {
        ChatChannel chatChannel = Messages.Messages_channels.get(n);
        if (chatChannel == null) {
            chatChannel = new ChatChannel();
            Messages.Messages_channels.put(n, chatChannel);
        }
        final Message dh = ChatChannel.dh(chatChannel, n, s, s2, s3, (short)20861);
        Messages.Messages_hashTable.put(dh, dh.type * -1117255211);
        Messages.Messages_queue.add(dh);
        Client.chatCycle = Client.cycleCntr * -2073795047;
    }
    
    static int ag() {
        return (Messages.Messages_count -= 284896739) * -1810202571 - 1;
    }
    
    static void bz() {
        final Iterator iterator = Messages.Messages_hashTable.iterator();
        while (iterator.hasNext()) {
            Message.ur(iterator.next(), -1055316830);
        }
    }
    
    static int bj(final int n) {
        final Message message = (Message)Messages.Messages_hashTable.aa(n);
        if (message == null) {
            return -1;
        }
        if (Messages.Messages_queue.sentinel == message.ez) {
            return -1;
        }
        return -1117255211 * ((Message)message.ez).type;
    }
    
    static void bm() {
        final Iterator iterator = Messages.Messages_hashTable.iterator();
        while (iterator.hasNext()) {
            Message.ur(iterator.next(), -1234804988);
        }
    }
    
    static void bk() {
        Messages.Messages_channels.clear();
        Messages.Messages_hashTable.clear();
        class125.yv(Messages.Messages_queue);
        Messages.Messages_count = 0;
    }
    
    public static void fj(final NPC npc, final String s) {
        if (npc == null) {
            npc.getId();
        }
        npc.nameChange = ((null == s) ? "" : s);
    }
    
    static int ah() {
        return (Messages.Messages_count += 905934380) * -1079208428 - 1;
    }
    
    static int bu(final int n) {
        final Message message = (Message)Messages.Messages_hashTable.aa(n);
        if (null == message) {
            return -1;
        }
        if (Messages.Messages_queue.sentinel == message.ej) {
            return -1;
        }
        return 609744469 * ((Message)message.ej).type;
    }
}
