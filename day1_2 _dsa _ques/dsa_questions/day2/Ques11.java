package dsa_questions;

import java.util.Scanner;

import java.util.*;

public class Ques11 {

    public static char[][] generateBoard(char[][] board) {

        int m = board.length;
        int n = board[0].length;

        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == 'M') continue;

                int count = 0;

                for (int d = 0; d < 8; d++) {
                    int ni = i + dx[d];
                    int nj = j + dy[d];

                    if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                        if (board[ni][nj] == 'M') {
                            count++;
                        }
                    }
                }
                board[i][j] = (char)(count + '0');
            }
        }

        return board;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'E', 'E', 'E'},
                {'E', 'M', 'E'},
                {'E', 'E', 'E'}
        };
        int m = board.length;
        int n = board[0].length;


        char[][] result = generateBoard(board);

        System.out.println("Result Board:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}