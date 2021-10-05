package com.prashRecursion;

public class BS_Recursion {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90};
        System.out.println(bs(arr, 0, arr.length-1, 60));
    }

    public static int bs(int[] arr,int start,int end, int target){
        int mid= start+(end-start)/2;
        if(start>end){
            return -1;
        }

        else if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            return bs(arr, mid+1, end, target);
        }
        else{
            return bs(arr,start, mid-1, target);
        }
    }
}
