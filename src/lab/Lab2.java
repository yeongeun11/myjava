package lab;

public class Lab2 {
    public static void main(String[] args) {
        // byte는 -128부터 127까지 저장 가능
        byte maxValue = 127;
        byte minValue = -128;

        // 산술 연산자인 ++은 1 증가하기 때문에 최대값에서 1을 더하면 오버플로우 발생
        maxValue++;
        // 산술 연산자인 --은 1 감소하기 때문에 최소값에서 1을 빼면 언더플로우 발생
        minValue--;

        // 오버플로우된 값 출력 (127에서 더한 값): -128
        System.out.println("오버플로우된 값: " + maxValue);

        // 언더플로우된 값 출력 (-128에서 1 뺀 값): 127
        System.out.println("언더플로우된 값: " + minValue);
    }
}
