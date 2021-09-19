package com.prashArray.Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int [] arr={50, 40, 30, 20, 10};
        System.out.println(Arrays.toString(arr));
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSort(int[] arr){
        for(int i=0; i< arr.length; i++){
            int swapped=0;
            for(int j=1; j< arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                    swapped=1;
                }
            }
            if(swapped==0){
                break;
            }
        }
    }
}
