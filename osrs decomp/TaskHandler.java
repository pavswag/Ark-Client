import java.io.DataInputStream;
import java.net.URL;
import java.net.Socket;
import java.net.InetAddress;

// 
// Decompiled by Procyon v0.5.36
// 

public class TaskHandler implements Runnable
{
    public static String javaVendor;
    public static String javaVersion;
    Task current;
    boolean isClosed;
    Task task;
    Thread thread;
    public static final int ar = 1;
    
    public TaskHandler() {
        this.current = null;
        this.task = null;
        this.isClosed = false;
        TaskHandler.javaVendor = "Unknown";
        TaskHandler.javaVersion = "1.6";
        try {
            TaskHandler.javaVendor = System.getProperty("java.vendor");
            TaskHandler.javaVersion = System.getProperty("java.version");
        }
        catch (Exception ex) {}
        this.isClosed = false;
        (this.thread = new Thread(this)).setPriority(10);
        this.thread.setDaemon(true);
        this.thread.start();
    }
    
    @Override
    public final void run() {
        try {
            while (true) {
                Label_0076: {
                    Task current;
                    synchronized (this) {
                        while (!this.isClosed) {
                            if (null != this.current) {
                                current = this.current;
                                this.current = this.current.next;
                                if (this.current == null) {
                                    this.task = null;
                                }
                                break Label_0076;
                            }
                            try {
                                this.wait();
                            }
                            catch (InterruptedException ex2) {}
                        }
                        return;
                    }
                    try {
                        final int n = 1725083443 * current.type;
                        if (n == 1) {
                            current.result = new Socket(InetAddress.getByName((String)current.objectArgument), current.intArgument);
                        }
                        else if (2 == n) {
                            final Thread result = new Thread((Runnable)current.objectArgument);
                            result.setDaemon(true);
                            result.start();
                            result.setPriority(current.intArgument);
                            current.result = result;
                        }
                        else if (4 == n) {
                            current.result = new DataInputStream(((URL)current.objectArgument).openStream());
                        }
                        current.status = 1;
                    }
                    catch (ThreadDeath threadDeath) {
                        throw threadDeath;
                    }
                    catch (Throwable t) {
                        current.status = 2;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gd.run(" + ')');
        }
    }
    
    public final Task ao(final String s, final int n) {
        return this.newTask(1, n, 0, s, -1020464342);
    }
    
    public static Task fk(final TaskHandler taskHandler, final int n, final int intArgument, final int n2, final Object objectArgument) {
        if (taskHandler == null) {
            taskHandler.close(n);
        }
        final Task task = new Task();
        task.type = n * -107158533;
        task.intArgument = intArgument;
        task.objectArgument = objectArgument;
        synchronized (taskHandler) {
            if (null != taskHandler.task) {
                taskHandler.task.next = task;
                taskHandler.task = task;
            }
            else {
                final Task task2 = task;
                taskHandler.current = task2;
                taskHandler.task = task2;
            }
            taskHandler.notify();
        }
        return task;
    }
    
    public final Task ax(final Runnable runnable, final int n) {
        return this.newTask(2, n, 0, runnable, -1559033353);
    }
    
    public final Task ay(final String s, final int n) {
        return this.newTask(1, n, 0, s, -482887996);
    }
    
    public final Task newSocketTask(final String s, final int n, final int n2) {
        try {
            return this.newTask(1, n, 0, s, 627776063);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gd.aw(" + ')');
        }
    }
    
    final Task newTask(final int n, final int intArgument, final int n2, final Object objectArgument, final int n3) {
        try {
            final Task task = new Task();
            task.type = n * -107158533;
            task.intArgument = intArgument;
            task.objectArgument = objectArgument;
            synchronized (this) {
                if (null != this.task) {
                    if (n3 == -1848743379) {
                        throw new IllegalStateException();
                    }
                    this.task.next = task;
                    this.task = task;
                }
                else {
                    final Task task2 = task;
                    this.current = task2;
                    this.task = task2;
                }
                this.notify();
            }
            return task;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gd.an(" + ')');
        }
    }
    
    public final Task newThreadTask(final Runnable runnable, final int n, final byte b) {
        try {
            return this.newTask(2, n, 0, runnable, 1775674834);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gd.ac(" + ')');
        }
    }
    
    public final void gd() {
        while (true) {
            Label_0076: {
                Task current;
                synchronized (this) {
                    while (!this.isClosed) {
                        if (null != this.current) {
                            current = this.current;
                            this.current = this.current.next;
                            if (this.current == null) {
                                this.task = null;
                            }
                            break Label_0076;
                        }
                        try {
                            this.wait();
                        }
                        catch (InterruptedException ex) {}
                    }
                    return;
                }
                try {
                    final int n = 1725083443 * current.type;
                    if (n == 1) {
                        current.result = new Socket(InetAddress.getByName((String)current.objectArgument), current.intArgument);
                    }
                    else if (2 == n) {
                        final Thread result = new Thread((Runnable)current.objectArgument);
                        result.setDaemon(true);
                        result.start();
                        result.setPriority(current.intArgument);
                        current.result = result;
                    }
                    else if (4 == n) {
                        current.result = new DataInputStream(((URL)current.objectArgument).openStream());
                    }
                    current.status = 1;
                }
                catch (ThreadDeath threadDeath) {
                    throw threadDeath;
                }
                catch (Throwable t) {
                    current.status = 2;
                }
            }
        }
    }
    
    public final void getClipMidX() {
        synchronized (this) {
            this.isClosed = true;
            this.notifyAll();
        }
        try {
            this.thread.join();
        }
        catch (InterruptedException ex) {}
    }
    
    public static StudioGame[] getClipMidX(final int n) {
        try {
            return new StudioGame[] { StudioGame.game3, StudioGame.game4, StudioGame.runescape, StudioGame.stellardawn, StudioGame.game5, StudioGame.oldscape };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gd.au(" + ')');
        }
    }
    
    public static void getClipMidX(final TaskHandler taskHandler) {
        if (taskHandler == null) {
            taskHandler.gy();
            return;
        }
        synchronized (taskHandler) {
            taskHandler.isClosed = true;
            taskHandler.notifyAll();
        }
        try {
            taskHandler.thread.join();
        }
        catch (InterruptedException ex) {}
    }
    
    static int getClipMidX(final int n) {
        try {
            return 93675259 * Rasterizer3D.clips.field2231;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gd.au(" + ')');
        }
    }
    
    public final Task ai(final Runnable runnable, final int n) {
        return this.newTask(2, n, 0, runnable, -1946939389);
    }
    
    public static boolean gi(final AbstractArchive abstractArchive, String lowerCase) {
        if (abstractArchive == null) {
            return abstractArchive.es(lowerCase, lowerCase);
        }
        lowerCase = lowerCase.toLowerCase();
        return abstractArchive.method1889(abstractArchive.groupNameHashTable.get(VerticalAlignment.hashString(lowerCase, 512528515), -1780176468), 1058670335);
    }
    
    public final void gy() {
        while (true) {
            Label_0076: {
                Task current;
                synchronized (this) {
                    while (!this.isClosed) {
                        if (null != this.current) {
                            current = this.current;
                            this.current = this.current.next;
                            if (this.current == null) {
                                this.task = null;
                            }
                            break Label_0076;
                        }
                        try {
                            this.wait();
                        }
                        catch (InterruptedException ex) {}
                    }
                    return;
                }
                try {
                    final int n = 1725083443 * current.type;
                    if (n == 1) {
                        current.result = new Socket(InetAddress.getByName((String)current.objectArgument), current.intArgument);
                    }
                    else if (2 == n) {
                        final Thread result = new Thread((Runnable)current.objectArgument);
                        result.setDaemon(true);
                        result.start();
                        result.setPriority(current.intArgument);
                        current.result = result;
                    }
                    else if (4 == n) {
                        current.result = new DataInputStream(((URL)current.objectArgument).openStream());
                    }
                    current.status = 1;
                }
                catch (ThreadDeath threadDeath) {
                    throw threadDeath;
                }
                catch (Throwable t) {
                    current.status = 2;
                }
            }
        }
    }
    
    public final void close(final int n) {
        try {
            synchronized (this) {
                this.isClosed = true;
                this.notifyAll();
            }
            try {
                this.thread.join();
            }
            catch (InterruptedException ex2) {}
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gd.af(" + ')');
        }
    }
    
    public final void aq() {
        synchronized (this) {
            this.isClosed = true;
            this.notifyAll();
        }
        try {
            this.thread.join();
        }
        catch (InterruptedException ex) {}
    }
    
    public final Task ag(final Runnable runnable, final int n) {
        return this.newTask(2, n, 0, runnable, -369178750);
    }
    
    static int method949(final int n, final Script script, final boolean b, final int n2) {
        try {
            if (5504 == n) {
                if (n2 != -898403827) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n3 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                final int n4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
                if (!Client.isCameraLocked) {
                    Client.camAngleX = -637026513 * n3;
                    Client.ma(-1);
                    Client.camAngleY = n4 * 642728617;
                }
                return 1;
            }
            else if (n == 5505) {
                if (n2 != -898403827) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.camAngleX * -954734641;
                return 1;
            }
            else if (n == 5506) {
                if (n2 != -898403827) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.camAngleY * 704283033;
                return 1;
            }
            else if (5530 == n) {
                if (n2 != -898403827) {
                    throw new IllegalStateException();
                }
                int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                if (n5 < 0) {
                    if (n2 != -898403827) {
                        throw new IllegalStateException();
                    }
                    n5 = 0;
                }
                Client.camFollowHeight = n5 * 2048249787;
                return 1;
            }
            else {
                if (n != 5531) {
                    return 2;
                }
                if (n2 != -898403827) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.camFollowHeight * 394960243;
                return 1;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gd.bj(" + ')');
        }
    }
}
