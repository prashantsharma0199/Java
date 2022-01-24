package com.prashArray;

public class FloorBS {
    public static void main(String[] args) {
        int[] arr= {10, 20, 30, 40, 50, 60};
        int target= 15;
        System.out.println(calculate_floor(arr, target));
    }

    static int calculate_floor(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        int mid=0;

        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }

        if(target<arr[0]){
            return -1;
        }

        return arr[end];
    }
}
