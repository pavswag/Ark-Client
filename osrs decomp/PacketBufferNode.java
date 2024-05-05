// 
// Decompiled by Procyon v0.5.36
// 

public class PacketBufferNode extends Node
{
    ClientPacket clientPacket;
    int clientPacketLength;
    public PacketBuffer packetBuffer;
    public int index;
    static int PacketBufferNode_packetBufferNodeCount;
    public static final int al = 10000;
    static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
    public static final int bs = 63;
    
    PacketBufferNode() {
    }
    
    static {
        PacketBufferNode.PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
        PacketBufferNode.PacketBufferNode_packetBufferNodeCount = 0;
    }
    
    public void ao() {
        if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount * 380401923 >= PacketBufferNode.PacketBufferNode_packetBufferNodes.length) {
            return;
        }
        PacketBufferNode.PacketBufferNode_packetBufferNodes[(PacketBufferNode.PacketBufferNode_packetBufferNodeCount -= 1882670677) * 380401923 - 1] = this;
    }
    
    public static PacketBufferNode at(final ClientPacket clientPacket, final IsaacCipher isaacCipher) {
        final PacketBufferNode method1044 = SpotAnimationDefinition.method1044((byte)0);
        method1044.clientPacket = clientPacket;
        method1044.clientPacketLength = -474143459 * clientPacket.id;
        if (-1 == method1044.clientPacketLength * -1245059367) {
            method1044.packetBuffer = new PacketBuffer(1179807334);
        }
        else if (method1044.clientPacketLength * 214676107 == -2) {
            method1044.packetBuffer = new PacketBuffer(1764384008);
        }
        else if (method1044.clientPacketLength * -1245059367 <= 18) {
            method1044.packetBuffer = new PacketBuffer(20);
        }
        else if (-1245059367 * method1044.clientPacketLength <= 98) {
            method1044.packetBuffer = new PacketBuffer(100);
        }
        else {
            method1044.packetBuffer = new PacketBuffer(956869493);
        }
        PacketBuffer.np(method1044.packetBuffer, isaacCipher, -2019045350);
        method1044.packetBuffer.writeByteIsaac(-135374471 * method1044.clientPacket.length, (byte)(-6));
        method1044.index = 0;
        return method1044;
    }
    
    public void ax() {
        if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount * 380401923 >= PacketBufferNode.PacketBufferNode_packetBufferNodes.length) {
            return;
        }
        PacketBufferNode.PacketBufferNode_packetBufferNodes[(PacketBufferNode.PacketBufferNode_packetBufferNodeCount -= 1882670677) * 380401923 - 1] = this;
    }
    
    public static PacketBufferNode ay() {
        final PacketBufferNode method1044 = SpotAnimationDefinition.method1044((byte)0);
        method1044.clientPacket = null;
        method1044.clientPacketLength = 0;
        method1044.packetBuffer = new PacketBuffer(-84029976);
        return method1044;
    }
    
    public static PacketBufferNode al(final ClientPacket clientPacket, final IsaacCipher isaacCipher) {
        final PacketBufferNode method1044 = SpotAnimationDefinition.method1044((byte)0);
        method1044.clientPacket = clientPacket;
        method1044.clientPacketLength = -474143459 * clientPacket.id;
        if (-1 == method1044.clientPacketLength * -1245059367) {
            method1044.packetBuffer = new PacketBuffer(260);
        }
        else if (method1044.clientPacketLength * -1245059367 == -2) {
            method1044.packetBuffer = new PacketBuffer(10000);
        }
        else if (method1044.clientPacketLength * -1245059367 <= 18) {
            method1044.packetBuffer = new PacketBuffer(20);
        }
        else if (-1245059367 * method1044.clientPacketLength <= 98) {
            method1044.packetBuffer = new PacketBuffer(100);
        }
        else {
            method1044.packetBuffer = new PacketBuffer(260);
        }
        PacketBuffer.np(method1044.packetBuffer, isaacCipher, -1951787404);
        method1044.packetBuffer.writeByteIsaac(1546470819 * method1044.clientPacket.length, (byte)(-44));
        method1044.index = 0;
        return method1044;
    }
    
    public static int release(final CharSequence charSequence, final byte b) {
        try {
            return SecureRandomFuture.method456(charSequence, 10, true, (byte)(-45));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lg.ac(" + ')');
        }
    }
    
    public void release(final int n) {
        try {
            if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount * 380401923 >= PacketBufferNode.PacketBufferNode_packetBufferNodes.length) {
                return;
            }
            PacketBufferNode.PacketBufferNode_packetBufferNodes[(PacketBufferNode.PacketBufferNode_packetBufferNodeCount -= 1882670677) * 380401923 - 1] = this;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lg.ac(" + ')');
        }
    }
    
    static PacketBufferNode au() {
        if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount * 380401923 == 0) {
            return new PacketBufferNode();
        }
        return PacketBufferNode.PacketBufferNode_packetBufferNodes[(PacketBufferNode.PacketBufferNode_packetBufferNodeCount += 1882670677) * 380401923];
    }
    
    public static PacketBufferNode aa() {
        final PacketBufferNode method1044 = SpotAnimationDefinition.method1044((byte)0);
        method1044.clientPacket = null;
        method1044.clientPacketLength = 0;
        method1044.packetBuffer = new PacketBuffer(5000);
        return method1044;
    }
    
    public void ai() {
        if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount * 380401923 >= PacketBufferNode.PacketBufferNode_packetBufferNodes.length) {
            return;
        }
        PacketBufferNode.PacketBufferNode_packetBufferNodes[(PacketBufferNode.PacketBufferNode_packetBufferNodeCount -= 1882670677) * 380401923 - 1] = this;
    }
    
    public static ServerPacket[] ServerPacket_values(final int n) {
        try {
            return new ServerPacket[] { ServerPacket.field2622, ServerPacket.field2580, ServerPacket.field2581, ServerPacket.CLANCHANNEL_DELTA, ServerPacket.IF_SETTEXT, ServerPacket.field2584, ServerPacket.REFLECTION_CHECK, ServerPacket.field2608, ServerPacket.field2629, ServerPacket.field2588, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field2615, ServerPacket.field2591, ServerPacket.field2592, ServerPacket.field2593, ServerPacket.field2594, ServerPacket.field2667, ServerPacket.field2596, ServerPacket.field2583, ServerPacket.field2598, ServerPacket.field2599, ServerPacket.SPOTANIM_SPECIFIC, ServerPacket.field2601, ServerPacket.NPC_INFO_LARGE, ServerPacket.field2666, ServerPacket.ENTER_FREECAM, ServerPacket.field2605, ServerPacket.IF_SETPOSITION, ServerPacket.field2607, ServerPacket.field2603, ServerPacket.field2609, ServerPacket.field2610, ServerPacket.field2683, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.field2644, ServerPacket.field2611, ServerPacket.PLAYER_INFO, ServerPacket.field2616, ServerPacket.IF_SETOBJECT, ServerPacket.field2618, ServerPacket.field2619, ServerPacket.field2613, ServerPacket.RESET_ANIMS, ServerPacket.field2586, ServerPacket.field2671, ServerPacket.UPDATE_INV_FULL, ServerPacket.MESSAGE_CLANCHANNEL_SYSTEM, ServerPacket.field2626, ServerPacket.field2623, ServerPacket.field2649, ServerPacket.field2679, ServerPacket.field2627, ServerPacket.UPDATE_UID192, ServerPacket.field2632, ServerPacket.field2633, ServerPacket.field2634, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS, ServerPacket.IF_SETNPCHEAD, ServerPacket.field2637, ServerPacket.HEAT_MAP, ServerPacket.TRIGGER_ONDIALOGABORT, ServerPacket.IF_OPENSUB, ServerPacket.field2641, ServerPacket.field2642, ServerPacket.REBUILD_REGION, ServerPacket.field2677, ServerPacket.CAM_LOOKAT, ServerPacket.field2647, ServerPacket.field2597, ServerPacket.field2648, ServerPacket.field2695, ServerPacket.field2650, ServerPacket.field2651, ServerPacket.field2652, ServerPacket.GAMEFRAME_FULL, ServerPacket.VARCLAN, ServerPacket.field2620, ServerPacket.LOGOUT_TRANSFER, ServerPacket.field2686, ServerPacket.field2658, ServerPacket.field2676, ServerPacket.field2660, ServerPacket.field2694, ServerPacket.field2579, ServerPacket.field2691, ServerPacket.field2664, ServerPacket.field2665, ServerPacket.field2630, ServerPacket.NPC_INFO_SMALL, ServerPacket.field2668, ServerPacket.field2669, ServerPacket.field2659, ServerPacket.field2698, ServerPacket.field2657, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field2674, ServerPacket.TRADING_POST_RESULTS, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field2614, ServerPacket.field2672, ServerPacket.field2628, ServerPacket.field2680, ServerPacket.field2681, ServerPacket.field2682, ServerPacket.field2600, ServerPacket.field2684, ServerPacket.field2685, ServerPacket.field2646, ServerPacket.UPDATE_RUNENERGY, ServerPacket.MESSAGE_PRIVATE, ServerPacket.field2689, ServerPacket.field2690, ServerPacket.field2631, ServerPacket.REBUILD_REGION_NORMAL, ServerPacket.field2693, ServerPacket.field2670, ServerPacket.field2678, ServerPacket.field2696, ServerPacket.field2697 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lg.af(" + ')');
        }
    }
    
    public static PacketBufferNode ab(final ClientPacket clientPacket, final IsaacCipher isaacCipher) {
        final PacketBufferNode method1044 = SpotAnimationDefinition.method1044((byte)0);
        method1044.clientPacket = clientPacket;
        method1044.clientPacketLength = -474143459 * clientPacket.id;
        if (-1 == method1044.clientPacketLength * -1245059367) {
            method1044.packetBuffer = new PacketBuffer(-411821799);
        }
        else if (method1044.clientPacketLength * 531170882 == -950966307) {
            method1044.packetBuffer = new PacketBuffer(10000);
        }
        else if (method1044.clientPacketLength * 615557364 <= 18) {
            method1044.packetBuffer = new PacketBuffer(20);
        }
        else if (-221508843 * method1044.clientPacketLength <= -1800610821) {
            method1044.packetBuffer = new PacketBuffer(1702216981);
        }
        else {
            method1044.packetBuffer = new PacketBuffer(260);
        }
        PacketBuffer.np(method1044.packetBuffer, isaacCipher, -2029525359);
        method1044.packetBuffer.writeByteIsaac(-510880721 * method1044.clientPacket.length, (byte)(-56));
        method1044.index = 0;
        return method1044;
    }
    
    public static PacketBufferNode aq(final ClientPacket clientPacket, final IsaacCipher isaacCipher) {
        final PacketBufferNode method1044 = SpotAnimationDefinition.method1044((byte)0);
        method1044.clientPacket = clientPacket;
        method1044.clientPacketLength = -474143459 * clientPacket.id;
        if (-1 == method1044.clientPacketLength * -1245059367) {
            method1044.packetBuffer = new PacketBuffer(260);
        }
        else if (method1044.clientPacketLength * -1245059367 == -2) {
            method1044.packetBuffer = new PacketBuffer(10000);
        }
        else if (method1044.clientPacketLength * -1245059367 <= 18) {
            method1044.packetBuffer = new PacketBuffer(20);
        }
        else if (-1245059367 * method1044.clientPacketLength <= 98) {
            method1044.packetBuffer = new PacketBuffer(100);
        }
        else {
            method1044.packetBuffer = new PacketBuffer(260);
        }
        PacketBuffer.np(method1044.packetBuffer, isaacCipher, -2005081183);
        method1044.packetBuffer.writeByteIsaac(1546470819 * method1044.clientPacket.length, (byte)(-9));
        method1044.index = 0;
        return method1044;
    }
}
