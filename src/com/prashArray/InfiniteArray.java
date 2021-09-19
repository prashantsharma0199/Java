package com.prashArray;

// Find position of an element in a sorted array of infinite numbers
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/#:~:text=So%20in%20order%20to%20find,and%20double%20the%20high%20index.

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums= {10,20,30,40,50,60,70,80,90,100};
        int target= 50;
        System.out.println(FindRange(nums, target));
    }

    public static int FindRange(int[] arr, int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp= end+1;
            end= end+ (end-start+1)*2;
            start=temp;
        }
        return BinarySearch(arr, target, start, end);
    }

    public static int BinarySearch(int [] arr, int target, int start, int end){
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
