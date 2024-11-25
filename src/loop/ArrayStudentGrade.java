package loop;

import java.util.Scanner;

public class ArrayStudentGrade {
    public static void main(String[] args) {

        final int NUM_OF_STUDENTS = 3;
        final int   NUM_OF_FIELDS = 6;

        float[][] stdRecordMatrix = new float[NUM_OF_STUDENTS][NUM_OF_FIELDS];

        // 입력
        Scanner scan = new Scanner(System.in);

        System.out.println("첫 번째 학생 입력 : ");

        // 학번
        stdRecordMatrix[0][0] = scan.nextFloat();
        // 국어
        stdRecordMatrix[0][1] = scan.nextFloat();
        // 영어
        stdRecordMatrix[0][2] = scan.nextFloat();
        // 수학
        stdRecordMatrix[0][3] = scan.nextFloat();
        // 합계
        stdRecordMatrix[0][4] = stdRecordMatrix[0][1] + stdRecordMatrix[0][2] + stdRecordMatrix[0][3];
        // 평균
        stdRecordMatrix[0][5] = stdRecordMatrix[0][4] / 3.0f;

        System.out.println("두 번째 학생 입력 : ");

        // 학번
        stdRecordMatrix[1][0] = scan.nextFloat();
        // 국어
        stdRecordMatrix[1][1] = scan.nextFloat();
        // 영어
        stdRecordMatrix[1][2] = scan.nextFloat();
        // 수학
        stdRecordMatrix[1][3] = scan.nextFloat();
        // 합계
        stdRecordMatrix[1][4] = stdRecordMatrix[1][1] + stdRecordMatrix[1][2] + stdRecordMatrix[1][3];
        // 평균
        stdRecordMatrix[1][5] = stdRecordMatrix[1][4] / 3.0f;

        for(int i = 0; i < stdRecordMatrix.length; i++) {
            for(int j = 0; j < stdRecordMatrix[i].length; j++) {

            }
        }
//        for(int )

    }

}
