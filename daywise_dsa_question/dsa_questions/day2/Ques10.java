package dsa_questions;


public class Ques10 {

    public static int[][] multiply(int[][] A, int[][] B) {

        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;
        if (n != B.length) {
            throw new IllegalArgumentException("Matrix multiplication not possible");
        }

        int[][] C = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

    public static void main(String[] args) {

        int[][] A = {
                {1,2},
                {3,4}
        };

        int[][] B = {
                {5,6},
                {7,8}
        };

        int[][] result = multiply(A, B);

        for (int[] row : result) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
