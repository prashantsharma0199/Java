package com.prashArray.Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr= {40,70,60,10,90};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSort(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int max= findmax(arr, start, end);
            swap(arr, max, end);
            end--;
        }
    }

    public static int findmax(int[] arr, int start, int end){
        int max=0;
        for(int i= start; i<=end; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int max, int end){
        int temp= arr[end];
        arr[end]= arr[max];
        arr[max]= temp;
    }

}
