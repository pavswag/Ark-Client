import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.36
// 

public class GrandExchangeEvents
{
    public static Comparator GrandExchangeEvents_quantityComparator;
    public static Comparator GrandExchangeEvents_ageComparator;
    public final List events;
    public static Comparator GrandExchangeEvents_nameComparator;
    public static Comparator GrandExchangeEvents_priceComparator;
    
    public GrandExchangeEvents(final Buffer buffer, final boolean b) {
        final int unsignedShort = buffer.readUnsignedShort(-1361207699);
        byte b2;
        if (Buffer.ra(buffer, (byte)7) == 1) {
            b2 = 1;
        }
        else {
            b2 = 0;
        }
        final int unsignedShort2 = buffer.readUnsignedShort(-2077620060);
        this.events = new ArrayList(unsignedShort2);
        for (int i = 0; i < unsignedShort2; ++i) {
            this.events.add(new GrandExchangeEvent(buffer, b2, unsignedShort));
        }
    }
    
    static {
        GrandExchangeEvents.GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
        new GrandExchangeOfferWorldComparator();
        GrandExchangeEvents.GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
        GrandExchangeEvents.GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
        GrandExchangeEvents.GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
    }
    
    public void aw(final Comparator comparator, final boolean b) {
        if (b) {
            Collections.sort((List<Object>)this.events, comparator);
        }
        else {
            Collections.sort((List<Object>)this.events, (Comparator<? super Object>)Collections.reverseOrder((Comparator<? super T>)comparator));
        }
    }
    
    static final void updatePlayers(final PacketBuffer packetBuffer, final int i, final int n) {
        try {
            final int n2 = packetBuffer.at * -1633313603;
            Players.Players_pendingUpdateCount = 0;
            int n3 = 0;
            PacketBuffer.jb(packetBuffer, (byte)(-26));
            for (int j = 0; j < Players.Players_count * -2010934433; ++j) {
                if (n == 191702299) {
                    throw new IllegalStateException();
                }
                final int n4 = Players.Players_indices[j];
                if ((Players.activityFlags[n4] & 0x1) == 0x0) {
                    if (n == 191702299) {
                        throw new IllegalStateException();
                    }
                    if (n3 > 0) {
                        if (n == 191702299) {
                            Client.ao(packetBuffer, i);
                            return;
                        }
                        --n3;
                        final byte[] activityFlags = Players.activityFlags;
                        final int n5 = n4;
                        activityFlags[n5] |= 0x2;
                    }
                    else if (0 == packetBuffer.bitsRemaining(1, -2142787184)) {
                        n3 = LoginScreenAnimation.draw(packetBuffer, 197503678);
                        final byte[] activityFlags2 = Players.activityFlags;
                        final int n6 = n4;
                        activityFlags2[n6] |= 0x2;
                    }
                    else {
                        class330.readPlayerUpdate(packetBuffer, n4, -547893919);
                    }
                }
            }
            packetBuffer.exportIndex((byte)(-38));
            if (n3 != 0) {
                throw new RuntimeException();
            }
            PacketBuffer.jb(packetBuffer, (byte)89);
            for (int k = 0; k < Players.Players_count * -2010934433; ++k) {
                if (n == 191702299) {
                    throw new IllegalStateException();
                }
                final int n7 = Players.Players_indices[k];
                if ((Players.activityFlags[n7] & 0x1) != 0x0) {
                    if (n == 191702299) {
                        Client.ao(packetBuffer, i);
                        return;
                    }
                    if (n3 > 0) {
                        if (n == 191702299) {
                            throw new IllegalStateException();
                        }
                        --n3;
                        final byte[] activityFlags3 = Players.activityFlags;
                        final int n8 = n7;
                        activityFlags3[n8] |= 0x2;
                    }
                    else if (0 == packetBuffer.bitsRemaining(1, -1579324042)) {
                        if (n == 191702299) {
                            Client.ao(packetBuffer, i);
                            return;
                        }
                        n3 = LoginScreenAnimation.draw(packetBuffer, 197503678);
                        final byte[] activityFlags4 = Players.activityFlags;
                        final int n9 = n7;
                        activityFlags4[n9] |= 0x2;
                    }
                    else {
                        class330.readPlayerUpdate(packetBuffer, n7, -621611682);
                    }
                }
            }
            packetBuffer.exportIndex((byte)(-26));
            if (n3 != 0) {
                throw new RuntimeException();
            }
            PacketBuffer.jb(packetBuffer, (byte)86);
            for (int l = 0; l < 228405989 * Players.Players_emptyIdxCount; ++l) {
                final int n10 = Players.Players_emptyIndices[l];
                if (0x0 != (Players.activityFlags[n10] & 0x1)) {
                    if (n == 191702299) {
                        throw new IllegalStateException();
                    }
                    if (n3 > 0) {
                        --n3;
                        final byte[] activityFlags5 = Players.activityFlags;
                        final int n11 = n10;
                        activityFlags5[n11] |= 0x2;
                    }
                    else if (packetBuffer.bitsRemaining(1, -1415715820) == 0) {
                        if (n == 191702299) {
                            throw new IllegalStateException();
                        }
                        n3 = LoginScreenAnimation.draw(packetBuffer, 197503678);
                        final byte[] activityFlags6 = Players.activityFlags;
                        final int n12 = n10;
                        activityFlags6[n12] |= 0x2;
                    }
                    else if (WorldMapID.updateExternalPlayer(packetBuffer, n10, 940918989)) {
                        if (n == 191702299) {
                            throw new IllegalStateException();
                        }
                        final byte[] activityFlags7 = Players.activityFlags;
                        final int n13 = n10;
                        activityFlags7[n13] |= 0x2;
                    }
                }
            }
            packetBuffer.exportIndex((byte)(-86));
            if (n3 != 0) {
                if (n == 191702299) {
                    Client.ao(packetBuffer, i);
                    return;
                }
                throw new RuntimeException();
            }
            else {
                PacketBuffer.jb(packetBuffer, (byte)(-38));
                for (int n14 = 0; n14 < Players.Players_emptyIdxCount * 228405989; ++n14) {
                    if (n == 191702299) {
                        throw new IllegalStateException();
                    }
                    final int n15 = Players.Players_emptyIndices[n14];
                    if (0x0 == (Players.activityFlags[n15] & 0x1)) {
                        if (n3 > 0) {
                            if (n == 191702299) {
                                throw new IllegalStateException();
                            }
                            --n3;
                            final byte[] activityFlags8 = Players.activityFlags;
                            final int n16 = n15;
                            activityFlags8[n16] |= 0x2;
                        }
                        else if (0 == packetBuffer.bitsRemaining(1, 315434392)) {
                            if (n == 191702299) {
                                Client.ao(packetBuffer, i);
                                return;
                            }
                            n3 = LoginScreenAnimation.draw(packetBuffer, 197503678);
                            final byte[] activityFlags9 = Players.activityFlags;
                            final int n17 = n15;
                            activityFlags9[n17] |= 0x2;
                        }
                        else if (WorldMapID.updateExternalPlayer(packetBuffer, n15, -1019526045)) {
                            final byte[] activityFlags10 = Players.activityFlags;
                            final int n18 = n15;
                            activityFlags10[n18] |= 0x2;
                        }
                    }
                }
                packetBuffer.exportIndex((byte)(-20));
                if (n3 != 0) {
                    if (n == 191702299) {
                        Client.ao(packetBuffer, i);
                        return;
                    }
                    throw new RuntimeException();
                }
                else {
                    Players.Players_count = 0;
                    Players.Players_emptyIdxCount = 0;
                    for (int n19 = 1; n19 < 2048; ++n19) {
                        if (n == 191702299) {
                            throw new IllegalStateException();
                        }
                        final byte[] activityFlags11 = Players.activityFlags;
                        final int n20 = n19;
                        activityFlags11[n20] >>= 1;
                        if (Client.players[n19] != null) {
                            if (n == 191702299) {
                                throw new IllegalStateException();
                            }
                            Players.Players_indices[(Players.Players_count += 511936671) * -2010934433 - 1] = n19;
                        }
                        else {
                            Players.Players_emptyIndices[(Players.Players_emptyIdxCount += 2033203949) * 228405989 - 1] = n19;
                        }
                    }
                    WorldMapLabelSize.method1397(packetBuffer, (byte)7);
                    if (-1633313603 * packetBuffer.at - n2 == i) {
                        Client.ao(packetBuffer, i);
                        return;
                    }
                    if (n == 191702299) {
                        throw new IllegalStateException();
                    }
                    throw new RuntimeException(packetBuffer.at * -1633313603 - n2 + " " + i);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nr.an(" + ')');
        }
    }
    
    public void updatePlayers(final Comparator comparator, final boolean b) {
        if (b) {
            Collections.sort((List<Object>)this.events, comparator);
        }
        else {
            Collections.sort((List<Object>)this.events, (Comparator<? super Object>)Collections.reverseOrder((Comparator<? super T>)comparator));
        }
    }
    
    public void ac(final Comparator comparator, final boolean b) {
        if (b) {
            Collections.sort((List<Object>)this.events, comparator);
        }
        else {
            Collections.sort((List<Object>)this.events, (Comparator<? super Object>)Collections.reverseOrder((Comparator<? super T>)comparator));
        }
    }
    
    public void au(final Comparator comparator, final boolean b) {
        if (b) {
            Collections.sort((List<Object>)this.events, comparator);
        }
        else {
            Collections.sort((List<Object>)this.events, (Comparator<? super Object>)Collections.reverseOrder((Comparator<? super T>)comparator));
        }
    }
    
    public void sort(final Comparator comparator, final boolean b, final int n) {
        try {
            if (b) {
                if (n != 694808074) {
                    return;
                }
                Collections.sort((List<Object>)this.events, comparator);
            }
            else {
                Collections.sort((List<Object>)this.events, (Comparator<? super Object>)Collections.reverseOrder((Comparator<? super T>)comparator));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nr.af(" + ')');
        }
    }
}
