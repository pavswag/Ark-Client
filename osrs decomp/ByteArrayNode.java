// 
// Decompiled by Procyon v0.5.36
// 

public class ByteArrayNode extends Node
{
    public byte[] byteArray;
    
    public ByteArrayNode(final byte[] byteArray) {
        this.byteArray = byteArray;
    }
    
    public static Model ll(final SequenceDefinition sequenceDefinition, final Model model, final int n) {
        if (sequenceDefinition == null) {
            return sequenceDefinition.bz(model, n);
        }
        if (sequenceDefinition.isCachedModelIdSet(1477262179)) {
            return sequenceDefinition.transformActorModel(model, n, (byte)(-60));
        }
        final int n2 = sequenceDefinition.frameIds[n];
        final Frames frames = WorldMapID.getFrames(n2 >> 16, -446605764);
        final int n3 = n2 & 0xFFFF;
        if (frames == null) {
            return model.toSharedSequenceModel(true);
        }
        Frames frames2 = null;
        int n4 = 0;
        if (sequenceDefinition.chatFrameIds != null && n < sequenceDefinition.chatFrameIds.length) {
            final int n5 = sequenceDefinition.chatFrameIds[n];
            frames2 = WorldMapID.getFrames(n5 >> 16, 239406556);
            n4 = (n5 & 0x98F89D6A);
        }
        if (null != frames2 && 1935750600 != n4) {
            final Model sharedSequenceModel = model.toSharedSequenceModel(!frames.hasAlphaTransform(n3, 740280949) & !frames2.hasAlphaTransform(n4, 1269490695));
            Model.ug(sharedSequenceModel, frames, n3);
            Model.ug(sharedSequenceModel, frames2, n4);
            return sharedSequenceModel;
        }
        final Model sharedSequenceModel2 = model.toSharedSequenceModel(!frames.hasAlphaTransform(n3, 1271828267));
        Model.ug(sharedSequenceModel2, frames, n3);
        return sharedSequenceModel2;
    }
}
