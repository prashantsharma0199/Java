package com.prashArray;

//Order Agnostic binary search
public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr={30,40,50,60,70,80};
//        int[] arr={90,80,70,40,60,50};
        int target=60;
        System.out.println(OrderAgnosticbs(arr, target));
    }

    static int OrderAgnosticbs(int[] arr, int target){
        int start=0;
        int end= arr.length-1;

        boolean isAsc= arr[0]<=arr[end];

        while(start<=end){
            int mid= start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

}
