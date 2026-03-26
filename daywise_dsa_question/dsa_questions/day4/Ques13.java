package dsa_questions;

class Ques13 {
    static boolean sm(int[][] m, int x, int y, int[][] p) {
        int n = m.length;

        if (x < 0 || y < 0 || x >= n || y >= n || m[x][y] == 1 || p[x][y] == 1)
            return false;

        p[x][y] = 1;

        if (x == n - 1 && y == n - 1)
            return true;

        if (sm(m, x, y + 1, p)) return true;
        if (sm(m, x + 1, y, p)) return true;
        if (sm(m, x, y - 1, p)) return true;
        if (sm(m, x - 1, y, p)) return true;

        p[x][y] = 0;
        return false;
    }

    public static void main(String[] args) {
        int[][] m = {
                {0, 0, 1, 0},
                {1, 0, 1, 0},
                {0, 0, 0, 0},
                {1, 1, 1, 0}
        };

        int n = m.length;
        int[][] p = new int[n][n];

        if (sm(m, 0, 0, p)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(p[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No Path");
        }
    }
}
