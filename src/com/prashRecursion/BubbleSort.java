package com.prashRecursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,1};
        sorting(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int[] arr, int index, int end){
        if(end==0){
            return;
        }
        if(index<end){
            if(arr[index]>=arr[index+1]){
                int temp=arr[index];
                arr[index]=arr[index+1];
                arr[index+1]=temp;
            }
            sorting(arr, index+1, end);
        }else {
            sorting(arr, 0, end-1);
        }
    }
}
