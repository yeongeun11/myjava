package datatype;// 반지름이 5.0인 원의 면적을 계산하는 프로그램

public class AreaTest {
    public static void main(String[] args) {
        double radius, area;
        radius = 5.0;
        area = 3.141592 * radius * radius;
        System.out.println("원의 면적은 " + area);
    }
}
