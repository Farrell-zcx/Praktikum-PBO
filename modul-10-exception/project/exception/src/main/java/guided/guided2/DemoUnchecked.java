package guided.guided2;

import java.io.FileReader;
import java.io.IOException;

public class DemoUnchecked {
    public static void main(String[] args) {
        try (FileReader file = new FileReader("data.txt")) {
            file.ready();
            System.out.println("file berhasil dibuka");
        } catch (IOException e) {
            System.out.println("terjadi eksepsi");
        }

        System.out.println("Program selesai");
    }
}
