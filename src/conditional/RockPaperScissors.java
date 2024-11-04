package conditional;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 가위, 바위, 보 게임
        // 무한 루프
        while (true) {
            System.out.print("Scissors, Rock, Paper 중 하나를 입력하세요: ");
            String userInput = sc.nextLine();

            // "quit"를 입력하면 프로그램 종료
            if (userInput.equals("quit")) {
                System.out.println("시스템 종료");
                break;
            }

            // 사용자 입력 예외 처리
            if (!userInput.equals("Scissors") && !userInput.equals("Rock") && !userInput.equals("Paper")) {
                System.out.println("잘못된 입력 값입니다, Scissors, Rock, Paper 중 하나를 입력하세요");
                continue; // 잘못된 입력 시 재입력
            }

            // 컴퓨터의 선택
            String[] choices = {"Scissors", "Rock", "Paper"}; // 컴퓨터의 선택을 위한 배열
            int computerInput = (int) (Math.random() * 3); // 0, 1, 또는 2 중 하나의 정수 값을 무작위로 생성
            String computerChoice = choices[computerInput]; // 컴퓨터의 선택

            // 승패 계산
            String result;
            if (userInput.equals(computerChoice)) { 
                result = "무승부입니다: 사용자 - " + userInput + ", 컴퓨터 - " + computerChoice;
            } else if ((userInput.equals("Rock") && computerChoice.equals("Scissors")) ||
                    (userInput.equals("Paper") && computerChoice.equals("Rock")) ||
                    (userInput.equals("Scissors") && computerChoice.equals("Paper"))) {
                result = "승리입니다: 사용자 - " + userInput + ", 컴퓨터 - " + computerChoice;
            } else {
                result = "패배입니다: 사용자 - " + userInput + ", 컴퓨터 - " + computerChoice;
            }

            // 결과 출력
            System.out.println(result);
        }

    }
}

