package oop;

// 반환형, 이름, 매개변수가 부모에서 정의된 메소드와 일치
// 예외, 접근제어자
class Player {
    void shoot() {System.out.println("슛");}
}

class Sg extends Player {
    void shoot() {System.out.println("슛팅 가드 슛");}
}

class Pg extends Player {
    int x = 3;
    void shoot() {
        System.out.println("포인트 가드 슛");
    }
}

public class MainYC {
    public static void main(String[] args) {}
    // 다형성 -> 참조변수

}
