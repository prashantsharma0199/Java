package com.prashRecursion.Questions;

//Link: https://www.geeksforgeeks.org/sum-triangle-from-array/

// Given an array of integers, print a sum triangle from it such that the first level has all array elements.
// From then, at each level number of elements is one less than the previous level and
// elements at the level is the Sum of consecutive two elements in the previous level.

//Input : A = {1, 2, 3, 4, 5}
//Output : [48]
//         [20, 28]
//         [8, 12, 16]
//         [3, 5, 7, 9]
//         [1, 2, 3, 4, 5]

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 4, 5};
        soa(nums, nums.length);
    }

    static public void soa(int[] arr, int n){
        if(n<=1){
            System.out.println(Arrays.toString(arr));
        }
        else{
            int[] temp= new int[arr.length-1];
            dosum(temp,arr,n);
            soa(temp, temp.length);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void dosum(int[] temp, int[] arr, int size){
        for(int i=0; i<size-1; i++){
            temp[i]=arr[i]+arr[i+1];
        }
    }
}
