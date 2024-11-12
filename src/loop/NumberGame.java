package loop;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int answer = 0;
        int guess;
        Scanner sc = new Scanner(System.in);
        int tries = 0;
        // 반복 구조
        // do..while 루프의 마지막 조건 검사 부분에서
        // guess가 answer와 같은지 검사
        // 만약 guess가 answer와 같으면 반복 중단
        do {
            System.out.println("정답을 추측하여 보시오: ");
            guess = sc.nextInt();
            tries++;

            if (guess > answer) // 사용자가 입력한 정수가 정답보다 높으면
                System.out.println("제시한 정수가 높습니다. ");
            if (guess < answer) // 사용자가 입력한 정수가 정답보다 낮으면
                System.out.println("제시한 정수가 낮습니다. ");
        } while (guess != answer);

        System.out.println("축하합니다. 시도횟수=" + tries);
    }
}
