package cheolmun;

import java.util.Scanner;

public class Lab1_2t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("삼각형 세 변의 값을 입력하세요");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        // 삼각형 만들 수 있어?
        if (input1 + input2 <= input3 || input1 + input3 <= input2 ||
                input2 + input3 <= input1) {
            System.out.println("삼각형을 만들 수 없습니다");
            return;
        }

        String triangleType = "";
        // 정삼각형
        if (input1 == input2 && input2 == input3) {
            triangleType = "정삼각형";
        } else if (input1 == input2 || input1 == input3 ||
                input2 == input3) {
            // 이등변 삼각형
            triangleType = "이등변 삼각형";
        } else {
            // 부등변 삼각형
            triangleType = "부등변 삼각형";
        }

        System.out.println("삼각형 종류: " + triangleType);
    }
}
