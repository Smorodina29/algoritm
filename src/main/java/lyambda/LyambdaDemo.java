package lyambda;

public class LyambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumber;
        myNumber = () -> 123.90;

        System.out.println(myNumber.getValue());
    }
}
