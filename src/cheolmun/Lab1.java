// 사용자의 나이를 입력 받아,
// 해당 사용자에게 적합한 도서관 이용권을 판별하는 프로그램을 작성하세요.
package cheolmun;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.print("시용자의 나이를 입력해주세요: ");
        age = sc.nextInt();

        if (age < 12) {
            System.out.print("어린이 이용권을 사용할 수 있습니다.");
        } else if (age < 18) {
            System.out.print("청소년 이용권을 사용할 수 있습니다.");
        } else
            System.out.print("성인 이용권을 사용할 수 있습니다.");

    }
}
