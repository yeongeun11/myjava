package conditional;

import java.util.Random;
import java.util.Scanner;

public class ArrayGeneratorT {
    public static void main(String[] args) {
        // 키보드로부터 정수 N을 입력 받아.
        // 만약 N이 0 또는 음의 정수이면 재입력

        Scanner sc = new Scanner(System.in);
        int numOfElements = 0;

        while (true) {
            System.out.print("배열의 크기 N을 입력하세요 (0 또는 음수 입력 시 종료): ");
            numOfElements = sc.nextInt();

            // 탈출 조건 : if numOfElements > 0 -> break
            if (numOfElements > 0) {
                break;
            }
            // 예외 출력
            System.out.println("양수 값을 입력하세요.");
        }

        // 키보드로부터 start, end 값을 정수 값을 입력 받아
        // start <= 난수 값 <= end 범위의 크기가 배열의 원소보다 작을 경우 재입력 받기
        int start = 0;
        int end = 0;

        while (true) {
            System.out.print("난수 범위의 시작 값과 끝 값을 입력하세요: ");
            start = sc.nextInt();
            end = sc.nextInt();

            if ((end - start + 1) >= numOfElements) {
                break;
            }
            System.out.println("배열의 크기보다 큰 범위를 입력하세요.");
        }

        // start <= rand value <= end 범위의 난수를 발생하여 배열에 저장하라
        int[] array = new int[numOfElements];
        for (int i = 0; i < array.length; i++) {
            array[i] = start + (int)(Math.random() * (end - start + 1));
        }

        // 생성된 배열의 모든 원소 값을 출력한다.
        System.out.println("생성된 배열의 모든 원소 값:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        sc.close(); // Scanner 객체 닫기
    }

    public static class ArrayGenerator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();

            // 사용자로부터 배열 크기 N을 입력받기
            // N개의 정수를 저장할 수 있는 1차원 배열을 생성하기
            // N이 0 또는 음수이면 재입력 요구하기
            int n;

            while (true) {
                n = sc.nextInt();
                if (n > 0) {
                    break;
                }

                // 크기 N의 배열 생성
                int[] array = new int[n];

                // 사용자로부터 난수 범위를 지정할 start, end 값을 입력 받기
                // start <= 난수 값 <= end 범위의 난수를 생성하여 배열에 저장
                // 단 (end - start + 1) 값이 배열의 크기 n보다 작을 경우 다시 입력
                int start;
                int end;

                while (true) {
                    start = sc.nextInt();
                    end = sc.nextInt();

                    if ((end - start + 1) >= n) {
                        break;
                    }

                }
                // 베열에 start와 end 범위 내에서 난수를 생성하여 저장하기
                for (int i = 0; i < array.length; i++) {
                    array[i] = start + rand.nextInt(end - start + 1);

                }
                // 생성된 배열의 모든 원소 값을 출력한다.
                System.out.println("생성된 배열의 모든 원소 값: ");
                for (int value : array) {
                    System.out.println(value + " ");
                }
            }

        }
    }
}
