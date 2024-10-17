package conditional;
// 월의 이름을 영어로 받아서 월으 반환하기

import java.util.Scanner;

public class StringSwitch {
    public static void main(String[] args) {
        String month;

        Scanner sc = new Scanner(System.in);
        System.out.print("월의 이름을 입력하시오: ");
        month = sc.nextLine();

        int monthNumber;
        switch (month) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            default:
                monthNumber = 0;
                break;

        }
        System.out.println(monthNumber);
    }
}
