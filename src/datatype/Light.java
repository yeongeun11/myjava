package datatype;/* 하나의 예로 빛이 1년 동안 진행하는 거리를 계산
   long형의 정수 변수를 사용
 */


public class Light {
    public static void main(String[] args) {
        long lightspeed;
        long distance;

        lightspeed = 300000;
        distance = lightspeed * 365L * 24 * 60 * 60;

        System.out.println("빛이 1년 동안 가는 거리 : " + distance +
                                                   " km.");
    }
}
