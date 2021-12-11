package com.prashRecursion;

public class NKnights {
    public static void main(String[] args) {
        int N=3;
        boolean[][] board= new boolean[N][N];
        nknights(board, 0, 0, 4);
    }

    public static void nknights(boolean[][] board, int r, int c, int knights){
        if(knights==0){
            display(board);
            System.out.println();
            return;
        }

        if(r== board.length-1 && c== board[0].length){
            return;
        }

        if(c== board[0].length){
            nknights(board, r+1, 0, knights);
            return;
        }

        if(isSafe(board, r, c)){
            board[r][c]=true;
            nknights(board, r, c+1,knights-1);
            board[r][c]=false;
        }

        nknights(board, r, c+1,knights);
    }

    public static boolean isSafe(boolean[][] board, int row, int col){
        if(isValid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }

        return true;
    }

    public static boolean isValid(boolean[][] board, int row, int col){
        if(row<board.length && row>=0 && col>=0 && col<board[0].length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row: board) {
            for (boolean val: row){
                if(val){
                    System.out.print("K ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
