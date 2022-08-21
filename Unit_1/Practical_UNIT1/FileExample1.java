
import java.io.File;

public class FileExample1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("../Notes.txt");

        System.out.println("Is Exist: " + f1.exists());
        System.out.println("File Size: " + f1.length());
    }

}
