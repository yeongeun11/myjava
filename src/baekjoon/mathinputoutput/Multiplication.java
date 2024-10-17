package baekjoon.mathinputoutput;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        // B의 각 자리 수 추출
        int B1 = B % 10;        // 일의 자리
        int B2 = (B / 10) % 10; // 십의 자리
        int B3 = B / 100;       // 백의 자리

        System.out.println(A * B1);
        System.out.println(A * B2);
        System.out.println(A * B3);

        System.out.println(A * B);
    }
}
