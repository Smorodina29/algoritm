public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");               //  [13]

    public Beetle() {                                              //    [7]
        System.out.println("k = " + k);                                           //  [14]
        System.out.println("j = " + j);                                            // [15]
    }

    private static int x2 = printInit("static Beetle.x2 initialized"); //[4]

    public static void main(String[] args) {                           //[1]
        System.out.println("Beetle constructor");                               //    [5]
        Beetle b = new Beetle();                                      // [6]
    }
}