package az.iktlab.lessons.lesson19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsExample {

    public static void main(String[] args) {

        int[] arr = new int[5];

        ArrayList list = new ArrayList();
        list.add(5);
        list.add(12);
        list.add("Salam");
        list.add(true);

//        System.out.println(list);
//
//        list.remove(0);
//        System.out.println(list);
//
//        list.remove("Salam");
//        System.out.println(list);
//
//        list.clear();
//        System.out.println(list);

        List<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(43);
        ints.add(43);
        ints.add(56);
        ints.add(4453);

        ints.add(2, 57);
        System.out.println(ints);

        ints.set(3, 123);
        System.out.println(ints);

        System.out.println(ints.get(3));

        List<String> strings = new LinkedList<>();
        strings.add("Salam");
        strings.add("Java");
        strings.add("Linked list");
        System.out.println(strings);
        System.out.println(strings.get(2));
    }
}
