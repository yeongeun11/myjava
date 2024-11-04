package cheolmun;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 수학, 과학, 영어의 점수를 입력 받기
        System.out.print("수학 점수를 입력하세요: ");
        double math = sc.nextDouble();

        System.out.print("과학 점수를 입력하세요: ");
        double science = sc.nextDouble();

        System.out.print("영어 점수를 입력하세요: ");
        double english = sc.nextDouble();

        // 평균 점수 계산
        double average = (math + science + english) / 3;

        // 학점 등급
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // 출력하기
        System.out.print("평균 점수는 " + average + "점이고, 학점은 " + grade + "입니다.");
    }
}