package format;

import java.util.Calendar;
import java.util.Formatter;

public class TimeDateFormat {
    public static void main(String[] args) {
        Formatter f = new Formatter();

        Calendar c = Calendar.getInstance();

        f.format("%tr", c);
        System.out.println(f);

        f = new Formatter();
        f.format("%tc", c);
        System.out.println(f);

        f = new Formatter();
        f.format("%tl:%tM", c, c);
        System.out.println(f);

        f = new Formatter();
        f.format("%tB %tb %tm", c, c, c);
        System.out.println(f);

        f = new Formatter();
        f.format("Копирование файла%nПередача завершена на %d%%", 88);
        System.out.println(f);

        f = new Formatter();
        f.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);
        System.out.println(f);

        for (int i=0; i<=10; i++){
            f = new Formatter();
            f.format("%4d %4d %4d", i, i*i, i*i*i);
            System.out.println(f);
        }

        f = new Formatter();
        f.format("|%10.2f|", 123.123);
        System.out.println(f);

        f = new Formatter();
        f.format("|%-10.2f|", 123.123);
        System.out.println(f);

        f.close();
    }
}
