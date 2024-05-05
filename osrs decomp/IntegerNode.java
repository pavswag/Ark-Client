import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class IntegerNode extends Node implements net.runelite.api.IntegerNode
{
    public int integer;
    
    public IntegerNode(final int integer) {
        this.integer = integer;
    }
    
    public int getValue() {
        return this.integer;
    }
    
    public void setValue(final int integer) {
        this.integer = integer;
    }
    
    public static int ix(final class395 class395, final Map.Entry entry, final Map.Entry entry2) {
        if (class395 == null) {
            return class395.an(entry, entry);
        }
        return entry2.getValue().compareTo(entry.getValue());
    }
}
