package test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 문자 두 개를 가각 키보드로부터 입력 받아
        // 문자열 값이 같으면 "참" 아니면 "거짓"을 출력
        // 예시 : "hello", "hello" -> "참"
        // 예시 : "hello", "world" -> "거짓"

        // 첫 번째 문자열
        String str1 = sc.next();

        // 두 번째 문자열
        String str2 = sc.next();

        // 두 문자열이 같으면 "참: 아니면 "거짓"
        if (str1.equals(str2)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }
}
