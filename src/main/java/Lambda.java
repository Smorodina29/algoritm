import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {
    private static List<String> array;
    private static List<Person> persons;

    public static void main(String[] args) {
        persons.stream()
                .filter(p -> p.age >20)
                .forEach(p -> System.out.println(p.name + " " + p.age));

        array.stream()
                .sorted()
                .forEach(s -> System.out.println(s));

        array.stream()
                .sorted()
                .map(p-> new Person(p, 25))
                .forEach(p -> System.out.println(p.name + " " + p.age));

        System.out.println(array.stream()
                .filter(p->p.startsWith("D"))
                .count());


        }

    static {
        array = new ArrayList<>();
        persons = new ArrayList<>();
        array.add("Dasha");
        array.add("Masha");
        array.add("Sasha");
        array.add("Pasha");
        array.add("Misha");
        array.add("Grisha");

        persons.add(new Person("Lena", 22));
        persons.add(new Person("Kolya", 43));
        persons.add(new Person("Vasya", 54));
        persons.add(new Person("Petya", 44));
        persons.add(new Person("Nikita", 23));
        persons.add(new Person("Marina", 12));
        persons.add(new Person("Oleg", 32));
    }

    public static void arrayMethod(){

        array.forEach(System.out::println);
        array.forEach(name-> System.out.println(name));

        Collections.sort(array);

        array.forEach(System.out::println);
    }

    public static void predicMethod(){
        Predicate<String> predicate = (s)->s.length()>0;
        System.out.println(predicate.test("erg"));
        System.out.println(predicate.test(""));
    }

    public static void supplierMethod(){
        Supplier<Person> supplier = () -> new Person("Masha", 23);
        Person p = supplier.get();
        System.out.println(p.name);
    }

    private static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
