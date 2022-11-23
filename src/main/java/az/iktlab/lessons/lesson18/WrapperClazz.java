package az.iktlab.lessons.lesson18;

public class WrapperClazz {

    public static void main(String[] args) {

        int i = 5;

        System.out.println(i);
        System.out.println(i * 5);

        // boolean , byte, short, char,      int,     double, float, long
        // Boolean , Byte, Short, Character, Integer, Double, Float, Long

        Integer i1 = new Integer(5);
        Integer i2 = Integer.valueOf(5);

        String numberStr = "5";
        Integer number = Integer.parseInt(numberStr);
        System.out.println(Math.sqrt(number));
        System.out.println(Integer.MAX_VALUE);

        // Auto boxing - Boxing
        int i3 = 17;
        Integer i4 = i3;

        boolean b = true;
        Boolean b1 = b;

        // Unboxing
        Integer i5 = 18;
        int i6 = i5;

        int i7 = 0; // 0
        boolean b2 = false;// false

        Integer i8 = null; // null

        System.out.println(i7);
        System.out.println(i8);
        System.out.println(b2);
    }
}
