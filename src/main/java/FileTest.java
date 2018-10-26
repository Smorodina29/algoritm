import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("C:\\pro\\file.txt");

        File folder = file.getParentFile();

        for (File f : folder.listFiles()) {
            System.out.println(f.getName());
        }
    }
}
