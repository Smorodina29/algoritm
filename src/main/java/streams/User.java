package streams;

import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;
import java.util.Objects;

@Getter
@Setter
public class User{
    private String userName;
    private int age;
    private boolean sex;

    public User(String userName, int age, boolean sex) {
        this.userName = userName;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age &&
                sex == user.sex &&
                Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userName, age, sex);
    }

    static class TestComparator implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return o1.getUserName().compareTo(o2.getUserName());
        }
    }
}
