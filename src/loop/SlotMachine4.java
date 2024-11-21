package loop;


import java.util.Random;
import java.util.Scanner;

public class SlotMachine4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // 랜덤으로 선택될 랜덤 연산자 개수 상수
        final int NUM_OF_VALUE = 3;

        // {+, -, *}을 포함하는 char 배열 생성
        char [] selectedOperators = {'+','+','+','-','*','*','*'}; // 출력 값: 8
        // 점수를 저장하는 변수
        int bonusPoint = 0;
        // 게임 라운드 번호 변수
        int gameRound = 1;

        // 게임 진행
        while (true) {
            System.out.println("Round " + gameRound);
            System.out.println("Press Enter to spin the slot machine: ");
            String inputUser = sc.nextLine(); // 아무 사용 값이나 입력


            // 랜덤 연산자를 저장할 배열 생성
            char[] randomOperatorList = new char[NUM_OF_VALUE];

            // 랜덤 연산자 선택
            for (int i = 0; i < randomOperatorList.length; i++) {
                int randomNum = rand.nextInt(selectedOperators.length); // 랜덤으로 인덱스

                randomOperatorList[i] = selectedOperators[randomNum];
            }

            // 랜덤 연산자 배열 출력
            System.out.println("---------------------------------------");
            for(char item : randomOperatorList){
                System.out.println(item + "\t");
            }
            System.out.println("---------------------------------------");

            // 같은 연산자의 개수와 저장 된 연산자 판별
            int continuousChar = 0;    // 연속된 연산자 개수 저장 변수
            char saveOperator = 0;    // 첫 번째 연산자를 임시 저장

            // 결과 메시지 저장 변수
            String GameResult = "";

            for (int i = 0; i < selectedOperators.length; i++ ) {
                // 같은 문자가 연속 적으로 발생
                if (i < selectedOperators.length - 1 && selectedOperators[i] == selectedOperators[i+1]) {
                    continuousChar++;

                    // A. 중복된 연산자가 2개일 경우
                    if (continuousChar == 2) {
                        switch (selectedOperators[i]){
                            case '+':
                                bonusPoint += 1;

                        }
                    }

                    // B. 중복된 연산자가 3개일 경우

                }
            }

            // 현재 게임 결과 출력

            // 점수 조건 확인

            // 다음 라운드로 진행


        }
    }
}
