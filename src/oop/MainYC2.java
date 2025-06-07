package oop;

class A1{
    private int x;
    void prt() {
        System.out.println(x);
    }
}

class B1 extends A1{

}

public class MainYC2 {
    public static void main(String[] args) {
        new B1().prt();
    }
}