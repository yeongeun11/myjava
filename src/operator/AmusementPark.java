package operator;

public class AmusementPark {
    public static void main(String[] args) {
        // 예제: 놀이공원 탑승 제한 검사
        // 조건: 나이가 8세 이상 15세 이하인 경우 놀이기구 탑승 가능.
        // 연령 제한이 있으므로 특정 범위에 속하는지 확인함.

        int age = 12;

        // 나이가 8세 이상이고, 15세 이하일 경우 탑승 가능
        boolean canRide = (age >= 8) && (age <= 15);

        System.out.println("Can ride the amusement park ride: " + canRide);
        // 출력: Can ride the amusement park ride: true

        // 여기서는 &&(AND) 연산자를 사용하여 나이가 8세 이상이고, 15세 이하일 때만 놀이기구에 탑승 가능하게 설정함.
        // 두 조건이 모두 만족해야 하므로 AND 연산자가 적합함.

        /*
        Java에서는 연쇄 비교 연산을 지원하지 않음
        • 예: 3 < bar < 5와 같은 연쇄 비교는 사용할 수 없음
        • 따라서 범위를 검사할 때는 논리 연산자 (&&, ||)를 사용해 각각의 조건을 결합해야 함
         */
    }
}
