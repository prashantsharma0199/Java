package com.prashRecursion;

public class NQueens {
    public static void main(String[] args) {
        int N=4;
        boolean[][] board= new boolean[N][N];
        System.out.println("Possible solns: "+nqueen(board, 0));
    }

    public static int nqueen(boolean[][] board, int r){
        if(r==board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count=0;
        for(int col=0; col<board[0].length; col++){
            if(isSafe(board, r, col)){
                board[r][col]= true;
                count+=nqueen(board,r+1);
                board[r][col]=false;

            }
        }

        return count;

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // vertical check
        for(int i=0; i<row; i++){
            if(board[i][col]){
                return false;
            }
        }

        //right diagonal check
        int rightlimit= Math.min(row, board[0].length-1-col);
        for(int i=1; i<=rightlimit; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        //left diagonal check
        int leftlimit= Math.min(row, col);
        for(int i=1; i<=leftlimit; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row: board) {
            for (boolean val: row){
                if(val){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
