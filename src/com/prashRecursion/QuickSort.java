package com.prashRecursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr= {60, 90, 30, 50, 10};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }

        int s= low;
        int e= high;
        int mid= s+(e-s)/2;
        int p= arr[mid];

        while(s<=e){
            while(arr[s]< p){
                s++;
            }
            while(arr[e]>p){
                e--;
            }
            if(s<=e){
                int temp= arr[s];
                arr[s]= arr[e];
                arr[e]= temp;
                s++;
                e--;
            }
        }

        quicksort(arr, low, e);
        quicksort(arr, s, high);
    }
}
