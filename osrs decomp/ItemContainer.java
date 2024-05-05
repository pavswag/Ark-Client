import javax.annotation.Nonnull;
import net.runelite.api.Item;

// 
// Decompiled by Procyon v0.5.36
// 

public class ItemContainer extends Node implements net.runelite.api.ItemContainer
{
    static NodeHashTable itemContainers;
    int[] quantities;
    static int currentPort;
    static boolean field844;
    static final int ap = 0;
    int[] ids;
    public static final int ah = 91;
    
    ItemContainer() {
        this.quantities = new int[] { -1 };
        this.ids = new int[] { 0 };
    }
    
    static {
        ItemContainer.itemContainers = new NodeHashTable(32);
    }
    
    public int size() {
        return this.ch().length;
    }
    
    public int count() {
        final int[] ch = this.ch();
        int n = 0;
        final int[] array = ch;
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] != -1) {
                ++n;
            }
        }
        return n;
    }
    
    public int count(final int n) {
        final int[] ch = this.ch();
        final int[] xe = this.xe();
        int n2 = 0;
        for (int i = 0; i < ch.length; ++i) {
            if (ch[i] == n) {
                final int n3 = xe[i];
                if (n3 > 1) {
                    return n3;
                }
                ++n2;
            }
        }
        return n2;
    }
    
    public int[] ch() {
        return this.quantities;
    }
    
    public boolean contains(final int n) {
        final int[] ch = this.ch();
        for (int length = ch.length, i = 0; i < length; ++i) {
            if (ch[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    public int getId() {
        return (int)this.getHash();
    }
    
    static void ao(final int n, final int n2, final int n3, final int n4) {
        ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
        if (itemContainer == null) {
            itemContainer = new ItemContainer();
            ItemContainer.itemContainers.put(itemContainer, n);
        }
        if (itemContainer.quantities.length <= n2) {
            final int[] quantities = new int[n2 + 1];
            final int[] ids = new int[1 + n2];
            for (int i = 0; i < itemContainer.quantities.length; ++i) {
                quantities[i] = itemContainer.quantities[i];
                ids[i] = itemContainer.ids[i];
            }
            for (int j = itemContainer.quantities.length; j < n2; ++j) {
                quantities[j] = -1;
                ids[j] = 0;
            }
            itemContainer.quantities = quantities;
            itemContainer.ids = ids;
        }
        itemContainer.quantities[n2] = n3;
        itemContainer.ids[n2] = n4;
    }
    
    static int at(final int n, final int n2) {
        final ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
        if (itemContainer == null) {
            return 0;
        }
        if (n2 < 0 || n2 >= itemContainer.ids.length) {
            return 0;
        }
        return itemContainer.ids[n2];
    }
    
    static void av(final int n) {
        final ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
        if (null == itemContainer) {
            return;
        }
        itemContainer.hw();
    }
    
    static void ax(final int n, final int n2, final int n3, final int n4) {
        ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
        if (itemContainer == null) {
            itemContainer = new ItemContainer();
            ItemContainer.itemContainers.put(itemContainer, n);
        }
        if (itemContainer.quantities.length <= n2) {
            final int[] quantities = new int[n2 + 1];
            final int[] ids = new int[1 + n2];
            for (int i = 0; i < itemContainer.quantities.length; ++i) {
                quantities[i] = itemContainer.quantities[i];
                ids[i] = itemContainer.ids[i];
            }
            for (int j = itemContainer.quantities.length; j < n2; ++j) {
                quantities[j] = -1;
                ids[j] = 0;
            }
            itemContainer.quantities = quantities;
            itemContainer.ids = ids;
        }
        itemContainer.quantities[n2] = n3;
        itemContainer.ids[n2] = n4;
    }
    
    static int ay(final int n, final int n2) {
        final ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
        if (null == itemContainer) {
            return 0;
        }
        if (-1 == n2) {
            return 0;
        }
        int n3 = 0;
        for (int i = 0; i < itemContainer.ids.length; ++i) {
            if (n2 == itemContainer.quantities[i]) {
                n3 += itemContainer.ids[i];
            }
        }
        return n3;
    }
    
    static int al(final int n, final int n2) {
        final ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
        if (itemContainer == null) {
            return 0;
        }
        if (n2 >= 0 && n2 < itemContainer.ids.length) {
            return itemContainer.ids[n2];
        }
        return 0;
    }
    
    public static SequenceDefinition SpotAnimationDefinition_get(final int eh, final byte b) {
        synchronized (SequenceDefinition.SequenceDefinition_cached) {
            final int n = 28;
            SequenceDefinition sequenceDefinition2;
            try {
                final SequenceDefinition sequenceDefinition = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.wr(eh);
                if (null != sequenceDefinition) {
                    if (n <= -1) {
                        throw new IllegalStateException();
                    }
                    sequenceDefinition2 = sequenceDefinition;
                }
                else {
                    final byte[] takeFile = SequenceDefinition.SequenceDefinition_archive.takeFile(12, eh, (byte)(-5));
                    final SequenceDefinition sequenceDefinition3 = new SequenceDefinition();
                    if (takeFile != null) {
                        if (n <= -1) {
                            throw new IllegalStateException();
                        }
                        sequenceDefinition3.decode(new Buffer(takeFile), 1877633819);
                    }
                    sequenceDefinition3.postDecode(-1974157576);
                    SequenceDefinition.SequenceDefinition_cached.put(sequenceDefinition3, eh);
                    sequenceDefinition2 = sequenceDefinition3;
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "dc.an(" + ')');
            }
            final SequenceDefinition sequenceDefinition4 = sequenceDefinition2;
            sequenceDefinition4.eh = eh;
            return sequenceDefinition4;
        }
    }
    
    public static SpotAnimationDefinition SpotAnimationDefinition_get(final int n, final int n2) {
        try {
            final SpotAnimationDefinition spotAnimationDefinition = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.wr(n);
            if (spotAnimationDefinition == null) {
                final byte[] takeFile = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, n, (byte)(-82));
                final SpotAnimationDefinition spotAnimationDefinition2 = new SpotAnimationDefinition();
                spotAnimationDefinition2.id = n * 903573465;
                if (takeFile != null) {
                    spotAnimationDefinition2.decode(new Buffer(takeFile), (byte)2);
                }
                SpotAnimationDefinition.SpotAnimationDefinition_cached.put(spotAnimationDefinition2, n);
                return spotAnimationDefinition2;
            }
            if (n2 <= -1390356452) {
                throw new IllegalStateException();
            }
            return spotAnimationDefinition;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dc.an(" + ')');
        }
    }
    
    public static Coord rr(final WorldMap worldMap) {
        if (worldMap.currentMapArea == null) {
            return null;
        }
        return worldMap.currentMapArea.coord(worldMap.getDisplayX(-624867937), worldMap.getDisplayY((byte)0), 1507339067);
    }
    
    public Item getItem(final int n) {
        final int[] ch = this.ch();
        final int[] xe = this.xe();
        if (n < 0 || n >= ch.length || ch[n] == -1) {
            return null;
        }
        return new Item(ch[n], xe[n]);
    }
    
    static int aa(final int n, final int n2) {
        final ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
        if (null == itemContainer) {
            return 0;
        }
        if (-1 == n2) {
            return 0;
        }
        int n3 = 0;
        for (int i = 0; i < itemContainer.ids.length; ++i) {
            if (n2 == itemContainer.quantities[i]) {
                n3 += itemContainer.ids[i];
            }
        }
        return n3;
    }
    
    static void ai(final int n, final int n2, final int n3, final int n4) {
        ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
        if (itemContainer == null) {
            itemContainer = new ItemContainer();
            ItemContainer.itemContainers.put(itemContainer, n);
        }
        if (itemContainer.quantities.length <= n2) {
            final int[] quantities = new int[n2 + 1];
            final int[] ids = new int[1 + n2];
            for (int i = 0; i < itemContainer.quantities.length; ++i) {
                quantities[i] = itemContainer.quantities[i];
                ids[i] = itemContainer.ids[i];
            }
            for (int j = itemContainer.quantities.length; j < n2; ++j) {
                quantities[j] = -1;
                ids[j] = 0;
            }
            itemContainer.quantities = quantities;
            itemContainer.ids = ids;
        }
        itemContainer.quantities[n2] = n3;
        itemContainer.ids[n2] = n4;
    }
    
    public int[] xe() {
        return this.ids;
    }
    
    static int aq(final int n, final int n2) {
        final ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
        if (itemContainer == null) {
            return -1;
        }
        if (n2 >= 0 && n2 < itemContainer.quantities.length) {
            return itemContainer.quantities[n2];
        }
        return -1;
    }
    
    static void ag(final int n) {
        final ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
        if (itemContainer == null) {
            return;
        }
        for (int i = 0; i < itemContainer.quantities.length; ++i) {
            itemContainer.quantities[i] = -1;
            itemContainer.ids[i] = 0;
        }
    }
    
    @Nonnull
    public Item[] getItems() {
        final int[] ch = this.ch();
        final int[] xe = this.xe();
        final Item[] array = new Item[ch.length];
        for (int i = 0; i < ch.length; ++i) {
            array[i] = new Item(ch[i], xe[i]);
        }
        return array;
    }
    
    static final String method480(final int n, final int n2, final byte b) {
        try {
            final int n3 = n2 - n;
            if (n3 < -9) {
                if (b <= 2) {
                    throw new IllegalStateException();
                }
                return class383.method2081(16711680, 327193286);
            }
            else if (n3 < -6) {
                if (b <= 2) {
                    throw new IllegalStateException();
                }
                return class383.method2081(16723968, -746561383);
            }
            else if (n3 < -3) {
                if (b <= 2) {
                    throw new IllegalStateException();
                }
                return class383.method2081(16740352, -1933224405);
            }
            else if (n3 < 0) {
                if (b <= 2) {
                    throw new IllegalStateException();
                }
                return class383.method2081(16756736, -2006135327);
            }
            else if (n3 > 9) {
                if (b <= 2) {
                    throw new IllegalStateException();
                }
                return class383.method2081(65280, -1361344670);
            }
            else if (n3 > 6) {
                if (b <= 2) {
                    throw new IllegalStateException();
                }
                return class383.method2081(4259584, -1613667929);
            }
            else if (n3 > 3) {
                if (b <= 2) {
                    throw new IllegalStateException();
                }
                return class383.method2081(8453888, -1208659774);
            }
            else {
                if (n3 <= 0) {
                    return class383.method2081(16776960, 1025722806);
                }
                if (b <= 2) {
                    throw new IllegalStateException();
                }
                return class383.method2081(12648192, 579262578);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dc.lu(" + ')');
        }
    }
    
    static void ah(final int n) {
        final ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
        if (itemContainer == null) {
            return;
        }
        for (int i = 0; i < itemContainer.quantities.length; ++i) {
            itemContainer.quantities[i] = -1;
            itemContainer.ids[i] = 0;
        }
    }
}
