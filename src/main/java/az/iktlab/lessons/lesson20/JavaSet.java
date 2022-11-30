package az.iktlab.lessons.lesson20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaSet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(2));
//        System.out.println(set.add(1));
        System.out.println(set.add(2));
        System.out.println(set.add(3));
        System.out.println(set);

//        while (set.iterator().hasNext()){
//            System.out.println(set.iterator().next());
//        }
        for (int e : set) {
            System.out.println(e);
        }

        Set<String> strs = new HashSet<>();
        strs.add("Salam");
        strs.add("Salamm");
        strs.add("Salammm");

        Iterator<String> i = strs.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Set<Integer> ints = new HashSet<>();
        ints.add(1);
        ints.add(null);
        ints.add(null);

        System.out.println(ints);
    }
}
