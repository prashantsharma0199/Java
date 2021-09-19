package com.prashArray;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr={60,70,80,90,10,20,40,50};
        System.out.println(findPivot(arr)+1);
    }

    public static int findPivot(int[] nums){
        int start=0;
        int end= nums.length-1;

        while(start<=end){
            int mid= start+(end-start)/2;

            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start && nums[mid-1]>nums[mid]){
                return mid-1;
            }
            else if(nums[start]>=nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
