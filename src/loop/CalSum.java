package loop;

public class CalSum {
    public static void main(String[] args) {

        int i = 1; // i는 1부터 시작
        int sum = 0;

        // i가 10 이하이면 i의 값을 sum에 더한다
        while (i <= 10) {
            sum = sum + i;
            i ++;
        }
        System.out.println("합계 = " + sum);

    }
}
