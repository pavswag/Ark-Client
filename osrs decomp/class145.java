// 
// Decompiled by Procyon v0.5.36
// 

public class class145 extends class155
{
    int field1337;
    byte field1335;
    static final int by = 19136800;
    String field1336;
    final /* synthetic */ class156 this$0;
    static final int aj = 1048576;
    int field1334;
    
    class145(final class156 this$0) {
        this.this$0 = this$0;
        this.field1337 = -35116265;
    }
    
    @Override
    void aw(final Buffer buffer) {
        this.field1337 = buffer.readUnsignedShort(-1815577326) * 35116265;
        this.field1335 = Buffer.wu(buffer, 435772489);
        this.field1334 = buffer.readUnsignedShort(-1047178981) * 832186411;
        Buffer.ks(buffer, (byte)1);
        this.field1336 = buffer.readStringCp1252NullTerminated((byte)0);
    }
    
    @Override
    void vmethod3239(final ClanChannel clanChannel, final byte b) {
        try {
            final ClanChannelMember clanChannelMember = clanChannel.members.get(this.field1337 * -1706146983);
            clanChannelMember.rank = this.field1335;
            clanChannelMember.world = 905266769 * this.field1334;
            clanChannelMember.username = new Username(this.field1336);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fr.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        this.field1337 = buffer.readUnsignedShort(-759996578) * 35116265;
        this.field1335 = Buffer.wu(buffer, 435772489);
        this.field1334 = buffer.readUnsignedShort(-1926103165) * 832186411;
        Buffer.ks(buffer, (byte)1);
        this.field1336 = buffer.readStringCp1252NullTerminated((byte)0);
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1337 = buffer.readUnsignedShort(523242934) * 35116265;
        this.field1335 = Buffer.wu(buffer, 435772489);
        this.field1334 = buffer.readUnsignedShort(-1304241619) * 832186411;
        Buffer.ks(buffer, (byte)1);
        this.field1336 = buffer.readStringCp1252NullTerminated((byte)0);
    }
    
    @Override
    void vmethod3238(final Buffer buffer, final int n) {
        try {
            this.field1337 = buffer.readUnsignedShort(-394822315) * 35116265;
            this.field1335 = Buffer.wu(buffer, 435772489);
            this.field1334 = buffer.readUnsignedShort(-314442813) * 832186411;
            Buffer.ks(buffer, (byte)1);
            this.field1336 = buffer.readStringCp1252NullTerminated((byte)0);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fr.af(" + ')');
        }
    }
    
    @Override
    void ab(final ClanChannel clanChannel) {
        final ClanChannelMember clanChannelMember = clanChannel.members.get(this.field1337 * -1706146983);
        clanChannelMember.rank = this.field1335;
        clanChannelMember.world = 905266769 * this.field1334;
        clanChannelMember.username = new Username(this.field1336);
    }
    
    @Override
    void aq(final ClanChannel clanChannel) {
        final ClanChannelMember clanChannelMember = clanChannel.members.get(this.field1337 * -587938963);
        clanChannelMember.rank = this.field1335;
        clanChannelMember.world = -1652805549 * this.field1334;
        clanChannelMember.username = new Username(this.field1336);
    }
}
