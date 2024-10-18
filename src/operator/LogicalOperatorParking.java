package operator;

public class LogicalOperatorParking {
    public static void main(String[] args) {
        // 예제: 주차 가능 여부
        // 조건: 주차장은 비어 있거나, 내가 가지고 있는 차량이 전기차여야 주차 가능
        // 주차장이 꽉 차 있더라도, 전기차는 주차 가능.

        boolean isParkingFull = false; // 주차장이 비어 있음
        boolean hasElectricCar = false; // 내 차는 전기차 아님

        // 주차장이 비어있거나, 전기차일 경우 주차 가능
        boolean canPark = !isParkingFull || !hasElectricCar;

        System.out.println("Can park: " + canPark);
        // 출력: Can park: true

        // 여기서는 주차장이 비어 있으면 주차 가능하고, 주차장이 꽉 차 있더라도 전기차라면
        // 주차 가능하게 OR 연산자를 사용하여 두 조건 중 하나만 만족해도 주차 가능함.
    }
}
