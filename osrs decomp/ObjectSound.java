import net.runelite.api.coords.LocalPoint;
import net.runelite.api.AmbientSoundEffect;

// 
// Decompiled by Procyon v0.5.36
// 

public final class ObjectSound extends Node implements AmbientSoundEffect
{
    int field673;
    int plane;
    int x;
    static final int bk = 7;
    int maxX;
    int maxY;
    int soundEffectId;
    int field679;
    RawPcmStream stream2;
    int field681;
    int field682;
    int[] soundEffectIds;
    static NodeDeque objectSounds;
    RawPcmStream stream1;
    ObjectComposition obj;
    int y;
    public static final int am = 3;
    static final int cj = 25;
    static byte[][] regionMapArchives;
    static final int ql = 32;
    
    ObjectSound() {
    }
    
    static {
        ObjectSound.objectSounds = new NodeDeque();
    }
    
    static void ao(final int n, final int n2, final int n3, final ObjectComposition obj, final int n4) {
        final ObjectSound objectSound = new ObjectSound();
        objectSound.plane = n * 241949401;
        objectSound.x = 1422530523 * n2;
        objectSound.y = -274968704 * n3;
        int n5 = obj.sizeX * -1339930361;
        int n6 = obj.sizeY * 1035977686;
        if (1 == n4 || 3 == n4) {
            n5 = -1659393955 * obj.sizeY;
            n6 = -1339930361 * obj.sizeX;
        }
        objectSound.maxX = (n2 + n5) * -1490504832;
        objectSound.maxY = 905187968 * (n3 + n6);
        objectSound.soundEffectId = 2056351306 * obj.ambientSoundId;
        objectSound.field673 = obj.int7 * -981504640;
        objectSound.field681 = obj.int5 * -1756454329;
        objectSound.field682 = obj.int6 * -1723341761;
        objectSound.soundEffectIds = obj.transforms;
        if (obj.soundEffectIds != null) {
            objectSound.obj = obj;
            objectSound.set(1821096959);
        }
        ObjectSound.objectSounds.addFirst(objectSound);
        if (objectSound.soundEffectIds != null) {
            objectSound.field679 = (objectSound.field681 * -442346035 + (int)(Math.random() * (objectSound.field682 * -1018564833 - objectSound.field681 * -442346035))) * -926972312;
        }
    }
    
    static void at() {
        for (ObjectSound objectSound = (ObjectSound)ObjectSound.objectSounds.last(); objectSound != null; objectSound = (ObjectSound)ObjectSound.objectSounds.previous()) {
            if (objectSound.obj != null) {
                objectSound.set(684205871);
            }
        }
    }
    
    public int cp() {
        return this.x * 506576733;
    }
    
    static void ax(final int n, final int n2, final int n3, final ObjectComposition obj, final int n4) {
        final ObjectSound objectSound = new ObjectSound();
        objectSound.plane = n * 241949401;
        objectSound.x = -255427968 * n2;
        objectSound.y = -1289931055 * n3;
        int n5 = obj.sizeX * -1339930361;
        int n6 = obj.sizeY * -1659393955;
        if (1 == n4 || 3 == n4) {
            n5 = -1659393955 * obj.sizeY;
            n6 = 942383652 * obj.sizeX;
        }
        objectSound.maxX = (n2 + n5) * -1490504832;
        objectSound.maxY = 2028218063 * (n3 + n6);
        objectSound.soundEffectId = -853803453 * obj.ambientSoundId;
        objectSound.field673 = obj.int7 * -981504640;
        objectSound.field681 = obj.int5 * -1756454329;
        objectSound.field682 = obj.int6 * -1723341761;
        objectSound.soundEffectIds = obj.transforms;
        if (obj.soundEffectIds != null) {
            objectSound.obj = obj;
            objectSound.set(-983570587);
        }
        ObjectSound.objectSounds.addFirst(objectSound);
        if (objectSound.soundEffectIds != null) {
            objectSound.field679 = (objectSound.field681 * -442346035 + (int)(Math.random() * (objectSound.field682 * -446960905 - objectSound.field681 * -442346035))) * -713890281;
        }
    }
    
    void ay() {
        final int n = -488286959 * this.soundEffectId;
        final ObjectComposition transform = this.obj.transform((byte)(-1));
        if (null != transform) {
            this.soundEffectId = transform.ambientSoundId * 1674173624;
            this.field673 = -981504640 * transform.int7;
            this.field681 = -1756454329 * transform.int5;
            this.field682 = 910379264 * transform.int6;
            this.soundEffectIds = transform.transforms;
        }
        else {
            this.soundEffectId = -1718502815;
            this.field673 = 0;
            this.field681 = 0;
            this.field682 = 0;
            this.soundEffectIds = null;
        }
        if (n != 46968363 * this.soundEffectId && this.stream2 != null) {
            class130.pcmStreamMixer.removeSubStream(this.stream2);
            this.stream2 = null;
        }
    }
    
    public int ha() {
        return this.y * 99345247;
    }
    
    void set(final int n) {
        try {
            final int n2 = 1671764667 * this.soundEffectId;
            final ObjectComposition transform = this.obj.transform((byte)(-11));
            if (null != transform) {
                if (n == 16777215) {
                    return;
                }
                this.soundEffectId = transform.ambientSoundId * -853803453;
                this.field673 = -981504640 * transform.int7;
                this.field681 = -1756454329 * transform.int5;
                this.field682 = -1723341761 * transform.int6;
                this.soundEffectIds = transform.transforms;
            }
            else {
                this.soundEffectId = -24779379;
                this.field673 = 0;
                this.field681 = 0;
                this.field682 = 0;
                this.soundEffectIds = null;
            }
            if (n2 != 1671764667 * this.soundEffectId && this.stream2 != null) {
                if (n == 16777215) {
                    throw new IllegalStateException();
                }
                class130.pcmStreamMixer.removeSubStream(this.stream2);
                this.stream2 = null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cr.aw(" + ')');
        }
    }
    
    static void al() {
        for (ObjectSound objectSound = (ObjectSound)ObjectSound.objectSounds.last(); objectSound != null; objectSound = (ObjectSound)ObjectSound.objectSounds.previous()) {
            if (objectSound.obj != null) {
                objectSound.set(774704747);
            }
        }
    }
    
    public int fl() {
        return this.maxX * -823707049;
    }
    
    void aa() {
        final int n = 1671764667 * this.soundEffectId;
        final ObjectComposition transform = this.obj.transform((byte)68);
        if (null != transform) {
            this.soundEffectId = transform.ambientSoundId * 1917651138;
            this.field673 = -981504640 * transform.int7;
            this.field681 = 1550519762 * transform.int5;
            this.field682 = -1723341761 * transform.int6;
            this.soundEffectIds = transform.transforms;
        }
        else {
            this.soundEffectId = -24779379;
            this.field673 = 0;
            this.field681 = 0;
            this.field682 = 0;
            this.soundEffectIds = null;
        }
        if (n != 1671764667 * this.soundEffectId && this.stream2 != null) {
            class130.pcmStreamMixer.removeSubStream(this.stream2);
            this.stream2 = null;
        }
    }
    
    public int gh() {
        return this.maxY * -1828326483;
    }
    
    static void ab() {
        for (ObjectSound objectSound = (ObjectSound)ObjectSound.objectSounds.last(); null != objectSound; objectSound = (ObjectSound)ObjectSound.objectSounds.previous()) {
            if (objectSound.stream2 != null) {
                class130.pcmStreamMixer.removeSubStream(objectSound.stream2);
                objectSound.stream2 = null;
            }
            if (null != objectSound.stream1) {
                class130.pcmStreamMixer.removeSubStream(objectSound.stream1);
                objectSound.stream1 = null;
            }
        }
        NodeDeque.la(ObjectSound.objectSounds);
    }
    
    static void aq() {
        for (ObjectSound objectSound = (ObjectSound)ObjectSound.objectSounds.last(); objectSound != null; objectSound = (ObjectSound)ObjectSound.objectSounds.previous()) {
            if (objectSound.obj != null) {
                objectSound.set(-284002328);
            }
        }
    }
    
    public int getPlane() {
        return this.plane * 776275305;
    }
    
    public static void vw(final Varcs varcs, final int i, final String s) {
        varcs.map.put(i, s);
    }
    
    public static void rz(final class424 class424) {
        if (class424 == null) {
            class424.az();
            return;
        }
        class424.field3790 = 0.0f;
        class424.field3789 = 0.0f;
        class424.field3788 = 0.0f;
        class424.field3791 = 1.0f;
    }
    
    public void cq() {
        this.set(27660078);
    }
    
    public LocalPoint getMaxPosition() {
        return new LocalPoint(this.fl(), this.gh());
    }
    
    public LocalPoint getMinPosition() {
        return new LocalPoint(this.cp(), this.ha());
    }
    
    public int getSoundEffectId() {
        return this.soundEffectId * 1671764667;
    }
}
