package com.prashRecursion;

public class Sudoku {
    public static void main(String[] args) {
        int[][] sudoku= {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,0,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}
        };

        solver(sudoku);
    }

    public static boolean solver(int [][] sudoku){
        int row=-1;
        int col=-1;
        boolean emptyLeft= true;

        for(int i=0; i< sudoku.length; i++){
            for(int j=0; j< sudoku[0].length; j++){
                if(sudoku[i][j]==0){
                    row=i;
                    col=j;
                    emptyLeft= false;
                    break;
                }
            }

            if(emptyLeft==false){
                break;
            }
        }

        if(emptyLeft==true){
            display(sudoku);
            System.out.println();
            return true;
        }

        if(emptyLeft==false){
            //backtrack
            for(int number=1; number<=9; number++){
                if(isSafe(sudoku, row, col, number)){
                    sudoku[row][col]=number;
                    if(solver(sudoku)){
                        return true;
                    }
                    else{
                        //backtrack
                        sudoku[row][col]=0;
                    }
                }
            }
        }

        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int num) {
        // check in row
        for(int i=0; i< board[0].length; i++){
            if(board[row][i]==num){
                return false;
            }
        }

        // check in col
        for(int i=0; i< board.length; i++){
            if(board[i][col]==num){
                return false;
            }
        }

        //check each grid
        int sqrt= (int) (Math.sqrt(board.length));
        int rstart= row- row%sqrt;
        int cStart= col- col%sqrt;

        for(int r= rstart; r<rstart+sqrt; r++){
            for(int c= cStart; c<cStart+sqrt; c++){
                if(board[r][c]==num){
                    return false;
                }
            }
        }
        return true;
    }

    private static void display(int[][] board) {
        for (int[] row: board) {
            for (int val: row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
