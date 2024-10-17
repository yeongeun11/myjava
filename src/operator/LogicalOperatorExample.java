package operator;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        /*
        예제: 영화관 입장 조건
            - 조건: 18세 이상이고, 티켓이 있어야 입장 가능
            - 두 조건 모두 만족해야 입장할 수 있음.
        */
        int age = 20;
        boolean Ticker = true;

        // 나이가 18세 이상이고, 티켓을 가지고 있어야 입장 가능
        boolean canEnter = (age >= 18) && Ticker;

        System.out.println("Can enter the movie theater: " + canEnter);
        // 출력:
    }
}

