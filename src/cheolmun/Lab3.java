package cheolmun;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age = 21; // 나이
        String eventCode = "E3";  // 이벤트 코드
        int reserveDate = 22; // 예약 날짜

        // 예약 가능 여부 판단
        boolean reservation = false;
        String result = "";

        switch (eventCode) {
            case "E1":
                if (age >= 18) {
                    reservation = true;
                } else {
                    result = "나이 제한으로 인해 예약할 수 없습니다. ";
                }
                break;
            case "E2":
                reservation = true;
                break;
            case "E3":
                if (age >= 16 &&  reserveDate % 7 == 0) { // % 7 != 0
                    reservation = true;
                } else {
                    result = "잘못된 입력입니다. 프로그램을 종료합니다. ";
                } break;
        }

        // 결과 출력
        if (reservation) {
            result = "예약이 완료되었습니다! ";
        }
        System.out.println(result);


    }
}
