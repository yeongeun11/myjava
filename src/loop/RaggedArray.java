package loop;

public class RaggedArray {
    public static void main(String[] args) {
        final int MAX_ROW = 5;

        int[][] ragged = new int [MAX_ROW + 1][];
        for (int r = 0; r <= MAX_ROW; r++)
            ragged[r] = new int[MAX_ROW];

        for (int r = 0; r < ragged.length; r++)
            for (int c = 0; c < ragged[r].length; c++) {
                ragged[r][c] = 1;
            }

        for (int r = 0; r < ragged.length; r++) {
            for (int c = 0; c < ragged[r].length; c++) {
                System.out.println(ragged[r][c] + " ");
            System.out.println();
            }
        }
    }
}
