package lab;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        // Scanner 객체 생성하여 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 나이 입력받기
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt(); //  정수형 입력하기

        // 키 입력받기
        System.out.print("키를 입력하세요: ");
        double height = scanner.nextDouble();

        // 신용점수 입력받기
        System.out.print("신용점수를 입력하세요: ");
        int credit_score = scanner.nextInt();

        // 합계 계산
        double total = age + credit_score + height;

        // 평균 계산
        double average = total / 3;

        // 결과 출력
        System.out.printf("합계: %.1f\n", total);
        System.out.print("평균: " + average);

        //  Scanner 닫기
        scanner.close();








    }
}
