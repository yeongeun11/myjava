package lab.lab2;

class BitSet {
    int state = 0;

    // 비트 설정 메서드
    void setBit(int position, boolean value) {
        if (value) {
            state |= (1 << position); // OR 연산을 통해 위치 비트를 1로 설정
        } else {
            state &= ~(1 << position); //  AND 연산과 비트 반전을 사용해 0응로 설정
        }
    }

    // 비트 조회 메서드
    boolean getBit(int position) {
        // AND 연산을 사용해 지정한 위치의 비트가 1인지 확인
        return (state & (1 << position)) != 0; // 비트기 true면 1, false면 0을 반환
    }
}
public class OperatorLab1{
    public static void main(String[] args) {
        // BitSet 객체 생성
        BitSet bitSet = new BitSet();
        bitSet.setBit(5, true);
        System.out.println(bitSet.getBit(5));
        System.out.println(bitSet.getBit(3));

    }
}


