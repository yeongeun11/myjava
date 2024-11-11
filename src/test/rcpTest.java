package test;

import java.util.Scanner;

public class rcpTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bonusPoints = 0;
        int winStreak = 0;
        // 가위, 바위, 보 게임 만들기
        String rsp [] = {"Scissors", "Rock", "Paper"};

        // 무한 루프
        while (true) {
            String inputValue = sc.nextLine();

            // 사용자 입력
            int UserInput = switch (inputValue) {
                case "Scissors" -> 0;
                case "Rock" -> 1;
                case "Paper" -> 2;
                case "Exit" -> 3;

                default -> -1;
            };

            // Exit를 입력하면 게임 종료
            if (UserInput == 3) {
                System.out.println("게임 종료");
                break;
            }
            // Scissors, Rock, Paper 이외 재입력 처리
            if (UserInput == -1) {
                System.out.println("Scissors, Rock, Paper 중 하나를 입력해 주세요.");
                continue;
            }
            // 컴퓨터의 선택
            int computerChoice = (int) (Math.random() * 3); // 0 ~ 2

            String result = "";

            // 결과값 판별
            if (computerChoice == UserInput) {
                result = "무승부 - ";
                winStreak = 0;
            } else if ((UserInput == 0) && (computerChoice == 2) ||
                    (UserInput == 1) && (computerChoice == 0) ||
                    (UserInput == 2) && (computerChoice == 1)){
                result = "승리 - ";
                bonusPoints++;
                winStreak++;
                // 연속 승리 시 추가 포인트
                if (winStreak >= 2) {
                    bonusPoints += 3;
                    System.out.println("연속 승리!! 보너스 포인트 3점 추가!!");
                }
            } else {
                result = "패배 - ";
                bonusPoints--;
                winStreak = 0;

            }
            // 결과값 출력

            System.out.println(result + "사용자: " + rsp[UserInput]
                    +"\t컴퓨터: " + rsp[computerChoice]);

            // 현재 보너스 포인트 출력
            System.out.println("현재 포인트 : " + bonusPoints + "점");

            // 사용자 포인트가 7점 이상 또는 -7점 이하이면 종료
            if (bonusPoints >= 7 || bonusPoints <= -7) { // ? 뒤에 오는 값은 조건이 참일 때 반환되는 값이고, : 뒤에 오는 값은 조건이 거짓일 때 반환되는 값
                String resultMsg = (bonusPoints >= 7) ? "축하합니다. 승리~~~" : "다음 기회에~~~";
                System.out.println(resultMsg);
                break;
            }
//            if (bonusPoints >= 7) {
//                System.out.println("축하합니다. 승리~~~");
//                break;
//            } else if (bonusPoints <= -7) {
//                System.out.println("다음 기회에~~~");
//                break;
//            }

        }

    }
}


