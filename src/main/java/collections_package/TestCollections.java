package collections_package;

import streams.ListUser;
import streams.User;

import java.util.*;
import java.util.stream.Stream;

public class TestCollections {
    private static ListUser listUser = new ListUser();
    private static Stream<String> s = Stream.of("a1", "a2", "a3", "b1", "b2", "c2");
    private static Stream<Integer> ints = Stream.of(123, 12321, 23, 3, 2, 3, 4, 3, 2, 234, 4, 4);

    public static void main(String[] args) {
        ArrayList<User> copyListInt = new ArrayList<>(listUser.getUsers());//copy
        copyListInt.add(new User("erg", 33, true));
        /*ArrayList<User> cloneUser = new ArrayList<>();
        cloneUser.addAll(users);
        cloneUser.forEach(user -> System.out.println(user.getUserName()));

        Collections.sort(listInteger);
        System.out.println(Collections.binarySearch(listInteger, 32));

        System.out.println(Collections.checkedList(listInteger, Integer.class));

        System.out.println(Collections.checkedSet(namesSet, String.class));


        Collections.fill(copyListInt, 3); //заменить вес элементы

        System.out.println(Collections.frequency(users, new User("Olya", 33, false))); //проверка на наличие объекта в коллекции

        //System.out.println(Collections.disjoint(copyListInt, listInteger));*/
       // System.out.println(Collections.nCopies(5, copyListInt));
        //Collections.replaceAll(copyListInt, 3, 5);
        //Collections.reverse(copyListInt);
        //Collections.rotate(copyListInt, 4);
        //Collections.shuffle(copyListInt);
        //copyListInt.removeAll(Collections.singleton(32));
        //Collections.sort(copyListInt);
        //Collections.swap(copyListInt, 1, 3);
        Map<String, Boolean> mapTest = new HashMap<>();
        mapTest.put("erg", true);
        Set<String> es = Collections.newSetFromMap(mapTest);

        //copyListInt.forEach(System.out::println);
    }
}
