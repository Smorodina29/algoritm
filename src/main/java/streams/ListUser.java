package streams;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class ListUser {
    private static ArrayList<User> users;
    private static ArrayList<Integer> listInteger;

    public ListUser() {
    }

    static {
        users = new ArrayList<>();
        listInteger = new ArrayList<>();
        users.add(new User("Vasya", 15, true));
        users.add(new User("Petya", 16, true));
        users.add(new User("Gosha", 17, true));
        users.add(new User("Masha", 18, false));
        users.add(new User("Sergey", 21, true));
        users.add(new User("Sasha", 43, true));
        users.add(new User("Lena", 21, false));
        users.add(new User("Vitya", 23, true));
        users.add(new User("Katya", 44, false));
        users.add(new User("Olya", 33, false));

        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(24);
        listInteger.add(23);
        listInteger.add(32);
        listInteger.add(50);
        listInteger.add(32);
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static ArrayList<Integer> getListInteger() {
        return listInteger;
    }
}
