package com.prashArray;

public class CeilBS {
    public static void main(String[] args) {
        int[] arr= {10, 20, 30, 40, 50, 60};
        int target= 65;
        System.out.println(calculate_ceil(arr, target));

    }

    static int calculate_ceil(int[] arr, int target){
        int start= 0;
        int end= arr.length-1;
        int mid= 0;

        while (start<=end){
            mid= start + (end-start)/2;

            if(target==arr[mid]){
                return arr[mid];
            }
            else if(target>arr[mid]){
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }

        return arr[start];
    }
}
