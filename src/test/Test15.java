package test;

public class Test15 {
    public static void main(String[] args) {

        String s = "no news is good news";
        int n = 0;

        for (int i = 0; i < s.length(); i++) {
            //n이 나오는 회수를 센다.
            if(s.charAt(i) != 'n')
                continue;


            // n의 개수를 하나 증가
            n++;
        }
        System.out.println("문장에서 발견된 n의 개수: " + n);
    }
}


