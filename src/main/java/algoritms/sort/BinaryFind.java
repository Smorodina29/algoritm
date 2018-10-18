package algoritms.sort;

public class BinaryFind {
    private static int[] array;

    public static void main(String[] args) {
        array = new int[]{10, 13, 14, 76, 80, 99, 123, 124, 237, 342, 456, 4564};
        System.out.println(sort(456));
    }

    private static int sort(int value) {
        int index = -1;
        int low = 0, higt = array.length, mid;

        while (low<higt){
            mid = (low+higt)/2;
            if (value==array[mid]){
                index = mid;
                break;
            }

            else {
                if (value<=array[mid]){
                    higt = mid;
                }
                else low = mid+1;
            }
        }
        return index;
    }
}
