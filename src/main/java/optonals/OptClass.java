package optonals;

import java.util.Optional;

public class OptClass {
       public static void main(String[] args) {
        Person p = new Person(25, "pass");
        Person p2 = new Person("Nika", 54, "pass");
           Optional<Person> personOptional = Optional.ofNullable(p);
           Optional<Person> personOptional2 = Optional.ofNullable(p2);
           String name = personOptional2
                   .flatMap(Person::getName)
                   .orElse("empty");
           System.out.println(name);

           Optional<Person> person1 = personOptional.filter(person -> person.getName().isPresent());

           personOptional.ifPresent(person -> {
               person.setAge(12);
           });
           System.out.println(personOptional.get().getAge());

           personOptional.orElse(p2);

           String s  = personOptional2
                   .map(Person::getName)
                   .orElseThrow(IllegalArgumentException::new)
                   .orElse("empty");
           System.out.println(s);
    }
}
