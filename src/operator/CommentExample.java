package operator;

import java.util.Scanner;

public class CommentExample {
    public static void main(String[] args) {
        // Scanner 객체 생성하여 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 출력할 구구단 입력 요청
        System.out.print("출력할 구구단을 입력 하세요: ");
        int tableNumber = scanner.nextInt(); // 사용자가 입력한 값 저장

        /*
         * 입력된 숫자에 대해 구구단을 출력하는 반복문
         * 반복문은 1부터 9까지 순회하며
         * 사용자 입력에 대한 구구단 결과를 출력
         */
        for (int multiplier = 1; multiplier < 10; multiplier++) {
            // 입력된 숫자에 대해 1부터 9까지 곱한 결과를 출력
            System.out.println(tableNumber + " * " + multiplier + " = " + tableNumber * multiplier);
        }

        // Scanner 자원 해제
        scanner.close(); // 리소스 누수를 방지하기 위해 Scanner 객체 닫기
    }
}
