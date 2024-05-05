// 
// Decompiled by Procyon v0.5.36
// 

public final class BZip2State
{
    final int field4062;
    final int field4059;
    final int field4086;
    int blockSize100k;
    final int field4055;
    byte[] seqToUnseq;
    byte[][] temp_charArray2d;
    final int field4057;
    int nextBit_unused;
    byte[] outputArray;
    int nextByte;
    int outputLength;
    int field4067;
    byte out_char;
    int su_rNToGo;
    int[] getAndMoveToFrontDecode_yy;
    int bsLive;
    int next_out;
    int originalPointer;
    int field4074;
    int su_ch2;
    int[] unzftab;
    int nblocks_used;
    int[] cftab;
    int nInUse;
    boolean[] inUse;
    boolean[] inUse16;
    int bsBuff;
    byte[] ll8;
    byte[] inputArray;
    byte[] selector;
    final int field4056;
    byte[] selectorMtf;
    int[][] limit;
    int[][] base;
    int[][] perm;
    int[] minLens;
    int field4092;
    
    BZip2State() {
        this.field4057 = 4096;
        this.field4059 = 16;
        this.field4056 = 258;
        this.field4086 = 6;
        this.field4055 = 50;
        this.field4062 = 18002;
        this.nextByte = 0;
        this.next_out = 0;
        this.unzftab = new int[256];
        this.cftab = new int[257];
        this.inUse = new boolean[256];
        this.inUse16 = new boolean[16];
        this.seqToUnseq = new byte[256];
        this.ll8 = new byte[4096];
        this.getAndMoveToFrontDecode_yy = new int[16];
        this.selector = new byte[18002];
        this.selectorMtf = new byte[18002];
        this.temp_charArray2d = new byte[6][258];
        this.limit = new int[6][258];
        this.base = new int[6][258];
        this.perm = new int[6][258];
        this.minLens = new int[6];
    }
}
