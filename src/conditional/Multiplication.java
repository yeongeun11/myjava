package conditional;

public class Multiplication {
    public static void main(String[] args) {

        // 사용자로부터 정수를 입력
        int inputValue = 1;

        // if series
        // 1 이면 구구단 출력
        if (inputValue == 1) {
            for(int dan = 2 ; dan <= 9 ; dan++) {
                for(int num = 1 ; num <= 9 ; num++) {
                    System.out.print(dan + "*" + num + " ");
                }
                System.out.println();
            }
        } else if (inputValue == 2) {
            for (char startChar = 'A'; startChar <= 'Z'; startChar++) {}

        } else if (inputValue == 3) {

        }
        // 2 이면 a ~ z 출력
        // 3 이면 8 X 32 "*" 출력
    }
}
