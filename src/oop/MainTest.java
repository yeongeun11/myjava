package oop;

// Overloading
// 적용 -> [OOP : 메서드 , 생성자], [구조적 언어: 함수]
// 키포인트
// -> 함수, 메서드, 생성자에서 동일한 이름을 가지는 sub-routine이 존재

class Bar {
    void prtSomething() {}
    void prtSomething(int x) {}
    void prtSomething(String x) {}
    void prtSomething(int x, int y) {}
}
public class MainTest {
    public static void main(String[] args) {
        Bar b1 = new Bar();

        b1.prtSomething();
        b1.prtSomething(10);
        b1.prtSomething("10");
        b1.prtSomething(1, 2);
    }
}
