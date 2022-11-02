package az.iktlab.lessons.lesson11;

public class Main {
    public static void main(String[] args) {

        Person ali = new Person();
        ali.name = "AliMardan";
        ali.surname = "AliMardanov";
        ali.setAge(18);
        ali.gender = "MALE";

        System.out.println(ali);
    }
}
