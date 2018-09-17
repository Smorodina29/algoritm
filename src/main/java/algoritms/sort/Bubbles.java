package algoritms.sort;

public class Bubbles {
    // O(n²)

    public static void main(String[]args){
         int[] array = {5, 785, 12, -3, 0, 581, 12, 36, 78, 10, 54, 36, 78, 96};
         array = sort(array);
         for (int i : array) {
            System.out.println(i);
        }
        }

        public static int[] sort(int[] array){
            int temp;
            for (int i=0; i<array.length; i++) {
                for (int j=i+1; j<array.length; j++){
                    if (array[j]<array[i]){
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        return array;
        }
}
