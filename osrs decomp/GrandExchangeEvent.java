// 
// Decompiled by Procyon v0.5.36
// 

public class GrandExchangeEvent
{
    public final long age;
    public final int world;
    public final GrandExchangeOffer grandExchangeOffer;
    String previousOfferName;
    String offerName;
    static long field3524;
    
    GrandExchangeEvent(final Buffer buffer, final byte b, final int n) {
        this.previousOfferName = buffer.readStringCp1252NullTerminated((byte)0);
        this.offerName = buffer.readStringCp1252NullTerminated((byte)0);
        this.world = buffer.readUnsignedShort(-981226247) * -754309593;
        this.age = Buffer.ks(buffer, (byte)1) * -1320905308375172459L;
        final int int1 = buffer.readInt(-1136532466);
        final int int2 = buffer.readInt(-1342350443);
        (this.grandExchangeOffer = new GrandExchangeOffer()).method1928(2, (byte)99);
        this.grandExchangeOffer.method1927(b, 2014183796);
        this.grandExchangeOffer.unitPrice = 945098885 * int1;
        this.grandExchangeOffer.totalQuantity = 275172041 * int2;
        this.grandExchangeOffer.currentQuantity = 0;
        this.grandExchangeOffer.currentPrice = 0;
        this.grandExchangeOffer.id = -2000800301 * n;
    }
    
    public String aw() {
        return this.previousOfferName;
    }
    
    public String getPreviousOfferName(final int n) {
        try {
            return this.offerName;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nu.an(" + ')');
        }
    }
    
    public String ac() {
        return this.offerName;
    }
    
    public static void method1922(final int n) {
        try {
            HealthBarDefinition.HealthBarDefinition_cached.clear();
            HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nu.au(" + ')');
        }
    }
    
    static float getOfferName(final class125 class125, final float n, final int n2) {
        try {
            if (class125 != null) {
                if (n2 >= 1411328115) {
                    throw new IllegalStateException();
                }
                if (class125.method748((short)(-10805)) == 0) {
                    if (n2 >= 1411328115) {
                        throw new IllegalStateException();
                    }
                }
                else if (n < -834721191 * class125.field1219[0].field1175) {
                    if (class123.field1207 != class125.field1220) {
                        return Message.isFromFriend(class125, n, true, 1357377055);
                    }
                    if (n2 >= 1411328115) {
                        throw new IllegalStateException();
                    }
                    return class125.field1219[0].field1178;
                }
                else if (n > class125.field1219[class125.method748((short)(-29102)) - 1].field1175 * -834721191) {
                    if (n2 >= 1411328115) {
                        throw new IllegalStateException();
                    }
                    if (class123.field1207 != class125.field1236) {
                        return Message.isFromFriend(class125, n, false, 1925410939);
                    }
                    if (n2 >= 1411328115) {
                        throw new IllegalStateException();
                    }
                    return class125.field1219[class125.method748((short)(-12284)) - 1].field1178;
                }
                else {
                    if (class125.field1216) {
                        return class125.field1219[0].field1178;
                    }
                    final class120 method747 = class125.method747(n, 692284858);
                    boolean b = false;
                    int n3 = 0;
                    if (method747 == null) {
                        return 0.0f;
                    }
                    if (n2 >= 1411328115) {
                        throw new IllegalStateException();
                    }
                    Label_0834: {
                        if (method747.field1176 == 0.0) {
                            if (n2 >= 1411328115) {
                                throw new IllegalStateException();
                            }
                            if (method747.field1173 == 0.0) {
                                if (n2 >= 1411328115) {
                                    throw new IllegalStateException();
                                }
                                b = true;
                                break Label_0834;
                            }
                        }
                        if (Float.MAX_VALUE == method747.field1176) {
                            if (n2 >= 1411328115) {
                                throw new IllegalStateException();
                            }
                            if (Float.MAX_VALUE == method747.field1173) {
                                if (n2 >= 1411328115) {
                                    throw new IllegalStateException();
                                }
                                n3 = 1;
                                break Label_0834;
                            }
                        }
                        if (null != method747.field1177) {
                            if (class125.field1232) {
                                if (n2 >= 1411328115) {
                                    throw new IllegalStateException();
                                }
                                final float field1221 = (float)(method747.field1175 * -834721191);
                                final float field1222 = method747.field1178;
                                final float n4 = field1221 + method747.field1176 * 0.33333334f;
                                final float n5 = field1222 + method747.field1173 * 0.33333334f;
                                final float n6 = (float)(-834721191 * method747.field1177.field1175);
                                final float field1223 = method747.field1177.field1178;
                                final float n7 = n6 - 0.33333334f * method747.field1177.field1174;
                                final float n8 = field1223 - 0.33333334f * method747.field1177.field1172;
                                if (class125.field1231) {
                                    if (n2 >= 1411328115) {
                                        throw new IllegalStateException();
                                    }
                                    ParamComposition.decode(class125, field1221, n4, n7, n6, field1222, n5, n8, field1223, -2028355721);
                                }
                                else if (class125 == null) {
                                    if (n2 >= 1411328115) {
                                        throw new IllegalStateException();
                                    }
                                }
                                else {
                                    class125.field1221 = field1221;
                                    final float n9 = n6 - field1221;
                                    final float n10 = field1223 - field1222;
                                    final float n11 = n4 - field1221;
                                    float field1224 = 0.0f;
                                    float n12 = 0.0f;
                                    if (n11 != 0.0) {
                                        field1224 = (n5 - field1222) / n11;
                                    }
                                    final float n13 = n6 - n7;
                                    if (0.0 != n13) {
                                        if (n2 >= 1411328115) {
                                            throw new IllegalStateException();
                                        }
                                        n12 = (field1223 - n8) / n13;
                                    }
                                    final float n14 = 1.0f / (n9 * n9);
                                    final float n15 = n9 * field1224;
                                    final float n16 = n12 * n9;
                                    class125.field1223 = (n16 + n15 - n10 - n10) * n14 / n9;
                                    class125.field1224 = (n10 + (n10 + n10) - n15 - n15 - n16) * n14;
                                    class125.field1237 = field1224;
                                    class125.field1226 = field1222;
                                }
                                class125.field1232 = false;
                            }
                        }
                        else {
                            b = true;
                        }
                    }
                    if (b) {
                        if (n2 >= 1411328115) {
                            throw new IllegalStateException();
                        }
                        return method747.field1178;
                    }
                    else if (n3 != 0) {
                        if (n2 >= 1411328115) {
                            throw new IllegalStateException();
                        }
                        if (n != method747.field1175 * -834721191) {
                            if (n2 >= 1411328115) {
                                throw new IllegalStateException();
                            }
                            if (null != method747.field1177) {
                                return method747.field1177.field1178;
                            }
                            if (n2 >= 1411328115) {
                                throw new IllegalStateException();
                            }
                        }
                        return method747.field1178;
                    }
                    else {
                        if (!class125.field1231) {
                            return class14.method52(class125, n, (byte)88);
                        }
                        if (n2 >= 1411328115) {
                            throw new IllegalStateException();
                        }
                        float n17;
                        if (null == class125) {
                            if (n2 >= 1411328115) {
                                throw new IllegalStateException();
                            }
                            n17 = 0.0f;
                        }
                        else {
                            float n18;
                            if (n == class125.field1221) {
                                if (n2 >= 1411328115) {
                                    throw new IllegalStateException();
                                }
                                n18 = 0.0f;
                            }
                            else if (class125.field1229 == n) {
                                if (n2 >= 1411328115) {
                                    throw new IllegalStateException();
                                }
                                n18 = 1.0f;
                            }
                            else {
                                n18 = (n - class125.field1221) / (class125.field1229 - class125.field1221);
                            }
                            float n19;
                            if (class125.field1217) {
                                n19 = n18;
                            }
                            else {
                                class121.field1183[3] = class125.field1226;
                                class121.field1183[2] = class125.field1237;
                                class121.field1183[1] = class125.field1224;
                                class121.field1183[0] = class125.field1223 - n18;
                                class121.field1182[0] = 0.0f;
                                class121.field1182[1] = 0.0f;
                                class121.field1182[2] = 0.0f;
                                class121.field1182[3] = 0.0f;
                                class121.field1182[4] = 0.0f;
                                if (1 == class103.method638(class121.field1183, 3, 0.0f, true, 1.0f, true, class121.field1182, (byte)(-57))) {
                                    if (n2 >= 1411328115) {
                                        throw new IllegalStateException();
                                    }
                                    n19 = class121.field1182[0];
                                }
                                else {
                                    n19 = 0.0f;
                                }
                            }
                            n17 = class125.field1227 + (class125.field1228 + (class125.field1230 * n19 + class125.field1225) * n19) * n19;
                        }
                        return n17;
                    }
                }
            }
            return 0.0f;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nu.af(" + ')');
        }
    }
    
    public String getOfferName(final int n) {
        try {
            return this.previousOfferName;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nu.af(" + ')');
        }
    }
    
    public String ab() {
        return this.offerName;
    }
    
    public String aq() {
        return this.previousOfferName;
    }
    
    public static String yc(final GrandExchangeEvent grandExchangeEvent, final int n) {
        if (grandExchangeEvent == null) {
            return grandExchangeEvent.getOfferName(n);
        }
        try {
            return grandExchangeEvent.previousOfferName;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nu.af(" + ')');
        }
    }
}
