package com.prashArray;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
       int[] arr={10, 20, 30, 40, 50, 60};
       System.out.println(Arrays.toString(arr));
       reverse(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start=0;
        int end= arr.length-1;

        while(start<end){
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
    }
}
