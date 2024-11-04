package loop;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 키보드로부터 정수 N을 입력 받아
        int inputValue = 3;

        // 만약 N 값이 0이하 또는 10 초과일 경우 재입력
        // 무한반복 : 조건을 만족하는 입력 값이 언제들어올지 몰라....
        while (true) {
            // 키보드로부터 정수를 입력
            inputValue = sc.nextInt();

            // 만약 입력 값이 0이상 10 이하일 경우 반목문 탈출
            // inputValue >= 0 && inputValue <= 10
            if (inputValue >= 0 && inputValue <= 10) {
                break;
            }
        }

        // N 개의 int형 원소를 가지는 1차원 배열을 생성하라.
        int bar[] = new int[inputValue];


        // 생성된 1차원 배열에 사용자로 부터 값을 입력 받아 배열에 순차적으로 저장하라.
        // 예) 사용자 1 -> bar[0] = 1
        // 만약 음의 정수 또는 0이 입력 될 경우 재입력
        for (int i = 0; i < bar.length; i++) {

            int inputValue2 = 0;
            // 무한반복
            while (true) {
                // 키보드로부터 정수값 입력
                inputValue2 = sc.nextInt();

                // 입력받은 정수값이 양의 정수이면 탈출
                if (inputValue2 > 0) {
                    break;
                }
            }

            // 입력 받은 정수값을 현 인덱스의 원소에 저장
            bar[i] = inputValue2;
        }

        // 현재 1차원 배열에 입력된 값을 역순으로 출력하라.
        // 3, 10, 20
        // 출력 : 20, 10, 3
        for (int i = bar.length - 1; i >= 0; i--) { // 4, 3, 2, 1, 0
            System.out.println(bar[i]);
        }

    }
}