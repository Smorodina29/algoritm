package lyambda;

public class LyambdaDemo2 {
    static NumericTest num;

    public static void main(String[] args) {
        num = n -> (n%2) == 0;

        System.out.println(num.test(3));
        System.out.println(num.test(-5));
        System.out.println(num.test(8));
    }
}
