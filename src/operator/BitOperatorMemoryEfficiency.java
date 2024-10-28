package operator;

public class BitOperatorMemoryEfficiency {
    public static void main(String[] args) {
        // 8가지 플래그(읽기, 쓰기, 실행 등)를 각각 1비트로 저장
        // 1바이트(8비트) 안에 모든 플래그를 저장 가능.

        byte READ = 1;                // 00000001
        byte WRITE = 0b00000010;      // 2, 이진수 표기 사용 예
        byte EXECUTE = 4;             // 00000100
        byte DELETE = 0b00001000;     // 8, 이진수 표기 사용 예

        // 읽기, 쓰기, 실행 권한 설정 (00000111)
        byte permissions = (byte) (READ | WRITE | EXECUTE);

        // 권한이 있는지 확인 (읽기 권한 확인)
        boolean canRead = (permissions & READ) != 0;
        System.out.println("Can Read: " + canRead);  // 출력: true

        // 쓰기 권한이 있는지 확인
        boolean canWrite = (permissions & WRITE) != 0;
        System.out.println("Can Write: " + canWrite);  // 출력: true

        // 실행 권한이 있는지 확인
        boolean canExecute = (permissions & EXECUTE) != 0;
        System.out.println("Can Execute: " + canExecute);  // 출력: true

        // 삭제 권한이 있는지 확인
        boolean canDelete = (permissions & DELETE) != 0;
        System.out.println("Can Delete: " + canDelete);  // 출력: false
    }
}
