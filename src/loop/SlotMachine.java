package loop;

import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int NUM_OF_ITEMS = 3;
        int bonusPoints = 0;
        int gameRound = 0;
        int conCharCount = 0;
        int selectedItem = 0;

        // 3개의 아이템을 가지는 슬롯 머신 구현
        char[] items = {'*', '+', '-'};
        char[] selectedItems = new char[NUM_OF_ITEMS];

         // while (true) {
        System.out.println(gameRound + " 번째 게임");
            // 사용자로부터 아무키나 입력
        System.out.println("아무키나 입력 하세요");
        scan.next();

            // 랜덤하게 아이템 3개를 선택하여 1차원 배열에 저장
        for(int i = 0; i < selectedItems.length; i++){
            // char[] items = {'*', '+', '-'};
            int selectedItem1 = (int) (Math.random() * NUM_OF_ITEMS);
            selectedItems[i] = items[selectedItem];
        }
        System.out.println("------------------------------");
        for(char item : selectedItems){
            System.out.print("\t" + item);
        }
        System.out.println("\n------------------------------");

        for(int i = 0; i < selectedItems.length - 1; i++){
            if (selectedItems[i] == selectedItems[i+1]){
                conCharCount++;
            }
        }
        // A. 연속된 문자가 2개
        if(conCharCount == 1){
            switch (selectedItem){
                case '+':
                    break;
                case '-':
                    break;
                case '*':
                    break;
                default:
                    System.out.println("잘못 된 ");
            }

            // B. 연속된 문자가 3개
        } else if (conCharCount == 2) {


        }


    }
}



// 포인트 점수 계산

