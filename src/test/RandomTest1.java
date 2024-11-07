package test;

import java.util.Random;

public class RandomTest1 {
    public static void main(String[] args) {

        Random random1 = new Random(12345); // 시드가 12345로 설정된 경우
        Random random2 = new Random(12345); // 같은 시드를 사용

        System.out.println("random1: " + random1.nextInt());
        System.out.println("random2: " + random2.nextInt());
    }
}
