package patterns.builder;

public class Main {
    public static void main(String[] args) {
        Person p = Person.newBuilder()
                .setFirstName("Dasha")
                .setLastName("Smorodina")
                .setAddress("Saint-Petersburg")
                .setAge(24)
                .setHasChildren(false)
                .setSex('ж')
                .build();

        System.out.println(p);
    }
}
