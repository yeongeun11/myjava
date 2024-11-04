package loop;

public class Test4 {
    public static void main(String[] args) {

        // Math.random() -> 0.0 <= rand value < 1.0
        // 0.0 <= rand value < 1.0

        // 1 ~ 10 사이의 정수 중 난수값 5개를 출력하라.

        // 랜덤 함수
        for(int i = 0 ; i < 10; i++) {
            int randValue = (int) (Math.random() * 10) - 1;
            // 11 * 0.0 <= rand value < 1.0 * 11
            // 0.0 <= rand value < 11.0

            // 0.0 <= rand value < 11.0
            // 0.0 <= rand value < 10.0 ->

            System.out.println(randValue);
        }
    }
}
