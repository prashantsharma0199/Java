package com.prashArray;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={14, 18, 23, 94, 45, 69};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target=45;
        System.out.println("Target is present on index: "+findMe(arr, target));
    }

    static int findMe(int[] arr, int target){
        int start=0;
        int end= arr.length-1;

        while(start<=end){
            int mid= start + (end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
