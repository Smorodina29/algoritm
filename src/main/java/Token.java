import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {
        String in = "Название=Jаvа. Полное руководство;" +
                "Автор=Шилдт;" + "Издательство=МсGrаw-Нill;" + "Авторское право=2014";
        StringTokenizer st = new StringTokenizer(in, "=;");
        while (st.hasMoreTokens()){
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println("key " + key + " val " + val);
        }
    }
}
