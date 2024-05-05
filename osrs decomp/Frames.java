// 
// Decompiled by Procyon v0.5.36
// 

public class Frames extends DualNode
{
    static final int ar = 15;
    static final int ap = 26;
    static final int an = -1;
    public static final int av = 1;
    Animation[] frames;
    static final int am = 171;
    static final int co = 88;
    
    Frames(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final int n, final boolean b) {
        final NodeDeque nodeDeque = new NodeDeque();
        this.frames = new Animation[abstractArchive.getGroupFileCount(n, (byte)15)];
        final int[] yk = AbstractArchive.yk(abstractArchive, n, 639762895);
        for (int i = 0; i < yk.length; ++i) {
            final byte[] takeFile = abstractArchive.takeFile(n, yk[i], (byte)(-103));
            Skeleton skeleton = null;
            final int n2 = (takeFile[0] & 0xFF) << 8 | (takeFile[1] & 0xFF);
            for (Skeleton skeleton2 = (Skeleton)nodeDeque.last(); null != skeleton2; skeleton2 = (Skeleton)nodeDeque.previous()) {
                if (skeleton2.id * 1427390003 == n2) {
                    skeleton = skeleton2;
                    break;
                }
            }
            if (null == skeleton) {
                byte[] array;
                if (b) {
                    array = abstractArchive2.getFile(0, n2, -606351717);
                }
                else {
                    array = abstractArchive2.getFile(n2, 0, -606351717);
                }
                skeleton = new Skeleton(n2, array);
                nodeDeque.addFirst(skeleton);
            }
            this.frames[yk[i]] = new Animation(takeFile, skeleton);
        }
    }
    
    public static Task on(final TaskHandler taskHandler, final String s, final int n) {
        if (taskHandler == null) {
            taskHandler.getClipMidX();
        }
        return taskHandler.newTask(1, n, 0, s, -1394403860);
    }
    
    static float method1297(final class427 class427, float n, float a, final float n2, final int i) {
        try {
            float method2245 = class424.method2245(class427.field3813, class427.field3812 * 754853883, n, 1101824083);
            if (Math.abs(method2245) < class121.field1180) {
                return n;
            }
            float a2 = class424.method2245(class427.field3813, 754853883 * class427.field3812, a, 1062527611);
            if (Math.abs(a2) < class121.field1180) {
                return a;
            }
            float n3 = 0.0f;
            float a3 = 0.0f;
            float a4 = 0.0f;
            float n4 = 0.0f;
            int n5 = 1;
            Label_0122: {
                break Label_0122;
            Label_0182_Outer:
                do {
                    n5 = 1;
                    boolean b = true;
                    while (true) {
                        if (!b) {
                            return a;
                        }
                        b = false;
                        if (n5 != 0) {
                            if (i <= -252312017) {
                                throw new IllegalStateException();
                            }
                            n3 = n;
                            n4 = method2245;
                            a3 = (a4 = a - n);
                            n5 = 0;
                        }
                        if (Math.abs(n4) < Math.abs(a2)) {
                            n = a;
                            a = n3;
                            n3 = n;
                            method2245 = a2;
                            a2 = n4;
                            n4 = method2245;
                        }
                        final float n6 = class121.field1181 * Math.abs(a) + 0.5f * n2;
                        final float a5 = 0.5f * (n3 - a);
                        boolean b2 = false;
                        Label_0454: {
                            if (Math.abs(a5) > n6) {
                                if (i <= -252312017) {
                                    throw new IllegalStateException();
                                }
                                if (a2 != 0.0f) {
                                    if (i <= -252312017) {
                                        throw new IllegalStateException();
                                    }
                                    b2 = true;
                                    break Label_0454;
                                }
                            }
                            b2 = false;
                        }
                        if (!b2) {
                            continue;
                        }
                        if (i <= -252312017) {
                            throw new IllegalStateException();
                        }
                        Label_0656: {
                            if (Math.abs(a4) >= n6) {
                                if (i <= -252312017) {
                                    throw new IllegalStateException();
                                }
                                if (Math.abs(method2245) > Math.abs(a2)) {
                                    final float n7 = a2 / method2245;
                                    float n8;
                                    float n9;
                                    if (n3 == n) {
                                        if (i <= -252312017) {
                                            throw new IllegalStateException();
                                        }
                                        n8 = n7 * (2.0f * a5);
                                        n9 = 1.0f - n7;
                                    }
                                    else {
                                        final float n10 = method2245 / n4;
                                        final float n11 = a2 / n4;
                                        n8 = ((n10 - n11) * (2.0f * a5 * n10) - (a - n) * (n11 - 1.0f)) * n7;
                                        n9 = (n10 - 1.0f) * (n11 - 1.0f) * (n7 - 1.0f);
                                    }
                                    if (n8 > 0.0) {
                                        if (i <= -252312017) {
                                            throw new IllegalStateException();
                                        }
                                        n9 = -n9;
                                    }
                                    else {
                                        n8 = -n8;
                                    }
                                    final float n12 = a4;
                                    a4 = a3;
                                    if (n8 * 2.0f < a5 * 3.0f * n9 - Math.abs(n6 * n9)) {
                                        if (i <= -252312017) {
                                            throw new IllegalStateException();
                                        }
                                        if (n8 < Math.abs(n12 * 0.5f * n9)) {
                                            if (i <= -252312017) {
                                                throw new IllegalStateException();
                                            }
                                            a3 = n8 / n9;
                                            break Label_0656;
                                        }
                                    }
                                    a3 = (a4 = a5);
                                    break Label_0656;
                                }
                                if (i <= -252312017) {
                                    throw new IllegalStateException();
                                }
                            }
                            a3 = (a4 = a5);
                        }
                        n = a;
                        method2245 = a2;
                        if (Math.abs(a3) > n6) {
                            if (i <= -252312017) {
                                throw new IllegalStateException();
                            }
                            a += a3;
                        }
                        else if (a5 > 0.0) {
                            if (i <= -252312017) {
                                throw new IllegalStateException();
                            }
                            a += n6;
                        }
                        else {
                            a -= n6;
                        }
                        a2 = class424.method2245(class427.field3813, 754853883 * class427.field3812, a, -822537260);
                        if (a2 * (n4 / Math.abs(n4)) > 0.0) {
                            continue Label_0182_Outer;
                        }
                        b = true;
                        continue;
                    }
                } while (i > -252312017);
            }
            throw new IllegalStateException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "io.aw(" + ')');
        }
    }
    
    public static Frames method1297(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final int n, final boolean b) {
        boolean b2 = true;
        final int[] yk = AbstractArchive.yk(abstractArchive, n, 782560030);
        for (int i = 0; i < yk.length; ++i) {
            final byte[] file = abstractArchive.getFile(n, yk[i], -606351717);
            if (null == file) {
                b2 = false;
            }
            else {
                final int n2 = (file[0] & 0xFF) << 8 | (file[1] & 0xFF);
                byte[] array;
                if (b) {
                    array = abstractArchive2.getFile(0, n2, -606351717);
                }
                else {
                    array = abstractArchive2.getFile(n2, 0, -606351717);
                }
                if (null == array) {
                    b2 = false;
                }
            }
        }
        if (!b2) {
            return null;
        }
        try {
            return new Frames(abstractArchive, abstractArchive2, n, b);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public boolean hasAlphaTransform(final int n, final int n2) {
        try {
            return this.frames[n].hasAlphaTransform;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "io.an(" + ')');
        }
    }
    
    public boolean ac(final int n) {
        return this.frames[n].hasAlphaTransform;
    }
    
    public static boolean aa(final Frames frames, final int n) {
        return frames.frames[n].hasAlphaTransform;
    }
    
    public Animation[] gl() {
        return this.frames;
    }
    
    public boolean ab(final int n) {
        return this.frames[n].hasAlphaTransform;
    }
}
