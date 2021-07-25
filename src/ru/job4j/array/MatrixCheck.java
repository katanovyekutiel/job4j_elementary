package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

//    public static void main(String[] args) {
//        char[][] input = {
//                {' ', ' ', ' '},
//                {'X', 'X', 'X'},
//                {' ', ' ', ' '},
//        };
//        int row = 0;
//        System.out.println(MatrixCheck.monoHorizontal(input, row));
//    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        System.out.println(MatrixCheck.monoVertical(input, column));
    }
}

