package algoritms.sort;

import java.util.Arrays;

public class Sliyanie2 {
    //O(n log n)
    public static void main(String[] args) {
        int[] array1 = {5, 785, 12, -3, 0, 581, 12, 36, 78, 10, 54, 36, 78, 96};
        int [] result = sort(array1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int[] array1){
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergeArrays(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static int[] mergeArrays(int[] buffer1, int[] buffer2, int startIndex, int endIndex){
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeArrays(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeArrays(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;

        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;

    }
}
