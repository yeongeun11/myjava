package string;

/*
+ 연산자로 문자열을 결합하여서 화면에 제도용 자를 출력해보기
 */

public class DrawingRuler {
    public static void main(String[] args) {
        String s1 = " .........";
        String s2 = s1 + "|" + s1;
        String s3 = s2 + "|" + s2;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}