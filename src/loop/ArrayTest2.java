package loop;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
    final int STUDENTS = 5;
    int total = 0;
        Scanner sc = new Scanner(System.in);

        // 크키가 STUDENTS인 배열 생성
        int[] scores = new int[STUDENTS];

        for(int i = 0; i < scores.length; i++) {
            System.out.println("성적을 입력하세요: ");
            scores[i] = sc.nextInt();
        }

        for (int i = 0; i < scores.length; i++)
            total += scores[i];

        System.out.println("평균 성적은 " + total / STUDENTS + "입니다");
    }
}
