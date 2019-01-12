public class Strings<T> {
    T[] tArray;

    public Strings(T[] tArray) {
        this.tArray = tArray;
    }

    static String arr[] = {"Now", "is", "the", "time", "for", "all", "good", "men", "to", "соте", "to", "the",
    "aid", "of", "their", "country"};

    public static void main(String[] args) {
        String s = "Даша любит Сашу";
        String m = "Даша";
        System.out.println(s.regionMatches(0, m, 0, 4));
        String[] array = method(arr);
        for (String s1 : array) {
            System.out.println(s1);
        }

        String.valueOf(5);

        String d = String.join("$", s, m);
        System.out.println(d);

        Strings str = new Strings(new Object[5]);

        char c = 'm';
        System.out.println(c+2);
    }

    public static String [] method(String[] arr){
        for (int j = 0; j < arr.length; j++) {
            for (int i = j+1; i < arr.length; i++) {
                if (arr[i].compareToIgnoreCase(arr[j])<0){
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
