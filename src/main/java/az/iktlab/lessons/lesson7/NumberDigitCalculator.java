package az.iktlab.lessons.lesson7;

public class NumberDigitCalculator {

    public static void main(String[] args) {
        System.out.println("===================> Welcome to the application <===================");

        System.out.println("Tricky way");
        // bad but tricky way
        for (int i = 1; i < 10; i++) { // i=9
            for (int j = 0; j < 10; j++) { // j=9
                for (int k = 0; k < 10; k++) { // k=9
                    for (int l = 0; l < 10; l++) { // l=0

                        if ((i + j) == (k + l))
                            System.out.printf("%s%s%s%s\n", i, j, k, l);
                    }
                }
            }
        }

        System.out.println("Math way");
        // good but Math way
        for (int i = 1000; i < 10_000; i++) {

            // i= 1001
            int a = i / 1000; // a = 1
            int b = i / 100 % 10; // b = 0
            int c = i / 10 % 10; // c= 0
            int d = i % 10; // d = 1

            if ((a + b) == (c + d))
                System.out.println(i);
        }
        System.out.println("===================> Good bye! <===================");
    }
}
