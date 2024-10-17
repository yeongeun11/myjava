package baekjoon.conditional2;

import java.util.Scanner;
// 사분면 고르기

public class QuadrantSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 x좌표를 입력받음
        int x = sc.nextInt();
        // 사용자로부터 y좌표를 입력받음
        int y = sc.nextInt();

        // 제1사분면: x좌표와 y좌표가 모두 양수인 경우
        if(x > 0 && y > 0){
            System.out.println("1");
            // 제2사분면: x좌표가 음수이고 y좌표가 양수인 경우
        } else if(x < 0 && y > 0){
            System.out.println("2");
            // 제3사분면: x좌표와 y좌표가 모두 음수인 경우
        } else if(x < 0 && y < 0){
            System.out.println("3");
            // 제4사분면: x좌표가 양수이고 y좌표가 음수인 경우
        } else {
            System.out.println("4");
        }
    }
}