package test;

public class Test2 {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = "Hello";

        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));
    }
}
