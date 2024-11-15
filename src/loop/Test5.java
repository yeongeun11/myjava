package loop;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 재입력 처리 -> while 문 사용
        while (true) {
            // 메뉴 출력
            System.out.println("======================");
            System.out.println("메뉴를 선택하세요");
            System.out.println("1. M X N Matrix를 출력");
            System.out.println("2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력");
            System.out.println("3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력");
            System.out.println("4. 종료");
            System.out.println("======================");

            // 메뉴를 선택하세요
            System.out.print("메뉴를 선택하세요: ");
            int userInput = scan.nextInt();

            // 입력값 검증
            while (true) {
                // 만약 입력값이 1보다 크거나 같고 4보다 작거나 같을 경우 -> break
                if (userInput >= 1 && userInput <= 4) {
                    break;
                }
                // 잘못된 입력값일 경우 (메뉴 출력 x) -> 재입력 요청
                System.out.println("1 ~ 4 사이의 정수를 입력하세요!!");
                userInput = scan.nextInt();
            }


            // 1번 입력시 : M X N Matrix를 출력
            if (userInput == 1) {

                int row = 0;
                int col = 0;

                while (true) {
                    System.out.print("M값을 입력하세요: ");
                    row = scan.nextInt();
                    System.out.print("N값을 입력하세요: ");
                    col = scan.nextInt();

                    if (row > 0 && col > 0) {
                        break;
                    }
                    System.out.println("잘못된 입력값입니다. 양의 정수를 입력하세요!!");
                }

                for (int i = 0 ; i < row ; i++) {
                    for (int j = 0 ; j < col ; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
            // 2번 입력시 : 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력

            else if (userInput == 2) {

                int row = 0;
                int col = 0;

                while (true) {
                    System.out.print("M값을 입력하세요: ");
                    row = scan.nextInt();
                    System.out.print("N값을 입력하세요: ");
                    col = scan.nextInt();

                    if (row > 0 && col > 0) {
                        break;
                    }
                    System.out.println("잘못된 입력값입니다. 양의 정수를 입력하세요!!");
                }

                for (int i = 0 ; i < row ; i++) {
                    for (int j = 0 ; j < col ; j++) {
                        if (i == j) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
            }
            // 3번 입력시 : 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력
            else if (userInput == 3) {

                int row = 0;
                int col = 0;

                while (true) {
                    System.out.print("M값을 입력하세요: ");
                    row = scan.nextInt();
                    System.out.print("N값을 입력하세요: ");
                    col = scan.nextInt();

                    if (row > 0 && col > 0) {
                        break;
                    }
                    System.out.println("잘못된 입력값입니다. 양의 정수를 입력하세요!!");
                }

                for (int i = 0 ; i < row ; i++) {
                    for (int j = 0 ; j < col ; j++) {
                        if (i == j || j == (col-1)-i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
            }
            // 4번 입력시 : 종료
            else if (userInput == 4) {
                System.out.println("프로그램 종료");
                break;
            }

        }


        // 메뉴를 선택하세요
        // 1번째 실행 // 게임 실행 횟수  출력
        // 1. M X N Matrix를 출력
        // 2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력
        // 3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력
        // 4. 종료

        // 메뉴를 입력 받아 해당 프로그램 실행 후 다시 메뉴 출력
        // 1 ~ 4 이외 값 입력 시 에러메시지 출력 후 재입력 : 메뉴 출력 X
        // - 번호 입력만 새롭게 받기

        // 1번 : 사용자로부터 M, N 정수를 입력 받아, M X N Matrix를 출력하세요
        // 예) M : 3, N : 2
        //   * *
        //   * *
        //   * *
        //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력

        // 2번: 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력
        // 예) M : 3, N : 3
        //     * *
        //   *   *
        //   * *
        //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력


        // 3번: 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력
        // 예) M : 3, N : 3
        //     *
        //   *   *
        //     *
        //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력
    }

}

