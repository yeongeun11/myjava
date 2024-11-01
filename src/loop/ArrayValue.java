package loop;

import java.util.Scanner;

public class ArrayValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numOfElements = 5;
        int bar[] = new int[numOfElements];

        // 반복 -> 배열의 원소를 처음부터 마지막까지
        for (int i = 0; i < bar.length ; i++) {
            bar[i] = sc.nextInt();

        }

        //  배열 내 모든 원소를 출력하고 싶어,,,,
        for (int i = 0; i < bar.length ; i++) {
            // 실행코드 -> 각 iteration
            // System.out.println(배열의 원소 -> 현재 i값);
        }
    }
}
