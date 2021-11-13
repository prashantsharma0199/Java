package com.prashRecursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,1};
        sorting(arr, 0, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int[] arr, int index, int end, int max_idx){
        if(end==0){
            return;
        }
        if(index<=end){
            if(arr[max_idx]<arr[index]){
                max_idx=index;
            }
            sorting(arr, index+1, end, max_idx);
        }
        else{
            int temp=arr[end];
            arr[end]=arr[max_idx];
            arr[max_idx]=temp;
            sorting(arr, 0, end-1, 0);
        }
    }
}
