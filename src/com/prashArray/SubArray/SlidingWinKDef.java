package com.prashArray.SubArray;

//Maximum sum subarray of size K

public class SlidingWinKDef {
    public static void main(String[] args) {
        int[] arr={20, 30, 80, 40, 60, 70, 10};
        int windowSize=3;
        System.out.println(SW(arr, windowSize));
    }

    public static int SW(int[] arr, int k){
        int max=0;
        int i=0;
        int j=0;
        int sum=0;

        while(j<arr.length){
            //System.out.println("i is: "+i+" j is: "+j);
            sum+= arr[j];
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1==k){
                max= Math.max(sum, max);
                sum=sum-arr[i];
                j++;
                i++;
            }

        }
        return max;
    }
}
