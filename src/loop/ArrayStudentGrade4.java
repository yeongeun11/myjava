package loop;

import java.util.Scanner;

public class ArrayStudentGrade4 {
    public static void main(String[] args) {

        // 상수: 학생 수와 필드 수를 정의
        final int NUM_OF_STUDENTS = 3; // 학생 최대 수
        final int NUM_OF_FIELDS = 6; // 필드: 학번, 국어, 영어, 수학, 총점, 평균
        int numOfStudents = 0; // 현재 입력된 학생 수
        boolean isRunning = true; // 프로그램 실행 여부 제어 변수

        // 학생 정보를 저장하는 2차원 배열
        float[][] stdRecordsMatrix = new float[NUM_OF_STUDENTS][NUM_OF_FIELDS];

        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("메뉴");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 입력된 학생 목록 출력");
            System.out.println("3. 학생 삭제하기");
            System.out.println("4. 종료");
            System.out.print("선택: ");

            int inputValue = scan.nextInt(); // 사용자 메뉴 선택

            // 잘못된 메뉴 입력 방지
            while (true) {
                if (inputValue >= 1 && inputValue <= 4) {
                    break; // 올바른 입력일 경우 반복 종료
                }
                System.out.println("1 ~ 4의 값을 선택하세요");
            }

            // 메뉴 선택에 따른 작업 처리
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

                    stdRecordsMatrix[numOfStudents][4] = stdRecordsMatrix[numOfStudents][1] +  stdRecordsMatrix[numOfStudents][2] +  stdRecordsMatrix[numOfStudents][3];

                    stdRecordsMatrix[numOfStudents][5] = stdRecordsMatrix[numOfStudents][4] / 3.0f;

                    numOfStudents++; // 입력된 학생 수 증가

                    break;
                case 2: // 입력된 학생 목록 출력
                    for (int i = 0; i < numOfStudents; i++) {
                        for (int j = 0 ; j < stdRecordsMatrix[i].length; j++) {
                            System.out.print(stdRecordsMatrix[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    break;
                case 4: // 프로그램 종료
                    System.out.println("프로그램 종료");
                    isRunning = false;
                    break;

            }
        }
    }
}
