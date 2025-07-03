public class _03_867_TransposeMatrix {
    public static void main(String[] args) {
        int row = 2, col = 3;
        int[][]matrix= { {2,3,7}, {5,6,7} };

        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j <transpose[0].length ; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
