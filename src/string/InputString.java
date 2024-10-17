package string;// 사용자의 이름과 나이 출력하기

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {

        String name;
        int age;

        Scanner input = new Scanner(System.in);

        System.out.print("이름을 입력하시오: ");
        name = input.nextLine();

        System.out.print("나이를 입력하시오: ");
        age = input.nextInt();

        System.out.println(name + "님 안녕하세요! " + (age) + "살이시네요.");

    }
}

