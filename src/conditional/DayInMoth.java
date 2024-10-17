package conditional;// 월의 일수 출력하기

import java.util.Scanner;

public class DayInMoth {
    public static void main(String[] args) {
        int month;  // 사용자가 입력할 월을 저장하는 변수
        int days = 0;   // 해당 월의 일수를 저장하는 변수

        System.out.print("일수를 알고 싶은 월을 입력하시오: ");
        Scanner sc = new Scanner(System.in);

        month = sc.nextInt();   // 사용자가 입력한 월을 정수로 받아옴
        switch (month) {  // 월에 따라 조건을 분기
        case 4:
        case 6:
        case 9:
        case 11:
            days = 30;  // 4, 6, 9, 11월은 30일
            break;
        case 2:
            days = 28; // 기본적으로 2월은 28일 (윤년 제외)
            break;
        default: // 그 외의 월 (1, 3, 5, 7, 8, 10, 12월)
            days = 31;
            break;
        }
        // 결과 출력
        System.out.println("월의 날수는 " + days);
    }
}
