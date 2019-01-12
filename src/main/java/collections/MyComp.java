package collections;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
        public int compare(String a, String b){
        String aStr, bStrl;
        aStr = a;
        bStrl = b;

        return aStr.compareTo(bStrl);
    }
}
