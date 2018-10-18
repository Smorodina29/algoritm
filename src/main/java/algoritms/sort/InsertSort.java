package algoritms.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[]args) {
        int[] array = {5, 785, 12, -3, 0, 581, 12, 36, 78, 10, 54, 36, 78, 96};
        array = sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] sort(int[] array) {
        int j;
        for (int i=1; i<array.length; i++){
            int x = array[i];
            for (j=i-1; j>=0; j--){
                if (array[j]>x){
                    array[j+1] = array[j];
                }
                else break;
            }
            array[j+1] = x;
        }
        return array;
    }
}
