package com.prashRecursion.Questions;

//Link: https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/

//Given an array of integers arr, the task is to find the minimum and maximum element of that array using recursion.
//Input: arr = {1, 4, 3, -5, -4, 8, 6};
//Output: min = -5, max = 8

//Input: arr = {1, 4, 45, 6, 10, -8};
//Output: min = -8, max = 45

public class MinMax {
    public static void main(String[] args) {
        int[] arr= {1, 4, 3, -5, -4, 8, 6};
        System.out.println(mina(arr, arr.length-1));
    }

    public static int mina(int[] arr, int n){
        if(n==0){
            return arr[n];
        }
        else{
            return Math.min(arr[n], mina(arr, n-1));
        }
    }
}
