package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
        Comparator<String> vb = (aStr, bStr) -> aStr.compareTo(bStr);
        TreeSet<String> ts = new TreeSet<String>(vb);
        ts.add("aa");
        ts.add("ac");
        ts.add("bf");
        ts.add("av");
        ts.add("cc");
        ts.add("dfb");
        ts.add("bb");
        ts.add("fdb");
        ts.add("df");

        ts.forEach(System.out::println);
    }
}
