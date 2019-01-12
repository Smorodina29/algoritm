import java.io.*;

public class SerializTest {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int i = 5;
        String m = "word";
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.dat"));
        out.writeObject(i);
        out.writeObject(m);

        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat"));
        int m1 = (int)in.readObject();
        String i1 = (String)in.readObject();

        System.out.println(m1 + i1);

        in.close();

    }
}
