package test;

public class Test13 {
    public static void main(String[] args) {

        int[][][] bar = new int[3][4][4];

        for(int i = 0; i < bar.length; i++) {
            for(int j = 0; j < bar[i].length; j++) {
                for(int k = 0; k < bar[i][j].length; k++) {
                    int random = 20 + (int)(Math.random()* (40 - 20 + 1));
                    bar [i][j][k] = random;
                }
            }
        }
        for(int i = 0; i < bar.length; i++) {
            System.out.println("3차원 배열의 레이어 #" + (i + 1));
            for(int j = 0; j < bar[i].length; j++) {
                for(int k = 0; k < bar[i][j].length; k++) {
                    System.out.print(" " + bar[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}


