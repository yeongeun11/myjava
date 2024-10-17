package operator;

public class Test3 {
    public static void main(String[] args) {

        int foo = 1;
        int bar = -1;

        int temp1 = foo - bar;
        int temp2 = foo + (-bar);

        System.out.println( Integer.toBinaryString(foo));
        System.out.println( Integer.toBinaryString(bar));
    }
}

