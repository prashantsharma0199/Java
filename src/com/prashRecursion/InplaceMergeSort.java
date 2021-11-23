package com.prashRecursion;

import java.util.Arrays;

public class InplaceMergeSort {
    public static void main(String[] args) {
        int[] arr= {60, 90, 30, 50, 10};
//        int[] arr= {5, 4, 3, 2, 1};
        InplaceMerge(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }


    public static void InplaceMerge(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }
        int mid= (s+e)/2;
        InplaceMerge(arr, s, mid);
        InplaceMerge(arr, mid, e);

        mergeInplace(arr, s, mid, e);
    }

    public static void mergeInplace(int[] arr, int s, int mid, int e){
        int[] merged= new int[e-s];

        int i=s, j=mid, k=0;

        while(i<mid && j<e){
            if(arr[i]<=arr[j]){
                merged[k]=arr[i];
                i++;
            }
            else{
                merged[k]= arr[j];
                j++;
            }
            k++;
        }

        while(j<e){
            merged[k]=arr[j];
            j++;
            k++;
        }

        while(i<mid){
            merged[k]=arr[i];
            i++;
            k++;
        }

        for(int counter=0; counter< merged.length; counter++){
            arr[s+counter]=merged[counter];
        }

    }
}
