package lab;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자에게 나이를 입력받고, 이를 int형 변수에 저장
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        // 사용자에게 몸무게를 입력받고, 이를 double형 변수에 저장
        System.out.print("몸무게를 입력하세요: ");
        double weight = sc.nextDouble();

        // 나이를 double로 명시적 형변환하여 몸무게와 더한 결과를 출력
        double ageTypeConversionDouble = (double) age;
        double result1 = ageTypeConversionDouble + weight;
        System.out.printf("나이를 double로 변환한 후 몸무게와 더한 결과: %.1f\n", result1);

        // 몸무게를 int로 명시적 형변환하여 나이와 더한 결과를 출력
        int weightTypeConversionInt = (int) weight;
        int result2 = weightTypeConversionInt + age;
        System.out.printf("몸무게를 int로 변환한 후 나이와 더한 결과: %d\n", result2); // %d\n -> 정수형(int) 값을 출력하기 위한 형식

        // 스캐너 닫기
        sc.close();






    }
}
