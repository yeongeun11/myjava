package loop;

import java.util.Scanner;

public class ArrayStudentGrade5 {
    public static void main(String[] args) {

        // 상수로 학생 수와 필드를 정의
        final int NUM_OF_STUDENTS = 3; // 최대 학생 수
        final  int NUM_OF_FIELD = 6; // 학번, 국어, 영어, 수학, 합계, 평균
        // 현재 입력된 학생 수
        int numOfStudents = 0;
        // 프로그램 실행 여부 변수
        boolean isRunning = true;

        // 학생 정보를 저장하는 2차원 배열
        float[][] stdRecordsMatrix = new float[NUM_OF_STUDENTS][NUM_OF_FIELD];

        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 사용자 메뉴 선택
        while (true) {
            System.out.println("메뉴");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 입력된 학생 목록 출력");
            System.out.println("3. 학생 삭제하기");
            System.out.println("4. 종료");
            System.out.print("선택: ");

            int inputValue = sc.nextInt();

            // 잘못된 메뉴 입력 방지
            while (true) {
                if (inputValue >= 1 && inputValue <= 4) {
                    break;
                }
                System.out.println("1 ~ 4 사이의 값을 입력하세요.");
            }

            // 스위치문으로 메뉴 선택에 따른 작업 처리
            switch (inputValue) {
                case 1:
                    System.out.print("학번을 입력하세요: ");
                    stdRecordsMatrix[numOfStudents][0] = sc.nextFloat();

                    System.out.print("국어 성적: ");
                    stdRecordsMatrix[numOfStudents][1] = sc.nextFloat();

                    System.out.print("영어 성적: ");
                    stdRecordsMatrix[numOfStudents][2] = sc.nextFloat();

                    System.out.print("수학 성적: ");
                    stdRecordsMatrix[numOfStudents][3] = sc.nextFloat();

                    // 총점
                    stdRecordsMatrix[numOfStudents][4] = stdRecordsMatrix[numOfStudents][1] +  stdRecordsMatrix[numOfStudents][2] +  stdRecordsMatrix[numOfStudents][3];
                    // 평균
                    stdRecordsMatrix[numOfStudents][5] = stdRecordsMatrix[numOfStudents][4] / 3.0f;
                    // 입력된 학생 수 증가
                    numOfStudents++;
                    break;
                case 2:
                    for (int i = 0; i < stdRecordsMatrix.length; i++) {
                        System.out.printf("[학번 : %.0f] 국어: %.1f, 영어: %.1f, 수학: %.1f, 합계: %.1f, 평균: %.2f\n");
                        for (int j = 0; j < stdRecordsMatrix[i].length; j++) {
                            System.out.print(stdRecordsMatrix[i][j] + "\t");
                        }
                        System.out.println();
                    }

                case 3:
                break;
                case 4:
                    // 프로그램 종료
                    System.out.println("프로그램을 종료합니다. ");
                    isRunning = false;
                    break;
            }
        }
    }
}
