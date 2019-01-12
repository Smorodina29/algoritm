package algoritms.sort;

public class Polindrom {
    static String a = "1245789544";
    static String b = "12345654321";
    static String c = "123321";
    public static void main(String[] args) {
        char[] array = getArray(c);
        System.out.println(isPolid(array));
    }

    public static char[] getArray(String st){
        return st.toCharArray();
    }

    public static boolean isPolid(char[] chars){
        boolean yes = true;
            for (int i=0; i<= chars.length/2; i++) {
                if (!(chars[i]==chars[chars.length-i-1])){
                    yes = false;
                    break;
                }
            }
        return yes;
    }
}
