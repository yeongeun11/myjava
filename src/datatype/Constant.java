package datatype;/*
상수 코드
 */

public class Constant {
    public static void main(String[] args) {
        final double KM_PER_MILE = 1.609344; // final을 붙여서 부동소수점형 기호상수를 정의하고 있음
        double km;
        double miles = 60.0;
        km = miles * KM_PER_MILE;

        System.out.println("60마일은 " + km + "킬로미터입니다.");
    }
}
