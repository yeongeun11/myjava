package baekjoon.conditional2;

// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력을 받기 위해 Scanner 객체 생성

        int y = sc.nextInt(); // 사용자로부터 연도 입력 받기

        // 윤년 계산
        // 1. 연도가 4로 나누어 떨어지면서, 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어지면 윤년
        // 2. 그렇지 않으면 윤년이 아님
        if (((y % 4) == 0 && (y % 100 != 0 || y % 400 == 0) )) {
            System.out.println("1"); // 윤년이면 1 출력
        } else {
            System.out.println("0"); // 윤년이 아니면 0 출력
        }

    }
}
