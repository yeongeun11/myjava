package loop;

public class SlotMachineTest {
    public static void main(String[] args) {
        char[] selectedItems = {'*', '+', '-'};
        char selectedItem = 0;
        // 포인트 점수 계산
        // 연속된 문자 카운드
        int conCharCount = 0;
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
