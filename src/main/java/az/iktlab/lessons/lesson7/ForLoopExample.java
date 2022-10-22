package az.iktlab.lessons.lesson7;

public class ForLoopExample {

    public static void main(String[] args) {

//        System.out.println("Salam"); // 20 x
//        System.out.println("Salam"); // 20 x
//        System.out.println("Salam"); // 20 x
//        System.out.println("Salam"); // 20 x
//        System.out.println("Salam"); // 20 x
//        System.out.println("Salam"); // 20 x
//        System.out.println("Salam"); // 20 x
//        System.out.println("Salam"); // 20 x
//        System.out.println("Salam"); // 20 x

        for (int i = 0; i <= 20; i += 7) {
            /**
             * i= 0
             * yes
             * 1x
             * i = 5
             * yes
             * 2x
             * i = 10
             * yes
             * 3x
             * i = 15
             * yes
             * 4x
             * i = 20
             * yes
             * 5x
             * */
            System.out.println("Salam");
        }

        for (int i = 0; i < 20; ) {
            i++;
            System.out.println("Salam");
        }
    }
}
