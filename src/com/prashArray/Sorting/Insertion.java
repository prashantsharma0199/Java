package com.prashArray.Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr={40,70,60,10,90};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void InsertionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1, j);
                }
                else{
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int prev, int next ){
        int temp= arr[prev];
        arr[prev]=arr[next];
        arr[next]=temp;
    }
}
