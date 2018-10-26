package collections_package;

public class ArraysTest {
    private static int[] array;
    static {
        array = new int[8];
        for (int i : array) {
            array[i] = (int) Math.random();
    }
    }

    public static void main(String[] args) {

    }
}
