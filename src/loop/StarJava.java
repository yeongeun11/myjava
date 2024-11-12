package loop;

import java.util.Scanner;

public class StarJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        int n = 0;

        while (true) {
            m = sc.nextInt();
            n = sc.nextInt();

            // 만약 m과 n이 0 또는 음의 정수인 경우 재입력
            if (m > 0 && n > 0) {
                break;
            }else {
                System.out.println("재입력");
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
}
