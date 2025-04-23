package oop;


// 추상 클래스 Animal
abstract class Animal {
    // 추상 메서드
    abstract void prt();
}

// 추상 클래스 Dog도 Animal을 상속받음 (구현은 안 함)
abstract class Dog extends Animal {
    // 여기도 prt() 구현 안 해도 됨 (추상이니까)
}

// 일반 클래스 Son은 Dog를 상속하므로 prt() 반드시 구현해야 함!
class Son extends Dog {
    @Override
    void prt() {
        System.out.println("멍멍!");
    }

    void makeSound() {
        System.out.println("짖는다~");
    }
}

// 실행 클래스
public class MainTest3 {
    public static void main(String[] args) {
        Son s = new Son();
        s.prt();         // 출력: 멍멍!
        s.makeSound();   // 출력: 짖는다~
    }
}
