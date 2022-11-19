package az.iktlab.lessons.lesson16;

public class Application {

    public static void main(String[] args) {

//        System.out.println(WeekDays.MONDAY);
//        System.out.println(WeekDays.WEDNESDAY);

//        for (WeekDays day: WeekDays.values()){
//
//            System.out.println(day);
//        }

//        System.out.println(WeekDays.values()[0]);

        System.out.println(WeekDays.MONDAY.getCode());
        System.out.println(WeekDays.MONDAY.getNameInAz());
        System.out.println(WeekDays.getNameInAzByCode(1));

    }
}
