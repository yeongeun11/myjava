package conditional;

public class SwitchTest {
    public static void main(String[] args) {
        String day = "토요일";
        switch (day) {
            case "토요일":
            case "일요일":
                System.out.println("주말");
                break;
            // case "월요일":case "화요일":cass "수요일":case "목요일"case "금요일"case
            default:
                System.out.println("평일");
                break;
        }
    }
}
