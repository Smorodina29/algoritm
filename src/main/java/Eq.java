import java.util.Objects;

public class Eq {
    String s;
    int a, b;
    char c;

    public Eq(String s, int a, int b, char c) {
        this.s = s;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Eq)) return false;
        Eq eq = (Eq) o;
        return a == eq.a &&
                b == eq.b &&
                c == eq.c &&
                Objects.equals(s, eq.s);
    }

    @Override
    public int hashCode() {

        return Objects.hash(s, a, b, c);
    }
}
