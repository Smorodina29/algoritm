class Insect {
    private int i = 9;                                              //   [9]
    protected int j;                                                //   [10]
    Insect() {                                                    //     [8]
        System.out.println("i = " + i + ", j = " + j);                             // [11]
        j = 39;                                                      //  [12]
    }
    private static int x1 = printInit("static Insect.x1 initialized");// [2]
    static int printInit(String s) {                                   //[3]
        System.out.println(s);
        return 47;
    }
}