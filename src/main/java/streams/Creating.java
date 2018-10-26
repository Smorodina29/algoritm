package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Creating {
    private static ListUser listUser = new ListUser();
    private static Stream<String> s = Stream.of("a1", "a2", "a3", "b1", "b2", "c2");
    private static Stream<Integer> ints = Stream.of(123, 12321, 23, 3, 2, 3, 4, 3, 2, 234, 4, 4);


    public static void main(String[] args) {
        createNewStreamConvert();
    }

    public static void streamTest() {
        //users.forEach(user -> System.out.println(user.userName));
        //users.stream().distinct();
        System.out.println(Stream.empty());

        //users.forEach(user -> System.out.println(user.getUserName()));
        listUser.getUsers()
                .stream()
                .min(new User.TestComparator());

        //users.stream().forEach(user -> user.setAge(25));
    }

    public static void streamAnyMatcherTest() {
        s.anyMatch(s1 -> s1.equals("a1"));
        ints.anyMatch(i -> i > 10);
        listUser.getUsers().stream().allMatch(user -> user.getAge() > 15);
        listUser.getUsers().stream().anyMatch(user -> user.getAge() > 15);
    }

    public static void streamFilterTest() {
        listUser.getUsers().stream().filter(user -> user.isSex()).forEach(q-> System.out.println(q.getUserName()));
        listUser.getUsers().stream()
                .filter(u-> u.getAge()>15&&u.getAge()<40&&u.getUserName().contains("a"))
                .forEach(user -> System.out.println(user.getUserName()));
        s.filter((s) -> s.contains("a"))
                .collect(Collectors.toList())
                .forEach(q -> System.out.println(q));
    }

    public static void streamCountFind() {
        System.out.println(s.filter("a1"::equals).count());
        System.out.println(listUser.getUsers().stream().count());
    }

    public static void streamFindFirstFind() {
        System.out.println(
                listUser.getUsers()
                        .stream()
                        .findFirst());

        System.out.println(
                s.findAny()
                        .orElse("gh")
        );
    }

    public static void streamSkipTest() {
        ints.skip(2)
                .filter(i -> i > 5)
                .forEach(integer -> System.out.println(integer));
        System.out.println(s.skip(2).findFirst().get());
    }

    public static void createNewStream(){
        s.map((s) -> s + "_1")
                .collect(Collectors.toList())
        .forEach(m-> System.out.println(m));
    }

    public static void createNewStreamConvert(){
        s.mapToInt((s) ->
                Integer.parseInt(s.substring(1)))
                .forEach(w->
                        System.out.println(w));
    }
}
