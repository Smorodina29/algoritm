package algoritms.sort;

import java.util.Arrays;

public class InserSort {
    // O(n²)
    public static void main(String[]args) {
        int[] array = {5, 785, 12, -3, 0, 581, 12, 36, 78, 10, 54, 36, 78, 96};
        array = sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] sort(int[] array) {
        int j, t;
        for (int i=1; i<array.length; i++){
            t = array[i];
            for(j=i-1; j>=0 && array[j]>t; j--){
                array[j+1]=array[j];
            }
            array[j+1] = t;
        }
        return array;
    }
}
