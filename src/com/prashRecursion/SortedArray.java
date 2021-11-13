package com.prashRecursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 50};
        System.out.println(checkSorted(arr,0));
    }

    public static boolean checkSorted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        else{
            return arr[index]<arr[index+1] && checkSorted(arr, index+1);
        }
    }
}
