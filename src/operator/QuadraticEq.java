package operator;

/*
2차 방정식의 근을 계산하는 코드
이 코드는 b*x + c = 0 형태의 2차 방정식에서 근을 구합니다.
 */

public class QuadraticEq {
    public static void main(String[] args) {
        // b는 1차 항의 계수, c는 상수항
        double b = -3.0;  // 1차 항의 계수
        double c = 2.0;   // 상수항

        // 판별식 계산 (b^2 - 4ac)
        double disc = b * b - 4.0 * c;
        // 판별식의 제곱근을 계산
        double sqr = Math.sqrt(disc);

        // 첫 번째 근 계산 (-b + sqrt(disc)) / 2a (a는 여기서 1로 가정)
        double r1 = (-b + sqr) / 2.0;
        // 두 번째 근 계산 (-b - sqrt(disc)) / 2a
        double r2 = (-b - sqr) / 2.0;

        // 결과 출력
        System.out.println("첫 번째 근은: " + r1);
        System.out.println("두 번째 근은: " + r2);
    }
}


