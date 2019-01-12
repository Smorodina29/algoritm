package collections;

import java.util.*;

public class Col {
    private static List<String> list = new ArrayList<>();
    private static List<String> list2 = new ArrayList<>();
    private static ArrayList<Integer> list3 = new ArrayList<Integer>();

    private static TreeSet<String> set = new TreeSet<>();

private static Queue<String> queue = new PriorityQueue<>();


    static {
        queue.add("mbb");
        queue.add("grg");
        queue.add("hrt");
        queue.add("rthr");
        queue.add("yuk");

        list.add("fwefw");
        list.add("ewg");
        list.add("fweegfw");
        list.add("erg");
        list.add("fwerhefw");
        list.add("tkmy");
        list.add("fgn f");
        list.add("fwetehberfw");
        list.add("34t34");
        list.add("erg");

        list2.add("fwetehberfw");
        list2.add("34t34");
        list2.add("erg");
    }

    public static void main(String[] args) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //System.out.println(queue.remove());
        //queue.forEach(System.out::println);

    }

    private static void listAdd(){
        list.removeIf(s -> s.equals("erg"));

        //list.retainAll(list2);

        list.subList(1,3).forEach(System.out::println);

        list2.replaceAll(s -> String.valueOf(s.contains("e") ? "aaa" : "bbb"));
        //list.forEach(System.out::println);
    }

    private static void setAdd(){
        set.add("dvdv");
        set.add("rtg");
        set.add("ytjty");
        set.add("twe");
        set.add("i;ou");
        set.add("sads");
        set.add("cvcxv");
        set.add("asxx");

        //set.forEach(System.out::println);
        //set.subSet("dvdv", "sads").forEach(System.out::println);
        set.tailSet("twe").forEach(System.out::println);
        //System.out.println(set.last());
    }
}
