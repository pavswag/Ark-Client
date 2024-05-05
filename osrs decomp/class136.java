import java.util.Date;
import net.runelite.api.MessageNode;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.ChatMessageType;

// 
// Decompiled by Procyon v0.5.36
// 

public class class136 extends class139
{
    int field1306;
    static final int ai = 14;
    final /* synthetic */ class142 this$0;
    static int[] ByteArrayPool_altSizeArrayCounts;
    int field1308;
    int field1309;
    static final int ag = 12;
    int field1310;
    public static final int au = 64;
    static final int ry = 765;
    
    class136(final class142 this$0) {
        this.this$0 = this$0;
        this.field1310 = -2034222333;
    }
    
    static void addChatMessage(final int n, final String s, String s2, final String s3, final short n2) {
        final String s4 = s2;
        try {
            ChatChannel chatChannel = Messages.Messages_channels.get(n);
            if (chatChannel == null) {
                chatChannel = new ChatChannel();
                Messages.Messages_channels.put(n, chatChannel);
            }
            final Message dh = ChatChannel.dh(chatChannel, n, s, s4, s3, (short)(-22035));
            Messages.Messages_hashTable.put(dh, dh.type * -1117255211);
            Messages.Messages_queue.add(dh);
            Client.chatCycle = Client.cycleCntr * -2073795047;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fo.aw(" + ')');
        }
        final MessageNode messageNode = ScriptFrame.client.getChatLineMap().get(n).getLines()[0];
        ChatMessageType chatMessageType = ChatMessageType.of(n);
        if (chatMessageType == ChatMessageType.CLAN_CHAT && s2 != null && s2.startsWith("|")) {
            chatMessageType = ChatMessageType.CLAN_GIM_CHAT;
            s2 = s2.substring(1);
        }
        if (chatMessageType == ChatMessageType.CLAN_MESSAGE && s2 != null && s2.startsWith("|")) {
            chatMessageType = ChatMessageType.CLAN_GIM_MESSAGE;
            s2 = s2.substring(1);
        }
        if (Client.nw.isDebugEnabled()) {
            Client.nw.debug("Chat message type {}: {}", (Object)((chatMessageType == ChatMessageType.UNKNOWN) ? String.valueOf(n) : chatMessageType.name()), (Object)s2);
        }
        ScriptFrame.client.getCallbacks().post((Object)new ChatMessage(messageNode, chatMessageType, s, s2, s3, messageNode.getTimestamp()));
    }
    
    void addChatMessage(final ClanSettings clanSettings) {
        ClanSettings.qg(clanSettings, -1891641929 * this.field1310, 605814203 * this.field1308, this.field1306 * -1826209289, this.field1309 * -1378851861, 965511276);
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            ClanSettings.qg(clanSettings, -830375851 * this.field1310, 605814203 * this.field1308, this.field1306 * -1826209289, this.field1309 * -1378851861, 789169188);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fo.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        this.field1310 = buffer.readUnsignedShort(232757768) * 173860180;
        this.field1308 = buffer.readInt(-2050327401) * 1253456219;
        this.field1306 = Buffer.ra(buffer, (byte)7) * 1716395598;
        this.field1309 = Buffer.ra(buffer, (byte)7) * -681549185;
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1310 = buffer.readUnsignedShort(372155256) * 2034222333;
        this.field1308 = buffer.readInt(-1378526618) * 1848917875;
        this.field1306 = Buffer.ra(buffer, (byte)7) * 108318663;
        this.field1309 = Buffer.ra(buffer, (byte)7) * -152654653;
    }
    
    @Override
    void vmethod3254(final Buffer buffer, final int n) {
        try {
            this.field1310 = buffer.readUnsignedShort(515138995) * 2034222333;
            this.field1308 = buffer.readInt(-1773523369) * 1848917875;
            this.field1306 = Buffer.ra(buffer, (byte)7) * 108318663;
            this.field1309 = Buffer.ra(buffer, (byte)7) * -152654653;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fo.af(" + ')');
        }
    }
    
    public static String vmethod3254(final long date) {
        try {
            Calendar.Calendar_calendar.setTime(new Date(date));
            final int value = Calendar.Calendar_calendar.get(7);
            final int value2 = Calendar.Calendar_calendar.get(5);
            final int value3 = Calendar.Calendar_calendar.get(2);
            final int value4 = Calendar.Calendar_calendar.get(1);
            final int value5 = Calendar.Calendar_calendar.get(11);
            final int value6 = Calendar.Calendar_calendar.get(12);
            final int value7 = Calendar.Calendar_calendar.get(13);
            return Calendar.DAYS_OF_THE_WEEK[value - 1] + ", " + value2 / 10 + value2 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][value3] + "-" + value4 + " " + value5 / 10 + value5 % 10 + ":" + value6 / 10 + value6 % 10 + ":" + value7 / 10 + value7 % 10 + " GMT";
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fo.af(" + ')');
        }
    }
}
