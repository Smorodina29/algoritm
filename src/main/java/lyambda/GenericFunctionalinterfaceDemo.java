package lyambda;

public class GenericFunctionalinterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = str -> {
            String result = "";
            int j = 0;
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println(reverse.func("Лямбда"));
        System.out.println(reverse.func("Выражение"));

        SomeFunc<Integer> integ = m -> {
            int result = 1;
            for (int i = 1; i <= m; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println(integ.func(3));
        System.out.println(integ.func(7));
    }
}
