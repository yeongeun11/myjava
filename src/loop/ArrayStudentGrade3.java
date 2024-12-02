package loop;

import java.util.Scanner;

public class ArrayStudentGrade3 {
    public static void main(String[] args) {

        // 상수로 학생 수와 필드 수를 정의
        final int NUM_OF_STUDENTS = 3; // 학생 최대 수
        final int NUM_OF_FIELDS = 6; // 학번, 국어, 영어, 수학, 총점, 평균
        // 현재 입력된 학생 수
        int numOfStudents = 0;
        // 프로그램 실행 여부 변수

        // 학생 정보를 저장하는 2차원 배열
        float[][] stdRecordsMatrix = new float[NUM_OF_STUDENTS][NUM_OF_FIELDS];

        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("메뉴");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 입력된 학생 목록 출력");
            System.out.println("3. 학생 삭제하기");
            System.out.println("4. 종료");
            System.out.print("선택: ");

            // 사용자 메뉴 선택
            int inputValue = sc.nextInt();

            // 잘못된 메뉴 입력 방지
            while (true) {
                if(inputValue >= 1 && inputValue <= 4) {
                    break; // 올바른 입력일 경우 break
                }
                System.out.println("1 ~ 4의 값을 선택하세요");
            }

            // 스위치문으로 메뉴 선택에 따른 작업 처리
            switch (inputValue) {
                case 1:
                    System.out.println("학번을 입력하세");
                break;
                case 2:
                break;
                case 3:
                break;
                case 4:

            }

            // 입력된 학생 수 증가

            // 입력된 학생 목록 출력

            // 프로그램 종료
        }
    }
}
