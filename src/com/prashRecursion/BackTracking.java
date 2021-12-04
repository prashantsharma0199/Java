package com.prashRecursion;

import java.util.ArrayList;
import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args) {
        boolean [][] maze={
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

//        backtrack_path("", maze, 0, 0);
        int[][] path= new int[maze.length][maze[0].length];
        print_path("", maze, 0, 0, path, 1);
    }

    public static void backtrack_path(String res, boolean [][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.print(res+", ");
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c]= false;

        if(r< maze.length-1){
            backtrack_path(res+"D", maze, r+1, c);
        }

        if(c< maze[0].length-1){
            backtrack_path(res+"R", maze, r, c+1);
        }

        if(r> 0){
            backtrack_path(res+"U", maze, r-1, c);
        }

        if(c> 0){
            backtrack_path(res+"L", maze, r, c-1);
        }

        maze[r][c]=true;
    }




    public static void print_path(String res, boolean [][] maze, int r, int c, int [][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]= step;
            System.out.println(res);
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c]= false;
        path[r][c]= step;

        if(r< maze.length-1){
            print_path(res+"D", maze, r+1, c, path, step+1);
        }

        if(c< maze[0].length-1){
            print_path(res+"R", maze, r, c+1, path, step+1);
        }

        if(r> 0){
            print_path(res+"U", maze, r-1, c, path, step+1);
        }

        if(c> 0){
            print_path(res+"L", maze, r, c-1, path, step+1);
        }

        path[r][c]= 0;
        maze[r][c]=true;
    }
}
