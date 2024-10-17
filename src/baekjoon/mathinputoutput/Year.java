package baekjoon.mathinputoutput;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 불기 연도를 입력 받음
        int bulgiYear = sc.nextInt();
        // 서기 연도를 구하기 위해 543을 뺌
        int seogiYear = bulgiYear - 543;

        System.out.println(seogiYear);

    }
}
