package test;

public class Test10 {
    static int[] sumArg(int arg_A, int arg_B) {
        int sum = arg_A + arg_B;
        int avg = sum / 2;

        int[] array = {sum, avg};
        return array;
    }

    public static void main(String[] args) {
        int[] result = sumArg(5, 7);
        System.out.println(result[1]);
    }
}
