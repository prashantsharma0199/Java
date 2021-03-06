package com.prashRecursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(search(arr,1, 0, arr.length-1));
    }

    public static int search(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        
        int mid= start+ (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }

        if(arr[start]<= arr[mid]){
            if(arr[start]<=target && arr[mid]>=target){
                return search(arr, target, start, mid-1);
            }else{
                return search(arr, target, mid+1, end);
            }
        }

        if(arr[mid]<=target && arr[end]>=target){
            return search(arr, target, mid+1, end);
        }
        else{
            return search(arr, target, start, mid-1);
        }
    }
}
