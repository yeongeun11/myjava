package loop;

public class SlotMachine {
    public static void main(String[] args) {
        int conCharCount = 0; // 연속된 문자를 세는 변수
        int[] selectedItems = {1, 2, 3, 3, 4}; // 배열 선언 및 초기화

        for (int i = 0; i < selectedItems.length - 1; i++) {
            if (selectedItems[i] == selectedItems[i + 1]) {
                conCharCount++;
            }
        }

        // A. 연속된 문자가 2개
        if (conCharCount == 1) {
            int selectedItem = selectedItems[0]; // 예시로 첫 번째 항목 선택
            switch (selectedItem) {
                case 1: // 숫자 1로 예제 작성
                    System.out.println("Case 1");
                    break;
                case 2:
                    System.out.println("Case 2");
                    break;
                case 3:
                    System.out.println("Case 3");
                    break;
                default:
                    System.out.println("Default case");
            }
            // B. 연속된 문자가 3개
        } else if (conCharCount == 2) {
            System.out.println("3개 이상의 연속된 문자가 발견되었습니다.");
        }
    }
}