package string;
// 원의 면적 계산하기

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        double radius;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.print("반지를을 입력하시오: ");

        radius = input.nextDouble();
        area = 3.14 * radius * radius;

        System.out.println(area);


    }
}
