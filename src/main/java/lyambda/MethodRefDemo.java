package lyambda;

public class MethodRefDemo {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;
        // Здесь ссылка на метод strRaverse () передается методу stringOp()
        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println( "Иcxoднaя строка: "+ inStr);
        System.out.println("Oбpaщeннaя строка: "+ outStr);
    }
}
