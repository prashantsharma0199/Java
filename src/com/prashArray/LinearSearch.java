package com.prashArray;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr= {17,21,93,49,50,12};
        int target=99;
        int index= linear_s(arr,target);

        if(index==-1){
            System.out.println("Element is not present in the array");
        }
        else{
            System.out.println("Element is present at index "+index+" of the array");
        }
    }

    static int linear_s(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
