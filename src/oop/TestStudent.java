package oop;

import java.util.Scanner;

// 테스트용 빈 클래스 (지금은 아무 역할X, 구조 유지용)
class Foo2 {}

// 학생 정보를 저장하고 관리하는 클래스
class Student1 {
    int id;
    String name;

    // 성적 관련 변수들 (외부에서 직접 접근하지 못하도록 private로 선언 = 캡슐화)
    private int scoreKorean;
    private int scoreEnglish;
    private int scoreMath;
    private int sum;
    private int avg;

    // 생성자: Student1 객체를 만들 때 ID와 이름을 받아서 초기화함
    Student1(int argId, String argName) {
        id = argId;
        name = argName;
    }

    // 점수를 설정하는 메서드 (0~100 범위만 허용)
    boolean setScore(int argKorean, int argEnglish, int argMath) {
        // 점수가 0 미만 또는 100 초과면 false 반환 (입력 실패)
        if (argKorean < 0 || argEnglish < 0 || argMath < 0) return false;
        if (argKorean > 100 || argEnglish > 100 || argMath > 100) return false;

        // 점수를 멤버 변수에 저장
        scoreKorean = argKorean;
        scoreEnglish = argEnglish;
        scoreMath = argMath;

        return true;  // 성공적으로 입력되었음을 의미
    }

    // 국어 점수를 외부에서 조회할 수 있는 메서드
    int getScoreKorean() {
        return scoreKorean;
    }

    // 영어 점수 조회
    int getScoreEnglish() {
        return scoreEnglish;
    }

    // 수학 점수 조회
    int getScoreMath() {
        return scoreMath;
    }

    // 총합을 계산하고 반환하는 메서드
    int getSum() {
        sum = scoreKorean + scoreEnglish + scoreMath;
        return sum;
    }

    // 평균을 계싼하고 반환하는 메서드
    int getAvg() {
        avg = getSum() / 3;
        return avg;
    }
}

// 여러 명의 학생 정보를 관리하는 클래스
class StdScoreMgr2 {
    Student1[] stdList;  //  Student1 객체를 배열에 저장
    // 학생 객체들을 담는 배열
    int numOfStudents;  // 전체 학생 수

    // 생성자: 학생 수를 받아 배열을 초기화
    StdScoreMgr2(int argOfStudents) {
        numOfStudents = argOfStudents;       //  순서 수정됨 (먼저 초기화)
        stdList = new Student1[numOfStudents];
    }

    // 학생 정보를 입력 받는 메서드
    void addStudent() {
        Scanner sc = new Scanner(System.in); // 키보드 입력을 받기 위한 Scanner 생성

        // 학생 수만큼 반복
        for(int i = 0; i < numOfStudents; i++) {
            System.out.println("[" + (i +1) + "번째 학생 정보 입력]");

            // ID와 이름 입력 받기
            System.out.print("ID 입력: ");
            int stdId = sc.nextInt();

            System.out.print("이름 입력: ");
            String stdName = sc.next();

            // Student1 객체 생성
            Student1 student1 = new Student1(stdId, stdName);

            // 올바른 점수가 입력될 때까지 무한 반복
            while (true) {
                System.out.print("국어 성적 입력: ");
                int scoreKorean = sc.nextInt();

                System.out.print("영어 성적 입력: ");
                int scoreEnglish = sc.nextInt();

                System.out.print("수학 성적 입력: ");
                int scoreMath = sc.nextInt();


                if (student1.setScore(scoreKorean, scoreEnglish, scoreMath)) {
                    stdList[i] = student1;  // ✅ 배열에 저장 제대로!
                    break;
                } else {
                    System.out.println("⚠ 성적은 0~100 사이만 가능합니다. 다시 입력해주세요.");
                }
            }
        }
    }

    // 모든 학생의 성적을 출력하는 메서드
    void printAllStudents() {
        System.out.println("\n ===== 학생 성적표 =====");

        //  저장된 학생 수만큼 반복
        for(Student1 s : stdList) {
            if (s != null) {
                // 학생 기본 정보 및 점수 출력
                System.out.println("ID: " + s.id +", 이름: " + s.name);
                System.out.println("국어: " + s.getScoreKorean() +
                        ", 영어: " + s.getScoreEnglish() +
                        ", 수학: " + s.getScoreMath());
                System.out.printf("합계: %d, 평균: %.1f\n", s.getSum(), (float)s.getAvg());
                System.out.println("------------------------------");
            } else {
                // 아직 입력되지 않은 경우
                System.out.println(" 아직 입력되지 않은 학생입니다.");
            }
        }
    }
}

// 프로그램 시작 지점 (main 메서드가 있는 실행 클래스)
public  class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력용 Scanner

        // 사용자에게 학생 수를 입력받음
        System.out.print("입력 학생 수: ");
        int stdNum = sc.nextInt();

        // 학생 수만큼 성적 관리 객체 생성
        StdScoreMgr2 stdMgr = new StdScoreMgr2(stdNum);

        // 메뉴 반복 처리
        while(true) {
            // 메뉴 출력
            System.out.println("\n===== 성적 관리 시스템 =====");
            System.out.println("1. 학생 정보 입력");
            System.out.println("2. 전체 학생 성적 출력");
            System.out.println("3. 종료");
            System.out.println("메뉴를 선택하세요: ");
            int menu = sc.nextInt();

            // 사용자 선택에 따라 기능 수행
            if (menu == 1) {
                stdMgr.addStudent();
            } else if (menu == 2) {
                stdMgr.printAllStudents();
            } else if (menu == 3) {
                // 프로그램 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                // 메뉴 번호가 유효하지 않을 때 경고 메시지 출력
                System.out.println("잘못된 메뉴입니다. 다시 입력해주세요.");
            }
        }

        sc.close(); // Scanner 종료 (자원 정리)
    }
}
