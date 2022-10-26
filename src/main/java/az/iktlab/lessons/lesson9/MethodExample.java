package az.iktlab.lessons.lesson9;

public class MethodExample {

    public static void main(String[] args) {

        methodTypeOne();
        methodTypeTwo("Quba almasi", 12, true);

        int result = methodTypeThree(17);
        System.out.println(result);

        int result1 = methodTypeFour();
        System.out.println(result1);
    }

    public static void methodTypeOne() {
        System.out.println("Method type one");
    }

    public static void methodTypeTwo(String alma, int elem, boolean key) {
        System.out.println(alma);

        if (key) {
            elem = elem + 5;
        }

        System.out.println(elem);
    }

    public static int methodTypeThree(int alma) {

        int temp = alma * 2;

        return temp;
    }

    public static int methodTypeFour() {

        return 9;
    }

    public static int findMax(int a, int b) {
        return a > b ? a : b;
    }

    public static char findFirstElement(String word) {

        return word.charAt(0);
    }
}
