package collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private Collection c;
    public Main() {
        c = new HashSet();
    }

    public static void main(String[] args) {

    }

    private void print(Collection c) {
        System.out.println("Collection");
    }

    private void print(Set c) {
        System.out.println("Set");
    }

    private void print(HashSet c) {
        System.out.println("HashSet");
    }

    private void method(){
        print(c);
    }
}
