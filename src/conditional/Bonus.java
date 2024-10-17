package conditional;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        final int targetSales = 1000; // 실적 목표를 상수로 정의 (단위: 만원)
        int mySales;  // 본인의 실적을 저장할 변수
        int bonus;  // 보너스 금액을 저장할 변수
        String result; // 실적 달성 여부를 저장할 문자열 변수 선언

        Scanner sc = new Scanner(System.in);  // 사용자 입력을 받을 Scanner 객체 생성
        System.out.print("실적을 입력하시오(단위: 만원): ");
        mySales = sc.nextInt();  // 사용자가 입력한 실적을 mySales 변수에 저장

        // 실적이 목표치를 초과했는지 확인
        if (mySales > targetSales) {
            result = "실적 달성";  // 실적이 목표를 넘으면 "실적 달성" 메시지
            bonus = (mySales - targetSales) / 10;  // 목표를 초과한 부분의 10%를 보너스로 지급
        } else {
            result = "실적 달성 못함";  // 실적이 목표 미달일 경우 "실적 달성 못함" 메시지
            bonus = 0;  // 보너스는 0
        }

        // 결과와 보너스 금액을 출력
        System.out.println(result + "\n" + "보너스: " + bonus);
    }
}
