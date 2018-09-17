package algoritms.sort;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[]args) {
        int[] array = {5, 785, 12, -3, 0, 581, 12, 36, 78, 10, 54, 36, 78, 96};
        quicksort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void quicksort(int[] array1, int startIndex, int endIndex) {
        int pivotValue = getPivot(array1, startIndex, endIndex);
        int currentStartIndex = startIndex;
        int currentEndIndex = endIndex - 1;

        while (currentStartIndex < currentEndIndex) {
            while (array1[currentStartIndex] < pivotValue) currentStartIndex++;
            while (array1[currentEndIndex] > pivotValue) currentEndIndex--;
            if (currentStartIndex < currentEndIndex) {
                int buffer = array1[currentStartIndex];
                array1[currentStartIndex] = array1[currentEndIndex];
                array1[currentEndIndex] = buffer;
            }
        }
        if (currentStartIndex > startIndex) quicksort(
                array1, startIndex, currentStartIndex);
        if (endIndex > currentStartIndex + 1) quicksort(
                array1, currentStartIndex + 1, endIndex);
    }

    public static int getPivot(int[] array1, int startIndex, int endIndex) {
        return array1[endIndex - 1];
    }
}
