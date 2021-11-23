package com.prashRecursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr= {60, 90, 30, 50, 10};
        System.out.println(Arrays.toString(mergesort(arr)));
    }

    public static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid= arr.length/2;

        int[] left= mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second){
        int f=0, s=0, m=0;
        int[] merged= new int[first.length+ second.length];

        while(f<first.length && s<second.length){
            if(first[f]<=second[s]){
                merged[m]=first[f];
                f++;
            }
            else{
                merged[m]=second[s];
                s++;
            }
            m++;
        }

        while(f<first.length){
            merged[m]=first[f];
            f++;
            m++;
        }

        while(s< second.length){
            merged[m]=second[s];
            s++;
            m++;
        }

        return merged;
    }
}
