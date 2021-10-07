package com.prashArray.SubArray;

import java.util.ArrayList;

// Maximum Subarray
public class Kadane {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(KadanesAlgo(arr));
    }

    public static int KadanesAlgo(int[] arr){
        ArrayList <Integer> list= new ArrayList<>();
        int max=arr[0];
        int sum=0;
        int i=0;
        while(i<arr.length){
            sum+=arr[i];
            list.add(arr[i]);
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
                list.clear();
            }
            i++;
        }

        System.out.println(list);
        return max;
    }
}
