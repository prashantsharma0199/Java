package com.prashRecursion;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        boolean [][] maze={
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

//        System.out.println(print_path("", maze, 0, 0));
//        System.out.println(diag_path("", maze, 0, 0));
        System.out.println(obstacles("", maze, 0, 0));
    }


    // For movements in up and down dirn.
    public static ArrayList<String> print_path(String res,boolean [][] maze, int r, int c){
        if(r== maze.length-1 && c== maze[0].length-1){
            ArrayList<String> list= new ArrayList<>();
            list.add(res);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();

        if(r< maze.length-1){
            ans.addAll(print_path(res+"D", maze, r+1, c));
        }

        if(c<maze[0].length-1){
            ans.addAll(print_path(res+"R", maze, r, c+1));
        }

        return ans;
    }

    // For movements in up, down and diagonal dirn.
    public static ArrayList<String> diag_path(String res,boolean [][] maze, int r, int c){
        if(r== maze.length-1 && c== maze[0].length-1){
            ArrayList<String> list= new ArrayList<>();
            list.add(res);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();

        if(r< maze.length-1 && c<maze[0].length-1){
            ans.addAll(diag_path(res+"d", maze, r+1, c+1));
        }

        if(r< maze.length-1){
            ans.addAll(diag_path(res+"D", maze, r+1, c));
        }

        if(c<maze[0].length-1){
            ans.addAll(diag_path(res+"R", maze, r, c+1));
        }

        return ans;
    }

    // For movements in maze with obstacles present
    public static ArrayList<String> obstacles(String res,boolean [][] maze, int r, int c){
        if(r== maze.length-1 && c== maze[0].length-1){
            ArrayList<String> list= new ArrayList<>();
            list.add(res);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();

        if(maze[r][c]){
            if(r< maze.length-1 ){
                ans.addAll(obstacles(res+"D", maze, r+1, c));
            }

            if(c<maze[0].length-1){
                ans.addAll(obstacles(res+"R", maze, r, c+1));
            }
        }

        return ans;
    }
}
