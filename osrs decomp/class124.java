import java.util.Iterator;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.5.36
// 

public class class124 implements Callable
{
    final class126 field1210;
    public static final int ao = 6;
    final /* synthetic */ class133 this$0;
    final int field1211;
    final class125 field1212;
    public static Font ItemDefinition_fontPlain11;
    final class127 field1214;
    public static final int ba = 71;
    
    class124(final class133 this$0, final class125 field1212, final class126 field1213, final class127 field1214, final int n) {
        this.this$0 = this$0;
        this.field1212 = field1212;
        this.field1210 = field1213;
        this.field1214 = field1214;
        this.field1211 = n * -1352821509;
    }
    
    static void method742(final byte b) {
        try {
            final Iterator iterator = Messages.Messages_hashTable.iterator();
            while (iterator.hasNext()) {
                Message.ur(iterator.next(), 1267480248);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eh.at(" + ')');
        }
    }
    
    @Override
    public Object call() {
        try {
            this.field1212.method750(-83613992);
            class125[][] array;
            if (this.field1210 == class126.field1240) {
                array = this.this$0.field1279;
            }
            else {
                array = this.this$0.field1282;
            }
            array[2042451507 * this.field1211][this.field1214.method756((byte)12)] = this.field1212;
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eh.call(" + ')');
        }
    }
    
    public Object method741() {
        this.field1212.method750(1450974754);
        class125[][] array;
        if (this.field1210 == class126.field1240) {
            array = this.this$0.field1279;
        }
        else {
            array = this.this$0.field1282;
        }
        array[2042451507 * this.field1211][this.field1214.method756((byte)(-23))] = this.field1212;
        return null;
    }
    
    static void method741(final int n) {
        try {
            synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
                if (-1248352937 * ArchiveDiskActionHandler.field3453 == 0) {
                    if (n <= -794961409) {
                        throw new IllegalStateException();
                    }
                    (GrandExchangeOfferNameComparator.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler())).setDaemon(true);
                    GrandExchangeOfferNameComparator.ArchiveDiskActionHandler_thread.start();
                    GrandExchangeOfferNameComparator.ArchiveDiskActionHandler_thread.setPriority(5);
                }
                ArchiveDiskActionHandler.field3453 = 1879867752;
            }
            Client.sw();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "eh.aw(" + ')');
        }
    }
    
    public Object an() {
        this.field1212.method750(836571284);
        class125[][] array;
        if (this.field1210 == class126.field1240) {
            array = this.this$0.field1279;
        }
        else {
            array = this.this$0.field1282;
        }
        array[2042451507 * this.field1211][this.field1214.method756((byte)18)] = this.field1212;
        return null;
    }
    
    public Object af() {
        this.field1212.method750(1996127302);
        class125[][] array;
        if (this.field1210 == class126.field1240) {
            array = this.this$0.field1279;
        }
        else {
            array = this.this$0.field1282;
        }
        array[2042451507 * this.field1211][this.field1214.method756((byte)(-118))] = this.field1212;
        return null;
    }
}
