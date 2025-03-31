package oop;

class Bar2 {
    static int x; // 클래스 멤버 변수
    int y; // 인스턴스, 멤버 변수

    static void prtX() { // 인스턴스, 멤버 메서드
        System.out.println(x);
    }

    void prtY() { // 인스턴스, 멤버 메서드
        System.out.println(y);
    }
}
public class OopBar {
    public static void main(String[] args) {
        Bar2.prtX();
        Bar2 b1 = new Bar2();
    }
}
