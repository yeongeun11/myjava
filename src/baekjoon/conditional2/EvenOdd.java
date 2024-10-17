package baekjoon.conditional2;// 짝수, 홀수 구별하기

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // if 문을 사용하여 홀수와 짝수를 구별하는 프로그램
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");
        number = sc.nextInt();
        // number를 2로 나누어서 0이면 짝수
        if (number % 2 == 0) {
            System.out.println("입력된 정수는 짝수입니다.");
        } else {
            System.out.println("입력된 정수는 홀수입니다.");
        }

        System.out.println("프로그램이 종료되었습니다. ");
    }
}
