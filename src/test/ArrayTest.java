package test;

public class ArrayTest {
    static int[] createIntArray(int argSize){
        return new int[argSize];
    }

    public static void main(String[] args) {

        int[] bar = createIntArray(10);
        int[] foo = createIntArray(5);
    }
}
