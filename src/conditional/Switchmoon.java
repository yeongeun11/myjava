package conditional;

import java.util.Scanner;

public class Switchmoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 키보드로부터 정수를 입력
        int input = 2;

        String selectedLang = switch (input) {
            case 1 -> "python";
            case 2 -> "java";
            case 3 -> "C++";
            case 4 -> "javaScript";
            default -> "잘못된 입력입니다.";
        };

        // 선택된 언어 출력
        System.out.println(selectedLang);

        sc.close();
    }
}
