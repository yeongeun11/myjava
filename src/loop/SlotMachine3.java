package loop;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;


public class SlotMachine3 {
    public static void main(String[] args) {
        // 랜덤으로 선택될 연산자 개수 상수
        final int NUM_OF_VALUE = 3;
        Scanner Scan = new Scanner(System.in);
        Random rand = new Random();

        // {'+', '-', '*'} 연산자를 포함하는 char 배열 생성
        char[] Choice = {'+', '-', '*'};

        // 점수를 저장하는 변수
        int bonusPoints = 0;

        // 게임 라운드 번호 변수
        int GameRound = 1;

        // 게임 진행
        while (true) {
            System.out.println(GameRound + "번째 게임");
            System.out.println("게임을 시작하려면 아무 값이나 입력하세요!");
            String userInput = Scan.nextLine(); // 사용자 입력

            // 랜덤 연산자를 저장할 배열 생성
            char[] randomOperatorList = new char[NUM_OF_VALUE];

            // 랜덤 연산자 선택
            for (int i = 0; i < randomOperatorList.length; i++) {
                int randomNum = rand.nextInt(Choice.length); // 랜덤으로 인덱스 선택
                randomOperatorList[i] = Choice[randomNum];  // 연산자를 배열에 저장
            }

            // 랜덤 연산자 배열 출력
            System.out.println("--------------------------");
            for(char item : randomOperatorList) {
                System.out.print(item + "\t");
            }
            System.out.println("\t--------------------------");

            // 같은 연산자의 개수와 저장된 연산자 판별
            int continuousChar = 0; // 연속된 연산자 개수 저장 변수
            char saveOperator = 0; // 첫 번째 연산자를 임시 저장

            for (int i = 0; i < randomOperatorList.length - 1; i++) {
                if (randomOperatorList[i] == randomOperatorList[i + 1]) {
                    continuousChar++; // 연속된 연산자 개수 증가
                    saveOperator = randomOperatorList[i]; // 연속된 연산자를 저장
                }
            }

            // 결과 메시지 저장 변수
            String GameResult = "";

            // A. 중복된 연산자가 2개일 경우
            if (continuousChar == 1) {
                switch (saveOperator) {
                    case '+': // + 연산자 -> 1점 추가
                        GameResult = "+ 2 Combo - 보너스 점수 1점 획득";
                        bonusPoints += 1;
                        break;
                    case '-': // - 연산자 -> 1점 감점
                        GameResult = "- 2 Combo - 보너스 점수 1점 감점";
                        bonusPoints -= 1;
                        break;
                    case '*': // * 연산자 -> 2점 추가
                        GameResult = "* 2 Combo - 보너스 점수 2점 획득";
                        bonusPoints += 2;
                        break;
                    default:
                        System.out.println("something went wrong");
                        exit(-1);
                }
            }

            // B. 중복된 연산자가 3개일 경우
            if (continuousChar == 2) {
                switch (saveOperator) {
                    case '+': // + 연산자 -> 3점 추가
                        GameResult = "+ 3 Combo - 보너스 점수 3점 획득";
                        bonusPoints += 3;
                        break;
                    case '-': // - 연산자 -> - 3점 추가
                        GameResult = "- 3 Combo - 보너스 점수 3점 감점";
                        bonusPoints -= 3;
                        break;
                    case '*': // * 연산자 -> 5점 추가
                        GameResult = "* 3 Combo - 보너스 점수 5점 획득";
                        bonusPoints += 5;
                        break;
                    default:
                        System.out.println("something went wrong");
                        exit(-1);
                }
            }

            // 현재 게임 결과 출력
            System.out.println(GameResult);
            System.out.println("현재 점수: " + bonusPoints);

            // 점수 조건 확인
            if (bonusPoints >= 5) {
                System.out.println("승리! 최종 점수: " + bonusPoints);
                break;
            } else if (bonusPoints <= -5) {
                System.out.println("패배! 최종 점수: " + bonusPoints);
                break;
            }

            // 다음 라운드로 진행
            GameRound++;
            System.out.println();
        }
    }
}
