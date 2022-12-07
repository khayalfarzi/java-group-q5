package az.iktlab.lessons.lesson22;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExample {

    private static final List<String> colors1 =
            Arrays.asList("Red", "Green", "Black", "White", "Pink");
    private static final List<String> colors2 =
            Arrays.asList("Red", "Green", "Black", "Pink");

    public static void main(String[] args) {
        List<String> combinedLists = combineLists();

        System.out.println(combinedLists);
    }

    private static List<String> combineLists(){
       return Stream.of(colors1, colors2)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
