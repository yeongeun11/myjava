package loop;

public class Test2 {
    public static void main(String[] args) {

        int bar[] = new int[5];

        // 5, 4, 3, 2, 1
        for(int index = 0, value = 5 ; index < bar.length ; index++, value--) {
            bar[index] = value;

        }

        for(int value : bar){
            System.out.println(value);
        }

        for(int index = 0; index < bar.length; index++) {
            System.out.println(bar[index]);
        }
    }
}
