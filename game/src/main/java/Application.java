import net.runelite.client.RuneLite;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        try {
            if (Platform.isWindows()) {
                setWindowsProcessName("Kyros-Game-Client");
            } else if (Platform.isLinux()) {
                setLinuxProcessName("Kyros-Game-Client");
            }
            RuneLite.main(args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public interface Kernel32 extends Library {
        Kernel32 INSTANCE = Native.load("kernel32", Kernel32.class);
        boolean SetConsoleTitleA(String lpConsoleTitle);
    }
    private static void setWindowsProcessName(String name) {
        Kernel32.INSTANCE.SetConsoleTitleA(name);
    }

    private static void setLinuxProcessName(String name) {
        try (FileWriter writer = new FileWriter(new File("/proc/self/comm"))) {
            writer.write(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}