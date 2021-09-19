package com.prashArray.Sorting;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void CyclicSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            while(arr[i]-1!=i){
                swap(arr, i, arr[i]-1);
            }
        }
    }

    public static void swap(int[] arr, int current, int toswap){
        int temp= arr[current];
        arr[current]= arr[toswap];
        arr[toswap]=temp;
    }
}
