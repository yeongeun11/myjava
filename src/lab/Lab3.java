package lab;

public class Lab3 {
    public static void main(String[] args) {
        // 원주율을 상수로 선언
        final double CIRUMFERENCE = 3.14159;

        // 원의 반지를을 저장하는 double 타입의 변수를 선언, 값을 5.0으로 초기화
        double radius = 5.0;

        // 원의 면적 = 원주율 * 반지름^2
        double area = CIRUMFERENCE * radius * radius;

        // 결과를 소수점 둘째 자리까지 출력
        System.out.printf("원의 면적: %.2f\n", area);
    }
}
