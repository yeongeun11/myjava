package oop;

import java.sql.Array;
import java.util.ArrayList;
import java.util.function.Consumer;

class Person {
    String name;
    int age;
    public Person(String name, int age) {this.name = name; this.age = age;}
}

public class MainTest6 {

    public static void main(String[] args) {

        // collection Framework : package for Data Structures
        ArrayList<Person> list = new ArrayList<Person>();

        list.add(new Person("Yon", 20));
        list.add(new Person("Jane", 31));
        list.add(new Person("Tack", 41));
        list.add(new Person("Qill", 51));



        Consumer<Person> prt = (obj) -> System.out.println(obj.name + ":" + obj.age);

        list.stream().forEach(prt);

    }
}


// interface MyInterface {
//    void prt(String s);
//}
//public class MainTest6 {
//
//    static void doSomething(MyInterface mi) {mi.prt("Hello World");}
//    public static void main(String[] args) {
//
//        MyInterface obj = (msg) -> System.out.println(msg);
//
//        doSomething(obj);
//    }
// }
