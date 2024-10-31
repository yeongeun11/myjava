//만약 세 변의 길이가 모두 같다면, '정삼각형'입니다.
//② 만약 세 변 중 두 변의 길이가 같다면, '이등변삼각형'입니다.
//③ 만약 세 변의 길이가 모두 다르다면, '부등변삼각형'입니다.
//④ 만약 어느 두 변의 길이 합이 나머지 한 변의 길이보다 작거나 같다면, 삼각형을 형성할 수 없습니다


package cheolmun;

import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input1 = 1;
        int input2 = 1;
        int input3 = 100;

        String triangle;

        //삼각형을 형성할 수 없습니다.
        if (input1 + input2 <= input3 || input1 + input3 <= input2 || input2 + input3 <= input1) {
            triangle = "입력하신 변의 길이로는 삼각형을 만들 수 없습니다.\n";
            triangle += "삼각형을 만들기 위해서는 어떤 두 변의 길이의 합이 다른 한 변의 길이보다 커야 합니다.";
        } else if (input1 == input2 && input2 == input3) {
            triangle = "입력하신 변의 길이로는 정삼각형을 만들 수 있습니다.";
        } else if (input1 == input2 || input1 == input3 || input2 == input3) {
            triangle = "입력하신 변의 길이로는 이등변심각형을 만들 수 있습니다.";
        } else
            triangle = "입력하신 변의 길이로는 부등변삼각형을 만들 수 있습니다.";


        System.out.println(triangle);

    }
}
