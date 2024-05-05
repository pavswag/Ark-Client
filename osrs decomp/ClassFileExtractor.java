import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.io.OutputStream;
import java.util.jar.JarOutputStream;
import java.io.FileOutputStream;
import java.security.ProtectionDomain;
import java.util.Map;
import java.lang.instrument.ClassFileTransformer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.lang.instrument.Instrumentation;
import com.sun.tools.attach.VirtualMachine;

// 
// Decompiled by Procyon v0.5.36
// 

public class ClassFileExtractor
{
    public static void main(final String[] array) throws Exception {
        final String string = ClassFileExtractor.class.getProtectionDomain().getCodeSource().getLocation().toString();
        if (!string.startsWith("file:/") || !string.endsWith(".jar")) {
            System.out.println("Must be a JAR file");
            System.exit(1);
        }
        final String substring = string.substring(6);
        if (array.length < 2) {
            System.out.println("Usage: java -jar " + substring + " <pid> <output.jar> [prefix]");
            System.exit(1);
        }
        final VirtualMachine attach = VirtualMachine.attach(array[0]);
        final String s = (array.length > 2) ? (array[1] + ' ' + array[2]) : array[1];
        try {
            attach.loadAgent(substring, s);
        }
        finally {
            attach.detach();
        }
        System.out.println("Done");
    }
    
    public static void agentmain(final String s, final Instrumentation instrumentation) throws Exception {
        final String[] split = s.split(" ");
        final String replace = ((split.length > 1) ? split[1] : "").replace('.', '/');
        final String prefix;
        final Class<?>[] array = Arrays.stream(instrumentation.getAllLoadedClasses()).filter(clazz -> clazz.getName().startsWith(prefix) && !clazz.isArray() && instrumentation.isModifiableClass(clazz)).toArray(Class[]::new);
        final ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<String, Object>();
        final ClassFileTransformer classFileTransformer = new ClassFileTransformer() {
            final /* synthetic */ String val$slashPrefix;
            final /* synthetic */ Map val$classData;
            
            @Override
            public byte[] transform(final ClassLoader classLoader, final String s, final Class<?> clazz, final ProtectionDomain protectionDomain, final byte[] array) {
                if (s.startsWith(this.val$slashPrefix)) {
                    this.val$classData.put(s, array);
                }
                return null;
            }
        };
        instrumentation.addTransformer(classFileTransformer, true);
        try {
            instrumentation.retransformClasses(array);
        }
        finally {
            instrumentation.removeTransformer(classFileTransformer);
        }
        final JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(split[0]));
        try {
            for (final Map.Entry<String, V> entry : concurrentHashMap.entrySet()) {
                jarOutputStream.putNextEntry(new ZipEntry(entry.getKey() + ".class"));
                jarOutputStream.write((byte[])(Object)entry.getValue());
            }
            jarOutputStream.close();
        }
        catch (Throwable t) {
            try {
                jarOutputStream.close();
            }
            catch (Throwable exception) {
                t.addSuppressed(exception);
            }
            throw t;
        }
    }
}
