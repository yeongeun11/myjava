package conditional;

import java.util.Scanner;

public class RockScissorsPaper2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bonusPoints = 0;
        int winStreak = 0;

        // 가위, 바위, 보 게임 만들기

        // 무한 반복
        while (true) {
            // 사용자로부터 Scissors, Rock, Paper 입력받기
            String inputValue = sc.nextLine();

            int userInput = switch (inputValue) {
                case "Scissors" -> 0;
                case "Paper" -> 1;
                case "Rock" -> 2;
                case "Quit" -> 3;
                default -> -1;
            };

            // Quit 입력 시 종료
            if (userInput == 3) {
                System.out.println("프로그램 종료");
                break;
            }

            // "Rock, Scissors, Paper" 이외 값 입력 재입력
            if (userInput == -1) {
                System.out.println("Rock, Scissors, Paper 중 하나를 입력하세요");
                continue; // continue;: 현재 반복을 건너뛰고 다음 반복으로 넘어감.
                          // break;: 현재 반복문을 즉시 종료하고 반복문 이후의 코드로 넘어감
            }

            // 컴퓨터 선택
            int computerSelection = (int) (Math.random() * 3); // 0 ~ 2

            String result = "";

            // 결과값 판별
            if (userInput == computerSelection) {
                result = "무승부";
            } else if ((userInput == 0) && (computerSelection == 2) ||
                    (userInput == 1 && computerSelection == 0) ||
                    (userInput == 2 && computerSelection == 1)){
                result = "승리";
                bonusPoints++;
                winStreak++;


                // 연속 승리 시 추가 포인트
                if (winStreak >= 2) {
                    bonusPoints += 3; // 3점 추가
                    System.out.println("연속 승리! 보너스 3점 추가!");
                }
            } else {
                result = "패배";
                bonusPoints--;
                winStreak = 0;
            }

            // 결과값 출력
            String srpStrToInt[] = {"Scissors", "Rock", "Paper"};
            System.out.println(result + "\tUser : " + srpStrToInt[userInput]
                    + "\tComputer : " + srpStrToInt[computerSelection]);

            // 현재 보너스 포인트 출력
            System.out.println("현제 포인트: " + bonusPoints + "점");

            // 사용자 포인트가 7점 이상 또는 -7점 이하이면 종료
            if (bonusPoints >= 7) {
                System.out.println("축하합니다. 승리~~~");
                break;
            } else if (bonusPoints <= -7) {
                System.out.println("다음 기회에~~~");
                break;
            }



        }


    }
}
