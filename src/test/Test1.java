package test;

public class Test1 {
    public static void main(String[] args) {

        // 화면에 A ~ Z까지 출력
        for (char bar = 'A'; bar <= 'Z'; bar++) {
            System.out.print(bar + "\t");
        }
        System.out.println(); // 줄 바꿈

        // 화면에 Z ~ A까지 출력
        for (char foo = 'Z'; foo >= 'A'; foo -= 2) {
            System.out.print(foo + "\t");
        }
    }
}
