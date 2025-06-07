package oop;

class A{
    A() { System.out.println("A 생성자 호출"); }
}
class B extends A{
    B() {System.out.println("B 생성자 호출");
    }
}

class C extends B{
    C() {
        super();
        System.out.println("C 생성자 호출");
    }
}

public class Test6 {
    public static void main(String[] args) {
        new C();
    }
}