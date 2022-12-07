package az.iktlab.lessons.lesson22;

public class Exceptions {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3};

        try {
            System.out.println(arr[1]);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException ex) {
            if (ex instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("Heddi ashdiz");
            } else if (ex instanceof NullPointerException) {
                System.out.println("Hech ne yoxdu");
            }
        } finally {
            System.out.println("Gelib sona catdiq");
        }
    }
}
