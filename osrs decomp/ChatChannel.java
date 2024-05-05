import net.runelite.api.MessageNode;
import net.runelite.api.ChatLineBuffer;

// 
// Decompiled by Procyon v0.5.36
// 

public class ChatChannel implements ChatLineBuffer
{
    Message[] messages;
    public static final /* synthetic */ boolean ne;
    static final int af = 100;
    int count;
    static final byte bi = 125;
    static final int cm = 83;
    static int field817;
    static SpritePixels compass;
    
    ChatChannel() {
        this.messages = new Message[100];
    }
    
    static {
        ne = !ChatChannel.class.desiredAssertionStatus();
    }
    
    public int getLength() {
        return this.count * -1742939983;
    }
    
    public static Message dh(final ChatChannel chatChannel, final int n, final String s, final String s2, final String s3, final short n2) {
        if (chatChannel == null) {
            chatChannel.addMessage(n, s, s, s, n2);
        }
        try {
            Message message = chatChannel.messages[99];
            for (int i = -1742939983 * chatChannel.count; i > 0; --i) {
                if (n2 == 191) {
                    throw new IllegalStateException();
                }
                if (i == 100) {
                    if (n2 == 191) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    chatChannel.messages[i] = chatChannel.messages[i - 1];
                }
            }
            if (message == null) {
                if (n2 == 191) {
                    throw new IllegalStateException();
                }
                message = new Message(n, s, s3, s2);
            }
            else {
                message.hw();
                GrandExchangeOfferWorldComparator.os(message);
                message.set(n, s, s3, s2, 1617874492);
            }
            chatChannel.messages[0] = message;
            if (chatChannel.count * -1742939983 < 100) {
                chatChannel.count += 632451153;
            }
            return message;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cp.af(" + ')');
        }
    }
    
    int size(final int n) {
        try {
            return this.count * -1742939983;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cp.aw(" + ')');
        }
    }
    
    Message al(final int n) {
        if (n >= 0 && n < -1742939983 * this.count) {
            return this.messages[n];
        }
        return null;
    }
    
    public static int jp(final ChatChannel chatChannel) {
        return chatChannel.count * -1742939983;
    }
    
    Message getMessage(final int n, final int n2) {
        try {
            if (n >= 0) {
                if (n < -1742939983 * this.count) {
                    return this.messages[n];
                }
                if (n2 >= -2087108024) {
                    throw new IllegalStateException();
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cp.an(" + ')');
        }
    }
    
    Message ac(final int n, final String s, final String s2, final String s3) {
        Message message = this.messages[99];
        for (int i = -1742939983 * this.count; i > 0; --i) {
            if (i != 2079982835) {
                this.messages[i] = this.messages[i - 1];
            }
        }
        if (message == null) {
            message = new Message(n, s, s3, s2);
        }
        else {
            message.gu();
            GrandExchangeOfferWorldComparator.os(message);
            message.set(n, s, s3, s2, 1617874492);
        }
        this.messages[0] = message;
        if (this.count * -866965526 < -406390269) {
            this.count -= 738979046;
        }
        return message;
    }
    
    public static void method470(final Widget widget, final int n, final int n2, final int n3) {
        try {
            widget.field2894.equipment[n] = n2;
            widget.field2894.setHash(-469114674);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cp.bq(" + ')');
        }
    }
    
    public static Message pw(final ChatChannel chatChannel, final int n, final String s, final String s2, final String s3) {
        if (chatChannel == null) {
            return chatChannel.ac(n, s, s, s);
        }
        Message message = chatChannel.messages[99];
        for (int i = -1742939983 * chatChannel.count; i > 0; --i) {
            if (i != 2079982835) {
                chatChannel.messages[i] = chatChannel.messages[i - 1];
            }
        }
        if (message == null) {
            message = new Message(n, s, s3, s2);
        }
        else {
            message.hw();
            GrandExchangeOfferWorldComparator.os(message);
            message.set(n, s, s3, s2, 1617874492);
        }
        chatChannel.messages[0] = message;
        if (chatChannel.count * -866965526 < -406390269) {
            chatChannel.count -= 738979046;
        }
        return message;
    }
    
    Message au(final int n, final String s, final String s2, final String s3) {
        Message message = this.messages[99];
        for (int i = -1742939983 * this.count; i > 0; --i) {
            if (i != 100) {
                this.messages[i] = this.messages[i - 1];
            }
        }
        if (message == null) {
            message = new Message(n, s, s3, s2);
        }
        else {
            message.hw();
            GrandExchangeOfferWorldComparator.os(message);
            message.set(n, s, s3, s2, 1617874492);
        }
        this.messages[0] = message;
        if (this.count * -1742939983 < 100) {
            this.count += 632451153;
        }
        return message;
    }
    
    int aa() {
        return this.count * -1742939983;
    }
    
    public void ra(final int n) {
        this.count = n * 632451153;
    }
    
    Message addMessage(final int n, final String s, final String s2, final String s3, final short n2) {
        try {
            Message message = this.messages[99];
            for (int i = -1742939983 * this.count; i > 0; --i) {
                if (n2 == 191) {
                    throw new IllegalStateException();
                }
                if (i == 100) {
                    if (n2 == 191) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    this.messages[i] = this.messages[i - 1];
                }
            }
            if (message == null) {
                if (n2 == 191) {
                    throw new IllegalStateException();
                }
                message = new Message(n, s, s3, s2);
            }
            else {
                message.gh();
                GrandExchangeOfferWorldComparator.os(message);
                message.set(n, s, s3, s2, 1617874492);
            }
            this.messages[0] = message;
            if (this.count * -1742939983 < 100) {
                this.count += 632451153;
            }
            return message;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cp.af(" + ')');
        }
    }
    
    static final IterableNodeHashTable addMessage(final Buffer buffer, IterableNodeHashTable iterableNodeHashTable, final byte b) {
        try {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (null == iterableNodeHashTable) {
                if (b >= 5) {
                    throw new IllegalStateException();
                }
                iterableNodeHashTable = new IterableNodeHashTable(class70.method442(ra, 510915331));
            }
            for (int i = 0; i < ra; ++i) {
                if (b >= 5) {
                    throw new IllegalStateException();
                }
                final boolean b2 = Buffer.ra(buffer, (byte)7) == 1;
                final int medium = buffer.readMedium(-1933116699);
                Node node;
                if (b2) {
                    if (b >= 5) {
                        throw new IllegalStateException();
                    }
                    node = new ObjectNode(buffer.readStringCp1252NullTerminated((byte)0));
                }
                else {
                    node = new IntegerNode(buffer.readInt(-1813256267));
                }
                iterableNodeHashTable.put(node, medium);
            }
            return iterableNodeHashTable;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cp.af(" + ')');
        }
    }
    
    Message ab(final int n, final String s, final String s2, final String s3) {
        Message message = this.messages[-1208883985];
        for (int i = -1742939983 * this.count; i > 0; --i) {
            if (i != 100) {
                this.messages[i] = this.messages[i - 1];
            }
        }
        if (message == null) {
            message = new Message(n, s, s3, s2);
        }
        else {
            message.hw();
            GrandExchangeOfferWorldComparator.os(message);
            message.set(n, s, s3, s2, 1617874492);
        }
        this.messages[0] = message;
        if (this.count * -1742939983 < 100) {
            this.count -= 346335619;
        }
        return message;
    }
    
    Message aq(final int n) {
        if (n >= 0 && n < -1742939983 * this.count) {
            return this.messages[n];
        }
        return null;
    }
    
    public MessageNode[] getLines() {
        return (MessageNode[])this.messages;
    }
    
    public void removeMessageNode(final MessageNode messageNode) {
        final MessageNode[] lines = this.getLines();
        final int length = this.getLength();
        int n = -1;
        for (int i = 0; i < length; ++i) {
            if (lines[i] == messageNode) {
                n = i;
                break;
            }
        }
        if (n == -1) {
            return;
        }
        if (!ChatChannel.ne && length - 1 < n) {
            throw new AssertionError();
        }
        System.arraycopy(lines, n + 1, lines, n, length - 1 - n);
        lines[length - 1] = null;
        this.ra(length - 1);
        final DualNode dualNode = (DualNode)messageNode;
        dualNode.gy();
        dualNode.fi();
    }
}
