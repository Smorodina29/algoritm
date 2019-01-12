package format;

import java.util.Formatter;

public class TestForm {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        System.out.println(f.format("Форматировать %s очень просто: %d %f", "средствами Java", 10, 15.2));
        f.out();
    }
}
