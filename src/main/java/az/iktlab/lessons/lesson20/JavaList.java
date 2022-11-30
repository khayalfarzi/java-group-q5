package az.iktlab.lessons.lesson20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class JavaList {

    public static void main(String[] args) {

        List<Integer> arr = List.of(1, 4, 6, 7, 9, 8, 2, 3, 5);
        List<Integer> arrList = new ArrayList<>(15);
        arrList.addAll(arr);
        System.out.println(arrList);
        arrList.containsAll(arr);

        while (arrList.iterator().hasNext()) {
            System.out.println(arrList.iterator().next());
        }

        List<Integer> linkedList = new LinkedList<>();
        System.out.println(linkedList);

        List<Integer> vectors = new Vector<>();
        List<Integer> stack = new Stack<>();
    }
}
