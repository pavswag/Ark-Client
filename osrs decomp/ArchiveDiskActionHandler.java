// 
// Decompiled by Procyon v0.5.36
// 

public class ArchiveDiskActionHandler implements Runnable
{
    public static NodeDeque ArchiveDiskActionHandler_responseQueue;
    public static NodeDeque ArchiveDiskActionHandler_requestQueue;
    static int field3453;
    static Object ArchiveDiskActionHandler_lock;
    
    ArchiveDiskActionHandler() {
    }
    
    static {
        ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue = new NodeDeque();
        ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue = new NodeDeque();
        ArchiveDiskActionHandler.field3453 = 0;
        ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock = new Object();
    }
    
    @Override
    public void run() {
        try {
            try {
                while (true) {
                    final ArchiveDiskAction archiveDiskAction;
                    synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                        archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last();
                    }
                    if (archiveDiskAction != null) {
                        if (-1329235479 * archiveDiskAction.type == 0) {
                            ArchiveDisk.vf(archiveDiskAction.archiveDisk, (int)archiveDiskAction.hr, archiveDiskAction.data, archiveDiskAction.data.length, -836088827);
                            synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                                archiveDiskAction.hw();
                            }
                        }
                        else if (archiveDiskAction.type * -1329235479 == 1) {
                            archiveDiskAction.data = ArchiveDisk.ef(archiveDiskAction.archiveDisk, (int)archiveDiskAction.hr, -312695357);
                            synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                                ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.addFirst(archiveDiskAction);
                            }
                        }
                        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
                            if (ArchiveDiskActionHandler.field3453 * -1248352937 <= 1) {
                                ArchiveDiskActionHandler.field3453 = 0;
                                ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.notifyAll();
                                return;
                            }
                            ArchiveDiskActionHandler.field3453 = 1879867752;
                        }
                    }
                    else {
                        PlayerComposition.method1692(100L);
                        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
                            if (ArchiveDiskActionHandler.field3453 * -1248352937 <= 1) {
                                ArchiveDiskActionHandler.field3453 = 0;
                                ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.notifyAll();
                                return;
                            }
                            ArchiveDiskActionHandler.field3453 -= 1527846503;
                        }
                    }
                }
            }
            catch (Exception ex) {
                class387.RunException_sendStackTrace(null, ex, (byte)8);
            }
        }
        catch (RuntimeException ex2) {
            throw HealthBar.get(ex2, "ns.run(" + ')');
        }
    }
    
    static void ao() {
        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
            if (1952958975 * ArchiveDiskActionHandler.field3453 == 0) {
                (GrandExchangeOfferNameComparator.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler())).setDaemon(true);
                GrandExchangeOfferNameComparator.ArchiveDiskActionHandler_thread.start();
                GrandExchangeOfferNameComparator.ArchiveDiskActionHandler_thread.setPriority(5);
            }
            ArchiveDiskActionHandler.field3453 = 48680617;
        }
    }
    
    static void at(final int n, final ArchiveDisk archiveDisk, final Archive archive) {
        final ArchiveDiskAction archiveDiskAction = new ArchiveDiskAction();
        archiveDiskAction.type = -1330450855;
        archiveDiskAction.hr = n;
        archiveDiskAction.archiveDisk = archiveDisk;
        archiveDiskAction.archive = archive;
        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(archiveDiskAction);
        }
        class124.method741(-477362235);
    }
    
    static void ax() {
        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
            if (1791195430 * ArchiveDiskActionHandler.field3453 == 0) {
                (GrandExchangeOfferNameComparator.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler())).setDaemon(true);
                GrandExchangeOfferNameComparator.ArchiveDiskActionHandler_thread.start();
                GrandExchangeOfferNameComparator.ArchiveDiskActionHandler_thread.setPriority(5);
            }
            ArchiveDiskActionHandler.field3453 = 1925202584;
        }
    }
    
    static void ay(final int n, final ArchiveDisk archiveDisk, final Archive archive) {
        final ArchiveDiskAction archiveDiskAction = new ArchiveDiskAction();
        archiveDiskAction.type = 753607694;
        archiveDiskAction.hr = n;
        archiveDiskAction.archiveDisk = archiveDisk;
        archiveDiskAction.archive = archive;
        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(archiveDiskAction);
        }
        class124.method741(1053259619);
    }
    
    static void al(final int n, final byte[] data, final ArchiveDisk archiveDisk) {
        final ArchiveDiskAction archiveDiskAction = new ArchiveDiskAction();
        archiveDiskAction.type = 0;
        archiveDiskAction.hr = n;
        archiveDiskAction.data = data;
        archiveDiskAction.archiveDisk = archiveDisk;
        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(archiveDiskAction);
        }
        class124.method741(363375819);
    }
    
    public void gd() {
        try {
            while (true) {
                final ArchiveDiskAction archiveDiskAction;
                synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                    archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last();
                }
                if (archiveDiskAction != null) {
                    if (-1975197078 * archiveDiskAction.type == 0) {
                        ArchiveDisk.vf(archiveDiskAction.archiveDisk, (int)archiveDiskAction.hr, archiveDiskAction.data, archiveDiskAction.data.length, 1458118889);
                        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                            archiveDiskAction.hw();
                        }
                    }
                    else if (archiveDiskAction.type * -152087753 == 1) {
                        archiveDiskAction.data = ArchiveDisk.ef(archiveDiskAction.archiveDisk, (int)archiveDiskAction.hr, -925890641);
                        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                            ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.addFirst(archiveDiskAction);
                        }
                    }
                    synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
                        if (ArchiveDiskActionHandler.field3453 * 1426765803 <= 1) {
                            ArchiveDiskActionHandler.field3453 = 0;
                            ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.notifyAll();
                            return;
                        }
                        ArchiveDiskActionHandler.field3453 = 1879867752;
                    }
                }
                else {
                    PlayerComposition.method1692(100L);
                    synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
                        if (ArchiveDiskActionHandler.field3453 * -77026547 <= 1) {
                            ArchiveDiskActionHandler.field3453 = 0;
                            ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.notifyAll();
                            return;
                        }
                        ArchiveDiskActionHandler.field3453 -= 1527846503;
                    }
                }
            }
        }
        catch (Exception ex) {
            class387.RunException_sendStackTrace(null, ex, (byte)8);
        }
    }
    
    static void au(final int n, final byte[] data, final ArchiveDisk archiveDisk) {
        final ArchiveDiskAction archiveDiskAction = new ArchiveDiskAction();
        archiveDiskAction.type = 0;
        archiveDiskAction.hr = n;
        archiveDiskAction.data = data;
        archiveDiskAction.archiveDisk = archiveDisk;
        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(archiveDiskAction);
        }
        class124.method741(1443351908);
    }
    
    static void aa(final int n, final ArchiveDisk archiveDisk, final Archive archive) {
        final ArchiveDiskAction archiveDiskAction = new ArchiveDiskAction();
        archiveDiskAction.type = -1330450855;
        archiveDiskAction.hr = n;
        archiveDiskAction.archiveDisk = archiveDisk;
        archiveDiskAction.archive = archive;
        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(archiveDiskAction);
        }
        class124.method741(717473609);
    }
    
    public static void ai() {
        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
            if (0 != -607662174 * ArchiveDiskActionHandler.field3453) {
                ArchiveDiskActionHandler.field3453 = -423952958;
                try {
                    ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
                }
                catch (InterruptedException ex) {}
            }
        }
    }
    
    public void gy() {
        try {
            while (true) {
                final ArchiveDiskAction archiveDiskAction;
                synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                    archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last();
                }
                if (archiveDiskAction != null) {
                    if (-1739804230 * archiveDiskAction.type == 0) {
                        ArchiveDisk.vf(archiveDiskAction.archiveDisk, (int)archiveDiskAction.hr, archiveDiskAction.data, archiveDiskAction.data.length, 1027131272);
                        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                            archiveDiskAction.hw();
                        }
                    }
                    else if (archiveDiskAction.type * -114235666 == 1) {
                        archiveDiskAction.data = ArchiveDisk.ef(archiveDiskAction.archiveDisk, (int)archiveDiskAction.hr, -341788656);
                        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                            ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.addFirst(archiveDiskAction);
                        }
                    }
                    synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
                        if (ArchiveDiskActionHandler.field3453 * -1248352937 <= 1) {
                            ArchiveDiskActionHandler.field3453 = 0;
                            ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.notifyAll();
                            return;
                        }
                        ArchiveDiskActionHandler.field3453 = 329185530;
                    }
                }
                else {
                    PlayerComposition.method1692(100L);
                    synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
                        if (ArchiveDiskActionHandler.field3453 * -1248352937 <= 1) {
                            ArchiveDiskActionHandler.field3453 = 0;
                            ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.notifyAll();
                            return;
                        }
                        ArchiveDiskActionHandler.field3453 -= 288597465;
                    }
                }
            }
        }
        catch (Exception ex) {
            class387.RunException_sendStackTrace(null, ex, (byte)8);
        }
    }
    
    static Integer addImageTag(final Buffer buffer, final byte b) {
        try {
            int int1 = 0;
            boolean b2 = false;
            Label_0008: {
                break Label_0008;
                do {
                    while (true) {
                        Label_0103: {
                            break Label_0103;
                            while (true) {
                                if (Buffer.ra(buffer, (byte)7) == 255) {
                                    if (b == 85) {
                                        throw new IllegalStateException();
                                    }
                                    break;
                                }
                                else {
                                    buffer.offset += 1516355947;
                                    if (buffer.readUnsignedShort(110910601) != 0) {
                                        throw new IllegalStateException("");
                                    }
                                }
                                int1 = buffer.readInt(-1044461882);
                                b2 = true;
                            }
                        }
                        final int ra = Buffer.ra(buffer, (byte)7);
                        if (255 == ra) {
                            Integer value;
                            if (b2) {
                                if (b == 85) {
                                    throw new IllegalStateException();
                                }
                                value = int1;
                            }
                            else {
                                value = null;
                            }
                            return value;
                        }
                        if (ra != 0) {
                            throw new IllegalStateException("");
                        }
                        continue;
                    }
                } while (!b2);
            }
            throw new IllegalStateException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ns.af(" + ')');
        }
    }
    
    static String addImageTag(final int i, final int n) {
        try {
            return "<img=" + i + ">";
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ns.af(" + ')');
        }
    }
    
    static void ab(final int n, final byte[] data, final ArchiveDisk archiveDisk) {
        final ArchiveDiskAction archiveDiskAction = new ArchiveDiskAction();
        archiveDiskAction.type = 0;
        archiveDiskAction.hr = n;
        archiveDiskAction.data = data;
        archiveDiskAction.archiveDisk = archiveDisk;
        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(archiveDiskAction);
        }
        class124.method741(1197634008);
    }
    
    static void aq(final int n, final byte[] data, final ArchiveDisk archiveDisk) {
        final ArchiveDiskAction archiveDiskAction = new ArchiveDiskAction();
        archiveDiskAction.type = 0;
        archiveDiskAction.hr = n;
        archiveDiskAction.data = data;
        archiveDiskAction.archiveDisk = archiveDisk;
        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(archiveDiskAction);
        }
        class124.method741(1875421975);
    }
    
    public static void ag() {
        synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
            if (0 != -1248352937 * ArchiveDiskActionHandler.field3453) {
                ArchiveDiskActionHandler.field3453 = 1527846503;
                try {
                    ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
                }
                catch (InterruptedException ex) {}
            }
        }
    }
}
