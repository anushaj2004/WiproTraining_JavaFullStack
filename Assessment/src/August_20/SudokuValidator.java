package August_20;

import java.util.Scanner;
import java.util.HashSet;

public class SudokuValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[9][9];

        System.out.println("Enter Sudoku board (9x9, use 0 for empty):");
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                board[i][j] = sc.nextInt();

        if (isValidSudoku(board))
            System.out.println("Valid Sudoku Board");
        else
            System.out.println("Invalid Sudoku Board");
    }

    static boolean isValidSudoku(int[][] board) {
        // Row and Column Check
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> rowSet = new HashSet<>();
            HashSet<Integer> colSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                // Row
                if (board[i][j] != 0 && !rowSet.add(board[i][j])) return false;
                // Col
                if (board[j][i] != 0 && !colSet.add(board[j][i])) return false;
            }
        }

        
        for (int r = 0; r < 9; r += 3) {
            for (int c = 0; c < 9; c += 3) {
                HashSet<Integer> gridSet = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int val = board[r + i][c + j];
                        if (val != 0 && !gridSet.add(val)) return false;
                    }
                }
            }
        }
        return true;
    }
}
