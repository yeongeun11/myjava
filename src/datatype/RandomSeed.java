package datatype;

import java.util.Random;

public class RandomSeed {
    public static void main(String[] args) {

        // Random 객체 생성 ( 시드 미설정 시)
        Random random = new Random();

        // 1. 시스 값 설정하여 Random 객체 생성 (예: 42)
        Random seededRandom = new Random(42);

        // 2. 정수 난수 생성(0부터 지정된 상한 미만의 정수)
        int randomInt = random.nextInt(10); // 0 ~ 9 사이의 정수
        System.out.println("0부터 9까지의 난수 (정수): " + randomInt);

        // 3. 시드를 사용하여 동일한 난수 생성 확인
        int seededInt1 = seededRandom.nextInt(10); // 시드가 동일한 경우 항상 같은 값 생성
        int seededInt2 = seededRandom.nextInt(10);
        System.out.println("시드 사용 정수 1: " + seededInt1);
        System.out.println("시드 사용 정수 2: " + seededInt2);

        // 4. 실수 난수 생성(0.0 이상 1.0 미만)
        double randomDouble = seededRandom.nextDouble();
        System.out.println("0.0 이상 1.0 미만 (실수): " + randomDouble);

        // 5. 지정된 범위의 실수 난수 생성(예: 0.0 ~ 5.0)
        double rangeDouble = seededRandom.nextDouble() * 5; // 0.0부터 5.0 미만의 실수
        System.out.println("0.0부터 5.0 미만의 난수 (실수): " + rangeDouble);

        // 6. boolean 값 랜덤 생성
        boolean randomBoolean = seededRandom.nextBoolean();
        System.out.println("랜덤 불리언 값: " + randomBoolean);
    }
}
