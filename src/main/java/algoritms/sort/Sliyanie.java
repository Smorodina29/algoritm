package algoritms.sort;

public class Sliyanie {
    public static void main(String[] args) {
        int[] a1 = {21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int[] a2 = {10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
        int[] array = sort(a1, a2);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] sort(int[] a1, int[] a2){
        int[] a3 = new int[a1.length+a2.length];
        int i=0, j=0;
        for (int k=0; k<a3.length; k++) {
            if (i>a1.length-1){
                int a = a2[j];
                a3[k] = a;
                j++;
            }
            else if(j>a2.length-1){
                int a = a1[i];
                a3[k] = a;
                j++;
            }

            else if (a1[i] < a2[j]){
                int a = a1[i];
                a3[k]= a;
                i++;
            }

            else {
                int b = a2[j];
                a3[k] = b;
                j++;
            }
        }
        return a3;
    }
}
