public class EmbCase {
    public static void main(String[] args) {
        int i = 15;
        String str ="";
        switch (i) {
            case 1: str = "Masha";
                break;
            case 2: str = "Senya";
                break;
            case 15: str = "Dasha";
                break;
            case 21: str = "Sasha";
                break;
        }

        System.out.println(str);
    }
}
