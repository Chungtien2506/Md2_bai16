package copyfiletext;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Test {
    public static void main(String[] args) {
        String st1 = ("D:\\MODULE_2\\Module2_bai16\\test1.txt");
        String st2 = ("D:\\MODULE_2\\Module2_bai16\\test2.txt");

        Path source = Paths.get(st1);
        Path target = Paths.get(st2);

        try {
            File a = new File(st2);
            if (a.exists()) {
                throw new FileAlreadyExistsException(st2);
            }
            Files.copy(source, target);
            System.out.println("File copied successfully.");
        } catch (FileAlreadyExistsException e) {
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

