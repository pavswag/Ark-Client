// 
// Decompiled by Procyon v0.5.36
// 

public class class152 extends class155
{
    int field1380;
    byte field1381;
    int field1382;
    String field1383;
    final /* synthetic */ class156 this$0;
    static final int aq = 64;
    static final int bx = 14;
    public static final int as = 38;
    
    class152(final class156 this$0) {
        this.this$0 = this$0;
        this.field1380 = 1435810339;
    }
    
    @Override
    void aw(final Buffer buffer) {
        Buffer.ra(buffer, (byte)7);
        this.field1380 = buffer.readUnsignedShort(-1687374595) * -1435810339;
        this.field1381 = Buffer.wu(buffer, 435772489);
        this.field1382 = buffer.readUnsignedShort(-1425281996) * 528201959;
        Buffer.ks(buffer, (byte)1);
        this.field1383 = buffer.readStringCp1252NullTerminated((byte)0);
        Buffer.ra(buffer, (byte)7);
    }
    
    @Override
    void vmethod3239(final ClanChannel clanChannel, final byte b) {
        try {
            final ClanChannelMember clanChannelMember = clanChannel.members.get(this.field1380 * 233388661);
            clanChannelMember.rank = this.field1381;
            clanChannelMember.world = this.field1382 * -359370451;
            clanChannelMember.username = new Username(this.field1383);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fk.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        Buffer.ra(buffer, (byte)7);
        this.field1380 = buffer.readUnsignedShort(-553048923) * -1219308877;
        this.field1381 = Buffer.wu(buffer, 435772489);
        this.field1382 = buffer.readUnsignedShort(-1774547427) * 528201959;
        Buffer.ks(buffer, (byte)1);
        this.field1383 = buffer.readStringCp1252NullTerminated((byte)0);
        Buffer.ra(buffer, (byte)7);
    }
    
    @Override
    void au(final Buffer buffer) {
        Buffer.ra(buffer, (byte)7);
        this.field1380 = buffer.readUnsignedShort(-316739018) * -1435810339;
        this.field1381 = Buffer.wu(buffer, 435772489);
        this.field1382 = buffer.readUnsignedShort(-2066953748) * 528201959;
        Buffer.ks(buffer, (byte)1);
        this.field1383 = buffer.readStringCp1252NullTerminated((byte)0);
        Buffer.ra(buffer, (byte)7);
    }
    
    public static void vmethod3238(final AbstractArchive sequenceDefinition_archive, final AbstractArchive sequenceDefinition_animationsArchive, final AbstractArchive sequenceDefinition_skeletonsArchive, final int n) {
        try {
            SequenceDefinition.SequenceDefinition_archive = sequenceDefinition_archive;
            SequenceDefinition.SequenceDefinition_animationsArchive = sequenceDefinition_animationsArchive;
            SequenceDefinition.SequenceDefinition_skeletonsArchive = sequenceDefinition_skeletonsArchive;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fk.af(" + ')');
        }
    }
    
    @Override
    void vmethod3238(final Buffer buffer, final int n) {
        try {
            Buffer.ra(buffer, (byte)7);
            this.field1380 = buffer.readUnsignedShort(515727020) * -1435810339;
            this.field1381 = Buffer.wu(buffer, 435772489);
            this.field1382 = buffer.readUnsignedShort(89530974) * 528201959;
            Buffer.ks(buffer, (byte)1);
            this.field1383 = buffer.readStringCp1252NullTerminated((byte)0);
            Buffer.ra(buffer, (byte)7);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fk.af(" + ')');
        }
    }
    
    @Override
    void ab(final ClanChannel clanChannel) {
        final ClanChannelMember clanChannelMember = clanChannel.members.get(this.field1380 * -1806391379);
        clanChannelMember.rank = this.field1381;
        clanChannelMember.world = this.field1382 * -359370451;
        clanChannelMember.username = new Username(this.field1383);
    }
    
    @Override
    void aq(final ClanChannel clanChannel) {
        final ClanChannelMember clanChannelMember = clanChannel.members.get(this.field1380 * 233388661);
        clanChannelMember.rank = this.field1381;
        clanChannelMember.world = this.field1382 * -2028359431;
        clanChannelMember.username = new Username(this.field1383);
    }
}
