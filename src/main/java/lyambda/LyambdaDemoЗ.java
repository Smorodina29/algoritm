package lyambda;

public class LyambdaDemoЗ {
    public static void main(String[] args) {
        NumericTest2 num;

        num = (n, m) -> (n % m)==0;

        System.out.println(num.test(1, 2));
        System.out.println(num.test(3, 4));
        System.out.println(num.test(5, 6));
    }
}
