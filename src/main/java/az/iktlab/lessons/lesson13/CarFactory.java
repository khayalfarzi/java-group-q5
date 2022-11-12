package az.iktlab.lessons.lesson13;

public class CarFactory {

    public static void main(String[] args) {

        Mercedes amg = new Mercedes();
        amg.setEngine(5.5);
        amg.setColor("Black");
        amg.setDoors(4);
        amg.setType("SUV");

        System.out.println(amg);

        Bmw f30 = new Bmw();
        f30.setColor("Black");
        f30.setDoors(4);
        f30.setEngine(2.0);
        f30.setType("Sedan");
        f30.setCamera("360 display");

        System.out.println(f30);
    }
}
