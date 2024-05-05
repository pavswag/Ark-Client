// 
// Decompiled by Procyon v0.5.36
// 

public class VorbisMapping
{
    int[] submapResidue;
    int mappingMux;
    int submaps;
    int[] submapFloor;
    
    VorbisMapping() {
        VorbisSample.readBits(16);
        this.submaps = ((VorbisSample.readBit() != 0) ? (VorbisSample.readBits(4) + 1) : 1);
        if (VorbisSample.readBit() != 0) {
            VorbisSample.readBits(8);
        }
        VorbisSample.readBits(2);
        if (this.submaps > 1) {
            this.mappingMux = VorbisSample.readBits(4);
        }
        this.submapResidue = new int[this.submaps];
        this.submapFloor = new int[this.submaps];
        for (int i = 0; i < this.submaps; ++i) {
            VorbisSample.readBits(8);
            this.submapResidue[i] = VorbisSample.readBits(8);
            this.submapFloor[i] = VorbisSample.readBits(8);
        }
    }
}
