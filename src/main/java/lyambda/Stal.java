package lyambda;

public class Stal extends MyClass {
    @Override
    public void method2() {
        System.out.println("abstract");
    }

    public static void main(String[] args) {
        Stal s = new Stal();
        s.method();
        s.method2();
    }
}
