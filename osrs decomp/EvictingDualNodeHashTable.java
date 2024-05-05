import net.runelite.api.NodeCache;

// 
// Decompiled by Procyon v0.5.36
// 

public final class EvictingDualNodeHashTable implements NodeCache
{
    int remainingCapacity;
    public float lb;
    public int tp;
    DualNode dualNode;
    int capacity;
    IterableNodeHashTable hashTable;
    IterableDualNodeQueue deque;
    
    public EvictingDualNodeHashTable(final int n) {
        this.lb = 0.0f;
        this.dualNode = new DualNode();
        this.deque = new IterableDualNodeQueue();
        this.capacity = n;
        this.remainingCapacity = n;
        int n2;
        for (n2 = 1; n2 + n2 < n; n2 += n2) {}
        this.hashTable = new IterableNodeHashTable(n2);
        this.pi();
    }
    
    public void reset() {
        this.clear();
    }
    
    public void fd(final int n) {
        if (n <= this.capacity) {
            return;
        }
        int i;
        for (i = 1; i < n; i += i) {}
        this.capacity = i;
        this.reset();
        this.hashTable = IterableNodeHashTable.yz(i);
    }
    
    public void at(final long n) {
        final DualNode dualNode = (DualNode)this.hashTable.aa(n);
        if (dualNode != null) {
            dualNode.hw();
            GrandExchangeOfferWorldComparator.os(dualNode);
            ++this.remainingCapacity;
        }
    }
    
    public static void fv(final String s, final EvictingDualNodeHashTable evictingDualNodeHashTable) {
        synchronized (evictingDualNodeHashTable) {
            final EvictingDualNodeHashTable evictingDualNodeHashTable2 = evictingDualNodeHashTable;
            final boolean lu = evictingDualNodeHashTable2.lu();
            evictingDualNodeHashTable2.lb = evictingDualNodeHashTable2.lb * 0.92f + (lu ? 0.07999998f : 0.0f);
            if (lu) {
                if (evictingDualNodeHashTable2.lb > 0.2f) {
                    Client.nw.trace("cache {} is thrashing", (Object)s);
                }
                if (evictingDualNodeHashTable2.lb > 0.9f && evictingDualNodeHashTable2.capacity < evictingDualNodeHashTable2.tp * 8) {
                    evictingDualNodeHashTable2.fd(evictingDualNodeHashTable2.capacity * 2);
                    Client.nw.info("cache {} thrashing, enlarging to {} entries", (Object)s, (Object)evictingDualNodeHashTable2.capacity);
                }
            }
            class314.jy(evictingDualNodeHashTable2.deque, evictingDualNodeHashTable2.dualNode);
        }
    }
    
    public static void ax() {
        fv("EnumDefinition_cached", EnumComposition.EnumDefinition_cached);
        fv("SpotAnimationDefinition_cachedModels", SpotAnimationDefinition.SpotAnimationDefinition_cached);
        fv("animPoseCache", SequenceDefinition.SequenceDefinition_cachedFrames);
        fv("animationCache", SequenceDefinition.SequenceDefinition_cached);
        fv("cachedModels2", ObjectComposition.ObjectDefinition_cachedModels);
        fv("dbRowConfigCache", DbRowType.DBRowType_cache);
        fv("dbTableConfigCache", DbTableType.DBTableType_cache);
        fv("dbTableIndexCache", Client.Widget_cachedModels);
        fv("dbTableMasterIndexCache", Client.Widget_cachedFonts);
        fv("field1938", VarcInt.VarcInt_cached);
        fv("field2075", SpotAnimationDefinition.SpotAnimationDefinition_cachedModels);
        fv("field3508", PlayerComposition.PlayerAppearance_cachedModels);
        fv("field3562", Widget.Widget_cachedModels);
        fv("fontCache", HitSplatDefinition.HitSplatDefinition_cachedFonts);
        fv("healthBarCache", HealthBarDefinition.HealthBarDefinition_cached);
        fv("healthBarSpriteCache", HealthBarDefinition.HealthBarDefinition_cachedSprites);
        fv("hitsplatCompCache", HitSplatDefinition.HitSplatDefinition_cached);
        fv("hitsplatFontCache", HitSplatDefinition.HitSplatDefinition_cachedSprites);
        fv("identKits", KitDefinition.KitDefinition_cached);
        fv("indexPoses", Widget.Widget_cachedFonts);
        fv("indexRigs", Widget.Widget_cachedSpriteMasks);
        fv("inventoryCache", InvDefinition.InvDefinition_cached);
        fv("itemModelCache", ItemComposition.ItemDefinition_cachedModels);
        fv("itemSpriteCache", ItemComposition.ItemDefinition_cachedSprites);
        fv("items", ItemComposition.ItemDefinition_cached);
        fv("npcModelCache", NPCComposition.NpcDefinition_cachedModels);
        fv("npcs", NPCComposition.NpcDefinition_cached);
        fv("objModelDataCache", ObjectComposition.ObjectDefinition_cachedModelData);
        fv("objects", ObjectComposition.ObjectDefinition_cached);
        fv("overlays", FloorOverlayDefinition.FloorOverlayDefinition_cached);
        fv("paramCompositionCache", ParamComposition.ParamDefinition_cached);
        fv("playerCachedModels", WorldMapElement.WorldMapElement_cachedSprites);
        fv("scriptCache", Script.Script_cached);
        fv("spotanims", SequenceDefinition.SequenceDefinition_cachedModel);
        fv("structCompositionCache", StructComposition.StructDefinition_cached);
        fv("underlays", FloorUnderlayDefinition.FloorUnderlayDefinition_cached);
        fv("varbits", VarbitComposition.VarbitDefinition_cached);
        fv("varplayers", VarpDefinition.VarpDefinition_cached);
        fv("widgetSpriteCache", Widget.Widget_cachedSprites);
    }
    
    public void ay() {
        class125.yv(this.deque);
        this.hashTable.clear();
        this.dualNode = new DualNode();
        this.remainingCapacity = this.capacity;
    }
    
    public void pr() {
        this.lb = 0.0f;
        class314.jy(this.deque, this.dualNode);
    }
    
    public DualNode wr(final long n) {
        final DualNode dualNode = (DualNode)this.hashTable.aa(n);
        if (dualNode != null) {
            this.deque.add(dualNode);
        }
        return dualNode;
    }
    
    public void put(final DualNode dualNode, final long n) {
        if (this.remainingCapacity == 0) {
            final DualNode removeLast = this.deque.removeLast();
            removeLast.hw();
            GrandExchangeOfferWorldComparator.os(removeLast);
            if (removeLast == this.dualNode) {
                final DualNode removeLast2 = this.deque.removeLast();
                removeLast2.hw();
                GrandExchangeOfferWorldComparator.os(removeLast2);
            }
        }
        else {
            --this.remainingCapacity;
        }
        this.hashTable.put(dualNode, n);
        this.deque.add(dualNode);
    }
    
    public void al(final long n) {
        final DualNode dualNode = (DualNode)this.hashTable.aa(n);
        if (dualNode != null) {
            dualNode.hw();
            GrandExchangeOfferWorldComparator.os(dualNode);
            ++this.remainingCapacity;
        }
    }
    
    public void remove(final long n) {
        final DualNode dualNode = (DualNode)this.hashTable.aa(n);
        if (dualNode != null) {
            dualNode.hw();
            GrandExchangeOfferWorldComparator.os(dualNode);
            ++this.remainingCapacity;
        }
    }
    
    public void clear() {
        class125.yv(this.deque);
        this.hashTable.clear();
        this.dualNode = new DualNode();
        this.remainingCapacity = this.capacity;
        this.pr();
    }
    
    public static EvictingDualNodeHashTable nv(final int n) {
        return new EvictingDualNodeHashTable(n);
    }
    
    public void pi() {
        this.tp = this.capacity;
    }
    
    public void aa() {
        class125.yv(this.deque);
        this.hashTable.clear();
        this.dualNode = new DualNode();
        this.remainingCapacity = this.capacity;
    }
    
    public static DualNode sg(final EvictingDualNodeHashTable evictingDualNodeHashTable, final long n) {
        final DualNode dualNode = (DualNode)evictingDualNodeHashTable.hashTable.aa(n);
        if (dualNode != null) {
            evictingDualNodeHashTable.deque.add(dualNode);
        }
        return dualNode;
    }
    
    public DualNode get(final long n) {
        return this.wr(n);
    }
    
    public void aq(final long n) {
        final DualNode dualNode = (DualNode)this.hashTable.aa(n);
        if (dualNode != null) {
            dualNode.hw();
            GrandExchangeOfferWorldComparator.os(dualNode);
            ++this.remainingCapacity;
        }
    }
    
    public void dd(final int n) {
        this.fd(n);
        this.tp = this.capacity;
    }
    
    public void vq(final DualNode dualNode, final long n) {
        this.put(dualNode, n);
    }
    
    public boolean lu() {
        return this.remainingCapacity <= 0 && this.dualNode.pa() == null;
    }
}
