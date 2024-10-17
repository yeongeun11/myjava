package baekjoon.conditional2;

import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        // 만약 분이 45보다 작으면
        if (m < 45) {
            m = m + 60 - 45; // 60분을 더한 후 45분을 뺀다
            h = h - 1; // 시간을 한 시간 줄인다
            if (h < 0) { // 만약 시간이 0시보다 작으면
                h = 23; // 23시로 설정
            }
        } else {
            m = m - 45; // 45분을 뺀다
        }

        // 결과 출력
        System.out.println(h + " " + m);
    }
}
