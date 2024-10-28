package operator;

public class BitOperatorExam {
    public static void main(String[] args) {
        int a= 6; // 0110 in binary
        int b= 3; // 0011 in binary

        // 1. 비트 AND 연산 ( 둘 다 1인 경우에만 1)
        int resultAnd = a | b; // 0110 & 0011 = 0010 (2)
        System.out.println("a & b = " + resultAnd); // 출력: 2

        // 2. 비트 OR 연산(둘 중 하나라도 1인 경우에 1)
        int resultOr = a | b; // 0110 | 0011 = 0111 (7)
        System.out.println("a | b = " + resultOr); // 출력: 7

        // 3 비트 XOR 연산 (둘이 다르면 1, 같으면 0)
        int resultXor = a ^ b; // 0110 ^ 0011 = 0101 (5)
        System.out.println("a ^ b = " + resultXor); // 출력: 5

        // 4. 비트 NOT 연산 ( 각 비트를 반전, 0을 1로, 1을 0으로)
        int resultNot = ~a;     // ~0110 = 1001 (2's complement에서 -7)
        System.out.println("~a = " + resultNot); // 출력: -7

        // 5. 비트 왼쪽 시프트(왼쪽으로 비트 이동, 값이 2배로 증가)
        int resultLeftShift = a << 1; // 0110 << 1 = 1100 (12)
        System.out.println("a << 1 = " + resultLeftShift); // 출력: 12

        // 6. 비트 오른쪽 시프트 (오른쪽으로 비트 이동, 값이 2로 나눠짐)
        int resultRightShift = a >> 1; // 0110 >> 1 = 0011 (3)
        System.out.println("a >> 1 = " + resultRightShift); // 출력: 3
    }
}
