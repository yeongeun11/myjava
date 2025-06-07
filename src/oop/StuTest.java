package oop;


class Student3 {
    int id;
    String name;
    static String university = "영진";
    String major;
    int age = 30;

}
class GscStudent extends Student3 {
    int id;
    String name = "GscStudent";
    GscStudent() {
        System.out.println("id " + id + " name " + super.name + " age " + age);}
}
class MechanicStudent extends Student3 {
    MechanicStudent() { major = "기계과";}
}

public class StuTest {
    public static void main(String[] args) {
        GscStudent s = new GscStudent();
        s.id = 1;
    }
}
