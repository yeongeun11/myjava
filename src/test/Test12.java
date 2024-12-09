package test;

public class Test12 {
    public static void main(String[] args) {

        int[][] bar = new int[3][3];

        for(int i = 0; i < bar.length; i++) {
            for(int j = 0; j < bar[0].length; j++) {
                int random = 10 + (int)(Math.random()*(30 - 10 + 1));
                bar[i][j] = random;
            }
        }
        for(int j = 0; j < bar.length; j++) {
            for(int i = 0; i < bar[0].length; i++) {
                System.out.print(" " + bar[j][i]);
            }
            System.out.println();
        }

    }

}


