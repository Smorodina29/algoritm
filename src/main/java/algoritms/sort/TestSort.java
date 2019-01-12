package algoritms.sort;

public class TestSort {
    public static void main(String[] args) {
        /*int[] array = new int[]{0, 15, 71, 2, -9, 75, 0, 20, 3};
        int[] ints = insertSort(array);
        for (int anInt : ints) {
            System.out.println(anInt);
        }*/
        System.out.println(fact(11));
    }

    public static int[] insertSort(int[] array) {
        int i, j, t;
        for (i = 1; i < array.length; i++) {
            t = array[i];
            for (j = i - 1; j >= 0; j--) {
                if (array[j]>t){
                    array[j+1] = array[j];
                }
                else break;
            }
            array[j+1] = t;
        }

        return array;
    }

    public static void recurs(){
        System.out.println("рекурсия");
        recurs();
    }

    public static int fact(int i){
        int result = 1;
        if (i==0 || i==1){
            return result;
        }
        result = i * fact(i-1);
        return result;
    }
}
