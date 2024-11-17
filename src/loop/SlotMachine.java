package loop;

public class SlotMachine {
    public static void main(String[] args) {
        char[] selectedItems = {'+', '+', '-'};
        char selectedItem = '0';
        // 포인트 점수 계산
        int bonusScore = 0;
        // 연속된 문자 카운트
        int conCharCount = 0;
        //           0       3 번 반복 : 0, 1, 2
        for (int i = 0; i < selectedItems.length - 1; i++) {
            //         index 0   == index 1, 2
            if (selectedItems[i] == selectedItems[i+1]) {
                conCharCount++;
                // 연속된 문자 종류 저장
                selectedItem = selectedItems[i];
            }
        }
        // A. 연속된 문자가 2개
        if (conCharCount == 1){
            switch (selectedItem){
                case '+':
                    bonusScore += 1;
                    break;
                case '-':
                    bonusScore -= 1;
                    break;
                case '*':
                    bonusScore += 2;
                    break;
                default:
                    System.out.println("something went wrong");
            }
            // B. 연속된 문자가 3개
        } else if (conCharCount == 2){
            switch (selectedItem) {
                case '+':
                    bonusScore += 3;
                    break;
                case '-':
                    bonusScore -= 3;
                    break;
                case '*':
                    bonusScore += 5;
                    break;
                default:
                    System.out.println("something went wrong");
            }
        }
        System.out.println(bonusScore);

    }
}
