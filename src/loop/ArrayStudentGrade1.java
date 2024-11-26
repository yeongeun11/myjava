package loop;

import java.util.Scanner;

public class ArrayStudentGrade1 {
    public static void main(String[] args) {

        final int NUM_OF_STUDENTS = 3;
        final int NUM_OF_FIELDS = 6;
        int numOfStudents = 0;
        boolean isRunning = true;

        float[][] stdRecordsMatrix = new float[NUM_OF_STUDENTS][NUM_OF_FIELDS];

        // 입력
        Scanner scan = new Scanner(System.in);

        while (isRunning) {
            System.out.println("메뉴");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 입력된 학생 목록 출력");
            System.out.println("3. 학생 삭제하기");
            System.out.println("4. 종료");
            System.out.print("선택: ");

            int inputValue = scan.nextInt();

            while (true) {
                if (inputValue >= 1 && inputValue <= 4) {
                    break;
                }

                System.out.println("1~4 사이 값을 입력하세요");
            }

            switch (inputValue) {
                case 1:
                    System.out.print("학번을 입력하세요: ");
                    stdRecordsMatrix[numOfStudents][0] = scan.nextFloat();

                    System.out.print("국어 성적: ");
                    stdRecordsMatrix[numOfStudents][1] = scan.nextFloat();

                    System.out.print("영어 성적: ");
                    stdRecordsMatrix[numOfStudents][2] = scan.nextFloat();

                    System.out.print("수학 성적: ");
                    stdRecordsMatrix[numOfStudents][3] = scan.nextFloat();

                    stdRecordsMatrix[numOfStudents][4] = stdRecordsMatrix[numOfStudents][1] + stdRecordsMatrix[numOfStudents][2] + stdRecordsMatrix[numOfStudents][3] ;

                    stdRecordsMatrix[numOfStudents][5] = stdRecordsMatrix[numOfStudents][4] / 3.0f;

                    numOfStudents++;
                    break;
                case 2:
                    for (int i = 0; i < numOfStudents; i++) {
                        for (int j = 0 ; j < stdRecordsMatrix[i].length; j++) {
                            System.out.print(stdRecordsMatrix[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    isRunning = false;
                    break;
            }
        }
    }
}
//
//        System.out.println("첫 번째 학생 입력: ");
//
//        // 학번
//        stdRecordsMatrix[0][0] = scan.nextFloat();
//        // 국어
//        stdRecordsMatrix[0][1] = scan.nextFloat();
//        // 영어
//        stdRecordsMatrix[0][2] = scan.nextFloat();
//        // 수학
//        stdRecordsMatrix[0][3] = scan.nextFloat();
//        // 합계
//        stdRecordsMatrix[0][4] = stdRecordsMatrix[0][1] + stdRecordsMatrix[0][2] + stdRecordsMatrix[0][3];
//        // 평균
//        stdRecordsMatrix[0][5] = stdRecordsMatrix[4][0] /3.0f;
//
//        System.out.println("두 번째 학생 입력: ");
//
//        // 학번
//        stdRecordsMatrix[1][0] = scan.nextFloat();
//        // 국어
//        stdRecordsMatrix[1][1] = scan.nextFloat();
//        // 영어
//        stdRecordsMatrix[1][2] = scan.nextFloat();
//        // 수학
//        stdRecordsMatrix[1][3] = scan.nextFloat();
//        // 합계
//        stdRecordsMatrix[1][4] = stdRecordsMatrix[1][1] + stdRecordsMatrix[1][2] + stdRecordsMatrix[1][3];
//        // 평균
//        stdRecordsMatrix[1][5] = stdRecordsMatrix[4][0] /3.0f;
//
//        for(int i = 0; i < stdRecordsMatrix.length; i++) {
//            for(int j = 0; j < stdRecordsMatrix[i].length; j++) {
//
//            }

