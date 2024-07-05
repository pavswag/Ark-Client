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
            RuneLite.main(args);
        } catch (Exception e) {
            throw new RuntimeException(e);//move the
        }
    }
}