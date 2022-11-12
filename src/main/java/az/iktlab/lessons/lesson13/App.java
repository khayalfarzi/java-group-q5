package az.iktlab.lessons.lesson13;

public class App {

    public static void main(String[] args) {

//        Human human = new Human("Ali", "Aliyev", 98);
//        System.out.println(human);
//
//        Human human1 = new Human("Khayal", "Farziyev", 109);
//        System.out.println(human1);


        Programmer p = new Programmer();
        p.setName("P1");
        p.setAge(12);
        System.out.println(p.toString());

        p.write();
    }
}
