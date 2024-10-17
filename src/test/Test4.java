package test;

public class Test4 {
    public static void main(String[] args) {

        int bar = 0b0100010100000010011000;
        int mask = 0x00ff0000;

        // Get: 특정 자리의 비트 값 읽기
        //      - 파트 자리 수

        int bitPosition = 30; // bit 범위는 31 - 0
        int mask1 = 0b01000000000000000000000000000000;

        boolean result = (bar & mask1) != 0;

        // Set: 특정 자리에 비트 값 쓰기
        //      - 비트 자리 수, 값
        int foo = 0b01001010111000100000000010111011;
        int setPosition = 31;
        boolean value = true;

        int mask3 = 1 << 31;
        // 0b00000000000000000000000000001;
        // 1 << 31
        // 0b10000000000000000000000000000;

        int result1 = foo | mask3;
        // 1100 1010 1110 0010 0000 0000 1011 1011









    }
}

