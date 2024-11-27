package baekjoon;

import java.util.Scanner;

public class _241127_01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int stu_count = 0;
        float[][] score_li = new float[stu_count+1][6];
        
        float gra ;
        float kko ;
        float eng ;
        float mat ;

        
        float sum = score_li[stu_count][1] + score_li[stu_count][2] + score_li[stu_count][3];
        score_li[stu_count][4] = sum;
        float avg = sum / 3 ;
        score_li[stu_count][5] = avg;
        
        int gra_TF_idx = -1;

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

                int arr = (stu_count + 1) * 2 ;
                System.out.printf("배열이 확장되었습니다.새로운 크기 : %d행" , arr);
                System.out.println();

                System.out.print("학번을 입력하세요 : ");
                gra = in.nextFloat();
                score_li[stu_count][0] = gra;

                for(int i = 0 ; i < score_li.length ; i++) {
                    if (score_li[i][0] == gra) {
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
                            System.out.println("입력이 취소되었습니다.메뉴로 돌아갑니다.");
                            break;
                        } else if (menu1.equals("Y")) {

                            System.out.print("국어 성적 : ");
                            kko = in.nextFloat();
                            score_li[gra_TF_idx][1] = kko;

                            System.out.print("영어 성적 : ");
                            eng = in.nextFloat();
                            score_li[gra_TF_idx][2] = eng;

                            System.out.print("수학 성적 : ");
                            mat = in.nextFloat();
                            score_li[gra_TF_idx][3] = mat;

                            sum = kko + eng + mat;
                            score_li[gra_TF_idx][4] = sum;

                            avg = sum / 3;
                            score_li[gra_TF_idx][5] = avg;

                            break;
                        } else {
                            System.out.println("다시 입력 ↓");
                        }
                    }
                } else {
                    System.out.print("국어 성적 : ");
                    kko = in.nextFloat();
                    score_li[stu_count][1] = kko;

                    System.out.print("영어 성적 : ");
                    eng = in.nextFloat();
                    score_li[stu_count][2] = eng;

                    System.out.print("수학 성적 : ");
                    mat = in.nextFloat();
                    score_li[stu_count][3] = mat;

                    sum = kko + eng + mat;
                    score_li[stu_count][4] = sum;

                    avg = sum / 3 ;
                    score_li[stu_count][5] = avg;

                    System.out.println("입력이 완료됬습니다.");

                    stu_count++;
                }
                
                
                
                

            } else if (menu == 2) {
                System.out.print("▶▷".repeat(5));
                System.out.print("학생 성적 목록");
                System.out.print("◁◀".repeat(5));
                System.out.println();

                for (int i = 0; i < score_li.length; i++) {
                    System.out.printf("[학번 : %.0f] 국어: %.1f, 영어: %.1f, 수학: %.1f, 합계: %.1f, 평균: %.2f\n",
                            score_li[i][0], score_li[i][1], score_li[i][2], score_li[i][3], score_li[i][4], score_li[i][5]);
                }
                System.out.println();

            } else if (menu == 3) {
                // 삭제
            } else if (menu == 4) {
                System.out.println("프로그램 중료");
            } else {
                System.out.println("다시 입력");
                System.out.println();
            }

        }

    }
}
