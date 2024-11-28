package baekjoon;

import java.util.Scanner;

public class _241127_02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int stu_count = 0;
        float[][] score_li = new float[1][6];

        while (true) {

            System.out.println("▼△".repeat(25));
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 입력된 학생 목록 출력");
            System.out.println("3. 학생 삭제하기");
            System.out.println("4. 종료");
            System.out.println("▲▽".repeat(25));

            System.out.print("선택 : ");
            int menu = in.nextInt();

            if (menu == 1) {

                if (stu_count >= score_li.length) {

                    float[][] newScoreLi = new float[score_li.length * 2][6];
                    for (int i = 0; i < score_li.length; i++) {
                        System.arraycopy(score_li[i], 0, newScoreLi[i], 0, 6);
                    }
                    score_li = newScoreLi;
                    System.out.printf("배열이 확장되었습니다. 새로운 크기 : %d행\n", score_li.length);
                }

                System.out.print("학번을 입력하세요 : ");
                float gra = in.nextFloat();
                int gra_TF_idx = -1;

                for (int i = 0; i < stu_count; i++) {
                    if (Float.compare(score_li[i][0], gra) == 0) {
                        gra_TF_idx = i;
                        break;
                    }
                }

                if (gra_TF_idx != -1) {
                    System.out.println("중복된 학번입니다.");
                    while (true) {
                        System.out.print("덮어쓰기를 희망합니까? (Y: 덮어쓰기 진행 , Q: 메뉴로 돌아가기) : ");
                        String menu1 = in.next().toUpperCase();
                        if (menu1.equals("Q")) {
                            System.out.println("입력이 취소되었습니다. 메뉴로 돌아갑니다.");
                            break;
                        } else if (menu1.equals("Y")) {
                            System.out.print("국어 성적 : ");
                            score_li[gra_TF_idx][1] = in.nextFloat();

                            System.out.print("영어 성적 : ");
                            score_li[gra_TF_idx][2] = in.nextFloat();

                            System.out.print("수학 성적 : ");
                            score_li[gra_TF_idx][3] = in.nextFloat();

                            score_li[gra_TF_idx][4] = score_li[gra_TF_idx][1] + score_li[gra_TF_idx][2] + score_li[gra_TF_idx][3];
                            score_li[gra_TF_idx][5] = score_li[gra_TF_idx][4] / 3;

                            System.out.println("덮어쓰기가 완료되었습니다.");
                            break;
                        } else {
                            System.out.println("다시 입력 ↓");
                        }
                    }
                } else {

                    score_li[stu_count][0] = gra;

                    System.out.print("국어 성적 : ");
                    score_li[stu_count][1] = in.nextFloat();

                    System.out.print("영어 성적 : ");
                    score_li[stu_count][2] = in.nextFloat();

                    System.out.print("수학 성적 : ");
                    score_li[stu_count][3] = in.nextFloat();

                    score_li[stu_count][4] = score_li[stu_count][1] + score_li[stu_count][2] + score_li[stu_count][3];
                    score_li[stu_count][5] = score_li[stu_count][4] / 3;

                    System.out.println("입력이 완료되었습니다.");
                    stu_count++;
                }

            } else if (menu == 2) {
                System.out.print("▶▷".repeat(5));
                System.out.print("학생 성적 목록");
                System.out.print("◁◀".repeat(5));
                System.out.println();

                for (int i = 0; i < stu_count; i++) {
                    System.out.printf("[학번 : %.0f] 국어: %.1f, 영어: %.1f, 수학: %.1f, 합계: %.1f, 평균: %.2f\n",
                            score_li[i][0], score_li[i][1], score_li[i][2], score_li[i][3], score_li[i][4], score_li[i][5]);
                }
                System.out.println();

            } else if (menu == 3) {
                System.out.print("삭제할 학번을 입력하세요 : ");
                float del_gra = in.nextFloat();
                int del_idx = -1;

                for (int i = 0; i < stu_count; i++) {
                    if (Float.compare(score_li[i][0], del_gra) == 0) {
                        del_idx = i;
                        break;
                    }
                }

                if (del_idx != -1) {

                    for (int i = del_idx; i < stu_count - 1; i++) {
                        System.arraycopy(score_li[i + 1], 0, score_li[i], 0, 6);
                    }
                    stu_count--;
                    System.out.println("학생 정보가 삭제되었습니다.");
                } else {
                    System.out.println("해당 학번이 존재하지 않습니다.");
                }

            } else if (menu == 4) {
                System.out.println("프로그램 종료");
                System.exit(0);
            } else {
                System.out.println("다시 입력");
                System.out.println();
            }
        }
    }
}
