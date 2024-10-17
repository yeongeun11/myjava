package operator;/*
윤년을 검사하는 프로그램
 */

public class LeapYear {
    public static void main(String[] args) {

        int year = 2012;
        boolean isLeapYear;

        isLeapYear = (year % 4 == 0);
        System.out.println(isLeapYear);
    }
}

