package loop;

public class SlotMachine {
    public static void main(String[] args) {
        int conCharCount = 0; // 연속된 문자를 세는 변수
        char[] selectedItems = {'+', '+', '-', '*', '*'}; // 배열 선언 및 초기화

        for (int i = 0; i < selectedItems.length - 1; i++) {
            if (selectedItems[i] == selectedItems[i + 1]) {
                conCharCount++;
            }
        }

        // A. 연속된 문자가 2개
        if (conCharCount == 1) {
            char selectedItem = selectedItems[0]; // 예시로 첫 번째 항목 선택
            switch (selectedItem) {
                case '+':
                    System.out.println("Selected +");
                    break;
                case '-':
                    System.out.println("Selected -");
                    break;
                case '*':
                    System.out.println("Selected *");
                    break;
                default:
                    System.out.println("Default case");
            }
        }
        // B. 연속된 문자가 3개
        else if (conCharCount == 2) {
            System.out.println("연속된 문자가 3개 이상 발견되었습니다.");
        }
    }
}
