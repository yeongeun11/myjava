package oop;

import java.util.Scanner;

class Foo {}
// 변수
// 1) 멤버변수
//    A. 인스턴스 멤버 변수
//    B. 클래스 멤버 변수
// 2) 지역변수 -> 메서드 내 선언된 변수

class student {
    // ID, 이름, 국어, 영어, 수학, 합계점수, 평균
    int id;
    String name;
    private int scoreKorean;
    private int scoreEnglish;
    private int scoreMath;
    private int sum;
    private float avg;

    student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    boolean setScore(int korean, int english, int math) {
        if(korean < 0 || english < 0 || math < 0) return false;
        if(korean > 100 || english > 100 || math > 100) return false;

        scoreKorean = korean;
        scoreEnglish = english;
        scoreMath = math;
        return true;
    }

    int getScoreKorean() {
        return scoreKorean;
    }

    int getScoreEnglish() {
        return scoreEnglish;
    }

    int getScoreMath() {
        return scoreMath;
    }

    int getsum() {
        sum = scoreKorean + scoreEnglish + scoreMath;
        return sum;
    }

    float getavg() {
        avg = (float)getsum() / 3;
        return avg;
    }
}

public class OopBar2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("입력 학생 수 : ");
        int numOfStudents = sc.nextInt();
        student[] students = new student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("[" + (i + 1) + "번째 학생 정보 입력]");

            System.out.print("ID 입력 : ");
            int id = sc.nextInt();

            System.out.print("이름 입력 : ");
            String name = sc.next();

            student s = new student(id, name);

            while (true) {
                System.out.print("국어 성적 입력 : ");
                int korean = sc.nextInt();

                System.out.print("영어 성적 입력 : ");
                int english = sc.nextInt();

                System.out.print("수학 성적 입력 : ");
                int math = sc.nextInt();

                if (s.setScore(korean, english, math)) {
                    break;
                } else {
                    System.out.println("⚠ 점수는 0~100 사이만 입력 가능합니다. 다시 입력하세요.");
                }
            }

            students[i] = s;
        }

        // 학생 정보 출력
        System.out.println("\n====== 학생 성적표 ======");
        for (student s : students) {
            System.out.println("ID: " + s.id + ", 이름: " + s.name);
            System.out.println("국어: " + s.getScoreKorean() +
                    ", 영어: " + s.getScoreEnglish() +
                    ", 수학: " + s.getScoreMath());
            System.out.println("합계: " + s.getsum() + ", 평균: " + s.getavg());
            System.out.println("----------------------------");
        }

        sc.close();
    }
}
