package collections;


public class HexBinaryIntNumber {
    public static void main(String[] args) {
        Integer number = 255;

        // Бинарный формат числа
        String convert = Integer.toBinaryString(number);
        System.out.println(convert);

        // Восьмиричная форма
        convert = Integer.toOctalString(number);
        System.out.println(convert);

        // Шеснадцатиричная форма
        convert = Integer.toHexString(number).toUpperCase();
        System.out.println(convert);
    }
    }