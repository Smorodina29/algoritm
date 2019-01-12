package lyambda;

public class BlockLamЬdaDemo {
    public static void main(String[] args) {
        NumericFunc numericFunc = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("factorial " + numericFunc.func(5));
        System.out.println("factorial " + numericFunc.func(3));
    }
}
