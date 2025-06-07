package oop;

interface KL { public abstract void print();}

class T {
    KL obj;
    T(KL obj) {
        this.obj = obj;
    }
    void prt() {obj.print();}
}

class P implements KL {public void print() {System.out.println("P");}}
class Q implements KL {public void print() {System.out.println("Q");}}
class Z implements KL {public void print() {System.out.println("Z");}}


public class MainTest8 {
    public static void main(String[] args) {
        (new T(new P())).prt();
        (new T(new Q())).prt();
        (new T(new Z())).prt();
    }

}
